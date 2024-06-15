package com.leetcode.rotatearray;


public class RotateArraySubmission {

    public void rotate(int[] nums, int k) {
        if(k <= 0 ) {
            return;  //if k is negative or 0, then don't need to do anything
        }
        if(nums.length==1) {
            return;  //if 1 element, then don't need to do anything
        }

        if(k % nums.length==0) { //Case 0
            return;  //After shifting we get the same array back. So no need to do anything
        }
        int n = nums.length;
        int s = k % nums.length;
        int r = n-s;

        if(n%2==0) {
            caseEven(nums,s);
        }
        else {
            caseOdd(nums,s);
        }
    }

    void caseEven(int[] nums, int s) {
        //System.out.println("Even");
        int n = nums.length;
        int r = n-s;
        if(r > s) {
            caseEvenRGreaterThanS(nums,s);
        }
        else if( r==s) {
            caseEvenREqualsS(nums,s);
        }
        else {
            caseEvenRLessThanS(nums,s);
        }
    }

    private void caseEvenREqualsS(int[] nums, int s) {
        //System.out.println("Even. r==s");
        //System.out.println("Odd. r<s");
        int n=nums.length;
        int r = n-s;
        int l= r-s;
        int m= l-s;
        //DebugUtil.printVariable("n",n);
        //DebugUtil.printVariable("r",r);
        //DebugUtil.printVariable("l",l);
        //DebugUtil.printVariable("m",m);

        //DebugUtil.printArray("nums", nums);

        int[] temp1 = new int[r];
        //Copy the elements that will be shifted
        for(int i=0; i<r; i++) {
            temp1[i] = nums[i];
        }
        //DebugUtil.printArray("temp1", temp1);

        int[] temp2 = new int[n-r];
        //Copy the elements that will be shifted
        for(int i=r; i<n; i++) {
            temp2[i-r] = nums[i];
        }
        //DebugUtil.printArray("temp2", temp2);

        int index=0;
        for(int i=0;i<temp2.length;i++) {
            nums[index] = temp2[i];
            index++;
        }
        for(int i=0;i<temp1.length;i++) {
            nums[index] = temp1[i];
            index++;
        }

    }

    private void caseEvenRLessThanS(int[] nums, int s) {
        //System.out.println("Even. r<s");

        int n=nums.length;
        int r = n-s;
        int l= r-s;
        int m= l-s;
        //DebugUtil.printVariable("n",n);
        //DebugUtil.printVariable("r",r);
        //DebugUtil.printVariable("l",l);
        //DebugUtil.printVariable("m",m);

        //DebugUtil.printArray("nums", nums);

        int[] temp1 = new int[r];
        //Copy the elements that will be shifted
        for(int i=0; i<r; i++) {
            temp1[i] = nums[i];
        }
        //DebugUtil.printArray("temp1", temp1);

        int[] temp2 = new int[n-r];
        //Copy the elements that will be shifted
        for(int i=r; i<n; i++) {
            temp2[i-r] = nums[i];
        }
        //DebugUtil.printArray("temp2", temp2);

        int index=0;
        for(int i=0;i<temp2.length;i++) {
            nums[index] = temp2[i];
            index++;
        }
        for(int i=0;i<temp1.length;i++) {
            nums[index] = temp1[i];
            index++;
        }

    }

    private void caseEvenRGreaterThanS(int[] nums, int s) {
        //System.out.println("Even. r>s");

        int n=nums.length;
        int r = n-s;
        int l= r-s;
        int m= l-s;
        //DebugUtil.printVariable("n",n);
        //DebugUtil.printVariable("r",r);
        //DebugUtil.printVariable("l",l);
        //DebugUtil.printVariable("m",m);

        //DebugUtil.printArray("nums", nums);

        int[] temp1 = new int[s];
        //Copy the elements that will be shifted
        for(int i=0; i<s; i++) {
            temp1[i] = nums[i];
        }
        //DebugUtil.printArray("temp1", temp1);

        int[] temp2 = new int[s];
        //Copy the elements that will be overwritten
        for(int i=0; i<s; i++) {
            temp2[i] = nums[i+s];
        }
        //DebugUtil.printArray("temp2", temp2);

        int[] temp3 = new int[l];
        //Copy the elements that will be overwritten
        for(int i=0; i<l; i++) {
            temp3[i] = nums[i+2*s];
        }
        //DebugUtil.printArray("temp3", temp3);

        int[] temp4 = new int[s];
        //Copy the elements that will be shifted
        for(int i=0; i<s; i++) {
            temp4[i] = temp3[i+m];
        }
        //DebugUtil.printArray("temp4", temp4);

        int[] temp5 = new int[m];
        //Copy the elements that will be shifted
        for(int i=0; i<m; i++) {
            temp5[i] = temp3[i];
        }
        //DebugUtil.printArray("temp5", temp5);

        int index=0;
        for(int i=0;i<temp4.length;i++) {
            nums[index] = temp4[i];
            index++;
        }
        for(int i=0;i<temp1.length;i++) {
            nums[index] = temp1[i];
            index++;
        }
        for(int i=0;i<temp2.length;i++) {
            nums[index] = temp2[i];
            index++;
        }
        for(int i=0;i<temp5.length;i++) {
            nums[index] = temp5[i];
            index++;
        }
    }

