package lk.kaushalya.bcd;

import lk.kaushalya.bcd.model.User;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;


public class RMIServer {

    static List<User> users = new ArrayList<User>();

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(6666);
            registry.bind("message_service",new MessageImpl());
            registry.bind("user_service",new UserServiceImpl());


            System.out.println("RMI Server is running...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
