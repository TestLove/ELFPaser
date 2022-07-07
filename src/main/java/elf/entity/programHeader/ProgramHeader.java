package elf.entity.programHeader;

import elf.entity.Offset;
import elf.entity.programHeader.enums.PType;

/**
 * @author qxm
 * @create 2022-07-06 15:22
 **/
public class ProgramHeader {
    private PType pType;//4
    private Offset pOffset;//4
    private Integer pVaddr;//4
    private Integer pPaddr;//4
    private Integer pFilesz;//4
    private Integer pMemsz;//4
    private Integer pFlags;//4
    private Integer pAlign;//4

    public ProgramHeader(PType pType, Offset pOffset, Integer pVaddr, Integer pPaddr, Integer pFilesz, Integer pMemsz, Integer pFlags, Integer pAlign) {
        this.pType = pType;
        this.pOffset = pOffset;
        this.pVaddr = pVaddr;
        this.pPaddr = pPaddr;
        this.pFilesz = pFilesz;
        this.pMemsz = pMemsz;
        this.pFlags = pFlags;
        this.pAlign = pAlign;
    }

    public ProgramHeader() {
    }

    public PType getpType() {
        return pType;
    }

    public void setpType(PType pType) {
        this.pType = pType;
    }

    public Offset getpOffset() {
        return pOffset;
    }

    public void setpOffset(Offset pOffset) {
        this.pOffset = pOffset;
    }

    public Integer getpVaddr() {
        return pVaddr;
    }

    public void setpVaddr(Integer pVaddr) {
        this.pVaddr = pVaddr;
    }

    public Integer getpPaddr() {
        return pPaddr;
    }

    public void setpPaddr(Integer pPaddr) {
        this.pPaddr = pPaddr;
    }

    public Integer getpFilesz() {
        return pFilesz;
    }

    public void setpFilesz(Integer pFilesz) {
        this.pFilesz = pFilesz;
    }

    public Integer getpMemsz() {
        return pMemsz;
    }

    public void setpMemsz(Integer pMemsz) {
        this.pMemsz = pMemsz;
    }

    public Integer getpFlags() {
        return pFlags;
    }

    public void setpFlags(Integer pFlags) {
        this.pFlags = pFlags;
    }

    public Integer getpAlign() {
        return pAlign;
    }

    public void setpAlign(Integer pAlign) {
        this.pAlign = pAlign;
    }

    @Override
    public String toString() {
        return "ProgramHeader{" +
                "pType=" + pType +
                ", pOffset=" + pOffset.getOffset() +
                ", pVaddr=" + pVaddr +
                ", pPaddr=" + pPaddr +
                ", pFilesz=" + pFilesz +
                ", pMemsz=" + pMemsz +
                ", pFlags=" + pFlags +
                ", pAlign=" + pAlign +
                '}';
    }
}
