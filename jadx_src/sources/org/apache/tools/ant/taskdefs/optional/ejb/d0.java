package org.apache.tools.ant.taskdefs.optional.ejb;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.stream.Collectors;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.v2;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.u2;
import org.xml.sax.InputSource;

/* JADX INFO: compiled from: WeblogicDeploymentTool.java */
/* JADX INFO: loaded from: classes5.dex */
public class d0 extends h {
    public static final String L = "-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 1.1//EN";
    public static final String M = "-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 2.0//EN";
    public static final String N = "-//BEA Systems, Inc.//DTD WebLogic 5.1.0 EJB//EN";
    public static final String O = "-//BEA Systems, Inc.//DTD WebLogic 6.0.0 EJB//EN";
    public static final String P = "-//BEA Systems, Inc.//DTD WebLogic 7.0.0 EJB//EN";
    protected static final String Q = "/weblogic/ejb/deployment/xml/ejb-jar.dtd";
    protected static final String R = "/weblogic/ejb20/dd/xml/ejb11-jar.dtd";
    protected static final String S = "/weblogic/ejb20/dd/xml/ejb20-jar.dtd";
    protected static final String T = "/weblogic/ejb/deployment/xml/weblogic-ejb-jar.dtd";
    protected static final String U = "/weblogic/ejb20/dd/xml/weblogic510-ejb-jar.dtd";
    protected static final String V = "/weblogic/ejb20/dd/xml/weblogic600-ejb-jar.dtd";
    protected static final String W = "/weblogic/ejb20/dd/xml/weblogic700-ejb-jar.dtd";
    protected static final String X = "default";
    protected static final String Y = "weblogic-ejb-jar.xml";
    protected static final String Z = "weblogic-cmp-rdbms-jar.xml";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected static final String f134908a0 = "weblogic.ejbc";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected static final String f134909b0 = "weblogic.ejbc20";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f134910c0 = org.apache.tools.ant.util.j0.O();
    private File K;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f134912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f134913x;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f134911v = ".jar";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f134914y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f134915z = null;
    private String A = "";
    private String B = "";
    private boolean C = false;
    private String D = null;
    private boolean E = true;
    private boolean F = false;
    private boolean G = false;
    private o0 H = null;
    private List<org.apache.tools.ant.types.z.a> I = new Vector();
    private Integer J = null;

    /* JADX INFO: compiled from: WeblogicDeploymentTool.java */
    public class a extends e {
        final /* synthetic */ File I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u2 u2Var, File file, File file2) {
            super(u2Var, file);
            this.I = file2;
        }

