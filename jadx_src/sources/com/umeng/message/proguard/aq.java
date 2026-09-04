package com.umeng.message.proguard;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.umeng.message.common.UPLog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f105745a;

    public aq(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = str + lg.a.f131412e;
        }
        this.f105745a = str;
    }

    private String b(String str) {
        return this.f105745a + str;
    }

    private static String c(String str, String str2) {
        Cursor cursorQuery = null;
        try {
            try {
                Application applicationA = x.a();
                if (f.b(applicationA)) {
                    return ap.a().f105744a.getString(str, str2);
                }
                cursorQuery = applicationA.getContentResolver().query(h.c(applicationA), null, null, new String[]{str}, null);
                if (cursorQuery == null) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable unused) {
                        }
                    }
                    return str2;
                }
                if (cursorQuery.moveToFirst()) {
                    str2 = cursorQuery.getString(cursorQuery.getColumnIndex("v"));
                }
                try {
                    cursorQuery.close();
                } catch (Throwable unused2) {
                }
                return str2;
            } catch (Exception e10) {
                UPLog.e("KV", e10);
                if (0 != 0) {
                }
                return str2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    cursorQuery.close();
                } catch (Throwable unused3) {
                }
            }
            throw th2;
        }
    }

    private static void c(String str) {
        try {
            Application applicationA = x.a();
            if (f.b(applicationA)) {
                ap.a().a(str);
            } else {
                applicationA.getContentResolver().delete(h.c(applicationA), null, new String[]{str});
            }
        } catch (Throwable th2) {
            UPLog.e("KV", th2);
        }
    }

    private static void d(String str, String str2) {
        try {
            Application applicationA = x.a();
            if (f.b(applicationA)) {
                ap.a().a(str, str2);
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("k", str);
            contentValues.put("v", str2);
            applicationA.getContentResolver().insert(h.c(applicationA), contentValues);
        } catch (Exception e10) {
            UPLog.e("KV", e10);
        }
    }

    public final void a(String str) {
        c(b(str));
    }

    public final void a(String str, int i10) {
        d(b(str), String.valueOf(i10));
    }

    public final void a(String str, long j10) {
        d(b(str), String.valueOf(j10));
    }

    public final void a(String str, String str2) {
        d(b(str), String.valueOf(str2));
    }

    public final void a(String str, Set<String> set) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (set != null) {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            d(b(str), jSONArray.toString());
        } catch (Throwable th2) {
            UPLog.e("KV", th2);
        }
    }

    public final void a(String str, boolean z10) {
        d(b(str), String.valueOf(z10));
    }

    public final int b(String str, int i10) {
        String strC = c(b(str), String.valueOf(i10));
        if (!TextUtils.isEmpty(strC)) {
            try {
                return Integer.parseInt(strC);
            } catch (Exception e10) {
                UPLog.e("KV", e10);
            }
        }
        return i10;
    }

    public final long b(String str, long j10) {
        String strC = c(b(str), String.valueOf(j10));
        if (!TextUtils.isEmpty(strC)) {
            try {
                return Long.parseLong(strC);
            } catch (Exception e10) {
                UPLog.e("KV", e10);
            }
        }
        return j10;
    }

    public final String b(String str, String str2) {
        return c(b(str), str2);
    }

    public final Set<String> b(String str, Set<String> set) {
        try {
            String strC = c(b(str), "");
            if (!TextUtils.isEmpty(strC)) {
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = new JSONArray(strC);
                int length = jSONArray.length();
                if (length > 0) {
                    for (int i10 = 0; i10 < length; i10++) {
                        hashSet.add(jSONArray.optString(i10));
                    }
                }
                return hashSet;
            }
        } catch (Throwable th2) {
            UPLog.e("KV", th2);
        }
        return set;
    }

    public final boolean b(String str, boolean z10) {
        String strC = c(b(str), String.valueOf(z10));
        if (!TextUtils.isEmpty(strC)) {
            try {
                return Boolean.parseBoolean(strC);
            } catch (Exception e10) {
                UPLog.e("KV", e10);
            }
        }
        return z10;
    }
}
