package mica;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class MainTest {

    @Test
    @DisplayName("Should Accept valid values of coordinates")
    public void ValidValuesForXandY(){
    Robo robotito = new Robo();
    robotito.setX_coordenate(100);
    robotito.setY_coordenate(90);
    assertThat(robotito.Coordenates()).isEqualTo("(100,90)");


    }
}