package com.librerianacional.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaPrincipalPages extends PageObject {

    By btnMiCuenta = By.xpath("(//button[@id='dropdownMenuLogin'])[2]");
    By btnRegistro = By.xpath("(//a[contains(text(),'Registrarme')])[2]");

    public By getBtnMiCuenta() {
        return btnMiCuenta;
    }

    public By getBtnRegistro() {
        return btnRegistro;
    }
}
