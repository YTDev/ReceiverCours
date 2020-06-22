package com.example.receivercours;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiverAirplaneMode extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        if(intent.getAction().equals(Intent.ACTION_DATE_CHANGED)){
            Toast.makeText(context, "La date vient d'être modifiée",Toast.LENGTH_SHORT).show();
        }
        if(intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
            Toast.makeText(context, "Le AIREPLANE vient d'être modifiée",Toast.LENGTH_SHORT).show();
        }
    }
}
