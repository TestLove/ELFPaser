package elf.entity.simpletable.enums;

/**
 * @author qxm
 * @create 2022-07-05 14:40
 *
 * st_info 的低四位表示符号绑定，用于确定链接可见性和行为
 *
 **/
public enum StInfoCharBind {
    STB_LOCAL("局部符号在包含该符号定义的目标文件以外不可见。相同名\n" +
            "称的局部符号可以存在于多个文件中，互不影响。"),
    STB_GLOBAL("全局符号对所有将组合的目标文件都是可见的。一个文件中\n" +
            "对某个全局符号的定义将满足另一个文件对相同全局符号的\n" +
            "未定义引用。"),
    STB_WEAK("弱符号与全局符号类似，不过他们的定义优先级比较低。"),
    STB_LOPROC("处于这个范围的取值是保留给处理器专用语义的。"),
    STB_HIPROC("处于这个范围的取值是保留给处理器专用语义的。");
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
