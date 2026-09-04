package org.apache.tools.ant;

/* JADX INFO: compiled from: ProjectComponent.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b2 implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    protected Project f133092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    protected Location f133093c = Location.f133036e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    protected String f133094d;

    public void A1(Location location) {
        this.f133093c = location;
    }

    public void J(Project project) {
        this.f133092b = project;
    }

    public Project b() {
        return this.f133092b;
    }

    public Object clone() throws CloneNotSupportedException {
        b2 b2Var = (b2) super.clone();
        b2Var.A1(w1());
        b2Var.J(b());
        return b2Var;
    }

    public void log(String str) {
        x1(str, 2);
    }

    public String u1() {
        return this.f133094d;
    }

    public Location w1() {
        return this.f133093c;
    }

    public void x1(String str, int i10) {
        if (b() != null) {
            b().M0(str, i10);
        } else if (i10 <= 2) {
            System.err.println(str);
        }
    }

    public void z1(String str) {
        this.f133094d = str;
    }
}
