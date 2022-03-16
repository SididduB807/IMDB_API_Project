public class Searcher {

    private int[] arr = {4,7,19,25,36,37,50,100,101,205,220,271,306,321};

    public Searcher() {

    }

    public int Search(int first, int last, int key) {

        int mid;

        while (first <= last) {

            mid = (first+last)/2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid]<key)
                first = mid +1;
            else
                last = mid -1;

        }
        return -1;

    }


}
