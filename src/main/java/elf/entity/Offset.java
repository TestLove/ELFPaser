package elf.entity;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/4 14:58
 * @Description: offset record
 */
public class Offset {
    private int offset;

    private int index;

    public int getOffset() {
        return offset;
    }

    public int getIndex() {
        return index;
    }

    public int increment(){
        return increment(1);
    }

    public Offset(int offset) {
        this.offset = offset;
        this.index = offset-1;
    }
    public int increment(int duration){
        offset += duration;
        index  += duration;
        return offset;
    }
    public int incrementAndReturnDuration(int duration){
        offset += duration;
        index  += duration;
        return duration;
    }
}
