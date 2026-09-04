package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: DoubleCPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends b {
    public f() {
        super(6, 2);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        h(Double.valueOf(dataInputStream.readDouble()));
    }

    public String toString() {
        return "Double Constant Pool Entry: " + g();
    }
}
