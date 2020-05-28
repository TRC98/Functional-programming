

object Assignment_2{
  
  object question_1{
      
    def take_home_salary(x:Int,y:Int):Int= {
     return (x*150+y*75)*90*4/100;
     }
  }
   
  
  object question_2{
    
    def best_ticket_price(x:Int):Int= {
       var attendance:Int=120+20*((15-x)/5)
       var value:Int=attendance*x
       var cost:Int=500+3*attendance
       var profit:Int= value-cost
       return profit
     }
  }
   
   def main(args: Array[String]){
     println("Answer to question 1")
     println("The take home salary is Rs" +question_1.take_home_salary(40,20))
     println(" ")
     println("Answers to question 2")
     println("profit of the film hall when price Rs.25 =Rs" +question_2.best_ticket_price(25))
     println("profit of the film hall when price Rs.30 =Rs" +question_2.best_ticket_price(30))
     println("profit of the film hall when price Rs.35 =Rs" +question_2.best_ticket_price(35))
     println("profit of the film hall when price Rs.40 =Rs" +question_2.best_ticket_price(40))
   }
}