object Distance extends App {
    val kilometersPerHours: Float = 11
    val minutes: Float = 100
    val distance = kilometersPerHours * minutes / 60
    println(s"走った距離は${distance}キロメートルです")
}