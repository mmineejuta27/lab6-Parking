package buu.informatics.s59161073.parkingv1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.informatics.s59161073.parkingv1.databinding.FragmentLoginBinding
import kotlinx.android.synthetic.main.fragment_login.*


/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {
    private lateinit var binding : FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  DataBindingUtil.inflate(inflater,R.layout.fragment_login, container, false)

        binding.loginButton.setOnClickListener {
            if(userLogin.text.toString() == "mine" && passLogin.text.toString() == "1234") {
                binding.loginButton.setOnClickListener {
                    view -> view.findNavController().navigate(R.id.action_loginFragment_to_meanFragment)
                }
            }
        }
        return binding.root
    }


}
