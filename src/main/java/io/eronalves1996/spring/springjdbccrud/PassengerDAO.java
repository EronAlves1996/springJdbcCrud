package io.eronalves1996.spring.springjdbccrud;

import java.util.List;

public interface PassengerDAO {
	
	int create(Passenger passenger);
	Passenger readOne(int id);
	List<Passenger> readAll();
}
