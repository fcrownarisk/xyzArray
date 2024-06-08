import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
class IOStream{
    public static void main(String[] args) {
        // 定义一个原始的字节数组
        // define a Original byte arraylist
        byte[] sourceBytes = "Hello, Java IO Streams!".getBytes();
        try {
        // 创建 ByteArrayInputStream，读取 sourceBytes 中的数据
        // create Byte ArrayInputStream,and read the DATA in the source Bytes
            InputStream inputStream = new ByteArrayInputStream(sourceBytes);
            // 创建 ByteArrayOutputStream，用于接收写入的数据
            //create ByteArrayOutputStream,to receive the written DATA
            OutputStream outputStream = new ByteArrayOutputStream();
            // 从输入流读取数据并写入到输出流
            //read and load DATA from InputStream to OutputStream
            byte[] buffer = new byte[1024]; // 缓冲区
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }
            // 关闭流 close the stream
            // 对于 ByteArrayOutputStream 和 ByteArrayInputStream，
            // 这步实际上是可选的，因为它们没有实际的资源需要关闭）
            // this step is actually alterable,
            // because they don't have to be closed
            inputStream.close();
            outputStream.close();
            // 从 ByteArrayOutputStream
            // 获取最终的字节数组，
            // fecth the final byte arraylist
            // 并转换为字符串打印
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
