public class Csharp {

    private double vida;
    private double energia;
    private double defesa;
    private double velocidade;

    private final double ENERGIA_MAX = 100;

    // Construtor
    public Csharp(double vida, double energia, double defesa, double velocidade) {
        this.vida = vida;
        this.energia = energia;
        this.defesa = defesa;
        this.velocidade = velocidade;
    }

    // Getters
    public double getVida() {
        return vida;
    }

    public double getEnergia() {
        return energia;
    }

    public double getDefesa() {
        return defesa;
    }

    public double getVelocidade() {
        return velocidade;
    }

    // Receber dano
    public void receberDano(double dano) {
        double danoFinal = dano - defesa;

        if (danoFinal < 0) {
            danoFinal = 0;
        }

        vida -= danoFinal;

        if (vida < 0) {
            vida = 0;
        }
    }

    // Ataque básico
    public void atacar(Java gojo) {
        if (energia < 10 || !estaVivo()) {
            return;
        }

        energia -= 10;
        double dano = 20;

        // Crítico
        if (Math.random() < 0.3) {
            dano *= 2;
            System.out.println("💥 C# acertou um CRÍTICO!");
        }

        gojo.receberDano(dano);
    }

    // Ataque especial
    public void performanceBrutal(Java gojo) {
        if (energia < 30 || !estaVivo()) {
            return;
        }

        energia -= 30;
        double dano = 40;

        if (Math.random() < 0.5) {
            dano *= 2;
            System.out.println("🔥 Performance Brutal devastadora!");
        }

        gojo.receberDano(dano);
    }

    // Domain Expansion – .NET
    public void domainExpansionDotNet(Java gojo) {
        if (energia < 40 || !estaVivo()) {
            return;
        }

        energia -= 40;

        System.out.println("☠️ Domain Expansion: .NET Activated!");

        // dano massivo ignorando parte da defesa
        double dano = 60 + (gojo.getDefesa() * 0.5);
        gojo.receberDano(dano);

        defesa += 5;
    }

    // Recuperar energia
    public void recuperarEnergia(double valor) {
        energia += valor;

        if (energia > ENERGIA_MAX) {
            energia = ENERGIA_MAX;
        }
    }

    // Estado
    public boolean estaVivo() {
        return vida > 0;
    }
}
