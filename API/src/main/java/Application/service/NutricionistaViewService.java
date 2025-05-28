package Application.service;

import Application.datasouce.model.Nutricionista;
import Application.repository.NutricionistaViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutricionistaViewService {

    @Autowired
    private NutricionistaViewRepository nutricionistaViewRepository;

    public List<Nutricionista> listarNutricionistas() {
        return nutricionistaViewRepository.findAll();
    }

}
