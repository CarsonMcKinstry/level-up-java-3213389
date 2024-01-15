package com.linkedin.javacodechallenges;

public class App 
{
    public static void main( String[] args ) {
        Person carson = new Person("Carson", "McKinstry", 30);
        Person carina = new Person("Carina", "Reidick", 32);

        carson.introduction();
        carina.introduction();
    }
}
