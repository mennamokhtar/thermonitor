package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class list extends AppCompatActivity {
    String item[]=new String[]{"android","iphone","windows","blackberry","linux"};
    int[] images={R.drawable.gogo,R.drawable.iphone,R.drawable.zakarya,R.drawable.blackberry,R.drawable.linux};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView listview=(ListView)findViewById(R.id.list_item);
        CustomAdapter customAdapter=new CustomAdapter();
       // ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item);
        listview.setAdapter(customAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(list.this,DeviceDetail.class);
                startActivity(intent);
            }
        });
// hakteb hna class esmo cutom adapter



}

class CustomAdapter extends BaseAdapter{

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=getLayoutInflater().inflate(R.layout.sowar,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
        TextView textView=(TextView)view.findViewById(R.id.textView);
        imageView.setImageResource(images[i]);
        textView.setText(item[i]);
        return view;
    }

}
}