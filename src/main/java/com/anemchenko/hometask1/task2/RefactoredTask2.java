package com.anemchenko.hometask1.task2;

public class RefactoredTask2 {

    class Engine{

    };

    abstract class Car {
        public Engine engine; //NOTE Не определен класс Engine
        private String color;
        private String name;

        protected void start() {
            System.out.println("Car starting");
        }
        abstract void open();
        abstract void move();
        abstract void stop();

        public Engine getEngine() {
            return engine;
        }
        public void setEngine(Engine engine) {
            this.engine = engine;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    class LightWeightCar extends Car{

        @Override
        void open() {
            System.out.println("light car is opened");
        }

        @Override
        void move() {
            System.out.println("light car is moving");

        }

        @Override
        void stop() {
            System.out.println("light car is stopped");
        }
    }

    class Lorry extends Car{ //неправильная имплементация интерфейсов (без слова implements)
        @Override
        void open() {
            System.out.println("Lorry is opened");
        }

        public void move(){
            System.out.println("Lorry is moving");
        }
        public void stop(){
            System.out.println("Lorry is stopped");
        }
    }
}
