import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class decode {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\wuyunlong\\Desktop\\aaa\\secret\\456.awt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Users\\wuyunlong\\Desktop\\aaa\\secret\\789.txt"));
        byte[] b = new byte[3];
        byte[] c = new byte[5];
        int len = 0;
        ArrayList<Byte> list = new ArrayList<Byte>();
        while ((len = fileInputStream.read(c)) != -1) {
            for (int i = 0; i < len - 2; i++) {
                b[i] = c[i];
            }
            System.out.println("len==="+len);
            for(byte c1:c){

                System.out.print(c1);
                System.out.print("/");

            }
            System.out.println();

            System.out.println("--------------------");
            for(byte b1:b){

                System.out.print(b1);
                System.out.print("/");
            }
            System.out.println();
            System.out.println("-------------------->>>>>>");

            fileOutputStream.write(b);

        }
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("搞定.....");
    }
}
