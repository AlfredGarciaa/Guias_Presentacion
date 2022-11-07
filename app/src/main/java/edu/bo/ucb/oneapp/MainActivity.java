package edu.bo.ucb.oneapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
    private RecyclerView rvLista;
    private SearchView svSearch;
    private RecyclerAdapter adapter;
    private List<ItemList> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initValues();
        initListener();
    }

    private void initViews(){
        rvLista = findViewById(R.id.rvLista);
        svSearch = findViewById(R.id.svSearch);
    }

    private void initValues() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = getItems();
        adapter = new RecyclerAdapter(items, this);
        rvLista.setAdapter(adapter);
    }

    private void initListener() {
        svSearch.setOnQueryTextListener(this);
    }

    private List<ItemList> getItems() {
        List<ItemList> itemLists = new ArrayList<>();
        itemLists.add(new ItemList("Nelson Mandela", "La abolición del apartheid es el mayor legado de Nelson Mandela, y bajo su liderazgo, Sudáfrica emergió como una auténtica democracia que vio muchos cambios.", R.drawable.nelson_mandela));
        itemLists.add(new ItemList("Papa Franciso", "Como jefe de la Iglesia Católica Romana, es el líder moral y espiritual de los 1.2 mil millones de personas en todo el mundo, desde las Filipinas, donde el 86% de la población se identifica como católica romana, a Brasil, que cuenta con más de 125 millones de católicos.", R.drawable.papa_francisco));
        itemLists.add(new ItemList("Elon Musk", "El CEO de Tesla Motors y SpaceX es conocido por sus visiones audaces y futuristas, y por trabajar en todo lo que pueda para hacer de esas visiones una realidad.", R.drawable.elon_musk));
        itemLists.add(new ItemList("Mahatma Gandhi", "El abogado de la India, activista social, político y escritor se convirtió en el líder del movimiento nacionalista contra el dominio británico de la India.", R.drawable.mahatma_gandhi));
        itemLists.add(new ItemList("Bill Gates", "El presidente y co-fundador de Microsoft Corporation y copresidente de la Fundación Bill y Melinda Gates, ha regalado USD 28 mil millones, y \"más de USD 8 millones para mejorar la salud mundial.", R.drawable.bill_gates));
        itemLists.add(new ItemList("Barack Obama", "El presidente de los Estados Unidos es el sexto líder más inspirador entre los encuestados de la encuesta. También encabeza el ranking como el líder mundial con más seguidores en Twitter.", R.drawable.barack_obama));
        itemLists.add(new ItemList("Richard Branson", "El empresario y fundador de Virgin Group, a menudo aparece como un líder inspirador. Virgin Group cuenta con más de 200 empresas en más de 30 países.", R.drawable.richard_branson));
        itemLists.add(new ItemList("Steve Jobs", "Steve Jobs fue el co-fundador y CEO de Apple, y a menudo se hace referencia como uno de los CEOs de su generación más influyente.", R.drawable.steve_jobs));
        itemLists.add(new ItemList("Mohammad Yunus", "El empresario social y economista de Bangladesh fue galardonado con el Premio Nobel de la Paz en 2006 por fundar el Banco Grameen y por su trabajo para \"crear desarrollo económico y social desde abajo.", R.drawable.mohammad_yunus));
        itemLists.add(new ItemList("Vladimir Putin", "Es un abogado y político ruso, líder de facto del partido político Rusia Unida. Actualmente se desempeña como presidente de Rusia, cargo que ocupa desde 2012, y anteriormente desde 2000 hasta 2008. También fue presidente del gobierno de 1999 a 2000, y nuevamente de 2008 a 2012.", R.drawable.vladimir_putin));
        itemLists.add(new ItemList("Kim Jong-un", "Es un político, dictador, y militar norcoreano. Desde 2011 es el líder supremo de la República Popular Democrática de Corea y desde 2012 lidera el Partido del Trabajo de Corea.", R.drawable.kim_jong_un));

        return itemLists;
    }

    @Override
    public void itemClick(ItemList item) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("itemDetail", item);
        startActivity(intent);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        adapter.filter(newText);
        return false;
    }
}