package com.apm.lite.e;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.apm.lite.CrashType;
import com.apm.lite.ICrashCallback;
import com.apm.lite.ICrashFilter;
import com.apm.lite.IOOMCallback;
import com.apm.lite.Npth;
import com.apm.lite.j.h;
import com.apm.lite.k.f;
import com.apm.lite.k.i;
import com.apm.lite.k.k;
import com.apm.lite.k.o;
import com.apm.lite.k.q;
import com.apm.lite.k.r;
import com.apm.lite.k.v;
import com.apm.lite.nativecrash.NativeImpl;
import com.apm.lite.runtime.l;
import com.apm.lite.runtime.m;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static a f39916l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile boolean f39917m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile ThreadLocal<Boolean> f39918n = new ThreadLocal<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static ArrayList<com.apm.lite.e.b> f39919o = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f39920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f39921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f39922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f39923d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f39924e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f39925f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f39926g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Stack<Thread.UncaughtExceptionHandler> f39927h = new Stack<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashMap<Thread, Throwable> f39928i = new HashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile int f39929j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Runnable f39930k = new RunnableC0307a();

    /* JADX INFO: renamed from: com.apm.lite.e.a$a, reason: collision with other inner class name */
    public class RunnableC0307a implements Runnable {
        RunnableC0307a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.a("Recheck uncaught exception handler.");
            if (a.this.f39929j < 3) {
                a.k(a.this);
                a.this.v();
                m.b().f(a.this.f39930k, 30000L);
            }
        }
    }

    public class b extends com.apm.lite.k.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f39932a = false;

        b() {
        }

        @Override // com.apm.lite.k.e.a
        public boolean a(String str) {
            if (!this.f39932a && str.contains("android.os.Looper.loop")) {
                this.f39932a = true;
            }
            return !this.f39932a;
        }
    }

    private a() {
        v();
        if (Npth.getConfigManager().isRegisterJavaCrashEnable()) {
            f(5000L);
        }
    }

    private static int b(Throwable th2, Thread thread) {
        int iA = 0;
        for (int i10 = 0; i10 < f39919o.size(); i10++) {
            try {
                try {
                    iA |= f39919o.get(i10).a(th2, thread);
                } catch (Throwable th3) {
                    com.apm.lite.c.a();
                    com.apm.lite.c.b("NPTH_CATCH", th3);
                }
            } catch (Throwable unused) {
            }
        }
        return iA;
    }

    public static a c() {
        if (f39916l == null) {
            f39916l = new a();
        }
        return f39916l;
    }

    private String d(File file, boolean z10, Throwable th2, String str, Thread thread, boolean z11) {
        String absolutePath = file.getAbsolutePath();
        this.f39926g.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.doLock(absolutePath);
        } catch (Throwable unused) {
        }
        String strC = null;
        if (z11) {
            int iOpenFile = NativeImpl.openFile(absolutePath);
            if (iOpenFile > 0) {
                try {
                    NativeImpl.writeFile(iOpenFile, com.apm.lite.k.a.m(com.apm.lite.e.m()));
                    NativeImpl.writeFile(iOpenFile, "\n");
                    NativeImpl.writeFile(iOpenFile, th2.getMessage());
                    NativeImpl.writeFile(iOpenFile, "\n");
                    NativeImpl.writeFile(iOpenFile, th2.getClass().getName());
                    if (th2.getMessage() != null) {
                        NativeImpl.writeFile(iOpenFile, ": ");
                        NativeImpl.writeFile(iOpenFile, th2.getMessage());
                    }
                    NativeImpl.writeFile(iOpenFile, "\n");
                    NativeImpl.writeFile(iOpenFile, thread.getName());
                    NativeImpl.writeFile(iOpenFile, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.writeFile(iOpenFile, "stack:");
                    NativeImpl.writeFile(iOpenFile, "\n");
                } catch (Throwable unused3) {
                }
                v.k(th2, iOpenFile);
                NativeImpl.closeFile(iOpenFile);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                if (r.c(32768)) {
                    throw new RuntimeException("test exception before write stack");
                }
                fileOutputStream.write((com.apm.lite.k.a.m(com.apm.lite.e.m()) + "\n").getBytes());
                fileOutputStream.write((th2.getMessage() + "\n").getBytes());
                fileOutputStream.write((th2 + "\n").getBytes());
                fileOutputStream.write((thread.getName() + "\n").getBytes());
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (Throwable unused4) {
                }
                try {
                    if (r.c(8192)) {
                        throw new RuntimeException("test exception npth write stack");
                    }
                    strC = v.c(th2, thread, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new b() : new com.apm.lite.k.e.a());
                    k.a(fileOutputStream);
                    k.a(fileOutputStream);
                } catch (Throwable th3) {
                    try {
                        if (r.c(16384)) {
                            throw new RuntimeException("test exception system write stack");
                        }
                        th2.printStackTrace(new PrintStream(fileOutputStream));
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th3 + "\n").getBytes());
                            fileOutputStream.write((th4 + "\n").getBytes());
                        } catch (Throwable unused5) {
                        }
                    }
                }
            } catch (Throwable unused6) {
            }
        }
        return strC;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x020b A[Catch: all -> 0x0236, TRY_LEAVE, TryCatch #11 {all -> 0x0236, blocks: (B:114:0x0205, B:116:0x020b), top: B:174:0x0205 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0210  */
    /* JADX WARN: Code duplicated, block: B:119:0x0212 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x0222  */
    /* JADX WARN: Code duplicated, block: B:160:0x01dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38, types: [int] */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r2v13, types: [n6.a] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private Throwable e(Thread thread, Throwable th2) {
        boolean zW;
        boolean z10;
        CrashType crashType;
        boolean z11;
        boolean z12;
        Throwable th3;
        long j10;
        boolean z13;
        boolean z14;
        Throwable th4;
        ?? r10;
        ?? r11;
        long j11;
        boolean z15;
        ?? r12;
        String strB;
        String str;
        Thread thread2;
        long j12;
        boolean z16;
        Object obj;
        ?? r13;
        c cVar;
        boolean z17;
        Thread threadQ = thread;
        if (this.f39923d >= 3 && !r.c(65536)) {
            return null;
        }
        if (this.f39928i.remove(threadQ) == th2) {
            q.a("Jump this uncaught exception.");
            w(thread, th2);
            return null;
        }
        this.f39928i.put(threadQ, th2);
        this.f39923d++;
        this.f39924e++;
        if (f39917m) {
            f39918n.set(Boolean.TRUE);
        }
        f39917m = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zO = o(jCurrentTimeMillis);
        try {
            zW = v.w(th2);
            if (zW) {
                try {
                    if (v.x(th2)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                } catch (Throwable unused) {
                    z10 = false;
                }
            } else {
                z17 = false;
            }
            z10 = z17;
        } catch (Throwable unused2) {
            zW = false;
        }
        try {
            if (zO) {
                try {
                    crashType = CrashType.LAUNCH;
                } catch (Throwable th5) {
                    th4 = th5;
                    z12 = false;
                    z11 = false;
                    j10 = jCurrentTimeMillis;
                    z13 = zO;
                    z14 = true;
                    th3 = th2;
                    r10 = threadQ;
                    r12 = z14;
                    z15 = z13;
                    j11 = j10;
                    r11 = th3;
                    try {
                        if (!v.w(th4)) {
                            q.f(th4);
                        }
                        if (z11) {
                            synchronized (this) {
                                this.f39924e -= r12;
                                this.f39923d -= r12;
                            }
                            return l(r11, r10);
                        }
                        if (z10 && !z12) {
                            i(thread, th2, z15, j11);
                        }
                        y();
                        x();
                        s(thread, th2);
                        return null;
                    } catch (Throwable th6) {
                        if (z11) {
                            synchronized (this) {
                                this.f39924e -= r12;
                                this.f39923d -= r12;
                                return l(r11, r10);
                            }
                        }
                        if (z10 && !z12) {
                            try {
                                i(thread, th2, z15, j11);
                            } catch (Throwable unused3) {
                                throw th6;
                            }
                        }
                        y();
                        x();
                        s(thread, th2);
                        throw th6;
                    }
                }
            } else {
                try {
                    crashType = CrashType.JAVA;
                } catch (Throwable th7) {
                    th4 = th7;
                    j11 = jCurrentTimeMillis;
                    z15 = zO;
                    r12 = 1;
                    r11 = th2;
                    r10 = threadQ;
                    z12 = false;
                    z11 = false;
                    if (!v.w(th4)) {
                        q.f(th4);
                    }
                    if (z11) {
                        synchronized (this) {
                            this.f39924e -= r12;
                            this.f39923d -= r12;
                            return l(r11, r10);
                        }
                    }
                    if (z10) {
                        i(thread, th2, z15, j11);
                    }
                    y();
                    x();
                    s(thread, th2);
                    return null;
                }
            }
            String strB2 = com.apm.lite.e.b(jCurrentTimeMillis, crashType, zW, false);
            File file = new File(o.b(com.apm.lite.e.m()), strB2);
            File file2 = new File(file, "logEventStack");
            Throwable th8 = th2;
            File file3 = file2;
            String str2 = strB2;
            String strD = d(file2, zW, th8, str2, thread, z10);
            z11 = (b(th2, threadQ) & 1) != 0 || (strD != null && com.apm.lite.e.o().isCrashIgnored(strD));
            try {
                if ((com.apm.lite.d.b.f(th2, threadQ, file) == null) || z11) {
                    strB = com.apm.lite.e.b(jCurrentTimeMillis, zO ? CrashType.LAUNCH : CrashType.JAVA, zW, true);
                    File file4 = new File(o.b(com.apm.lite.e.m()), strB);
                    file.renameTo(file4);
                    file3 = new File(file4, "logEventStack");
                } else {
                    strB = strB2;
                }
                f.b();
                com.apm.lite.j.b.b().m();
                z12 = z();
                boolean z18 = th8;
                z18 = th8;
                long j13 = str2;
                j13 = str2;
                if (z10 && z12) {
                    boolean z19 = zO;
                    long j14 = jCurrentTimeMillis;
                    try {
                        i(thread, th2, z19, j14);
                        z18 = z19;
                        j13 = j14;
                    } catch (Throwable th9) {
                        th4 = th9;
                        j10 = jCurrentTimeMillis;
                        z13 = zO;
                        z14 = true;
                        th3 = th2;
                        r10 = threadQ;
                        r12 = z14;
                        z15 = z13;
                        j11 = j10;
                        r11 = th3;
                        if (!v.w(th4)) {
                            q.f(th4);
                        }
                        if (z11) {
                            synchronized (this) {
                                this.f39924e -= r12;
                                this.f39923d -= r12;
                                return l(r11, r10);
                            }
                        }
                        if (z10) {
                            i(thread, th2, z15, j11);
                        }
                        y();
                        x();
                        s(thread, th2);
                        return null;
                    }
                }
                if (r.c(1)) {
                    this.f39926g.clear();
                }
                CrashType crashType2 = zO ? CrashType.LAUNCH : CrashType.JAVA;
                StringBuilder sb2 = new StringBuilder();
                Object obj2 = "[uncaughtException] isLaunchCrash=";
                sb2.append("[uncaughtException] isLaunchCrash=");
                sb2.append(zO);
                q.a(sb2.toString());
                ?? A = n6.a.a();
                A.b(crashType2, jCurrentTimeMillis, strB);
                threadQ = q(thread, th2);
                try {
                    if (threadQ == 0 || (cVar = this.f39921b) == null || !zO || !cVar.a(th2)) {
                        long j15 = jCurrentTimeMillis;
                        boolean z20 = zO;
                        boolean z21 = true;
                        Throwable th10 = th2;
                        if (threadQ != 0) {
                            try {
                                c cVar2 = this.f39922c;
                                if (cVar2 != null && cVar2.a(th10)) {
                                    this.f39922c.a(j15, thread, th2, strB, file3, strD, z11);
                                    str = "[uncaughtException] mLaunchCrashDisposer " + th2.toString();
                                    A = z21;
                                    obj2 = th10;
                                    z18 = z20;
                                    j13 = j15;
                                }
                                if (z11) {
                                    Thread thread3 = thread2;
                                    ?? r14 = obj;
                                    synchronized (this) {
                                        this.f39924e -= r13;
                                        this.f39923d -= r13;
                                    }
                                    return l(r14, thread3);
                                }
                                if (!z10 && !z12) {
                                    i(thread, th2, z16, j12);
                                }
                                y();
                                x();
                                s(thread, th2);
                                return null;
                            } catch (Throwable th11) {
                                th4 = th11;
                                th3 = th10;
                                z14 = z21;
                                z13 = z20;
                                j10 = j15;
                                r10 = threadQ;
                                r12 = z14;
                                z15 = z13;
                                j11 = j10;
                                r11 = th3;
                                if (!v.w(th4)) {
                                    q.f(th4);
                                }
                                if (z11) {
                                    synchronized (this) {
                                        this.f39924e -= r12;
                                        this.f39923d -= r12;
                                        return l(r11, r10);
                                    }
                                }
                                if (z10) {
                                    i(thread, th2, z15, j11);
                                }
                                y();
                            }
                        }
                        thread2 = threadQ;
                        r13 = z21;
                        obj = th10;
                        z16 = z20;
                        j12 = j15;
                        if (z11) {
                            if (!z10) {
                            }
                            y();
                            x();
                            s(thread, th2);
                            return null;
                        }
                        Thread thread4 = thread2;
                        ?? r15 = obj;
                        synchronized (this) {
                            this.f39924e -= r13;
                            this.f39923d -= r13;
                            return l(r15, thread4);
                        }
                    }
                    j13 = jCurrentTimeMillis;
                    z18 = zO;
                    A = 1;
                    obj2 = th2;
                    this.f39921b.a(jCurrentTimeMillis, thread, th2, strB, file3, strD, z11);
                    str = "[uncaughtException] mLaunchCrashDisposer " + th2.toString();
                    q.a(str);
                    thread2 = threadQ;
                    r13 = A;
                    obj = obj2;
                    z16 = z18;
                    j12 = j13;
                    if (z11) {
                        if (!z10) {
                        }
                        y();
                        x();
                        s(thread, th2);
                        return null;
                    }
                    Thread thread5 = thread2;
                    ?? r16 = obj;
                    synchronized (this) {
                        this.f39924e -= r13;
                        this.f39923d -= r13;
                        return l(r16, thread5);
                    }
                } catch (Throwable th12) {
                    th4 = th12;
                    r10 = threadQ;
                    r11 = obj2;
                    r12 = A;
                    z15 = z18;
                    j11 = j13;
                    if (!v.w(th4)) {
                        q.f(th4);
                    }
                    if (z11) {
                        synchronized (this) {
                            this.f39924e -= r12;
                            this.f39923d -= r12;
                            return l(r11, r10);
                        }
                    }
                    if (z10) {
                        i(thread, th2, z15, j11);
                    }
                    y();
                }
            } catch (Throwable th13) {
                th4 = th13;
                j11 = jCurrentTimeMillis;
                z15 = zO;
                r12 = 1;
                r11 = th2;
                r10 = threadQ;
                z12 = false;
            }
        } catch (Throwable unused4) {
        }
    }

    private void i(Thread thread, Throwable th2, boolean z10, long j10) {
        List<IOOMCallback> listA = l.a().a();
        CrashType crashType = z10 ? CrashType.LAUNCH : CrashType.JAVA;
        Iterator<IOOMCallback> it = listA.iterator();
        while (it.hasNext()) {
            try {
                it.next().onCrash(crashType, th2, thread, j10);
            } catch (Throwable th3) {
                q.g(th3);
            }
        }
    }

    static /* synthetic */ int k(a aVar) {
        int i10 = aVar.f39929j;
        aVar.f39929j = i10 + 1;
        return i10;
    }

    private static Throwable l(Throwable th2, Thread thread) {
        for (int i10 = 0; i10 < f39919o.size(); i10++) {
            try {
                try {
                    f39919o.get(i10).b(th2, thread);
                } catch (Throwable th3) {
                    return th3;
                }
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th4) {
            return th4;
        }
    }

    public static boolean n() {
        return f39917m;
    }

    public static boolean o(long j10) {
        return e.a(j10);
    }

    private boolean q(Thread thread, Throwable th2) {
        ICrashFilter iCrashFilterC = com.apm.lite.e.f().c();
        if (iCrashFilterC == null) {
            return true;
        }
        try {
            return iCrashFilterC.onJavaCrashFilter(th2, thread);
        } catch (Throwable unused) {
            return true;
        }
    }

    private void s(Thread thread, Throwable th2) {
        if (r.c(512)) {
            return;
        }
        w(thread, th2);
    }

    public static boolean t() {
        Boolean bool = f39918n.get();
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            if (defaultUncaughtExceptionHandler != null) {
                q.a("Put this uncaught exception handler to stack. " + defaultUncaughtExceptionHandler.getClass().getName());
                this.f39927h.push(defaultUncaughtExceptionHandler);
            }
            this.f39920a = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    private void w(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandlerPop;
        try {
            if (!this.f39927h.isEmpty() && (uncaughtExceptionHandlerPop = this.f39927h.pop()) != null) {
                this.f39920a = uncaughtExceptionHandlerPop;
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f39920a;
            if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
                q.a("mDefaultHandler != null, call mDefaultHandler.");
                this.f39920a.uncaughtException(thread, th2);
                return;
            }
        } catch (Throwable unused) {
        }
        q.a("Uncaught exception handler null, kill process.");
        Process.killProcess(Process.myPid());
    }

    private void x() {
        synchronized (this) {
            this.f39924e--;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (this.f39924e != 0 && SystemClock.uptimeMillis() - jUptimeMillis < 10000) {
            SystemClock.sleep(50L);
        }
    }

    private void y() {
        File fileB = o.b(com.apm.lite.e.m());
        File fileA = o.a();
        if (i.x(fileB) && i.x(fileA)) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (!h.c() && SystemClock.uptimeMillis() - jUptimeMillis < 10000) {
            try {
                SystemClock.sleep(500L);
            } catch (Throwable unused) {
            }
        }
    }

    private boolean z() {
        return com.apm.lite.runtime.a.b("exception_modules", "oom_callback") == 1;
    }

    public void f(long j10) {
        m.b().j(this.f39930k);
        m.b().f(this.f39930k, j10);
    }

    public void g(c cVar) {
        this.f39921b = cVar;
    }

    public void h(String str) {
        this.f39925f.put(str, new Object());
    }

    public void j(Thread thread, Throwable th2, boolean z10, com.apm.lite.d.a aVar) {
        List<ICrashCallback> listG;
        CrashType crashType;
        if (z10) {
            listG = l.a().d();
            crashType = CrashType.LAUNCH;
        } else {
            listG = l.a().g();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback iCrashCallback : listG) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                iCrashCallback.onCrash(crashType, v.b(th2), thread);
                aVar.q("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            } catch (Throwable th3) {
                q.g(th3);
                aVar.q("callback_err_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            }
        }
    }

    public void m(c cVar) {
        this.f39922c = cVar;
    }

    public boolean p(String str) {
        return this.f39925f.containsKey(str);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        do {
            th2 = e(thread, th2);
        } while (th2 != null);
    }
}
