package vn.nasia.linhdh.myemojitest;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView _gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _gridView = (GridView)findViewById(R.id.gridview1);
        _gridView.setAdapter(new ImageAdapter(this));
    }
}
