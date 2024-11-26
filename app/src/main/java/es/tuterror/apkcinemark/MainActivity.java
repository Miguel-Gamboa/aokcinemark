package es.tuterror.apkcinemark;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import es.tuterror.apkcinemark.databinding.ActivityMainBinding;
import es.tuterror.apkcinemark.model.Usuario;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    public static String URL_API="";
    public static String URL_IMAGE="";

    public static Usuario usuario = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(binding.navView, navController);

        navController.addOnDestinationChangedListener((navController1, navDestination, bundle) -> {
            int id = navDestination.getId();
            if ( id == R.id.naviation_splash)
                navView.setVisibility(View.INVISIBLE);
            else navView.setVisibility((View.VISIBLE));
        });
    }

}