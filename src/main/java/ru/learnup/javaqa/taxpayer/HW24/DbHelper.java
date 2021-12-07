package ru.learnup.javaqa.taxpayer.HW24;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import ru.learnup.javaqa.taxpayer.HW24.entities.Post;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbHelper {

    private final SessionFactory sessionFactory;

    public DbHelper() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        final Metadata  metadata = new MetadataSources(registry).getMetadataBuilder().build();
        this.sessionFactory = metadata.getSessionFactoryBuilder().build();
    }

    public void addPlayer(Post post) {
        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(post);
            transaction.commit();
        }
    }
//
//    public boolean deletePlayer(int id) {
//        try {
//            final PreparedStatement statement =
//                    connection.prepareStatement(
//                            "DELETE FROM schema1.players WHERE id = ?");
//            statement.setInt(1, id);
//            final int modCount= statement.executeUpdate();
//            if (modCount > 0) {
//                return true;
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }

    public List<Post> getAllPlayers() {
        try (Session session = sessionFactory.openSession()) {
            final Query<Post> result = session.createQuery("from Post", Post.class);
            return result.getResultList();
        }
    }
}
