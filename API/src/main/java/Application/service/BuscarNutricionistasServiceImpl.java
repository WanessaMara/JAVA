package Application.service;

import Application.datasouce.model.Nutricionista;
import Application.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscarNutricionistasServiceImpl {

    @Autowired
    private NutricionistaRepository nutricionistaRepository;


    public List<Nutricionista> buscarTodosOsNutricionistas(){
        List<Nutricionista> listNustrcionistas = nutricionistaRepository.findAll();
        return listNustrcionistas;
    }
}
