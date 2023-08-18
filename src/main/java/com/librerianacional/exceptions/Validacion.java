package com.librerianacional.exceptions;

import com.librerianacional.pages.AgregarLibroPages;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class Validacion {
    AgregarLibroPages agregarLibroPages = new AgregarLibroPages();

    @Step
    public void validar() {

        String precioTotal = agregarLibroPages.getDriver().findElement(agregarLibroPages.getLblPrecioTotal()).getText();
        String cantidad = agregarLibroPages.getDriver().findElement(agregarLibroPages.getLblCantidad()).getText();
        Assert.assertEquals("2", cantidad);
        Assert.assertEquals("$120,000", precioTotal);
    }
}
