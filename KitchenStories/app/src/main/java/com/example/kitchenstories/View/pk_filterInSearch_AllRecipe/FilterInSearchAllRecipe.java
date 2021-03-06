package com.example.kitchenstories.View.pk_filterInSearch_AllRecipe;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.kitchenstories.R;
import com.example.kitchenstories.View.Create;
import com.example.kitchenstories.View.Filter_Recipe;
import com.example.kitchenstories.View.MainActivity;
import com.example.kitchenstories.View.pk_profile.Profile;
import com.example.kitchenstories.View.Shopping;
import com.example.kitchenstories.ViewModel.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class FilterInSearchAllRecipe extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private BottomNavigationView bottomNavigationView;

    private Toolbar toolbar;
    private SearchView searchView;

    private String keysearch = "";

    String sortExtra = "";
    String categoryExtra = "";
    String dietExtra = "";
    String cuisineExtra = "";
    ArrayList<String> occasionExtra = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_in_search_all_recipe);

        //
        transparentStatusAndNavigation();

        Window window = FilterInSearchAllRecipe.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(FilterInSearchAllRecipe.this, R.color.Gray50));


        if (getIntent().hasExtra("KEYSEARCH_FOR_ALLRECIPE")) {
            keysearch = getIntent().getExtras().getString("KEYSEARCH_FOR_ALLRECIPE");
        }
        if(getIntent().hasExtra("sortExtra")){
            sortExtra = getIntent().getExtras().getString("sortExtra");
        }
        if(getIntent().hasExtra("categoryExtra")){
            categoryExtra = getIntent().getExtras().getString("categoryExtra");
        }
        if(getIntent().hasExtra("dietExtra")){
            dietExtra = getIntent().getExtras().getString("dietExtra");
        }
        if(getIntent().hasExtra("cuisineExtra")){
            cuisineExtra = getIntent().getExtras().getString("cuisineExtra");
        }
        if (getIntent().hasExtra("occasionExtra")){
            occasionExtra = getIntent().getStringArrayListExtra("occasionExtra");
        }

        if(sortExtra.equals("likeAmount") || sortExtra.equals("ratingAmount")){


        }
        else if (sortExtra.equals("caloriesSort") || sortExtra.equals("preparationTimeSort")){


        }

        // FIND VIEW BY ID
        findByIdForComponents();

        if (!keysearch.isEmpty()){
            searchView.setQuery(keysearch, true);
        }
//        else if (keysearch.isEmpty()){
//
//            searchView.setQuery("", false);
//            //searchView.iss
//        }


        //
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());


        fm_filterinsearch_recipe_tab1 tab1 = new fm_filterinsearch_recipe_tab1();
        fm_filterinsearch_recipe_tab2 tab2 = new fm_filterinsearch_recipe_tab2();

        Bundle bundle1 = new Bundle();
        bundle1.putString("KEYSEARCH_FOR_FRAGMENT_ALLRECIPE", keysearch);
        bundle1.putString("sortExtra", sortExtra);
        bundle1.putString("categoryExtra", categoryExtra);
        bundle1.putString("dietExtra", dietExtra);
        bundle1.putString("cuisineExtra", cuisineExtra);
        bundle1.putStringArrayList("occasionExtra", occasionExtra);

        Bundle bundle2 = new Bundle();
        bundle2.putString("KEYSEARCH_FOR_FRAGMENT_ALLRECIPE", keysearch);
        bundle2.putString("sortExtra", sortExtra);
        bundle2.putString("categoryExtra", categoryExtra);
        bundle2.putString("dietExtra", dietExtra);
        bundle2.putString("cuisineExtra", cuisineExtra);
        bundle2.putStringArrayList("occasionExtra", occasionExtra);

        tab1.setArguments(bundle1);
        tab2.setArguments(bundle2);


        // add Fragment here
        viewPagerAdapter.AddFragment(tab1, "Kitchen Stories");
        viewPagerAdapter.AddFragment(tab2, "Community");

        // View
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);



        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                Intent intent = new Intent(getApplicationContext(), FilterInSearchAllRecipe.class);
                intent.putExtra("KEYSEARCH_FOR_ALLRECIPE", query);
                startActivity(intent);
                return false;
            }


            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });


        // Navigation bottom
        bottomNavigationView.setSelectedItemId(R.id.search);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.today:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                        return true;

                    case R.id.search:
                        return true;

                    case R.id.create:
                        startActivity(new Intent(getApplicationContext(), Create.class));
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;

                    case R.id.shopping:
                        startActivity(new Intent(getApplicationContext(), Shopping.class));
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;
                }
                return false;
            }
        });


        // Navigation Icon is Clicked
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                //Toast.makeText(getBaseContext(), "hello", Toast.LENGTH_SHORT).show();
            }
        });


        // Filter Icon is clicked
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.filter_all_recipe_activity:
                        openFilterRecipe();
                        return true;

                }
                return false;
            }
        });
    }

    public void findByIdForComponents() {

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        tabLayout = findViewById(R.id.tabs_FilterInSearch_All_Recipes_Activity);
        viewPager = findViewById(R.id.view_pager_FilterInSearch_All_Recipes_Activity);
        toolbar = findViewById(R.id.topAppBar_FilterInSearch_All_Recipes_Activity);

        searchView = findViewById(R.id.searchView_FilterInSearchAllRecipe);
    }

    public void openFilterRecipe() {

        Intent intent = new Intent(this, Filter_Recipe.class);
        startActivity(intent);
        //overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_null);
    }


    // Transparent Status Bar
    public void transparentStatusAndNavigation() {
        //make full transparent statusBar
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION, true);
        }
        if (Build.VERSION.SDK_INT >= 19) {

            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            );

        }
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION, false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
            //getWindow().setNavigationBarColor(Color.TRANSPARENT);
        }

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

    }

    public void setWindowFlag(final int bits, boolean on) {
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }
}