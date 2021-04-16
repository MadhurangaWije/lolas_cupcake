package me.kithumini.lolascupcake;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CakeListFragment cakeListFragment = CakeListFragment.newInstance();
        OrdersFragment ordersFragment = OrdersFragment.newInstance();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()==R.id.cakes){
                    setCurrentFragment(cakeListFragment, true);
                }else if(item.getItemId()==R.id.orders){
                    setCurrentFragment(ordersFragment, true);
                }


                return false;
            }
        });



        setCurrentFragment(cakeListFragment, false);

    }

    private void setCurrentFragment(Fragment fragment, boolean addToBackStack){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.homeFragmentContainer, fragment);

        if(addToBackStack){
            fragmentTransaction.addToBackStack(null);
        }else{
            fragmentTransaction.addToBackStack(fragment.getClass().getName());
        }
        fragmentTransaction.commit();
    }


}