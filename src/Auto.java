public class Auto {
    public int maxSpeed; // 0
    public String carColor; // null
    public String carType; // null
    public int weightInKg; //0
    public String model;   //null

    public Auto(int maxSpeed, String carColor, String carType, int weightInKg, String model) {
        this.maxSpeed = maxSpeed;
        this.carColor = carColor;
        this.carType = carType;
        this.weightInKg = weightInKg;
        this.model = model;
    }

    public void accelerate() {
        maxSpeed += 10;
        System.out.println(model + ": Максимальная скорость = " + maxSpeed);
    }

    public void changeColor(String newCarColor) {
        this.carColor = newCarColor;
        System.out.println(model + ": Теперь наш цвет = " + this.carColor);
    }
}