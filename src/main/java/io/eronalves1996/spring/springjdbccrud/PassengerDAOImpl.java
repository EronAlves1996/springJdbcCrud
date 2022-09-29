package io.eronalves1996.spring.springjdbccrud;

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

}
