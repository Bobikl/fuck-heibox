package org.apache.tools.ant.types;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Vector;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.VectorSet;

/* JADX INFO: compiled from: FilterSet.java */
/* JADX INFO: loaded from: classes5.dex */
public class f0 extends s implements Cloneable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f136131r = "@";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f136132s = "@";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f136133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f136134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Vector<String> f136135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f136136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f136137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Hashtable<String, String> f136138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Vector<File> f136139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f136140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f136141o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f136142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Vector<a> f136143q;

    /* JADX INFO: compiled from: FilterSet.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f136144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f136145b;

        public a() {
        }

        public a(String str, String str2) {
            c(str);
            d(str2);
        }

        public String a() {
            return this.f136144a;
        }

        public String b() {
            return this.f136145b;
        }

        public void c(String str) {
            this.f136144a = str;
        }

        public void d(String str) {
            this.f136145b = str;
        }
    }

    /* JADX INFO: compiled from: FilterSet.java */
    public class b {
        public b() {
        }

        public void a(File file) {
            f0.this.f136139m.add(file);
        }
    }

    /* JADX INFO: compiled from: FilterSet.java */
    public static class c extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f136147c = {"fail", "warn", org.apache.tools.ant.taskdefs.z0.b.f136024i};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f136148d = new c("fail");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f136149e = new c("warn");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f136150f = new c(org.apache.tools.ant.taskdefs.z0.b.f136024i);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f136151g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f136152h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f136153i = 2;

        public c() {
        }

        public c(String str) {
            g(str);
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return f136147c;
        }
    }

    public f0() {
        this.f136133g = "@";
        this.f136134h = "@";
        this.f136136j = false;
        this.f136137k = true;
        this.f136138l = null;
        this.f136139m = new Vector<>();
        this.f136140n = c.f136148d;
        this.f136141o = false;
        this.f136142p = 0;
        this.f136143q = new Vector<>();
    }

    protected f0(f0 f0Var) {
        this.f136133g = "@";
        this.f136134h = "@";
        this.f136136j = false;
        this.f136137k = true;
        this.f136138l = null;
        this.f136139m = new Vector<>();
        this.f136140n = c.f136148d;
        this.f136141o = false;
        this.f136142p = 0;
        this.f136143q = new Vector<>();
        this.f136143q = (Vector) f0Var.p2().clone();
    }

    private synchronized String A2(String str, String str2) throws BuildException {
        String strM2 = m2();
        String strN2 = n2();
        if (this.f136142p == 0) {
            this.f136135i = new VectorSet();
        }
        this.f136142p++;
        if (this.f136135i.contains(str2) && !this.f136136j) {
            this.f136136j = true;
            System.out.println("Infinite loop in tokens. Currently known tokens : " + this.f136135i.toString() + "\nProblem token : " + strM2 + str2 + strN2 + " called from " + strM2 + this.f136135i.lastElement() + strN2);
            this.f136142p = this.f136142p - 1;
            return str2;
        }
        this.f136135i.addElement(str2);
        String strU2 = u2(str);
        if (!strU2.contains(strM2) && !this.f136136j && this.f136142p == 1) {
            this.f136135i = null;
        } else if (this.f136136j) {
            if (!this.f136135i.isEmpty()) {
                Vector<String> vector = this.f136135i;
                strU2 = vector.remove(vector.size() - 1);
                if (this.f136135i.isEmpty()) {
                    strU2 = strM2 + strU2 + strN2;
                    this.f136136j = false;
                }
            }
        } else if (!this.f136135i.isEmpty()) {
            Vector<String> vector2 = this.f136135i;
            vector2.remove(vector2.size() - 1);
        }
        this.f136142p--;
        return strU2;
    }

    private void s2(String str) {
        int iB = this.f136140n.b();
        if (iB == 0) {
            throw new BuildException(str);
        }
        if (iB == 1) {
            x1(str, 1);
        } else if (iB != 2) {
            throw new BuildException("Invalid value for onMissingFiltersFile");
        }
    }

    private synchronized String u2(String str) {
        int length;
        String strM2 = m2();
        String strN2 = n2();
        int iIndexOf = str.indexOf(strM2);
        if (iIndexOf <= -1) {
            return str;
        }
        Hashtable<String, String> hashtableO2 = o2();
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            while (iIndexOf > -1) {
                int iIndexOf2 = str.indexOf(strN2, strM2.length() + iIndexOf + 1);
                if (iIndexOf2 == -1) {
                    break;
                }
                String strSubstring = str.substring(strM2.length() + iIndexOf, iIndexOf2);
                sb2.append((CharSequence) str, i10, iIndexOf);
                if (hashtableO2.containsKey(strSubstring)) {
                    String strA2 = hashtableO2.get(strSubstring);
                    if (this.f136137k && !strA2.equals(strSubstring)) {
                        strA2 = A2(strA2, strSubstring);
                    }
                    x1("Replacing: " + strM2 + strSubstring + strN2 + " -> " + strA2, 3);
                    sb2.append(strA2);
                    length = iIndexOf + strM2.length() + strSubstring.length() + strN2.length();
                } else {
                    sb2.append(strM2.charAt(0));
                    length = iIndexOf + 1;
                }
                i10 = length;
                iIndexOf = str.indexOf(strM2, i10);
            }
            sb2.append(str.substring(i10));
            return sb2.toString();
        } catch (StringIndexOutOfBoundsException unused) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w2(a aVar) {
        this.f136138l.put(aVar.a(), aVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x2(Object obj, Object obj2) {
        k2(new a((String) obj, (String) obj2));
    }

    public void B2(String str) {
        if (Y1()) {
            throw d2();
        }
        if (str == null || str.isEmpty()) {
            throw new BuildException("beginToken must not be empty");
        }
        this.f136133g = str;
    }

    public void C2(String str) {
        if (Y1()) {
            throw d2();
        }
        if (str == null || str.isEmpty()) {
            throw new BuildException("endToken must not be empty");
        }
        this.f136134h = str;
    }

    public void D2(File file) throws BuildException {
        if (Y1()) {
            throw d2();
        }
        this.f136139m.add(file);
    }

    public void E2(c cVar) {
        this.f136140n = cVar;
    }

    public void F2(boolean z10) {
        this.f136137k = z10;
    }

    @Override // org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public synchronized Object clone() throws BuildException {
        if (Y1()) {
            return r2().clone();
        }
        try {
            f0 f0Var = (f0) super.clone();
            f0Var.f136143q = (Vector) p2().clone();
            f0Var.J(b());
            return f0Var;
        } catch (CloneNotSupportedException e10) {
            throw new BuildException(e10);
        }
    }

    public synchronized void h2(f0 f0Var) {
        if (Y1()) {
            throw Z1();
        }
        Iterator<a> it = f0Var.p2().iterator();
        while (it.hasNext()) {
            k2(it.next());
        }
    }

    public synchronized void i2(j1 j1Var) {
        if (Y1()) {
            throw Z1();
        }
        for (Map.Entry entry : j1Var.A2().entrySet()) {
            k2(new a(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
        }
    }

    public synchronized void j2(String str, String str2) {
        if (Y1()) {
            throw Z1();
        }
        k2(new a(str, str2));
    }

    public synchronized void k2(a aVar) {
        if (Y1()) {
            throw Z1();
        }
        this.f136143q.addElement(aVar);
        this.f136138l = null;
    }

    public b l2() {
        if (Y1()) {
            throw Z1();
        }
        return new b();
    }

    public String m2() {
        return Y1() ? r2().m2() : this.f136133g;
    }

    public String n2() {
        return Y1() ? r2().n2() : this.f136134h;
    }

    public synchronized Hashtable<String, String> o2() {
        if (Y1()) {
            return r2().o2();
        }
        H1();
        if (this.f136138l == null) {
            this.f136138l = new Hashtable<>(p2().size());
            p2().forEach(new Consumer() { // from class: org.apache.tools.ant.types.e0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f136128b.w2((f0.a) obj);
                }
            });
        }
        return this.f136138l;
    }

    protected synchronized Vector<a> p2() {
        if (Y1()) {
            return r2().p2();
        }
        H1();
        if (!this.f136141o) {
            this.f136141o = true;
            Iterator<File> it = this.f136139m.iterator();
            while (it.hasNext()) {
                y2(it.next());
            }
            this.f136139m.clear();
            this.f136141o = false;
        }
        return this.f136143q;
    }

    public c q2() {
        return this.f136140n;
    }

    protected f0 r2() {
        return (f0) O1(f0.class);
    }

    public synchronized boolean t2() {
        return !p2().isEmpty();
    }

    public boolean v2() {
        return this.f136137k;
    }

    public synchronized void y2(File file) throws BuildException {
        if (Y1()) {
            throw d2();
        }
        if (!file.exists()) {
            s2("Could not read filters from file " + file + " as it doesn't exist.");
        }
        if (file.isFile()) {
            x1("Reading filters from " + file, 3);
            try {
                InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
                try {
                    Properties properties = new Properties();
                    properties.load(inputStreamNewInputStream);
                    properties.forEach(new BiConsumer() { // from class: org.apache.tools.ant.types.d0
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            this.f136126a.x2(obj, obj2);
                        }
                    });
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
            } catch (Exception e10) {
                throw new BuildException("Could not read filters from file: " + file, e10);
            }
        } else {
            s2("Must specify a file rather than a directory in the filtersfile attribute:" + file);
        }
        this.f136138l = null;
    }

    public synchronized String z2(String str) {
        return u2(str);
    }
}
