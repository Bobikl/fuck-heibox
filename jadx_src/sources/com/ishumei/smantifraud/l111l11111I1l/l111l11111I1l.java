package com.ishumei.smantifraud.l111l11111I1l;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l11111I1l {
    public static Map<String, Integer> l1111l111111Il() {
        HashMap map = new HashMap();
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return map;
        }
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver == null) {
                return map;
            }
            int intExtra = intentRegisterReceiver.getIntExtra("status", 0);
            int intExtra2 = intentRegisterReceiver.getIntExtra("level", 0);
            int intExtra3 = intentRegisterReceiver.getIntExtra("scale", 100);
            int intExtra4 = intentRegisterReceiver.getIntExtra("temperature", 0);
            int intExtra5 = intentRegisterReceiver.getIntExtra("voltage", 0);
            map.put("status", Integer.valueOf(intExtra));
            map.put("level", Integer.valueOf(intExtra2));
            map.put("scale", Integer.valueOf(intExtra3));
            map.put("temp", Integer.valueOf(intExtra4));
            map.put("vol", Integer.valueOf(intExtra5));
        } catch (Exception unused) {
        }
        return map;
    }
}
