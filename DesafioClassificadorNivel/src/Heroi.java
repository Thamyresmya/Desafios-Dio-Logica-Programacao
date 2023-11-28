public class Heroi {
    private String nomeHeroi;
    private int experienciaXP;
    private String nivel = "";

    //construtor
    public Heroi() {

    }

    //getters and setters
    public String getNomeHeroi() {
        return nomeHeroi;
    }

    public void setNomeHeroi(String nomeHeroi) {
        this.nomeHeroi = nomeHeroi;
    }

    public int getExperienciaXP() {
        return experienciaXP;
    }

    public void setExperienciaXP(int experienciaXP) {
        this.experienciaXP = experienciaXP;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }


    //metodos
    public void mensagem() {

        if (experienciaXP <= 1000) {
            nivel = "Ferro";
        } else if (experienciaXP > 1000 && experienciaXP <= 2000) {
            nivel = "Bronze";
        } else if (experienciaXP > 2000 && experienciaXP <= 5000) {
            nivel = "Prata";
        } else if (experienciaXP > 5000 && experienciaXP <= 7000) {
            nivel = "Ouro";
        } else if (experienciaXP > 7000 && experienciaXP <= 8000) {
            nivel = "Platina";
        } else if (experienciaXP > 8000 && experienciaXP <= 9000) {
            nivel = "Ascendente";
        } else if (experienciaXP > 9000 && experienciaXP <= 10000) {
            nivel = "Imortal";
        } else {
            nivel = "Radiante";
        }

        System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivel);
    }
}
