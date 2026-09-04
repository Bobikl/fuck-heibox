package org.apache.tools.mail;

import com.max.xiaoheihe.module.bbs.post_edit.o;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: MailMessage.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f137245k = "localhost";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f137246l = 25;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f137247m = 220;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f137248n = 250;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f137249o = 250;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f137250p = 250;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f137251q = 251;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f137252r = 354;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f137253s = 250;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f137254t = 221;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f137255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f137257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Vector<String> f137258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Vector<String> f137259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Vector<String> f137260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, String> f137261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f137262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f137263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Socket f137264j;

    public b() throws IOException {
        this(f137245k, 25);
    }

    public b(String str) throws IOException {
        this(str, 25);
    }

    public b(String str, int i10) throws IOException {
        this.f137256b = 25;
        this.f137258d = new Vector<>();
        this.f137259e = new Vector<>();
        this.f137260f = new Vector<>();
        this.f137261g = new LinkedHashMap();
        this.f137256b = i10;
        this.f137255a = str;
        d();
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(String str, String str2) {
        this.f137262h.printf("%s: %s%n", str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020 A[PHI: r4
  0x0020: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:16:0x0027, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016 A[PHI: r4
  0x0016: PHI (r4v5 int) = (r4v1 int), (r4v6 int) binds: [B:20:0x002e, B:7:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    static String m(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '(') {
                i12++;
                if (i11 == 0) {
                    i10 = i13;
                }
            } else if (cCharAt == ')') {
                i12--;
                if (i10 == 0) {
                    i11 = i13 + 1;
                }
            } else if (i12 == 0 && cCharAt == '<') {
                i11 = i13 + 1;
            } else if (i12 == 0 && cCharAt == '>') {
                i10 = i13;
            }
        }
        if (i10 != 0) {
            length = i10;
        }
        return str.substring(i11, length);
    }

    public void A(String str) {
        x("Subject", str);
    }

    void B() {
        if (this.f137259e.isEmpty()) {
            return;
        }
        x("To", D(this.f137259e));
    }

    public void C(String str) throws IOException {
        u(str);
        this.f137259e.addElement(str);
    }

    String D(Vector<String> vector) {
        return o.a(", ", vector);
    }

    public void b(String str) throws IOException {
        u(str);
    }

    public void c(String str) throws IOException {
        u(str);
        this.f137260f.addElement(str);
    }

    void d() throws IOException {
        this.f137264j = new Socket(this.f137255a, this.f137256b);
        this.f137262h = new c(new BufferedOutputStream(this.f137264j.getOutputStream()));
        this.f137263i = new d(this.f137264j.getInputStream());
        i();
    }

    void e() throws IOException {
        c cVar = this.f137262h;
        if (cVar != null) {
            cVar.close();
        }
        d dVar = this.f137263i;
        if (dVar != null) {
            try {
                dVar.b();
            } catch (IOException unused) {
            }
        }
        Socket socket = this.f137264j;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused2) {
            }
        }
    }

    void f() throws IOException {
        this.f137261g.forEach(new BiConsumer() { // from class: org.apache.tools.mail.a
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f137244a.k((String) obj, (String) obj2);
            }
        });
        this.f137262h.println();
        this.f137262h.flush();
    }

    public void g(String str) throws IOException {
        r(str);
        this.f137257c = str;
    }

    public PrintStream h() throws IOException {
        w();
        z();
        B();
        v();
        x("X-Mailer", "org.apache.tools.mail.MailMessage (ant.apache.org)");
        p();
        f();
        return this.f137262h;
    }

    void i() throws IOException {
        String strC = this.f137263i.c();
        if (j(strC, new int[]{220})) {
            return;
        }
        throw new IOException("Didn't get introduction from server: " + strC);
    }

    boolean j(String str, int[] iArr) {
        for (int i10 : iArr) {
            if (str.startsWith("" + i10)) {
                return true;
            }
        }
        return false;
    }

    public void l(String str) {
        this.f137258d.addElement(str);
    }

    void n(String str, int[] iArr) throws IOException {
        this.f137262h.a(str + "\r\n");
        String strC = this.f137263i.c();
        if (j(strC, iArr)) {
            return;
        }
        throw new IOException("Unexpected reply to command: " + str + ": " + strC);
    }

    public void o() throws IOException {
        try {
            q();
            t();
        } finally {
            e();
        }
    }

    void p() throws IOException {
        n("DATA", new int[]{354});
    }

    void q() throws IOException {
        n("\r\n.", new int[]{250});
    }

    void r(String str) throws IOException {
        n("MAIL FROM: <" + m(str) + ">", new int[]{250});
    }

    void s() throws IOException {
        n("HELO " + InetAddress.getLocalHost().getCanonicalHostName(), new int[]{250});
    }

    void t() throws IOException {
        try {
            n("QUIT", new int[]{221});
        } catch (IOException e10) {
            throw new ErrorInQuitException(e10);
        }
    }

    void u(String str) throws IOException {
        n("RCPT TO: <" + m(str) + ">", new int[]{250, 251});
    }

    void v() {
        if (this.f137260f.isEmpty()) {
            return;
        }
        x("Cc", D(this.f137260f));
    }

    void w() {
        x("From", this.f137257c);
    }

    public void x(String str, String str2) {
        this.f137261g.put(str, str2);
    }

    public void y(int i10) {
        this.f137256b = i10;
    }

    void z() {
        if (this.f137258d.isEmpty()) {
            return;
        }
        x("Reply-To", D(this.f137258d));
    }
}
