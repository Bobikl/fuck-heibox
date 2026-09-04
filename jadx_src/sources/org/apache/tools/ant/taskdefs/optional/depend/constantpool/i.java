package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: IntegerCPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class i extends b {
    public i() {
        super(3, 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        h(Integer.valueOf(dataInputStream.readInt()));
    }

    public String toString() {
        return "Integer Constant Pool Entry: " + g();
    }
}
