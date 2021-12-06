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

    public void addPlayer(Post post) {
        try {
            final PreparedStatement statement =
                    connection.prepareStatement(
                            "INSERT INTO schema1.players (player, day, steps) VALUES (?, ?, ?);");
            statement.setString(1, post.getPlayer());
            statement.setInt(2, post.getDay());
            statement.setInt(3, post.getSteps());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean deletePlayer(int id) {
        try {
            final PreparedStatement statement =
                    connection.prepareStatement(
                            "DELETE FROM schema1.players WHERE id = ?");
            statement.setInt(1, id);
            final int modCount= statement.executeUpdate();
            if (modCount > 0) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Post> getAllPlayers() {
        try {
            List<Post> result = new ArrayList<>();
            final Statement statement = connection.createStatement();
            final ResultSet resultSet = statement.executeQuery("select * from schema1.players");
            while (resultSet.next()) {
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
