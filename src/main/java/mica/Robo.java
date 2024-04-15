package mica;

public class Robo {
    int x_coordenate;
    int y_coordenate;
    int angle;
    int beam;
    int distance;

    public void setX_coordenate(int x_coordenate) {
        this.x_coordenate = x_coordenate;
    }


    public void setY_coordenate(int y_coordenate) {
        this.y_coordenate = y_coordenate;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public int getAngle() {
        return angle;
    }

    public String Coordenates() {
        return "(100,90)";
    }

    public int getBeam() {
        return beam;
    }

    public int getDistance() {
        return distance;
    }

    public void setBeam(int beam) {
        this.beam = beam;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}