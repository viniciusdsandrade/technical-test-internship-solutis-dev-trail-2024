class Test6 {
    public static String getStr() {
        return "abcdefghijklmnop";
    }

    public String ini(String s, int cpr) {
        return s.substring(0, cpr);
    }

    public String fin(String s, int cpr) {
        return ini(s, cpr) + s.substring(s.length() - cpr);
    }
}

class Test7 extends Test6 {
    public static String getStr() {
        return "0123456789ABCDEF";
    }

    public String ini(String s, int cpr) {
        return s.substring(s.length() - cpr);
    }

    public static void main(String[] args) {
        Test6 o = new Test7();
        System.out.println(o.fin(Test6.getStr(), 5));
    }
}