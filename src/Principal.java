import model.Caixa;

import java.util.ArrayList;

public class Principal {
    //public class Main {
        public static void main(String[] args) {
            // Usando o tipo primitivo double
            double primitiveDouble = 3.14;
            System.out.println("Valor do tipo primitivo double: " + primitiveDouble);

            // Usando o tipo wrapper Double
            Double wrapperDouble = 3.14;
            System.out.println("Valor do tipo wrapper Double: " + wrapperDouble);

            // Atribuição de null
            Double nullableDouble = null;
            System.out.println("Valor do tipo wrapper Double (null): " + nullableDouble);

            // Utilizando Double em uma coleção
            ArrayList<Double> doubleList = new ArrayList<>();
            doubleList.add(2.71);
            doubleList.add(1.61);
            System.out.println("Valores na ArrayList de Double: " + doubleList);

            Caixa caixa = new Caixa();
            caixa.nome = "Caixa de bebidas";
            caixa.qtd = 12;
            caixa.cor = "marrom";
            for (int i = 1; i <=12; i++) {
                caixa.itens.add("Guarana_" + i);
            }
            System.out.println(caixa.nome + ", " + caixa.qtd + ", " + caixa.cor);
            System.out.println(caixa.itens);


        }
    //}

}
