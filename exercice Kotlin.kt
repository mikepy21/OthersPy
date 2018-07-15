import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*



fun main(args: Array<String>) {
    val n = 5

    val d = 4

    val a = arrayOf(1,2,3,4,5)


   // for (i in 0 until d){
 	//	rotationInvert(a)

    //}
    val newX = a
    for(i in 0 until d){
        newX = rotationEasyEasy(newX,d)
    }
     
    
    
    val finalStr = Arrays.deepToString(a)

    print (finalStr.toString()
    .replace(",", "")  //remove the commas
    .replace("[", "")  //remove the right bracket
    .replace("]", "") )
}
fun rotation(x:Array<Int>,j:Int): Array<Int> {
    val tam = x.size
    for (i in 0 until tam-j){
        //a = b.also { b = a }
        
        //a[i] = a[tam-i-1] { a[tam-i-1] = a[i] }

        //if((tam-i-2)<0)break
        
        if ((tam-i-2)<0) {
           	x[1] = x[0].also { x[0] = x[1]}
            break
        } else {
            x[tam-i-1] = x[tam-i-2].also { x[tam-i-2] = x[tam-i-1]}
        }
        
        //println(Arrays.deepToString(x))
        //run { val temp = a; a = b; b = temp }
        
    }
    return x
}

fun rotationInvert(x:Array<Int>) {
    val tam = x.size
    for (i in x.indices){
        //a = b.also { b = a }
        
        //a[i] = a[tam-i-1] { a[tam-i-1] = a[i] }

        //if((tam-i-2)<0)break
        
        if ((i+1)==tam) {
           	//x[1] = x[0].also { x[0] = x[1]}
            break
        } else {
            x[i] = x[i+1].also { x[i+1] = x[i]}
        }
        
        println(Arrays.deepToString(x))
        //run { val temp = a; a = b; b = temp }
        
    }

}
fun rotationEasy(x:Array<Int>, j:Int){
    var nP = j-1
    println(Arrays.deepToString(x))
     for (i in 0 until j){
         x[i] = x[nP].also { x[nP] = x[i]}
         nP=nP-1
         println(Arrays.deepToString(x))
     }
    println(Arrays.deepToString(x))
}

fun rotationEasyEasy(x:Array<Int>, j:Int):Array<Int>{
    var nP = j-1
    println(Arrays.deepToString(x))
    var y = x.asList()
    y+=0
 
    //x[i] = x[nP].also { x[nP] = x[i]}
     //y = listOf(0) + y
     //
    println(y.joinToString())

    	
    return y.toTypedArray()
}



