package mhha.sample.PlayMusic

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class LowBatteryReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d("onReceive", "${intent.action}")
        when(intent.action){
            Intent.ACTION_BATTERY_LOW -> {
                Toast.makeText(context,"배터리 부족",Toast.LENGTH_SHORT).show()
            }//Intent.ACTION_BATTERY_LOW ->
            Intent.ACTION_BATTERY_CHANGED -> {
                Toast.makeText(context,"배터리 충전",Toast.LENGTH_SHORT).show()
            }
            Intent.ACTION_BATTERY_OKAY -> {
                Toast.makeText(context,"배터리 OK",Toast.LENGTH_SHORT).show()
            }
        }//when(intent.action)

    }//override fun onReceive(context: Context, intent: Intent)

}//class LowBatteryReceiver : BroadcastReceiver()