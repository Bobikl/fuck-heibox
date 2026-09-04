package com.tencent.qmsp.sdk.g.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile c f101995g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f102000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BroadcastReceiver f102001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f101996a = new b("udid");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f101997b = new b("oaid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f101999d = new b("vaid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f101998c = new b("aaid");

    public static final c a() {
        if (f101995g == null) {
            synchronized (c.class) {
                f101995g = new c();
            }
        }
        return f101995g;
    }

    public static e a(Cursor cursor) {
        String str;
        e eVar = new e(null, 0);
        if (cursor == null) {
            str = "parseValue fail, cursor is null.";
        } else {
            if (!cursor.isClosed()) {
                cursor.moveToFirst();
                int columnIndex = cursor.getColumnIndex("value");
                if (columnIndex >= 0) {
                    eVar.f102004c = cursor.getString(columnIndex);
                } else {
                    b("parseValue fail, index < 0.");
                }
                int columnIndex2 = cursor.getColumnIndex("code");
                if (columnIndex2 >= 0) {
                    eVar.f102002a = cursor.getInt(columnIndex2);
                } else {
                    b("parseCode fail, index < 0.");
                }
                int columnIndex3 = cursor.getColumnIndex("expired");
                if (columnIndex3 >= 0) {
                    eVar.f102003b = cursor.getLong(columnIndex3);
                } else {
                    str = "parseExpired fail, index < 0.";
                }
                return eVar;
            }
            str = "parseValue fail, cursor is closed.";
        }
        b(str);
        return eVar;
    }

    public static void b(String str) {
        com.tencent.qmsp.sdk.base.c.a("MzOpenIdManager " + str);
    }

    public b a(String str) {
        if ("oaid".equals(str)) {
            return this.f101997b;
        }
        if ("vaid".equals(str)) {
            return this.f101999d;
        }
        if ("aaid".equals(str)) {
            return this.f101998c;
        }
        if ("udid".equals(str)) {
            return this.f101996a;
        }
        return null;
    }

    public final String a(Context context, b bVar) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor = null;
        if (bVar == null) {
            return null;
        }
        if (bVar.a()) {
            return bVar.f101994d;
        }
        b("queryId : " + bVar.f101993c);
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{bVar.f101993c}, null);
            try {
                if (cursorQuery == null) {
                    try {
                        a(context, false);
                        boolean zA = a(context, true);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("forceQuery isSupported : ");
                        sb2.append(zA);
                        b(sb2.toString());
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    } catch (Exception unused) {
                        if (cursorQuery == null) {
                            return null;
                        }
                        cursorQuery.close();
                        return null;
                    }
                }
                try {
                    e eVarA = a(cursorQuery);
                    String str = eVarA.f102004c;
                    try {
                        bVar.a(str);
                        bVar.a(eVarA.f102003b);
                        bVar.a(eVarA.f102002a);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(bVar.f101993c);
                        sb3.append(" errorCode : ");
                        sb3.append(bVar.f101991a);
                        b(sb3.toString());
                        if (eVarA.f102002a == 1000) {
                            cursorQuery.close();
                            return str;
                        }
                        a(context);
                        if (a(context, false)) {
                            cursorQuery.close();
                            return str;
                        }
                        boolean zA2 = a(context, true);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("not support, forceQuery isSupported: ");
                        sb4.append(zA2);
                        b(sb4.toString());
                        cursorQuery.close();
                        return str;
                    } catch (Exception unused2) {
                        cursorQuery.close();
                        return null;
                    }
                } catch (Exception unused3) {
                    cursorQuery.close();
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void a(Context context) {
        synchronized (this) {
            if (this.f102001f == null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
                a aVar = new a();
                this.f102001f = aVar;
                context.registerReceiver(aVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public final boolean a(Context context, boolean z10) {
        boolean z11;
        Boolean bool = this.f102000e;
        if (bool != null && !z10) {
            return bool.booleanValue();
        }
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            z11 = packageManager != null;
            if (packageManager.resolveContentProvider("com.meizu.flyme.openidsdk", 0) == null) {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (!z11) {
            b("is not Supported, for isLegalProvider : false");
            this.f102000e = Boolean.FALSE;
            return false;
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                if (cursorQuery == null) {
                    this.f102000e = Boolean.FALSE;
                }
                try {
                    String str = a(cursorQuery).f102004c;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("querySupport, result : ");
                    sb2.append(str);
                    b(sb2.toString());
                    Boolean boolValueOf = Boolean.valueOf("0".equals(str));
                    this.f102000e = boolValueOf;
                    return boolValueOf.booleanValue();
                } catch (Exception unused) {
                    if (cursorQuery == null) {
                        return false;
                    }
                    return false;
                }
            } catch (Exception unused2) {
                if (cursorQuery == null) {
                    return false;
                }
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }
}
