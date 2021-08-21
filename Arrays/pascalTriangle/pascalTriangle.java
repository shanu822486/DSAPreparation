
//link to Question - https://leetcode.com/problems/pascals-triangle/

import java.util.*;

class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows <= 0)
            return res;
        if (numRows == 1) {
            List<Integer> p = new ArrayList<Integer>();
            p.add(1);
            res.add(p);
            return res;
        } else {
            List<Integer> q = new ArrayList<Integer>();
            q.add(1);
            res.add(q);
            numRows--;
            int size = 1;

            while (numRows-- > 0) {
                List<Integer> p = new ArrayList<Integer>();
                p.add(1);
                int is = res.size() - 1;
                for (int i = 1; i < size; i++) {
                    p.add(res.get(is).get(i - 1) + res.get(is).get(i));
                }
                p.add(1);
                size++;
                res.add(p);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int rows = 5;
        List<List<Integer>> triangle = generate(rows);      // should output:
        for(List<Integer> i : triangle)
            System.out.println(i);                          // [1]
                                                            // [1, 1]
                                                            // [1, 2, 1]
                                                            // [1, 3, 3, 1]
                                                            // [1, 4, 6, 4, 1]
    }
}
