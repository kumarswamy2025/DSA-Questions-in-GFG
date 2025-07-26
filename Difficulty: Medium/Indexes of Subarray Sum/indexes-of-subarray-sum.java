
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
         // code here
        int str = 0;

        for (str = 0; str < arr.length; str++) {
            int sum = 0;
            ArrayList<Integer> subArray = new ArrayList<>();

            for (int i = str; i < arr.length; i++) {

                sum = sum + arr[i];


                if (sum == target) {
                    subArray.add(str+1);
                    subArray.add(i+1);

                    return subArray;
                }
            }
        }

        return new ArrayList<>(List.of(-1));
    }
}
