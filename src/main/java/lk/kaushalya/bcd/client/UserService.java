package lk.kaushalya.bcd.client;

import lk.kaushalya.bcd.model.User;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface UserService extends Remote {
    User getUserByID(int id) throws RemoteException;
    String addUser(User user) throws RemoteException;
    String updateUser(User user) throws RemoteException;
    String deleteUser(int id) throws RemoteException;
    List <User> getAllUsers() throws RemoteException;  
}
