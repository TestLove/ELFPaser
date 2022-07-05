package elf.entity.header.enums;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/4 15:21
 * @Description: null
 */
public enum EIClassType {
    ELFCLASSNONE("非法类别"),
    ELFCLASS32("32位目标"),
    ELFCLASS64("64位目标");
    String description;

    EIClassType(String description) {
        this.description = description;
    }
    public static EIClassType getEIClassType(byte index){
        EIClassType result = null;
        switch (index) {
            case 0: result = EIClassType.ELFCLASSNONE;
                    break;
            case 1 : result = EIClassType.ELFCLASS32;
                    break;
            case 2 : result = EIClassType.ELFCLASS64;
                    break;
        }
        return result;
    }

    @Override
    public String toString() {
        return  description;
    }
}
