package com.mirea.tarasov.employeedb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppDatabase db = App.getInstance().getDatabase();
        HeroDao heroDao = db.heroDao();
        SuperHero SuperHeroOne = new SuperHero();
        SuperHeroOne.id = 1;
        SuperHeroOne.name = "Hulk";
        SuperHeroOne.ability = "Халк обладает такими сверхспособностями, как:\n" +
                " неуязвимость, сверхсила, сверхвыносливость.";

        SuperHero SuperHeroTwo = new SuperHero();
        SuperHeroTwo.id = 2;
        SuperHeroTwo.name = "Iron man";
        SuperHeroTwo.ability = "Exocosuit";

        heroDao.insert(SuperHeroOne);
        heroDao.insert(SuperHeroTwo);
    }
}