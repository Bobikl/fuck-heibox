package org.apache.tools.ant.filters;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.types.r1;
import org.apache.tools.ant.types.x1;
import org.apache.tools.ant.util.h0;
import org.apache.tools.ant.util.i2;
import org.apache.tools.ant.util.j2;
import org.apache.tools.ant.util.p2;
import org.apache.tools.ant.util.z0;

/* JADX INFO: compiled from: TokenFilter.java */
/* JADX INFO: loaded from: classes5.dex */
public class z extends org.apache.tools.ant.filters.a implements org.apache.tools.ant.filters.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Vector<f> f133291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p2 f133292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f133293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f133294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f133295i;

    /* JADX INFO: compiled from: TokenFilter.java */
    public static abstract class a extends b2 implements org.apache.tools.ant.filters.c, f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f133296e = true;

        public void B1(boolean z10) {
            this.f133296e = z10;
        }

        @Override // org.apache.tools.ant.filters.c
        public Reader t0(Reader reader) {
            z zVar = new z(reader);
            if (!this.f133296e) {
                zVar.i(new e());
            }
            zVar.g(this);
            return zVar;
        }
    }

    /* JADX INFO: compiled from: TokenFilter.java */
    public static class b extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f133297f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f133298g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private r1 f133299h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private x1 f133300i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f133301j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f133302k = "";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f133303l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private org.apache.tools.ant.util.regexp.c f133304m;

        private void D1() {
            if (this.f133301j) {
                return;
            }
            this.f133303l = z.z(this.f133302k);
            if (this.f133297f == null) {
                throw new BuildException("Missing from in containsregex");
            }
            r1 r1Var = new r1();
            this.f133299h = r1Var;
            r1Var.j2(this.f133297f);
            this.f133304m = this.f133299h.g2(b());
            if (this.f133298g == null) {
                return;
            }
            x1 x1Var = new x1();
            this.f133300i = x1Var;
            x1Var.g2(this.f133298g);
        }

        @Override // org.apache.tools.ant.filters.z.f
        public String A0(String str) {
            D1();
            if (!this.f133304m.e(str, this.f133303l)) {
                return null;
            }
            x1 x1Var = this.f133300i;
            return x1Var == null ? str : this.f133304m.a(str, x1Var.e2(b()), this.f133303l);
        }

        public void G1(String str) {
            this.f133302k = str;
        }

        public void H1(String str) {
            this.f133297f = str;
        }

        public void I1(String str) {
            this.f133298g = str;
        }
    }

    /* JADX INFO: compiled from: TokenFilter.java */
    public static class c extends b2 implements f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f133305e;

        @Override // org.apache.tools.ant.filters.z.f
        public String A0(String str) {
            String str2 = this.f133305e;
            if (str2 == null) {
                throw new BuildException("Missing contains in containsstring");
            }
            if (str.contains(str2)) {
                return str;
            }
            return null;
        }

        public void B1(String str) {
            this.f133305e = str;
        }
    }

    /* JADX INFO: compiled from: TokenFilter.java */
    public static class d extends b2 implements f, org.apache.tools.ant.filters.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f133306e = "";

        /* JADX INFO: compiled from: TokenFilter.java */
        public class a extends org.apache.tools.ant.filters.a {
            a(Reader reader) {
                super(reader);
            }

            @Override // java.io.FilterReader, java.io.Reader
            public int read() throws IOException {
                int i10;
                do {
                    i10 = ((FilterReader) this).in.read();
                    if (i10 == -1) {
                        return i10;
                    }
                } while (d.this.D1((char) i10));
                return i10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean D1(char c10) {
            for (int i10 = 0; i10 < this.f133306e.length(); i10++) {
                if (this.f133306e.charAt(i10) == c10) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.apache.tools.ant.filters.z.f
        public String A0(String str) {
            StringBuffer stringBuffer = new StringBuffer(str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (!D1(cCharAt)) {
                    stringBuffer.append(cCharAt);
                }
            }
            return stringBuffer.toString();
        }

        public void G1(String str) {
            this.f133306e = z.A(str);
        }

        @Override // org.apache.tools.ant.filters.c
        public Reader t0(Reader reader) {
            return new a(reader);
        }
    }

    /* JADX INFO: compiled from: TokenFilter.java */
    public static class e extends h0 {
    }

    /* JADX INFO: compiled from: TokenFilter.java */
    public interface f {
        String A0(String str);
    }

    /* JADX INFO: compiled from: TokenFilter.java */
    public static class g extends a {
        @Override // org.apache.tools.ant.filters.z.f
        public String A0(String str) {
            if (str.trim().isEmpty()) {
                return null;
            }
            return str;
        }
    }

    /* JADX INFO: compiled from: TokenFilter.java */
    public static class h extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f133308f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f133309g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private r1 f133310h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private x1 f133311i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f133312j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f133313k = "";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f133314l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private org.apache.tools.ant.util.regexp.c f133315m;

        private void D1() {
            if (this.f133312j) {
                return;
            }
            this.f133314l = z.z(this.f133313k);
            if (this.f133308f == null) {
                throw new BuildException("Missing pattern in replaceregex");
            }
            r1 r1Var = new r1();
            this.f133310h = r1Var;
            r1Var.j2(this.f133308f);
            this.f133315m = this.f133310h.g2(b());
            if (this.f133309g == null) {
                this.f133309g = "";
            }
            x1 x1Var = new x1();
            this.f133311i = x1Var;
            x1Var.g2(this.f133309g);
        }

        @Override // org.apache.tools.ant.filters.z.f
        public String A0(String str) {
            D1();
            return !this.f133315m.e(str, this.f133314l) ? str : this.f133315m.a(str, this.f133311i.e2(b()), this.f133314l);
        }

        public void G1(String str) {
            this.f133313k = str;
        }

        public void H1(String str) {
            this.f133308f = str;
        }

        public void I1(String str) {
            this.f133309g = str;
        }
    }

    /* JADX INFO: compiled from: TokenFilter.java */
    public static class i extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f133316f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f133317g;

        @Override // org.apache.tools.ant.filters.z.f
        public String A0(String str) {
            if (this.f133316f == null) {
                throw new BuildException("Missing from in stringreplace");
            }
            StringBuffer stringBuffer = new StringBuffer();
            int length = 0;
            int iIndexOf = str.indexOf(this.f133316f);
            while (iIndexOf >= 0) {
                if (iIndexOf > length) {
                    stringBuffer.append((CharSequence) str, length, iIndexOf);
                }
                String str2 = this.f133317g;
                if (str2 != null) {
                    stringBuffer.append(str2);
                }
                length = this.f133316f.length() + iIndexOf;
                iIndexOf = str.indexOf(this.f133316f, length);
            }
            if (str.length() > length) {
                stringBuffer.append((CharSequence) str, length, str.length());
            }
            return stringBuffer.toString();
        }

        public void n0(String str) {
            this.f133316f = str;
        }

        public void q0(String str) {
            this.f133317g = str;
        }
    }

    /* JADX INFO: compiled from: TokenFilter.java */
    public static class j extends i2 {
    }

    /* JADX INFO: compiled from: TokenFilter.java */
    public static class k extends a {
        @Override // org.apache.tools.ant.filters.z.f
        public String A0(String str) {
            return str.trim();
        }
    }

    public z() {
        this.f133291e = new Vector<>();
        this.f133292f = null;
        this.f133293g = null;
        this.f133294h = null;
        this.f133295i = 0;
    }

    public z(Reader reader) {
        super(reader);
        this.f133291e = new Vector<>();
        this.f133292f = null;
        this.f133293g = null;
        this.f133294h = null;
        this.f133295i = 0;
    }

    public static String A(String str) {
        return j2.k(str);
    }

    public static int z(String str) {
        return org.apache.tools.ant.util.regexp.g.a(str);
    }

    public void C(String str) {
        this.f133293g = A(str);
    }

    public void g(f fVar) {
        this.f133291e.addElement(fVar);
    }

    public void i(p2 p2Var) {
        if (this.f133292f != null) {
            throw new BuildException("Only one tokenizer allowed");
        }
        this.f133292f = p2Var;
    }

    public void k(b bVar) {
        this.f133291e.addElement(bVar);
    }

    public void m(c cVar) {
        this.f133291e.addElement(cVar);
    }

    public void n(d dVar) {
        this.f133291e.addElement(dVar);
    }

    public void o(e eVar) {
        i(eVar);
    }

    public void p(g gVar) {
        this.f133291e.addElement(gVar);
    }

    public void q(z0 z0Var) {
        i(z0Var);
    }

    public void r(h hVar) {
        this.f133291e.addElement(hVar);
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        if (this.f133292f == null) {
            this.f133292f = new z0();
        }
        while (true) {
            String str = this.f133294h;
            if (str != null && !str.isEmpty()) {
                char cCharAt = this.f133294h.charAt(this.f133295i);
                int i10 = this.f133295i + 1;
                this.f133295i = i10;
                if (i10 == this.f133294h.length()) {
                    this.f133294h = null;
                }
                return cCharAt;
            }
            String strH = this.f133292f.h(((FilterReader) this).in);
            this.f133294h = strH;
            if (strH == null) {
                return -1;
            }
            Iterator<f> it = this.f133291e.iterator();
            while (it.hasNext()) {
                String strA0 = it.next().A0(this.f133294h);
                this.f133294h = strA0;
                if (strA0 == null) {
                    break;
                }
            }
            this.f133295i = 0;
            if (this.f133294h != null && !this.f133292f.X0().isEmpty()) {
                if (this.f133293g != null) {
                    this.f133294h += this.f133293g;
                } else {
                    this.f133294h += this.f133292f.X0();
                }
            }
        }
    }

    public void s(i iVar) {
        this.f133291e.addElement(iVar);
    }

    public void t(j jVar) {
        i(jVar);
    }

    @Override // org.apache.tools.ant.filters.c
    public final Reader t0(Reader reader) {
        z zVar = new z(reader);
        zVar.f133291e = this.f133291e;
        zVar.f133292f = this.f133292f;
        zVar.f133293g = this.f133293g;
        zVar.f(b());
        return zVar;
    }

    public void x(k kVar) {
        this.f133291e.addElement(kVar);
    }
}
