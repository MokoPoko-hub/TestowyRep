package pl.kalinowski.archiwum.testowyrep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        print("wojtek")



        metodaWojtek()


    }





    fun wojtekMetoda(){
        print("Elo")
    }



    fun metodaWojtek(){
        print("Wojtek")
    }


}