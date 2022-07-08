package elf.entity.symboltable.enums;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/8 9:11
 * @Description: null
 */
public enum STType {

    NOTYPE("LOCAL"),
    OBJECT("GLOBAL"),
    FUNC("WEAK"),
    SECTION("SECTION"),
    FILE("FILE"),
    LOPROC("LOPROC"),
    HIPROC("HIPROC");



    STType(String description) {
        this.description = description;
    }

    String description;

    @Override
    public String toString() {
        return description;
    }

    public static STType getSTType(Integer value){
        STType result = null;
        switch (value) {
            case 0: result = STType.NOTYPE;break;
            case 1 :result = STType.OBJECT; break;
            case 2 :result = STType.FUNC; break;
            case 3 :result = STType.SECTION; break;
            case 4 :result = STType.FILE; break;
            case 13 :result = STType.LOPROC; break;
            case 15 :result = STType.HIPROC;break;

        }
        return result;
    }
}
