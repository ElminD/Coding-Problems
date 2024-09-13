public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length != t.Length) return false;
        if(s == t) return true;

        Dictionary<char, int> Dict_S = new Dictionary<char, int>();
        Dictionary<char, int> Dict_T = new Dictionary<char, int>();

        for (int i = 0; i < s.Length; i++)
        {
            Dict_S[s[i]] = 1 + (Dict_S.ContainsKey(s[i]) ? Dict_S[s[i]] : 0 );
            Dict_T[t[i]] = 1 + (Dict_T.ContainsKey(t[i]) ? Dict_T[t[i]] : 0 );
        }

        foreach (char c in Dict_S.Keys) {
            int tCount = Dict_T.ContainsKey(c) ? Dict_T[c] : 0;
            if (Dict_S[c] != tCount) return false;
        }

        return true;
    }
}