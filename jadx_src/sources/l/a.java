package l;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.tencent.msdk.dns.DnsService;
import com.tencent.msdk.dns.core.LookupResult;
import com.xiaomi.mipush.sdk.Constants;
import f.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Cache.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, LookupResult> f130816a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m.a f130817b = new m.a(DnsService.getContext());

    /* JADX INFO: renamed from: l.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cache.java */
    public static final class C1196a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f130818a = new a();
    }

    public static a d() {
        return C1196a.f130818a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    public void a() {
        Exception e10;
        SQLiteDatabase sQLiteDatabaseA;
        this.f130816a.clear();
        if (DnsService.getDnsConfig().cachedIpEnable) {
            SQLiteDatabase sQLiteDatabase = this.f130817b;
            sQLiteDatabase.getClass();
            synchronized (m.a.f131430c) {
                try {
                    try {
                        sQLiteDatabaseA = sQLiteDatabase.a();
                        try {
                            sQLiteDatabaseA.beginTransaction();
                            sQLiteDatabaseA.delete("lookupDB", null, null);
                            sQLiteDatabaseA.setTransactionSuccessful();
                            try {
                                sQLiteDatabaseA.endTransaction();
                                sQLiteDatabase = sQLiteDatabaseA;
                            } catch (Exception e11) {
                                b.e("db end transaction error " + e11, new Object[0]);
                            }
                        } catch (Exception e12) {
                            e10 = e12;
                            b.e("clear cache fail" + e10, new Object[0]);
                            sQLiteDatabase = sQLiteDatabaseA;
                            if (sQLiteDatabaseA != null) {
                                try {
                                    sQLiteDatabaseA.endTransaction();
                                    sQLiteDatabase = sQLiteDatabaseA;
                                } catch (Exception e13) {
                                    String str = "db end transaction error " + e13;
                                    b.e(str, new Object[0]);
                                    sQLiteDatabase = str;
                                }
                            }
                        }
                    } catch (Exception e14) {
                        e10 = e14;
                        sQLiteDatabaseA = null;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = 0;
                        if (sQLiteDatabase != 0) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Exception e15) {
                                b.e("db end transaction error " + e15, new Object[0]);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            C1196a.f130818a.a();
            return;
        }
        String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (strArrSplit.length <= 1) {
            C1196a.f130818a.e(str);
            return;
        }
        for (String str2 : strArrSplit) {
            C1196a.f130818a.e(str2);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00c7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.String r7, com.tencent.msdk.dns.core.LookupResult r8) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.c(java.lang.String, com.tencent.msdk.dns.core.LookupResult):void");
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("hostname".concat(" can not be empty"));
        }
        this.f130816a.remove(str);
        if (DnsService.getDnsConfig().cachedIpEnable) {
            m.a aVar = this.f130817b;
            aVar.getClass();
            aVar.b(new String[]{str});
        }
    }
}
