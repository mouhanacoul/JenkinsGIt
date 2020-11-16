package br.com.temperatura.convers;

public class Main {
    public static void main(String[] args){
        ConversTemp c = new ConversTemp('C', 10);

        c.converter('F');
    }
}
