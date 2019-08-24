package buu.informatics.s59161073.parkingv1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import buu.informatics.s59161073.parkingv1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private  val Park1: Park = Park("111","sasa","ssss")
    private  val Park2: Park = Park("","","")
    private  val Park3: Park = Park("","","")
    var park = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.slotOne.setOnClickListener {
            park = 1
            show()
        }
        binding.park1 = this@MainActivity.Park1
        binding.park2 = this@MainActivity.Park2
        binding.park3 = this@MainActivity.Park3

    }

    fun show() {
        if(park == 1){
            binding.apply {
                editText.setText(Park1?.no)
                editText2.setText(Park1?.brand)
                editText3.setText((Park1?.owner))
            }
        }
    }


}
