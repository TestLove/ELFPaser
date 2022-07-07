package elf.entity.programHeader.enums;


/**
 * @author qxm
 * @create 2022-07-05 15:00
 * <p>
 * 此数组元素描述的段的类型，或者如何解释此数组元素的信息,具体如表 19。
 **/
public enum PType {
    PT_NULL("PT_NULL"),
    PT_LOAD("PT_LOAD"),
    PT_DYNAMIC("PT_DYNAMIC"),
    PT_INTERP(" PT_INTERP"),
    PT_NOTE("PT_NOTE"),
    PT_SHLIB("PT_SHLIB"),
    PT_PHDR("PT_PHDR"),
    PT_LOPROC("PT_LOPROC"),
    PT_HIPROC("PT_HIPROC");
    String description;

    PType(String description) {
        this.description = description;
    }

    public static PType getPType(int index) {
        PType result = null;
        switch (index) {
            case 0:
                result = PType.PT_NULL;
                break;
            case 1:
                result = PType.PT_LOAD;
                break;
            case 2:
                result = PType.PT_DYNAMIC;
                break;
            case 3:
                result = PType.PT_INTERP;
                break;
            case 4:
                result = PType.PT_NOTE;
                break;
            case 5:
                result = PType.PT_SHLIB;
                break;
            case 6:
                result = PType.PT_PHDR;
                break;
            case 0x70000000:
                result = PType.PT_LOPROC;
                break;
            case 0x7fffffff:
                result = PType.PT_HIPROC;
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return description;
    }
}
