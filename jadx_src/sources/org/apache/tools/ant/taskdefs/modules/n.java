package org.apache.tools.ant.taskdefs.modules;

import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.spi.ToolProvider;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.j0;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.types.q1;
import org.apache.tools.ant.types.w;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.ResourceUtils;
import org.apache.tools.ant.util.b1;
import org.apache.tools.ant.util.s;

/* JADX INFO: compiled from: Link.java */
/* JADX INFO: loaded from: classes5.dex */
public class n extends u2 {
    private static final String G = "Launcher command must take the form name=module or name=module/mainclass";
    private d A;
    private c B;
    private b C;
    private boolean D;
    private l E;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private o0 f134540k;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f134548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f134549t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private j0 f134554y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private File f134555z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<g> f134541l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<g> f134542m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<e> f134543n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<f> f134544o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<h> f134545p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List<h> f134546q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List<h> f134547r = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f134550u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f134551v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f134552w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f134553x = true;
    private final List<i> F = new ArrayList();

    /* JADX INFO: compiled from: Link.java */
    public class a extends SimpleFileVisitor<Path> {
        a() {
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
            if (iOException == null) {
                Files.delete(path);
            }
            return super.postVisitDirectory(path, iOException);
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            Files.delete(path);
            return FileVisitResult.CONTINUE;
        }
    }

    /* JADX INFO: compiled from: Link.java */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f134557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<h> f134558b = new ArrayList();

        public b() {
        }

        public h a() {
            h hVar = n.this.new h();
            this.f134558b.add(hVar);
            return hVar;
        }

        public c b() {
            return this.f134557a;
        }

