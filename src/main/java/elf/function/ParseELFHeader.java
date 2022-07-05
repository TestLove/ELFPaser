package elf.function;

import elf.ELFUtils;
import elf.entity.Offset;
import elf.entity.header.ELFHeader;
import elf.entity.header.Magic;
import elf.entity.header.enums.FileType;
import elf.entity.header.enums.MachineType;

import java.util.Arrays;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/4 10:07
 * @Description: 用于解析文件头部的类
 */
public class ParseELFHeader {
    public ELFHeader getELFHeader(byte[] bytes, Offset offset){
        ELFHeader elfHeader = new ELFHeader();
        elfHeader.setMagic(
                new Magic(
                        ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(16))));
        elfHeader
                .setType(FileType.getFileTypeByValue(
                        ELFUtils.byteToIntLSB(
                                ELFUtils.copyBytes(
                                        bytes,
                                        offset.getOffset(),
                                        offset.incrementAndReturnDuration(2)))));
        elfHeader
                .setMachine(MachineType.getMachineTypeByValue(ELFUtils.byteToIntLSB(
                        ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(2)))));
        elfHeader
                .setVersion(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4))));
        elfHeader
                .setEntryPointAddress(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4))));
        elfHeader
                .setStartOfProgramHeaders(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4))));
        elfHeader
                .setStartOfSectionHeaders(
                        ELFUtils.byteToIntLSB(
                                ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4))));
        elfHeader
                .setFlags(
                        ELFUtils.byteToIntLSB(
                                ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4))));
        elfHeader
                .setSizeOfThisHeader(
                        ELFUtils.byteToIntLSB(
                                ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(2))));
        elfHeader
                .setSizeOfProgramHeaders(
                        ELFUtils.byteToIntLSB(
                                ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(2))));
        elfHeader
                .setNumberOfProgramHeaders(
                        ELFUtils.byteToIntLSB(
                                ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(2))));
        elfHeader
                .setSizeOfSectionHeaders(
                        ELFUtils.byteToIntLSB(
                                ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(2))));
        elfHeader
                .setNumberOfSectionHeaders(
                        ELFUtils.byteToIntLSB(
                                ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(2))));
        elfHeader
                .setSectionHeaderStringTableIndex(
                        ELFUtils.byteToIntLSB(
                                ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(2))));



        return elfHeader;
    }
}
