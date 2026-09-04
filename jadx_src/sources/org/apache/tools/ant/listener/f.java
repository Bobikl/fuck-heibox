package org.apache.tools.ant.listener;

import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlinx.coroutines.s0;
import org.apache.tools.ant.BuildEvent;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.util.d0;
import org.apache.tools.ant.util.j0;
import org.apache.tools.ant.y;

/* JADX INFO: compiled from: MailLogger.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends y {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f133538j = "text/plain";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private StringBuffer f133539i = new StringBuffer();

    /* JADX INFO: compiled from: MailLogger.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f133540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f133541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f133542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f133543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f133544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f133545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f133546g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f133547h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f133548i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f133549j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f133550k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f133551l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f133552m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f133553n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f133554o;

        private b() {
        }

        public String A() {
            return this.f133547h;
        }

        public b B(String str) {
            this.f133547h = str;
            return this;
        }

        public String C() {
            return this.f133542c;
        }

        public b D(String str) {
            this.f133542c = str;
            return this;
        }

        public String a() {
            return this.f133553n;
        }

        public b b(String str) {
            this.f133553n = str;
            return this;
        }

        public String c() {
            return this.f133551l;
        }

        public b d(String str) {
            this.f133551l = str;
            return this;
        }

        public String e() {
            return this.f133545f;
        }

        public b f(String str) {
            this.f133545f = str;
            return this;
        }

        public String g() {
            return this.f133540a;
        }

        public b h(String str) {
            this.f133540a = str;
            return this;
        }

        public String i() {
            return this.f133552m;
        }

        public b j(String str) {
            this.f133552m = str;
            return this;
        }

        public String k() {
            return this.f133543d;
        }

        public b l(String str) {
            this.f133543d = str;
            return this;
        }

        public int m() {
            return this.f133541b;
        }

        public b n(int i10) {
            this.f133541b = i10;
            return this;
        }

        public String o() {
            return this.f133546g;
        }

        public b p(String str) {
            this.f133546g = str;
            return this;
        }

        public b q(boolean z10) {
            this.f133544e = z10;
            return this;
        }

        public boolean r() {
            return this.f133544e;
        }

        public b s(boolean z10) {
            this.f133554o = z10;
            return this;
        }

        public boolean t() {
            return this.f133554o;
        }

        public String u() {
            return this.f133550k;
        }

        public b v(String str) {
            this.f133550k = str;
            return this;
        }

        public String w() {
            return this.f133549j;
        }

        public b x(String str) {
            this.f133549j = str;
            return this;
        }

        public String y() {
            return this.f133548i;
        }

        public b z(String str) {
            this.f133548i = str;
            return this;
        }
    }

    private String l(Map<String, Object> map, String str, String str2) {
        String str3 = "MailLogger." + str;
        String str4 = (String) map.get(str3);
        if (str4 != null) {
            str2 = str4;
        }
        if (str2 != null) {
            return str2;
        }
        throw new RuntimeException("Missing required parameter: " + str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Map map, Project project, Properties properties, String str) {
        map.put(str, project.V0(properties.getProperty(str)));
    }

    private void o(b bVar, String str) throws IOException {
        org.apache.tools.mail.b bVar2 = new org.apache.tools.mail.b(bVar.g(), bVar.m());
        bVar2.x("Date", d0.h());
        bVar2.g(bVar.e());
        if (!bVar.o().isEmpty()) {
            StringTokenizer stringTokenizer = new StringTokenizer(bVar.o(), ", ", false);
            while (stringTokenizer.hasMoreTokens()) {
                bVar2.l(stringTokenizer.nextToken());
            }
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(bVar.A(), ", ", false);
        while (stringTokenizer2.hasMoreTokens()) {
            bVar2.C(stringTokenizer2.nextToken());
        }
        bVar2.A(bVar.u());
        if (bVar.c().isEmpty()) {
            bVar2.x("Content-Type", bVar.i());
        } else {
            bVar2.x("Content-Type", bVar.i() + "; charset=\"" + bVar.c() + "\"");
        }
        PrintStream printStreamH = bVar2.h();
        if (!bVar.a().isEmpty()) {
            str = bVar.a();
        }
        printStreamH.println(str);
        bVar2.o();
    }

    private void p(Project project, b bVar, String str) {
        try {
            org.apache.tools.ant.taskdefs.email.d dVar = (org.apache.tools.ant.taskdefs.email.d) org.apache.tools.ant.util.i.k("org.apache.tools.ant.taskdefs.email.MimeMailer", f.class.getClassLoader(), org.apache.tools.ant.taskdefs.email.d.class);
            Vector<org.apache.tools.ant.taskdefs.email.a> vectorQ = q(bVar.o());
            dVar.k(bVar.g());
            dVar.p(bVar.m());
            dVar.w(bVar.C());
            dVar.o(bVar.k());
            dVar.s(bVar.r());
            dVar.g(bVar.t());
            if (!bVar.a().isEmpty()) {
                str = bVar.a();
            }
            org.apache.tools.ant.taskdefs.email.e eVar = new org.apache.tools.ant.taskdefs.email.e(str);
            eVar.J(project);
            eVar.O1(bVar.i());
            if (!bVar.c().isEmpty()) {
                eVar.L1(bVar.c());
            }
            dVar.n(eVar);
            dVar.i(new org.apache.tools.ant.taskdefs.email.a(bVar.e()));
            dVar.r(vectorQ);
            dVar.v(q(bVar.A()));
            dVar.f(q(bVar.y()));
            dVar.e(q(bVar.w()));
            dVar.h(new Vector<>());
            dVar.t(bVar.u());
            dVar.j(new Vector<>());
            dVar.d();
        } catch (BuildException e10) {
            e = e10;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            h("Failed to initialise MIME mail: " + e.getMessage());
        }
    }

    private Vector<org.apache.tools.ant.taskdefs.email.a> q(String str) {
        return (Vector) Stream.of((Object[]) str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)).map(new Function() { // from class: org.apache.tools.ant.listener.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new org.apache.tools.ant.taskdefs.email.a((String) obj);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: org.apache.tools.ant.listener.e
            @Override // java.util.function.Supplier
            public final Object get() {
                return new Vector();
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.tools.ant.y, org.apache.tools.ant.k
    public void R0(BuildEvent buildEvent) throws Throwable {
        InputStream inputStreamNewInputStream;
        super.R0(buildEvent);
        final Project projectD = buildEvent.d();
        final Hashtable<String, Object> hashtableT0 = projectD.t0();
        final Properties properties = new Properties();
        String str = (String) hashtableT0.get("MailLogger.properties.file");
        InputStream inputStream = null;
        Object[] objArr = 0;
        if (str != null) {
            try {
                inputStreamNewInputStream = Files.newInputStream(Paths.get(str, new String[0]), new OpenOption[0]);
                try {
                    properties.load(inputStreamNewInputStream);
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamNewInputStream;
                    j0.c(inputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                inputStreamNewInputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
            j0.c(inputStreamNewInputStream);
        }
        properties.stringPropertyNames().forEach(new Consumer() { // from class: org.apache.tools.ant.listener.c
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                f.n(hashtableT0, projectD, properties, (String) obj);
            }
        });
        boolean z10 = buildEvent.a() == null;
        String str2 = z10 ? "success" : "failure";
        try {
            if (Project.t1(l(hashtableT0, str2 + ".notify", "on"))) {
                b bVarV = new b().h(l(hashtableT0, "mailhost", org.apache.tools.mail.b.f137245k)).n(Integer.parseInt(l(hashtableT0, HeyboxMicFragment.f93763y, String.valueOf(25)))).D(l(hashtableT0, "user", "")).l(l(hashtableT0, g0.a.f118920d, "")).q(Project.t1(l(hashtableT0, "ssl", s0.f130317e))).s(Project.t1(l(hashtableT0, "starttls.enable", s0.f130317e))).f(l(hashtableT0, "from", null)).p(l(hashtableT0, "replyto", "")).B(l(hashtableT0, str2 + ".to", null)).z(l(hashtableT0, str2 + ".cc", "")).x(l(hashtableT0, str2 + ".bcc", "")).j(l(hashtableT0, "mimeType", "text/plain")).d(l(hashtableT0, "charset", "")).b(l(hashtableT0, str2 + ".body", "")).v(l(hashtableT0, str2 + ".subject", z10 ? "Build Success" : "Build Failure"));
                if (!bVarV.C().isEmpty() || !bVarV.k().isEmpty() || bVarV.r() || bVarV.t()) {
                    p(buildEvent.d(), bVarV, this.f133539i.substring(0));
                } else {
                    o(bVarV, this.f133539i.substring(0));
                }
            }
        } catch (Exception e10) {
            System.out.println("MailLogger failed to send e-mail!");
            e10.printStackTrace(System.err);
        }
    }

    @Override // org.apache.tools.ant.y
    protected void h(String str) {
        StringBuffer stringBuffer = this.f133539i;
        stringBuffer.append(str);
        stringBuffer.append(System.lineSeparator());
    }
}
