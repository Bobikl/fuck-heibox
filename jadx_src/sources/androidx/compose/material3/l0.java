package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BT\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0005J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\tR\u001d\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u001d\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u001d\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u001d\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u001d\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u001d\u0010\u0018\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u001d\u0010\u001a\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/l0;", "", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", ak.av, "(Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "", "enabled", "b", "(ZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", ak.aF, "d", "e", "f", "J", "containerColor", "headlineColor", "leadingIconColor", "overlineColor", "supportingTextColor", "trailingIconColor", "g", "disabledHeadlineColor", RXScreenCaptureService.KEY_HEIGHT, "disabledLeadingIconColor", "i", "disabledTrailingIconColor", "<init>", "(JJJJJJJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long headlineColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long leadingIconColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long overlineColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long supportingTextColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long trailingIconColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledHeadlineColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconColor;

    private l0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.containerColor = j10;
        this.headlineColor = j11;
        this.leadingIconColor = j12;
        this.overlineColor = j13;
        this.supportingTextColor = j14;
        this.trailingIconColor = j15;
        this.disabledHeadlineColor = j16;
        this.disabledLeadingIconColor = j17;
        this.disabledTrailingIconColor = j18;
    }

    public /* synthetic */ l0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-380363090);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-380363090, i10, -1, "androidx.compose.material3.ListItemColors.containerColor (ListItem.kt:447)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(this.containerColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> b(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1254314043);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1254314043, i10, -1, "androidx.compose.material3.ListItemColors.headlineColor (ListItem.kt:453)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.headlineColor : this.disabledHeadlineColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> c(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(694213044);
        if (ComposerKt.g0()) {
            ComposerKt.w0(694213044, i10, -1, "androidx.compose.material3.ListItemColors.leadingIconColor (ListItem.kt:461)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.leadingIconColor : this.disabledLeadingIconColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> d(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1467587733);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1467587733, i10, -1, "androidx.compose.material3.ListItemColors.overlineColor (ListItem.kt:469)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(this.overlineColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> e(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1251828896);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1251828896, i10, -1, "androidx.compose.material3.ListItemColors.supportingColor (ListItem.kt:475)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(this.supportingTextColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> f(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-778325338);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-778325338, i10, -1, "androidx.compose.material3.ListItemColors.trailingIconColor (ListItem.kt:481)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.trailingIconColor : this.disabledTrailingIconColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }
}
