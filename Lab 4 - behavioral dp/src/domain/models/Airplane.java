package domain.models;

public class Airplane implements FlyingVehicle {
    public int id;
    public boolean inAir;

    public Airplane(int id) {
        this.id = id;
    }

    @Override
    public void SwitchMedium() {
        inAir = !inAir;
        if (inAir) {
            System.out.println("Airplane with id: " + id + "took off");
        } else {
            System.out.println("Airplane with id: " + id + "landed");
        }
    }

}
