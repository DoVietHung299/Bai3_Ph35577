package com.example.bai3_ph35577

fun main(){
  val soA = 5
    var soB =10

    with(soB){
        soB =this.inc()
        println("So B: $soB")
    }


    val luyThuaBac3 = soA.let{
        val kq = it * it * it
        kq
    }

    val title : String? = "Buổi 3 - Android kotlin"
    val length = title.let {
        if (it == null){
            0
        }else{
            it.length
        }

    }
    println("Độ dài chuỗi: $title = $length")
    println("Tong 2 số $soA và $soB = ${tinhTong(soA, soB)}")
    println("Tích 2 số $soA và $soB = ${phepNhan(soA, soB)}")
    println("THương 2 số $soA và $soB = ${phepChia( soA.toFloat(), soB.toFloat() ) () }")
    println("Lũy thừa 2 số $soA là= ${luyThua( soA )  }")


}

val luyThua : (Int) -> Int={it * it}
val tinhTong = {soA: Int, soB: Int -> (soA+soB)}
val phepNhan : (Int, Int) -> Int =
    {soA: Int, soB: Int -> (soA*soB)}
val phepChia = {soA: Float, soB: Float -> {
    if (soB == 0f){
         "số bị chia phải khác 0!"
    } else{
        val kq = soA / soB
        kq
    }
}}


