package elf.entity.header;

import elf.entity.header.enums.FileType;
import elf.entity.header.enums.MachineType;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/4 10:04
 * @Description: null
 */
public class ELFHeader {
    Magic magic;
    FileType type;
    MachineType machine;
    Integer version;
    Integer entryPointAddress;
    Integer startOfProgramHeaders;
    Integer startOfSectionHeaders;
    Integer flags;
    Integer sizeOfThisHeader;
    Integer sizeOfProgramHeaders;
    Integer numberOfProgramHeaders;
    Integer sizeOfSectionHeaders;
    Integer numberOfSectionHeaders;
    Integer sectionHeaderStringTableIndex;

    public Magic getMagic() {
        return magic;
    }

    public void setMagic(Magic magic) {
        this.magic = magic;
    }

    public FileType getType() {
        return type;
    }

    public void setType(FileType type) {
        this.type = type;
    }

    public MachineType getMachine() {
        return machine;
    }

    public void setMachine(MachineType machine) {
        this.machine = machine;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getEntryPointAddress() {
        return entryPointAddress;
    }

    public void setEntryPointAddress(Integer entryPointAddress) {
        this.entryPointAddress = entryPointAddress;
    }

    public Integer getStartOfProgramHeaders() {
        return startOfProgramHeaders;
    }

    public void setStartOfProgramHeaders(Integer startOfProgramHeaders) {
        this.startOfProgramHeaders = startOfProgramHeaders;
    }

    public Integer getStartOfSectionHeaders() {
        return startOfSectionHeaders;
    }

    public void setStartOfSectionHeaders(Integer startOfSectionHeaders) {
        this.startOfSectionHeaders = startOfSectionHeaders;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public Integer getSizeOfThisHeader() {
        return sizeOfThisHeader;
    }

    public void setSizeOfThisHeader(Integer sizeOfThisHeader) {
        this.sizeOfThisHeader = sizeOfThisHeader;
    }

    public Integer getSizeOfProgramHeaders() {
        return sizeOfProgramHeaders;
    }

    public void setSizeOfProgramHeaders(Integer sizeOfProgramHeaders) {
        this.sizeOfProgramHeaders = sizeOfProgramHeaders;
    }

    public Integer getNumberOfProgramHeaders() {
        return numberOfProgramHeaders;
    }

    public void setNumberOfProgramHeaders(Integer numberOfProgramHeaders) {
        this.numberOfProgramHeaders = numberOfProgramHeaders;
    }

    public Integer getSizeOfSectionHeaders() {
        return sizeOfSectionHeaders;
    }

    public void setSizeOfSectionHeaders(Integer sizeOfSectionHeaders) {
        this.sizeOfSectionHeaders = sizeOfSectionHeaders;
    }

    public Integer getNumberOfSectionHeaders() {
        return numberOfSectionHeaders;
    }

    public void setNumberOfSectionHeaders(Integer numberOfSectionHeaders) {
        this.numberOfSectionHeaders = numberOfSectionHeaders;
    }

    public Integer getSectionHeaderStringTableIndex() {
        return sectionHeaderStringTableIndex;
    }

    public void setSectionHeaderStringTableIndex(Integer sectionHeaderStringTableIndex) {
        this.sectionHeaderStringTableIndex = sectionHeaderStringTableIndex;
    }

    @Override
    public String toString() {
        return "ELFHeader{" +
                "magic=" + magic +
                ", type=" + type +
                ", machine=" + machine +
                ", version=" + version +
                ", entryPointAddress=0x" + Integer.toHexString(entryPointAddress) +
                ", startOfProgramHeaders=" + startOfProgramHeaders +
                ", startOfSectionHeaders=" + startOfSectionHeaders +
                ", flags=" + flags +
                ", sizeOfThisHeader=" + sizeOfThisHeader +
                ", sizeOfProgramHeaders=" + sizeOfProgramHeaders +
                ", numberOfProgramHeaders=" + numberOfProgramHeaders +
                ", sizeOfSectionHeaders=" + sizeOfSectionHeaders +
                ", numberOfSectionHeaders=" + numberOfSectionHeaders +
                ", sectionHeaderStringTableIndex=" + sectionHeaderStringTableIndex +
                '}';
    }
}
