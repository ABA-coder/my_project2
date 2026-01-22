import java.sql.*;

public class DatabaseService {
    private final String url = "jdbc:postgresql://localhost:5432/OOP_DB";
    private final String user = "postgres";
    private final String pass = "1234";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }

    public void saveFlight(String flightNumber, String destination, int capacity) {
        String sql = "INSERT INTO flights (flight_number, destination, capacity) VALUES (?, ?, ?) " +
                "ON CONFLICT (flight_number) DO UPDATE SET destination = EXCLUDED.destination, capacity = EXCLUDED.capacity";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, flightNumber);
            pstmt.setString(2, destination);
            pstmt.setInt(3, capacity);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCapacity(String flightNumber, int newCapacity) {
        String sql = "UPDATE flights SET capacity = ? WHERE flight_number = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, newCapacity);
            pstmt.setString(2, flightNumber);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void readFlights() {
        String sql = "SELECT * FROM flights";
        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("DB Record -> Flight: " + rs.getString("flight_number") +
                        ", To: " + rs.getString("destination") +
                        ", Capacity: " + rs.getInt("capacity"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}