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

    String[] listTea={"Noir - Roi du Yunnan",
                        "Noir - Splendeur de Keemun",
                        "Noir - Jardins de Darjeeling",
                        "Noir - Ceylan Nuwara",
                        "Noir - Noir impérial - Breakfast",
                        "Noir - Noir de luxe - Tea Time",
                        "Noir parfumé - Gourmandise caramel",
                        "Noir parfumé - Délices Rouges",
                        "Noir parfumé - Earl Grey Lime",
                        "Noir parfumé - Saveur Tropicale",
                        "Noir parfumé - Blueberry Muffin - Breakfast",
                        "Noir parfumé - Earl Grey Fleur d'Oranger - Tea Time",
                        "Vert Japonais - Sencha Shizuoka",
                        "Vert au riz torrefié - Genmaicha",
                        "Vert Chinois - Sencha Zhejiang",
                        "Vert parfumé - Fleurs de Jasmin",
                        "Vert parfumé - Menthe intense",
                        "Vert parfumé - Mandarine pêche",
                        "Blanc - Perle de Pai Mu Tan",
                        "Bleu - Oolong Fujian",
                        "Rouge parfumé - Rooibos Bourbon",
                        "Rouge parfumé - Rooibos Orange",
                        "Tisane digestion - Menthe Glaciale",
                        "Tisane relaxation - Verveine Agrumes",
                        "Tisane hydratation - Granité Citron",
    };

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        // ToDo add your GUI initialization code here
        setContentView(R.layout.main);
        setListAdapter(new ArrayAdapter(this,
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
