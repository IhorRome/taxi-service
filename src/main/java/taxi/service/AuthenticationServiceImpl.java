package taxi.service;

import taxi.dao.DriverDao;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;

import java.util.Optional;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverDao driverDao;

    @Override
    public Driver login(String username, String password) throws AuthenticationException {
        Optional<Driver> driver = driverDao.findByLogin(username);
        if (driver.isEmpty() || !password.equals(driver.get().getPassword())) {
            throw new AuthenticationException("Invalid username or password");
        }
        return driver.get();
    }
}
