package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0013¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/platform/w0;", "Landroidx/compose/ui/platform/x0;", ak.aF, "Landroidx/compose/ui/platform/x0;", "_values", "e", "()Landroidx/compose/ui/platform/x0;", "values", "", "d", "()Ljava/lang/String;", "nameFallback", "", ak.av, "()Ljava/lang/Object;", "valueOverride", "Lkotlin/sequences/m;", "Landroidx/compose/ui/platform/z1;", "()Lkotlin/sequences/m;", "inspectableElements", "Lkotlin/Function1;", "Lkotlin/b2;", "Lkotlin/t;", "info", "<init>", "(Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public abstract class y0 implements w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15999d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<x0, kotlin.b2> f16000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private x0 _values;

    /* JADX WARN: Multi-variable type inference failed */
    public y0(@dl.d yh.l<? super x0, kotlin.b2> info) {
        kotlin.jvm.internal.f0.p(info, "info");
        this.f16000b = info;
    }

    private final x0 e() {
        x0 x0Var = this._values;
        if (x0Var == null) {
            x0Var = new x0();
            this.f16000b.invoke(x0Var);
        }
        this._values = x0Var;
        return x0Var;
    }

    @Override // androidx.compose.ui.platform.w0
    @dl.e
    public Object a() {
        return e().getValue();
    }

    @Override // androidx.compose.ui.platform.w0
    @dl.d
    public kotlin.sequences.m<ValueElement> c() {
        return e().getProperties();
    }

    @Override // androidx.compose.ui.platform.w0
    @dl.e
    public String d() {
        return e().getName();
    }
}
