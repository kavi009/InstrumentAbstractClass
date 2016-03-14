package session6;

abstract class Instrumentt {
	protected String name;
	abstract public void play();

}
abstract class StringedInstrument extends Instrumentt {
 
	protected int numberOfStrings;

}
class ElectricGuitar extends StringedInstrument {

     public ElectricGuitar() {

          super();

          this.name = "Guitar";
          this.numberOfStrings = 6;

     }

     public ElectricGuitar(int numberOfStrings) {

          super();

          this.name = "Guitar";
          this.numberOfStrings = numberOfStrings;

     }

     public void play() {

          System.out.println("An electric guitar of \n" + numberOfStrings + "-strings " + name + " is playing!");

     }

}

class ElectricBassGuitar extends StringedInstrument {

    public ElectricBassGuitar() {
         super();
         this.name = "Bass Guitar";
         this.numberOfStrings = 4;
    }

    public ElectricBassGuitar(int numberOfStrings) {
         super();
         this.name = "Bass Guitar";
         this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
         System.out.println("An electric bass guitar of \n " + numberOfStrings + "-strings " + name
				+ " is playing!");
    }
}
public class Instrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ElectricGuitar eg = new ElectricGuitar();
         ElectricBassGuitar ebg = new ElectricBassGuitar();
         
         eg.play();
         ebg.play();

         eg = new ElectricGuitar(7);
         ebg = new ElectricBassGuitar(5);

         eg.play();
         ebg.play();
	}

}
