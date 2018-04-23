package br.com.bossini.helloworldfragmentsads3anmca;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        if (savedInstanceState == null){
            FragmentTransaction ft = fm.beginTransaction();
            HelloWorldFragment hwf = new HelloWorldFragment();
            ft.add(R.id.layoutFrag, hwf, "HelloWorldFragmentTag");
            ft.commit();
        }
    }
}
