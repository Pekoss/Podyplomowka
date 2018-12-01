public class MarsRobot implements Robot{
    String name;
    String status;
    int speed;
    float temperature;


    public void checkStatus(){
        System.out.println("Robot: " + this.name + " Status: " + status);
    }

    public void checkTemperature(){
        if (temperature < -80){
            status = "Powrót do domu";
            speed = 5;
        }
    }

    void showAttributes(){
        System.out.println("Status: " + status);
        System.out.println("Preędkość: " + speed);
        System.out.println("Temperatura: " + temperature);
    }

    public MarsRobot(String _name)
    {
        name = _name;
    }
}