package com.xiaomi.push;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public class bc implements ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f106858a = "content://com.vivo.vms.IdProvider/IdentifierId/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f106859b = f106858a + "OAID";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f106860c = f106858a + "VAID_";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f106861d = f106858a + "AAID_";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f106862e = f106858a + s5.b.f139290h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f106863f = s5.c.f139298c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f209a;

    public bc(Context context) {
        this.f209a = context;
    }

    private String a(String str) throws Throwable {
        Throwable th2;
        Cursor cursorQuery;
        String string = null;
        try {
            cursorQuery = this.f209a.getContentResolver().query(Uri.parse(str), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                    }
                    return string;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused2) {
            cursorQuery = null;
        } catch (Throwable th4) {
            th2 = th4;
            cursorQuery = null;
        }
        return string;
    }

    public static boolean a(Context context) {
        try {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(Uri.parse(f106858a).getAuthority(), 128);
            if (providerInfoResolveContentProvider != null) {
                if ((providerInfoResolveContentProvider.applicationInfo.flags & 1) != 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.xiaomi.push.ar
    /* JADX INFO: renamed from: a */
    public String mo150a() {
        return a(f106859b);
    }

    @Override // com.xiaomi.push.ar
    /* JADX INFO: renamed from: a */
    public boolean mo151a() {
        return "1".equals(q.a(f106863f, "0"));
    }
}
