import java.io.*;
import java.security.PrivateKey;
import java.util.ArrayList;

public class Encrypt {
    public static void main(String[] args) throws IOException {
        ////aaaaaaa
        //bbbbbbbb
        ///ccccccc
        //cccccddd
        PrivateKey asda;
        File file = new File("C:\\Users\\wuyunlong\\Desktop\\aaa\\secret\\123.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Users\\wuyunlong\\Desktop\\aaa\\secret\\456.awt"));
        byte[] b=new byte[3];
        byte[] c=new byte[5];
        int len=0;
        ArrayList<Byte> list = new ArrayList<Byte>();
        while((len=fileInputStream.read(b))!=-1){
            for(int i=0;i<len;i++){
                c[i]=b[i];
            }
            c[3]=new Byte("1");
            c[4]=new Byte("2");
            System.out.println("b1------------------");
            for(byte b1:b){
                System.out.print(b1);
                System.out.print("/");
            }
            System.out.println();

            System.out.println("c1------------------");

            for(byte c1:c){
                System.out.print(c1);
                System.out.print("/");
            }
            System.out.println();
            System.out.println("------------------");

            System.out.println(b[len-1]);
            System.out.println(c[len]);
            System.out.println("len----->"+len);

            fileOutputStream.write(c);
        }
        fileInputStream.close();
        fileOutputStream.close();

        System.out.println("搞定.......");

    }

}
