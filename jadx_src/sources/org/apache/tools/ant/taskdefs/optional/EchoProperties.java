package org.apache.tools.ant.taskdefs.optional;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.r3;
import org.apache.tools.ant.types.j1;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.s0;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes5.dex */
public class EchoProperties extends u2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f134643r = "properties";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f134644s = "property";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f134645t = "name";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f134646u = "value";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f134647k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f134648l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f134649m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<j1> f134650n = new Vector();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f134651o = "text";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f134652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f134653q;

    public static class a extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f134656c = {"xml", "text"};

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return this.f134656c;
        }
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f134657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f134658c;

        private b(String str, String str2) {
            this.f134657b = str;
            this.f134658c = str2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Comparator.naturalOrder().compare(this.f134657b, bVar.f134657b);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f134657b, bVar.f134657b) && Objects.equals(this.f134658c, bVar.f134658c);
        }

        public int hashCode() {
            return Objects.hash(this.f134657b);
        }
    }

    private OutputStream l2() throws IOException {
        File file = this.f134648l;
        if (file == null) {
            return new r3(this);
        }
        if (file.exists() && this.f134648l.isDirectory()) {
            if (this.f134649m) {
                throw new BuildException("destfile is a directory!", w1());
            }
            x1("destfile is a directory!", 0);
            return null;
        }
        if (!this.f134648l.exists() || this.f134648l.canWrite()) {
            return Files.newOutputStream(this.f134648l.toPath(), new OpenOption[0]);
        }
        if (this.f134649m) {
            throw new BuildException("Can not write to the specified destfile!", w1());
        }
        x1("Can not write to the specified destfile!", 0);
        return null;
    }

    private static DocumentBuilder m2() {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (Exception e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o2(Properties properties, Object obj, Object obj2) {
        properties.put(String.valueOf(obj), String.valueOf(obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b p2(Properties properties, String str) {
        return new b(str, properties.getProperty(str));
    }

    private List<b> x2(final Properties properties) {
        return (List) properties.stringPropertyNames().stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EchoProperties.p2(properties, (String) obj);
            }
        }).sorted().collect(Collectors.toList());
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f134652p != null && this.f134653q != null) {
            throw new BuildException("Please specify either prefix or regex, but not both", w1());
        }
        final Hashtable<Object, Object> hashtable = new Hashtable<>();
        if (this.f134647k == null && this.f134650n.isEmpty()) {
            hashtable.putAll(b().t0());
        } else {
            File file = this.f134647k;
            if (file != null) {
                if (file.isDirectory()) {
                    if (this.f134649m) {
                        throw new BuildException("srcfile is a directory!", w1());
                    }
                    x1("srcfile is a directory!", 0);
                    return;
                }
                if (this.f134647k.exists() && !this.f134647k.canRead()) {
                    if (this.f134649m) {
                        throw new BuildException("Can not read from the specified srcfile!", w1());
                    }
                    x1("Can not read from the specified srcfile!", 0);
                    return;
                }
                try {
                    InputStream inputStreamNewInputStream = Files.newInputStream(this.f134647k.toPath(), new OpenOption[0]);
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamNewInputStream);
                        hashtable.putAll(properties);
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
                } catch (FileNotFoundException e10) {
                    String str = "Could not find file " + this.f134647k.getAbsolutePath();
                    if (this.f134649m) {
                        throw new BuildException(str, e10, w1());
                    }
                    x1(str, 1);
                    return;
                } catch (IOException e11) {
                    String str2 = "Could not read file " + this.f134647k.getAbsolutePath();
                    if (this.f134649m) {
                        throw new BuildException(str2, e11, w1());
                    }
                    x1(str2, 1);
                    return;
                }
            }
        }
        this.f134650n.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((j1) obj).A2();
            }
        }).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hashtable.putAll((Properties) obj);
            }
        });
        try {
            OutputStream outputStreamL2 = l2();
            if (outputStreamL2 != null) {
                try {
                    q2(hashtable, outputStreamL2);
                } catch (Throwable th4) {
                    try {
                        outputStreamL2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
            if (outputStreamL2 != null) {
                outputStreamL2.close();
            }
        } catch (IOException e12) {
            if (this.f134649m) {
                throw new BuildException(e12, w1());
            }
            x1(e12.getMessage(), 2);
        }
    }

    public void k2(j1 j1Var) {
        this.f134650n.add(j1Var);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void n2(java.util.Properties r3, java.io.OutputStream r4, java.lang.String r5) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "Failed to close output stream"
            r3.store(r4, r5)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            if (r4 == 0) goto Le
            r4.close()     // Catch: java.io.IOException -> Lb
            goto Le
        Lb:
            r2.log(r0)
        Le:
            return
        Lf:
            r3 = move-exception
            goto L1c
        L11:
            r3 = move-exception
            org.apache.tools.ant.BuildException r5 = new org.apache.tools.ant.BuildException     // Catch: java.lang.Throwable -> Lf
            org.apache.tools.ant.Location r1 = r2.w1()     // Catch: java.lang.Throwable -> Lf
            r5.<init>(r3, r1)     // Catch: java.lang.Throwable -> Lf
            throw r5     // Catch: java.lang.Throwable -> Lf
        L1c:
            if (r4 == 0) goto L25
            r4.close()     // Catch: java.io.IOException -> L22
            goto L25
        L22:
            r2.log(r0)
        L25:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tools.ant.taskdefs.optional.EchoProperties.n2(java.util.Properties, java.io.OutputStream, java.lang.String):void");
    }

    protected void q2(Hashtable<Object, Object> hashtable, OutputStream outputStream) throws IOException, BuildException {
        final ArrayList arrayList = new ArrayList(hashtable.keySet());
        final Properties properties = new Properties() { // from class: org.apache.tools.ant.taskdefs.optional.EchoProperties.1
            private static final long serialVersionUID = 5090936442309201654L;

            @Override // java.util.Hashtable, java.util.Map
            public Set<Map.Entry<Object, Object>> entrySet() {
                Set<Map.Entry<Object, Object>> setEntrySet = super.entrySet();
                if (!s0.r()) {
                    return setEntrySet;
                }
                TreeSet treeSet = new TreeSet(Comparator.comparing(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.k
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((Map.Entry) obj).getKey();
                    }
                }.andThen(new l())));
                treeSet.addAll(setEntrySet);
                return treeSet;
            }

            @Override // java.util.Hashtable, java.util.Dictionary
            public Enumeration<Object> keys() {
                return (Enumeration) arrayList.stream().sorted(Comparator.comparing(new l())).collect(Collectors.collectingAndThen(Collectors.toList(), new org.apache.tools.ant.c()));
            }
        };
        hashtable.forEach(new BiConsumer() { // from class: org.apache.tools.ant.taskdefs.optional.i
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                EchoProperties.o2(properties, obj, obj2);
            }
        });
        if ("text".equals(this.f134651o)) {
            n2(properties, outputStream, "Ant properties");
        } else if ("xml".equals(this.f134651o)) {
            y2(properties, outputStream);
        }
    }

    public void r2(File file) {
        this.f134648l = file;
    }

    public void s2(boolean z10) {
        this.f134649m = z10;
    }

    public void t2(a aVar) {
        this.f134651o = aVar.d();
    }

    public void u2(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f134652p = str;
        j1 j1Var = new j1();
        j1Var.J(b());
        j1Var.s2(str);
        k2(j1Var);
    }

    public void v2(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f134653q = str;
        j1 j1Var = new j1();
        j1Var.J(b());
        j1Var.t2(str);
        k2(j1Var);
    }

    public void w2(File file) {
        this.f134647k = file;
    }

    protected void y2(Properties properties, OutputStream outputStream) throws IOException {
        Document documentNewDocument = m2().newDocument();
        Element elementCreateElement = documentNewDocument.createElement(f134643r);
        for (b bVar : x2(properties)) {
            Element elementCreateElement2 = documentNewDocument.createElement("property");
            elementCreateElement2.setAttribute("name", bVar.f134657b);
            elementCreateElement2.setAttribute("value", bVar.f134658c);
            elementCreateElement.appendChild(elementCreateElement2);
        }
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
            try {
                outputStreamWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
                new org.apache.tools.ant.util.y().q(elementCreateElement, outputStreamWriter, 0, "\t");
                outputStreamWriter.flush();
                outputStreamWriter.close();
            } catch (Throwable th2) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("Unable to write XML file", e10);
        }
    }
}
