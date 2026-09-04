package org.apache.tools.ant.util;

import com.uc.crashsdk.export.LogType;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/* JADX INFO: compiled from: JavaEnvUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public final class s0 {

    @Deprecated
    public static final String A = "1.9";

    @Deprecated
    public static final int B = 19;
    public static final String C = "9";
    public static final int D = 90;
    public static final String E = "10";
    public static final int F = 100;
    public static final String G = "11";
    public static final int H = 110;
    public static final String I = "12";
    public static final int J = 120;
    private static boolean K = false;
    private static boolean L = false;
    private static boolean M = false;
    private static boolean N = false;
    private static Vector<String> O = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f136910a = org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133973o);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f136911b = org.apache.tools.ant.taskdefs.condition.z.c(org.apache.tools.ant.taskdefs.condition.z.f133972n);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f136912c = org.apache.tools.ant.taskdefs.condition.z.c("aix");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f136913d = System.getProperty("java.home");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j0 f136914e = j0.O();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f136915f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f136916g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final f0 f136917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f136918i = "1.0";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f136919j = 10;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f136920k = "1.1";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f136921l = 11;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f136922m = "1.2";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f136923n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f136924o = "1.3";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f136925p = 13;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f136926q = "1.4";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f136927r = 14;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f136928s = "1.5";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f136929t = 15;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f136930u = "1.6";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f136931v = 16;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f136932w = "1.7";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f136933x = 17;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f136934y = "1.8";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f136935z = 18;

    static {
        try {
            f136915f = f136934y;
            f136916g = 18;
            Class.forName("java.lang.module.ModuleDescriptor");
            f0 f0Var = new f0(System.getProperty("java.specification.version"));
            f136916g = f0Var.b(0) * 10;
            if (f0Var.c() > 1) {
                f136916g += f0Var.b(1);
            }
            f136915f = f0Var.toString();
        } catch (Throwable unused) {
        }
        f136917h = new f0(f136915f);
        K = false;
        try {
            Class.forName("kaffe.util.NotImplemented");
            K = true;
        } catch (Throwable unused2) {
        }
        L = false;
        try {
            Class.forName("gnu.classpath.Configuration");
            L = true;
        } catch (Throwable unused3) {
        }
        M = false;
        try {
            Class.forName("gnu.gcj.Core");
            M = true;
        } catch (Throwable unused4) {
        }
        N = false;
        try {
            Class.forName("org.apache.harmony.luni.util.Base64");
            N = true;
        } catch (Throwable unused5) {
        }
    }

    private s0() {
    }

    private static String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(f136910a ? ".exe" : "");
        return sb2.toString();
    }

    private static void b() {
        Vector<String> vector = new Vector<>();
        O = vector;
        vector.addElement("sun");
        O.addElement(LogType.JAVA_TYPE);
        O.addElement("javax");
        O.addElement("com.sun.java");
        O.addElement("com.sun.image");
        O.addElement("org.omg");
        O.addElement("com.sun.corba");
        O.addElement("com.sun.jndi");
        O.addElement("com.sun.media");
        O.addElement("com.sun.naming");
        O.addElement("com.sun.org.omg");
        O.addElement("com.sun.rmi");
        O.addElement("sunw.io");
        O.addElement("sunw.util");
        O.addElement("org.ietf.jgss");
        O.addElement("org.w3c.dom");
        O.addElement("org.xml.sax");
        O.addElement("com.sun.org.apache");
        O.addElement("jdk");
    }

    public static File c(String[] strArr) throws IOException {
        File fileG = f136914e.G(null, "ANT", ".JAVA_OPTS", null, false, true);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileG));
        try {
            for (String str : strArr) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            return fileG;
        } catch (Throwable th2) {
            try {
                bufferedWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static File d(String str, String str2) {
        File fileI0 = f136914e.i0(str);
        if (!fileI0.exists()) {
            return null;
        }
        File file = new File(fileI0, a(str2));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public static String e() {
        return f136913d;
    }

    public static String f() {
        return f136915f;
    }

    @Deprecated
    public static int g() {
        return f136916g;
    }

    public static String h(String str) {
        if (f136911b) {
            return str;
        }
        File fileD = null;
        if (f136912c) {
            fileD = d(f136913d + "/../sh", str);
        }
        if (fileD == null) {
            fileD = d(f136913d + "/../bin", str);
        }
        return fileD != null ? fileD.getAbsolutePath() : i(str);
    }

    public static String i(String str) {
        if (f136911b) {
            return str;
        }
        File fileD = null;
        if (f136912c) {
            fileD = d(f136913d + "/sh", str);
        }
        if (fileD == null) {
            fileD = d(f136913d + "/bin", str);
        }
        return fileD != null ? fileD.getAbsolutePath() : a(str);
    }

    public static Vector<String> j() {
        Vector<String> vector = new Vector<>();
        vector.addElement("java.lang.Object");
        vector.addElement("sun.reflect.SerializationConstructorAccessorImpl");
        vector.addElement("sun.net.www.http.HttpClient");
        vector.addElement("sun.audio.AudioPlayer");
        vector.addElement("javax.accessibility.Accessible");
        vector.addElement("sun.misc.BASE64Encoder");
        vector.addElement("com.sun.image.codec.jpeg.JPEGCodec");
        vector.addElement("org.omg.CORBA.Any");
        vector.addElement("com.sun.corba.se.internal.corba.AnyImpl");
        vector.addElement("com.sun.jndi.ldap.LdapURL");
        vector.addElement("com.sun.media.sound.Printer");
        vector.addElement("com.sun.naming.internal.VersionHelper");
        vector.addElement("com.sun.org.omg.CORBA.Initializer");
        vector.addElement("sunw.io.Serializable");
        vector.addElement("sunw.util.EventListener");
        vector.addElement("sun.audio.AudioPlayer");
        vector.addElement("org.ietf.jgss.Oid");
        vector.addElement("org.w3c.dom.Attr");
        vector.addElement("org.xml.sax.XMLReader");
        vector.addElement("com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl");
        vector.addElement("jdk.net.Sockets");
        return vector;
    }

    public static Vector<String> k() {
        if (O == null) {
            b();
        }
        return O;
    }

    public static f0 l() {
        return f136917h;
    }

    public static boolean m() {
        return N;
    }

    public static boolean n(String str) {
        return f136917h.compareTo(new f0(str)) >= 0;
    }

    public static boolean o() {
        return L;
    }

    public static boolean p() {
        return M;
    }

    public static boolean q(String str) {
        return f136915f.equals(str) || (f136915f.equals("9") && A.equals(str));
    }

    public static boolean r() {
        return K;
    }
}
