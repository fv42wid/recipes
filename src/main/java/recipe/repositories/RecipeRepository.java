package recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
