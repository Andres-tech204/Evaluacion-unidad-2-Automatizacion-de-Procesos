package cl.iplacex.mi_proyecto;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;


public class LoginSteps {
    
    @Dado("estoy en la pagina de login")
    public void estoy_en_la_pagina_de_login() {
        System.out.println(">> GIVEN: Estoy en la pagina de login");
    }

    @Cuando("ingreso el usuario {string} y la contrasena {string}")
    public void ingreso_el_usuario_y_la_contrasena(String usuario, String password) {
        System.out.println(">> WHEN: Ingresando usuario: " + usuario + ", pass " + password);

        if (usuario.equals("andres") && password.equals("pass123")) {

        } else {

        }
    }

    @Entonces("deberia ser redirigido a mi {string}")
    public void deberia_ser_redirigido_a_mi(String nombrePagina) {
        System.out.println(">> THEN: Redirigido a " + nombrePagina);
    }

    @Entonces("deberia ver el mensaje de error {string}")
    public void deberia_ver_el_mensaje_de_error(String mensaje) {
        System.out.println(">> THEN: Verificando mensaje de error: " + mensaje);
    }
}
