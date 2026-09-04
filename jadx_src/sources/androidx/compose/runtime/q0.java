package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/q0;", "", "", "d", "Landroidx/compose/runtime/RecomposeScopeImpl;", ak.av, "Landroidx/compose/runtime/RecomposeScopeImpl;", ak.aF, "()Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "", "b", "I", "()I", "location", "Landroidx/compose/runtime/collection/c;", "Landroidx/compose/runtime/collection/c;", "()Landroidx/compose/runtime/collection/c;", "e", "(Landroidx/compose/runtime/collection/c;)V", "instances", "<init>", "(Landroidx/compose/runtime/RecomposeScopeImpl;ILandroidx/compose/runtime/collection/c;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RecomposeScopeImpl scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int location;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.runtime.collection.c<Object> instances;

    public q0(@dl.d RecomposeScopeImpl scope, int i10, @dl.e androidx.compose.runtime.collection.c<Object> cVar) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        this.scope = scope;
        this.location = i10;
        this.instances = cVar;
    }

    @dl.e
    public final androidx.compose.runtime.collection.c<Object> a() {
        return this.instances;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final RecomposeScopeImpl getScope() {
        return this.scope;
    }

    public final boolean d() {
        return this.scope.v(this.instances);
    }

    public final void e(@dl.e androidx.compose.runtime.collection.c<Object> cVar) {
        this.instances = cVar;
    }
}
