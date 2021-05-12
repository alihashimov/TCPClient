package com.company;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 80);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        byte[] bytes = Files.readAllBytes(Paths.get("C:\\Users\\Ali\\Desktop\\Java.png"));
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        socket.close();
    }

}

