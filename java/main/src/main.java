public class main {
    public static void main(String[] arg) {
        // System.out.println("ola mundo");
        //
        /*
         * System.out.println(3);
         * System.out.println(1000);
         * System.out.println("jessica tudo bem?");
         * System.out.println(10 + 14);/*
         */
        // criar uma variavel java
        // String nome = "jessica";
        // System.out.println(nome);

        // int numero = 12;
        // System.out.println(numero);

        // int valor;
        // valor = 45;
        // System.out.println(valor);
        // esse foram as declaraçao de variaveis:
        int conta = 1400;
        float decimal = 15.25f;
        char nome = 'd';
        String meuNome = "joao";
        System.out.println(meuNome);
        System.out.println(decimal);
        System.out.println(conta);
        System.out.println(nome);
        System.out.println("ola" + meuNome);
        // int x = 10;
        // int j = 20;
        // System.out.println(x + j);
        int a = 10, b = 15, c = 30;
        System.out.println(a + b + c);
        // calcular (declarou a variaveis):
        int altura = 10;
        int largura = 20;
        int area;

        // calcular essa area:
        area = largura * altura;

        // printar essa area:
        System.out.println("altura e:" + altura);
        System.out.println("largura e:" + largura);
        System.out.println("area do retangulo:" + area);
        // casting menor para o maior(automaticamente)
        // int meuNumero = 9;
        // double meuValor = meuNumero;

        // System.out.println(meuNumero);
        // System.out.println(meuValor);
        // fundicao maior para o menor(manualmente)
        double meuValor = 9.45;
        int meuNumero = (int) meuValor;
        System.out.println(meuNumero);
        System.out.println(meuValor);
    }
}