        public void c(String str) {
            this.f134558b.clear();
            for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                this.f134558b.add(n.this.new h(str2));
            }
        }

        public void d(c cVar) {
            this.f134557a = cVar;
        }

        public String e() {
            StringBuilder sb2 = new StringBuilder(this.f134557a.h());
            if (!this.f134558b.isEmpty()) {
                String str = ":filter=";
                for (h hVar : this.f134558b) {
                    sb2.append(str);
                    sb2.append(hVar.e());
                    str = Constants.ACCEPT_TIME_SEPARATOR_SP;
                }
            }
            return sb2.toString();
        }

        public void f() {
            if (this.f134557a == null) {
                throw new BuildException("Compression level must be specified.", n.this.w1());
            }
            this.f134558b.forEach(new org.apache.tools.ant.taskdefs.modules.e());
        }
    }

    /* JADX INFO: compiled from: Link.java */
    public static class c extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Map<String, String> f134560c;

        static {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("0", "0");
            linkedHashMap.put("1", "1");
            linkedHashMap.put("2", "2");
            linkedHashMap.put("none", "0");
            linkedHashMap.put("strings", "1");
            linkedHashMap.put("zip", "2");
            f134560c = Collections.unmodifiableMap(linkedHashMap);
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return (String[]) f134560c.keySet().toArray(new String[0]);
        }

        String h() {
            return f134560c.get(d());
        }
    }

    /* JADX INFO: compiled from: Link.java */
    public static class d extends w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"little", "big"};
        }
    }

    /* JADX INFO: compiled from: Link.java */
    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f134561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f134562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f134563c;

        public e() {
        }

        public e(String str) {
            Objects.requireNonNull(str, "Text cannot be null");
            int iLastIndexOf = str.lastIndexOf(61);
            if (iLastIndexOf < 1) {
                throw new BuildException(n.G);
            }
            f(str.substring(0, iLastIndexOf));
            int iIndexOf = str.indexOf(47, iLastIndexOf);
            if (iIndexOf < 0) {
                e(str.substring(iLastIndexOf + 1));
                return;
            }
            int i10 = iLastIndexOf + 1;
            if (iIndexOf <= i10 || iIndexOf >= str.length() - 1) {
                throw new BuildException(n.G);
            }
            e(str.substring(i10, iIndexOf));
            d(str.substring(iIndexOf + 1));
        }

        public String a() {
            return this.f134563c;
        }

        public String b() {
            return this.f134562b;
        }

        public String c() {
            return this.f134561a;
        }

        public void d(String str) {
            this.f134563c = str;
        }

        public void e(String str) {
            this.f134562b = str;
        }

        public void f(String str) {
            this.f134561a = str;
        }

        public void g() {
            String str = this.f134561a;
            if (str == null || str.isEmpty()) {
                throw new BuildException("Launcher must have a name", n.this.w1());
            }
            String str2 = this.f134562b;
            if (str2 == null || str2.isEmpty()) {
                throw new BuildException("Launcher must have specify a module", n.this.w1());
            }
        }

        public String toString() {
            if (this.f134563c == null) {
                return this.f134561a + ContainerUtils.KEY_VALUE_DELIMITER + this.f134562b;
            }
            return this.f134561a + ContainerUtils.KEY_VALUE_DELIMITER + this.f134562b + "/" + this.f134563c;
        }
    }

    /* JADX INFO: compiled from: Link.java */
    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f134565a;

        public f() {
        }

        public f(String str) {
            b(str);
        }

        public String a() {
            return this.f134565a;
        }

        public void b(String str) {
            this.f134565a = str;
        }

        public void c() {
            if (this.f134565a == null) {
                throw new BuildException("name is required for locale.", n.this.w1());
            }
        }
    }

    /* JADX INFO: compiled from: Link.java */
    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f134567a;

        public g() {
        }

        public g(String str) {
            b(str);
        }

        public String a() {
            return this.f134567a;
        }

        public void b(String str) {
            this.f134567a = str;
        }

        public void c() {
            if (this.f134567a == null) {
                throw new BuildException("name is required for module.", n.this.w1());
            }
        }
    }

    /* JADX INFO: compiled from: Link.java */
    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f134569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f134570b;

        public h() {
        }

        public h(String str) {
            if (str.startsWith("@")) {
                c(new File(str.substring(1)));
            } else {
                d(str);
            }
        }

        public File a() {
            return this.f134570b;
        }

        public String b() {
            return this.f134569a;
        }

        public void c(File file) {
            this.f134570b = file;
        }

        public void d(String str) {
            this.f134569a = str;
        }

        public String e() {
            String str = this.f134569a;
            if (str != null) {
                return str;
            }
            return "@" + this.f134570b;
        }

        public void f() {
            String str = this.f134569a;
            if ((str == null && this.f134570b == null) || (str != null && this.f134570b != null)) {
                throw new BuildException("Each entry in a pattern list must specify exactly one of pattern or file.", n.this.w1());
            }
        }
    }

    /* JADX INFO: compiled from: Link.java */
    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f134572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<j> f134573b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<k> f134574c = new ArrayList();

        public i() {
        }

        public j a() {
            j jVar = n.this.new j();
            this.f134573b.add(jVar);
            return jVar;
        }

        public k b() {
            k kVar = n.this.new k();
            this.f134574c.add(kVar);
            return kVar;
        }

        public File c() {
            return this.f134572a;
        }

        public void d(String str) {
            for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                this.f134574c.add(n.this.new k(str2));
            }
        }

        public void e(File file) {
            this.f134572a = file;
        }

        public Collection<String> f() {
            ArrayList arrayList = new ArrayList();
            if (this.f134572a != null) {
                arrayList.add("--release-info=" + this.f134572a);
            }
            if (!this.f134573b.isEmpty()) {
                StringBuilder sb2 = new StringBuilder("--release-info=add");
                Iterator<j> it = this.f134573b.iterator();
                while (it.hasNext()) {
                    Properties propertiesI = it.next().i();
                    for (String str : propertiesI.stringPropertyNames()) {
                        sb2.append(":");
                        sb2.append(str);
                        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                        sb2.append(propertiesI.getProperty(str));
                    }
                }
                arrayList.add(sb2.toString());
            }
            if (!this.f134574c.isEmpty()) {
                StringBuilder sb3 = new StringBuilder("--release-info=del:keys=");
                String str2 = "";
                for (k kVar : this.f134574c) {
                    sb3.append(str2);
                    sb3.append(kVar.a());
                    str2 = Constants.ACCEPT_TIME_SEPARATOR_SP;
                }
                arrayList.add(sb3.toString());
            }
            return arrayList;
        }

        public void g() {
            this.f134573b.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.modules.o
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((n.j) obj).j();
                }
            });
            this.f134574c.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.modules.p
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((n.k) obj).c();
                }
            });
        }
    }

    /* JADX INFO: compiled from: Link.java */
    public class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f134576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f134577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f134578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f134579d = StandardCharsets.ISO_8859_1.name();

        public j() {
        }

        public j(String str, String str2) {
            g(str);
            h(str2);
        }

        public String a() {
            return this.f134579d;
        }

        public File b() {
            return this.f134578c;
        }

        public String c() {
            return this.f134576a;
        }

        public String d() {
            return this.f134577b;
        }

        public void e(String str) {
            this.f134579d = str;
        }

        public void f(File file) {
            this.f134578c = file;
        }

        public void g(String str) {
            this.f134576a = str;
        }

        public void h(String str) {
            this.f134577b = str;
        }

        public Properties i() {
            Properties properties = new Properties();
            File file = this.f134578c;
            if (file != null) {
                try {
                    BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(file.toPath(), Charset.forName(this.f134579d));
                    try {
                        properties.load(bufferedReaderNewBufferedReader);
                        if (bufferedReaderNewBufferedReader != null) {
                            bufferedReaderNewBufferedReader.close();
                        }
                    } catch (Throwable th2) {
                        if (bufferedReaderNewBufferedReader != null) {
                            try {
                                bufferedReaderNewBufferedReader.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (IOException e10) {
                    throw new BuildException("Cannot read release info file \"" + this.f134578c + "\": " + e10, e10, n.this.w1());
                }
            } else {
                properties.setProperty(this.f134576a, this.f134577b);
            }
            return properties;
        }

        public void j() {
            File file = this.f134578c;
            if (file == null && (this.f134576a == null || this.f134577b == null)) {
                throw new BuildException("Release info must define 'key' and 'value' attributes, or a 'file' attribute.", n.this.w1());
            }
            if (file != null && (this.f134576a != null || this.f134577b != null)) {
                throw new BuildException("Release info cannot define both a file attribute and key/value attributes.", n.this.w1());
            }
            String str = this.f134579d;
            if (str == null) {
                throw new BuildException("Charset cannot be null.", n.this.w1());
            }
            try {
                Charset.forName(str);
            } catch (IllegalArgumentException e10) {
                throw new BuildException(e10, n.this.w1());
            }
        }
    }

    /* JADX INFO: compiled from: Link.java */
    public class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f134581a;

        public k() {
        }

        public k(String str) {
            b(str);
        }

        public String a() {
            return this.f134581a;
        }

        public void b(String str) {
            this.f134581a = str;
        }

        public void c() {
            if (this.f134581a == null) {
                throw new BuildException("Release info key must define a 'key' attribute.", n.this.w1());
            }
        }
    }

    /* JADX INFO: compiled from: Link.java */
    public static class l extends w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"client", "server", "minimal", "all"};
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J2(s sVar, Path path) {
        sVar.a(new b1(path.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ BuildException K2() {
        return new BuildException("jlink tool not found in JDK.", w1());
    }

    private Collection<String> k2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("--output");
        arrayList.add(this.f134555z.toString());
        arrayList.add("--module-path");
        arrayList.add(this.f134540k.toString());
        arrayList.add("--add-modules");
        arrayList.add((String) this.f134541l.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.modules.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((n.g) obj).a();
            }
        }).collect(Collectors.joining(Constants.ACCEPT_TIME_SEPARATOR_SP)));
        if (!this.f134542m.isEmpty()) {
            arrayList.add("--limit-modules");
            arrayList.add((String) this.f134542m.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.modules.l
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((n.g) obj).a();
                }
            }).collect(Collectors.joining(Constants.ACCEPT_TIME_SEPARATOR_SP)));
        }
        if (!this.f134544o.isEmpty()) {
            arrayList.add("--include-locales=" + ((String) this.f134544o.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.modules.m
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((n.f) obj).a();
                }
            }).collect(Collectors.joining(Constants.ACCEPT_TIME_SEPARATOR_SP))));
        }
        for (e eVar : this.f134543n) {
            arrayList.add("--launcher");
            arrayList.add(eVar.toString());
        }
        if (!this.f134545p.isEmpty()) {
            arrayList.add("--order-resources=" + ((String) this.f134545p.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.modules.k
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((n.h) obj).e();
                }
            }).collect(Collectors.joining(Constants.ACCEPT_TIME_SEPARATOR_SP))));
        }
        if (!this.f134546q.isEmpty()) {
            arrayList.add("--exclude-files=" + ((String) this.f134546q.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.modules.k
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((n.h) obj).e();
                }
            }).collect(Collectors.joining(Constants.ACCEPT_TIME_SEPARATOR_SP))));
        }
        if (!this.f134547r.isEmpty()) {
            arrayList.add("--exclude-resources=" + ((String) this.f134547r.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.modules.k
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((n.h) obj).e();
                }
            }).collect(Collectors.joining(Constants.ACCEPT_TIME_SEPARATOR_SP))));
        }
        if (this.f134548s) {
            arrayList.add("--bind-services");
        }
        if (this.f134549t) {
            arrayList.add("--ignore-signing-information");
        }
        if (!this.f134550u) {
            arrayList.add("--no-header-files");
        }
        if (!this.f134551v) {
            arrayList.add("--no-man-pages");
        }
        if (!this.f134552w) {
            arrayList.add("--strip-native-commands");
        }
        if (!this.f134553x) {
            arrayList.add("--strip-debug");
        }
        if (this.f134554y != null) {
            arrayList.add("--verbose");
        }
        if (this.A != null) {
            arrayList.add("--endian");
            arrayList.add(this.A.d());
        }
        if (this.B != null) {
            if (this.C != null) {
                throw new BuildException("compressionLevel attribute and <compression> child element cannot both be present.", w1());
            }
            arrayList.add("--compress=" + this.B.h());
        }
        b bVar = this.C;
        if (bVar != null) {
            bVar.f();
            arrayList.add("--compress=" + this.C.e());
        }
        if (this.E != null) {
            arrayList.add("--vm=" + this.E.d());
        }
        if (this.D) {
            arrayList.add("--dedup-legal-notices=error-if-not-same-content");
        }
        for (i iVar : this.F) {
            iVar.g();
            arrayList.addAll(iVar.f());
        }
        return arrayList;
    }

    private void v2(Path path) {
        try {
            Files.walkFileTree(path, new a());
        } catch (IOException e10) {
            throw new BuildException("Could not delete \"" + path + "\": " + e10, e10, w1());
        }
    }

    public File A2() {
        return this.f134555z;
    }

    public d B2() {
        return this.A;
    }

    public boolean C2() {
        return this.f134549t;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f134555z == null) {
            throw new BuildException("Destination directory is required.", w1());
        }
        o0 o0Var = this.f134540k;
        if (o0Var == null || o0Var.isEmpty()) {
            throw new BuildException("Module path is required.", w1());
        }
        if (this.f134541l.isEmpty()) {
            throw new BuildException("At least one module must be specified.", w1());
        }
        if (this.f134555z.exists()) {
            final s sVar = new s();
            try {
                Stream<Path> streamWalk = Files.walk(this.f134555z.toPath(), new FileVisitOption[0]);
                try {
                    streamWalk.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.modules.g
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            n.J2(sVar, (Path) obj);
                        }
                    });
                    if (ResourceUtils.y(this, this.f134540k, sVar, b(), org.apache.tools.ant.util.j0.O().M()).isEmpty()) {
                        x1("Skipping image creation, since \"" + this.f134555z + "\" is already newer than all constituent modules.", 3);
                        streamWalk.close();
                        return;
                    }
                    streamWalk.close();
                } catch (Throwable th2) {
                    if (streamWalk != null) {
                        try {
                            streamWalk.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                throw new BuildException("Could not scan \"" + this.f134555z + "\" for being up-to-date: " + e10, e10, w1());
            }
            throw new BuildException("Could not scan \"" + this.f134555z + "\" for being up-to-date: " + e10, e10, w1());
        }
        this.f134541l.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.modules.h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((n.g) obj).c();
            }
        });
        this.f134542m.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.modules.h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((n.g) obj).c();
            }
        });
        this.f134543n.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.modules.i
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((n.e) obj).g();
            }
        });
        this.f134544o.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.modules.j
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((n.f) obj).c();
            }
        });
        this.f134545p.forEach(new org.apache.tools.ant.taskdefs.modules.e());
        this.f134546q.forEach(new org.apache.tools.ant.taskdefs.modules.e());
        this.f134547r.forEach(new org.apache.tools.ant.taskdefs.modules.e());
        Collection<String> collectionK2 = k2();
        ToolProvider toolProvider = (ToolProvider) ToolProvider.findFirst("jlink").orElseThrow(new Supplier() { // from class: org.apache.tools.ant.taskdefs.modules.f
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f134538a.K2();
            }
        });
        if (this.f134555z.exists()) {
            x1("Deleting existing " + this.f134555z, 3);
            v2(this.f134555z.toPath());
        }
        x1("Executing: jlink " + com.max.xiaoheihe.module.bbs.post_edit.o.a(" ", collectionK2), 3);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        try {
            PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
            try {
                int iRun = toolProvider.run(printStream, printStream2, (String[]) collectionK2.toArray(new String[0]));
                printStream2.close();
                printStream.close();
                if (iRun != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("jlink failed (exit code ");
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
                }
                j0 j0Var = this.f134554y;
                if (j0Var != null) {
                    int iH = j0Var.h();
                    if (byteArrayOutputStream.size() > 0) {
                        x1(byteArrayOutputStream.toString(), iH);
                    }
                    if (byteArrayOutputStream2.size() > 0) {
                        x1(byteArrayOutputStream2.toString(), iH);
                    }
                }
                x1("Created " + this.f134555z.getAbsolutePath(), 2);
            } catch (Throwable th4) {
                try {
                    printStream2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            try {
                printStream.close();
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    public boolean D2() {
        return this.f134550u;
    }

    public boolean E2() {
        return this.f134551v;
    }

    public boolean F2() {
        return this.f134552w;
    }

    public o0 G2() {
        return this.f134540k;
    }

    public j0 H2() {
        return this.f134554y;
    }

    public l I2() {
        return this.E;
    }

    public void L2(boolean z10) {
        this.f134548s = z10;
    }

    public void M2(boolean z10) {
        this.D = z10;
    }

    public void N2(c cVar) {
        this.B = cVar;
    }

    public void O2(boolean z10) {
        this.f134553x = z10;
    }

    public void P2(File file) {
        this.f134555z = file;
    }

    public void Q2(d dVar) {
        this.A = dVar;
    }

    public void R2(String str) {
        for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            this.f134546q.add(new h(str2));
        }
    }

    public void S2(String str) {
        for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            this.f134547r.add(new h(str2));
        }
    }

    public void T2(boolean z10) {
        this.f134549t = z10;
    }

    public void U2(boolean z10) {
        this.f134550u = z10;
    }

    public void V2(boolean z10) {
        this.f134551v = z10;
    }

    public void W2(boolean z10) {
        this.f134552w = z10;
    }

    public void X2(String str) {
        for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            this.f134543n.add(new e(str2));
        }
    }

    public void Y2(String str) {
        for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            this.f134544o.add(new f(str2));
        }
    }

    public void Z2(o0 o0Var) {
        o0 o0Var2 = this.f134540k;
        if (o0Var2 == null) {
            this.f134540k = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void a3(q1 q1Var) {
        r2().c2(q1Var);
    }

    public void b3(String str) {
        for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            this.f134541l.add(new g(str2));
        }
    }

    public void c3(String str) {
        for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            this.f134542m.add(new g(str2));
        }
    }

    public void d3(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            arrayList.add(new h(str2));
        }
        this.f134545p.addAll(0, arrayList);
    }

    public void e3(j0 j0Var) {
        this.f134554y = j0Var;
    }

    public void f3(l lVar) {
        this.E = lVar;
    }

    public b l2() {
        if (this.C != null) {
            throw new BuildException("Only one nested compression element is permitted.", w1());
        }
        b bVar = new b();
        this.C = bVar;
        return bVar;
    }

    public h m2() {
        h hVar = new h();
        this.f134546q.add(hVar);
        return hVar;
    }

    public h n2() {
        h hVar = new h();
        this.f134547r.add(hVar);
        return hVar;
    }

    public e o2() {
        e eVar = new e();
        this.f134543n.add(eVar);
        return eVar;
    }

    public f p2() {
        f fVar = new f();
        this.f134544o.add(fVar);
        return fVar;
    }

    public g q2() {
        g gVar = new g();
        this.f134541l.add(gVar);
        return gVar;
    }

    public o0 r2() {
        if (this.f134540k == null) {
            this.f134540k = new o0(b());
        }
        return this.f134540k.u2();
    }

    public g s2() {
        g gVar = new g();
        this.f134542m.add(gVar);
        return gVar;
    }

    public i t2() {
        i iVar = new i();
        this.F.add(iVar);
        return iVar;
    }

    public h u2() {
        h hVar = new h();
        this.f134545p.add(hVar);
        return hVar;
    }

    public boolean w2() {
        return this.f134548s;
    }

    public boolean x2() {
        return this.D;
    }

    public c y2() {
        return this.B;
    }

    public boolean z2() {
        return this.f134553x;
    }
}
