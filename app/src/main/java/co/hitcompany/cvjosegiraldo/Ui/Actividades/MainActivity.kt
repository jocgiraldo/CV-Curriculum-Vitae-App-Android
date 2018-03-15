package co.hitcompany.cvjosegiraldo.Ui.Actividades

import android.content.ClipData
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import co.hitcompany.cvjosegiraldo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        title = "Jose David Giraldo A."

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

//    class adapterRecyclerView : RecyclerView.Adapter<adapterRecyclerView.ViewHolder>() {
//
//        override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//        override fun getItemCount(): Int {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//
//        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//            fun bind(item: ClipData.Item, listener: (ClipData.Item) -> Unit) = with(itemView) {
//                itemTitle.text = item.title
//                itemImage.loadUrl(item.url)
//                setOnClickListener { listener(item) }
//            }
//        }
//    }

}
