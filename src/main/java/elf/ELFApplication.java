package elf;

import elf.entity.ELFFile;
import elf.entity.ELFParams;
import elf.entity.ELFStringTable;
import elf.entity.Offset;
import elf.function.ELFInfoContainer;
import elf.entity.header.ELFHeader;
import elf.function.ParseELFHeader;
import elf.function.ParseELFSectionHeader;
import elf.function.ParseProgramHeader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/4 10:02
 * @Description:
 */
public class ELFApplication {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入相关命令：");
        ELFParams elfParams = new ELFParams(input.nextLine());
        byte[] bytes = ELFUtils.fileToBytes(elfParams.getFilePath());
        ELFFile elfFile = new ELFFile();
        ELFInfoContainer.setElfFile(elfFile);
        ELFInfoContainer.setFileBytes(bytes);
        elfFile.setElfHeader(new ParseELFHeader().getELFHeader(bytes, new Offset(0)));
        elfFile.setElfSectionStringTable(new ELFStringTable());

        switch (elfParams.getOptional()){
        case "-h":
            System.out.println(elfFile.getElfHeader().toString());
            break;
        case "-s":
            elfFile.setElfSectionHeader(new ParseELFSectionHeader().getELFSectionHeaders(bytes));
            ELFInfoContainer.getElfFile().getElfSectionHeader().forEach(System.out :: println);

        }

        ELFHeader elfHeader = new ParseELFHeader().getELFHeader(bytes, new Offset(0));
        switch (elfParams.getOptional()) {
            case "-h":
                System.out.println(elfHeader.toString());
                break;
            case "-p":
                Integer numberOfProgramHeaders = elfHeader.getNumberOfProgramHeaders();
                Integer sizeOfProgramHeaders = elfHeader.getSizeOfProgramHeaders();
                Integer startOfProgramHeaders = elfHeader.getStartOfProgramHeaders();
                for (int i = 0; i < numberOfProgramHeaders; i++) {
                    System.out.println(new ParseProgramHeader().getProgramHeader(bytes,
                            new Offset(startOfProgramHeaders + i * sizeOfProgramHeaders)));
                    System.out.println("=========================================");
                }
        }
    }
}
