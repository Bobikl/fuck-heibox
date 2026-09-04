package org.apache.tools.ant;

import com.tencent.qcloud.core.util.IOUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.tools.ant.launch.AntMain;

/* JADX INFO: compiled from: Main.java */
/* JADX INFO: loaded from: classes5.dex */
public class v1 implements AntMain {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f137078v = "build.xml";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f137083b;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Set<String> f137077u = Collections.unmodifiableSet(new HashSet(Arrays.asList("-lib", "-cp", "-noclasspath", "--noclasspath", "-nouserlib", "-main")));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final org.apache.tools.ant.property.a f137079w = new org.apache.tools.ant.property.a() { // from class: org.apache.tools.ant.q1
        @Override // org.apache.tools.ant.property.a
        public final Object getProperty(String str) {
            return v1.I(str);
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static String f137080x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static String f137081y = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f137082a = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PrintStream f137084c = System.out;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PrintStream f137085d = System.err;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Vector<String> f137086e = new Vector<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Properties f137087f = new Properties();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Vector<String> f137088g = new Vector<>(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Vector<String> f137089h = new Vector<>(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f137090i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f137091j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f137092k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f137093l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f137094m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f137095n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f137096o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f137097p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f137098q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f137099r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f137100s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map<Class<?>, List<String>> f137101t = new HashMap();

    public v1() {
    }

    @Deprecated
    protected v1(String[] strArr) throws BuildException {
        R(strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean A(String str) {
        return this.f137087f.getProperty(str) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(Properties properties, String str) {
        this.f137087f.put(str, properties.getProperty(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List C(Class cls) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(Map map, String str, t2 t2Var) {
        t2 t2Var2 = (t2) map.get(t2Var.j());
        if (t2Var2 == null || t2Var2.k().length() > str.length()) {
            map.put(t2Var.j(), t2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t2 E(t2 t2Var) {
        return t2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t2 F(t2 t2Var, t2 t2Var2) {
        return t2Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(Project project, String str, Object obj) {
        project.s1(str, String.valueOf(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(Properties properties, String str) {
        this.f137087f.put(str, properties.getProperty(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object I(String str) {
        return null;
    }

    private void J() {
        for (String str : this.f137089h) {
            final Properties properties = new Properties();
            try {
                InputStream inputStreamNewInputStream = Files.newInputStream(Paths.get(str, new String[0]), new OpenOption[0]);
                try {
                    properties.load(inputStreamNewInputStream);
                    if (inputStreamNewInputStream != null) {
                        inputStreamNewInputStream.close();
                    }
                } catch (Throwable th2) {
                    if (inputStreamNewInputStream != null) {
                        try {
                            inputStreamNewInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                System.out.println("Could not load property file " + str + ": " + e10.getMessage());
            }
            properties.stringPropertyNames().stream().filter(new Predicate() { // from class: org.apache.tools.ant.m1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return this.f133557a.A((String) obj);
                }
            }).forEach(new Consumer() { // from class: org.apache.tools.ant.n1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f133558b.B(properties, (String) obj);
                }
            });
        }
    }

    public static void K(String[] strArr) {
        V(strArr, null, null);
    }

    private static void L(Project project) {
        if (project.j0() != null) {
            project.L0(project.j0());
        }
    }

    private static void M(Throwable th2) {
        String message = th2.getMessage();
        if (message != null) {
            System.err.println(message);
        }
    }

    private static void N(Project project, Vector<String> vector, Vector<String> vector2, Vector<Enumeration<String>> vector3, String str, int i10) {
        String strLineSeparator = System.lineSeparator();
        StringBuilder sb2 = new StringBuilder("    ");
        while (sb2.length() <= i10) {
            sb2.append((CharSequence) sb2);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(strLineSeparator);
        sb3.append(strLineSeparator);
        int size = vector.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb3.append(" ");
            sb3.append(vector.elementAt(i11));
            if (vector2 != null) {
                sb3.append(sb2.substring(0, (i10 - vector.elementAt(i11).length()) + 2));
                sb3.append(vector2.elementAt(i11));
            }
            sb3.append(strLineSeparator);
            if (!vector3.isEmpty() && vector3.elementAt(i11).hasMoreElements()) {
                sb3.append((String) org.apache.tools.ant.util.h2.a(vector3.elementAt(i11)).collect(Collectors.joining(", ", "   depends on: ", strLineSeparator)));
            }
        }
        project.M0(sb3.toString(), 1);
    }

    private static void O(Project project, boolean z10, boolean z11) {
        Map<String, t2> mapS = S(project.y0());
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        Vector vector4 = new Vector();
        Vector vector5 = new Vector();
        int length = 0;
        for (t2 t2Var : mapS.values()) {
            String strK = t2Var.k();
            if (!strK.isEmpty()) {
                String strH = t2Var.h();
                if (strH == null) {
                    int iO = o(vector4, strK);
                    vector4.insertElementAt(strK, iO);
                    if (z11) {
                        vector5.insertElementAt(t2Var.g(), iO);
                    }
                } else {
                    int iO2 = o(vector, strK);
                    vector.insertElementAt(strK, iO2);
                    vector2.insertElementAt(strH, iO2);
                    if (strK.length() > length) {
                        length = strK.length();
                    }
                    if (z11) {
                        vector3.insertElementAt(t2Var.g(), iO2);
                    }
                }
            }
        }
        N(project, vector, vector2, vector3, "Main targets:", length);
        if (vector.isEmpty() ? true : z10) {
            N(project, vector4, null, vector5, "Other targets:", 0);
        }
        String strI0 = project.i0();
        if (strI0 == null || strI0.isEmpty()) {
            return;
        }
        project.L0("Default target: " + strI0);
    }

    private static void P() {
        System.out.println("ant [options] [target [target2 [target3] ...]]");
        System.out.println("Options: ");
        System.out.println("  -help, -h              print this message and exit");
        System.out.println("  -projecthelp, -p       print project help information and exit");
        System.out.println("  -version               print the version information and exit");
        System.out.println("  -diagnostics           print information that might be helpful to");
        System.out.println("                         diagnose or report problems and exit");
        System.out.println("  -quiet, -q             be extra quiet");
        System.out.println("  -silent, -S            print nothing but task outputs and build failures");
        System.out.println("  -verbose, -v           be extra verbose");
        System.out.println("  -debug, -d             print debugging information");
        System.out.println("  -emacs, -e             produce logging information without adornments");
        System.out.println("  -lib <path>            specifies a path to search for jars and classes");
        System.out.println("  -logfile <file>        use given file for log");
        System.out.println("    -l     <file>                ''");
        System.out.println("  -logger <classname>    the class which is to perform logging");
        System.out.println("  -listener <classname>  add an instance of class as a project listener");
        System.out.println("  -noinput               do not allow interactive input");
        System.out.println("  -buildfile <file>      use given buildfile");
        System.out.println("    -file    <file>              ''");
        System.out.println("    -f       <file>              ''");
        System.out.println("  -D<property>=<value>   use value for given property");
        System.out.println("  -keep-going, -k        execute all targets that do not depend");
        System.out.println("                         on failed target(s)");
        System.out.println("  -propertyfile <name>   load all properties from file with -D");
        System.out.println("                         properties taking precedence");
        System.out.println("  -inputhandler <class>  the class which will handle input requests");
        System.out.println("  -find <file>           (s)earch for buildfile towards the root of");
        System.out.println("    -s  <file>           the filesystem and use it");
        System.out.println("  -nice  number          A niceness value for the main thread:");
        System.out.println("                         1 (lowest) to 10 (highest); 5 is the default");
        System.out.println("  -nouserlib             Run ant without using the jar files from");
        System.out.println("                         ${user.home}/.ant/lib");
        System.out.println("  -noclasspath           Run ant without using CLASSPATH");
        System.out.println("  -autoproxy             Java1.5+: use the OS proxy settings");
        System.out.println("  -main <class>          override Ant's normal entry point");
        Iterator<i> it = j.b().f().iterator();
        while (it.hasNext()) {
            it.next().b(System.out);
        }
    }

    private static void Q(int i10) throws BuildException {
        System.out.println(p());
    }

    private void R(String[] strArr) {
        boolean z10;
        boolean z11;
        j jVarB = j.b();
        String str = null;
        boolean z12 = false;
        PrintStream printStream = null;
        int iS = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        while (iS < strArr.length) {
            String str2 = strArr[iS];
            if (str2.equals("-help") || str2.equals("-h")) {
                z10 = z12;
                z14 = true;
            } else if (str2.equals("-version")) {
                z10 = z12;
                z13 = true;
            } else if (str2.equals("-diagnostics")) {
                z10 = z12;
                z15 = true;
            } else if (str2.equals("-quiet") || str2.equals("-q")) {
                z10 = z12;
                this.f137082a = 1;
            } else if (str2.equals(org.apache.tools.ant.taskdefs.optional.sos.d.f135367o2) || str2.equals("-v")) {
                z10 = z12;
                this.f137082a = 3;
            } else if (str2.equals("-debug") || str2.equals("-d")) {
                z10 = z12;
                this.f137082a = 4;
            } else if (str2.equals("-silent") || str2.equals("-S")) {
                z10 = z12;
                this.f137095n = true;
            } else {
                if (str2.equals("-noinput")) {
                    this.f137090i = z12;
                } else if (str2.equals("-logfile") || str2.equals("-l")) {
                    try {
                        iS++;
                        z10 = false;
                        printStream = new PrintStream(Files.newOutputStream(new File(strArr[iS]).toPath(), new OpenOption[0]));
                        this.f137098q = true;
                    } catch (IOException unused) {
                        throw new BuildException("Cannot write on the specified log file. Make sure the path exists and you have write permissions.");
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw new BuildException("You must specify a log file when using the -log argument");
                    }
                } else {
                    if (str2.equals("-buildfile") || str2.equals(org.apache.tools.ant.taskdefs.optional.sos.d.f135366n2) || str2.equals("-f")) {
                        iS = s(strArr, iS);
                    } else if (str2.equals("-listener")) {
                        iS = v(strArr, iS);
                    } else if (str2.startsWith(org.apache.tools.ant.taskdefs.optional.vss.g.f135460i3)) {
                        iS = t(strArr, iS);
                    } else if (str2.equals("-logger")) {
                        iS = w(strArr, iS);
                    } else if (str2.equals("-inputhandler")) {
                        iS = u(strArr, iS);
                    } else if (str2.equals("-emacs") || str2.equals("-e")) {
                        this.f137094m = true;
                    } else if (str2.equals("-projecthelp") || str2.equals("-p")) {
                        this.f137097p = true;
                    } else if (str2.equals("-find") || str2.equals("-s")) {
                        if (iS < strArr.length - 1) {
                            iS++;
                            str = strArr[iS];
                        }
                        z16 = true;
                    } else if (str2.startsWith("-propertyfile")) {
                        iS = y(strArr, iS);
                    } else if (str2.equals("-k") || str2.equals("-keep-going")) {
                        this.f137091j = true;
                    } else if (str2.equals("-nice")) {
                        iS = x(strArr, iS);
                    } else {
                        if (f137077u.contains(str2)) {
                            throw new BuildException("Ant's Main method is being handed an option " + str2 + " that is only for the launcher class.\nThis can be caused by a version mismatch between the ant script/.bat file and Ant itself.");
                        }
                        if (str2.equals("-autoproxy")) {
                            this.f137100s = true;
                        } else if (str2.startsWith(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                            Iterator<i> it = jVarB.f().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z11 = false;
                                    break;
                                }
                                i next = it.next();
                                int iE = next.e(strArr, iS);
                                if (iE != -1) {
                                    ((List) this.f137101t.computeIfAbsent(next.getClass(), new Function() { // from class: org.apache.tools.ant.p1
                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            return v1.C((Class) obj);
                                        }
                                    })).addAll(Arrays.asList(strArr).subList(iE, strArr.length));
                                    z11 = true;
                                    break;
                                }
                            }
                            if (!z11) {
                                System.err.println("Unknown argument: " + str2);
                                P();
                                throw new BuildException("");
                            }
                        } else {
                            this.f137086e.addElement(str2);
                        }
                    }
                    z10 = false;
                }
                z10 = z12;
            }
            iS++;
            z12 = z10;
        }
        int i10 = this.f137082a;
        if (i10 >= 3 || z13) {
            Q(i10);
        }
        if (z14 || z13 || z15) {
            if (z14) {
                P();
            }
            if (z15) {
                f0.d(System.out, this.f137082a);
                return;
            }
            return;
        }
        if (this.f137083b == null) {
            if (!z16) {
                Iterator<e2> itF = l2.g().f();
                do {
                    this.f137083b = new File(itF.next().p());
                    if (this.f137082a >= 3) {
                        System.out.println("Trying the default build file: " + this.f137083b);
                    }
                    if (this.f137083b.exists()) {
                        break;
                    }
                } while (itF.hasNext());
            } else {
                if (str == null) {
                    Iterator<e2> itF2 = l2.g().f();
                    do {
                        String strP = itF2.next().p();
                        if (this.f137082a >= 3) {
                            System.out.println("Searching the default build file: " + strP);
                        }
                        File fileN = n(System.getProperty("user.dir"), strP);
                        this.f137083b = fileN;
                        if (fileN != null) {
                            break;
                        }
                    } while (itF2.hasNext());
                } else {
                    this.f137083b = n(System.getProperty("user.dir"), str);
                }
                if (this.f137083b == null) {
                    throw new BuildException("Could not locate a build file!");
                }
            }
        }
        if (!this.f137083b.exists()) {
            System.out.println("Buildfile: " + this.f137083b + " does not exist!");
            throw new BuildException("Build failed");
        }
        if (this.f137083b.isDirectory()) {
            File file = new File(this.f137083b, f137078v);
            if (!file.isFile()) {
                System.out.println("What? Buildfile: " + this.f137083b + " is a dir!");
                throw new BuildException("Build failed");
            }
            this.f137083b = file;
        }
        this.f137083b = org.apache.tools.ant.util.j0.O().i0(this.f137083b.getAbsolutePath());
        J();
        if (this.f137082a >= 2) {
            System.out.println("Buildfile: " + this.f137083b);
        }
        if (printStream != null) {
            this.f137084c = printStream;
            this.f137085d = printStream;
            System.setOut(printStream);
            System.setErr(this.f137085d);
        }
        this.f137096o = true;
    }

    private static Map<String, t2> S(Map<String, t2> map) {
        final HashMap map2 = new HashMap();
        map.forEach(new BiConsumer() { // from class: org.apache.tools.ant.r1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                v1.D(map2, (String) obj, (t2) obj2);
            }
        });
        return (Map) map2.values().stream().collect(Collectors.toMap(new Function() { // from class: org.apache.tools.ant.s1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((t2) obj).k();
            }
        }, new Function() { // from class: org.apache.tools.ant.t1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return v1.E((t2) obj);
            }
        }, new BinaryOperator() { // from class: org.apache.tools.ant.u1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return v1.F((t2) obj, (t2) obj2);
            }
        }));
    }

    private void T(ClassLoader classLoader) throws BuildException {
        if (this.f137096o) {
            j jVarB = j.b();
            for (i iVar : jVarB.f()) {
                List<String> list = this.f137101t.get(iVar.getClass());
                if (list != null && iVar.c(list)) {
                    return;
                }
            }
            Project project = new Project();
            project.b1(classLoader);
            Throwable th2 = null;
            try {
                try {
                    j(project);
                    k(project);
                    PrintStream printStream = System.err;
                    PrintStream printStream2 = System.out;
                    InputStream inputStream = System.in;
                    SecurityManager securityManager = System.getSecurityManager();
                    try {
                        if (this.f137090i) {
                            project.d1(System.in);
                        }
                        System.setIn(new z(project));
                        System.setOut(new PrintStream(new b0(project, false)));
                        boolean z10 = true;
                        System.setErr(new PrintStream(new b0(project, true)));
                        if (!this.f137097p) {
                            project.L();
                        }
                        if (this.f137099r != null) {
                            try {
                                project.M0("Setting Ant's thread priority to " + this.f137099r, 3);
                                Thread.currentThread().setPriority(this.f137099r.intValue());
                            } catch (SecurityException unused) {
                                project.L0("A security manager refused to set the -nice value");
                            }
                        }
                        U(project);
                        project.l1(this.f137091j);
                        if (this.f137100s) {
                            new org.apache.tools.ant.util.h1(project).a();
                        }
                        for (i iVar2 : jVarB.f()) {
                            List<String> list2 = this.f137101t.get(iVar2.getClass());
                            if (list2 != null) {
                                iVar2.a(project, list2);
                            }
                        }
                        e2.i(project, this.f137083b);
                        for (i iVar3 : jVarB.f()) {
                            List<String> list3 = this.f137101t.get(iVar3.getClass());
                            if (list3 != null && iVar3.d(project, list3)) {
                                if (securityManager != null) {
                                    System.setSecurityManager(securityManager);
                                }
                                System.setOut(printStream2);
                                System.setErr(printStream);
                                System.setIn(inputStream);
                                if (this.f137097p) {
                                    return;
                                }
                                try {
                                    project.K(null);
                                    return;
                                } catch (Throwable th3) {
                                    System.err.println("Caught an exception while logging the end of the build.  Exception was:");
                                    th3.printStackTrace();
                                    throw new BuildException(th3);
                                }
                            }
                        }
                        if (!this.f137097p) {
                            if (this.f137086e.isEmpty() && project.i0() != null) {
                                this.f137086e.addElement(project.i0());
                            }
                            project.J(this.f137086e);
                            if (securityManager != null) {
                                System.setSecurityManager(securityManager);
                            }
                            System.setOut(printStream2);
                            System.setErr(printStream);
                            System.setIn(inputStream);
                            if (this.f137097p) {
                                return;
                            }
                            try {
                                project.K(null);
                                return;
                            } catch (Throwable th4) {
                                System.err.println("Caught an exception while logging the end of the build.  Exception was:");
                                th4.printStackTrace();
                                throw new BuildException(th4);
                            }
                        }
                        L(project);
                        int i10 = this.f137082a;
                        boolean z11 = i10 > 2;
                        if (i10 <= 3) {
                            z10 = false;
                        }
                        O(project, z11, z10);
                        if (securityManager != null) {
                            System.setSecurityManager(securityManager);
                        }
                        System.setOut(printStream2);
                        System.setErr(printStream);
                        System.setIn(inputStream);
                        if (this.f137097p) {
                            return;
                        }
                        try {
                            project.K(null);
                        } catch (Throwable th5) {
                            System.err.println("Caught an exception while logging the end of the build.  Exception was:");
                            th5.printStackTrace();
                            throw new BuildException(th5);
                        }
                    } catch (Throwable th6) {
                        if (securityManager != null) {
                            System.setSecurityManager(securityManager);
                        }
                        System.setOut(printStream2);
                        System.setErr(printStream);
                        System.setIn(inputStream);
                        throw th6;
                    }
                } catch (Throwable th7) {
                    if (!this.f137097p) {
                        try {
                            project.K(null);
                        } catch (Throwable th8) {
                            System.err.println("Caught an exception while logging the end of the build.  Exception was:");
                            th8.printStackTrace();
                            if (0 != 0) {
                                System.err.println("There has been an error prior to that:");
                                th2.printStackTrace();
                            }
                            throw new BuildException(th8);
                        }
                    } else if (0 != 0) {
                        project.M0(th2.toString(), 0);
                    }
                    throw th7;
                }
            } catch (Error | RuntimeException e10) {
                throw e10;
            }
        }
    }

    private void U(final Project project) {
        project.F0();
        p2 p2VarU = p2.u(project);
        HashMap map = new HashMap(this.f137087f);
        new org.apache.tools.ant.property.o(project, f137079w, p2VarU.k()).c(map, null, false);
        map.forEach(new BiConsumer() { // from class: org.apache.tools.ant.l1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                v1.G(project, (String) obj, obj2);
            }
        });
        project.s1(j1.f133490n, this.f137083b.getAbsolutePath());
        project.s1(j1.f133491o, "file");
        project.s1(j1.H, com.max.xiaoheihe.module.bbs.post_edit.o.a(Constants.ACCEPT_TIME_SEPARATOR_SP, this.f137086e));
    }

    public static void V(String[] strArr, Properties properties, ClassLoader classLoader) {
        new v1().W(strArr, properties, classLoader);
    }

    private void k(Project project) throws BuildException {
        org.apache.tools.ant.input.c aVar;
        String str = this.f137093l;
        if (str == null) {
            aVar = new org.apache.tools.ant.input.a();
        } else {
            aVar = (org.apache.tools.ant.input.c) org.apache.tools.ant.util.i.k(str, v1.class.getClassLoader(), org.apache.tools.ant.input.c.class);
            project.o1(aVar);
        }
        project.j1(aVar);
    }

    private l l() {
        l yVar;
        if (this.f137095n) {
            yVar = new org.apache.tools.ant.listener.h();
            this.f137082a = 1;
            this.f137094m = true;
        } else {
            String str = this.f137092k;
            if (str != null) {
                try {
                    yVar = (l) org.apache.tools.ant.util.i.k(str, v1.class.getClassLoader(), l.class);
                } catch (BuildException e10) {
                    System.err.println("The specified logger class " + this.f137092k + " could not be used because " + e10.getMessage());
                    throw e10;
                }
            } else {
                yVar = new y();
            }
        }
        yVar.w0(this.f137082a);
        yVar.S(this.f137084c);
        yVar.m1(this.f137085d);
        yVar.m(this.f137094m);
        return yVar;
    }

    private File n(String str, String str2) {
        if (this.f137082a >= 2) {
            System.out.println("Searching for " + str2 + " ...");
        }
        File file = new File(new File(str).getAbsolutePath());
        File file2 = new File(file, str2);
        while (!file2.exists()) {
            file = q(file);
            if (file == null) {
                return null;
            }
            file2 = new File(file, str2);
        }
        return file2;
    }

    private static int o(Vector<String> vector, String str) {
        int size = vector.size();
        int i10 = size;
        for (int i11 = 0; i11 < size && i10 == size; i11++) {
            if (str.compareTo(vector.elementAt(i11)) < 0) {
                i10 = i11;
            }
        }
        return i10;
    }

    public static synchronized String p() throws BuildException {
        if (f137080x == null) {
            try {
                Properties properties = new Properties();
                InputStream resourceAsStream = v1.class.getResourceAsStream("/org/apache/tools/ant/version.txt");
                properties.load(resourceAsStream);
                resourceAsStream.close();
                f137081y = properties.getProperty("VERSION");
                f137080x = "Apache Ant(TM) version " + f137081y + " compiled on " + properties.getProperty("DATE");
            } catch (IOException e10) {
                throw new BuildException("Could not load the version information:" + e10.getMessage());
            } catch (NullPointerException unused) {
                throw new BuildException("Could not load the version information.");
            }
        }
        return f137080x;
    }

    @Deprecated
    private File q(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null && this.f137082a >= 3) {
            System.out.println("Searching in " + parentFile.getAbsolutePath());
        }
        return parentFile;
    }

    public static String r() throws BuildException {
        if (f137081y == null) {
            p();
        }
        return f137081y;
    }

    private int s(String[] strArr, int i10) {
        try {
            int i11 = i10 + 1;
            this.f137083b = new File(strArr[i11].replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar));
            return i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new BuildException("You must specify a buildfile when using the -buildfile argument");
        }
    }

    private int t(String[] strArr, int i10) {
        String strSubstring;
        String strSubstring2 = strArr[i10].substring(2);
        int iIndexOf = strSubstring2.indexOf(61);
        if (iIndexOf > 0) {
            strSubstring = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        } else {
            if (i10 >= strArr.length - 1) {
                throw new BuildException("Missing value for property " + strSubstring2);
            }
            i10++;
            strSubstring = strArr[i10];
        }
        this.f137087f.put(strSubstring2, strSubstring);
        return i10;
    }

    private int u(String[] strArr, int i10) {
        if (this.f137093l != null) {
            throw new BuildException("Only one input handler class may be specified.");
        }
        int i11 = i10 + 1;
        try {
            this.f137093l = strArr[i11];
            return i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new BuildException("You must specify a classname when using the -inputhandler argument");
        }
    }

    private int v(String[] strArr, int i10) {
        try {
            int i11 = i10 + 1;
            this.f137088g.addElement(strArr[i11]);
            return i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new BuildException("You must specify a classname when using the -listener argument");
        }
    }

    private int w(String[] strArr, int i10) {
        if (this.f137092k != null) {
            throw new BuildException("Only one logger class may be specified.");
        }
        int i11 = i10 + 1;
        try {
            this.f137092k = strArr[i11];
            return i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new BuildException("You must specify a classname when using the -logger argument");
        }
    }

    private int x(String[] strArr, int i10) {
        int i11 = i10 + 1;
        try {
            Integer numDecode = Integer.decode(strArr[i11]);
            this.f137099r = numDecode;
            if (numDecode.intValue() < 1 || this.f137099r.intValue() > 10) {
                throw new BuildException("Niceness value is out of the range 1-10");
            }
            return i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new BuildException("You must supply a niceness value (1-10) after the -nice option");
        } catch (NumberFormatException unused2) {
            throw new BuildException("Unrecognized niceness value: " + strArr[i11]);
        }
    }

    private int y(String[] strArr, int i10) {
        try {
            int i11 = i10 + 1;
            this.f137089h.addElement(strArr[i11]);
            return i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new BuildException("You must specify a property filename when using the -propertyfile argument");
        }
    }

    private void z() {
        if (this.f137098q) {
            org.apache.tools.ant.util.j0.d(this.f137084c);
            org.apache.tools.ant.util.j0.d(this.f137085d);
        }
    }

    public void W(String[] strArr, final Properties properties, ClassLoader classLoader) {
        int i10;
        try {
            R(strArr);
            if (properties != null) {
                properties.stringPropertyNames().forEach(new Consumer() { // from class: org.apache.tools.ant.o1
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.f133561b.H(properties, (String) obj);
                    }
                });
            }
            try {
                try {
                    try {
                        try {
                            T(classLoader);
                            i10 = 0;
                        } catch (Throwable th2) {
                            z();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                        M(th3);
                        z();
                        i10 = 1;
                    }
                } catch (BuildException e10) {
                    if (this.f137085d != System.err) {
                        M(e10);
                    }
                    z();
                    i10 = 1;
                }
            } catch (ExitStatusException e11) {
                int iD = e11.d();
                if (iD != 0) {
                    throw e11;
                }
                i10 = iD;
            }
            z();
            m(i10);
        } catch (Throwable th4) {
            z();
            M(th4);
            m(1);
        }
    }

    protected void j(Project project) {
        project.c(l());
        int size = this.f137088g.size();
        for (int i10 = 0; i10 < size; i10++) {
            k kVar = (k) org.apache.tools.ant.util.i.k(this.f137088g.elementAt(i10), v1.class.getClassLoader(), k.class);
            project.o1(kVar);
            project.c(kVar);
        }
    }

    protected void m(int i10) {
        System.exit(i10);
    }
}
