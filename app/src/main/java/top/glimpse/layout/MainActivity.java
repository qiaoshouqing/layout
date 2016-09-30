package top.glimpse.layout;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button linearLayout;
    private Button relativeLayout;
    private Button frameLayout;
    private Button absoluteLayout;
    private Button gridLayout;

    private Context context = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (Button) findViewById(R.id.LinearLayout);
        relativeLayout = (Button) findViewById(R.id.RelativeLayout);
        frameLayout = (Button) findViewById(R.id.FrameLayout);
        absoluteLayout = (Button) findViewById(R.id.AbsoluteLayout);
        gridLayout = (Button) findViewById(R.id.GridLayout);

        linearLayout.setOnClickListener(new MyOnClickListener());
        relativeLayout.setOnClickListener(new MyOnClickListener());
        frameLayout.setOnClickListener(new MyOnClickListener());
        absoluteLayout.setOnClickListener(new MyOnClickListener());
        gridLayout.setOnClickListener(new MyOnClickListener());

    }

    private class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.LinearLayout:
                    Toast.makeText(context, "我自己就是LinearLayout呀",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.RelativeLayout:
                    Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                    intent.putExtra("layout", R.layout.relativelayout);
                    startActivity(intent);
                    break;
                case R.id.FrameLayout:
                    Intent intent1 = new Intent(MainActivity.this, ShowActivity.class);
                    intent1.putExtra("layout", R.layout.framelayout);
                    startActivity(intent1);
                    break;
                case R.id.AbsoluteLayout:
                    Toast.makeText(context, "太简单没写",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.GridLayout:
                    Intent intent2 = new Intent(MainActivity.this, ShowActivity.class);
                    intent2.putExtra("layout", R.layout.gridlayout);
                    startActivity(intent2);
                    break;

            }
        }
    }
}
