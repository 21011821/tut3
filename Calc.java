public class Calc{
	public static int add(int int1, int int2){
        return int1+int2;
    }
    public static int subtract(int int1, int int2){
        return int1+int2;
    }
}
public class TestCalc{
    public static main(){
    
        Calc c;
        c = new Calc();
        Bool res = if(c.add(1,2) == 1+2);
        if(res){
            print("true");
            return;
        }
        print("false");
        
    }

}