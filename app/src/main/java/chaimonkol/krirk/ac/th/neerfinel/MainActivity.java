package chaimonkol.krirk.ac.th.neerfinel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chaimonkol.krirk.ac.th.neerfinel.fragment.Mainfragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new Mainfragment()).commit();
        }


    }
}
