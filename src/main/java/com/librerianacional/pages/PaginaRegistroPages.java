package com.librerianacional.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaRegistroPages extends PageObject {
    By lblRegistrarse = By.xpath("//div[contains(text(),'Registrarse')]");
    By txtCorreo = By.id("email");
    By txtNombre = By.id("nombres");
    By txtApellido = By.id("apellidos");
    By btnDocumento = By.name("tipo_identificacion");
    By lstDocuemnto = By.xpath("//select/option[@value='CC']");
    By txtNumeroDocumento = By.id("identificacion");
    By txtTelefonoMovil = By.id("telefono_movil");
    By txtTelefono = By.id("telefono");
    By txtContrasena = By.id("contrasena");
    By txtConfirmarContrasena = By.id("repeatContrasena");
    By ckcTerminosCondiciones = By.id("terminosCondiciones");
    By btnResgistrarme = By.xpath("//button[contains(text(),'Registrarme')]");
    By lblMensajebienvenida = By.xpath("//div/div[@class='col-12 px-0 text--normal text--xm text--lh-normal text--blue']");
    public By getLblRegistrarse() {
        return lblRegistrarse;
    }

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getBtnDocumento() {
        return btnDocumento;
    }

    public By getLstDocuemnto() {
        return lstDocuemnto;
    }

    public By getTxtNumeroDocumento() {
        return txtNumeroDocumento;
    }

    public By getTxtTelefonoMovil() {
        return txtTelefonoMovil;
    }

    public By getTxtTelefono() {
        return txtTelefono;
    }

    public By getTxtContrasena() {
        return txtContrasena;
    }

    public By getTxtConfirmarContrasena() {
        return txtConfirmarContrasena;
    }

    public By getCkcTerminosCondiciones() {
        return ckcTerminosCondiciones;
    }

    public By getBtnResgistrarme() {
        return btnResgistrarme;
    }

    public By getLblMensajebienvenida() {
        return lblMensajebienvenida;
    }
}
