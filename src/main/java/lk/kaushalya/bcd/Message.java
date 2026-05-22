package lk.kaushalya.bcd;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote {
    public void send() throws RemoteException;
}
