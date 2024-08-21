import kotlin.math.atan2
//Laura Ochoa (812805)
fun main(){
    /*suma()
    resta()
    println("La raiz es: ${raiz()}")
    println(cuadrado())
    println(saludo())
    division(12.0,2.0)
    println(multi(8.0,2.0))*/

    println("Menu de opciones:" +
            "\n1.suma" +
            "\n2.resta" +
            "\n3.Mutiplicacion" +
            "\n4.Division" +
            "\n5.Raiz" +
            "\n6.Cuadrado" +
            "\n7.Saludo"+
            "\n8.Salir")
    println("Ingresa un numero:")

    var estado =true
    while (estado){

        var indice = readln().toInt()

        if(indice == 1){
            suma()

        }else if(indice == 2){
            resta()

        }else if(indice == 3){
            println(multi(8.0,2.0))

        }else if(indice ==4){
            division(12.0,6.0)

        }else if(indice ==5){
            println("La raiz del numero es: ${raiz()}")

        }else if (indice ==6) {
            println("El cuadrado del numero es: ${cuadrado()}")

        }else if (indice == 7){
            println(saludo())
        }
        else if(indice == 8) {
            println("Saliste del menu")
            estado =false

        }else{
            println("Opcion invalida")

        }
        if (indice != 8) {
            println("¿Deseas continuar en el menu? \n1.Si \n2.No")
            var respuesta = readln()
            if (respuesta.toInt() != 1) {
                estado = false
                println("Saliste del menu")
            }
        }

    }

}

var n1 = 12.0
var n2 = 6

fun suma(){
    var suma = n1 +n2
    println("La suma es: $suma")
}
fun resta(){
    var resta = n1-n2
    println("la resta es: $resta")
}
fun raiz(): String {
    return String.format("%.2f",Math.sqrt(n1))// Para cantidad especifica de decimales//

}
fun cuadrado(): Double{
    return Math.pow(n1,2.0)

}
fun saludo(): String{
    return "Hola Mundo"
}
fun division(numero: Double, numero2: Double){
    var div = numero/numero2
    println("La division es: ${div}")
}
fun multi (n1:Double, n2:Double):String{
    return "La multiplicacion es:${(n1*n2)}"
}