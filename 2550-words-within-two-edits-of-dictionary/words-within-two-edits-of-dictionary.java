class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list = new ArrayList<>();

        for(int i=0;i<queries.length;i++){
            for(int j=0;j< dictionary.length;j++){
                String q= queries[i];
                String d= dictionary[j];
                int cnt=0;
                for(int k=0;k<q.length();k++){
                    if(q.charAt(k)!=d.charAt(k)){
                        cnt++;
                    }
                    if(cnt>2)
                    {
                        break;
                    }
                    
                }
                if(cnt<=2){
                    list.add(q);
                    break;
                }

            }
        }
        return list;
    }
}