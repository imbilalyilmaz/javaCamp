package Abstracts;

import java.time.LocalDate;

import Entities.Gamer;

public interface GamerService {
	void add(Gamer gamer);
	void update(Gamer gamer, String firstName, String lastName, LocalDate dateOfBirth);
	void delete(Gamer gamer);
}
