package elf.entity.section.enums;


/**
 * @author qxm
 * @create 2022-07-05 11:07
 **/
public enum ShFlag {
    SHF_WRITE("SHF_WRITE"),
    SHF_ALLOC("SHF_ALLOC" ),
    SHF_EXECINSTR("SHF_EXECINSTR"),
    SHF_MASKPROC("SHF_MASKPROC(");
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
