package com.example.jokes.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jokes.databinding.FragmentJokeBinding

class JokeFragment : Fragment() {
    private lateinit var binding: FragmentJokeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentJokeBinding.inflate(inflater, container, false)
        return binding.root
    }


}