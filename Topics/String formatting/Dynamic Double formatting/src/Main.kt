fun doubleFormat(value: Double, width: Int, precision: Int): String {
    val a = String.format("%${width}.${precision}f", value)
    return a



}