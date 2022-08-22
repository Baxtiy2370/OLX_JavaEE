package uz.team.dao;

import org.hibernate.Session;
import uz.team.config.HibernateConfigurer;
import uz.team.domain.Basket;

import java.util.List;

public class BasketDAO implements Dao<Basket> {
    @Override
    public Basket create(Basket entity) {
        Session session = HibernateConfigurer.getSession();
        session.getTransaction().begin();
        session.persist(entity);
        session.getTransaction().commit();
        return entity;
    }

    @Override
    public void delete(Long id) {
        Session session = HibernateConfigurer.getSession();
        session.getTransaction().begin();
        session.createQuery("select t from Basket t where t.id = :id ", Basket.class)
                .setParameter("id", id);
        session.getTransaction().commit();

    }

    @Override
    public List<Basket> findAll() {
        return null;
    }

    @Override
    public Basket findOne(Long id) {
        return null;
    }
}
