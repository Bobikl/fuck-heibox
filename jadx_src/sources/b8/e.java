package b8;

import java.io.File;

/* JADX INFO: compiled from: FileSizeBackupStrategy.java */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class e implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f30445b;

    public e(long j10) {
        this.f30445b = j10;
    }

    @Override // b8.c
    public boolean c(File file) {
        return file.length() > this.f30445b;
    }
}
