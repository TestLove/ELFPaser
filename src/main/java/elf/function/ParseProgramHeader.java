package elf.function;

import elf.ELFUtils;
import elf.entity.Offset;
import elf.entity.header.ELFHeader;
import elf.entity.programHeader.ProgramHeader;
import elf.entity.programHeader.enums.PType;

/**
 * @author qxm
 * @create 2022-07-06 15:20
 **/
public class ParseProgramHeader {
    public ProgramHeader getProgramHeader(byte[] bytes, Offset offset) {
        ProgramHeader programHeader = new ProgramHeader();
        programHeader.setpType(PType.getPType(ELFUtils.bytesToInt(bytes, offset.getOffset())));
        programHeader.setpOffset(new Offset(ELFUtils.bytesToInt(bytes, offset.getOffset() + 4)));
        programHeader.setpVaddr(ELFUtils.bytesToInt(bytes, offset.getOffset() + 8));
        programHeader.setpPaddr(ELFUtils.bytesToInt(bytes, offset.getOffset() + 12));
        programHeader.setpFilesz(ELFUtils.bytesToInt(bytes, offset.getOffset() + 16));
        programHeader.setpMemsz(ELFUtils.bytesToInt(bytes, offset.getOffset() + 20));
        programHeader.setpFlags(ELFUtils.bytesToInt(bytes, offset.getOffset() + 24));
        programHeader.setpAlign(ELFUtils.bytesToInt(bytes, offset.getOffset() + 28));
        return programHeader;
    }


}
