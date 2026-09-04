package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.platform.InspectableValueKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bi\u0010jJ9\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJM\u0010\u0012\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013JS\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001eJ=\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u001eJ=\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u001eJ\u00ad\u0002\u0010@\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020\"2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020\"2\b\b\u0002\u0010,\u001a\u00020\"2\b\b\u0002\u0010-\u001a\u00020\"2\b\b\u0002\u0010.\u001a\u00020\"2\b\b\u0002\u0010/\u001a\u00020\"2\b\b\u0002\u00100\u001a\u00020\"2\b\b\u0002\u00101\u001a\u00020\"2\b\b\u0002\u00102\u001a\u00020\"2\b\b\u0002\u00103\u001a\u00020\"2\b\b\u0002\u00104\u001a\u00020\"2\b\b\u0002\u00105\u001a\u00020\"2\b\b\u0002\u00106\u001a\u00020\"2\b\b\u0002\u00107\u001a\u00020\"2\b\b\u0002\u00108\u001a\u00020\"2\b\b\u0002\u00109\u001a\u00020\"2\b\b\u0002\u0010:\u001a\u00020\"2\b\b\u0002\u0010;\u001a\u00020\"2\b\b\u0002\u0010<\u001a\u00020\"2\b\b\u0002\u0010=\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\"2\b\b\u0002\u0010?\u001a\u00020\"H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJ\u00ad\u0002\u0010F\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020\"2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010B\u001a\u00020\"2\b\b\u0002\u0010C\u001a\u00020\"2\b\b\u0002\u0010D\u001a\u00020\"2\b\b\u0002\u0010E\u001a\u00020\"2\b\b\u0002\u0010.\u001a\u00020\"2\b\b\u0002\u0010/\u001a\u00020\"2\b\b\u0002\u00100\u001a\u00020\"2\b\b\u0002\u00101\u001a\u00020\"2\b\b\u0002\u00102\u001a\u00020\"2\b\b\u0002\u00103\u001a\u00020\"2\b\b\u0002\u00104\u001a\u00020\"2\b\b\u0002\u00105\u001a\u00020\"2\b\b\u0002\u00106\u001a\u00020\"2\b\b\u0002\u00107\u001a\u00020\"2\b\b\u0002\u00108\u001a\u00020\"2\b\b\u0002\u00109\u001a\u00020\"2\b\b\u0002\u0010:\u001a\u00020\"2\b\b\u0002\u0010;\u001a\u00020\"2\b\b\u0002\u0010<\u001a\u00020\"2\b\b\u0002\u0010=\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\"2\b\b\u0002\u0010?\u001a\u00020\"H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010AJú\u0001\u0010V\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020G2\u0011\u0010K\u001a\r\u0012\u0004\u0012\u00020\u000b0I¢\u0006\u0002\bJ2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u00022\u0006\u0010N\u001a\u00020M2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010O\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010I¢\u0006\u0002\bJ2\u0015\b\u0002\u0010P\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010I¢\u0006\u0002\bJ2\u0015\b\u0002\u0010Q\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010I¢\u0006\u0002\bJ2\u0015\b\u0002\u0010R\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010I¢\u0006\u0002\bJ2\u0015\b\u0002\u0010S\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010I¢\u0006\u0002\bJ2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010T\u001a\u00020\u001c2\u0013\b\u0002\u0010U\u001a\r\u0012\u0004\u0012\u00020\u000b0I¢\u0006\u0002\bJH\u0007¢\u0006\u0004\bV\u0010WJð\u0001\u0010X\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020G2\u0011\u0010K\u001a\r\u0012\u0004\u0012\u00020\u000b0I¢\u0006\u0002\bJ2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u00022\u0006\u0010N\u001a\u00020M2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010O\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010I¢\u0006\u0002\bJ2\u0015\b\u0002\u0010P\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010I¢\u0006\u0002\bJ2\u0015\b\u0002\u0010Q\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010I¢\u0006\u0002\bJ2\u0015\b\u0002\u0010R\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010I¢\u0006\u0002\bJ2\u0015\b\u0002\u0010S\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010I¢\u0006\u0002\bJ2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010T\u001a\u00020\u001c2\u0013\b\u0002\u0010U\u001a\r\u0012\u0004\u0012\u00020\u000b0I¢\u0006\u0002\bJH\u0007¢\u0006\u0004\bX\u0010YR \u0010]\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010Z\u001a\u0004\b[\u0010\\R \u0010_\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bX\u0010Z\u001a\u0004\b^\u0010\\R \u0010a\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bV\u0010Z\u001a\u0004\b`\u0010\\R \u0010d\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bb\u0010Z\u001a\u0004\bc\u0010\\R\u0011\u0010g\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\be\u0010fR\u0011\u0010h\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bb\u0010f\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/e;", "interactionSource", "Landroidx/compose/material3/x1;", "colors", "Landroidx/compose/ui/graphics/g2;", "shape", "Lkotlin/b2;", ak.av, "(ZZLandroidx/compose/foundation/interaction/e;Landroidx/compose/material3/x1;Landroidx/compose/ui/graphics/g2;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/n;", "Ls1/h;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "k", "(Landroidx/compose/ui/n;ZZLandroidx/compose/foundation/interaction/e;Landroidx/compose/material3/x1;FF)Landroidx/compose/ui/n;", "focusedBorderThickness", "unfocusedBorderThickness", "b", "(ZZLandroidx/compose/foundation/interaction/e;Landroidx/compose/material3/x1;Landroidx/compose/ui/graphics/g2;FFLandroidx/compose/runtime/p;II)V", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "top", "bottom", "Landroidx/compose/foundation/layout/m0;", ak.aB, "(FFFF)Landroidx/compose/foundation/layout/m0;", ak.aG, "n", "p", "Landroidx/compose/ui/graphics/l0;", "textColor", "disabledTextColor", "containerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/v;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "r", "(JJJJJLandroidx/compose/foundation/text/selection/v;JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/p;IIII)Landroidx/compose/material3/x1;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "m", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/h;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/m0;", "visualTransformation", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "placeholder", "leadingIcon", "trailingIcon", "supportingText", "contentPadding", com.google.android.exoplayer2.text.ttml.d.W, "d", "(Ljava/lang/String;Lyh/p;ZZLandroidx/compose/ui/text/input/m0;Landroidx/compose/foundation/interaction/e;ZLyh/p;Lyh/p;Lyh/p;Lyh/p;Lyh/p;Landroidx/compose/ui/graphics/g2;Landroidx/compose/material3/x1;Landroidx/compose/foundation/layout/m0;Lyh/p;Landroidx/compose/runtime/p;III)V", ak.aF, "(Ljava/lang/String;Lyh/p;ZZLandroidx/compose/ui/text/input/m0;Landroidx/compose/foundation/interaction/e;ZLyh/p;Lyh/p;Lyh/p;Lyh/p;Lyh/p;Landroidx/compose/material3/x1;Landroidx/compose/foundation/layout/m0;Lyh/p;Landroidx/compose/runtime/p;III)V", "F", "g", "()F", "MinHeight", RXScreenCaptureService.KEY_HEIGHT, "MinWidth", "j", "UnfocusedBorderThickness", "e", "f", "FocusedBorderThickness", "i", "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/g2;", "outlinedShape", "filledShape", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class TextFieldDefaults {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final TextFieldDefaults f11327a = new TextFieldDefaults();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight = s1.h.g(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth = s1.h.g(bb.c.b.f30964u2);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float UnfocusedBorderThickness = s1.h.g(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float FocusedBorderThickness = s1.h.g(2);

    private TextFieldDefaults() {
    }

    public static /* synthetic */ androidx.compose.ui.n l(TextFieldDefaults textFieldDefaults, androidx.compose.ui.n nVar, boolean z10, boolean z11, androidx.compose.foundation.interaction.e eVar, x1 x1Var, float f10, float f11, int i10, Object obj) {
        return textFieldDefaults.k(nVar, z10, z11, eVar, x1Var, (i10 & 16) != 0 ? FocusedBorderThickness : f10, (i10 & 32) != 0 ? UnfocusedBorderThickness : f11);
    }

    public static /* synthetic */ androidx.compose.foundation.layout.m0 o(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.g();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.g();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldImplKt.g();
        }
        if ((i10 & 8) != 0) {
            f13 = TextFieldImplKt.g();
        }
        return textFieldDefaults.n(f10, f11, f12, f13);
    }

    public static /* synthetic */ androidx.compose.foundation.layout.m0 q(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.g();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.f();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldImplKt.g();
        }
        if ((i10 & 8) != 0) {
            f13 = s1.h.g(0);
        }
        return textFieldDefaults.p(f10, f11, f12, f13);
    }

    public static /* synthetic */ androidx.compose.foundation.layout.m0 t(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.g();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.g();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldKt.k();
        }
        if ((i10 & 8) != 0) {
            f13 = TextFieldKt.l();
        }
        return textFieldDefaults.s(f10, f11, f12, f13);
    }

    public static /* synthetic */ androidx.compose.foundation.layout.m0 v(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.g();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.g();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldImplKt.g();
        }
        if ((i10 & 8) != 0) {
            f13 = TextFieldImplKt.g();
        }
        return textFieldDefaults.u(f10, f11, f12, f13);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x013d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0149  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    @w
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public final void a(final boolean z10, final boolean z11, @dl.d final androidx.compose.foundation.interaction.e interactionSource, @dl.d final x1 colors, @dl.e g2 g2Var, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        g2 g2VarE;
        int i13;
        final g2 g2Var2;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        kotlin.jvm.internal.f0.p(colors, "colors");
        androidx.compose.runtime.p pVarF = pVar.F(-1358797526);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.u(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.u(z11) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.s(interactionSource) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            i12 |= pVarF.s(colors) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                g2VarE = g2Var;
                int i14 = pVarF.s(g2VarE) ? 16384 : 8192;
                i12 |= i14;
            } else {
                g2VarE = g2Var;
            }
            i12 |= i14;
        } else {
            g2VarE = g2Var;
        }
        if ((i11 & 32) == 0) {
            if ((458752 & i10) == 0) {
                i13 = pVarF.s(this) ? 131072 : 65536;
            }
            if ((374491 & i12) == 74898 || !pVarF.b()) {
                pVarF.W();
                if ((i10 & 1) == 0 && !pVarF.o()) {
                    pVarF.l();
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                } else if ((i11 & 16) != 0) {
                    g2VarE = e(pVarF, (i12 >> 15) & 14);
                    i12 &= -57345;
                }
                g2 g2Var3 = g2VarE;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1358797526, i12, -1, "androidx.compose.material3.TextFieldDefaults.FilledContainerBox (TextFieldDefaults.kt:102)");
                }
                BoxKt.a(l(this, BackgroundKt.c(androidx.compose.ui.n.INSTANCE, colors.a(pVarF, (i12 >> 9) & 14).getValue().M(), g2Var3), z10, z11, interactionSource, colors, 0.0f, 0.0f, 48, null), pVarF, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                g2Var2 = g2Var3;
            } else {
                pVarF.l();
                g2Var2 = g2VarE;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$FilledContainerBox$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i15) {
                    this.f11332b.a(z10, z11, interactionSource, colors, g2Var2, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 = androidx.profileinstaller.o.c.f26824k;
        i12 |= i13;
        if ((374491 & i12) == 74898) {
            pVarF.W();
            if ((i10 & 1) == 0) {
                if ((i11 & 16) != 0) {
                    g2VarE = e(pVarF, (i12 >> 15) & 14);
                    i12 &= -57345;
                }
            } else if ((i11 & 16) != 0) {
                g2VarE = e(pVarF, (i12 >> 15) & 14);
                i12 &= -57345;
            }
            g2 g2Var4 = g2VarE;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1358797526, i12, -1, "androidx.compose.material3.TextFieldDefaults.FilledContainerBox (TextFieldDefaults.kt:102)");
            }
            BoxKt.a(l(this, BackgroundKt.c(androidx.compose.ui.n.INSTANCE, colors.a(pVarF, (i12 >> 9) & 14).getValue().M(), g2Var4), z10, z11, interactionSource, colors, 0.0f, 0.0f, 48, null), pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            g2Var2 = g2Var4;
        } else {
            pVarF.W();
            if ((i10 & 1) == 0) {
                if ((i11 & 16) != 0) {
                    g2VarE = e(pVarF, (i12 >> 15) & 14);
                    i12 &= -57345;
                }
            } else if ((i11 & 16) != 0) {
                g2VarE = e(pVarF, (i12 >> 15) & 14);
                i12 &= -57345;
            }
            g2 g2Var5 = g2VarE;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1358797526, i12, -1, "androidx.compose.material3.TextFieldDefaults.FilledContainerBox (TextFieldDefaults.kt:102)");
            }
            BoxKt.a(l(this, BackgroundKt.c(androidx.compose.ui.n.INSTANCE, colors.a(pVarF, (i12 >> 9) & 14).getValue().M(), g2Var5), z10, z11, interactionSource, colors, 0.0f, 0.0f, 48, null), pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            g2Var2 = g2Var5;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$FilledContainerBox$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i15) {
                this.f11332b.a(z10, z11, interactionSource, colors, g2Var2, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:118:0x016e  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ca  */
    @w
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public final void b(final boolean z10, final boolean z11, @dl.d final androidx.compose.foundation.interaction.e interactionSource, @dl.d final x1 colors, @dl.e g2 g2Var, float f10, float f11, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        g2 g2VarD;
        float f12;
        float f13;
        int i13;
        g2 g2Var2;
        float f14;
        float f15;
        final g2 g2Var3;
        final float f16;
        final float f17;
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        kotlin.jvm.internal.f0.p(colors, "colors");
        androidx.compose.runtime.p pVarF = pVar.F(-1998946250);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.u(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.u(z11) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.s(interactionSource) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            i12 |= pVarF.s(colors) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                g2VarD = g2Var;
                int i14 = pVarF.s(g2VarD) ? 16384 : 8192;
                i12 |= i14;
            } else {
                g2VarD = g2Var;
            }
            i12 |= i14;
        } else {
            g2VarD = g2Var;
        }
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
                f12 = f10;
                int i15 = pVarF.w(f12) ? 131072 : 65536;
                i12 |= i15;
            } else {
                f12 = f10;
            }
            i12 |= i15;
        } else {
            f12 = f10;
        }
        if ((3670016 & i10) == 0) {
            if ((i11 & 64) == 0) {
                f13 = f11;
                int i16 = pVarF.w(f13) ? 1048576 : 524288;
                i12 |= i16;
            } else {
                f13 = f11;
            }
            i12 |= i16;
        } else {
            f13 = f11;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((29360128 & i10) == 0) {
            i12 |= pVarF.s(this) ? 8388608 : 4194304;
        }
        if ((23967451 & i12) == 4793490 && pVarF.b()) {
            pVarF.l();
            f16 = f12;
            f17 = f13;
            g2Var3 = g2VarD;
        } else {
            pVarF.W();
            if ((i10 & 1) == 0 || pVarF.o()) {
                if ((i11 & 16) != 0) {
                    g2VarD = ShapesKt.d(t0.m0.f140030a.c(), pVarF, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    f12 = FocusedBorderThickness;
                }
                if ((i11 & 64) != 0) {
                    i13 = i12 & (-3670017);
                    g2Var2 = g2VarD;
                    f14 = UnfocusedBorderThickness;
                    f15 = f12;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1998946250, i13, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedBorderContainerBox (TextFieldDefaults.kt:175)");
                }
                int i17 = i13 >> 3;
                g2 g2Var4 = g2Var2;
                BoxKt.a(BackgroundKt.c(BorderKt.f(androidx.compose.ui.n.INSTANCE, (BorderStroke) y1.b(z10, z11, interactionSource, colors, f15, f14, pVarF, (i13 & 14) | (i13 & 112) | (i13 & bb.c.b.f30796me) | (i13 & bb.c.g.f32954lc) | (57344 & i17) | (i17 & 458752)).getValue(), g2Var4), colors.a(pVarF, (i13 >> 9) & 14).getValue().M(), g2Var4), pVarF, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                g2Var3 = g2Var4;
                f16 = f15;
                f17 = f14;
            } else {
                pVarF.l();
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                }
            }
            g2Var2 = g2VarD;
            f15 = f12;
            f14 = f13;
            i13 = i12;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1998946250, i13, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedBorderContainerBox (TextFieldDefaults.kt:175)");
            }
            int i18 = i13 >> 3;
            g2 g2Var5 = g2Var2;
            BoxKt.a(BackgroundKt.c(BorderKt.f(androidx.compose.ui.n.INSTANCE, (BorderStroke) y1.b(z10, z11, interactionSource, colors, f15, f14, pVarF, (i13 & 14) | (i13 & 112) | (i13 & bb.c.b.f30796me) | (i13 & bb.c.g.f32954lc) | (57344 & i18) | (i18 & 458752)).getValue(), g2Var5), colors.a(pVarF, (i13 >> 9) & 14).getValue().M(), g2Var5), pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            g2Var3 = g2Var5;
            f16 = f15;
            f17 = f14;
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedBorderContainerBox$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                this.f11340b.b(z10, z11, interactionSource, colors, g2Var3, f16, f17, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0144  */
    /* JADX WARN: Code duplicated, block: B:102:0x014a  */
    /* JADX WARN: Code duplicated, block: B:103:0x014d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0155  */
    /* JADX WARN: Code duplicated, block: B:108:0x015a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0160  */
    /* JADX WARN: Code duplicated, block: B:112:0x0166  */
    /* JADX WARN: Code duplicated, block: B:113:0x0169  */
    /* JADX WARN: Code duplicated, block: B:115:0x016e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0174  */
    /* JADX WARN: Code duplicated, block: B:119:0x0179  */
    /* JADX WARN: Code duplicated, block: B:121:0x017f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0185  */
    /* JADX WARN: Code duplicated, block: B:124:0x0188  */
    /* JADX WARN: Code duplicated, block: B:128:0x0190  */
    /* JADX WARN: Code duplicated, block: B:130:0x0194  */
    /* JADX WARN: Code duplicated, block: B:133:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:156:0x01da  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:170:0x0209  */
    /* JADX WARN: Code duplicated, block: B:176:0x0232  */
    /* JADX WARN: Code duplicated, block: B:178:0x0239  */
    /* JADX WARN: Code duplicated, block: B:188:0x0263 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x0265  */
    /* JADX WARN: Code duplicated, block: B:190:0x0267  */
    /* JADX WARN: Code duplicated, block: B:193:0x026c  */
    /* JADX WARN: Code duplicated, block: B:194:0x026e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0272  */
    /* JADX WARN: Code duplicated, block: B:197:0x0274  */
    /* JADX WARN: Code duplicated, block: B:199:0x0278  */
    /* JADX WARN: Code duplicated, block: B:200:0x027a  */
    /* JADX WARN: Code duplicated, block: B:202:0x027e  */
    /* JADX WARN: Code duplicated, block: B:203:0x0280  */
    /* JADX WARN: Code duplicated, block: B:206:0x0285  */
    /* JADX WARN: Code duplicated, block: B:209:0x028b  */
    /* JADX WARN: Code duplicated, block: B:210:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:213:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:214:0x0301  */
    /* JADX WARN: Code duplicated, block: B:216:0x0305  */
    /* JADX WARN: Code duplicated, block: B:217:0x032d  */
    /* JADX WARN: Code duplicated, block: B:221:0x034c  */
    /* JADX WARN: Code duplicated, block: B:224:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:229:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:83:0x010d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:88:0x011e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0124  */
    /* JADX WARN: Code duplicated, block: B:92:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0135  */
    /* JADX WARN: Code duplicated, block: B:98:0x013c  */
    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public final void c(@dl.d final String value, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, final boolean z10, final boolean z11, @dl.d final androidx.compose.ui.text.input.m0 visualTransformation, @dl.d final androidx.compose.foundation.interaction.e interactionSource, boolean z12, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar5, @dl.e x1 x1Var, @dl.e androidx.compose.foundation.layout.m0 m0Var, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6, @dl.e androidx.compose.runtime.p pVar7, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z13;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11;
        x1 x1VarM;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12;
        androidx.compose.foundation.layout.m0 m0VarO;
        androidx.compose.foundation.layout.m0 m0Var2;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVarB;
        x1 x1Var2;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15;
        boolean z14;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16;
        androidx.compose.runtime.p pVar17;
        final boolean z15;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22;
        final x1 x1Var3;
        final androidx.compose.foundation.layout.m0 m0Var3;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(value, "value");
        kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
        kotlin.jvm.internal.f0.p(visualTransformation, "visualTransformation");
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        androidx.compose.runtime.p pVarF = pVar7.F(508645792);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (pVarF.s(value) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= pVarF.s(innerTextField) ? 32 : 16;
        }
        if ((i12 & 4) == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                i13 |= pVarF.u(z10) ? 256 : 128;
            }
            if ((i12 & 8) != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.u(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i13 |= i14;
                }
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (pVarF.s(visualTransformation)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                if ((i12 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(interactionSource)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                    }
                    i17 = i12 & 64;
                    if (i17 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (pVarF.u(z12)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                    i19 = i12 & 128;
                    if (i19 != 0) {
                        i13 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (pVarF.s(pVar)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i13 |= i20;
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (pVarF.s(pVar2)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= com.google.android.exoplayer2.j.G;
                    } else if ((i10 & 1879048192) == 0) {
                        if (pVarF.s(pVar3)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (pVarF.s(pVar4)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    i28 = i12 & 2048;
                    if (i28 != 0) {
                        i26 |= 48;
                    } else if ((i11 & 112) == 0) {
                        if (pVarF.s(pVar5)) {
                            i29 = 32;
                        } else {
                            i29 = 16;
                        }
                        i26 |= i29;
                    }
                    if ((i11 & bb.c.b.f30796me) != 0) {
                        i26 |= ((i12 & 4096) == 0 || !pVarF.s(x1Var)) ? 128 : 256;
                    }
                    if ((i11 & bb.c.g.f32954lc) != 0) {
                        i26 |= ((i12 & 8192) == 0 || !pVarF.s(m0Var)) ? 1024 : 2048;
                    }
                    i30 = i26;
                    i31 = i12 & 16384;
                    if (i31 != 0) {
                        i30 |= 24576;
                    } else if ((i11 & 57344) == 0) {
                        i30 |= pVarF.s(pVar6) ? 16384 : 8192;
                    }
                    if ((i12 & 32768) != 0) {
                        i30 |= androidx.profileinstaller.o.c.f26824k;
                    } else if ((i11 & 458752) == 0) {
                        if (pVarF.s(this)) {
                            i32 = 131072;
                        } else {
                            i32 = 65536;
                        }
                        i30 |= i32;
                    }
                    if ((i13 & 1533916891) != 306783378 && (374491 & i30) == 74898 && pVarF.b()) {
                        pVarF.l();
                        pVar18 = pVar;
                        pVar19 = pVar2;
                        pVar20 = pVar3;
                        pVar21 = pVar4;
                        pVar22 = pVar5;
                        x1Var3 = x1Var;
                        m0Var3 = m0Var;
                        pVar23 = pVar6;
                        pVar17 = pVarF;
                        z15 = z12;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0 || pVarF.o()) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i21 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = i28 == 0 ? pVar5 : null;
                            if ((i12 & 4096) != 0) {
                                x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                                i30 &= -897;
                            } else {
                                x1VarM = x1Var;
                            }
                            pVar12 = pVar10;
                            if ((i12 & 8192) != 0) {
                                m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i30 &= -7169;
                            } else {
                                m0VarO = m0Var;
                            }
                            if (i31 != 0) {
                                final boolean z16 = z13;
                                final x1 x1Var4 = x1VarM;
                                final int i33 = i13;
                                final int i34 = i30;
                                m0Var2 = m0VarO;
                                pVar13 = pVar11;
                                pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar25, int i35) {
                                        if ((i35 & 11) == 2 && pVar25.b()) {
                                            pVar25.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(144282315, i35, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z17 = z10;
                                        boolean z18 = z16;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var5 = x1Var4;
                                        int i36 = i33;
                                        textFieldDefaults.b(z17, z18, eVar, x1Var5, null, 0.0f, 0.0f, pVar25, 12582912 | ((i36 >> 6) & 14) | ((i36 >> 15) & 112) | ((i36 >> 9) & bb.c.b.f30796me) | ((i34 << 3) & bb.c.g.f32954lc), 112);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                        a(pVar25, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                m0Var2 = m0VarO;
                                pVar13 = pVar11;
                                pVarB = pVar6;
                            }
                            x1Var2 = x1VarM;
                            pVar14 = pVar8;
                            pVar15 = pVar9;
                            z14 = z13;
                            pVar16 = pVar24;
                        } else {
                            pVarF.l();
                            if ((i12 & 4096) != 0) {
                                i30 &= -897;
                            }
                            if ((i12 & 8192) != 0) {
                                i30 &= -7169;
                            }
                            z14 = z12;
                            pVar14 = pVar;
                            pVar15 = pVar2;
                            pVar12 = pVar3;
                            pVar13 = pVar4;
                            pVar16 = pVar5;
                            x1Var2 = x1Var;
                            m0Var2 = m0Var;
                            pVarB = pVar6;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
                        }
                        int i35 = i13;
                        int i36 = i35 << 3;
                        int i37 = i35 >> 9;
                        int i38 = i30 << 21;
                        pVar17 = pVarF;
                        TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i36 & bb.c.b.f30796me) | (i36 & 112) | 6 | ((i35 >> 3) & bb.c.g.f32954lc) | (i37 & 57344) | (i37 & 458752) | (3670016 & i37) | (29360128 & i38) | (i38 & 234881024) | (1879048192 & (i35 << 18)), ((i35 >> 6) & 14) | ((i35 >> 15) & 112) | (i37 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z15 = z14;
                        pVar18 = pVar14;
                        pVar19 = pVar15;
                        pVar20 = pVar12;
                        pVar21 = pVar13;
                        pVar22 = pVar16;
                        x1Var3 = x1Var2;
                        m0Var3 = m0Var2;
                        pVar23 = pVarB;
                    }
                    u1VarH = pVar17.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar25, int i39) {
                            this.f11356b.c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, pVar18, pVar19, pVar20, pVar21, pVar22, x1Var3, m0Var3, pVar23, pVar25, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                            a(pVar25, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i16 = androidx.profileinstaller.o.c.f26824k;
                i13 |= i16;
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (pVarF.u(z12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(pVar)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(pVar2)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= com.google.android.exoplayer2.j.G;
                } else if ((i10 & 1879048192) == 0) {
                    if (pVarF.s(pVar3)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(pVar4)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                i28 = i12 & 2048;
                if (i28 != 0) {
                    i26 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (pVarF.s(pVar5)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i26 |= i29;
                }
                if ((i11 & bb.c.b.f30796me) != 0) {
                    i26 |= ((i12 & 4096) == 0 || !pVarF.s(x1Var)) ? 128 : 256;
                }
                if ((i11 & bb.c.g.f32954lc) != 0) {
                    i26 |= ((i12 & 8192) == 0 || !pVarF.s(m0Var)) ? 1024 : 2048;
                }
                i30 = i26;
                i31 = i12 & 16384;
                if (i31 != 0) {
                    i30 |= 24576;
                } else if ((i11 & 57344) == 0) {
                    i30 |= pVarF.s(pVar6) ? 16384 : 8192;
                }
                if ((i12 & 32768) != 0) {
                    i30 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i11 & 458752) == 0) {
                    if (pVarF.s(this)) {
                        i32 = 131072;
                    } else {
                        i32 = 65536;
                    }
                    i30 |= i32;
                }
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i21 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i28 == 0) {
                        }
                        if ((i12 & 4096) != 0) {
                            x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                            i30 &= -897;
                        } else {
                            x1VarM = x1Var;
                        }
                        pVar12 = pVar10;
                        if ((i12 & 8192) != 0) {
                            m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i30 &= -7169;
                        } else {
                            m0VarO = m0Var;
                        }
                        if (i31 != 0) {
                            final boolean z17 = z13;
                            final x1 x1Var5 = x1VarM;
                            final int i39 = i13;
                            final int i310 = i30;
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i311) {
                                    if ((i311 & 11) == 2 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(144282315, i311, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z18 = z10;
                                    boolean z19 = z17;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var6 = x1Var5;
                                    int i312 = i39;
                                    textFieldDefaults.b(z18, z19, eVar, x1Var6, null, 0.0f, 0.0f, pVar25, 12582912 | ((i312 >> 6) & 14) | ((i312 >> 15) & 112) | ((i312 >> 9) & bb.c.b.f30796me) | ((i310 << 3) & bb.c.g.f32954lc), 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                    a(pVar25, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = pVar6;
                        }
                        x1Var2 = x1VarM;
                        pVar14 = pVar8;
                        pVar15 = pVar9;
                        z14 = z13;
                        pVar16 = pVar24;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i21 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i28 == 0) {
                        }
                        if ((i12 & 4096) != 0) {
                            x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                            i30 &= -897;
                        } else {
                            x1VarM = x1Var;
                        }
                        pVar12 = pVar10;
                        if ((i12 & 8192) != 0) {
                            m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i30 &= -7169;
                        } else {
                            m0VarO = m0Var;
                        }
                        if (i31 != 0) {
                            final boolean z18 = z13;
                            final x1 x1Var6 = x1VarM;
                            final int i311 = i13;
                            final int i312 = i30;
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i313) {
                                    if ((i313 & 11) == 2 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(144282315, i313, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z19 = z10;
                                    boolean z110 = z18;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var7 = x1Var6;
                                    int i314 = i311;
                                    textFieldDefaults.b(z19, z110, eVar, x1Var7, null, 0.0f, 0.0f, pVar25, 12582912 | ((i314 >> 6) & 14) | ((i314 >> 15) & 112) | ((i314 >> 9) & bb.c.b.f30796me) | ((i312 << 3) & bb.c.g.f32954lc), 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                    a(pVar25, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = pVar6;
                        }
                        x1Var2 = x1VarM;
                        pVar14 = pVar8;
                        pVar15 = pVar9;
                        z14 = z13;
                        pVar16 = pVar24;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
                    }
                    int i313 = i13;
                    int i314 = i313 << 3;
                    int i315 = i313 >> 9;
                    int i316 = i30 << 21;
                    pVar17 = pVarF;
                    TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i314 & bb.c.b.f30796me) | (i314 & 112) | 6 | ((i313 >> 3) & bb.c.g.f32954lc) | (i315 & 57344) | (i315 & 458752) | (3670016 & i315) | (29360128 & i316) | (i316 & 234881024) | (1879048192 & (i313 << 18)), ((i313 >> 6) & 14) | ((i313 >> 15) & 112) | (i315 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z15 = z14;
                    pVar18 = pVar14;
                    pVar19 = pVar15;
                    pVar20 = pVar12;
                    pVar21 = pVar13;
                    pVar22 = pVar16;
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar23 = pVarB;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i21 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i28 == 0) {
                        }
                        if ((i12 & 4096) != 0) {
                            x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                            i30 &= -897;
                        } else {
                            x1VarM = x1Var;
                        }
                        pVar12 = pVar10;
                        if ((i12 & 8192) != 0) {
                            m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i30 &= -7169;
                        } else {
                            m0VarO = m0Var;
                        }
                        if (i31 != 0) {
                            final boolean z19 = z13;
                            final x1 x1Var7 = x1VarM;
                            final int i317 = i13;
                            final int i318 = i30;
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i319) {
                                    if ((i319 & 11) == 2 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(144282315, i319, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z110 = z10;
                                    boolean z111 = z19;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var8 = x1Var7;
                                    int i3110 = i317;
                                    textFieldDefaults.b(z110, z111, eVar, x1Var8, null, 0.0f, 0.0f, pVar25, 12582912 | ((i3110 >> 6) & 14) | ((i3110 >> 15) & 112) | ((i3110 >> 9) & bb.c.b.f30796me) | ((i318 << 3) & bb.c.g.f32954lc), 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                    a(pVar25, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = pVar6;
                        }
                        x1Var2 = x1VarM;
                        pVar14 = pVar8;
                        pVar15 = pVar9;
                        z14 = z13;
                        pVar16 = pVar24;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i21 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i28 == 0) {
                        }
                        if ((i12 & 4096) != 0) {
                            x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                            i30 &= -897;
                        } else {
                            x1VarM = x1Var;
                        }
                        pVar12 = pVar10;
                        if ((i12 & 8192) != 0) {
                            m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i30 &= -7169;
                        } else {
                            m0VarO = m0Var;
                        }
                        if (i31 != 0) {
                            final boolean z110 = z13;
                            final x1 x1Var8 = x1VarM;
                            final int i319 = i13;
                            final int i3110 = i30;
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i3111) {
                                    if ((i3111 & 11) == 2 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(144282315, i3111, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z111 = z10;
                                    boolean z112 = z110;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var9 = x1Var8;
                                    int i3112 = i319;
                                    textFieldDefaults.b(z111, z112, eVar, x1Var9, null, 0.0f, 0.0f, pVar25, 12582912 | ((i3112 >> 6) & 14) | ((i3112 >> 15) & 112) | ((i3112 >> 9) & bb.c.b.f30796me) | ((i3110 << 3) & bb.c.g.f32954lc), 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                    a(pVar25, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = pVar6;
                        }
                        x1Var2 = x1VarM;
                        pVar14 = pVar8;
                        pVar15 = pVar9;
                        z14 = z13;
                        pVar16 = pVar24;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
                    }
                    int i3111 = i13;
                    int i3112 = i3111 << 3;
                    int i3113 = i3111 >> 9;
                    int i3114 = i30 << 21;
                    pVar17 = pVarF;
                    TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i3112 & bb.c.b.f30796me) | (i3112 & 112) | 6 | ((i3111 >> 3) & bb.c.g.f32954lc) | (i3113 & 57344) | (i3113 & 458752) | (3670016 & i3113) | (29360128 & i3114) | (i3114 & 234881024) | (1879048192 & (i3111 << 18)), ((i3111 >> 6) & 14) | ((i3111 >> 15) & 112) | (i3113 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z15 = z14;
                    pVar18 = pVar14;
                    pVar19 = pVar15;
                    pVar20 = pVar12;
                    pVar21 = pVar13;
                    pVar22 = pVar16;
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar23 = pVarB;
                }
                u1VarH = pVar17.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar25, int i320) {
                        this.f11356b.c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, pVar18, pVar19, pVar20, pVar21, pVar22, x1Var3, m0Var3, pVar23, pVar25, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                        a(pVar25, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= bb.c.d.f31193dj;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (pVarF.s(visualTransformation)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i12 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(interactionSource)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                }
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (pVarF.u(z12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(pVar)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(pVar2)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= com.google.android.exoplayer2.j.G;
                } else if ((i10 & 1879048192) == 0) {
                    if (pVarF.s(pVar3)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(pVar4)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                i28 = i12 & 2048;
                if (i28 != 0) {
                    i26 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (pVarF.s(pVar5)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i26 |= i29;
                }
                if ((i11 & bb.c.b.f30796me) != 0) {
                    i26 |= ((i12 & 4096) == 0 || !pVarF.s(x1Var)) ? 128 : 256;
                }
                if ((i11 & bb.c.g.f32954lc) != 0) {
                    i26 |= ((i12 & 8192) == 0 || !pVarF.s(m0Var)) ? 1024 : 2048;
                }
                i30 = i26;
                i31 = i12 & 16384;
                if (i31 != 0) {
                    i30 |= 24576;
                } else if ((i11 & 57344) == 0) {
                    i30 |= pVarF.s(pVar6) ? 16384 : 8192;
                }
                if ((i12 & 32768) != 0) {
                    i30 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i11 & 458752) == 0) {
                    if (pVarF.s(this)) {
                        i32 = 131072;
                    } else {
                        i32 = 65536;
                    }
                    i30 |= i32;
                }
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i21 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i28 == 0) {
                        }
                        if ((i12 & 4096) != 0) {
                            x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                            i30 &= -897;
                        } else {
                            x1VarM = x1Var;
                        }
                        pVar12 = pVar10;
                        if ((i12 & 8192) != 0) {
                            m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i30 &= -7169;
                        } else {
                            m0VarO = m0Var;
                        }
                        if (i31 != 0) {
                            final boolean z111 = z13;
                            final x1 x1Var9 = x1VarM;
                            final int i3115 = i13;
                            final int i3116 = i30;
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i3117) {
                                    if ((i3117 & 11) == 2 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(144282315, i3117, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z112 = z10;
                                    boolean z113 = z111;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var10 = x1Var9;
                                    int i3118 = i3115;
                                    textFieldDefaults.b(z112, z113, eVar, x1Var10, null, 0.0f, 0.0f, pVar25, 12582912 | ((i3118 >> 6) & 14) | ((i3118 >> 15) & 112) | ((i3118 >> 9) & bb.c.b.f30796me) | ((i3116 << 3) & bb.c.g.f32954lc), 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                    a(pVar25, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = pVar6;
                        }
                        x1Var2 = x1VarM;
                        pVar14 = pVar8;
                        pVar15 = pVar9;
                        z14 = z13;
                        pVar16 = pVar24;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i21 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i28 == 0) {
                        }
                        if ((i12 & 4096) != 0) {
                            x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                            i30 &= -897;
                        } else {
                            x1VarM = x1Var;
                        }
                        pVar12 = pVar10;
                        if ((i12 & 8192) != 0) {
                            m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i30 &= -7169;
                        } else {
                            m0VarO = m0Var;
                        }
                        if (i31 != 0) {
                            final boolean z112 = z13;
                            final x1 x1Var10 = x1VarM;
                            final int i3117 = i13;
                            final int i3118 = i30;
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i3119) {
                                    if ((i3119 & 11) == 2 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(144282315, i3119, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z113 = z10;
                                    boolean z114 = z112;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var11 = x1Var10;
                                    int i31110 = i3117;
                                    textFieldDefaults.b(z113, z114, eVar, x1Var11, null, 0.0f, 0.0f, pVar25, 12582912 | ((i31110 >> 6) & 14) | ((i31110 >> 15) & 112) | ((i31110 >> 9) & bb.c.b.f30796me) | ((i3118 << 3) & bb.c.g.f32954lc), 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                    a(pVar25, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = pVar6;
                        }
                        x1Var2 = x1VarM;
                        pVar14 = pVar8;
                        pVar15 = pVar9;
                        z14 = z13;
                        pVar16 = pVar24;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
                    }
                    int i3119 = i13;
                    int i31110 = i3119 << 3;
                    int i31111 = i3119 >> 9;
                    int i31112 = i30 << 21;
                    pVar17 = pVarF;
                    TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i31110 & bb.c.b.f30796me) | (i31110 & 112) | 6 | ((i3119 >> 3) & bb.c.g.f32954lc) | (i31111 & 57344) | (i31111 & 458752) | (3670016 & i31111) | (29360128 & i31112) | (i31112 & 234881024) | (1879048192 & (i3119 << 18)), ((i3119 >> 6) & 14) | ((i3119 >> 15) & 112) | (i31111 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z15 = z14;
                    pVar18 = pVar14;
                    pVar19 = pVar15;
                    pVar20 = pVar12;
                    pVar21 = pVar13;
                    pVar22 = pVar16;
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar23 = pVarB;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i21 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i28 == 0) {
                        }
                        if ((i12 & 4096) != 0) {
                            x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                            i30 &= -897;
                        } else {
                            x1VarM = x1Var;
                        }
                        pVar12 = pVar10;
                        if ((i12 & 8192) != 0) {
                            m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i30 &= -7169;
                        } else {
                            m0VarO = m0Var;
                        }
                        if (i31 != 0) {
                            final boolean z113 = z13;
                            final x1 x1Var11 = x1VarM;
                            final int i31113 = i13;
                            final int i31114 = i30;
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i31115) {
                                    if ((i31115 & 11) == 2 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(144282315, i31115, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z114 = z10;
                                    boolean z115 = z113;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var12 = x1Var11;
                                    int i31116 = i31113;
                                    textFieldDefaults.b(z114, z115, eVar, x1Var12, null, 0.0f, 0.0f, pVar25, 12582912 | ((i31116 >> 6) & 14) | ((i31116 >> 15) & 112) | ((i31116 >> 9) & bb.c.b.f30796me) | ((i31114 << 3) & bb.c.g.f32954lc), 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                    a(pVar25, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = pVar6;
                        }
                        x1Var2 = x1VarM;
                        pVar14 = pVar8;
                        pVar15 = pVar9;
                        z14 = z13;
                        pVar16 = pVar24;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i21 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i28 == 0) {
                        }
                        if ((i12 & 4096) != 0) {
                            x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                            i30 &= -897;
                        } else {
                            x1VarM = x1Var;
                        }
                        pVar12 = pVar10;
                        if ((i12 & 8192) != 0) {
                            m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i30 &= -7169;
                        } else {
                            m0VarO = m0Var;
                        }
                        if (i31 != 0) {
                            final boolean z114 = z13;
                            final x1 x1Var12 = x1VarM;
                            final int i31115 = i13;
                            final int i31116 = i30;
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i31117) {
                                    if ((i31117 & 11) == 2 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(144282315, i31117, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z115 = z10;
                                    boolean z116 = z114;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var13 = x1Var12;
                                    int i31118 = i31115;
                                    textFieldDefaults.b(z115, z116, eVar, x1Var13, null, 0.0f, 0.0f, pVar25, 12582912 | ((i31118 >> 6) & 14) | ((i31118 >> 15) & 112) | ((i31118 >> 9) & bb.c.b.f30796me) | ((i31116 << 3) & bb.c.g.f32954lc), 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                    a(pVar25, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = pVar6;
                        }
                        x1Var2 = x1VarM;
                        pVar14 = pVar8;
                        pVar15 = pVar9;
                        z14 = z13;
                        pVar16 = pVar24;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
                    }
                    int i31117 = i13;
                    int i31118 = i31117 << 3;
                    int i31119 = i31117 >> 9;
                    int i311110 = i30 << 21;
                    pVar17 = pVarF;
                    TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i31118 & bb.c.b.f30796me) | (i31118 & 112) | 6 | ((i31117 >> 3) & bb.c.g.f32954lc) | (i31119 & 57344) | (i31119 & 458752) | (3670016 & i31119) | (29360128 & i311110) | (i311110 & 234881024) | (1879048192 & (i31117 << 18)), ((i31117 >> 6) & 14) | ((i31117 >> 15) & 112) | (i31119 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z15 = z14;
                    pVar18 = pVar14;
                    pVar19 = pVar15;
                    pVar20 = pVar12;
                    pVar21 = pVar13;
                    pVar22 = pVar16;
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar23 = pVarB;
                }
                u1VarH = pVar17.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar25, int i320) {
                        this.f11356b.c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, pVar18, pVar19, pVar20, pVar21, pVar22, x1Var3, m0Var3, pVar23, pVar25, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                        a(pVar25, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i16 = androidx.profileinstaller.o.c.f26824k;
            i13 |= i16;
            i17 = i12 & 64;
            if (i17 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (pVarF.u(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(pVar)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(pVar2)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= com.google.android.exoplayer2.j.G;
            } else if ((i10 & 1879048192) == 0) {
                if (pVarF.s(pVar3)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (pVarF.s(pVar4)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            i28 = i12 & 2048;
            if (i28 != 0) {
                i26 |= 48;
            } else if ((i11 & 112) == 0) {
                if (pVarF.s(pVar5)) {
                    i29 = 32;
                } else {
                    i29 = 16;
                }
                i26 |= i29;
            }
            if ((i11 & bb.c.b.f30796me) != 0) {
                i26 |= ((i12 & 4096) == 0 || !pVarF.s(x1Var)) ? 128 : 256;
            }
            if ((i11 & bb.c.g.f32954lc) != 0) {
                i26 |= ((i12 & 8192) == 0 || !pVarF.s(m0Var)) ? 1024 : 2048;
            }
            i30 = i26;
            i31 = i12 & 16384;
            if (i31 != 0) {
                i30 |= 24576;
            } else if ((i11 & 57344) == 0) {
                i30 |= pVarF.s(pVar6) ? 16384 : 8192;
            }
            if ((i12 & 32768) != 0) {
                i30 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i11 & 458752) == 0) {
                if (pVarF.s(this)) {
                    i32 = 131072;
                } else {
                    i32 = 65536;
                }
                i30 |= i32;
            }
            if ((i13 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i21 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i28 == 0) {
                    }
                    if ((i12 & 4096) != 0) {
                        x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                        i30 &= -897;
                    } else {
                        x1VarM = x1Var;
                    }
                    pVar12 = pVar10;
                    if ((i12 & 8192) != 0) {
                        m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i30 &= -7169;
                    } else {
                        m0VarO = m0Var;
                    }
                    if (i31 != 0) {
                        final boolean z115 = z13;
                        final x1 x1Var13 = x1VarM;
                        final int i311111 = i13;
                        final int i311112 = i30;
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar25, int i311113) {
                                if ((i311113 & 11) == 2 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(144282315, i311113, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z116 = z10;
                                boolean z117 = z115;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var14 = x1Var13;
                                int i311114 = i311111;
                                textFieldDefaults.b(z116, z117, eVar, x1Var14, null, 0.0f, 0.0f, pVar25, 12582912 | ((i311114 >> 6) & 14) | ((i311114 >> 15) & 112) | ((i311114 >> 9) & bb.c.b.f30796me) | ((i311112 << 3) & bb.c.g.f32954lc), 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                a(pVar25, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = pVar6;
                    }
                    x1Var2 = x1VarM;
                    pVar14 = pVar8;
                    pVar15 = pVar9;
                    z14 = z13;
                    pVar16 = pVar24;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i21 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i28 == 0) {
                    }
                    if ((i12 & 4096) != 0) {
                        x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                        i30 &= -897;
                    } else {
                        x1VarM = x1Var;
                    }
                    pVar12 = pVar10;
                    if ((i12 & 8192) != 0) {
                        m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i30 &= -7169;
                    } else {
                        m0VarO = m0Var;
                    }
                    if (i31 != 0) {
                        final boolean z116 = z13;
                        final x1 x1Var14 = x1VarM;
                        final int i311113 = i13;
                        final int i311114 = i30;
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar25, int i311115) {
                                if ((i311115 & 11) == 2 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(144282315, i311115, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z117 = z10;
                                boolean z118 = z116;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var15 = x1Var14;
                                int i311116 = i311113;
                                textFieldDefaults.b(z117, z118, eVar, x1Var15, null, 0.0f, 0.0f, pVar25, 12582912 | ((i311116 >> 6) & 14) | ((i311116 >> 15) & 112) | ((i311116 >> 9) & bb.c.b.f30796me) | ((i311114 << 3) & bb.c.g.f32954lc), 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                a(pVar25, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = pVar6;
                    }
                    x1Var2 = x1VarM;
                    pVar14 = pVar8;
                    pVar15 = pVar9;
                    z14 = z13;
                    pVar16 = pVar24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
                }
                int i311115 = i13;
                int i311116 = i311115 << 3;
                int i311117 = i311115 >> 9;
                int i311118 = i30 << 21;
                pVar17 = pVarF;
                TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i311116 & bb.c.b.f30796me) | (i311116 & 112) | 6 | ((i311115 >> 3) & bb.c.g.f32954lc) | (i311117 & 57344) | (i311117 & 458752) | (3670016 & i311117) | (29360128 & i311118) | (i311118 & 234881024) | (1879048192 & (i311115 << 18)), ((i311115 >> 6) & 14) | ((i311115 >> 15) & 112) | (i311117 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z15 = z14;
                pVar18 = pVar14;
                pVar19 = pVar15;
                pVar20 = pVar12;
                pVar21 = pVar13;
                pVar22 = pVar16;
                x1Var3 = x1Var2;
                m0Var3 = m0Var2;
                pVar23 = pVarB;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i21 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i28 == 0) {
                    }
                    if ((i12 & 4096) != 0) {
                        x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                        i30 &= -897;
                    } else {
                        x1VarM = x1Var;
                    }
                    pVar12 = pVar10;
                    if ((i12 & 8192) != 0) {
                        m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i30 &= -7169;
                    } else {
                        m0VarO = m0Var;
                    }
                    if (i31 != 0) {
                        final boolean z117 = z13;
                        final x1 x1Var15 = x1VarM;
                        final int i311119 = i13;
                        final int i3111110 = i30;
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar25, int i3111111) {
                                if ((i3111111 & 11) == 2 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(144282315, i3111111, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z118 = z10;
                                boolean z119 = z117;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var16 = x1Var15;
                                int i3111112 = i311119;
                                textFieldDefaults.b(z118, z119, eVar, x1Var16, null, 0.0f, 0.0f, pVar25, 12582912 | ((i3111112 >> 6) & 14) | ((i3111112 >> 15) & 112) | ((i3111112 >> 9) & bb.c.b.f30796me) | ((i3111110 << 3) & bb.c.g.f32954lc), 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                a(pVar25, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = pVar6;
                    }
                    x1Var2 = x1VarM;
                    pVar14 = pVar8;
                    pVar15 = pVar9;
                    z14 = z13;
                    pVar16 = pVar24;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i21 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i28 == 0) {
                    }
                    if ((i12 & 4096) != 0) {
                        x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                        i30 &= -897;
                    } else {
                        x1VarM = x1Var;
                    }
                    pVar12 = pVar10;
                    if ((i12 & 8192) != 0) {
                        m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i30 &= -7169;
                    } else {
                        m0VarO = m0Var;
                    }
                    if (i31 != 0) {
                        final boolean z118 = z13;
                        final x1 x1Var16 = x1VarM;
                        final int i3111111 = i13;
                        final int i3111112 = i30;
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar25, int i3111113) {
                                if ((i3111113 & 11) == 2 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(144282315, i3111113, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z119 = z10;
                                boolean z1110 = z118;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var17 = x1Var16;
                                int i3111114 = i3111111;
                                textFieldDefaults.b(z119, z1110, eVar, x1Var17, null, 0.0f, 0.0f, pVar25, 12582912 | ((i3111114 >> 6) & 14) | ((i3111114 >> 15) & 112) | ((i3111114 >> 9) & bb.c.b.f30796me) | ((i3111112 << 3) & bb.c.g.f32954lc), 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                a(pVar25, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = pVar6;
                    }
                    x1Var2 = x1VarM;
                    pVar14 = pVar8;
                    pVar15 = pVar9;
                    z14 = z13;
                    pVar16 = pVar24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
                }
                int i3111113 = i13;
                int i3111114 = i3111113 << 3;
                int i3111115 = i3111113 >> 9;
                int i3111116 = i30 << 21;
                pVar17 = pVarF;
                TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i3111114 & bb.c.b.f30796me) | (i3111114 & 112) | 6 | ((i3111113 >> 3) & bb.c.g.f32954lc) | (i3111115 & 57344) | (i3111115 & 458752) | (3670016 & i3111115) | (29360128 & i3111116) | (i3111116 & 234881024) | (1879048192 & (i3111113 << 18)), ((i3111113 >> 6) & 14) | ((i3111113 >> 15) & 112) | (i3111115 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z15 = z14;
                pVar18 = pVar14;
                pVar19 = pVar15;
                pVar20 = pVar12;
                pVar21 = pVar13;
                pVar22 = pVar16;
                x1Var3 = x1Var2;
                m0Var3 = m0Var2;
                pVar23 = pVarB;
            }
            u1VarH = pVar17.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i320) {
                    this.f11356b.c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, pVar18, pVar19, pVar20, pVar21, pVar22, x1Var3, m0Var3, pVar23, pVar25, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                    a(pVar25, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= bb.c.b.f30966u4;
        if ((i12 & 8) != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if (pVarF.u(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (pVarF.s(visualTransformation)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i12 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(interactionSource)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                }
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (pVarF.u(z12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(pVar)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(pVar2)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= com.google.android.exoplayer2.j.G;
                } else if ((i10 & 1879048192) == 0) {
                    if (pVarF.s(pVar3)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(pVar4)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                i28 = i12 & 2048;
                if (i28 != 0) {
                    i26 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (pVarF.s(pVar5)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i26 |= i29;
                }
                if ((i11 & bb.c.b.f30796me) != 0) {
                    i26 |= ((i12 & 4096) == 0 || !pVarF.s(x1Var)) ? 128 : 256;
                }
                if ((i11 & bb.c.g.f32954lc) != 0) {
                    i26 |= ((i12 & 8192) == 0 || !pVarF.s(m0Var)) ? 1024 : 2048;
                }
                i30 = i26;
                i31 = i12 & 16384;
                if (i31 != 0) {
                    i30 |= 24576;
                } else if ((i11 & 57344) == 0) {
                    i30 |= pVarF.s(pVar6) ? 16384 : 8192;
                }
                if ((i12 & 32768) != 0) {
                    i30 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i11 & 458752) == 0) {
                    if (pVarF.s(this)) {
                        i32 = 131072;
                    } else {
                        i32 = 65536;
                    }
                    i30 |= i32;
                }
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i21 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i28 == 0) {
                        }
                        if ((i12 & 4096) != 0) {
                            x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                            i30 &= -897;
                        } else {
                            x1VarM = x1Var;
                        }
                        pVar12 = pVar10;
                        if ((i12 & 8192) != 0) {
                            m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i30 &= -7169;
                        } else {
                            m0VarO = m0Var;
                        }
                        if (i31 != 0) {
                            final boolean z119 = z13;
                            final x1 x1Var17 = x1VarM;
                            final int i3111117 = i13;
                            final int i3111118 = i30;
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i3111119) {
                                    if ((i3111119 & 11) == 2 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(144282315, i3111119, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1110 = z10;
                                    boolean z1111 = z119;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var18 = x1Var17;
                                    int i31111110 = i3111117;
                                    textFieldDefaults.b(z1110, z1111, eVar, x1Var18, null, 0.0f, 0.0f, pVar25, 12582912 | ((i31111110 >> 6) & 14) | ((i31111110 >> 15) & 112) | ((i31111110 >> 9) & bb.c.b.f30796me) | ((i3111118 << 3) & bb.c.g.f32954lc), 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                    a(pVar25, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = pVar6;
                        }
                        x1Var2 = x1VarM;
                        pVar14 = pVar8;
                        pVar15 = pVar9;
                        z14 = z13;
                        pVar16 = pVar24;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i21 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i28 == 0) {
                        }
                        if ((i12 & 4096) != 0) {
                            x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                            i30 &= -897;
                        } else {
                            x1VarM = x1Var;
                        }
                        pVar12 = pVar10;
                        if ((i12 & 8192) != 0) {
                            m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i30 &= -7169;
                        } else {
                            m0VarO = m0Var;
                        }
                        if (i31 != 0) {
                            final boolean z1110 = z13;
                            final x1 x1Var18 = x1VarM;
                            final int i3111119 = i13;
                            final int i31111110 = i30;
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i31111111) {
                                    if ((i31111111 & 11) == 2 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(144282315, i31111111, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1111 = z10;
                                    boolean z1112 = z1110;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var19 = x1Var18;
                                    int i31111112 = i3111119;
                                    textFieldDefaults.b(z1111, z1112, eVar, x1Var19, null, 0.0f, 0.0f, pVar25, 12582912 | ((i31111112 >> 6) & 14) | ((i31111112 >> 15) & 112) | ((i31111112 >> 9) & bb.c.b.f30796me) | ((i31111110 << 3) & bb.c.g.f32954lc), 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                    a(pVar25, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = pVar6;
                        }
                        x1Var2 = x1VarM;
                        pVar14 = pVar8;
                        pVar15 = pVar9;
                        z14 = z13;
                        pVar16 = pVar24;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
                    }
                    int i31111111 = i13;
                    int i31111112 = i31111111 << 3;
                    int i31111113 = i31111111 >> 9;
                    int i31111114 = i30 << 21;
                    pVar17 = pVarF;
                    TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i31111112 & bb.c.b.f30796me) | (i31111112 & 112) | 6 | ((i31111111 >> 3) & bb.c.g.f32954lc) | (i31111113 & 57344) | (i31111113 & 458752) | (3670016 & i31111113) | (29360128 & i31111114) | (i31111114 & 234881024) | (1879048192 & (i31111111 << 18)), ((i31111111 >> 6) & 14) | ((i31111111 >> 15) & 112) | (i31111113 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z15 = z14;
                    pVar18 = pVar14;
                    pVar19 = pVar15;
                    pVar20 = pVar12;
                    pVar21 = pVar13;
                    pVar22 = pVar16;
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar23 = pVarB;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i21 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i28 == 0) {
                        }
                        if ((i12 & 4096) != 0) {
                            x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                            i30 &= -897;
                        } else {
                            x1VarM = x1Var;
                        }
                        pVar12 = pVar10;
                        if ((i12 & 8192) != 0) {
                            m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i30 &= -7169;
                        } else {
                            m0VarO = m0Var;
                        }
                        if (i31 != 0) {
                            final boolean z1111 = z13;
                            final x1 x1Var19 = x1VarM;
                            final int i31111115 = i13;
                            final int i31111116 = i30;
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i31111117) {
                                    if ((i31111117 & 11) == 2 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(144282315, i31111117, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1112 = z10;
                                    boolean z1113 = z1111;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var110 = x1Var19;
                                    int i31111118 = i31111115;
                                    textFieldDefaults.b(z1112, z1113, eVar, x1Var110, null, 0.0f, 0.0f, pVar25, 12582912 | ((i31111118 >> 6) & 14) | ((i31111118 >> 15) & 112) | ((i31111118 >> 9) & bb.c.b.f30796me) | ((i31111116 << 3) & bb.c.g.f32954lc), 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                    a(pVar25, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = pVar6;
                        }
                        x1Var2 = x1VarM;
                        pVar14 = pVar8;
                        pVar15 = pVar9;
                        z14 = z13;
                        pVar16 = pVar24;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i21 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i28 == 0) {
                        }
                        if ((i12 & 4096) != 0) {
                            x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                            i30 &= -897;
                        } else {
                            x1VarM = x1Var;
                        }
                        pVar12 = pVar10;
                        if ((i12 & 8192) != 0) {
                            m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i30 &= -7169;
                        } else {
                            m0VarO = m0Var;
                        }
                        if (i31 != 0) {
                            final boolean z1112 = z13;
                            final x1 x1Var110 = x1VarM;
                            final int i31111117 = i13;
                            final int i31111118 = i30;
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i31111119) {
                                    if ((i31111119 & 11) == 2 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(144282315, i31111119, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1113 = z10;
                                    boolean z1114 = z1112;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var111 = x1Var110;
                                    int i311111110 = i31111117;
                                    textFieldDefaults.b(z1113, z1114, eVar, x1Var111, null, 0.0f, 0.0f, pVar25, 12582912 | ((i311111110 >> 6) & 14) | ((i311111110 >> 15) & 112) | ((i311111110 >> 9) & bb.c.b.f30796me) | ((i31111118 << 3) & bb.c.g.f32954lc), 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                    a(pVar25, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            m0Var2 = m0VarO;
                            pVar13 = pVar11;
                            pVarB = pVar6;
                        }
                        x1Var2 = x1VarM;
                        pVar14 = pVar8;
                        pVar15 = pVar9;
                        z14 = z13;
                        pVar16 = pVar24;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
                    }
                    int i31111119 = i13;
                    int i311111110 = i31111119 << 3;
                    int i311111111 = i31111119 >> 9;
                    int i311111112 = i30 << 21;
                    pVar17 = pVarF;
                    TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i311111110 & bb.c.b.f30796me) | (i311111110 & 112) | 6 | ((i31111119 >> 3) & bb.c.g.f32954lc) | (i311111111 & 57344) | (i311111111 & 458752) | (3670016 & i311111111) | (29360128 & i311111112) | (i311111112 & 234881024) | (1879048192 & (i31111119 << 18)), ((i31111119 >> 6) & 14) | ((i31111119 >> 15) & 112) | (i311111111 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z15 = z14;
                    pVar18 = pVar14;
                    pVar19 = pVar15;
                    pVar20 = pVar12;
                    pVar21 = pVar13;
                    pVar22 = pVar16;
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar23 = pVarB;
                }
                u1VarH = pVar17.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar25, int i320) {
                        this.f11356b.c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, pVar18, pVar19, pVar20, pVar21, pVar22, x1Var3, m0Var3, pVar23, pVar25, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                        a(pVar25, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i16 = androidx.profileinstaller.o.c.f26824k;
            i13 |= i16;
            i17 = i12 & 64;
            if (i17 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (pVarF.u(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(pVar)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(pVar2)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= com.google.android.exoplayer2.j.G;
            } else if ((i10 & 1879048192) == 0) {
                if (pVarF.s(pVar3)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (pVarF.s(pVar4)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            i28 = i12 & 2048;
            if (i28 != 0) {
                i26 |= 48;
            } else if ((i11 & 112) == 0) {
                if (pVarF.s(pVar5)) {
                    i29 = 32;
                } else {
                    i29 = 16;
                }
                i26 |= i29;
            }
            if ((i11 & bb.c.b.f30796me) != 0) {
                i26 |= ((i12 & 4096) == 0 || !pVarF.s(x1Var)) ? 128 : 256;
            }
            if ((i11 & bb.c.g.f32954lc) != 0) {
                i26 |= ((i12 & 8192) == 0 || !pVarF.s(m0Var)) ? 1024 : 2048;
            }
            i30 = i26;
            i31 = i12 & 16384;
            if (i31 != 0) {
                i30 |= 24576;
            } else if ((i11 & 57344) == 0) {
                i30 |= pVarF.s(pVar6) ? 16384 : 8192;
            }
            if ((i12 & 32768) != 0) {
                i30 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i11 & 458752) == 0) {
                if (pVarF.s(this)) {
                    i32 = 131072;
                } else {
                    i32 = 65536;
                }
                i30 |= i32;
            }
            if ((i13 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i21 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i28 == 0) {
                    }
                    if ((i12 & 4096) != 0) {
                        x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                        i30 &= -897;
                    } else {
                        x1VarM = x1Var;
                    }
                    pVar12 = pVar10;
                    if ((i12 & 8192) != 0) {
                        m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i30 &= -7169;
                    } else {
                        m0VarO = m0Var;
                    }
                    if (i31 != 0) {
                        final boolean z1113 = z13;
                        final x1 x1Var111 = x1VarM;
                        final int i311111113 = i13;
                        final int i311111114 = i30;
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar25, int i311111115) {
                                if ((i311111115 & 11) == 2 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(144282315, i311111115, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z1114 = z10;
                                boolean z1115 = z1113;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var112 = x1Var111;
                                int i311111116 = i311111113;
                                textFieldDefaults.b(z1114, z1115, eVar, x1Var112, null, 0.0f, 0.0f, pVar25, 12582912 | ((i311111116 >> 6) & 14) | ((i311111116 >> 15) & 112) | ((i311111116 >> 9) & bb.c.b.f30796me) | ((i311111114 << 3) & bb.c.g.f32954lc), 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                a(pVar25, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = pVar6;
                    }
                    x1Var2 = x1VarM;
                    pVar14 = pVar8;
                    pVar15 = pVar9;
                    z14 = z13;
                    pVar16 = pVar24;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i21 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i28 == 0) {
                    }
                    if ((i12 & 4096) != 0) {
                        x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                        i30 &= -897;
                    } else {
                        x1VarM = x1Var;
                    }
                    pVar12 = pVar10;
                    if ((i12 & 8192) != 0) {
                        m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i30 &= -7169;
                    } else {
                        m0VarO = m0Var;
                    }
                    if (i31 != 0) {
                        final boolean z1114 = z13;
                        final x1 x1Var112 = x1VarM;
                        final int i311111115 = i13;
                        final int i311111116 = i30;
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar25, int i311111117) {
                                if ((i311111117 & 11) == 2 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(144282315, i311111117, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z1115 = z10;
                                boolean z1116 = z1114;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var113 = x1Var112;
                                int i311111118 = i311111115;
                                textFieldDefaults.b(z1115, z1116, eVar, x1Var113, null, 0.0f, 0.0f, pVar25, 12582912 | ((i311111118 >> 6) & 14) | ((i311111118 >> 15) & 112) | ((i311111118 >> 9) & bb.c.b.f30796me) | ((i311111116 << 3) & bb.c.g.f32954lc), 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                a(pVar25, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = pVar6;
                    }
                    x1Var2 = x1VarM;
                    pVar14 = pVar8;
                    pVar15 = pVar9;
                    z14 = z13;
                    pVar16 = pVar24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
                }
                int i311111117 = i13;
                int i311111118 = i311111117 << 3;
                int i311111119 = i311111117 >> 9;
                int i3111111110 = i30 << 21;
                pVar17 = pVarF;
                TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i311111118 & bb.c.b.f30796me) | (i311111118 & 112) | 6 | ((i311111117 >> 3) & bb.c.g.f32954lc) | (i311111119 & 57344) | (i311111119 & 458752) | (3670016 & i311111119) | (29360128 & i3111111110) | (i3111111110 & 234881024) | (1879048192 & (i311111117 << 18)), ((i311111117 >> 6) & 14) | ((i311111117 >> 15) & 112) | (i311111119 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z15 = z14;
                pVar18 = pVar14;
                pVar19 = pVar15;
                pVar20 = pVar12;
                pVar21 = pVar13;
                pVar22 = pVar16;
                x1Var3 = x1Var2;
                m0Var3 = m0Var2;
                pVar23 = pVarB;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i21 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i28 == 0) {
                    }
                    if ((i12 & 4096) != 0) {
                        x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                        i30 &= -897;
                    } else {
                        x1VarM = x1Var;
                    }
                    pVar12 = pVar10;
                    if ((i12 & 8192) != 0) {
                        m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i30 &= -7169;
                    } else {
                        m0VarO = m0Var;
                    }
                    if (i31 != 0) {
                        final boolean z1115 = z13;
                        final x1 x1Var113 = x1VarM;
                        final int i3111111111 = i13;
                        final int i3111111112 = i30;
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar25, int i3111111113) {
                                if ((i3111111113 & 11) == 2 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(144282315, i3111111113, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z1116 = z10;
                                boolean z1117 = z1115;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var114 = x1Var113;
                                int i3111111114 = i3111111111;
                                textFieldDefaults.b(z1116, z1117, eVar, x1Var114, null, 0.0f, 0.0f, pVar25, 12582912 | ((i3111111114 >> 6) & 14) | ((i3111111114 >> 15) & 112) | ((i3111111114 >> 9) & bb.c.b.f30796me) | ((i3111111112 << 3) & bb.c.g.f32954lc), 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                a(pVar25, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = pVar6;
                    }
                    x1Var2 = x1VarM;
                    pVar14 = pVar8;
                    pVar15 = pVar9;
                    z14 = z13;
                    pVar16 = pVar24;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i21 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i28 == 0) {
                    }
                    if ((i12 & 4096) != 0) {
                        x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                        i30 &= -897;
                    } else {
                        x1VarM = x1Var;
                    }
                    pVar12 = pVar10;
                    if ((i12 & 8192) != 0) {
                        m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i30 &= -7169;
                    } else {
                        m0VarO = m0Var;
                    }
                    if (i31 != 0) {
                        final boolean z1116 = z13;
                        final x1 x1Var114 = x1VarM;
                        final int i3111111113 = i13;
                        final int i3111111114 = i30;
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar25, int i3111111115) {
                                if ((i3111111115 & 11) == 2 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(144282315, i3111111115, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z1117 = z10;
                                boolean z1118 = z1116;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var115 = x1Var114;
                                int i3111111116 = i3111111113;
                                textFieldDefaults.b(z1117, z1118, eVar, x1Var115, null, 0.0f, 0.0f, pVar25, 12582912 | ((i3111111116 >> 6) & 14) | ((i3111111116 >> 15) & 112) | ((i3111111116 >> 9) & bb.c.b.f30796me) | ((i3111111114 << 3) & bb.c.g.f32954lc), 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                a(pVar25, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = pVar6;
                    }
                    x1Var2 = x1VarM;
                    pVar14 = pVar8;
                    pVar15 = pVar9;
                    z14 = z13;
                    pVar16 = pVar24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
                }
                int i3111111115 = i13;
                int i3111111116 = i3111111115 << 3;
                int i3111111117 = i3111111115 >> 9;
                int i3111111118 = i30 << 21;
                pVar17 = pVarF;
                TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i3111111116 & bb.c.b.f30796me) | (i3111111116 & 112) | 6 | ((i3111111115 >> 3) & bb.c.g.f32954lc) | (i3111111117 & 57344) | (i3111111117 & 458752) | (3670016 & i3111111117) | (29360128 & i3111111118) | (i3111111118 & 234881024) | (1879048192 & (i3111111115 << 18)), ((i3111111115 >> 6) & 14) | ((i3111111115 >> 15) & 112) | (i3111111117 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z15 = z14;
                pVar18 = pVar14;
                pVar19 = pVar15;
                pVar20 = pVar12;
                pVar21 = pVar13;
                pVar22 = pVar16;
                x1Var3 = x1Var2;
                m0Var3 = m0Var2;
                pVar23 = pVarB;
            }
            u1VarH = pVar17.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i320) {
                    this.f11356b.c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, pVar18, pVar19, pVar20, pVar21, pVar22, x1Var3, m0Var3, pVar23, pVar25, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                    a(pVar25, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= bb.c.d.f31193dj;
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (pVarF.s(visualTransformation)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i13 |= i15;
        }
        if ((i12 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (pVarF.s(interactionSource)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
            }
            i17 = i12 & 64;
            if (i17 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (pVarF.u(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(pVar)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(pVar2)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= com.google.android.exoplayer2.j.G;
            } else if ((i10 & 1879048192) == 0) {
                if (pVarF.s(pVar3)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (pVarF.s(pVar4)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            i28 = i12 & 2048;
            if (i28 != 0) {
                i26 |= 48;
            } else if ((i11 & 112) == 0) {
                if (pVarF.s(pVar5)) {
                    i29 = 32;
                } else {
                    i29 = 16;
                }
                i26 |= i29;
            }
            if ((i11 & bb.c.b.f30796me) != 0) {
                i26 |= ((i12 & 4096) == 0 || !pVarF.s(x1Var)) ? 128 : 256;
            }
            if ((i11 & bb.c.g.f32954lc) != 0) {
                i26 |= ((i12 & 8192) == 0 || !pVarF.s(m0Var)) ? 1024 : 2048;
            }
            i30 = i26;
            i31 = i12 & 16384;
            if (i31 != 0) {
                i30 |= 24576;
            } else if ((i11 & 57344) == 0) {
                i30 |= pVarF.s(pVar6) ? 16384 : 8192;
            }
            if ((i12 & 32768) != 0) {
                i30 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i11 & 458752) == 0) {
                if (pVarF.s(this)) {
                    i32 = 131072;
                } else {
                    i32 = 65536;
                }
                i30 |= i32;
            }
            if ((i13 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i21 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i28 == 0) {
                    }
                    if ((i12 & 4096) != 0) {
                        x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                        i30 &= -897;
                    } else {
                        x1VarM = x1Var;
                    }
                    pVar12 = pVar10;
                    if ((i12 & 8192) != 0) {
                        m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i30 &= -7169;
                    } else {
                        m0VarO = m0Var;
                    }
                    if (i31 != 0) {
                        final boolean z1117 = z13;
                        final x1 x1Var115 = x1VarM;
                        final int i3111111119 = i13;
                        final int i31111111110 = i30;
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar25, int i31111111111) {
                                if ((i31111111111 & 11) == 2 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(144282315, i31111111111, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z1118 = z10;
                                boolean z1119 = z1117;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var116 = x1Var115;
                                int i31111111112 = i3111111119;
                                textFieldDefaults.b(z1118, z1119, eVar, x1Var116, null, 0.0f, 0.0f, pVar25, 12582912 | ((i31111111112 >> 6) & 14) | ((i31111111112 >> 15) & 112) | ((i31111111112 >> 9) & bb.c.b.f30796me) | ((i31111111110 << 3) & bb.c.g.f32954lc), 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                a(pVar25, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = pVar6;
                    }
                    x1Var2 = x1VarM;
                    pVar14 = pVar8;
                    pVar15 = pVar9;
                    z14 = z13;
                    pVar16 = pVar24;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i21 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i28 == 0) {
                    }
                    if ((i12 & 4096) != 0) {
                        x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                        i30 &= -897;
                    } else {
                        x1VarM = x1Var;
                    }
                    pVar12 = pVar10;
                    if ((i12 & 8192) != 0) {
                        m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i30 &= -7169;
                    } else {
                        m0VarO = m0Var;
                    }
                    if (i31 != 0) {
                        final boolean z1118 = z13;
                        final x1 x1Var116 = x1VarM;
                        final int i31111111111 = i13;
                        final int i31111111112 = i30;
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar25, int i31111111113) {
                                if ((i31111111113 & 11) == 2 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(144282315, i31111111113, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z1119 = z10;
                                boolean z11110 = z1118;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var117 = x1Var116;
                                int i31111111114 = i31111111111;
                                textFieldDefaults.b(z1119, z11110, eVar, x1Var117, null, 0.0f, 0.0f, pVar25, 12582912 | ((i31111111114 >> 6) & 14) | ((i31111111114 >> 15) & 112) | ((i31111111114 >> 9) & bb.c.b.f30796me) | ((i31111111112 << 3) & bb.c.g.f32954lc), 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                a(pVar25, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = pVar6;
                    }
                    x1Var2 = x1VarM;
                    pVar14 = pVar8;
                    pVar15 = pVar9;
                    z14 = z13;
                    pVar16 = pVar24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
                }
                int i31111111113 = i13;
                int i31111111114 = i31111111113 << 3;
                int i31111111115 = i31111111113 >> 9;
                int i31111111116 = i30 << 21;
                pVar17 = pVarF;
                TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i31111111114 & bb.c.b.f30796me) | (i31111111114 & 112) | 6 | ((i31111111113 >> 3) & bb.c.g.f32954lc) | (i31111111115 & 57344) | (i31111111115 & 458752) | (3670016 & i31111111115) | (29360128 & i31111111116) | (i31111111116 & 234881024) | (1879048192 & (i31111111113 << 18)), ((i31111111113 >> 6) & 14) | ((i31111111113 >> 15) & 112) | (i31111111115 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z15 = z14;
                pVar18 = pVar14;
                pVar19 = pVar15;
                pVar20 = pVar12;
                pVar21 = pVar13;
                pVar22 = pVar16;
                x1Var3 = x1Var2;
                m0Var3 = m0Var2;
                pVar23 = pVarB;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i21 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i28 == 0) {
                    }
                    if ((i12 & 4096) != 0) {
                        x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                        i30 &= -897;
                    } else {
                        x1VarM = x1Var;
                    }
                    pVar12 = pVar10;
                    if ((i12 & 8192) != 0) {
                        m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i30 &= -7169;
                    } else {
                        m0VarO = m0Var;
                    }
                    if (i31 != 0) {
                        final boolean z1119 = z13;
                        final x1 x1Var117 = x1VarM;
                        final int i31111111117 = i13;
                        final int i31111111118 = i30;
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar25, int i31111111119) {
                                if ((i31111111119 & 11) == 2 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(144282315, i31111111119, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z11110 = z10;
                                boolean z11111 = z1119;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var118 = x1Var117;
                                int i311111111110 = i31111111117;
                                textFieldDefaults.b(z11110, z11111, eVar, x1Var118, null, 0.0f, 0.0f, pVar25, 12582912 | ((i311111111110 >> 6) & 14) | ((i311111111110 >> 15) & 112) | ((i311111111110 >> 9) & bb.c.b.f30796me) | ((i31111111118 << 3) & bb.c.g.f32954lc), 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                a(pVar25, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = pVar6;
                    }
                    x1Var2 = x1VarM;
                    pVar14 = pVar8;
                    pVar15 = pVar9;
                    z14 = z13;
                    pVar16 = pVar24;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i21 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i28 == 0) {
                    }
                    if ((i12 & 4096) != 0) {
                        x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                        i30 &= -897;
                    } else {
                        x1VarM = x1Var;
                    }
                    pVar12 = pVar10;
                    if ((i12 & 8192) != 0) {
                        m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i30 &= -7169;
                    } else {
                        m0VarO = m0Var;
                    }
                    if (i31 != 0) {
                        final boolean z11110 = z13;
                        final x1 x1Var118 = x1VarM;
                        final int i31111111119 = i13;
                        final int i311111111110 = i30;
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar25, int i311111111111) {
                                if ((i311111111111 & 11) == 2 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(144282315, i311111111111, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z11111 = z10;
                                boolean z11112 = z11110;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var119 = x1Var118;
                                int i311111111112 = i31111111119;
                                textFieldDefaults.b(z11111, z11112, eVar, x1Var119, null, 0.0f, 0.0f, pVar25, 12582912 | ((i311111111112 >> 6) & 14) | ((i311111111112 >> 15) & 112) | ((i311111111112 >> 9) & bb.c.b.f30796me) | ((i311111111110 << 3) & bb.c.g.f32954lc), 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                a(pVar25, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        m0Var2 = m0VarO;
                        pVar13 = pVar11;
                        pVarB = pVar6;
                    }
                    x1Var2 = x1VarM;
                    pVar14 = pVar8;
                    pVar15 = pVar9;
                    z14 = z13;
                    pVar16 = pVar24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
                }
                int i311111111111 = i13;
                int i311111111112 = i311111111111 << 3;
                int i311111111113 = i311111111111 >> 9;
                int i311111111114 = i30 << 21;
                pVar17 = pVarF;
                TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i311111111112 & bb.c.b.f30796me) | (i311111111112 & 112) | 6 | ((i311111111111 >> 3) & bb.c.g.f32954lc) | (i311111111113 & 57344) | (i311111111113 & 458752) | (3670016 & i311111111113) | (29360128 & i311111111114) | (i311111111114 & 234881024) | (1879048192 & (i311111111111 << 18)), ((i311111111111 >> 6) & 14) | ((i311111111111 >> 15) & 112) | (i311111111113 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z15 = z14;
                pVar18 = pVar14;
                pVar19 = pVar15;
                pVar20 = pVar12;
                pVar21 = pVar13;
                pVar22 = pVar16;
                x1Var3 = x1Var2;
                m0Var3 = m0Var2;
                pVar23 = pVarB;
            }
            u1VarH = pVar17.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar25, int i320) {
                    this.f11356b.c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, pVar18, pVar19, pVar20, pVar21, pVar22, x1Var3, m0Var3, pVar23, pVar25, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                    a(pVar25, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i16 = androidx.profileinstaller.o.c.f26824k;
        i13 |= i16;
        i17 = i12 & 64;
        if (i17 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (pVarF.u(z12)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i13 |= i18;
        }
        i19 = i12 & 128;
        if (i19 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (pVarF.s(pVar)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i13 |= i20;
        }
        i21 = i12 & 256;
        if (i21 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (pVarF.s(pVar2)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i13 |= i22;
        }
        i23 = i12 & 512;
        if (i23 != 0) {
            i13 |= com.google.android.exoplayer2.j.G;
        } else if ((i10 & 1879048192) == 0) {
            if (pVarF.s(pVar3)) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i13 |= i24;
        }
        i25 = i12 & 1024;
        if (i25 != 0) {
            i26 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (pVarF.s(pVar4)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i26 = i11 | i27;
        } else {
            i26 = i11;
        }
        i28 = i12 & 2048;
        if (i28 != 0) {
            i26 |= 48;
        } else if ((i11 & 112) == 0) {
            if (pVarF.s(pVar5)) {
                i29 = 32;
            } else {
                i29 = 16;
            }
            i26 |= i29;
        }
        if ((i11 & bb.c.b.f30796me) != 0) {
            i26 |= ((i12 & 4096) == 0 || !pVarF.s(x1Var)) ? 128 : 256;
        }
        if ((i11 & bb.c.g.f32954lc) != 0) {
            i26 |= ((i12 & 8192) == 0 || !pVarF.s(m0Var)) ? 1024 : 2048;
        }
        i30 = i26;
        i31 = i12 & 16384;
        if (i31 != 0) {
            i30 |= 24576;
        } else if ((i11 & 57344) == 0) {
            i30 |= pVarF.s(pVar6) ? 16384 : 8192;
        }
        if ((i12 & 32768) != 0) {
            i30 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((i11 & 458752) == 0) {
            if (pVarF.s(this)) {
                i32 = 131072;
            } else {
                i32 = 65536;
            }
            i30 |= i32;
        }
        if ((i13 & 1533916891) != 306783378) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar;
                }
                if (i21 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar2;
                }
                if (i23 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar3;
                }
                if (i25 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i28 == 0) {
                }
                if ((i12 & 4096) != 0) {
                    x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                    i30 &= -897;
                } else {
                    x1VarM = x1Var;
                }
                pVar12 = pVar10;
                if ((i12 & 8192) != 0) {
                    m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i30 &= -7169;
                } else {
                    m0VarO = m0Var;
                }
                if (i31 != 0) {
                    final boolean z11111 = z13;
                    final x1 x1Var119 = x1VarM;
                    final int i311111111115 = i13;
                    final int i311111111116 = i30;
                    m0Var2 = m0VarO;
                    pVar13 = pVar11;
                    pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar25, int i311111111117) {
                            if ((i311111111117 & 11) == 2 && pVar25.b()) {
                                pVar25.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(144282315, i311111111117, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                            }
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            boolean z11112 = z10;
                            boolean z11113 = z11111;
                            androidx.compose.foundation.interaction.e eVar = interactionSource;
                            x1 x1Var1110 = x1Var119;
                            int i311111111118 = i311111111115;
                            textFieldDefaults.b(z11112, z11113, eVar, x1Var1110, null, 0.0f, 0.0f, pVar25, 12582912 | ((i311111111118 >> 6) & 14) | ((i311111111118 >> 15) & 112) | ((i311111111118 >> 9) & bb.c.b.f30796me) | ((i311111111116 << 3) & bb.c.g.f32954lc), 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                            a(pVar25, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    m0Var2 = m0VarO;
                    pVar13 = pVar11;
                    pVarB = pVar6;
                }
                x1Var2 = x1VarM;
                pVar14 = pVar8;
                pVar15 = pVar9;
                z14 = z13;
                pVar16 = pVar24;
            } else {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar;
                }
                if (i21 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar2;
                }
                if (i23 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar3;
                }
                if (i25 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i28 == 0) {
                }
                if ((i12 & 4096) != 0) {
                    x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                    i30 &= -897;
                } else {
                    x1VarM = x1Var;
                }
                pVar12 = pVar10;
                if ((i12 & 8192) != 0) {
                    m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i30 &= -7169;
                } else {
                    m0VarO = m0Var;
                }
                if (i31 != 0) {
                    final boolean z11112 = z13;
                    final x1 x1Var1110 = x1VarM;
                    final int i311111111117 = i13;
                    final int i311111111118 = i30;
                    m0Var2 = m0VarO;
                    pVar13 = pVar11;
                    pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar25, int i311111111119) {
                            if ((i311111111119 & 11) == 2 && pVar25.b()) {
                                pVar25.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(144282315, i311111111119, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                            }
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            boolean z11113 = z10;
                            boolean z11114 = z11112;
                            androidx.compose.foundation.interaction.e eVar = interactionSource;
                            x1 x1Var1111 = x1Var1110;
                            int i3111111111110 = i311111111117;
                            textFieldDefaults.b(z11113, z11114, eVar, x1Var1111, null, 0.0f, 0.0f, pVar25, 12582912 | ((i3111111111110 >> 6) & 14) | ((i3111111111110 >> 15) & 112) | ((i3111111111110 >> 9) & bb.c.b.f30796me) | ((i311111111118 << 3) & bb.c.g.f32954lc), 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                            a(pVar25, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    m0Var2 = m0VarO;
                    pVar13 = pVar11;
                    pVarB = pVar6;
                }
                x1Var2 = x1VarM;
                pVar14 = pVar8;
                pVar15 = pVar9;
                z14 = z13;
                pVar16 = pVar24;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
            }
            int i311111111119 = i13;
            int i3111111111110 = i311111111119 << 3;
            int i3111111111111 = i311111111119 >> 9;
            int i3111111111112 = i30 << 21;
            pVar17 = pVarF;
            TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i3111111111110 & bb.c.b.f30796me) | (i3111111111110 & 112) | 6 | ((i311111111119 >> 3) & bb.c.g.f32954lc) | (i3111111111111 & 57344) | (i3111111111111 & 458752) | (3670016 & i3111111111111) | (29360128 & i3111111111112) | (i3111111111112 & 234881024) | (1879048192 & (i311111111119 << 18)), ((i311111111119 >> 6) & 14) | ((i311111111119 >> 15) & 112) | (i3111111111111 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            z15 = z14;
            pVar18 = pVar14;
            pVar19 = pVar15;
            pVar20 = pVar12;
            pVar21 = pVar13;
            pVar22 = pVar16;
            x1Var3 = x1Var2;
            m0Var3 = m0Var2;
            pVar23 = pVarB;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar;
                }
                if (i21 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar2;
                }
                if (i23 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar3;
                }
                if (i25 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i28 == 0) {
                }
                if ((i12 & 4096) != 0) {
                    x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                    i30 &= -897;
                } else {
                    x1VarM = x1Var;
                }
                pVar12 = pVar10;
                if ((i12 & 8192) != 0) {
                    m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i30 &= -7169;
                } else {
                    m0VarO = m0Var;
                }
                if (i31 != 0) {
                    final boolean z11113 = z13;
                    final x1 x1Var1111 = x1VarM;
                    final int i3111111111113 = i13;
                    final int i3111111111114 = i30;
                    m0Var2 = m0VarO;
                    pVar13 = pVar11;
                    pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar25, int i3111111111115) {
                            if ((i3111111111115 & 11) == 2 && pVar25.b()) {
                                pVar25.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(144282315, i3111111111115, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                            }
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            boolean z11114 = z10;
                            boolean z11115 = z11113;
                            androidx.compose.foundation.interaction.e eVar = interactionSource;
                            x1 x1Var1112 = x1Var1111;
                            int i3111111111116 = i3111111111113;
                            textFieldDefaults.b(z11114, z11115, eVar, x1Var1112, null, 0.0f, 0.0f, pVar25, 12582912 | ((i3111111111116 >> 6) & 14) | ((i3111111111116 >> 15) & 112) | ((i3111111111116 >> 9) & bb.c.b.f30796me) | ((i3111111111114 << 3) & bb.c.g.f32954lc), 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                            a(pVar25, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    m0Var2 = m0VarO;
                    pVar13 = pVar11;
                    pVarB = pVar6;
                }
                x1Var2 = x1VarM;
                pVar14 = pVar8;
                pVar15 = pVar9;
                z14 = z13;
                pVar16 = pVar24;
            } else {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar;
                }
                if (i21 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar2;
                }
                if (i23 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar3;
                }
                if (i25 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i28 == 0) {
                }
                if ((i12 & 4096) != 0) {
                    x1VarM = m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, (i30 << 9) & 234881024, 268435455);
                    i30 &= -897;
                } else {
                    x1VarM = x1Var;
                }
                pVar12 = pVar10;
                if ((i12 & 8192) != 0) {
                    m0VarO = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i30 &= -7169;
                } else {
                    m0VarO = m0Var;
                }
                if (i31 != 0) {
                    final boolean z11114 = z13;
                    final x1 x1Var1112 = x1VarM;
                    final int i3111111111115 = i13;
                    final int i3111111111116 = i30;
                    m0Var2 = m0VarO;
                    pVar13 = pVar11;
                    pVarB = androidx.compose.runtime.internal.b.b(pVarF, 144282315, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar25, int i3111111111117) {
                            if ((i3111111111117 & 11) == 2 && pVar25.b()) {
                                pVar25.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(144282315, i3111111111117, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                            }
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            boolean z11115 = z10;
                            boolean z11116 = z11114;
                            androidx.compose.foundation.interaction.e eVar = interactionSource;
                            x1 x1Var1113 = x1Var1112;
                            int i3111111111118 = i3111111111115;
                            textFieldDefaults.b(z11115, z11116, eVar, x1Var1113, null, 0.0f, 0.0f, pVar25, 12582912 | ((i3111111111118 >> 6) & 14) | ((i3111111111118 >> 15) & 112) | ((i3111111111118 >> 9) & bb.c.b.f30796me) | ((i3111111111116 << 3) & bb.c.g.f32954lc), 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                            a(pVar25, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    m0Var2 = m0VarO;
                    pVar13 = pVar11;
                    pVarB = pVar6;
                }
                x1Var2 = x1VarM;
                pVar14 = pVar8;
                pVar15 = pVar9;
                z14 = z13;
                pVar16 = pVar24;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(508645792, i13, i30, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
            }
            int i3111111111117 = i13;
            int i3111111111118 = i3111111111117 << 3;
            int i3111111111119 = i3111111111117 >> 9;
            int i31111111111110 = i30 << 21;
            pVar17 = pVarF;
            TextFieldImplKt.a(TextFieldType.Outlined, value, innerTextField, visualTransformation, pVar14, pVar15, pVar12, pVar13, pVar16, z11, z10, z14, interactionSource, m0Var2, x1Var2, pVarB, pVar17, (i3111111111118 & bb.c.b.f30796me) | (i3111111111118 & 112) | 6 | ((i3111111111117 >> 3) & bb.c.g.f32954lc) | (i3111111111119 & 57344) | (i3111111111119 & 458752) | (3670016 & i3111111111119) | (29360128 & i31111111111110) | (i31111111111110 & 234881024) | (1879048192 & (i3111111111117 << 18)), ((i3111111111117 >> 6) & 14) | ((i3111111111117 >> 15) & 112) | (i3111111111119 & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc) | ((i30 << 6) & 57344) | ((i30 << 3) & 458752), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            z15 = z14;
            pVar18 = pVar14;
            pVar19 = pVar15;
            pVar20 = pVar12;
            pVar21 = pVar13;
            pVar22 = pVar16;
            x1Var3 = x1Var2;
            m0Var3 = m0Var2;
            pVar23 = pVarB;
        }
        u1VarH = pVar17.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar25, int i320) {
                this.f11356b.c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, pVar18, pVar19, pVar20, pVar21, pVar22, x1Var3, m0Var3, pVar23, pVar25, i10 | 1, i11, i12);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                a(pVar25, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0150  */
    /* JADX WARN: Code duplicated, block: B:103:0x0153  */
    /* JADX WARN: Code duplicated, block: B:107:0x015b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0160  */
    /* JADX WARN: Code duplicated, block: B:110:0x0166  */
    /* JADX WARN: Code duplicated, block: B:112:0x016c  */
    /* JADX WARN: Code duplicated, block: B:113:0x016f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0174  */
    /* JADX WARN: Code duplicated, block: B:118:0x017a  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0185  */
    /* JADX WARN: Code duplicated, block: B:123:0x018b  */
    /* JADX WARN: Code duplicated, block: B:124:0x018e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0196  */
    /* JADX WARN: Code duplicated, block: B:130:0x019a  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x01de  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:170:0x0205  */
    /* JADX WARN: Code duplicated, block: B:172:0x020a  */
    /* JADX WARN: Code duplicated, block: B:174:0x020e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0214  */
    /* JADX WARN: Code duplicated, block: B:177:0x0217  */
    /* JADX WARN: Code duplicated, block: B:180:0x0228  */
    /* JADX WARN: Code duplicated, block: B:186:0x0253  */
    /* JADX WARN: Code duplicated, block: B:188:0x025a  */
    /* JADX WARN: Code duplicated, block: B:201:0x0292 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x0294  */
    /* JADX WARN: Code duplicated, block: B:203:0x0298  */
    /* JADX WARN: Code duplicated, block: B:206:0x029d  */
    /* JADX WARN: Code duplicated, block: B:207:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:209:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:212:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:213:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:215:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:216:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:219:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:223:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:227:0x0338  */
    /* JADX WARN: Code duplicated, block: B:230:0x0345 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:231:0x0347  */
    /* JADX WARN: Code duplicated, block: B:232:0x0361  */
    /* JADX WARN: Code duplicated, block: B:234:0x0380  */
    /* JADX WARN: Code duplicated, block: B:236:0x0385  */
    /* JADX WARN: Code duplicated, block: B:237:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:240:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:241:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:244:0x043c  */
    /* JADX WARN: Code duplicated, block: B:249:0x045a  */
    /* JADX WARN: Code duplicated, block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:78:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x010a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0110  */
    /* JADX WARN: Code duplicated, block: B:83:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x011b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0122  */
    /* JADX WARN: Code duplicated, block: B:90:0x012a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0130  */
    /* JADX WARN: Code duplicated, block: B:93:0x0133  */
    /* JADX WARN: Code duplicated, block: B:97:0x013b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0142  */
    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public final void d(@dl.d final String value, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, final boolean z10, final boolean z11, @dl.d final androidx.compose.ui.text.input.m0 visualTransformation, @dl.d final androidx.compose.foundation.interaction.e interactionSource, boolean z12, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar5, @dl.e g2 g2Var, @dl.e x1 x1Var, @dl.e androidx.compose.foundation.layout.m0 m0Var, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6, @dl.e androidx.compose.runtime.p pVar7, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z13;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13;
        g2 g2Var2;
        int i35;
        int i36;
        androidx.compose.runtime.p pVar14;
        x1 x1VarR;
        androidx.compose.foundation.layout.m0 m0VarT;
        androidx.compose.runtime.p pVar15;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVarB;
        x1 x1Var2;
        androidx.compose.foundation.layout.m0 m0Var2;
        int i37;
        androidx.compose.runtime.p pVar16;
        final x1 x1Var3;
        final androidx.compose.foundation.layout.m0 m0Var3;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17;
        final boolean z14;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22;
        final g2 g2Var3;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(value, "value");
        kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
        kotlin.jvm.internal.f0.p(visualTransformation, "visualTransformation");
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        androidx.compose.runtime.p pVarF = pVar7.F(-1224712461);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (pVarF.s(value) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= pVarF.s(innerTextField) ? 32 : 16;
        }
        int i38 = 128;
        if ((i12 & 4) == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                i13 |= pVarF.u(z10) ? 256 : 128;
            }
            if ((i12 & 8) != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.u(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i13 |= i14;
                }
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (pVarF.s(visualTransformation)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                if ((i12 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(interactionSource)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                    }
                    i17 = i12 & 64;
                    if (i17 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (pVarF.u(z12)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                    i19 = i12 & 128;
                    if (i19 != 0) {
                        i13 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (pVarF.s(pVar)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i13 |= i20;
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (pVarF.s(pVar2)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= com.google.android.exoplayer2.j.G;
                    } else if ((i10 & 1879048192) == 0) {
                        if (pVarF.s(pVar3)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (pVarF.s(pVar4)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    i28 = i12 & 2048;
                    if (i28 != 0) {
                        i26 |= 48;
                    } else if ((i11 & 112) == 0) {
                        if (pVarF.s(pVar5)) {
                            i29 = 32;
                        } else {
                            i29 = 16;
                        }
                        i26 |= i29;
                    }
                    if ((i11 & bb.c.b.f30796me) != 0) {
                        if ((i12 & 4096) == 0 && pVarF.s(g2Var)) {
                            i38 = 256;
                        }
                        i26 |= i38;
                    }
                    if ((i11 & bb.c.g.f32954lc) != 0) {
                        i26 |= ((i12 & 8192) == 0 || !pVarF.s(x1Var)) ? 1024 : 2048;
                    }
                    if ((i11 & 57344) != 0) {
                        i26 |= ((i12 & 16384) == 0 || !pVarF.s(m0Var)) ? 8192 : 16384;
                    }
                    i30 = i12 & 32768;
                    if (i30 != 0) {
                        i26 |= androidx.profileinstaller.o.c.f26824k;
                        pVar8 = pVar6;
                    } else {
                        pVar8 = pVar6;
                        if ((i11 & 458752) == 0) {
                            if (pVarF.s(pVar8)) {
                                i31 = 131072;
                            } else {
                                i31 = 65536;
                            }
                            i26 |= i31;
                        }
                    }
                    if ((i12 & 65536) != 0) {
                        if ((i11 & 3670016) == 0) {
                            if (pVarF.s(this)) {
                                i32 = 1048576;
                            } else {
                                i32 = 524288;
                            }
                        }
                        i33 = i26;
                        i34 = i13;
                        if ((i13 & 1533916891) != 306783378 && (2995931 & i33) == 599186 && pVarF.b()) {
                            pVarF.l();
                            z14 = z12;
                            pVar18 = pVar;
                            pVar19 = pVar2;
                            pVar20 = pVar3;
                            pVar21 = pVar4;
                            pVar22 = pVar5;
                            x1Var3 = x1Var;
                            m0Var3 = m0Var;
                            pVar16 = pVarF;
                            pVar17 = pVar8;
                            g2Var3 = g2Var;
                        } else {
                            pVarF.W();
                            if ((i10 & 1) != 0 || pVarF.o()) {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    pVar9 = null;
                                } else {
                                    pVar9 = pVar;
                                }
                                if (i21 != 0) {
                                    pVar10 = null;
                                } else {
                                    pVar10 = pVar2;
                                }
                                if (i23 != 0) {
                                    pVar11 = null;
                                } else {
                                    pVar11 = pVar3;
                                }
                                if (i25 != 0) {
                                    pVar12 = null;
                                } else {
                                    pVar12 = pVar4;
                                }
                                if (i28 != 0) {
                                    pVar13 = null;
                                } else {
                                    pVar13 = pVar5;
                                }
                                if ((i12 & 4096) != 0) {
                                    g2 g2VarE = e(pVarF, (i33 >> 18) & 14);
                                    i33 &= -897;
                                    g2Var2 = g2VarE;
                                } else {
                                    g2Var2 = g2Var;
                                }
                                i35 = i33;
                                if ((i12 & 8192) != 0) {
                                    pVar14 = pVarF;
                                    i36 = i34;
                                    x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                    i35 &= -7169;
                                } else {
                                    i36 = i34;
                                    pVar14 = pVarF;
                                    x1VarR = x1Var;
                                }
                                if ((i12 & 16384) != 0) {
                                    if (pVar9 == null) {
                                        m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i33 = (-57345) & i35;
                                } else {
                                    m0VarT = m0Var;
                                    i33 = i35;
                                }
                                if (i30 != 0) {
                                    final boolean z15 = z13;
                                    final x1 x1Var4 = x1VarR;
                                    final g2 g2Var4 = g2Var2;
                                    final int i39 = i36;
                                    final int i40 = i33;
                                    pVar15 = pVar14;
                                    x1Var2 = x1VarR;
                                    m0Var2 = m0VarT;
                                    pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41) {
                                            if ((i41 & 11) == 2 && pVar23.b()) {
                                                pVar23.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-1171460386, i41, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                            }
                                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                            boolean z16 = z10;
                                            boolean z17 = z15;
                                            androidx.compose.foundation.interaction.e eVar = interactionSource;
                                            x1 x1Var5 = x1Var4;
                                            g2 g2Var5 = g2Var4;
                                            int i42 = i39;
                                            int i43 = 196608 | ((i42 >> 6) & 14) | ((i42 >> 15) & 112) | ((i42 >> 9) & bb.c.b.f30796me);
                                            int i44 = i40;
                                            textFieldDefaults.a(z16, z17, eVar, x1Var5, g2Var5, pVar23, i43 | (i44 & bb.c.g.f32954lc) | ((i44 << 6) & 57344), 0);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                            a(pVar23, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                } else {
                                    pVar15 = pVar14;
                                    pVarB = pVar6;
                                    x1Var2 = x1VarR;
                                    m0Var2 = m0VarT;
                                }
                            } else {
                                pVarF.l();
                                if ((i12 & 4096) != 0) {
                                    i33 &= -897;
                                }
                                if ((i12 & 8192) != 0) {
                                    i33 &= -7169;
                                }
                                if ((i12 & 16384) != 0) {
                                    i33 &= -57345;
                                }
                                z13 = z12;
                                pVar9 = pVar;
                                pVar10 = pVar2;
                                pVar11 = pVar3;
                                pVar12 = pVar4;
                                pVar13 = pVar5;
                                g2Var2 = g2Var;
                                x1Var2 = x1Var;
                                m0Var2 = m0Var;
                                i36 = i34;
                                pVarB = pVar8;
                                pVar15 = pVarF;
                            }
                            pVar15.O();
                            if (ComposerKt.g0()) {
                                i37 = i36;
                                ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                            } else {
                                i37 = i36;
                            }
                            int i41 = i37 << 3;
                            int i42 = i37 >> 9;
                            int i43 = i33 << 21;
                            pVar16 = pVar15;
                            TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i41 & bb.c.b.f30796me) | (i41 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i42 & 57344) | (i42 & 458752) | (i42 & 3670016) | (29360128 & i43) | (234881024 & i43) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i42 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            x1Var3 = x1Var2;
                            m0Var3 = m0Var2;
                            pVar17 = pVarB;
                            z14 = z13;
                            pVar18 = pVar9;
                            pVar19 = pVar10;
                            pVar20 = pVar11;
                            pVar21 = pVar12;
                            pVar22 = pVar13;
                            g2Var3 = g2Var2;
                        }
                        u1VarH = pVar16.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i44) {
                                this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    }
                    i32 = 1572864;
                    i26 |= i32;
                    i33 = i26;
                    i34 = i13;
                    if ((i13 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE2 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE2;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z16 = z13;
                                final x1 x1Var5 = x1VarR;
                                final g2 g2Var5 = g2Var2;
                                final int i310 = i36;
                                final int i44 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i45) {
                                        if ((i45 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i45, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z17 = z10;
                                        boolean z18 = z16;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var6 = x1Var5;
                                        g2 g2Var6 = g2Var5;
                                        int i46 = i310;
                                        int i47 = 196608 | ((i46 >> 6) & 14) | ((i46 >> 15) & 112) | ((i46 >> 9) & bb.c.b.f30796me);
                                        int i48 = i44;
                                        textFieldDefaults.a(z17, z18, eVar, x1Var6, g2Var6, pVar23, i47 | (i48 & bb.c.g.f32954lc) | ((i48 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE3 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE3;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z17 = z13;
                                final x1 x1Var6 = x1VarR;
                                final g2 g2Var6 = g2Var2;
                                final int i311 = i36;
                                final int i45 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i46) {
                                        if ((i46 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i46, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z18 = z10;
                                        boolean z19 = z17;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var7 = x1Var6;
                                        g2 g2Var7 = g2Var6;
                                        int i47 = i311;
                                        int i48 = 196608 | ((i47 >> 6) & 14) | ((i47 >> 15) & 112) | ((i47 >> 9) & bb.c.b.f30796me);
                                        int i49 = i45;
                                        textFieldDefaults.a(z18, z19, eVar, x1Var7, g2Var7, pVar23, i48 | (i49 & bb.c.g.f32954lc) | ((i49 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        }
                        pVar15.O();
                        if (ComposerKt.g0()) {
                            i37 = i36;
                            ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                        } else {
                            i37 = i36;
                        }
                        int i46 = i37 << 3;
                        int i47 = i37 >> 9;
                        int i48 = i33 << 21;
                        pVar16 = pVar15;
                        TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i46 & bb.c.b.f30796me) | (i46 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i47 & 57344) | (i47 & 458752) | (i47 & 3670016) | (29360128 & i48) | (234881024 & i48) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i47 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x1Var3 = x1Var2;
                        m0Var3 = m0Var2;
                        pVar17 = pVarB;
                        z14 = z13;
                        pVar18 = pVar9;
                        pVar19 = pVar10;
                        pVar20 = pVar11;
                        pVar21 = pVar12;
                        pVar22 = pVar13;
                        g2Var3 = g2Var2;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE4 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE4;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z18 = z13;
                                final x1 x1Var7 = x1VarR;
                                final g2 g2Var7 = g2Var2;
                                final int i312 = i36;
                                final int i49 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i410) {
                                        if ((i410 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i410, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z19 = z10;
                                        boolean z110 = z18;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var8 = x1Var7;
                                        g2 g2Var8 = g2Var7;
                                        int i411 = i312;
                                        int i412 = 196608 | ((i411 >> 6) & 14) | ((i411 >> 15) & 112) | ((i411 >> 9) & bb.c.b.f30796me);
                                        int i413 = i49;
                                        textFieldDefaults.a(z19, z110, eVar, x1Var8, g2Var8, pVar23, i412 | (i413 & bb.c.g.f32954lc) | ((i413 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE5 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE5;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z19 = z13;
                                final x1 x1Var8 = x1VarR;
                                final g2 g2Var8 = g2Var2;
                                final int i313 = i36;
                                final int i410 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411) {
                                        if ((i411 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i411, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z110 = z10;
                                        boolean z111 = z19;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var9 = x1Var8;
                                        g2 g2Var9 = g2Var8;
                                        int i412 = i313;
                                        int i413 = 196608 | ((i412 >> 6) & 14) | ((i412 >> 15) & 112) | ((i412 >> 9) & bb.c.b.f30796me);
                                        int i414 = i410;
                                        textFieldDefaults.a(z110, z111, eVar, x1Var9, g2Var9, pVar23, i413 | (i414 & bb.c.g.f32954lc) | ((i414 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        }
                        pVar15.O();
                        if (ComposerKt.g0()) {
                            i37 = i36;
                            ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                        } else {
                            i37 = i36;
                        }
                        int i411 = i37 << 3;
                        int i412 = i37 >> 9;
                        int i413 = i33 << 21;
                        pVar16 = pVar15;
                        TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i411 & bb.c.b.f30796me) | (i411 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i412 & 57344) | (i412 & 458752) | (i412 & 3670016) | (29360128 & i413) | (234881024 & i413) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i412 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x1Var3 = x1Var2;
                        m0Var3 = m0Var2;
                        pVar17 = pVarB;
                        z14 = z13;
                        pVar18 = pVar9;
                        pVar19 = pVar10;
                        pVar20 = pVar11;
                        pVar21 = pVar12;
                        pVar22 = pVar13;
                        g2Var3 = g2Var2;
                    }
                    u1VarH = pVar16.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar23, int i414) {
                            this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                            a(pVar23, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i16 = androidx.profileinstaller.o.c.f26824k;
                i13 |= i16;
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (pVarF.u(z12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(pVar)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(pVar2)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= com.google.android.exoplayer2.j.G;
                } else if ((i10 & 1879048192) == 0) {
                    if (pVarF.s(pVar3)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(pVar4)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                i28 = i12 & 2048;
                if (i28 != 0) {
                    i26 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (pVarF.s(pVar5)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i26 |= i29;
                }
                if ((i11 & bb.c.b.f30796me) != 0) {
                    if ((i12 & 4096) == 0) {
                        i38 = 256;
                    }
                    i26 |= i38;
                }
                if ((i11 & bb.c.g.f32954lc) != 0) {
                    i26 |= ((i12 & 8192) == 0 || !pVarF.s(x1Var)) ? 1024 : 2048;
                }
                if ((i11 & 57344) != 0) {
                    i26 |= ((i12 & 16384) == 0 || !pVarF.s(m0Var)) ? 8192 : 16384;
                }
                i30 = i12 & 32768;
                if (i30 != 0) {
                    i26 |= androidx.profileinstaller.o.c.f26824k;
                    pVar8 = pVar6;
                } else {
                    pVar8 = pVar6;
                    if ((i11 & 458752) == 0) {
                        if (pVarF.s(pVar8)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i26 |= i31;
                    }
                }
                if ((i12 & 65536) != 0) {
                    if ((i11 & 3670016) == 0) {
                        if (pVarF.s(this)) {
                            i32 = 1048576;
                        } else {
                            i32 = 524288;
                        }
                    }
                    i33 = i26;
                    i34 = i13;
                    if ((i13 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE6 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE6;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z110 = z13;
                                final x1 x1Var9 = x1VarR;
                                final g2 g2Var9 = g2Var2;
                                final int i314 = i36;
                                final int i414 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i415) {
                                        if ((i415 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i415, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z111 = z10;
                                        boolean z112 = z110;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var10 = x1Var9;
                                        g2 g2Var10 = g2Var9;
                                        int i416 = i314;
                                        int i417 = 196608 | ((i416 >> 6) & 14) | ((i416 >> 15) & 112) | ((i416 >> 9) & bb.c.b.f30796me);
                                        int i418 = i414;
                                        textFieldDefaults.a(z111, z112, eVar, x1Var10, g2Var10, pVar23, i417 | (i418 & bb.c.g.f32954lc) | ((i418 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE7 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE7;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z111 = z13;
                                final x1 x1Var10 = x1VarR;
                                final g2 g2Var10 = g2Var2;
                                final int i315 = i36;
                                final int i415 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i416) {
                                        if ((i416 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i416, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z112 = z10;
                                        boolean z113 = z111;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var11 = x1Var10;
                                        g2 g2Var11 = g2Var10;
                                        int i417 = i315;
                                        int i418 = 196608 | ((i417 >> 6) & 14) | ((i417 >> 15) & 112) | ((i417 >> 9) & bb.c.b.f30796me);
                                        int i419 = i415;
                                        textFieldDefaults.a(z112, z113, eVar, x1Var11, g2Var11, pVar23, i418 | (i419 & bb.c.g.f32954lc) | ((i419 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        }
                        pVar15.O();
                        if (ComposerKt.g0()) {
                            i37 = i36;
                            ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                        } else {
                            i37 = i36;
                        }
                        int i416 = i37 << 3;
                        int i417 = i37 >> 9;
                        int i418 = i33 << 21;
                        pVar16 = pVar15;
                        TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i416 & bb.c.b.f30796me) | (i416 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i417 & 57344) | (i417 & 458752) | (i417 & 3670016) | (29360128 & i418) | (234881024 & i418) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i417 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x1Var3 = x1Var2;
                        m0Var3 = m0Var2;
                        pVar17 = pVarB;
                        z14 = z13;
                        pVar18 = pVar9;
                        pVar19 = pVar10;
                        pVar20 = pVar11;
                        pVar21 = pVar12;
                        pVar22 = pVar13;
                        g2Var3 = g2Var2;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE8 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE8;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z112 = z13;
                                final x1 x1Var11 = x1VarR;
                                final g2 g2Var11 = g2Var2;
                                final int i316 = i36;
                                final int i419 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4110) {
                                        if ((i4110 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i4110, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z113 = z10;
                                        boolean z114 = z112;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var12 = x1Var11;
                                        g2 g2Var12 = g2Var11;
                                        int i4111 = i316;
                                        int i4112 = 196608 | ((i4111 >> 6) & 14) | ((i4111 >> 15) & 112) | ((i4111 >> 9) & bb.c.b.f30796me);
                                        int i4113 = i419;
                                        textFieldDefaults.a(z113, z114, eVar, x1Var12, g2Var12, pVar23, i4112 | (i4113 & bb.c.g.f32954lc) | ((i4113 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE9 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE9;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z113 = z13;
                                final x1 x1Var12 = x1VarR;
                                final g2 g2Var12 = g2Var2;
                                final int i317 = i36;
                                final int i4110 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111) {
                                        if ((i4111 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i4111, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z114 = z10;
                                        boolean z115 = z113;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var13 = x1Var12;
                                        g2 g2Var13 = g2Var12;
                                        int i4112 = i317;
                                        int i4113 = 196608 | ((i4112 >> 6) & 14) | ((i4112 >> 15) & 112) | ((i4112 >> 9) & bb.c.b.f30796me);
                                        int i4114 = i4110;
                                        textFieldDefaults.a(z114, z115, eVar, x1Var13, g2Var13, pVar23, i4113 | (i4114 & bb.c.g.f32954lc) | ((i4114 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        }
                        pVar15.O();
                        if (ComposerKt.g0()) {
                            i37 = i36;
                            ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                        } else {
                            i37 = i36;
                        }
                        int i4111 = i37 << 3;
                        int i4112 = i37 >> 9;
                        int i4113 = i33 << 21;
                        pVar16 = pVar15;
                        TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i4111 & bb.c.b.f30796me) | (i4111 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i4112 & 57344) | (i4112 & 458752) | (i4112 & 3670016) | (29360128 & i4113) | (234881024 & i4113) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i4112 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x1Var3 = x1Var2;
                        m0Var3 = m0Var2;
                        pVar17 = pVarB;
                        z14 = z13;
                        pVar18 = pVar9;
                        pVar19 = pVar10;
                        pVar20 = pVar11;
                        pVar21 = pVar12;
                        pVar22 = pVar13;
                        g2Var3 = g2Var2;
                    }
                    u1VarH = pVar16.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4114) {
                            this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                            a(pVar23, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i32 = 1572864;
                i26 |= i32;
                i33 = i26;
                i34 = i13;
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE10 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE10;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z114 = z13;
                            final x1 x1Var13 = x1VarR;
                            final g2 g2Var13 = g2Var2;
                            final int i318 = i36;
                            final int i4114 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4115) {
                                    if ((i4115 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i4115, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z115 = z10;
                                    boolean z116 = z114;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var14 = x1Var13;
                                    g2 g2Var14 = g2Var13;
                                    int i4116 = i318;
                                    int i4117 = 196608 | ((i4116 >> 6) & 14) | ((i4116 >> 15) & 112) | ((i4116 >> 9) & bb.c.b.f30796me);
                                    int i4118 = i4114;
                                    textFieldDefaults.a(z115, z116, eVar, x1Var14, g2Var14, pVar23, i4117 | (i4118 & bb.c.g.f32954lc) | ((i4118 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE11 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE11;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z115 = z13;
                            final x1 x1Var14 = x1VarR;
                            final g2 g2Var14 = g2Var2;
                            final int i319 = i36;
                            final int i4115 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4116) {
                                    if ((i4116 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i4116, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z116 = z10;
                                    boolean z117 = z115;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var15 = x1Var14;
                                    g2 g2Var15 = g2Var14;
                                    int i4117 = i319;
                                    int i4118 = 196608 | ((i4117 >> 6) & 14) | ((i4117 >> 15) & 112) | ((i4117 >> 9) & bb.c.b.f30796me);
                                    int i4119 = i4115;
                                    textFieldDefaults.a(z116, z117, eVar, x1Var15, g2Var15, pVar23, i4118 | (i4119 & bb.c.g.f32954lc) | ((i4119 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    }
                    pVar15.O();
                    if (ComposerKt.g0()) {
                        i37 = i36;
                        ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                    } else {
                        i37 = i36;
                    }
                    int i4116 = i37 << 3;
                    int i4117 = i37 >> 9;
                    int i4118 = i33 << 21;
                    pVar16 = pVar15;
                    TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i4116 & bb.c.b.f30796me) | (i4116 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i4117 & 57344) | (i4117 & 458752) | (i4117 & 3670016) | (29360128 & i4118) | (234881024 & i4118) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i4117 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar17 = pVarB;
                    z14 = z13;
                    pVar18 = pVar9;
                    pVar19 = pVar10;
                    pVar20 = pVar11;
                    pVar21 = pVar12;
                    pVar22 = pVar13;
                    g2Var3 = g2Var2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE12 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE12;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z116 = z13;
                            final x1 x1Var15 = x1VarR;
                            final g2 g2Var15 = g2Var2;
                            final int i3110 = i36;
                            final int i4119 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41110) {
                                    if ((i41110 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i41110, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z117 = z10;
                                    boolean z118 = z116;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var16 = x1Var15;
                                    g2 g2Var16 = g2Var15;
                                    int i41111 = i3110;
                                    int i41112 = 196608 | ((i41111 >> 6) & 14) | ((i41111 >> 15) & 112) | ((i41111 >> 9) & bb.c.b.f30796me);
                                    int i41113 = i4119;
                                    textFieldDefaults.a(z117, z118, eVar, x1Var16, g2Var16, pVar23, i41112 | (i41113 & bb.c.g.f32954lc) | ((i41113 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE13 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE13;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z117 = z13;
                            final x1 x1Var16 = x1VarR;
                            final g2 g2Var16 = g2Var2;
                            final int i3111 = i36;
                            final int i41110 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111) {
                                    if ((i41111 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i41111, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z118 = z10;
                                    boolean z119 = z117;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var17 = x1Var16;
                                    g2 g2Var17 = g2Var16;
                                    int i41112 = i3111;
                                    int i41113 = 196608 | ((i41112 >> 6) & 14) | ((i41112 >> 15) & 112) | ((i41112 >> 9) & bb.c.b.f30796me);
                                    int i41114 = i41110;
                                    textFieldDefaults.a(z118, z119, eVar, x1Var17, g2Var17, pVar23, i41113 | (i41114 & bb.c.g.f32954lc) | ((i41114 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    }
                    pVar15.O();
                    if (ComposerKt.g0()) {
                        i37 = i36;
                        ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                    } else {
                        i37 = i36;
                    }
                    int i41111 = i37 << 3;
                    int i41112 = i37 >> 9;
                    int i41113 = i33 << 21;
                    pVar16 = pVar15;
                    TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i41111 & bb.c.b.f30796me) | (i41111 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i41112 & 57344) | (i41112 & 458752) | (i41112 & 3670016) | (29360128 & i41113) | (234881024 & i41113) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i41112 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar17 = pVarB;
                    z14 = z13;
                    pVar18 = pVar9;
                    pVar19 = pVar10;
                    pVar20 = pVar11;
                    pVar21 = pVar12;
                    pVar22 = pVar13;
                    g2Var3 = g2Var2;
                }
                u1VarH = pVar16.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41114) {
                        this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                        a(pVar23, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= bb.c.d.f31193dj;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (pVarF.s(visualTransformation)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i12 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(interactionSource)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                }
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (pVarF.u(z12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(pVar)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(pVar2)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= com.google.android.exoplayer2.j.G;
                } else if ((i10 & 1879048192) == 0) {
                    if (pVarF.s(pVar3)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(pVar4)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                i28 = i12 & 2048;
                if (i28 != 0) {
                    i26 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (pVarF.s(pVar5)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i26 |= i29;
                }
                if ((i11 & bb.c.b.f30796me) != 0) {
                    if ((i12 & 4096) == 0) {
                        i38 = 256;
                    }
                    i26 |= i38;
                }
                if ((i11 & bb.c.g.f32954lc) != 0) {
                    i26 |= ((i12 & 8192) == 0 || !pVarF.s(x1Var)) ? 1024 : 2048;
                }
                if ((i11 & 57344) != 0) {
                    i26 |= ((i12 & 16384) == 0 || !pVarF.s(m0Var)) ? 8192 : 16384;
                }
                i30 = i12 & 32768;
                if (i30 != 0) {
                    i26 |= androidx.profileinstaller.o.c.f26824k;
                    pVar8 = pVar6;
                } else {
                    pVar8 = pVar6;
                    if ((i11 & 458752) == 0) {
                        if (pVarF.s(pVar8)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i26 |= i31;
                    }
                }
                if ((i12 & 65536) != 0) {
                    if ((i11 & 3670016) == 0) {
                        if (pVarF.s(this)) {
                            i32 = 1048576;
                        } else {
                            i32 = 524288;
                        }
                    }
                    i33 = i26;
                    i34 = i13;
                    if ((i13 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE14 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE14;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z118 = z13;
                                final x1 x1Var17 = x1VarR;
                                final g2 g2Var17 = g2Var2;
                                final int i3112 = i36;
                                final int i41114 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41115) {
                                        if ((i41115 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i41115, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z119 = z10;
                                        boolean z1110 = z118;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var18 = x1Var17;
                                        g2 g2Var18 = g2Var17;
                                        int i41116 = i3112;
                                        int i41117 = 196608 | ((i41116 >> 6) & 14) | ((i41116 >> 15) & 112) | ((i41116 >> 9) & bb.c.b.f30796me);
                                        int i41118 = i41114;
                                        textFieldDefaults.a(z119, z1110, eVar, x1Var18, g2Var18, pVar23, i41117 | (i41118 & bb.c.g.f32954lc) | ((i41118 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE15 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE15;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z119 = z13;
                                final x1 x1Var18 = x1VarR;
                                final g2 g2Var18 = g2Var2;
                                final int i3113 = i36;
                                final int i41115 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41116) {
                                        if ((i41116 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i41116, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z1110 = z10;
                                        boolean z1111 = z119;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var19 = x1Var18;
                                        g2 g2Var19 = g2Var18;
                                        int i41117 = i3113;
                                        int i41118 = 196608 | ((i41117 >> 6) & 14) | ((i41117 >> 15) & 112) | ((i41117 >> 9) & bb.c.b.f30796me);
                                        int i41119 = i41115;
                                        textFieldDefaults.a(z1110, z1111, eVar, x1Var19, g2Var19, pVar23, i41118 | (i41119 & bb.c.g.f32954lc) | ((i41119 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        }
                        pVar15.O();
                        if (ComposerKt.g0()) {
                            i37 = i36;
                            ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                        } else {
                            i37 = i36;
                        }
                        int i41116 = i37 << 3;
                        int i41117 = i37 >> 9;
                        int i41118 = i33 << 21;
                        pVar16 = pVar15;
                        TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i41116 & bb.c.b.f30796me) | (i41116 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i41117 & 57344) | (i41117 & 458752) | (i41117 & 3670016) | (29360128 & i41118) | (234881024 & i41118) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i41117 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x1Var3 = x1Var2;
                        m0Var3 = m0Var2;
                        pVar17 = pVarB;
                        z14 = z13;
                        pVar18 = pVar9;
                        pVar19 = pVar10;
                        pVar20 = pVar11;
                        pVar21 = pVar12;
                        pVar22 = pVar13;
                        g2Var3 = g2Var2;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE16 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE16;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z1110 = z13;
                                final x1 x1Var19 = x1VarR;
                                final g2 g2Var19 = g2Var2;
                                final int i3114 = i36;
                                final int i41119 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411110) {
                                        if ((i411110 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i411110, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z1111 = z10;
                                        boolean z1112 = z1110;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var110 = x1Var19;
                                        g2 g2Var110 = g2Var19;
                                        int i411111 = i3114;
                                        int i411112 = 196608 | ((i411111 >> 6) & 14) | ((i411111 >> 15) & 112) | ((i411111 >> 9) & bb.c.b.f30796me);
                                        int i411113 = i41119;
                                        textFieldDefaults.a(z1111, z1112, eVar, x1Var110, g2Var110, pVar23, i411112 | (i411113 & bb.c.g.f32954lc) | ((i411113 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE17 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE17;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z1111 = z13;
                                final x1 x1Var110 = x1VarR;
                                final g2 g2Var110 = g2Var2;
                                final int i3115 = i36;
                                final int i411110 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111) {
                                        if ((i411111 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i411111, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z1112 = z10;
                                        boolean z1113 = z1111;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var111 = x1Var110;
                                        g2 g2Var111 = g2Var110;
                                        int i411112 = i3115;
                                        int i411113 = 196608 | ((i411112 >> 6) & 14) | ((i411112 >> 15) & 112) | ((i411112 >> 9) & bb.c.b.f30796me);
                                        int i411114 = i411110;
                                        textFieldDefaults.a(z1112, z1113, eVar, x1Var111, g2Var111, pVar23, i411113 | (i411114 & bb.c.g.f32954lc) | ((i411114 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        }
                        pVar15.O();
                        if (ComposerKt.g0()) {
                            i37 = i36;
                            ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                        } else {
                            i37 = i36;
                        }
                        int i411111 = i37 << 3;
                        int i411112 = i37 >> 9;
                        int i411113 = i33 << 21;
                        pVar16 = pVar15;
                        TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i411111 & bb.c.b.f30796me) | (i411111 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i411112 & 57344) | (i411112 & 458752) | (i411112 & 3670016) | (29360128 & i411113) | (234881024 & i411113) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i411112 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x1Var3 = x1Var2;
                        m0Var3 = m0Var2;
                        pVar17 = pVarB;
                        z14 = z13;
                        pVar18 = pVar9;
                        pVar19 = pVar10;
                        pVar20 = pVar11;
                        pVar21 = pVar12;
                        pVar22 = pVar13;
                        g2Var3 = g2Var2;
                    }
                    u1VarH = pVar16.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411114) {
                            this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                            a(pVar23, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i32 = 1572864;
                i26 |= i32;
                i33 = i26;
                i34 = i13;
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE18 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE18;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z1112 = z13;
                            final x1 x1Var111 = x1VarR;
                            final g2 g2Var111 = g2Var2;
                            final int i3116 = i36;
                            final int i411114 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411115) {
                                    if ((i411115 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i411115, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1113 = z10;
                                    boolean z1114 = z1112;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var112 = x1Var111;
                                    g2 g2Var112 = g2Var111;
                                    int i411116 = i3116;
                                    int i411117 = 196608 | ((i411116 >> 6) & 14) | ((i411116 >> 15) & 112) | ((i411116 >> 9) & bb.c.b.f30796me);
                                    int i411118 = i411114;
                                    textFieldDefaults.a(z1113, z1114, eVar, x1Var112, g2Var112, pVar23, i411117 | (i411118 & bb.c.g.f32954lc) | ((i411118 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE19 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE19;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z1113 = z13;
                            final x1 x1Var112 = x1VarR;
                            final g2 g2Var112 = g2Var2;
                            final int i3117 = i36;
                            final int i411115 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411116) {
                                    if ((i411116 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i411116, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1114 = z10;
                                    boolean z1115 = z1113;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var113 = x1Var112;
                                    g2 g2Var113 = g2Var112;
                                    int i411117 = i3117;
                                    int i411118 = 196608 | ((i411117 >> 6) & 14) | ((i411117 >> 15) & 112) | ((i411117 >> 9) & bb.c.b.f30796me);
                                    int i411119 = i411115;
                                    textFieldDefaults.a(z1114, z1115, eVar, x1Var113, g2Var113, pVar23, i411118 | (i411119 & bb.c.g.f32954lc) | ((i411119 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    }
                    pVar15.O();
                    if (ComposerKt.g0()) {
                        i37 = i36;
                        ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                    } else {
                        i37 = i36;
                    }
                    int i411116 = i37 << 3;
                    int i411117 = i37 >> 9;
                    int i411118 = i33 << 21;
                    pVar16 = pVar15;
                    TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i411116 & bb.c.b.f30796me) | (i411116 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i411117 & 57344) | (i411117 & 458752) | (i411117 & 3670016) | (29360128 & i411118) | (234881024 & i411118) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i411117 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar17 = pVarB;
                    z14 = z13;
                    pVar18 = pVar9;
                    pVar19 = pVar10;
                    pVar20 = pVar11;
                    pVar21 = pVar12;
                    pVar22 = pVar13;
                    g2Var3 = g2Var2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE110 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE110;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z1114 = z13;
                            final x1 x1Var113 = x1VarR;
                            final g2 g2Var113 = g2Var2;
                            final int i3118 = i36;
                            final int i411119 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111110) {
                                    if ((i4111110 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i4111110, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1115 = z10;
                                    boolean z1116 = z1114;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var114 = x1Var113;
                                    g2 g2Var114 = g2Var113;
                                    int i4111111 = i3118;
                                    int i4111112 = 196608 | ((i4111111 >> 6) & 14) | ((i4111111 >> 15) & 112) | ((i4111111 >> 9) & bb.c.b.f30796me);
                                    int i4111113 = i411119;
                                    textFieldDefaults.a(z1115, z1116, eVar, x1Var114, g2Var114, pVar23, i4111112 | (i4111113 & bb.c.g.f32954lc) | ((i4111113 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE111 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE111;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z1115 = z13;
                            final x1 x1Var114 = x1VarR;
                            final g2 g2Var114 = g2Var2;
                            final int i3119 = i36;
                            final int i4111110 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111) {
                                    if ((i4111111 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i4111111, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1116 = z10;
                                    boolean z1117 = z1115;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var115 = x1Var114;
                                    g2 g2Var115 = g2Var114;
                                    int i4111112 = i3119;
                                    int i4111113 = 196608 | ((i4111112 >> 6) & 14) | ((i4111112 >> 15) & 112) | ((i4111112 >> 9) & bb.c.b.f30796me);
                                    int i4111114 = i4111110;
                                    textFieldDefaults.a(z1116, z1117, eVar, x1Var115, g2Var115, pVar23, i4111113 | (i4111114 & bb.c.g.f32954lc) | ((i4111114 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    }
                    pVar15.O();
                    if (ComposerKt.g0()) {
                        i37 = i36;
                        ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                    } else {
                        i37 = i36;
                    }
                    int i4111111 = i37 << 3;
                    int i4111112 = i37 >> 9;
                    int i4111113 = i33 << 21;
                    pVar16 = pVar15;
                    TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i4111111 & bb.c.b.f30796me) | (i4111111 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i4111112 & 57344) | (i4111112 & 458752) | (i4111112 & 3670016) | (29360128 & i4111113) | (234881024 & i4111113) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i4111112 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar17 = pVarB;
                    z14 = z13;
                    pVar18 = pVar9;
                    pVar19 = pVar10;
                    pVar20 = pVar11;
                    pVar21 = pVar12;
                    pVar22 = pVar13;
                    g2Var3 = g2Var2;
                }
                u1VarH = pVar16.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111114) {
                        this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                        a(pVar23, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i16 = androidx.profileinstaller.o.c.f26824k;
            i13 |= i16;
            i17 = i12 & 64;
            if (i17 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (pVarF.u(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(pVar)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(pVar2)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= com.google.android.exoplayer2.j.G;
            } else if ((i10 & 1879048192) == 0) {
                if (pVarF.s(pVar3)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (pVarF.s(pVar4)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            i28 = i12 & 2048;
            if (i28 != 0) {
                i26 |= 48;
            } else if ((i11 & 112) == 0) {
                if (pVarF.s(pVar5)) {
                    i29 = 32;
                } else {
                    i29 = 16;
                }
                i26 |= i29;
            }
            if ((i11 & bb.c.b.f30796me) != 0) {
                if ((i12 & 4096) == 0) {
                    i38 = 256;
                }
                i26 |= i38;
            }
            if ((i11 & bb.c.g.f32954lc) != 0) {
                i26 |= ((i12 & 8192) == 0 || !pVarF.s(x1Var)) ? 1024 : 2048;
            }
            if ((i11 & 57344) != 0) {
                i26 |= ((i12 & 16384) == 0 || !pVarF.s(m0Var)) ? 8192 : 16384;
            }
            i30 = i12 & 32768;
            if (i30 != 0) {
                i26 |= androidx.profileinstaller.o.c.f26824k;
                pVar8 = pVar6;
            } else {
                pVar8 = pVar6;
                if ((i11 & 458752) == 0) {
                    if (pVarF.s(pVar8)) {
                        i31 = 131072;
                    } else {
                        i31 = 65536;
                    }
                    i26 |= i31;
                }
            }
            if ((i12 & 65536) != 0) {
                if ((i11 & 3670016) == 0) {
                    if (pVarF.s(this)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                }
                i33 = i26;
                i34 = i13;
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE112 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE112;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z1116 = z13;
                            final x1 x1Var115 = x1VarR;
                            final g2 g2Var115 = g2Var2;
                            final int i31110 = i36;
                            final int i4111114 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111115) {
                                    if ((i4111115 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i4111115, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1117 = z10;
                                    boolean z1118 = z1116;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var116 = x1Var115;
                                    g2 g2Var116 = g2Var115;
                                    int i4111116 = i31110;
                                    int i4111117 = 196608 | ((i4111116 >> 6) & 14) | ((i4111116 >> 15) & 112) | ((i4111116 >> 9) & bb.c.b.f30796me);
                                    int i4111118 = i4111114;
                                    textFieldDefaults.a(z1117, z1118, eVar, x1Var116, g2Var116, pVar23, i4111117 | (i4111118 & bb.c.g.f32954lc) | ((i4111118 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE113 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE113;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z1117 = z13;
                            final x1 x1Var116 = x1VarR;
                            final g2 g2Var116 = g2Var2;
                            final int i31111 = i36;
                            final int i4111115 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111116) {
                                    if ((i4111116 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i4111116, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1118 = z10;
                                    boolean z1119 = z1117;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var117 = x1Var116;
                                    g2 g2Var117 = g2Var116;
                                    int i4111117 = i31111;
                                    int i4111118 = 196608 | ((i4111117 >> 6) & 14) | ((i4111117 >> 15) & 112) | ((i4111117 >> 9) & bb.c.b.f30796me);
                                    int i4111119 = i4111115;
                                    textFieldDefaults.a(z1118, z1119, eVar, x1Var117, g2Var117, pVar23, i4111118 | (i4111119 & bb.c.g.f32954lc) | ((i4111119 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    }
                    pVar15.O();
                    if (ComposerKt.g0()) {
                        i37 = i36;
                        ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                    } else {
                        i37 = i36;
                    }
                    int i4111116 = i37 << 3;
                    int i4111117 = i37 >> 9;
                    int i4111118 = i33 << 21;
                    pVar16 = pVar15;
                    TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i4111116 & bb.c.b.f30796me) | (i4111116 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i4111117 & 57344) | (i4111117 & 458752) | (i4111117 & 3670016) | (29360128 & i4111118) | (234881024 & i4111118) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i4111117 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar17 = pVarB;
                    z14 = z13;
                    pVar18 = pVar9;
                    pVar19 = pVar10;
                    pVar20 = pVar11;
                    pVar21 = pVar12;
                    pVar22 = pVar13;
                    g2Var3 = g2Var2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE114 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE114;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z1118 = z13;
                            final x1 x1Var117 = x1VarR;
                            final g2 g2Var117 = g2Var2;
                            final int i31112 = i36;
                            final int i4111119 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111110) {
                                    if ((i41111110 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i41111110, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1119 = z10;
                                    boolean z11110 = z1118;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var118 = x1Var117;
                                    g2 g2Var118 = g2Var117;
                                    int i41111111 = i31112;
                                    int i41111112 = 196608 | ((i41111111 >> 6) & 14) | ((i41111111 >> 15) & 112) | ((i41111111 >> 9) & bb.c.b.f30796me);
                                    int i41111113 = i4111119;
                                    textFieldDefaults.a(z1119, z11110, eVar, x1Var118, g2Var118, pVar23, i41111112 | (i41111113 & bb.c.g.f32954lc) | ((i41111113 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE115 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE115;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z1119 = z13;
                            final x1 x1Var118 = x1VarR;
                            final g2 g2Var118 = g2Var2;
                            final int i31113 = i36;
                            final int i41111110 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111111) {
                                    if ((i41111111 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i41111111, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z11110 = z10;
                                    boolean z11111 = z1119;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var119 = x1Var118;
                                    g2 g2Var119 = g2Var118;
                                    int i41111112 = i31113;
                                    int i41111113 = 196608 | ((i41111112 >> 6) & 14) | ((i41111112 >> 15) & 112) | ((i41111112 >> 9) & bb.c.b.f30796me);
                                    int i41111114 = i41111110;
                                    textFieldDefaults.a(z11110, z11111, eVar, x1Var119, g2Var119, pVar23, i41111113 | (i41111114 & bb.c.g.f32954lc) | ((i41111114 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    }
                    pVar15.O();
                    if (ComposerKt.g0()) {
                        i37 = i36;
                        ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                    } else {
                        i37 = i36;
                    }
                    int i41111111 = i37 << 3;
                    int i41111112 = i37 >> 9;
                    int i41111113 = i33 << 21;
                    pVar16 = pVar15;
                    TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i41111111 & bb.c.b.f30796me) | (i41111111 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i41111112 & 57344) | (i41111112 & 458752) | (i41111112 & 3670016) | (29360128 & i41111113) | (234881024 & i41111113) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i41111112 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar17 = pVarB;
                    z14 = z13;
                    pVar18 = pVar9;
                    pVar19 = pVar10;
                    pVar20 = pVar11;
                    pVar21 = pVar12;
                    pVar22 = pVar13;
                    g2Var3 = g2Var2;
                }
                u1VarH = pVar16.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111114) {
                        this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                        a(pVar23, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i32 = 1572864;
            i26 |= i32;
            i33 = i26;
            i34 = i13;
            if ((i13 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE116 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE116;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z11110 = z13;
                        final x1 x1Var119 = x1VarR;
                        final g2 g2Var119 = g2Var2;
                        final int i31114 = i36;
                        final int i41111114 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111115) {
                                if ((i41111115 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i41111115, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z11111 = z10;
                                boolean z11112 = z11110;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var1110 = x1Var119;
                                g2 g2Var1110 = g2Var119;
                                int i41111116 = i31114;
                                int i41111117 = 196608 | ((i41111116 >> 6) & 14) | ((i41111116 >> 15) & 112) | ((i41111116 >> 9) & bb.c.b.f30796me);
                                int i41111118 = i41111114;
                                textFieldDefaults.a(z11111, z11112, eVar, x1Var1110, g2Var1110, pVar23, i41111117 | (i41111118 & bb.c.g.f32954lc) | ((i41111118 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE117 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE117;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z11111 = z13;
                        final x1 x1Var1110 = x1VarR;
                        final g2 g2Var1110 = g2Var2;
                        final int i31115 = i36;
                        final int i41111115 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111116) {
                                if ((i41111116 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i41111116, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z11112 = z10;
                                boolean z11113 = z11111;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var1111 = x1Var1110;
                                g2 g2Var1111 = g2Var1110;
                                int i41111117 = i31115;
                                int i41111118 = 196608 | ((i41111117 >> 6) & 14) | ((i41111117 >> 15) & 112) | ((i41111117 >> 9) & bb.c.b.f30796me);
                                int i41111119 = i41111115;
                                textFieldDefaults.a(z11112, z11113, eVar, x1Var1111, g2Var1111, pVar23, i41111118 | (i41111119 & bb.c.g.f32954lc) | ((i41111119 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                }
                pVar15.O();
                if (ComposerKt.g0()) {
                    i37 = i36;
                    ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                } else {
                    i37 = i36;
                }
                int i41111116 = i37 << 3;
                int i41111117 = i37 >> 9;
                int i41111118 = i33 << 21;
                pVar16 = pVar15;
                TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i41111116 & bb.c.b.f30796me) | (i41111116 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i41111117 & 57344) | (i41111117 & 458752) | (i41111117 & 3670016) | (29360128 & i41111118) | (234881024 & i41111118) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i41111117 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x1Var3 = x1Var2;
                m0Var3 = m0Var2;
                pVar17 = pVarB;
                z14 = z13;
                pVar18 = pVar9;
                pVar19 = pVar10;
                pVar20 = pVar11;
                pVar21 = pVar12;
                pVar22 = pVar13;
                g2Var3 = g2Var2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE118 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE118;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z11112 = z13;
                        final x1 x1Var1111 = x1VarR;
                        final g2 g2Var1111 = g2Var2;
                        final int i31116 = i36;
                        final int i41111119 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111110) {
                                if ((i411111110 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i411111110, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z11113 = z10;
                                boolean z11114 = z11112;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var1112 = x1Var1111;
                                g2 g2Var1112 = g2Var1111;
                                int i411111111 = i31116;
                                int i411111112 = 196608 | ((i411111111 >> 6) & 14) | ((i411111111 >> 15) & 112) | ((i411111111 >> 9) & bb.c.b.f30796me);
                                int i411111113 = i41111119;
                                textFieldDefaults.a(z11113, z11114, eVar, x1Var1112, g2Var1112, pVar23, i411111112 | (i411111113 & bb.c.g.f32954lc) | ((i411111113 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE119 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE119;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z11113 = z13;
                        final x1 x1Var1112 = x1VarR;
                        final g2 g2Var1112 = g2Var2;
                        final int i31117 = i36;
                        final int i411111110 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111111) {
                                if ((i411111111 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i411111111, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z11114 = z10;
                                boolean z11115 = z11113;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var1113 = x1Var1112;
                                g2 g2Var1113 = g2Var1112;
                                int i411111112 = i31117;
                                int i411111113 = 196608 | ((i411111112 >> 6) & 14) | ((i411111112 >> 15) & 112) | ((i411111112 >> 9) & bb.c.b.f30796me);
                                int i411111114 = i411111110;
                                textFieldDefaults.a(z11114, z11115, eVar, x1Var1113, g2Var1113, pVar23, i411111113 | (i411111114 & bb.c.g.f32954lc) | ((i411111114 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                }
                pVar15.O();
                if (ComposerKt.g0()) {
                    i37 = i36;
                    ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                } else {
                    i37 = i36;
                }
                int i411111111 = i37 << 3;
                int i411111112 = i37 >> 9;
                int i411111113 = i33 << 21;
                pVar16 = pVar15;
                TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i411111111 & bb.c.b.f30796me) | (i411111111 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i411111112 & 57344) | (i411111112 & 458752) | (i411111112 & 3670016) | (29360128 & i411111113) | (234881024 & i411111113) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i411111112 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x1Var3 = x1Var2;
                m0Var3 = m0Var2;
                pVar17 = pVarB;
                z14 = z13;
                pVar18 = pVar9;
                pVar19 = pVar10;
                pVar20 = pVar11;
                pVar21 = pVar12;
                pVar22 = pVar13;
                g2Var3 = g2Var2;
            }
            u1VarH = pVar16.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111114) {
                    this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                    a(pVar23, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= bb.c.b.f30966u4;
        if ((i12 & 8) != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if (pVarF.u(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (pVarF.s(visualTransformation)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i12 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(interactionSource)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                }
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (pVarF.u(z12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(pVar)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(pVar2)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= com.google.android.exoplayer2.j.G;
                } else if ((i10 & 1879048192) == 0) {
                    if (pVarF.s(pVar3)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(pVar4)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                i28 = i12 & 2048;
                if (i28 != 0) {
                    i26 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (pVarF.s(pVar5)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i26 |= i29;
                }
                if ((i11 & bb.c.b.f30796me) != 0) {
                    if ((i12 & 4096) == 0) {
                        i38 = 256;
                    }
                    i26 |= i38;
                }
                if ((i11 & bb.c.g.f32954lc) != 0) {
                    i26 |= ((i12 & 8192) == 0 || !pVarF.s(x1Var)) ? 1024 : 2048;
                }
                if ((i11 & 57344) != 0) {
                    i26 |= ((i12 & 16384) == 0 || !pVarF.s(m0Var)) ? 8192 : 16384;
                }
                i30 = i12 & 32768;
                if (i30 != 0) {
                    i26 |= androidx.profileinstaller.o.c.f26824k;
                    pVar8 = pVar6;
                } else {
                    pVar8 = pVar6;
                    if ((i11 & 458752) == 0) {
                        if (pVarF.s(pVar8)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i26 |= i31;
                    }
                }
                if ((i12 & 65536) != 0) {
                    if ((i11 & 3670016) == 0) {
                        if (pVarF.s(this)) {
                            i32 = 1048576;
                        } else {
                            i32 = 524288;
                        }
                    }
                    i33 = i26;
                    i34 = i13;
                    if ((i13 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE1110 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE1110;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z11114 = z13;
                                final x1 x1Var1113 = x1VarR;
                                final g2 g2Var1113 = g2Var2;
                                final int i31118 = i36;
                                final int i411111114 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111115) {
                                        if ((i411111115 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i411111115, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z11115 = z10;
                                        boolean z11116 = z11114;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var1114 = x1Var1113;
                                        g2 g2Var1114 = g2Var1113;
                                        int i411111116 = i31118;
                                        int i411111117 = 196608 | ((i411111116 >> 6) & 14) | ((i411111116 >> 15) & 112) | ((i411111116 >> 9) & bb.c.b.f30796me);
                                        int i411111118 = i411111114;
                                        textFieldDefaults.a(z11115, z11116, eVar, x1Var1114, g2Var1114, pVar23, i411111117 | (i411111118 & bb.c.g.f32954lc) | ((i411111118 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE1111 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE1111;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z11115 = z13;
                                final x1 x1Var1114 = x1VarR;
                                final g2 g2Var1114 = g2Var2;
                                final int i31119 = i36;
                                final int i411111115 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111116) {
                                        if ((i411111116 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i411111116, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z11116 = z10;
                                        boolean z11117 = z11115;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var1115 = x1Var1114;
                                        g2 g2Var1115 = g2Var1114;
                                        int i411111117 = i31119;
                                        int i411111118 = 196608 | ((i411111117 >> 6) & 14) | ((i411111117 >> 15) & 112) | ((i411111117 >> 9) & bb.c.b.f30796me);
                                        int i411111119 = i411111115;
                                        textFieldDefaults.a(z11116, z11117, eVar, x1Var1115, g2Var1115, pVar23, i411111118 | (i411111119 & bb.c.g.f32954lc) | ((i411111119 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        }
                        pVar15.O();
                        if (ComposerKt.g0()) {
                            i37 = i36;
                            ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                        } else {
                            i37 = i36;
                        }
                        int i411111116 = i37 << 3;
                        int i411111117 = i37 >> 9;
                        int i411111118 = i33 << 21;
                        pVar16 = pVar15;
                        TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i411111116 & bb.c.b.f30796me) | (i411111116 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i411111117 & 57344) | (i411111117 & 458752) | (i411111117 & 3670016) | (29360128 & i411111118) | (234881024 & i411111118) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i411111117 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x1Var3 = x1Var2;
                        m0Var3 = m0Var2;
                        pVar17 = pVarB;
                        z14 = z13;
                        pVar18 = pVar9;
                        pVar19 = pVar10;
                        pVar20 = pVar11;
                        pVar21 = pVar12;
                        pVar22 = pVar13;
                        g2Var3 = g2Var2;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE1112 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE1112;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z11116 = z13;
                                final x1 x1Var1115 = x1VarR;
                                final g2 g2Var1115 = g2Var2;
                                final int i311110 = i36;
                                final int i411111119 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111110) {
                                        if ((i4111111110 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i4111111110, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z11117 = z10;
                                        boolean z11118 = z11116;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var1116 = x1Var1115;
                                        g2 g2Var1116 = g2Var1115;
                                        int i4111111111 = i311110;
                                        int i4111111112 = 196608 | ((i4111111111 >> 6) & 14) | ((i4111111111 >> 15) & 112) | ((i4111111111 >> 9) & bb.c.b.f30796me);
                                        int i4111111113 = i411111119;
                                        textFieldDefaults.a(z11117, z11118, eVar, x1Var1116, g2Var1116, pVar23, i4111111112 | (i4111111113 & bb.c.g.f32954lc) | ((i4111111113 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i21 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if ((i12 & 4096) != 0) {
                                g2 g2VarE1113 = e(pVarF, (i33 >> 18) & 14);
                                i33 &= -897;
                                g2Var2 = g2VarE1113;
                            } else {
                                g2Var2 = g2Var;
                            }
                            i35 = i33;
                            if ((i12 & 8192) != 0) {
                                pVar14 = pVarF;
                                i36 = i34;
                                x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                                i35 &= -7169;
                            } else {
                                i36 = i34;
                                pVar14 = pVarF;
                                x1VarR = x1Var;
                            }
                            if ((i12 & 16384) != 0) {
                                if (pVar9 == null) {
                                    m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i33 = (-57345) & i35;
                            } else {
                                m0VarT = m0Var;
                                i33 = i35;
                            }
                            if (i30 != 0) {
                                final boolean z11117 = z13;
                                final x1 x1Var1116 = x1VarR;
                                final g2 g2Var1116 = g2Var2;
                                final int i311111 = i36;
                                final int i4111111110 = i33;
                                pVar15 = pVar14;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                                pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111111) {
                                        if ((i4111111111 & 11) == 2 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1171460386, i4111111111, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                        boolean z11118 = z10;
                                        boolean z11119 = z11117;
                                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                                        x1 x1Var1117 = x1Var1116;
                                        g2 g2Var1117 = g2Var1116;
                                        int i4111111112 = i311111;
                                        int i4111111113 = 196608 | ((i4111111112 >> 6) & 14) | ((i4111111112 >> 15) & 112) | ((i4111111112 >> 9) & bb.c.b.f30796me);
                                        int i4111111114 = i4111111110;
                                        textFieldDefaults.a(z11118, z11119, eVar, x1Var1117, g2Var1117, pVar23, i4111111113 | (i4111111114 & bb.c.g.f32954lc) | ((i4111111114 << 6) & 57344), 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                        a(pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                pVar15 = pVar14;
                                pVarB = pVar6;
                                x1Var2 = x1VarR;
                                m0Var2 = m0VarT;
                            }
                        }
                        pVar15.O();
                        if (ComposerKt.g0()) {
                            i37 = i36;
                            ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                        } else {
                            i37 = i36;
                        }
                        int i4111111111 = i37 << 3;
                        int i4111111112 = i37 >> 9;
                        int i4111111113 = i33 << 21;
                        pVar16 = pVar15;
                        TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i4111111111 & bb.c.b.f30796me) | (i4111111111 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i4111111112 & 57344) | (i4111111112 & 458752) | (i4111111112 & 3670016) | (29360128 & i4111111113) | (234881024 & i4111111113) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i4111111112 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x1Var3 = x1Var2;
                        m0Var3 = m0Var2;
                        pVar17 = pVarB;
                        z14 = z13;
                        pVar18 = pVar9;
                        pVar19 = pVar10;
                        pVar20 = pVar11;
                        pVar21 = pVar12;
                        pVar22 = pVar13;
                        g2Var3 = g2Var2;
                    }
                    u1VarH = pVar16.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111114) {
                            this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                            a(pVar23, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i32 = 1572864;
                i26 |= i32;
                i33 = i26;
                i34 = i13;
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE1114 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE1114;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z11118 = z13;
                            final x1 x1Var1117 = x1VarR;
                            final g2 g2Var1117 = g2Var2;
                            final int i311112 = i36;
                            final int i4111111114 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111115) {
                                    if ((i4111111115 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i4111111115, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z11119 = z10;
                                    boolean z111110 = z11118;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var1118 = x1Var1117;
                                    g2 g2Var1118 = g2Var1117;
                                    int i4111111116 = i311112;
                                    int i4111111117 = 196608 | ((i4111111116 >> 6) & 14) | ((i4111111116 >> 15) & 112) | ((i4111111116 >> 9) & bb.c.b.f30796me);
                                    int i4111111118 = i4111111114;
                                    textFieldDefaults.a(z11119, z111110, eVar, x1Var1118, g2Var1118, pVar23, i4111111117 | (i4111111118 & bb.c.g.f32954lc) | ((i4111111118 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE1115 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE1115;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z11119 = z13;
                            final x1 x1Var1118 = x1VarR;
                            final g2 g2Var1118 = g2Var2;
                            final int i311113 = i36;
                            final int i4111111115 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111116) {
                                    if ((i4111111116 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i4111111116, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z111110 = z10;
                                    boolean z111111 = z11119;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var1119 = x1Var1118;
                                    g2 g2Var1119 = g2Var1118;
                                    int i4111111117 = i311113;
                                    int i4111111118 = 196608 | ((i4111111117 >> 6) & 14) | ((i4111111117 >> 15) & 112) | ((i4111111117 >> 9) & bb.c.b.f30796me);
                                    int i4111111119 = i4111111115;
                                    textFieldDefaults.a(z111110, z111111, eVar, x1Var1119, g2Var1119, pVar23, i4111111118 | (i4111111119 & bb.c.g.f32954lc) | ((i4111111119 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    }
                    pVar15.O();
                    if (ComposerKt.g0()) {
                        i37 = i36;
                        ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                    } else {
                        i37 = i36;
                    }
                    int i4111111116 = i37 << 3;
                    int i4111111117 = i37 >> 9;
                    int i4111111118 = i33 << 21;
                    pVar16 = pVar15;
                    TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i4111111116 & bb.c.b.f30796me) | (i4111111116 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i4111111117 & 57344) | (i4111111117 & 458752) | (i4111111117 & 3670016) | (29360128 & i4111111118) | (234881024 & i4111111118) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i4111111117 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar17 = pVarB;
                    z14 = z13;
                    pVar18 = pVar9;
                    pVar19 = pVar10;
                    pVar20 = pVar11;
                    pVar21 = pVar12;
                    pVar22 = pVar13;
                    g2Var3 = g2Var2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE1116 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE1116;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z111110 = z13;
                            final x1 x1Var1119 = x1VarR;
                            final g2 g2Var1119 = g2Var2;
                            final int i311114 = i36;
                            final int i4111111119 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111111110) {
                                    if ((i41111111110 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i41111111110, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z111111 = z10;
                                    boolean z111112 = z111110;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var11110 = x1Var1119;
                                    g2 g2Var11110 = g2Var1119;
                                    int i41111111111 = i311114;
                                    int i41111111112 = 196608 | ((i41111111111 >> 6) & 14) | ((i41111111111 >> 15) & 112) | ((i41111111111 >> 9) & bb.c.b.f30796me);
                                    int i41111111113 = i4111111119;
                                    textFieldDefaults.a(z111111, z111112, eVar, x1Var11110, g2Var11110, pVar23, i41111111112 | (i41111111113 & bb.c.g.f32954lc) | ((i41111111113 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE1117 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE1117;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z111111 = z13;
                            final x1 x1Var11110 = x1VarR;
                            final g2 g2Var11110 = g2Var2;
                            final int i311115 = i36;
                            final int i41111111110 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111111111) {
                                    if ((i41111111111 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i41111111111, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z111112 = z10;
                                    boolean z111113 = z111111;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var11111 = x1Var11110;
                                    g2 g2Var11111 = g2Var11110;
                                    int i41111111112 = i311115;
                                    int i41111111113 = 196608 | ((i41111111112 >> 6) & 14) | ((i41111111112 >> 15) & 112) | ((i41111111112 >> 9) & bb.c.b.f30796me);
                                    int i41111111114 = i41111111110;
                                    textFieldDefaults.a(z111112, z111113, eVar, x1Var11111, g2Var11111, pVar23, i41111111113 | (i41111111114 & bb.c.g.f32954lc) | ((i41111111114 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    }
                    pVar15.O();
                    if (ComposerKt.g0()) {
                        i37 = i36;
                        ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                    } else {
                        i37 = i36;
                    }
                    int i41111111111 = i37 << 3;
                    int i41111111112 = i37 >> 9;
                    int i41111111113 = i33 << 21;
                    pVar16 = pVar15;
                    TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i41111111111 & bb.c.b.f30796me) | (i41111111111 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i41111111112 & 57344) | (i41111111112 & 458752) | (i41111111112 & 3670016) | (29360128 & i41111111113) | (234881024 & i41111111113) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i41111111112 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar17 = pVarB;
                    z14 = z13;
                    pVar18 = pVar9;
                    pVar19 = pVar10;
                    pVar20 = pVar11;
                    pVar21 = pVar12;
                    pVar22 = pVar13;
                    g2Var3 = g2Var2;
                }
                u1VarH = pVar16.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111111114) {
                        this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                        a(pVar23, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i16 = androidx.profileinstaller.o.c.f26824k;
            i13 |= i16;
            i17 = i12 & 64;
            if (i17 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (pVarF.u(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(pVar)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(pVar2)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= com.google.android.exoplayer2.j.G;
            } else if ((i10 & 1879048192) == 0) {
                if (pVarF.s(pVar3)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (pVarF.s(pVar4)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            i28 = i12 & 2048;
            if (i28 != 0) {
                i26 |= 48;
            } else if ((i11 & 112) == 0) {
                if (pVarF.s(pVar5)) {
                    i29 = 32;
                } else {
                    i29 = 16;
                }
                i26 |= i29;
            }
            if ((i11 & bb.c.b.f30796me) != 0) {
                if ((i12 & 4096) == 0) {
                    i38 = 256;
                }
                i26 |= i38;
            }
            if ((i11 & bb.c.g.f32954lc) != 0) {
                i26 |= ((i12 & 8192) == 0 || !pVarF.s(x1Var)) ? 1024 : 2048;
            }
            if ((i11 & 57344) != 0) {
                i26 |= ((i12 & 16384) == 0 || !pVarF.s(m0Var)) ? 8192 : 16384;
            }
            i30 = i12 & 32768;
            if (i30 != 0) {
                i26 |= androidx.profileinstaller.o.c.f26824k;
                pVar8 = pVar6;
            } else {
                pVar8 = pVar6;
                if ((i11 & 458752) == 0) {
                    if (pVarF.s(pVar8)) {
                        i31 = 131072;
                    } else {
                        i31 = 65536;
                    }
                    i26 |= i31;
                }
            }
            if ((i12 & 65536) != 0) {
                if ((i11 & 3670016) == 0) {
                    if (pVarF.s(this)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                }
                i33 = i26;
                i34 = i13;
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE1118 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE1118;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z111112 = z13;
                            final x1 x1Var11111 = x1VarR;
                            final g2 g2Var11111 = g2Var2;
                            final int i311116 = i36;
                            final int i41111111114 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111111115) {
                                    if ((i41111111115 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i41111111115, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z111113 = z10;
                                    boolean z111114 = z111112;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var11112 = x1Var11111;
                                    g2 g2Var11112 = g2Var11111;
                                    int i41111111116 = i311116;
                                    int i41111111117 = 196608 | ((i41111111116 >> 6) & 14) | ((i41111111116 >> 15) & 112) | ((i41111111116 >> 9) & bb.c.b.f30796me);
                                    int i41111111118 = i41111111114;
                                    textFieldDefaults.a(z111113, z111114, eVar, x1Var11112, g2Var11112, pVar23, i41111111117 | (i41111111118 & bb.c.g.f32954lc) | ((i41111111118 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE1119 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE1119;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z111113 = z13;
                            final x1 x1Var11112 = x1VarR;
                            final g2 g2Var11112 = g2Var2;
                            final int i311117 = i36;
                            final int i41111111115 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111111116) {
                                    if ((i41111111116 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i41111111116, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z111114 = z10;
                                    boolean z111115 = z111113;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var11113 = x1Var11112;
                                    g2 g2Var11113 = g2Var11112;
                                    int i41111111117 = i311117;
                                    int i41111111118 = 196608 | ((i41111111117 >> 6) & 14) | ((i41111111117 >> 15) & 112) | ((i41111111117 >> 9) & bb.c.b.f30796me);
                                    int i41111111119 = i41111111115;
                                    textFieldDefaults.a(z111114, z111115, eVar, x1Var11113, g2Var11113, pVar23, i41111111118 | (i41111111119 & bb.c.g.f32954lc) | ((i41111111119 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    }
                    pVar15.O();
                    if (ComposerKt.g0()) {
                        i37 = i36;
                        ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                    } else {
                        i37 = i36;
                    }
                    int i41111111116 = i37 << 3;
                    int i41111111117 = i37 >> 9;
                    int i41111111118 = i33 << 21;
                    pVar16 = pVar15;
                    TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i41111111116 & bb.c.b.f30796me) | (i41111111116 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i41111111117 & 57344) | (i41111111117 & 458752) | (i41111111117 & 3670016) | (29360128 & i41111111118) | (234881024 & i41111111118) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i41111111117 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar17 = pVarB;
                    z14 = z13;
                    pVar18 = pVar9;
                    pVar19 = pVar10;
                    pVar20 = pVar11;
                    pVar21 = pVar12;
                    pVar22 = pVar13;
                    g2Var3 = g2Var2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE11110 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE11110;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z111114 = z13;
                            final x1 x1Var11113 = x1VarR;
                            final g2 g2Var11113 = g2Var2;
                            final int i311118 = i36;
                            final int i41111111119 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111111110) {
                                    if ((i411111111110 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i411111111110, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z111115 = z10;
                                    boolean z111116 = z111114;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var11114 = x1Var11113;
                                    g2 g2Var11114 = g2Var11113;
                                    int i411111111111 = i311118;
                                    int i411111111112 = 196608 | ((i411111111111 >> 6) & 14) | ((i411111111111 >> 15) & 112) | ((i411111111111 >> 9) & bb.c.b.f30796me);
                                    int i411111111113 = i41111111119;
                                    textFieldDefaults.a(z111115, z111116, eVar, x1Var11114, g2Var11114, pVar23, i411111111112 | (i411111111113 & bb.c.g.f32954lc) | ((i411111111113 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE11111 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE11111;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z111115 = z13;
                            final x1 x1Var11114 = x1VarR;
                            final g2 g2Var11114 = g2Var2;
                            final int i311119 = i36;
                            final int i411111111110 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111111111) {
                                    if ((i411111111111 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i411111111111, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z111116 = z10;
                                    boolean z111117 = z111115;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var11115 = x1Var11114;
                                    g2 g2Var11115 = g2Var11114;
                                    int i411111111112 = i311119;
                                    int i411111111113 = 196608 | ((i411111111112 >> 6) & 14) | ((i411111111112 >> 15) & 112) | ((i411111111112 >> 9) & bb.c.b.f30796me);
                                    int i411111111114 = i411111111110;
                                    textFieldDefaults.a(z111116, z111117, eVar, x1Var11115, g2Var11115, pVar23, i411111111113 | (i411111111114 & bb.c.g.f32954lc) | ((i411111111114 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    }
                    pVar15.O();
                    if (ComposerKt.g0()) {
                        i37 = i36;
                        ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                    } else {
                        i37 = i36;
                    }
                    int i411111111111 = i37 << 3;
                    int i411111111112 = i37 >> 9;
                    int i411111111113 = i33 << 21;
                    pVar16 = pVar15;
                    TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i411111111111 & bb.c.b.f30796me) | (i411111111111 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i411111111112 & 57344) | (i411111111112 & 458752) | (i411111111112 & 3670016) | (29360128 & i411111111113) | (234881024 & i411111111113) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i411111111112 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar17 = pVarB;
                    z14 = z13;
                    pVar18 = pVar9;
                    pVar19 = pVar10;
                    pVar20 = pVar11;
                    pVar21 = pVar12;
                    pVar22 = pVar13;
                    g2Var3 = g2Var2;
                }
                u1VarH = pVar16.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111111114) {
                        this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                        a(pVar23, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i32 = 1572864;
            i26 |= i32;
            i33 = i26;
            i34 = i13;
            if ((i13 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE11112 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE11112;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z111116 = z13;
                        final x1 x1Var11115 = x1VarR;
                        final g2 g2Var11115 = g2Var2;
                        final int i3111110 = i36;
                        final int i411111111114 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111111115) {
                                if ((i411111111115 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i411111111115, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z111117 = z10;
                                boolean z111118 = z111116;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var11116 = x1Var11115;
                                g2 g2Var11116 = g2Var11115;
                                int i411111111116 = i3111110;
                                int i411111111117 = 196608 | ((i411111111116 >> 6) & 14) | ((i411111111116 >> 15) & 112) | ((i411111111116 >> 9) & bb.c.b.f30796me);
                                int i411111111118 = i411111111114;
                                textFieldDefaults.a(z111117, z111118, eVar, x1Var11116, g2Var11116, pVar23, i411111111117 | (i411111111118 & bb.c.g.f32954lc) | ((i411111111118 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE11113 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE11113;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z111117 = z13;
                        final x1 x1Var11116 = x1VarR;
                        final g2 g2Var11116 = g2Var2;
                        final int i3111111 = i36;
                        final int i411111111115 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111111116) {
                                if ((i411111111116 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i411111111116, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z111118 = z10;
                                boolean z111119 = z111117;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var11117 = x1Var11116;
                                g2 g2Var11117 = g2Var11116;
                                int i411111111117 = i3111111;
                                int i411111111118 = 196608 | ((i411111111117 >> 6) & 14) | ((i411111111117 >> 15) & 112) | ((i411111111117 >> 9) & bb.c.b.f30796me);
                                int i411111111119 = i411111111115;
                                textFieldDefaults.a(z111118, z111119, eVar, x1Var11117, g2Var11117, pVar23, i411111111118 | (i411111111119 & bb.c.g.f32954lc) | ((i411111111119 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                }
                pVar15.O();
                if (ComposerKt.g0()) {
                    i37 = i36;
                    ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                } else {
                    i37 = i36;
                }
                int i411111111116 = i37 << 3;
                int i411111111117 = i37 >> 9;
                int i411111111118 = i33 << 21;
                pVar16 = pVar15;
                TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i411111111116 & bb.c.b.f30796me) | (i411111111116 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i411111111117 & 57344) | (i411111111117 & 458752) | (i411111111117 & 3670016) | (29360128 & i411111111118) | (234881024 & i411111111118) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i411111111117 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x1Var3 = x1Var2;
                m0Var3 = m0Var2;
                pVar17 = pVarB;
                z14 = z13;
                pVar18 = pVar9;
                pVar19 = pVar10;
                pVar20 = pVar11;
                pVar21 = pVar12;
                pVar22 = pVar13;
                g2Var3 = g2Var2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE11114 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE11114;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z111118 = z13;
                        final x1 x1Var11117 = x1VarR;
                        final g2 g2Var11117 = g2Var2;
                        final int i3111112 = i36;
                        final int i411111111119 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111111110) {
                                if ((i4111111111110 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i4111111111110, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z111119 = z10;
                                boolean z1111110 = z111118;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var11118 = x1Var11117;
                                g2 g2Var11118 = g2Var11117;
                                int i4111111111111 = i3111112;
                                int i4111111111112 = 196608 | ((i4111111111111 >> 6) & 14) | ((i4111111111111 >> 15) & 112) | ((i4111111111111 >> 9) & bb.c.b.f30796me);
                                int i4111111111113 = i411111111119;
                                textFieldDefaults.a(z111119, z1111110, eVar, x1Var11118, g2Var11118, pVar23, i4111111111112 | (i4111111111113 & bb.c.g.f32954lc) | ((i4111111111113 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE11115 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE11115;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z111119 = z13;
                        final x1 x1Var11118 = x1VarR;
                        final g2 g2Var11118 = g2Var2;
                        final int i3111113 = i36;
                        final int i4111111111110 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111111111) {
                                if ((i4111111111111 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i4111111111111, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z1111110 = z10;
                                boolean z1111111 = z111119;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var11119 = x1Var11118;
                                g2 g2Var11119 = g2Var11118;
                                int i4111111111112 = i3111113;
                                int i4111111111113 = 196608 | ((i4111111111112 >> 6) & 14) | ((i4111111111112 >> 15) & 112) | ((i4111111111112 >> 9) & bb.c.b.f30796me);
                                int i4111111111114 = i4111111111110;
                                textFieldDefaults.a(z1111110, z1111111, eVar, x1Var11119, g2Var11119, pVar23, i4111111111113 | (i4111111111114 & bb.c.g.f32954lc) | ((i4111111111114 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                }
                pVar15.O();
                if (ComposerKt.g0()) {
                    i37 = i36;
                    ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                } else {
                    i37 = i36;
                }
                int i4111111111111 = i37 << 3;
                int i4111111111112 = i37 >> 9;
                int i4111111111113 = i33 << 21;
                pVar16 = pVar15;
                TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i4111111111111 & bb.c.b.f30796me) | (i4111111111111 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i4111111111112 & 57344) | (i4111111111112 & 458752) | (i4111111111112 & 3670016) | (29360128 & i4111111111113) | (234881024 & i4111111111113) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i4111111111112 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x1Var3 = x1Var2;
                m0Var3 = m0Var2;
                pVar17 = pVarB;
                z14 = z13;
                pVar18 = pVar9;
                pVar19 = pVar10;
                pVar20 = pVar11;
                pVar21 = pVar12;
                pVar22 = pVar13;
                g2Var3 = g2Var2;
            }
            u1VarH = pVar16.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111111114) {
                    this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                    a(pVar23, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= bb.c.d.f31193dj;
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (pVarF.s(visualTransformation)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i13 |= i15;
        }
        if ((i12 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (pVarF.s(interactionSource)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
            }
            i17 = i12 & 64;
            if (i17 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (pVarF.u(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(pVar)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(pVar2)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= com.google.android.exoplayer2.j.G;
            } else if ((i10 & 1879048192) == 0) {
                if (pVarF.s(pVar3)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (pVarF.s(pVar4)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            i28 = i12 & 2048;
            if (i28 != 0) {
                i26 |= 48;
            } else if ((i11 & 112) == 0) {
                if (pVarF.s(pVar5)) {
                    i29 = 32;
                } else {
                    i29 = 16;
                }
                i26 |= i29;
            }
            if ((i11 & bb.c.b.f30796me) != 0) {
                if ((i12 & 4096) == 0) {
                    i38 = 256;
                }
                i26 |= i38;
            }
            if ((i11 & bb.c.g.f32954lc) != 0) {
                i26 |= ((i12 & 8192) == 0 || !pVarF.s(x1Var)) ? 1024 : 2048;
            }
            if ((i11 & 57344) != 0) {
                i26 |= ((i12 & 16384) == 0 || !pVarF.s(m0Var)) ? 8192 : 16384;
            }
            i30 = i12 & 32768;
            if (i30 != 0) {
                i26 |= androidx.profileinstaller.o.c.f26824k;
                pVar8 = pVar6;
            } else {
                pVar8 = pVar6;
                if ((i11 & 458752) == 0) {
                    if (pVarF.s(pVar8)) {
                        i31 = 131072;
                    } else {
                        i31 = 65536;
                    }
                    i26 |= i31;
                }
            }
            if ((i12 & 65536) != 0) {
                if ((i11 & 3670016) == 0) {
                    if (pVarF.s(this)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                }
                i33 = i26;
                i34 = i13;
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE11116 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE11116;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z1111110 = z13;
                            final x1 x1Var11119 = x1VarR;
                            final g2 g2Var11119 = g2Var2;
                            final int i3111114 = i36;
                            final int i4111111111114 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111111115) {
                                    if ((i4111111111115 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i4111111111115, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1111111 = z10;
                                    boolean z1111112 = z1111110;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var111110 = x1Var11119;
                                    g2 g2Var111110 = g2Var11119;
                                    int i4111111111116 = i3111114;
                                    int i4111111111117 = 196608 | ((i4111111111116 >> 6) & 14) | ((i4111111111116 >> 15) & 112) | ((i4111111111116 >> 9) & bb.c.b.f30796me);
                                    int i4111111111118 = i4111111111114;
                                    textFieldDefaults.a(z1111111, z1111112, eVar, x1Var111110, g2Var111110, pVar23, i4111111111117 | (i4111111111118 & bb.c.g.f32954lc) | ((i4111111111118 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE11117 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE11117;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z1111111 = z13;
                            final x1 x1Var111110 = x1VarR;
                            final g2 g2Var111110 = g2Var2;
                            final int i3111115 = i36;
                            final int i4111111111115 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111111116) {
                                    if ((i4111111111116 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i4111111111116, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1111112 = z10;
                                    boolean z1111113 = z1111111;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var111111 = x1Var111110;
                                    g2 g2Var111111 = g2Var111110;
                                    int i4111111111117 = i3111115;
                                    int i4111111111118 = 196608 | ((i4111111111117 >> 6) & 14) | ((i4111111111117 >> 15) & 112) | ((i4111111111117 >> 9) & bb.c.b.f30796me);
                                    int i4111111111119 = i4111111111115;
                                    textFieldDefaults.a(z1111112, z1111113, eVar, x1Var111111, g2Var111111, pVar23, i4111111111118 | (i4111111111119 & bb.c.g.f32954lc) | ((i4111111111119 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    }
                    pVar15.O();
                    if (ComposerKt.g0()) {
                        i37 = i36;
                        ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                    } else {
                        i37 = i36;
                    }
                    int i4111111111116 = i37 << 3;
                    int i4111111111117 = i37 >> 9;
                    int i4111111111118 = i33 << 21;
                    pVar16 = pVar15;
                    TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i4111111111116 & bb.c.b.f30796me) | (i4111111111116 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i4111111111117 & 57344) | (i4111111111117 & 458752) | (i4111111111117 & 3670016) | (29360128 & i4111111111118) | (234881024 & i4111111111118) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i4111111111117 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar17 = pVarB;
                    z14 = z13;
                    pVar18 = pVar9;
                    pVar19 = pVar10;
                    pVar20 = pVar11;
                    pVar21 = pVar12;
                    pVar22 = pVar13;
                    g2Var3 = g2Var2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE11118 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE11118;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z1111112 = z13;
                            final x1 x1Var111111 = x1VarR;
                            final g2 g2Var111111 = g2Var2;
                            final int i3111116 = i36;
                            final int i4111111111119 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111111111110) {
                                    if ((i41111111111110 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i41111111111110, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1111113 = z10;
                                    boolean z1111114 = z1111112;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var111112 = x1Var111111;
                                    g2 g2Var111112 = g2Var111111;
                                    int i41111111111111 = i3111116;
                                    int i41111111111112 = 196608 | ((i41111111111111 >> 6) & 14) | ((i41111111111111 >> 15) & 112) | ((i41111111111111 >> 9) & bb.c.b.f30796me);
                                    int i41111111111113 = i4111111111119;
                                    textFieldDefaults.a(z1111113, z1111114, eVar, x1Var111112, g2Var111112, pVar23, i41111111111112 | (i41111111111113 & bb.c.g.f32954lc) | ((i41111111111113 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i21 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if ((i12 & 4096) != 0) {
                            g2 g2VarE11119 = e(pVarF, (i33 >> 18) & 14);
                            i33 &= -897;
                            g2Var2 = g2VarE11119;
                        } else {
                            g2Var2 = g2Var;
                        }
                        i35 = i33;
                        if ((i12 & 8192) != 0) {
                            pVar14 = pVarF;
                            i36 = i34;
                            x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                            i35 &= -7169;
                        } else {
                            i36 = i34;
                            pVar14 = pVarF;
                            x1VarR = x1Var;
                        }
                        if ((i12 & 16384) != 0) {
                            if (pVar9 == null) {
                                m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i33 = (-57345) & i35;
                        } else {
                            m0VarT = m0Var;
                            i33 = i35;
                        }
                        if (i30 != 0) {
                            final boolean z1111113 = z13;
                            final x1 x1Var111112 = x1VarR;
                            final g2 g2Var111112 = g2Var2;
                            final int i3111117 = i36;
                            final int i41111111111110 = i33;
                            pVar15 = pVar14;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                            pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111111111111) {
                                    if ((i41111111111111 & 11) == 2 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1171460386, i41111111111111, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                    boolean z1111114 = z10;
                                    boolean z1111115 = z1111113;
                                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                                    x1 x1Var111113 = x1Var111112;
                                    g2 g2Var111113 = g2Var111112;
                                    int i41111111111112 = i3111117;
                                    int i41111111111113 = 196608 | ((i41111111111112 >> 6) & 14) | ((i41111111111112 >> 15) & 112) | ((i41111111111112 >> 9) & bb.c.b.f30796me);
                                    int i41111111111114 = i41111111111110;
                                    textFieldDefaults.a(z1111114, z1111115, eVar, x1Var111113, g2Var111113, pVar23, i41111111111113 | (i41111111111114 & bb.c.g.f32954lc) | ((i41111111111114 << 6) & 57344), 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                    a(pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            pVar15 = pVar14;
                            pVarB = pVar6;
                            x1Var2 = x1VarR;
                            m0Var2 = m0VarT;
                        }
                    }
                    pVar15.O();
                    if (ComposerKt.g0()) {
                        i37 = i36;
                        ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                    } else {
                        i37 = i36;
                    }
                    int i41111111111111 = i37 << 3;
                    int i41111111111112 = i37 >> 9;
                    int i41111111111113 = i33 << 21;
                    pVar16 = pVar15;
                    TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i41111111111111 & bb.c.b.f30796me) | (i41111111111111 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i41111111111112 & 57344) | (i41111111111112 & 458752) | (i41111111111112 & 3670016) | (29360128 & i41111111111113) | (234881024 & i41111111111113) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i41111111111112 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x1Var3 = x1Var2;
                    m0Var3 = m0Var2;
                    pVar17 = pVarB;
                    z14 = z13;
                    pVar18 = pVar9;
                    pVar19 = pVar10;
                    pVar20 = pVar11;
                    pVar21 = pVar12;
                    pVar22 = pVar13;
                    g2Var3 = g2Var2;
                }
                u1VarH = pVar16.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111111111114) {
                        this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                        a(pVar23, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i32 = 1572864;
            i26 |= i32;
            i33 = i26;
            i34 = i13;
            if ((i13 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE111110 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE111110;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z1111114 = z13;
                        final x1 x1Var111113 = x1VarR;
                        final g2 g2Var111113 = g2Var2;
                        final int i3111118 = i36;
                        final int i41111111111114 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111111111115) {
                                if ((i41111111111115 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i41111111111115, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z1111115 = z10;
                                boolean z1111116 = z1111114;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var111114 = x1Var111113;
                                g2 g2Var111114 = g2Var111113;
                                int i41111111111116 = i3111118;
                                int i41111111111117 = 196608 | ((i41111111111116 >> 6) & 14) | ((i41111111111116 >> 15) & 112) | ((i41111111111116 >> 9) & bb.c.b.f30796me);
                                int i41111111111118 = i41111111111114;
                                textFieldDefaults.a(z1111115, z1111116, eVar, x1Var111114, g2Var111114, pVar23, i41111111111117 | (i41111111111118 & bb.c.g.f32954lc) | ((i41111111111118 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE111111 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE111111;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z1111115 = z13;
                        final x1 x1Var111114 = x1VarR;
                        final g2 g2Var111114 = g2Var2;
                        final int i3111119 = i36;
                        final int i41111111111115 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111111111116) {
                                if ((i41111111111116 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i41111111111116, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z1111116 = z10;
                                boolean z1111117 = z1111115;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var111115 = x1Var111114;
                                g2 g2Var111115 = g2Var111114;
                                int i41111111111117 = i3111119;
                                int i41111111111118 = 196608 | ((i41111111111117 >> 6) & 14) | ((i41111111111117 >> 15) & 112) | ((i41111111111117 >> 9) & bb.c.b.f30796me);
                                int i41111111111119 = i41111111111115;
                                textFieldDefaults.a(z1111116, z1111117, eVar, x1Var111115, g2Var111115, pVar23, i41111111111118 | (i41111111111119 & bb.c.g.f32954lc) | ((i41111111111119 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                }
                pVar15.O();
                if (ComposerKt.g0()) {
                    i37 = i36;
                    ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                } else {
                    i37 = i36;
                }
                int i41111111111116 = i37 << 3;
                int i41111111111117 = i37 >> 9;
                int i41111111111118 = i33 << 21;
                pVar16 = pVar15;
                TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i41111111111116 & bb.c.b.f30796me) | (i41111111111116 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i41111111111117 & 57344) | (i41111111111117 & 458752) | (i41111111111117 & 3670016) | (29360128 & i41111111111118) | (234881024 & i41111111111118) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i41111111111117 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x1Var3 = x1Var2;
                m0Var3 = m0Var2;
                pVar17 = pVarB;
                z14 = z13;
                pVar18 = pVar9;
                pVar19 = pVar10;
                pVar20 = pVar11;
                pVar21 = pVar12;
                pVar22 = pVar13;
                g2Var3 = g2Var2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE111112 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE111112;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z1111116 = z13;
                        final x1 x1Var111115 = x1VarR;
                        final g2 g2Var111115 = g2Var2;
                        final int i31111110 = i36;
                        final int i41111111111119 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111111111110) {
                                if ((i411111111111110 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i411111111111110, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z1111117 = z10;
                                boolean z1111118 = z1111116;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var111116 = x1Var111115;
                                g2 g2Var111116 = g2Var111115;
                                int i411111111111111 = i31111110;
                                int i411111111111112 = 196608 | ((i411111111111111 >> 6) & 14) | ((i411111111111111 >> 15) & 112) | ((i411111111111111 >> 9) & bb.c.b.f30796me);
                                int i411111111111113 = i41111111111119;
                                textFieldDefaults.a(z1111117, z1111118, eVar, x1Var111116, g2Var111116, pVar23, i411111111111112 | (i411111111111113 & bb.c.g.f32954lc) | ((i411111111111113 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE111113 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE111113;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z1111117 = z13;
                        final x1 x1Var111116 = x1VarR;
                        final g2 g2Var111116 = g2Var2;
                        final int i31111111 = i36;
                        final int i411111111111110 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111111111111) {
                                if ((i411111111111111 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i411111111111111, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z1111118 = z10;
                                boolean z1111119 = z1111117;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var111117 = x1Var111116;
                                g2 g2Var111117 = g2Var111116;
                                int i411111111111112 = i31111111;
                                int i411111111111113 = 196608 | ((i411111111111112 >> 6) & 14) | ((i411111111111112 >> 15) & 112) | ((i411111111111112 >> 9) & bb.c.b.f30796me);
                                int i411111111111114 = i411111111111110;
                                textFieldDefaults.a(z1111118, z1111119, eVar, x1Var111117, g2Var111117, pVar23, i411111111111113 | (i411111111111114 & bb.c.g.f32954lc) | ((i411111111111114 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                }
                pVar15.O();
                if (ComposerKt.g0()) {
                    i37 = i36;
                    ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                } else {
                    i37 = i36;
                }
                int i411111111111111 = i37 << 3;
                int i411111111111112 = i37 >> 9;
                int i411111111111113 = i33 << 21;
                pVar16 = pVar15;
                TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i411111111111111 & bb.c.b.f30796me) | (i411111111111111 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i411111111111112 & 57344) | (i411111111111112 & 458752) | (i411111111111112 & 3670016) | (29360128 & i411111111111113) | (234881024 & i411111111111113) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i411111111111112 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x1Var3 = x1Var2;
                m0Var3 = m0Var2;
                pVar17 = pVarB;
                z14 = z13;
                pVar18 = pVar9;
                pVar19 = pVar10;
                pVar20 = pVar11;
                pVar21 = pVar12;
                pVar22 = pVar13;
                g2Var3 = g2Var2;
            }
            u1VarH = pVar16.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111111111114) {
                    this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                    a(pVar23, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i16 = androidx.profileinstaller.o.c.f26824k;
        i13 |= i16;
        i17 = i12 & 64;
        if (i17 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (pVarF.u(z12)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i13 |= i18;
        }
        i19 = i12 & 128;
        if (i19 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (pVarF.s(pVar)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i13 |= i20;
        }
        i21 = i12 & 256;
        if (i21 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (pVarF.s(pVar2)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i13 |= i22;
        }
        i23 = i12 & 512;
        if (i23 != 0) {
            i13 |= com.google.android.exoplayer2.j.G;
        } else if ((i10 & 1879048192) == 0) {
            if (pVarF.s(pVar3)) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i13 |= i24;
        }
        i25 = i12 & 1024;
        if (i25 != 0) {
            i26 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (pVarF.s(pVar4)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i26 = i11 | i27;
        } else {
            i26 = i11;
        }
        i28 = i12 & 2048;
        if (i28 != 0) {
            i26 |= 48;
        } else if ((i11 & 112) == 0) {
            if (pVarF.s(pVar5)) {
                i29 = 32;
            } else {
                i29 = 16;
            }
            i26 |= i29;
        }
        if ((i11 & bb.c.b.f30796me) != 0) {
            if ((i12 & 4096) == 0) {
                i38 = 256;
            }
            i26 |= i38;
        }
        if ((i11 & bb.c.g.f32954lc) != 0) {
            i26 |= ((i12 & 8192) == 0 || !pVarF.s(x1Var)) ? 1024 : 2048;
        }
        if ((i11 & 57344) != 0) {
            i26 |= ((i12 & 16384) == 0 || !pVarF.s(m0Var)) ? 8192 : 16384;
        }
        i30 = i12 & 32768;
        if (i30 != 0) {
            i26 |= androidx.profileinstaller.o.c.f26824k;
            pVar8 = pVar6;
        } else {
            pVar8 = pVar6;
            if ((i11 & 458752) == 0) {
                if (pVarF.s(pVar8)) {
                    i31 = 131072;
                } else {
                    i31 = 65536;
                }
                i26 |= i31;
            }
        }
        if ((i12 & 65536) != 0) {
            if ((i11 & 3670016) == 0) {
                if (pVarF.s(this)) {
                    i32 = 1048576;
                } else {
                    i32 = 524288;
                }
            }
            i33 = i26;
            i34 = i13;
            if ((i13 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE111114 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE111114;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z1111118 = z13;
                        final x1 x1Var111117 = x1VarR;
                        final g2 g2Var111117 = g2Var2;
                        final int i31111112 = i36;
                        final int i411111111111114 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111111111115) {
                                if ((i411111111111115 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i411111111111115, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z1111119 = z10;
                                boolean z11111110 = z1111118;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var111118 = x1Var111117;
                                g2 g2Var111118 = g2Var111117;
                                int i411111111111116 = i31111112;
                                int i411111111111117 = 196608 | ((i411111111111116 >> 6) & 14) | ((i411111111111116 >> 15) & 112) | ((i411111111111116 >> 9) & bb.c.b.f30796me);
                                int i411111111111118 = i411111111111114;
                                textFieldDefaults.a(z1111119, z11111110, eVar, x1Var111118, g2Var111118, pVar23, i411111111111117 | (i411111111111118 & bb.c.g.f32954lc) | ((i411111111111118 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE111115 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE111115;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z1111119 = z13;
                        final x1 x1Var111118 = x1VarR;
                        final g2 g2Var111118 = g2Var2;
                        final int i31111113 = i36;
                        final int i411111111111115 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i411111111111116) {
                                if ((i411111111111116 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i411111111111116, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z11111110 = z10;
                                boolean z11111111 = z1111119;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var111119 = x1Var111118;
                                g2 g2Var111119 = g2Var111118;
                                int i411111111111117 = i31111113;
                                int i411111111111118 = 196608 | ((i411111111111117 >> 6) & 14) | ((i411111111111117 >> 15) & 112) | ((i411111111111117 >> 9) & bb.c.b.f30796me);
                                int i411111111111119 = i411111111111115;
                                textFieldDefaults.a(z11111110, z11111111, eVar, x1Var111119, g2Var111119, pVar23, i411111111111118 | (i411111111111119 & bb.c.g.f32954lc) | ((i411111111111119 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                }
                pVar15.O();
                if (ComposerKt.g0()) {
                    i37 = i36;
                    ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                } else {
                    i37 = i36;
                }
                int i411111111111116 = i37 << 3;
                int i411111111111117 = i37 >> 9;
                int i411111111111118 = i33 << 21;
                pVar16 = pVar15;
                TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i411111111111116 & bb.c.b.f30796me) | (i411111111111116 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i411111111111117 & 57344) | (i411111111111117 & 458752) | (i411111111111117 & 3670016) | (29360128 & i411111111111118) | (234881024 & i411111111111118) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i411111111111117 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x1Var3 = x1Var2;
                m0Var3 = m0Var2;
                pVar17 = pVarB;
                z14 = z13;
                pVar18 = pVar9;
                pVar19 = pVar10;
                pVar20 = pVar11;
                pVar21 = pVar12;
                pVar22 = pVar13;
                g2Var3 = g2Var2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE111116 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE111116;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z11111110 = z13;
                        final x1 x1Var111119 = x1VarR;
                        final g2 g2Var111119 = g2Var2;
                        final int i31111114 = i36;
                        final int i411111111111119 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111111111110) {
                                if ((i4111111111111110 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i4111111111111110, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z11111111 = z10;
                                boolean z11111112 = z11111110;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var1111110 = x1Var111119;
                                g2 g2Var1111110 = g2Var111119;
                                int i4111111111111111 = i31111114;
                                int i4111111111111112 = 196608 | ((i4111111111111111 >> 6) & 14) | ((i4111111111111111 >> 15) & 112) | ((i4111111111111111 >> 9) & bb.c.b.f30796me);
                                int i4111111111111113 = i411111111111119;
                                textFieldDefaults.a(z11111111, z11111112, eVar, x1Var1111110, g2Var1111110, pVar23, i4111111111111112 | (i4111111111111113 & bb.c.g.f32954lc) | ((i4111111111111113 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i21 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if ((i12 & 4096) != 0) {
                        g2 g2VarE111117 = e(pVarF, (i33 >> 18) & 14);
                        i33 &= -897;
                        g2Var2 = g2VarE111117;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i35 = i33;
                    if ((i12 & 8192) != 0) {
                        pVar14 = pVarF;
                        i36 = i34;
                        x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                        i35 &= -7169;
                    } else {
                        i36 = i34;
                        pVar14 = pVarF;
                        x1VarR = x1Var;
                    }
                    if ((i12 & 16384) != 0) {
                        if (pVar9 == null) {
                            m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i33 = (-57345) & i35;
                    } else {
                        m0VarT = m0Var;
                        i33 = i35;
                    }
                    if (i30 != 0) {
                        final boolean z11111111 = z13;
                        final x1 x1Var1111110 = x1VarR;
                        final g2 g2Var1111110 = g2Var2;
                        final int i31111115 = i36;
                        final int i4111111111111110 = i33;
                        pVar15 = pVar14;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                        pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111111111111) {
                                if ((i4111111111111111 & 11) == 2 && pVar23.b()) {
                                    pVar23.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1171460386, i4111111111111111, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                }
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                boolean z11111112 = z10;
                                boolean z11111113 = z11111111;
                                androidx.compose.foundation.interaction.e eVar = interactionSource;
                                x1 x1Var1111111 = x1Var1111110;
                                g2 g2Var1111111 = g2Var1111110;
                                int i4111111111111112 = i31111115;
                                int i4111111111111113 = 196608 | ((i4111111111111112 >> 6) & 14) | ((i4111111111111112 >> 15) & 112) | ((i4111111111111112 >> 9) & bb.c.b.f30796me);
                                int i4111111111111114 = i4111111111111110;
                                textFieldDefaults.a(z11111112, z11111113, eVar, x1Var1111111, g2Var1111111, pVar23, i4111111111111113 | (i4111111111111114 & bb.c.g.f32954lc) | ((i4111111111111114 << 6) & 57344), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                                a(pVar23, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        pVar15 = pVar14;
                        pVarB = pVar6;
                        x1Var2 = x1VarR;
                        m0Var2 = m0VarT;
                    }
                }
                pVar15.O();
                if (ComposerKt.g0()) {
                    i37 = i36;
                    ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                } else {
                    i37 = i36;
                }
                int i4111111111111111 = i37 << 3;
                int i4111111111111112 = i37 >> 9;
                int i4111111111111113 = i33 << 21;
                pVar16 = pVar15;
                TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i4111111111111111 & bb.c.b.f30796me) | (i4111111111111111 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i4111111111111112 & 57344) | (i4111111111111112 & 458752) | (i4111111111111112 & 3670016) | (29360128 & i4111111111111113) | (234881024 & i4111111111111113) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i4111111111111112 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x1Var3 = x1Var2;
                m0Var3 = m0Var2;
                pVar17 = pVarB;
                z14 = z13;
                pVar18 = pVar9;
                pVar19 = pVar10;
                pVar20 = pVar11;
                pVar21 = pVar12;
                pVar22 = pVar13;
                g2Var3 = g2Var2;
            }
            u1VarH = pVar16.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111111111114) {
                    this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                    a(pVar23, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i32 = 1572864;
        i26 |= i32;
        i33 = i26;
        i34 = i13;
        if ((i13 & 1533916891) != 306783378) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar;
                }
                if (i21 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar2;
                }
                if (i23 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar3;
                }
                if (i25 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar4;
                }
                if (i28 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar5;
                }
                if ((i12 & 4096) != 0) {
                    g2 g2VarE111118 = e(pVarF, (i33 >> 18) & 14);
                    i33 &= -897;
                    g2Var2 = g2VarE111118;
                } else {
                    g2Var2 = g2Var;
                }
                i35 = i33;
                if ((i12 & 8192) != 0) {
                    pVar14 = pVarF;
                    i36 = i34;
                    x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                    i35 &= -7169;
                } else {
                    i36 = i34;
                    pVar14 = pVarF;
                    x1VarR = x1Var;
                }
                if ((i12 & 16384) != 0) {
                    if (pVar9 == null) {
                        m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    i33 = (-57345) & i35;
                } else {
                    m0VarT = m0Var;
                    i33 = i35;
                }
                if (i30 != 0) {
                    final boolean z11111112 = z13;
                    final x1 x1Var1111111 = x1VarR;
                    final g2 g2Var1111111 = g2Var2;
                    final int i31111116 = i36;
                    final int i4111111111111114 = i33;
                    pVar15 = pVar14;
                    x1Var2 = x1VarR;
                    m0Var2 = m0VarT;
                    pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111111111115) {
                            if ((i4111111111111115 & 11) == 2 && pVar23.b()) {
                                pVar23.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1171460386, i4111111111111115, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                            }
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            boolean z11111113 = z10;
                            boolean z11111114 = z11111112;
                            androidx.compose.foundation.interaction.e eVar = interactionSource;
                            x1 x1Var1111112 = x1Var1111111;
                            g2 g2Var1111112 = g2Var1111111;
                            int i4111111111111116 = i31111116;
                            int i4111111111111117 = 196608 | ((i4111111111111116 >> 6) & 14) | ((i4111111111111116 >> 15) & 112) | ((i4111111111111116 >> 9) & bb.c.b.f30796me);
                            int i4111111111111118 = i4111111111111114;
                            textFieldDefaults.a(z11111113, z11111114, eVar, x1Var1111112, g2Var1111112, pVar23, i4111111111111117 | (i4111111111111118 & bb.c.g.f32954lc) | ((i4111111111111118 << 6) & 57344), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                            a(pVar23, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    pVar15 = pVar14;
                    pVarB = pVar6;
                    x1Var2 = x1VarR;
                    m0Var2 = m0VarT;
                }
            } else {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar;
                }
                if (i21 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar2;
                }
                if (i23 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar3;
                }
                if (i25 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar4;
                }
                if (i28 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar5;
                }
                if ((i12 & 4096) != 0) {
                    g2 g2VarE111119 = e(pVarF, (i33 >> 18) & 14);
                    i33 &= -897;
                    g2Var2 = g2VarE111119;
                } else {
                    g2Var2 = g2Var;
                }
                i35 = i33;
                if ((i12 & 8192) != 0) {
                    pVar14 = pVarF;
                    i36 = i34;
                    x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                    i35 &= -7169;
                } else {
                    i36 = i34;
                    pVar14 = pVarF;
                    x1VarR = x1Var;
                }
                if ((i12 & 16384) != 0) {
                    if (pVar9 == null) {
                        m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    i33 = (-57345) & i35;
                } else {
                    m0VarT = m0Var;
                    i33 = i35;
                }
                if (i30 != 0) {
                    final boolean z11111113 = z13;
                    final x1 x1Var1111112 = x1VarR;
                    final g2 g2Var1111112 = g2Var2;
                    final int i31111117 = i36;
                    final int i4111111111111115 = i33;
                    pVar15 = pVar14;
                    x1Var2 = x1VarR;
                    m0Var2 = m0VarT;
                    pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar23, int i4111111111111116) {
                            if ((i4111111111111116 & 11) == 2 && pVar23.b()) {
                                pVar23.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1171460386, i4111111111111116, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                            }
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            boolean z11111114 = z10;
                            boolean z11111115 = z11111113;
                            androidx.compose.foundation.interaction.e eVar = interactionSource;
                            x1 x1Var1111113 = x1Var1111112;
                            g2 g2Var1111113 = g2Var1111112;
                            int i4111111111111117 = i31111117;
                            int i4111111111111118 = 196608 | ((i4111111111111117 >> 6) & 14) | ((i4111111111111117 >> 15) & 112) | ((i4111111111111117 >> 9) & bb.c.b.f30796me);
                            int i4111111111111119 = i4111111111111115;
                            textFieldDefaults.a(z11111114, z11111115, eVar, x1Var1111113, g2Var1111113, pVar23, i4111111111111118 | (i4111111111111119 & bb.c.g.f32954lc) | ((i4111111111111119 << 6) & 57344), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                            a(pVar23, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    pVar15 = pVar14;
                    pVarB = pVar6;
                    x1Var2 = x1VarR;
                    m0Var2 = m0VarT;
                }
            }
            pVar15.O();
            if (ComposerKt.g0()) {
                i37 = i36;
                ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
            } else {
                i37 = i36;
            }
            int i4111111111111116 = i37 << 3;
            int i4111111111111117 = i37 >> 9;
            int i4111111111111118 = i33 << 21;
            pVar16 = pVar15;
            TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i4111111111111116 & bb.c.b.f30796me) | (i4111111111111116 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i4111111111111117 & 57344) | (i4111111111111117 & 458752) | (i4111111111111117 & 3670016) | (29360128 & i4111111111111118) | (234881024 & i4111111111111118) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i4111111111111117 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            x1Var3 = x1Var2;
            m0Var3 = m0Var2;
            pVar17 = pVarB;
            z14 = z13;
            pVar18 = pVar9;
            pVar19 = pVar10;
            pVar20 = pVar11;
            pVar21 = pVar12;
            pVar22 = pVar13;
            g2Var3 = g2Var2;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar;
                }
                if (i21 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar2;
                }
                if (i23 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar3;
                }
                if (i25 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar4;
                }
                if (i28 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar5;
                }
                if ((i12 & 4096) != 0) {
                    g2 g2VarE1111110 = e(pVarF, (i33 >> 18) & 14);
                    i33 &= -897;
                    g2Var2 = g2VarE1111110;
                } else {
                    g2Var2 = g2Var;
                }
                i35 = i33;
                if ((i12 & 8192) != 0) {
                    pVar14 = pVarF;
                    i36 = i34;
                    x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                    i35 &= -7169;
                } else {
                    i36 = i34;
                    pVar14 = pVarF;
                    x1VarR = x1Var;
                }
                if ((i12 & 16384) != 0) {
                    if (pVar9 == null) {
                        m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    i33 = (-57345) & i35;
                } else {
                    m0VarT = m0Var;
                    i33 = i35;
                }
                if (i30 != 0) {
                    final boolean z11111114 = z13;
                    final x1 x1Var1111113 = x1VarR;
                    final g2 g2Var1111113 = g2Var2;
                    final int i31111118 = i36;
                    final int i4111111111111119 = i33;
                    pVar15 = pVar14;
                    x1Var2 = x1VarR;
                    m0Var2 = m0VarT;
                    pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111111111111110) {
                            if ((i41111111111111110 & 11) == 2 && pVar23.b()) {
                                pVar23.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1171460386, i41111111111111110, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                            }
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            boolean z11111115 = z10;
                            boolean z11111116 = z11111114;
                            androidx.compose.foundation.interaction.e eVar = interactionSource;
                            x1 x1Var1111114 = x1Var1111113;
                            g2 g2Var1111114 = g2Var1111113;
                            int i41111111111111111 = i31111118;
                            int i41111111111111112 = 196608 | ((i41111111111111111 >> 6) & 14) | ((i41111111111111111 >> 15) & 112) | ((i41111111111111111 >> 9) & bb.c.b.f30796me);
                            int i41111111111111113 = i4111111111111119;
                            textFieldDefaults.a(z11111115, z11111116, eVar, x1Var1111114, g2Var1111114, pVar23, i41111111111111112 | (i41111111111111113 & bb.c.g.f32954lc) | ((i41111111111111113 << 6) & 57344), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                            a(pVar23, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    pVar15 = pVar14;
                    pVarB = pVar6;
                    x1Var2 = x1VarR;
                    m0Var2 = m0VarT;
                }
            } else {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar;
                }
                if (i21 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar2;
                }
                if (i23 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar3;
                }
                if (i25 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar4;
                }
                if (i28 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar5;
                }
                if ((i12 & 4096) != 0) {
                    g2 g2VarE1111111 = e(pVarF, (i33 >> 18) & 14);
                    i33 &= -897;
                    g2Var2 = g2VarE1111111;
                } else {
                    g2Var2 = g2Var;
                }
                i35 = i33;
                if ((i12 & 8192) != 0) {
                    pVar14 = pVarF;
                    i36 = i34;
                    x1VarR = r(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVar14, 0, 0, (i35 << 6) & 234881024, 268435455);
                    i35 &= -7169;
                } else {
                    i36 = i34;
                    pVar14 = pVarF;
                    x1VarR = x1Var;
                }
                if ((i12 & 16384) != 0) {
                    if (pVar9 == null) {
                        m0VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        m0VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    i33 = (-57345) & i35;
                } else {
                    m0VarT = m0Var;
                    i33 = i35;
                }
                if (i30 != 0) {
                    final boolean z11111115 = z13;
                    final x1 x1Var1111114 = x1VarR;
                    final g2 g2Var1111114 = g2Var2;
                    final int i31111119 = i36;
                    final int i41111111111111110 = i33;
                    pVar15 = pVar14;
                    x1Var2 = x1VarR;
                    m0Var2 = m0VarT;
                    pVarB = androidx.compose.runtime.internal.b.b(pVar15, -1171460386, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111111111111111) {
                            if ((i41111111111111111 & 11) == 2 && pVar23.b()) {
                                pVar23.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1171460386, i41111111111111111, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                            }
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            boolean z11111116 = z10;
                            boolean z11111117 = z11111115;
                            androidx.compose.foundation.interaction.e eVar = interactionSource;
                            x1 x1Var1111115 = x1Var1111114;
                            g2 g2Var1111115 = g2Var1111114;
                            int i41111111111111112 = i31111119;
                            int i41111111111111113 = 196608 | ((i41111111111111112 >> 6) & 14) | ((i41111111111111112 >> 15) & 112) | ((i41111111111111112 >> 9) & bb.c.b.f30796me);
                            int i41111111111111114 = i41111111111111110;
                            textFieldDefaults.a(z11111116, z11111117, eVar, x1Var1111115, g2Var1111115, pVar23, i41111111111111113 | (i41111111111111114 & bb.c.g.f32954lc) | ((i41111111111111114 << 6) & 57344), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                            a(pVar23, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    pVar15 = pVar14;
                    pVarB = pVar6;
                    x1Var2 = x1VarR;
                    m0Var2 = m0VarT;
                }
            }
            pVar15.O();
            if (ComposerKt.g0()) {
                i37 = i36;
                ComposerKt.w0(-1224712461, i37, i33, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
            } else {
                i37 = i36;
            }
            int i41111111111111111 = i37 << 3;
            int i41111111111111112 = i37 >> 9;
            int i41111111111111113 = i33 << 21;
            pVar16 = pVar15;
            TextFieldImplKt.a(TextFieldType.Filled, value, innerTextField, visualTransformation, pVar9, pVar10, pVar11, pVar12, pVar13, z11, z10, z13, interactionSource, m0Var2, x1Var2, pVarB, pVar16, (i41111111111111111 & bb.c.b.f30796me) | (i41111111111111111 & 112) | 6 | ((i37 >> 3) & bb.c.g.f32954lc) | (i41111111111111112 & 57344) | (i41111111111111112 & 458752) | (i41111111111111112 & 3670016) | (29360128 & i41111111111111113) | (234881024 & i41111111111111113) | (1879048192 & (i37 << 18)), ((i37 >> 6) & 14) | ((i37 >> 15) & 112) | (i41111111111111112 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc) | ((i33 << 3) & 57344) | (i33 & 458752), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            x1Var3 = x1Var2;
            m0Var3 = m0Var2;
            pVar17 = pVarB;
            z14 = z13;
            pVar18 = pVar9;
            pVar19 = pVar10;
            pVar20 = pVar11;
            pVar21 = pVar12;
            pVar22 = pVar13;
            g2Var3 = g2Var2;
        }
        u1VarH = pVar16.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar23, int i41111111111111114) {
                this.f11382b.d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z14, pVar18, pVar19, pVar20, pVar21, pVar22, g2Var3, x1Var3, m0Var3, pVar17, pVar23, i10 | 1, i11, i12);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar23, Integer num) {
                a(pVar23, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @dl.d
    @xh.h(name = "getFilledShape")
    @androidx.compose.runtime.h
    public final g2 e(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(611926497);
        if (ComposerKt.g0()) {
            ComposerKt.w0(611926497, i10, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:62)");
        }
        g2 g2VarD = ShapesKt.d(t0.v.f140408a.f(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    public final float f() {
        return FocusedBorderThickness;
    }

    public final float g() {
        return MinHeight;
    }

    public final float h() {
        return MinWidth;
    }

    @dl.d
    @xh.h(name = "getOutlinedShape")
    @androidx.compose.runtime.h
    public final g2 i(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-584749279);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-584749279, i10, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:59)");
        }
        g2 g2VarD = ShapesKt.d(t0.m0.f140030a.c(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    public final float j() {
        return UnfocusedBorderThickness;
    }

    @w
    @dl.d
    public final androidx.compose.ui.n k(@dl.d androidx.compose.ui.n indicatorLine, final boolean z10, final boolean z11, @dl.d final androidx.compose.foundation.interaction.e interactionSource, @dl.d final x1 colors, final float f10, final float f11) {
        kotlin.jvm.internal.f0.p(indicatorLine, "$this$indicatorLine");
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        kotlin.jvm.internal.f0.p(colors, "colors");
        return ComposedModifierKt.g(indicatorLine, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("indicatorLine");
                x0Var.getProperties().c("enabled", Boolean.valueOf(z10));
                x0Var.getProperties().c("isError", Boolean.valueOf(z11));
                x0Var.getProperties().c("interactionSource", interactionSource);
                x0Var.getProperties().c("colors", colors);
                x0Var.getProperties().c("focusedIndicatorLineThickness", s1.h.d(f10));
                x0Var.getProperties().c("unfocusedIndicatorLineThickness", s1.h.d(f11));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return kotlin.b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(-891038934);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-891038934, i10, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:146)");
                }
                androidx.compose.ui.n nVarJ = TextFieldKt.j(androidx.compose.ui.n.INSTANCE, (BorderStroke) y1.b(z10, z11, interactionSource, colors, f10, f11, pVar, 0).getValue());
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarJ;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar, pVar, num.intValue());
            }
        });
    }

    @w
    @dl.d
    @androidx.compose.runtime.h
    public final x1 m(long j10, long j11, long j12, long j13, long j14, @dl.e SelectionColors selectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, @dl.e androidx.compose.runtime.p pVar, int i10, int i11, int i12, int i13) {
        pVar.T(-1654658683);
        long jK = (i13 & 1) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.R(), pVar, 6) : j10;
        long jW = (i13 & 2) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.m0.f140030a.d(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jS = (i13 & 4) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j12;
        long jK2 = (i13 & 8) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.a(), pVar, 6) : j13;
        long jK3 = (i13 & 16) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.k(), pVar, 6) : j14;
        SelectionColors selectionColors2 = (i13 & 32) != 0 ? (SelectionColors) pVar.K(TextSelectionColorsKt.c()) : selectionColors;
        long jK4 = (i13 & 64) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.G(), pVar, 6) : j15;
        long jK5 = (i13 & 128) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.a0(), pVar, 6) : j16;
        long jW2 = (i13 & 256) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.m0.f140030a.g(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jK6 = (i13 & 512) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.A(), pVar, 6) : j18;
        long jK7 = (i13 & 1024) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.F(), pVar, 6) : j19;
        long jK8 = (i13 & 2048) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.Y(), pVar, 6) : j20;
        long jW3 = (i13 & 4096) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.m0.f140030a.f(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long jK9 = (i13 & 8192) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.z(), pVar, 6) : j22;
        long jK10 = (i13 & 16384) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.J(), pVar, 6) : j23;
        long jK11 = (32768 & i13) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.e0(), pVar, 6) : j24;
        long jW4 = (65536 & i13) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.m0.f140030a.j(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long jK12 = (131072 & i13) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.C(), pVar, 6) : j26;
        long jK13 = (262144 & i13) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.E(), pVar, 6) : j27;
        long jK14 = (524288 & i13) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.W(), pVar, 6) : j28;
        long jW5 = (1048576 & i13) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.m0.f140030a.e(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long jK15 = (2097152 & i13) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.y(), pVar, 6) : j30;
        long jK16 = (4194304 & i13) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.T(), pVar, 6) : j31;
        long jW6 = (8388608 & i13) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.m0.f140030a.d(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j32;
        long jK17 = (16777216 & i13) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.I(), pVar, 6) : j33;
        long jK18 = (33554432 & i13) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.c0(), pVar, 6) : j34;
        long jW7 = (67108864 & i13) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.m0.f140030a.i(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j35;
        long jK19 = (i13 & 134217728) != 0 ? ColorSchemeKt.k(t0.m0.f140030a.B(), pVar, 6) : j36;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1654658683, i10, i11, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:399)");
        }
        x1 x1Var = new x1(jK, jW, jS, jK2, jK3, selectionColors2, jK4, jK5, jK6, jW2, jK7, jK8, jW3, jK9, jK10, jK11, jW4, jK12, jK13, jK14, jW5, jK15, jK16, jW6, jK17, jK18, jW7, jK19, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return x1Var;
    }

    @w
    @dl.d
    public final androidx.compose.foundation.layout.m0 n(float start, float top, float end, float bottom) {
        return PaddingKt.d(start, top, end, bottom);
    }

    @w
    @dl.d
    public final androidx.compose.foundation.layout.m0 p(float start, float top, float end, float bottom) {
        return PaddingKt.d(start, top, end, bottom);
    }

    @w
    @dl.d
    @androidx.compose.runtime.h
    public final x1 r(long j10, long j11, long j12, long j13, long j14, @dl.e SelectionColors selectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, @dl.e androidx.compose.runtime.p pVar, int i10, int i11, int i12, int i13) {
        pVar.T(-128842621);
        long jK = (i13 & 1) != 0 ? ColorSchemeKt.k(t0.v.f140408a.V(), pVar, 6) : j10;
        long jW = (i13 & 2) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.v.f140408a.j(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jK2 = (i13 & 4) != 0 ? ColorSchemeKt.k(t0.v.f140408a.d(), pVar, 6) : j12;
        long jK3 = (i13 & 8) != 0 ? ColorSchemeKt.k(t0.v.f140408a.c(), pVar, 6) : j13;
        long jK4 = (i13 & 16) != 0 ? ColorSchemeKt.k(t0.v.f140408a.q(), pVar, 6) : j14;
        SelectionColors selectionColors2 = (i13 & 32) != 0 ? (SelectionColors) pVar.K(TextSelectionColorsKt.c()) : selectionColors;
        long jK5 = (i13 & 64) != 0 ? ColorSchemeKt.k(t0.v.f140408a.H(), pVar, 6) : j15;
        long jK6 = (i13 & 128) != 0 ? ColorSchemeKt.k(t0.v.f140408a.a(), pVar, 6) : j16;
        long jW2 = (i13 & 256) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.v.f140408a.g(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jK7 = (i13 & 512) != 0 ? ColorSchemeKt.k(t0.v.f140408a.o(), pVar, 6) : j18;
        long jK8 = (i13 & 1024) != 0 ? ColorSchemeKt.k(t0.v.f140408a.L(), pVar, 6) : j19;
        long jK9 = (i13 & 2048) != 0 ? ColorSchemeKt.k(t0.v.f140408a.c0(), pVar, 6) : j20;
        long jW3 = (i13 & 4096) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.v.f140408a.l(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long jK10 = (i13 & 8192) != 0 ? ColorSchemeKt.k(t0.v.f140408a.E(), pVar, 6) : j22;
        long jK11 = (i13 & 16384) != 0 ? ColorSchemeKt.k(t0.v.f140408a.N(), pVar, 6) : j23;
        long jK12 = (32768 & i13) != 0 ? ColorSchemeKt.k(t0.v.f140408a.g0(), pVar, 6) : j24;
        long jW4 = (65536 & i13) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.v.f140408a.n(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long jK13 = (131072 & i13) != 0 ? ColorSchemeKt.k(t0.v.f140408a.G(), pVar, 6) : j26;
        long jK14 = (262144 & i13) != 0 ? ColorSchemeKt.k(t0.v.f140408a.K(), pVar, 6) : j27;
        long jK15 = (524288 & i13) != 0 ? ColorSchemeKt.k(t0.v.f140408a.a0(), pVar, 6) : j28;
        long jW5 = (1048576 & i13) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.v.f140408a.k(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long jK16 = (2097152 & i13) != 0 ? ColorSchemeKt.k(t0.v.f140408a.D(), pVar, 6) : j30;
        long jK17 = (4194304 & i13) != 0 ? ColorSchemeKt.k(t0.v.f140408a.X(), pVar, 6) : j31;
        long jW6 = (8388608 & i13) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.v.f140408a.j(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j32;
        long jK18 = (16777216 & i13) != 0 ? ColorSchemeKt.k(t0.v.f140408a.M(), pVar, 6) : j33;
        long jK19 = (33554432 & i13) != 0 ? ColorSchemeKt.k(t0.v.f140408a.e0(), pVar, 6) : j34;
        long jW7 = (67108864 & i13) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.v.f140408a.m(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j35;
        long jK20 = (i13 & 134217728) != 0 ? ColorSchemeKt.k(t0.v.f140408a.F(), pVar, 6) : j36;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-128842621, i10, i11, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:292)");
        }
        x1 x1Var = new x1(jK, jW, jK2, jK3, jK4, selectionColors2, jK5, jK6, jK7, jW2, jK8, jK9, jW3, jK10, jK11, jK12, jW4, jK13, jK14, jK15, jW5, jK16, jK17, jW6, jK18, jK19, jW7, jK20, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return x1Var;
    }

    @w
    @dl.d
    public final androidx.compose.foundation.layout.m0 s(float start, float end, float top, float bottom) {
        return PaddingKt.d(start, top, end, bottom);
    }

    @w
    @dl.d
    public final androidx.compose.foundation.layout.m0 u(float start, float top, float end, float bottom) {
        return PaddingKt.d(start, top, end, bottom);
    }
}
