package elf.function;

import elf.entity.ELFFile;
import elf.entity.ELFStringTable;
import elf.entity.section.ELFSectionHeader;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/6 15:01
 * @Description: null
 */
public class ELFInfoContainer {
    public static ELFFile elfFile;

    public static byte[] fileBytes;

    public static byte[] getFileBytes() {
        return fileBytes;
    }

    public static void setFileBytes(byte[] fileBytes) {
        ELFInfoContainer.fileBytes = fileBytes;
    }

    public static ELFFile getElfFile() {
        return elfFile;
    }

    public static void setElfFile(ELFFile elfFile) {
        ELFInfoContainer.elfFile = elfFile;
    }
    public static ELFStringTable getELFSectionStringTable(){
        return elfFile.getElfSectionStringTable();
    }

    public static ELFStringTable getSymbolStringTable(){
        return elfFile.getSymbolNameStringTable();
    }

    public static int getELFSectionStringTableOffset(){
        return elfFile.getElfHeader().getSectionHeaderStringTableIndex();
    }
    public static int getSizeOfSectionHeader() {
        return elfFile.getElfHeader().getSizeOfSectionHeaders();
    }

    public static int getOffsetOfSectionHeader() {
        return elfFile.getElfHeader().getStartOfSectionHeaders();
    }

    public static ELFSectionHeader getSectionHeaderByName(String name) {
        return elfFile.getElfSectionHeaders().getHeaderByName(name);
    }
}
