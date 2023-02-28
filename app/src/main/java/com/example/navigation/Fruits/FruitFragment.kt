package com.example.navigation.Fruits

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView

import com.example.navigation.Fruits.data.Datasource
import com.example.navigation.Fruits.data.ItemAdapter
import com.example.navigation.R


class FruitFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fruit, container, false)
        val buttonHome = view.findViewById<Button>(R.id.fruit_toHomeButton)
        val buttonPick = view.findViewById<Button>(R.id.fruit_toPickButton)
        val myData = Datasource().loadFruit()
        val recyclerView = view.findViewById<RecyclerView>(R.id.RecyclerView)
        recyclerView.adapter = ItemAdapter(this, myData)
        recyclerView.setHasFixedSize(true)
        buttonHome.setOnClickListener{
        findNavController().navigate(R.id.action_fruitFragment_to_homeFragment)
        }
        buttonPick.setOnClickListener{
            findNavController().navigate(R.id.action_fruitFragment_to_editorFragment)
        }
        return view
    }
}

