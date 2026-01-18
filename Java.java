public class Java {

    private double vida;
    private double energia;
    private double defesa;
    private double velocidade;

    private final double ENERGIA_MAX = 100;

    // Construtor
    public Java(double vida, double energia, double defesa, double velocidade) {
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

    // Lógica de combate
    public void receberDano(double dano) {
        double danoFinal = dano - (defesa * 1.2);

        if (danoFinal < 0) {
            danoFinal = 0;
        }

        vida -= danoFinal;

        if (vida < 0) {
            vida = 0;
        }
    }

    // Ataque básico (constante e estável)
    public void atacar(Csharp sukuna) {
        if (energia < 10 || !estaVivo()) {
            return;
        }

        energia -= 10;
        double dano = 18; 
        sukuna.receberDano(dano);
    }

    // Skill especial: Garbage Collector Infinito (cura)
    public void garbageCollectorInfinito() {
        if (energia < 25 || !estaVivo()) {
            return;
        }

        energia -= 25;
        vida += 30;

        if (vida > 100) {
            vida = 100;
        }
    }

    // Skill especial: Domain Expansion – JVM
    public void domainExpansionJVM() {
        if (energia < 40 || !estaVivo()) {
            return;
        }

        energia -= 40;
        defesa += 10; // buff defensivo
    }

    // Recuperação de energia por turno
    public void recuperarEnergia(double valor) {
        energia += valor;

        if (energia > ENERGIA_MAX) {
            energia = ENERGIA_MAX;
        }
    }

    // Estado do personagem
    public boolean estaVivo() {
        return vida > 0;
    }
}
