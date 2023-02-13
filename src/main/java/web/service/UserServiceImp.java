package web.service;

import web.dao.UserDao;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Component
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Override
   @Transactional
   public void save(User user) {
      userDao.save(user);
   }

   @Override
   public List<User> showUsers() {

      return userDao.showUsers();
   }

   @Override
   public void getUser(Long id) {
      userDao.getUser(id);
   }

   @Override
   @Transactional
   public void delete(Long id) {
      userDao.delete(id);
   }

   @Override
   @Transactional
   public void update(User user) {
      userDao.update(user);
   }
}