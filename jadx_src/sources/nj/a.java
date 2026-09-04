package nj;

import org.apache.tools.ant.u2;

/* JADX INFO: compiled from: DispatchTask.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends u2 implements c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f132117k;

    public String i2() {
        return this.f132117k;
    }

    public void j2(String str) {
        this.f132117k = str;
    }

    @Override // nj.c
    public String q() {
        return "action";
    }
}
