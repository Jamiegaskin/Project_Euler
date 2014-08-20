public class Fraction
{
   public int numerator;
   public int denominator;
   
   public Fraction()
   {
      numerator = 1;
      denominator = 1;
   }
   
   public Fraction(int num, int den)
   {
      numerator = num;
      denominator = den;
   }
   
   public boolean reduce()
   {
      Fraction reduced = reduce(numerator, denominator);
      if (reduced.numerator == this.numerator)
         return false;
      
      this.numerator = reduced.numerator;
      this.denominator = reduced.denominator;
      return true;
   }
   
   public static Fraction reduce(Fraction fraction)
   {
      return reduce(fraction.numerator, fraction.denominator);
   }
   
   public static Fraction reduce(int num, int den)
   {
      int factor = GCF(num, den);
      return new Fraction(num / factor, den / factor);
   }
   
   public static int GCF(int num1, int num2)
   {
      while(num1 != num2)
      {
         if (num1 > num2)
            num1 -= num2;
         else
            num2 -= num1;
      }
      return num1;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      Fraction reducedFraction = reduce(this);
      result = prime * result + reducedFraction.denominator;
      result = prime * result + reducedFraction.numerator;
      return result;
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Fraction other = (Fraction) obj;
      other.reduce();
      Fraction reducedThis = reduce(this);
      if (reducedThis.denominator != other.denominator)
         return false;
      if (reducedThis.numerator != other.numerator)
         return false;
      return true;
   }
}
