public class RoomDriver {


    private static int totalNumber = 0;


    public static void main(String[] args) {

        Room roomOne = new Room();
        Room roomTwo = new Room();
        Room roomThree = new Room();

        System.out.println("People in Room One after someone comes in: " + (roomOne.addOne()));
        System.out.println("People in Room One after another person comes in: " + (roomOne.addOne()));
        System.out.println("People in Room One after someone leaves: " + (roomOne.removeOne()));

        System.out.println("People in Room Two after someone comes in: " + (roomTwo.addOne()));
        System.out.println("People in Room Two after someone leaves: " + (roomTwo.removeOne()));
        System.out.println("People in Room Two after someone comes in: " + (roomTwo.addOne()));
        System.out.println("People in Room Two after someone comes in: " + (roomTwo.addOne()));
        System.out.println("People in Room Two after someone comes in: " + (roomTwo.addOne()));
        System.out.println("People in Room Two after someone comes in: " + (roomTwo.addOne()));
        System.out.println("People in Room Two after someone comes in: " + (roomTwo.addOne()));
        System.out.println("People in Room Two after someone comes in: " + (roomTwo.addOne()));

        System.out.println("People in Room Three after someone leaves: " + (roomThree.addOne()));
        System.out.println("People in Room Three after someone leaves: " + (roomThree.removeOne()));

        System.out.println("Total people in Room One: " + (roomOne.numberInRoom));
        System.out.println("Total people in Room Two: " + (roomTwo.numberInRoom));
        System.out.println("Total people in Room Three: " + (roomThree.numberInRoom));

        totalNumber = roomOne.numberInRoom + roomTwo.numberInRoom + roomThree.numberInRoom;

        System.out.println("There are " + totalNumber + " people in the building!" );

    }
}
