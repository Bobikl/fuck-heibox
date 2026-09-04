package com.tencent.qmsp.sdk.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f101773j = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f101780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l f101781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f101782f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g f101784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[][] f101772i = {new byte[]{org.apache.tools.tar.c.J, 125, -93}, new byte[]{41, 121, -79, 113, 35, 43, 57, -18, 42}};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static ConcurrentHashMap<Long, InterfaceC0992f> f101774k = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Handler f101775l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile f f101776m = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f101777a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f101778b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f101779c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.tencent.qmsp.sdk.d.c f101783g = null;

    public class a implements com.tencent.qmsp.sdk.c.a.InterfaceC0991a {
        a(f fVar) {
        }

        @Override // com.tencent.qmsp.sdk.c.a.InterfaceC0991a
        public void a() {
            com.tencent.qmsp.sdk.f.g.a("Qp.QFW", 1, "Something wrong when load native so.");
        }

        @Override // com.tencent.qmsp.sdk.c.a.InterfaceC0991a
        public void run() {
            if (f.f101773j) {
                return;
            }
            try {
                if (!f.k()) {
                    System.loadLibrary(f.c(0));
                }
                boolean unused = f.f101773j = true;
            } catch (UnsatisfiedLinkError e10) {
                e10.printStackTrace();
            }
        }
    }

    public class b implements com.tencent.qmsp.sdk.c.a.InterfaceC0991a {
        b() {
        }

        @Override // com.tencent.qmsp.sdk.c.a.InterfaceC0991a
        public void a() {
            com.tencent.qmsp.sdk.f.g.a("Qp.QFW", 1, "Something wrong when init native.");
        }

        @Override // com.tencent.qmsp.sdk.c.a.InterfaceC0991a
        public void run() {
            Object obj;
            if (!f.f101773j || f.this.f101778b) {
                return;
            }
            try {
                Object[] objArr = new Object[1];
                if (f.a(1L, 512L, com.tencent.qmsp.sdk.a.c.g(), 0L, f.this.f101781e, com.tencent.qmsp.sdk.app.a.getContext(), null, objArr) == 0 && (obj = objArr[0]) != null && (obj instanceof Integer)) {
                    f.this.f101777a = ((Integer) obj).intValue();
                    int unused = f.this.f101777a;
                    f.this.f101778b = true;
                }
                com.tencent.qmsp.sdk.f.g.a("Qp.QFW", 1, String.format("Native ver: %d(%s)", Integer.valueOf(f.this.f101777a), com.tencent.qmsp.sdk.a.c.a(f.this.f101777a)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class c extends Handler {
        c(f fVar, Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                long j10 = Long.parseLong((String) message.obj);
                if (message.what != 1 || j10 == 0) {
                    return;
                }
                com.tencent.qmsp.sdk.f.g.a("Qp.QFW", 1, String.format("handle native msg for cookie: %08X", Long.valueOf(j10)));
                f.a(6L, j10, 0L, 0L, null, null, null, null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class d implements InterfaceC0992f {
        d() {
        }

        @Override // com.tencent.qmsp.sdk.c.f.InterfaceC0992f
        public int a(long j10, long j11, long j12, Object obj, Object obj2, Object[] objArr, Object[] objArr2) {
            if (j10 != 0) {
                com.tencent.qmsp.sdk.f.g.a("Qp.QFW", 1, String.format("Native msg, cookie: %08X, delay: %d", Long.valueOf(j10), Long.valueOf(j11)));
                String strValueOf = String.valueOf(j10);
                if (j11 != 0) {
                    f.this.f101780d.sendMessageDelayed(f.this.f101780d.obtainMessage(1, strValueOf), j11 * 1000);
                } else {
                    f.this.f101780d.sendMessage(f.this.f101780d.obtainMessage(1, strValueOf));
                }
            }
            return 0;
        }
    }

    public class e implements k.e {
        e() {
        }

        @Override // com.tencent.qmsp.sdk.c.k.e
        public void a(int i10, int i11) {
            f.this.f101782f.b(this);
        }
    }

    /* JADX INFO: renamed from: com.tencent.qmsp.sdk.c.f$f, reason: collision with other inner class name */
    public interface InterfaceC0992f {
        int a(long j10, long j11, long j12, Object obj, Object obj2, Object[] objArr, Object[] objArr2);
    }

    private f() {
        this.f101780d = null;
        this.f101781e = null;
        this.f101782f = null;
        this.f101784h = null;
        if (com.tencent.qmsp.sdk.app.a.getContext() == null) {
            return;
        }
        j();
        l lVar = new l();
        this.f101781e = lVar;
        lVar.a(n.b());
        new com.tencent.qmsp.sdk.c.a(c(0), 86400000L).a(new b());
        this.f101784h = g.d();
        k kVarE = k.e();
        this.f101782f = kVarE;
        kVarE.a(this.f101784h);
        this.f101780d = new c(this, com.tencent.qmsp.sdk.app.b.e().c());
        a(2L, new d());
    }

    public static int a(long j10, long j11, long j12, long j13, Object obj, Object obj2, Object[] objArr, Object[] objArr2) {
        if (!f101773j) {
            return 27;
        }
        try {
            return goingDownInternal(j10, j11, j12, j13, obj, obj2, objArr, objArr2);
        } catch (UnsatisfiedLinkError e10) {
            e10.printStackTrace();
            return 29;
        }
    }

    public static String a(int i10, int i11, int i12, int i13, Object obj, Object obj2) {
        if ((obj instanceof String) && obj != null && f101773j) {
            try {
                return goingDownInternal(i10, i11, i12, i13, obj, obj2);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static void a(long j10, InterfaceC0992f interfaceC0992f) {
        if (interfaceC0992f != null) {
            f101774k.put(Long.valueOf(j10), interfaceC0992f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(int i10) {
        return com.tencent.qmsp.sdk.f.h.a(f101772i[i10]);
    }

    private static native int goingDownInternal(long j10, long j11, long j12, long j13, Object obj, Object obj2, Object[] objArr, Object[] objArr2);

    private static native String goingDownInternal(long j10, long j11, long j12, long j13, Object obj, Object obj2);

    private static int goingUp(long j10, long j11, long j12, long j13, Object obj, Object obj2, Object[] objArr, Object[] objArr2) {
        InterfaceC0992f interfaceC0992f = f101774k.get(Long.valueOf(j10));
        if (interfaceC0992f != null) {
            return interfaceC0992f.a(j11, j12, j13, obj, obj2, objArr, objArr2);
        }
        return 30;
    }

    public static f i() {
        if (f101776m == null) {
            synchronized (f.class) {
                if (f101776m == null) {
                    f101776m = new f();
                }
            }
        }
        return f101776m;
    }

    private void j() {
        new com.tencent.qmsp.sdk.c.a(c(0), 86400000L).a(new a(this));
        f101775l = new Handler(com.tencent.qmsp.sdk.app.b.e().c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k() {
        if (f101773j) {
            return true;
        }
        String str = com.tencent.qmsp.sdk.a.b.b() + File.separator + c(1);
        File file = new File(str);
        if (!file.exists() || !com.tencent.qmsp.sdk.d.e.b(file, null)) {
            return false;
        }
        try {
            System.load(str);
            return true;
        } catch (UnsatisfiedLinkError e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public int a(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        return this.f101782f.a(i10, i11, i12, objArr, objArr2);
    }

    public Boolean a(int i10) {
        g gVar = this.f101784h;
        int iA = gVar != null ? gVar.a(i10) : -1;
        boolean z10 = true;
        if (1 != iA && com.tencent.qmsp.sdk.c.b.f101770b) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public void a() {
        g gVar = this.f101784h;
        if (gVar != null) {
            gVar.a();
        }
        k kVar = this.f101782f;
        if (kVar != null) {
            kVar.a();
        }
        if (f101776m != null) {
            f101776m = null;
        }
    }

    public void a(com.tencent.qmsp.sdk.d.c cVar) {
        this.f101783g = cVar;
    }

    public g b() {
        return this.f101784h;
    }

    public Handler c() {
        return f101775l;
    }

    public com.tencent.qmsp.sdk.d.c d() {
        return this.f101783g;
    }

    public void e() {
        this.f101782f.b();
    }

    public void f() {
        if (!this.f101779c) {
            this.f101779c = true;
        }
        if (com.tencent.qmsp.sdk.c.b.f101770b) {
            com.tencent.qmsp.sdk.e.a.a();
            com.tencent.qmsp.sdk.e.c.a();
        }
        com.tencent.qmsp.sdk.e.b.a();
        if (com.tencent.qmsp.sdk.c.b.f101770b) {
            this.f101782f.a(new e());
            this.f101782f.c();
        }
    }
}
