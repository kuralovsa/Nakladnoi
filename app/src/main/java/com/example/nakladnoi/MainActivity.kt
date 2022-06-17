package com.example.nakladnoi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calculate:Button = findViewById(R.id.button)


        calculate.setOnClickListener {
            val O1:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter19).text.toString()).toInt()
            val O2:Int  =Integer.valueOf(findViewById<TextView>(R.id.counter33).text.toString()).toInt()
            val O3:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter34).text.toString()).toInt()
            val O4:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter20).text.toString()).toInt()
            val O5:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter21).text.toString()).toInt()
            val O6:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter22).text.toString()).toInt()
            val O7:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter23).text.toString()).toInt()
            val O8:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter24).text.toString()).toInt()
            val O9:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter25).text.toString()).toInt()
            val O10:Int =Integer.valueOf(findViewById<EditText>(R.id.counter26).text.toString()).toInt()
            val O11:Int =Integer.valueOf(findViewById<EditText>(R.id.counter27).text.toString()).toInt()
            val O12:Int =Integer.valueOf(findViewById<EditText>(R.id.counter28).text.toString()).toInt()
            val O13:Int =Integer.valueOf(findViewById<EditText>(R.id.counter29).text.toString()).toInt()
            val O14:Int =Integer.valueOf(findViewById<EditText>(R.id.counter30).text.toString()).toInt()
            val O15:Int =Integer.valueOf(findViewById<EditText>(R.id.counter31).text.toString()).toInt()
            val O16:Int =Integer.valueOf(findViewById<EditText>(R.id.counter32).text.toString()).toInt()
            val c1:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter2).text.toString()).toInt()
            val c2:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter3).text.toString()).toInt()
            val c3:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter4).text.toString()).toInt()
            val c4:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter5).text.toString()).toInt()
            val c5:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter6).text.toString()).toInt()
            val c6:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter7).text.toString()).toInt()
            val c7:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter8).text.toString()).toInt()
            val c8:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter9).text.toString()).toInt()
            val c9:Int  =Integer.valueOf(findViewById<EditText>(R.id.counter10).text.toString()).toInt()
            val c10:Int =Integer.valueOf(findViewById<EditText>(R.id.counter11).text.toString()).toInt()
            val c11:Int =Integer.valueOf(findViewById<EditText>(R.id.counter12).text.toString()).toInt()
            val c12:Int =Integer.valueOf(findViewById<EditText>(R.id.counter13).text.toString()).toInt()
            val c13:Int =Integer.valueOf(findViewById<EditText>(R.id.counter14).text.toString()).toInt()
            val c14:Int =Integer.valueOf(findViewById<EditText>(R.id.counter15).text.toString()).toInt()
            val c15:Int =Integer.valueOf(findViewById<EditText>(R.id.counter16).text.toString()).toInt()
            val c16:Int =Integer.valueOf(findViewById<EditText>(R.id.counter17).text.toString()).toInt()
            val p1:Int  =Integer.valueOf( findViewById<EditText>(R.id.price2).text.toString()).toInt()
            val p2:Int  =Integer.valueOf( findViewById<EditText>(R.id.price3).text.toString()).toInt()
            val p3:Int  =Integer.valueOf( findViewById<EditText>(R.id.price4).text.toString()).toInt()
            val p4:Int  =Integer.valueOf( findViewById<EditText>(R.id.price5).text.toString()).toInt()
            val p5:Int  =Integer.valueOf( findViewById<EditText>(R.id.price6).text.toString()).toInt()
            val p6:Int  =Integer.valueOf( findViewById<EditText>(R.id.price7).text.toString()).toInt()
            val p7:Int  =Integer.valueOf( findViewById<EditText>(R.id.price8).text.toString()).toInt()
            val p8:Int  =Integer.valueOf( findViewById<EditText>(R.id.price9).text.toString()).toInt()
            val p9:Int  =Integer.valueOf(findViewById<EditText>(R.id.price10).text.toString()).toInt()
            val p10:Int =Integer.valueOf(findViewById<EditText>(R.id.price11).text.toString()).toInt()
            val p11:Int =Integer.valueOf(findViewById<EditText>(R.id.price12).text.toString()).toInt()
            val p12:Int =Integer.valueOf(findViewById<EditText>(R.id.price13).text.toString()).toInt()
            val p13:Int =Integer.valueOf(findViewById<EditText>(R.id.price14).text.toString()).toInt()
            val p14:Int =Integer.valueOf(findViewById<EditText>(R.id.price15).text.toString()).toInt()
            val p15:Int =Integer.valueOf(findViewById<EditText>(R.id.price16).text.toString()).toInt()
            val p16:Int =Integer.valueOf(findViewById<EditText>(R.id.price17).text.toString()).toInt()

            val so1 =   O1+p1
            val so2 =   O2*p2
            val so3 =   O3*p3
            val so4 =   O4*p4
            val so5 =   O5*p5
            val so6 =   O6*p6
            val so7 =   O7*p7
            val so8 =   O8*p8
            val so9 =   O9*p9
            val so10 = O10*p10
            val so11 = O11*p11
            val so12 = O12*p12
            val so13 = O13*p13
            val so14 = O14*p14
            val so15 = O15*p15
            val so16 = O16*p16
            val textView =  findViewById<TextView>(R.id.labelItog3)
            textView.text = (so1+so2+so3+so4+so5+so6+so7+so8+so9+so10+so11+so12+so13+so14+so15+so16).toString()
            println(so1+so2+so3+so4+so5+so6+so7+so8+so9+so10+so11+so12+so13+so14+so15+so16)
            println(O15)
            println(O1)
            val sc1 =   c1*p1
            val sc2 =   c2*p2
            val sc3 =   c3*p3
            val sc4 =   c4*p4
            val sc5 =   c5*p5
            val sc6 =   c6*p6
            val sc7 =   c7*p7
            val sc8 =   c8*p8
            val sc9 =   c9*p9
            val sc10 =  c10*p10
            val sc11 =  c11*p11
            val sc12 =  c12*p12
            val sc13 =  c13*p13
            val sc14 =  c14*p14
            val sc15 =  c15*p15
            val sc16 =  c16*p16
            val textView1 =  findViewById<TextView>(R.id.labelItog2)
            textView1.text = ((sc1+sc2+sc3+sc4+sc5+sc6+sc7+sc8+sc9+sc10+sc11+sc12+sc13+sc14+sc15+sc16).toString())
            println((sc1+sc2+sc3+sc4+sc5+sc6+sc7+sc8+sc9+sc10+sc11+sc12+sc13+sc14+sc15+sc16).toString())
            val itog = findViewById<TextView>(R.id.itog)
                itog.text = (so1+so2+so3+so4+so5+so6+so7+so8+so9+so10+so11+so12+so13+so14+so15+so16+sc1+ sc2+ sc3+ sc4+ sc5+ sc6+ sc7+ sc8+ sc9+ sc10+ sc11+ sc12+ sc13+ sc14+ sc15+ sc16).toString()
        }
    }
}