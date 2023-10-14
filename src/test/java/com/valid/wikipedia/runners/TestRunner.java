package com.valid.wikipedia;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Ruta de tus archivos .feature
        glue = "com.tu.proyecto.steps", // Paquete que contiene las clases de pasos
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
}