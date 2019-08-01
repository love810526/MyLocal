import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.net.URLDecoder;

public class TestUrl {
	public static void main(String[] Args) {

		String path = "https://tw.buy.yahoo.com/gdsale/Keds-TRIPLE-KICK-%E6%B2%96%E5%AD%94%E6%B4%9E%E6%B4%9E%E7%9A%AE%E8%B3%AA%E7%B6%81%E5%B8%B6-7553952.html";
		
	    try {
	    	
	    	String encodedURL = URLEncoder.encode(path, "UTF-8");


	        // 輸出結果
	        System.out.println(path);

	      } catch (UnsupportedEncodingException e) {
	      }
	}
}
