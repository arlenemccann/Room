public class Room {

    private static int totalNumber = 0;
    public int numberInRoom = 0;


    public int addOneToRoom(){
        numberInRoom++;
        totalNumber++;
        return numberInRoom;
    }
    public int removeOneFromRoom(){
        if (numberInRoom == 0 || totalNumber ==0){
            return numberInRoom;
        }
        numberInRoom--;
        totalNumber--;
        return numberInRoom;
    }

    public int getNumber(){

        return numberInRoom;
    }

    public static int getTotal(){

        return totalNumber;
    }

}
