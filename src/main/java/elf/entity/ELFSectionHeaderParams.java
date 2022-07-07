package elf.entity;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/6 8:51
 * @Description: null
 */
public class ELFSectionHeaderParams {
    Integer sectionHeaderOffset;

    Integer sizeOfSectionHeader;

    Integer numOfSectionHeader;

    public Integer getSectionHeaderOffset() {
        return sectionHeaderOffset;
    }

    public void setSectionHeaderOffset(Integer sectionHeaderOffset) {
        this.sectionHeaderOffset = sectionHeaderOffset;
    }

    public Integer getSizeOfSectionHeader() {
        return sizeOfSectionHeader;
    }

    public void setSizeOfSectionHeader(Integer sizeOfSectionHeader) {
        this.sizeOfSectionHeader = sizeOfSectionHeader;
    }

    public Integer getNumOfSectionHeader() {
        return numOfSectionHeader;
    }

    public void setNumOfSectionHeader(Integer numOfSectionHeader) {
        this.numOfSectionHeader = numOfSectionHeader;
    }
}
