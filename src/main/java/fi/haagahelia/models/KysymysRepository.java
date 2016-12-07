package fi.haagahelia.models;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface KysymysRepository extends CrudRepository<Kysymys, Long> {

  /**
   * This method will find an Kysymys instance in the database by its email.
   * Note that this method is not implemented and its working code will be
   * automacically generated from its signature by Spring Data JPA.
   */
  public List<Kysymys> findAll();

}
