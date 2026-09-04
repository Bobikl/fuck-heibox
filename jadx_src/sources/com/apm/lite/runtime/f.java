package com.apm.lite.runtime;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f f40184b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f40185a;

    public static final class a extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        com.apm.lite.d.c f40186c = null;

        a() {
        }

        @Override // com.apm.lite.runtime.f
        public Object b(String str) {
            if (this.f40186c == null) {
                this.f40186c = com.apm.lite.d.c.g(com.apm.lite.e.m());
            }
            return this.f40186c.s().opt(str);
        }
    }

    f() {
        this(f40184b);
    }

    f(f fVar) {
        this.f40185a = fVar;
    }

    public Object a(String str) {
        f fVar = this.f40185a;
        if (fVar != null) {
            return fVar.a(str);
        }
        return null;
    }

    public Object b(String str) {
        f fVar = this.f40185a;
        if (fVar != null) {
            return fVar.b(str);
        }
        return null;
    }
}
