package com.igexin.push.extension.distribution.basic.d;

import android.content.ContentValues;
import android.database.Cursor;
import com.igexin.push.extension.distribution.basic.c.e;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f63976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63977b = "EXT-" + b.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static com.igexin.push.extension.distribution.basic.e.a f63978c = null;

    public static b a() {
        if (f63976a == null) {
            f63976a = new b();
            f63978c = new com.igexin.push.extension.distribution.basic.e.a(e.f63961a);
        }
        return f63976a;
    }

    public void a(int i10, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", Integer.valueOf(i10));
        contentValues.put("value", str);
        f63978c.a("extconfig", (String) null, contentValues);
    }

    public void a(long j10) {
        e.f63969i = j10;
        a(6, String.valueOf(j10));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x000b A[SYNTHETIC] */
    public void b() {
        String str;
        Cursor cursorA = null;
        try {
            cursorA = e.f63965e.a("select key, value from extconfig order by key", (String[]) null);
            if (cursorA != null) {
                while (cursorA.moveToNext()) {
                    int i10 = cursorA.getInt(cursorA.getColumnIndex("key"));
                    if (i10 == 11 || i10 == 12 || i10 == 14) {
                        byte[] blob = cursorA.getBlob(cursorA.getColumnIndex("value"));
                        if (blob != null) {
                            blob = com.igexin.a.b.a.c(blob);
                        }
                        if (blob != null) {
                            str = new String(blob);
                            if (i10 != 4) {
                                e.f63964d = str;
                            } else if (i10 != 6) {
                                e.f63969i = Long.parseLong(str);
                            }
                        }
                    } else {
                        try {
                            str = cursorA.getString(cursorA.getColumnIndex("value"));
                            if (i10 != 4) {
                                e.f63964d = str;
                            } else if (i10 != 6) {
                                e.f63969i = Long.parseLong(str);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            if (cursorA == null) {
                return;
            }
        } catch (Exception unused2) {
            if (cursorA == null) {
                return;
            }
        } catch (Throwable th2) {
            if (cursorA != null) {
                cursorA.close();
            }
            throw th2;
        }
        cursorA.close();
    }
}
