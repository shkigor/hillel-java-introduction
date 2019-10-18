package academy.learnprogramming.start_arraylist;
import java.util.ArrayList;

public class ListPosibility {
    private ArrayList<String> arrayList = new ArrayList<String>();

    public void addGroceryItem(String item) {

        arrayList.add(item);
    }


    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void printList() {
        System.out.println("You have " + arrayList.size() + " items in your grocery list");
        for(int i = 0; i< arrayList.size(); i++) {
            System.out.println((i+1) + ". " + arrayList.get(i));
        }
    }

    public void modifyItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyItem(position, newItem);
        }

    }
    private void modifyItem(int position, String newItem) {
        arrayList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeItem(position);
        }
    }
    private void removeItem(int position) {
        arrayList.remove(position);
    }

    private int findItem(String searchItem) {
        return arrayList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >=0) {
            return true;
        }

        return false;
    }
}
