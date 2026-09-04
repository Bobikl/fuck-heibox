package com.tencent.qmsp.oaid2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public class x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile x f101665g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f101670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BroadcastReceiver f101671f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f101666a = new w("udid");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f101667b = new w("oaid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f101669d = new w("vaid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f101668c = new w("aaid");

    public static final x a() {
        if (f101665g == null) {
            synchronized (x.class) {
                f101665g = new x();
            }
        }
        return f101665g;
    }

    public static z a(Cursor cursor) {
        z zVar = new z(null, 0);
        if (cursor == null) {
            b("parseValue fail, cursor is null.");
        } else if (cursor.isClosed()) {
            b("parseValue fail, cursor is closed.");
        } else {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex("value");
            if (columnIndex >= 0) {
                zVar.f101674c = cursor.getString(columnIndex);
            } else {
                b("parseValue fail, index < 0.");
            }
            int columnIndex2 = cursor.getColumnIndex("code");
            if (columnIndex2 >= 0) {
                zVar.f101672a = cursor.getInt(columnIndex2);
            } else {
                b("parseCode fail, index < 0.");
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                zVar.f101673b = cursor.getLong(columnIndex3);
            } else {
                b("parseExpired fail, index < 0.");
            }
        }
        return zVar;
    }

    public static void b(String str) {
        c.a("MzOpenIdManager " + str);
    }

    public w a(String str) {
        if ("oaid".equals(str)) {
            return this.f101667b;
        }
        if ("vaid".equals(str)) {
            return this.f101669d;
        }
        if ("aaid".equals(str)) {
            return this.f101668c;
        }
        if ("udid".equals(str)) {
            return this.f101666a;
        }
        return null;
    }

    public final String a(Context context, w wVar) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor = null;
        if (wVar == null) {
            return null;
        }
        if (wVar.a()) {
            return wVar.f101664d;
        }
        b("queryId : " + wVar.f101663c);
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{wVar.f101663c}, null);
            try {
                if (cursorQuery == null) {
                    try {
                        a(context, false);
                        b("forceQuery isSupported : " + a(context, true));
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
                    z zVarA = a(cursorQuery);
                    String str = zVarA.f101674c;
                    try {
                        wVar.a(str);
                        wVar.a(zVarA.f101673b);
                        wVar.a(zVarA.f101672a);
                        b(wVar.f101663c + " errorCode : " + wVar.f101661a);
                        if (zVarA.f101672a == 1000) {
                            cursorQuery.close();
                            return str;
                        }
                        a(context);
                        if (a(context, false)) {
                            cursorQuery.close();
                            return str;
                        }
                        b("not support, forceQuery isSupported: " + a(context, true));
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
            if (this.f101671f == null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
                v vVar = new v();
                this.f101671f = vVar;
                context.registerReceiver(vVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public final boolean a(Context context, boolean z10) {
        boolean z11;
        Boolean bool = this.f101670e;
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
            this.f101670e = Boolean.FALSE;
            return false;
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                if (cursorQuery == null) {
                    this.f101670e = Boolean.FALSE;
                }
                try {
                    String str = a(cursorQuery).f101674c;
                    b("querySupport, result : " + str);
                    Boolean boolValueOf = Boolean.valueOf("0".equals(str));
                    this.f101670e = boolValueOf;
                    return boolValueOf.booleanValue();
                } catch (Exception unused) {
                    if (cursorQuery == null) {
                        return false;
                    }
                    return false;
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Exception unused2) {
            if (cursorQuery == null) {
                return false;
            }
        }
    }
}
