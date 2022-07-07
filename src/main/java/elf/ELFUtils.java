package elf;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/4 10:14
 * @Description: 相关的工具类
 */
public class ELFUtils {
    public static byte[] copyBytes(byte[] fileBuff, int start, int count) {
        if (fileBuff == null || fileBuff.length == 0) {
            return null;
        }

        byte[] item = new byte[count];
        for (int i = 0; i < count; ++i) {
            item[i] = fileBuff[start + i];
        }
        return item;
    }

    public static String bytesToHexString(byte[] bytes) {
        final char[] HEX_CHAR = {'0', '1', '2', '3', '4', '5',
                '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] buf = new char[bytes.length * 3];
        int a = 0;
        int index = 0;
        for (byte b : bytes) { // 使用除与取余进行转换
            if (b < 0) {
                a = 256 + b;
            } else {
                a = b;
            }
            buf[index++] = HEX_CHAR[a / 16];
            buf[index++] = HEX_CHAR[a % 16];
            buf[index++] = ' ';
        }

        return new String(buf);
    }

    public static byte[] fileToBytes(String path) throws FileNotFoundException {
        File file = new File(path);
        byte[] data = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            int len;
            byte[] buffer = new byte[1024];
            while ((len = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }

            data = baos.toByteArray();

            fis.close();
            baos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;

    }

    public static int byteToIntLSB(byte[] bytes) {
        int[] newArray = getUnsignedBytes(bytes);
        int temp = newArray[bytes.length - 1];
        for (int i = bytes.length - 2; i >= 0; i--) {
            temp = (temp << 8) | newArray[i];
        }
        return temp;
    }

    public static int byteToIntMSB(byte[] bytes) {
        int temp = bytes[0];
        for (int i = 1; i < bytes.length; i++) {
            temp = (temp << 8) | bytes[i];
        }
        return temp;
    }

    public static int[] getUnsignedBytes(byte[] b) {
        int[] result = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            result[i] = b[i] & 0x0FF;
        }
        return result;
    }

    //byte[] + offset ---> int

    /**
     * byte数组中取int数值，本方法适用于(低位在前，高位在后)的顺序，仅适用于四位Byte数组。
     *
     * @param ary    byte数组
     * @param offset 从数组的第offset位开始
     * @return int数值
     */
    public static int bytesToInt(byte[] ary, int offset) {
        int value;
        value = (int) ((ary[offset] & 0xFF)
                | ((ary[offset + 1] << 8) & 0xFF00)
                | ((ary[offset + 2] << 16) & 0xFF0000)
                | ((ary[offset + 3] << 24) & 0xFF000000));
        return value;
    }

    /**
     * byte数组中取int数值，本方法适用于(低位在后，高位在前)的顺序。和intToBytes2（）配套使用
     */
    public static int bytesToInt2(byte[] src, int offset) {
        int value;
        value = (int) (((src[offset] & 0xFF) << 24)
                | ((src[offset + 1] & 0xFF) << 16)
                | ((src[offset + 2] & 0xFF) << 8)
                | (src[offset + 3] & 0xFF));
        return value;
    }

}
