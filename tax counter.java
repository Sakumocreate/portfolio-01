class main{
public static void main (String[] args){

System.out.print("イートイン料金を自動で計算するよ！");

int value = 100; //ここに購入金額を挿入
double tax =1.08; //ここで税率を記載
double buy = value * tax; //代金×税率

System.out.println ("あなたの購入金額は"+buy+"円です");

if(buy >=500) {
System.out.println("お買い上げ、ありがとうございまーす！");} //一定金額以上ならありがとうございました！
else{System.out.println("店が干上がっちまうよ！出直して来な！！");} //一定金額以下なら詰ってくれます。 
if (Math.random() < 0.1) System.out.println("怒りに飲まれ財布が爆発した！"); //10%の確立で財布が爆発します。
 }
}
