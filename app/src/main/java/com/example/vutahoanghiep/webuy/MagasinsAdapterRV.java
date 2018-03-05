package com.example.vutahoanghiep.webuy;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by TaHoangHiep on 03/03/2018.
 */

public class MagasinsAdapterRV extends RecyclerView.Adapter<MagasinsAdapterRV.MagasinsAdapterVH> {

    private Context context;
    private List<Magasin> listeMagasin;

    public MagasinsAdapterRV(Context context, List<Magasin> listeMagasin) {
        this.context = context;
        this.listeMagasin = listeMagasin;
    }

    @Override
    public void onBindViewHolder(MagasinsAdapterVH holder, int position) {
        Magasin magasin = listeMagasin.get(position);
        int imageId = this.getLogoId(magasin.getNomLogo());
        holder.logoMagasinView.setImageResource(imageId);
        holder.nomMagasinView.setText(magasin.getNomMagasin());
        holder.adresseMagasinView.setText(context.getString(R.string.textViewLabelAdresse) + magasin.getAdresseMagasin());
        holder.nombrePromosView.setText(context.getString(R.string.textViewLabelPromos) + String.valueOf(magasin.getNombrePromos()));
    }

    public int getLogoId(String nomLogo) {
        String nomPackage = context.getPackageName();
        int resId = context.getResources().getIdentifier(nomLogo,"mipmap",nomPackage);
        return resId;
    }


    @Override
    public MagasinsAdapterVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.liste_magasin_cardview,parent,false);
        return new MagasinsAdapterVH(itemView);
    }

    @Override
    public int getItemCount() {
        return listeMagasin.size();
    }

    class MagasinsAdapterVH extends RecyclerView.ViewHolder {
        private ImageView logoMagasinView;
        private TextView nomMagasinView;
        private TextView adresseMagasinView;
        private TextView nombrePromosView;

        public MagasinsAdapterVH(final View view) {
            super(view);
            logoMagasinView = (ImageView) view.findViewById(R.id.imageViewLogoMagasin);
            nomMagasinView = (TextView) view.findViewById(R.id.textViewNomMagasin);
            adresseMagasinView = (TextView) view.findViewById(R.id.textViewAdresseMagasin);
            nombrePromosView = (TextView) view.findViewById(R.id.textViewNombrePromos);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.getContext().startActivity(new Intent(v.getContext(), PromotionsActivity.class));
                }
            });
        }
    }


}
