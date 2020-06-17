package PERULANGANdanKONDISI

fun main(){
    //FOR sederhana MAJU
    for (mulai:Int in 1..3){
        println("Kalimat ke-"+mulai)
    }
    print("\n") //baris baru

    //FOR sederhana mundur
    for (mulai1:Int in 3 downTo 1){
        println("Kalimat ke-"+mulai1)
    }
    print("\n") //baris baru

    //FOR menampilkan bil.Genap
    println("Bilangan Genap hingga 8")
    for (scanning:Int in 1..8){
        if (scanning % 2 == 0){
            println(scanning)
        }
    }
    print("\n") //baris baru

    //FOR melangkahi nilai tertentu
    for (scanning:Int in 1..9 step 3){
        println(scanning)
    }

    //FOR menampilkan bil.Genap CARA CEPAT
    println((1..8).filter {it % 2 == 0 })


    var jlh = -3
    for (scanning:Int in 1 downTo jlh){
            println("coba "+scanning)
    }


}