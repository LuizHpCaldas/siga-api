package com.siga.siga.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import com.siga.siga.dto.ResumoDTO;

@Path("/resumos")
public class ResumoEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ResumoDTO> obterResumos() {
        // Aqui você pode obter os resumos do seu banco de dados ou de alguma fonte de dados
        // Por simplicidade, vamos criar alguns resumos fictícios

        List<ResumoDTO> resumos = new ArrayList<>();
        resumos.add(new ResumoDTO(1L, "Resumo 1", "Valor 1"));
        resumos.add(new ResumoDTO(2L, "Resumo 2", "Valor 2"));
        resumos.add(new ResumoDTO(3L, "Resumo 3", "Valor 3"));

        return resumos;
    }
}