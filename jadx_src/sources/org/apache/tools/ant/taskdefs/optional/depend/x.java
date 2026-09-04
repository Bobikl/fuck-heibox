package org.apache.tools.ant.taskdefs.optional.depend;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.f2;
import org.apache.tools.ant.taskdefs.h4;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.types.q1;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.types.u1;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: Depend.java */
/* JADX INFO: loaded from: classes5.dex */
public class x extends h4 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f134812w = 1000;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f134813x = "dependencies.txt";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f134814y = "||:";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private o0 f134815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private o0 f134816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private File f134817n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map<String, Map<String, b>> f134818o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map<String, b> f134819p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map<String, Set<File>> f134820q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map<String, String> f134821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f134822s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f134823t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f134824u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private o0 f134825v;

    /* JADX INFO: compiled from: Depend.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f134826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f134827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f134828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f134829d;

        private b() {
            this.f134829d = false;
        }
    }

    private void J2(List<b> list, File file, File file2) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        int length = file2.getPath().length();
        File fileR2 = null;
        for (File file3 : fileArrListFiles) {
            if (file3.getName().endsWith(".class")) {
                b bVar = new b();
                bVar.f134826a = file3;
                String strSubstring = file3.getPath().substring(length + 1, file3.getPath().length() - 6);
                bVar.f134827b = f.b(strSubstring);
                fileR2 = R2(strSubstring, fileR2);
                bVar.f134828c = fileR2;
                list.add(bVar);
            } else {
                J2(list, file3, file2);
            }
        }
    }

    private int L2(String str) {
        int iL2;
        Map<String, b> map = this.f134818o.get(str);
        if (map == null) {
            return 0;
        }
        int i10 = 0;
        for (Map.Entry<String, b> entry : map.entrySet()) {
            String key = entry.getKey();
            b value = entry.getValue();
            if (value.f134826a.exists()) {
                if (value.f134828c == null) {
                    s3(value, key, str);
                } else {
                    x1("Deleting file " + value.f134826a.getPath() + " since " + str + " out of date", 3);
                    value.f134826a.delete();
                    i10++;
                    if (this.f134822s) {
                        iL2 = L2(key);
                    } else if (key.contains("$")) {
                        String strSubstring = key.substring(0, key.indexOf("$"));
                        x1("Top level class = " + strSubstring, 3);
                        b bVar = this.f134819p.get(strSubstring);
                        if (bVar != null && bVar.f134826a.exists()) {
                            x1("Deleting file " + bVar.f134826a.getPath() + " since one of its inner classes was removed", 3);
                            bVar.f134826a.delete();
                            i10++;
                            if (this.f134822s) {
                                iL2 = L2(strSubstring);
                            }
                        }
                    }
                    i10 += iL2;
                }
            }
        }
        return i10;
    }

    private int M2() {
        int iL2 = 0;
        for (String str : this.f134821r.keySet()) {
            iL2 += L2(str);
            b bVar = this.f134819p.get(str);
            if (bVar != null && bVar.f134826a.exists()) {
                if (bVar.f134828c == null) {
                    s3(bVar, str, str);
                } else {
                    bVar.f134826a.delete();
                    iL2++;
                }
            }
        }
        return iL2;
    }

    private void N2() throws IOException {
        long jLastModified;
        boolean zExists;
        Object file;
        this.f134818o = new HashMap();
        this.f134819p = new HashMap();
        Map<String, List<String>> map = new HashMap<>();
        if (this.f134817n != null) {
            File file2 = new File(this.f134817n, f134813x);
            zExists = file2.exists();
            jLastModified = file2.lastModified();
            if (zExists) {
                map = i3(file2);
            }
        } else {
            jLastModified = Long.MAX_VALUE;
            zExists = true;
        }
        Iterator<b> it = T2().iterator();
        boolean z10 = false;
        while (true) {
            List<String> list = null;
            if (!it.hasNext()) {
                break;
            }
            final b next = it.next();
            x1("Adding class info for " + next.f134827b, 4);
            this.f134819p.put(next.f134827b, next);
            if (this.f134817n != null && zExists && jLastModified > next.f134826a.lastModified()) {
                list = map.get(next.f134827b);
            }
            if (list == null) {
                org.apache.tools.ant.taskdefs.optional.depend.b bVar = new org.apache.tools.ant.taskdefs.optional.depend.b();
                bVar.f(next.f134827b);
                bVar.g(this.f134816m);
                bVar.c(false);
                list = Collections.list(bVar.e());
                list.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.depend.h
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.f134800b.X2(next, (String) obj);
                    }
                });
                map.put(next.f134827b, list);
                z10 = true;
            }
            for (String str : list) {
                ((Map) this.f134818o.computeIfAbsent(str, new Function() { // from class: org.apache.tools.ant.taskdefs.optional.depend.i
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return x.Y2((String) obj);
                    }
                })).put(next.f134827b, next);
                x1(str + " affects " + next.f134827b, 4);
            }
        }
        this.f134820q = null;
        o0 o0VarS2 = S2();
        if (o0VarS2 != null) {
            this.f134820q = new HashMap();
            org.apache.tools.ant.g gVarZ = b().z(o0VarS2);
            try {
                HashMap map2 = new HashMap();
                Object obj = new Object();
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    x1("Determining classpath dependencies for " + key, 4);
                    List<String> value = entry.getValue();
                    HashSet hashSet = new HashSet();
                    this.f134820q.put(key, hashSet);
                    for (String str2 : value) {
                        x1("Looking for " + str2, 4);
                        Object obj2 = map2.get(str2);
                        if (obj2 == null) {
                            if (str2.startsWith("java.") || str2.startsWith("javax.")) {
                                x1("Ignoring base classlib dependency " + str2, 4);
                                obj2 = obj;
                            } else {
                                URL resource = gVarZ.getResource(str2.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + ".class");
                                x1("URL is " + resource, 4);
                                if (resource != null) {
                                    if ("jar".equals(resource.getProtocol())) {
                                        String file3 = resource.getFile();
                                        String strSubstring = file3.substring(0, file3.indexOf(33));
                                        if (!strSubstring.startsWith("file:")) {
                                            throw new IOException("Bizarre nested path in jar: protocol: " + strSubstring);
                                        }
                                        file = new File(j0.O().K(strSubstring));
                                    } else {
                                        file = "file".equals(resource.getProtocol()) ? new File(j0.O().K(resource.toExternalForm())) : obj;
                                    }
                                    x1("Class " + key + " depends on " + file + " due to " + str2, 4);
                                } else {
                                    file = obj;
                                }
                                obj2 = file;
                            }
                            map2.put(str2, obj2);
                        }
                        if (obj2 != obj) {
                            File file4 = (File) obj2;
                            x1("Adding a classpath dependency on " + file4, 4);
                            hashSet.add(file4);
                        }
                    }
                }
                if (gVarZ != null) {
                    gVarZ.close();
                }
            } catch (Throwable th2) {
                if (gVarZ != null) {
                    try {
                        gVarZ.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } else {
            x1("No classpath to check", 4);
        }
        if (this.f134817n == null || !z10) {
            return;
        }
        t3(map);
    }

    private void O2() {
        b bVar;
        this.f134821r = new HashMap();
        P2(this.f134815l).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.depend.o
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f134807b.Z2((File) obj);
            }
        });
        Map<String, Set<File>> map = this.f134820q;
        if (map == null) {
            return;
        }
        for (Map.Entry<String, Set<File>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!this.f134821r.containsKey(key) && (bVar = this.f134819p.get(key)) != null) {
                for (File file : entry.getValue()) {
                    if (file.lastModified() > bVar.f134826a.lastModified()) {
                        x1("Class " + key + " is out of date with respect to " + file, 4);
                        this.f134821r.put(key, key);
                        break;
                    }
                }
            }
        }
    }

    private Stream<File> P2(u1 u1Var) {
        return u1Var.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.depend.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return x.a3((s1) obj);
            }
        }).filter(new Predicate() { // from class: org.apache.tools.ant.taskdefs.optional.depend.s
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return com.google.auto.common.s.a((org.apache.tools.ant.types.resources.y) obj);
            }
        }).map(new f2()).filter(new Predicate() { // from class: org.apache.tools.ant.taskdefs.optional.depend.t
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((File) obj).isDirectory();
            }
        });
    }

    private void Q2() {
        x1("Reverse Dependency Dump for " + this.f134818o.size() + " classes:", 4);
        this.f134818o.forEach(new BiConsumer() { // from class: org.apache.tools.ant.taskdefs.optional.depend.m
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f134805a.c3((String) obj, (Map) obj2);
            }
        });
        if (this.f134820q != null) {
            x1("Classpath file dependencies (Forward):", 4);
            this.f134820q.forEach(new BiConsumer() { // from class: org.apache.tools.ant.taskdefs.optional.depend.n
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.f134806a.e3((String) obj, (Set) obj2);
                }
            });
        }
    }

    private File R2(String str, File file) {
        final String str2;
        int iIndexOf = str.indexOf(36);
        if (iIndexOf != -1) {
            str2 = str.substring(0, iIndexOf) + ".java";
        } else {
            str2 = str + ".java";
        }
        return (File) P2(this.f134815l).map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.depend.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return x.f3(str2, (File) obj);
            }
        }).filter(Predicate.isEqual(file).or(new Predicate() { // from class: org.apache.tools.ant.taskdefs.optional.depend.q
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((File) obj).exists();
            }
        })).findFirst().orElse(null);
    }

    private o0 S2() {
        final o0 o0Var = null;
        if (this.f134825v == null) {
            return null;
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f134825v.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.depend.j
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                linkedHashSet.add((s1) obj);
            }
        });
        this.f134816m.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.depend.k
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                linkedHashSet.remove((s1) obj);
            }
        });
        if (!linkedHashSet.isEmpty()) {
            o0Var = new o0(b());
            linkedHashSet.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.depend.l
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    o0Var.f2((s1) obj);
                }
            });
        }
        x1("Classpath without dest dir is " + o0Var, 4);
        return o0Var;
    }

    private List<b> T2() {
        final ArrayList arrayList = new ArrayList();
        P2(this.f134816m).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.depend.v
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f134810b.g3(arrayList, (File) obj);
            }
        });
        return arrayList;
    }

    private boolean V2(String str, String str2) {
        return W2(str, str2, org.apache.tools.ant.taskdefs.rmic.b.f135692d) || W2(str, str2, org.apache.tools.ant.taskdefs.rmic.b.f135693e) || W2(str, str2, org.apache.tools.ant.taskdefs.rmic.b.f135692d) || W2(str, str2, org.apache.tools.ant.taskdefs.rmic.b.f135693e);
    }

    private boolean W2(String str, String str2, String str3) {
        return (str2 + str3).equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X2(b bVar, String str) {
        x1("Class " + bVar.f134827b + " depends on " + str, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map Y2(String str) {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z2(File file) {
        j3(file, p2(file).m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ org.apache.tools.ant.types.resources.y a3(s1 s1Var) {
        return (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b3(String str, b bVar) {
        x1("    " + str + " in " + bVar.f134826a.getPath(), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c3(String str, Map map) {
        x1(" Class " + str + " affects:", 4);
        map.forEach(new BiConsumer() { // from class: org.apache.tools.ant.taskdefs.optional.depend.u
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f134809a.b3((String) obj, (x.b) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d3(File file) {
        x1("    " + file.getPath(), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e3(String str, Set set) {
        x1(" Class " + str + " depends on:", 4);
        set.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.depend.g
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f134799b.d3((File) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ File f3(String str, File file) {
        return new File(file, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g3(List list, File file) {
        J2(list, file, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List h3(String str) {
        return new ArrayList();
    }

    private Map<String, List<String>> i3(File file) throws IOException {
        HashMap map = new HashMap();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        List list = null;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return map;
                }
                if (line.startsWith(f134814y)) {
                    list = (List) map.computeIfAbsent(line.substring(3), new Function() { // from class: org.apache.tools.ant.taskdefs.optional.depend.w
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return x.h3((String) obj);
                        }
                    });
                } else if (list != null) {
                    list.add(line);
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private void s3(b bVar, String str, String str2) {
        if (bVar.f134829d) {
            return;
        }
        x1("The class " + str + " in file " + bVar.f134826a.getPath() + " is out of date due to " + str2 + " but has not been deleted because its source file could not be determined", (this.f134823t || !V2(str, str2)) ? 1 : 3);
        bVar.f134829d = true;
    }

    private void t3(Map<String, List<String>> map) throws IOException {
        File file = this.f134817n;
        if (file != null) {
            file.mkdirs();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(this.f134817n, f134813x)));
            try {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    bufferedWriter.write(String.format("%s%s%n", f134814y, entry.getKey()));
                    Iterator<String> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        bufferedWriter.write(it.next());
                        bufferedWriter.newLine();
                    }
                }
                bufferedWriter.close();
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            o0 o0Var = this.f134815l;
            if (o0Var == null) {
                throw new BuildException("srcdir attribute must be set", w1());
            }
            if (!P2(o0Var).findAny().isPresent()) {
                throw new BuildException("srcdir attribute must be non-empty", w1());
            }
            if (this.f134816m == null) {
                this.f134816m = this.f134815l;
            }
            File file = this.f134817n;
            if (file != null && file.exists() && !this.f134817n.isDirectory()) {
                throw new BuildException("The cache, if specified, must point to a directory");
            }
            File file2 = this.f134817n;
            if (file2 != null && !file2.exists()) {
                this.f134817n.mkdirs();
            }
            N2();
            if (this.f134824u) {
                Q2();
            }
            O2();
            int iM2 = M2();
            long jCurrentTimeMillis2 = (System.currentTimeMillis() - jCurrentTimeMillis) / 1000;
            x1("Deleted " + iM2 + " out of date files in " + jCurrentTimeMillis2 + " seconds", iM2 > 0 ? 2 : 4);
        } catch (Exception e10) {
            throw new BuildException(e10);
        }
    }

    public o0 K2() {
        if (this.f134825v == null) {
            this.f134825v = new o0(b());
        }
        return this.f134825v.u2();
    }

    public o0 U2() {
        return this.f134825v;
    }

    protected void j3(File file, String[] strArr) {
        for (String str : strArr) {
            File file2 = new File(file, str);
            if (str.endsWith(".java")) {
                String path = file2.getPath();
                String strB = f.b(path.substring(file.getPath().length() + 1, path.length() - 5));
                b bVar = this.f134819p.get(strB);
                if (bVar == null) {
                    this.f134821r.put(strB, strB);
                } else if (file2.lastModified() > bVar.f134826a.lastModified()) {
                    this.f134821r.put(strB, strB);
                }
            }
        }
    }

    public void k3(File file) {
        this.f134817n = file;
    }

    public void l3(o0 o0Var) {
        o0 o0Var2 = this.f134825v;
        if (o0Var2 == null) {
            this.f134825v = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void m3(q1 q1Var) {
        K2().c2(q1Var);
    }

    public void n3(boolean z10) {
        this.f134822s = z10;
    }

    public void o3(o0 o0Var) {
        this.f134816m = o0Var;
    }

    public void p3(boolean z10) {
        this.f134824u = z10;
    }

    public void q3(o0 o0Var) {
        this.f134815l = o0Var;
    }

    public void r3(boolean z10) {
        this.f134823t = z10;
    }
}
