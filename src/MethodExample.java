public class MethodExample {
    public int addNumbers(int x, int y) {
        int Addition = x + y;
        return Addition;
    }
    public  String declareNames(String p, String q) {
        String names = p + q;
        return names;
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        String p = "Tito";
        String q = "Muchoki";
        MethodExample myObj = new MethodExample();
        String fullNames = myObj.declareNames("tito","muchoki");
        int result = myObj.addNumbers(x,y);
        System.out.println("the sum of is: "+result);
        System.out.println("my full names are: " +fullNames);
    }
}
