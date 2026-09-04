package org.apache.tools.ant;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: Target.java */
/* JADX INFO: loaded from: classes5.dex */
public class t2 implements x2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f133605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f133606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f133607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.apache.tools.ant.taskdefs.condition.d f133608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.apache.tools.ant.taskdefs.condition.d f133609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f133610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<Object> f133611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Location f133612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Project f133613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f133614k;

    public t2() {
        this.f133606c = "";
        this.f133607d = "";
        this.f133610g = null;
        this.f133611h = new ArrayList();
        this.f133612i = Location.f133036e;
        this.f133614k = null;
    }

    public t2(t2 t2Var) {
        this.f133606c = "";
        this.f133607d = "";
        this.f133610g = null;
        this.f133611h = new ArrayList();
        this.f133612i = Location.f133036e;
        this.f133614k = null;
        this.f133605b = t2Var.f133605b;
        this.f133606c = t2Var.f133606c;
        this.f133607d = t2Var.f133607d;
        this.f133608e = t2Var.f133608e;
        this.f133609f = t2Var.f133609f;
        this.f133610g = t2Var.f133610g;
        this.f133612i = t2Var.f133612i;
        this.f133613j = t2Var.f133613j;
        this.f133614k = t2Var.f133614k;
        this.f133611h = t2Var.f133611h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean o() throws BuildException {
        p2 p2VarU = p2.u(l());
        return p2VarU.W(p2VarU.E(this.f133606c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean p() throws BuildException {
        p2 p2VarU = p2.u(l());
        return !p2VarU.X(p2VarU.E(this.f133607d));
    }

    public static List<String> q(String str, String str2, String str3) {
        if (str.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.ACCEPT_TIME_SEPARATOR_SP, true);
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if (strTrim.isEmpty() || Constants.ACCEPT_TIME_SEPARATOR_SP.equals(strTrim)) {
                throw new BuildException("Syntax Error: " + str3 + " attribute of target \"" + str2 + "\" contains an empty string.");
            }
            arrayList.add(strTrim);
            if (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                if (!stringTokenizer.hasMoreTokens() || !Constants.ACCEPT_TIME_SEPARATOR_SP.equals(strNextToken)) {
                    throw new BuildException("Syntax Error: " + str3 + " attribute for target \"" + str2 + "\" ends with a \",\" character");
                }
            }
        }
        return arrayList;
    }

    public void A(Project project) {
        this.f133613j = project;
    }

    public void B(String str) {
        if (str == null) {
            str = "";
        }
        this.f133607d = str;
        C(new org.apache.tools.ant.taskdefs.condition.d() { // from class: org.apache.tools.ant.r2
            @Override // org.apache.tools.ant.taskdefs.condition.d
            public final boolean e() {
                return this.f133599b.p();
            }
        });
    }

    public void C(org.apache.tools.ant.taskdefs.condition.d dVar) {
        if (this.f133609f == null) {
            this.f133609f = dVar;
            return;
        }
        org.apache.tools.ant.taskdefs.condition.y yVar = new org.apache.tools.ant.taskdefs.condition.y();
        yVar.J(l());
        yVar.A1(j());
        yVar.B1(this.f133609f);
        yVar.B1(dVar);
        this.f133609f = yVar;
    }

    public void c(RuntimeConfigurable runtimeConfigurable) {
        this.f133611h.add(runtimeConfigurable);
    }

    @Override // org.apache.tools.ant.x2
    public void c1(u2 u2Var) {
        this.f133611h.add(u2Var);
    }

    public void d(String str) {
        if (this.f133610g == null) {
            this.f133610g = new ArrayList(2);
        }
        this.f133610g.add(str);
    }

    public boolean e(String str) {
        Project projectL = l();
        Hashtable<String, t2> hashtableY0 = projectL == null ? null : projectL.y0();
        return projectL != null && projectL.v1(k(), hashtableY0, false).contains(hashtableY0.get(str));
    }

    public void f() throws BuildException {
        org.apache.tools.ant.taskdefs.condition.d dVar = this.f133608e;
        if (dVar != null && !dVar.e()) {
            this.f133613j.O0(this, "Skipped because property '" + this.f133613j.V0(this.f133606c) + "' not set.", 3);
            return;
        }
        org.apache.tools.ant.taskdefs.condition.d dVar2 = this.f133609f;
        if (dVar2 != null && dVar2.e()) {
            this.f133613j.O0(this, "Skipped because property '" + this.f133613j.V0(this.f133607d) + "' set.", 3);
            return;
        }
        org.apache.tools.ant.property.b bVarJ = org.apache.tools.ant.property.b.j(l());
        bVarJ.h();
        for (int i10 = 0; i10 < this.f133611h.size(); i10++) {
            try {
                Object obj = this.f133611h.get(i10);
                if (obj instanceof u2) {
                    ((u2) obj).b2();
                } else {
                    ((RuntimeConfigurable) obj).q(this.f133613j);
                }
            } catch (Throwable th2) {
                bVarJ.i();
                throw th2;
            }
        }
        bVarJ.i();
    }

    public Enumeration<String> g() {
        List<String> list = this.f133610g;
        return list == null ? Collections.emptyEnumeration() : Collections.enumeration(list);
    }

    public String h() {
        return this.f133614k;
    }

    public String i() {
        if (this.f133606c.isEmpty()) {
            return null;
        }
        return this.f133606c;
    }

    public Location j() {
        return this.f133612i;
    }

    public String k() {
        return this.f133605b;
    }

    public Project l() {
        return this.f133613j;
    }

    public u2[] m() {
        ArrayList arrayList = new ArrayList(this.f133611h.size());
        for (Object obj : this.f133611h) {
            if (obj instanceof u2) {
                arrayList.add((u2) obj);
            }
        }
        return (u2[]) arrayList.toArray(new u2[arrayList.size()]);
    }

    public String n() {
        if (this.f133607d.isEmpty()) {
            return null;
        }
        return this.f133607d;
    }

    public final void r() {
        this.f133613j.W(this);
        RuntimeException e10 = null;
        try {
            try {
                f();
                this.f133613j.V(this, null);
            } catch (RuntimeException e11) {
                e10 = e11;
                throw e10;
            }
        } catch (Throwable th2) {
            this.f133613j.V(this, e10);
            throw th2;
        }
    }

    void s(u2 u2Var, RuntimeConfigurable runtimeConfigurable) {
        while (true) {
            int iIndexOf = this.f133611h.indexOf(u2Var);
            if (iIndexOf < 0) {
                return;
            } else {
                this.f133611h.set(iIndexOf, runtimeConfigurable);
            }
        }
    }

    void t(u2 u2Var, u2 u2Var2) {
        while (true) {
            int iIndexOf = this.f133611h.indexOf(u2Var);
            if (iIndexOf < 0) {
                return;
            } else {
                this.f133611h.set(iIndexOf, u2Var2);
            }
        }
    }

    public String toString() {
        return this.f133605b;
    }

    public void u(String str) {
        Iterator<String> it = q(str, k(), "depends").iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }

    public void v(String str) {
        this.f133614k = str;
    }

    public void w(String str) {
        if (str == null) {
            str = "";
        }
        this.f133606c = str;
        x(new org.apache.tools.ant.taskdefs.condition.d() { // from class: org.apache.tools.ant.s2
            @Override // org.apache.tools.ant.taskdefs.condition.d
            public final boolean e() {
                return this.f133601b.o();
            }
        });
    }

    public void x(org.apache.tools.ant.taskdefs.condition.d dVar) {
        if (this.f133608e == null) {
            this.f133608e = dVar;
            return;
        }
        org.apache.tools.ant.taskdefs.condition.b bVar = new org.apache.tools.ant.taskdefs.condition.b();
        bVar.J(l());
        bVar.A1(j());
        bVar.B1(this.f133608e);
        bVar.B1(dVar);
        this.f133608e = bVar;
    }

    public void y(Location location) {
        this.f133612i = location;
    }

    public void z(String str) {
        this.f133605b = str;
    }
}
