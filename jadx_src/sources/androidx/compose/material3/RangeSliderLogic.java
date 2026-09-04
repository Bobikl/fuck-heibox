package androidx.compose.material3;

import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017\u0012\u001e\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u001e0\u0017¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR/\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u001e0\u00178\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a¨\u0006#"}, d2 = {"Landroidx/compose/material3/RangeSliderLogic;", "", "", "draggingStart", "Landroidx/compose/foundation/interaction/g;", ak.av, "", "eventX", "", ak.aF, "posX", "Landroidx/compose/foundation/interaction/d;", "interaction", "Lkotlinx/coroutines/q0;", "scope", "Lkotlin/b2;", "b", "Landroidx/compose/foundation/interaction/g;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/foundation/interaction/g;", "startInteractionSource", "d", "endInteractionSource", "Landroidx/compose/runtime/m2;", "Landroidx/compose/runtime/m2;", "g", "()Landroidx/compose/runtime/m2;", "rawOffsetStart", "f", "rawOffsetEnd", "Lkotlin/Function2;", "e", "onDrag", "<init>", "(Landroidx/compose/foundation/interaction/g;Landroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class RangeSliderLogic {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.interaction.g startInteractionSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.interaction.g endInteractionSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<Float> rawOffsetStart;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<Float> rawOffsetEnd;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<yh.p<Boolean, Float, kotlin.b2>> onDrag;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderLogic(@dl.d androidx.compose.foundation.interaction.g startInteractionSource, @dl.d androidx.compose.foundation.interaction.g endInteractionSource, @dl.d m2<Float> rawOffsetStart, @dl.d m2<Float> rawOffsetEnd, @dl.d m2<? extends yh.p<? super Boolean, ? super Float, kotlin.b2>> onDrag) {
        kotlin.jvm.internal.f0.p(startInteractionSource, "startInteractionSource");
        kotlin.jvm.internal.f0.p(endInteractionSource, "endInteractionSource");
        kotlin.jvm.internal.f0.p(rawOffsetStart, "rawOffsetStart");
        kotlin.jvm.internal.f0.p(rawOffsetEnd, "rawOffsetEnd");
        kotlin.jvm.internal.f0.p(onDrag, "onDrag");
        this.startInteractionSource = startInteractionSource;
        this.endInteractionSource = endInteractionSource;
        this.rawOffsetStart = rawOffsetStart;
        this.rawOffsetEnd = rawOffsetEnd;
        this.onDrag = onDrag;
    }

    @dl.d
    public final androidx.compose.foundation.interaction.g a(boolean draggingStart) {
        return draggingStart ? this.startInteractionSource : this.endInteractionSource;
    }

    public final void b(boolean z10, float f10, @dl.d androidx.compose.foundation.interaction.d interaction, @dl.d kotlinx.coroutines.q0 scope) {
        kotlin.jvm.internal.f0.p(interaction, "interaction");
        kotlin.jvm.internal.f0.p(scope, "scope");
        this.onDrag.getValue().invoke(Boolean.valueOf(z10), Float.valueOf(f10 - (z10 ? this.rawOffsetStart : this.rawOffsetEnd).getValue().floatValue()));
        kotlinx.coroutines.k.f(scope, null, null, new RangeSliderLogic$captureThumb$1(this, z10, interaction, null), 3, null);
    }

    public final int c(float eventX) {
        return Float.compare(Math.abs(this.rawOffsetStart.getValue().floatValue() - eventX), Math.abs(this.rawOffsetEnd.getValue().floatValue() - eventX));
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final androidx.compose.foundation.interaction.g getEndInteractionSource() {
        return this.endInteractionSource;
    }

    @dl.d
    public final m2<yh.p<Boolean, Float, kotlin.b2>> e() {
        return this.onDrag;
    }

    @dl.d
    public final m2<Float> f() {
        return this.rawOffsetEnd;
    }

    @dl.d
    public final m2<Float> g() {
        return this.rawOffsetStart;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final androidx.compose.foundation.interaction.g getStartInteractionSource() {
        return this.startInteractionSource;
    }
}
