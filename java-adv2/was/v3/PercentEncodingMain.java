package was.v3;

import java.net.URLEncoder;
import java.net.URLDecoder;

import static java.nio.charset.StandardCharsets.*;

public class PercentEncodingMain {
    public static void main(String[] args) {
        String encode = URLEncoder.encode("가", UTF_8);
        System.out.println("encode = " + encode);

        String decode = URLDecoder.decode(encode, UTF_8);
        System.out.println("decode = " + decode);
    }
}