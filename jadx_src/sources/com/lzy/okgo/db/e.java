package com.lzy.okgo.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.model.Progress;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: DBHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends SQLiteOpenHelper {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f64709f = "okgo.db";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f64710g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f64711h = "cache";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f64712i = "cookie";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f64713j = "download";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f64714k = "upload";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Lock f64715l = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f64716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f64717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f64718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f64719e;

    e() {
        this(com.lzy.okgo.b.p().m());
    }

    e(Context context) {
        super(context, f64709f, (SQLiteDatabase.CursorFactory) null, 1);
        this.f64716b = new h(f64711h);
        this.f64717c = new h("cookie");
        this.f64718d = new h("download");
        this.f64719e = new h(f64714k);
        this.f64716b.a(new c("key", "VARCHAR", true, true)).a(new c(CacheEntity.f64636i, "INTEGER")).a(new c("head", "BLOB")).a(new c("data", "BLOB"));
        this.f64717c.a(new c("host", "VARCHAR")).a(new c("name", "VARCHAR")).a(new c("domain", "VARCHAR")).a(new c("cookie", "BLOB")).a(new c("host", "name", "domain"));
        this.f64718d.a(new c("tag", "VARCHAR", true, true)).a(new c("url", "VARCHAR")).a(new c(Progress.D, "VARCHAR")).a(new c(Progress.E, "VARCHAR")).a(new c(Progress.F, "VARCHAR")).a(new c(Progress.G, "VARCHAR")).a(new c(Progress.H, "INTEGER")).a(new c(Progress.I, "INTEGER")).a(new c("status", "INTEGER")).a(new c("priority", "INTEGER")).a(new c(Progress.L, "INTEGER")).a(new c("request", "BLOB")).a(new c(Progress.N, "BLOB")).a(new c(Progress.O, "BLOB")).a(new c(Progress.P, "BLOB"));
        this.f64719e.a(new c("tag", "VARCHAR", true, true)).a(new c("url", "VARCHAR")).a(new c(Progress.D, "VARCHAR")).a(new c(Progress.E, "VARCHAR")).a(new c(Progress.F, "VARCHAR")).a(new c(Progress.G, "VARCHAR")).a(new c(Progress.H, "INTEGER")).a(new c(Progress.I, "INTEGER")).a(new c("status", "INTEGER")).a(new c("priority", "INTEGER")).a(new c(Progress.L, "INTEGER")).a(new c("request", "BLOB")).a(new c(Progress.N, "BLOB")).a(new c(Progress.O, "BLOB")).a(new c(Progress.P, "BLOB"));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (PatchProxy.proxy(new Object[]{sQLiteDatabase}, this, changeQuickRedirect, false, bb.c.b.V6, new Class[]{SQLiteDatabase.class}, Void.TYPE).isSupported) {
            return;
        }
        sQLiteDatabase.execSQL(this.f64716b.b());
        sQLiteDatabase.execSQL(this.f64717c.b());
        sQLiteDatabase.execSQL(this.f64718d.b());
        sQLiteDatabase.execSQL(this.f64719e.b());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        Object[] objArr = {sQLiteDatabase, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.X6, new Class[]{SQLiteDatabase.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        Object[] objArr = {sQLiteDatabase, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.W6, new Class[]{SQLiteDatabase.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (f.b(sQLiteDatabase, this.f64716b)) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cache");
        }
        if (f.b(sQLiteDatabase, this.f64717c)) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cookie");
        }
        if (f.b(sQLiteDatabase, this.f64718d)) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS download");
        }
        if (f.b(sQLiteDatabase, this.f64719e)) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS upload");
        }
        onCreate(sQLiteDatabase);
    }
}
