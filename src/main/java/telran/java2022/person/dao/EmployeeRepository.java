package telran.java2022.person.dao;

import java.util.stream.Stream;

import telran.java2022.person.model.Employee;

public interface EmployeeRepository extends BaseRepository<Employee> {
	Stream<Employee> findBySalaryBetween(Integer min, Integer max);
}
