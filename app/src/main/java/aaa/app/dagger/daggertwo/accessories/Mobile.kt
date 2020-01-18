package aaa.app.dagger.daggertwo.accessories

import android.util.Log
import javax.inject.Inject


//Constructor Injection
class Mobile @Inject constructor(private val battery: Battery) {


    fun displayMobileInfo(): String {
        Log.e("Mobile", " Mobile Model = 123456")
        battery.batteryInfo()
        return " Mobile Box Opened "
    }


}