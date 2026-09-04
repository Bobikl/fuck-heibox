package androidx.compose.foundation.shape;

import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CornerBasedShape.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJE\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00122\b\b\u0002\u0010\r\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u0012H&J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0012R\u0017\u0010\f\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u000f\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/shape/e;", "Landroidx/compose/ui/graphics/g2;", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/e;", "density", "Landroidx/compose/ui/graphics/f1;", ak.av, "(JLandroidx/compose/ui/unit/LayoutDirection;Ls1/e;)Landroidx/compose/ui/graphics/f1;", "", "topStart", "topEnd", "bottomEnd", "bottomStart", "e", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/f1;", "Landroidx/compose/foundation/shape/f;", ak.aF, "all", "b", "Landroidx/compose/foundation/shape/f;", "i", "()Landroidx/compose/foundation/shape/f;", RXScreenCaptureService.KEY_HEIGHT, "f", "d", "g", "<init>", "(Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public abstract class e implements g2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f7548e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f topStart;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f topEnd;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f bottomEnd;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f bottomStart;

    public e(@dl.d f topStart, @dl.d f topEnd, @dl.d f bottomEnd, @dl.d f bottomStart) {
        f0.p(topStart, "topStart");
        f0.p(topEnd, "topEnd");
        f0.p(bottomEnd, "bottomEnd");
        f0.p(bottomStart, "bottomStart");
        this.topStart = topStart;
        this.topEnd = topEnd;
        this.bottomEnd = bottomEnd;
        this.bottomStart = bottomStart;
    }

    public static /* synthetic */ e d(e eVar, f fVar, f fVar2, f fVar3, f fVar4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            fVar = eVar.topStart;
        }
        if ((i10 & 2) != 0) {
            fVar2 = eVar.topEnd;
        }
        if ((i10 & 4) != 0) {
            fVar3 = eVar.bottomEnd;
        }
        if ((i10 & 8) != 0) {
            fVar4 = eVar.bottomStart;
        }
        return eVar.c(fVar, fVar2, fVar3, fVar4);
    }

    @Override // androidx.compose.ui.graphics.g2
    @dl.d
    public final f1 a(long size, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density) {
        f0.p(layoutDirection, "layoutDirection");
        f0.p(density, "density");
        float fB = this.topStart.b(size, density);
        float fB2 = this.topEnd.b(size, density);
        float fB3 = this.bottomEnd.b(size, density);
        float fB4 = this.bottomStart.b(size, density);
        float fQ = b1.m.q(size);
        float f10 = fB + fB4;
        if (f10 > fQ) {
            float f11 = fQ / f10;
            fB *= f11;
            fB4 *= f11;
        }
        float f12 = fB4;
        float f13 = fB2 + fB3;
        if (f13 > fQ) {
            float f14 = fQ / f13;
            fB2 *= f14;
            fB3 *= f14;
        }
        if (fB >= 0.0f && fB2 >= 0.0f && fB3 >= 0.0f && f12 >= 0.0f) {
            return e(size, fB, fB2, fB3, f12, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fB + ", topEnd = " + fB2 + ", bottomEnd = " + fB3 + ", bottomStart = " + f12 + ")!").toString());
    }

    @dl.d
    public final e b(@dl.d f all) {
        f0.p(all, "all");
        return c(all, all, all, all);
    }

    @dl.d
    public abstract e c(@dl.d f topStart, @dl.d f topEnd, @dl.d f bottomEnd, @dl.d f bottomStart);

    @dl.d
    public abstract f1 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, @dl.d LayoutDirection layoutDirection);

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final f getBottomEnd() {
        return this.bottomEnd;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final f getBottomStart() {
        return this.bottomStart;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final f getTopEnd() {
        return this.topEnd;
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final f getTopStart() {
        return this.topStart;
    }
}
