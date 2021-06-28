

public class Driver {
    public static void main(String[] args) {


        //int[] a = {10,2,6,8,4,16};
        System.out.println(sumPower3(38));
        //System.out.println(split3Equals(a));
        //printTriplets(a,40);
        //System.out.println(totalWays(mat,1));

//        int[][] mat = {
//                {4,5,6,7,1},
//                {3,5,1,7,4},
//                {4,5,6,5,8},
//                {3,4,7,7,9},
//                {6,2,2,7,6}
//        };
//        System.out.println(maxSumKnight(mat));

//        AA a1 = new AA();
//        AA a2 = new BB();
//        AA a3 = new AA();
//        AA a4 = new BB();
//        BB b1 = new BB();
//        BB b2 = new BB();
//        int a = 1;

        //System.out.println(a3.equals(a1)); // other, false
        //System.out.println(a4.equals(a2)); // 1, true
        //System.out.println(a1.equals(a2)); // other, false
        //System.out.println(a2.equals(b1)); // 1, true
        //System.out.println(b1.equals(a1)); // 2, false
        //System.out.println(b2.equals(b1)); // 3, true
        //System.out.println(b1.equals(a4)); // 2, true

//        int[][] arr = {
//                {1,9,2,8,4,7,7,4,12},
//                {5,4,2,1,3},
//                {5,51,3,22,12,7,27,14}
//        };

        //binPrint(2, "");
        //System.out.println(maxNum(arr[2]));

//        selectionSort(arr[0], 0);
//        for (int i = 0; i < arr[0].length; i++) {
//            System.out.print(arr[0][i] + ", ");
//        }


        //quickSort(arr[1],0, arr[1].length-1);
//
//        for (int i = 0; i < arr[1].length; i++) {
//            System.out.print(arr[1][i] + ", ");
//        }
//        System.out.println(isSum(arr[1],8));
//
//        int road1[] = { 5, 4, 5, 8, 12, 9, 9, 3 };
////        int road2[] = { 7, 3, 3, 12, 10, 2, 10, 7 };
//
//        System.out.println("best road " + what(road1,22));
//        boolean[][] mat = {
//                {false,false,false,false,true},
//                {false,true,true,true,false},
//                {false,false,true,true,false},
//                {true,false,false,false,false},
//                {true,true,false,false,false}
//        };
//        System.out.println(cntTrueReg(mat));
//
//        Range[] rangeA = {
//                        new Range(4,1),
//                        new Range(12,0),
//                        new Range(20,1),
//                        new Range(102,2)
//        };
//        System.out.println(findNum(rangeA,101));

//        char[][] arr1 = {
//                {'t','z','x','c','d'},
//                {'s','h','a','z','x'},
//                {'h','w','l','o','m'},
//                {'o','r','n','t','n'},
//                {'a','b','r','i','n'}
//        };
//        //print(cloneArr(arr1),0,0);
//        findWord(arr1,"shalom");
//
        //System.out.println(edit("sunday","saturday"));
//        print(arr[0],0);
//
//        System.out.println(crossSearch(arr[0],7));
//        print(arr[0],0);
    }

    private static void binPrint(int n, String str) {
        if (n == 0) System.out.print(str + " ");
        else {
            binPrint(n - 1, str + "0");
            binPrint(n - 1, str + "1");
        }
    }

    private static int maxNum(int[] arr, int i) {
        if (i == arr.length-1) return arr[i];
        int tmp = maxNum(arr, i+1);
        return arr[i] >  tmp ? arr[i] : tmp;
    }
    private static int maxNum(int[] arr) {
        return maxNum(arr, 0);
    }


    private static int minNum(int[] arr, int i) {
        if (i == arr.length-1) return i;
        int currMinInd = minNum(arr, i+1);
        return arr[i] <  arr[currMinInd] ? i : currMinInd;
    }

    private static void selectionSort(int[] arr, int i) {
        if (i == arr.length-1) return;
        int minIndex = minNum(arr, i); //get min number in new array
        if (minIndex != i) swap(arr, minIndex, i); // swap

        selectionSort(arr, i+1);
    }

