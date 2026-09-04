package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@o0
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012&\u0010\t\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\r\u0010\u000eR7\u0010\t\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/x0;", "P", "", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "parameter", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", "Lyh/q;", ak.av, "()Lyh/q;", "<init>", "(Lyh/q;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class x0<P> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13340b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.q<P, p, Integer, kotlin.b2> f13341a;

    /* JADX WARN: Multi-variable type inference failed */
    public x0(@dl.d yh.q<? super P, ? super p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        this.f13341a = content;
    }

    @dl.d
    public final yh.q<P, p, Integer, kotlin.b2> a() {
        return this.f13341a;
    }
}
