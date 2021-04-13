package pl.kalinowski.archiwum.testowyrep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fun BartekMetoda()
        {
            System.out.println("Elo");
        }

        fun funkcja1()
        {
            System.out.println("Elo");
        }

        fun funkcja2()
        {
            System.out.println("Elo");
        }

        fun funkcja3()
        {
            System.out.println("Elo");
        }

        funkcja4();

        print("wojtek")
    }

    fun funkcja4()
    {
        System.out.println("Elo");
    }

    fun funkcja5()
    {
        System.out.println("Elo");
    }

    fun wojtekMetoda(){
        print("Elo")
    }
}