import java.util.*
import kotlin.collections.ArrayList

/*fun main(args: Array<String>){//fun <название>(<название>: <тип>)
    print("...")
}*/
/*fun main(args: Array<String>) = print(".")//, но можно не ставить*/
//точка входа - fun main()
/*fun main(args: Array<String>): Unit{//все равно что void
    print("...")

    //var demo = "demo"//сам берет min тип, который доступен. можно не прописывать
    //val - неизм(конст); var - изм
    var demo : Int = 5//нет примитивных типов. все типы объектные
    my_fun(demo)//было 4 байта, после этой строки произошло заворачивание в обертку => 24
}

fun my_fun(arg: Int): String = arg;
*/
//fun demo(arg: String): String = arg;



/*fun main(args: Array<String>): Unit{//все равно что void
    //var demo : Int = 5;
    print(culcSum(1, 2))
}
fun culcSum(a : Int, b : Int) : Int = a + b;*/


/*fun main(args: Array<String>): Unit{//все равно что void
    //типы надо приводить самому
    print(taxes(100.0))
}
fun taxes(income : Double, p : Double): Double {
    //млжно было задать значения по умолчанию (income : Double = 100.0, p : Double)
    return income * p;
}
fun taxes(income : Double): Double {//перегрузка операторов
    var p = 0.13;
    return income * p;
}*/

/*fun main(args: Array<String>): Unit{
    var value = readLine()// = args[0].toDouble();
    if (value !is null) print(taxes(value.toDouble()))//без проверки не компилится
    var demo : String? = null//без ? нельзя получить null(безопасн или нет типы)
    //после проверки()вннутри блока вместо String? будет String,
    //т.е. можно будет использовать все методы String безопасно
}
fun taxes(income : Double): Double {//перегрузка операторов
    var p = 0.13;
    return income * p;
}*/

/*fun main(args: Array<String>): Unit{
    //first();
    //second(1, 2);
    area();

    /*//аналог case
    when (x) {
       5 -> print("== 5")
       6,700 -> print("== 6 or == 700")
       in 1..10 -> print("x is in the range")
       in validNumbers -> print("x is valid")
       !in 10..20 -> print("x is outside the range")
       else -> print("none of the above")
    }*/
}

fun first(){
    println("Введите фамилию: ".toString());
    var s1 : String
    s1 = readLine().toString();
    println("Введите имя: ".toString());
    var s2 : String = readLine().toString();
    println("Фамилия: " + s1);
    println("Имя: " + s2);
    return
}

fun second(a : Int, b : Int){
    print(a * b);
    return;
}

fun area(){
    var a1 : Int = readLine()!!.toInt()
    var a2 : Int = readLine()!!.toInt()
    second(a1, a2);
    return;
}*/

/*fun main(args: Array<String>): Unit{
    val n = 10;
    for (i in 0..n step 1)/*границы включительно с шаком 1(можно не писать)*/{}
    //for (temp in args)/*проход по массиву*/{}
    /*var array = emptyArray<>()
    array = arrayOf("111", "222");*/
    var array2 = Array<String>(5){"0"}/*все будут 0*/
    //{i -> i.toString()} /*все будут равны индексам*/
    for (temp in array2){
        println(temp);
    }
}*/
/*fun main(args: Array<String>): Unit{
    /*val n = 5;

    var array2 = Array<Int>(n){i -> Random().nextInt() % 10 + 10}//случайные числа от 10 до 20
    var sum : Int = 0;
    for (temp in array2){
        sum += temp
        println(temp);
    }
    println();
    println(sum);*/
    //s();
    //matrix1();
}*/

/*fun s(){
    var n : Int = readLine()!!.toInt();
    var sum : Int = 0;
    var a : Int;
    for (i in 0.. n - 1)
    {
        a = readLine()!!.toInt();
        sum += a;
    }
    println(sum);
    println(sum.toDouble() / n.toDouble())
    return
}

fun matrix1()
{
    var n : Int = 3;
    var m = Array<Array<Int>>(n){
        i -> arrayOf(Random().nextInt() % 10, Random().nextInt() % 10, Random().nextInt() % 10)}
    //лямбда-выражение можно писать без стрелки, если не нужны аргументы
    for (array in m){
        for (temp in array)
            print1(temp, " ")
        println()
    }
    return
}

fun print1(temp: Int, s: String) {
    print(temp);
    print(s)
    return
}*/
/*fun main(args: Array<String>): Unit{
    var s = "Demo 11 23 4"
    s.toLowerCase()
    var list = s.split(" ")//символ, по которому происходит разделение
    for (temp in list)
        println(temp)
}*/
/*fun main(args: Array<String>): Unit{
    var test = myClass();

}
/*class myClass{//можно не по названию файла
    //обязательно начальное значение
    //либо
    lateinit var name : String//если назначим позже
    //...(какие-то еще пол и методы)
}*/

class myClass(var name: String = "1") {
    //переменным, которые описаны в первичном конструкторе,
    //не обязательно задавать начальные значения
    //если что-то есть в первичном конструкторе, то не надо объявлять еще раз
    //var name : String = ""
    constructor(name: String, surname: String) : this(name){
        //обязателен вызов первичного конструктора
        this.name += " $surname"
    }
}*/


/*fun main(args: Array<String>): Unit{
    var test = Person("player");
    println(test.toString())
    test.deathPenalty()
    println(test.toString())
}

class Item(/*какие-то парамерты предмета*/)

data class Person(var name : String,
                  private var lvl : Int = 1,
                  var hp : Double = 100.0,
                  var xp : Int = 0,
                  var nextLvlXp : Int = 10){
    var list = ArrayList<Item>();
    fun getXp(gainedXp : Int){
        xp += gainedXp//можно обращаться как this.xp
        if (xp >= nextLvlXp)
            lvlUp()
    }
    fun lvlUp(){
        lvl += 1;
        println("Lvl up!")
        xp = 0;
    }
    fun deathPenalty(){
        xp /= 2
        hp = 0.05 * hp
    }
    fun dropThing(){}
    fun storeThing(){}
    /*override fun toString(): String {
        return ...//сложение строк пишем руками. либо data-класс(но от него нельзя наследоваться)
        //будет в формате: Person(name=player, lvl=1, hp=100.0, xp=0, nextLvlXp=10)
    }*/
}*/

fun main(args: Array<String>): Unit{
    //var test = Person("player");
    //println(test.toString())

}

open class Person//по умолчанию все классы закрыты, т.е. от них нельзя наслодоваться
                  //поэтому нужно слово open
                  (var name : String,
                  private var lvl : Int = 1,
                  var hp : Double = 100.0,
                  var xp : Int = 0,
                  var nextLvlXp : Int = 10){
    fun getXp(gainedXp : Int){
        xp += gainedXp
        if (xp >= nextLvlXp)
            lvlUp()
    }
    fun lvlUp(){
        lvl += 1;
        println("Lvl up!")
        xp = 0;
    }
    fun deathPenalty(){
        xp /= 2
        hp = 0.05 * hp
    }
                                        }
fun Person.myCoolHicking(gainedXp: Int){//функции расширениею. там, где нельзя наследоваться
    xp +=gainedXp
    lvlUp();
}

open class Item(var cost : Int = 10,
                var lvlOfPer : Int = 1) {}

open class Weapon(private var lvl : Int = 1,
                  var damage : Int = 5) : Item() {}


class Monster(name: String) : Person(name){
    //override что-нибудь
}
