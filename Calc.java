public class Calc{
	public static int add(int int1, int int2){
        return int1+int2;
    }
    public static int subtract(int int1, int int2){
        return int1+int2;
    }
}
        public class CalcTest {
    @Test
    void testAddition() {
        Calc c = new Calc();
        assertEquals(4, c.add(2,2));
    }
