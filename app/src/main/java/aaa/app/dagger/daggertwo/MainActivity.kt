package aaa.app.dagger.daggertwo


import aaa.app.dagger.daggertwo.accessories.Battery
import aaa.app.dagger.daggertwo.accessories.MemoryCard
import aaa.app.dagger.daggertwo.accessories.Mobile
import aaa.app.dagger.daggertwo.compontents.DaggerAppCompontent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mobile: Mobile //Field Injection

    @Inject
    lateinit var battery: Battery

    @JvmField
    @Inject
    var memoryCard: MemoryCard? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        DaggerAppCompontent.create().inject(this)
        text_display.text =
            mobile.displayMobileInfo() + memoryCard?.getSongsOnMovies()


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
