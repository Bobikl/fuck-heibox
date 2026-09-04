package org.apache.tools.ant.taskdefs.modules;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.spi.ToolProvider;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.b0;
import org.apache.tools.ant.types.l0;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.types.q1;
import org.apache.tools.ant.types.resources.w1;
import org.apache.tools.ant.types.resources.z;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.types.w;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.ResourceUtils;
import org.apache.tools.ant.util.b1;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: Jmod.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f134516k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private o0 f134517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private o0 f134518m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0 f134519n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private o0 f134520o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private o0 f134521p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private o0 f134522q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private o0 f134523r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private o0 f134524s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f134525t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private l0 f134526u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f134527v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f134528w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f134529x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f134530y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List<b> f134531z = new ArrayList();

    /* JADX INFO: compiled from: Jmod.java */
    public static class a extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f134532c = "deprecated";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f134533d = "leaving";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f134534e = "incubating";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Map<String, String> f134535f;

        static {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(f134532c, f134532c);
            linkedHashMap.put(f134533d, "deprecated-for-removal");
            linkedHashMap.put(f134534e, f134534e);
            f134535f = Collections.unmodifiableMap(linkedHashMap);
        }

        public static a i(String str) {
            return (a) w.c(a.class, str);
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return (String[]) f134535f.keySet().toArray(new String[0]);
        }

        String h() {
            return f134535f.get(d());
        }
    }

    /* JADX INFO: compiled from: Jmod.java */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f134536a;

        public b() {
        }

        public b(String str) {
            b(a.i(str));
        }

        public a a() {
            return this.f134536a;
        }

        public void b(a aVar) {
            this.f134536a = aVar;
        }

        public void c() {
            if (this.f134536a == null) {
                throw new BuildException("reason attribute is required", d.this.w1());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean K2(s1 s1Var) {
        return s1Var.p2() && !s1Var.o2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ BuildException L2() {
        return new BuildException("jmod tool not found in JDK.", w1());
    }

    private Collection<String> k2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TopicHashtagWrapper.TYPE_CREATE);
        arrayList.add("--class-path");
        arrayList.add(this.f134517l.toString());
        o0 o0Var = this.f134518m;
        if (o0Var != null && !o0Var.isEmpty()) {
            arrayList.add("--module-path");
            arrayList.add(this.f134518m.toString());
        }
        o0 o0Var2 = this.f134519n;
        if (o0Var2 != null && !o0Var2.isEmpty()) {
            arrayList.add("--cmds");
            arrayList.add(this.f134519n.toString());
        }
        o0 o0Var3 = this.f134520o;
        if (o0Var3 != null && !o0Var3.isEmpty()) {
            arrayList.add("--config");
            arrayList.add(this.f134520o.toString());
        }
        o0 o0Var4 = this.f134521p;
        if (o0Var4 != null && !o0Var4.isEmpty()) {
            arrayList.add("--header-files");
            arrayList.add(this.f134521p.toString());
        }
        o0 o0Var5 = this.f134522q;
        if (o0Var5 != null && !o0Var5.isEmpty()) {
            arrayList.add("--legal-notices");
            arrayList.add(this.f134522q.toString());
        }
        o0 o0Var6 = this.f134523r;
        if (o0Var6 != null && !o0Var6.isEmpty()) {
            arrayList.add("--libs");
            arrayList.add(this.f134523r.toString());
        }
        o0 o0Var7 = this.f134524s;
        if (o0Var7 != null && !o0Var7.isEmpty()) {
            arrayList.add("--man-pages");
            arrayList.add(this.f134524s.toString());
        }
        l0 l0Var = this.f134526u;
        String strG = l0Var != null ? l0Var.g() : this.f134525t;
        if (strG != null && !strG.isEmpty()) {
            arrayList.add("--module-version");
            arrayList.add(strG);
        }
        String str = this.f134527v;
        if (str != null && !str.isEmpty()) {
            arrayList.add("--main-class");
            arrayList.add(this.f134527v);
        }
        String str2 = this.f134528w;
        if (str2 != null && !str2.isEmpty()) {
            arrayList.add("--target-platform");
            arrayList.add(this.f134528w);
        }
        String str3 = this.f134529x;
        if (str3 != null && !str3.isEmpty()) {
            arrayList.add("--hash-modules");
            arrayList.add(this.f134529x);
        }
        if (!this.f134530y) {
            arrayList.add("--do-not-resolve-by-default");
        }
        for (b bVar : this.f134531z) {
            bVar.c();
            arrayList.add("--warn-if-resolved");
            arrayList.add(bVar.a().h());
        }
        arrayList.add(this.f134516k.toString());
        return arrayList;
    }

    private void l2() {
        o0 o0Var = this.f134518m;
        if (o0Var != null && o0Var.stream().anyMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.modules.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return d.K2((s1) obj);
            }
        })) {
            throw new BuildException("ModulePath must contain only directories.", w1());
        }
        o0 o0Var2 = this.f134519n;
        if (o0Var2 != null && o0Var2.stream().anyMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.modules.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return d.K2((s1) obj);
            }
        })) {
            throw new BuildException("CommandPath must contain only directories.", w1());
        }
        o0 o0Var3 = this.f134520o;
        if (o0Var3 != null && o0Var3.stream().anyMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.modules.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return d.K2((s1) obj);
            }
        })) {
            throw new BuildException("ConfigPath must contain only directories.", w1());
        }
        o0 o0Var4 = this.f134521p;
        if (o0Var4 != null && o0Var4.stream().anyMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.modules.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return d.K2((s1) obj);
            }
        })) {
            throw new BuildException("HeaderPath must contain only directories.", w1());
        }
        o0 o0Var5 = this.f134522q;
        if (o0Var5 != null && o0Var5.stream().anyMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.modules.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return d.K2((s1) obj);
            }
        })) {
            throw new BuildException("LegalPath must contain only directories.", w1());
        }
        o0 o0Var6 = this.f134523r;
        if (o0Var6 != null && o0Var6.stream().anyMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.modules.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return d.K2((s1) obj);
            }
        })) {
            throw new BuildException("NativeLibPath must contain only directories.", w1());
        }
        o0 o0Var7 = this.f134524s;
        if (o0Var7 != null && o0Var7.stream().anyMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.modules.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return d.K2((s1) obj);
            }
        })) {
            throw new BuildException("ManPath must contain only directories.", w1());
        }
    }

    public String A2() {
        return this.f134529x;
    }

    public o0 B2() {
        return this.f134521p;
    }

    public o0 C2() {
        return this.f134522q;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f134516k == null) {
            throw new BuildException("Destination file is required.", w1());
        }
        o0 o0Var = this.f134517l;
        if (o0Var == null) {
            throw new BuildException("Classpath is required.", w1());
        }
        if (o0Var.stream().noneMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.modules.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((s1) obj).p2();
            }
        })) {
            throw new BuildException("Classpath must contain at least one entry which exists.", w1());
        }
        if (this.f134525t != null && this.f134526u != null) {
            throw new BuildException("version attribute and nested <version> element cannot both be present.", w1());
        }
        String str = this.f134529x;
        if (str != null && !str.isEmpty() && this.f134518m == null) {
            throw new BuildException("hashModulesPattern requires a module path, since it will generate hashes of the other modules which depend on the module being created.", w1());
        }
        l2();
        o0[] o0VarArr = {this.f134517l, this.f134518m, this.f134519n, this.f134520o, this.f134521p, this.f134522q, this.f134523r, this.f134524s};
        w1 w1Var = new w1(b());
        for (int i10 = 0; i10 < 8; i10++) {
            o0 o0Var2 = o0VarArr[i10];
            if (o0Var2 != null) {
                for (String str2 : o0Var2.z2()) {
                    File file = new File(str2);
                    if (file.isDirectory()) {
                        x1("Will compare timestamp of all files in \"" + file + "\" with timestamp of " + this.f134516k, 3);
                        b0 b0Var = new b0();
                        b0Var.R2(file);
                        w1Var.f2(b0Var);
                    } else {
                        x1("Will compare timestamp of \"" + file + "\" with timestamp of " + this.f134516k, 3);
                        w1Var.f2(new z(file));
                    }
                }
            }
        }
        if (ResourceUtils.y(this, w1Var, new b1(this.f134516k.toString()), b(), j0.O().M()).isEmpty()) {
            x1("Skipping jmod creation, since \"" + this.f134516k + "\" is already newer than all files in paths.", 3);
            return;
        }
        Collection<String> collectionK2 = k2();
        try {
            x1("Deleting " + this.f134516k + " if it exists.", 3);
            Files.deleteIfExists(this.f134516k.toPath());
            ToolProvider toolProvider = (ToolProvider) ToolProvider.findFirst("jmod").orElseThrow(new Supplier() { // from class: org.apache.tools.ant.taskdefs.modules.c
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f134515a.L2();
                }
            });
            x1("Executing: jmod " + com.max.xiaoheihe.module.bbs.post_edit.o.a(" ", collectionK2), 3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(byteArrayOutputStream);
            try {
                PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
                try {
                    int iRun = toolProvider.run(printStream, printStream2, (String[]) collectionK2.toArray(new String[0]));
                    printStream2.close();
                    printStream.close();
                    if (iRun == 0) {
                        x1("Created " + this.f134516k.getAbsolutePath(), 2);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("jmod failed (exit code ");
                    sb2.append(iRun);
                    sb2.append(")");
                    if (byteArrayOutputStream.size() > 0) {
                        sb2.append(", output is: ");
                        sb2.append(byteArrayOutputStream);
                    }
                    if (byteArrayOutputStream2.size() > 0) {
                        sb2.append(", error output is: ");
                        sb2.append(byteArrayOutputStream2);
                    }
                    throw new BuildException(sb2.toString(), w1());
                } catch (Throwable th2) {
                    try {
                        printStream2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    printStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e10) {
            throw new BuildException("Could not remove old file \"" + this.f134516k + "\": " + e10, e10, w1());
        }
    }

    public String D2() {
        return this.f134527v;
    }

    public o0 E2() {
        return this.f134524s;
    }

    public o0 F2() {
        return this.f134518m;
    }

    public o0 G2() {
        return this.f134523r;
    }

    public String H2() {
        return this.f134528w;
    }

    public boolean I2() {
        return this.f134530y;
    }

    public String J2() {
        return this.f134525t;
    }

    public void M2(o0 o0Var) {
        o0 o0Var2 = this.f134517l;
        if (o0Var2 == null) {
            this.f134517l = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void N2(q1 q1Var) {
        m2().c2(q1Var);
    }

    public void O2(o0 o0Var) {
        o0 o0Var2 = this.f134519n;
        if (o0Var2 == null) {
            this.f134519n = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void P2(q1 q1Var) {
        n2().c2(q1Var);
    }

    public void Q2(o0 o0Var) {
        o0 o0Var2 = this.f134520o;
        if (o0Var2 == null) {
            this.f134520o = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void R2(q1 q1Var) {
        o2().c2(q1Var);
    }

    public void S2(File file) {
        this.f134516k = file;
    }

    public void T2(String str) {
        this.f134529x = str;
    }

    public void U2(o0 o0Var) {
        o0 o0Var2 = this.f134521p;
        if (o0Var2 == null) {
            this.f134521p = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void V2(q1 q1Var) {
        p2().c2(q1Var);
    }

    public void W2(o0 o0Var) {
        o0 o0Var2 = this.f134522q;
        if (o0Var2 == null) {
            this.f134522q = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void X2(q1 q1Var) {
        q2().c2(q1Var);
    }

    public void Y2(String str) {
        this.f134527v = str;
    }

    public void Z2(o0 o0Var) {
        o0 o0Var2 = this.f134524s;
        if (o0Var2 == null) {
            this.f134524s = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void a3(q1 q1Var) {
        r2().c2(q1Var);
    }

    public void b3(o0 o0Var) {
        o0 o0Var2 = this.f134518m;
        if (o0Var2 == null) {
            this.f134518m = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void c3(q1 q1Var) {
        s2().c2(q1Var);
    }

    public void d3(String str) {
        for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            this.f134531z.add(new b(str2));
        }
    }

    public void e3(o0 o0Var) {
        o0 o0Var2 = this.f134523r;
        if (o0Var2 == null) {
            this.f134523r = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void f3(q1 q1Var) {
        u2().c2(q1Var);
    }

    public void g3(String str) {
        this.f134528w = str;
    }

    public void h3(boolean z10) {
        this.f134530y = z10;
    }

    public void i3(String str) {
        this.f134525t = str;
    }

    public o0 m2() {
        if (this.f134517l == null) {
            this.f134517l = new o0(b());
        }
        return this.f134517l.u2();
    }

    public o0 n2() {
        if (this.f134519n == null) {
            this.f134519n = new o0(b());
        }
        return this.f134519n.u2();
    }

    public o0 o2() {
        if (this.f134520o == null) {
            this.f134520o = new o0(b());
        }
        return this.f134520o.u2();
    }

    public o0 p2() {
        if (this.f134521p == null) {
            this.f134521p = new o0(b());
        }
        return this.f134521p.u2();
    }

    public o0 q2() {
        if (this.f134522q == null) {
            this.f134522q = new o0(b());
        }
        return this.f134522q.u2();
    }

    public o0 r2() {
        if (this.f134524s == null) {
            this.f134524s = new o0(b());
        }
        return this.f134524s.u2();
    }

    public o0 s2() {
        if (this.f134518m == null) {
            this.f134518m = new o0(b());
        }
        return this.f134518m.u2();
    }

    public b t2() {
        b bVar = new b();
        this.f134531z.add(bVar);
        return bVar;
    }

    public o0 u2() {
        if (this.f134523r == null) {
            this.f134523r = new o0(b());
        }
        return this.f134523r.u2();
    }

    public l0 v2() {
        if (this.f134526u != null) {
            throw new BuildException("No more than one <moduleVersion> element is allowed.", w1());
        }
        l0 l0Var = new l0();
        this.f134526u = l0Var;
        return l0Var;
    }

    public o0 w2() {
        return this.f134517l;
    }

    public o0 x2() {
        return this.f134519n;
    }

    public o0 y2() {
        return this.f134520o;
    }

    public File z2() {
        return this.f134516k;
    }
}
