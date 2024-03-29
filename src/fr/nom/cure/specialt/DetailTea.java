/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.nom.cure.specialt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.widget.RadioButton;

/**
 *
 * @author david
 */
public class DetailTea extends Activity {

    SharedPreferences savedTea;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.detail_tea);
        ((TextView)findViewById(R.id.teaName)).setText(getIntent().getCharSequenceExtra("TEA"));

        savedTea = getApplicationContext().getSharedPreferences("dcSpecialT",MODE_PRIVATE);
        ((RadioButton)findViewById(R.id.master)).setChecked(
                savedTea.getBoolean(getIntent().getStringExtra("POS")+"-Master", false));
        ((RadioButton)findViewById(R.id.my)).setChecked(
                savedTea.getBoolean(getIntent().getStringExtra("POS")+"-My", false));
        ((TextView)findViewById(R.id.infusion)).setText(
                savedTea.getString(getIntent().getStringExtra("POS")+"-Infusion", "0"));
        ((TextView)findViewById(R.id.comments)).setText(
                savedTea.getString(getIntent().getStringExtra("POS")+"-Comments", ""));
    }


    @Override
    public void onPause() {
        super.onPause();

        SharedPreferences.Editor spEdit = savedTea.edit();
        spEdit.putBoolean(getIntent().getStringExtra("POS")+"-Master",
                ((RadioButton)findViewById(R.id.master)).isChecked());
        spEdit.putBoolean(getIntent().getStringExtra("POS")+"-My",
                ((RadioButton)findViewById(R.id.my)).isChecked());
        spEdit.putString(getIntent().getStringExtra("POS")+"-Infusion",
                ((TextView)findViewById(R.id.infusion)).getText().toString());
        spEdit.putString(getIntent().getStringExtra("POS")+"-Comments",
                ((TextView)findViewById(R.id.comments)).getText().toString());
        spEdit.commit();
    }

}
