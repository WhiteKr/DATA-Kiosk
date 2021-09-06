package data.kiosk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView list = findViewById(R.id.list);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("JAVA");
        arrayList.add("ANDROID");
        arrayList.add("C Language");
        arrayList.add("CPP Language");
        arrayList.add("Go Language");
        arrayList.add("AVN SYSTEMS");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener((parent, view, position, id) -> {
            String clickedItem = (String) list.getItemAtPosition(position);
            Toast.makeText(MainActivity.this, clickedItem, Toast.LENGTH_LONG).show();
        });
    }
}