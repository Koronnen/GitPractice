public class arithmeticunit {
    private int num1;
    private int num2;

    public arithmeticunit(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add(){
        return num1 + num2;
    }
    public double subtract(){
        return num1 - num2;
    }
    public int multiply(){
        return num1 * num2;
    }
    public double divide(){
        if(num2 == 0){
            throw new ArithmeticException("Why the fuck are you dividing by 0?");
        }
        return (double)num1 / num2;
    }

    
}
