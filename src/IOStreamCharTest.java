import java.io.*;
import java.nio.charset.Charset;

public class IOStreamCharTest {
    public static void main(String[] args) {
        File file=new File("D:\\IDEA\\iotest\\test.txt");
        /*
        字符流输出
         */

        Writer writer=null;
        try {
            writer=new FileWriter(file,true);
            writer.write("字符流输出aaaa");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        /*
        字符流输入
         */
        Reader reader=null;
        try {
            reader=new FileReader(file);
            char[] chars=new char[(int)file.length()];
            reader.read(chars);
            System.out.println(Charset.forName("utf-8"));
            System.out.println(new String(chars));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
