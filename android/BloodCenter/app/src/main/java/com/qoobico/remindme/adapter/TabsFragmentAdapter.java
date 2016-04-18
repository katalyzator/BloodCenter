package com.qoobico.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.qoobico.remindme.Fragment.AbstractTabFragment;
import com.qoobico.remindme.Fragment.BirthdaysFragment;
import com.qoobico.remindme.Fragment.HistoryFragment;
import com.qoobico.remindme.Fragment.IdeasFragment;
import com.qoobico.remindme.Fragment.TodoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by neil on 4/12/2016.
 */
public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);

    }



    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
       /*  switch (position){
             case 0:
                 return ExampleFragment.getInstance();

             case 1:
                 return ExampleFragment.getInstance();

             case 2:
                 return ExampleFragment.getInstance();
         }

        */


        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }
}
