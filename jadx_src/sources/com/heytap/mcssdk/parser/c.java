package com.heytap.mcssdk.parser;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.utils.e;
import com.heytap.msp.push.mode.BaseMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MessageParser.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c implements d {
    public static List<BaseMode> b(Context context, Intent intent) {
        BaseMode baseModeA;
        if (intent == null) {
            return null;
        }
        int i10 = 4096;
        try {
            i10 = Integer.parseInt(com.heytap.mcssdk.utils.b.e(intent.getStringExtra("type")));
        } catch (Exception e10) {
            e.d("MessageParser--getMessageByIntent--Exception:" + e10.getMessage());
        }
        e.a("MessageParser--getMessageByIntent--type:" + i10);
        ArrayList arrayList = new ArrayList();
        for (d dVar : com.heytap.mcssdk.d.P().T()) {
            if (dVar != null && (baseModeA = dVar.a(context, i10, intent)) != null) {
                arrayList.add(baseModeA);
            }
        }
        return arrayList;
    }

    protected abstract BaseMode c(Intent intent, int i10);
}
