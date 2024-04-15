package mica;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class MainTest {

    private Robo robotito;
    private SoftAssertions softly;
    @BeforeEach
    void SetUp(){
        robotito = new Robo();
        softly = new SoftAssertions();
    }


    @Test
    @DisplayName("Should Accept valid values of coordinates")
    public void validCoordinates(){

    robotito.setX_coordenate(100);
    robotito.setY_coordenate(90);
    softly.assertThat(robotito.Coordenates()).isEqualTo("(100,90)");

    robotito.setX_coordenate(15);
    robotito.setY_coordenate(10);
    softly.assertThat(robotito.Coordenates()).isEqualTo("(15,10)");

    softly.assertAll();
    }

    @Test
    @DisplayName("should accept valid values for angle")
    public void validValuesForAngle(){
        robotito.setAngle(45);
        assertThat(robotito.getAngle()).isEqualTo(45);

    }
    @Test
    @DisplayName("should throw error for invalid angle values")
    public void invalidValuesForAngle() {
        softly.assertThatThrownBy(() -> robotito.setAngle(-10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Erro");
        softly.assertThatThrownBy(() -> robotito.setAngle(361))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Erro");
    }
    @Test
    @DisplayName("should accept valid values for beam")
    public void validValuesForBeam(){
        robotito.setBeam(100);
        assertThat(robotito.getBeam()).isEqualTo(100);
    }
    @Test
    @DisplayName("should throw error for invalid angle values")
    public void invalidValuesForBeam() {
        assertThatThrownBy(() -> robotito.setBeam(-10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Erro");

    }
    @Test
    @DisplayName("should accept valid values for Distance")
    public void validValuesForDistance(){
        robotito.setDistance(1);
        assertThat(robotito.getDistance()).isEqualTo(1);
    }
}