package elf;

import elf.entity.ELFParams;
import elf.entity.Offset;
import elf.function.ParseELFHeader;

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
        switch (elfParams.getOptional()){
        case "-h":
            System.out.println(new ParseELFHeader().getELFHeader(bytes, new Offset(0)).toString());
            break;
    }
    }
}
