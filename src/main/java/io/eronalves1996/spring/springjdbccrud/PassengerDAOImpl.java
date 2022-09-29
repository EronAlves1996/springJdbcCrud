package io.eronalves1996.spring.springjdbccrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PassengerDAOImpl implements PassengerDAO {

	@Autowired
	private JdbcTemplate jdbcTempl;
	
	@Override
	public int create(Passenger passenger) {
		String sql = "INSERT INTO Passengers (?, ?, ?)";
		return jdbcTempl.update(sql, passenger.getId(), passenger.getFirstName(), passenger.getLastName());
	}

	@Override
	public Passenger readOne(int id) {
		String sql = "SELECT * from Passengers WHERE id=?";
		return jdbcTempl.queryForObject(sql, new PassengerRowMapper(), id);
	}

	@Override
	public List<Passenger> readAll() {
		String sql = "SELECT * From Passengers";
		return jdbcTempl.query(sql, new PassengerRowMapper());
	}

	@Override
	public int update(Passenger passenger) {
		String sql = "UPDATE Passengers SET first_name=?, last_name=? WHERE id=?";
		return jdbcTempl.update(sql, passenger.getFirstName(), passenger.getLastName(), passenger.getId());
	}

	@Override
	public int delete(int id) {
		String sql = "DELETE FROM Passengers WHERE id=?";
		return jdbcTempl.update(sql, id);
	}

}
