package elf.entity.section;

import elf.entity.section.enums.ShFlag;
import elf.entity.section.enums.ShType;

/**
 * @author qxm
 * @create 2022-07-05 11:15
 **/
public class ELFSection {
    ShType shType;
    ShFlag shFlag;

    public ELFSection(ShType shType, ShFlag shFlag) {
        this.shType = shType;
        this.shFlag = shFlag;
    }

    public ELFSection() {
    }

    public ShType getShType() {
        return shType;
    }

    public void setShType(ShType shType) {
        this.shType = shType;
    }

    public ShFlag getShFlag() {
        return shFlag;
    }

    public void setShFlag(ShFlag shFlag) {
        this.shFlag = shFlag;
    }

    @Override
    public String toString() {
        return "ELFSection{" +
                "shType=" + shType +
                ", shFlag=" + shFlag +
                '}';
    }
}
