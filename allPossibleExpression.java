public class allPossibleExpression {
    public static void posex(String num,int i,String s,int target,int ans){
        if(i ==  num.length()){
             if ( ans==target)System.out.println(s);
            return;
        }
        posex(num,i+1,s+"+"+num.charAt(i),target,ans+(num.charAt(i)-'0'));
        posex(num,i+1,s+"*"+num.charAt(i),target,ans*(num.charAt(i)-'0'));

    }
    public static void main(String[] args) {
        String s="123";

	posex(s,1,""+s.charAt(0),6,s.charAt(0)-'0');
    }
}