package Application.repository;

import Application.datasouce.model.Nutricionista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// interface para o banco, na interface retornará os dados
@Repository
public interface NutricionistaRepository extends JpaRepository<Nutricionista, Long> {

}
