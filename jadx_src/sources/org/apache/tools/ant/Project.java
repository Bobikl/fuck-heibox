package org.apache.tools.ant;

import com.xiaomi.mipush.sdk.Constants;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.tools.ant.launch.Locator;
import org.apache.tools.ant.util.VectorSet;

/* JADX INFO: loaded from: classes5.dex */
public class Project implements org.apache.tools.ant.types.v1 {
    private static final String A = "VISITED";

    @Deprecated
    public static final String B = "1.0";

    @Deprecated
    public static final String C = "1.1";

    @Deprecated
    public static final String D = "1.2";

    @Deprecated
    public static final String E = "1.3";

    @Deprecated
    public static final String F = "1.4";
    public static final String G = "@";
    public static final String H = "@";
    private static final org.apache.tools.ant.util.j0 I = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f133041u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f133042v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f133043w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f133044x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f133045y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f133046z = "VISITING";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f133047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f133048c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f133052g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final org.apache.tools.ant.types.f0 f133054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final org.apache.tools.ant.types.h0 f133055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f133056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f133057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile k[] f133058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ThreadLocal<Boolean> f133059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ClassLoader f133060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Map<Thread, u2> f133061p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map<ThreadGroup, u2> f133062q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private org.apache.tools.ant.input.c f133063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private InputStream f133064s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f133065t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f133049d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Hashtable<String, Object> f133050e = new AntRefTable();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, Object> f133051f = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Hashtable<String, t2> f133053h = new Hashtable<>();

    public static class AntRefTable extends Hashtable<String, Object> {
        private static final long serialVersionUID = 1;

        AntRefTable() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object b(Object obj) {
            return super.get(obj);
        }

        @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
        public Object get(Object obj) {
            Object objB = b(obj);
            if (!(objB instanceof z2)) {
                return objB;
            }
            z2 z2Var = (z2) objB;
            z2Var.a2();
            return z2Var.r2();
        }
    }

