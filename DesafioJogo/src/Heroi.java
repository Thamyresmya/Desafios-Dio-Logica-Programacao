public class Heroi {
    private String nome;
    private int idade;
    private String tipo = "";

    //construtor
    public Heroi() {
    }

    public Heroi(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // metodos
    public void atacar(){
        String ataque = "";

        switch (tipo){
            case "Mago":
                ataque = "Magia";
                break;
            case "Guerreiro":
                ataque = "Espada";
                break;
            case "Monge":
                ataque = "Artes Marciais";
                break;
            case "Ninja":
                ataque = "Shuriken";
        }

        System.out.println("O " + tipo + " atacou usando " + ataque);
        System.out.println("Usuario: " + nome + " de " + idade + " anos.");

    }

}
