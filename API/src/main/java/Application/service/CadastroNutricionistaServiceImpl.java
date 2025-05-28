package Application.service;

import Application.datasouce.model.Nutricionista;
import Application.exception.NutricionistaResouceException;
import Application.resouce.NutricionistaResouce;
import org.springframework.beans.factory.annotation.Autowired;
import Application.repository.NutricionistaRepository;
import org.springframework.stereotype.Service;

@Service
public class CadastroNutricionistaServiceImpl {

    @Autowired //declara o objeto
    private NutricionistaRepository nutricionistaRepository;

    @Autowired
    private NutricionistaConversor service;

    public void cadastro(NutricionistaResouce nutricionistaResouce){

        try {
           Nutricionista nutricionista = service.conversor(nutricionistaResouce);
            nutricionistaRepository.saveAndFlush(nutricionista); //salva o objeto dentro do banco 'SaveAndFlush'
        } catch (NutricionistaResouceException e) {
            e.printStackTrace();
        }
    }
}
