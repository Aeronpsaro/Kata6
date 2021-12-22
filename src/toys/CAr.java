package toys;

public class Car {
    private final Integer serialNumber;
    private final String type = "car";

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }
    
    public void pack() {
        System.out.printf("Packing '%s' '%d'\n", this.type, this.serialNumber);
    }
    
    public void label() {
        System.out.printf("Labelling '%s '%d'\n", this.type, this.serialNumber);
    }
}
