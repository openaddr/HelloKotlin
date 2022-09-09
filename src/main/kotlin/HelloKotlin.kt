fun main() = println("Hello,kotlin")

/**
 * 函数的返回值可以是:
 *  1.Unit
 *  2.任何一个基本类型或引用类型
 *  3.lambda
 *
 */
/**
 * 前两种返回值的写法
 */
//返回值为空
fun unit() {
}

fun unit1() = Unit

//返回值为String
fun hello(): String {
    return "Hello,World"
}

fun hello1() = "Hello,world"

/**
 * 返回值为lambda的写法
 * 这种写法表示此函数的返回值是一个匿名函数(lambda)
 */
/**
 * 返回值是一个函数,此函数:
 *  1.没有入参
 *  2.返回值为Int
 */
fun notReally(): () -> Int = {
    2
}

fun notReally2(): Function<Int> = {
    2
}

fun notReally1() = { 2 }
/**
 * 返回值是一个函数,此函数:
 *  1.入参为String
 *  2.返回值为Int
 */
fun notReallyWith() = { str: String ->
    str.length
}

fun notReallyWith1(): (String) -> Int = { str: String ->
    str.length
}

fun notReallyWith2(): Function<Int> = { str: String ->
    str.length

    /// 1100
    ///
}