package chaimonkol.krirk.ac.th.neerfinel.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import chaimonkol.krirk.ac.th.neerfinel.R;

/**
 * Created by acer on 27/2/2561.
 */

public class Calculatefragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cal, container, false);
        return view;
    }
}
