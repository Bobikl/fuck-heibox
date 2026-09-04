package org.apache.tools.ant;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.tools.ant.launch.Launcher;
import org.apache.tools.ant.taskdefs.b5;
import org.apache.tools.ant.taskdefs.k7;

/* JADX INFO: compiled from: ComponentHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public class u {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f136683l = "Can't load default task list";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f136684m = "Can't load default type list";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f136685n = "ant.ComponentHelper";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f136686o = "only";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f136687p = "property";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static Properties[] f136688q = new Properties[2];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<h>> f136689a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Hashtable<String, h> f136690b = new Hashtable<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Hashtable<String, Class<?>> f136691c = new Hashtable<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f136692d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Hashtable<String, Class<?>> f136693e = new Hashtable<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f136694f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashSet<String> f136695g = new HashSet<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Stack<String> f136696h = new Stack<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f136697i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u f136698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Project f136699k;

    protected u() {
    }

    private static synchronized Properties B(boolean z10) throws BuildException {
        char c10;
        c10 = z10 ? (char) 1 : (char) 0;
        if (f136688q[c10] == null) {
            String str = z10 ? j1.f133486j : j1.f133485i;
            String str2 = z10 ? f136684m : f136683l;
            try {
                InputStream resourceAsStream = u.class.getResourceAsStream(str);
                try {
                    if (resourceAsStream == null) {
                        throw new BuildException(str2);
                    }
                    Properties properties = new Properties();
                    properties.load(resourceAsStream);
                    f136688q[c10] = properties;
                    resourceAsStream.close();
                } catch (Throwable th2) {
                    if (resourceAsStream != null) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                throw new BuildException(str2, e10);
            }
        }
        return f136688q[c10];
    }

    public static String F(Project project, Object obj, boolean z10) {
        if (project == null) {
            project = Project.s0(obj);
        }
        return project == null ? L(obj.getClass(), z10) : y(project).E(obj, z10);
    }

    private Map<String, List<h>> I() {
        ArrayList arrayList;
        HashMap map = new HashMap();
        synchronized (this.f136689a) {
            for (Map.Entry<String, List<h>> entry : this.f136689a.entrySet()) {
                List<h> value = entry.getValue();
                synchronized (value) {
                    arrayList = new ArrayList(value);
                }
                map.put(entry.getKey(), arrayList);
            }
        }
        return map;
    }

    private static String L(Class<?> cls, boolean z10) {
        if (!z10) {
            return cls.toString();
        }
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    private void O() {
        ClassLoader classLoaderW = w(null);
        Properties propertiesB = B(false);
        for (String str : propertiesB.stringPropertyNames()) {
            h hVar = new h();
            hVar.t(str);
            hVar.s(propertiesB.getProperty(str));
            hVar.r(classLoaderW);
            hVar.o(u2.class);
            hVar.p(v2.class);
            this.f136690b.put(str, hVar);
        }
    }

    private void P() {
        ClassLoader classLoaderW = w(null);
        Properties propertiesB = B(true);
        for (String str : propertiesB.stringPropertyNames()) {
            h hVar = new h();
            hVar.t(str);
            hVar.s(propertiesB.getProperty(str));
            hVar.r(classLoaderW);
            this.f136690b.put(str, hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean Q(String str, h hVar) {
        return hVar.h().startsWith(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean R(Map.Entry entry) {
        return (((h) entry.getValue()).g(this.f136699k) == null || u2.class.isAssignableFrom(((h) entry.getValue()).g(this.f136699k))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(Map.Entry entry) {
        this.f136693e.put((String) entry.getKey(), ((h) entry.getValue()).i(this.f136699k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean T(Map.Entry entry) {
        return ((h) entry.getValue()).g(this.f136699k) != null && u2.class.isAssignableFrom(((h) entry.getValue()).g(this.f136699k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(Map.Entry entry) {
        this.f136691c.put((String) entry.getKey(), ((h) entry.getValue()).i(this.f136699k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List V(String str) {
        return new ArrayList();
    }

    private void W(PrintWriter printWriter, String str, boolean z10, String str2) {
        printWriter.println("Cause: the class " + str + " was not found.");
        if (z10) {
            printWriter.println("        This looks like one of Ant's optional components.");
            printWriter.println("Action: Check that the appropriate optional JAR exists in");
            printWriter.println(str2);
        } else {
            printWriter.println("Action: Check that the component has been correctly declared");
            printWriter.println("        and that the implementing JAR is in one of:");
            printWriter.println(str2);
        }
    }

    private void X(PrintWriter printWriter, boolean z10, NoClassDefFoundError noClassDefFoundError, String str) {
        printWriter.println("Cause: Could not load a dependent class " + noClassDefFoundError.getMessage());
        if (z10) {
            printWriter.println("       It is not enough to have Ant's optional JARs");
            printWriter.println("       you need the JAR files that the optional tasks depend upon.");
            printWriter.println("       Ant's optional task dependencies are listed in the manual.");
        } else {
            printWriter.println("       This class may be in a separate JAR that is not installed.");
        }
        printWriter.println("Action: Determine what extra JAR files are needed, and place them in one of:");
        printWriter.println(str);
    }

    private void Y(PrintWriter printWriter, String str, String str2) {
        boolean zStartsWith = str.startsWith("antlib:");
        String strK = e2.k(str);
        printWriter.println("Cause: The name is undefined.");
        printWriter.println("Action: Check the spelling.");
        printWriter.println("Action: Check that any custom tasks/types have been declared.");
        printWriter.println("Action: Check that any <presetdef>/<macrodef> declarations have taken place.");
        if (strK.isEmpty()) {
            return;
        }
        List<h> listT = t(strK);
        if (listT.isEmpty()) {
            printWriter.println("No types or tasks have been defined in this namespace yet");
            if (zStartsWith) {
                printWriter.println();
                printWriter.println("This appears to be an antlib declaration. ");
                printWriter.println("Action: Check that the implementing library exists in one of:");
                printWriter.println(str2);
                return;
            }
            return;
        }
        printWriter.println();
        printWriter.println("The definitions in the namespace " + strK + " are:");
        Iterator<h> it = listT.iterator();
        while (it.hasNext()) {
            printWriter.println("    " + e2.j(it.next().h()));
        }
    }

    private boolean Z(h hVar, h hVar2) {
        boolean zE0 = e0(hVar);
        return (zE0 == e0(hVar2)) && (!zE0 || hVar.n(hVar2, this.f136699k));
    }

    private void c0(h hVar) {
        String strH = hVar.h();
        synchronized (this.f136690b) {
            this.f136692d = true;
            this.f136694f = true;
            h hVar2 = this.f136690b.get(strH);
            if (hVar2 != null) {
                if (Z(hVar, hVar2)) {
                    return;
                }
                Class<?> clsG = hVar2.g(this.f136699k);
                boolean z10 = clsG != null && u2.class.isAssignableFrom(clsG);
                Project project = this.f136699k;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Trying to override old definition of ");
                sb2.append(z10 ? "task " : "datatype ");
                sb2.append(strH);
                project.M0(sb2.toString(), hVar.v(hVar2, this.f136699k) ? 3 : 1);
            }
            this.f136699k.M0(" +Datatype " + strH + " " + hVar.f(), 4);
            this.f136690b.put(strH, hVar);
        }
    }

    private void d0(h hVar) {
        List list;
        String strH = hVar.h();
        synchronized (this.f136689a) {
            list = (List) this.f136689a.computeIfAbsent(strH, new Function() { // from class: org.apache.tools.ant.p
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return u.V((String) obj);
                }
            });
        }
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f().equals(hVar.f())) {
                    it.remove();
                    break;
                }
            }
            list.add(hVar);
        }
    }

    private boolean e0(h hVar) {
        return (hVar.i(this.f136699k) == null || hVar.g(this.f136699k) == null) ? false : true;
    }

    private synchronized void j(String str) {
        String strK = e2.k(str);
        if (strK.isEmpty()) {
            strK = e2.f133119c;
        }
        if (strK.startsWith("antlib:")) {
            if (this.f136695g.contains(strK)) {
                return;
            }
            this.f136695g.add(strK);
            if (this.f136690b.isEmpty()) {
                M();
            }
            k7 k7Var = new k7();
            k7Var.J(this.f136699k);
            k7Var.V1();
            k7Var.l2(strK);
            k7Var.g2(strK);
            k7Var.R2(org.apache.tools.ant.taskdefs.z0.F2(strK));
            k7Var.Q2(new org.apache.tools.ant.taskdefs.z0.b(org.apache.tools.ant.taskdefs.z0.b.f136024i));
            k7Var.D1();
        }
    }

    private u2 o(String str) throws BuildException {
        Object objL;
        Class<?> clsX = x(str);
        if (clsX == null || !u2.class.isAssignableFrom(clsX) || (objL = l(str)) == null) {
            return null;
        }
        if (!(objL instanceof u2)) {
            throw new BuildException("Expected a Task from '" + str + "' but got an instance of " + objL.getClass().getName() + " instead");
        }
        u2 u2Var = (u2) objL;
        u2Var.h2(str);
        u2Var.g2(str);
        this.f136699k.M0("   +Task: " + str, 4);
        return u2Var;
    }

    private List<h> t(final String str) {
        List<h> list;
        synchronized (this.f136690b) {
            list = (List) this.f136690b.values().stream().filter(new Predicate() { // from class: org.apache.tools.ant.o
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return u.Q(str, (h) obj);
                }
            }).collect(Collectors.toList());
        }
        return list;
    }

    private synchronized Set<String> v() {
        return (Set) this.f136695g.clone();
    }

    private ClassLoader w(ClassLoader classLoader) {
        return (this.f136699k.f0() == null || "only".equals(this.f136699k.u0(j1.f133479c))) ? classLoader : this.f136699k.f0();
    }

    public static u y(Project project) {
        if (project == null) {
            return null;
        }
        u uVar = (u) project.w0(f136685n);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u();
        uVar2.b0(project);
        project.i(f136685n, uVar2);
        return uVar2;
    }

    public Hashtable<String, Class<?>> A() {
        synchronized (this.f136693e) {
            synchronized (this.f136690b) {
                if (this.f136694f) {
                    this.f136693e.clear();
                    this.f136690b.entrySet().stream().filter(new Predicate() { // from class: org.apache.tools.ant.s
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return this.f133600a.R((Map.Entry) obj);
                        }
                    }).forEach(new Consumer() { // from class: org.apache.tools.ant.t
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            this.f133602b.S((Map.Entry) obj);
                        }
                    });
                    this.f136694f = false;
                }
            }
        }
        return this.f136693e;
    }

    public h C(String str) {
        j(str);
        return this.f136690b.get(str);
    }

    public String D(Object obj) {
        return E(obj, false);
    }

    public String E(Object obj, boolean z10) {
        Class<?> cls = obj.getClass();
        String name = cls.getName();
        synchronized (this.f136690b) {
            for (h hVar : this.f136690b.values()) {
                if (name.equals(hVar.f()) && cls == hVar.g(this.f136699k)) {
                    String strH = hVar.h();
                    if (!z10) {
                        strH = "The <" + strH + "> type";
                    }
                    return strH;
                }
            }
            return L(obj.getClass(), z10);
        }
    }

    public u G() {
        return this.f136698j;
    }

    public Project H() {
        return this.f136699k;
    }

    public List<h> J(String str) {
        List<h> list;
        synchronized (this.f136689a) {
            list = this.f136689a.get(str);
        }
        return list;
    }

    public Hashtable<String, Class<?>> K() {
        synchronized (this.f136691c) {
            synchronized (this.f136690b) {
                if (this.f136692d) {
                    this.f136691c.clear();
                    this.f136690b.entrySet().stream().filter(new Predicate() { // from class: org.apache.tools.ant.q
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return this.f133594a.T((Map.Entry) obj);
                        }
                    }).forEach(new Consumer() { // from class: org.apache.tools.ant.r
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            this.f133595b.U((Map.Entry) obj);
                        }
                    });
                    this.f136692d = false;
                }
            }
        }
        return this.f136691c;
    }

    public void M() {
        O();
        P();
        new v(this).c();
    }

    public void N(u uVar) {
        Hashtable hashtable = (Hashtable) uVar.f136690b.clone();
        synchronized (this.f136690b) {
            for (h hVar : hashtable.values()) {
                this.f136690b.put(hVar.h(), hVar);
            }
        }
        Set<String> setV = uVar.v();
        synchronized (this) {
            this.f136695g.addAll(setV);
        }
        Map<String, List<h>> mapI = uVar.I();
        synchronized (this.f136689a) {
            this.f136689a.putAll(mapI);
        }
    }

    public void a0(u uVar) {
        this.f136698j = uVar;
    }

    public void b0(Project project) {
        this.f136699k = project;
    }

    public void g(String str, Class<?> cls) {
        h hVar = new h();
        hVar.t(str);
        hVar.q(cls);
        c0(hVar);
        this.f136699k.M0(" +User datatype: " + str + "     " + cls.getName(), 4);
    }

    public void h(h hVar) {
        if (hVar.m()) {
            d0(hVar);
        } else {
            c0(hVar);
        }
    }

    public void i(String str, Class<?> cls) {
        k(cls);
        h hVar = new h();
        hVar.t(str);
        hVar.r(cls.getClassLoader());
        hVar.q(cls);
        hVar.p(v2.class);
        hVar.s(cls.getName());
        hVar.o(u2.class);
        c0(hVar);
    }

    public void k(Class<?> cls) throws BuildException {
        if (!Modifier.isPublic(cls.getModifiers())) {
            String str = cls + " is not public";
            this.f136699k.M0(str, 0);
            throw new BuildException(str);
        }
        if (Modifier.isAbstract(cls.getModifiers())) {
            String str2 = cls + " is abstract";
            this.f136699k.M0(str2, 0);
            throw new BuildException(str2);
        }
        try {
            cls.getConstructor(null);
            if (u2.class.isAssignableFrom(cls)) {
                return;
            }
            v2.i2(cls, this.f136699k);
        } catch (NoSuchMethodException unused) {
            String str3 = "No public no-arg constructor in " + cls;
            this.f136699k.M0(str3, 0);
            throw new BuildException(str3);
        }
    }

    public Object l(String str) {
        h hVarC = C(str);
        if (hVarC == null) {
            return null;
        }
        return hVarC.b(this.f136699k);
    }

    public Object m(z2 z2Var, String str, String str2) throws BuildException {
        Object objL = l(str2);
        if (objL instanceof u2) {
            u2 u2Var = (u2) objL;
            u2Var.A1(z2Var.w1());
            u2Var.h2(str2);
            u2Var.g2(z2Var.K1());
            u2Var.e2(z2Var.G1());
            u2Var.V1();
        }
        return objL;
    }

    public Object n(String str) throws BuildException {
        return l(str);
    }

    public u2 p(String str) throws BuildException {
        u2 u2VarO = o(str);
        if (u2VarO != null || !str.equals("property")) {
            return u2VarO;
        }
        i("property", b5.class);
        return o(str);
    }

    public String q(String str, String str2) {
        String absolutePath;
        boolean z10;
        boolean z11;
        boolean z12;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println("Problem: failed to create " + str2 + " " + str);
        File file = new File(System.getProperty("user.home"), Launcher.USER_LIBDIR);
        String property = System.getProperty(j1.f133495s);
        boolean z13 = false;
        boolean z14 = true;
        if (property != null) {
            absolutePath = new File(property, "lib").getAbsolutePath();
            z10 = false;
        } else {
            absolutePath = "ANT_HOME" + File.separatorChar + "lib";
            z10 = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("        -");
        sb2.append(absolutePath);
        sb2.append('\n');
        if (z10) {
            sb2.append("        -");
            sb2.append("the IDE Ant configuration dialogs");
        } else {
            sb2.append("        -");
            sb2.append(file);
            sb2.append('\n');
            sb2.append("        -");
            sb2.append("a directory added on the command line with the -lib argument");
        }
        String string = sb2.toString();
        h hVarC = C(str);
        if (hVarC == null) {
            Y(printWriter, str, string);
        } else {
            String strF = hVarC.f();
            boolean zStartsWith = strF.startsWith("org.apache.tools.ant.");
            boolean z15 = strF.startsWith("org.apache.tools.ant.types.optional") || strF.startsWith("org.apache.tools.ant.taskdefs.optional");
            Class<?> clsL = null;
            try {
                clsL = hVarC.l();
                z12 = false;
                z11 = false;
            } catch (ClassNotFoundException unused) {
                z11 = !z15;
                W(printWriter, strF, z15, string);
                z12 = true;
            } catch (NoClassDefFoundError e10) {
                X(printWriter, z15, e10, string);
                z11 = false;
                z12 = true;
            }
            if (clsL != null) {
                try {
                    hVarC.k(clsL, this.f136699k);
                    printWriter.println("The component could be instantiated.");
                } catch (IllegalAccessException unused2) {
                    printWriter.println("Cause: The constructor for " + strF + " is private and cannot be invoked.");
                    z13 = true;
                } catch (InstantiationException unused3) {
                    printWriter.println("Cause: The class " + strF + " is abstract and cannot be instantiated.");
                    z13 = true;
                } catch (NoClassDefFoundError e11) {
                    printWriter.println("Cause:  A class needed by class " + strF + " cannot be found: ");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("       ");
                    sb3.append(e11.getMessage());
                    printWriter.println(sb3.toString());
                    printWriter.println("Action: Determine what extra JAR files are needed, and place them in:");
                    printWriter.println(string);
                } catch (NoSuchMethodException unused4) {
                    printWriter.println("Cause: The class " + strF + " has no compatible constructor.");
                    z13 = true;
                } catch (InvocationTargetException e12) {
                    Throwable targetException = e12.getTargetException();
                    printWriter.println("Cause: The constructor threw the exception");
                    printWriter.println(targetException.toString());
                    targetException.printStackTrace(printWriter);
                    z13 = true;
                }
            }
            z14 = z12;
            printWriter.println();
            printWriter.println("Do not panic, this is a common problem.");
            if (z11) {
                printWriter.println("It may just be a typographical error in the build file or the task/type declaration.");
            }
            if (z14) {
                printWriter.println("The commonest cause is a missing JAR.");
            }
            if (z13) {
                printWriter.println("This is quite a low level problem, which may need consultation with the author of the task.");
                if (zStartsWith) {
                    printWriter.println("This may be the Ant team. Please file a defect or contact the developer team.");
                } else {
                    printWriter.println("This does not appear to be a task bundled with Ant.");
                    printWriter.println("Please take it up with the supplier of the third-party " + str2 + ".");
                    printWriter.println("If you have written it yourself, you probably have a bug to fix.");
                }
            } else {
                printWriter.println();
                printWriter.println("This is not a bug; it is a configuration problem");
            }
        }
        printWriter.flush();
        printWriter.close();
        return stringWriter.toString();
    }

    public void r(String str) {
        this.f136697i = str;
        this.f136696h.push(str);
    }

    public void s() {
        this.f136696h.pop();
        this.f136697i = this.f136696h.isEmpty() ? null : this.f136696h.peek();
    }

    public Hashtable<String, h> u() {
        return this.f136690b;
    }

    public Class<?> x(String str) {
        h hVarC = C(str);
        if (hVarC == null) {
            return null;
        }
        return hVarC.g(this.f136699k);
    }

    public String z() {
        return this.f136697i;
    }
}
