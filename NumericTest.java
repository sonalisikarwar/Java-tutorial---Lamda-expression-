
package shivaafoundation.javatutorial;

interface NumericTest {
    boolean test(int n);
    }
class LamdaDemo2{
    public static void main(String args[]){
        NumericTest isEven = (n) ->(n % 2) ==0;
        if(isEven.test(10)) System.out.println("10 is even");
        if(!isEven.test(9)) System.out.println("9 is not even");
        NumericTest isNonVeg = (n) ->n >= 0;
        if(isNonVeg.test(1)) System.out.println("1 is non-negative");
        if(!isNonVeg.test(-1)) System.out.println("-1 is negative");
    }
}
