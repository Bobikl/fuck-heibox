package org.apache.tools.ant;

import java.util.EventObject;

/* JADX INFO: loaded from: classes5.dex */
public class BuildEvent extends EventObject {
    private static final long serialVersionUID = 4538050075952288486L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Project f133027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t2 f133028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u2 f133029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f133031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Throwable f133032g;

    public BuildEvent(Project project) {
        super(project);
        this.f133031f = 3;
        this.f133027b = project;
        this.f133028c = null;
        this.f133029d = null;
    }

    public BuildEvent(t2 t2Var) {
        super(t2Var);
        this.f133031f = 3;
        this.f133027b = t2Var.l();
        this.f133028c = t2Var;
        this.f133029d = null;
    }

    public BuildEvent(u2 u2Var) {
        super(u2Var);
        this.f133031f = 3;
        this.f133027b = u2Var.b();
        this.f133028c = u2Var.G1();
        this.f133029d = u2Var;
    }

    public Throwable a() {
        return this.f133032g;
    }

    public String b() {
        return this.f133030e;
    }

    public int c() {
        return this.f133031f;
    }

    public Project d() {
        return this.f133027b;
    }

    public t2 e() {
        return this.f133028c;
    }

    public u2 f() {
        return this.f133029d;
    }

    public void g(Throwable th2) {
        this.f133032g = th2;
    }

    public void h(String str, int i10) {
        this.f133030e = str;
        this.f133031f = i10;
    }
}
