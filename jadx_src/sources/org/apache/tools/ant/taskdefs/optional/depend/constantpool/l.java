package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: LongCPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class l extends b {
    public l() {
        super(5, 2);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        h(Long.valueOf(dataInputStream.readLong()));
    }

    public String toString() {
        return "Long Constant Pool Entry: " + g();
    }
}
