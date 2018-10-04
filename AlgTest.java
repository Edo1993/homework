package work;

public class AlgTest {
    public static void main(String[] args) {
        int[] massive = {15,7,1,4,9,3,0};

        for(int i=0; i< massive.length-1; i++){
            int ind = i;
            for(int j=i+1; j<massive.length; j++) {
                if (massive[j] < massive[ind])
                    ind = j;
            }
            int x = massive[ind];
            massive[ind] = massive[i];
            massive[i] = x;

        }
        for(int number : massive) {
            System.out.println(number);
        }
    }
}



