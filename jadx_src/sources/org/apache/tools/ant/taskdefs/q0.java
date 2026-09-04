package org.apache.tools.ant.taskdefs;

import com.umeng.analytics.pro.ak;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.function.Function;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.util.LinkedHashtable;
import org.apache.tools.ant.util.ResourceUtils;

/* JADX INFO: compiled from: Copy.java */
/* JADX INFO: loaded from: classes5.dex */
public class q0 extends org.apache.tools.ant.u2 {
    private static final String K = "Cannot perform operation from directory to file.";

    @Deprecated
    static final String L = org.apache.tools.ant.util.j2.f136853f;
    static final File M = new File("/NULL_FILE");
    protected org.apache.tools.ant.types.k0 A;
    protected org.apache.tools.ant.util.j0 B;
    private final Vector<org.apache.tools.ant.types.c0> C;
    private final Vector<org.apache.tools.ant.types.f0> D;
    private String E;
    private String F;
    private long G;
    private boolean H;
    private boolean I;
    private org.apache.tools.ant.types.s1 J;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected File f135575k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected File f135576l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected File f135577m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Vector<org.apache.tools.ant.types.u1> f135578n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected Vector<org.apache.tools.ant.types.u1> f135579o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f135580p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f135581q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f135582r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f135583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f135584t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f135585u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f135586v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f135587w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected Hashtable<String, String[]> f135588x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected Hashtable<String, String[]> f135589y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected Hashtable<File, File> f135590z;

    public q0() {
        Vector<org.apache.tools.ant.types.u1> vector = new Vector<>();
        this.f135578n = vector;
        this.f135579o = vector;
        this.f135580p = false;
        this.f135581q = false;
        this.f135582r = false;
        this.f135583s = false;
        this.f135584t = false;
        this.f135585u = 3;
        this.f135586v = true;
        this.f135587w = true;
        this.f135588x = new LinkedHashtable();
        this.f135589y = new LinkedHashtable();
        this.f135590z = new LinkedHashtable();
        this.A = null;
        this.C = new Vector<>();
        this.D = new Vector<>();
        this.E = null;
        this.F = null;
        this.G = 0L;
        this.H = false;
        this.I = false;
        this.J = null;
        org.apache.tools.ant.util.j0 j0VarO = org.apache.tools.ant.util.j0.O();
        this.B = j0VarO;
        this.G = j0VarO.M();
    }

    private static File D2(File file) {
        return file == null ? M : file;
    }

    private org.apache.tools.ant.util.g0 E2() {
        org.apache.tools.ant.types.k0 k0Var = this.A;
        if (k0Var != null) {
            return k0Var.i2();
        }
        return this.f135584t ? new org.apache.tools.ant.util.o0() : new org.apache.tools.ant.util.q0();
    }

    private String F2(Exception exc) {
        return exc.getMessage() == null ? exc.toString() : exc.getMessage();
    }

