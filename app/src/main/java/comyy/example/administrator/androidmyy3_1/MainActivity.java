package comyy.example.administrator.androidmyy3_1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button inside = findViewById(R.id.inside);
        textfragment textfragment = new textfragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.topfragementlayout, textfragment);
        fragmentTransaction.commit();
        inside.setOnClickListener(new Button1ClickListener());

        Button outside=findViewById(R.id.outside);
        outside.setOnClickListener(new Buttonlistener(this));
        Button anonymous=findViewById(R.id.anonymous);
        anonymous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext_3 edittext_3=new edittext_3();
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.topfragementlayout,edittext_3);
                fragmentTransaction.commit();
            }
        });
        Button activity1=findViewById(R.id.activity1);
        activity1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        edittext_4 edittext_4 =new edittext_4();
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.topfragementlayout,edittext_4 );
        fragmentTransaction.commit();
    }
    public void clickHandler(View view){
        edittext_5 edittext_5=new edittext_5();
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.topfragementlayout,edittext_5);
        fragmentTransaction.commit();
    }
    class Button1ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            edittext_1 edittext_1 = new edittext_1();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.topfragementlayout,edittext_1);
            transaction.commit();
        }
    }
}
