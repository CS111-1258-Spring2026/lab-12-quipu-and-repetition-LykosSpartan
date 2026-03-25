/********************************************
*	AUTHOR:	
* COLLABORATORS: 
*	LAST MODIFIED:	
********************************************/

/********************************************
*	Quipu
*********************************************
*	PROGRAM DESCRIPTION:
*	A user will enter a number between 0 and 999 and this program will display the number as a quipu.
*********************************************
*	ALGORITHM:
//math example
number is 352
hundred is 3: 352 / 100 = 3 Java (rules)
tens is 5: 52 / 10 = 5 (352 % 100  = 52)
ones is 2: 2 / 1 = (52 % 10 = 2)


//psuedocode
INPUT num //0-999
CALC hundredPlace = / 100
CALC remainder = num % 100
CALC tensPlace = remainder / 10
CALC onesPlace = remainder % 10
*	
*********************************************/


public class Main
{

  /***** CONSTANT SECTION *****/
   public static final int QUIPU_WIDTH = 30;
  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    

    /***** INITIALIZATION SECTION *****/
    
    
    /***** INTRO SECTION *****/
    

    /***** INPUT SECTION *****/
    

    /***** PROCESSING SECTION *****/
    
    
    
    /***** OUTPUT SECTION *****/
      
    
  }
  /***** STATIC METHODS *****/
public static void printKnots(int numKnots){
    for (int i = 0; i < numKnots; i++){
      UtilityBelt.printCentered((QUIPU_WIDTH), "*");

    }


}
public static void printQuipu(int hundreds, int tens, int ones){
  UtilityBelt.printCentered(QUIPU_WIDTH, "---");
  UtilityBelt.printCentered(QUIPU_WIDTH, "|");
  Main.printKnots(hundreds);
  UtilityBelt.printCentered(ones, null);
}


}