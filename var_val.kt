fun main(){
  var name = "shoaib"  //String
  val roll = 116     //Int

  var job: String = "S.E"
  val sal: Int = 99999

  // You can't reassign a value to a variable that was declared using val . Use var for a variable whose value can change.

  val k =  "shoaib"
  k = "ahmed" //generates error

  var l = "shoaib"
  l = "ahmed"

  val fname = "shoaib"
  val lname = "ahmed"
  val fullname = fname + lname
}
