package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController


class EditorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_editor, container, false)
        val button = view.findViewById<Button>(R.id.editor_toHomeButton)
        val editable = view.findViewById<EditText>(R.id.editable)
        val duration = Toast.LENGTH_LONG
        val showButton = view.findViewById<Button>(R.id.showButton)
        showButton.setOnClickListener {
            val text = editable.editableText.toString()
            if (text.contains("banana")) {
                findNavController().navigate(R.id.action_editorFragment_to_goal)

            }
            if (text.contains("Banana")) {
                findNavController().navigate(R.id.action_editorFragment_to_goal)

            }else {  Toast.makeText(context, "Wrong Fruit!", duration).show() }
        }
        button.setOnClickListener {
            findNavController().navigate(R.id.action_editorFragment_to_fruitFragment)
        }
        return view
    }
    }
