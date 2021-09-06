package data.kiosk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView list = findViewById(R.id.list);
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new Coffee("일반 커피", 1300));
        menus.add(new Coffee("아이스아메리카노", 2000, true, "아메리카노"));
        menus.add(new Coffee("프라푸치노", 6100));
        menus.add(new Beverage("아이스티", 2000, true));

        ListAdapter customAdapter = new ListAdapter(this, R.layout.listview_item, menus);
        list.setAdapter(customAdapter);
        list.setOnItemClickListener(
                (parent, view, position, id) -> {
                    Menu clickedItem = (Menu) list.getItemAtPosition(position);
                    Toast.makeText(MainActivity.this, clickedItem.toString(), Toast.LENGTH_SHORT).show();
                }
        );
    }
}