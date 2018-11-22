package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sergei on 18/07/2018.
 */
public interface AuthorRepository  extends CrudRepository<Author, Long>{
}
