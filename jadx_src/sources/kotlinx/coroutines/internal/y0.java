package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.g3;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/internal/y0;", "", "Lkotlinx/coroutines/g3;", "element", "value", "Lkotlin/b2;", ak.av, "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "b", "Lkotlin/coroutines/CoroutineContext;", "", "[Ljava/lang/Object;", "values", ak.aF, "[Lkotlinx/coroutines/g3;", "elements", "", "d", "I", "i", "n", "<init>", "(Lkotlin/coroutines/CoroutineContext;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final CoroutineContext context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object[] values;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final g3<Object>[] elements;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int i;

    public y0(@dl.d CoroutineContext coroutineContext, int i10) {
        this.context = coroutineContext;
        this.values = new Object[i10];
        this.elements = new g3[i10];
    }

    public final void a(@dl.d g3<?> g3Var, @dl.e Object obj) {
        Object[] objArr = this.values;
        int i10 = this.i;
        objArr[i10] = obj;
        g3<Object>[] g3VarArr = this.elements;
        this.i = i10 + 1;
        g3VarArr[i10] = g3Var;
    }

    public final void b(@dl.d CoroutineContext coroutineContext) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            g3<Object> g3Var = this.elements[length];
            kotlin.jvm.internal.f0.m(g3Var);
            g3Var.z(coroutineContext, this.values[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
