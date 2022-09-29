package io.eronalves1996.spring.springjdbccrud;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PassengerRowMapper implements RowMapper<Passenger> {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Passenger(rs.getInt(1), rs.getString(2), rs.getString(3));
	}

}
