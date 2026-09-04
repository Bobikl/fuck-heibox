package org.apache.tools.ant;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.tools.ant.util.VectorSet;

/* JADX INFO: compiled from: DirectoryScanner.java */
/* JADX INFO: loaded from: classes5.dex */
public class v0 implements h1, org.apache.tools.ant.types.selectors.l0, org.apache.tools.ant.types.v1 {
    public static final int H = 5;
    public static final String I = " does not exist.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected File f137052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String[] f137053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String[] f137054d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Vector<String> f137056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Vector<String> f137057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Vector<String> f137058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Vector<String> f137059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Vector<String> f137060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected Vector<String> f137061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Vector<String> f137062l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected Vector<String> f137063m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private org.apache.tools.ant.types.selectors.r0[] f137072v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private org.apache.tools.ant.types.selectors.r0[] f137073w;
    private static final boolean F = org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133977s);

    @Deprecated
    protected static final String[] G = {"**/*~", "**/#*#", "**/.#*", "**/%*%", "**/._*", "**/CVS", "**/CVS/**", "**/.cvsignore", "**/SCCS", "**/SCCS/**", "**/vssver.scc", "**/.svn", "**/.svn/**", "**/.git", "**/.git/**", "**/.gitattributes", "**/.gitignore", "**/.gitmodules", "**/.hg", "**/.hg/**", "**/.hgignore", "**/.hgsub", "**/.hgsubstate", "**/.hgtags", "**/.bzr", "**/.bzr/**", "**/.bzrignore", "**/.DS_Store"};
    private static final org.apache.tools.ant.util.j0 J = org.apache.tools.ant.util.j0.O();
    private static final Set<String> K = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected org.apache.tools.ant.types.selectors.v[] f137055e = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f137064n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f137065o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected boolean f137066p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f137067q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f137068r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Set<String> f137069s = new HashSet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map<String, org.apache.tools.ant.types.selectors.q0> f137070t = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Map<String, org.apache.tools.ant.types.selectors.q0> f137071u = new HashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f137074x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f137075y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Object f137076z = new Object();
    private boolean A = false;
    private final Object B = new Object();
    private IllegalStateException C = null;
    private int D = 5;
    private final Set<String> E = new HashSet();

    static {
        G0();
    }

    protected static boolean A0(String str, String str2) {
        return org.apache.tools.ant.types.selectors.m0.m(str, str2);
    }

    protected static boolean B0(String str, String str2, boolean z10) {
        return org.apache.tools.ant.types.selectors.m0.n(str, str2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String C0(String str) {
        String strReplace = str.replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar).replace(IOUtils.DIR_SEPARATOR_WINDOWS, File.separatorChar);
        if (!strReplace.endsWith(File.separator)) {
            return strReplace;
        }
        return strReplace + org.apache.tools.ant.types.selectors.m0.f136554a;
    }

    private void D0(org.apache.tools.ant.types.selectors.q0 q0Var, File file, List<String> list, List<String> list2, List<String> list3) {
        String string = q0Var.toString();
        if (list.contains(string) || list2.contains(string) || list3.contains(string)) {
            return;
        }
        boolean z10 = false;
        if (f0(q0Var)) {
            list2.add(string);
        } else if (k0(string, file)) {
            z10 = true;
            list.add(string);
        } else {
            list3.add(string);
        }
        this.f137068r &= z10;
    }

    private void E(org.apache.tools.ant.types.selectors.q0 q0Var, File file, boolean z10) {
        D0(q0Var, file, this.f137059i, this.f137061k, this.f137063m);
        if (z10 && R(q0Var) && !P(q0Var)) {
            I0(file, q0Var, z10);
        }
    }

    private void E0(String[] strArr) {
        for (String str : strArr) {
            org.apache.tools.ant.types.selectors.q0 q0Var = new org.apache.tools.ant.types.selectors.q0(str);
            if (!R(q0Var) || P(q0Var)) {
                I0(new File(this.f137052b, str), q0Var, false);
            }
        }
    }

    private void F(org.apache.tools.ant.types.selectors.q0 q0Var, File file, boolean z10, String[] strArr, Deque<String> deque) {
        D0(q0Var, file, this.f137059i, this.f137061k, this.f137063m);
        if (z10 && R(q0Var) && !P(q0Var)) {
            J0(file, q0Var, z10, strArr, deque);
        }
    }

    public static boolean F0(String str) {
        boolean zRemove;
        Set<String> set = K;
        synchronized (set) {
            zRemove = set.remove(str);
        }
        return zRemove;
    }

    private void G(org.apache.tools.ant.types.selectors.q0 q0Var, File file) {
        D0(q0Var, file, this.f137056f, this.f137058h, this.f137062l);
    }

    public static void G0() {
        Set<String> set = K;
        synchronized (set) {
            set.clear();
            Collections.addAll(set, G);
        }
    }

    private void H(String str, File file) {
        I(new org.apache.tools.ant.types.selectors.q0(str), file);
    }

    private void I(org.apache.tools.ant.types.selectors.q0 q0Var, File file) {
        if (f0(q0Var)) {
            return;
        }
        if (i0(q0Var) || (file.isDirectory() && R(q0Var) && !P(q0Var))) {
            this.E.add(file.getAbsolutePath());
        }
    }

    private void I0(File file, org.apache.tools.ant.types.selectors.q0 q0Var, boolean z10) {
        if (file == null) {
            throw new BuildException("dir must not be null.");
        }
        String[] list = file.list();
        if (list != null) {
            J0(file, q0Var, z10, list, new LinkedList());
            return;
        }
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new BuildException("%s is not a directory.", file);
            }
            throw new BuildException("IO error scanning directory '%s'", file.getAbsolutePath());
        }
        throw new BuildException(file + I);
    }

    public static boolean J(String str) {
        boolean zAdd;
        Set<String> set = K;
        synchronized (set) {
            zAdd = set.add(str);
        }
        return zAdd;
    }

    private void J0(File file, org.apache.tools.ant.types.selectors.q0 q0Var, boolean z10, String[] strArr, Deque<String> deque) {
        String[] strArr2;
        File file2;
        String[] strArr3 = strArr;
        String string = q0Var.toString();
        if (!string.isEmpty()) {
            String str = File.separator;
            if (!string.endsWith(str)) {
                string = string + str;
            }
        }
        String str2 = string;
        if (z10 && a0(str2)) {
            return;
        }
        if (this.f137067q) {
            deque.addFirst(file.getName());
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str3 : strArr3) {
                if (Files.isSymbolicLink(file == null ? Paths.get(str3, new String[0]) : Paths.get(file.toPath().toString(), str3))) {
                    String str4 = str2 + str3;
                    File file3 = new File(file, str3);
                    if (file3.isDirectory()) {
                        this.f137061k.addElement(str4);
                    } else if (file3.isFile()) {
                        this.f137058h.addElement(str4);
                    }
                    H(str4, file3);
                } else {
                    arrayList.add(str3);
                }
            }
            strArr3 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        for (String str5 : strArr3) {
            String str6 = str2 + str5;
            org.apache.tools.ant.types.selectors.q0 q0Var2 = new org.apache.tools.ant.types.selectors.q0(q0Var, str5);
            File file4 = new File(file, str5);
            String[] list = file4.list();
            if (list == null || (list.length == 0 && file4.isFile())) {
                if (i0(q0Var2)) {
                    G(q0Var2, file4);
                } else {
                    this.f137068r = false;
                    this.f137057g.addElement(str6);
                }
            } else if (file4.isDirectory()) {
                if (this.f137067q && L(str5, file, deque)) {
                    System.err.println("skipping symbolic link " + file4.getAbsolutePath() + " -- too many levels of symbolic links.");
                    this.E.add(file4.getAbsolutePath());
                } else {
                    if (i0(q0Var2)) {
                        strArr2 = list;
                        file2 = file4;
                        F(q0Var2, file4, z10, list, deque);
                    } else {
                        strArr2 = list;
                        file2 = file4;
                        this.f137068r = false;
                        this.f137060j.addElement(str6);
                        if (z10 && R(q0Var2) && !P(q0Var2)) {
                            J0(file2, q0Var2, z10, strArr2, deque);
                        }
                    }
                    if (!z10) {
                        J0(file2, q0Var2, z10, strArr2, deque);
                    }
                }
            }
        }
        if (this.f137067q) {
            deque.removeFirst();
        }
    }

    private boolean L(String str, File file, Deque<String> deque) {
        try {
            Path path = file == null ? Paths.get(str, new String[0]) : Paths.get(file.toPath().toString(), str);
            if (deque.size() >= this.D && Collections.frequency(deque, str) >= this.D && Files.isSymbolicLink(path)) {
                ArrayList arrayList = new ArrayList();
                String canonicalPath = J.n0(file, str).getCanonicalPath();
                arrayList.add(canonicalPath);
                StringBuilder sb2 = new StringBuilder();
                for (String str2 : deque) {
                    sb2.append("../");
                    if (str.equals(str2)) {
                        arrayList.add(J.n0(file, ((Object) sb2) + str2).getCanonicalPath());
                        if (arrayList.size() > this.D && Collections.frequency(arrayList, canonicalPath) > this.D) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (IOException e10) {
            throw new BuildException("Caught error while checking for symbolic links", e10);
        }
    }

    private void M() {
        File file;
        File fileB;
        File file2;
        T();
        HashMap map = new HashMap();
        for (org.apache.tools.ant.types.selectors.r0 r0Var : this.f137072v) {
            String string = r0Var.toString();
            if (!N0(string)) {
                map.put(r0Var.g(), string);
            }
        }
        for (Map.Entry<String, org.apache.tools.ant.types.selectors.q0> entry : this.f137070t.entrySet()) {
            String key = entry.getKey();
            if (!N0(key)) {
                map.put(entry.getValue(), key);
            }
        }
        if (map.containsKey(org.apache.tools.ant.types.selectors.q0.f136612c) && (file2 = this.f137052b) != null) {
            H0(file2, "", true);
            return;
        }
        File canonicalFile = null;
        File file3 = this.f137052b;
        if (file3 != null) {
            try {
                canonicalFile = file3.getCanonicalFile();
            } catch (IOException e10) {
                throw new BuildException(e10);
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            org.apache.tools.ant.types.selectors.q0 q0Var = (org.apache.tools.ant.types.selectors.q0) entry2.getKey();
            String string2 = q0Var.toString();
            if (this.f137052b != null || org.apache.tools.ant.util.j0.V(string2)) {
                File file4 = new File(this.f137052b, string2);
                if (file4.exists()) {
                    try {
                        if ((!(this.f137052b == null ? file4.getCanonicalPath() : J.l0(canonicalFile, file4.getCanonicalFile())).equals(string2) || F) && (file4 = q0Var.b(this.f137052b, true)) != null && (file = this.f137052b) != null) {
                            string2 = J.l0(file, file4);
                            if (!q0Var.toString().equals(string2)) {
                                q0Var = new org.apache.tools.ant.types.selectors.q0(string2);
                            }
                        }
                    } catch (IOException e11) {
                        throw new BuildException(e11);
                    }
                }
                if ((file4 == null || !file4.exists()) && !b0() && (fileB = q0Var.b(this.f137052b, false)) != null && fileB.exists()) {
                    File file5 = this.f137052b;
                    string2 = file5 == null ? fileB.getAbsolutePath() : J.l0(file5, fileB);
                    q0Var = new org.apache.tools.ant.types.selectors.q0(string2);
                    file4 = fileB;
                }
                if (file4 != null && file4.exists()) {
                    if (!this.f137067q && q0Var.e(this.f137052b)) {
                        I(q0Var, file4);
                    } else if (file4.isDirectory()) {
                        if (!i0(q0Var) || string2.isEmpty()) {
                            I0(file4, q0Var, true);
                        } else {
                            E(q0Var, file4, true);
                        }
                    } else if (file4.isFile()) {
                        String str = (String) entry2.getValue();
                        if (b0() ? str.equals(string2) : str.equalsIgnoreCase(string2)) {
                            G(q0Var, file4);
                        }
                    }
                }
            }
        }
    }

    private synchronized void N() {
        this.f137070t.clear();
        this.f137071u.clear();
        this.f137072v = null;
        this.f137073w = null;
        this.f137074x = false;
    }

    private boolean N0(String str) {
        if (!org.apache.tools.ant.util.j0.V(str)) {
            return this.f137052b == null;
        }
        File file = this.f137052b;
        return (file == null || org.apache.tools.ant.types.selectors.m0.n(str, file.getAbsolutePath(), b0())) ? false : true;
    }

    private boolean R(final org.apache.tools.ant.types.selectors.q0 q0Var) {
        return Stream.concat(Stream.of((Object[]) this.f137072v), this.f137070t.values().stream().map(new Function() { // from class: org.apache.tools.ant.s0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((org.apache.tools.ant.types.selectors.q0) obj).f();
            }
        })).anyMatch(new Predicate() { // from class: org.apache.tools.ant.t0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f133603a.q0(q0Var, (org.apache.tools.ant.types.selectors.r0) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public boolean q0(org.apache.tools.ant.types.selectors.q0 q0Var, org.apache.tools.ant.types.selectors.r0 r0Var) {
        return r0Var.f(q0Var, b0()) && j0(q0Var.toString()) && c0(r0Var, q0Var);
    }

    private org.apache.tools.ant.types.selectors.r0[] U(Map<String, org.apache.tools.ant.types.selectors.q0> map, String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String upperCase : strArr) {
            if (org.apache.tools.ant.types.selectors.m0.d(upperCase)) {
                arrayList.add(new org.apache.tools.ant.types.selectors.r0(upperCase));
            } else {
                if (!b0()) {
                    upperCase = upperCase.toUpperCase();
                }
                map.put(upperCase, new org.apache.tools.ant.types.selectors.q0(upperCase));
            }
        }
        return (org.apache.tools.ant.types.selectors.r0[]) arrayList.toArray(new org.apache.tools.ant.types.selectors.r0[arrayList.size()]);
    }

    public static String[] V() {
        String[] strArr;
        Set<String> set = K;
        synchronized (set) {
            strArr = (String[]) set.toArray(new String[set.size()]);
        }
        return strArr;
    }

    private boolean a0(String str) {
        return !this.f137069s.add(str);
    }

    private boolean c0(org.apache.tools.ant.types.selectors.r0 r0Var, org.apache.tools.ant.types.selectors.q0 q0Var) {
        return r0Var.a(org.apache.tools.ant.types.selectors.m0.f136554a) || r0Var.b() > q0Var.a();
    }

    private boolean f0(final org.apache.tools.ant.types.selectors.q0 q0Var) {
        T();
        String string = q0Var.toString();
        if (!b0()) {
            string = string.toUpperCase();
        }
        return this.f137071u.containsKey(string) || Stream.of((Object[]) this.f137073w).anyMatch(new Predicate() { // from class: org.apache.tools.ant.k0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f133503a.r0(q0Var, (org.apache.tools.ant.types.selectors.r0) obj);
            }
        });
    }

    private boolean i0(final org.apache.tools.ant.types.selectors.q0 q0Var) {
        T();
        String string = q0Var.toString();
        if (!b0()) {
            string = string.toUpperCase();
        }
        return this.f137070t.containsKey(string) || Stream.of((Object[]) this.f137072v).anyMatch(new Predicate() { // from class: org.apache.tools.ant.j0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f133475a.s0(q0Var, (org.apache.tools.ant.types.selectors.r0) obj);
            }
        });
    }

    private boolean j0(String str) {
        return Stream.of((Object[]) this.f137073w).map(new Function() { // from class: org.apache.tools.ant.h0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((org.apache.tools.ant.types.selectors.r0) obj).toString();
            }
        }).noneMatch(Predicate.isEqual(str + File.separatorChar + org.apache.tools.ant.types.selectors.m0.f136554a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] l0(int i10) {
        return new String[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m0(String str) {
        return str.replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar).replace(IOUtils.DIR_SEPARATOR_WINDOWS, File.separatorChar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] n0(int i10) {
        return new String[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean o0(org.apache.tools.ant.types.selectors.r0 r0Var) {
        return r0Var.c(org.apache.tools.ant.types.selectors.m0.f136554a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean p0(org.apache.tools.ant.types.selectors.q0 q0Var, org.apache.tools.ant.types.selectors.r0 r0Var) {
        return r0Var.e(q0Var, b0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean r0(org.apache.tools.ant.types.selectors.q0 q0Var, org.apache.tools.ant.types.selectors.r0 r0Var) {
        return r0Var.e(q0Var, b0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean s0(org.apache.tools.ant.types.selectors.q0 q0Var, org.apache.tools.ant.types.selectors.r0 r0Var) {
        return r0Var.e(q0Var, b0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean t0(String str, File file, org.apache.tools.ant.types.selectors.v vVar) {
        return vVar.P0(this.f137052b, str, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] u0(int i10) {
        return new String[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] v0(int i10) {
        return new String[i10];
    }

    public static boolean w0(String str, String str2) {
        return org.apache.tools.ant.types.selectors.m0.h(str, str2);
    }

    protected static boolean x0(String str, String str2, boolean z10) {
        return org.apache.tools.ant.types.selectors.m0.i(str, str2, z10);
    }

    protected static boolean y0(String str, String str2) {
        return org.apache.tools.ant.types.selectors.m0.j(str, str2);
    }

    protected static boolean z0(String str, String str2, boolean z10) {
        return org.apache.tools.ant.types.selectors.m0.k(str, str2, z10);
    }

    protected void H0(File file, String str, boolean z10) {
        I0(file, new org.apache.tools.ant.types.selectors.q0(str), z10);
    }

    public synchronized void K(String[] strArr) {
        if (strArr != null) {
            if (strArr.length > 0) {
                String[] strArr2 = this.f137054d;
                if (strArr2 == null || strArr2.length == 0) {
                    k(strArr);
                } else {
                    this.f137054d = (String[]) Stream.concat(Stream.of((Object[]) strArr2), Stream.of((Object[]) strArr).map(new g0())).toArray(new IntFunction() { // from class: org.apache.tools.ant.m0
                        @Override // java.util.function.IntFunction
                        public final Object apply(int i10) {
                            return v0.n0(i10);
                        }
                    });
                }
            }
        }
    }

    public void K0(boolean z10) {
        this.f137066p = z10;
    }

    public synchronized void L0(boolean z10) {
        this.f137067q = z10;
    }

    public void M0(int i10) {
        this.D = i10;
    }

    protected synchronized void O() {
        this.f137056f = new VectorSet();
        this.f137057g = new VectorSet();
        this.f137058h = new VectorSet();
        this.f137062l = new VectorSet();
        this.f137059i = new VectorSet();
        this.f137060j = new VectorSet();
        this.f137061k = new VectorSet();
        this.f137063m = new VectorSet();
        this.f137068r = this.f137052b != null;
        this.f137069s.clear();
        this.E.clear();
    }

    protected void O0() {
        synchronized (this.B) {
            if (this.f137064n) {
                return;
            }
            if (this.A) {
                while (this.A) {
                    try {
                        this.B.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            }
            this.A = true;
            try {
                synchronized (this) {
                    String[] strArr = this.f137053c;
                    boolean z10 = strArr == null;
                    if (z10) {
                        strArr = new String[]{org.apache.tools.ant.types.selectors.m0.f136554a};
                    }
                    this.f137053c = strArr;
                    String[] strArr2 = this.f137054d;
                    boolean z11 = strArr2 == null;
                    if (z11) {
                        strArr2 = new String[0];
                    }
                    this.f137054d = strArr2;
                    String[] strArr3 = new String[this.f137061k.size()];
                    this.f137061k.copyInto(strArr3);
                    String[] strArr4 = new String[this.f137060j.size()];
                    this.f137060j.copyInto(strArr4);
                    T();
                    E0(strArr3);
                    E0(strArr4);
                    N();
                    String[] strArr5 = null;
                    this.f137053c = z10 ? null : this.f137053c;
                    if (!z11) {
                        strArr5 = this.f137054d;
                    }
                    this.f137054d = strArr5;
                }
                synchronized (this.B) {
                    this.f137064n = true;
                    this.A = false;
                    this.B.notifyAll();
                }
            } catch (Throwable th2) {
                synchronized (this.B) {
                    this.f137064n = true;
                    this.A = false;
                    this.B.notifyAll();
                    throw th2;
                }
            }
        }
    }

    boolean P(final org.apache.tools.ant.types.selectors.q0 q0Var) {
        return Stream.of((Object[]) this.f137073w).filter(new Predicate() { // from class: org.apache.tools.ant.p0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return v0.o0((org.apache.tools.ant.types.selectors.r0) obj);
            }
        }).map(new Function() { // from class: org.apache.tools.ant.q0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((org.apache.tools.ant.types.selectors.r0) obj).h();
            }
        }).anyMatch(new Predicate() { // from class: org.apache.tools.ant.r0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f133596a.p0(q0Var, (org.apache.tools.ant.types.selectors.r0) obj);
            }
        });
    }

    protected boolean Q(String str) {
        return R(new org.apache.tools.ant.types.selectors.q0(str));
    }

    synchronized void T() {
        if (!this.f137074x) {
            this.f137072v = U(this.f137070t, this.f137053c);
            this.f137073w = U(this.f137071u, this.f137054d);
            this.f137074x = true;
        }
    }

    public synchronized int W() {
        Vector<String> vector;
        vector = this.f137059i;
        if (vector == null) {
            throw new IllegalStateException("Must call scan() first");
        }
        return vector.size();
    }

    public synchronized int X() {
        Vector<String> vector;
        vector = this.f137056f;
        if (vector == null) {
            throw new IllegalStateException("Must call scan() first");
        }
        return vector.size();
    }

    public synchronized String[] Y() {
        String[] strArr;
        synchronized (this) {
            Set<String> set = this.E;
            strArr = (String[]) set.toArray(new String[set.size()]);
        }
        return strArr;
        Arrays.sort(strArr);
        return strArr;
    }

    Set<String> Z() {
        return this.f137069s;
    }

    @Override // org.apache.tools.ant.h1
    public synchronized String[] a() {
        Vector<String> vector;
        O0();
        vector = this.f137058h;
        return (String[]) vector.toArray(new String[vector.size()]);
    }

    @Override // org.apache.tools.ant.types.selectors.l0
    public synchronized String[] b() {
        Vector<String> vector;
        O0();
        vector = this.f137063m;
        return (String[]) vector.toArray(new String[vector.size()]);
    }

    public synchronized boolean b0() {
        return this.f137065o;
    }

    @Override // org.apache.tools.ant.h1
    public void c(String str) {
        p(str == null ? null : new File(str.replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar).replace(IOUtils.DIR_SEPARATOR_WINDOWS, File.separatorChar)));
    }

    @Override // org.apache.tools.ant.types.selectors.l0
    public synchronized void d(org.apache.tools.ant.types.selectors.v[] vVarArr) {
        this.f137055e = vVarArr;
    }

    public synchronized boolean d0() {
        return this.f137068r;
    }

    @Override // org.apache.tools.ant.h1
    public void e() throws IllegalStateException {
        synchronized (this.f137076z) {
            if (this.f137075y) {
                while (this.f137075y) {
                    try {
                        this.f137076z.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                IllegalStateException illegalStateException = this.C;
                if (illegalStateException != null) {
                    throw illegalStateException;
                }
                return;
            }
            boolean z10 = true;
            this.f137075y = true;
            File file = this.f137052b;
            try {
                synchronized (this) {
                    String[] strArr = null;
                    this.C = null;
                    O();
                    String[] strArr2 = this.f137053c;
                    boolean z11 = strArr2 == null;
                    if (z11) {
                        strArr2 = new String[]{org.apache.tools.ant.types.selectors.m0.f136554a};
                    }
                    this.f137053c = strArr2;
                    String[] strArr3 = this.f137054d;
                    if (strArr3 != null) {
                        z10 = false;
                    }
                    if (z10) {
                        strArr3 = new String[0];
                    }
                    this.f137054d = strArr3;
                    File file2 = this.f137052b;
                    if (file2 != null && !this.f137067q && Files.isSymbolicLink(file2.toPath())) {
                        this.E.add(this.f137052b.getAbsolutePath());
                        this.f137052b = null;
                    }
                    File file3 = this.f137052b;
                    if (file3 != null) {
                        if (file3.exists()) {
                            if (!this.f137052b.isDirectory()) {
                                this.C = new IllegalStateException("basedir " + this.f137052b + " is not a directory.");
                            }
                        } else {
                            if (!this.f137066p) {
                                this.f137052b = file;
                                synchronized (this.f137076z) {
                                    this.f137075y = false;
                                    this.f137076z.notifyAll();
                                }
                                return;
                            }
                            this.C = new IllegalStateException("basedir " + this.f137052b + I);
                        }
                        IllegalStateException illegalStateException2 = this.C;
                        if (illegalStateException2 != null) {
                            throw illegalStateException2;
                        }
                    } else if (z11) {
                        this.f137052b = file;
                        synchronized (this.f137076z) {
                            this.f137075y = false;
                            this.f137076z.notifyAll();
                        }
                        return;
                    }
                    org.apache.tools.ant.types.selectors.q0 q0Var = org.apache.tools.ant.types.selectors.q0.f136612c;
                    if (!i0(q0Var)) {
                        this.f137060j.addElement("");
                    } else if (f0(q0Var)) {
                        this.f137061k.addElement("");
                    } else if (k0("", this.f137052b)) {
                        this.f137059i.addElement("");
                    } else {
                        this.f137063m.addElement("");
                    }
                    M();
                    N();
                    this.f137053c = z11 ? null : this.f137053c;
                    if (!z10) {
                        strArr = this.f137054d;
                    }
                    this.f137054d = strArr;
                    this.f137052b = file;
                    synchronized (this.f137076z) {
                        this.f137075y = false;
                        this.f137076z.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                this.f137052b = file;
                synchronized (this.f137076z) {
                    this.f137075y = false;
                    this.f137076z.notifyAll();
                    throw th2;
                }
            }
        }
    }

    protected boolean e0(String str) {
        return f0(new org.apache.tools.ant.types.selectors.q0(str));
    }

    @Override // org.apache.tools.ant.h1
    public synchronized File f() {
        return this.f137052b;
    }

    @Override // org.apache.tools.ant.h1
    public synchronized String[] g() {
        Vector<String> vector;
        O0();
        vector = this.f137057g;
        return (String[]) vector.toArray(new String[vector.size()]);
    }

    public synchronized boolean g0() {
        return this.f137067q;
    }

    @Override // org.apache.tools.ant.h1
    public synchronized void h(String[] strArr) {
        try {
            if (strArr == null) {
                this.f137053c = null;
            } else {
                this.f137053c = (String[]) Stream.of((Object[]) strArr).map(new g0()).toArray(new IntFunction() { // from class: org.apache.tools.ant.u0
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i10) {
                        return v0.v0(i10);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected boolean h0(String str) {
        return i0(new org.apache.tools.ant.types.selectors.q0(str));
    }

    @Override // org.apache.tools.ant.h1
    public synchronized String[] i() {
        Vector<String> vector;
        O0();
        vector = this.f137060j;
        return (String[]) vector.toArray(new String[vector.size()]);
    }

    @Override // org.apache.tools.ant.h1
    public String[] j() {
        String[] strArr;
        synchronized (this) {
            Vector<String> vector = this.f137059i;
            if (vector == null) {
                throw new IllegalStateException("Must call scan() first");
            }
            strArr = (String[]) vector.toArray(new String[vector.size()]);
        }
        Arrays.sort(strArr);
        return strArr;
    }

    @Override // org.apache.tools.ant.h1
    public synchronized void k(String[] strArr) {
        try {
            if (strArr == null) {
                this.f137054d = null;
            } else {
                this.f137054d = (String[]) Stream.of((Object[]) strArr).map(new g0()).toArray(new IntFunction() { // from class: org.apache.tools.ant.i0
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i10) {
                        return v0.u0(i10);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected boolean k0(final String str, final File file) {
        org.apache.tools.ant.types.selectors.v[] vVarArr = this.f137055e;
        return vVarArr == null || Stream.of((Object[]) vVarArr).allMatch(new Predicate() { // from class: org.apache.tools.ant.l0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f133506a.t0(str, file, (org.apache.tools.ant.types.selectors.v) obj);
            }
        });
    }

    @Override // org.apache.tools.ant.h1
    public synchronized void l(boolean z10) {
        this.f137065o = z10;
    }

    @Override // org.apache.tools.ant.h1
    public String[] m() {
        String[] strArr;
        synchronized (this) {
            Vector<String> vector = this.f137056f;
            if (vector == null) {
                throw new IllegalStateException("Must call scan() first");
            }
            strArr = (String[]) vector.toArray(new String[vector.size()]);
        }
        Arrays.sort(strArr);
        return strArr;
    }

    @Override // org.apache.tools.ant.types.selectors.l0
    public synchronized String[] n() {
        Vector<String> vector;
        O0();
        vector = this.f137062l;
        return (String[]) vector.toArray(new String[vector.size()]);
    }

    public synchronized org.apache.tools.ant.types.s1 o(String str) {
        return new org.apache.tools.ant.types.resources.z(this.f137052b, str);
    }

    @Override // org.apache.tools.ant.h1
    public synchronized void p(File file) {
        this.f137052b = file;
    }

    @Override // org.apache.tools.ant.h1
    public synchronized String[] q() {
        Vector<String> vector;
        O0();
        vector = this.f137061k;
        return (String[]) vector.toArray(new String[vector.size()]);
    }

    @Override // org.apache.tools.ant.h1
    public synchronized void r() {
        Stream map = Stream.of((Object[]) V()).map(new Function() { // from class: org.apache.tools.ant.n0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return v0.m0((String) obj);
            }
        });
        String[] strArr = this.f137054d;
        if (strArr != null) {
            map = Stream.concat(Stream.of((Object[]) strArr), map);
        }
        this.f137054d = (String[]) map.toArray(new IntFunction() { // from class: org.apache.tools.ant.o0
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return v0.l0(i10);
            }
        });
    }
}
