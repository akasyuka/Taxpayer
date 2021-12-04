package ru.learnup.javaqa.taxpayer.HW24;

import ru.learnup.javaqa.taxpayer.HW24.entities.Post;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbHelper {

    private Connection connection;

    public DbHelper(String dbUrl, String username, String password) {
        try {
            this.connection = DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Post> getAllPlayers() {
        try {
            List<Post> result = new ArrayList<>();
            final Statement statement = connection.createStatement();
            final ResultSet resultSet = statement.executeQuery("select * from players");
            while (resultSet.next()){
                final int id = resultSet.getInt("id");
                final String player = resultSet.getString("player");
                final int day = resultSet.getInt("day");
                final int steps = resultSet.getInt("steps");
                result.add(
                        new Post(id, player, day, steps));
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
