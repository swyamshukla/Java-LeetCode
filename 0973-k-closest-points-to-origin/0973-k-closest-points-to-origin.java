class Solution {
    public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a,b)->b.power-a.power);

    for(int i=0;i<points.length;i++){

        int square=0;
        for(int j=0;j<2;j++){
            square+=(points[i][j]*points[i][j]);
        }
        maxHeap.add(new Pair(i,square));
        if(maxHeap.size()>k){
            maxHeap.remove();
        }

    }
    int[][] result = new int[k][2];

    for(int i=0;i<k;i++){
        Pair opt = maxHeap.remove();
        result[i]=points[opt.idx];
    }



    return result;
    }
}

class Pair{
    int idx;
    int power;
    Pair(int idx,int power){
        this.idx=idx;
        this.power=power;
    }
}