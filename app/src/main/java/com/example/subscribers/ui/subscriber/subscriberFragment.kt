package com.example.subscribers.ui.subscriber

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.subscribers.R

class subscriberFragment : Fragment() {

    private lateinit var viewModel: SubscriberViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.subscriber_fragment, container, false)
    }


}
