package elf.function;

import elf.ELFUtils;
import elf.entity.ELFSectionHeaderParams;
import elf.entity.Offset;
import elf.entity.section.ELFSectionHeader;
import elf.entity.ELFStringTable;
import elf.entity.section.ELFSectionHeaders;
import elf.entity.section.enums.ShFlag;
import elf.entity.section.enums.ShType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/6 8:45
 * @Description: null
 */
public class ParseELFSectionHeader {
    public ELFSectionHeaders getELFSectionHeaders(byte[]bytes) {
        ELFSectionHeaderParams elfSectionHeaderParams = new ELFSectionHeaderParams();
        ELFSectionHeaderParams params = ELFInfoContainer.getElfFile().getParams();
        ELFSectionHeaders elfSectionHeaderList = ELFInfoContainer.getElfFile().getElfSectionHeaders();
        Integer sectionHeaderOffset = params.getSectionHeaderOffset();
        for (int i = 0; i < params.getNumOfSectionHeader(); i++) {
            elfSectionHeaderList.addSectionHeader(getELFSectionHeader(ELFUtils.copyBytes(bytes,sectionHeaderOffset,params.getSizeOfSectionHeader())));
            sectionHeaderOffset+= params.getSizeOfSectionHeader();
        }
        return elfSectionHeaderList;
    }
    private ELFSectionHeader getELFSectionHeader(byte[] bytes){
        Offset offset = new Offset(0);
        ELFSectionHeader elfSectionHeader = new ELFSectionHeader();
        ELFStringTable elfStringTable = ELFInfoContainer.getELFSectionStringTable();
        elfSectionHeader.setName(elfStringTable.getNameByIndex(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4)))));
        elfSectionHeader.setType(ShType.getShType(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4)))));
        elfSectionHeader.setFlags(ShFlag.getShFlag(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4)))));
        elfSectionHeader.setAddress(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4))));
        elfSectionHeader.setOffset(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4))));
        elfSectionHeader.setSize(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4))));
        elfSectionHeader.setLink(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4))));
        elfSectionHeader.setInfo(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4))));
        elfSectionHeader.setAddralign(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4))));
        elfSectionHeader.setEntsize(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4))));
        return elfSectionHeader;

    }

}
