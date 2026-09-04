package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: Utf8CPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class s extends e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f134796t;

    public s() {
        super(1, 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        this.f134796t = dataInputStream.readUTF();
    }

    public String g() {
        return this.f134796t;
    }

    public String toString() {
        return "UTF8 Value = " + this.f134796t;
    }
}
