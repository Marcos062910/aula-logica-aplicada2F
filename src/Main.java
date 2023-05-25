public class Main {
    public static void main(String[] args) {
        // Aula de orientaçao á objetos
        // Declarar objetos
        Pessoa adao;
        // instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();
         // Definiçao do formato do objeto
        adao.nome ="Adão";
        adao.sobrenome ="Silva";
        eva.nome = "Eva";
        eva.sobrenome = "silva";
         // Acionar comportamento
        adao.falar();
        eva.falar();

        // Criar mais Objetos
        Pessoa qualquer = new Pessoa();
        // Declarar Objeto
        Pessoa rainha;
        // Instanciaçao de Objetos
        rainha = new Pessoa();
        // Defenindo forma da pesssoa
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        // Definção de comportamento
        System.out.println(rainha.falar("alto"));
        rainha.comer();


        
    }
}