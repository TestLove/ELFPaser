package elf.entity.simpletable.enums;

/**
 * @author qxm
 * @create 2022-07-05 14:50
 *
 * 符号类型（ELF32_ST_TYPE）定义（表 15 符号类型）
 *
 **/
public enum StInfoCharType {
    STT_NOTYPE("符号的类型没有指定"),
    STT_OBJECT("符号与某个数据对象相关，比如一个变量、数组等等"),
    STT_FUNC("符号与某个函数或者其他可执行代码相关"),
    STT_SECTION("符号与某个节区相关。这种类型的符号表项主要用于重定\n" +
            "位，通常具有 STB_LOCAL 绑定。"),
    STT_FILE("传统上，符号的名称给出了与目标文件相关的源文件的名\n" +
            "称。文件符号具有 STB_LOCAL 绑定，其节区索引是SHN_ABS，并且它优先于文件的其他 STB_LOCAL 符号\n" +
            "（如果有的话）"),
    STT_LOPROC("此范围的符号类型值保留给处理器专用语义用途。"),
    STT_HIPROC("此范围的符号类型值保留给处理器专用语义用途。");
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