    public Project() {
        org.apache.tools.ant.types.f0 f0Var = new org.apache.tools.ant.types.f0();
        this.f133054i = f0Var;
        f0Var.J(this);
        this.f133055j = new org.apache.tools.ant.types.h0(f0Var);
        this.f133057l = new Object();
        this.f133058m = new k[0];
        this.f133059n = ThreadLocal.withInitial(new Supplier() { // from class: org.apache.tools.ant.a2
            @Override // java.util.function.Supplier
            public final Object get() {
                return Boolean.FALSE;
            }
        });
        this.f133060o = null;
        this.f133061p = Collections.synchronizedMap(new WeakHashMap());
        this.f133062q = Collections.synchronizedMap(new WeakHashMap());
        this.f133063r = null;
        this.f133064s = null;
        this.f133065t = false;
        this.f133063r = new org.apache.tools.ant.input.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String K0(String str) {
        return String.format(" `%s'", str);
    }

    private void S(BuildEvent buildEvent, String str, int i10) {
        if (str == null) {
            str = String.valueOf(str);
        }
        if (str.endsWith(System.lineSeparator())) {
            buildEvent.h(str.substring(0, str.length() - System.lineSeparator().length()), i10);
        } else {
            buildEvent.h(str, i10);
        }
        if (this.f133059n.get() != Boolean.FALSE) {
            return;
        }
        try {
            this.f133059n.set(Boolean.TRUE);
            for (k kVar : this.f133058m) {
                kVar.V(buildEvent);
            }
            this.f133059n.set(Boolean.FALSE);
        } catch (Throwable th2) {
            this.f133059n.set(Boolean.FALSE);
            throw th2;
        }
    }

    private static BuildException S0(String str, Stack<String> stack) {
        String strPop;
        StringBuilder sb2 = new StringBuilder("Circular dependency: ");
        sb2.append(str);
        do {
            strPop = stack.pop();
            sb2.append(" <- ");
            sb2.append(strPop);
        } while (!strPop.equals(str));
        return new BuildException(sb2.toString());
    }

    private void Y0() {
        File classSource = Locator.getClassSource(Project.class);
        if (classSource != null) {
            q1(j1.f133496t, classSource.getAbsolutePath());
        }
    }

    @Deprecated
    public static String q0() {
        return org.apache.tools.ant.util.s0.f();
    }

    private void q1(String str, String str2) {
        p2.u(this).R(str, str2, false);
    }

    public static Project s0(Object obj) {
        if (obj instanceof b2) {
            return ((b2) obj).b();
        }
        try {
            Method method = obj.getClass().getMethod("getProject", new Class[0]);
            if (Project.class.equals(method.getReturnType())) {
                return (Project) method.invoke(obj, new Object[0]);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean t1(String str) {
        return "on".equalsIgnoreCase(str) || "true".equalsIgnoreCase(str) || "yes".equalsIgnoreCase(str);
    }

    @Deprecated
    public static String x1(String str) {
        return org.apache.tools.ant.util.j0.s0(str);
    }

    private void y1(String str, Hashtable<String, t2> hashtable, Hashtable<String, String> hashtable2, Stack<String> stack, Vector<t2> vector) throws BuildException {
        hashtable2.put(str, f133046z);
        stack.push(str);
        t2 t2Var = hashtable.get(str);
        if (t2Var == null) {
            StringBuilder sb2 = new StringBuilder("Target \"");
            sb2.append(str);
            sb2.append("\" does not exist in the project \"");
            sb2.append(this.f133047b);
            sb2.append("\". ");
            stack.pop();
            if (!stack.empty()) {
                String strPeek = stack.peek();
                sb2.append("It is used from target \"");
                sb2.append(strPeek);
                sb2.append("\".");
            }
            throw new BuildException(new String(sb2));
        }
        for (String str2 : Collections.list(t2Var.g())) {
            String str3 = hashtable2.get(str2);
            if (str3 == null) {
                y1(str2, hashtable, hashtable2, stack, vector);
            } else if (str3 == f133046z) {
                throw S0(str2, stack);
            }
        }
        String strPop = stack.pop();
        if (str == strPop) {
            hashtable2.put(str, A);
            vector.addElement(t2Var);
            return;
        }
        throw new BuildException("Unexpected internal error: expected to pop " + str + " but got " + strPop);
    }

    public Object A(String str) throws BuildException {
        return u.y(this).n(str);
    }

    public u2 A0(Thread thread) {
        u2 u2Var;
        synchronized (this.f133061p) {
            u2Var = this.f133061p.get(thread);
            if (u2Var == null) {
                for (ThreadGroup threadGroup = thread.getThreadGroup(); u2Var == null && threadGroup != null; threadGroup = threadGroup.getParent()) {
                    u2Var = this.f133062q.get(threadGroup);
                }
            }
        }
        return u2Var;
    }

    public Project B() {
        Project project;
        try {
            project = (Project) getClass().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            project = new Project();
        }
        H0(project);
        return project;
    }

    public Hashtable<String, Object> B0() {
        return p2.u(this).x();
    }

    public u2 C(String str) throws BuildException {
        return u.y(this).p(str);
    }

    public String C0(String str) {
        return (String) p2.u(this).y(str);
    }

    public int D(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f133064s == null) {
            throw new EOFException("No input provided for project");
        }
        System.out.flush();
        return this.f133064s.read(bArr, i10, i11);
    }

    public boolean D0(String str) {
        boolean zContainsKey;
        synchronized (this.f133049d) {
            zContainsKey = this.f133050e.containsKey(str);
        }
        return zContainsKey;
    }

    public void E(String str, boolean z10) {
        u2 u2VarA0 = A0(Thread.currentThread());
        if (u2VarA0 == null) {
            M(this, str, z10 ? 0 : 2);
        } else if (z10) {
            u2VarA0.O1(str);
        } else {
            u2VarA0.R1(str);
        }
    }

    public void E0(Project project) {
    }

    public int F(byte[] bArr, int i10, int i11) throws IOException {
        u2 u2VarA0 = A0(Thread.currentThread());
        return u2VarA0 == null ? D(bArr, i10, i11) : u2VarA0.S1(bArr, i10, i11);
    }

    public void F0() throws BuildException {
        G0();
        u.y(this).M();
    }

    public void G(String str, boolean z10) {
        u2 u2VarA0 = A0(Thread.currentThread());
        if (u2VarA0 == null) {
            M0(str, z10 ? 1 : 2);
        } else if (z10) {
            u2VarA0.Q1(str);
        } else {
            u2VarA0.U1(str);
        }
    }

    public void G0() throws BuildException {
        k1();
        r1();
        q1(j1.f133478b, v1.p());
        Y0();
    }

    public void H(Vector<t2> vector) throws BuildException {
        HashSet hashSet = new HashSet();
        BuildException buildException = null;
        for (t2 t2Var : vector) {
            boolean z10 = true;
            for (String str : Collections.list(t2Var.g())) {
                if (!hashSet.contains(str)) {
                    O0(t2Var, "Cannot execute '" + t2Var.k() + "' - '" + str + "' failed or was not executed.", 0);
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                try {
                    t2Var.r();
                    hashSet.add(t2Var.k());
                    e = null;
                } catch (RuntimeException e10) {
                    e = e10;
                    if (!this.f133065t) {
                        throw e;
                    }
                } catch (Throwable th2) {
                    e = th2;
                    if (!this.f133065t) {
                        throw new BuildException(e);
                    }
                }
                if (e != null) {
                    if (e instanceof BuildException) {
                        O0(t2Var, "Target '" + t2Var.k() + "' failed with message '" + e.getMessage() + "'.", 0);
                        if (buildException == null) {
                            buildException = (BuildException) e;
                        }
                    } else {
                        O0(t2Var, "Target '" + t2Var.k() + "' failed with message '" + e.getMessage() + "'.", 0);
                        e.printStackTrace(System.err);
                        if (buildException == null) {
                            buildException = new BuildException(e);
                        }
                    }
                }
            }
        }
        if (buildException != null) {
            throw buildException;
        }
    }

    public void H0(Project project) {
        u.y(project).N(u.y(this));
        project.d1(h0());
        project.l1(I0());
        project.g1(l0().b());
    }

    public void I(String str) throws BuildException {
        if (str == null) {
            throw new BuildException("No target specified");
        }
        H(v1(str, this.f133053h, false));
    }

    public boolean I0() {
        return this.f133065t;
    }

    public void J(Vector<String> vector) throws BuildException {
        s1(j1.H, com.max.xiaoheihe.module.bbs.post_edit.o.a(Constants.ACCEPT_TIME_SEPARATOR_SP, vector));
        l0().a(this, (String[]) vector.toArray(new String[vector.size()]));
    }

    public void K(Throwable th2) {
        BuildEvent buildEvent = new BuildEvent(this);
        buildEvent.g(th2);
        for (k kVar : this.f133058m) {
            kVar.R0(buildEvent);
        }
        i1.e();
    }

    public void L() {
        BuildEvent buildEvent = new BuildEvent(this);
        for (k kVar : this.f133058m) {
            kVar.i0(buildEvent);
        }
    }

    public void L0(String str) {
        M0(str, 2);
    }

    protected void M(Project project, String str, int i10) {
        N(project, str, null, i10);
    }

    public void M0(String str, int i10) {
        N0(str, null, i10);
    }

    protected void N(Project project, String str, Throwable th2, int i10) {
        BuildEvent buildEvent = new BuildEvent(project);
        buildEvent.g(th2);
        S(buildEvent, str, i10);
    }

    public void N0(String str, Throwable th2, int i10) {
        N(this, str, th2, i10);
    }

    protected void O(t2 t2Var, String str, int i10) {
        P(t2Var, str, null, i10);
    }

    public void O0(t2 t2Var, String str, int i10) {
        P0(t2Var, str, null, i10);
    }

    protected void P(t2 t2Var, String str, Throwable th2, int i10) {
        BuildEvent buildEvent = new BuildEvent(t2Var);
        buildEvent.g(th2);
        S(buildEvent, str, i10);
    }

    public void P0(t2 t2Var, String str, Throwable th2, int i10) {
        P(t2Var, str, th2, i10);
    }

    protected void Q(u2 u2Var, String str, int i10) {
        R(u2Var, str, null, i10);
    }

    public void Q0(u2 u2Var, String str, int i10) {
        R(u2Var, str, null, i10);
    }

    protected void R(u2 u2Var, String str, Throwable th2, int i10) {
        BuildEvent buildEvent = new BuildEvent(u2Var);
        buildEvent.g(th2);
        S(buildEvent, str, i10);
    }

    public void R0(u2 u2Var, String str, Throwable th2, int i10) {
        R(u2Var, str, th2, i10);
    }

    public void T(Throwable th2) {
        BuildEvent buildEvent = new BuildEvent(this);
        buildEvent.g(th2);
        for (k kVar : this.f133058m) {
            if (kVar instanceof q2) {
                ((q2) kVar).W0(buildEvent);
            }
        }
    }

    public void T0(Thread thread, u2 u2Var) {
        synchronized (this.f133061p) {
            try {
                if (u2Var != null) {
                    this.f133061p.put(thread, u2Var);
                    this.f133062q.put(thread.getThreadGroup(), u2Var);
                } else {
                    this.f133061p.remove(thread);
                    this.f133062q.remove(thread.getThreadGroup());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void U() {
        BuildEvent buildEvent = new BuildEvent(this);
        for (k kVar : this.f133058m) {
            if (kVar instanceof q2) {
                ((q2) kVar).E0(buildEvent);
            }
        }
    }

    public void U0(k kVar) {
        synchronized (this.f133057l) {
            for (int i10 = 0; i10 < this.f133058m.length; i10++) {
                if (this.f133058m[i10] == kVar) {
                    k[] kVarArr = new k[this.f133058m.length - 1];
                    System.arraycopy(this.f133058m, 0, kVarArr, 0, i10);
                    System.arraycopy(this.f133058m, i10 + 1, kVarArr, i10, (this.f133058m.length - i10) - 1);
                    this.f133058m = kVarArr;
                    break;
                }
            }
        }
    }

    protected void V(t2 t2Var, Throwable th2) {
        BuildEvent buildEvent = new BuildEvent(t2Var);
        buildEvent.g(th2);
        for (k kVar : this.f133058m) {
            kVar.B0(buildEvent);
        }
    }

    public String V0(String str) throws BuildException {
        return p2.u(this).I(null, str, null);
    }

    protected void W(t2 t2Var) {
        BuildEvent buildEvent = new BuildEvent(t2Var);
        for (k kVar : this.f133058m) {
            kVar.r1(buildEvent);
        }
    }

    public File W0(String str) {
        return I.n0(this.f133056k, str);
    }

    protected void X(u2 u2Var, Throwable th2) {
        T0(Thread.currentThread(), null);
        System.out.flush();
        System.err.flush();
        BuildEvent buildEvent = new BuildEvent(u2Var);
        buildEvent.g(th2);
        for (k kVar : this.f133058m) {
            kVar.s0(buildEvent);
        }
    }

    @Deprecated
    public File X0(String str, File file) {
        return I.n0(file, str);
    }

    protected void Y(u2 u2Var) {
        T0(Thread.currentThread(), u2Var);
        BuildEvent buildEvent = new BuildEvent(u2Var);
        for (k kVar : this.f133058m) {
            kVar.h0(buildEvent);
        }
    }

    public File Z() {
        if (this.f133056k == null) {
            try {
                a1(".");
            } catch (BuildException e10) {
                e10.printStackTrace();
            }
        }
        return this.f133056k;
    }

    public void Z0(File file) throws BuildException {
        File fileI0 = I.i0(file.getAbsolutePath());
        if (!fileI0.exists()) {
            throw new BuildException("Basedir " + fileI0.getAbsolutePath() + " does not exist");
        }
        if (!fileI0.isDirectory()) {
            throw new BuildException("Basedir " + fileI0.getAbsolutePath() + " is not a directory");
        }
        this.f133056k = fileI0;
        q1(j1.f133489m, fileI0.getPath());
        M0("Project base dir set to: " + this.f133056k, 3);
    }

    public Vector<k> a0() {
        Vector<k> vector;
        synchronized (this.f133057l) {
            vector = new Vector<>(this.f133058m.length);
            Collections.addAll(vector, this.f133058m);
        }
        return vector;
    }

    public void a1(String str) throws BuildException {
        Z0(new File(str));
    }

    public Map<String, Class<?>> b0() {
        return new HashMap(g0());
    }

    public void b1(ClassLoader classLoader) {
        this.f133060o = classLoader;
    }

    public void c(k kVar) {
        synchronized (this.f133057l) {
            for (k kVar2 : this.f133058m) {
                if (kVar2 == kVar) {
                    return;
                }
            }
            k[] kVarArr = new k[this.f133058m.length + 1];
            System.arraycopy(this.f133058m, 0, kVarArr, 0, this.f133058m.length);
            kVarArr[this.f133058m.length] = kVar;
            this.f133058m = kVarArr;
        }
    }

    public Map<String, Object> c0() {
        HashMap map;
        synchronized (this.f133049d) {
            map = new HashMap(this.f133050e);
        }
        return map;
    }

    public void c1(String str) {
        if (str != null) {
            s1(j1.G, str);
        }
        this.f133052g = str;
    }

    public void d(String str, Class<?> cls) {
        u.y(this).g(str, cls);
    }

    public Map<String, t2> d0() {
        return new HashMap(this.f133053h);
    }

    public void d1(InputStream inputStream) {
        this.f133064s = inputStream;
    }

    @Deprecated
    public void e(String str, String str2) {
        if (str == null) {
            return;
        }
        this.f133054i.k2(new org.apache.tools.ant.types.f0.a(str, str2));
    }

    public Map<String, Class<?>> e0() {
        return new HashMap(z0());
    }

    @Deprecated
    public void e1(String str) {
        c1(str);
    }

    public void f(String str, Object obj) {
        this.f133051f.put(str, obj);
    }

    public ClassLoader f0() {
        return this.f133060o;
    }

    public void f1(String str) {
        this.f133048c = str;
    }

    public void g(String str, t2 t2Var) {
        M0(" +Target: " + str, 4);
        t2Var.A(this);
        this.f133053h.put(str, t2Var);
    }

    public Hashtable<String, Class<?>> g0() {
        return u.y(this).A();
    }

    public void g1(f1 f1Var) {
        i(j1.f133487k, f1Var);
    }

    public void h(t2 t2Var) {
        g(t2Var.k(), t2Var);
    }

    public InputStream h0() {
        return this.f133064s;
    }

    @Deprecated
    public void h1(File file, long j10) throws BuildException {
        I.p0(file, j10);
        M0("Setting modification time for " + file, 3);
    }

    public void i(String str, Object obj) {
        synchronized (this.f133049d) {
            Object objB = ((AntRefTable) this.f133050e).b(str);
            if (objB == obj) {
                return;
            }
            if (objB != null && !(objB instanceof z2)) {
                M0("Overriding previous definition of reference to " + str, 3);
            }
            M0("Adding reference: " + str, 4);
            this.f133050e.put(str, obj);
        }
    }

    public String i0() {
        return this.f133052g;
    }

    public void i1(String str, String str2) {
        p2.u(this).J(str, str2);
    }

    public void j(String str, t2 t2Var) throws BuildException {
        if (this.f133053h.get(str) == null) {
            g(str, t2Var);
            return;
        }
        throw new BuildException("Duplicate target: `" + str + "'");
    }

    public String j0() {
        if (this.f133048c == null) {
            this.f133048c = org.apache.tools.ant.types.u.i2(this);
        }
        return this.f133048c;
    }

    public void j1(org.apache.tools.ant.input.c cVar) {
        this.f133063r = cVar;
    }

    public void k(t2 t2Var) throws BuildException {
        j(t2Var.k(), t2Var);
    }

    public String k0(Object obj) {
        return u.y(this).D(obj);
    }

    public void k1() throws BuildException {
        String strF = org.apache.tools.ant.util.s0.f();
        q1(j1.f133494r, strF);
        if (!org.apache.tools.ant.util.s0.n(org.apache.tools.ant.util.s0.f136934y)) {
            throw new BuildException("Ant cannot work on Java prior to 1.8");
        }
        M0("Detected Java version: " + strF + " in: " + System.getProperty("java.home"), 3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Detected OS: ");
        sb2.append(System.getProperty("os.name"));
        M0(sb2.toString(), 3);
    }

    public void l(String str, Class<?> cls) throws BuildException {
        u.y(this).i(str, cls);
    }

    public f1 l0() {
        Object objW0 = w0(j1.f133487k);
        if (objW0 == null) {
            String strU0 = u0(j1.f133488l);
            if (strU0 == null) {
                strU0 = org.apache.tools.ant.helper.c.class.getName();
            }
            M0("Attempting to create object of type " + strU0, 4);
            try {
                try {
                    objW0 = Class.forName(strU0, true, this.f133060o).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    M0(e10.toString(), 0);
                }
            } catch (ClassNotFoundException unused) {
                objW0 = Class.forName(strU0).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e11) {
                M0(e11.toString(), 0);
            }
            if (objW0 == null) {
                throw new BuildException("Unable to obtain a Target Executor instance.");
            }
            g1((f1) objW0);
        }
        return (f1) objW0;
    }

    public void l1(boolean z10) {
        this.f133065t = z10;
    }

    public void m(Class<?> cls) throws BuildException {
        u.y(this).k(cls);
        if (!Modifier.isPublic(cls.getModifiers())) {
            String str = cls + " is not public";
            M0(str, 0);
            throw new BuildException(str);
        }
        if (Modifier.isAbstract(cls.getModifiers())) {
            String str2 = cls + " is abstract";
            M0(str2, 0);
            throw new BuildException(str2);
        }
        try {
            cls.getConstructor(new Class[0]);
            if (u2.class.isAssignableFrom(cls)) {
                return;
            }
            v2.i2(cls, this);
        } catch (LinkageError e10) {
            String str3 = "Could not load " + cls + ": " + e10;
            M0(str3, 0);
            throw new BuildException(str3, e10);
        } catch (NoSuchMethodException unused) {
            String str4 = "No public no-arg constructor in " + cls;
            M0(str4, 0);
            throw new BuildException(str4);
        }
    }

    @Deprecated
    public Hashtable<String, String> m0() {
        return this.f133054i.o2();
    }

    public void m1(String str) {
        s1(j1.F, str);
        this.f133047b = str;
    }

    @Deprecated
    public void n(File file, File file2) throws IOException {
        I.l(file, file2);
    }

    public org.apache.tools.ant.types.f0 n0() {
        return this.f133054i;
    }

    public void n1(String str, String str2) {
        p2.u(this).L(str, str2);
    }

    @Override // org.apache.tools.ant.types.v1
    public org.apache.tools.ant.types.s1 o(String str) {
        return new org.apache.tools.ant.types.resources.z(Z(), str);
    }

    public Hashtable<String, Object> o0() {
        return p2.u(this).l();
    }

    public final void o1(Object obj) {
        if (obj instanceof b2) {
            ((b2) obj).J(this);
            return;
        }
        try {
            Method method = obj.getClass().getMethod("setProject", Project.class);
            if (method != null) {
                method.invoke(obj, this);
            }
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public void p(File file, File file2, boolean z10) throws IOException {
        I.m(file, file2, z10 ? this.f133055j : null);
    }

    public org.apache.tools.ant.input.c p0() {
        return this.f133063r;
    }

    public void p1(String str, String str2) {
        p2.u(this).R(str, str2, true);
    }

    @Deprecated
    public void q(File file, File file2, boolean z10, boolean z11) throws IOException {
        I.r(file, file2, z10 ? this.f133055j : null, z11);
    }

    @Deprecated
    public void r(File file, File file2, boolean z10, boolean z11, boolean z12) throws IOException {
        I.s(file, file2, z10 ? this.f133055j : null, z11, z12);
    }

    public String r0() {
        return this.f133047b;
    }

    public void r1() {
        Properties properties = System.getProperties();
        for (String str : properties.stringPropertyNames()) {
            String property = properties.getProperty(str);
            if (property != null) {
                q1(str, property);
            }
        }
    }

    @Deprecated
    public void s(String str, String str2) throws IOException {
        I.u(str, str2);
    }

    public void s1(String str, String str2) {
        p2.u(this).U(str, str2);
    }

    @Deprecated
    public void t(String str, String str2, boolean z10) throws IOException {
        I.v(str, str2, z10 ? this.f133055j : null);
    }

    public Hashtable<String, Object> t0() {
        return p2.u(this).r();
    }

    @Deprecated
    public void u(String str, String str2, boolean z10, boolean z11) throws IOException {
        I.y(str, str2, z10 ? this.f133055j : null, z11);
    }

    public String u0(String str) {
        Object property = p2.u(this).getProperty(str);
        if (property == null) {
            return null;
        }
        return String.valueOf(property);
    }

    public final Vector<t2> u1(String str, Hashtable<String, t2> hashtable) throws BuildException {
        return w1(new String[]{str}, hashtable, true);
    }

    @Deprecated
    public void v(String str, String str2, boolean z10, boolean z11, boolean z12) throws IOException {
        I.z(str, str2, z10 ? this.f133055j : null, z11, z12);
    }

    public Set<String> v0() {
        return p2.u(this).w();
    }

    public final Vector<t2> v1(String str, Hashtable<String, t2> hashtable, boolean z10) throws BuildException {
        return w1(new String[]{str}, hashtable, z10);
    }

    public void w(Project project) {
        p2.u(this).f(project);
    }

    public <T> T w0(String str) {
        synchronized (this.f133049d) {
            T t10 = (T) this.f133050e.get(str);
            if (t10 != null) {
                return t10;
            }
            if (str.equals(j1.f133502z)) {
                return null;
            }
            try {
                if (!p2.u(this).e(str)) {
                    return null;
                }
                M0("Unresolvable reference " + str + " might be a misuse of property expansion syntax.", 1);
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final Vector<t2> w1(String[] strArr, Hashtable<String, t2> hashtable, boolean z10) throws BuildException {
        VectorSet vectorSet = new VectorSet();
        Hashtable<String, String> hashtable2 = new Hashtable<>();
        Stack<String> stack = new Stack<>();
        for (String str : strArr) {
            String str2 = hashtable2.get(str);
            if (str2 == null) {
                y1(str, hashtable, hashtable2, stack, vectorSet);
            } else if (str2 == f133046z) {
                throw new BuildException("Unexpected node in visiting state: " + str);
            }
        }
        M0("Build sequence for target(s)" + ((String) Arrays.stream(strArr).map(new Function() { // from class: org.apache.tools.ant.z1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Project.K0((String) obj);
            }
        }).collect(Collectors.joining(Constants.ACCEPT_TIME_SEPARATOR_SP))) + " is " + vectorSet, 3);
        Vector<t2> vector = z10 ? vectorSet : new Vector<>(vectorSet);
        for (String str3 : hashtable.keySet()) {
            String str4 = hashtable2.get(str3);
            if (str4 == null) {
                y1(str3, hashtable, hashtable2, stack, vector);
            } else if (str4 == f133046z) {
                throw new BuildException("Unexpected node in visiting state: " + str3);
            }
        }
        M0("Complete build sequence is " + vector, 3);
        return vectorSet;
    }

    public void x(Project project) {
        p2.u(this).g(project);
    }

    public Hashtable<String, Object> x0() {
        return this.f133050e;
    }

    public g y(ClassLoader classLoader, org.apache.tools.ant.types.o0 o0Var) {
        return g.f0(classLoader, this, o0Var, true);
    }

    public Hashtable<String, t2> y0() {
        return this.f133053h;
    }

    public g z(org.apache.tools.ant.types.o0 o0Var) {
        return g.f0(getClass().getClassLoader(), this, o0Var, true);
    }

    public Hashtable<String, Class<?>> z0() {
        return u.y(this).K();
    }
}
