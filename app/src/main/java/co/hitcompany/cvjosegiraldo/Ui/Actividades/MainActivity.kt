package co.hitcompany.cvjosegiraldo.Ui.Actividades

import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import co.hitcompany.cvjosegiraldo.AdapterRvNavigation
import co.hitcompany.cvjosegiraldo.ItemNavigationView
import co.hitcompany.cvjosegiraldo.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        title = "Jose David Giraldo A."

        val toggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        rvListaNavigation.layoutManager = LinearLayoutManager(this)
        rvListaNavigation.hasFixedSize()

        val adapter = AdapterRvNavigation(getDatos())
        rvListaNavigation.adapter = adapter
    }

    fun getDatos(): ArrayList<ItemNavigationView>{
        var lists = ArrayList<ItemNavigationView>()
        lists.add(ItemNavigationView(R.drawable.ic_person_black_24dp,"Perfil Profesional","Desarrollador web y movil, 5 años creando paginas web y aplicaciones android, emprendedor, amante a nuevas tecnologias.","",""))
        lists.add(ItemNavigationView(R.drawable.ic_phone_black_24dp,"+57 319 535 9859","Movil","+57 (2) 346 1823 ","Casa"))
        lists.add(ItemNavigationView(R.drawable.ic_email_black_24dp,"jocgiraldo@gmail.com","Personal","joseg@parkeep.co","Empresarial"))
        return lists
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

}
