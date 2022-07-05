package elf.entity.header.enums;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/4 10:09
 * @Description: 目标文件类型
 */
public enum FileType {
    ET_NONE("未知目标文件格式"), //

    ET_REL("可重定位文件"),

    ET_EXEC("可执行文件"),

    ET_DYN("共享目标文件"),

    ET_CORE("Core 文件（转储格式)"),
    OTHERS("其他类型");

    private String description;

    public String getDescription() {
        return description;
    }

    FileType(String description) {
        this.description = description;
    }

    public static FileType getFileTypeByValue(int value){
        FileType result = null;
        switch (value) {
            case 0 : result=FileType.ET_NONE;
                break;
            case 1 : result=FileType.ET_REL;
                break;
            case 2 : result=FileType.ET_EXEC;
                break;
            case 3 : result=FileType.ET_DYN;
                break;
            case 4 : result=FileType.ET_CORE;
                break;
            default: result=FileType.OTHERS;

        }
        return result;
    }

    @Override
    public String toString() {
        return description;
    }
}
