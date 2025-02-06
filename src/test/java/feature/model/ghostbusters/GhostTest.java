package feature.model.ghostbusters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;



class GhostTest {
    
    @Test
    void GhostConstructorGettersTest() {
        int id = 1;
        String name = "Espíritu del Pescador de Lastres";
        String classType = "Clase IV";
        String dangerLevel = "Bajo";
        String specialAbility = "Aparecer durante tormentas en la costa";
    
        Ghost ghost = new Ghost(id, name, classType,dangerLevel, specialAbility, LocalDateTime.now());

        assertEquals(id, ghost.getId());
        assertEquals(name, ghost.getName());
        assertEquals(classType, ghost.getClassType());
        assertEquals(dangerLevel, ghost.getDangerLevel());
        assertEquals(specialAbility, ghost.getSpecialAbility());
        assertNotNull(ghost.getCaptureDate());
    }

    @Test
    void GhostSettersTest() {

        Ghost ghost = new Ghost(
            1, 
            "Espíritu del Pescador",
            "Clase IV",
            "Bajo",
            "Aparecer durante tormentas en la costa",
            LocalDateTime.now());
        
        ghost.setClassType("Clase V");
        ghost.setDangerLevel("Alto");
        ghost.setSpecialAbility("Habilidad");

        assertEquals("Clase V", ghost.getClassType());
        assertEquals("Alto", ghost.getDangerLevel());
        assertEquals("Habilidad", ghost.getSpecialAbility());
    }


}
