

object Assignment_caseClass {
  def main(args:Array[String]){
    val p1= point(2,3)
    val p2=point(1,4)
    
//    question1
    val p3=p1+p2
    println(p3)
    
//    question2
    val p4=p1.move(5, 6)
    println(p4)
    
//    question3
    val p5=p1.distance(p2)
    println(p5)
    
//    question4
    val p6=p1.invert()
    println(p6)
    
    
  }
}
case class point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  
  def +(p:point)=point(this.x+p.x,this.y+p.y)
  def move(dx:Int,dy:Int)=point(this.x+dx,this.y+dy)
  def distance(p:point)=point(this.x-p.x,this.y-p.y)
  def invert()=point(this.y,this.x)
  
}