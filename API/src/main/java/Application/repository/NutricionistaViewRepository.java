package Application.repository;

import Application.datasouce.model.Nutricionista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutricionistaViewRepository extends JpaRepository<Nutricionista, Long> {

}
