public class Test3 {
    public static void main(String[] args) {
        String a = "Educar";
        String b = "Ação";
        b = geraStr(a, b);
        System.out.println(b);
    }

    private static String geraStr(String a, String b) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length() - 1; i++) {
            char c = a.charAt(i);
            s.append(c);
        }

        return s.toString().concat(b.substring(1,4));
    }
}
