package lk.kaushalya.bcd.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote {
    public String send() throws RemoteException;
}
