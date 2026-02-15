/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* toggleLightBulbs(int* bulbs, int bulbsSize, int* returnSize) {
    int* ans = (int*)malloc(bulbsSize * sizeof(int));
    int* hash = (int*)calloc(101, sizeof(int));
    int j = 0;
    for(int i = 0; i < bulbsSize; i++) {
        hash[bulbs[i]] += 1;
    }
    for(int i = 1; i <= 100; i++) {
        if(hash[i] & 1  == 1) ans[j++] = i;
    }
    *returnSize = j;
    return ans;
}