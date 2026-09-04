package com.igexin.push.b;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.igexin.a.a.d.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f63320e = "com.igexin.push.b.a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected SQLiteDatabase f63321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Cursor f63322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<com.igexin.push.core.b.b> f63323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f63324d;

    public a() {
        super(1);
        this.f63323c = new LinkedList();
    }

    public void a(com.igexin.push.core.b.b bVar) {
        this.f63323c.add(bVar);
    }

    @Override // com.igexin.a.a.d.e
    public void b() throws Exception {
        super.b();
        SQLiteDatabase writableDatabase = com.igexin.push.core.c.a().k().getWritableDatabase();
        this.f63321a = writableDatabase;
        writableDatabase.setVersion(4);
        Iterator<com.igexin.push.core.b.b> it = this.f63323c.iterator();
        while (it.hasNext()) {
            it.next().a(this.f63321a);
        }
        for (com.igexin.push.core.b.b bVar : this.f63323c) {
            if (this.f63324d) {
                bVar.c(this.f63321a);
            } else {
                bVar.b(this.f63321a);
            }
        }
        com.igexin.a.a.b.c.b().a(new c(-980948));
        com.igexin.a.a.b.c.b().c();
    }

    @Override // com.igexin.a.a.d.a.e
    public final int b_() {
        return -2147483639;
    }

    @Override // com.igexin.a.a.d.e
    public void c() {
        super.c();
        Cursor cursor = this.f63322b;
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.igexin.a.a.d.e
    public void d() {
        super.d();
        this.f63234m = true;
        this.H = true;
    }

    @Override // com.igexin.a.a.d.e
    protected void e() {
    }
}
