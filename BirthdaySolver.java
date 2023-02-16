/*   @Author - Matthew Ernst
     @Version - 1.1.         */

import java.util.*;
class BirthdaySolver {
    static Random rand = new Random();

    /*** Generates random birthdates for a group of people and returns the chance of two people having the same birthdate.*
     * @return the chance of two people in the group having the same birthdate   */
    public static double generateDates() {
        ArrayList<Integer> groupedCollection = new ArrayList<>();
        boolean run = true;

        groupedCollection.add(rand.nextInt(365) + 1);
        while (run) {
            //Denotes the selected element...
            for (int i = 0; i < groupedCollection.size(); i++) {
                //Denotes all the elements you are comparing to the selected element...
                for (int j = 0; j < groupedCollection.size(); j++) {

                    //Aslong as its not comparing the same element and the elements both exist at different indexes...
                    if ((i != j) && (groupedCollection.get(i).equals(groupedCollection.get(j)))) {

                        //Returns the chance
                        return (1.0/groupedCollection.size()) * 100;
                    }
                }
            }

            groupedCollection.add(rand.nextInt(365) + 1);
        }

        return (1.0/groupedCollection.size()) * 100;
    }

    public static void main(String[] args) {
        System.out.printf("Chance of 2 students sharing the same birhday in this simulation was %.2f%%",BirthdaySolver.generateDates());
    }
}