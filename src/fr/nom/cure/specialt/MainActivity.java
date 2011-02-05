/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.nom.cure.specialt;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 *
 * @author david
 */
public class MainActivity extends ListActivity {

    private String[] listTea;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        // ToDo add your GUI initialization code here
        setContentView(R.layout.main);
        listTea = getResources().getStringArray(R.array.tea);
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                listTea));
    }

    // Manage menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.xml.menu, menu);
        return true;
}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.save:
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
}
