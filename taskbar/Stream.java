import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
class IOStream{
    public static void main(String[] args) {
        // define a Original byte arraylist
        byte[] sourceBytes = "Hello, Java IO Streams!".getBytes();
        try {
        // create Byte ArrayInputStream,and read the DATA in the source Bytes
            InputStream inputStream = new ByteArrayInputStream(sourceBytes);
            //create ByteArrayOutputStream,to receive the written DATA
            OutputStream outputStream = new ByteArrayOutputStream();
            //read and load DATA from InputStream to OutputStream
            byte[] buffer = new byte[1024]; // 缓冲区
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }
            // close the stream
            // 对于 ByteArrayOutputStream 和 ByteArrayInputStream，
            // this step is actually alterable, because they don't have to be closed
            inputStream.close();
            outputStream.close();
            // 从 ByteArrayOutputStream
            // fecth the final byte arraylist
            // print it out and translate the consequence into string
            String result = new String();
            System.out.println(result);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static class GUI {
    }
}
