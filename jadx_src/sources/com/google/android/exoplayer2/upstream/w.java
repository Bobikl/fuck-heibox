package com.google.android.exoplayer2.upstream;

import android.content.Context;

/* JADX INFO: compiled from: DefaultDataSourceFactory.java */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public final class w implements o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f51286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final u0 f51287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o.a f51288c;

    public w(Context context) {
        this(context, (String) null, (u0) null);
    }

    public w(Context context, o.a aVar) {
        this(context, (u0) null, aVar);
    }

    public w(Context context, @androidx.annotation.p0 u0 u0Var, o.a aVar) {
        this.f51286a = context.getApplicationContext();
        this.f51287b = u0Var;
        this.f51288c = aVar;
    }

    public w(Context context, @androidx.annotation.p0 String str) {
        this(context, str, (u0) null);
    }

    public w(Context context, @androidx.annotation.p0 String str, @androidx.annotation.p0 u0 u0Var) {
        this(context, u0Var, new x.b().k(str));
    }

    @Override // com.google.android.exoplayer2.upstream.o.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a() {
        v vVar = new v(this.f51286a, this.f51288c.a());
        u0 u0Var = this.f51287b;
        if (u0Var != null) {
            vVar.e(u0Var);
        }
        return vVar;
    }
}
