package Strings;

public class Remove_Duplicates_String {
    /*public static void removeDuplicates(char s[], int n)
    {*/
       /* String ans="";
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                if(s[i]==s[j]){
                    break;     // We are breaking here because this caharacter is already
                }              // added to our answer because it was found earlier

            }
            if(j==i){          // The loop ends without breaking, it means this
                ans+=s[i];     // is the first occurence of this character in the string
            }                  // so we add this character to our answer
        }
        System.out.print(ans);
    }
    public static void main(String[] args)
    {
        char s[] = "aaabaababbccbccd".toCharArray();
        int n = s.length;
        removeDuplicates(s, n);*/
    public static void main(String[] args) {
        String str = "Ballooneenn";
        String str2 = " ";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(str2.indexOf(arr[i]) < 0){
                str2 += arr[i];
            };
        }
        System.out.println(str2);

        /*String str = "moon soon noon";
        String str2 = " ";
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int i1 = str2.indexOf(arr[i]);

            if(i1 < 0){
                str2 += arr[i];
            }
        }
        System.out.println(str2);*/
    }
}
