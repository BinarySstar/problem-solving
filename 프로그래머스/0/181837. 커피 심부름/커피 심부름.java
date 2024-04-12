class Solution {
    public int solution(String[] order) {
        int price = 0;
        for (String item : order) {
            if (item.contains("iceamericano") || item.contains("hotamericano") || item.contains("americano")) {
                price += 4500;
            } 
            else if (item.contains("icecafelatte") || item.contains("hotcafelatte") || item.contains("cafelatte")) {
                price += 5000;
            } 
            else if (item.contains("anything")) {
                price += 4500;
            }
        }
        return price;
    }
}