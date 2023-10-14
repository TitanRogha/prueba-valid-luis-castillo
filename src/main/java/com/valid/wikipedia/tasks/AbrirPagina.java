package com.valid.wikipedia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirLaPagina implements Task {

    private String url;

    public AbrirLaPagina(String url) {
        this.url = url;
    }

    @Override
    @Step("{0} abre la página de Wikipedia en la URL '#url'")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }

    public static AbrirLaPagina en(String url) {
        return instrumented(AbrirLaPagina.class, url);
    }
}
