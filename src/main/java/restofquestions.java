public class restofquestions {


        // Question 1
        public static int getLastIndex (String[]names){
            return names.length -1;
        }

        // Question 2
        public static int getSecondToLastIndex (String[]names){
            return names.length -2;
        }

        // Question 3
        public static String getFirstElement (String[]names){
            return names[0];
        }

        //Question 4
        public static String getLastElement (String[]names){
            return names[names.length-1];

        }

        //Question 5
        public static String getSecondToLastElement (String[]names){
            return names[names.length-2];
        }

        // Question 6
        public static int getSum (int x, int y){
            return x+y;
        }

        // Question 7
        public static int getAverage ( int x, int y){

            return (x+y)/2;
        }
        // Question 8
        public static String extractAllOddNumbers ( int[] numbers){
            String oddNum = "";
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    oddNum += numbers[i]+",";
                }
            }
            return oddNum;
        }


        // Question 9
        public static String extractAllEvenNumbers ( int[] numbers ){
            String evenNums = "";
            for (int i=0;i<numbers.length;i++){
                if (numbers[i] %2 ==0){
                    evenNums += numbers[i]+",";
                }
            }
            return evenNums;
        }

        // Question 10
        public static boolean contains (String[]names, String element){
            return true;
        }

    public static void main(String[] args) {
            String[] studentNames = {"Yev", "Kyle", "John", "Luis"};
        System.out.println(getLastIndex(studentNames));
        System.out.println(getSecondToLastIndex(studentNames));
        System.out.println(getFirstElement(studentNames));
        System.out.println(getLastElement(studentNames));
        System.out.println(getSecondToLastElement(studentNames));
       int [] numbers = {1,2,3,4,5,6};
        System.out.println(getSum(2,3));
        System.out.println(getAverage(4,8));
        System.out.println(extractAllOddNumbers(numbers));
        System.out.println(extractAllEvenNumbers(numbers));

        if (studentNames[0].equals("Yev")) {
            System.out.println(true);
        }
    }
}
