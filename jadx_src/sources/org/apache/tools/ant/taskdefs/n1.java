package org.apache.tools.ant.taskdefs;

import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Execute.java */
/* JADX INFO: loaded from: classes5.dex */
public class n1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f134590j = 1000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f134591k = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f134592l = System.getProperty("user.dir");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static Map<String, String> f134593m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static u4 f134594n = new u4();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f134595o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f134596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f134597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f134598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q1 f134599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r1 f134600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f134601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Project f134602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f134603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f134604i;

    /* JADX INFO: compiled from: Execute.java */
    public class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
        }
    }

    static {
        f134595o = false;
        if (org.apache.tools.ant.taskdefs.condition.z.b("windows")) {
            f134595o = true;
        }
    }

    public n1() {
        this(new d5(), null);
    }

    public n1(q1 q1Var) {
        this(q1Var, null);
    }

    public n1(q1 q1Var, r1 r1Var) {
        this.f134596a = null;
        this.f134597b = null;
        this.f134598c = Integer.MAX_VALUE;
        this.f134601f = null;
        this.f134602g = null;
        this.f134603h = false;
        this.f134604i = true;
        C(q1Var);
        this.f134600e = r1Var;
        if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133977s)) {
            this.f134604i = false;
        }
    }

    public static String G(ByteArrayOutputStream byteArrayOutputStream) {
        try {
            if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133978t)) {
                return byteArrayOutputStream.toString("Cp1047");
            }
            if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133979u)) {
                return byteArrayOutputStream.toString("Cp500");
            }
            return byteArrayOutputStream.toString();
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public static void d(Process process) {
        org.apache.tools.ant.util.j0.c(process.getInputStream());
        org.apache.tools.ant.util.j0.d(process.getOutputStream());
        org.apache.tools.ant.util.j0.c(process.getErrorStream());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[Catch: IOException -> 0x00cf, all -> 0x00d7, TRY_LEAVE, TryCatch #2 {IOException -> 0x00cf, blocks: (B:16:0x0024, B:18:0x0057, B:22:0x0060, B:24:0x0069, B:27:0x0073, B:28:0x008a, B:30:0x0092, B:31:0x00ab, B:33:0x00b8), top: B:46:0x0024, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[Catch: IOException -> 0x00cf, all -> 0x00d7, TryCatch #2 {IOException -> 0x00cf, blocks: (B:16:0x0024, B:18:0x0057, B:22:0x0060, B:24:0x0069, B:27:0x0073, B:28:0x008a, B:30:0x0092, B:31:0x00ab, B:33:0x00b8), top: B:46:0x0024, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[Catch: IOException -> 0x00cf, all -> 0x00d7, TryCatch #2 {IOException -> 0x00cf, blocks: (B:16:0x0024, B:18:0x0057, B:22:0x0060, B:24:0x0069, B:27:0x0073, B:28:0x008a, B:30:0x0092, B:31:0x00ab, B:33:0x00b8), top: B:46:0x0024, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8 A[Catch: IOException -> 0x00cf, all -> 0x00d7, TRY_LEAVE, TryCatch #2 {IOException -> 0x00cf, blocks: (B:16:0x0024, B:18:0x0057, B:22:0x0060, B:24:0x0069, B:27:0x0073, B:28:0x008a, B:30:0x0092, B:31:0x00ab, B:33:0x00b8), top: B:46:0x0024, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6 A[EDGE_INSN: B:47:0x00b6->B:32:0x00b6 BREAK  A[LOOP:0: B:22:0x0060->B:52:0x0060], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0092 A[SYNTHETIC] */
    public static synchronized Map<String, String> h() {
        BufferedReader bufferedReader;
        StringBuilder sb2;
        String line;
        Map<String, String> map = f134593m;
        if (map != null) {
            return map;
        }
        if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133977s)) {
            f134593m = new LinkedHashMap();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            n1 n1Var = new n1(new d5(byteArrayOutputStream));
            n1Var.x(j());
            n1Var.A(true);
            n1Var.e();
            bufferedReader = new BufferedReader(new StringReader(G(byteArrayOutputStream)));
            if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133977s)) {
                Map<String, String> mapL = l(bufferedReader);
                f134593m = mapL;
                return mapL;
            }
            sb2 = null;
            while (true) {
                line = bufferedReader.readLine();
                if (line != null) {
                    break;
                    break;
                }
                if (line.contains(ContainerUtils.KEY_VALUE_DELIMITER)) {
                    if (sb2 != null) {
                        int iIndexOf = sb2.toString().indexOf(61);
                        f134593m.put(sb2.substring(0, iIndexOf), sb2.substring(iIndexOf + 1));
                    }
                    sb2 = new StringBuilder(line);
                } else if (sb2 == null) {
                    sb2 = new StringBuilder(System.lineSeparator() + line);
                } else {
                    sb2.append(System.lineSeparator());
                    sb2.append(line);
                }
            }
            if (sb2 != null) {
                int iIndexOf2 = sb2.toString().indexOf(61);
                f134593m.put(sb2.substring(0, iIndexOf2), sb2.substring(iIndexOf2 + 1));
            }
            return f134593m;
        }
        try {
            Map<String, String> map2 = System.getenv();
            f134593m = map2;
            return map2;
        } catch (Exception e10) {
            e10.printStackTrace();
            f134593m = new LinkedHashMap();
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                n1 n1Var2 = new n1(new d5(byteArrayOutputStream2));
                n1Var2.x(j());
                n1Var2.A(true);
                n1Var2.e();
                bufferedReader = new BufferedReader(new StringReader(G(byteArrayOutputStream2)));
                if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133977s)) {
                    Map<String, String> mapL2 = l(bufferedReader);
                    f134593m = mapL2;
                    return mapL2;
                }
                sb2 = null;
                while (true) {
                    line = bufferedReader.readLine();
                    if (line != null) {
                        break;
                    }
                    if (line.contains(ContainerUtils.KEY_VALUE_DELIMITER)) {
                        if (sb2 != null) {
                            int iIndexOf3 = sb2.toString().indexOf(61);
                            f134593m.put(sb2.substring(0, iIndexOf3), sb2.substring(iIndexOf3 + 1));
                        }
                        sb2 = new StringBuilder(line);
                    } else if (sb2 == null) {
                        sb2 = new StringBuilder(System.lineSeparator() + line);
                    } else {
                        sb2.append(System.lineSeparator());
                        sb2.append(line);
                    }
                }
                if (sb2 != null) {
                    int iIndexOf4 = sb2.toString().indexOf(61);
                    f134593m.put(sb2.substring(0, iIndexOf4), sb2.substring(iIndexOf4 + 1));
                }
                return f134593m;
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
        throw th;
    }

    private static String[] j() {
        if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133971m)) {
            return new String[]{com.taobao.agoo.a.a.b.JSON_CMD, "/c", "set"};
        }
        if (org.apache.tools.ant.taskdefs.condition.z.b("windows")) {
            return org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133969k) ? new String[]{"command.com", "/c", "set"} : new String[]{com.taobao.agoo.a.a.b.JSON_CMD, "/c", "set"};
        }
        if (!org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133978t) && !org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133976r)) {
            if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133972n) || org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133979u)) {
                return new String[]{"env"};
            }
            if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133977s)) {
                return new String[]{"show", "logical"};
            }
            return null;
        }
        String[] strArr = new String[1];
        if (new File("/bin/env").canRead()) {
            strArr[0] = "/bin/env";
        } else if (new File("/usr/bin/env").canRead()) {
            strArr[0] = "/usr/bin/env";
        } else {
            strArr[0] = "env";
        }
        return strArr;
    }

    @Deprecated
    public static synchronized Vector<String> k() {
        final Vector<String> vector;
        vector = new Vector<>();
        h().forEach(new BiConsumer() { // from class: org.apache.tools.ant.taskdefs.k1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                n1.q(vector, (String) obj, (String) obj2);
            }
        });
        return vector;
    }

    private static Map<String, String> l(BufferedReader bufferedReader) throws IOException {
        HashMap map = new HashMap();
        String str = null;
        String strSubstring = null;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            if (line.startsWith("\t=")) {
                if (str != null) {
                    strSubstring = strSubstring + Constants.ACCEPT_TIME_SEPARATOR_SP + line.substring(4, line.length() - 1);
                }
            } else if (line.startsWith("  \"")) {
                if (str != null) {
                    map.put(str, strSubstring);
                }
                int iIndexOf = line.indexOf(61);
                String strSubstring2 = line.substring(3, iIndexOf - 2);
                if (map.containsKey(strSubstring2)) {
                    str = null;
                } else {
                    strSubstring = line.substring(iIndexOf + 3, line.length() - 1);
                    str = strSubstring2;
                }
            }
        }
        if (str != null) {
            map.put(str, strSubstring);
        }
        return map;
    }

    public static boolean o(int i10) {
        if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133977s)) {
            if (i10 % 2 == 0) {
                return true;
            }
        } else if (i10 != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(Vector vector, String str, String str2) {
        vector.add(str + ContainerUtils.KEY_VALUE_DELIMITER + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r(Map.Entry entry) {
        return ((String) entry.getKey()) + ContainerUtils.KEY_VALUE_DELIMITER + ((String) entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] s(int i10) {
        return new String[i10];
    }

    public static Process t(Project project, String[] strArr, String[] strArr2, File file, boolean z10) throws IOException {
        if (file != null && !file.exists()) {
            throw new BuildException("%s doesn't exist.", file);
        }
        org.apache.tools.ant.taskdefs.launcher.c cVarH = org.apache.tools.ant.taskdefs.launcher.c.h(project);
        if (!z10 || cVarH == null) {
            cVarH = org.apache.tools.ant.taskdefs.launcher.c.f(project);
        }
        return cVarH.d(project, strArr, strArr2, file);
    }

    private String[] u() {
        if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133977s)) {
            return this.f134597b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h());
        for (String str : this.f134597b) {
            String strSubstring = str.substring(0, str.indexOf(61));
            if (linkedHashMap.remove(strSubstring) == null && f134595o) {
                for (String str2 : linkedHashMap.keySet()) {
                    if (str2.equalsIgnoreCase(strSubstring)) {
                        strSubstring = str2;
                        break;
                    }
                }
            }
            linkedHashMap.put(strSubstring, str.substring(strSubstring.length() + 1));
        }
        return (String[]) linkedHashMap.entrySet().stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.l1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return n1.r((Map.Entry) obj);
            }
        }).toArray(new IntFunction() { // from class: org.apache.tools.ant.taskdefs.m1
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return n1.s(i10);
            }
        });
    }

    public static void v(org.apache.tools.ant.u2 u2Var, String... strArr) throws BuildException {
        try {
            u2Var.x1(org.apache.tools.ant.types.o.q(strArr), 3);
            n1 n1Var = new n1(new s3(u2Var, 2, 0));
            n1Var.w(u2Var.b());
            n1Var.x(strArr);
            int iE = n1Var.e();
            if (o(iE)) {
                throw new BuildException(strArr[0] + " failed with return code " + iE, u2Var.w1());
            }
        } catch (IOException e10) {
            throw new BuildException("Could not launch " + strArr[0] + ": " + e10, u2Var.w1());
        }
    }

    public void A(boolean z10) {
        this.f134603h = z10;
    }

    @Deprecated
    public void B(boolean z10) {
    }

    public void C(q1 q1Var) {
        this.f134599d = q1Var;
    }

    public void D(boolean z10) {
        this.f134604i = z10;
    }

    public void E(File file) {
        this.f134601f = file;
    }

    public void F() throws IOException {
        File file = this.f134601f;
        if (file != null && !file.exists()) {
            throw new BuildException("%s doesn't exist.", this.f134601f);
        }
        Process processT = t(this.f134602g, f(), g(), this.f134601f, this.f134604i);
        if (org.apache.tools.ant.taskdefs.condition.z.b("windows")) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                this.f134602g.M0("interruption in the sleep after having spawned a process", 3);
            }
        }
        d5 d5Var = new d5(new a());
        d5Var.e1(processT.getErrorStream());
        d5Var.q1(processT.getInputStream());
        d5Var.start();
        processT.getOutputStream().close();
        this.f134602g.M0("spawned process " + processT.toString(), 3);
    }

    protected void H(Process process) {
        try {
            process.waitFor();
            z(process.exitValue());
        } catch (InterruptedException unused) {
            process.destroy();
        }
    }

    public int e() throws IOException {
        File file = this.f134601f;
        if (file != null && !file.exists()) {
            throw new BuildException("%s doesn't exist.", this.f134601f);
        }
        Process processT = t(this.f134602g, f(), g(), this.f134601f, this.f134604i);
        try {
            this.f134599d.o1(processT.getOutputStream());
            this.f134599d.q1(processT.getInputStream());
            this.f134599d.e1(processT.getErrorStream());
            this.f134599d.start();
            try {
                try {
                    f134594n.a(processT);
                    r1 r1Var = this.f134600e;
                    if (r1Var != null) {
                        r1Var.f(processT);
                    }
                    H(processT);
                    r1 r1Var2 = this.f134600e;
                    if (r1Var2 != null) {
                        r1Var2.g();
                    }
                    this.f134599d.stop();
                    d(processT);
                    r1 r1Var3 = this.f134600e;
                    if (r1Var3 != null) {
                        r1Var3.b();
                    }
                    int i10 = i();
                    f134594n.d(processT);
                    return i10;
                } catch (ThreadDeath e10) {
                    processT.destroy();
                    throw e10;
                }
            } catch (Throwable th2) {
                f134594n.d(processT);
                throw th2;
            }
        } catch (IOException e11) {
            processT.destroy();
            throw e11;
        }
    }

    public String[] f() {
        return this.f134596a;
    }

    public String[] g() {
        String[] strArr = this.f134597b;
        return (strArr == null || this.f134603h) ? strArr : u();
    }

    public int i() {
        return this.f134598c;
    }

    public File m() {
        File file = this.f134601f;
        return file == null ? new File(f134592l) : file;
    }

    public boolean n() {
        return o(i());
    }

    public boolean p() {
        r1 r1Var = this.f134600e;
        return r1Var != null && r1Var.e();
    }

    public void w(Project project) throws BuildException {
        this.f134602g = project;
    }

    public void x(String[] strArr) {
        this.f134596a = strArr;
    }

    public void y(String[] strArr) {
        this.f134597b = strArr;
    }

    protected void z(int i10) {
        this.f134598c = i10;
    }
}