    private static void quickSort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int divInd = partition(arr, lo, hi);
            quickSort(arr, lo, divInd - 1);
            quickSort(arr, divInd + 1, hi);
        }
    }
    private static int partition(int[] arr, int lo, int hi) {
        boolean flag = false;

        while (lo < hi) {
            if (arr[lo] > arr[hi]) {
                swap(arr,lo,hi);
                flag = !flag;
            }

            if (flag) lo++;
            else hi--;
        }

        return lo;
    }

    private static void swap(int[] arr, int index1, int index2) {
        //swap
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    public static int binSearch(int[] arr, int val) {
        return binSearch(arr,val,0,arr.length-1);
    }
//    public static int binSearch(int[] arr, int val, int l, int r) {
//
//        if(l>r) return -1;
//        int mid = (l+r)/2;
//        if (arr[mid] == val) {
//            return mid;
//        } else if(val < arr[mid]) {
//            return binSearch(arr,val,l,mid-1);
//        } else{
//            return binSearch(arr,val,mid+1,r);
//        }
//    }

    public static int an(int a1, int n, int d) { // 3, 4, 2
        if (n == 0) {
            return a1;
        }
        return an(a1,n-1,d) + d;
    }

    public static String replaceUpper(String str) { //aBC
        if (str.length() == 0) {
            return str;
        }
        char ch = str.charAt(0);

        return ch >= 'A' && ch <= 'Z'? "10" + replaceUpper(str.substring(1)) : ch + replaceUpper(str.substring(1)); // uppercase

    }

    public static int max(int[] arr, int i) {
        if (i == arr.length-1) return arr[i];

        int currMaxNum = max(arr, i++);
        return arr[i] > currMaxNum ? arr[i] : currMaxNum;
    }

    public static void print(int[] arr, int i){

        if (i < arr.length) {
            System.out.print(arr[i] + ", ");
            print(arr, i+1);
        }

    }
    public static void print(int[][] arr, int i, int j){
        if (i == arr.length) return;

        System.out.print(arr[i][j] + ", ");

        if (j == arr[0].length-1) {// end of line go to next row
            System.out.println();
            print(arr, i + 1, 0);
        }
        else if(j < arr[0].length) {
            print(arr, i, j + 1); // next cell
        }
    }
    public static void print(char[][] arr, int i, int j){
        if (i == arr.length) return;

        System.out.print(arr[i][j] + ", ");

        if (j == arr[0].length-1) {// end of line go to next row
            System.out.println();
            print(arr, i + 1, 0);
        }
        else if(j < arr[0].length) {
            print(arr, i, j + 1); // next cell
        }
    }
    public static void print(char[] arr, int i){

        if (i < arr.length) System.out.println(arr[i]);
        print(arr, i+1);
    }


    public static int binSearch(int[] arr, int val, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi-lo)/2;

        if (arr[mid] == val) {
            return mid;
        } else if (arr[mid] < val) {
            return binSearch(arr,val,mid+1,hi);
        }
        return binSearch(arr,val,lo,mid-1);
    }

    public static boolean isSum (int[] a, int num) {
        return isSum(a, num, 0,0);
    }

    public static boolean isSum (int[] a, int num, int i, int count) {
        if (i == a.length) return false;
        if (a[i] == num && count < 2) return true;

        return isSum(a,num,i+1, 0) || isSum(a,num-a[i],i+1,count+1);

    }

    public static int shortestRoadOn2 (int [] road1, int [] road2) {
        int minRoad, tmpSum;
        int roadsLength = road1.length;
        int roadAcc = 0;

        // only road1
        minRoad = sumArray(road1,0);

        //only road2
        minRoad = Math.min(minRoad,sumArray(road2,0));

        //start from road 1 and move to road 2
        tmpSum = 0;
        for (int i = 0; i < roadsLength-1; i++) {
            tmpSum +=  road1[i];
            int currPathSum = tmpSum + sumArray(road2,i+1);
            minRoad = Math.min(minRoad,currPathSum);
        }

        //start from road 2 and move to road 1
        tmpSum = 0;
        for (int i = 0; i < roadsLength-1; i++) {
            tmpSum +=  road2[i];
            int currPathSum = tmpSum + sumArray(road1,i+1);
            minRoad = Math.min(minRoad,currPathSum);
        }

        return minRoad;
    }

    public static int shortestRoadOn (int [] road1, int [] road2) {
        int minRoad, tmpSum,calc;
        int roadsLength = road1.length;

        int sumRoad1 = sumArray(road1,0);
        int sumRoad2 = sumArray(road2,0);
        minRoad = Math.min(sumRoad1,sumRoad2);

        int tmpSumRoad1PartStart = 0;
        int tmpSumRoad2PartEnd = sumRoad2;
        int tmpSumRoad2PartStart = 0;
        int tmpSumRoad1PartEnd = sumRoad1;

        for (int i = 0; i < roadsLength-1; i++) {
            //start at road 1 and continue to road 2
            tmpSumRoad1PartStart += road1[i];
            tmpSumRoad2PartEnd -= road2[i];
            calc = tmpSumRoad1PartStart + tmpSumRoad2PartEnd;
            minRoad = Math.min(minRoad,calc);

            //start at road 2 and continue to road 1
            tmpSumRoad2PartStart += road2[i];
            tmpSumRoad1PartEnd -= road1[i];
            calc = tmpSumRoad2PartStart + tmpSumRoad1PartEnd;
            minRoad = Math.min(minRoad,calc);
        }

        return minRoad;
    }

    private static int sumArray(int[] arr, int i) {
        if(i == arr.length) return 0;
        return arr[i] + sumArray(arr,i+1);
    }

    public static int howManySorted(int n, int max) {
        return howManySorted(n,max,max);
    }
    public static int howManySorted(int n, int max, int prevI) {

        if (n == 0) return 1;
        if (prevI < max) return 0;
        int numComb = howManySorted(n-1,max,max) + howManySorted(n-1,max-1,max);

        return numComb;
    }

    private static int f(int[]a, int low, int high)//sum array
    {
        int res = 0;
        for (int i=low; i<=high; i++)
            res += a[i];
        return res;
    }

    public static boolean what (int[]a, int num) // return true if there is a sequence of numbers that their sum is equal to num.
    {
        int sumArr = f(a,0,a.length-1), sumRun = 0;

        for (int i=0; i<a.length; i++) {
            if (sumArr - sumRun == num) return true;

            sumRun += a[i];
        }
        return false;
    }

    public static int cntTrueReg (boolean[][]mat) {
        return countStains(mat,0,0,0);
    }
    private static int countStains (boolean[][]mat, int count, int i, int j) {

        if (i == mat.length) return count; //break


        if (checkStain(mat, i, j)) count++;

        if (j == mat[0].length - 1)
            return countStains(mat, count, i + 1, 0);
        return countStains(mat, count, i, j + 1);

    }
    private static boolean checkStain (boolean[][] mat, int i, int j) {
        if (i<0 || i>= mat.length || j < 0 || j >= mat[0].length) return false;
        if (mat[i][j] == false) return false;

        //first square is true
        mat[i][j] = false;

        boolean up = checkStain(mat,i-1,j); // false
        boolean down = checkStain(mat,i+1,j); // false
        boolean right = checkStain(mat,i,j+1); // false
        boolean left = checkStain(mat,i,j-1); // false

        return !(up && down && right && left);
    }

    public static int findNum(Range rangeA[], int num) { //5
        return findNum(rangeA, num, 0, rangeA.length-1);
    }

    //Time Complexity: O(log n), Space Complexity: O(1)
    public static int findNum(Range rangeA[], int num, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi-lo)/2;
        int currCenter = rangeA[mid].getCenter();
        int currRadius = rangeA[mid].getRadius();

        int maxSpan = currCenter + currRadius;
        int lowSpan = currCenter - currRadius;
        if (num <= maxSpan && num >= lowSpan) return mid;
        if (num < lowSpan) return findNum(rangeA,num,0,mid-1);
        return findNum(rangeA,num,mid+1,hi);
    }

    private static char[][] cloneArr(char[][] arr) {
        return cloneArr(arr,0,0,new char[arr.length][arr[0].length]);
    }
    private static char[][] cloneArr(char[][] arr,int i, int j, char[][] arrClone) {
        if (i >= arr.length) return arrClone; // break recursion
        arrClone[i][j] = arr[i][j];

        if (j == arr[0].length-1) // end of line go to next row
            return cloneArr(arr,i+1,0,arrClone);
        return cloneArr(arr,i,j+1,arrClone); // next cell
    }

    private static void runMat(char[][] arr, String word, int i, int j) {
        if (i >= arr.length) {
            System.out.println("No Such Word");
            return; // break recursion
        }
        if(word.charAt(0) == arr[i][j]) {
            int[][] traceArr = new int[arr.length][arr[0].length];
            boolean isWordFound = findWord(cloneArr(arr),word,i,j, traceArr,0);
            if (isWordFound) {
                print(traceArr,0,0);
                return; // word found no need to check for more words
            }

        }

        if (j == arr[0].length-1) // end of line go to next row
            runMat(arr,word,i+1,0);
        else if(j < arr[0].length) {
            runMat(arr, word, i, j + 1); // next cell
        }
    }
    public static void findWord(char [][] arr, String word) {
        runMat(arr, word, 0, 0);
    }

    // in order for this method to don't change original array, it has get a clone of the array.
    private static boolean findWord(char[][] arr, String word, int i, int j, int[][] traceArr, int letInd) {
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length) return false;
        if (letInd == word.length()) {

            return true;
        }
        if (arr[i][j] == word.charAt(letInd)) {
            traceArr[i][j] = letInd;
            letInd++;
        }
        else {
            return false;
        }

        boolean up = findWord(arr,word,i-1,j,traceArr,letInd); // up
        boolean down = findWord(arr,word,i+1,j,traceArr,letInd); // down
        boolean right = findWord(arr,word,i,j+1,traceArr,letInd); // right
        boolean left = findWord(arr,word,i,j-1,traceArr,letInd); // left

        if (!(up || down || right || left)) traceArr[i][j] = 0;

        return up || down || right || left;
    }

    public void findFactors(int n) {
        int p = binSearchHighFactor(n,1,n);
        int q = n/p;

        System.out.println("p = " + p + ", q = " + q);
    }
    // function returns the high factor
    public int binSearchHighFactor(int n, int lo, int hi) {
        if (lo > hi) return -1;
        if (lo == hi) return lo;
        int mid = lo + (hi-lo)/2;

        if (isHighFactorInRange(n,lo,mid)) { // is high val in left side
            return binSearchHighFactor(n,lo,mid);
        }
        return  binSearchHighFactor(n,mid+1,hi);

    }
    public boolean isHighFactorInRange(int n, int low, int high){
        return true;
    }

    public static Rectangle smallestRect1 (Point[] p) {
        int maxY = p[0].getY();
        int minY = p[0].getY();
        int maxX = p[0].getX();
        int minX = p[0].getX();

        for (int i = 1; i < p.length; i++) {
            int currX = p[i].getX();
            int currY = p[i].getY();
            maxY = Math.max(maxY,currY);
            minY = Math.min(minY,currY);
            maxX = Math.max(maxX,currX);
            minX = Math.min(minX,currX);
        }

        int length = maxY - minY;
        int width = maxX - minX;

        return new Rectangle(length,width,new Point(minX,minY));
    }

    public static Rectangle smallestRect2(Point [] p) {

        int divInd = lastXind(p,0,p.length);
        int minX = Math.min(p[0].getX(),p[divInd+1].getX());
        int maxX = Math.max(p[divInd].getX(),p[p.length-1].getX());

        int minY = p[0].getY();
        int maxY = p[p.length-1].getY();

        int length = maxY - minY;
        int width = maxX - minX;

        return new Rectangle(length,width,new Point(minX,minY));
    }

    private static int lastXind(Point[] p, int lo, int hi) {
        if (lo >= hi) return 0;

        int mid = lo + (hi-lo)/2;
        if (p[mid].getY() !=  p[mid+1].getY()) {
            return mid;
        }
        if (p[lo].getY() ==  p[mid].getY())
            return lastXind(p,mid,hi);
        return lastXind(p,lo,mid);
    }

    public static void fillHadamard (int[][] mat) {
        fillHadamard(mat,0,0,mat.length, 1);
    }
    private static void fillHadamard (int[][] mat, int i, int j, int n, int sign) {
        if (n > mat.length) return;
        if (n == 1) {
            mat[i][j] = sign;
        } else {
            fillHadamard(mat, i, j,n,sign);
            fillHadamard(mat,i+n/2,j,n,sign);
            fillHadamard(mat, i, j+n/2,n,sign);
            fillHadamard(mat,i+n/2,j+n/2,n,-1*sign);
        }
    }

    public static int edit (String str1, String str2) {
        int lcs = lcs(str1,str2,str1.length()-1,str2.length()-1);
        int minDel = str1.length() - lcs;
        int minIns = str2.length() - lcs;

        return minIns + minDel;
    }

    //sunday
    //saturday
    //lcs = s+u+day = 5
    private static int lcs (String str1, String str2, int i, int j) { //longest common subsequence
        if (i == 0 || j == 0) return 0;
        if (str1.charAt(i) == str2.charAt(j)) {
            return 1 + lcs(str1,str2,i-1,j-1);
        }
        return lcs(str1,str2,i,j-1) + lcs(str1,str2,i-1,j);
    }

    public static int countTriplets (int [] arr, int num) {
        int counter = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            // initialize left and right
            int l = i + 1;
            int r = arr.length - 1;

            while (l < arr.length-1) {
                if (r==l) {
                    r = arr.length-1;
                    l++;
                    continue;
                }
                if (arr[i] + arr[l] + arr[r] < num) {
                    counter++;
                }
                r--;
            }
        }

        return counter;
    }

    public static int countTriplets (int [] arr, int num, int i, int hi, int count) {
        if(i > hi) return 0;
        if (count == 2 && arr[i] < num) return 1;
        return countTriplets(arr,num,i+1,hi,0) + countTriplets(arr,num-arr[i],i+1,hi,count+1);
    }
    //O(log n)
    private static int binSearch5 (int[] arr, int num, int lo, int hi) {
        if(lo == hi) return lo;

        int mid = lo + (hi-lo)/2;
        if (arr[mid] < num && arr[mid+1] >= num) return mid; // found the divisor
        else if(arr[mid] < num) {
            return binSearch5(arr,num,mid+1,hi);
        }
        return binSearch5(arr,num,lo,mid);
    }

    public static void crossSort(int [] arr) {
        int[] arrTmp = new int[arr.length];

        int i=0,j,l=0;
        if (arr.length % 2 == 0) j = arr.length -1;
        else j = arr.length -2;

        while(l < arr.length) {
            if (j<0 || arr[i] < arr[j]) {
                arrTmp[l] = arr[i];
                i+=2;
            } else {
                arrTmp[l] = arr[j];
                j-=2;
            }
            l++;
        }
        for (int k = 0; k < arr.length; k++) {
            arr[k] = arrTmp[k];
        }
    }

    public static int crossSearch(int [] arr, int x) {
        int hiI,hiJ;
        if (arr.length % 2 == 0) {
            hiJ = arr.length -1;
            hiI = arr.length -2;
        }
        else {
            hiJ = arr.length -2;
            hiI = arr.length -1;
        }

        int binCrossSearchIndEven = binCrossSearch(arr,x,0,hiI,true);
        int binCrossSearchIndOdd = binCrossSearch(arr,x,1,hiJ,false);

        return Math.max(binCrossSearchIndOdd,binCrossSearchIndEven);
    }
    private static int binCrossSearch(int[] arr, int num, int lo,int hi, boolean even) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;

        if (!even) {
            if(mid%2 == 0) mid--;

            if (arr[mid] == num) return mid;
            if (arr[mid] < num) return binCrossSearch(arr,num,lo,mid-2,false);
            return binCrossSearch(arr,num,mid+2,hi,false);
        } else {
            if(mid%2 != 0) mid--;

            if (arr[mid] == num) return mid;
            if (arr[mid] > num) return binCrossSearch(arr,num,lo,mid-2,true);
            return binCrossSearch(arr,num,mid+2,hi,true);
        }
    }

    public static int totalWays(int[][] mat,int k) {
        return totalWays(mat,k,0,0,true);
    }
    private static int totalWays(int[][] mat, int k, int i, int j, boolean prevDown) {
        int down = 0,right = 0;

        if (i == mat.length-1 && j == mat[0].length-1) { // last cell
            if (k == 0) return 1; // 3 turns in this route
            else return 0;
        }
        if (i == mat.length || j == mat[0].length) return 0; // edge

        if (i == 0 && j == 0) {
            down = totalWays(mat,k,i+1,j,true);
            right = totalWays(mat,k,i,j+1,false);
        } else {
            if (prevDown) { // last move was down
                down = totalWays(mat, k, i + 1, j, true);
                right = totalWays(mat, k - 1, i, j + 1, false);
            } else { // last move was right
                down = totalWays(mat, k - 1, i + 1, j, true);
                right = totalWays(mat, k, i, j + 1, false);
            }
        }
        return down + right;
    }

    //Time Complexity: O(n^2), Space Complexity: O(1)
    public static void printTriplets (int[] a, int num) {
        int j, k,result;
        for (int i = 0; i < a.length-2; i++) {
            j = i + 1;
            k = a.length-1;
            while(j < k) {
                result = a[i] * a[j] * a[k];
                if (result == num) {
                    System.out.println(a[i] + " " + a[j] + " " + a[k] + " = " + result);
                    j++;k--;
                } else if (result < num) {
                    j++;
                } else {
                    k--;
                }
            }

        }
    }

    public static int maxSumKnight(int[][] mat) {
        int sum = maxSumKnight(mat, 0, 0, 0,mat[0][0]);
        return sum == 0 ? -1: sum;
    }
    private static int maxSumKnight(int[][] mat, int i, int j, int sum, int prevVal) {
        if (i < 0 || i >= mat.length || j < 0 || j >= mat[0].length) return 0;
        if (mat[i][j] == -1) return 0;
        if (Math.abs(mat[i][j] - prevVal) > 1) return 0;

        int tmp = mat[i][j];
        mat[i][j] = -1; // cell is visited
        sum += tmp;

        if (i == mat.length-1 && j == mat[0].length-1) return sum;

        int[] dir = new int[8]; // arranged clockwise starting from up right corner
        dir[0] = maxSumKnight(mat, i-2,j+1,sum,tmp);
        dir[1] = maxSumKnight(mat, i+1,j+2,sum,tmp);
        dir[2] = maxSumKnight(mat, i+1,j+2,sum,tmp);
        dir[3] = maxSumKnight(mat, i+2,j+1,sum,tmp);
        dir[4] = maxSumKnight(mat, i+2,j-1,sum,tmp);
        dir[5] = maxSumKnight(mat, i+1,j-2,sum,tmp);
        dir[6] = maxSumKnight(mat, i-1,j-2,sum,tmp);
        dir[7] = maxSumKnight(mat, i-2,j-1,sum,tmp);

        mat[i][j] = tmp; //return to original value

        return maxNum(dir);

    }
























    public static int findMaximum(int[][] mat) {
        if (mat[0][0] == 0) return -1;
        return findMaximum(mat,0,0,0);
    }
    public static int findMaximum(int[][] mat, int i, int j, int sum) {
        if (mat[i][j] != 1 && mat[i][j] != 0 || mat[i][j] == -1) { //not valid
            return sum;
        }
        if (i < 0 || i>=mat.length || j < 0 || j>=mat.length) return sum; //out of mat array

        sum += mat[i][j];

        int tmp = mat[i][j];
        mat[i][j] = -1;

        if (j % 2 == 0) {
            int right = findMaximum(mat,i,j+1,sum);
            int down = findMaximum(mat,i+1,j,sum);
            mat[i][j] = tmp;
            return Math.max(right,down);
        } else {
            int left = findMaximum(mat, i, j - 1, sum);
            int down = findMaximum(mat, i + 1, j, sum);
            mat[i][j] = tmp;
            return Math.max(left, down);
        }
    }

    public static int findMaxPrice(int[] prices, int n) { // 8
        return findMaxPrice(prices,n,1,0);
    }
    private static int findMaxPrice(int[] prices, int n, int i, int sum) {
        if (n < 0) return 0; // sum is not relevant
        if(n == 0) return sum+prices[i+1]; // sum is maybe the result


        return Math.max(findMaxPrice(prices,n-i,i,sum+prices[i]),findMaxPrice(prices,n-i-1,i+1,sum+prices[i]));
    }

    //O(n)
    public static int getMedian(int[] a, int[] b) {
        int[] c = mergeSort(a,b);
        int mid = (c.length-1)/2;
        if (c.length % 2 == 0) { //even
            return (c[mid] + c[mid+1])/2;

        } else { // odd
            return c[mid];
        }
    }

    public static int[] mergeSort(int[] a, int[] b) {
        int[] c = new int[a.length+b.length];

        int ai = 0;
        int bi = 0;
        int ci = 0;
        while(ai < a.length && bi < b.length) {
            if (a[ai] < b[bi]) {
                c[ci] = a[ai];
                ai++;
            } else {
                c[ci] = b[bi];
                bi++;
            }

            ci++;
        }

        if (ai == a.length) { // b is left
            for (int i = ci; i < c.length; i++) {
                c[ci] = b[bi];
            }
        } else { // a is left
            for (int i = ci; i < c.length; i++) {
                c[ci] = a[ai];
            }
        }

        return c;
    }

    public static int sumSubArr(int[] arr, int lo, int hi) {
        if (lo > hi) return 0;
        return arr[lo] + sumSubArr(arr,lo+1,hi);
    }

    public static boolean split3Equals(int[] arr) {
        return split3Equals(arr,0, sumSubArr(arr,0,arr.length-1), 0,0);
    }

    public static boolean split3Equals(int[] arr, int i, int sumAll, int sumA, int sumB) {
        System.out.println("A: " + sumA + ", B: " + sumB + ", C: " + (sumAll-sumA-sumB));
        if (sumA == sumB && sumA == sumAll-sumA-sumB)
            return true;
        if (i == arr.length) return false;

        boolean a = split3Equals(arr, i+1,sumAll,sumA+arr[i],sumB);
        boolean b = split3Equals(arr, i+1,sumAll,sumA,sumB+arr[i]);
        boolean k = split3Equals(arr,i+1,sumAll,sumA,sumB);

        return a || b || k;
    }

    //Time Complexity: O(n), Space Complexity: O(1)
    public static int arrLenSub(int[] arr, int k) {
        int counter = 0;
        int hi = 0;
        int lo = 0;
        int min = arr.length;

        while (hi < arr.length && lo < arr.length) {

            if (k <= 0) {
                counter--;
                k += arr[lo];
                lo++;
                min = Math.min(min,counter);
            } else {
                counter++;
                k -= arr[hi];
                hi++;
            }
        }

        return min;
    }

    public static boolean sumPower3(int num) {
        return sumPower3(num, 0,0);
    }

    private static boolean sumPower3(int num, int i, int sum) {
        int currNum = (int)Math.pow(3,i);
        if (sum == num) return true;
        if(sum > num || currNum > num-sum) return false;

        return sumPower3(num, i+1,sum) || sumPower3(num, i+1,sum+currNum);
    }

    
}

