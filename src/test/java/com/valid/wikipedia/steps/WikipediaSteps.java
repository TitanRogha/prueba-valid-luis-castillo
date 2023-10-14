package com.valid.wikipedia.steps;

import com.valid.wikipedia.tasks.AbrirLaPagina;
import com.valid.wikipedia.tasks.ValidarTitulo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class WikipediaSteps {

    @Managed
    private WebDriver navegador;
    private Actor usuario = Actor.named("Usuario");

    @Dado("que el usuario abre la página de Wikipedia")
    public void queElUsuarioAbreLaPaginaDeWikipedia() {
        usuario.can(BrowseTheWeb.with(navegador));
        usuario.attemptsTo(AbrirLaPagina.en("https://es.wikipedia.org/wiki/Wikipedia:Portada"));
    }

    @Cuando("el usuario valida el título en el home")
    public void elUsuarioValidaElTituloEnElHome() {
        usuario.should(seeThat(ValidarTitulo.enLaPaginaPrincipal()));
    }

    @Entonces("el usuario debería ver el título 'Bienvenidos a Wikipedia'")
    public void elUsuarioDeberiaVerElTituloBienvenidosAWikipedia() {
        // Esto se maneja con la validación en el paso anterior
    }
}