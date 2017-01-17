package com.futureprogress.ethanfabriccalculator.model;


import com.futureprogress.ethanfabriccalculator.view.FabricActivity;

import java.util.ArrayList;
import java.util.List;

import static com.futureprogress.ethanfabriccalculator.R.drawable.a;
import static com.futureprogress.ethanfabriccalculator.R.drawable.b;
import static com.futureprogress.ethanfabriccalculator.R.drawable.c;

public class FabricData {
    private static final String[] titles = {"wool", "silk", "cotton"};

    private static final int[] icons = {a, b, c};

    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();
        for (int x = 0; x < 12; x++){
            for (int i = 0; i < titles.length && i < icons.length; i++) {
                ListItem item = new ListItem();
                item.setImageResId(icons[i]);
                item.setTitle(titles[i]);
                data.add(item);
            }
        }
        return data;
    }

}
