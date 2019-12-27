package ru.ahmedov.uiuxsampleproject.ui.attraction;


import android.content.Context;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import ru.ahmedov.uiuxsampleproject.R;
import ru.ahmedov.uiuxsampleproject.ui.hotel.Account;

class AdapterCustom extends RecyclerView.Adapter<AdapterCustom.NumberViewHolder> {

    private ArrayList<Account> accounts;
    private LayoutInflater inflater;

    AdapterCustom(Context context, List<Account> accounts) {
        this.accounts = (ArrayList<Account>) accounts;
        this.inflater = LayoutInflater.from(context);
    }


    //Создание нового представления.
    public AdapterCustom.NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_attraction, parent, false);
        return new AdapterCustom.NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NumberViewHolder holder, int position) {
        Account account = accounts.get(position);
        Glide.with(holder.itemView.getContext()).load(account.getImage())
                .circleCrop()
                .fitCenter()
                .into(holder.imageView);
        holder.addres.setText(account.getAddress());
        holder.name.setText(account.getName());
    }


    @Override
    //Возвращает количество вариантов в набор.
    public int getItemCount() {

        return accounts.size();
    }

    public class NumberViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        TextView addres;

        NumberViewHolder(View view) {

            super(view);
            imageView = (ImageView) view.findViewById(R.id.imageView2);
            name = view.findViewById(R.id.name);
            addres = view.findViewById(R.id.address);
        }
    }
}

