object t0710 {
  def method: Unit = {
    sealed class Parent
    case object Child extends Parent
    val x: Parent = Child
    x match {
      case Child => ()
    }
  }
}