        @Override // org.apache.tools.ant.taskdefs.optional.ejb.e
        protected void d() {
            if ("type-storage".equals(this.f134932e)) {
                this.f134934g.put(this.f134933f, new File(this.I, this.f134933f.substring(9)));
            }
        }
    }

    private void N(File file, File file2, String str) {
        if (this.F) {
            try {
                f134910c0.l(file, file2);
                if (this.f134914y) {
                    return;
                }
                file.delete();
                return;
            } catch (IOException e10) {
                throw new BuildException("Unable to write EJB jar", e10);
            }
        }
        String str2 = this.f134915z;
        try {
            final v2 v2Var = new v2(u());
            v2Var.g2("ejbc");
            v2Var.t2().H1(this.B);
            this.I.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.a0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    v2Var.m2((org.apache.tools.ant.types.z.a) obj);
                }
            });
            if (R() != null) {
                v2Var.t2().H1(" -Dweblogic.StdoutSeverityLevel=" + this.J);
            }
            if (str2 == null) {
                if ("-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 1.1//EN".equals(str)) {
                    str2 = f134908a0;
                } else if ("-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 2.0//EN".equals(str)) {
                    str2 = f134909b0;
                } else {
                    x("Unrecognized publicId " + str + " - using EJB 1.1 compiler", 1);
                    str2 = f134908a0;
                }
            }
            v2Var.K2(str2);
            v2Var.q2().H1(this.A);
            if (this.f134914y) {
                v2Var.q2().O1("-keepgenerated");
            }
            String str3 = this.D;
            if (str3 == null) {
                if ("jikes".equals(u().b().u0("build.compiler"))) {
                    v2Var.q2().O1("-compiler");
                    v2Var.q2().O1("jikes");
                }
            } else if (!"default".equals(str3)) {
                v2Var.q2().O1("-compiler");
                v2Var.q2().H1(this.D);
            }
            o0 o0VarM = m();
            if (this.H != null && o0VarM != null && !o0VarM.toString().trim().isEmpty()) {
                v2Var.q2().O1("-classpath");
                v2Var.q2().I1(o0VarM);
            }
            v2Var.q2().O1(file.getPath());
            if (this.K == null) {
                v2Var.q2().O1(file2.getPath());
            } else {
                v2Var.q2().O1(this.K.getPath());
            }
            o0 o0VarM2 = this.H;
            if (o0VarM2 == null) {
                o0VarM2 = m();
            }
            v2Var.S2(true);
            if (o0VarM2 != null) {
                v2Var.L2(o0VarM2);
            }
            x("Calling " + str2 + " for " + file.toString(), 3);
            if (v2Var.y2() == 0) {
            } else {
                throw new BuildException("Ejbc reported an error");
            }
        } catch (Exception e11) {
            throw new BuildException("Exception while calling " + str2 + ". Details: " + e11.toString(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U(e eVar, g.c cVar) {
        eVar.e(cVar.c(), cVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String V(JarEntry jarEntry) {
        return jarEntry.getName().replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JarEntry W(JarEntry jarEntry) {
        return jarEntry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JarEntry X(JarEntry jarEntry, JarEntry jarEntry2) {
        return jarEntry2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JarEntry Y(JarEntry jarEntry) {
        return jarEntry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JarEntry Z(JarEntry jarEntry, JarEntry jarEntry2) {
        return jarEntry2;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void A(e eVar) {
        eVar.e("-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 1.1//EN", Q);
        eVar.e("-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 1.1//EN", R);
        eVar.e("-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 1.1//EN", this.f134913x);
        eVar.e("-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 2.0//EN", S);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void F(String str, File file, Hashtable<String, File> hashtable, String str2) throws BuildException {
        File fileW = super.w(str);
        super.F(str, fileW, hashtable, str2);
        if (this.E || T(fileW, file)) {
            N(fileW, file, str2);
        }
        if (this.C) {
            return;
        }
        x("deleting generic jar " + fileW.toString(), 3);
        fileW.delete();
    }

    public void M(org.apache.tools.ant.types.z.a aVar) {
        this.I.add(aVar);
    }

    public o0 O() {
        if (this.H == null) {
            this.H = new o0(u().b());
        }
        return this.H.u2();
    }

    protected ClassLoader P(File file) throws IOException {
        o0 o0Var = new o0(u().b());
        o0Var.C2(file);
        o0 o0VarM = m();
        if (o0VarM != null) {
            o0Var.n2(o0VarM);
        }
        return u().b().z(o0Var);
    }

    public String Q() {
        return this.f134915z;
    }

    public Integer R() {
        return this.J;
    }

    protected e S(File file) {
        final a aVar = new a(u(), file, file);
        aVar.e(N, T);
        aVar.e(N, U);
        aVar.e(O, V);
        aVar.e(P, W);
        aVar.e(N, this.f134912w);
        aVar.e(O, this.f134912w);
        n().f134958h.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.c0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                d0.U(aVar, (g.c) obj);
            }
        });
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0333  */
    /* JADX WARN: Code duplicated, block: B:141:0x0320 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0311: MOVE (r0 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:126:0x0310 */
    protected boolean T(File file, File file2) throws Throwable {
        Throwable th2;
        File file3;
        JarFile jarFile;
        File file4;
        ClassLoader classLoaderP;
        JarFile jarFile2;
        JarOutputStream jarOutputStream;
        JarOutputStream jarOutputStream2;
        JarFile jarFile3;
        File file5;
        boolean z10;
        JarFile jarFile4;
        boolean z11;
        boolean z12;
        File file6;
        JarOutputStream jarOutputStream3;
        InputStream inputStream;
        try {
            try {
                int i10 = 3;
                x("Checking if weblogic Jar needs to be rebuilt for jar " + file2.getName(), 3);
                if (file.exists() && file.isFile() && file2.exists() && file2.isFile()) {
                    JarFile jarFile5 = new JarFile(file);
                    try {
                        jarFile2 = new JarFile(file2);
                        try {
                            HashMap map = new HashMap();
                            Map map2 = (Map) jarFile5.stream().collect(Collectors.toMap(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.u
                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return d0.V((JarEntry) obj);
                                }
                            }, new Function() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.v
                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return d0.W((JarEntry) obj);
                                }
                            }, new BinaryOperator() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.w
                                @Override // java.util.function.BiFunction
                                public final Object apply(Object obj, Object obj2) {
                                    return d0.X((JarEntry) obj, (JarEntry) obj2);
                                }
                            }));
                            Map map3 = (Map) jarFile2.stream().collect(Collectors.toMap(new x(), new Function() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.y
                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return d0.Y((JarEntry) obj);
                                }
                            }, new BinaryOperator() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.z
                                @Override // java.util.function.BiFunction
                                public final Object apply(Object obj, Object obj2) {
                                    return d0.Z((JarEntry) obj, (JarEntry) obj2);
                                }
                            }));
                            classLoaderP = P(file);
                            try {
                                Iterator it = map2.keySet().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z12 = false;
                                        break;
                                    }
                                    String str = (String) it.next();
                                    if (map3.containsKey(str)) {
                                        JarEntry jarEntry = (JarEntry) map2.get(str);
                                        JarEntry jarEntry2 = (JarEntry) map3.get(str);
                                        if (jarEntry.getCrc() != jarEntry2.getCrc() || jarEntry.getSize() != jarEntry2.getSize()) {
                                            if (jarEntry.getName().endsWith(".class")) {
                                                String strReplace = jarEntry.getName().replace(File.separatorChar, lg.a.f131414g).replace(IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g);
                                                Class<?> clsLoadClass = classLoaderP.loadClass(strReplace.substring(0, strReplace.lastIndexOf(".class")));
                                                if (clsLoadClass.isInterface()) {
                                                    x("Interface " + clsLoadClass.getName() + " has changed", 3);
                                                } else {
                                                    map.put(str, jarEntry);
                                                }
                                            } else if (!jarEntry.getName().equals("META-INF/MANIFEST.MF")) {
                                                x("Non class file " + jarEntry.getName() + " has changed", 3);
                                            }
                                        }
                                        i10 = 3;
                                    } else {
                                        x("File " + str + " not present in weblogic jar", i10);
                                    }
                                    z12 = true;
                                    break;
                                }
                                if (z12) {
                                    x("Weblogic Jar rebuild needed due to changed interface or XML", 3);
                                    file6 = null;
                                    jarOutputStream3 = null;
                                } else {
                                    x("No rebuild needed - updating jar", 3);
                                    file6 = new File(file2.getAbsolutePath() + ".temp");
                                    try {
                                        if (file6.exists()) {
                                            file6.delete();
                                        }
                                        JarOutputStream jarOutputStream4 = new JarOutputStream(Files.newOutputStream(file6.toPath(), new OpenOption[0]));
                                        try {
                                            jarOutputStream4.setLevel(0);
                                            for (JarEntry jarEntry3 : map3.values()) {
                                                if (jarEntry3.getCompressedSize() == -1 || jarEntry3.getCompressedSize() == jarEntry3.getSize()) {
                                                    jarOutputStream4.setLevel(0);
                                                } else {
                                                    jarOutputStream4.setLevel(9);
                                                }
                                                if (map.containsKey(jarEntry3.getName())) {
                                                    x("Updating Bean class from generic Jar " + jarEntry3.getName(), 3);
                                                    jarEntry3 = (JarEntry) map.get(jarEntry3.getName());
                                                    inputStream = jarFile5.getInputStream(jarEntry3);
                                                } else {
                                                    inputStream = jarFile2.getInputStream(jarEntry3);
                                                }
                                                jarOutputStream4.putNextEntry(new JarEntry(jarEntry3.getName()));
                                                byte[] bArr = new byte[1024];
                                                while (true) {
                                                    int i11 = inputStream.read(bArr);
                                                    if (i11 != -1) {
                                                        jarOutputStream4.write(bArr, 0, i11);
                                                    }
                                                }
                                                inputStream.close();
                                            }
                                            jarOutputStream3 = jarOutputStream4;
                                        } catch (IOException e10) {
                                            e = e10;
                                            throw new BuildException("IOException while processing ejb-jar file . Details: " + e.getMessage(), e);
                                        } catch (ClassNotFoundException e11) {
                                            e = e11;
                                            throw new BuildException("ClassNotFoundException while processing ejb-jar file. Details: " + e.getMessage(), e);
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            file3 = file6;
                                            jarFile = jarFile5;
                                            jarOutputStream = jarOutputStream4;
                                            org.apache.tools.ant.util.j0.g(jarFile);
                                            org.apache.tools.ant.util.j0.g(jarFile2);
                                            org.apache.tools.ant.util.j0.d(jarOutputStream);
                                            if (jarOutputStream != null) {
                                                try {
                                                    f134910c0.m0(file3, file2);
                                                } catch (IOException e12) {
                                                    x(e12.getMessage(), 1);
                                                }
                                            }
                                            if (!(classLoaderP instanceof org.apache.tools.ant.g)) {
                                                throw th2;
                                            }
                                            ((org.apache.tools.ant.g) classLoaderP).n();
                                            throw th2;
                                        }
                                    } catch (IOException e13) {
                                        e = e13;
                                    } catch (ClassNotFoundException e14) {
                                        e = e14;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        file3 = file6;
                                        jarFile = jarFile5;
                                        jarOutputStream = null;
                                        org.apache.tools.ant.util.j0.g(jarFile);
                                        org.apache.tools.ant.util.j0.g(jarFile2);
                                        org.apache.tools.ant.util.j0.d(jarOutputStream);
                                        if (jarOutputStream != null) {
                                            f134910c0.m0(file3, file2);
                                        }
                                        if (!(classLoaderP instanceof org.apache.tools.ant.g)) {
                                            throw th2;
                                        }
                                        ((org.apache.tools.ant.g) classLoaderP).n();
                                        throw th2;
                                    }
                                }
                                jarOutputStream2 = jarOutputStream3;
                                jarFile4 = jarFile2;
                                boolean z13 = z12;
                                file5 = file6;
                                jarFile3 = jarFile5;
                                z10 = z13;
                            } catch (IOException e15) {
                                e = e15;
                                throw new BuildException("IOException while processing ejb-jar file . Details: " + e.getMessage(), e);
                            } catch (ClassNotFoundException e16) {
                                e = e16;
                                throw new BuildException("ClassNotFoundException while processing ejb-jar file. Details: " + e.getMessage(), e);
                            } catch (Throwable th5) {
                                th2 = th5;
                                jarFile = jarFile5;
                                file3 = null;
                            }
                        } catch (IOException e17) {
                            e = e17;
                        } catch (ClassNotFoundException e18) {
                            e = e18;
                        } catch (Throwable th6) {
                            th2 = th6;
                            jarFile = jarFile5;
                            file3 = null;
                            classLoaderP = null;
                        }
                    } catch (IOException e19) {
                        e = e19;
                        throw new BuildException("IOException while processing ejb-jar file . Details: " + e.getMessage(), e);
                    } catch (ClassNotFoundException e20) {
                        e = e20;
                        throw new BuildException("ClassNotFoundException while processing ejb-jar file. Details: " + e.getMessage(), e);
                    } catch (Throwable th7) {
                        th2 = th7;
                        jarFile = jarFile5;
                        file3 = null;
                        classLoaderP = null;
                        jarFile2 = null;
                        jarOutputStream = null;
                        org.apache.tools.ant.util.j0.g(jarFile);
                        org.apache.tools.ant.util.j0.g(jarFile2);
                        org.apache.tools.ant.util.j0.d(jarOutputStream);
                        if (jarOutputStream != null) {
                            f134910c0.m0(file3, file2);
                        }
                        if (!(classLoaderP instanceof org.apache.tools.ant.g)) {
                            throw th2;
                        }
                        ((org.apache.tools.ant.g) classLoaderP).n();
                        throw th2;
                    }
                } else {
                    jarOutputStream2 = null;
                    jarFile3 = null;
                    file5 = null;
                    z10 = true;
                    classLoaderP = null;
                    jarFile4 = null;
                }
                org.apache.tools.ant.util.j0.g(jarFile3);
                org.apache.tools.ant.util.j0.g(jarFile4);
                org.apache.tools.ant.util.j0.d(jarOutputStream2);
                if (jarOutputStream2 != null) {
                    try {
                        f134910c0.m0(file5, file2);
                    } catch (IOException e21) {
                        x(e21.getMessage(), 1);
                        z11 = true;
                    }
                }
                z11 = z10;
                if (classLoaderP instanceof org.apache.tools.ant.g) {
                    ((org.apache.tools.ant.g) classLoaderP).n();
                }
                return z11;
            } catch (Throwable th8) {
                th2 = th8;
                file3 = file4;
            }
        } catch (IOException e22) {
            e = e22;
        } catch (ClassNotFoundException e23) {
            e = e23;
        } catch (Throwable th9) {
            th2 = th9;
            file3 = null;
            jarFile = null;
        }
    }

    public void a0(String str) {
        this.A = str;
    }

    public void b0(String str) {
        this.D = str;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h, org.apache.tools.ant.taskdefs.optional.ejb.f
    public void c() throws BuildException {
        super.c();
    }

    public void c0(String str) {
        this.f134913x = str;
    }

    public void d0(String str) {
        this.f134915z = str;
    }

    public void e0(Integer num) {
        this.J = num;
    }

    public void f0(String str) {
        this.B = str;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void g(final Hashtable<String, File> hashtable, String str) {
        File file = new File(n().f134952b, str + Y);
        if (!file.exists()) {
            x("Unable to locate weblogic deployment descriptor. It was expected to be in " + file.getPath(), 1);
            return;
        }
        hashtable.put("META-INF/weblogic-ejb-jar.xml", file);
        if (!this.G) {
            x("The old method for locating CMP files has been DEPRECATED.", 3);
            x("Please adjust your weblogic descriptor and set newCMP=\"true\" to use the new CMP descriptor inclusion mechanism. ", 3);
            File file2 = new File(n().f134952b, str + Z);
            if (file2.exists()) {
                hashtable.put("META-INF/weblogic-cmp-rdbms-jar.xml", file2);
                return;
            }
            return;
        }
        try {
            File file3 = hashtable.get("META-INF/ejb-jar.xml");
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setValidating(true);
            SAXParser sAXParserNewSAXParser = sAXParserFactoryNewInstance.newSAXParser();
            e eVarS = S(file3.getParentFile());
            InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
            try {
                sAXParserNewSAXParser.parse(new InputSource(inputStreamNewInputStream), eVarS);
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
                eVarS.b().forEach(new BiConsumer() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.b0
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        hashtable.put((String) obj, (File) obj2);
                    }
                });
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
        } catch (Exception e10) {
            throw new BuildException("Exception while adding Vendor specific files: " + e10.toString(), e10);
        }
    }

    public void g0(String str) {
        this.f134914y = Boolean.parseBoolean(str);
    }

    public void h0(boolean z10) {
        this.C = z10;
    }

    public void i0(boolean z10) {
        this.G = z10;
    }

    public void j0(boolean z10) {
        this.F = z10;
    }

    public void k0(boolean z10) {
        this.G = !z10;
    }

    public void l0(File file) {
        this.K = file;
    }

    public void m0(boolean z10) {
        this.E = z10;
    }

    public void n0(String str) {
        this.f134911v = str;
    }

    public void o0(o0 o0Var) {
        this.H = o0Var;
    }

    public void p0(String str) {
        this.f134912w = str;
    }

    public void q0(String str) {
        c0(str);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    File w(String str) {
        return new File(p(), str + this.f134911v);
    }
}
