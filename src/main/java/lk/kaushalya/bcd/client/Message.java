package lk.kaushalya.bcd.client;

import lk.kaushalya.bcd.model.Data;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote {
    public String send() throws RemoteException;
    public Data getData() throws RemoteException;
    public String getResult(int num1, int num2) throws RemoteException;
}
