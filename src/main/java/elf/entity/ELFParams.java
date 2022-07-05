package elf.entity;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/4 10:25
 * @Description: 用于接收参数
 */
public class ELFParams {
    private String filePath;

    private String optional;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }
    public ELFParams(String primitiveInput){
        String[] s = primitiveInput.split(" ");
        this.filePath = s[0];
        this.optional = s[1].substring(1);
    }

    @Override
    public String toString() {
        return "ELFParams{" +
                "filePath='" + filePath + '\'' +
                ", optional='" + optional + '\'' +
                '}';
    }
}
