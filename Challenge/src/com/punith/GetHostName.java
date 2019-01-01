package com.punith;

//Java program to get Host Name by IP Address.
//In this program we will provide Ip address of the google and program will print the hostname of the provided IP address.

import java.net.*;

public class GetHostName {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("192.168.40.1");
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());
    }
}
