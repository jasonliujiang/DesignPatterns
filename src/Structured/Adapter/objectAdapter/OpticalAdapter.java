package Structured.Adapter.objectAdapter;

public class OpticalAdapter implements Motor{

    private OpticalMotor omotor;
    public OpticalAdapter(){
        omotor = new OpticalMotor();
    }

    @Override
    public void drive() {
        omotor.opticalDrive();
    }
}
