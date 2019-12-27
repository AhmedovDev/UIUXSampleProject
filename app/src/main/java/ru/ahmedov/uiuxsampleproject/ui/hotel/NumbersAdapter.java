package ru.ahmedov.uiuxsampleproject.ui.hotel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import ru.ahmedov.uiuxsampleproject.R;

public class NumbersAdapter extends  RecyclerView.Adapter<NumbersAdapter.NumberViewHolder>{

    private ArrayList<Account> accounts;
    private LayoutInflater inflater;

    NumbersAdapter(Context context, List<Account> accounts){
        this.accounts = (ArrayList<Account>) accounts;
        this.inflater = LayoutInflater.from(context);
    }


    //Создание нового представления.
    public NumberViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_hotel_image, parent, false);
        return new NumberViewHolder(view);
    }

    @Override
    //Заполнение заданного представления данными.
    public void onBindViewHolder( NumberViewHolder holder, int position) {

        Account account = accounts.get(position);
//        Glide.with(holder.itemView.getContext()).load(account.getImage())
//                .into(holder.imageView);

        Picasso.get()
                .load(account.getImage())
                .into(holder.imageView);
    }



    @Override
    //Возвращает количество вариантов в набор.
    public int getItemCount() {

        return accounts.size();
    }

    public class NumberViewHolder extends RecyclerView.ViewHolder{

        final ImageView imageView;

        NumberViewHolder(View view){

            super (view);
            imageView = (ImageView) view.findViewById(R.id.imageView);

        }
    }


}//Сгенерировать массив объектов в MainActivity  и передать в NumbersAdapter для вывода на экран.

