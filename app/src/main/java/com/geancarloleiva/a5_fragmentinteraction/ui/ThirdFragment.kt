package com.geancarloleiva.a5_fragmentinteraction.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentResultListener
import com.geancarloleiva.a5_fragmentinteraction.R
import com.geancarloleiva.a5_fragmentinteraction.controller.MainActivity
import com.geancarloleiva.a5_fragmentinteraction.controller.OperationsActivity
import com.geancarloleiva.a5_fragmentinteraction.interfaces.Operations

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ThirdFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThirdFragment : Fragment() {

    lateinit var fragmentView: View
    //2nd form to interact with Activity
    lateinit var operations: Operations

    // TODO: Rename and change types of parameters
    /*private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentView = inflater.inflate(R.layout.fragment_third, container, false)

        val btnChange: Button = fragmentView.findViewById(R.id.btnChange)
        btnChange.setOnClickListener{
            //1rst way to interact with Activity
            (activity as OperationsActivity).changeBtnTextDirectly("new 1", "new 2", "new 3")
        }

        val btnOldText: Button = fragmentView.findViewById(R.id.btnOldText)
        btnOldText.setOnClickListener{
            //2nd form to interact with Activity
            activity?.let {
                operations = context as Operations
                operations.changeBtnText("not new 1", "not new 2", "not new 3")
            }
        }

        return fragmentView
    }

    /*companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ThirdFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ThirdFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }*/
}