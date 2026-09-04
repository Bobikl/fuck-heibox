package b8;

import java.io.File;

/* JADX INFO: compiled from: FileSizeBackupStrategy2.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f30443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30444c;

    public d(long j10, int i10) {
        this.f30443b = j10;
        this.f30444c = i10;
    }

    @Override // b8.b
    public int b() {
        return this.f30444c;
    }

    @Override // b8.c
    public boolean c(File file) {
        return file.length() > this.f30443b;
    }
}
