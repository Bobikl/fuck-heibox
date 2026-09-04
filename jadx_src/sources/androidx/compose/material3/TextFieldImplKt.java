package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.h2;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.r;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aô\u0001\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a<\u0010!\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a\u0012\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0000\u001a\u0012\u0010'\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0000\"\u0014\u0010)\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010(\"\u0014\u0010*\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010(\"\u0014\u0010,\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010(\"\u0014\u0010.\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010(\"\u0014\u00100\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010(\"\u0014\u00102\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010(\"\u0014\u00104\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010(\"\u001d\u00109\u001a\u0002058\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108\"\u0014\u0010;\u001a\u00020%8\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010:\"\u0014\u0010<\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010:\"\u0014\u0010>\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010:\"\u001d\u0010C\u001a\u00020?8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b3\u0010B\"\u001d\u0010E\u001a\u00020?8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\b+\u0010B\"\u001d\u0010G\u001a\u00020?8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\b1\u0010B\"\u001a\u0010L\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b-\u0010K\"\u001a\u0010P\u001a\u0004\u0018\u00010N*\u00020M8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Landroidx/compose/material3/TextFieldType;", "type", "", "value", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "innerTextField", "Landroidx/compose/ui/text/input/m0;", "visualTransformation", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "placeholder", "leadingIcon", "trailingIcon", "supportingText", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/e;", "interactionSource", "Landroidx/compose/foundation/layout/m0;", "contentPadding", "Landroidx/compose/material3/x1;", "colors", com.google.android.exoplayer2.text.ttml.d.W, ak.av, "(Landroidx/compose/material3/TextFieldType;Ljava/lang/String;Lyh/p;Landroidx/compose/ui/text/input/m0;Lyh/p;Lyh/p;Lyh/p;Lyh/p;Lyh/p;ZZZLandroidx/compose/foundation/interaction/e;Landroidx/compose/foundation/layout/m0;Landroidx/compose/material3/x1;Lyh/p;Landroidx/compose/runtime/p;III)V", "Landroidx/compose/ui/graphics/l0;", "contentColor", "Landroidx/compose/ui/text/q0;", "typography", "content", "b", "(JLandroidx/compose/ui/text/q0;Lyh/p;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/layout/e1;", "placeable", "", "j", "i", "Ljava/lang/String;", "TextFieldId", "PlaceholderId", ak.aF, "LabelId", "d", "LeadingId", "e", "TrailingId", "f", "SupportingId", "g", "ContainerId", "Ls1/b;", RXScreenCaptureService.KEY_HEIGHT, "J", "()J", "ZeroConstraints", "I", "AnimationDuration", "PlaceholderAnimationDuration", "k", "PlaceholderAnimationDelayOrDuration", "Ls1/h;", "l", "F", "()F", "TextFieldPadding", "m", "HorizontalIconPadding", "n", "SupportingTopPadding", "Landroidx/compose/ui/n;", "o", "Landroidx/compose/ui/n;", "()Landroidx/compose/ui/n;", "IconDefaultSizeModifier", "Landroidx/compose/ui/layout/m;", "", "(Landroidx/compose/ui/layout/m;)Ljava/lang/Object;", "layoutId", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class TextFieldImplKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final String f11414a = "TextField";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final String f11415b = "Hint";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final String f11416c = "Label";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final String f11417d = "Leading";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final String f11418e = "Trailing";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final String f11419f = "Supporting";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final String f11420g = "Container";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f11422i = 150;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f11423j = 83;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f11424k = 67;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.n f11428o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f11421h = s1.c.a(0, 0, 0, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f11425l = s1.h.g(16);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f11426m = s1.h.g(12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f11427n = s1.h.g(4);

    static {
        float f10 = 48;
        f11428o = SizeKt.g(androidx.compose.ui.n.INSTANCE, s1.h.g(f10), s1.h.g(f10));
    }

    /* JADX WARN: Code duplicated, block: B:171:0x0234  */
    /* JADX WARN: Code duplicated, block: B:173:0x0237  */
    /* JADX WARN: Code duplicated, block: B:174:0x023a  */
    /* JADX WARN: Code duplicated, block: B:176:0x023e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0241  */
    /* JADX WARN: Code duplicated, block: B:179:0x0245  */
    /* JADX WARN: Code duplicated, block: B:180:0x0248  */
    /* JADX WARN: Code duplicated, block: B:182:0x024c  */
    /* JADX WARN: Code duplicated, block: B:183:0x024f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0253  */
    /* JADX WARN: Code duplicated, block: B:186:0x0256  */
    /* JADX WARN: Code duplicated, block: B:188:0x025a  */
    /* JADX WARN: Code duplicated, block: B:189:0x025d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0261  */
    /* JADX WARN: Code duplicated, block: B:192:0x0264  */
    /* JADX WARN: Code duplicated, block: B:195:0x026c  */
    /* JADX WARN: Code duplicated, block: B:198:0x028d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0295  */
    /* JADX WARN: Code duplicated, block: B:203:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:205:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:207:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:208:0x02df  */
    /* JADX WARN: Code duplicated, block: B:210:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:211:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:214:0x031a  */
    /* JADX WARN: Code duplicated, block: B:216:0x0328  */
    /* JADX WARN: Code duplicated, block: B:224:0x035f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0367  */
    /* JADX WARN: Code duplicated, block: B:227:0x0369  */
    /* JADX WARN: Code duplicated, block: B:230:0x036d  */
    /* JADX WARN: Code duplicated, block: B:233:0x038f  */
    /* JADX WARN: Code duplicated, block: B:235:0x0397  */
    /* JADX WARN: Code duplicated, block: B:236:0x0399  */
    /* JADX WARN: Code duplicated, block: B:239:0x039d  */
    /* JADX WARN: Code duplicated, block: B:240:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:243:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:244:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:247:0x040f  */
    /* JADX WARN: Code duplicated, block: B:252:0x0427  */
    /* JADX WARN: Code duplicated, block: B:254:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final TextFieldType type, @dl.d final String value, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.d final androidx.compose.ui.text.input.m0 visualTransformation, @dl.e final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar5, boolean z10, boolean z11, boolean z12, @dl.d final androidx.compose.foundation.interaction.e interactionSource, @dl.d final androidx.compose.foundation.layout.m0 contentPadding, @dl.d final x1 colors, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> container, @dl.e androidx.compose.runtime.p pVar6, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean zS;
        Object objU;
        final String text;
        boolean z16;
        InputPhase inputPhase;
        InputPhase inputPhase2;
        yh.q<InputPhase, androidx.compose.runtime.p, Integer, androidx.compose.ui.graphics.l0> qVar;
        androidx.compose.ui.graphics.l0.Companion companion;
        final boolean z17;
        long jP;
        long jP2;
        boolean z18;
        boolean z19;
        androidx.compose.runtime.p pVar11;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15;
        final boolean z20;
        final boolean z21;
        final boolean z22;
        boolean z23;
        boolean z24;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(type, "type");
        kotlin.jvm.internal.f0.p(value, "value");
        kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
        kotlin.jvm.internal.f0.p(visualTransformation, "visualTransformation");
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        kotlin.jvm.internal.f0.p(contentPadding, "contentPadding");
        kotlin.jvm.internal.f0.p(colors, "colors");
        kotlin.jvm.internal.f0.p(container, "container");
        androidx.compose.runtime.p pVarF = pVar6.F(4948732);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (pVarF.s(type) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= pVarF.s(value) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            i13 |= pVarF.s(innerTextField) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            i13 |= pVarF.s(visualTransformation) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i10) == 0) {
            i13 |= pVarF.s(pVar) ? 16384 : 8192;
        }
        int i16 = i12 & 32;
        if (i16 != 0) {
            i13 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((i10 & 458752) == 0) {
            i13 |= pVarF.s(pVar2) ? 131072 : 65536;
        }
        int i17 = i12 & 64;
        if (i17 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            i13 |= pVarF.s(pVar3) ? 1048576 : 524288;
        }
        int i18 = i12 & 128;
        if (i18 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            i13 |= pVarF.s(pVar4) ? 8388608 : 4194304;
        }
        int i19 = i12 & 256;
        if (i19 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            i13 |= pVarF.s(pVar5) ? 67108864 : 33554432;
        }
        int i20 = i12 & 512;
        if (i20 != 0) {
            i13 |= com.google.android.exoplayer2.j.G;
        } else if ((i10 & 1879048192) == 0) {
            i13 |= pVarF.u(z10) ? 536870912 : 268435456;
        }
        int i21 = i12 & 1024;
        if (i21 != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i14 = i11 | (pVarF.u(z11) ? 4 : 2);
        } else {
            i14 = i11;
        }
        int i22 = i12 & 2048;
        if (i22 != 0) {
            i14 |= 48;
        } else if ((i11 & 112) == 0) {
            i14 |= pVarF.u(z12) ? 32 : 16;
        }
        int i23 = i14;
        if ((i12 & 4096) != 0) {
            i23 |= bb.c.b.f30966u4;
        } else if ((i11 & bb.c.b.f30796me) == 0) {
            i23 |= pVarF.s(interactionSource) ? 256 : 128;
        }
        if ((i12 & 8192) != 0) {
            i23 |= bb.c.d.f31193dj;
        } else if ((i11 & bb.c.g.f32954lc) == 0) {
            i23 |= pVarF.s(contentPadding) ? 2048 : 1024;
        }
        if ((i12 & 16384) != 0) {
            i23 |= 24576;
        } else if ((57344 & i11) == 0) {
            i23 |= pVarF.s(colors) ? 16384 : 8192;
        }
        if ((32768 & i12) == 0) {
            if ((458752 & i11) == 0) {
                i15 = pVarF.s(container) ? 131072 : 65536;
            }
            if ((1533916891 & i13) != 306783378 && (374491 & i23) == 74898 && pVarF.b()) {
                pVarF.l();
                pVar12 = pVar2;
                pVar13 = pVar3;
                pVar14 = pVar4;
                pVar15 = pVar5;
                z20 = z10;
                z21 = z11;
                z22 = z12;
                pVar11 = pVarF;
            } else {
                if (i16 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar2;
                }
                if (i17 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar3;
                }
                if (i18 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar4;
                }
                if (i19 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar5;
                }
                if (i20 != 0) {
                    z13 = false;
                } else {
                    z13 = z10;
                }
                if (i21 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i22 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(4948732, i13, i23, "androidx.compose.material3.CommonDecorationBox (TextFieldImpl.kt:62)");
                }
                pVarF.T(511388516);
                zS = pVarF.s(value) | pVarF.s(visualTransformation);
                objU = pVarF.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = visualTransformation.a(new androidx.compose.ui.text.d(value, null, null, 6, null));
                    pVarF.N(objU);
                }
                pVarF.c0();
                text = ((TransformedText) objU).getText().getText();
                if (FocusInteractionKt.a(interactionSource, pVarF, (i23 >> 6) & 14).getValue().booleanValue()) {
                    inputPhase = InputPhase.Focused;
                } else {
                    if (text.length() == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        inputPhase = InputPhase.UnfocusedEmpty;
                    } else {
                        inputPhase = InputPhase.UnfocusedNotEmpty;
                    }
                }
                inputPhase2 = inputPhase;
                final boolean z25 = z14;
                final boolean z26 = z15;
                final int i24 = i23;
                qVar = new yh.q<InputPhase, androidx.compose.runtime.p, Integer, androidx.compose.ui.graphics.l0>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$labelColor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.h
                    public final long a(@dl.d InputPhase it, @dl.e androidx.compose.runtime.p pVar16, int i25) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        pVar16.T(-379813807);
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-379813807, i25, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
                        }
                        x1 x1Var = colors;
                        boolean z27 = z25;
                        boolean z28 = z26;
                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                        int i26 = i24;
                        long jM = x1Var.g(z27, z28, eVar, pVar16, (i26 & 14) | (i26 & 112) | (i26 & bb.c.b.f30796me) | ((i26 >> 3) & bb.c.g.f32954lc)).getValue().M();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar16.c0();
                        return jM;
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.l0 invoke(InputPhase inputPhase3, androidx.compose.runtime.p pVar16, Integer num) {
                        return androidx.compose.ui.graphics.l0.n(a(inputPhase3, pVar16, num.intValue()));
                    }
                };
                o0 o0Var = o0.f12059a;
                Typography typographyC = o0Var.c(pVarF, 6);
                TextStyle bodyLarge = typographyC.getBodyLarge();
                final TextStyle bodySmall = typographyC.getBodySmall();
                final int i25 = i13;
                long jP3 = bodyLarge.p();
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                z17 = !(androidx.compose.ui.graphics.l0.y(jP3, companion.u()) || androidx.compose.ui.graphics.l0.y(bodySmall.p(), companion.u())) || (!androidx.compose.ui.graphics.l0.y(bodyLarge.p(), companion.u()) && androidx.compose.ui.graphics.l0.y(bodySmall.p(), companion.u()));
                TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.f11670a;
                pVarF.T(-646388305);
                jP = o0Var.c(pVarF, 6).getBodySmall().p();
                if (z17) {
                    if (jP != companion.u()) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (!z24) {
                        jP = qVar.invoke(inputPhase2, pVarF, 0).M();
                    }
                }
                long j10 = jP;
                pVarF.c0();
                jP2 = o0Var.c(pVarF, 6).getBodyLarge().p();
                if (z17) {
                    if (jP2 != companion.u()) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    if (z23) {
                        z18 = false;
                    } else {
                        z18 = false;
                        jP2 = qVar.invoke(inputPhase2, pVarF, 0).M();
                    }
                } else {
                    z18 = false;
                }
                long j11 = jP2;
                if (pVar != null) {
                    z19 = true;
                } else {
                    z19 = z18;
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVar7;
                final boolean z27 = z15;
                final int i26 = i23;
                final boolean z28 = z14;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVar8;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVar9;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVar10;
                final boolean z29 = z13;
                pVar11 = pVarF;
                textFieldTransitionScope.a(inputPhase2, j10, j11, qVar, z19, androidx.compose.runtime.internal.b.b(pVar11, 1915872767, true, new yh.t<Float, androidx.compose.ui.graphics.l0, androidx.compose.ui.graphics.l0, Float, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3

                    /* JADX INFO: compiled from: TextFieldImpl.kt */
                    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                    public final /* synthetic */ class a {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public static final /* synthetic */ int[] f11450a;

                        static {
                            int[] iArr = new int[TextFieldType.values().length];
                            iArr[TextFieldType.Filled.ordinal()] = 1;
                            iArr[TextFieldType.Outlined.ordinal()] = 2;
                            f11450a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(6);
                    }

                    @Override // yh.t
                    public /* bridge */ /* synthetic */ kotlin.b2 Z0(Float f10, androidx.compose.ui.graphics.l0 l0Var, androidx.compose.ui.graphics.l0 l0Var2, Float f11, androidx.compose.runtime.p pVar20, Integer num) {
                        a(f10.floatValue(), l0Var.M(), l0Var2.M(), f11.floatValue(), pVar20, num.intValue());
                        return kotlin.b2.f124493a;
                    }

                    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r14v0 */
                    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r14v11 */
                    /* JADX WARN: Type inference failed for: r26v0, types: [androidx.compose.runtime.p] */
                    /* JADX WARN: Type inference failed for: r7v5 */
                    /* JADX WARN: Type inference failed for: r7v6 */
                    /* JADX WARN: Type inference failed for: r7v9 */
                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(final float f10, final long j12, final long j13, final float f11, @dl.e androidx.compose.runtime.p pVar20, int i27) {
                        int i28;
                        ?? r14;
                        androidx.compose.runtime.internal.a aVarB;
                        androidx.compose.runtime.internal.a aVarB2;
                        androidx.compose.runtime.internal.a aVarB3;
                        if ((i27 & 14) == 0) {
                            i28 = (pVar20.w(f10) ? 4 : 2) | i27;
                        } else {
                            i28 = i27;
                        }
                        if ((i27 & 112) == 0) {
                            i28 |= pVar20.z(j12) ? 32 : 16;
                        }
                        if ((i27 & bb.c.b.f30796me) == 0) {
                            i28 |= pVar20.z(j13) ? 256 : 128;
                        }
                        if ((i27 & bb.c.g.f32954lc) == 0) {
                            i28 |= pVar20.w(f11) ? 2048 : 1024;
                        }
                        final int i29 = i28;
                        if ((46811 & i29) == 9362 && pVar20.b()) {
                            pVar20.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1915872767, i29, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:112)");
                        }
                        final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar;
                        if (pVar21 != null) {
                            final boolean z30 = z17;
                            r14 = 1;
                            aVarB = androidx.compose.runtime.internal.b.b(pVar20, 1199990137, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar22, int i30) {
                                    if ((i30 & 11) == 2 && pVar22.b()) {
                                        pVar22.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1199990137, i30, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:115)");
                                    }
                                    o0 o0Var2 = o0.f12059a;
                                    TextStyle textStyleC = androidx.compose.ui.text.r0.c(o0Var2.c(pVar22, 6).getBodyLarge(), o0Var2.c(pVar22, 6).getBodySmall(), f10);
                                    TextFieldImplKt.b(j13, z30 ? textStyleC.b((262142 & 1) != 0 ? textStyleC.spanStyle.m() : j12, (262142 & 2) != 0 ? textStyleC.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleC.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleC.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleC.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleC.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleC.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleC.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleC.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleC.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleC.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleC.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleC.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleC.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleC.paragraphStyle.getTextAlign() : null, (262142 & 32768) != 0 ? textStyleC.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleC.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleC.paragraphStyle.getTextIndent() : null) : textStyleC, pVar21, pVar22, (i29 >> 6) & 14, 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar22, Integer num) {
                                    a(pVar22, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            r14 = 1;
                            aVarB = null;
                        }
                        if (pVar16 == null) {
                            aVarB2 = null;
                        } else {
                            if ((text.length() == 0 ? r14 : 0) != 0) {
                                final x1 x1Var = colors;
                                final boolean z31 = z28;
                                final int i30 = i26;
                                final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar16;
                                final int i31 = i25;
                                aVarB2 = androidx.compose.runtime.internal.b.b(pVar20, 1472145357, r14, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d androidx.compose.ui.n modifier, @dl.e androidx.compose.runtime.p pVar23, int i32) {
                                        int i33;
                                        kotlin.jvm.internal.f0.p(modifier, "modifier");
                                        if ((i32 & 14) == 0) {
                                            i33 = (pVar23.s(modifier) ? 4 : 2) | i32;
                                        } else {
                                            i33 = i32;
                                        }
                                        if ((i33 & 91) == 18 && pVar23.b()) {
                                            pVar23.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(1472145357, i32, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:129)");
                                        }
                                        androidx.compose.ui.n nVarA = androidx.compose.ui.draw.a.a(modifier, f11);
                                        x1 x1Var2 = x1Var;
                                        boolean z32 = z31;
                                        int i34 = i30;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar24 = pVar22;
                                        int i35 = i31;
                                        pVar23.T(733328855);
                                        androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar23, 0);
                                        pVar23.T(-1323940314);
                                        s1.e eVar = (s1.e) pVar23.K(CompositionLocalsKt.i());
                                        LayoutDirection layoutDirection = (LayoutDirection) pVar23.K(CompositionLocalsKt.p());
                                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar23.K(CompositionLocalsKt.u());
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        yh.a<ComposeUiNode> aVarA = companion2.a();
                                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                                        if (!(pVar23.G() instanceof androidx.compose.runtime.e)) {
                                            ComposablesKt.n();
                                        }
                                        pVar23.h();
                                        if (pVar23.D()) {
                                            pVar23.L(aVarA);
                                        } else {
                                            pVar23.d();
                                        }
                                        pVar23.Y();
                                        androidx.compose.runtime.p pVarB = Updater.b(pVar23);
                                        Updater.j(pVarB, i0VarK, companion2.d());
                                        Updater.j(pVarB, eVar, companion2.b());
                                        Updater.j(pVarB, layoutDirection, companion2.c());
                                        Updater.j(pVarB, d2Var, companion2.f());
                                        pVar23.x();
                                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar23)), pVar23, 0);
                                        pVar23.T(2058660585);
                                        pVar23.T(-2137368960);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                        pVar23.T(828149203);
                                        TextFieldImplKt.b(x1Var2.j(z32, pVar23, (i34 & 14) | ((i34 >> 9) & 112)).getValue().M(), o0.f12059a.c(pVar23, 6).getBodyLarge(), pVar24, pVar23, (i35 >> 9) & bb.c.b.f30796me, 0);
                                        pVar23.c0();
                                        pVar23.c0();
                                        pVar23.c0();
                                        pVar23.f();
                                        pVar23.c0();
                                        pVar23.c0();
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar23, Integer num) {
                                        a(nVar, pVar23, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                aVarB2 = null;
                            }
                        }
                        final String strA = p1.a(o1.INSTANCE.c(), pVar20, 6);
                        androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                        Boolean boolValueOf = Boolean.valueOf(z27);
                        final boolean z32 = z27;
                        pVar20.T(511388516);
                        boolean zS2 = pVar20.s(boolValueOf) | pVar20.s(strA);
                        Object objU2 = pVar20.U();
                        if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU2 = new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d r semantics) {
                                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                    if (z32) {
                                        SemanticsPropertiesKt.m(semantics, strA);
                                    }
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            };
                            pVar20.N(objU2);
                        }
                        pVar20.c0();
                        androidx.compose.ui.n nVarC = SemanticsModifierKt.c(companion2, false, (yh.l) objU2, r14, null);
                        x1 x1Var2 = colors;
                        boolean z33 = z28;
                        boolean z34 = z27;
                        androidx.compose.foundation.interaction.e eVar = interactionSource;
                        int i32 = i26;
                        final long jM = x1Var2.i(z33, z34, eVar, pVar20, (i32 & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 3) & bb.c.g.f32954lc)).getValue().M();
                        final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar17;
                        androidx.compose.runtime.internal.a aVarB4 = pVar23 != null ? androidx.compose.runtime.internal.b.b(pVar20, 175497959, r14, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar24, int i33) {
                                if ((i33 & 11) == 2 && pVar24.b()) {
                                    pVar24.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(175497959, i33, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:148)");
                                }
                                TextFieldImplKt.b(jM, null, pVar23, pVar24, 0, 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar24, Integer num) {
                                a(pVar24, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }) : null;
                        x1 x1Var3 = colors;
                        boolean z35 = z28;
                        boolean z36 = z27;
                        androidx.compose.foundation.interaction.e eVar2 = interactionSource;
                        int i33 = i26;
                        final long jM2 = x1Var3.o(z35, z36, eVar2, pVar20, (i33 & 14) | (i33 & 112) | (i33 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc)).getValue().M();
                        final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar24 = pVar18;
                        androidx.compose.runtime.internal.a aVarB5 = pVar24 != null ? androidx.compose.runtime.internal.b.b(pVar20, -432498573, r14, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar25, int i34) {
                                if ((i34 & 11) == 2 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-432498573, i34, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:155)");
                                }
                                TextFieldImplKt.b(jM2, null, pVar24, pVar25, 0, 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                                a(pVar25, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }) : null;
                        x1 x1Var4 = colors;
                        boolean z37 = z28;
                        boolean z38 = z27;
                        androidx.compose.foundation.interaction.e eVar3 = interactionSource;
                        int i34 = i26;
                        final long jM3 = x1Var4.l(z37, z38, eVar3, pVar20, (i34 & 14) | (i34 & 112) | (i34 & bb.c.b.f30796me) | ((i34 >> 3) & bb.c.g.f32954lc)).getValue().M();
                        final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar25 = pVar19;
                        if (pVar25 != null) {
                            final TextStyle textStyle = bodySmall;
                            aVarB3 = androidx.compose.runtime.internal.b.b(pVar20, -1269483524, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar26, int i35) {
                                    if ((i35 & 11) == 2 && pVar26.b()) {
                                        pVar26.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1269483524, i35, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:163)");
                                    }
                                    TextFieldImplKt.b(jM3, textStyle, pVar25, pVar26, 0, 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar26, Integer num) {
                                    a(pVar26, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            aVarB3 = null;
                        }
                        int i35 = a.f11450a[type.ordinal()];
                        if (i35 == 1) {
                            androidx.compose.runtime.internal.a aVar = aVarB3;
                            pVar20.T(404041480);
                            final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = container;
                            final int i36 = i26;
                            androidx.compose.runtime.internal.a aVarB6 = androidx.compose.runtime.internal.b.b(pVar20, 1566950173, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar27, int i37) {
                                    if ((i37 & 11) == 2 && pVar27.b()) {
                                        pVar27.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1566950173, i37, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:170)");
                                    }
                                    androidx.compose.ui.n nVarB = LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, TextFieldImplKt.f11420g);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar26;
                                    int i38 = i36;
                                    pVar27.T(733328855);
                                    androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), true, pVar27, 48);
                                    pVar27.T(-1323940314);
                                    s1.e eVar4 = (s1.e) pVar27.K(CompositionLocalsKt.i());
                                    LayoutDirection layoutDirection = (LayoutDirection) pVar27.K(CompositionLocalsKt.p());
                                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar27.K(CompositionLocalsKt.u());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    yh.a<ComposeUiNode> aVarA = companion3.a();
                                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarB);
                                    if (!(pVar27.G() instanceof androidx.compose.runtime.e)) {
                                        ComposablesKt.n();
                                    }
                                    pVar27.h();
                                    if (pVar27.D()) {
                                        pVar27.L(aVarA);
                                    } else {
                                        pVar27.d();
                                    }
                                    pVar27.Y();
                                    androidx.compose.runtime.p pVarB = Updater.b(pVar27);
                                    Updater.j(pVarB, i0VarK, companion3.d());
                                    Updater.j(pVarB, eVar4, companion3.b());
                                    Updater.j(pVarB, layoutDirection, companion3.c());
                                    Updater.j(pVarB, d2Var, companion3.f());
                                    pVar27.x();
                                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar27)), pVar27, 0);
                                    pVar27.T(2058660585);
                                    pVar27.T(-2137368960);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                    pVar27.T(1634460887);
                                    pVar28.invoke(pVar27, Integer.valueOf((i38 >> 15) & 14));
                                    pVar27.c0();
                                    pVar27.c0();
                                    pVar27.c0();
                                    pVar27.f();
                                    pVar27.c0();
                                    pVar27.c0();
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar27, Integer num) {
                                    a(pVar27, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = innerTextField;
                            boolean z39 = z29;
                            androidx.compose.foundation.layout.m0 m0Var = contentPadding;
                            int i37 = i25;
                            TextFieldKt.c(nVarC, pVar27, aVarB, aVarB2, aVarB4, aVarB5, z39, f10, aVarB6, aVar, m0Var, pVar20, 100663296 | ((i37 >> 3) & 112) | ((i37 >> 9) & 3670016) | ((i29 << 21) & 29360128), (i26 >> 9) & 14);
                            pVar20.c0();
                            kotlin.b2 b2Var = kotlin.b2.f124493a;
                        } else if (i35 != 2) {
                            pVar20.T(404044016);
                            pVar20.c0();
                            kotlin.b2 b2Var2 = kotlin.b2.f124493a;
                        } else {
                            pVar20.T(404042394);
                            pVar20.T(-492369756);
                            Object objU3 = pVar20.U();
                            androidx.compose.runtime.p.Companion companion3 = androidx.compose.runtime.p.INSTANCE;
                            if (objU3 == companion3.a()) {
                                objU3 = h2.g(b1.m.c(b1.m.f30386b.c()), null, 2, null);
                                pVar20.N(objU3);
                            }
                            pVar20.c0();
                            final androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) objU3;
                            final androidx.compose.foundation.layout.m0 m0Var2 = contentPadding;
                            final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = container;
                            androidx.compose.runtime.internal.a aVar2 = aVarB3;
                            final int i38 = i26;
                            androidx.compose.runtime.internal.a aVarB7 = androidx.compose.runtime.internal.b.b(pVar20, 787383072, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar29, int i39) {
                                    if ((i39 & 11) == 2 && pVar29.b()) {
                                        pVar29.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(787383072, i39, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:194)");
                                    }
                                    androidx.compose.ui.n nVarK = OutlinedTextFieldKt.k(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, TextFieldImplKt.f11420g), a1Var.getValue().getF30389a(), m0Var2);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar28;
                                    int i40 = i38;
                                    pVar29.T(733328855);
                                    androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), true, pVar29, 48);
                                    pVar29.T(-1323940314);
                                    s1.e eVar4 = (s1.e) pVar29.K(CompositionLocalsKt.i());
                                    LayoutDirection layoutDirection = (LayoutDirection) pVar29.K(CompositionLocalsKt.p());
                                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar29.K(CompositionLocalsKt.u());
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    yh.a<ComposeUiNode> aVarA = companion4.a();
                                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarK);
                                    if (!(pVar29.G() instanceof androidx.compose.runtime.e)) {
                                        ComposablesKt.n();
                                    }
                                    pVar29.h();
                                    if (pVar29.D()) {
                                        pVar29.L(aVarA);
                                    } else {
                                        pVar29.d();
                                    }
                                    pVar29.Y();
                                    androidx.compose.runtime.p pVarB = Updater.b(pVar29);
                                    Updater.j(pVarB, i0VarK, companion4.d());
                                    Updater.j(pVarB, eVar4, companion4.b());
                                    Updater.j(pVarB, layoutDirection, companion4.c());
                                    Updater.j(pVarB, d2Var, companion4.f());
                                    pVar29.x();
                                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar29)), pVar29, 0);
                                    pVar29.T(2058660585);
                                    pVar29.T(-2137368960);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                    pVar29.T(1492929242);
                                    pVar30.invoke(pVar29, Integer.valueOf((i40 >> 15) & 14));
                                    pVar29.c0();
                                    pVar29.c0();
                                    pVar29.c0();
                                    pVar29.f();
                                    pVar29.c0();
                                    pVar29.c0();
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar29, Integer num) {
                                    a(pVar29, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = innerTextField;
                            boolean z40 = z29;
                            Float fValueOf = Float.valueOf(f10);
                            pVar20.T(511388516);
                            boolean zS3 = pVar20.s(fValueOf) | pVar20.s(a1Var);
                            Object objU4 = pVar20.U();
                            if (zS3 || objU4 == companion3.a()) {
                                objU4 = new yh.l<b1.m, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public final void a(long j14) {
                                        float fT = b1.m.t(j14) * f10;
                                        float fM = b1.m.m(j14) * f10;
                                        if (b1.m.t(a1Var.getValue().getF30389a()) == fT) {
                                            if (b1.m.m(a1Var.getValue().getF30389a()) == fM) {
                                                return;
                                            }
                                        }
                                        a1Var.setValue(b1.m.c(b1.n.a(fT, fM)));
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(b1.m mVar) {
                                        a(mVar.getF30389a());
                                        return kotlin.b2.f124493a;
                                    }
                                };
                                pVar20.N(objU4);
                            }
                            pVar20.c0();
                            yh.l lVar = (yh.l) objU4;
                            androidx.compose.foundation.layout.m0 m0Var3 = contentPadding;
                            int i39 = i25;
                            OutlinedTextFieldKt.c(nVarC, pVar29, aVarB2, aVarB, aVarB4, aVarB5, z40, f10, lVar, aVarB7, aVar2, m0Var3, pVar20, 805306368 | ((i39 >> 3) & 112) | ((i39 >> 9) & 3670016) | ((i29 << 21) & 29360128), (i26 >> 6) & 112);
                            pVar20.c0();
                            kotlin.b2 b2Var3 = kotlin.b2.f124493a;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }
                }), pVar11, 1769472);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar12 = pVar7;
                pVar13 = pVar8;
                pVar14 = pVar9;
                pVar15 = pVar10;
                z20 = z13;
                z21 = z14;
                z22 = z15;
            }
            u1VarH = pVar11.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar20, int i27) {
                    TextFieldImplKt.a(type, value, innerTextField, visualTransformation, pVar, pVar12, pVar13, pVar14, pVar15, z20, z21, z22, interactionSource, contentPadding, colors, container, pVar20, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar20, Integer num) {
                    a(pVar20, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i15 = androidx.profileinstaller.o.c.f26824k;
        i23 |= i15;
        if ((1533916891 & i13) != 306783378) {
            if (i16 != 0) {
                pVar7 = null;
            } else {
                pVar7 = pVar2;
            }
            if (i17 != 0) {
                pVar8 = null;
            } else {
                pVar8 = pVar3;
            }
            if (i18 != 0) {
                pVar9 = null;
            } else {
                pVar9 = pVar4;
            }
            if (i19 != 0) {
                pVar10 = null;
            } else {
                pVar10 = pVar5;
            }
            if (i20 != 0) {
                z13 = false;
            } else {
                z13 = z10;
            }
            if (i21 != 0) {
                z14 = true;
            } else {
                z14 = z11;
            }
            if (i22 != 0) {
                z15 = false;
            } else {
                z15 = z12;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(4948732, i13, i23, "androidx.compose.material3.CommonDecorationBox (TextFieldImpl.kt:62)");
            }
            pVarF.T(511388516);
            zS = pVarF.s(value) | pVarF.s(visualTransformation);
            objU = pVarF.U();
            if (zS) {
                objU = visualTransformation.a(new androidx.compose.ui.text.d(value, null, null, 6, null));
                pVarF.N(objU);
            } else {
                objU = visualTransformation.a(new androidx.compose.ui.text.d(value, null, null, 6, null));
                pVarF.N(objU);
            }
            pVarF.c0();
            text = ((TransformedText) objU).getText().getText();
            if (FocusInteractionKt.a(interactionSource, pVarF, (i23 >> 6) & 14).getValue().booleanValue()) {
                inputPhase = InputPhase.Focused;
            } else {
                if (text.length() == 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    inputPhase = InputPhase.UnfocusedEmpty;
                } else {
                    inputPhase = InputPhase.UnfocusedNotEmpty;
                }
            }
            inputPhase2 = inputPhase;
            final boolean z210 = z14;
            final boolean z211 = z15;
            final int i27 = i23;
            qVar = new yh.q<InputPhase, androidx.compose.runtime.p, Integer, androidx.compose.ui.graphics.l0>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$labelColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @androidx.compose.runtime.h
                public final long a(@dl.d InputPhase it, @dl.e androidx.compose.runtime.p pVar110, int i28) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    pVar110.T(-379813807);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-379813807, i28, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
                    }
                    x1 x1Var = colors;
                    boolean z212 = z210;
                    boolean z213 = z211;
                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                    int i29 = i27;
                    long jM = x1Var.g(z212, z213, eVar, pVar110, (i29 & 14) | (i29 & 112) | (i29 & bb.c.b.f30796me) | ((i29 >> 3) & bb.c.g.f32954lc)).getValue().M();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar110.c0();
                    return jM;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.l0 invoke(InputPhase inputPhase3, androidx.compose.runtime.p pVar110, Integer num) {
                    return androidx.compose.ui.graphics.l0.n(a(inputPhase3, pVar110, num.intValue()));
                }
            };
            o0 o0Var2 = o0.f12059a;
            Typography typographyC2 = o0Var2.c(pVarF, 6);
            TextStyle bodyLarge2 = typographyC2.getBodyLarge();
            final TextStyle bodySmall2 = typographyC2.getBodySmall();
            final int i28 = i13;
            long jP4 = bodyLarge2.p();
            companion = androidx.compose.ui.graphics.l0.INSTANCE;
            if (androidx.compose.ui.graphics.l0.y(jP4, companion.u())) {
            }
            TextFieldTransitionScope textFieldTransitionScope2 = TextFieldTransitionScope.f11670a;
            pVarF.T(-646388305);
            jP = o0Var2.c(pVarF, 6).getBodySmall().p();
            if (z17) {
                if (jP != companion.u()) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (!z24) {
                    jP = qVar.invoke(inputPhase2, pVarF, 0).M();
                }
            }
            long j12 = jP;
            pVarF.c0();
            jP2 = o0Var2.c(pVarF, 6).getBodyLarge().p();
            if (z17) {
                z18 = false;
            } else {
                if (jP2 != companion.u()) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                if (z23) {
                    z18 = false;
                } else {
                    z18 = false;
                    jP2 = qVar.invoke(inputPhase2, pVarF, 0).M();
                }
            }
            long j13 = jP2;
            if (pVar != null) {
                z19 = true;
            } else {
                z19 = z18;
            }
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = pVar7;
            final boolean z212 = z15;
            final int i29 = i23;
            final boolean z213 = z14;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVar8;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar112 = pVar9;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar113 = pVar10;
            final boolean z214 = z13;
            pVar11 = pVarF;
            textFieldTransitionScope2.a(inputPhase2, j12, j13, qVar, z19, androidx.compose.runtime.internal.b.b(pVar11, 1915872767, true, new yh.t<Float, androidx.compose.ui.graphics.l0, androidx.compose.ui.graphics.l0, Float, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3

                /* JADX INFO: compiled from: TextFieldImpl.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public final /* synthetic */ class a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f11450a;

                    static {
                        int[] iArr = new int[TextFieldType.values().length];
                        iArr[TextFieldType.Filled.ordinal()] = 1;
                        iArr[TextFieldType.Outlined.ordinal()] = 2;
                        f11450a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(6);
                }

                @Override // yh.t
                public /* bridge */ /* synthetic */ kotlin.b2 Z0(Float f10, androidx.compose.ui.graphics.l0 l0Var, androidx.compose.ui.graphics.l0 l0Var2, Float f11, androidx.compose.runtime.p pVar20, Integer num) {
                    a(f10.floatValue(), l0Var.M(), l0Var2.M(), f11.floatValue(), pVar20, num.intValue());
                    return kotlin.b2.f124493a;
                }

                /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v0 */
                /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r14v11 */
                /* JADX WARN: Type inference failed for: r26v0, types: [androidx.compose.runtime.p] */
                /* JADX WARN: Type inference failed for: r7v5 */
                /* JADX WARN: Type inference failed for: r7v6 */
                /* JADX WARN: Type inference failed for: r7v9 */
                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(final float f10, final long j14, final long j15, final float f11, @dl.e androidx.compose.runtime.p pVar20, int i210) {
                    int i211;
                    ?? r14;
                    androidx.compose.runtime.internal.a aVarB;
                    androidx.compose.runtime.internal.a aVarB2;
                    androidx.compose.runtime.internal.a aVarB3;
                    if ((i210 & 14) == 0) {
                        i211 = (pVar20.w(f10) ? 4 : 2) | i210;
                    } else {
                        i211 = i210;
                    }
                    if ((i210 & 112) == 0) {
                        i211 |= pVar20.z(j14) ? 32 : 16;
                    }
                    if ((i210 & bb.c.b.f30796me) == 0) {
                        i211 |= pVar20.z(j15) ? 256 : 128;
                    }
                    if ((i210 & bb.c.g.f32954lc) == 0) {
                        i211 |= pVar20.w(f11) ? 2048 : 1024;
                    }
                    final int i212 = i211;
                    if ((46811 & i212) == 9362 && pVar20.b()) {
                        pVar20.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1915872767, i212, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:112)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar;
                    if (pVar21 != null) {
                        final boolean z30 = z17;
                        r14 = 1;
                        aVarB = androidx.compose.runtime.internal.b.b(pVar20, 1199990137, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar22, int i30) {
                                if ((i30 & 11) == 2 && pVar22.b()) {
                                    pVar22.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1199990137, i30, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:115)");
                                }
                                o0 o0Var3 = o0.f12059a;
                                TextStyle textStyleC = androidx.compose.ui.text.r0.c(o0Var3.c(pVar22, 6).getBodyLarge(), o0Var3.c(pVar22, 6).getBodySmall(), f10);
                                TextFieldImplKt.b(j15, z30 ? textStyleC.b((262142 & 1) != 0 ? textStyleC.spanStyle.m() : j14, (262142 & 2) != 0 ? textStyleC.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleC.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleC.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleC.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleC.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleC.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleC.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleC.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleC.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleC.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleC.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleC.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleC.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleC.paragraphStyle.getTextAlign() : null, (262142 & 32768) != 0 ? textStyleC.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleC.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleC.paragraphStyle.getTextIndent() : null) : textStyleC, pVar21, pVar22, (i212 >> 6) & 14, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar22, Integer num) {
                                a(pVar22, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        r14 = 1;
                        aVarB = null;
                    }
                    if (pVar110 == null) {
                        aVarB2 = null;
                    } else {
                        if ((text.length() == 0 ? r14 : 0) != 0) {
                            final x1 x1Var = colors;
                            final boolean z31 = z213;
                            final int i30 = i29;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar110;
                            final int i31 = i28;
                            aVarB2 = androidx.compose.runtime.internal.b.b(pVar20, 1472145357, r14, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d androidx.compose.ui.n modifier, @dl.e androidx.compose.runtime.p pVar23, int i32) {
                                    int i33;
                                    kotlin.jvm.internal.f0.p(modifier, "modifier");
                                    if ((i32 & 14) == 0) {
                                        i33 = (pVar23.s(modifier) ? 4 : 2) | i32;
                                    } else {
                                        i33 = i32;
                                    }
                                    if ((i33 & 91) == 18 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1472145357, i32, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:129)");
                                    }
                                    androidx.compose.ui.n nVarA = androidx.compose.ui.draw.a.a(modifier, f11);
                                    x1 x1Var2 = x1Var;
                                    boolean z32 = z31;
                                    int i34 = i30;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar24 = pVar22;
                                    int i35 = i31;
                                    pVar23.T(733328855);
                                    androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar23, 0);
                                    pVar23.T(-1323940314);
                                    s1.e eVar = (s1.e) pVar23.K(CompositionLocalsKt.i());
                                    LayoutDirection layoutDirection = (LayoutDirection) pVar23.K(CompositionLocalsKt.p());
                                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar23.K(CompositionLocalsKt.u());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    yh.a<ComposeUiNode> aVarA = companion2.a();
                                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                                    if (!(pVar23.G() instanceof androidx.compose.runtime.e)) {
                                        ComposablesKt.n();
                                    }
                                    pVar23.h();
                                    if (pVar23.D()) {
                                        pVar23.L(aVarA);
                                    } else {
                                        pVar23.d();
                                    }
                                    pVar23.Y();
                                    androidx.compose.runtime.p pVarB = Updater.b(pVar23);
                                    Updater.j(pVarB, i0VarK, companion2.d());
                                    Updater.j(pVarB, eVar, companion2.b());
                                    Updater.j(pVarB, layoutDirection, companion2.c());
                                    Updater.j(pVarB, d2Var, companion2.f());
                                    pVar23.x();
                                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar23)), pVar23, 0);
                                    pVar23.T(2058660585);
                                    pVar23.T(-2137368960);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                    pVar23.T(828149203);
                                    TextFieldImplKt.b(x1Var2.j(z32, pVar23, (i34 & 14) | ((i34 >> 9) & 112)).getValue().M(), o0.f12059a.c(pVar23, 6).getBodyLarge(), pVar24, pVar23, (i35 >> 9) & bb.c.b.f30796me, 0);
                                    pVar23.c0();
                                    pVar23.c0();
                                    pVar23.c0();
                                    pVar23.f();
                                    pVar23.c0();
                                    pVar23.c0();
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar23, Integer num) {
                                    a(nVar, pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            aVarB2 = null;
                        }
                    }
                    final String strA = p1.a(o1.INSTANCE.c(), pVar20, 6);
                    androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                    Boolean boolValueOf = Boolean.valueOf(z212);
                    final boolean z32 = z212;
                    pVar20.T(511388516);
                    boolean zS2 = pVar20.s(boolValueOf) | pVar20.s(strA);
                    Object objU2 = pVar20.U();
                    if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU2 = new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(@dl.d r semantics) {
                                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                if (z32) {
                                    SemanticsPropertiesKt.m(semantics, strA);
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVar20.N(objU2);
                    }
                    pVar20.c0();
                    androidx.compose.ui.n nVarC = SemanticsModifierKt.c(companion2, false, (yh.l) objU2, r14, null);
                    x1 x1Var2 = colors;
                    boolean z33 = z213;
                    boolean z34 = z212;
                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                    int i32 = i29;
                    final long jM = x1Var2.i(z33, z34, eVar, pVar20, (i32 & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 3) & bb.c.g.f32954lc)).getValue().M();
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar111;
                    androidx.compose.runtime.internal.a aVarB4 = pVar23 != null ? androidx.compose.runtime.internal.b.b(pVar20, 175497959, r14, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar24, int i33) {
                            if ((i33 & 11) == 2 && pVar24.b()) {
                                pVar24.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(175497959, i33, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:148)");
                            }
                            TextFieldImplKt.b(jM, null, pVar23, pVar24, 0, 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar24, Integer num) {
                            a(pVar24, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }) : null;
                    x1 x1Var3 = colors;
                    boolean z35 = z213;
                    boolean z36 = z212;
                    androidx.compose.foundation.interaction.e eVar2 = interactionSource;
                    int i33 = i29;
                    final long jM2 = x1Var3.o(z35, z36, eVar2, pVar20, (i33 & 14) | (i33 & 112) | (i33 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc)).getValue().M();
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar112;
                    androidx.compose.runtime.internal.a aVarB5 = pVar24 != null ? androidx.compose.runtime.internal.b.b(pVar20, -432498573, r14, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar25, int i34) {
                            if ((i34 & 11) == 2 && pVar25.b()) {
                                pVar25.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-432498573, i34, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:155)");
                            }
                            TextFieldImplKt.b(jM2, null, pVar24, pVar25, 0, 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                            a(pVar25, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }) : null;
                    x1 x1Var4 = colors;
                    boolean z37 = z213;
                    boolean z38 = z212;
                    androidx.compose.foundation.interaction.e eVar3 = interactionSource;
                    int i34 = i29;
                    final long jM3 = x1Var4.l(z37, z38, eVar3, pVar20, (i34 & 14) | (i34 & 112) | (i34 & bb.c.b.f30796me) | ((i34 >> 3) & bb.c.g.f32954lc)).getValue().M();
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar25 = pVar113;
                    if (pVar25 != null) {
                        final TextStyle textStyle = bodySmall2;
                        aVarB3 = androidx.compose.runtime.internal.b.b(pVar20, -1269483524, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar26, int i35) {
                                if ((i35 & 11) == 2 && pVar26.b()) {
                                    pVar26.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1269483524, i35, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:163)");
                                }
                                TextFieldImplKt.b(jM3, textStyle, pVar25, pVar26, 0, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar26, Integer num) {
                                a(pVar26, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        aVarB3 = null;
                    }
                    int i35 = a.f11450a[type.ordinal()];
                    if (i35 == 1) {
                        androidx.compose.runtime.internal.a aVar = aVarB3;
                        pVar20.T(404041480);
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar26 = container;
                        final int i36 = i29;
                        androidx.compose.runtime.internal.a aVarB6 = androidx.compose.runtime.internal.b.b(pVar20, 1566950173, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar27, int i37) {
                                if ((i37 & 11) == 2 && pVar27.b()) {
                                    pVar27.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1566950173, i37, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:170)");
                                }
                                androidx.compose.ui.n nVarB = LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, TextFieldImplKt.f11420g);
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar26;
                                int i38 = i36;
                                pVar27.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), true, pVar27, 48);
                                pVar27.T(-1323940314);
                                s1.e eVar4 = (s1.e) pVar27.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection = (LayoutDirection) pVar27.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar27.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA = companion3.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarB);
                                if (!(pVar27.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar27.h();
                                if (pVar27.D()) {
                                    pVar27.L(aVarA);
                                } else {
                                    pVar27.d();
                                }
                                pVar27.Y();
                                androidx.compose.runtime.p pVarB = Updater.b(pVar27);
                                Updater.j(pVarB, i0VarK, companion3.d());
                                Updater.j(pVarB, eVar4, companion3.b());
                                Updater.j(pVarB, layoutDirection, companion3.c());
                                Updater.j(pVarB, d2Var, companion3.f());
                                pVar27.x();
                                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar27)), pVar27, 0);
                                pVar27.T(2058660585);
                                pVar27.T(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                pVar27.T(1634460887);
                                pVar28.invoke(pVar27, Integer.valueOf((i38 >> 15) & 14));
                                pVar27.c0();
                                pVar27.c0();
                                pVar27.c0();
                                pVar27.f();
                                pVar27.c0();
                                pVar27.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar27, Integer num) {
                                a(pVar27, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = innerTextField;
                        boolean z39 = z214;
                        androidx.compose.foundation.layout.m0 m0Var = contentPadding;
                        int i37 = i28;
                        TextFieldKt.c(nVarC, pVar27, aVarB, aVarB2, aVarB4, aVarB5, z39, f10, aVarB6, aVar, m0Var, pVar20, 100663296 | ((i37 >> 3) & 112) | ((i37 >> 9) & 3670016) | ((i212 << 21) & 29360128), (i29 >> 9) & 14);
                        pVar20.c0();
                        kotlin.b2 b2Var = kotlin.b2.f124493a;
                    } else if (i35 != 2) {
                        pVar20.T(404044016);
                        pVar20.c0();
                        kotlin.b2 b2Var2 = kotlin.b2.f124493a;
                    } else {
                        pVar20.T(404042394);
                        pVar20.T(-492369756);
                        Object objU3 = pVar20.U();
                        androidx.compose.runtime.p.Companion companion3 = androidx.compose.runtime.p.INSTANCE;
                        if (objU3 == companion3.a()) {
                            objU3 = h2.g(b1.m.c(b1.m.f30386b.c()), null, 2, null);
                            pVar20.N(objU3);
                        }
                        pVar20.c0();
                        final androidx.compose.runtime.a1<b1.m> a1Var = (androidx.compose.runtime.a1) objU3;
                        final androidx.compose.foundation.layout.m0 m0Var2 = contentPadding;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar28 = container;
                        androidx.compose.runtime.internal.a aVar2 = aVarB3;
                        final int i38 = i29;
                        androidx.compose.runtime.internal.a aVarB7 = androidx.compose.runtime.internal.b.b(pVar20, 787383072, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar29, int i39) {
                                if ((i39 & 11) == 2 && pVar29.b()) {
                                    pVar29.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(787383072, i39, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:194)");
                                }
                                androidx.compose.ui.n nVarK = OutlinedTextFieldKt.k(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, TextFieldImplKt.f11420g), a1Var.getValue().getF30389a(), m0Var2);
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar28;
                                int i40 = i38;
                                pVar29.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), true, pVar29, 48);
                                pVar29.T(-1323940314);
                                s1.e eVar4 = (s1.e) pVar29.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection = (LayoutDirection) pVar29.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar29.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA = companion4.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarK);
                                if (!(pVar29.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar29.h();
                                if (pVar29.D()) {
                                    pVar29.L(aVarA);
                                } else {
                                    pVar29.d();
                                }
                                pVar29.Y();
                                androidx.compose.runtime.p pVarB = Updater.b(pVar29);
                                Updater.j(pVarB, i0VarK, companion4.d());
                                Updater.j(pVarB, eVar4, companion4.b());
                                Updater.j(pVarB, layoutDirection, companion4.c());
                                Updater.j(pVarB, d2Var, companion4.f());
                                pVar29.x();
                                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar29)), pVar29, 0);
                                pVar29.T(2058660585);
                                pVar29.T(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                pVar29.T(1492929242);
                                pVar30.invoke(pVar29, Integer.valueOf((i40 >> 15) & 14));
                                pVar29.c0();
                                pVar29.c0();
                                pVar29.c0();
                                pVar29.f();
                                pVar29.c0();
                                pVar29.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar29, Integer num) {
                                a(pVar29, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = innerTextField;
                        boolean z40 = z214;
                        Float fValueOf = Float.valueOf(f10);
                        pVar20.T(511388516);
                        boolean zS3 = pVar20.s(fValueOf) | pVar20.s(a1Var);
                        Object objU4 = pVar20.U();
                        if (zS3 || objU4 == companion3.a()) {
                            objU4 = new yh.l<b1.m, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void a(long j16) {
                                    float fT = b1.m.t(j16) * f10;
                                    float fM = b1.m.m(j16) * f10;
                                    if (b1.m.t(a1Var.getValue().getF30389a()) == fT) {
                                        if (b1.m.m(a1Var.getValue().getF30389a()) == fM) {
                                            return;
                                        }
                                    }
                                    a1Var.setValue(b1.m.c(b1.n.a(fT, fM)));
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(b1.m mVar) {
                                    a(mVar.getF30389a());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            pVar20.N(objU4);
                        }
                        pVar20.c0();
                        yh.l lVar = (yh.l) objU4;
                        androidx.compose.foundation.layout.m0 m0Var3 = contentPadding;
                        int i39 = i28;
                        OutlinedTextFieldKt.c(nVarC, pVar29, aVarB2, aVarB, aVarB4, aVarB5, z40, f10, lVar, aVarB7, aVar2, m0Var3, pVar20, 805306368 | ((i39 >> 3) & 112) | ((i39 >> 9) & 3670016) | ((i212 << 21) & 29360128), (i29 >> 6) & 112);
                        pVar20.c0();
                        kotlin.b2 b2Var3 = kotlin.b2.f124493a;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }
            }), pVar11, 1769472);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar12 = pVar7;
            pVar13 = pVar8;
            pVar14 = pVar9;
            pVar15 = pVar10;
            z20 = z13;
            z21 = z14;
            z22 = z15;
        } else {
            if (i16 != 0) {
                pVar7 = null;
            } else {
                pVar7 = pVar2;
            }
            if (i17 != 0) {
                pVar8 = null;
            } else {
                pVar8 = pVar3;
            }
            if (i18 != 0) {
                pVar9 = null;
            } else {
                pVar9 = pVar4;
            }
            if (i19 != 0) {
                pVar10 = null;
            } else {
                pVar10 = pVar5;
            }
            if (i20 != 0) {
                z13 = false;
            } else {
                z13 = z10;
            }
            if (i21 != 0) {
                z14 = true;
            } else {
                z14 = z11;
            }
            if (i22 != 0) {
                z15 = false;
            } else {
                z15 = z12;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(4948732, i13, i23, "androidx.compose.material3.CommonDecorationBox (TextFieldImpl.kt:62)");
            }
            pVarF.T(511388516);
            zS = pVarF.s(value) | pVarF.s(visualTransformation);
            objU = pVarF.U();
            if (zS) {
                objU = visualTransformation.a(new androidx.compose.ui.text.d(value, null, null, 6, null));
                pVarF.N(objU);
            } else {
                objU = visualTransformation.a(new androidx.compose.ui.text.d(value, null, null, 6, null));
                pVarF.N(objU);
            }
            pVarF.c0();
            text = ((TransformedText) objU).getText().getText();
            if (FocusInteractionKt.a(interactionSource, pVarF, (i23 >> 6) & 14).getValue().booleanValue()) {
                inputPhase = InputPhase.Focused;
            } else {
                if (text.length() == 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    inputPhase = InputPhase.UnfocusedEmpty;
                } else {
                    inputPhase = InputPhase.UnfocusedNotEmpty;
                }
            }
            inputPhase2 = inputPhase;
            final boolean z215 = z14;
            final boolean z216 = z15;
            final int i210 = i23;
            qVar = new yh.q<InputPhase, androidx.compose.runtime.p, Integer, androidx.compose.ui.graphics.l0>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$labelColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @androidx.compose.runtime.h
                public final long a(@dl.d InputPhase it, @dl.e androidx.compose.runtime.p pVar114, int i211) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    pVar114.T(-379813807);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-379813807, i211, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
                    }
                    x1 x1Var = colors;
                    boolean z217 = z215;
                    boolean z218 = z216;
                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                    int i212 = i210;
                    long jM = x1Var.g(z217, z218, eVar, pVar114, (i212 & 14) | (i212 & 112) | (i212 & bb.c.b.f30796me) | ((i212 >> 3) & bb.c.g.f32954lc)).getValue().M();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar114.c0();
                    return jM;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.l0 invoke(InputPhase inputPhase3, androidx.compose.runtime.p pVar114, Integer num) {
                    return androidx.compose.ui.graphics.l0.n(a(inputPhase3, pVar114, num.intValue()));
                }
            };
            o0 o0Var3 = o0.f12059a;
            Typography typographyC3 = o0Var3.c(pVarF, 6);
            TextStyle bodyLarge3 = typographyC3.getBodyLarge();
            final TextStyle bodySmall3 = typographyC3.getBodySmall();
            final int i211 = i13;
            long jP5 = bodyLarge3.p();
            companion = androidx.compose.ui.graphics.l0.INSTANCE;
            if (androidx.compose.ui.graphics.l0.y(jP5, companion.u())) {
            }
            TextFieldTransitionScope textFieldTransitionScope3 = TextFieldTransitionScope.f11670a;
            pVarF.T(-646388305);
            jP = o0Var3.c(pVarF, 6).getBodySmall().p();
            if (z17) {
                if (jP != companion.u()) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (!z24) {
                    jP = qVar.invoke(inputPhase2, pVarF, 0).M();
                }
            }
            long j14 = jP;
            pVarF.c0();
            jP2 = o0Var3.c(pVarF, 6).getBodyLarge().p();
            if (z17) {
                z18 = false;
            } else {
                if (jP2 != companion.u()) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                if (z23) {
                    z18 = false;
                } else {
                    z18 = false;
                    jP2 = qVar.invoke(inputPhase2, pVarF, 0).M();
                }
            }
            long j15 = jP2;
            if (pVar != null) {
                z19 = true;
            } else {
                z19 = z18;
            }
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar114 = pVar7;
            final boolean z217 = z15;
            final int i212 = i23;
            final boolean z218 = z14;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar115 = pVar8;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar116 = pVar9;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar117 = pVar10;
            final boolean z219 = z13;
            pVar11 = pVarF;
            textFieldTransitionScope3.a(inputPhase2, j14, j15, qVar, z19, androidx.compose.runtime.internal.b.b(pVar11, 1915872767, true, new yh.t<Float, androidx.compose.ui.graphics.l0, androidx.compose.ui.graphics.l0, Float, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3

                /* JADX INFO: compiled from: TextFieldImpl.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public final /* synthetic */ class a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f11450a;

                    static {
                        int[] iArr = new int[TextFieldType.values().length];
                        iArr[TextFieldType.Filled.ordinal()] = 1;
                        iArr[TextFieldType.Outlined.ordinal()] = 2;
                        f11450a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(6);
                }

                @Override // yh.t
                public /* bridge */ /* synthetic */ kotlin.b2 Z0(Float f10, androidx.compose.ui.graphics.l0 l0Var, androidx.compose.ui.graphics.l0 l0Var2, Float f11, androidx.compose.runtime.p pVar20, Integer num) {
                    a(f10.floatValue(), l0Var.M(), l0Var2.M(), f11.floatValue(), pVar20, num.intValue());
                    return kotlin.b2.f124493a;
                }

                /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v0 */
                /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r14v11 */
                /* JADX WARN: Type inference failed for: r26v0, types: [androidx.compose.runtime.p] */
                /* JADX WARN: Type inference failed for: r7v5 */
                /* JADX WARN: Type inference failed for: r7v6 */
                /* JADX WARN: Type inference failed for: r7v9 */
                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(final float f10, final long j16, final long j17, final float f11, @dl.e androidx.compose.runtime.p pVar20, int i213) {
                    int i214;
                    ?? r14;
                    androidx.compose.runtime.internal.a aVarB;
                    androidx.compose.runtime.internal.a aVarB2;
                    androidx.compose.runtime.internal.a aVarB3;
                    if ((i213 & 14) == 0) {
                        i214 = (pVar20.w(f10) ? 4 : 2) | i213;
                    } else {
                        i214 = i213;
                    }
                    if ((i213 & 112) == 0) {
                        i214 |= pVar20.z(j16) ? 32 : 16;
                    }
                    if ((i213 & bb.c.b.f30796me) == 0) {
                        i214 |= pVar20.z(j17) ? 256 : 128;
                    }
                    if ((i213 & bb.c.g.f32954lc) == 0) {
                        i214 |= pVar20.w(f11) ? 2048 : 1024;
                    }
                    final int i215 = i214;
                    if ((46811 & i215) == 9362 && pVar20.b()) {
                        pVar20.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1915872767, i215, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:112)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar;
                    if (pVar21 != null) {
                        final boolean z30 = z17;
                        r14 = 1;
                        aVarB = androidx.compose.runtime.internal.b.b(pVar20, 1199990137, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar22, int i30) {
                                if ((i30 & 11) == 2 && pVar22.b()) {
                                    pVar22.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1199990137, i30, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:115)");
                                }
                                o0 o0Var4 = o0.f12059a;
                                TextStyle textStyleC = androidx.compose.ui.text.r0.c(o0Var4.c(pVar22, 6).getBodyLarge(), o0Var4.c(pVar22, 6).getBodySmall(), f10);
                                TextFieldImplKt.b(j17, z30 ? textStyleC.b((262142 & 1) != 0 ? textStyleC.spanStyle.m() : j16, (262142 & 2) != 0 ? textStyleC.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleC.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleC.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleC.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleC.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleC.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleC.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleC.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleC.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleC.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleC.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleC.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleC.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleC.paragraphStyle.getTextAlign() : null, (262142 & 32768) != 0 ? textStyleC.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleC.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleC.paragraphStyle.getTextIndent() : null) : textStyleC, pVar21, pVar22, (i215 >> 6) & 14, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar22, Integer num) {
                                a(pVar22, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        r14 = 1;
                        aVarB = null;
                    }
                    if (pVar114 == null) {
                        aVarB2 = null;
                    } else {
                        if ((text.length() == 0 ? r14 : 0) != 0) {
                            final x1 x1Var = colors;
                            final boolean z31 = z218;
                            final int i30 = i212;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar114;
                            final int i31 = i211;
                            aVarB2 = androidx.compose.runtime.internal.b.b(pVar20, 1472145357, r14, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d androidx.compose.ui.n modifier, @dl.e androidx.compose.runtime.p pVar23, int i32) {
                                    int i33;
                                    kotlin.jvm.internal.f0.p(modifier, "modifier");
                                    if ((i32 & 14) == 0) {
                                        i33 = (pVar23.s(modifier) ? 4 : 2) | i32;
                                    } else {
                                        i33 = i32;
                                    }
                                    if ((i33 & 91) == 18 && pVar23.b()) {
                                        pVar23.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1472145357, i32, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:129)");
                                    }
                                    androidx.compose.ui.n nVarA = androidx.compose.ui.draw.a.a(modifier, f11);
                                    x1 x1Var2 = x1Var;
                                    boolean z32 = z31;
                                    int i34 = i30;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar24 = pVar22;
                                    int i35 = i31;
                                    pVar23.T(733328855);
                                    androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar23, 0);
                                    pVar23.T(-1323940314);
                                    s1.e eVar = (s1.e) pVar23.K(CompositionLocalsKt.i());
                                    LayoutDirection layoutDirection = (LayoutDirection) pVar23.K(CompositionLocalsKt.p());
                                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar23.K(CompositionLocalsKt.u());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    yh.a<ComposeUiNode> aVarA = companion2.a();
                                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                                    if (!(pVar23.G() instanceof androidx.compose.runtime.e)) {
                                        ComposablesKt.n();
                                    }
                                    pVar23.h();
                                    if (pVar23.D()) {
                                        pVar23.L(aVarA);
                                    } else {
                                        pVar23.d();
                                    }
                                    pVar23.Y();
                                    androidx.compose.runtime.p pVarB = Updater.b(pVar23);
                                    Updater.j(pVarB, i0VarK, companion2.d());
                                    Updater.j(pVarB, eVar, companion2.b());
                                    Updater.j(pVarB, layoutDirection, companion2.c());
                                    Updater.j(pVarB, d2Var, companion2.f());
                                    pVar23.x();
                                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar23)), pVar23, 0);
                                    pVar23.T(2058660585);
                                    pVar23.T(-2137368960);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                    pVar23.T(828149203);
                                    TextFieldImplKt.b(x1Var2.j(z32, pVar23, (i34 & 14) | ((i34 >> 9) & 112)).getValue().M(), o0.f12059a.c(pVar23, 6).getBodyLarge(), pVar24, pVar23, (i35 >> 9) & bb.c.b.f30796me, 0);
                                    pVar23.c0();
                                    pVar23.c0();
                                    pVar23.c0();
                                    pVar23.f();
                                    pVar23.c0();
                                    pVar23.c0();
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar23, Integer num) {
                                    a(nVar, pVar23, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            aVarB2 = null;
                        }
                    }
                    final String strA = p1.a(o1.INSTANCE.c(), pVar20, 6);
                    androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                    Boolean boolValueOf = Boolean.valueOf(z217);
                    final boolean z32 = z217;
                    pVar20.T(511388516);
                    boolean zS2 = pVar20.s(boolValueOf) | pVar20.s(strA);
                    Object objU2 = pVar20.U();
                    if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU2 = new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(@dl.d r semantics) {
                                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                if (z32) {
                                    SemanticsPropertiesKt.m(semantics, strA);
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVar20.N(objU2);
                    }
                    pVar20.c0();
                    androidx.compose.ui.n nVarC = SemanticsModifierKt.c(companion2, false, (yh.l) objU2, r14, null);
                    x1 x1Var2 = colors;
                    boolean z33 = z218;
                    boolean z34 = z217;
                    androidx.compose.foundation.interaction.e eVar = interactionSource;
                    int i32 = i212;
                    final long jM = x1Var2.i(z33, z34, eVar, pVar20, (i32 & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 3) & bb.c.g.f32954lc)).getValue().M();
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar115;
                    androidx.compose.runtime.internal.a aVarB4 = pVar23 != null ? androidx.compose.runtime.internal.b.b(pVar20, 175497959, r14, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar24, int i33) {
                            if ((i33 & 11) == 2 && pVar24.b()) {
                                pVar24.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(175497959, i33, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:148)");
                            }
                            TextFieldImplKt.b(jM, null, pVar23, pVar24, 0, 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar24, Integer num) {
                            a(pVar24, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }) : null;
                    x1 x1Var3 = colors;
                    boolean z35 = z218;
                    boolean z36 = z217;
                    androidx.compose.foundation.interaction.e eVar2 = interactionSource;
                    int i33 = i212;
                    final long jM2 = x1Var3.o(z35, z36, eVar2, pVar20, (i33 & 14) | (i33 & 112) | (i33 & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc)).getValue().M();
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar116;
                    androidx.compose.runtime.internal.a aVarB5 = pVar24 != null ? androidx.compose.runtime.internal.b.b(pVar20, -432498573, r14, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar25, int i34) {
                            if ((i34 & 11) == 2 && pVar25.b()) {
                                pVar25.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-432498573, i34, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:155)");
                            }
                            TextFieldImplKt.b(jM2, null, pVar24, pVar25, 0, 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar25, Integer num) {
                            a(pVar25, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }) : null;
                    x1 x1Var4 = colors;
                    boolean z37 = z218;
                    boolean z38 = z217;
                    androidx.compose.foundation.interaction.e eVar3 = interactionSource;
                    int i34 = i212;
                    final long jM3 = x1Var4.l(z37, z38, eVar3, pVar20, (i34 & 14) | (i34 & 112) | (i34 & bb.c.b.f30796me) | ((i34 >> 3) & bb.c.g.f32954lc)).getValue().M();
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar25 = pVar117;
                    if (pVar25 != null) {
                        final TextStyle textStyle = bodySmall3;
                        aVarB3 = androidx.compose.runtime.internal.b.b(pVar20, -1269483524, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar26, int i35) {
                                if ((i35 & 11) == 2 && pVar26.b()) {
                                    pVar26.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1269483524, i35, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:163)");
                                }
                                TextFieldImplKt.b(jM3, textStyle, pVar25, pVar26, 0, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar26, Integer num) {
                                a(pVar26, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        aVarB3 = null;
                    }
                    int i35 = a.f11450a[type.ordinal()];
                    if (i35 == 1) {
                        androidx.compose.runtime.internal.a aVar = aVarB3;
                        pVar20.T(404041480);
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar26 = container;
                        final int i36 = i212;
                        androidx.compose.runtime.internal.a aVarB6 = androidx.compose.runtime.internal.b.b(pVar20, 1566950173, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar27, int i37) {
                                if ((i37 & 11) == 2 && pVar27.b()) {
                                    pVar27.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1566950173, i37, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:170)");
                                }
                                androidx.compose.ui.n nVarB = LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, TextFieldImplKt.f11420g);
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar26;
                                int i38 = i36;
                                pVar27.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), true, pVar27, 48);
                                pVar27.T(-1323940314);
                                s1.e eVar4 = (s1.e) pVar27.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection = (LayoutDirection) pVar27.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar27.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA = companion3.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarB);
                                if (!(pVar27.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar27.h();
                                if (pVar27.D()) {
                                    pVar27.L(aVarA);
                                } else {
                                    pVar27.d();
                                }
                                pVar27.Y();
                                androidx.compose.runtime.p pVarB = Updater.b(pVar27);
                                Updater.j(pVarB, i0VarK, companion3.d());
                                Updater.j(pVarB, eVar4, companion3.b());
                                Updater.j(pVarB, layoutDirection, companion3.c());
                                Updater.j(pVarB, d2Var, companion3.f());
                                pVar27.x();
                                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar27)), pVar27, 0);
                                pVar27.T(2058660585);
                                pVar27.T(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                pVar27.T(1634460887);
                                pVar28.invoke(pVar27, Integer.valueOf((i38 >> 15) & 14));
                                pVar27.c0();
                                pVar27.c0();
                                pVar27.c0();
                                pVar27.f();
                                pVar27.c0();
                                pVar27.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar27, Integer num) {
                                a(pVar27, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = innerTextField;
                        boolean z39 = z219;
                        androidx.compose.foundation.layout.m0 m0Var = contentPadding;
                        int i37 = i211;
                        TextFieldKt.c(nVarC, pVar27, aVarB, aVarB2, aVarB4, aVarB5, z39, f10, aVarB6, aVar, m0Var, pVar20, 100663296 | ((i37 >> 3) & 112) | ((i37 >> 9) & 3670016) | ((i215 << 21) & 29360128), (i212 >> 9) & 14);
                        pVar20.c0();
                        kotlin.b2 b2Var = kotlin.b2.f124493a;
                    } else if (i35 != 2) {
                        pVar20.T(404044016);
                        pVar20.c0();
                        kotlin.b2 b2Var2 = kotlin.b2.f124493a;
                    } else {
                        pVar20.T(404042394);
                        pVar20.T(-492369756);
                        Object objU3 = pVar20.U();
                        androidx.compose.runtime.p.Companion companion3 = androidx.compose.runtime.p.INSTANCE;
                        if (objU3 == companion3.a()) {
                            objU3 = h2.g(b1.m.c(b1.m.f30386b.c()), null, 2, null);
                            pVar20.N(objU3);
                        }
                        pVar20.c0();
                        final androidx.compose.runtime.a1<b1.m> a1Var = (androidx.compose.runtime.a1) objU3;
                        final androidx.compose.foundation.layout.m0 m0Var2 = contentPadding;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar28 = container;
                        androidx.compose.runtime.internal.a aVar2 = aVarB3;
                        final int i38 = i212;
                        androidx.compose.runtime.internal.a aVarB7 = androidx.compose.runtime.internal.b.b(pVar20, 787383072, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar29, int i39) {
                                if ((i39 & 11) == 2 && pVar29.b()) {
                                    pVar29.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(787383072, i39, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:194)");
                                }
                                androidx.compose.ui.n nVarK = OutlinedTextFieldKt.k(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, TextFieldImplKt.f11420g), a1Var.getValue().getF30389a(), m0Var2);
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar28;
                                int i40 = i38;
                                pVar29.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), true, pVar29, 48);
                                pVar29.T(-1323940314);
                                s1.e eVar4 = (s1.e) pVar29.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection = (LayoutDirection) pVar29.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar29.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA = companion4.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarK);
                                if (!(pVar29.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar29.h();
                                if (pVar29.D()) {
                                    pVar29.L(aVarA);
                                } else {
                                    pVar29.d();
                                }
                                pVar29.Y();
                                androidx.compose.runtime.p pVarB = Updater.b(pVar29);
                                Updater.j(pVarB, i0VarK, companion4.d());
                                Updater.j(pVarB, eVar4, companion4.b());
                                Updater.j(pVarB, layoutDirection, companion4.c());
                                Updater.j(pVarB, d2Var, companion4.f());
                                pVar29.x();
                                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar29)), pVar29, 0);
                                pVar29.T(2058660585);
                                pVar29.T(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                pVar29.T(1492929242);
                                pVar30.invoke(pVar29, Integer.valueOf((i40 >> 15) & 14));
                                pVar29.c0();
                                pVar29.c0();
                                pVar29.c0();
                                pVar29.f();
                                pVar29.c0();
                                pVar29.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar29, Integer num) {
                                a(pVar29, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = innerTextField;
                        boolean z40 = z219;
                        Float fValueOf = Float.valueOf(f10);
                        pVar20.T(511388516);
                        boolean zS3 = pVar20.s(fValueOf) | pVar20.s(a1Var);
                        Object objU4 = pVar20.U();
                        if (zS3 || objU4 == companion3.a()) {
                            objU4 = new yh.l<b1.m, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void a(long j18) {
                                    float fT = b1.m.t(j18) * f10;
                                    float fM = b1.m.m(j18) * f10;
                                    if (b1.m.t(a1Var.getValue().getF30389a()) == fT) {
                                        if (b1.m.m(a1Var.getValue().getF30389a()) == fM) {
                                            return;
                                        }
                                    }
                                    a1Var.setValue(b1.m.c(b1.n.a(fT, fM)));
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(b1.m mVar) {
                                    a(mVar.getF30389a());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            pVar20.N(objU4);
                        }
                        pVar20.c0();
                        yh.l lVar = (yh.l) objU4;
                        androidx.compose.foundation.layout.m0 m0Var3 = contentPadding;
                        int i39 = i211;
                        OutlinedTextFieldKt.c(nVarC, pVar29, aVarB2, aVarB, aVarB4, aVarB5, z40, f10, lVar, aVarB7, aVar2, m0Var3, pVar20, 805306368 | ((i39 >> 3) & 112) | ((i39 >> 9) & 3670016) | ((i215 << 21) & 29360128), (i212 >> 6) & 112);
                        pVar20.c0();
                        kotlin.b2 b2Var3 = kotlin.b2.f124493a;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }
            }), pVar11, 1769472);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar12 = pVar7;
            pVar13 = pVar8;
            pVar14 = pVar9;
            pVar15 = pVar10;
            z20 = z13;
            z21 = z14;
            z22 = z15;
        }
        u1VarH = pVar11.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar20, int i213) {
                TextFieldImplKt.a(type, value, innerTextField, visualTransformation, pVar, pVar12, pVar13, pVar14, pVar15, z20, z21, z22, interactionSource, contentPadding, colors, container, pVar20, i10 | 1, i11, i12);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar20, Integer num) {
                a(pVar20, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @androidx.compose.runtime.h
    public static final void b(final long j10, @dl.e TextStyle textStyle, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        final int i12;
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-1520066345);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.z(j10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(textStyle) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.s(content) ? 256 : 128;
        }
        if ((i12 & bb.c.b.f30586db) == 146 && pVarF.b()) {
            pVarF.l();
        } else {
            if (i13 != 0) {
                textStyle = null;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1520066345, i12, -1, "androidx.compose.material3.Decoration (TextFieldImpl.kt:236)");
            }
            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1449369305, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$Decoration$contentWithColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i14) {
                    if ((i14 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1449369305, i14, -1, "androidx.compose.material3.Decoration.<anonymous> (TextFieldImpl.kt:241)");
                    }
                    CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(j10))}, content, pVar2, ((i12 >> 3) & 112) | 8);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
            if (textStyle != null) {
                pVarF.T(1830466317);
                TextKt.a(textStyle, aVarB, pVarF, ((i12 >> 3) & 14) | 48);
            } else {
                pVarF.T(1830466369);
                aVarB.invoke(pVarF, 6);
            }
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        final TextStyle textStyle2 = textStyle;
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldImplKt$Decoration$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i14) {
                TextFieldImplKt.b(j10, textStyle2, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    public static final float c() {
        return f11426m;
    }

    @dl.d
    public static final androidx.compose.ui.n d() {
        return f11428o;
    }

    @dl.e
    public static final Object e(@dl.d androidx.compose.ui.layout.m mVar) {
        kotlin.jvm.internal.f0.p(mVar, "<this>");
        Object objB = mVar.b();
        androidx.compose.ui.layout.t tVar = objB instanceof androidx.compose.ui.layout.t ? (androidx.compose.ui.layout.t) objB : null;
        if (tVar != null) {
            return tVar.getLayoutId();
        }
        return null;
    }

    public static final float f() {
        return f11427n;
    }

    public static final float g() {
        return f11425l;
    }

    public static final long h() {
        return f11421h;
    }

    public static final int i(@dl.e androidx.compose.ui.layout.e1 e1Var) {
        if (e1Var != null) {
            return e1Var.getHeight();
        }
        return 0;
    }

    public static final int j(@dl.e androidx.compose.ui.layout.e1 e1Var) {
        if (e1Var != null) {
            return e1Var.getWidth();
        }
        return 0;
    }
}
