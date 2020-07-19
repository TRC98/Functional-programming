
object assignment_ceacer {
   def main(args:Array[String]){
    var arr1=Array('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')
    
    while(true){
        println("")
        println("1.Encrypt message")
        println("2.Decrypt message")
        var n=scala.io.StdIn.readLine()
        if(n=="1"){
        println("Enter your message to encrypt in lower case:")
        var input=scala.io.StdIn.readLine()
        println("Enter the key number less than 26")
        var key= scala.io.StdIn.readInt()
        var count: Int=input.toCharArray.length
        var x:Int=count
        var arr2=new Array[Int](count)
        var j:Int=0
        for( i <- input){
         
          if(i.isLetter){
           
            var fl:Int=0
            
            while(i != arr1(fl)){
              fl=fl+1
              
          }
            if(fl>key-1){
              var ptr=(fl-key)
              print(arr1(ptr))
            }
            else{
              var ptr=(26+(fl-key))
              print(arr1(ptr))
            }
        }
          else{
            print(i)
          }
        
             j=j+1
        }
       }
        else if(n=="2"){
           println("Enter your message to decrypt in lower case:")
        var input=scala.io.StdIn.readLine()
        println("Enter the key number less than 26")
        var key= scala.io.StdIn.readInt()
            var count: Int=input.toCharArray.length
        var x:Int=count
        var arr2=new Array[Int](count)
        var j:Int=0
        for( i <- input){
         
          if(i.isLetter){
           
            var fl:Int=0
            
            while(i != arr1(fl)){
              fl=fl+1
              
          }
            if(fl<26-key){
              var ptr=fl+key
            print(arr1(ptr))
            
        }
            else{
               var ptr=((fl+key)%25)-1
            print(arr1(ptr))
            }
            }
             
        
          else{
            print(i)
          }
          j=j+1
       }
        }
    }
   
}
}
