package androidx.constraintlayout.core.state;

import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: Registry.java */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f18138b = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, e> f18139a = new HashMap<>();

    public static d c() {
        return f18138b;
    }

    public String a(String str) {
        e eVar = this.f18139a.get(str);
        if (eVar != null) {
            return eVar.g();
        }
        return null;
    }

    public String b(String str) {
        e eVar = this.f18139a.get(str);
        if (eVar != null) {
            return eVar.h();
        }
        return null;
    }

    public long d(String str) {
        e eVar = this.f18139a.get(str);
        if (eVar != null) {
            return eVar.f();
        }
        return Long.MAX_VALUE;
    }

    public Set<String> e() {
        return this.f18139a.keySet();
    }

    public void f(String str, e eVar) {
        this.f18139a.put(str, eVar);
    }

    public void g(String str, int i10) {
        e eVar = this.f18139a.get(str);
        if (eVar != null) {
            eVar.d(i10);
        }
    }

    public void h(String str, int i10) {
        e eVar = this.f18139a.get(str);
        if (eVar != null) {
            eVar.e(i10);
        }
    }

    public void i(String str, e eVar) {
        this.f18139a.remove(str);
    }

    public void j(String str, String str2) {
        e eVar = this.f18139a.get(str);
        if (eVar != null) {
            eVar.c(str2);
        }
    }

    public void k(String str, int i10, int i11) {
        e eVar = this.f18139a.get(str);
        if (eVar != null) {
            eVar.b(i10, i11);
        }
    }

    public void l(String str, float f10) {
        e eVar = this.f18139a.get(str);
        if (eVar != null) {
            eVar.a(f10);
        }
    }
}
