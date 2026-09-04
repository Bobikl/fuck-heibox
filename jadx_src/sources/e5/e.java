package e5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile e f118555g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f118556h = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BroadcastReceiver f118562f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f118557a = new a("udid");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f118558b = new a("oaid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f118560d = new a("vaid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f118559c = new a("aaid");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f118561e = new c();

    public static d a(Cursor cursor) {
        String str;
        d dVar = new d(null, 0);
        if (cursor == null) {
            str = "parseValue fail, cursor is null.";
        } else {
            if (!cursor.isClosed()) {
                cursor.moveToFirst();
                int columnIndex = cursor.getColumnIndex("value");
                if (columnIndex >= 0) {
                    dVar.f118552a = cursor.getString(columnIndex);
                } else {
                    e("parseValue fail, index < 0.");
                }
                int columnIndex2 = cursor.getColumnIndex("code");
                if (columnIndex2 >= 0) {
                    dVar.f118553b = cursor.getInt(columnIndex2);
                } else {
                    e("parseCode fail, index < 0.");
                }
                int columnIndex3 = cursor.getColumnIndex("expired");
                if (columnIndex3 >= 0) {
                    dVar.f118554c = cursor.getLong(columnIndex3);
                } else {
                    e("parseExpired fail, index < 0.");
                }
                return dVar;
            }
            str = "parseValue fail, cursor is closed.";
        }
        e(str);
        return dVar;
    }

    public static final e b() {
        if (f118555g == null) {
            synchronized (e.class) {
                if (f118555g == null) {
                    f118555g = new e();
                }
            }
        }
        return f118555g;
    }

    public static String d(PackageManager packageManager, String str) {
        ProviderInfo providerInfoResolveContentProvider;
        if (packageManager == null || (providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (providerInfoResolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return providerInfoResolveContentProvider.packageName;
    }

    public static void e(String str) {
        if (f118556h) {
            Log.d("OpenIdManager", str);
        }
    }

    public static void f(boolean z10) {
        f118556h = z10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056 A[PHI: r7
  0x0056: PHI (r7v3 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v4 android.database.Cursor) binds: [B:19:0x0054, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean g(Context context) {
        e("querySupport version : 1.0.8");
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                if (cursorQuery != null) {
                    d dVarA = a(cursorQuery);
                    boolean z10 = 1000 != dVarA.f118553b || "0".equals(dVarA.f118552a);
                    cursorQuery.close();
                    return z10;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e10) {
                e("querySupport, Exception : " + e10.getMessage());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return false;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    private String i(Context context, a aVar) throws Throwable {
        String str;
        Cursor cursorQuery;
        String str2;
        String strValueOf;
        e("queryId : " + aVar.f118546c);
        Cursor cursor = null;
        str = null;
        str = null;
        String str3 = null;
        cursor = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{aVar.f118546c}, null);
                try {
                    if (cursorQuery != null) {
                        d dVarA = a(cursorQuery);
                        str3 = dVarA.f118552a;
                        aVar.c(str3);
                        aVar.b(dVarA.f118554c);
                        aVar.a(dVarA.f118553b);
                        e(aVar.f118546c + " errorCode : " + aVar.f118547d);
                        if (dVarA.f118553b != 1000) {
                            k(context);
                            if (!h(context, false)) {
                                str2 = "not support, forceQuery isSupported: ";
                                strValueOf = String.valueOf(h(context, true));
                                e(str2.concat(strValueOf));
                            }
                        }
                    } else if (h(context, false)) {
                        str2 = "forceQuery isSupported : ";
                        strValueOf = String.valueOf(h(context, true));
                        e(str2.concat(strValueOf));
                    }
                    if (cursorQuery == null) {
                        return str3;
                    }
                } catch (Exception e10) {
                    e = e10;
                    str = str3;
                    cursor = cursorQuery;
                    e("queryId, Exception : " + e.getMessage());
                    if (cursor == null) {
                        return str;
                    }
                    cursorQuery = cursor;
                    str3 = str;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                str = null;
            }
            cursorQuery.close();
            return str3;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String j(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            e("getAppVersion, Exception : " + e10.getMessage());
            return null;
        }
    }

    private synchronized void k(Context context) {
        if (this.f118562f != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        com.alipay.sdk.m.i0.e eVar = new com.alipay.sdk.m.i0.e();
        this.f118562f = eVar;
        context.registerReceiver(eVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }

    public final String c(Context context, a aVar) {
        String str;
        if (aVar == null) {
            str = "getId, openId = null.";
        } else {
            if (aVar.d()) {
                return aVar.f118545b;
            }
            if (h(context, true)) {
                return i(context, aVar);
            }
            str = "getId, isSupported = false.";
        }
        e(str);
        return null;
    }

    public final boolean h(Context context, boolean z10) {
        if (this.f118561e.b() && !z10) {
            return this.f118561e.e();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        String strD = d(packageManager, "com.meizu.flyme.openidsdk");
        if (TextUtils.isEmpty(strD)) {
            return false;
        }
        String strJ = j(packageManager, strD);
        if (this.f118561e.b() && this.f118561e.c(strJ)) {
            e("use same version cache, safeVersion : ".concat(String.valueOf(strJ)));
            return this.f118561e.e();
        }
        this.f118561e.d(strJ);
        boolean zG = g(context);
        e("query support, result : ".concat(String.valueOf(zG)));
        this.f118561e.a(zG);
        return zG;
    }
}
