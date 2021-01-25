package aulas.oo.part01.paradigma.exemplo001;

public class ExemploInstanciaObjeto {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();

        System.out.println(meuCarro.getQtdPessoas());
        // 5

        System.out.println(meuCarro.removerPessoa());

        System.out.println(meuCarro.adicionarPessoa());

        System.out.println(meuCarro.adicionarPessoa());


    }

}
