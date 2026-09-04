package org.apache.tools.ant.taskdefs;

/* JADX INFO: compiled from: LogStreamHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public class s3 extends d5 {
    public s3(org.apache.tools.ant.b2 b2Var, int i10, int i11) {
        super(new r3(b2Var, i10), new r3(b2Var, i11));
    }

    public s3(org.apache.tools.ant.u2 u2Var, int i10, int i11) {
        this((org.apache.tools.ant.b2) u2Var, i10, i11);
    }

    @Override // org.apache.tools.ant.taskdefs.d5, org.apache.tools.ant.taskdefs.q1
    public void stop() {
        super.stop();
        org.apache.tools.ant.util.j0.d(g());
        org.apache.tools.ant.util.j0.d(h());
    }
}
