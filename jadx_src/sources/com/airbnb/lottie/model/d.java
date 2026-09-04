package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import androidx.annotation.j;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tools.ant.types.selectors.m0;

/* JADX INFO: compiled from: KeyPath.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f37578c = new d("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f37579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private e f37580b;

    private d(d dVar) {
        this.f37579a = new ArrayList(dVar.f37579a);
        this.f37580b = dVar.f37580b;
    }

    public d(String... strArr) {
        this.f37579a = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.f37579a;
        return list.get(list.size() - 1).equals(m0.f136554a);
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    @j
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d a(String str) {
        d dVar = new d(this);
        dVar.f37579a.add(str);
        return dVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean c(String str, int i10) {
        if (i10 >= this.f37579a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f37579a.size() - 1;
        String str2 = this.f37579a.get(i10);
        if (!str2.equals(m0.f136554a)) {
            return (z10 || (i10 == this.f37579a.size() + (-2) && b())) && (str2.equals(str) || str2.equals(androidx.webkit.b.f28327e));
        }
        if (!z10 && this.f37579a.get(i10 + 1).equals(str)) {
            return i10 == this.f37579a.size() + (-2) || (i10 == this.f37579a.size() + (-3) && b());
        }
        if (z10) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < this.f37579a.size() - 1) {
            return false;
        }
        return this.f37579a.get(i11).equals(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public e d() {
        return this.f37580b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int e(String str, int i10) {
        if (f(str)) {
            return 0;
        }
        if (this.f37579a.get(i10).equals(m0.f136554a)) {
            return (i10 != this.f37579a.size() - 1 && this.f37579a.get(i10 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public String g() {
        return this.f37579a.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean h(String str, int i10) {
        if (f(str)) {
            return true;
        }
        if (i10 >= this.f37579a.size()) {
            return false;
        }
        return this.f37579a.get(i10).equals(str) || this.f37579a.get(i10).equals(m0.f136554a) || this.f37579a.get(i10).equals(androidx.webkit.b.f28327e);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean i(String str, int i10) {
        return "__container".equals(str) || i10 < this.f37579a.size() - 1 || this.f37579a.get(i10).equals(m0.f136554a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d j(e eVar) {
        d dVar = new d(this);
        dVar.f37580b = eVar;
        return dVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f37579a);
        sb2.append(",resolved=");
        sb2.append(this.f37580b != null);
        sb2.append('}');
        return sb2.toString();
    }
}
