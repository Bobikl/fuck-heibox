package org.apache.tools.ant.taskdefs;

import java.util.Hashtable;
import java.util.Map;
import java.util.function.Predicate;
import org.apache.tools.ant.BuildEvent;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Recorder.java */
/* JADX INFO: loaded from: classes5.dex */
public class g5 extends org.apache.tools.ant.u2 implements org.apache.tools.ant.q2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static Map<String, h5> f134215p = new Hashtable();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f134216k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f134217l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f134218m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f134219n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f134220o = false;

    /* JADX INFO: compiled from: Recorder.java */
    public static class a extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f134221c = {com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop"};

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return f134221c;
        }
    }

    /* JADX INFO: compiled from: Recorder.java */
    public static class b extends org.apache.tools.ant.types.j0 {
    }

    private void j2() {
        f134215p.entrySet().removeIf(new Predicate() { // from class: org.apache.tools.ant.taskdefs.f5
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f134148a.l2((Map.Entry) obj);
            }
        });
        b().U0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean l2(Map.Entry entry) {
        return ((h5) entry.getValue()).f() == b();
    }

    @Override // org.apache.tools.ant.k
    public void B0(BuildEvent buildEvent) {
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f134216k == null) {
            throw new BuildException("No filename specified");
        }
        b().M0("setting a recorder for name " + this.f134216k, 4);
        h5 h5VarK2 = k2(this.f134216k, b());
        h5VarK2.w0(this.f134219n);
        h5VarK2.m(this.f134220o);
        Boolean bool = this.f134218m;
        if (bool != null) {
            if (bool.booleanValue()) {
                h5VarK2.j();
                h5VarK2.l(this.f134218m);
            } else {
                h5VarK2.l(this.f134218m);
                h5VarK2.b();
            }
        }
    }

    @Override // org.apache.tools.ant.q2
    public void E0(BuildEvent buildEvent) {
    }

    @Override // org.apache.tools.ant.k
    public void R0(BuildEvent buildEvent) {
        j2();
    }

    @Override // org.apache.tools.ant.k
    public void V(BuildEvent buildEvent) {
    }

    @Override // org.apache.tools.ant.u2
    public void V1() {
        b().c(this);
    }

    @Override // org.apache.tools.ant.q2
    public void W0(BuildEvent buildEvent) {
        if (buildEvent.d() == b()) {
            j2();
        }
    }

    @Override // org.apache.tools.ant.k
    public void h0(BuildEvent buildEvent) {
    }

    @Override // org.apache.tools.ant.k
    public void i0(BuildEvent buildEvent) {
    }

    protected h5 k2(String str, Project project) throws BuildException {
        h5 h5Var = f134215p.get(str);
        if (h5Var == null) {
            h5Var = new h5(str);
            Boolean bool = this.f134217l;
            if (bool == null) {
                h5Var.h(false);
            } else {
                h5Var.h(bool.booleanValue());
            }
            h5Var.k(project);
            f134215p.put(str, h5Var);
        }
        return h5Var;
    }

    public void m(boolean z10) {
        this.f134220o = z10;
    }

    public void m2(a aVar) {
        if (aVar.d().equalsIgnoreCase(com.google.android.exoplayer2.text.ttml.d.f49798o0)) {
            this.f134218m = Boolean.TRUE;
        } else {
            this.f134218m = Boolean.FALSE;
        }
    }

    public void n2(boolean z10) {
        this.f134217l = z10 ? Boolean.TRUE : Boolean.FALSE;
    }

    public void o2(b bVar) {
        this.f134219n = bVar.h();
    }

    public void p2(String str) {
        this.f134216k = str;
    }

    @Override // org.apache.tools.ant.k
    public void r1(BuildEvent buildEvent) {
    }

    @Override // org.apache.tools.ant.k
    public void s0(BuildEvent buildEvent) {
    }
}
