package br.com.dio;

/*import br.com.dio.model.gato;*/

public class PrimeiroProgramaJava {
    public static void main(String[] args) {
    Gato gato = new Gato();
        Livro livro1 = new Livro("A solução de tudo", "300");
        System.out.println(livro1);

        System.out.println(gato);
        /*        int a = 3;
        int b = 4;
        System.out.println("ola mundo, a + b = " + (a + b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}