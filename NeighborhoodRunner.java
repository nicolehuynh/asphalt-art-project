import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

//painter
    amongUs joe = new amongUs(); 
    
// paints the amongus
// outline and main base
    joe.paintOutline("black");
    joe.paintShadingRed("maroon");
    joe.paintRed("red");
    joe.outLineGoggles("black");
    joe.paintGoggles();

    joe.resetPosition();



    
  }
}