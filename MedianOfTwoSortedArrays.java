class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge sort
        int size = nums1.length + nums2.length;
        int[] sorted = new int[size];
        double result = 0.0;
        int lenOne = 0, lenTwo = 0, pos = 0;
        while (lenOne < nums1.length && lenTwo < nums2.length) {
            if (nums1[lenOne] <= nums2[lenTwo])
                sorted[pos++] = nums1[lenOne++];
            else
                sorted[pos++] = nums2[lenTwo++];
        }
        while (lenOne < nums1.length) 
            sorted[pos++] = nums1[lenOne++];
        while (lenTwo < nums2.length)
            sorted[pos++] = nums2[lenTwo++];
        // Get medium
        if (size % 2 == 0)
            result = (double)(sorted[size/2-1] + sorted[size/2]) / 2;
        else
            result = (double)sorted[size/2];
        return result;
    }

}