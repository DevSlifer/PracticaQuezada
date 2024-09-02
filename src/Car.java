public class Car extends Vehicle
{
    private int DoorNumber;

    public Car()
    {
        super();
        this.DoorNumber = checkInt(DoorNumber, "Door Number" , 1);
    }

}
