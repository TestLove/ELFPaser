package elf.entity.programHeader.enums;


/**
 * @author qxm
 * @create 2022-07-05 15:00
 * <p>
 * 此数组元素描述的段的类型，或者如何解释此数组元素的信息,具体如表 19。
 **/
public enum PType {
    PT_NULL("此数组元素未用。结构中其他成员都是未定义的。"),
    PT_LOAD("此数组元素给出一个可加载的段，段的大小由 p_filesz 和 p_memsz\n" +
            "描述。文件中的字节被映射到内存段开始处。如果 p_memsz 大于\n" +
            "p_filesz，“剩余”的字节要清零。p_filesz 不能大于 p_memsz。可加载\n" +
            "的段在程序头部表格中根据 p_vaddr 成员按升序排列。"),
    PT_DYNAMIC("数组元素给出动态链接信息。"),
    PT_INTERP("数组元素给出一个 NULL 结尾的字符串的位置和长度，该字符串将被\n" +
            "当作解释器调用。这种段类型仅对与可执行文件有意义（尽管也可能\n" +
            "在共享目标文件上发生）。在一个文件中不能出现一次以上。如果存在\n" +
            "这种类型的段，它必须在所有可加载段项目的前面。"),
    PT_NOTE("此数组元素给出附加信息的位置和大小。"),
    PT_SHLIB("此段类型被保留，不过语义未指定。包含这种类型的段的程序与 ABI\n" +
            "不符。"),
    PT_PHDR("此类型的数组元素如果存在，则给出了程序头部表自身的大小和位置，\n" +
            "既包括在文件中也包括在内存中的信息。此类型的段在文件中不能出\n" +
            "现一次以上。并且只有程序头部表是程序的内存映像的一部分时才起\n" +
            "作用。如果存在此类型段，则必须在所有可加载段项目的前面。"),
    PT_LOPROC("此范围的类型保留给处理器专用语义。"),
    PT_HIPROC("此范围的类型保留给处理器专用语义。");
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
