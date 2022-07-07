package elf.entity.simpletable.enums;

/**
 * @author qxm
 * @create 2022-07-05 14:40
 *
 * st_info 的低四位表示符号绑定，用于确定链接可见性和行为
 *
 **/
public enum StInfoCharBind {
    STB_LOCAL("STB_LOCAL"),
    STB_GLOBAL("STB_GLOBAL"),
    STB_WEAK("STB_WEAK"),
    STB_LOPROC("STB_LOPROC"),
    STB_HIPROC("STB_HIPROC");
    String description;

    StInfoCharBind(String description) {
        this.description = description;
    }

    public static StInfoCharBind getStInfoCharBind(int index) {
        StInfoCharBind result = null;
        switch (index) {
            case 0:
                result = StInfoCharBind.STB_LOCAL;
                break;
            case 1:
                result = StInfoCharBind.STB_GLOBAL;
                break;
            case 2:
                result = StInfoCharBind.STB_WEAK;
                break;
            case 13:
                result = StInfoCharBind.STB_LOPROC;
                break;
            case 15:
                result = StInfoCharBind.STB_HIPROC;
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return description;
    }
}
