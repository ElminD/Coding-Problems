public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        Dictionary<string, IList<string>> res = new Dictionary<string, IList<string>>();

        foreach(string str in strs)
        {
            char[] alph = new char[26];
            foreach (char c in str) {
                alph[c - 'a']++;
            }

            string key = new string(alph);
             if (!res.ContainsKey(key)) {
                res[key] = new List<string>();
            }
            res[key].Add(str);
        }

        return res.Values.ToList();
    }
}