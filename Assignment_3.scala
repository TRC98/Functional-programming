

object Assignment_3 {
  
   var x:Int=0
  var num:Int=0
  
  
  ////OUESTION 1 ANSWER
 def is_prime(n:Int){
    num=n
    x=n/2
    aa(n)
  }
  def aa(n:Int){
    
    if(x==1){
      println(num +" is a prime")
    }
    else if(num%x==0){
     println(num+" is not prime")
    }
    else{
      x=x-1
      aa(x)
    }
  
  }
  
  ////QUESTION 2 ANSWER
   def is_prime2(n:Int):Boolean={
    num=n
    x=n/2
   return bb(n)
  }
  def prime_sequence(n:Int){
    if(is_prime2(n))println(n)
    if(n>0)prime_sequence(n-1)
  }
    def bb(n:Int):Boolean={
    
    if(x==1){
      return true
    }
    else if(x==0){
      return false
    }
    else if(num%x==0 ){
     return false
    }
    else{
      x=x-1
      bb(x)
    }
  }
    
  ////QUESTION 3 ANSWER
  def Addition_of_numbers(n:Int):Int={
    if(n==1){
      return 1;
    }
    else{
      var x:Int=n+Addition_of_numbers(n-1)
      return x
    }
  }
  
  
  ////QUESTION 4 ANSWER
  def even_odd(n:Int):String={
    if(n==1){
      
      return "Odd"
    }
    if(n==0){
      return "Even"
    }
    else{
      var x:Int=n-2
      even_odd(x)
    }
  }
  
  
  ////QUESTION 5 ANSWER
  def addition_of_even(n:Int):Int={
    if(n==0){
      return 0
    }
    if(n%2==1){
     return addition_of_even(n-1)
    }
    else{
      var x:Int=n+addition_of_even(n-2)
      return x
    }
  }
  
  
  
  ////QUESTION 6 ANSWER
  def print_fibbonaci(n:Int){
    println(fibbonaci(n))
    if(n>0)print_fibbonaci(n-1)
  }
  def fibbonaci(n:Int):Int={
    if(n==0){
      return 0
    }
    if(n==1){
      return 1
    }
    else{
      var x:Int=fibbonaci(n-1)+fibbonaci(n-2)
      return x
    }
  }
  
  
  def main(args:Array[String]){
    println("Question 1")
    is_prime(10)
    println("")
    
    println("Question 2")
    println("Prime number sequence of under 10")
    prime_sequence(10)
    println("")
    
    println("Question 3")
    println("Addition of numbers 1 to 5 ="+Addition_of_numbers(5))
    println("")
    
    println("Question 4")
    println("11 is an " +even_odd(11)+" number")
    println("")
    
    println("Question 5")
    println("Addition of evens less than to 9 ="+addition_of_even(9))
    println("")
    
    println("Question 6")
    println("First 5 Fibbonaci list is ")
    print_fibbonaci(5)
   
   }
}