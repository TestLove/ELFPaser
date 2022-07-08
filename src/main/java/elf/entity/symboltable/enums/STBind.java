package elf.entity.symboltable.enums;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/8 9:09
 * @Description: null
 */
public enum STBind {
    LOCAL("LOCAL"),
    GLOBAL("GLOBAL"),
    WEAK("WEAK"),
    LOPROC("LOPROC"),
    HIPROC("HIPROC");

    STBind(String description) {
        this.description = description;
    }

    String description;

    @Override
    public String toString() {
        return description;
    }

    public static STBind getSTBind(Integer value){
        STBind result = null;
        switch (value) {
            case 0: result = STBind.LOCAL;break;
            case 1 :result = STBind.GLOBAL; break;
            case 2 :result = STBind.WEAK; break;
            case 13 :result = STBind.LOPROC; break;
            case 15 :result = STBind.HIPROC;break;

        }
        return result;

    }
}
