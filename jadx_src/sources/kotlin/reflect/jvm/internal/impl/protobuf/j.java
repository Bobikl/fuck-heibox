package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: LazyFieldLite.java */
/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f127358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f127359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f127360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected volatile n f127361d;

    protected void a(n nVar) {
        if (this.f127361d != null) {
            return;
        }
        synchronized (this) {
            if (this.f127361d != null) {
                return;
            }
            try {
                if (this.f127358a != null) {
                    this.f127361d = nVar.w().c(this.f127358a, this.f127359b);
                } else {
                    this.f127361d = nVar;
                }
            } catch (IOException unused) {
            }
        }
    }

    public int b() {
        return this.f127360c ? this.f127361d.u() : this.f127358a.size();
    }

    public n c(n nVar) {
        a(nVar);
        return this.f127361d;
    }

    public n d(n nVar) {
        n nVar2 = this.f127361d;
        this.f127361d = nVar;
        this.f127358a = null;
        this.f127360c = true;
        return nVar2;
    }
}
