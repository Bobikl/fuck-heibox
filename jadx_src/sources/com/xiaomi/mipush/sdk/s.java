package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.in;
import com.xiaomi.push.ix;
import com.xiaomi.push.jj;
import com.xiaomi.push.jm;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile s f106800a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final Context f157a;

    private s(Context context) {
        this.f157a = context.getApplicationContext();
    }

    private static s a(Context context) {
        if (f106800a == null) {
            synchronized (s.class) {
                if (f106800a == null) {
                    f106800a = new s(context);
                }
            }
        }
        return f106800a;
    }

    public static void a(Context context, jj jjVar) {
        a(context).a(jjVar, 0, true);
    }

    public static void a(Context context, jj jjVar, boolean z10) {
        a(context).a(jjVar, 1, z10);
    }

    private void a(jj jjVar, int i10, boolean z10) {
        if (com.xiaomi.push.j.m521a(this.f157a) || !com.xiaomi.push.j.m520a() || jjVar == null || jjVar.f744a != in.SendMessage || jjVar.m564a() == null || !z10) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("click to start activity result:" + String.valueOf(i10));
        jm jmVar = new jm(jjVar.m564a().m530a(), false);
        jmVar.c(ix.SDK_START_ACTIVITY.f623a);
        jmVar.b(jjVar.m565a());
        jmVar.d(jjVar.f751b);
        HashMap map = new HashMap();
        jmVar.f763a = map;
        map.put("result", String.valueOf(i10));
        ao.a(this.f157a).a(jmVar, in.Notification, false, false, null, true, jjVar.f751b, jjVar.f747a, true, false);
    }

    public static void b(Context context, jj jjVar, boolean z10) {
        a(context).a(jjVar, 2, z10);
    }

    public static void c(Context context, jj jjVar, boolean z10) {
        a(context).a(jjVar, 3, z10);
    }

    public static void d(Context context, jj jjVar, boolean z10) {
        a(context).a(jjVar, 4, z10);
    }

    public static void e(Context context, jj jjVar, boolean z10) {
        b bVarM111a = b.m111a(context);
        if (TextUtils.isEmpty(bVarM111a.m119c()) || TextUtils.isEmpty(bVarM111a.d())) {
            a(context).a(jjVar, 6, z10);
        } else if (bVarM111a.m123f()) {
            a(context).a(jjVar, 7, z10);
        } else {
            a(context).a(jjVar, 5, z10);
        }
    }
}
