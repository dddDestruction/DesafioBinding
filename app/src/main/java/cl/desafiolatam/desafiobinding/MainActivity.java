package cl.desafiolatam.desafiobinding;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import cl.desafiolatam.desafiobinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        DailyWeather clima = new DailyWeather("Talca",
                "03-03-2020",
                R.drawable.ic_wb_sunny_black_24dp,
                "16", "ºC",
                R.drawable.ic_cloud_black_24dp,
                "1º / 17º");
        binding.setInfo(clima);
    }
}