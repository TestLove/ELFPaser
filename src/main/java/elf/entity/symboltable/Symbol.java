package elf.entity.symboltable;

import elf.entity.symboltable.enums.STBind;
import elf.entity.symboltable.enums.STType;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/7 16:41
 * @Description: null
 */
public class Symbol {
    private String stName;

    private Integer value;

    private Integer size;

    private STBind bind;

    private STType type;

    private Integer others;

    private Integer shndx;

    public void setInfo(int value){
        bind = STBind.getSTBind(value>>4);
        type = STType.getSTType(value &0xf);
    }
    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public STBind getBind() {
        return bind;
    }

    public STType getType() {
        return type;
    }

    public Integer getOthers() {
        return others;
    }

    public void setOthers(Integer others) {
        this.others = others;
    }

    public Integer getShndx() {
        return shndx;
    }

    public void setShndx(Integer shndx) {
        this.shndx = shndx;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "stName='" + stName + '\'' +
                ", value=0x" + Integer.toHexString(value) +
                ", size=" + size +
                ", bind=" + bind +
                ", type=" + type +
                ", others=" + others +
                ", shndx=" + shndx +
                '}';
    }
}
