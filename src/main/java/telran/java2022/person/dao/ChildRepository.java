package telran.java2022.person.dao;

import java.util.stream.Stream;

import telran.java2022.person.model.Child;

public interface ChildRepository extends BaseRepository<Child> {
	Stream<Child> getByKindergartenNotNull();

}
