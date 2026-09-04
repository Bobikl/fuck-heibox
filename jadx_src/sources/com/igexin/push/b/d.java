package com.igexin.push.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.igexin.a.a.d.e;
import com.igexin.push.config.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63327a = k.f63422a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected SQLiteDatabase f63328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Cursor f63329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ContentValues f63330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f63331g;

    public d() {
        super(1);
    }

    public d(ContentValues contentValues) {
        super(1);
        this.f63330f = contentValues;
    }

    public abstract void a() throws Exception;

    @Override // com.igexin.a.a.d.e
    public void b() throws Exception {
        super.b();
        this.f63328d = com.igexin.push.core.c.a().k().getWritableDatabase();
        a();
        if (this.f63331g != null) {
            com.igexin.a.a.b.c.b().a(this.f63331g);
            com.igexin.a.a.b.c.b().c();
        }
    }

    @Override // com.igexin.a.a.d.a.e
    public final int b_() {
        return -2147483640;
    }

    @Override // com.igexin.a.a.d.e
    public void c() {
        super.c();
        Cursor cursor = this.f63329e;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        try {
            this.f63329e.close();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.igexin.a.a.d.e
    public void d() {
        this.f63234m = true;
        this.H = true;
    }

    @Override // com.igexin.a.a.d.e
    protected void e() {
    }
}
