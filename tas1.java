public class tas1 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i<4; i++){
            for (int j=0; j<4; j++){
                int a = (int)(Math.random()*2);
                matrix[i][j] = a;

            }
        }
        int largestRow = 0;
        int largestColumn = 0;


        for (int i = 0; i<4; i++){
            for (int j=0; j<4; j++) {
                System.out.print(matrix[i][j]+"\t");

            }
            System.out.println();
        }
        System.out.println("The maximum row Index is: "+row(matrix));
        System.out.println("The maximum column Index is:"+column(matrix));
    }

        public static int row(int[][] a){
         int maxRowIndex = 0;
         int maxNumber = 0;

         for (int i=0; i<a.length; i++){
             int counter = 0;
            for (int j=0; j<a.length; j++) {

                if (a[i][j] == 1)
                    counter += 1;
                if (j == 3){
                    if (maxNumber < counter) {
                        maxNumber = counter;
                        maxRowIndex = i;
                    }
                }
            }
         }
            return maxRowIndex;
        }


    public static int column(int[][] a) {
        int k = 0;
        int numberOfOne = 0;
        int numberOfIndex = 0;
        for (int i=0; i<a.length; i++){
            int counter = 0;

            for (int j=0; j<a.length; j++){
                if (a[j][k] == 1){
                    counter +=1;
                }
                if (j == 3){
                    if (numberOfOne < counter) {
                        numberOfOne = counter;
                        numberOfIndex = k;
                    }
                }
            }
            k += 1;
        }

        return numberOfIndex;

    }
    }