    private void J2(Set<File> set, Map<File, List<String>> map, Map<File, List<String>> map2) {
        for (File file : set) {
            List<String> list = map2.get(file);
            List<String> list2 = map.get(file);
            String[] strArr = new String[0];
            if (list != null) {
                strArr = (String[]) list.toArray(strArr);
            }
            String[] strArr2 = new String[0];
            if (list2 != null) {
                strArr2 = (String[]) list2.toArray(strArr2);
            }
            if (file == M) {
                file = null;
            }
            N2(file, this.f135577m, strArr, strArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List K2(String[] strArr, File file) {
        return new ArrayList(strArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ org.apache.tools.ant.types.s1 L2(File file, String str) {
        return new org.apache.tools.ant.types.resources.z(file, str);
    }

    private static void k2(File file, String str, Map<File, List<String>> map) {
        if (str != null) {
            l2(file, new String[]{str}, map);
        }
    }

    private static void l2(File file, final String[] strArr, Map<File, List<String>> map) {
        if (strArr != null) {
            ((List) map.computeIfAbsent(D2(file), new Function() { // from class: org.apache.tools.ant.taskdefs.p0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return q0.K2(strArr, (File) obj);
                }
            })).addAll(Arrays.asList(strArr));
        }
    }

    private void r2() {
        File file = this.f135575k;
        if (file != null) {
            if (!file.exists()) {
                String str = "Warning: Could not find file " + this.f135575k.getAbsolutePath() + " to copy.";
                if (this.f135587w) {
                    throw new BuildException(str);
                }
                if (this.I) {
                    return;
                }
                x1(str, 0);
                return;
            }
            if (this.f135576l == null) {
                this.f135576l = new File(this.f135577m, this.f135575k.getName());
            }
            if (this.f135583s || !this.f135576l.exists() || this.f135575k.lastModified() - this.G > this.f135576l.lastModified()) {
                this.f135588x.put(this.f135575k.getAbsolutePath(), new String[]{this.f135576l.getAbsolutePath()});
                return;
            }
            x1(this.f135575k + " omitted as " + this.f135576l + " is up to date.", 3);
        }
    }

    private String x2(Exception exc) {
        boolean z10 = exc.getClass() == IOException.class;
        StringBuilder sb2 = new StringBuilder();
        if (!z10 || exc.getMessage() == null) {
            sb2.append(exc.getClass().getName());
        }
        if (exc.getMessage() != null) {
            if (!z10) {
                sb2.append(" ");
            }
            sb2.append(exc.getMessage());
        }
        if (exc.getClass().getName().contains("MalformedInput")) {
            Object[] objArr = new Object[1];
            String strL = this.E;
            if (strL == null) {
                strL = this.B.L();
            }
            objArr[0] = strL;
            sb2.append(String.format("%nThis is normally due to the input file containing invalid%nbytes for the character encoding used : %s%n", objArr));
        }
        return sb2.toString();
    }

    protected Vector<org.apache.tools.ant.types.c0> A2() {
        return this.C;
    }

    protected Vector<org.apache.tools.ant.types.f0> B2() {
        return this.D;
    }

    public boolean C2() {
        return this.H;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        File file = this.f135575k;
        File file2 = this.f135576l;
        File file3 = this.f135577m;
        int i10 = 0;
        org.apache.tools.ant.types.u1 u1VarElementAt = (file == null && file2 != null && this.f135578n.size() == 1) ? this.f135578n.elementAt(0) : null;
        try {
            try {
                g3();
                r2();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (org.apache.tools.ant.types.u1 u1Var : this.f135578n) {
                    if ((u1Var instanceof org.apache.tools.ant.types.b0) && u1Var.O()) {
                        org.apache.tools.ant.types.b0 b0Var = (org.apache.tools.ant.types.b0) u1Var;
                        try {
                            org.apache.tools.ant.v0 v0VarB2 = b0Var.B2(b());
                            File fileZ2 = b0Var.z2(b());
                            if (!this.f135584t && this.A == null && v0VarB2.d0() && !b0Var.F2()) {
                                this.f135590z.put(fileZ2, this.f135577m);
                            }
                            l2(fileZ2, v0VarB2.m(), map);
                            l2(fileZ2, v0VarB2.j(), map2);
                            hashSet.add(fileZ2);
                            i10 = 0;
                        } catch (BuildException e10) {
                            if (this.f135587w || !F2(e10).endsWith(org.apache.tools.ant.v0.I)) {
                                throw e10;
                            }
                            if (!this.I) {
                                x1("Warning: " + F2(e10), i10);
                            }
                        }
                    } else {
                        if (!u1Var.O() && !f3()) {
                            throw new BuildException("Only FileSystem resources are supported.");
                        }
                        for (org.apache.tools.ant.types.s1 s1Var : u1Var) {
                            if (s1Var.p2()) {
                                File file4 = M;
                                String strK2 = s1Var.k2();
                                org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
                                if (yVar != null) {
                                    org.apache.tools.ant.types.resources.z zVarD = ResourceUtils.d(yVar);
                                    File fileD2 = D2(zVarD.w2());
                                    if (zVarD.w2() == null) {
                                        strK2 = zVarD.l0().getAbsolutePath();
                                    }
                                    file4 = fileD2;
                                }
                                if (s1Var.o2() || yVar != null) {
                                    k2(file4, strK2, s1Var.o2() ? map2 : map);
                                    hashSet.add(file4);
                                } else {
                                    arrayList.add(s1Var);
                                }
                                i10 = 0;
                            } else {
                                String str = "Warning: Could not find resource " + s1Var.v2() + " to copy.";
                                if (this.f135587w) {
                                    throw new BuildException(str);
                                }
                                if (!this.I) {
                                    x1(str, i10);
                                }
                            }
                        }
                        i10 = 0;
                    }
                }
                J2(hashSet, map2, map);
                try {
                    v2();
                } catch (BuildException e11) {
                    if (this.f135587w) {
                        throw e11;
                    }
                    if (!this.I) {
                        x1("Warning: " + F2(e11), 0);
                    }
                }
                if (!arrayList.isEmpty() || this.J != null) {
                    Map<org.apache.tools.ant.types.s1, String[]> mapM2 = M2((org.apache.tools.ant.types.s1[]) arrayList.toArray(new org.apache.tools.ant.types.s1[arrayList.size()]), this.f135577m);
                    org.apache.tools.ant.types.s1 s1Var2 = this.J;
                    if (s1Var2 != null) {
                        mapM2.put(s1Var2, new String[]{this.f135576l.getAbsolutePath()});
                    }
                    try {
                        w2(mapM2);
                    } catch (BuildException e12) {
                        if (this.f135587w) {
                            throw e12;
                        }
                        if (!this.I) {
                            x1("Warning: " + F2(e12), 0);
                        }
                    }
                }
                this.J = null;
                this.f135575k = file;
                this.f135576l = file2;
                this.f135577m = file3;
                if (u1VarElementAt != null) {
                    this.f135578n.insertElementAt(u1VarElementAt, 0);
                }
                this.f135588x.clear();
                this.f135589y.clear();
                this.f135590z.clear();
            } catch (BuildException e13) {
                if (this.f135587w || !F2(e13).equals(K)) {
                    throw e13;
                }
                x1("Warning: " + F2(e13), 0);
                this.J = null;
                this.f135575k = file;
                this.f135576l = file2;
                this.f135577m = file3;
                if (u1VarElementAt != null) {
                    this.f135578n.insertElementAt(u1VarElementAt, 0);
                }
                this.f135588x.clear();
                this.f135589y.clear();
                this.f135590z.clear();
            }
        } catch (Throwable th2) {
            this.J = null;
            this.f135575k = file;
            this.f135576l = file2;
            this.f135577m = file3;
            if (u1VarElementAt != null) {
                this.f135578n.insertElementAt(u1VarElementAt, 0);
            }
            this.f135588x.clear();
            this.f135589y.clear();
            this.f135590z.clear();
            throw th2;
        }
    }

    public String G2() {
        return this.F;
    }

    public boolean H2() {
        return this.f135582r;
    }

    public boolean I2() {
        return this.f135580p;
    }

    protected Map<org.apache.tools.ant.types.s1, String[]> M2(org.apache.tools.ant.types.s1[] s1VarArr, File file) {
        return p2(s1VarArr, file, E2());
    }

    protected void N2(File file, File file2, String[] strArr, String[] strArr2) {
        org.apache.tools.ant.util.g0 g0VarE2 = E2();
        q2(file, file2, strArr, g0VarE2, this.f135588x);
        if (this.f135586v) {
            q2(file, file2, strArr2, g0VarE2, this.f135589y);
        }
    }

    public void O2(boolean z10) {
        this.f135580p = z10;
    }

    public void P2(String str) {
        this.E = str;
        if (this.F == null) {
            this.F = str;
        }
    }

    public void Q2(boolean z10) {
        this.f135587w = z10;
    }

    public void R2(File file) {
        this.f135575k = file;
    }

    public void S2(boolean z10) {
        this.f135581q = z10;
    }

    public void T2(boolean z10) {
        this.f135584t = z10;
    }

    public void U2(boolean z10) {
        this.H = z10;
    }

    public void V2(long j10) {
        this.G = j10;
    }

    public void W2(boolean z10) {
        this.f135586v = z10;
    }

    public void X2(String str) {
        this.F = str;
    }

    public void Y2(boolean z10) {
        this.f135583s = z10;
    }

    @Deprecated
    public void Z2(String str) {
        a3(Project.t1(str));
    }

    public void a3(boolean z10) {
        this.f135582r = z10;
    }

    public void b3(boolean z10) {
        this.I = z10;
    }

    public void c3(File file) {
        this.f135577m = file;
    }

    public void d3(File file) {
        this.f135576l = file;
    }

    public void e3(boolean z10) {
        this.f135585u = z10 ? 2 : 3;
    }

    protected boolean f3() {
        return getClass().equals(q0.class);
    }

    protected void g3() throws BuildException {
        if (this.f135575k == null && this.f135578n.isEmpty()) {
            throw new BuildException("Specify at least one source--a file or a resource collection.");
        }
        File file = this.f135576l;
        if (file != null && this.f135577m != null) {
            throw new BuildException("Only one of tofile and todir may be set.");
        }
        if (file == null && this.f135577m == null) {
            throw new BuildException("One of tofile or todir must be set.");
        }
        File file2 = this.f135575k;
        if (file2 != null && file2.isDirectory()) {
            throw new BuildException("Use a resource collection to copy directories.");
        }
        if (this.f135576l != null && !this.f135578n.isEmpty()) {
            if (this.f135578n.size() > 1) {
                throw new BuildException("Cannot concatenate multiple files into a single file.");
            }
            org.apache.tools.ant.types.u1 u1VarElementAt = this.f135578n.elementAt(0);
            if (!u1VarElementAt.O() && !f3()) {
                throw new BuildException("Only FileSystem resources are supported.");
            }
            if (u1VarElementAt.isEmpty()) {
                throw new BuildException(K);
            }
            if (u1VarElementAt.size() != 1) {
                throw new BuildException("Cannot concatenate multiple files into a single file.");
            }
            org.apache.tools.ant.types.s1 next = u1VarElementAt.iterator().next();
            org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) next.e2(org.apache.tools.ant.types.resources.y.class);
            if (this.f135575k != null) {
                throw new BuildException("Cannot concatenate multiple files into a single file.");
            }
            if (yVar != null) {
                this.f135575k = yVar.l0();
            } else {
                this.J = next;
            }
            this.f135578n.removeElementAt(0);
        }
        File file3 = this.f135576l;
        if (file3 != null) {
            this.f135577m = file3.getParentFile();
        }
    }

    public void m2(org.apache.tools.ant.types.u1 u1Var) {
        this.f135578n.add(u1Var);
    }

    public void n2(org.apache.tools.ant.util.g0 g0Var) {
        u2().e2(g0Var);
    }

    public void o2(org.apache.tools.ant.types.b0 b0Var) {
        m2(b0Var);
    }

    protected Map<org.apache.tools.ant.types.s1, String[]> p2(org.apache.tools.ant.types.s1[] s1VarArr, final File file, org.apache.tools.ant.util.g0 g0Var) {
        org.apache.tools.ant.types.s1[] s1VarArrA;
        HashMap map = new HashMap();
        if (this.f135583s) {
            ArrayList arrayList = new ArrayList();
            for (org.apache.tools.ant.types.s1 s1Var : s1VarArr) {
                if (g0Var.y0(s1Var.k2()) != null) {
                    arrayList.add(s1Var);
                }
            }
            s1VarArrA = (org.apache.tools.ant.types.s1[]) arrayList.toArray(new org.apache.tools.ant.types.s1[arrayList.size()]);
        } else {
            s1VarArrA = ResourceUtils.A(this, s1VarArr, g0Var, new org.apache.tools.ant.types.v1() { // from class: org.apache.tools.ant.taskdefs.o0
                @Override // org.apache.tools.ant.types.v1
                public final org.apache.tools.ant.types.s1 o(String str) {
                    return q0.L2(file, str);
                }
            }, this.G);
        }
        for (org.apache.tools.ant.types.s1 s1Var2 : s1VarArrA) {
            String[] strArrY0 = g0Var.y0(s1Var2.k2());
            if (strArrY0 == null || strArrY0.length == 0) {
                throw new BuildException("Can't copy a resource without a name if the mapper doesn't provide one.");
            }
            if (this.f135580p) {
                for (int i10 = 0; i10 < strArrY0.length; i10++) {
                    strArrY0[i10] = new File(file, strArrY0[i10]).getAbsolutePath();
                }
                map.put(s1Var2, strArrY0);
            } else {
                map.put(s1Var2, new String[]{new File(file, strArrY0[0]).getAbsolutePath()});
            }
        }
        return map;
    }

    protected void q2(File file, File file2, String[] strArr, org.apache.tools.ant.util.g0 g0Var, Hashtable<String, String[]> hashtable) {
        String[] strArrL;
        if (this.f135583s) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (g0Var.y0(str) != null) {
                    arrayList.add(str);
                }
            }
            strArrL = (String[]) arrayList.toArray(new String[arrayList.size()]);
        } else {
            strArrL = new org.apache.tools.ant.util.f2(this).l(strArr, file, file2, g0Var, this.G);
        }
        for (String str2 : strArrL) {
            File file3 = new File(file, str2);
            String[] strArrY0 = g0Var.y0(str2);
            if (strArrY0 != null && strArrY0.length != 0) {
                if (this.f135580p) {
                    for (int i10 = 0; i10 < strArrY0.length; i10++) {
                        strArrY0[i10] = new File(file2, strArrY0[i10]).getAbsolutePath();
                    }
                    hashtable.put(file3.getAbsolutePath(), strArrY0);
                } else {
                    hashtable.put(file3.getAbsolutePath(), new String[]{new File(file2, strArrY0[0]).getAbsolutePath()});
                }
            }
        }
    }

    public org.apache.tools.ant.types.c0 s2() {
        org.apache.tools.ant.types.c0 c0Var = new org.apache.tools.ant.types.c0();
        this.C.addElement(c0Var);
        return c0Var;
    }

    public org.apache.tools.ant.types.f0 t2() {
        org.apache.tools.ant.types.f0 f0Var = new org.apache.tools.ant.types.f0();
        this.D.addElement(f0Var);
        return f0Var;
    }

    public org.apache.tools.ant.types.k0 u2() throws BuildException {
        if (this.A != null) {
            throw new BuildException(t1.f135751x, w1());
        }
        org.apache.tools.ant.types.k0 k0Var = new org.apache.tools.ant.types.k0(b());
        this.A = k0Var;
        return k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0164  */
    /* JADX WARN: Code duplicated, block: B:85:0x0171 A[SYNTHETIC] */
    protected void v2() {
        String str;
        Iterator<Map.Entry<String, String[]>> it;
        String str2;
        if (!this.f135588x.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            String str3 = "Copying ";
            sb2.append("Copying ");
            sb2.append(this.f135588x.size());
            sb2.append(" file");
            sb2.append(this.f135588x.size() == 1 ? "" : ak.aB);
            sb2.append(" to ");
            sb2.append(this.f135577m.getAbsolutePath());
            log(sb2.toString());
            Iterator<Map.Entry<String, String[]>> it2 = this.f135588x.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, String[]> next = it2.next();
                String key = next.getKey();
                String[] value = next.getValue();
                int length = value.length;
                int i10 = 0;
                while (i10 < length) {
                    String str4 = value[i10];
                    if (key.equals(str4)) {
                        x1("Skipping self-copy of " + key, this.f135585u);
                        str = str3;
                        it = it2;
                    } else {
                        try {
                            x1(str3 + key + " to " + str4, this.f135585u);
                            org.apache.tools.ant.types.h0 h0Var = new org.apache.tools.ant.types.h0();
                            if (this.f135581q) {
                                h0Var.a(b().n0());
                            }
                            Iterator<org.apache.tools.ant.types.f0> it3 = this.D.iterator();
                            while (it3.hasNext()) {
                                h0Var.a(it3.next());
                            }
                            str = str3;
                            try {
                                it = it2;
                                try {
                                    this.B.q(new File(key), new File(str4), h0Var, this.C, this.f135583s, this.f135582r, false, this.E, this.F, b(), C2());
                                } catch (IOException e10) {
                                    e = e10;
                                    str2 = "Failed to copy " + key + " to " + str4 + " due to " + x2(e);
                                    File file = new File(str4);
                                    if (!(e instanceof ResourceUtils.ReadOnlyTargetFileException)) {
                                        str2 = str2 + " and I couldn't delete the corrupt " + str4;
                                    }
                                    if (!this.f135587w) {
                                        throw new BuildException(str2, e, w1());
                                    }
                                    x1(str2, 0);
                                }
                            } catch (IOException e11) {
                                e = e11;
                                it = it2;
                                str2 = "Failed to copy " + key + " to " + str4 + " due to " + x2(e);
                                File file2 = new File(str4);
                                if (!(e instanceof ResourceUtils.ReadOnlyTargetFileException) && file2.exists() && !file2.delete()) {
                                    str2 = str2 + " and I couldn't delete the corrupt " + str4;
                                }
                                if (!this.f135587w) {
                                    throw new BuildException(str2, e, w1());
                                }
                                x1(str2, 0);
                                i10++;
                                str3 = str;
                                it2 = it;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            str = str3;
                        }
                    }
                    i10++;
                    str3 = str;
                    it2 = it;
                }
            }
        }
        if (this.f135586v) {
            int i11 = 0;
            for (String[] strArr : this.f135589y.values()) {
                int i12 = i11;
                for (String str5 : strArr) {
                    File file3 = new File(str5);
                    if (!file3.exists()) {
                        if (file3.mkdirs() || file3.isDirectory()) {
                            i12++;
                        } else {
                            x1("Unable to create directory " + file3.getAbsolutePath(), 0);
                        }
                    }
                }
                i11 = i12;
            }
            if (i11 > 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Copied ");
                sb3.append(this.f135589y.size());
                sb3.append(" empty director");
                sb3.append(this.f135589y.size() == 1 ? "y" : "ies");
                sb3.append(" to ");
                sb3.append(i11);
                sb3.append(" empty director");
                sb3.append(i11 != 1 ? "ies" : "y");
                sb3.append(" under ");
                sb3.append(this.f135577m.getAbsolutePath());
                log(sb3.toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0159 A[SYNTHETIC] */
    protected void w2(Map<org.apache.tools.ant.types.s1, String[]> map) {
        int i10;
        int i11;
        String[] strArr;
        String str;
        boolean z10;
        if (map.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        String str2 = "Copying ";
        sb2.append("Copying ");
        sb2.append(map.size());
        sb2.append(" resource");
        sb2.append(map.size() == 1 ? "" : ak.aB);
        sb2.append(" to ");
        sb2.append(this.f135577m.getAbsolutePath());
        log(sb2.toString());
        for (Map.Entry<org.apache.tools.ant.types.s1, String[]> entry : map.entrySet()) {
            org.apache.tools.ant.types.s1 key = entry.getKey();
            String[] value = entry.getValue();
            int length = value.length;
            int i12 = 0;
            while (i12 < length) {
                String str3 = value[i12];
                try {
                    x1(str2 + key + " to " + str3, this.f135585u);
                    org.apache.tools.ant.types.h0 h0Var = new org.apache.tools.ant.types.h0();
                    if (this.f135581q) {
                        h0Var.a(b().n0());
                    }
                    Iterator<org.apache.tools.ant.types.f0> it = this.D.iterator();
                    while (it.hasNext()) {
                        h0Var.a(it.next());
                    }
                    int i13 = i12;
                    try {
                        str2 = str2;
                        str3 = str3;
                        i10 = i13;
                        i11 = length;
                        strArr = value;
                        try {
                            ResourceUtils.m(key, new org.apache.tools.ant.types.resources.z(this.f135577m, str3), h0Var, this.C, this.f135583s, this.f135582r, false, this.E, this.F, b(), C2());
                            z10 = false;
                        } catch (IOException e10) {
                            e = e10;
                            str = "Failed to copy " + key + " to " + str3 + " due to " + x2(e);
                            File file = new File(str3);
                            if (!(e instanceof ResourceUtils.ReadOnlyTargetFileException)) {
                                str = str + " and I couldn't delete the corrupt " + str3;
                            }
                            if (!this.f135587w) {
                                throw new BuildException(str, e, w1());
                            }
                            z10 = false;
                            x1(str, 0);
                        }
                    } catch (IOException e11) {
                        e = e11;
                        i10 = i13;
                        i11 = length;
                        strArr = value;
                        str = "Failed to copy " + key + " to " + str3 + " due to " + x2(e);
                        File file2 = new File(str3);
                        if (!(e instanceof ResourceUtils.ReadOnlyTargetFileException) && file2.exists() && !file2.delete()) {
                            str = str + " and I couldn't delete the corrupt " + str3;
                        }
                        if (!this.f135587w) {
                            throw new BuildException(str, e, w1());
                        }
                        z10 = false;
                        x1(str, 0);
                        i12 = i10 + 1;
                        length = i11;
                        str2 = str2;
                        value = strArr;
                    }
                } catch (IOException e12) {
                    e = e12;
                    i10 = i12;
                }
                i12 = i10 + 1;
                length = i11;
                str2 = str2;
                value = strArr;
            }
        }
    }

    public String y2() {
        return this.E;
    }

    protected org.apache.tools.ant.util.j0 z2() {
        return this.B;
    }
}