    void caseOdd(int[] nums, int s) {
        //System.out.println("Odd");
        int n = nums.length;
        int r = n-s;

        if(r > s) {
            caseOddRGreaterThanS(nums,s);
        }
        else if( r==s) {
            //Impossible Case
        }
        else {
            caseOddRLessThanS(nums,s);
        }
    }

    private void caseOddRLessThanS(int[] nums, int s) {
        //System.out.println("Odd. r<s");
        int n=nums.length;
        int r = n-s;
        int l= r-s;
        int m= l-s;
        //DebugUtil.printVariable("n",n);
        //DebugUtil.printVariable("r",r);
        //DebugUtil.printVariable("l",l);
        //DebugUtil.printVariable("m",m);

        //DebugUtil.printArray("nums", nums);

        int[] temp1 = new int[r];
        //Copy the elements that will be shifted
        for(int i=0; i<r; i++) {
            temp1[i] = nums[i];
        }
        //DebugUtil.printArray("temp1", temp1);

        int[] temp2 = new int[n-r];
        //Copy the elements that will be shifted
        for(int i=r; i<n; i++) {
            temp2[i-r] = nums[i];
        }
        //DebugUtil.printArray("temp2", temp2);

        int index=0;
        for(int i=0;i<temp2.length;i++) {
            nums[index] = temp2[i];
            index++;
        }
        for(int i=0;i<temp1.length;i++) {
            nums[index] = temp1[i];
            index++;
        }

    }

    private void caseOddRGreaterThanS(int[] nums, int s) {
        //System.out.println("Odd. r>s");
        int n=nums.length;
        int r = n-s;
        int l= r-s;
        int m= l-s;
        //DebugUtil.printVariable("s",s);
        //DebugUtil.printVariable("n",n);
        //DebugUtil.printVariable("r",r);
        //DebugUtil.printVariable("l",l);
        //DebugUtil.printVariable("m",m);

        //DebugUtil.printArray("nums", nums);

        int[] temp1 = new int[s];
        //Copy the elements that will be shifted
        for(int i=0; i<s; i++) {
            temp1[i] = nums[i];
        }
        //DebugUtil.printArray("temp1", temp1);

        int[] temp2 = new int[s];
        //Copy the elements that will be overwritten
        for(int i=0; i<s; i++) {
            temp2[i] = nums[i+s];
        }
        //DebugUtil.printArray("temp2", temp2);

        int[] temp3 = new int[l];
        //Copy the elements that will be overwritten
        for(int i=0; i<l; i++) {
            temp3[i] = nums[i+2*s];
        }
        //DebugUtil.printArray("temp3", temp3);

        if(l>1 && m>=0) {
            int[] temp4 = new int[s];
            //Copy the elements that will be shifted
            for (int i = 0; i < s; i++) {
                temp4[i] = temp3[i + m];
            }
            //DebugUtil.printArray("temp4", temp4);

            int[] temp5 = new int[m];
            //Copy the elements that will be shifted
            for (int i = 0; i < m; i++) {
                temp5[i] = temp3[i];
            }
            //DebugUtil.printArray("temp5", temp5);

            int index=0;
            for(int i=0;i<temp4.length;i++) {
                nums[index] = temp4[i];
                index++;
            }
            for(int i=0;i<temp1.length;i++) {
                nums[index] = temp1[i];
                index++;
            }
            for(int i=0;i<temp2.length;i++) {
                nums[index] = temp2[i];
                index++;
            }
            for(int i=0;i<temp5.length;i++) {
                nums[index] = temp5[i];
                index++;
            }
        }
        else if(l>1 && m<0) {

            int index=0;
            for(int i=l;i<temp2.length;i++) {
                nums[index] = temp2[i];
                index++;
            }
            for(int i=0;i<temp3.length;i++) {
                nums[index] = temp3[i];
                index++;
            }
            for(int i=0;i<temp1.length;i++) {
                nums[index] = temp1[i];
                index++;
            }
            for(int i=0;i<l;i++) {
                nums[index] = temp2[i];
                index++;
            }
        }
        else {
            int index=0;
            for(int i=l;i<temp2.length;i++) {
                nums[index] = temp2[i];
                index++;
            }
            for(int i=0;i<temp3.length;i++) {
                nums[index] = temp3[i];
                index++;
            }
            for(int i=0;i<temp1.length;i++) {
                nums[index] = temp1[i];
                index++;
            }
            for(int i=0;i<l;i++) {
                nums[index] = temp2[i];
                index++;
            }

        }
        //DebugUtil.printArray("nums", nums);
    }
    
}
