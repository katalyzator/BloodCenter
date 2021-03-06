package com.qoobico.remindme.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qoobico.remindme.R;
import com.qoobico.remindme.adapter.RemindListAdapter;
import com.qoobico.remindme.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by neil on 4/12/2016.
 */
public class HistoryFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_history;

    private String title;
    private Context context;

    private View view;

    public static HistoryFragment getInstance(Context context){
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);

        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tap_item_history));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new RemindListAdapter(createMockRemindListData()));

        return view;
    }

    private List<RemindDTO> createMockRemindListData() {
        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("Bazarbaev I R+ "));
        data.add(new RemindDTO("Lansarov III R- "));
        data.add(new RemindDTO("Dauzov II R+ "));
        data.add(new RemindDTO("Kadyrov IV R- "));
        data.add(new RemindDTO("Shvab II R+ "));
        data.add(new RemindDTO("Murat IV R- "));
        data.add(new RemindDTO("Kairat I R- "));
        data.add(new RemindDTO("Rasul II R+ "));
        data.add(new RemindDTO("Bazarbaev I R+ "));
        data.add(new RemindDTO("Lansarov III R- "));
        data.add(new RemindDTO("Dauzov II R+ "));
        data.add(new RemindDTO("Kadyrov IV R- "));
        data.add(new RemindDTO("Shvab II R+ "));
        data.add(new RemindDTO("Murat IV R- "));
        data.add(new RemindDTO("Kairat I R- "));
        data.add(new RemindDTO("Rasul II R+ "));
        data.add(new RemindDTO("Bazarbaev I R+ "));
        data.add(new RemindDTO("Lansarov III R- "));
        data.add(new RemindDTO("Dauzov II R+ "));
        data.add(new RemindDTO("Kadyrov IV R- "));
        data.add(new RemindDTO("Shvab II R+ "));
        data.add(new RemindDTO("Murat IV R- "));
        data.add(new RemindDTO("Kairat I R- "));
        data.add(new RemindDTO("Rasul II R+ "));
        data.add(new RemindDTO("Bazarbaev I R+ "));
        data.add(new RemindDTO("Lansarov III R- "));
        data.add(new RemindDTO("Dauzov II R+ "));
        data.add(new RemindDTO("Kadyrov IV R- "));
        data.add(new RemindDTO("Shvab II R+ "));
        data.add(new RemindDTO("Murat IV R- "));
        data.add(new RemindDTO("Kairat I R- "));
        data.add(new RemindDTO("Rasul II R+ "));

        return data;

    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setContext(Context context) {
        this.context = context;
    }
    public String getTitle() {
        return title;
    }
}
