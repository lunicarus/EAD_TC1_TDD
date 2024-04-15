package mica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class MainTest {

    private Robo robotito;
    @BeforeEach
    void SetUp(){
        robotito = new Robo();
    }


    @Test
    @DisplayName("Should Accept valid values of coordinates")
    public void validValuesXandY(){

    robotito.setX_coordenate(100);
    robotito.setY_coordenate(90);
    assertThat(robotito.Coordenates()).isEqualTo("(100,90)");


    }
    @Test
    @DisplayName("should accept valid values for angle")
    public void validValuesForAngle(){
        robotito.setAngle(45);
        assertThat(robotito.getAngle()).isEqualTo(45);
    }
    @Test
    @DisplayName("should accept valid values for beam")
    public void validValuesForBeam(){
        robotito.setBeam(100);
        assertThat(robotito.getBeam()).isEqualTo(100);
    }
}