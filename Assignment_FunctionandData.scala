

object Assignment_FunctionandData {
  def main(args:Array[String]){
    
    
    var acc1=new Account("1","A",1000)
    var acc2=new Account("2","B",-2000)
    var acc3=new Account("3","C",3000)
    var acc4=new Account("4","D",-4000)
    var acc5=new Account("5","E",5000)
    var acc6=new Account("6","F",-6000)
    
   var bank:List[Account]=List(acc1,acc2,acc3,acc4,acc5,acc6)
   bank.foreach(element=>if(element.Balance<0)println(element.ID+" , "+element.accname+" , "+element.Balance))
   var x:Double=0
   bank.foreach(element=>x=x+element.Balance)
   println("Sum of All Balances = "+x)
   var y:Double=0
   var z:Double=0
   bank.foreach(element=>if(element.Balance>0)element.Balance=element.Balance+element.Balance*0.5)
   bank.foreach(element=>if(element.Balance<0)element.Balance=element.Balance+element.Balance*0.5)
   println("")
   println("Account List with New Balance")
   println("")
   bank.foreach(element=>println(element.ID+" , "+element.accname+" , "+element.Balance))
//   println(overdraft)
   

//   val interest=(bank:List[Account])=>b.map(....)

      val r1=new Rational(1,2)
      val r2=new Rational(1,4)
      val r3=r1+r2
      println(r1)
      println(r2)
      println(r3)
  
  } 
  
}
class Rational(x:Int,y:Int){
  require(y>0,"demomirator must be  grater than 0")
 private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b);
  def numer=x/gcd(math.abs(x:Int),y);
  def denome=y/gcd(math.abs(x:Int),y);
 
  def neg=new Rational(-this.numer,this.denome)
  def -(z:Rational)=new Rational(this.numer*z.denome-this.denome*z.numer,this.denome*z.denome)
  def +(z:Rational)=new Rational(this.numer*z.denome+this.denome*z.numer,this.denome*z.denome)
  override def toString=numer+"/"+denome
}
class Account(id:String,accountName:String,balance:Double){
  var accname=accountName
  var ID:String =id
  var Balance=balance
  
  def withdraw(a:Double) = this.Balance=this.Balance-a

  
  def transfer(i:Account,j:Double){
    
    this.Balance=this.Balance+j
    i.Balance=i.Balance-j
  }
  
  def deposit(a:Double) =this.Balance=this.Balance+a

}
