public class MessagePrinter {
    public void printStart(){
        System.out.println("Игра началась");
        System.out.println("-----------");
    }
    public void printCoordinates(){
        System.out.println("Введите координаты цели в формате 00 - 99");
    }
    public void printWin(){
        System.out.println("Молодец");
    }
    public void printLose(){
        System.out.println("Обидно");
    }
    public void printGameOver(int counter){
        System.out.println("Игра окончена. Вы попали " + counter + " раз");
    }
}
