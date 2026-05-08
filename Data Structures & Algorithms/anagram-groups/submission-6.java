class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

    for (String s : strs) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String key = new String(charArray); // 將排序後的字元陣列轉回字串

        // 修正點 2: 使用 computeIfAbsent 或檢查是否存在，並建立可變的 ArrayList
        if (!result.containsKey(key)) {
            result.put(key, new ArrayList<>());
        }
        result.get(key).add(s); // 這裡可以正常 add 了
    }

    // 修正點 3: 直接利用 ArrayList 的建構子轉換 Map 的 values
    return new ArrayList<>(result.values());
    }
}
