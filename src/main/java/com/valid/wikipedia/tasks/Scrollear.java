package com.valid.wikipedia.tasks;

import com.valid.wikipedia.config.BaseConfig;
import com.valid.wikipedia.ui.PaginaSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.JavaScript;
import org.openqa.selenium.WebElement;


public class Scroll extends BaseConfig implements Task {

    private String elemento;

    public Scroll(String elemento) {
        this.elemento = elemento;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        explicitWait(PaginaSistema.ANALISIS_CEEM.resolveFor(actor));
        WebElement element = PaginaSistema.ANALISIS_CEEM.resolveFor(actor);

        if(!element.isDisplayed()){
            JavaScript.executeScript("arguments[0].scrollIntoView(true);", elemento).executeWithActor(actor);
        }
        }

    public static Scroll scrollyBusqueda (String elemento) {
        return new Scroll(elemento);
    }

}
