public class MaxWordsFound {
    //https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    static int mostWordsFound(String[] sentences){
        int max = 0;
        for(String str : sentences){
            int length = str.split(" ").length;
            if(max < length){
                max = length;
            }
        }
        return max;
    }
}
