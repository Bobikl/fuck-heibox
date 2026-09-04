package org.apache.tools.ant.taskdefs.optional.ejb;

import com.tencent.qcloud.core.util.IOUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.v2;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.u2;

/* JADX INFO: compiled from: WebsphereDeploymentTool.java */
/* JADX INFO: loaded from: classes5.dex */
public class m0 extends h {
    public static final String P = "-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 1.1//EN";
    public static final String Q = "-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 2.0//EN";
    protected static final String R = "Schema/";
    protected static final String S = "ibm-ejb-jar-ext.xmi";
    protected static final String T = "ibm-ejb-jar-bnd.xmi";
    protected static final String U = "Map.mapxmi";
    protected static final String V = "Schema.dbxmi";
    private static final org.apache.tools.ant.util.j0 W = org.apache.tools.ant.util.j0.O();
    private String C;
    private String D;
    private String E;
    private boolean F;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private String L;
    private boolean M;
    private File O;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f134995w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f134994v = ".jar";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f134996x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f134997y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f134998z = true;
    private boolean A = false;
    private o0 B = null;
    private boolean G = true;
    private String N = "_ejbdeploy_temp";

    /* JADX INFO: compiled from: WebsphereDeploymentTool.java */
    public class a extends e {
        a(u2 u2Var, File file) {
            super(u2Var, file);
        }

        @Override // org.apache.tools.ant.taskdefs.optional.ejb.e
        protected void d() {
        }
    }

