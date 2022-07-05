package elf.entity.header.enums;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/4 15:22
 * @Description: null
 */
public enum EIDataType {
    ELFDATANONE("非法数据编码"),
    ELFDATA2LSB("高位在前"),
    ELFDATA2MSB("低位在前");
    private String description;

    EIDataType(String description) {
        this.description = description;
    }

    public static EIDataType getEIDataType(byte index) {
        EIDataType result = null;
        switch (index) {
            case 0: result =  EIDataType.ELFDATANONE;
                break;
            case 1 : result =  EIDataType.ELFDATA2LSB;
                break;
            case 2 : result =  EIDataType.ELFDATA2MSB;
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return description;
    }
}
