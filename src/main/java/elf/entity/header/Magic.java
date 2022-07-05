package elf.entity.header;

import elf.entity.header.enums.EIClassType;
import elf.entity.header.enums.EIDataType;

import java.util.Arrays;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/4 10:43
 * @Description: 文件魔数
 */
public class Magic {
    public static final int ELF_MAGIC= 0x7f454c46;
    private byte[] contents;

    private EIClassType eClass;

    private EIDataType data;

    private byte version;

    private String os;

    private String apiVersion;

    public Magic(byte[] contents) {
        this.contents = contents;
        if(!isELFFile()){
            throw new IllegalArgumentException("此文件并非ELF文件");
        }
        eClass = EIClassType.getEIClassType(contents[4]);
        data = EIDataType.getEIDataType(contents[5]);
        version = contents[6];
    }
    private boolean isELFFile(){
        int temp = (contents[0]<<8)|contents[1];
        temp = (temp<<8)|contents[2];
        temp = (temp<<8)|contents[3];
        if (temp == ELF_MAGIC) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Magic{" +
                "contents=" + Arrays.toString(contents) +
                ", eClass=" + eClass +
                ", data=" + data +
                ", version=" + version +
                ", os='" + os + '\'' +
                ", apiVersion='" + apiVersion + '\'' +
                '}';
    }
}
