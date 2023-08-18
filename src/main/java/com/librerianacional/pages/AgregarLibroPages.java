package com.librerianacional.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AgregarLibroPages extends PageObject {

    By txtBucar = By.xpath("(//form/div/input[@type='text'])[2]");
    By imgPortada = By.xpath("//a[@class='d-block w-100 h-100']");
    By btnAgregarCarrito = By.xpath("//span[contains(text(),'Agregar al carrito')]");
    By ventanaEmergente = By.xpath("//div[@class='sidebar-add2cart-modal sidebar-add2cart-modal-open']");
    By btnCarrito = By.xpath("//a[@class=\"row h-100\"]");
    By btnMas = By.xpath("//button[@data-dir='up']");
    By btnContinuarCompra = By.xpath("//a[contains(text(),'Continuar con la compra')]");
    By lblPrecioTotal = By.xpath("(//span[contains(text(),'$120,000')])[2]");
    By lblCantidad = By.xpath("//span[.=' 2']");
    public By getTxtBucar() {
        return txtBucar;
    }
    public By getImgPortada() {
        return imgPortada;
    }

    public By getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }

    public By getVentanaEmergente() {
        return ventanaEmergente;
    }

    public By getBtnCarrito() {
        return btnCarrito;
    }

    public By getBtnMas() {
        return btnMas;
    }

    public By getBtnContinuarCompra() {
        return btnContinuarCompra;
    }

    public By getLblPrecioTotal() {
        return lblPrecioTotal;
    }

    public By getLblCantidad() {
        return lblCantidad;
    }
}
