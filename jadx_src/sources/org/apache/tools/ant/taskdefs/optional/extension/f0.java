package org.apache.tools.ant.taskdefs.optional.extension;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.stream.Stream;

/* JADX INFO: compiled from: Specification.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f135029h = "Missing ";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Attributes.Name f135030i = Attributes.Name.SPECIFICATION_TITLE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Attributes.Name f135031j = Attributes.Name.SPECIFICATION_VERSION;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Attributes.Name f135032k = Attributes.Name.SPECIFICATION_VENDOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Attributes.Name f135033l = Attributes.Name.IMPLEMENTATION_TITLE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Attributes.Name f135034m = Attributes.Name.IMPLEMENTATION_VERSION;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Attributes.Name f135035n = Attributes.Name.IMPLEMENTATION_VENDOR;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f135036o = new b("COMPATIBLE");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f135037p = new b("REQUIRE_SPECIFICATION_UPGRADE");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f135038q = new b("REQUIRE_VENDOR_SWITCH");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f135039r = new b("REQUIRE_IMPLEMENTATION_CHANGE");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f135040s = new b("INCOMPATIBLE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f135041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.apache.tools.ant.util.f0 f135042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f135043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f135044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f135045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f135046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f135047g;

    public f0(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, null);
    }

    public f0(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr) {
        this.f135041a = str;
        this.f135043c = str3;
        if (str2 != null) {
            try {
                this.f135042b = new org.apache.tools.ant.util.f0(str2);
            } catch (NumberFormatException e10) {
                throw new IllegalArgumentException("Bad specification version format '" + str2 + "' in '" + str + "'. (Reason: " + e10 + ")");
            }
        }
        this.f135044d = str4;
        this.f135045e = str6;
        this.f135046f = str5;
        if (this.f135041a == null) {
            throw new NullPointerException("specificationTitle");
        }
        this.f135047g = strArr == null ? null : (String[]) strArr.clone();
    }

    private static f0 h(String str, Attributes attributes) throws ParseException {
        String strM = m(attributes.getValue(f135030i));
        if (strM == null) {
            return null;
        }
        Attributes.Name name = f135032k;
        String strM2 = m(attributes.getValue(name));
        if (strM2 == null) {
            throw new ParseException(f135029h + name, 0);
        }
        Attributes.Name name2 = f135031j;
        String strM3 = m(attributes.getValue(name2));
        if (strM3 == null) {
            throw new ParseException(f135029h + name2, 0);
        }
        Attributes.Name name3 = f135033l;
        String strM4 = m(attributes.getValue(name3));
        if (strM4 == null) {
            throw new ParseException(f135029h + name3, 0);
        }
        Attributes.Name name4 = f135034m;
        String strM5 = m(attributes.getValue(name4));
        if (strM5 == null) {
            throw new ParseException(f135029h + name4, 0);
        }
        Attributes.Name name5 = f135035n;
        String strM6 = m(attributes.getValue(name5));
        if (strM6 != null) {
            return new f0(strM, strM3, strM2, strM4, strM5, strM6, new String[]{str});
        }
        throw new ParseException(f135029h + name5, 0);
    }

    public static f0[] l(Manifest manifest) throws ParseException {
        if (manifest == null) {
            return new f0[0];
        }
        final ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Attributes> entry : manifest.getEntries().entrySet()) {
            Optional.ofNullable(h(entry.getKey(), entry.getValue())).ifPresent(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.extension.d0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    arrayList.add((f0) obj);
                }
            });
        }
        return (f0[]) t(arrayList).toArray(new f0[t(arrayList).size()]);
    }

    private static String m(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    private boolean n(org.apache.tools.ant.util.f0 f0Var, org.apache.tools.ant.util.f0 f0Var2) {
        return f0Var.f(f0Var2);
    }

    private static boolean p(f0 f0Var, f0 f0Var2) {
        return f0Var.i().equals(f0Var2.i()) && f0Var.k().d(f0Var2.k()) && f0Var.j().equals(f0Var2.j()) && f0Var.d().equals(f0Var2.d()) && f0Var.f().equals(f0Var2.f()) && f0Var.e().equals(f0Var2.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] q(int i10) {
        return new String[i10];
    }

    private static f0 s(f0 f0Var, List<String> list) {
        if (list.isEmpty()) {
            return f0Var;
        }
        return new f0(f0Var.i(), f0Var.k().toString(), f0Var.j(), f0Var.d(), f0Var.f(), f0Var.e(), (String[]) Stream.concat((Stream) Optional.ofNullable(f0Var.g()).map(new org.apache.tools.ant.taskdefs.optional.o()).orElse(Stream.empty()), list.stream()).toArray(new IntFunction() { // from class: org.apache.tools.ant.taskdefs.optional.extension.c0
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return f0.q(i10);
            }
        }));
    }

    private static List<f0> t(List<f0> list) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        while (!list.isEmpty()) {
            f0 f0VarRemove = list.remove(0);
            Iterator<f0> it = list.iterator();
            while (it.hasNext()) {
                f0 next = it.next();
                if (p(f0VarRemove, next)) {
                    Optional.ofNullable(next.g()).ifPresent(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.extension.e0
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            Collections.addAll(arrayList2, (String[]) obj);
                        }
                    });
                    it.remove();
                }
            }
            arrayList.add(s(f0VarRemove, arrayList2));
            arrayList2.clear();
        }
        return arrayList;
    }

    public b c(f0 f0Var) {
        if (!this.f135041a.equals(f0Var.i())) {
            return f135040s;
        }
        org.apache.tools.ant.util.f0 f0VarK = f0Var.k();
        org.apache.tools.ant.util.f0 f0Var2 = this.f135042b;
        if (f0Var2 != null && (f0VarK == null || !n(f0Var2, f0VarK))) {
            return f135037p;
        }
        String str = this.f135045e;
        if (str != null && !str.equals(f0Var.e())) {
            return f135038q;
        }
        String str2 = this.f135046f;
        return (str2 == null || str2.equals(f0Var.f())) ? f135036o : f135039r;
    }

    public String d() {
        return this.f135044d;
    }

    public String e() {
        return this.f135045e;
    }

    public String f() {
        return this.f135046f;
    }

    public String[] g() {
        String[] strArr = this.f135047g;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public String i() {
        return this.f135041a;
    }

    public String j() {
        return this.f135043c;
    }

    public org.apache.tools.ant.util.f0 k() {
        return this.f135042b;
    }

    public boolean o(f0 f0Var) {
        return f135036o == c(f0Var);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(String.format("%s: %s%n", f135030i, this.f135041a));
        org.apache.tools.ant.util.f0 f0Var = this.f135042b;
        if (f0Var != null) {
            sb2.append(String.format("%s: %s%n", f135031j, f0Var));
        }
        String str = this.f135043c;
        if (str != null) {
            sb2.append(String.format("%s: %s%n", f135032k, str));
        }
        String str2 = this.f135044d;
        if (str2 != null) {
            sb2.append(String.format("%s: %s%n", f135033l, str2));
        }
        String str3 = this.f135046f;
        if (str3 != null) {
            sb2.append(String.format("%s: %s%n", f135034m, str3));
        }
        String str4 = this.f135045e;
        if (str4 != null) {
            sb2.append(String.format("%s: %s%n", f135035n, str4));
        }
        return sb2.toString();
    }
}
