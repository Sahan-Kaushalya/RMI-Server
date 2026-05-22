package lk.kaushalya.bcd;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageImpl extends UnicastRemoteObject implements Message, Remote {

    MessageImpl() throws RemoteException{}

    @Override
    public void send() {
        System.out.println("Server Log: Hello World!..........");
    }
}
