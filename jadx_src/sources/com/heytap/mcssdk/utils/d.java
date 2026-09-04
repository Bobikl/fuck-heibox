package com.heytap.mcssdk.utils;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: DataMessageUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f59957a = "type";

    public void a(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction(com.heytap.mcssdk.d.P().b0(context));
            intent.setPackage(com.heytap.mcssdk.d.P().R(context));
            intent.putExtra(x9.b.f141140e, context.getPackageName());
            intent.putExtra(x9.b.f141138c, str);
            intent.putExtra("type", 12312);
            context.startService(intent);
        } catch (Exception e10) {
            e.d("statisticMessage--Exception" + e10.getMessage());
        }
    }
}
