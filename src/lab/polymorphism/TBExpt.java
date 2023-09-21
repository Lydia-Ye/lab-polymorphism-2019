package lab.polymorphism;

import java.io.PrintWriter;
import org.w3c.dom.Text;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.3 of September 2019
 */
public class TBExpt {
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) throws Exception {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    TextBlock block1 = new TextLine("This is a test.");
    TBUtils.print(pen,block1);

    // Create a block to use
    TextBlock block_hello = new TextLine("Hello");
    TextBlock block_gb = new TextLine("Goodbye");
    // Print out the block
    TBUtils.print(pen, block_hello);

    TextBlock block3 = new BoxedBlock(block_hello);
    TBUtils.print(pen, block3);

    TextBlock block4 = new BoxedBlock(block3);
    TBUtils.print(pen, block4);

    TextBlock block5 = new TextLine("");
    TextBlock block6 = new BoxedBlock(block5);
    TBUtils.print(pen, block6);

    TextBlock block_hello_gb = new VComposition(block_hello, block_gb);
    TextBlock boxed_hello_gb = new BoxedBlock(block_hello_gb);
    TBUtils.print(pen, boxed_hello_gb);

    TextBlock boxed_gb = new BoxedBlock(block_gb);
    TextBlock part_b = new VComposition(block3, boxed_gb);
    TBUtils.print(pen, part_b);

    TextBlock part_c = new HComposition(block3, block_gb);
    TBUtils.print(pen, part_c);

    TextBlock part_d = new HComposition(block_gb, block3);
    TBUtils.print(pen, part_d);

    /*
     * public String row(int rownum){
     * 
     * }//row
     */


    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
