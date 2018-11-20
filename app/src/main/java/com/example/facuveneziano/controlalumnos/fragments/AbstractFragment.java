package com.example.facuveneziano.controlalumnos.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class AbstractFragment extends Fragment implements View.OnClickListener, View.OnLongClickListener {
    @Override public void onClick(View view) {

    }
    @Override public boolean onLongClick(View view) {
        return false;
    }
    public abstract View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);
}
