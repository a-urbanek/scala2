val x = {
  val offset = 1;
  {
    val x = 2
    val offset = 10
    x + offset
  } +
  {
    val x = 5
    x + offset
  }
}