public class Calculadora {
    private int vitoria;
    private int derrota;
    private String nivel = "";

    //construtor

    public Calculadora(int vitoria, int derrota) {
        this.vitoria = vitoria;
        this.derrota = derrota;
    }

    //getters and setters
    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    //metodos
    public void rankeadas() {
        int resultado = vitoria - derrota;

        if (resultado <= 10) {
            nivel = "Ferro";
        } else if (resultado > 10 && resultado <= 20) {
            nivel = "Bronze";
        } else if (resultado > 20 && resultado <= 50) {
            nivel = "Prata";
        } else if (resultado > 50 && resultado <= 80) {
            nivel = "Ouro";
        } else if (resultado > 80 && resultado <= 90) {
            nivel = "Diamante";
        } else if (resultado > 90 && resultado <= 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        System.out.println("O Herói tem de saldo de " + resultado + " está no nível de " + nivel);

    }

}
