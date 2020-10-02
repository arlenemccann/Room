public class Room {

    public static int numberInRoom = 10;
    

    public int addOne(){
        numberInRoom++;
        return numberInRoom;
    }
    public int removeOne(){
        if (numberInRoom == 0){
            return numberInRoom;
        }
        numberInRoom--;
        return numberInRoom;
    }
    public static void main(String[] args) {

        //System.out.println(roomOne.addOne(2));
        //System.out.println(roomOne.addOne(3));
        //System.out.println(roomOne.removeOne(3));
    }

}
