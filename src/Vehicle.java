public class Vehicle
{
    //Class Fields
    private String brand;
    private String model;
    private String color;
    private int speed;
    private int year;

    //Getters and setters for those fields
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = checkString(brand , "Brand");
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = checkString(model , "Model");
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = checkString(color , "Color");
    }

    public int getSpeed()
    {
        return speed;
    }
    public void setSpeed(int speed)
    {
        this.speed = checkInt(speed, "Speed", 1);
    }
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year = checkInt(year, "Year" , 1900);
    }

    //Constructor
    public Vehicle(String brand, String model ,String color , int speed, int year) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSpeed(speed);
        setYear(year);
    }
    //Parameterless Constructor
    public Vehicle() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.color = "Unknown";
        this.speed = 0;
        this.year = 1886;  // Example minimum year for cars
    }

    //Methods to validate
    protected int checkInt(int value, String FieldName, int MinValue)
    {
        if(value< MinValue)
        {
            System.out.println(FieldName + " Is invalid the minimum value is " + MinValue);
            return MinValue;
        }
        return value;
    }

    protected String checkString(String value , String FieldName)
    {
        if(value.isEmpty())
        {
            System.out.println(FieldName + " Cannot be empty");
            return "Unknown";
        }
        return value;
    }
    protected void seeFeatures()
    {
        System.out.println("Brand:" + getBrand() + " Model: " + getModel() + " Color: " +
                getColor() + " Year: "+ getYear() + " Speed: " + getSpeed());
    }
}