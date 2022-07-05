package elf.entity.section.enums;

import elf.entity.header.enums.EIClassType;

/**
 * @author qxm
 * @create 2022-07-05 10:47
 **/
public enum ShType {
    SHT_NULL("此值标志节区头部是非活动的，没有对应的节区。此节区头部\n" +
            "中的其他成员取值无意义。"),
    SHT_PROGBITS("此节区包含程序定义的信息，其格式和含义都由程序来解释。"),
    SHT_SYMTAB("此节区包含一个符号表。目前目标文件对每种类型的节区都只\n" +
            "能包含一个，不过这个限制将来可能发生变化。 \n" +
            "一般，SHT_SYMTAB 节区提供用于链接编辑（指 ld 而言）\n" +
            "的符号，尽管也可用来实现动态链接。"),
    SHT_STRTAB("SHT_RELA"),
    SHT_RELA("此节区包含重定位表项，其中可能会有补齐内容（addend），例\n" +
            "如 32 位目标文件中的 Elf32_Rela 类型。目标文件可能拥有多\n" +
            "个重定位节区。"),
    SHT_HASH("此节区包含符号哈希表。所有参与动态链接的目标都必须包含\n" +
            "一个符号哈希表。目前，一个目标文件只能包含一个哈希表，\n" +
            "不过此限制将来可能会解除。"),
    SHT_DYNAMIC("此节区包含动态链接的信息。目前一个目标文件中只能包含一\n" +
            "个动态节区，将来可能会取消这一限制。"),
    SHT_NOTE("此节区包含以某种方式来标记文件的信息。"),
    SHT_NOBITS("这种类型 的节区不 占用文件 中的空间 ，其他方 面 和\n" +
            "SHT_PROGBITS 相似。尽管此节区不包含任何字节，成员\n" +
            "sh_offset 中还是会包含概念性的文件偏移"),
    SHT_REL("此节区包含重定位表项，其中没有补齐（addends），例如 32 位\n" +
            "目标文件中的 Elf32_rel 类型。目标文件中可以拥有多个重定\n" +
            "位节区。"),
    SHT_SHLIB("此节区被保留，不过其语义是未规定的。包含此类型节区的程\n" +
            "序与 ABI 不兼容。"),
    SHT_DYNSYM("作为一个完整的符号表，它可能包含很多对动态链接而言不必\n" +
            "要的符号。因此，目标文件也可以包含一个 SHT_DYNSYM 节\n" +
            "区，其中保存动态链接符号的一个最小集合，以节省空间。"),
    SHT_LOPROC("这一段（包括两个边界），是保留给处理器专用语义的。"),
    SHT_HIPROC("这一段（包括两个边界），是保留给处理器专用语义的。"),
    SHT_LOUSER("此值给出保留给应用程序的索引下界。"),
    SHT_HIUSER("此值给出保留给应用程序的索引上界。");

    public static ShType getShType(int index) {
        ShType res = null;
        switch (index) {
            case 0:
                res = SHT_NULL;
                break;
            case 1:
                res = SHT_PROGBITS;
                break;
            case 2:
                res = SHT_SYMTAB;
                break;
            case 3:
                res = SHT_STRTAB;
                break;
            case 4:
                res = SHT_RELA;
                break;
            case 5:
                res = SHT_HASH;
                break;
            case 6:
                res = SHT_DYNAMIC;
                break;
            case 7:
                res = SHT_NOTE;
                break;
            case 8:
                res = SHT_NOBITS;
                break;
            case 9:
                res = SHT_REL;
                break;
            case 10:
                res = SHT_SHLIB;
                break;
            case 11:
                res = SHT_DYNSYM;
                break;
            case 0X70000000:
                res = SHT_LOPROC;
                break;
            case 0X7FFFFFFF:
                res = SHT_HIPROC;
                break;
            case 0X80000000:
                res = SHT_LOUSER;
                break;
            case 0X8FFFFFFF:
                res = SHT_HIUSER;
                break;
        }
        return res;

    }


    private String description;

    ShType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ShType{" +
                "description='" + description + '\'' +
                '}';
    }
}
