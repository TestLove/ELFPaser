package elf.entity.simpletable.enums;

/**
 * @author qxm
 * @create 2022-07-05 14:50
 *
 * 符号类型（ELF32_ST_TYPE）定义（表 15 符号类型）
 *
 **/
public enum StInfoCharType {
    STT_NOTYPE("STT_NOTYPE"),
    STT_OBJECT("STT_OBJECT"),
    STT_FUNC("STT_FUNC"),
    STT_SECTION("STT_SECTION"),
    STT_FILE("STT_FILE"),
    STT_LOPROC("STT_LOPROC"),
    STT_HIPROC("STT_HIPROC");
    String description;

    StInfoCharType(String description) {
        this.description = description;
    }

    public static StInfoCharType getStInfoCharType(int index) {
        StInfoCharType result = null;
        switch (index) {
            case 0:
                result = StInfoCharType.STT_NOTYPE;
                break;
            case 1:
                result = StInfoCharType.STT_OBJECT;
                break;
            case 2:
                result = StInfoCharType.STT_FUNC;
                break;
            case 3:
                result = StInfoCharType.STT_SECTION;
                break;
            case 4:
                result = StInfoCharType.STT_FILE;
                break;
            case 13:
                result = StInfoCharType.STT_LOPROC;
                break;
            case 15:
                result = StInfoCharType.STT_HIPROC;
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return description;
    }
}
