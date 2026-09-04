package androidx.navigation.dynamicfeatures;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i0;

/* JADX INFO: compiled from: DynamicInstallMonitor.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private Exception f25060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final LiveData<com.google.android.play.core.splitinstall.f> f25061b = new i0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private com.google.android.play.core.splitinstall.c f25064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25065f;

    public final void a() {
        int i10;
        com.google.android.play.core.splitinstall.c cVar = this.f25064e;
        if (cVar == null || (i10 = this.f25063d) == 0) {
            return;
        }
        cVar.m(i10);
    }

    @dl.e
    public final Exception b() {
        return this.f25060a;
    }

    public final int c() {
        return this.f25063d;
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final com.google.android.play.core.splitinstall.c d() {
        return this.f25064e;
    }

    @dl.d
    public final LiveData<com.google.android.play.core.splitinstall.f> e() {
        return this.f25061b;
    }

    public final boolean f() {
        return this.f25062c;
    }

    public final boolean g() {
        return this.f25065f;
    }

    public final void h(@dl.e Exception exc) {
        this.f25060a = exc;
    }

    public final void i(boolean z10) {
        this.f25062c = z10;
        if (z10) {
            this.f25065f = true;
        }
    }

    public final void j(int i10) {
        this.f25063d = i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void k(@dl.e com.google.android.play.core.splitinstall.c cVar) {
        this.f25064e = cVar;
    }
}
