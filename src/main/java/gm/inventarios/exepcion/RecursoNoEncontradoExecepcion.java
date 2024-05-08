package gm.inventarios.exepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecursoNoEncontradoExecepcion extends  RuntimeException {
    public RecursoNoEncontradoExecepcion(String mensaje) {
        super(mensaje);
    }
}
