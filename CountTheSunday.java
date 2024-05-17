/*Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends. 

So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.

Count the number of Sunday jack will get within n number of days.

 Example 1:

Input 

mon-> input String denoting the start of the month.

13  -> input integer denoting the number of days from the start of the month.

Output :

2    -> number of days within 13 days.

Explanation:

The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on.

Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another sunday. Total 2 sundays may fall within 13 days.*/


import java.util.Scanner;
import java.util.HashMap;
class CountTheSunday{
static int countTheNumberOfSunday(String d,int n){
HashMap<String,Integer>mp=new HashMap<>();
mp.put("sun",0);
mp.put("mon",1);
mp.put("tues",2);
mp.put("wed",3);
mp.put("thus",4);
mp.put("fri",5);
mp.put("sat",6);

int si=mp.get(d.toLowerCase());
int dus=(7-si)%7;
if(dus==0){
dus=7;
}

if(n<dus)return 0;

int rd=n-dus;
int res=1+(rd/7);
return res;
}
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
String d=sc.nextLine();
int n=sc.nextInt();
System.out.println(countTheNumberOfSunday(d,n));
sc.close();
}
}