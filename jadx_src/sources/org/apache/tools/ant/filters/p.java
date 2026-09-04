package org.apache.tools.ant.filters;

import java.io.File;
import java.io.FilterReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import org.apache.tools.ant.types.m0;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: ReplaceTokens.java */
/* JADX INFO: loaded from: classes5.dex */
public final class p extends b implements c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f133236n = "@";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f133237o = "@";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Hashtable<String, String> f133238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TreeMap<String, String> f133239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f133240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f133241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f133242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f133243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f133244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f133245m;

    /* JADX INFO: compiled from: ReplaceTokens.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f133246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f133247b;

        public final String a() {
            return this.f133246a;
        }

        public final String b() {
            return this.f133247b;
        }

        public final void c(String str) {
            this.f133246a = str;
        }

        public final void d(String str) {
            this.f133247b = str;
        }
    }

    public p() {
        this.f133238f = new Hashtable<>();
        this.f133239g = new TreeMap<>();
        this.f133240h = false;
        this.f133241i = "";
        this.f133242j = null;
        this.f133243k = -1;
        this.f133244l = "@";
        this.f133245m = "@";
    }

    public p(Reader reader) {
        super(reader);
        this.f133238f = new Hashtable<>();
        this.f133239g = new TreeMap<>();
        this.f133240h = false;
        this.f133241i = "";
        this.f133242j = null;
        this.f133243k = -1;
        this.f133244l = "@";
        this.f133245m = "@";
    }

    private void C(Hashtable<String, String> hashtable) {
        this.f133238f = hashtable;
    }

    private String m() {
        return this.f133244l;
    }

    private String n() {
        return this.f133245m;
    }

    private int o() {
        if (this.f133241i.isEmpty()) {
            return -1;
        }
        char cCharAt = this.f133241i.charAt(0);
        this.f133241i = this.f133241i.substring(1);
        return cCharAt;
    }

    private Properties p(s1 s1Var) {
        Properties properties = new Properties();
        InputStream inputStreamH2 = null;
        try {
            try {
                inputStreamH2 = s1Var.h2();
                properties.load(inputStreamH2);
            } catch (IOException e10) {
                if (b() != null) {
                    b().M0("getProperties failed, " + e10.getMessage(), 0);
                } else {
                    e10.printStackTrace();
                }
            }
            return properties;
        } finally {
            j0.c(inputStreamH2);
        }
    }

    private Hashtable<String, String> q() {
        return this.f133238f;
    }

    private void r() {
        m0[] m0VarArrG = g();
        if (m0VarArrG != null) {
            for (m0 m0Var : m0VarArrG) {
                if (m0Var != null) {
                    String strB = m0Var.b();
                    if ("tokenchar".equals(strB)) {
                        String strA = m0Var.a();
                        if ("begintoken".equals(strA)) {
                            this.f133244l = m0Var.c();
                        } else if ("endtoken".equals(strA)) {
                            this.f133245m = m0Var.c();
                        }
                    } else if ("token".equals(strB)) {
                        this.f133238f.put(m0Var.a(), m0Var.c());
                    } else if ("propertiesfile".equals(strB)) {
                        t(new org.apache.tools.ant.types.resources.z(new File(m0Var.c())));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(Properties properties, String str) {
        this.f133238f.put(str, properties.getProperty(str));
    }

    private void t(s1 s1Var) {
        final Properties propertiesP = p(s1Var);
        propertiesP.stringPropertyNames().forEach(new Consumer() { // from class: org.apache.tools.ant.filters.o
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f133234b.s(propertiesP, (String) obj);
            }
        });
    }

    public void A(s1 s1Var) {
        t(s1Var);
    }

    public void k(a aVar) {
        this.f133238f.put(aVar.a(), aVar.b());
        this.f133240h = false;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        if (!a()) {
            r();
            e(true);
        }
        if (!this.f133240h) {
            for (Map.Entry<String, String> entry : this.f133238f.entrySet()) {
                this.f133239g.put(this.f133244l + entry.getKey() + this.f133245m, entry.getValue());
            }
            this.f133240h = true;
        }
        String str = this.f133242j;
        if (str != null) {
            if (this.f133243k < str.length()) {
                String str2 = this.f133242j;
                int i10 = this.f133243k;
                this.f133243k = i10 + 1;
                return str2.charAt(i10);
            }
            this.f133242j = null;
        }
        if (this.f133241i.isEmpty()) {
            int i11 = ((FilterReader) this).in.read();
            if (i11 == -1) {
                return i11;
            }
            this.f133241i += ((char) i11);
        }
        while (true) {
            SortedMap<String, String> sortedMapTailMap = this.f133239g.tailMap(this.f133241i);
            if (sortedMapTailMap.isEmpty() || !sortedMapTailMap.firstKey().startsWith(this.f133241i)) {
                return o();
            }
            if (this.f133241i.equals(sortedMapTailMap.firstKey())) {
                this.f133242j = this.f133239g.get(this.f133241i);
                this.f133243k = 0;
                this.f133241i = "";
                return read();
            }
            int i12 = ((FilterReader) this).in.read();
            if (i12 == -1) {
                return o();
            }
            this.f133241i += ((char) i12);
        }
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        p pVar = new p(reader);
        pVar.x(m());
        pVar.z(n());
        pVar.C(q());
        pVar.e(true);
        return pVar;
    }

    public void x(String str) {
        this.f133244l = str;
    }

    public void z(String str) {
        this.f133245m = str;
    }
}
