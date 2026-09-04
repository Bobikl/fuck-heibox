package org.apache.tools.ant;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DemuxInputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class z extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f137117c = 255;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Project f137118b;

    public z(Project project) {
        this.f137118b = project;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        if (this.f137118b.F(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f137118b.F(bArr, i10, i11);
    }
}
