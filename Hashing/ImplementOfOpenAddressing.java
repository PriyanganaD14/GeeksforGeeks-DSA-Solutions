public class ImplementOfOpenAddressing {
    public static void main(String[] args) {

        OpenAddressing op = new OpenAddressing(7);
        op.insert(49);
        op.insert(56);
        op.insert(72);

        op.search(56);
        if (op.search(56) == true) {
            System.out.println("Searching element is present");
        } else {
            System.out.println("Searching element is not present");
        }

        op.erase(56);

        if (op.search(56) == true) {
            System.out.println("Unsuccessfully deleted");
        } else {
            System.out.println("Successfully deleted");
        }

    }

}

class OpenAddressing {

    int arr[];
    int cap, size;

     OpenAddressing(int c) {
        cap = c;
        size = 0;
        arr = new int[cap];

        for (int i = 0; i < cap; i++) {

            arr[i] = -1;

        }
    }

    

    public int hash(int key) {
        int h = key % cap;
        return h;
    }

    public boolean insert(int ele) {

        if (cap == size) {
            return false;
        }
        int i = hash(ele);

        while (arr[i] != -1 && arr[i] != -2 && arr[i] != ele) {
            i = (i + 1) % cap;
        }

        // aleady present
        if (arr[i] == ele) {
            return false;
        }

        else {
            arr[i] = ele;
            size++;
            return true;
        }

    }


    public boolean search(int key){

        int h=hash(key);
        int i=h;

        while(arr[i]!=-1){

            // searched key element
            if(arr[i]==key){
                return true;
            }

            i=(i+1)%cap;

            // complete whole traversal
            if(i==h){
                return false;
            }
        }

        return false;
    }


    public boolean erase(int key){


        int h=hash(key);
        int i=h;

        while(arr[i]!=-1){

            if(arr[i]==key){
                arr[i]=-2;
            }

            i=(i+1)%cap;

            if(i==h){
                return false;
            }
        }

        return false;
    }

}
