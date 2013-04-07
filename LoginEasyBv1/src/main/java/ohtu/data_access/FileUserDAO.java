package ohtu.data_access;

import java.io.File;
import java.util.List;
import ohtu.domain.User;

/* @author mhaanran */
public class FileUserDAO implements UserDao{

    private File tiedosto = new File("tiedosto.txt");
    
    @Override
    public List<User> listAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public User findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void add(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
