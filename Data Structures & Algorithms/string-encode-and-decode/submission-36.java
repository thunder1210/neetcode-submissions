class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
    List<String> res = new ArrayList<>();
    int c = 0;

    while (c < str.length()) {
        int place = str.indexOf("#", c); 
        int len = Integer.parseInt(str.substring(c, place)); 
        res.add(str.substring(place + 1, place + 1 + len)); 
        c = place + 1 + len; 
    }
    return res;
}
}
