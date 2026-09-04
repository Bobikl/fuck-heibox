package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: FloatCPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends b {
    public h() {
        super(4, 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        h(Float.valueOf(dataInputStream.readFloat()));
    }

    public String toString() {
        return "Float Constant Pool Entry: " + g();
    }
}
