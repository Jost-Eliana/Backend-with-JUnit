package presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    public void controlAltaGrupo(){
        //Dado
        Persona juan = new Persona("Juan",19);
        Persona pedro = new Persona("Pedro",20);
        Persona ana = new Persona("Ana",25);
        Persona luz = new Persona("Luz",30);
        Persona julian = new Persona("Julián",35);
        Grupo grupo = new Grupo();
        //Cuando
        grupo.agregarPersona(juan);
        grupo.agregarPersona(pedro);
        grupo.agregarPersona(ana);
        grupo.agregarPersona(luz);
        grupo.agregarPersona(julian);
        //Entonces
        Assertions.assertTrue(grupo.getPersonasEnElGrupo()==2);
    }
}