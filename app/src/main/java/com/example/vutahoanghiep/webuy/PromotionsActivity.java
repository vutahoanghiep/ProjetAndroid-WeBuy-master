package com.example.vutahoanghiep.webuy;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TAHIR on 01/03/2018.
 */

public class PromotionsActivity extends Activity {

    private RecyclerView promoRV;
    private PromotionsAdapterRV promoAdapterRV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotions_recyclerview);

        List<Promotions> listPromotions = getPromotions();
        promoRV = (RecyclerView) findViewById(R.id.promotions_recycler_view);
        promoAdapterRV = new PromotionsAdapterRV(this,listPromotions);
        promoRV.setAdapter(promoAdapterRV);
        promoRV.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Promotions> getPromotions(){
        List<Promotions> lst = new ArrayList<Promotions>();
        Promotions laitLactel = new Promotions("lait", "Lait Lactel 10x1L", 8.0, 6.0, 2, 2);
        Promotions cafeMoulu = new Promotions("cafe", "Café Moulu Famillial Grand mère", 5.95, 3.96, 2, 4);
        lst.add(laitLactel);
        lst.add(cafeMoulu);
        return lst;
    }
}
