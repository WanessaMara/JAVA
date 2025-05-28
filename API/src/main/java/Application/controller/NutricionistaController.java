package Application.controller;

import Application.datasouce.model.Nutricionista;
import Application.exception.NutricionistaNotFoundException;
import Application.resouce.NutricionistaResouce;
import Application.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Application.repository.NutricionistaRepository;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class NutricionistaController { //buscar id nutricionista

    @Autowired
    private BuscarNutricionistasServiceImpl serviceBuscar;

    @Autowired
    private CadastroNutricionistaServiceImpl serviceCadastro;

    @Autowired
    private BuscarNutricionistaPorIdServiceImpl serviceBuscarPorId;

    @Autowired
    private AlterarNutricionista serviceAlterarNutricionista;

    @Autowired
    private NutricionistaViewService nutricionistaViewService;

    @GetMapping(path = "/nutricionistas/view")
    public List<Nutricionista> listaNutricionistas(){
        return nutricionistaViewService.listarNutricionistas();
    }

    @GetMapping(path = "/nutricionistas") // buscar todos os nutricionistas cadastrados
    public List<Nutricionista> buscarNutricionista(){
        return serviceBuscar.buscarTodosOsNutricionistas();
    }

    @GetMapping(path = "/nutricionista/id/{id}") // bucar um unico id de nutricionista
    public Nutricionista buscarNutricionistaPorId(@PathVariable(name = "id", required = true) Long id ) throws NutricionistaNotFoundException {
        return serviceBuscarPorId.buscarPorId(id);
    }

    @PutMapping(path = "/nutricionista/alterar/{id}") // alterar nutricionista
    public ResponseEntity<Nutricionista> atualizarNutricionista(@PathVariable("id") Long id, @RequestBody Nutricionista nutricionista){
        Optional<Nutricionista> nutricionistaAtualizado = serviceAlterarNutricionista.atualizarNutricionista(id, nutricionista);
        return nutricionistaAtualizado.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/nutricionista/save") // add novo nutricionista
    public void salvarNutricinista(@RequestBody NutricionistaResouce nutricionista){
        serviceCadastro.cadastro(nutricionista);
    }

    @DeleteMapping(path = "/nutricionista/delete/{id}") //deletar id do nutricionista
    public void deletarNutricionista(@PathVariable(name = "id", required = true) Long id) throws NutricionistaNotFoundException {
        serviceBuscarPorId.deletarPorId(id);
    }


}
