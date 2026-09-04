package com.igexin.push.core.b;

import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f63512b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, byte[]> f63513a = new HashMap();

    private c() {
    }

    public static c a() {
        if (f63512b == null) {
            f63512b = new c();
        }
        return f63512b;
    }

    @Override // com.igexin.push.core.b.b
    public void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // com.igexin.push.core.b.b
    public void b(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // com.igexin.push.core.b.b
    public void c(SQLiteDatabase sQLiteDatabase) {
    }
}
