package feature.model.ghostbusters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;



class GhostTest {
    
    @Test
    void GhostConstructorTest() {
        int id = 1;
        String name = "Espíritu del Pescador de Lastres";
        String classType = "Clase IV";
        String dangerLevel = "Bajo";
        String specialAbility = "Aparecer durante tormentas en la costa";
    
        Ghost ghost = new Ghost(id, name, classType,dangerLevel, specialAbility);

        assertEquals(id, ghost.getId);
        assertEquals(name, ghost.getName);
        assertEquals(classType, ghost.getClassType);
        assertEquals(classType, ghost.setClassType);
        assertEquals(dangerLevel, ghost.getDangerLevel);
        assertEquals(dangerLevel, ghost.setDangerLevel);
        assertEquals(specialAbility, ghost.getSpecialAbility);
        assertEquals(specialAbility, ghost.setSpecialAbility);
        assertNotNull(ghost.getCaptureDate);
    }




}
