import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OS {

 
 public static void main(String[] args) throws IOException {
 
 Process p= Runtime.getRuntime().exec("cmd /c netsh wlan set hostednetwork mode=allow ssid=naren key=123456898");
 }

}
