package org.apache.tools.ant.helper;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.function.Function;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Location;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.RuntimeConfigurable;
import org.apache.tools.ant.t2;
import org.apache.tools.ant.util.j0;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

/* JADX INFO: compiled from: AntXMLContext.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Project f133351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f133352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private URL f133353c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f133355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private URL f133356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f133357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Locator f133358h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Vector<t2> f133354d = new Vector<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t2 f133359i = new t2();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private t2 f133360j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Vector<RuntimeConfigurable> f133361k = new Vector<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f133362l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, List<String>> f133363m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, t2> f133364n = null;

    public b(Project project) {
        this.f133351a = project;
        this.f133359i.A(project);
        this.f133359i.z("");
        this.f133354d.addElement(this.f133359i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List t(String str) {
        return new ArrayList();
    }

    public void A(t2 t2Var) {
        this.f133360j = t2Var;
    }

    public void B(Map<String, t2> map) {
        this.f133364n = map;
    }

    public void C(boolean z10) {
        this.f133362l = z10;
    }

    public void D(t2 t2Var) {
        this.f133359i = t2Var;
    }

    public void E(Locator locator) {
        this.f133358h = locator;
    }

    public void F(String str, String str2) {
        ((List) this.f133363m.computeIfAbsent(str, new Function() { // from class: org.apache.tools.ant.helper.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return b.t((String) obj);
            }
        })).add(str2);
    }

    public void b(t2 t2Var) {
        this.f133354d.addElement(t2Var);
        this.f133360j = t2Var;
    }

    public void c(Object obj, Attributes attributes) {
        String value = attributes.getValue("id");
        if (value != null) {
            this.f133351a.f(value, obj);
        }
    }

    public RuntimeConfigurable d() {
        if (this.f133361k.size() < 1) {
            return null;
        }
        Vector<RuntimeConfigurable> vector = this.f133361k;
        return vector.elementAt(vector.size() - 1);
    }

    public void e(String str) {
        List<String> list = this.f133363m.get(str);
        if (list == null || list.isEmpty()) {
            return;
        }
        list.remove(list.size() - 1);
    }

    public File f() {
        return this.f133352b;
    }

    public File g() {
        return this.f133355e;
    }

    public URL h() {
        return this.f133356f;
    }

    public URL i() {
        return this.f133353c;
    }

    public String j() {
        return this.f133357g;
    }

    public t2 k() {
        return this.f133360j;
    }

    public Map<String, t2> l() {
        return this.f133364n;
    }

    public t2 m() {
        return this.f133359i;
    }

    public Locator n() {
        return this.f133358h;
    }

    public String o(String str) {
        List<String> list = this.f133363m.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public Project p() {
        return this.f133351a;
    }

    public Vector<t2> q() {
        return this.f133354d;
    }

    public Vector<RuntimeConfigurable> r() {
        return this.f133361k;
    }

    public boolean s() {
        return this.f133362l;
    }

    public RuntimeConfigurable u() {
        if (this.f133361k.size() < 2) {
            return null;
        }
        Vector<RuntimeConfigurable> vector = this.f133361k;
        return vector.elementAt(vector.size() - 2);
    }

    public void v() {
        if (this.f133361k.size() > 0) {
            Vector<RuntimeConfigurable> vector = this.f133361k;
            vector.removeElementAt(vector.size() - 1);
        }
    }

    public void w(RuntimeConfigurable runtimeConfigurable) {
        this.f133361k.addElement(runtimeConfigurable);
    }

    public void x(File file) {
        this.f133352b = file;
        if (file == null) {
            this.f133355e = null;
            return;
        }
        this.f133355e = new File(file.getParent());
        this.f133359i.y(new Location(file.getAbsolutePath()));
        try {
            y(j0.O().N(file));
        } catch (MalformedURLException e10) {
            throw new BuildException(e10);
        }
    }

    public void y(URL url) throws MalformedURLException {
        this.f133353c = url;
        this.f133356f = new URL(url, ".");
        if (this.f133359i.j() == null) {
            this.f133359i.y(new Location(url.toString()));
        }
    }

    public void z(String str) {
        this.f133357g = str;
    }
}
