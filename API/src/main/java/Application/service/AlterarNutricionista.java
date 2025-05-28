package Application.service;

import Application.datasouce.model.Nutricionista;
import Application.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlterarNutricionista {

    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    public Optional<Nutricionista> atualizarNutricionista(Long id, Nutricionista nutricionistaAtualizado){
        return nutricionistaRepository.findById(id).map(nutricionistaExistente -> {
            nutricionistaExistente.setIdPaciente(nutricionistaAtualizado.getIdPaciente());
            nutricionistaExistente.setIdade(nutricionistaAtualizado.getIdade());
            nutricionistaExistente.setNome(nutricionistaAtualizado.getNome());
            nutricionistaExistente.setCodigoRegistro(nutricionistaAtualizado.getCodigoRegistro());
            return nutricionistaRepository.save(nutricionistaExistente);
        });
    }
}
