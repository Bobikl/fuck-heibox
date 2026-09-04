package z7;

import b8.c;
import java.io.File;

/* JADX INFO: compiled from: BackupStrategyWrapper.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements b8.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f141910b;

    public a(c cVar) {
        this.f141910b = cVar;
    }

    @Override // b8.b
    public String a(String str, int i10) {
        return str + ".bak";
    }

    @Override // b8.b
    public int b() {
        return 1;
    }

    @Override // b8.c
    public boolean c(File file) {
        return this.f141910b.c(file);
    }
}
