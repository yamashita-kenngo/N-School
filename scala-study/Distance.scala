object Distance extends App {
    val kilometersPerHours: Double = 11
    val minutes: Double = 100
    val distance = kilometersPerHours * minutes / 60
    println(s"走った距離は${distance}キロメートルです")
}