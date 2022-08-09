package com.anemchenko.hometask1.task3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1,2,3);
        Square square = new Square(1,2,3);
        Triangle triangle = new Triangle(1,2,2,2,2);

        FigureDrawer.draw(circle); //
        FigureDrawer.draw(square); // Это и есть полиморфизм. Мы можем помещать в метод draw экземпляр любого класса, И не задумываться о том - как у него определен метод draw().
        FigureDrawer.draw(triangle); // Можно передать сюда экземпляр любого класса (необязательно наследника Figure), лишь бы этот класс имплементировал интерфейс Drawable

    }
}
