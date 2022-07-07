package elf.entity;

import elf.entity.header.ELFHeader;
import elf.entity.section.ELFSectionHeader;

import java.util.List;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/4 10:07
 * @Description: null
 */
public class ELFFile {
    private ELFHeader elfHeader;

    private List<ELFSectionHeader> elfSectionHeader;

    private ELFStringTable elfStringTable ;

    private ELFSectionHeaderParams params;
    public ELFHeader getElfHeader() {
        return elfHeader;
    }

    public ELFStringTable getElfStringTable() {
        return elfStringTable;
    }

    public ELFSectionHeaderParams getParams() {
        return params;
    }

    public void setElfHeader(ELFHeader elfHeader) {
        this.elfHeader = elfHeader;
        params = new ELFSectionHeaderParams();
        params.setNumOfSectionHeader(elfHeader.getNumberOfSectionHeaders());
        params.setSectionHeaderOffset(elfHeader.getStartOfSectionHeaders());
        params.setSizeOfSectionHeader(elfHeader.getSizeOfSectionHeaders());
    }

    public List<ELFSectionHeader> getElfSectionHeader() {
        return elfSectionHeader;
    }

    public void setElfSectionHeader(List<ELFSectionHeader> elfSectionHeader) {
        this.elfSectionHeader = elfSectionHeader;
    }

    public ELFStringTable getElfSectionStringTable() {
        return elfStringTable;
    }

    public void setElfSectionStringTable(ELFStringTable elfStringTable) {
        this.elfStringTable = elfStringTable;
    }
}
