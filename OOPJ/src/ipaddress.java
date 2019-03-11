import java.net.*;
public class ipaddress {

	public static void main(String[] args) {
		try{
			InetAddress ip = InetAddress.getByName("www.abc.com");
			System.out.println("The host address is " +ip.getHostAddress());
			System.out.println("The Host Name is " +ip.getHostName());
		}catch(UnknownHostException ue)
		{
			System.out.println("Website not found!!!!!!!!!!" );
		}
		}

}
