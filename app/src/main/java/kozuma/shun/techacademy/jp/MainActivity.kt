package kozuma.shun.techacademy.jp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Log.d("kotlintest", "ログへの出力テスト")

        /*
        var num = 10
        Log.d("kotlintest", Integer.toString(num))

        num = 50
        Log.d("kotlintest" , num.toString())


        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest", "10 + 5 - 2 * 4 / 2 = " + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3))


        val num = 60
        if(num >= 90){
            Log.d("kotlintest", "優")
        }else if(num >= 75){
            Log.d("kotlintest", "良")
        }else if(num >= 60){
            Log.d("kotlintest", "可")
        }else{
            Log.d("kotlintest", "不可")
        }


        val drink = 1
        when(drink){
            0 -> {
                Log.d("kotlintest", "コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest", "紅茶を注文しました")
            2 -> Log.d("kotlintest", "ミルクを注文しました")
            else -> Log.d("kotlintest", "オーダーミスです")

        }


        for(i in 1 until 6){
            Log.d("kotlintest", "for文の " + i +  "回目")
        }

        var num = 1

        while (num < 6){
            Log.d("kotlintest", "while文の " + num + "回目")
            num++
        }

        for(i in 1 .. 3){
            Log.d("kotlintest", "kこれは" + i)
        }

        for(i in 6 downTo 1 step 2){
            Log.d("kotlintest", "down" + i)
        }


        val points = arrayOf(10,6,15,23,17)

        for(i in points){
            Log.d("kotlintest", i.toString())
        }


        val num1 = 100
        val num2 = 0
        var ans = 0

        try{
            ans = num1 / num2
        }catch (e: Exception){
            Log.d("kotlintest", "0で割ろうとしました")
            Log.d("kotlintest", e.message)
        }finally {
            Log.d("kotlintest", "ans = " + ans.toString())
        }



        val t = total(50,1000)
        Log.d("kotlintest" ,t.toString())



        val dog = Dog("ポチ", 3)

        dog.say()
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")


        val dog2 = Dog("ハチ", 10)

        dog2.say()
        Log.d("kotlintest", "犬の名前は" + dog2.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog2.age + "歳です。")


        val bigdog = BigDog("ヨーゼフ", 15)
        bigdog.say()
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")


        val dog = Dog("ポチ",3)

        dog.move()

        */

        val human1 = Human("山田祐一", 22,"サッカー")

        human1.say()

        val human2 = Human("田中一郎",15,"野球")

        human2.think()



    }

    private fun total(first: Int ,last: Int): Int{
        var sum = 0
        for(i in first .. last){
            sum += i
        }
            return sum
    }

}
