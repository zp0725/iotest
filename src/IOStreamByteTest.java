import java.io.*;
import java.nio.charset.Charset;

public class IOStreamByteTest {
    public static void main(String[] args) {
        File file=new File("D:\\IDEA\\iotest\\test.txt");
        /*
        字节流输出
         */
        OutputStream os=null;
        try {
            os= new FileOutputStream(file,true);
            os.write("范加尔肯了sfsffs".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /*
        字节流输入
         */
        InputStream is=null;
        try {
            is=new FileInputStream(file);
            byte[] bytes=new byte[(int)file.length()];//new一个长度为文件字节长度的byte数组
            is.read(bytes);//读取
            System.out.println(new String(bytes, Charset.forName("utf-8")));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
