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
        int place = str.indexOf("#", c); // 找到 '*' 的位置
        int len = Integer.parseInt(str.substring(c, place)); // 解析出長度
        res.add(str.substring(place + 1, place + 1 + len)); // 從 '*' 後面開始，截取長度為 len 的字串
        c = place + 1 + len; // 下一個字串的起點為 '*' 後面加上 len 的位置
    }
    return res;
}
}
