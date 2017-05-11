package com.example.kh.myapplication.Module;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kh.myapplication.R;

/**
 * Created by kh on 5/11/2017.
 */

public class Fragment_B extends Fragment {
    String TAG = "NOTICATION";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "B saveinstancestate");
        return inflater.inflate(R.layout.fragment_b, container, false);
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "B oncreate");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i(TAG, "B attach");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "B start");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "B resume");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "B saveinstancestate");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "B pause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "B stop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "B destroyview");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "B destroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "B detach");
    }
}
