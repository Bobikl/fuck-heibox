package androidx.compose.ui.semantics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.h, reason: from toString */
/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/semantics/h;", "", "", "toString", "", ak.aF, "Z", "b", "()Z", "reverseScrolling", "Lkotlin/Function0;", "", "value", "Lyh/a;", "()Lyh/a;", "maxValue", ak.av, "<init>", "(Lyh/a;Lyh/a;Z)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class ScrollAxisRange {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16125d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.a<Float> f16126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.a<Float> f16127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean reverseScrolling;

    public ScrollAxisRange(@dl.d yh.a<Float> value, @dl.d yh.a<Float> maxValue, boolean z10) {
        f0.p(value, "value");
        f0.p(maxValue, "maxValue");
        this.f16126a = value;
        this.f16127b = maxValue;
        this.reverseScrolling = z10;
    }

    public /* synthetic */ ScrollAxisRange(yh.a aVar, yh.a aVar2, boolean z10, int i10, u uVar) {
        this(aVar, aVar2, (i10 & 4) != 0 ? false : z10);
    }

    @dl.d
    public final yh.a<Float> a() {
        return this.f16127b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    @dl.d
    public final yh.a<Float> c() {
        return this.f16126a;
    }

    @dl.d
    public String toString() {
        return "ScrollAxisRange(value=" + this.f16126a.invoke().floatValue() + ", maxValue=" + this.f16127b.invoke().floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }
}
