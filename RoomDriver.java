public class RoomDriver {


    //private static int totalNumber = 0;


    public static void main(String[] args) {

        Room roomOne = new Room();
        Room roomTwo = new Room();
        Room roomThree = new Room();

        System.out.println("People in Room One after someone comes in: " + (roomOne.addOneToRoom()));
        System.out.println("People in Room One after another person comes in: " + (roomOne.addOneToRoom()));
        System.out.println("People in Room One after someone leaves: " + (roomOne.removeOneFromRoom()));

        System.out.println("People in Room Two after someone comes in: " + (roomTwo.addOneToRoom()));
        System.out.println("People in Room Two after someone leaves: " + (roomTwo.removeOneFromRoom()));
        System.out.println("People in Room Two after someone comes in: " + (roomTwo.addOneToRoom()));
        System.out.println("People in Room Two after someone comes in: " + (roomTwo.addOneToRoom()));
        System.out.println("People in Room Two after someone comes in: " + (roomTwo.addOneToRoom()));
        System.out.println("People in Room Two after someone comes in: " + (roomTwo.addOneToRoom()));
        System.out.println("People in Room Two after someone comes in: " + (roomTwo.addOneToRoom()));
        System.out.println("People in Room Two after someone comes in: " + (roomTwo.addOneToRoom()));

        System.out.println("People in Room Three after someone leaves: " + (roomThree.addOneToRoom()));
        System.out.println("People in Room Three after someone leaves: " + (roomThree.removeOneFromRoom()));

        System.out.println("Total people in Room One: " + (roomOne.numberInRoom));
        System.out.println("Total people in Room Two: " + (roomTwo.numberInRoom));
        System.out.println("Total people in Room Three: " + (roomThree.numberInRoom));

       
        System.out.println("There are " + Room.getTotal() + " people in the building!" );

    }
}
