package com.example.joo.fragmentstabsslidding;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;



public class FragmentsTabsSlidding extends FragmentActivity {

    ViewPager viewPager = null;         //Criaçao de um viewplayer para controlo do slidding
                                        //como atributopara acesso geral.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments_tabs_slidding);

        //No arranque da activity liga-se o viewpager ao layout da activity.
        viewPager = (ViewPager) findViewById(R.id.fragmentsTabsSlidding);

        FragmentManager fm = getSupportFragmentManager();
        viewPager.setAdapter(new MeuFragmentAdapter(fm));

        viewPager.setCurrentItem(1);
    }

    class MeuFragmentAdapter extends FragmentPagerAdapter {

        MeuFragmentAdapter(FragmentManager fm) {

            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;

            if(position == 0)
            {
                fragment = new FragmentS2();
            }
            if(position == 1)
            {
                fragment = new FragmentS1();
            }
            if(position == 2)
            {
                fragment = new FragmentS3();
            }
            return fragment;
        }

        @Override
        public int getCount() {

            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            if(position == 0)
            {
                return "tab2";
            }
            if(position == 1)
            {
                return "tab1";
            }
            if(position == 2)
            {
                return "tab3";
            }
            return null;
        }
    }
}
