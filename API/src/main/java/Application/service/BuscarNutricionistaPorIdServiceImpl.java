package Application.service;

import Application.datasouce.model.Nutricionista;
import Application.exception.NutricionistaNotFoundException;
import Application.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuscarNutricionistaPorIdServiceImpl {

    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    // Método para buscar nutricionista por ID
    public Nutricionista buscarPorId(Long id) throws NutricionistaNotFoundException {
        return nutricionistaRepository.findById(id).orElseThrow(() ->
                new NutricionistaNotFoundException("Nutricionista não encontrado através do ID: " + id));
    }

    // Método opcional para reutilizar em outras partes do código, renomeado corretamente
    private Optional<Nutricionista> getOptional(Long id) {
        return nutricionistaRepository.findById(id);
    }

    // Método para deletar nutricionista por ID
    public void deletarPorId(Long id) throws NutricionistaNotFoundException {
        Nutricionista nutricionista = getOptional(id).orElseThrow(() ->
                new NutricionistaNotFoundException("Nutricionista não encontrado através do ID: " + id));

        nutricionistaRepository.delete(nutricionista);
    }
}
