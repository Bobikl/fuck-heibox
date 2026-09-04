package androidx.activity.compose;

import androidx.activity.result.g;
import androidx.core.app.i;
import kotlin.b2;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b<I> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private g<I> f1466a;

    @dl.e
    public final g<I> a() {
        return this.f1466a;
    }

    public final void b(@dl.e I i10, @dl.e i iVar) {
        b2 b2Var;
        g<I> gVar = this.f1466a;
        if (gVar != null) {
            gVar.c(i10, iVar);
            b2Var = b2.f124493a;
        } else {
            b2Var = null;
        }
        if (b2Var == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }

    public final void c(@dl.e g<I> gVar) {
        this.f1466a = gVar;
    }

    public final void d() {
        b2 b2Var;
        g<I> gVar = this.f1466a;
        if (gVar != null) {
            gVar.d();
            b2Var = b2.f124493a;
        } else {
            b2Var = null;
        }
        if (b2Var == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}
