package lk.kaushalya.bcd;
import lk.kaushalya.bcd.client.Message;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageImpl extends UnicastRemoteObject implements Message {

    MessageImpl() throws RemoteException{}

    @Override
    public String send() throws RemoteException {
        System.out.println("Server Log: Hello World!..........");
        return "Server Say: Hello World!....";
    }
}
