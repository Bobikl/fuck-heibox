package org.apache.tools.ant.taskdefs.cvslib;

import java.io.ByteArrayOutputStream;
import org.apache.tools.ant.taskdefs.d5;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: RedirectingStreamHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public class m extends d5 {
    m(d dVar) {
        super(new l(dVar), new ByteArrayOutputStream());
    }

    String j() {
        try {
            return ((ByteArrayOutputStream) g()).toString("ASCII");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // org.apache.tools.ant.taskdefs.d5, org.apache.tools.ant.taskdefs.q1
    public void stop() {
        super.stop();
        j0.d(g());
        j0.d(h());
    }
}
