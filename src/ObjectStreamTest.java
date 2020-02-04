import java.io.*;


public class ObjectStreamTest {
    public static void main(String[] args) {
        /*
        对象流输出
         */
        File file=new File("D:\\IDEA\\iotest\\ObjecTest.txt");
        OutputStream os=null;
        ObjectOutputStream oos=null;
        try {
            os= new FileOutputStream(file);
           oos=new ObjectOutputStream(os);
            oos.writeObject(new Person());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /*
        对象流输入
         */
        InputStream is=null;
        ObjectInputStream ois=null;
        try {
            is= new FileInputStream(file);
            ois=new ObjectInputStream(is);

            Person p=(Person)ois.readObject();
            System.out.println(p);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
