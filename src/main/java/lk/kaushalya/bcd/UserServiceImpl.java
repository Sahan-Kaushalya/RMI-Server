package lk.kaushalya.bcd;

import lk.kaushalya.bcd.client.UserService;
import lk.kaushalya.bcd.model.User;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class UserServiceImpl extends UnicastRemoteObject implements UserService {

    UserServiceImpl() throws RemoteException {
    }

    @Override
    public User getUserByID(int id) throws RemoteException {
        for (User user : RMIServer.users) {
            if (user.getId() == id) {
                System.out.println("==================================");
                System.out.println("Server Log :" + user.getName() + "'s Details is requested by the Client...!");
                return user;
            }
        }
        return null;
    }

    @Override
    public String addUser(User user) throws RemoteException {

        RMIServer.users.add(user);
        System.out.println("==================================");
        System.out.println("Server Log : New User called " + user.getName() + " is Added successfully...!");
        return "New User called " + user.getName() + " is Added successfully...!";
    }

    @Override
    public String updateUser(User user) throws RemoteException {
        for (User u : RMIServer.users) {
            if (u.getId() == user.getId()) {
                u.setName(user.getName());
                u.setEmail(user.getEmail());
                u.setAge(user.getAge());
                u.setRole(user.getRole());
                System.out.println("==================================");
                System.out.println("Server Log : " + user.getName() + "'s Details is Updated successfully...!");
                break;
            }
        }
        return user.getName() + "'s Details Updated Successfully...!";
    }

    @Override
    public String deleteUser(int id) throws RemoteException {
        User user = null;
        for (User u : RMIServer.users) {
            if (u.getId() == id) {
                user = u;
                RMIServer.users.remove(u);
                System.out.println("==================================");
                System.out.println("Server Log : " + user.getName() + "'s Details is Deleted successfully...!");
                break;
            }
        }
        return user.getName() + "'s Details Deleted Successfully...!";
    }

    @Override
    public List<User> getAllUsers() throws RemoteException {
        System.out.println("==================================");
        System.out.println("Server Log : All Users Details is requested by the Client...!");
        return RMIServer.users;
    }
}
