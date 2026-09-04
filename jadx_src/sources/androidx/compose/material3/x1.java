package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b.\b\u0007\u0018\u00002\u00020\u0001Bì\u0001\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010'\u001a\u00020\b\u0012\u0006\u0010(\u001a\u00020\b\u0012\u0006\u0010)\u001a\u00020\b\u0012\u0006\u0010+\u001a\u00020\b\u0012\u0006\u0010,\u001a\u00020\b\u0012\u0006\u0010-\u001a\u00020\b\u0012\u0006\u0010/\u001a\u00020\b\u0012\u0006\u00100\u001a\u00020\b\u0012\u0006\u00102\u001a\u00020\b\u0012\u0006\u00104\u001a\u00020\b\u0012\u0006\u00106\u001a\u00020\b\u0012\u0006\u00108\u001a\u00020\b\u0012\u0006\u0010:\u001a\u00020\b\u0012\u0006\u0010<\u001a\u00020\b\u0012\u0006\u0010>\u001a\u00020\b\u0012\u0006\u0010@\u001a\u00020\b\u0012\u0006\u0010B\u001a\u00020\b\u0012\u0006\u0010D\u001a\u00020\b\u0012\u0006\u0010F\u001a\u00020\b\u0012\u0006\u0010H\u001a\u00020\b\u0012\u0006\u0010J\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\bM\u0010NJ0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\nJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010J0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\nJ \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0010J\u0013\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001d\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u001d\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u001d\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001d\u0010 \u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010%\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u001d\u0010'\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001d\u0010(\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u001d\u0010)\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001d\u0010+\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001d\u0010,\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u001d\u0010-\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u001d\u0010/\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u001d\u00100\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001d\u00102\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b1\u0010\u0019R\u001d\u00104\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b3\u0010\u0019R\u001d\u00106\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b5\u0010\u0019R\u001d\u00108\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b7\u0010\u0019R\u001d\u0010:\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b9\u0010\u0019R\u001d\u0010<\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b;\u0010\u0019R\u001d\u0010>\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b=\u0010\u0019R\u001d\u0010@\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b?\u0010\u0019R\u001d\u0010B\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bA\u0010\u0019R\u001d\u0010D\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bC\u0010\u0019R\u001d\u0010F\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bE\u0010\u0019R\u001d\u0010H\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bG\u0010\u0019R\u001d\u0010J\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bI\u0010\u0019R\u0014\u0010L\u001a\u00020!8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010K\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/material3/x1;", "", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/e;", "interactionSource", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", "i", "(ZZLandroidx/compose/foundation/interaction/e;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "o", "e", ak.av, "(Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "j", "(ZLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "g", "m", "l", "b", "other", "equals", "", "hashCode", "J", "textColor", "disabledTextColor", ak.aF, "containerColor", "d", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/v;", "f", "Landroidx/compose/foundation/text/selection/v;", "textSelectionColors", "focusedIndicatorColor", RXScreenCaptureService.KEY_HEIGHT, "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "k", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "n", "errorLeadingIconColor", "focusedTrailingIconColor", "p", "unfocusedTrailingIconColor", "q", "disabledTrailingIconColor", "r", "errorTrailingIconColor", ak.aB, "focusedLabelColor", "t", "unfocusedLabelColor", ak.aG, "disabledLabelColor", "v", "errorLabelColor", RXScreenCaptureService.KEY_WIDTH, "placeholderColor", "x", "disabledPlaceholderColor", "y", "focusedSupportingTextColor", ak.aD, "unfocusedSupportingTextColor", androidx.exifinterface.media.a.W4, "disabledSupportingTextColor", "B", "errorSupportingTextColor", "(Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/text/selection/v;", "selectionColors", "<init>", "(JJJJJLandroidx/compose/foundation/text/selection/v;JJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class x1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final long disabledSupportingTextColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final long errorSupportingTextColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long textColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long disabledTextColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long cursorColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long errorCursorColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SelectionColors textSelectionColors;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long focusedIndicatorColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedIndicatorColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long errorIndicatorColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledIndicatorColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long focusedLeadingIconColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedLeadingIconColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long errorLeadingIconColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long focusedTrailingIconColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedTrailingIconColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long errorTrailingIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long focusedLabelColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedLabelColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long disabledLabelColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final long errorLabelColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final long placeholderColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final long disabledPlaceholderColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final long focusedSupportingTextColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedSupportingTextColor;

    private x1(long j10, long j11, long j12, long j13, long j14, SelectionColors selectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        this.textColor = j10;
        this.disabledTextColor = j11;
        this.containerColor = j12;
        this.cursorColor = j13;
        this.errorCursorColor = j14;
        this.textSelectionColors = selectionColors;
        this.focusedIndicatorColor = j15;
        this.unfocusedIndicatorColor = j16;
        this.errorIndicatorColor = j17;
        this.disabledIndicatorColor = j18;
        this.focusedLeadingIconColor = j19;
        this.unfocusedLeadingIconColor = j20;
        this.disabledLeadingIconColor = j21;
        this.errorLeadingIconColor = j22;
        this.focusedTrailingIconColor = j23;
        this.unfocusedTrailingIconColor = j24;
        this.disabledTrailingIconColor = j25;
        this.errorTrailingIconColor = j26;
        this.focusedLabelColor = j27;
        this.unfocusedLabelColor = j28;
        this.disabledLabelColor = j29;
        this.errorLabelColor = j30;
        this.placeholderColor = j31;
        this.disabledPlaceholderColor = j32;
        this.focusedSupportingTextColor = j33;
        this.unfocusedSupportingTextColor = j34;
        this.disabledSupportingTextColor = j35;
        this.errorSupportingTextColor = j36;
    }

    public /* synthetic */ x1(long j10, long j11, long j12, long j13, long j14, SelectionColors selectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, j14, selectionColors, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36);
    }

    private static final boolean d(m2<Boolean> m2Var) {
        return m2Var.getValue().booleanValue();
    }

    private static final boolean f(m2<Boolean> m2Var) {
        return m2Var.getValue().booleanValue();
    }

    private static final boolean h(m2<Boolean> m2Var) {
        return m2Var.getValue().booleanValue();
    }

    private static final boolean k(m2<Boolean> m2Var) {
        return m2Var.getValue().booleanValue();
    }

    private static final boolean n(m2<Boolean> m2Var) {
        return m2Var.getValue().booleanValue();
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(954653884);
        if (ComposerKt.g0()) {
            ComposerKt.w0(954653884, i10, -1, "androidx.compose.material3.TextFieldColors.containerColor (TextFieldDefaults.kt:794)");
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
        pVar.T(-1885422187);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1885422187, i10, -1, "androidx.compose.material3.TextFieldColors.cursorColor (TextFieldDefaults.kt:862)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.errorCursorColor : this.cursorColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @xh.h(name = "getSelectionColors")
    @androidx.compose.runtime.h
    public final SelectionColors c(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(997785083);
        if (ComposerKt.g0()) {
            ComposerKt.w0(997785083, i10, -1, "androidx.compose.material3.TextFieldColors.<get-selectionColors> (TextFieldDefaults.kt:870)");
        }
        SelectionColors selectionColors = this.textSelectionColors;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return selectionColors;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> e(boolean z10, boolean z11, @dl.d androidx.compose.foundation.interaction.e interactionSource, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        m2<androidx.compose.ui.graphics.l0> m2VarT;
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        pVar.T(-1877482635);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1877482635, i10, -1, "androidx.compose.material3.TextFieldColors.indicatorColor (TextFieldDefaults.kt:770)");
        }
        m2<Boolean> m2VarA = FocusInteractionKt.a(interactionSource, pVar, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.disabledIndicatorColor;
        } else if (z11) {
            j10 = this.errorIndicatorColor;
        } else {
            j10 = d(m2VarA) ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
        }
        long j11 = j10;
        if (z10) {
            pVar.T(715730990);
            m2VarT = androidx.compose.animation.q.b(j11, androidx.compose.animation.core.i.q(150, 0, null, 6, null), null, pVar, 48, 4);
            pVar.c0();
        } else {
            pVar.T(715731095);
            m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(j11), pVar, 0);
            pVar.c0();
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) other;
        return androidx.compose.ui.graphics.l0.y(this.textColor, x1Var.textColor) && androidx.compose.ui.graphics.l0.y(this.disabledTextColor, x1Var.disabledTextColor) && androidx.compose.ui.graphics.l0.y(this.cursorColor, x1Var.cursorColor) && androidx.compose.ui.graphics.l0.y(this.errorCursorColor, x1Var.errorCursorColor) && kotlin.jvm.internal.f0.g(this.textSelectionColors, x1Var.textSelectionColors) && androidx.compose.ui.graphics.l0.y(this.focusedIndicatorColor, x1Var.focusedIndicatorColor) && androidx.compose.ui.graphics.l0.y(this.unfocusedIndicatorColor, x1Var.unfocusedIndicatorColor) && androidx.compose.ui.graphics.l0.y(this.errorIndicatorColor, x1Var.errorIndicatorColor) && androidx.compose.ui.graphics.l0.y(this.disabledIndicatorColor, x1Var.disabledIndicatorColor) && androidx.compose.ui.graphics.l0.y(this.focusedLeadingIconColor, x1Var.focusedLeadingIconColor) && androidx.compose.ui.graphics.l0.y(this.unfocusedLeadingIconColor, x1Var.unfocusedLeadingIconColor) && androidx.compose.ui.graphics.l0.y(this.disabledLeadingIconColor, x1Var.disabledLeadingIconColor) && androidx.compose.ui.graphics.l0.y(this.errorLeadingIconColor, x1Var.errorLeadingIconColor) && androidx.compose.ui.graphics.l0.y(this.focusedTrailingIconColor, x1Var.focusedTrailingIconColor) && androidx.compose.ui.graphics.l0.y(this.unfocusedTrailingIconColor, x1Var.unfocusedTrailingIconColor) && androidx.compose.ui.graphics.l0.y(this.disabledTrailingIconColor, x1Var.disabledTrailingIconColor) && androidx.compose.ui.graphics.l0.y(this.errorTrailingIconColor, x1Var.errorTrailingIconColor) && androidx.compose.ui.graphics.l0.y(this.containerColor, x1Var.containerColor) && androidx.compose.ui.graphics.l0.y(this.focusedLabelColor, x1Var.focusedLabelColor) && androidx.compose.ui.graphics.l0.y(this.unfocusedLabelColor, x1Var.unfocusedLabelColor) && androidx.compose.ui.graphics.l0.y(this.disabledLabelColor, x1Var.disabledLabelColor) && androidx.compose.ui.graphics.l0.y(this.errorLabelColor, x1Var.errorLabelColor) && androidx.compose.ui.graphics.l0.y(this.placeholderColor, x1Var.placeholderColor) && androidx.compose.ui.graphics.l0.y(this.disabledPlaceholderColor, x1Var.disabledPlaceholderColor) && androidx.compose.ui.graphics.l0.y(this.focusedSupportingTextColor, x1Var.focusedSupportingTextColor) && androidx.compose.ui.graphics.l0.y(this.unfocusedSupportingTextColor, x1Var.unfocusedSupportingTextColor) && androidx.compose.ui.graphics.l0.y(this.disabledSupportingTextColor, x1Var.disabledSupportingTextColor) && androidx.compose.ui.graphics.l0.y(this.errorSupportingTextColor, x1Var.errorSupportingTextColor);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> g(boolean z10, boolean z11, @dl.d androidx.compose.foundation.interaction.e interactionSource, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        pVar.T(1167161306);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1167161306, i10, -1, "androidx.compose.material3.TextFieldColors.labelColor (TextFieldDefaults.kt:817)");
        }
        m2<Boolean> m2VarA = FocusInteractionKt.a(interactionSource, pVar, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.disabledLabelColor;
        } else if (z11) {
            j10 = this.errorLabelColor;
        } else {
            j10 = f(m2VarA) ? this.focusedLabelColor : this.unfocusedLabelColor;
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(j10), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((androidx.compose.ui.graphics.l0.K(this.textColor) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledTextColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.cursorColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + androidx.compose.ui.graphics.l0.K(this.focusedIndicatorColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.unfocusedIndicatorColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.errorIndicatorColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledIndicatorColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.focusedLeadingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.unfocusedLeadingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledLeadingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.errorLeadingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.focusedTrailingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.unfocusedTrailingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledTrailingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.errorTrailingIconColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.containerColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.focusedLabelColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.unfocusedLabelColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledLabelColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.errorLabelColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.placeholderColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledPlaceholderColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.focusedSupportingTextColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.unfocusedSupportingTextColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledSupportingTextColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.errorSupportingTextColor);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> i(boolean z10, boolean z11, @dl.d androidx.compose.foundation.interaction.e interactionSource, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        pVar.T(925127045);
        if (ComposerKt.g0()) {
            ComposerKt.w0(925127045, i10, -1, "androidx.compose.material3.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:718)");
        }
        m2<Boolean> m2VarA = FocusInteractionKt.a(interactionSource, pVar, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.disabledLeadingIconColor;
        } else if (z11) {
            j10 = this.errorLeadingIconColor;
        } else {
            j10 = h(m2VarA) ? this.focusedLeadingIconColor : this.unfocusedLeadingIconColor;
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(j10), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> j(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-117469162);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-117469162, i10, -1, "androidx.compose.material3.TextFieldColors.placeholderColor (TextFieldDefaults.kt:804)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.placeholderColor : this.disabledPlaceholderColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> l(boolean z10, boolean z11, @dl.d androidx.compose.foundation.interaction.e interactionSource, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        pVar.T(1464709698);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1464709698, i10, -1, "androidx.compose.material3.TextFieldColors.supportingTextColor (TextFieldDefaults.kt:839)");
        }
        m2<Boolean> m2VarA = FocusInteractionKt.a(interactionSource, pVar, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.disabledSupportingTextColor;
        } else if (z11) {
            j10 = this.errorSupportingTextColor;
        } else {
            j10 = k(m2VarA) ? this.focusedSupportingTextColor : this.unfocusedSupportingTextColor;
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(j10), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> m(boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(2080722220);
        if (ComposerKt.g0()) {
            ComposerKt.w0(2080722220, i10, -1, "androidx.compose.material3.TextFieldColors.textColor (TextFieldDefaults.kt:834)");
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(z10 ? this.textColor : this.disabledTextColor), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> o(boolean z10, boolean z11, @dl.d androidx.compose.foundation.interaction.e interactionSource, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        pVar.T(-109504137);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-109504137, i10, -1, "androidx.compose.material3.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:744)");
        }
        m2<Boolean> m2VarA = FocusInteractionKt.a(interactionSource, pVar, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.disabledTrailingIconColor;
        } else if (z11) {
            j10 = this.errorTrailingIconColor;
        } else {
            j10 = n(m2VarA) ? this.focusedTrailingIconColor : this.unfocusedTrailingIconColor;
        }
        m2<androidx.compose.ui.graphics.l0> m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(j10), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }
}
