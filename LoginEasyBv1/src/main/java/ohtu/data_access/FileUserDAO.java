package ohtu.data_access;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ohtu.domain.User;

/* @author mhaanran */
public class FileUserDAO implements UserDao{

    private File tiedosto;
    private Scanner lukija = new Scanner(tiedosto);
    private List<User> users;
    
    public FileUserDAO(File tiedosto) throws Exception {
        this.tiedosto=tiedosto;
        tiedosto = new File("tiedosto.txt");
        users = new ArrayList<User>();
    }
    @Override
    public List<User> listAll() {
        while(lukija.hasNextLine()) {
            String rivi=lukija.nextLine();          
            users.add(new User(rivi,rivi));
        }
        lukija.close();
        return users;
    }

    @Override
    public User findByName(String name) {
        for(User user:users) {
            if(user.getUsername().equals(name)) {    
                return user; 
            }
        }
        lukija.close();
        return null;
    }

    @Override
    public void add(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
