package buu.informatics.s59161073.parkingv1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import buu.informatics.s59161073.parkingv1.R
import buu.informatics.s59161073.parkingv1.databinding.FragmentInfoBinding

/**
 * A simple [Fragment] subclass.
 */
class InfoFragment : Fragment() {
    private lateinit var binding: FragmentInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_info, container, false)
        return binding.root
    }


}
