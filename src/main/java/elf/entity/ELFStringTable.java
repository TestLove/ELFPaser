package elf.entity;

import elf.ELFUtils;
import elf.function.ELFInfoContainer;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/6 9:22
 * @Description: null
 */
public class ELFStringTable {
    private int start;

    public ELFStringTable(){
        int strSectionOffset= ELFInfoContainer.getOffsetOfSectionHeader()+ELFInfoContainer.getELFSectionStringTableOffset()*ELFInfoContainer.getSizeOfSectionHeader();
        start = ELFUtils.byteToIntLSB(ELFUtils.copyBytes(ELFInfoContainer.getFileBytes(),strSectionOffset+16,4));
    }
    public String getNameByIndex(int index){
        StringBuffer sb = new StringBuffer();
        byte[] fileBytes = ELFInfoContainer.getFileBytes();
        int unsigned = 0;
        index = start+index;
       while (index < fileBytes.length&&fileBytes[index]!=0){
           unsigned = fileBytes[index++]&0x0ff;
            sb.append((char)unsigned);
       }
        return sb.toString();
    }
}
