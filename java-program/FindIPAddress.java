import java.io.IOException;
import java.net.*;
import java.util.*;

public class FindIPAddress {

    public static void main(String args[]) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("masukkan ip address: ");
        String host = input.next();

        InetAddress address = InetAddress.getByName(host);
        System.out.println("Nama Host : " + address.getHostName());

        System.out.println("Host not found:" + host);

    }
}
