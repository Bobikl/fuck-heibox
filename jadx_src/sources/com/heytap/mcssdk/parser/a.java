package com.heytap.mcssdk.parser;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.utils.e;
import com.heytap.msp.push.mode.BaseMode;

/* JADX INFO: compiled from: CallBackResultParser.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends c {
    @Override // com.heytap.mcssdk.parser.d
    public BaseMode a(Context context, int i10, Intent intent) {
        if (4105 == i10) {
            return c(intent, i10);
        }
        return null;
    }

    @Override // com.heytap.mcssdk.parser.c
    protected BaseMode c(Intent intent, int i10) {
        try {
            y9.b bVar = new y9.b();
            bVar.j(Integer.parseInt(com.heytap.mcssdk.utils.b.e(intent.getStringExtra("command"))));
            bVar.l(Integer.parseInt(com.heytap.mcssdk.utils.b.e(intent.getStringExtra("code"))));
            bVar.setContent(com.heytap.mcssdk.utils.b.e(intent.getStringExtra("content")));
            bVar.h(com.heytap.mcssdk.utils.b.e(intent.getStringExtra("appKey")));
            bVar.i(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.A)));
            bVar.setAppPackage(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141140e)));
            e.a("OnHandleIntent-message:" + bVar.toString());
            return bVar;
        } catch (Exception e10) {
            e.a("OnHandleIntent--" + e10.getMessage());
            return null;
        }
    }
}
