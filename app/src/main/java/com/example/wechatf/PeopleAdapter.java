package com.example.wechatf;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PeopleAdapter extends ArrayAdapter<People> {
    private int resourceID;
    public PeopleAdapter(Context context, int textViewResourceID, List<People> objects){
        super(context,textViewResourceID,objects);
        resourceID=textViewResourceID;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        People people=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceID,null);
        ImageView peopleImage=(ImageView) view.findViewById(R.id.people_image);
        TextView peopleName=(TextView) view.findViewById(R.id.people_name);
        TextView peopleTime=(TextView) view.findViewById(R.id.people_time);
        peopleImage.setImageResource(people.getImageID());
        peopleName.setText(people.getName());
        peopleTime.setText(people.getTime());
        return view;
    }
}
