package com.librerianacional.stepDefinitions;

import com.librerianacional.exceptions.Validacion;
import com.librerianacional.steps.AgregarLibroStep;
import com.librerianacional.steps.PaginaPrincipalStep;
import com.librerianacional.steps.PaginaRegistroStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class RegistroStepDefinition {

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;
    @Steps
    PaginaRegistroStep paginaRegistroStep;
    @Steps
    AgregarLibroStep agregarLibroStep;
    @Steps
    Validacion validacion;
    @Dado("^que el usuario se encuentre en la pagina principal de la libreria nacional$")
    public void queElUsuarioSeEncuentreEnLaPaginaPrincipalDeLaLibreriaNacional() throws IOException {
        paginaPrincipalStep.abrirNavegador();
    }


    @Cuando("^ingrese la informacion del formulario de registro$")
    public void ingreseLaInformacionDelFormularioDeRegistro() throws IOException {
        paginaPrincipalStep.irPaginaregistro();
        paginaRegistroStep.resgistrarUsuario();
    }

    @Cuando("^agrega un libro al carrito$")
    public void agregaUnLibroAlCarrito() throws IOException {
        agregarLibroStep.agregarLibroCarrito();
    }


    @Entonces("^se valida que la cantidad y el precio sean los correctos$")
    public void seValidaQueLaCantidadYElPrecioSeanLosCorrectos() {
    validacion.validar();
    }

}
