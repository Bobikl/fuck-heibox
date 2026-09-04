package org.apache.tools.ant.taskdefs.optional.extension;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.stream.Stream;

/* JADX INFO: compiled from: Extension.java */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Attributes.Name f135048h = new Attributes.Name("Extension-List");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Attributes.Name f135049i = new Attributes.Name("Optional-Extension-List");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Attributes.Name f135050j = new Attributes.Name("Extension-Name");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Attributes.Name f135051k = Attributes.Name.SPECIFICATION_VERSION;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Attributes.Name f135052l = Attributes.Name.SPECIFICATION_VENDOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Attributes.Name f135053m = Attributes.Name.IMPLEMENTATION_VERSION;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Attributes.Name f135054n = Attributes.Name.IMPLEMENTATION_VENDOR;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Attributes.Name f135055o = new Attributes.Name("Implementation-URL");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Attributes.Name f135056p = new Attributes.Name("Implementation-Vendor-Id");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f135057q = new b("COMPATIBLE");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f135058r = new b("REQUIRE_SPECIFICATION_UPGRADE");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f135059s = new b("REQUIRE_VENDOR_SWITCH");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f135060t = new b("REQUIRE_IMPLEMENTATION_UPGRADE");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f135061u = new b("INCOMPATIBLE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f135062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.apache.tools.ant.util.f0 f135063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f135064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f135065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f135066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.apache.tools.ant.util.f0 f135067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f135068g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f135062a = str;
        this.f135064c = str3;
        if (str2 != null) {
            try {
                this.f135063b = new org.apache.tools.ant.util.f0(str2);
            } catch (NumberFormatException e10) {
                throw new IllegalArgumentException("Bad specification version format '" + str2 + "' in '" + str + "'. (Reason: " + e10 + ")");
            }
        }
        this.f135068g = str7;
        this.f135066e = str5;
        this.f135065d = str6;
        if (str4 != null) {
            try {
                this.f135067f = new org.apache.tools.ant.util.f0(str4);
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException("Bad implementation version format '" + str4 + "' in '" + str + "'. (Reason: " + e11 + ")");
            }
        }
        if (this.f135062a == null) {
            throw new NullPointerException("extensionName property is null");
        }
    }

    public static void d(j jVar, String str, Attributes attributes) {
        attributes.putValue(str + f135050j, jVar.j());
        String strR = jVar.r();
        if (strR != null) {
            attributes.putValue(str + f135052l, strR);
        }
        org.apache.tools.ant.util.f0 f0VarS = jVar.s();
        if (f0VarS != null) {
            attributes.putValue(str + f135051k, f0VarS.toString());
        }
        String strM = jVar.m();
        if (strM != null) {
            attributes.putValue(str + f135056p, strM);
        }
        String strL = jVar.l();
        if (strL != null) {
            attributes.putValue(str + f135054n, strL);
        }
        org.apache.tools.ant.util.f0 f0VarN = jVar.n();
        if (f0VarN != null) {
            attributes.putValue(str + f135053m, f0VarN.toString());
        }
        String strK = jVar.k();
        if (strK != null) {
            attributes.putValue(str + f135055o, strK);
        }
    }

    public static void e(j jVar, Attributes attributes) {
        d(jVar, "", attributes);
    }

    public static j[] f(Manifest manifest) {
        return manifest == null ? new j[0] : (j[]) Stream.concat((Stream) Optional.ofNullable(manifest.getMainAttributes()).map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.extension.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Stream.of((Attributes) obj);
            }
        }).orElse(Stream.empty()), manifest.getEntries().values().stream()).map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.extension.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j.w((Attributes) obj);
            }
        }).filter(new Predicate() { // from class: org.apache.tools.ant.taskdefs.optional.extension.h
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return com.google.auto.common.s.a((j) obj);
            }
        }).toArray(new IntFunction() { // from class: org.apache.tools.ant.taskdefs.optional.extension.i
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return j.x(i10);
            }
        });
    }

    private static j h(String str, Attributes attributes) {
        String strT = t(attributes.getValue(str + f135050j));
        if (strT == null) {
            return null;
        }
        String strT2 = t(attributes.getValue(str + f135052l));
        return new j(strT, t(attributes.getValue(str + f135051k)), strT2, t(attributes.getValue(str + f135053m)), t(attributes.getValue(str + f135054n)), t(attributes.getValue(str + f135056p)), t(attributes.getValue(str + f135055o)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(Attributes attributes, List<j> list, Attributes.Name name) {
        String value = attributes.getValue(name);
        if (value == null) {
            return;
        }
        for (String str : z(value, " ")) {
            j jVarH = h(str + Constants.ACCEPT_TIME_SEPARATOR_SERVER, attributes);
            if (jVarH != null) {
                list.add(jVarH);
            }
        }
    }

    private static j[] o(Manifest manifest, final Attributes.Name name) {
        final ArrayList arrayList = new ArrayList();
        Attributes mainAttributes = manifest.getMainAttributes();
        if (mainAttributes != null) {
            i(mainAttributes, arrayList, name);
        }
        manifest.getEntries().values().forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.extension.e
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                j.i((Attributes) obj, arrayList, name);
            }
        });
        return (j[]) arrayList.toArray(new j[arrayList.size()]);
    }

    public static j[] p(Manifest manifest) {
        return o(manifest, f135049i);
    }

    public static j[] q(Manifest manifest) {
        return o(manifest, Attributes.Name.EXTENSION_LIST);
    }

    private static String t(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    private boolean u(org.apache.tools.ant.util.f0 f0Var, org.apache.tools.ant.util.f0 f0Var2) {
        return f0Var.f(f0Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j w(Attributes attributes) {
        return h("", attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j[] x(int i10) {
        return new j[i10];
    }

    private static String[] z(String str, String str2) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        int iCountTokens = stringTokenizer.countTokens();
        String[] strArr = new String[iCountTokens];
        for (int i10 = 0; i10 < iCountTokens; i10++) {
            strArr[i10] = stringTokenizer.nextToken();
        }
        return strArr;
    }

    public b g(j jVar) {
        org.apache.tools.ant.util.f0 f0Var;
        String str;
        org.apache.tools.ant.util.f0 f0Var2;
        if (!this.f135062a.equals(jVar.j())) {
            return f135061u;
        }
        org.apache.tools.ant.util.f0 f0VarS = jVar.s();
        if (f0VarS != null && ((f0Var2 = this.f135063b) == null || !u(f0Var2, f0VarS))) {
            return f135058r;
        }
        String strM = jVar.m();
        if (strM != null && ((str = this.f135065d) == null || !str.equals(strM))) {
            return f135059s;
        }
        org.apache.tools.ant.util.f0 f0VarN = jVar.n();
        return (f0VarN == null || ((f0Var = this.f135067f) != null && u(f0Var, f0VarN))) ? f135057q : f135060t;
    }

    public String j() {
        return this.f135062a;
    }

    public String k() {
        return this.f135068g;
    }

    public String l() {
        return this.f135066e;
    }

    public String m() {
        return this.f135065d;
    }

    public org.apache.tools.ant.util.f0 n() {
        return this.f135067f;
    }

    public String r() {
        return this.f135064c;
    }

    public org.apache.tools.ant.util.f0 s() {
        return this.f135063b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(String.format("%s: %s%n", f135050j, this.f135062a));
        org.apache.tools.ant.util.f0 f0Var = this.f135063b;
        if (f0Var != null) {
            sb2.append(String.format("%s: %s%n", f135051k, f0Var));
        }
        String str = this.f135064c;
        if (str != null) {
            sb2.append(String.format("%s: %s%n", f135052l, str));
        }
        org.apache.tools.ant.util.f0 f0Var2 = this.f135067f;
        if (f0Var2 != null) {
            sb2.append(String.format("%s: %s%n", f135053m, f0Var2));
        }
        String str2 = this.f135065d;
        if (str2 != null) {
            sb2.append(String.format("%s: %s%n", f135056p, str2));
        }
        String str3 = this.f135066e;
        if (str3 != null) {
            sb2.append(String.format("%s: %s%n", f135054n, str3));
        }
        String str4 = this.f135068g;
        if (str4 != null) {
            sb2.append(String.format("%s: %s%n", f135055o, str4));
        }
        return sb2.toString();
    }

    public boolean v(j jVar) {
        return f135057q == g(jVar);
    }
}
