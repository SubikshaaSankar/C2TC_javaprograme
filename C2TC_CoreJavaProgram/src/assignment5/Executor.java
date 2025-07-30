package assignment5;

//Main.java
public class Executor {
 public static void main(String[] args) {
     AirIndia ai = new AirIndia(5, 1000.50);
     KingFisher kf = new KingFisher(3, 800.75);
     Indigo indigo = new Indigo(4, 900.25);

     System.out.println("AirIndia Fare: ₹" + ai.calculateAmount());
     System.out.println("KingFisher Fare: ₹" + kf.calculateAmount());
     System.out.println("Indigo Fare: ₹" + indigo.calculateAmount());
 }
}
