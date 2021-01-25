package aulas.oo.part01.paradigma.exemplo001;

public class Carro {

    private Integer qtd_pessoas = 5;

    private String nome = "Marco";

    public String removerPessoa() {
        qtd_pessoas -= 1;
        return "Uma pessoa foi removida, o total agora é " + qtd_pessoas;
    }

    public String adicionarPessoa() {
        if (qtd_pessoas >= 5 ){
            return "Não é possível adicionar mais ninguém, o carro está cheio.";
        } else {
            qtd_pessoas += 1;
                return "Uma pessoa foi adicionada, o total agora é " + qtd_pessoas;
        }
    }
    public Integer getQtdPessoas() {
        return qtd_pessoas;
    }


    }


