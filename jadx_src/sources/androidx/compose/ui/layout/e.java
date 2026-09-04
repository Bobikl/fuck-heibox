package androidx.compose.ui.layout;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/compose/ui/layout/e;", "Landroidx/compose/ui/layout/g0;", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/e1;", "z1", "(J)Landroidx/compose/ui/layout/e1;", "", "height", "l1", "w1", "width", "L0", androidx.exifinterface.media.a.X4, "Landroidx/compose/ui/layout/m;", "b", "Landroidx/compose/ui/layout/m;", ak.av, "()Landroidx/compose/ui/layout/m;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMinMax;", ak.aF, "Landroidx/compose/ui/layout/IntrinsicMinMax;", "()Landroidx/compose/ui/layout/IntrinsicMinMax;", "minMax", "Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "d", "Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "()Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "widthHeight", "", "()Ljava/lang/Object;", "parentData", "<init>", "(Landroidx/compose/ui/layout/m;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class e implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m measurable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final IntrinsicMinMax minMax;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final IntrinsicWidthHeight widthHeight;

    public e(@dl.d m measurable, @dl.d IntrinsicMinMax minMax, @dl.d IntrinsicWidthHeight widthHeight) {
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        kotlin.jvm.internal.f0.p(minMax, "minMax");
        kotlin.jvm.internal.f0.p(widthHeight, "widthHeight");
        this.measurable = measurable;
        this.minMax = minMax;
        this.widthHeight = widthHeight;
    }

    @Override // androidx.compose.ui.layout.m
    public int L0(int width) {
        return this.measurable.L0(width);
    }

    @Override // androidx.compose.ui.layout.m
    public int V(int width) {
        return this.measurable.V(width);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final m getMeasurable() {
        return this.measurable;
    }

    @Override // androidx.compose.ui.layout.m
    @dl.e
    public Object b() {
        return this.measurable.b();
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final IntrinsicMinMax getMinMax() {
        return this.minMax;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final IntrinsicWidthHeight getWidthHeight() {
        return this.widthHeight;
    }

    @Override // androidx.compose.ui.layout.m
    public int l1(int height) {
        return this.measurable.l1(height);
    }

    @Override // androidx.compose.ui.layout.m
    public int w1(int height) {
        return this.measurable.w1(height);
    }

    @Override // androidx.compose.ui.layout.g0
    @dl.d
    public e1 z1(long constraints) {
        if (this.widthHeight == IntrinsicWidthHeight.Width) {
            return new h(this.minMax == IntrinsicMinMax.Max ? this.measurable.w1(s1.b.o(constraints)) : this.measurable.l1(s1.b.o(constraints)), s1.b.o(constraints));
        }
        return new h(s1.b.p(constraints), this.minMax == IntrinsicMinMax.Max ? this.measurable.V(s1.b.p(constraints)) : this.measurable.L0(s1.b.p(constraints)));
    }
}
