package Application.service;


import Application.datasouce.model.Nutricionista;
import Application.exception.NutricionistaResouceException;
import Application.resouce.NutricionistaResouce;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class NutricionistaConversor {
    public Nutricionista conversor(NutricionistaResouce nutricionistaResouce) throws NutricionistaResouceException {

        try{
            Nutricionista nutricionista = new Nutricionista();

            Long idPaciente = checkIdPaciente(nutricionistaResouce.getIdPaciente());
            LocalDate idade = checkIdade(nutricionistaResouce.getIdade());

            nutricionista.setIdPaciente(idPaciente);
            nutricionista.setIdade(idade);
            nutricionista.setCodigoRegistro(nutricionistaResouce.getCodidoRegistro());
            nutricionista.setNome(nutricionistaResouce.getNome());

            return nutricionista;


        } catch (Exception e) {
            throw new NutricionistaResouceException(
                    "Falha ao converser o resouce para entidade, resouce: " + nutricionistaResouce);
        }
    }

    private long checkIdPaciente(String idPaciente){
        return Long.parseLong(idPaciente);
    }

    private LocalDate checkIdade(LocalDate idade){
        return idade;
    }

}
