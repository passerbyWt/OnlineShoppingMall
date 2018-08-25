package dao;

import entity.User;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.hibernate.Query;
import java.util.List;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{
    @Override
    public void add(User user) {

        HibernateTemplate template=this.getHibernateTemplate();
        template.setCheckWriteOperations(false);
        template.save(user);
    }

    @Override
    public User getUserByName(String name) {
        String sql="from User u where u.userName='"+name+"'";
        List result=this.getHibernateTemplate().find(sql);
        if(result.size()==0)
        {
            return null;
        }
        User user=(User)result.get(0);
        return user;
    }

    @Override
    public User getUserById(int id) {
        User result=(User)this.getHibernateTemplate().get(User.class,id);
        return result;
    }

    @Override
    public void deleteById(int id) {
        this.getHibernateTemplate().delete(getUserById(id));
    }

    @Override
    public void update(User user) {
        this.getHibernateTemplate().update(user);
    }

    @Override
    public List<User> getAll() {
        String sql="from User";
        List<User> result=(List<User>)this.getHibernateTemplate().find(sql);
        return result;
    }
}
