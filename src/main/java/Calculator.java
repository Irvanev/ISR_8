public class Calculator {
  
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b) throws Exception {
        if(b == 0){
            throw new Exception("y cannot be zero");
        }
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }

    public int solver(int a, int b) throws Exception {
        if (a == 0) {
            throw new Exception("Error: Division by zero");
        }
        return div(dif(times(a, b), add(a, b)), a);
    }
}
