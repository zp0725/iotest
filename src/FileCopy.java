
import java.io.*;

/**
 * 文件的复制
 */
public class FileCopy {
    public static void main(String[] args) {
        File file=new File("D:\\IDEA\\iotest\\test.txt");
        File newFile=new File("D:\\IDEA\\iotest\\src\\copy\\"+file.getName());
        InputStream is=null;
        OutputStream os=null;

        {
            try {
                is = new FileInputStream(file);
                os=new FileOutputStream(newFile);
                byte[] bytes=new byte[1024];
                int b=is.read(bytes);//b为读取到的字节数
                while (b!=-1){
                    os.write(bytes,0,b);
                    b=is.read(bytes);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    is.close();
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
