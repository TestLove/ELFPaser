package elf;

import elf.entity.ELFFile;
import elf.entity.ELFParams;
import elf.entity.ELFStringTable;
import elf.entity.Offset;
import elf.entity.section.ELFSectionHeaders;
import elf.entity.symboltable.SymbolTable;
import elf.function.*;
import elf.entity.header.ELFHeader;

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
        elfFile.setElfSectionStringTable(new ELFStringTable(ELFInfoContainer.getOffsetOfSectionHeader(),ELFInfoContainer.getELFSectionStringTableOffset()*ELFInfoContainer.getSizeOfSectionHeader(),0));
        elfFile.setElfSectionHeaders(new ELFSectionHeaders());

        ELFHeader elfHeader = elfFile.getElfHeader();
        switch (elfParams.getOptional()) {
            case "-h":
                System.out.println(elfFile.getElfHeader().toString());
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
                break;
            case "-s":
                new ParseELFSectionHeader().getELFSectionHeaders(bytes);
                ELFInfoContainer.getElfFile().getElfSectionHeaders().getHeaders().forEach(System.out :: println);
            case "-sy":
                new ParseELFSectionHeader().getELFSectionHeaders(bytes);
                elfFile.setSymbolTable(new SymbolTable());
                new ParseELFSymbolTable().getSymbolTable(bytes);
                ELFInfoContainer.getElfFile().getSymbolTable().getSymbols().forEach(System.out :: println);
        }
    }
}
