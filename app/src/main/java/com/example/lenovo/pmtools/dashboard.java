package com.example.lenovo.pmtools;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




public class dashboard Extends Fragment {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_songs, container, false)

        companion object {
        fun newInstance(): SongsFragment = SongsFragment()
        }
        }