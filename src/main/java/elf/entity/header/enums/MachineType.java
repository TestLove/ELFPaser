package elf.entity.header.enums;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/4 11:18
 * @Description: null
 */
public enum MachineType {
    EM_NONE("未指定"),
    EM_M32("AT&T WE 32100"),
    EM_SPARC("SPARC"),
    EM_386("Intel 80386"),
    EM_68K("Motorola 68000"),
    EM_88K("Motorola 88000"),
    EM_860("Intel 80860"),
    EM_MIPS("MIPS RS3000"),
    OTHERS("其他设备");

    private String description;

    MachineType(String description) {
        this.description = description;
    }

    public static MachineType getMachineTypeByValue(int value){
        MachineType result = null;
        switch (value) {
            case 0 : result=MachineType.EM_NONE;
                break;
            case 1 : result=MachineType.EM_M32;
                break;
            case 2 : result=MachineType.EM_SPARC;
                break;
            case 3 : result=MachineType.EM_386;
                break;
            case 4 : result=MachineType.EM_68K;
                break;
            case 5 : result=MachineType.EM_88K;
                break;
            case 6 : result=MachineType.EM_860;
                break;
            case 7 : result=MachineType.EM_MIPS;
                break;
            default: result=MachineType.OTHERS;

        }
        return result;
    }
    @Override
    public String toString() {
        return description;
    }
}
