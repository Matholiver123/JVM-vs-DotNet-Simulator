public class Main {

    public static void main(String[] args) {

        Java gojo = new Java(100, 100, 15, 8);
        Csharp sukuna = new Csharp(100, 100, 8, 12);

        int turno = 1;

        System.out.println("🔥 Início da batalha: Java vs C#\n");

        while (gojo.estaVivo() && sukuna.estaVivo()) {
            System.out.println("=== Turno " + turno + " ===");

            // Sukuna ataca primeiro (mais rápido)
            if (sukuna.getEnergia() >= 30) {
                sukuna.domainExpansionDotNet(gojo);
            } else {
                sukuna.atacar(gojo);
            }

            // Gojo responde se ainda estiver vivo
            if (gojo.estaVivo()) {
                gojo.atacar(sukuna);
            }

            // Recuperação de energia
            gojo.recuperarEnergia(5);
            sukuna.recuperarEnergia(8); // Sukuna recupera mais

            // Status
            System.out.println("Java (Gojo) - Vida: " + gojo.getVida()
                    + " | Energia: " + gojo.getEnergia());
            System.out.println("C# (Sukuna) - Vida: " + sukuna.getVida()
                    + " | Energia: " + sukuna.getEnergia());
            System.out.println();

            turno++;
        }

        // Resultado
        if (sukuna.estaVivo()) {
            System.out.println("🏆 C# (Sukuna) venceu a batalha!");
        } else {
            System.out.println("🏆 Java (Gojo) venceu a batalha!");
        }
        System.out.println("A liguagem mais poderosa perde. por conta do seu ego.");
    }
}
