package lk.kaushalya.bcd;
import lk.kaushalya.bcd.client.Message;
import lk.kaushalya.bcd.model.Data;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageImpl extends UnicastRemoteObject implements Message {

    MessageImpl() throws RemoteException{}

    @Override
    public String send() throws RemoteException {
        System.out.println("Server Log: Hello World!..........");
        return "Server Say: Hello World!....";
    }

    @Override
    public Data getData() throws RemoteException {
        return new Data(01,"Sahan Kaushalya" , "Software Engineering Student");
    }

    @Override
    public String getResult(int num1, int num2) throws RemoteException {
        return "Answer is: "+ String.valueOf(num1 + num2);
    }
}
