package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes4.dex */
public class cw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f106932a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static SimpleDateFormat f257a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f257a = simpleDateFormat;
        f106932a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static ir a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ir irVar = new ir();
        irVar.d("category_push_stat");
        irVar.a("push_sdk_stat_channel");
        irVar.a(1L);
        irVar.b(str);
        irVar.a(true);
        irVar.b(System.currentTimeMillis());
        irVar.g(cf.a(context).m224a());
        irVar.e("com.xiaomi.xmsf");
        irVar.f("");
        irVar.c("push_stat");
        return irVar;
    }
}
