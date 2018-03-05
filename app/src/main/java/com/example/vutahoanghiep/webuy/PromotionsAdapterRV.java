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
 * Created by TaHoangHiep on 04/03/2018.
 */

public class PromotionsAdapterRV extends RecyclerView.Adapter<PromotionsAdapterRV.PromotionsAdapterVH> {

    private Context context;
    private List<Promotions> listePromos;
    private final String unite = "€";

    public PromotionsAdapterRV(Context context, List<Promotions> listePromos) {
        this.context = context;
        this.listePromos = listePromos;
    }

    @Override
    public PromotionsAdapterRV.PromotionsAdapterVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.liste_promotions_cardview,parent,false);
        return new PromotionsAdapterRV.PromotionsAdapterVH(itemView);
    }

    @Override
    public void onBindViewHolder(PromotionsAdapterVH holder, int position) {
        Promotions promo = listePromos.get(position);
        int imageId = this.getImageId(promo.getNomImageProduit());
        holder.imageProduitView.setImageResource(imageId);
        holder.nomProduitView.setText(promo.getNomProduit());
        holder.prixHorsPromoView.setText(context.getString(R.string.textViewLabelPrixHorsPromo) + promo.getPrixHorsPromo() + unite);
        holder.prixPromoView.setText(context.getString(R.string.textViewLabelPrixPromo) + promo.getPrixPromo() + unite);
        holder.quantiteMinView.setText(context.getString(R.string.textViewLabelQuantiteMin) + String.valueOf(promo.getQuantiteMin()));
        holder.quantiteAAcheterView.setText(context.getString(R.string.textViewLabelQuantiteAAcheter) + String.valueOf(promo.getQuantiteAAcheter()));

    }

    public int getImageId(String nomLogo) {
        String nomPackage = context.getPackageName();
        int resId = context.getResources().getIdentifier(nomLogo,"mipmap",nomPackage);
        return resId;
    }

    @Override
    public int getItemCount() {
        return listePromos.size();
    }

    class PromotionsAdapterVH extends RecyclerView.ViewHolder {
        private ImageView imageProduitView;
        private TextView nomProduitView;
        private TextView prixHorsPromoView;
        private TextView prixPromoView;
        private TextView quantiteMinView;
        private TextView quantiteAAcheterView;

        public PromotionsAdapterVH(final View view) {
            super(view);
            imageProduitView = (ImageView) view.findViewById(R.id.imageViewProduit);
            nomProduitView = (TextView) view.findViewById(R.id.textViewNomProduit);
            prixHorsPromoView = (TextView) view.findViewById(R.id.textViewPrixHorsPromo);
            prixPromoView = (TextView) view.findViewById(R.id.textViewPrixPromo);
            quantiteMinView = (TextView) view.findViewById(R.id.textViewQuantiteMin);
            quantiteAAcheterView = (TextView) view.findViewById(R.id.textViewQuantiteAAcheter);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.getContext().startActivity(new Intent(v.getContext(), AchatGroupeDetailsActivity.class));
                }
            });
        }
    }

}
