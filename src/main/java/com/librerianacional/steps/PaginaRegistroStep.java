package com.librerianacional.steps;

import com.librerianacional.pages.PaginaRegistroPages;
import com.librerianacional.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;

public class PaginaRegistroStep {
    PaginaRegistroPages paginaRegistroPages = new PaginaRegistroPages();
    Excel excel = new Excel();


    @Step
    public void escribir(By localizador, String texto) {
        paginaRegistroPages.getDriver().findElement(localizador).sendKeys(texto);
    }

    @Step
    public void elementoDisponible(By Localizaddor){
        Assert.assertThat(paginaRegistroPages.getDriver().findElement(Localizaddor).isDisplayed(), Matchers.is(true));

    }

    @Step
    public void click(By localizador) {
        paginaRegistroPages.getDriver().findElement(localizador).click();
    }

    public void resgistrarUsuario() throws IOException {
        elementoDisponible(paginaRegistroPages.getLblRegistrarse());
        escribir(paginaRegistroPages.getTxtCorreo(),excel.leerDatosExcel("Data.xlsx","Datos",1,0));
        escribir(paginaRegistroPages.getTxtNombre(),excel.leerDatosExcel("Data.xlsx","Datos",1,1));
        escribir(paginaRegistroPages.getTxtApellido(),excel.leerDatosExcel("Data.xlsx","Datos",1,2));
        click(paginaRegistroPages.getBtnDocumento());
        click(paginaRegistroPages.getLstDocuemnto());
        escribir(paginaRegistroPages.getTxtNumeroDocumento(),excel.leerDatosExcel("Data.xlsx","Datos",1,3));
        escribir(paginaRegistroPages.getTxtTelefonoMovil(),excel.leerDatosExcel("Data.xlsx","Datos",1,4));
        escribir(paginaRegistroPages.getTxtContrasena(),excel.leerDatosExcel("Data.xlsx","Datos",1,5));
        escribir(paginaRegistroPages.getTxtConfirmarContrasena(),excel.leerDatosExcel("Data.xlsx","Datos",1,6));
        click(paginaRegistroPages.getCkcTerminosCondiciones());
        click(paginaRegistroPages.getBtnResgistrarme());
        elementoDisponible(paginaRegistroPages.getLblMensajebienvenida());
    }
}
