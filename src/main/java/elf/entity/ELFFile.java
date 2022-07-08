package elf.entity;

import elf.entity.header.ELFHeader;
import elf.entity.section.ELFSectionHeader;
import elf.entity.section.ELFSectionHeaders;
import elf.entity.symboltable.SymbolTable;
import elf.function.ELFInfoContainer;

import java.util.List;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/4 10:07
 * @Description: null
 */
public class ELFFile {
    private ELFHeader elfHeader;

    private ELFSectionHeaders elfSectionHeaders;

    private ELFStringTable elfStringTable ;

    private ELFStringTable symbolNameStringTable ;

    private ELFSectionHeaderParams params;

    private SymbolTable symbolTable;

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public ELFStringTable getSymbolNameStringTable() {
        return symbolNameStringTable;
    }

    public void setSymbolNameStringTable(ELFStringTable symbolNameStringTable) {
        this.symbolNameStringTable = symbolNameStringTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        symbolNameStringTable = new ELFStringTable(0,0,elfSectionHeaders.getOffsetByName(".strtab"));
    }

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

    public ELFSectionHeaders getElfSectionHeaders() {
        return elfSectionHeaders;
    }

    public void setElfSectionHeaders(ELFSectionHeaders elfSectionHeaders) {
        this.elfSectionHeaders = elfSectionHeaders;
    }

    public ELFStringTable getElfSectionStringTable() {
        return elfStringTable;
    }

    public void setElfSectionStringTable(ELFStringTable elfStringTable) {
        this.elfStringTable = elfStringTable;
    }
}
