package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ig {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ak f571a = new ak(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f107364a = -1;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static long f570a = System.currentTimeMillis();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final Object f573a = new Object();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static List<a> f575a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f574a = "";

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static com.xiaomi.push.providers.a f572a = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107365a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public long f576a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public String f577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f107366b;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        public long f578b;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        public String f579b;

        public a(String str, long j10, int i10, int i11, String str2, long j11) {
            this.f577a = str;
            this.f576a = j10;
            this.f107365a = i10;
            this.f107366b = i11;
            this.f579b = str2;
            this.f578b = j11;
        }

        public boolean a(a aVar) {
            return TextUtils.equals(aVar.f577a, this.f577a) && TextUtils.equals(aVar.f579b, this.f579b) && aVar.f107365a == this.f107365a && aVar.f107366b == this.f107366b && Math.abs(aVar.f576a - this.f576a) <= 5000;
        }
    }

    public static int a(Context context) {
        if (f107364a == -1) {
            f107364a = b(context);
        }
        return f107364a;
    }

    public static int a(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    private static long a(int i10, long j10, boolean z10, long j11, boolean z11) {
        if (z10 && z11) {
            long j12 = f570a;
            f570a = j11;
            if (j11 - j12 > 30000 && j10 > 1024) {
                return j10 * 2;
            }
        }
        return (j10 * ((long) (i10 == 0 ? 13 : 11))) / 10;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static com.xiaomi.push.providers.a m477a(Context context) {
        com.xiaomi.push.providers.a aVar = f572a;
        if (aVar != null) {
            return aVar;
        }
        com.xiaomi.push.providers.a aVar2 = new com.xiaomi.push.providers.a(context);
        f572a = aVar2;
        return aVar2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static synchronized String m478a(Context context) {
        if (TextUtils.isEmpty(f574a)) {
            return "";
        }
        return f574a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m480a(Context context) {
        f107364a = b(context);
    }

    private static void a(Context context, String str, long j10, boolean z10, long j11) {
        int iA;
        boolean zIsEmpty;
        if (context == null || TextUtils.isEmpty(str) || !"com.xiaomi.xmsf".equals(context.getPackageName()) || "com.xiaomi.xmsf".equals(str) || -1 == (iA = a(context))) {
            return;
        }
        synchronized (f573a) {
            zIsEmpty = f575a.isEmpty();
            a(new a(str, j11, iA, z10 ? 1 : 0, iA == 0 ? m478a(context) : "", j10));
        }
        if (zIsEmpty) {
            f571a.a(new ih(context), 5000L);
        }
    }

    public static void a(Context context, String str, long j10, boolean z10, boolean z11, long j11) {
        a(context, str, a(a(context), j10, z10, j11, z11), z10, j11);
    }

    private static void a(a aVar) {
        for (a aVar2 : f575a) {
            if (aVar2.a(aVar)) {
                aVar2.f578b += aVar.f578b;
                return;
            }
        }
        f575a.add(aVar);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static synchronized void m481a(String str) {
        if (!j.m526d() && !TextUtils.isEmpty(str)) {
            f574a = str;
        }
    }

    private static int b(Context context) {
        bj bjVarM172a = bg.m172a();
        if (bjVarM172a == null) {
            return -1;
        }
        return bjVarM172a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, List<a> list) {
        try {
            synchronized (com.xiaomi.push.providers.a.f940a) {
                SQLiteDatabase writableDatabase = m477a(context).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (a aVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("package_name", aVar.f577a);
                        contentValues.put("message_ts", Long.valueOf(aVar.f576a));
                        contentValues.put("network_type", Integer.valueOf(aVar.f107365a));
                        contentValues.put("bytes", Long.valueOf(aVar.f578b));
                        contentValues.put("rcv", Integer.valueOf(aVar.f107366b));
                        contentValues.put(Constants.KEY_IMSI, aVar.f579b);
                        writableDatabase.insert(com.umeng.analytics.pro.d.F, null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            com.xiaomi.channel.commonutils.logger.b.a(th3);
        }
    }
}
