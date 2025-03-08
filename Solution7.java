/*
278. First Bad Version
You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1) {
            return 1;
        }

        int temp = 0;
        int mid = n/2;

        for(int i=0; i<mid; i++) {
            if(isBadVersion(i)) {
                return i;
            }
            temp = i;
        }

        for(int j=temp; j<n; j++) {
            if(isBadVersion(j)) {
                return j;
            }
        }

        return n;
    }
}