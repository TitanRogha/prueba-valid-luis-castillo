package com.valid.wikipedia.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearCuenta
{
    public static final Target INPUT_USUARIO = Target.the("Input 'Usuario en Crear Cuenta'")
            .located(By.id("wpName2"));
    public static final Target INPUT_CONTRASEÑA = Target.the("Input 'Contraseña en Crear Cuenta'")
            .located(By.id("wpPassword2"));

    public static final Target INPUT_CONFIRMAR_CONTRASEÑA = Target.the("Input 'Confirmar Contraseña en Crear Cuenta'")
            .located(By.id("wpRetype"));

    public static final Target INPUT_CONFIRMAR_CONTRASEÑA = Target.the("Input 'Confirmar Contraseña en Crear Cuenta'")
            .located(By.id("wpRetype"));
}
