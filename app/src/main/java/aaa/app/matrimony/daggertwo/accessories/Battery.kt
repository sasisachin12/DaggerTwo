package aaa.app.matrimony.daggertwo.accessories

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor() {

    fun batteryInfo(): String {
        Log.e("Battery", "Battery  model =67980")
        return "Battery  Attached"
    }

}