    private void N(File file, File file2) {
        try {
            if (this.f134998z) {
                v2 v2Var = new v2(u());
                v2Var.t2().O1("-Xms64m");
                v2Var.t2().O1("-Xmx128m");
                org.apache.tools.ant.types.z.a aVar = new org.apache.tools.ant.types.z.a();
                aVar.e("websphere.lib.dir");
                aVar.g(new File(this.O, "lib").getAbsolutePath());
                v2Var.m2(aVar);
                v2Var.O2(this.O);
                v2Var.g2("ejbdeploy");
                v2Var.K2("com.ibm.etools.ejbdeploy.EJBDeploy");
                v2Var.q2().O1(file.getPath());
                v2Var.q2().O1(this.N);
                v2Var.q2().O1(file2.getPath());
                v2Var.q2().H1(Q());
                if (m() != null && !m().toString().isEmpty()) {
                    v2Var.q2().O1("-cp");
                    v2Var.q2().O1(m().toString());
                }
                o0 o0VarM = this.B;
                if (o0VarM == null) {
                    o0VarM = m();
                }
                v2Var.S2(true);
                if (o0VarM != null) {
                    v2Var.L2(o0VarM);
                }
                x("Calling websphere.ejbdeploy for " + file.toString(), 3);
                v2Var.D1();
            }
        } catch (Exception e10) {
            throw new BuildException("Exception while calling ejbdeploy. Details: " + e10.toString(), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(e eVar, g.c cVar) {
        eVar.e(cVar.c(), cVar.b());
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
    protected void F(String str, File file, Hashtable<String, File> hashtable, String str2) throws BuildException {
        if (!this.f134998z) {
            super.F(str, file, hashtable, str2);
            return;
        }
        File fileW = super.w(str);
        super.F(str, fileW, hashtable, str2);
        if (this.f134997y || S(fileW, file)) {
            N(fileW, file);
        }
        if (this.f134996x) {
            return;
        }
        x("deleting generic jar " + fileW.toString(), 3);
        fileW.delete();
    }

    public o0 O() {
        if (this.B == null) {
            this.B = new o0(u().b());
        }
        return this.B.u2();
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

    protected String Q() {
        StringBuilder sb2 = new StringBuilder();
        if (this.C != null) {
            sb2.append(" -dbvendor ");
            sb2.append(this.C);
        }
        if (this.D != null) {
            sb2.append(" -dbname \"");
            sb2.append(this.D);
            sb2.append("\"");
        }
        if (this.E != null) {
            sb2.append(" -dbschema \"");
            sb2.append(this.E);
            sb2.append("\"");
        }
        if (this.F) {
            sb2.append(" -codegen");
        }
        if (this.G) {
            sb2.append(" -quiet");
        }
        if (this.H) {
            sb2.append(" -novalidate");
        }
        if (this.I) {
            sb2.append(" -nowarn");
        }
        if (this.J) {
            sb2.append(" -noinform");
        }
        if (this.K) {
            sb2.append(" -trace");
        }
        if (this.M) {
            sb2.append(" -35");
        }
        if (this.L != null) {
            sb2.append(" -rmic \"");
            sb2.append(this.L);
            sb2.append("\"");
        }
        return sb2.toString();
    }

    protected e R(File file) {
        final a aVar = new a(u(), file);
        n().f134958h.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.l0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                m0.U(aVar, (g.c) obj);
            }
        });
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x032c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0319 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x015b A[Catch: all -> 0x0261, IOException -> 0x0267, ClassNotFoundException -> 0x026c, TRY_LEAVE, TryCatch #10 {IOException -> 0x0267, ClassNotFoundException -> 0x026c, all -> 0x0261, blocks: (B:14:0x0081, B:15:0x008e, B:17:0x0094, B:19:0x00a0, B:38:0x015b, B:76:0x024d, B:21:0x00bc, B:23:0x00d4, B:25:0x00e0, B:28:0x00ec, B:30:0x010b, B:31:0x0128, B:33:0x012e, B:35:0x013a), top: B:152:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0181 A[Catch: all -> 0x0239, IOException -> 0x023f, ClassNotFoundException -> 0x0246, TryCatch #13 {IOException -> 0x023f, ClassNotFoundException -> 0x0246, all -> 0x0239, blocks: (B:39:0x017b, B:41:0x0181, B:42:0x0184), top: B:147:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x01a5 A[Catch: all -> 0x0227, IOException -> 0x022d, ClassNotFoundException -> 0x0233, TryCatch #14 {IOException -> 0x022d, ClassNotFoundException -> 0x0233, all -> 0x0227, blocks: (B:43:0x0194, B:44:0x019f, B:46:0x01a5, B:48:0x01b5, B:51:0x01c2, B:53:0x01cc, B:55:0x01d6, B:57:0x0202, B:58:0x0212, B:60:0x0219, B:61:0x021e, B:56:0x01fe, B:52:0x01c8), top: B:145:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x01b5 A[Catch: all -> 0x0227, IOException -> 0x022d, ClassNotFoundException -> 0x0233, TryCatch #14 {IOException -> 0x022d, ClassNotFoundException -> 0x0233, all -> 0x0227, blocks: (B:43:0x0194, B:44:0x019f, B:46:0x01a5, B:48:0x01b5, B:51:0x01c2, B:53:0x01cc, B:55:0x01d6, B:57:0x0202, B:58:0x0212, B:60:0x0219, B:61:0x021e, B:56:0x01fe, B:52:0x01c8), top: B:145:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01c8 A[Catch: all -> 0x0227, IOException -> 0x022d, ClassNotFoundException -> 0x0233, TryCatch #14 {IOException -> 0x022d, ClassNotFoundException -> 0x0233, all -> 0x0227, blocks: (B:43:0x0194, B:44:0x019f, B:46:0x01a5, B:48:0x01b5, B:51:0x01c2, B:53:0x01cc, B:55:0x01d6, B:57:0x0202, B:58:0x0212, B:60:0x0219, B:61:0x021e, B:56:0x01fe, B:52:0x01c8), top: B:145:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01d6 A[Catch: all -> 0x0227, IOException -> 0x022d, ClassNotFoundException -> 0x0233, TryCatch #14 {IOException -> 0x022d, ClassNotFoundException -> 0x0233, all -> 0x0227, blocks: (B:43:0x0194, B:44:0x019f, B:46:0x01a5, B:48:0x01b5, B:51:0x01c2, B:53:0x01cc, B:55:0x01d6, B:57:0x0202, B:58:0x0212, B:60:0x0219, B:61:0x021e, B:56:0x01fe, B:52:0x01c8), top: B:145:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01fe A[Catch: all -> 0x0227, IOException -> 0x022d, ClassNotFoundException -> 0x0233, TryCatch #14 {IOException -> 0x022d, ClassNotFoundException -> 0x0233, all -> 0x0227, blocks: (B:43:0x0194, B:44:0x019f, B:46:0x01a5, B:48:0x01b5, B:51:0x01c2, B:53:0x01cc, B:55:0x01d6, B:57:0x0202, B:58:0x0212, B:60:0x0219, B:61:0x021e, B:56:0x01fe, B:52:0x01c8), top: B:145:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0219 A[Catch: all -> 0x0227, IOException -> 0x022d, ClassNotFoundException -> 0x0233, LOOP:2: B:58:0x0212->B:60:0x0219, LOOP_END, TryCatch #14 {IOException -> 0x022d, ClassNotFoundException -> 0x0233, all -> 0x0227, blocks: (B:43:0x0194, B:44:0x019f, B:46:0x01a5, B:48:0x01b5, B:51:0x01c2, B:53:0x01cc, B:55:0x01d6, B:57:0x0202, B:58:0x0212, B:60:0x0219, B:61:0x021e, B:56:0x01fe, B:52:0x01c8), top: B:145:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x024d A[Catch: all -> 0x0261, IOException -> 0x0267, ClassNotFoundException -> 0x026c, TRY_ENTER, TRY_LEAVE, TryCatch #10 {IOException -> 0x0267, ClassNotFoundException -> 0x026c, all -> 0x0261, blocks: (B:14:0x0081, B:15:0x008e, B:17:0x0094, B:19:0x00a0, B:38:0x015b, B:76:0x024d, B:21:0x00bc, B:23:0x00d4, B:25:0x00e0, B:28:0x00ec, B:30:0x010b, B:31:0x0128, B:33:0x012e, B:35:0x013a), top: B:152:0x0081 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x015b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x01d6, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x030a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:126:0x0309 */
    protected boolean S(File file, File file2) throws Throwable {
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
        JarOutputStream jarOutputStream4;
        InputStream inputStream;
        byte[] bArr;
        int i10;
        try {
            try {
                int i11 = 3;
                x("Checking if websphere Jar needs to be rebuilt for jar " + file2.getName(), 3);
                if (file.exists() && file.isFile() && file2.exists() && file2.isFile()) {
                    JarFile jarFile5 = new JarFile(file);
                    try {
                        jarFile2 = new JarFile(file2);
                        try {
                            Map map = (Map) jarFile5.stream().collect(Collectors.toMap(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.f0
                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return m0.V((JarEntry) obj);
                                }
                            }, new Function() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.g0
                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return m0.W((JarEntry) obj);
                                }
                            }, new BinaryOperator() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.h0
                                @Override // java.util.function.BiFunction
                                public final Object apply(Object obj, Object obj2) {
                                    return m0.X((JarEntry) obj, (JarEntry) obj2);
                                }
                            }));
                            Map map2 = (Map) jarFile2.stream().collect(Collectors.toMap(new x(), new Function() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.i0
                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return m0.Y((JarEntry) obj);
                                }
                            }, new BinaryOperator() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.j0
                                @Override // java.util.function.BiFunction
                                public final Object apply(Object obj, Object obj2) {
                                    return m0.Z((JarEntry) obj, (JarEntry) obj2);
                                }
                            }));
                            classLoaderP = P(file);
                            try {
                                HashMap map3 = new HashMap();
                                Iterator it = map.keySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String str = (String) it.next();
                                        if (map2.containsKey(str)) {
                                            JarEntry jarEntry = (JarEntry) map.get(str);
                                            JarEntry jarEntry2 = (JarEntry) map2.get(str);
                                            if (jarEntry.getCrc() != jarEntry2.getCrc() || jarEntry.getSize() != jarEntry2.getSize()) {
                                                if (jarEntry.getName().endsWith(".class")) {
                                                    String strReplace = jarEntry.getName().replace(File.separatorChar, lg.a.f131414g);
                                                    Class<?> clsLoadClass = classLoaderP.loadClass(strReplace.substring(0, strReplace.lastIndexOf(".class")));
                                                    if (clsLoadClass.isInterface()) {
                                                        x("Interface " + clsLoadClass.getName() + " has changed", 3);
                                                    } else {
                                                        map3.put(str, jarEntry);
                                                    }
                                                } else {
                                                    if (!jarEntry.getName().equals("META-INF/MANIFEST.MF")) {
                                                        x("Non class file " + jarEntry.getName() + " has changed", 3);
                                                    }
                                                    if (z12) {
                                                        x("websphere Jar rebuild needed due to changed interface or XML", 3);
                                                        file6 = null;
                                                        jarOutputStream3 = null;
                                                    } else {
                                                        x("No rebuild needed - updating jar", 3);
                                                        file6 = new File(file2.getAbsolutePath() + ".temp");
                                                        try {
                                                            if (file6.exists()) {
                                                                file6.delete();
                                                            }
                                                            jarOutputStream4 = new JarOutputStream(Files.newOutputStream(file6.toPath(), new OpenOption[0]));
                                                            try {
                                                                jarOutputStream4.setLevel(0);
                                                                for (JarEntry jarEntry3 : map2.values()) {
                                                                    if (jarEntry3.getCompressedSize() != -1 || jarEntry3.getCompressedSize() == jarEntry3.getSize()) {
                                                                        jarOutputStream4.setLevel(0);
                                                                    } else {
                                                                        jarOutputStream4.setLevel(9);
                                                                    }
                                                                    if (map3.containsKey(jarEntry3.getName())) {
                                                                        x("Updating Bean class from generic Jar " + jarEntry3.getName(), 3);
                                                                        jarEntry3 = (JarEntry) map3.get(jarEntry3.getName());
                                                                        inputStream = jarFile5.getInputStream(jarEntry3);
                                                                    } else {
                                                                        inputStream = jarFile2.getInputStream(jarEntry3);
                                                                    }
                                                                    jarOutputStream4.putNextEntry(new JarEntry(jarEntry3.getName()));
                                                                    bArr = new byte[1024];
                                                                    while (true) {
                                                                        i10 = inputStream.read(bArr);
                                                                        if (i10 != -1) {
                                                                            jarOutputStream4.write(bArr, 0, i10);
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
                                                                        W.m0(file3, file2);
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
                                                                W.m0(file3, file2);
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
                                                }
                                            }
                                            i11 = 3;
                                        } else {
                                            x("File " + str + " not present in websphere jar", i11);
                                        }
                                        z12 = true;
                                        if (z12) {
                                            x("No rebuild needed - updating jar", 3);
                                            file6 = new File(file2.getAbsolutePath() + ".temp");
                                            if (file6.exists()) {
                                                file6.delete();
                                            }
                                            jarOutputStream4 = new JarOutputStream(Files.newOutputStream(file6.toPath(), new OpenOption[0]));
                                            jarOutputStream4.setLevel(0);
                                            while (r0.hasNext()) {
                                                if (jarEntry3.getCompressedSize() != -1) {
                                                    jarOutputStream4.setLevel(0);
                                                } else {
                                                    jarOutputStream4.setLevel(0);
                                                }
                                                if (map3.containsKey(jarEntry3.getName())) {
                                                    x("Updating Bean class from generic Jar " + jarEntry3.getName(), 3);
                                                    jarEntry3 = (JarEntry) map3.get(jarEntry3.getName());
                                                    inputStream = jarFile5.getInputStream(jarEntry3);
                                                } else {
                                                    inputStream = jarFile2.getInputStream(jarEntry3);
                                                }
                                                jarOutputStream4.putNextEntry(new JarEntry(jarEntry3.getName()));
                                                bArr = new byte[1024];
                                                while (true) {
                                                    i10 = inputStream.read(bArr);
                                                    if (i10 != -1) {
                                                        jarOutputStream4.write(bArr, 0, i10);
                                                    }
                                                }
                                                inputStream.close();
                                            }
                                            jarOutputStream3 = jarOutputStream4;
                                        } else {
                                            x("websphere Jar rebuild needed due to changed interface or XML", 3);
                                            file6 = null;
                                            jarOutputStream3 = null;
                                        }
                                        jarOutputStream2 = jarOutputStream3;
                                        jarFile4 = jarFile2;
                                        boolean z14 = z12;
                                        file5 = file6;
                                        jarFile3 = jarFile5;
                                        z10 = z14;
                                    }
                                    z12 = false;
                                    if (z12) {
                                        x("No rebuild needed - updating jar", 3);
                                        file6 = new File(file2.getAbsolutePath() + ".temp");
                                        if (file6.exists()) {
                                            file6.delete();
                                        }
                                        jarOutputStream4 = new JarOutputStream(Files.newOutputStream(file6.toPath(), new OpenOption[0]));
                                        jarOutputStream4.setLevel(0);
                                        while (r0.hasNext()) {
                                            if (jarEntry3.getCompressedSize() != -1) {
                                                jarOutputStream4.setLevel(0);
                                            } else {
                                                jarOutputStream4.setLevel(0);
                                            }
                                            if (map3.containsKey(jarEntry3.getName())) {
                                                x("Updating Bean class from generic Jar " + jarEntry3.getName(), 3);
                                                jarEntry3 = (JarEntry) map3.get(jarEntry3.getName());
                                                inputStream = jarFile5.getInputStream(jarEntry3);
                                            } else {
                                                inputStream = jarFile2.getInputStream(jarEntry3);
                                            }
                                            jarOutputStream4.putNextEntry(new JarEntry(jarEntry3.getName()));
                                            bArr = new byte[1024];
                                            while (true) {
                                                i10 = inputStream.read(bArr);
                                                if (i10 != -1) {
                                                    jarOutputStream4.write(bArr, 0, i10);
                                                }
                                            }
                                            inputStream.close();
                                        }
                                        jarOutputStream3 = jarOutputStream4;
                                    } else {
                                        x("websphere Jar rebuild needed due to changed interface or XML", 3);
                                        file6 = null;
                                        jarOutputStream3 = null;
                                    }
                                    jarOutputStream2 = jarOutputStream3;
                                    jarFile4 = jarFile2;
                                    boolean z15 = z12;
                                    file5 = file6;
                                    jarFile3 = jarFile5;
                                    z10 = z15;
                                }
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
                            W.m0(file3, file2);
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
                        W.m0(file5, file2);
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

    public void a0(boolean z10) {
        this.F = z10;
    }

    public void b0(String str) {
        this.D = str;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h, org.apache.tools.ant.taskdefs.optional.ejb.f
    public void c() throws BuildException {
        super.c();
        if (this.f134998z) {
            String strU0 = u().b().u0("websphere.home");
            if (strU0 == null) {
                throw new BuildException("The 'websphere.home' property must be set when 'ejbdeploy=true'");
            }
            this.O = u().b().W0(strU0);
        }
    }

    public void c0(String str) {
        this.E = str;
    }

    public void d0(String str) {
        this.C = str;
    }

    public void e0(String str) {
        this.f134995w = str;
    }

    public void f0(boolean z10) {
        this.f134998z = z10;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void g(Hashtable<String, File> hashtable, String str) {
        String str2 = "";
        if (E()) {
            str = "";
        }
        if (this.C != null) {
            str2 = this.C + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        File file = new File(n().f134952b, str + S);
        if (file.exists()) {
            hashtable.put("META-INF/ibm-ejb-jar-ext.xmi", file);
        } else {
            x("Unable to locate websphere extensions. It was expected to be in " + file.getPath(), 3);
        }
        File file2 = new File(n().f134952b, str + T);
        if (file2.exists()) {
            hashtable.put("META-INF/ibm-ejb-jar-bnd.xmi", file2);
        } else {
            x("Unable to locate websphere bindings. It was expected to be in " + file2.getPath(), 3);
        }
        if (!this.A) {
            x("The old method for locating CMP files has been DEPRECATED.", 3);
            x("Please adjust your websphere descriptor and set newCMP=\"true\" to use the new CMP descriptor inclusion mechanism. ", 3);
            return;
        }
        try {
            File file3 = new File(n().f134952b, str + str2 + U);
            if (file3.exists()) {
                hashtable.put("META-INF/Map.mapxmi", file3);
            } else {
                x("Unable to locate the websphere Map: " + file3.getPath(), 3);
            }
            File file4 = new File(n().f134952b, str + str2 + V);
            if (file4.exists()) {
                hashtable.put("META-INF/Schema/Schema.dbxmi", file4);
                return;
            }
            x("Unable to locate the websphere Schema: " + file4.getPath(), 3);
        } catch (Exception e10) {
            throw new BuildException("Exception while adding Vendor specific files: " + e10.toString(), e10);
        }
    }

    public void g0(boolean z10) {
        this.f134996x = z10;
    }

    public void h0(boolean z10) {
        this.A = z10;
    }

    public void i0(boolean z10) {
        this.J = z10;
    }

    public void j0(boolean z10) {
        this.H = z10;
    }

    public void k0(boolean z10) {
        this.I = z10;
    }

    public void l0(boolean z10) {
        this.A = !z10;
    }

    public void m0(boolean z10) {
        this.G = z10;
    }

    public void n0(boolean z10) {
        this.f134997y = z10;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected e o(File file) {
        final e eVar = new e(u(), file);
        eVar.e("-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 1.1//EN", this.f134995w);
        n().f134958h.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.k0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                m0.T(eVar, (g.c) obj);
            }
        });
        return eVar;
    }

    public void o0(String str) {
        this.L = str;
    }

    public void p0(String str) {
        this.f134994v = str;
    }

    public void q0(String str) {
        this.N = str;
    }

    public void r0(boolean z10) {
        this.K = z10;
    }

    public void s0(boolean z10) {
        this.M = z10;
    }

    public void t0(o0 o0Var) {
        this.B = o0Var;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    File w(String str) {
        return new File(p(), str + this.f134994v);
    }
}
