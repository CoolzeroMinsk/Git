public class Main {

    public static void main(String[] args) {
        Auto ferrari = new Auto(240, "blue", "coupe", 1000, "Ferrari");
        Auto mersedes = new Auto(220, "black", "sedan", 2000, "Mersedes");
        Auto moskvitch = new Auto(120, "green", "pickup", 1100, "Moskvitch");

        ferrari.accelerate();
        mersedes.accelerate();
        moskvitch.accelerate();

        ferrari.changeColor("red");
        mersedes.changeColor("white");
        moskvitch.changeColor("grey");
    }
}