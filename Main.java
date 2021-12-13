import processing.core.PApplet;

/**
 * Main class to execute sketch. Edit test
 * @author 
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}