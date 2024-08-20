public class Teste {
    public static void main(String[] args) {

        //Todo: Implementar teste

        String C1 = "Olá";
        String C2 = "Mundo";
        String C3 = "!";

        C1 = C2; // Válido, C1 agora contém "Mundo"
        C1 = C2 + C3; // Válido, C1 agora contém "Mundo!"
//        C1 = C2 = C3; // Válido, C1, C2 e C3 agora contêm "!"
//        C1 = C2 + 7;

        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
    }
}
