package com.librerianacional.steps;

import com.librerianacional.pages.PaginaPrincipalPages;
import com.librerianacional.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.io.IOException;

public class PaginaPrincipalStep {

    PaginaPrincipalPages paginaPrincipalPages = new PaginaPrincipalPages();
    Excel excel = new Excel();
    @Step
    public void click(By localizador) {
        paginaPrincipalPages.getDriver().findElement(localizador).click();
    }
    @Step
    public void abrirNavegador() throws IOException {
        paginaPrincipalPages.openUrl(excel.leerDatosExcel("Data.xlsx","Dominios",1,0));
    }


    public void irPaginaregistro(){
        click(paginaPrincipalPages.getBtnMiCuenta());
        click(paginaPrincipalPages.getBtnRegistro());

    }
}
