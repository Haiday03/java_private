package dao;

import model.Restaurant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RestaurantDAO {
	
	public void add(Restaurant nh) throws SQLException {
		String sql = "INSERT INTO Restaurant VALUES(? , ? , ? , ? , ? )";
		
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		preparedStatement.setString(1, nh.getRestaurantId());
		preparedStatement.setString(2 , nh.getName());
		preparedStatement.setInt(3 , nh.getPhoneNumber());
		preparedStatement.setInt(4, nh.gettNTT());
		preparedStatement.setInt(5, nh.gettNTN());
//		preparedStatement.setString(6 , nh.getUsername());
		preparedStatement.executeUpdate();
	}
	
	public void update(String id,String name,int phoneNumber) throws SQLException {
		String sql = "UPDATE Restaurant SET name = ? , phoneNumber = ? WHERE restaurantId = ?";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		
		preparedStatement.setString(1 , name);
		preparedStatement.setInt(2 , phoneNumber);
		preparedStatement.setString(3 , id);
		preparedStatement.executeUpdate();
	}
	
	public void deleteById(String restaurantId) {
		
		try {
			String sql = "DELETE FROM Restaurant WHERE restaurantId = ?";
			PreparedStatement preparedStatement;
			preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
			preparedStatement.setString(1 , restaurantId);
			preparedStatement.executeUpdate();
		}catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	//tim kiem nha hang theo ten
	public Restaurant findByName(String name) throws SQLException{
		String sql = "SELECT * FROM Restaurant WHERE name = ?";
		
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
	    preparedStatement.setString(1, name);
		ResultSet  resultSet = preparedStatement.executeQuery();
		Restaurant n = new Restaurant();
		while (resultSet.next()) {
			n.setName(resultSet.getString("name"));
		    n.setRestaurantId(resultSet.getString("restaurantId"));
		    n.setPhoneNumber(resultSet.getInt("phoneNumber"));
		    n.settNTT(resultSet.getInt("tNTT"));
		    n.settNTN(resultSet.getInt("tNTN"));
		 //   n.setUsername(resultSet.getString("username"));
		    return n;
		}
		return null;
	}
	//xoa theo ten cua nha hang
	public void deleteByName(String name) {
		
		try {
			String sql = "DELETE FROM Restaurant WHERE name = ?";
			PreparedStatement preparedStatement;
			preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
			preparedStatement.setString(1 , name);
			preparedStatement.executeUpdate();
		}catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public List<Restaurant> findAll() throws SQLException{
		List<Restaurant> listNh = new ArrayList<>();
		
		String sql = "SELECT * FROM Restaurant";
		
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		ResultSet  resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			Restaurant n = new Restaurant();
			n.setName(resultSet.getString("name"));
		    n.setRestaurantId(resultSet.getString("restaurantId"));
		    n.setPhoneNumber(resultSet.getInt("phoneNumber"));
		    n.settNTT(resultSet.getInt("tNTT"));
		    n.settNTN(resultSet.getInt("tNTN"));
		  //  n.setUsername(resultSet.getString("username"));
		    listNh.add(n);
		}
		return listNh;
	}
//	  public static String getName() {
//		    try {
//		      String sql = "SELECT name FROM Resutaurant WHERE " +
//		          "username = ?";
//		      PreparedStatement statement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
//
//		      statement.setString(1, username);
//		      ResultSet resultSet = statement.executeQuery();
//		      while (resultSet.next()) {
//		        return resultSet.getString("name");
//		      }
//		    } catch (SQLException throwables) {
//		      throwables.printStackTrace();
//		    }
//		    return null;
//		  }
		public Restaurant find(String restaurantId) throws SQLException{
			String sql = "SELECT * FROM Restaurant WHERE restaurantId = ?";
			
			PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		    preparedStatement.setString(1, restaurantId);
			ResultSet  resultSet = preparedStatement.executeQuery();
			Restaurant n = new Restaurant();
			while (resultSet.next()) {
				n.setName(resultSet.getString("name"));
			    n.setRestaurantId(resultSet.getString("restaurantId"));
			    n.setPhoneNumber(resultSet.getInt("phoneNumber"));
			    n.settNTT(resultSet.getInt("tNTT"));
			    n.settNTN(resultSet.getInt("tNTN"));
			 //   n.setUsername(resultSet.getString("username"));
			    return n;
			}
			return null;
		}
	  
}
