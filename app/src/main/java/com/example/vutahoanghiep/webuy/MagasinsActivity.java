package com.example.vutahoanghiep.webuy;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MagasinsActivity extends Activity {

    private RecyclerView magasinRV;
    private MagasinsAdapterRV magasinsAdapterRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magasins_recyclerview);

        List<Magasin> listMagasin = getMagasin();
        magasinRV = (RecyclerView) findViewById(R.id.magasin_recycler_view);
        magasinsAdapterRV = new MagasinsAdapterRV(this,listMagasin);
        magasinRV.setAdapter(magasinsAdapterRV);
        magasinRV.setLayoutManager(new LinearLayoutManager(this));
    }

    // creer une liste des magasins
    private List<Magasin> getMagasin() {
        List<Magasin> list = new ArrayList<>();
        Magasin Carrefour1 = new Magasin("carrefour","Carrefour","1 rue Moreau 45000 Orléans",10);
        Magasin Auchan1 = new Magasin("auchan","Auchan","1 place République 37000 Tours",5);
        Magasin Leclerc1 = new Magasin("leclerc","Leclerc","1 rue Grandmont 37000 Tours",20);
        list.add(Carrefour1);
        list.add(Auchan1);
        list.add(Leclerc1);
        return list;

    }
}
