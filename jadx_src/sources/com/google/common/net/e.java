package com.google.common.net;

import com.google.common.base.Optional;
import com.google.common.base.p;
import com.google.common.base.w;
import com.google.common.base.z;
import com.google.common.collect.ImmutableList;
import com.google.thirdparty.publicsuffix.PublicSuffixType;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: InternetDomainName.java */
/* JADX INFO: loaded from: classes7.dex */
@a
@o9.b(emulated = true)
@s9.j
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.common.base.b f58903e = com.google.common.base.b.d(".。．｡");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final z f58904f = z.h(lg.a.f131414g);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p f58905g = p.o(lg.a.f131414g);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f58906h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f58907i = 127;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f58908j = 253;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f58909k = 63;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final com.google.common.base.b f58910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final com.google.common.base.b f58911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final com.google.common.base.b f58912n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.google.common.base.b f58913o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableList<String> f58915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f58917d;

    static {
        com.google.common.base.b bVarD = com.google.common.base.b.d("-_");
        f58910l = bVarD;
        com.google.common.base.b bVarM = com.google.common.base.b.m('0', '9');
        f58911m = bVarM;
        com.google.common.base.b bVarI = com.google.common.base.b.m('a', 'z').I(com.google.common.base.b.m('A', 'Z'));
        f58912n = bVarI;
        f58913o = bVarM.I(bVarI).I(bVarD);
    }

    e(String str) {
        String strG = com.google.common.base.a.g(f58903e.N(str, lg.a.f131414g));
        strG = strG.endsWith(".") ? strG.substring(0, strG.length() - 1) : strG;
        w.u(strG.length() <= 253, "Domain name too long: '%s':", strG);
        this.f58914a = strG;
        ImmutableList<String> immutableListU = ImmutableList.u(f58904f.n(strG));
        this.f58915b = immutableListU;
        w.u(immutableListU.size() <= 127, "Domain has too many parts: '%s'", strG);
        w.u(x(immutableListU), "Not a valid domain name: '%s'", strG);
        this.f58916c = c(Optional.a());
        this.f58917d = c(Optional.f(PublicSuffixType.REGISTRY));
    }

    private e a(int i10) {
        p pVar = f58905g;
        ImmutableList<String> immutableList = this.f58915b;
        return d(pVar.k(immutableList.subList(i10, immutableList.size())));
    }

    private int c(Optional<PublicSuffixType> optional) {
        int size = this.f58915b.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strK = f58905g.k(this.f58915b.subList(i10, size));
            if (o(optional, Optional.c(com.google.thirdparty.publicsuffix.a.f59590a.get(strK)))) {
                return i10;
            }
            if (com.google.thirdparty.publicsuffix.a.f59592c.containsKey(strK)) {
                return i10 + 1;
            }
            if (p(optional, strK)) {
                return i10;
            }
        }
        return -1;
    }

    @s9.a
    public static e d(String str) {
        return new e((String) w.E(str));
    }

    public static boolean n(String str) {
        try {
            d(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private static boolean o(Optional<PublicSuffixType> optional, Optional<PublicSuffixType> optional2) {
        return optional.e() ? optional.equals(optional2) : optional2.e();
    }

    private static boolean p(Optional<PublicSuffixType> optional, String str) {
        List<String> listO = f58904f.f(2).o(str);
        return listO.size() == 2 && o(optional, Optional.c(com.google.thirdparty.publicsuffix.a.f59591b.get(listO.get(1))));
    }

    private static boolean w(String str, boolean z10) {
        if (str.length() >= 1 && str.length() <= 63) {
            if (!f58913o.C(com.google.common.base.b.f().P(str))) {
                return false;
            }
            com.google.common.base.b bVar = f58910l;
            if (!bVar.B(str.charAt(0)) && !bVar.B(str.charAt(str.length() - 1))) {
                return (z10 && f58911m.B(str.charAt(0))) ? false : true;
            }
        }
        return false;
    }

    private static boolean x(List<String> list) {
        int size = list.size() - 1;
        if (!w(list.get(size), true)) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!w(list.get(i10), false)) {
                return false;
            }
        }
        return true;
    }

    public e b(String str) {
        String str2 = (String) w.E(str);
        String str3 = this.f58914a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
        sb2.append(str2);
        sb2.append(".");
        sb2.append(str3);
        return d(sb2.toString());
    }

    public boolean e() {
        return this.f58915b.size() > 1;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f58914a.equals(((e) obj).f58914a);
        }
        return false;
    }

    public boolean f() {
        return this.f58916c != -1;
    }

    public boolean g() {
        return this.f58917d != -1;
    }

    public boolean h() {
        return this.f58916c == 0;
    }

    public int hashCode() {
        return this.f58914a.hashCode();
    }

    public boolean i() {
        return this.f58917d == 0;
    }

    public boolean j() {
        return this.f58917d == 1;
    }

    public boolean k() {
        return this.f58916c == 1;
    }

    public boolean l() {
        return this.f58916c > 0;
    }

    public boolean m() {
        return this.f58917d > 0;
    }

    public e q() {
        w.x0(e(), "Domain '%s' has no parent", this.f58914a);
        return a(1);
    }

    public ImmutableList<String> r() {
        return this.f58915b;
    }

    @CheckForNull
    public e s() {
        if (f()) {
            return a(this.f58916c);
        }
        return null;
    }

    @CheckForNull
    public e t() {
        if (g()) {
            return a(this.f58917d);
        }
        return null;
    }

    public String toString() {
        return this.f58914a;
    }

    public e u() {
        if (j()) {
            return this;
        }
        w.x0(m(), "Not under a registry suffix: %s", this.f58914a);
        return a(this.f58917d - 1);
    }

    public e v() {
        if (k()) {
            return this;
        }
        w.x0(l(), "Not under a public suffix: %s", this.f58914a);
        return a(this.f58916c - 1);
    }
}
