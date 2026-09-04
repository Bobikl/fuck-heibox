package androidx.navigation.dynamicfeatures.fragment.ui;

import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.navigation.dynamicfeatures.l;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: InstallViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final b f25040c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final y0.b f25041d = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private l f25042b;

    /* JADX INFO: compiled from: InstallViewModel.kt */
    public static final class a implements y0.b {
        a() {
        }

        @Override // androidx.lifecycle.y0.b
        public <T extends w0> T a(Class<T> modelClass) {
            f0.p(modelClass, "modelClass");
            return new d();
        }

        @Override // androidx.lifecycle.y0.b
        public /* synthetic */ w0 b(Class cls, u2.a aVar) {
            return z0.b(this, cls, aVar);
        }
    }

    /* JADX INFO: compiled from: InstallViewModel.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }

        @dl.d
        public final y0.b a() {
            return d.f25041d;
        }
    }

    @e
    public final l e() {
        return this.f25042b;
    }

    public final void f(@e l lVar) {
        this.f25042b = lVar;
    }
}
