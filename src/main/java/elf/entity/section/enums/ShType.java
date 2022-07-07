package elf.entity.section.enums;

import elf.entity.header.enums.EIClassType;

/**
 * @author qxm
 * @create 2022-07-05 10:47
 **/
public enum ShType {
    SHT_NULL("NULL"),
    SHT_PROGBITS("PROGBITS"),
    SHT_SYMTAB("SYMTAB" ),
    SHT_STRTAB("STRTAB"),
    SHT_RELA("RELA"),
    SHT_HASH("HASH"),
    SHT_DYNAMIC("DYNAMIC"),
    SHT_NOTE("NOTE"),
    SHT_NOBITS("NOBITS"),
    SHT_REL("REL"),
    SHT_SHLIB("SHLIB"),
    SHT_DYNSYM("DYNSYM"),
    SHT_LOPROC("LOPROC"),
    SHT_HIPROC("HIPROC"),
    SHT_LOUSER("LOUSER"),
    SHT_HIUSER("HIUSER");

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
