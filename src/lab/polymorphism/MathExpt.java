package lab.polymorphism;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * A few simple experiments with our utilities.
 * Version 1.1 of February 2019.
 */
public class MathExpt {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);

    // Print some square roots.
    for (int i = 2; i < 10; i++) {
      double root = MathUtils.squareRoot(i);
      pen.println("The square root of " + i + " seems to be " + root);
      pen.println(root + "^2 = " + (root * root));
    } // for i

    int int_a = 2;
    Float float_a = Float.valueOf("2.0");
    Double Double_a = 2.0;
    BigInteger BigInt_a = BigInteger.valueOf(2);
    BigDecimal BigDec_a = BigDecimal.valueOf(2.0);
    double double_a = 2.0;

    double int_root = MathUtils.squareRoot(int_a);
    pen.println("The square root of integer " + int_a + " seems to be " + int_root);

    double Double_root = MathUtils.squareRoot(Double_a);
    pen.println("The square root of Double " + Double_a + " seems to be " + Double_root);

    double float_root = MathUtils.squareRoot(float_a);
    pen.println("The square root of float " + float_a + " seems to be " + float_root);

    double BigInt_root = MathUtils.squareRoot(BigInt_a);
    pen.println("The square root of BigInteger " + BigInt_a + " seems to be " + BigInt_root);

    double BigDec_root = MathUtils.squareRoot(BigDec_a);
    pen.println("The square root of BigDecimal " + Double_a + " seems to be " + Double_root);

    double double_root = MathUtils.squareRoot(double_a);
    pen.println("The square root of double " + double_a + " seems to be " + double_root);
    

    // We're done. Clean up.
    pen.close();
  } // main(String[])
} // class MathExpt
