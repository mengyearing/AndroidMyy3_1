package comyy.example.administrator.androidmyy3_1;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;

/**
 * Created by Administrator on 2018/5/5.
 */

public class Buttonlistener implements View.OnClickListener {
    private Activity activity;
    public Buttonlistener(Activity activity) {
        this.activity = activity;
    }
    @Override
    public void onClick(View v) {
        edittext_2 text2=new edittext_2();
        FragmentManager fragmentManager=activity.getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.topfragementlayout,text2);
        fragmentTransaction.commit();
    }
}
