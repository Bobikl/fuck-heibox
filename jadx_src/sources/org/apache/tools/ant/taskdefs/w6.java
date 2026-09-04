package org.apache.tools.ant.taskdefs;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: TaskOutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class w6 extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.apache.tools.ant.u2 f135923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuffer f135924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f135925d;

    w6(org.apache.tools.ant.u2 u2Var, int i10) {
        System.err.println("As of Ant 1.2 released in October 2000, the TaskOutputStream class");
        System.err.println("is considered to be dead code by the Ant developers and is unmaintained.");
        System.err.println("Don't use it!");
        this.f135923b = u2Var;
        this.f135925d = i10;
        this.f135924c = new StringBuffer();
    }

    private void a() {
        this.f135923b.x1(this.f135924c.toString(), this.f135925d);
        this.f135924c = new StringBuffer();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        char c10 = (char) i10;
        if (c10 != '\r' && c10 != '\n') {
            this.f135924c.append(c10);
        } else if (this.f135924c.length() > 0) {
            a();
        }
    }
}
