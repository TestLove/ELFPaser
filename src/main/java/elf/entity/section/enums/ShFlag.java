package elf.entity.section.enums;


/**
 * @author qxm
 * @create 2022-07-05 11:07
 **/
public enum ShFlag {
    SHF_WRITE("节区包含进程执行过程中将可写的数据。"),
    SHF_ALLOC("此节区在进程执行过程中占用内存。某些控制节区并不出现于目标\n" +
            "文件的内存映像中，对于那些节区，此位应设置为 0。"),
    SHF_EXECINSTR("节区包含可执行的机器指令"),
    SHF_MASKPROC("所有包含于此掩码中的四位都用于处理器专用的语义。");
    String description;

    ShFlag(String description) {
        this.description = description;
    }

    public static ShFlag getShFlag(int index) {
        ShFlag result = null;

        switch (index) {
            case 0x1:
                result = ShFlag.SHF_WRITE;
                break;
            case 0x2:
                result = ShFlag.SHF_ALLOC;
                break;
            case 0x4:
                result = ShFlag.SHF_EXECINSTR;
            case 0xF0000000:
                result = SHF_MASKPROC;
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return description;
    }
}
