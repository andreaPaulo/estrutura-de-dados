package one.digitalInovation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Carro> stackCarros =   new Stack<>();
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Ferrari"));
        stackCarros.push(new Carro("Fiat"));
        System.out.println(stackCarros);

        // retira do topo da pilha
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        // mosta o que esta no topo, mas não retira
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);


    }
}
