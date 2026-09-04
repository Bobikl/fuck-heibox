package org.apache.tools.ant;

import com.tencent.open.SocialConstants;
import com.tencent.qcloud.core.util.IOUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.tools.ant.launch.Locator;
import org.apache.tools.ant.util.VectorSet;

/* JADX INFO: compiled from: AntClassLoader.java */
/* JADX INFO: loaded from: classes5.dex */
public class g extends ClassLoader implements q2, Closeable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f133318l = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final boolean f133319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Class[] f133320n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f133321o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f133322p = 8192;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f133323q = 256;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Map<String, String> f133324r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final org.apache.tools.zip.y f133325s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final org.apache.tools.zip.y f133326t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Vector<File> f133327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Project f133328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f133329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Vector<String> f133330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Vector<String> f133331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f133332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ClassLoader f133333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Hashtable<File, JarFile> f133334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ClassLoader f133335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f133336k;

    /* JADX INFO: compiled from: AntClassLoader.java */
    public class a implements Enumeration<URL> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f133337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f133338b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private URL f133339c;

        a(String str) {
            this.f133337a = str;
            a();
        }

        private void a() {
            URL urlO = null;
            while (this.f133338b < g.this.f133327b.size() && urlO == null) {
                try {
                    urlO = g.this.O((File) g.this.f133327b.elementAt(this.f133338b), this.f133337a);
                    this.f133338b++;
                } catch (BuildException unused) {
                }
            }
            this.f133339c = urlO;
        }

        @Override // java.util.Enumeration
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public URL nextElement() {
            URL url = this.f133339c;
            if (url == null) {
                throw new NoSuchElementException();
            }
            a();
            return url;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f133339c != null;
        }
    }

    static {
        Class[] clsArr;
        boolean zN = org.apache.tools.ant.util.s0.n("9");
        f133319m = zN;
        ClassLoader.registerAsParallelCapable();
        Object objInvoke = null;
        if (zN) {
            try {
                clsArr = new Class[]{File.class, Boolean.TYPE, Integer.TYPE, Class.forName("java.lang.Runtime$Version")};
                try {
                    objInvoke = Runtime.class.getDeclaredMethod("version", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                clsArr = null;
            }
            f133320n = clsArr;
            f133321o = objInvoke;
        } else {
            f133320n = null;
            f133321o = null;
        }
        f133324r = Collections.synchronizedMap(new HashMap());
        f133325s = new org.apache.tools.zip.y(101010256L);
        f133326t = new org.apache.tools.zip.y(808471376L);
    }

    public g() {
        this.f133327b = new VectorSet();
        this.f133329d = true;
        this.f133330e = new Vector<>();
        this.f133331f = new Vector<>();
        this.f133332g = false;
        this.f133333h = null;
        this.f133334i = new Hashtable<>();
        this.f133335j = null;
        this.f133336k = false;
        q0(null);
    }

    public g(ClassLoader classLoader, Project project, org.apache.tools.ant.types.o0 o0Var) {
        this.f133327b = new VectorSet();
        this.f133329d = true;
        this.f133330e = new Vector<>();
        this.f133331f = new Vector<>();
        this.f133332g = false;
        this.f133333h = null;
        this.f133334i = new Hashtable<>();
        this.f133335j = null;
        this.f133336k = false;
        q0(classLoader);
        o0(o0Var);
        u0(project);
    }

    public g(ClassLoader classLoader, Project project, org.apache.tools.ant.types.o0 o0Var, boolean z10) {
        this(project, o0Var);
        if (classLoader != null) {
            q0(classLoader);
        }
        t0(z10);
        c();
    }

    public g(ClassLoader classLoader, boolean z10) {
        this.f133327b = new VectorSet();
        this.f133329d = true;
        this.f133330e = new Vector<>();
        this.f133331f = new Vector<>();
        this.f133332g = false;
        this.f133333h = null;
        this.f133334i = new Hashtable<>();
        this.f133335j = null;
        this.f133336k = false;
        q0(classLoader);
        this.f133328c = null;
        this.f133329d = z10;
    }

    public g(Project project, org.apache.tools.ant.types.o0 o0Var) {
        this.f133327b = new VectorSet();
        this.f133329d = true;
        this.f133330e = new Vector<>();
        this.f133331f = new Vector<>();
        this.f133332g = false;
        this.f133333h = null;
        this.f133334i = new Hashtable<>();
        this.f133335j = null;
        this.f133336k = false;
        q0(null);
        u0(project);
        o0(o0Var);
    }

    public g(Project project, org.apache.tools.ant.types.o0 o0Var, boolean z10) {
        this(null, project, o0Var, z10);
    }

    private Certificate[] A(File file, String str) {
        JarFile jarFile;
        JarEntry jarEntry;
        if (file.isDirectory() || (jarFile = this.f133334i.get(file)) == null || (jarEntry = jarFile.getJarEntry(str)) == null) {
            return null;
        }
        return jarEntry.getCertificates();
    }

    private String C(String str) {
        return str.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + ".class";
    }

    private Class<?> I(InputStream inputStream, String str, File file) throws IOException, SecurityException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 8192);
            if (i10 == -1) {
                return o(file, byteArrayOutputStream.toByteArray(), str);
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    private Manifest L(File file) throws IOException {
        JarFile jarFile;
        if (file.isDirectory() || (jarFile = this.f133334i.get(file)) == null) {
            return null;
        }
        return jarFile.getManifest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public InputStream Z(File file, String str) {
        try {
            JarFile jarFile = this.f133334i.get(file);
            if (jarFile == null && file.isDirectory()) {
                File file2 = new File(file, str);
                if (file2.exists()) {
                    return Files.newInputStream(file2.toPath(), new OpenOption[0]);
                }
            } else {
                if (jarFile == null) {
                    if (!file.exists()) {
                        return null;
                    }
                    this.f133334i.put(file, g0(file));
                    jarFile = this.f133334i.get(file);
                }
                JarEntry jarEntry = jarFile.getJarEntry(str);
                if (jarEntry != null) {
                    return jarFile.getInputStream(jarEntry);
                }
            }
        } catch (Exception e10) {
            e0("Ignoring Exception " + e10.getClass().getName() + ": " + e10.getMessage() + " reading resource " + str + " from " + file, 3);
        }
        return null;
    }

    private ClassLoader P() {
        ClassLoader classLoader = getClass().getClassLoader();
        while (classLoader != null && classLoader.getParent() != null) {
            classLoader = classLoader.getParent();
        }
        return classLoader;
    }

    @Deprecated
    public static void Q(Class<?> cls) {
        Constructor<?> constructor;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        if (declaredConstructors == null || declaredConstructors.length <= 0 || (constructor = declaredConstructors[0]) == null) {
            return;
        }
        try {
            constructor.newInstance(new String[256]);
        } catch (Exception unused) {
        }
    }

    private boolean W(final String str) {
        Stream stream = this.f133331f.stream();
        Objects.requireNonNull(str);
        return stream.noneMatch(new Predicate() { // from class: org.apache.tools.ant.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.startsWith((String) obj);
            }
        }) && (this.f133330e.stream().anyMatch(new Predicate() { // from class: org.apache.tools.ant.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.startsWith((String) obj);
            }
        }) || this.f133329d);
    }

    private static boolean Y(File file) throws IOException {
        byte[] bArr = new byte[4];
        if (!j0(file, bArr)) {
            return false;
        }
        org.apache.tools.zip.y yVar = new org.apache.tools.zip.y(bArr);
        return org.apache.tools.zip.y.f137539m.equals(yVar) || f133325s.equals(yVar) || org.apache.tools.zip.y.f137540n.equals(yVar) || f133326t.equals(yVar);
    }

    private InputStream a0(String str) {
        ClassLoader classLoader = this.f133333h;
        return classLoader == null ? super.getResourceAsStream(str) : classLoader.getResourceAsStream(str);
    }

    private InputStream c0(final String str) {
        return (InputStream) this.f133327b.stream().map(new Function() { // from class: org.apache.tools.ant.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f133116a.Z(str, (File) obj);
            }
        }).filter(new Predicate() { // from class: org.apache.tools.ant.f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return com.google.auto.common.s.a((InputStream) obj);
            }
        }).findFirst().orElse(null);
    }

    public static g f0(ClassLoader classLoader, Project project, org.apache.tools.ant.types.o0 o0Var, boolean z10) {
        return new g(classLoader, project, o0Var, z10);
    }

    private static JarFile g0(File file) throws IOException {
        Class[] clsArr;
        Object obj;
        return (!f133319m || (clsArr = f133320n) == null || (obj = f133321o) == null) ? new JarFile(file) : (JarFile) org.apache.tools.ant.util.k1.f(JarFile.class, clsArr, new Object[]{file, Boolean.TRUE, 1, obj});
    }

    private static boolean j0(File file, byte[] bArr) throws IOException {
        InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
        try {
            int length = bArr.length;
            int i10 = 0;
            while (i10 != length) {
                int i11 = inputStreamNewInputStream.read(bArr, i10, length - i10);
                if (i11 == -1) {
                    break;
                }
                i10 += i11;
            }
            boolean z10 = i10 == length;
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            return z10;
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
    }

    private static Enumeration<URL> k(Enumeration<URL> enumeration, Enumeration<URL> enumeration2) {
        return (Enumeration) Stream.concat(Collections.list(enumeration).stream(), Collections.list(enumeration2).stream()).collect(Collectors.collectingAndThen(Collectors.toList(), new c()));
    }

    private Class<?> r(String str) throws ClassNotFoundException {
        ClassLoader classLoader = this.f133333h;
        return classLoader == null ? findSystemClass(str) : classLoader.loadClass(str);
    }

    private Class<?> s(String str) throws ClassNotFoundException {
        String strC = C(str);
        for (File file : this.f133327b) {
            try {
                InputStream inputStreamZ = Z(file, strC);
                if (inputStreamZ != null) {
                    try {
                        e0("Loaded from " + file + " " + strC, 4);
                        Class<?> clsI = I(inputStreamZ, str, file);
                        inputStreamZ.close();
                        return clsI;
                    } catch (Throwable th2) {
                        try {
                            inputStreamZ.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (inputStreamZ != null) {
                    inputStreamZ.close();
                }
            } catch (IOException e10) {
                e0("Exception reading component " + file + " (reason: " + e10.getMessage() + ")", 3);
            } catch (SecurityException e11) {
                throw e11;
            }
        }
        throw new ClassNotFoundException(str);
    }

    @Override // org.apache.tools.ant.k
    public void B0(BuildEvent buildEvent) {
    }

    @Override // org.apache.tools.ant.q2
    public void E0(BuildEvent buildEvent) {
    }

    public String J() {
        StringBuilder sb2 = new StringBuilder();
        for (File file : this.f133327b) {
            if (sb2.length() > 0) {
                sb2.append(File.pathSeparator);
            }
            sb2.append(file.getAbsolutePath());
        }
        return sb2.toString();
    }

    public ClassLoader K() {
        return this.f133333h;
    }

    public Enumeration<URL> M(String str) throws IOException {
        return t(str, false);
    }

    protected URL O(File file, String str) {
        try {
            JarFile jarFile = this.f133334i.get(file);
            if (jarFile == null && file.isDirectory()) {
                File file2 = new File(file, str);
                if (file2.exists()) {
                    try {
                        return f133318l.N(file2);
                    } catch (MalformedURLException unused) {
                        return null;
                    }
                }
            } else {
                if (jarFile == null) {
                    if (!file.exists()) {
                        return null;
                    }
                    if (!Y(file)) {
                        e0("CLASSPATH element " + file + " is not a JAR.", 1);
                        return null;
                    }
                    this.f133334i.put(file, g0(file));
                    jarFile = this.f133334i.get(file);
                }
                JarEntry jarEntry = jarFile.getJarEntry(str);
                if (jarEntry != null) {
                    try {
                        return new URL("jar:" + f133318l.N(file) + "!/" + jarEntry);
                    } catch (MalformedURLException unused2) {
                        return null;
                    }
                }
            }
        } catch (Exception e10) {
            e0(("Unable to obtain resource from " + file + ": ") + e10, 1);
            e0(org.apache.tools.ant.util.j2.b(e10), 1);
        }
        return null;
    }

    protected boolean R(File file) {
        return this.f133327b.contains(file);
    }

    @Override // org.apache.tools.ant.k
    public void R0(BuildEvent buildEvent) {
        n();
    }

    @Override // org.apache.tools.ant.k
    public void V(BuildEvent buildEvent) {
    }

    @Override // org.apache.tools.ant.q2
    public void W0(BuildEvent buildEvent) {
        if (buildEvent.d() == this.f133328c) {
            n();
        }
    }

    public void c() {
        org.apache.tools.ant.util.s0.k().forEach(new Consumer() { // from class: org.apache.tools.ant.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f133082b.i((String) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        n();
    }

    public void d(String str) {
        Vector<String> vector = this.f133331f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str.endsWith(".") ? "" : ".");
        vector.addElement(sb2.toString());
    }

    public void e(File file) {
        if (this.f133327b.contains(file)) {
            return;
        }
        this.f133327b.addElement(file);
    }

    protected void e0(String str, int i10) {
        Project project = this.f133328c;
        if (project != null) {
            project.M0(str, i10);
        } else if (i10 < 2) {
            System.err.println(str);
        }
    }

    public void f(String str) throws BuildException {
        Project project = this.f133328c;
        try {
            g(project != null ? project.W0(str) : new File(str));
        } catch (IOException e10) {
            throw new BuildException(e10);
        }
    }

    @Override // java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        e0("Finding class " + str, 4);
        return s(str);
    }

    @Override // java.lang.ClassLoader
    protected Enumeration<URL> findResources(String str) throws IOException {
        return t(str, true);
    }

    protected void g(File file) throws IOException {
        if (!this.f133327b.contains(file)) {
            this.f133327b.addElement(file);
        }
        if (file.isDirectory()) {
            return;
        }
        String str = file.getAbsolutePath() + file.lastModified() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + file.length();
        String str2 = f133324r.get(str);
        if (str2 == null) {
            JarFile jarFileG0 = g0(file);
            try {
                Manifest manifest = jarFileG0.getManifest();
                if (manifest == null) {
                    jarFileG0.close();
                    return;
                }
                String value = manifest.getMainAttributes().getValue(Attributes.Name.CLASS_PATH);
                jarFileG0.close();
                str2 = value == null ? "" : value;
                f133324r.put(str, str2);
            } catch (Throwable th2) {
                if (jarFileG0 != null) {
                    try {
                        jarFileG0.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        if (str2.isEmpty()) {
            return;
        }
        URL urlN = f133318l.N(file);
        StringTokenizer stringTokenizer = new StringTokenizer(str2);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            URL url = new URL(urlN, strNextToken);
            if (url.getProtocol().equals("file")) {
                File file2 = new File(Locator.decodeUri(url.getFile()));
                if (file2.exists() && !R(file2)) {
                    g(file2);
                }
            } else {
                e0("Skipping jar library " + strNextToken + " since only relative URLs are supported by this loader", 3);
            }
        }
    }

    @Override // java.lang.ClassLoader
    public URL getResource(String str) {
        URL urlO;
        if (W(str)) {
            ClassLoader classLoader = this.f133333h;
            urlO = classLoader == null ? super.getResource(str) : classLoader.getResource(str);
        } else {
            urlO = null;
        }
        if (urlO != null) {
            e0("Resource " + str + " loaded from parent loader", 4);
        } else {
            Iterator<File> it = this.f133327b.iterator();
            while (it.hasNext()) {
                urlO = O(it.next(), str);
                if (urlO != null) {
                    e0("Resource " + str + " loaded from ant loader", 4);
                    break;
                }
            }
        }
        if (urlO == null && !W(str)) {
            if (this.f133332g) {
                urlO = P() != null ? P().getResource(str) : null;
            } else {
                ClassLoader classLoader2 = this.f133333h;
                urlO = classLoader2 == null ? super.getResource(str) : classLoader2.getResource(str);
            }
            if (urlO != null) {
                e0("Resource " + str + " loaded from parent loader", 4);
            }
        }
        if (urlO == null) {
            e0("Couldn't load Resource " + str, 4);
        }
        return urlO;
    }

    @Override // java.lang.ClassLoader
    public InputStream getResourceAsStream(String str) {
        InputStream inputStreamA0 = W(str) ? a0(str) : null;
        if (inputStreamA0 != null) {
            e0("ResourceStream for " + str + " loaded from parent loader", 4);
        } else {
            inputStreamA0 = c0(str);
            if (inputStreamA0 != null) {
                e0("ResourceStream for " + str + " loaded from ant loader", 4);
            }
        }
        if (inputStreamA0 == null && !W(str)) {
            if (this.f133332g) {
                inputStreamA0 = P() != null ? P().getResourceAsStream(str) : null;
            } else {
                inputStreamA0 = a0(str);
            }
            if (inputStreamA0 != null) {
                e0("ResourceStream for " + str + " loaded from parent loader", 4);
            }
        }
        if (inputStreamA0 == null) {
            e0("Couldn't load ResourceStream for " + str, 4);
        }
        return inputStreamA0;
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> getResources(String str) throws IOException {
        return M(str);
    }

    @Override // org.apache.tools.ant.k
    public void h0(BuildEvent buildEvent) {
    }

    public void i(String str) {
        Vector<String> vector = this.f133330e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str.endsWith(".") ? "" : ".");
        vector.addElement(sb2.toString());
    }

    @Override // org.apache.tools.ant.k
    public void i0(BuildEvent buildEvent) {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008e A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0009, B:10:0x0010, B:21:0x008e, B:14:0x004c, B:12:0x002e, B:17:0x006b, B:19:0x006f, B:24:0x0093), top: B:28:0x0001, inners: #1, #2 }] */
    @Override // java.lang.ClassLoader
    protected synchronized Class<?> loadClass(String str, boolean z10) throws ClassNotFoundException {
        Class<?> clsR;
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        if (clsFindLoadedClass != null) {
            return clsFindLoadedClass;
        }
        if (W(str)) {
            try {
                clsR = r(str);
                e0("Class " + str + " loaded from parent loader (parentFirst)", 4);
            } catch (ClassNotFoundException unused) {
                clsR = findClass(str);
                e0("Class " + str + " loaded from ant loader (parentFirst)", 4);
            }
            if (z10) {
                resolveClass(clsR);
            }
            return clsR;
        }
        try {
            clsR = findClass(str);
            e0("Class " + str + " loaded from ant loader", 4);
        } catch (ClassNotFoundException e10) {
            if (this.f133332g) {
                throw e10;
            }
            clsR = r(str);
            e0("Class " + str + " loaded from parent loader", 4);
        }
        if (z10) {
            resolveClass(clsR);
        }
        return clsR;
    }

    public void m0() {
        if (org.apache.tools.ant.util.a1.f() && this.f133336k) {
            org.apache.tools.ant.util.a1.h(this.f133335j);
            this.f133335j = null;
            this.f133336k = false;
        }
    }

    public synchronized void n() {
        Iterator<JarFile> it = this.f133334i.values().iterator();
        while (it.hasNext()) {
            org.apache.tools.ant.util.j0.g(it.next());
        }
        this.f133334i = new Hashtable<>();
        Project project = this.f133328c;
        if (project != null) {
            project.U0(this);
        }
        this.f133328c = null;
    }

    protected Class<?> o(File file, byte[] bArr, String str) throws IOException {
        p(file, str);
        ProtectionDomain protectionDomain = Project.class.getProtectionDomain();
        return defineClass(str, bArr, 0, bArr.length, new ProtectionDomain(new CodeSource(f133318l.N(file), A(file, C(str))), protectionDomain.getPermissions(), this, protectionDomain.getPrincipals()));
    }

    public void o0(org.apache.tools.ant.types.o0 o0Var) {
        this.f133327b.removeAllElements();
        if (o0Var != null) {
            for (String str : o0Var.s2(org.apache.tools.ant.taskdefs.z0.b.f136024i).z2()) {
                try {
                    f(str);
                } catch (BuildException e10) {
                    e0("Ignoring path element " + str + " from classpath due to exception " + e10, 4);
                }
            }
        }
    }

    protected void p(File file, String str) throws IOException {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return;
        }
        String strSubstring = str.substring(0, iLastIndexOf);
        if (getPackage(strSubstring) != null) {
            return;
        }
        Manifest manifestL = L(file);
        if (manifestL == null) {
            definePackage(strSubstring, null, null, null, null, null, null, null);
        } else {
            q(file, strSubstring, manifestL);
        }
    }

    public synchronized void p0(boolean z10) {
        this.f133332g = z10;
    }

    protected void q(File file, String str, Manifest manifest) {
        String value;
        String value2;
        String value3;
        String value4;
        String value5;
        String value6;
        String value7;
        URL url;
        Attributes attributes = manifest.getAttributes(str.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + "/");
        if (attributes != null) {
            value2 = attributes.getValue(Attributes.Name.SPECIFICATION_TITLE);
            value3 = attributes.getValue(Attributes.Name.SPECIFICATION_VENDOR);
            value4 = attributes.getValue(Attributes.Name.SPECIFICATION_VERSION);
            value5 = attributes.getValue(Attributes.Name.IMPLEMENTATION_TITLE);
            value6 = attributes.getValue(Attributes.Name.IMPLEMENTATION_VENDOR);
            value7 = attributes.getValue(Attributes.Name.IMPLEMENTATION_VERSION);
            value = attributes.getValue(Attributes.Name.SEALED);
        } else {
            value = null;
            value2 = null;
            value3 = null;
            value4 = null;
            value5 = null;
            value6 = null;
            value7 = null;
        }
        Attributes mainAttributes = manifest.getMainAttributes();
        if (mainAttributes != null) {
            if (value2 == null) {
                value2 = mainAttributes.getValue(Attributes.Name.SPECIFICATION_TITLE);
            }
            if (value3 == null) {
                value3 = mainAttributes.getValue(Attributes.Name.SPECIFICATION_VENDOR);
            }
            if (value4 == null) {
                value4 = mainAttributes.getValue(Attributes.Name.SPECIFICATION_VERSION);
            }
            if (value5 == null) {
                value5 = mainAttributes.getValue(Attributes.Name.IMPLEMENTATION_TITLE);
            }
            if (value6 == null) {
                value6 = mainAttributes.getValue(Attributes.Name.IMPLEMENTATION_VENDOR);
            }
            if (value7 == null) {
                value7 = mainAttributes.getValue(Attributes.Name.IMPLEMENTATION_VERSION);
            }
            if (value == null) {
                value = mainAttributes.getValue(Attributes.Name.SEALED);
            }
        }
        String str2 = value6;
        String str3 = value7;
        String str4 = value3;
        String str5 = value5;
        String str6 = value4;
        String str7 = value2;
        if (value == null || !value.equalsIgnoreCase("true")) {
            url = null;
        } else {
            try {
                url = new URL(org.apache.tools.ant.util.j0.O().q0(file.getAbsolutePath()));
            } catch (MalformedURLException unused) {
                url = null;
            }
        }
        definePackage(str, str7, str6, str4, str5, str3, str2, url);
    }

    public void q0(ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = g.class.getClassLoader();
        }
        this.f133333h = classLoader;
    }

    @Override // org.apache.tools.ant.k
    public void r1(BuildEvent buildEvent) {
    }

    @Override // org.apache.tools.ant.k
    public void s0(BuildEvent buildEvent) {
    }

    protected Enumeration<URL> t(String str, boolean z10) throws IOException {
        a aVar = new a(str);
        ClassLoader classLoader = this.f133333h;
        Enumeration<URL> enumerationEmptyEnumeration = (classLoader == null || (z10 && classLoader == getParent())) ? Collections.emptyEnumeration() : this.f133333h.getResources(str);
        if (W(str)) {
            return k(enumerationEmptyEnumeration, aVar);
        }
        if (this.f133332g) {
            return P() == null ? aVar : k(aVar, P().getResources(str));
        }
        return k(aVar, enumerationEmptyEnumeration);
    }

    public void t0(boolean z10) {
        this.f133329d = z10;
    }

    public String toString() {
        return "AntClassLoader[" + J() + "]";
    }

    public void u0(Project project) {
        this.f133328c = project;
        if (project != null) {
            project.c(this);
        }
    }

    public void v0() {
        if (this.f133336k) {
            throw new BuildException("Context loader has not been reset");
        }
        if (org.apache.tools.ant.util.a1.f()) {
            this.f133335j = org.apache.tools.ant.util.a1.d();
            Project project = this.f133328c;
            org.apache.tools.ant.util.a1.h((project == null || !SocialConstants.PARAM_ONLY.equals(project.u0(j1.f133479c))) ? this : getClass().getClassLoader());
            this.f133336k = true;
        }
    }

    public Class<?> x(String str) throws ClassNotFoundException {
        e0("force loading " + str, 4);
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        return clsFindLoadedClass == null ? findClass(str) : clsFindLoadedClass;
    }

    public Class<?> z(String str) throws ClassNotFoundException {
        e0("force system loading " + str, 4);
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        return clsFindLoadedClass == null ? r(str) : clsFindLoadedClass;
    }
}
