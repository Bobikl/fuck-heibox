package org.apache.tools.ant;

import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.socialize.common.SocializeConstants;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Calendar;
import java.util.Objects;
import java.util.Properties;
import java.util.TimeZone;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import org.apache.tools.ant.launch.Launcher;

/* JADX INFO: compiled from: Diagnostics.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f133138a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f133139b = 32;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f133140c = 1024;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f133141d = 1000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f133142e = 60;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f133143f = 60;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final String f133144g = "Access to this property blocked by a security manager";

    private f0() {
    }

    private static void A(PrintStream printStream, String str) {
        printStream.println();
        printStream.println("-------------------------------------------");
        printStream.print(" ");
        printStream.println(str);
        printStream.println("-------------------------------------------");
    }

    private static void B(Throwable th2) {
    }

    @Deprecated
    public static boolean C() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D(String str) {
        return str + " : " + t(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean E(File file, String str) {
        return str.endsWith(".jar");
    }

    private static File[] F(File file) {
        return file.listFiles(new FilenameFilter() { // from class: org.apache.tools.ant.c0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return f0.E(file2, str);
            }
        });
    }

    public static File[] G() {
        String property = System.getProperty(j1.f133495s);
        if (property == null) {
            return null;
        }
        return F(new File(property, "lib"));
    }

    public static void H(String[] strArr) {
        c(System.out);
    }

    private static void I(File[] fileArr, PrintStream printStream) {
        if (fileArr == null) {
            printStream.println("No such directory.");
            return;
        }
        for (File file : fileArr) {
            printStream.println(file.getName() + " (" + file.length() + " bytes)");
        }
    }

    private static void J(PrintStream printStream, String str, String str2, String str3) {
        if (str2 == null) {
            str2 = "unknown";
        }
        if (str3 == null) {
            str3 = "unknown";
        }
        printStream.println(str + " : " + str2);
        printStream.println(str + " Location: " + str3);
    }

    private static void K(PrintStream printStream, String str) {
        String strT = t(str);
        if (strT != null) {
            printStream.print(str);
            printStream.print(" = ");
            printStream.print(kotlin.text.y.f128593b);
            printStream.print(strT);
            printStream.println(kotlin.text.y.f128593b);
        }
    }

    @Deprecated
    public static void L() throws BuildException {
    }

    public static void c(PrintStream printStream) {
        d(printStream, 2);
    }

    public static void d(PrintStream printStream, int i10) {
        printStream.println("------- Ant diagnostics report -------");
        printStream.println(v1.p());
        A(printStream, "Implementation Version");
        printStream.println("core tasks     : " + q(v1.class) + " in " + p(v1.class));
        A(printStream, "ANT PROPERTIES");
        f(printStream);
        A(printStream, "ANT_HOME/lib jar listing");
        e(printStream);
        A(printStream, "USER_HOME/.ant/lib jar listing");
        m(printStream);
        A(printStream, "Tasks availability");
        k(printStream);
        A(printStream, "org.apache.env.Which diagnostics");
        n(printStream);
        A(printStream, "XML Parser information");
        h(printStream);
        A(printStream, "XSLT Processor information");
        o(printStream);
        A(printStream, "System properties");
        j(printStream);
        A(printStream, "Temp dir");
        l(printStream);
        A(printStream, "Locale information");
        g(printStream);
        A(printStream, "Proxy information");
        i(printStream);
        printStream.println();
    }

    private static void e(PrintStream printStream) {
        printStream.println("ant.home: " + System.getProperty(j1.f133495s));
        I(G(), printStream);
    }

    private static void f(PrintStream printStream) {
        Project project = new Project();
        project.G0();
        printStream.println("ant.version: " + project.u0(j1.f133478b));
        printStream.println("ant.java.version: " + project.u0(j1.f133494r));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Is this the Apache Harmony VM? ");
        sb2.append(org.apache.tools.ant.util.s0.m() ? "yes" : "no");
        printStream.println(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Is this the Kaffe VM? ");
        sb3.append(org.apache.tools.ant.util.s0.r() ? "yes" : "no");
        printStream.println(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Is this gij/gcj? ");
        sb4.append(org.apache.tools.ant.util.s0.p() ? "yes" : "no");
        printStream.println(sb4.toString());
        printStream.println("ant.core.lib: " + project.u0(j1.f133496t));
        printStream.println("ant.home: " + project.u0(j1.f133495s));
    }

    private static void g(PrintStream printStream) {
        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = calendar.getTimeZone();
        printStream.println("Timezone " + timeZone.getDisplayName() + " offset=" + timeZone.getOffset(calendar.get(0), calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(7), (((((calendar.get(11) * 60) + calendar.get(12)) * 60) + calendar.get(13)) * 1000) + calendar.get(14)));
    }

    private static void h(PrintStream printStream) {
        J(printStream, "XML Parser", w(), v());
        J(printStream, "Namespace-aware parser", s(), r());
    }

    private static void i(PrintStream printStream) {
        K(printStream, org.apache.tools.ant.util.h1.f136786c);
        K(printStream, org.apache.tools.ant.util.h1.f136787d);
        K(printStream, org.apache.tools.ant.util.h1.f136795l);
        K(printStream, org.apache.tools.ant.util.h1.f136796m);
        K(printStream, org.apache.tools.ant.util.h1.f136792i);
        K(printStream, org.apache.tools.ant.util.h1.f136788e);
        K(printStream, org.apache.tools.ant.util.h1.f136789f);
        K(printStream, org.apache.tools.ant.util.h1.f136793j);
        K(printStream, org.apache.tools.ant.util.h1.f136790g);
        K(printStream, org.apache.tools.ant.util.h1.f136791h);
        K(printStream, org.apache.tools.ant.util.h1.f136794k);
        K(printStream, org.apache.tools.ant.util.h1.f136797n);
        K(printStream, org.apache.tools.ant.util.h1.f136798o);
        K(printStream, org.apache.tools.ant.util.h1.f136799p);
        K(printStream, org.apache.tools.ant.util.h1.f136800q);
        K(printStream, org.apache.tools.ant.util.h1.f136785b);
        uj.a aVar = new uj.a();
        printStream.println("Java1.5+ proxy settings:");
        printStream.println(aVar.toString());
    }

    private static void j(final PrintStream printStream) {
        try {
            Stream map = System.getProperties().stringPropertyNames().stream().map(new Function() { // from class: org.apache.tools.ant.d0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return f0.D((String) obj);
                }
            });
            Objects.requireNonNull(printStream);
            map.forEach(new Consumer() { // from class: org.apache.tools.ant.e0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    printStream.println((String) obj);
                }
            });
        } catch (SecurityException e10) {
            B(e10);
            printStream.println("Access to System.getProperties() blocked by a security manager");
        }
    }

    private static void k(PrintStream printStream) {
        InputStream resourceAsStream = v1.class.getResourceAsStream(j1.f133485i);
        if (resourceAsStream == null) {
            printStream.println("None available");
            return;
        }
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
            for (String str : properties.stringPropertyNames()) {
                try {
                    try {
                        try {
                            Class.forName(properties.getProperty(str));
                            properties.remove(str);
                        } catch (ClassNotFoundException unused) {
                            printStream.println(str + " : Not Available (the implementation class is not present)");
                        }
                    } catch (NoClassDefFoundError e10) {
                        printStream.println(str + " : Missing dependency " + e10.getMessage().replace(IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g));
                    }
                } catch (LinkageError unused2) {
                    printStream.println(str + " : Initialization error");
                }
            }
            if (properties.size() == 0) {
                printStream.println("All defined tasks are available");
            } else {
                printStream.println("A task being missing/unavailable should only matter if you are trying to use it");
            }
        } catch (IOException e11) {
            printStream.println(e11.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0187  */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0135: MOVE (r1 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:63:0x0134 */
    private static void l(PrintStream printStream) throws Throwable {
        File file;
        InputStream inputStream;
        File fileCreateTempFile;
        InputStream inputStreamNewInputStream;
        OutputStream outputStreamNewOutputStream;
        InputStream inputStream2;
        String property = System.getProperty("java.io.tmpdir");
        if (property == null) {
            printStream.println("Warning: java.io.tmpdir is undefined");
            return;
        }
        printStream.println("Temp dir is " + property);
        File file2 = new File(property);
        if (!file2.exists()) {
            printStream.println("Warning, java.io.tmpdir directory does not exist: " + property);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        OutputStream outputStream = null;
        outputStream = null;
        outputStream = null;
        outputStream = null;
        outputStream = null;
        File file3 = null;
        OutputStream outputStream2 = null;
        try {
            try {
                fileCreateTempFile = File.createTempFile("diag", SocializeConstants.KEY_TEXT, file2);
                try {
                    outputStreamNewOutputStream = Files.newOutputStream(fileCreateTempFile.toPath(), new OpenOption[0]);
                    try {
                        byte[] bArr = new byte[1024];
                        for (int i10 = 0; i10 < 32; i10++) {
                            outputStreamNewOutputStream.write(bArr);
                        }
                        outputStreamNewOutputStream.close();
                        Thread.sleep(1000L);
                        inputStreamNewInputStream = Files.newInputStream(fileCreateTempFile.toPath(), new OpenOption[0]);
                        int i11 = 0;
                        while (true) {
                            try {
                                int i12 = inputStreamNewInputStream.read(bArr, 0, 1024);
                                if (i12 <= 0) {
                                    break;
                                } else {
                                    i11 += i12;
                                }
                            } catch (IOException e10) {
                                e = e10;
                                file3 = fileCreateTempFile;
                                inputStream = inputStreamNewInputStream;
                                outputStreamNewOutputStream = null;
                                try {
                                    B(e);
                                    printStream.println("Failed to create a temporary file in the temp dir " + property);
                                    printStream.println("File  " + file3 + " could not be created/written to");
                                    org.apache.tools.ant.util.j0.d(outputStreamNewOutputStream);
                                    org.apache.tools.ant.util.j0.c(inputStream);
                                    if (file3 == null || !file3.exists()) {
                                        return;
                                    }
                                    file3.delete();
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    file = file3;
                                    outputStream = outputStreamNewOutputStream;
                                    org.apache.tools.ant.util.j0.d(outputStream);
                                    org.apache.tools.ant.util.j0.c(inputStream);
                                    if (file != null && file.exists()) {
                                        file.delete();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException e11) {
                                e = e11;
                                B(e);
                                printStream.println("Failed to check whether tempdir is writable");
                                org.apache.tools.ant.util.j0.d(outputStream2);
                                org.apache.tools.ant.util.j0.c(inputStreamNewInputStream);
                                if (fileCreateTempFile == null || !fileCreateTempFile.exists()) {
                                    return;
                                }
                            }
                        }
                        inputStreamNewInputStream.close();
                        long jLastModified = fileCreateTempFile.lastModified() - jCurrentTimeMillis;
                        fileCreateTempFile.delete();
                        printStream.print("Temp dir is writeable");
                        if (i11 != 32768) {
                            printStream.println(", but seems to be full.  Wrote 32768but could only read " + i11 + " bytes.");
                        } else {
                            printStream.println();
                        }
                        printStream.println("Temp dir alignment with system clock is " + jLastModified + " ms");
                        if (Math.abs(jLastModified) > 10000) {
                            printStream.println("Warning: big clock drift -maybe a network filesystem");
                        }
                        org.apache.tools.ant.util.j0.d(null);
                        org.apache.tools.ant.util.j0.c(null);
                        if (!fileCreateTempFile.exists()) {
                            return;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        file3 = fileCreateTempFile;
                        inputStream = null;
                    } catch (InterruptedException e13) {
                        e = e13;
                        inputStreamNewInputStream = null;
                        outputStream2 = outputStreamNewOutputStream;
                    } catch (Throwable th3) {
                        th = th3;
                        file = fileCreateTempFile;
                        inputStream = null;
                        outputStream = outputStreamNewOutputStream;
                        org.apache.tools.ant.util.j0.d(outputStream);
                        org.apache.tools.ant.util.j0.c(inputStream);
                        if (file != null) {
                            file.delete();
                        }
                        throw th;
                    }
                } catch (IOException e14) {
                    e = e14;
                    outputStreamNewOutputStream = null;
                    file3 = fileCreateTempFile;
                    inputStream = null;
                } catch (InterruptedException e15) {
                    e = e15;
                    inputStreamNewInputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    file = fileCreateTempFile;
                    inputStream = null;
                    org.apache.tools.ant.util.j0.d(outputStream);
                    org.apache.tools.ant.util.j0.c(inputStream);
                    if (file != null) {
                        file.delete();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                file = file2;
                inputStream = inputStream2;
            }
        } catch (IOException e16) {
            e = e16;
            inputStream = null;
            outputStreamNewOutputStream = null;
        } catch (InterruptedException e17) {
            e = e17;
            fileCreateTempFile = null;
            inputStreamNewInputStream = null;
        } catch (Throwable th6) {
            th = th6;
            file = null;
            inputStream = null;
        }
        fileCreateTempFile.delete();
    }

    private static void m(PrintStream printStream) {
        String property = System.getProperty("user.home");
        printStream.println("user.home: " + property);
        I(F(new File(property, Launcher.USER_LIBDIR)), printStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.reflect.InvocationTargetException] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    private static void n(PrintStream printStream) {
        ?? e10 = 0;
        e10 = 0;
        try {
            Class.forName("org.apache.env.Which").getMethod("main", String[].class).invoke(null, new String[0]);
        } catch (ClassNotFoundException unused) {
            printStream.println("Not available.");
            printStream.println("Download it at https://xml.apache.org/commons/");
        } catch (InvocationTargetException e11) {
            e10 = e11;
            if (e10.getTargetException() != null) {
                e10 = e10.getTargetException();
            }
        } catch (Throwable th2) {
            e10 = th2;
        }
        if (e10 != 0) {
            printStream.println("Error while running org.apache.env.Which");
            e10.printStackTrace(printStream);
        }
    }

    private static void o(PrintStream printStream) {
        J(printStream, "XSLT Processor", z(), y());
    }

    private static URL p(Class<?> cls) {
        if (cls.getProtectionDomain().getCodeSource() == null) {
            return null;
        }
        return cls.getProtectionDomain().getCodeSource().getLocation();
    }

    private static String q(Class<?> cls) {
        return cls.getPackage().getImplementationVersion();
    }

    private static String r() {
        try {
            URL urlP = p(org.apache.tools.ant.util.r0.e().getClass());
            if (urlP != null) {
                return urlP.toString();
            }
            return null;
        } catch (BuildException e10) {
            B(e10);
            return null;
        }
    }

    private static String s() {
        try {
            return org.apache.tools.ant.util.r0.e().getClass().getName();
        } catch (BuildException e10) {
            B(e10);
            return null;
        }
    }

    private static String t(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return f133144g;
        }
    }

    private static SAXParser u() {
        try {
            try {
                return SAXParserFactory.newInstance().newSAXParser();
            } catch (Exception e10) {
                B(e10);
                return null;
            }
        } catch (Exception e11) {
            B(e11);
            return null;
        }
    }

    private static String v() {
        URL urlP;
        SAXParser sAXParserU = u();
        if (sAXParserU == null || (urlP = p(sAXParserU.getClass())) == null) {
            return null;
        }
        return urlP.toString();
    }

    private static String w() {
        SAXParser sAXParserU = u();
        return sAXParserU == null ? "Could not create an XML Parser" : sAXParserU.getClass().getName();
    }

    private static Transformer x() {
        TransformerFactory transformerFactoryNewInstance = TransformerFactory.newInstance();
        if (transformerFactoryNewInstance == null) {
            return null;
        }
        try {
            return transformerFactoryNewInstance.newTransformer();
        } catch (Exception e10) {
            B(e10);
            return null;
        }
    }

    private static String y() {
        URL urlP;
        Transformer transformerX = x();
        if (transformerX == null || (urlP = p(transformerX.getClass())) == null) {
            return null;
        }
        return urlP.toString();
    }

    private static String z() {
        Transformer transformerX = x();
        return transformerX == null ? "Could not create an XSLT Processor" : transformerX.getClass().getName();
    }
}
