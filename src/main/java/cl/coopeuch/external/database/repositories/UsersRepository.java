package cl.coopeuch.external.database.repositories;

import cl.coopeuch.external.database.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {

}
