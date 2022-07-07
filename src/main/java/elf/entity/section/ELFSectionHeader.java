package elf.entity.section;

import elf.entity.section.enums.ShFlag;
import elf.entity.section.enums.ShType;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/5 16:56
 * @Description: null
 */
public class ELFSectionHeader {
    String name;
    ShType type;
    ShFlag flags;
    Integer address;
    Integer offset;
    Integer size;
    Integer link;
    Integer info;
    Integer addralign;
    Integer entsize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShType getType() {
        return type;
    }

    public void setType(ShType type) {
        this.type = type;
    }

    public ShFlag getFlags() {
        return flags;
    }

    public void setFlags(ShFlag flags) {
        this.flags = flags;
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getLink() {
        return link;
    }

    public void setLink(Integer link) {
        this.link = link;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public Integer getAddralign() {
        return addralign;
    }

    public void setAddralign(Integer addralign) {
        this.addralign = addralign;
    }

    public Integer getEntsize() {
        return entsize;
    }

    public void setEntsize(Integer entsize) {
        this.entsize = entsize;
    }

    @Override
    public String toString() {
        return "ELFSectionHeader{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", flags=" + flags +
                ", address=" + address +
                ", offset=" + offset +
                ", size=" + size +
                ", link=" + link +
                ", info=" + info +
                ", addralign=" + addralign +
                ", entsize=" + entsize +
                '}';
    }
}
