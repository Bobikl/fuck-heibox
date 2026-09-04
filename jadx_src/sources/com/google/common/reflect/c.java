package com.google.common.reflect;

import com.google.common.base.StandardSystemProperty;
import com.google.common.base.w;
import com.google.common.base.x;
import com.google.common.base.z;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.b3;
import com.google.common.collect.f0;
import com.google.common.io.d0;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ClassPath.java */
/* JADX INFO: loaded from: classes7.dex */
@d
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f59125b = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final z f59126c = z.k(" ").g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f59127d = ".class";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImmutableSet<C0482c> f59128a;

    /* JADX INFO: compiled from: ClassPath.java */
    public static final class a extends C0482c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f59129d;

        a(File file, String str, ClassLoader classLoader) {
            super(file, str, classLoader);
            this.f59129d = c.e(str);
        }

        public String g() {
            return this.f59129d;
        }

        public String h() {
            return k.b(this.f59129d);
        }

        public String i() {
            int iLastIndexOf = this.f59129d.lastIndexOf(36);
            if (iLastIndexOf != -1) {
                return com.google.common.base.b.m('0', '9').V(this.f59129d.substring(iLastIndexOf + 1));
            }
            String strH = h();
            return strH.isEmpty() ? this.f59129d : this.f59129d.substring(strH.length() + 1);
        }

        public boolean j() {
            return this.f59129d.indexOf(36) == -1;
        }

        public Class<?> k() {
            try {
                return this.f59134c.loadClass(this.f59129d);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.reflect.c.C0482c
        public String toString() {
            return this.f59129d;
        }
    }

    /* JADX INFO: compiled from: ClassPath.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final File f59130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClassLoader f59131b;

        b(File file, ClassLoader classLoader) {
            this.f59130a = (File) w.E(file);
            this.f59131b = (ClassLoader) w.E(classLoader);
        }

        private void b(File file, Set<File> set, ImmutableSet.a<C0482c> aVar) throws IOException {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        c(file, aVar);
                    } else {
                        e(file, set, aVar);
                    }
                }
            } catch (SecurityException e10) {
                Logger logger = c.f59125b;
                String strValueOf = String.valueOf(file);
                String strValueOf2 = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
                sb2.append("Cannot access ");
                sb2.append(strValueOf);
                sb2.append(": ");
                sb2.append(strValueOf2);
                logger.warning(sb2.toString());
            }
        }

        private void c(File file, ImmutableSet.a<C0482c> aVar) throws IOException {
            HashSet hashSet = new HashSet();
            hashSet.add(file.getCanonicalFile());
            d(file, "", hashSet, aVar);
        }

        private void d(File file, String str, Set<File> set, ImmutableSet.a<C0482c> aVar) throws IOException {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                Logger logger = c.f59125b;
                String strValueOf = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22);
                sb2.append("Cannot read directory ");
                sb2.append(strValueOf);
                logger.warning(sb2.toString());
                return;
            }
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                if (file2.isDirectory()) {
                    File canonicalFile = file2.getCanonicalFile();
                    if (set.add(canonicalFile)) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
                        sb3.append(str);
                        sb3.append(name);
                        sb3.append("/");
                        d(canonicalFile, sb3.toString(), set, aVar);
                        set.remove(canonicalFile);
                    }
                } else {
                    String strValueOf2 = String.valueOf(str);
                    String strValueOf3 = String.valueOf(name);
                    String strConcat = strValueOf3.length() != 0 ? strValueOf2.concat(strValueOf3) : new String(strValueOf2);
                    if (!strConcat.equals("META-INF/MANIFEST.MF")) {
                        aVar.g(C0482c.e(file2, strConcat, this.f59131b));
                    }
                }
            }
        }

        private void e(File file, Set<File> set, ImmutableSet.a<C0482c> aVar) throws IOException {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    b3<File> it = c.h(file, jarFile.getManifest()).iterator();
                    while (it.hasNext()) {
                        File next = it.next();
                        if (set.add(next.getCanonicalFile())) {
                            b(next, set, aVar);
                        }
                    }
                    f(jarFile, aVar);
                } finally {
                    try {
                        jarFile.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException unused2) {
            }
        }

        private void f(JarFile jarFile, ImmutableSet.a<C0482c> aVar) {
            Enumeration<JarEntry> enumerationEntries = jarFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                if (!jarEntryNextElement.isDirectory() && !jarEntryNextElement.getName().equals("META-INF/MANIFEST.MF")) {
                    aVar.g(C0482c.e(new File(jarFile.getName()), jarEntryNextElement.getName(), this.f59131b));
                }
            }
        }

        public final File a() {
            return this.f59130a;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f59130a.equals(bVar.f59130a) && this.f59131b.equals(bVar.f59131b);
        }

        public ImmutableSet<C0482c> g() throws IOException {
            return h(new HashSet());
        }

        public ImmutableSet<C0482c> h(Set<File> set) throws IOException {
            ImmutableSet.a<C0482c> aVarQ = ImmutableSet.q();
            set.add(this.f59130a);
            b(this.f59130a, set, aVarQ);
            return aVarQ.e();
        }

        public int hashCode() {
            return this.f59130a.hashCode();
        }

        public String toString() {
            return this.f59130a.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClassPath.java */
    public static class C0482c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f59132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f59133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ClassLoader f59134c;

        C0482c(File file, String str, ClassLoader classLoader) {
            this.f59132a = (File) w.E(file);
            this.f59133b = (String) w.E(str);
            this.f59134c = (ClassLoader) w.E(classLoader);
        }

        static C0482c e(File file, String str, ClassLoader classLoader) {
            return str.endsWith(c.f59127d) ? new a(file, str, classLoader) : new C0482c(file, str, classLoader);
        }

        public final com.google.common.io.f a() {
            return d0.a(f());
        }

        public final com.google.common.io.j b(Charset charset) {
            return d0.b(f(), charset);
        }

        final File c() {
            return this.f59132a;
        }

        public final String d() {
            return this.f59133b;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof C0482c)) {
                return false;
            }
            C0482c c0482c = (C0482c) obj;
            return this.f59133b.equals(c0482c.f59133b) && this.f59134c == c0482c.f59134c;
        }

        public final URL f() {
            URL resource = this.f59134c.getResource(this.f59133b);
            if (resource != null) {
                return resource;
            }
            throw new NoSuchElementException(this.f59133b);
        }

        public int hashCode() {
            return this.f59133b.hashCode();
        }

        public String toString() {
            return this.f59133b;
        }
    }

    private c(ImmutableSet<C0482c> immutableSet) {
        this.f59128a = immutableSet;
    }

    public static c b(ClassLoader classLoader) throws IOException {
        ImmutableSet<b> immutableSetM = m(classLoader);
        HashSet hashSet = new HashSet();
        b3<b> it = immutableSetM.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().a());
        }
        ImmutableSet.a aVarQ = ImmutableSet.q();
        b3<b> it2 = immutableSetM.iterator();
        while (it2.hasNext()) {
            aVarQ.c(it2.next().h(hashSet));
        }
        return new c(aVarQ.e());
    }

    private static ImmutableList<URL> d(ClassLoader classLoader) {
        if (classLoader instanceof URLClassLoader) {
            return ImmutableList.x(((URLClassLoader) classLoader).getURLs());
        }
        return classLoader.equals(ClassLoader.getSystemClassLoader()) ? n() : ImmutableList.B();
    }

    @o9.d
    static String e(String str) {
        return str.substring(0, str.length() - 6).replace(IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g);
    }

    @o9.d
    static ImmutableMap<File, ClassLoader> f(ClassLoader classLoader) {
        LinkedHashMap linkedHashMapC0 = Maps.c0();
        ClassLoader parent = classLoader.getParent();
        if (parent != null) {
            linkedHashMapC0.putAll(f(parent));
        }
        b3<URL> it = d(classLoader).iterator();
        while (it.hasNext()) {
            URL next = it.next();
            if (next.getProtocol().equals("file")) {
                File fileO = o(next);
                if (!linkedHashMapC0.containsKey(fileO)) {
                    linkedHashMapC0.put(fileO, classLoader);
                }
            }
        }
        return ImmutableMap.g(linkedHashMapC0);
    }

    @o9.d
    static URL g(File file, String str) throws MalformedURLException {
        return new URL(file.toURI().toURL(), str);
    }

    @o9.d
    static ImmutableSet<File> h(File file, @CheckForNull Manifest manifest) {
        if (manifest == null) {
            return ImmutableSet.D();
        }
        ImmutableSet.a aVarQ = ImmutableSet.q();
        String value = manifest.getMainAttributes().getValue(Attributes.Name.CLASS_PATH.toString());
        if (value != null) {
            for (String str : f59126c.n(value)) {
                try {
                    URL urlG = g(file, str);
                    if (urlG.getProtocol().equals("file")) {
                        aVarQ.g(o(urlG));
                    }
                } catch (MalformedURLException unused) {
                    Logger logger = f59125b;
                    String strValueOf = String.valueOf(str);
                    logger.warning(strValueOf.length() != 0 ? "Invalid Class-Path entry: ".concat(strValueOf) : new String("Invalid Class-Path entry: "));
                }
            }
        }
        return aVarQ.e();
    }

    static ImmutableSet<b> m(ClassLoader classLoader) {
        ImmutableSet.a aVarQ = ImmutableSet.q();
        b3<Map.Entry<File, ClassLoader>> it = f(classLoader).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<File, ClassLoader> next = it.next();
            aVarQ.g(new b(next.getKey(), next.getValue()));
        }
        return aVarQ.e();
    }

    @o9.d
    static ImmutableList<URL> n() {
        ImmutableList.a aVarQ = ImmutableList.q();
        for (String str : z.k(StandardSystemProperty.PATH_SEPARATOR.value()).n(StandardSystemProperty.JAVA_CLASS_PATH.value())) {
            try {
                try {
                    aVarQ.a(new File(str).toURI().toURL());
                } catch (SecurityException unused) {
                    aVarQ.a(new URL("file", (String) null, new File(str).getAbsolutePath()));
                }
            } catch (MalformedURLException e10) {
                Logger logger = f59125b;
                Level level = Level.WARNING;
                String strValueOf = String.valueOf(str);
                logger.log(level, strValueOf.length() != 0 ? "malformed classpath entry: ".concat(strValueOf) : new String("malformed classpath entry: "), (Throwable) e10);
            }
        }
        return aVarQ.e();
    }

    @o9.d
    static File o(URL url) {
        w.d(url.getProtocol().equals("file"));
        try {
            return new File(url.toURI());
        } catch (URISyntaxException unused) {
            return new File(url.getPath());
        }
    }

    public ImmutableSet<a> c() {
        return f0.y(this.f59128a).u(a.class).S();
    }

    public ImmutableSet<C0482c> i() {
        return this.f59128a;
    }

    public ImmutableSet<a> j() {
        return f0.y(this.f59128a).u(a.class).t(new x() { // from class: com.google.common.reflect.b
            @Override // com.google.common.base.x
            public final boolean apply(Object obj) {
                return ((c.a) obj).j();
            }
        }).S();
    }

    public ImmutableSet<a> k(String str) {
        w.E(str);
        ImmutableSet.a aVarQ = ImmutableSet.q();
        b3<a> it = j().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.h().equals(str)) {
                aVarQ.g(next);
            }
        }
        return aVarQ.e();
    }

    public ImmutableSet<a> l(String str) {
        w.E(str);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1);
        sb2.append(str);
        sb2.append(lg.a.f131414g);
        String string = sb2.toString();
        ImmutableSet.a aVarQ = ImmutableSet.q();
        b3<a> it = j().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.g().startsWith(string)) {
                aVarQ.g(next);
            }
        }
        return aVarQ.e();
    }
}
