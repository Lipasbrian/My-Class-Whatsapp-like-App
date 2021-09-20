
package com.brian.mylikewhatsappapplication

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.Toast

class ChatsFragment : Fragment() {
    var myPicture:ListView? = null

    companion object {
        fun newInstance() = ChatsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root = inflater.inflate(R.layout.chats_fragment, container, false)

        myPicture = root.findViewById(R.id.mImg)
        myPicture!!.setOnItemClickListener {adapterView, view, i, l->
            var name = adapterView.getItemAtPosition(i).toString()
            Toast.makeText(context,"You clicked me",Toast.LENGTH_LONG).show()
        }

        return root
    }



}