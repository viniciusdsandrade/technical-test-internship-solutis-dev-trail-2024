class Test8 {
    protected int va1 = 1, va2 = 2;

    public Test8(int x) {
        va1 += x;
        va2 *= x;
    }
}

class Test9 extends Test8 {
    protected int vb1 = 10;

    public Test9(int x) {
        super(x);
    }
}

class Test10 extends Test9 {
    protected int vc1 = 0;

    public Test10(int y) {
        super(y);
        vc1 = (va1 + va2) * y;
    }

    public static void main(String[] args) {
        Test10 o = new Test10(3);
        System.out.println(o.vc1);
    }
}
