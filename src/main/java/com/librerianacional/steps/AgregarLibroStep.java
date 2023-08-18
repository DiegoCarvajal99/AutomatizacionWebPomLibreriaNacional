package com.librerianacional.steps;

import com.librerianacional.pages.AgregarLibroPages;
import com.librerianacional.utils.Esperas;
import com.librerianacional.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class AgregarLibroStep {

    AgregarLibroPages agregarLibroPages = new AgregarLibroPages();
    Esperas esperas = new Esperas();

    Excel excel = new Excel();
    @Step
    public void escribir(By localizador, String texto) {
        agregarLibroPages.getDriver().findElement(localizador).sendKeys(texto);
    }

    public void hover (By Localizador){
        Actions acciones = new Actions(agregarLibroPages.getDriver());
        acciones.moveToElement(agregarLibroPages.getDriver().findElement(Localizador)).build().perform();

    }

    @Step
    public void click(By localizador) {
        agregarLibroPages.getDriver().findElement(localizador).click();
    }
    public void enter(By localizador) {
        agregarLibroPages.getDriver().findElement(localizador).sendKeys(Keys.ENTER);
    }

     @Step
    public void ocultarElemento( ) {
        // se utiliza la funcion javaExcutor para poder implementar codigo javaScript y asi poder ocultar el elemento

        ( (JavascriptExecutor) agregarLibroPages.getDriver() ).executeScript( "arguments[0].style.visibility='hidden';", agregarLibroPages.getDriver().findElement( agregarLibroPages.getVentanaEmergente() ) );

    }

    public void agregarLibroCarrito() throws IOException {
        escribir(agregarLibroPages.getTxtBucar(),excel.leerDatosExcel("Data.xlsx","Busqueda",1,0));
        enter(agregarLibroPages.getTxtBucar());
        hover(agregarLibroPages.getImgPortada());
        click(agregarLibroPages.getBtnAgregarCarrito());
        ocultarElemento();
        esperas.esperaExplicitaClick(agregarLibroPages.getDriver(),agregarLibroPages.getBtnCarrito());
        click(agregarLibroPages.getBtnCarrito());
        esperas.esperaExplicitaClick(agregarLibroPages.getDriver(),agregarLibroPages.getBtnMas());
        click(agregarLibroPages.getBtnMas());
        esperas.esperaExplicitaClick(agregarLibroPages.getDriver(),agregarLibroPages.getBtnContinuarCompra());
        click(agregarLibroPages.getBtnContinuarCompra());
    }
}
