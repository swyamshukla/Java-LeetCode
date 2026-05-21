class Solution {
    public String reorganizeString(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        } 
        // count freq 

        // a maxHeap
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.freq-a.freq);

        for(char ch:map.keySet()){
            pq.add(new Pair(map.get(ch),ch));
        }
        StringBuilder str = new StringBuilder();
        Pair prev= new Pair(0,'#');
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            str.append(curr.ch);
            curr.freq--;
            if(prev.freq>0) pq.add(prev);
            prev=curr;
        }
        if(str.length()!=s.length()) return "";
        return str.toString();



    }
}

class Pair {
    int freq;
    char ch;

    Pair(int freq, char ch) {
        this.freq = freq;
        this.ch = ch;
    }

}