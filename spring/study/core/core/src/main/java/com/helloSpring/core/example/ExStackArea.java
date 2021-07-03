package com.helloSpring.core.example;

public class ExStackArea {
    public static void main(String[] args) {
        Animal animal = null;	// Animal 타입의 animal 객체 선언 및 Stack 영역 공간 할당

                System.out.println(animal);	// null

                animal = new Animal();	// Heap 메모리에 공간 할당

                System.out.println(animal);	// @15db9742
            }
}

class Animal {

}
