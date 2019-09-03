package buu.informatics.s59161073.parkingv1


import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.s59161073.parkingv1.databinding.FragmentMeanBinding


/**
 * A simple [Fragment] subclass.
 */
class MeanFragment : Fragment() {
    private lateinit var binding: FragmentMeanBinding
    private  val Park1: Park = Park("","","")
    private  val Park2: Park = Park("","","")
    private  val Park3: Park = Park("","","")
    var park = 1
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         binding = DataBindingUtil.inflate<FragmentMeanBinding>(inflater,R.layout.fragment_mean,container,false)
        binding.slotOne.setOnClickListener {
            park = 1
            show(it)
        }
        binding.slotTwo.setOnClickListener {
            park = 2
            show(it)
        }
        binding.slotThree.setOnClickListener {
            park = 3
            show(it)
        }
        binding.editButton.setOnClickListener {
            update(it)
        }
        binding.deleteButton.setOnClickListener {
            del(it)
            update(it)
        }
        binding.park1 = this@MeanFragment.Park1
        binding.park2 = this@MeanFragment.Park2
        binding.park3 = this@MeanFragment.Park3
        return binding.root
    }

    fun show(view: View) {
        if(park == 1){
            binding.apply {
                editText.setText(Park1?.no)
                editText2.setText(Park1?.brand)
                editText3.setText(Park1?.owner)
            }
        }else if(park == 2){
            binding.apply {
                editText.setText(Park2?.no)
                editText2.setText(Park2?.brand)
                editText3.setText(Park2?.owner)
            }
        }else if(park == 3){
            binding.apply {
                editText.setText(Park3?.no)
                editText2.setText(Park3?.brand)
                editText3.setText(Park3?.owner)
            }
        }
    }

    fun update(view: View){
        if(park == 1){
            binding.apply {
                Park1?.no = editText.text.toString()
                Park1?.brand = editText2.text.toString()
                Park1?.owner = editText3.text.toString()
                if (!editText3.text.toString().equals("")){
                    slotOne.setText("ไม่ว่าง")
                    slotOne.setBackgroundColor(Color.parseColor("#a9251d"))

                }
            }

        }else if(park == 2){
            binding.apply {
                Park2?.no = editText.text.toString()
                Park2?.brand = editText2.text.toString()
                Park2?.owner = editText3.text.toString()
                if (!editText3.text.toString().equals("")){
                    slotTwo.setText("ไม่ว่าง")
                    slotTwo.setBackgroundColor(Color.parseColor("#a9251d"))

                }
            }
        }else if(park == 3){
            binding.apply {
                Park3?.no = editText.text.toString()
                Park3?.brand = editText2.text.toString()
                Park3?.owner = editText3.text.toString()
                if (!editText3.text.toString().equals("")){
                    slotThree.setText("ไม่ว่าง")
                    slotThree.setBackgroundColor(Color.parseColor("#a9251d"))

                }
            }
        }
    }

    fun del(view: View) {
        if (park == 1) {
            binding.apply {
                editText.setText("")
                editText2.setText("")
                editText3.setText("")
                slotOne.setText("ว่าง 1")
                slotOne.setBackgroundColor(Color.parseColor("#FF008577"))
            }
        } else if (park == 2) {
            binding.apply {
                editText.setText("")
                editText2.setText("")
                editText3.setText("")
                slotTwo.setText("ว่าง 2")
                slotTwo.setBackgroundColor(Color.parseColor("#FF008577"))
            }
        } else if (park == 3) {
            binding.apply {
                editText.setText("")
                editText2.setText("")
                editText3.setText("")
                slotThree.setText("ว่าง 3")
                slotThree.setBackgroundColor(Color.parseColor("#FF008577"))
            }
        }
    }

}
