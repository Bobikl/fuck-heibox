package androidx.compose.material3;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R.\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/b0;", androidx.exifinterface.media.a.f23244d5, "", ak.av, "Ljava/lang/Object;", "()Ljava/lang/Object;", "d", "(Ljava/lang/Object;)V", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "", "Landroidx/compose/material3/a0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "e", "(Ljava/util/List;)V", "items", "Landroidx/compose/runtime/n1;", ak.aF, "Landroidx/compose/runtime/n1;", "()Landroidx/compose/runtime/n1;", "f", "(Landroidx/compose/runtime/n1;)V", "scope", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Object current = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private List<FadeInFadeOutAnimationItem<T>> items = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.runtime.n1 scope;

    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getCurrent() {
        return this.current;
    }

    @dl.d
    public final List<FadeInFadeOutAnimationItem<T>> b() {
        return this.items;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final androidx.compose.runtime.n1 getScope() {
        return this.scope;
    }

    public final void d(@dl.e Object obj) {
        this.current = obj;
    }

    public final void e(@dl.d List<FadeInFadeOutAnimationItem<T>> list) {
        kotlin.jvm.internal.f0.p(list, "<set-?>");
        this.items = list;
    }

    public final void f(@dl.e androidx.compose.runtime.n1 n1Var) {
        this.scope = n1Var;
    }
}
