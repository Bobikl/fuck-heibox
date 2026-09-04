package androidx.activity.compose;

import androidx.activity.result.g;
import androidx.compose.runtime.internal.o;
import androidx.compose.runtime.m2;
import androidx.core.app.i;
import kotlin.jvm.internal.f0;
import kotlin.k;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@o(parameters = 0)
public final class d<I, O> extends g<I> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f1468c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final b<I> f1469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final m2<z.a<I, O>> f1470b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@dl.d b<I> launcher, @dl.d m2<? extends z.a<I, O>> contract) {
        f0.p(launcher, "launcher");
        f0.p(contract, "contract");
        this.f1469a = launcher;
        this.f1470b = contract;
    }

    @Override // androidx.activity.result.g
    @dl.d
    public z.a<I, ?> a() {
        return this.f1470b.getValue();
    }

    @Override // androidx.activity.result.g
    public void c(I i10, @dl.e i iVar) {
        this.f1469a.b(i10, iVar);
    }

    @Override // androidx.activity.result.g
    @k(message = "Registration is automatically handled by rememberLauncherForActivityResult")
    public void d() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
