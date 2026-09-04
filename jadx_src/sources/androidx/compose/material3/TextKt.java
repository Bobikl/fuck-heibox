package androidx.compose.material3;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;
import p1.LocaleList;

/* JADX INFO: compiled from: Text.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0086\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÉ\u0001\u0010 \u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u001aß\u0001\u0010&\u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\"2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020$0#2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a*\u0010,\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001e2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u001c0)¢\u0006\u0002\b*H\u0007¢\u0006\u0004\b,\u0010-\"\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u001e0.8\u0006¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b0\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, d2 = {"", "text", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/graphics/l0;", "color", "Ls1/u;", com.google.android.exoplayer2.text.ttml.d.J, "Landroidx/compose/ui/text/font/g0;", com.google.android.exoplayer2.text.ttml.d.I, "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "Landroidx/compose/ui/text/font/v;", com.google.android.exoplayer2.text.ttml.d.K, "letterSpacing", "Landroidx/compose/ui/text/style/i;", com.google.android.exoplayer2.text.ttml.d.P, "Landroidx/compose/ui/text/style/h;", com.google.android.exoplayer2.text.ttml.d.Q, "lineHeight", "Landroidx/compose/ui/text/style/q;", "overflow", "", "softWrap", "", "maxLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/i0;", "Lkotlin/b2;", "onTextLayout", "Landroidx/compose/ui/text/q0;", "style", ak.aF, "(Ljava/lang/String;Landroidx/compose/ui/n;JJLandroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/v;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/text/style/h;JIZILyh/l;Landroidx/compose/ui/text/q0;Landroidx/compose/runtime/p;III)V", "Landroidx/compose/ui/text/d;", "", "Landroidx/compose/foundation/text/a;", "inlineContent", "b", "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/n;JJLandroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/v;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/text/style/h;JIZILjava/util/Map;Lyh/l;Landroidx/compose/ui/text/q0;Landroidx/compose/runtime/p;III)V", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/h;", "content", ak.av, "(Landroidx/compose/ui/text/q0;Lyh/p;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/runtime/j1;", "Landroidx/compose/runtime/j1;", "d", "()Landroidx/compose/runtime/j1;", "LocalTextStyle", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class TextKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<TextStyle> f11684a = CompositionLocalKt.c(androidx.compose.runtime.e2.w(), new yh.a<TextStyle>() { // from class: androidx.compose.material3.TextKt$LocalTextStyle$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextStyle invoke() {
            return TextStyle.INSTANCE.a();
        }
    });

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final TextStyle value, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        kotlin.jvm.internal.f0.p(value, "value");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-460300127);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(value) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(content) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-460300127, i11, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:258)");
            }
            androidx.compose.runtime.j1<TextStyle> j1Var = f11684a;
            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{j1Var.f(((TextStyle) pVarF.K(j1Var)).R(value))}, content, pVarF, (i11 & 112) | 8);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$ProvideTextStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                TextKt.a(value, content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0141  */
    /* JADX WARN: Code duplicated, block: B:106:0x0149  */
    /* JADX WARN: Code duplicated, block: B:107:0x014e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x015a  */
    /* JADX WARN: Code duplicated, block: B:112:0x015d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0162  */
    /* JADX WARN: Code duplicated, block: B:117:0x0168  */
    /* JADX WARN: Code duplicated, block: B:118:0x016b  */
    /* JADX WARN: Code duplicated, block: B:120:0x016f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0177  */
    /* JADX WARN: Code duplicated, block: B:123:0x017a  */
    /* JADX WARN: Code duplicated, block: B:125:0x017f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0187  */
    /* JADX WARN: Code duplicated, block: B:129:0x018a  */
    /* JADX WARN: Code duplicated, block: B:131:0x018e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0196  */
    /* JADX WARN: Code duplicated, block: B:134:0x0199  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:154:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:158:0x01db  */
    /* JADX WARN: Code duplicated, block: B:159:0x01de  */
    /* JADX WARN: Code duplicated, block: B:164:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:169:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:171:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:174:0x0205  */
    /* JADX WARN: Code duplicated, block: B:182:0x0243  */
    /* JADX WARN: Code duplicated, block: B:184:0x024a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0285 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x0287  */
    /* JADX WARN: Code duplicated, block: B:196:0x028a  */
    /* JADX WARN: Code duplicated, block: B:198:0x028e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0295  */
    /* JADX WARN: Code duplicated, block: B:201:0x0299  */
    /* JADX WARN: Code duplicated, block: B:202:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:205:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:206:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:208:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:209:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:211:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:212:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:214:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:215:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:217:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:218:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:221:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:223:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:224:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:226:0x02da  */
    /* JADX WARN: Code duplicated, block: B:227:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:229:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:230:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:232:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:233:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:235:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:236:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:238:0x0301  */
    /* JADX WARN: Code duplicated, block: B:239:0x0304  */
    /* JADX WARN: Code duplicated, block: B:242:0x030a  */
    /* JADX WARN: Code duplicated, block: B:243:0x031b  */
    /* JADX WARN: Code duplicated, block: B:247:0x032f  */
    /* JADX WARN: Code duplicated, block: B:248:0x033a  */
    /* JADX WARN: Code duplicated, block: B:251:0x034c  */
    /* JADX WARN: Code duplicated, block: B:252:0x034e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0351  */
    /* JADX WARN: Code duplicated, block: B:255:0x0354  */
    /* JADX WARN: Code duplicated, block: B:257:0x0360  */
    /* JADX WARN: Code duplicated, block: B:258:0x0362  */
    /* JADX WARN: Code duplicated, block: B:261:0x0366  */
    /* JADX WARN: Code duplicated, block: B:265:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:270:0x0414  */
    /* JADX WARN: Code duplicated, block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00df  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0102  */
    /* JADX WARN: Code duplicated, block: B:86:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0111  */
    /* JADX WARN: Code duplicated, block: B:89:0x0119  */
    /* JADX WARN: Code duplicated, block: B:91:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0122  */
    /* JADX WARN: Code duplicated, block: B:96:0x0129  */
    /* JADX WARN: Code duplicated, block: B:97:0x0130  */
    /* JADX WARN: Code duplicated, block: B:99:0x0138  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final androidx.compose.ui.text.d text, @dl.e androidx.compose.ui.n nVar, long j10, long j11, @dl.e androidx.compose.ui.text.font.g0 g0Var, @dl.e FontWeight fontWeight, @dl.e androidx.compose.ui.text.font.v vVar, long j12, @dl.e androidx.compose.ui.text.style.i iVar, @dl.e androidx.compose.ui.text.style.h hVar, long j13, int i10, boolean z10, int i11, @dl.e Map<String, androidx.compose.foundation.text.a> map, @dl.e yh.l<? super TextLayoutResult, kotlin.b2> lVar, @dl.e TextStyle textStyle, @dl.e androidx.compose.runtime.p pVar, final int i12, final int i13, final int i14) {
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
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        androidx.compose.ui.n nVar2;
        long jU;
        long jB;
        androidx.compose.ui.text.font.g0 g0Var2;
        FontWeight fontWeight2;
        androidx.compose.ui.text.font.v vVar2;
        long jB2;
        androidx.compose.ui.text.style.i iVar2;
        androidx.compose.ui.text.style.h hVar2;
        long jB3;
        int iA;
        boolean z11;
        int i44;
        Map<String, androidx.compose.foundation.text.a> mapZ;
        yh.l<? super TextLayoutResult, kotlin.b2> lVar2;
        TextStyle textStyle2;
        int i45;
        Map<String, androidx.compose.foundation.text.a> map2;
        int i46;
        boolean z12;
        long j14;
        androidx.compose.ui.text.style.i iVar3;
        int i47;
        long j15;
        androidx.compose.ui.graphics.l0.Companion companion;
        boolean z13;
        long jP;
        boolean z14;
        long j16;
        final androidx.compose.ui.text.style.h hVar3;
        final int i48;
        final long j17;
        final Map<String, androidx.compose.foundation.text.a> map3;
        final yh.l<? super TextLayoutResult, kotlin.b2> lVar3;
        final int i49;
        final androidx.compose.ui.text.style.i iVar4;
        final long j18;
        final boolean z15;
        final androidx.compose.ui.text.font.v vVar3;
        final TextStyle textStyle3;
        final long j19;
        final androidx.compose.ui.text.font.g0 g0Var3;
        final FontWeight fontWeight3;
        androidx.compose.runtime.u1 u1VarH;
        int i50;
        kotlin.jvm.internal.f0.p(text, "text");
        androidx.compose.runtime.p pVarF = pVar.F(224529679);
        if ((i14 & 1) != 0) {
            i15 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i15 = (pVarF.s(text) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        int i51 = i14 & 2;
        if (i51 == 0) {
            if ((i12 & 112) == 0) {
                i15 |= pVarF.s(nVar) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                i15 |= bb.c.b.f30966u4;
            } else if ((i12 & bb.c.b.f30796me) == 0) {
                if (pVarF.z(j10)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                i15 |= bb.c.d.f31193dj;
            } else if ((i12 & bb.c.g.f32954lc) == 0) {
                if (pVarF.z(j11)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i15 |= i19;
            }
            i20 = i14 & 16;
            if (i20 != 0) {
                i15 |= 24576;
            } else if ((i12 & 57344) == 0) {
                if (pVarF.s(g0Var)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i15 |= i21;
            }
            i22 = i14 & 32;
            if (i22 != 0) {
                i15 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.s(fontWeight)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i15 |= i23;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.s(vVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (pVarF.z(j12)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            i28 = i14 & 256;
            if (i28 != 0) {
                i15 |= 100663296;
            } else if ((i12 & 234881024) == 0) {
                if (pVarF.s(iVar)) {
                    i29 = 67108864;
                } else {
                    i29 = 33554432;
                }
                i15 |= i29;
            }
            i30 = i14 & 512;
            if (i30 != 0) {
                i15 |= com.google.android.exoplayer2.j.G;
            } else if ((i12 & 1879048192) == 0) {
                if (pVarF.s(hVar)) {
                    i31 = 536870912;
                } else {
                    i31 = 268435456;
                }
                i15 |= i31;
            }
            i32 = i14 & 1024;
            if (i32 != 0) {
                i33 = i13 | 6;
            } else if ((i13 & 14) == 0) {
                if (pVarF.z(j13)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i13 | i34;
            } else {
                i33 = i13;
            }
            i35 = i14 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i13 & 112) != 0) {
                if (pVarF.y(i10)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i33 |= i36;
            }
            i37 = i33;
            i38 = i14 & 4096;
            if (i38 != 0) {
                if ((i13 & bb.c.b.f30796me) == 0) {
                    if (pVarF.u(z10)) {
                        i39 = 256;
                    } else {
                        i39 = 128;
                    }
                    i37 |= i39;
                }
                i40 = i14 & 8192;
                if (i40 != 0) {
                    if ((i13 & bb.c.g.f32954lc) == 0) {
                        i37 |= pVarF.y(i11) ? 2048 : 1024;
                    }
                    i41 = i14 & 16384;
                    if (i41 != 0) {
                        i37 |= 8192;
                    }
                    i42 = i14 & 32768;
                    if (i42 != 0) {
                        if ((i13 & 458752) == 0) {
                            if (pVarF.s(lVar)) {
                                i43 = 131072;
                            } else {
                                i43 = 65536;
                            }
                            i37 |= i43;
                        }
                        if ((i13 & 3670016) != 0) {
                            if ((i14 & 65536) == 0 || !pVarF.s(textStyle)) {
                                i50 = 524288;
                            } else {
                                i50 = 1048576;
                            }
                            i37 |= i50;
                        }
                        if (i41 != 16384 && (1533916891 & i15) == 306783378 && (2995931 & i37) == 599186 && pVarF.b()) {
                            pVarF.l();
                            nVar2 = nVar;
                            j18 = j10;
                            jB = j11;
                            g0Var3 = g0Var;
                            fontWeight3 = fontWeight;
                            vVar3 = vVar;
                            j17 = j12;
                            iVar4 = iVar;
                            hVar3 = hVar;
                            j19 = j13;
                            i49 = i10;
                            z15 = z10;
                            i48 = i11;
                            map3 = map;
                            lVar3 = lVar;
                            textStyle3 = textStyle;
                        } else {
                            pVarF.W();
                            if ((i12 & 1) != 0 || pVarF.o()) {
                                if (i51 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i16 != 0) {
                                    jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                                } else {
                                    jU = j10;
                                }
                                if (i18 != 0) {
                                    jB = s1.u.f139249b.b();
                                } else {
                                    jB = j11;
                                }
                                if (i20 != 0) {
                                    g0Var2 = null;
                                } else {
                                    g0Var2 = g0Var;
                                }
                                if (i22 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i24 != 0) {
                                    vVar2 = null;
                                } else {
                                    vVar2 = vVar;
                                }
                                if (i26 != 0) {
                                    jB2 = s1.u.f139249b.b();
                                } else {
                                    jB2 = j12;
                                }
                                if (i28 != 0) {
                                    iVar2 = null;
                                } else {
                                    iVar2 = iVar;
                                }
                                hVar2 = i30 == 0 ? hVar : null;
                                if (i32 != 0) {
                                    jB3 = s1.u.f139249b.b();
                                } else {
                                    jB3 = j13;
                                }
                                if (i35 != 0) {
                                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                                } else {
                                    iA = i10;
                                }
                                if (i38 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i40 != 0) {
                                    i44 = Integer.MAX_VALUE;
                                } else {
                                    i44 = i11;
                                }
                                if (i41 != 0) {
                                    mapZ = kotlin.collections.s0.z();
                                    i37 &= -57345;
                                } else {
                                    mapZ = map;
                                }
                                if (i42 != 0) {
                                    lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                        public final void a(@dl.d TextLayoutResult it) {
                                            kotlin.jvm.internal.f0.p(it, "it");
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                            a(textLayoutResult);
                                            return kotlin.b2.f124493a;
                                        }
                                    };
                                } else {
                                    lVar2 = lVar;
                                }
                                if ((i14 & 65536) != 0) {
                                    i45 = i37 & (-3670017);
                                    textStyle2 = (TextStyle) pVarF.K(f11684a);
                                } else {
                                    textStyle2 = textStyle;
                                    i45 = i37;
                                }
                                map2 = mapZ;
                                i46 = i44;
                                z12 = z11;
                                j14 = jB3;
                                iVar3 = iVar2;
                                i47 = iA;
                                j15 = jB2;
                            } else {
                                pVarF.l();
                                if (i41 != 0) {
                                    i37 &= -57345;
                                }
                                if ((i14 & 65536) != 0) {
                                    i37 &= -3670017;
                                }
                                nVar2 = nVar;
                                jU = j10;
                                jB = j11;
                                g0Var2 = g0Var;
                                fontWeight2 = fontWeight;
                                vVar2 = vVar;
                                j15 = j12;
                                iVar3 = iVar;
                                hVar2 = hVar;
                                i47 = i10;
                                z12 = z10;
                                i46 = i11;
                                map2 = map;
                                lVar2 = lVar;
                                textStyle2 = textStyle;
                                i45 = i37;
                                j14 = j13;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                            }
                            pVarF.T(79587464);
                            companion = androidx.compose.ui.graphics.l0.INSTANCE;
                            if (jU != companion.u()) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                j16 = jU;
                            } else {
                                jP = textStyle2.p();
                                if (jP != companion.u()) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (!z14) {
                                    jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                                }
                                j16 = jP;
                            }
                            pVarF.c0();
                            TextStyle textStyle4 = textStyle2;
                            TextStyle textStyleR = textStyle4.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                            long j20 = j15;
                            int i52 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                            int i53 = i45 << 9;
                            BasicTextKt.a(text, nVar2, textStyleR, lVar2, i47, z12, i46, map2, pVarF, i52 | (57344 & i53) | (i53 & 458752) | (i53 & 3670016), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            hVar3 = hVar2;
                            i48 = i46;
                            j17 = j20;
                            long j21 = jU;
                            map3 = map2;
                            lVar3 = lVar2;
                            i49 = i47;
                            androidx.compose.ui.text.font.g0 g0Var4 = g0Var2;
                            iVar4 = iVar3;
                            j18 = j21;
                            FontWeight fontWeight4 = fontWeight2;
                            z15 = z12;
                            vVar3 = vVar2;
                            textStyle3 = textStyle4;
                            j19 = j14;
                            g0Var3 = g0Var4;
                            fontWeight3 = fontWeight4;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        final androidx.compose.ui.n nVar3 = nVar2;
                        final long j22 = jB;
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i54) {
                                TextKt.b(text, nVar3, j18, j22, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    }
                    i37 |= androidx.profileinstaller.o.c.f26824k;
                    if ((i13 & 3670016) != 0) {
                        if ((i14 & 65536) == 0) {
                            i50 = 524288;
                        } else {
                            i50 = 524288;
                        }
                        i37 |= i50;
                    }
                    if (i41 != 16384) {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        } else {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                        }
                        pVarF.T(79587464);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            j16 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j16 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyle5 = textStyle2;
                        TextStyle textStyleR2 = textStyle5.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        long j23 = j15;
                        int i54 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                        int i55 = i45 << 9;
                        BasicTextKt.a(text, nVar2, textStyleR2, lVar2, i47, z12, i46, map2, pVarF, i54 | (57344 & i55) | (i55 & 458752) | (i55 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar3 = hVar2;
                        i48 = i46;
                        j17 = j23;
                        long j24 = jU;
                        map3 = map2;
                        lVar3 = lVar2;
                        i49 = i47;
                        androidx.compose.ui.text.font.g0 g0Var5 = g0Var2;
                        iVar4 = iVar3;
                        j18 = j24;
                        FontWeight fontWeight5 = fontWeight2;
                        z15 = z12;
                        vVar3 = vVar2;
                        textStyle3 = textStyle5;
                        j19 = j14;
                        g0Var3 = g0Var5;
                        fontWeight3 = fontWeight5;
                    } else {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        } else {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                        }
                        pVarF.T(79587464);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            j16 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j16 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyle6 = textStyle2;
                        TextStyle textStyleR3 = textStyle6.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        long j25 = j15;
                        int i56 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                        int i57 = i45 << 9;
                        BasicTextKt.a(text, nVar2, textStyleR3, lVar2, i47, z12, i46, map2, pVarF, i56 | (57344 & i57) | (i57 & 458752) | (i57 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar3 = hVar2;
                        i48 = i46;
                        j17 = j25;
                        long j26 = jU;
                        map3 = map2;
                        lVar3 = lVar2;
                        i49 = i47;
                        androidx.compose.ui.text.font.g0 g0Var6 = g0Var2;
                        iVar4 = iVar3;
                        j18 = j26;
                        FontWeight fontWeight6 = fontWeight2;
                        z15 = z12;
                        vVar3 = vVar2;
                        textStyle3 = textStyle6;
                        j19 = j14;
                        g0Var3 = g0Var6;
                        fontWeight3 = fontWeight6;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar4 = nVar2;
                    final long j27 = jB;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i58) {
                            TextKt.b(text, nVar4, j18, j27, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i37 |= bb.c.d.f31193dj;
                i41 = i14 & 16384;
                if (i41 != 0) {
                    i37 |= 8192;
                }
                i42 = i14 & 32768;
                if (i42 != 0) {
                    if ((i13 & 458752) == 0) {
                        if (pVarF.s(lVar)) {
                            i43 = 131072;
                        } else {
                            i43 = 65536;
                        }
                        i37 |= i43;
                    }
                    if ((i13 & 3670016) != 0) {
                        if ((i14 & 65536) == 0) {
                            i50 = 524288;
                        } else {
                            i50 = 524288;
                        }
                        i37 |= i50;
                    }
                    if (i41 != 16384) {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        } else {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                        }
                        pVarF.T(79587464);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            j16 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j16 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyle7 = textStyle2;
                        TextStyle textStyleR4 = textStyle7.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        long j28 = j15;
                        int i58 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                        int i59 = i45 << 9;
                        BasicTextKt.a(text, nVar2, textStyleR4, lVar2, i47, z12, i46, map2, pVarF, i58 | (57344 & i59) | (i59 & 458752) | (i59 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar3 = hVar2;
                        i48 = i46;
                        j17 = j28;
                        long j29 = jU;
                        map3 = map2;
                        lVar3 = lVar2;
                        i49 = i47;
                        androidx.compose.ui.text.font.g0 g0Var7 = g0Var2;
                        iVar4 = iVar3;
                        j18 = j29;
                        FontWeight fontWeight7 = fontWeight2;
                        z15 = z12;
                        vVar3 = vVar2;
                        textStyle3 = textStyle7;
                        j19 = j14;
                        g0Var3 = g0Var7;
                        fontWeight3 = fontWeight7;
                    } else {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        } else {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                        }
                        pVarF.T(79587464);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            j16 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j16 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyle8 = textStyle2;
                        TextStyle textStyleR5 = textStyle8.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        long j210 = j15;
                        int i510 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                        int i511 = i45 << 9;
                        BasicTextKt.a(text, nVar2, textStyleR5, lVar2, i47, z12, i46, map2, pVarF, i510 | (57344 & i511) | (i511 & 458752) | (i511 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar3 = hVar2;
                        i48 = i46;
                        j17 = j210;
                        long j211 = jU;
                        map3 = map2;
                        lVar3 = lVar2;
                        i49 = i47;
                        androidx.compose.ui.text.font.g0 g0Var8 = g0Var2;
                        iVar4 = iVar3;
                        j18 = j211;
                        FontWeight fontWeight8 = fontWeight2;
                        z15 = z12;
                        vVar3 = vVar2;
                        textStyle3 = textStyle8;
                        j19 = j14;
                        g0Var3 = g0Var8;
                        fontWeight3 = fontWeight8;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar5 = nVar2;
                    final long j212 = jB;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i512) {
                            TextKt.b(text, nVar5, j18, j212, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i37 |= androidx.profileinstaller.o.c.f26824k;
                if ((i13 & 3670016) != 0) {
                    if ((i14 & 65536) == 0) {
                        i50 = 524288;
                    } else {
                        i50 = 524288;
                    }
                    i37 |= i50;
                }
                if (i41 != 16384) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    } else {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                    }
                    pVarF.T(79587464);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        j16 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j16 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyle9 = textStyle2;
                    TextStyle textStyleR6 = textStyle9.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    long j213 = j15;
                    int i512 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                    int i513 = i45 << 9;
                    BasicTextKt.a(text, nVar2, textStyleR6, lVar2, i47, z12, i46, map2, pVarF, i512 | (57344 & i513) | (i513 & 458752) | (i513 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar3 = hVar2;
                    i48 = i46;
                    j17 = j213;
                    long j214 = jU;
                    map3 = map2;
                    lVar3 = lVar2;
                    i49 = i47;
                    androidx.compose.ui.text.font.g0 g0Var9 = g0Var2;
                    iVar4 = iVar3;
                    j18 = j214;
                    FontWeight fontWeight9 = fontWeight2;
                    z15 = z12;
                    vVar3 = vVar2;
                    textStyle3 = textStyle9;
                    j19 = j14;
                    g0Var3 = g0Var9;
                    fontWeight3 = fontWeight9;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    } else {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                    }
                    pVarF.T(79587464);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        j16 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j16 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyle10 = textStyle2;
                    TextStyle textStyleR7 = textStyle10.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    long j215 = j15;
                    int i514 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                    int i515 = i45 << 9;
                    BasicTextKt.a(text, nVar2, textStyleR7, lVar2, i47, z12, i46, map2, pVarF, i514 | (57344 & i515) | (i515 & 458752) | (i515 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar3 = hVar2;
                    i48 = i46;
                    j17 = j215;
                    long j216 = jU;
                    map3 = map2;
                    lVar3 = lVar2;
                    i49 = i47;
                    androidx.compose.ui.text.font.g0 g0Var10 = g0Var2;
                    iVar4 = iVar3;
                    j18 = j216;
                    FontWeight fontWeight10 = fontWeight2;
                    z15 = z12;
                    vVar3 = vVar2;
                    textStyle3 = textStyle10;
                    j19 = j14;
                    g0Var3 = g0Var10;
                    fontWeight3 = fontWeight10;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar6 = nVar2;
                final long j217 = jB;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i516) {
                        TextKt.b(text, nVar6, j18, j217, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i37 |= bb.c.b.f30966u4;
            i40 = i14 & 8192;
            if (i40 != 0) {
                if ((i13 & bb.c.g.f32954lc) == 0) {
                    i37 |= pVarF.y(i11) ? 2048 : 1024;
                }
                i41 = i14 & 16384;
                if (i41 != 0) {
                    i37 |= 8192;
                }
                i42 = i14 & 32768;
                if (i42 != 0) {
                    if ((i13 & 458752) == 0) {
                        if (pVarF.s(lVar)) {
                            i43 = 131072;
                        } else {
                            i43 = 65536;
                        }
                        i37 |= i43;
                    }
                    if ((i13 & 3670016) != 0) {
                        if ((i14 & 65536) == 0) {
                            i50 = 524288;
                        } else {
                            i50 = 524288;
                        }
                        i37 |= i50;
                    }
                    if (i41 != 16384) {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        } else {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                        }
                        pVarF.T(79587464);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            j16 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j16 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyle11 = textStyle2;
                        TextStyle textStyleR8 = textStyle11.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        long j218 = j15;
                        int i516 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                        int i517 = i45 << 9;
                        BasicTextKt.a(text, nVar2, textStyleR8, lVar2, i47, z12, i46, map2, pVarF, i516 | (57344 & i517) | (i517 & 458752) | (i517 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar3 = hVar2;
                        i48 = i46;
                        j17 = j218;
                        long j219 = jU;
                        map3 = map2;
                        lVar3 = lVar2;
                        i49 = i47;
                        androidx.compose.ui.text.font.g0 g0Var11 = g0Var2;
                        iVar4 = iVar3;
                        j18 = j219;
                        FontWeight fontWeight11 = fontWeight2;
                        z15 = z12;
                        vVar3 = vVar2;
                        textStyle3 = textStyle11;
                        j19 = j14;
                        g0Var3 = g0Var11;
                        fontWeight3 = fontWeight11;
                    } else {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        } else {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                        }
                        pVarF.T(79587464);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            j16 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j16 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyle12 = textStyle2;
                        TextStyle textStyleR9 = textStyle12.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        long j2110 = j15;
                        int i518 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                        int i519 = i45 << 9;
                        BasicTextKt.a(text, nVar2, textStyleR9, lVar2, i47, z12, i46, map2, pVarF, i518 | (57344 & i519) | (i519 & 458752) | (i519 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar3 = hVar2;
                        i48 = i46;
                        j17 = j2110;
                        long j2111 = jU;
                        map3 = map2;
                        lVar3 = lVar2;
                        i49 = i47;
                        androidx.compose.ui.text.font.g0 g0Var12 = g0Var2;
                        iVar4 = iVar3;
                        j18 = j2111;
                        FontWeight fontWeight12 = fontWeight2;
                        z15 = z12;
                        vVar3 = vVar2;
                        textStyle3 = textStyle12;
                        j19 = j14;
                        g0Var3 = g0Var12;
                        fontWeight3 = fontWeight12;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar7 = nVar2;
                    final long j2112 = jB;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i5110) {
                            TextKt.b(text, nVar7, j18, j2112, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i37 |= androidx.profileinstaller.o.c.f26824k;
                if ((i13 & 3670016) != 0) {
                    if ((i14 & 65536) == 0) {
                        i50 = 524288;
                    } else {
                        i50 = 524288;
                    }
                    i37 |= i50;
                }
                if (i41 != 16384) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    } else {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                    }
                    pVarF.T(79587464);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        j16 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j16 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyle13 = textStyle2;
                    TextStyle textStyleR10 = textStyle13.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    long j2113 = j15;
                    int i5110 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                    int i5111 = i45 << 9;
                    BasicTextKt.a(text, nVar2, textStyleR10, lVar2, i47, z12, i46, map2, pVarF, i5110 | (57344 & i5111) | (i5111 & 458752) | (i5111 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar3 = hVar2;
                    i48 = i46;
                    j17 = j2113;
                    long j2114 = jU;
                    map3 = map2;
                    lVar3 = lVar2;
                    i49 = i47;
                    androidx.compose.ui.text.font.g0 g0Var13 = g0Var2;
                    iVar4 = iVar3;
                    j18 = j2114;
                    FontWeight fontWeight13 = fontWeight2;
                    z15 = z12;
                    vVar3 = vVar2;
                    textStyle3 = textStyle13;
                    j19 = j14;
                    g0Var3 = g0Var13;
                    fontWeight3 = fontWeight13;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    } else {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                    }
                    pVarF.T(79587464);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        j16 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j16 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyle14 = textStyle2;
                    TextStyle textStyleR11 = textStyle14.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    long j2115 = j15;
                    int i5112 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                    int i5113 = i45 << 9;
                    BasicTextKt.a(text, nVar2, textStyleR11, lVar2, i47, z12, i46, map2, pVarF, i5112 | (57344 & i5113) | (i5113 & 458752) | (i5113 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar3 = hVar2;
                    i48 = i46;
                    j17 = j2115;
                    long j2116 = jU;
                    map3 = map2;
                    lVar3 = lVar2;
                    i49 = i47;
                    androidx.compose.ui.text.font.g0 g0Var14 = g0Var2;
                    iVar4 = iVar3;
                    j18 = j2116;
                    FontWeight fontWeight14 = fontWeight2;
                    z15 = z12;
                    vVar3 = vVar2;
                    textStyle3 = textStyle14;
                    j19 = j14;
                    g0Var3 = g0Var14;
                    fontWeight3 = fontWeight14;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar8 = nVar2;
                final long j2117 = jB;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i5114) {
                        TextKt.b(text, nVar8, j18, j2117, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i37 |= bb.c.d.f31193dj;
            i41 = i14 & 16384;
            if (i41 != 0) {
                i37 |= 8192;
            }
            i42 = i14 & 32768;
            if (i42 != 0) {
                if ((i13 & 458752) == 0) {
                    if (pVarF.s(lVar)) {
                        i43 = 131072;
                    } else {
                        i43 = 65536;
                    }
                    i37 |= i43;
                }
                if ((i13 & 3670016) != 0) {
                    if ((i14 & 65536) == 0) {
                        i50 = 524288;
                    } else {
                        i50 = 524288;
                    }
                    i37 |= i50;
                }
                if (i41 != 16384) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    } else {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                    }
                    pVarF.T(79587464);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        j16 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j16 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyle15 = textStyle2;
                    TextStyle textStyleR12 = textStyle15.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    long j2118 = j15;
                    int i5114 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                    int i5115 = i45 << 9;
                    BasicTextKt.a(text, nVar2, textStyleR12, lVar2, i47, z12, i46, map2, pVarF, i5114 | (57344 & i5115) | (i5115 & 458752) | (i5115 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar3 = hVar2;
                    i48 = i46;
                    j17 = j2118;
                    long j2119 = jU;
                    map3 = map2;
                    lVar3 = lVar2;
                    i49 = i47;
                    androidx.compose.ui.text.font.g0 g0Var15 = g0Var2;
                    iVar4 = iVar3;
                    j18 = j2119;
                    FontWeight fontWeight15 = fontWeight2;
                    z15 = z12;
                    vVar3 = vVar2;
                    textStyle3 = textStyle15;
                    j19 = j14;
                    g0Var3 = g0Var15;
                    fontWeight3 = fontWeight15;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    } else {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                    }
                    pVarF.T(79587464);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        j16 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j16 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyle16 = textStyle2;
                    TextStyle textStyleR13 = textStyle16.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    long j21110 = j15;
                    int i5116 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                    int i5117 = i45 << 9;
                    BasicTextKt.a(text, nVar2, textStyleR13, lVar2, i47, z12, i46, map2, pVarF, i5116 | (57344 & i5117) | (i5117 & 458752) | (i5117 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar3 = hVar2;
                    i48 = i46;
                    j17 = j21110;
                    long j21111 = jU;
                    map3 = map2;
                    lVar3 = lVar2;
                    i49 = i47;
                    androidx.compose.ui.text.font.g0 g0Var16 = g0Var2;
                    iVar4 = iVar3;
                    j18 = j21111;
                    FontWeight fontWeight16 = fontWeight2;
                    z15 = z12;
                    vVar3 = vVar2;
                    textStyle3 = textStyle16;
                    j19 = j14;
                    g0Var3 = g0Var16;
                    fontWeight3 = fontWeight16;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar9 = nVar2;
                final long j21112 = jB;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i5118) {
                        TextKt.b(text, nVar9, j18, j21112, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i37 |= androidx.profileinstaller.o.c.f26824k;
            if ((i13 & 3670016) != 0) {
                if ((i14 & 65536) == 0) {
                    i50 = 524288;
                } else {
                    i50 = 524288;
                }
                i37 |= i50;
            }
            if (i41 != 16384) {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                } else {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                }
                pVarF.T(79587464);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    j16 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j16 = jP;
                }
                pVarF.c0();
                TextStyle textStyle17 = textStyle2;
                TextStyle textStyleR14 = textStyle17.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                long j21113 = j15;
                int i5118 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                int i5119 = i45 << 9;
                BasicTextKt.a(text, nVar2, textStyleR14, lVar2, i47, z12, i46, map2, pVarF, i5118 | (57344 & i5119) | (i5119 & 458752) | (i5119 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar3 = hVar2;
                i48 = i46;
                j17 = j21113;
                long j21114 = jU;
                map3 = map2;
                lVar3 = lVar2;
                i49 = i47;
                androidx.compose.ui.text.font.g0 g0Var17 = g0Var2;
                iVar4 = iVar3;
                j18 = j21114;
                FontWeight fontWeight17 = fontWeight2;
                z15 = z12;
                vVar3 = vVar2;
                textStyle3 = textStyle17;
                j19 = j14;
                g0Var3 = g0Var17;
                fontWeight3 = fontWeight17;
            } else {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                } else {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                }
                pVarF.T(79587464);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    j16 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j16 = jP;
                }
                pVarF.c0();
                TextStyle textStyle18 = textStyle2;
                TextStyle textStyleR15 = textStyle18.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                long j21115 = j15;
                int i51110 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                int i51111 = i45 << 9;
                BasicTextKt.a(text, nVar2, textStyleR15, lVar2, i47, z12, i46, map2, pVarF, i51110 | (57344 & i51111) | (i51111 & 458752) | (i51111 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar3 = hVar2;
                i48 = i46;
                j17 = j21115;
                long j21116 = jU;
                map3 = map2;
                lVar3 = lVar2;
                i49 = i47;
                androidx.compose.ui.text.font.g0 g0Var18 = g0Var2;
                iVar4 = iVar3;
                j18 = j21116;
                FontWeight fontWeight18 = fontWeight2;
                z15 = z12;
                vVar3 = vVar2;
                textStyle3 = textStyle18;
                j19 = j14;
                g0Var3 = g0Var18;
                fontWeight3 = fontWeight18;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar10 = nVar2;
            final long j21117 = jB;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i51112) {
                    TextKt.b(text, nVar10, j18, j21117, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i15 |= 48;
        i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= bb.c.b.f30966u4;
        } else if ((i12 & bb.c.b.f30796me) == 0) {
            if (pVarF.z(j10)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        i18 = i14 & 8;
        if (i18 != 0) {
            i15 |= bb.c.d.f31193dj;
        } else if ((i12 & bb.c.g.f32954lc) == 0) {
            if (pVarF.z(j11)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i15 |= i19;
        }
        i20 = i14 & 16;
        if (i20 != 0) {
            i15 |= 24576;
        } else if ((i12 & 57344) == 0) {
            if (pVarF.s(g0Var)) {
                i21 = 16384;
            } else {
                i21 = 8192;
            }
            i15 |= i21;
        }
        i22 = i14 & 32;
        if (i22 != 0) {
            i15 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((i12 & 458752) == 0) {
            if (pVarF.s(fontWeight)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i15 |= i23;
        }
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (pVarF.s(vVar)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i15 |= i25;
        }
        i26 = i14 & 128;
        if (i26 != 0) {
            i15 |= 12582912;
        } else if ((i12 & 29360128) == 0) {
            if (pVarF.z(j12)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i15 |= i27;
        }
        i28 = i14 & 256;
        if (i28 != 0) {
            i15 |= 100663296;
        } else if ((i12 & 234881024) == 0) {
            if (pVarF.s(iVar)) {
                i29 = 67108864;
            } else {
                i29 = 33554432;
            }
            i15 |= i29;
        }
        i30 = i14 & 512;
        if (i30 != 0) {
            i15 |= com.google.android.exoplayer2.j.G;
        } else if ((i12 & 1879048192) == 0) {
            if (pVarF.s(hVar)) {
                i31 = 536870912;
            } else {
                i31 = 268435456;
            }
            i15 |= i31;
        }
        i32 = i14 & 1024;
        if (i32 != 0) {
            i33 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            if (pVarF.z(j13)) {
                i34 = 4;
            } else {
                i34 = 2;
            }
            i33 = i13 | i34;
        } else {
            i33 = i13;
        }
        i35 = i14 & 2048;
        if (i35 != 0) {
            i33 |= 48;
        } else if ((i13 & 112) != 0) {
            if (pVarF.y(i10)) {
                i36 = 32;
            } else {
                i36 = 16;
            }
            i33 |= i36;
        }
        i37 = i33;
        i38 = i14 & 4096;
        if (i38 != 0) {
            if ((i13 & bb.c.b.f30796me) == 0) {
                if (pVarF.u(z10)) {
                    i39 = 256;
                } else {
                    i39 = 128;
                }
                i37 |= i39;
            }
            i40 = i14 & 8192;
            if (i40 != 0) {
                if ((i13 & bb.c.g.f32954lc) == 0) {
                    i37 |= pVarF.y(i11) ? 2048 : 1024;
                }
                i41 = i14 & 16384;
                if (i41 != 0) {
                    i37 |= 8192;
                }
                i42 = i14 & 32768;
                if (i42 != 0) {
                    if ((i13 & 458752) == 0) {
                        if (pVarF.s(lVar)) {
                            i43 = 131072;
                        } else {
                            i43 = 65536;
                        }
                        i37 |= i43;
                    }
                    if ((i13 & 3670016) != 0) {
                        if ((i14 & 65536) == 0) {
                            i50 = 524288;
                        } else {
                            i50 = 524288;
                        }
                        i37 |= i50;
                    }
                    if (i41 != 16384) {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        } else {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                        }
                        pVarF.T(79587464);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            j16 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j16 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyle19 = textStyle2;
                        TextStyle textStyleR16 = textStyle19.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        long j21118 = j15;
                        int i51112 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                        int i51113 = i45 << 9;
                        BasicTextKt.a(text, nVar2, textStyleR16, lVar2, i47, z12, i46, map2, pVarF, i51112 | (57344 & i51113) | (i51113 & 458752) | (i51113 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar3 = hVar2;
                        i48 = i46;
                        j17 = j21118;
                        long j21119 = jU;
                        map3 = map2;
                        lVar3 = lVar2;
                        i49 = i47;
                        androidx.compose.ui.text.font.g0 g0Var19 = g0Var2;
                        iVar4 = iVar3;
                        j18 = j21119;
                        FontWeight fontWeight19 = fontWeight2;
                        z15 = z12;
                        vVar3 = vVar2;
                        textStyle3 = textStyle19;
                        j19 = j14;
                        g0Var3 = g0Var19;
                        fontWeight3 = fontWeight19;
                    } else {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        } else {
                            if (i51 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i44 = Integer.MAX_VALUE;
                            } else {
                                i44 = i11;
                            }
                            if (i41 != 0) {
                                mapZ = kotlin.collections.s0.z();
                                i37 &= -57345;
                            } else {
                                mapZ = map;
                            }
                            if (i42 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 65536) != 0) {
                                i45 = i37 & (-3670017);
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                            } else {
                                textStyle2 = textStyle;
                                i45 = i37;
                            }
                            map2 = mapZ;
                            i46 = i44;
                            z12 = z11;
                            j14 = jB3;
                            iVar3 = iVar2;
                            i47 = iA;
                            j15 = jB2;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                        }
                        pVarF.T(79587464);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            j16 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j16 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyle110 = textStyle2;
                        TextStyle textStyleR17 = textStyle110.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        long j211110 = j15;
                        int i51114 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                        int i51115 = i45 << 9;
                        BasicTextKt.a(text, nVar2, textStyleR17, lVar2, i47, z12, i46, map2, pVarF, i51114 | (57344 & i51115) | (i51115 & 458752) | (i51115 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar3 = hVar2;
                        i48 = i46;
                        j17 = j211110;
                        long j211111 = jU;
                        map3 = map2;
                        lVar3 = lVar2;
                        i49 = i47;
                        androidx.compose.ui.text.font.g0 g0Var110 = g0Var2;
                        iVar4 = iVar3;
                        j18 = j211111;
                        FontWeight fontWeight110 = fontWeight2;
                        z15 = z12;
                        vVar3 = vVar2;
                        textStyle3 = textStyle110;
                        j19 = j14;
                        g0Var3 = g0Var110;
                        fontWeight3 = fontWeight110;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar11 = nVar2;
                    final long j211112 = jB;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i51116) {
                            TextKt.b(text, nVar11, j18, j211112, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i37 |= androidx.profileinstaller.o.c.f26824k;
                if ((i13 & 3670016) != 0) {
                    if ((i14 & 65536) == 0) {
                        i50 = 524288;
                    } else {
                        i50 = 524288;
                    }
                    i37 |= i50;
                }
                if (i41 != 16384) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    } else {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                    }
                    pVarF.T(79587464);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        j16 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j16 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyle111 = textStyle2;
                    TextStyle textStyleR18 = textStyle111.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    long j211113 = j15;
                    int i51116 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                    int i51117 = i45 << 9;
                    BasicTextKt.a(text, nVar2, textStyleR18, lVar2, i47, z12, i46, map2, pVarF, i51116 | (57344 & i51117) | (i51117 & 458752) | (i51117 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar3 = hVar2;
                    i48 = i46;
                    j17 = j211113;
                    long j211114 = jU;
                    map3 = map2;
                    lVar3 = lVar2;
                    i49 = i47;
                    androidx.compose.ui.text.font.g0 g0Var111 = g0Var2;
                    iVar4 = iVar3;
                    j18 = j211114;
                    FontWeight fontWeight111 = fontWeight2;
                    z15 = z12;
                    vVar3 = vVar2;
                    textStyle3 = textStyle111;
                    j19 = j14;
                    g0Var3 = g0Var111;
                    fontWeight3 = fontWeight111;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    } else {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                    }
                    pVarF.T(79587464);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        j16 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j16 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyle112 = textStyle2;
                    TextStyle textStyleR19 = textStyle112.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    long j211115 = j15;
                    int i51118 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                    int i51119 = i45 << 9;
                    BasicTextKt.a(text, nVar2, textStyleR19, lVar2, i47, z12, i46, map2, pVarF, i51118 | (57344 & i51119) | (i51119 & 458752) | (i51119 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar3 = hVar2;
                    i48 = i46;
                    j17 = j211115;
                    long j211116 = jU;
                    map3 = map2;
                    lVar3 = lVar2;
                    i49 = i47;
                    androidx.compose.ui.text.font.g0 g0Var112 = g0Var2;
                    iVar4 = iVar3;
                    j18 = j211116;
                    FontWeight fontWeight112 = fontWeight2;
                    z15 = z12;
                    vVar3 = vVar2;
                    textStyle3 = textStyle112;
                    j19 = j14;
                    g0Var3 = g0Var112;
                    fontWeight3 = fontWeight112;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar12 = nVar2;
                final long j211117 = jB;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i511110) {
                        TextKt.b(text, nVar12, j18, j211117, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i37 |= bb.c.d.f31193dj;
            i41 = i14 & 16384;
            if (i41 != 0) {
                i37 |= 8192;
            }
            i42 = i14 & 32768;
            if (i42 != 0) {
                if ((i13 & 458752) == 0) {
                    if (pVarF.s(lVar)) {
                        i43 = 131072;
                    } else {
                        i43 = 65536;
                    }
                    i37 |= i43;
                }
                if ((i13 & 3670016) != 0) {
                    if ((i14 & 65536) == 0) {
                        i50 = 524288;
                    } else {
                        i50 = 524288;
                    }
                    i37 |= i50;
                }
                if (i41 != 16384) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    } else {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                    }
                    pVarF.T(79587464);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        j16 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j16 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyle113 = textStyle2;
                    TextStyle textStyleR110 = textStyle113.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    long j211118 = j15;
                    int i511110 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                    int i511111 = i45 << 9;
                    BasicTextKt.a(text, nVar2, textStyleR110, lVar2, i47, z12, i46, map2, pVarF, i511110 | (57344 & i511111) | (i511111 & 458752) | (i511111 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar3 = hVar2;
                    i48 = i46;
                    j17 = j211118;
                    long j211119 = jU;
                    map3 = map2;
                    lVar3 = lVar2;
                    i49 = i47;
                    androidx.compose.ui.text.font.g0 g0Var113 = g0Var2;
                    iVar4 = iVar3;
                    j18 = j211119;
                    FontWeight fontWeight113 = fontWeight2;
                    z15 = z12;
                    vVar3 = vVar2;
                    textStyle3 = textStyle113;
                    j19 = j14;
                    g0Var3 = g0Var113;
                    fontWeight3 = fontWeight113;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    } else {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                    }
                    pVarF.T(79587464);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        j16 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j16 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyle114 = textStyle2;
                    TextStyle textStyleR111 = textStyle114.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    long j2111110 = j15;
                    int i511112 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                    int i511113 = i45 << 9;
                    BasicTextKt.a(text, nVar2, textStyleR111, lVar2, i47, z12, i46, map2, pVarF, i511112 | (57344 & i511113) | (i511113 & 458752) | (i511113 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar3 = hVar2;
                    i48 = i46;
                    j17 = j2111110;
                    long j2111111 = jU;
                    map3 = map2;
                    lVar3 = lVar2;
                    i49 = i47;
                    androidx.compose.ui.text.font.g0 g0Var114 = g0Var2;
                    iVar4 = iVar3;
                    j18 = j2111111;
                    FontWeight fontWeight114 = fontWeight2;
                    z15 = z12;
                    vVar3 = vVar2;
                    textStyle3 = textStyle114;
                    j19 = j14;
                    g0Var3 = g0Var114;
                    fontWeight3 = fontWeight114;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar13 = nVar2;
                final long j2111112 = jB;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i511114) {
                        TextKt.b(text, nVar13, j18, j2111112, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i37 |= androidx.profileinstaller.o.c.f26824k;
            if ((i13 & 3670016) != 0) {
                if ((i14 & 65536) == 0) {
                    i50 = 524288;
                } else {
                    i50 = 524288;
                }
                i37 |= i50;
            }
            if (i41 != 16384) {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                } else {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                }
                pVarF.T(79587464);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    j16 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j16 = jP;
                }
                pVarF.c0();
                TextStyle textStyle115 = textStyle2;
                TextStyle textStyleR112 = textStyle115.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                long j2111113 = j15;
                int i511114 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                int i511115 = i45 << 9;
                BasicTextKt.a(text, nVar2, textStyleR112, lVar2, i47, z12, i46, map2, pVarF, i511114 | (57344 & i511115) | (i511115 & 458752) | (i511115 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar3 = hVar2;
                i48 = i46;
                j17 = j2111113;
                long j2111114 = jU;
                map3 = map2;
                lVar3 = lVar2;
                i49 = i47;
                androidx.compose.ui.text.font.g0 g0Var115 = g0Var2;
                iVar4 = iVar3;
                j18 = j2111114;
                FontWeight fontWeight115 = fontWeight2;
                z15 = z12;
                vVar3 = vVar2;
                textStyle3 = textStyle115;
                j19 = j14;
                g0Var3 = g0Var115;
                fontWeight3 = fontWeight115;
            } else {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                } else {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                }
                pVarF.T(79587464);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    j16 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j16 = jP;
                }
                pVarF.c0();
                TextStyle textStyle116 = textStyle2;
                TextStyle textStyleR113 = textStyle116.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                long j2111115 = j15;
                int i511116 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                int i511117 = i45 << 9;
                BasicTextKt.a(text, nVar2, textStyleR113, lVar2, i47, z12, i46, map2, pVarF, i511116 | (57344 & i511117) | (i511117 & 458752) | (i511117 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar3 = hVar2;
                i48 = i46;
                j17 = j2111115;
                long j2111116 = jU;
                map3 = map2;
                lVar3 = lVar2;
                i49 = i47;
                androidx.compose.ui.text.font.g0 g0Var116 = g0Var2;
                iVar4 = iVar3;
                j18 = j2111116;
                FontWeight fontWeight116 = fontWeight2;
                z15 = z12;
                vVar3 = vVar2;
                textStyle3 = textStyle116;
                j19 = j14;
                g0Var3 = g0Var116;
                fontWeight3 = fontWeight116;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar14 = nVar2;
            final long j2111117 = jB;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i511118) {
                    TextKt.b(text, nVar14, j18, j2111117, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i37 |= bb.c.b.f30966u4;
        i40 = i14 & 8192;
        if (i40 != 0) {
            if ((i13 & bb.c.g.f32954lc) == 0) {
                i37 |= pVarF.y(i11) ? 2048 : 1024;
            }
            i41 = i14 & 16384;
            if (i41 != 0) {
                i37 |= 8192;
            }
            i42 = i14 & 32768;
            if (i42 != 0) {
                if ((i13 & 458752) == 0) {
                    if (pVarF.s(lVar)) {
                        i43 = 131072;
                    } else {
                        i43 = 65536;
                    }
                    i37 |= i43;
                }
                if ((i13 & 3670016) != 0) {
                    if ((i14 & 65536) == 0) {
                        i50 = 524288;
                    } else {
                        i50 = 524288;
                    }
                    i37 |= i50;
                }
                if (i41 != 16384) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    } else {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                    }
                    pVarF.T(79587464);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        j16 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j16 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyle117 = textStyle2;
                    TextStyle textStyleR114 = textStyle117.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    long j2111118 = j15;
                    int i511118 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                    int i511119 = i45 << 9;
                    BasicTextKt.a(text, nVar2, textStyleR114, lVar2, i47, z12, i46, map2, pVarF, i511118 | (57344 & i511119) | (i511119 & 458752) | (i511119 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar3 = hVar2;
                    i48 = i46;
                    j17 = j2111118;
                    long j2111119 = jU;
                    map3 = map2;
                    lVar3 = lVar2;
                    i49 = i47;
                    androidx.compose.ui.text.font.g0 g0Var117 = g0Var2;
                    iVar4 = iVar3;
                    j18 = j2111119;
                    FontWeight fontWeight117 = fontWeight2;
                    z15 = z12;
                    vVar3 = vVar2;
                    textStyle3 = textStyle117;
                    j19 = j14;
                    g0Var3 = g0Var117;
                    fontWeight3 = fontWeight117;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    } else {
                        if (i51 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i44 = Integer.MAX_VALUE;
                        } else {
                            i44 = i11;
                        }
                        if (i41 != 0) {
                            mapZ = kotlin.collections.s0.z();
                            i37 &= -57345;
                        } else {
                            mapZ = map;
                        }
                        if (i42 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 65536) != 0) {
                            i45 = i37 & (-3670017);
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                        } else {
                            textStyle2 = textStyle;
                            i45 = i37;
                        }
                        map2 = mapZ;
                        i46 = i44;
                        z12 = z11;
                        j14 = jB3;
                        iVar3 = iVar2;
                        i47 = iA;
                        j15 = jB2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                    }
                    pVarF.T(79587464);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        j16 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j16 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyle118 = textStyle2;
                    TextStyle textStyleR115 = textStyle118.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    long j21111110 = j15;
                    int i5111110 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                    int i5111111 = i45 << 9;
                    BasicTextKt.a(text, nVar2, textStyleR115, lVar2, i47, z12, i46, map2, pVarF, i5111110 | (57344 & i5111111) | (i5111111 & 458752) | (i5111111 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar3 = hVar2;
                    i48 = i46;
                    j17 = j21111110;
                    long j21111111 = jU;
                    map3 = map2;
                    lVar3 = lVar2;
                    i49 = i47;
                    androidx.compose.ui.text.font.g0 g0Var118 = g0Var2;
                    iVar4 = iVar3;
                    j18 = j21111111;
                    FontWeight fontWeight118 = fontWeight2;
                    z15 = z12;
                    vVar3 = vVar2;
                    textStyle3 = textStyle118;
                    j19 = j14;
                    g0Var3 = g0Var118;
                    fontWeight3 = fontWeight118;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar15 = nVar2;
                final long j21111112 = jB;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i5111112) {
                        TextKt.b(text, nVar15, j18, j21111112, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i37 |= androidx.profileinstaller.o.c.f26824k;
            if ((i13 & 3670016) != 0) {
                if ((i14 & 65536) == 0) {
                    i50 = 524288;
                } else {
                    i50 = 524288;
                }
                i37 |= i50;
            }
            if (i41 != 16384) {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                } else {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                }
                pVarF.T(79587464);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    j16 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j16 = jP;
                }
                pVarF.c0();
                TextStyle textStyle119 = textStyle2;
                TextStyle textStyleR116 = textStyle119.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                long j21111113 = j15;
                int i5111112 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                int i5111113 = i45 << 9;
                BasicTextKt.a(text, nVar2, textStyleR116, lVar2, i47, z12, i46, map2, pVarF, i5111112 | (57344 & i5111113) | (i5111113 & 458752) | (i5111113 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar3 = hVar2;
                i48 = i46;
                j17 = j21111113;
                long j21111114 = jU;
                map3 = map2;
                lVar3 = lVar2;
                i49 = i47;
                androidx.compose.ui.text.font.g0 g0Var119 = g0Var2;
                iVar4 = iVar3;
                j18 = j21111114;
                FontWeight fontWeight119 = fontWeight2;
                z15 = z12;
                vVar3 = vVar2;
                textStyle3 = textStyle119;
                j19 = j14;
                g0Var3 = g0Var119;
                fontWeight3 = fontWeight119;
            } else {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                } else {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                }
                pVarF.T(79587464);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    j16 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j16 = jP;
                }
                pVarF.c0();
                TextStyle textStyle1110 = textStyle2;
                TextStyle textStyleR117 = textStyle1110.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                long j21111115 = j15;
                int i5111114 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                int i5111115 = i45 << 9;
                BasicTextKt.a(text, nVar2, textStyleR117, lVar2, i47, z12, i46, map2, pVarF, i5111114 | (57344 & i5111115) | (i5111115 & 458752) | (i5111115 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar3 = hVar2;
                i48 = i46;
                j17 = j21111115;
                long j21111116 = jU;
                map3 = map2;
                lVar3 = lVar2;
                i49 = i47;
                androidx.compose.ui.text.font.g0 g0Var1110 = g0Var2;
                iVar4 = iVar3;
                j18 = j21111116;
                FontWeight fontWeight1110 = fontWeight2;
                z15 = z12;
                vVar3 = vVar2;
                textStyle3 = textStyle1110;
                j19 = j14;
                g0Var3 = g0Var1110;
                fontWeight3 = fontWeight1110;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar16 = nVar2;
            final long j21111117 = jB;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i5111116) {
                    TextKt.b(text, nVar16, j18, j21111117, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i37 |= bb.c.d.f31193dj;
        i41 = i14 & 16384;
        if (i41 != 0) {
            i37 |= 8192;
        }
        i42 = i14 & 32768;
        if (i42 != 0) {
            if ((i13 & 458752) == 0) {
                if (pVarF.s(lVar)) {
                    i43 = 131072;
                } else {
                    i43 = 65536;
                }
                i37 |= i43;
            }
            if ((i13 & 3670016) != 0) {
                if ((i14 & 65536) == 0) {
                    i50 = 524288;
                } else {
                    i50 = 524288;
                }
                i37 |= i50;
            }
            if (i41 != 16384) {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                } else {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                }
                pVarF.T(79587464);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    j16 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j16 = jP;
                }
                pVarF.c0();
                TextStyle textStyle1111 = textStyle2;
                TextStyle textStyleR118 = textStyle1111.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                long j21111118 = j15;
                int i5111116 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                int i5111117 = i45 << 9;
                BasicTextKt.a(text, nVar2, textStyleR118, lVar2, i47, z12, i46, map2, pVarF, i5111116 | (57344 & i5111117) | (i5111117 & 458752) | (i5111117 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar3 = hVar2;
                i48 = i46;
                j17 = j21111118;
                long j21111119 = jU;
                map3 = map2;
                lVar3 = lVar2;
                i49 = i47;
                androidx.compose.ui.text.font.g0 g0Var1111 = g0Var2;
                iVar4 = iVar3;
                j18 = j21111119;
                FontWeight fontWeight1111 = fontWeight2;
                z15 = z12;
                vVar3 = vVar2;
                textStyle3 = textStyle1111;
                j19 = j14;
                g0Var3 = g0Var1111;
                fontWeight3 = fontWeight1111;
            } else {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                } else {
                    if (i51 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i44 = Integer.MAX_VALUE;
                    } else {
                        i44 = i11;
                    }
                    if (i41 != 0) {
                        mapZ = kotlin.collections.s0.z();
                        i37 &= -57345;
                    } else {
                        mapZ = map;
                    }
                    if (i42 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 65536) != 0) {
                        i45 = i37 & (-3670017);
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                    } else {
                        textStyle2 = textStyle;
                        i45 = i37;
                    }
                    map2 = mapZ;
                    i46 = i44;
                    z12 = z11;
                    j14 = jB3;
                    iVar3 = iVar2;
                    i47 = iA;
                    j15 = jB2;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
                }
                pVarF.T(79587464);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    j16 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j16 = jP;
                }
                pVarF.c0();
                TextStyle textStyle1112 = textStyle2;
                TextStyle textStyleR119 = textStyle1112.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                long j211111110 = j15;
                int i5111118 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
                int i5111119 = i45 << 9;
                BasicTextKt.a(text, nVar2, textStyleR119, lVar2, i47, z12, i46, map2, pVarF, i5111118 | (57344 & i5111119) | (i5111119 & 458752) | (i5111119 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar3 = hVar2;
                i48 = i46;
                j17 = j211111110;
                long j211111111 = jU;
                map3 = map2;
                lVar3 = lVar2;
                i49 = i47;
                androidx.compose.ui.text.font.g0 g0Var1112 = g0Var2;
                iVar4 = iVar3;
                j18 = j211111111;
                FontWeight fontWeight1112 = fontWeight2;
                z15 = z12;
                vVar3 = vVar2;
                textStyle3 = textStyle1112;
                j19 = j14;
                g0Var3 = g0Var1112;
                fontWeight3 = fontWeight1112;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar17 = nVar2;
            final long j211111112 = jB;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i51111110) {
                    TextKt.b(text, nVar17, j18, j211111112, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i37 |= androidx.profileinstaller.o.c.f26824k;
        if ((i13 & 3670016) != 0) {
            if ((i14 & 65536) == 0) {
                i50 = 524288;
            } else {
                i50 = 524288;
            }
            i37 |= i50;
        }
        if (i41 != 16384) {
            pVarF.W();
            if ((i12 & 1) != 0) {
                if (i51 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i16 != 0) {
                    jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                } else {
                    jU = j10;
                }
                if (i18 != 0) {
                    jB = s1.u.f139249b.b();
                } else {
                    jB = j11;
                }
                if (i20 != 0) {
                    g0Var2 = null;
                } else {
                    g0Var2 = g0Var;
                }
                if (i22 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i24 != 0) {
                    vVar2 = null;
                } else {
                    vVar2 = vVar;
                }
                if (i26 != 0) {
                    jB2 = s1.u.f139249b.b();
                } else {
                    jB2 = j12;
                }
                if (i28 != 0) {
                    iVar2 = null;
                } else {
                    iVar2 = iVar;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    jB3 = s1.u.f139249b.b();
                } else {
                    jB3 = j13;
                }
                if (i35 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i44 = Integer.MAX_VALUE;
                } else {
                    i44 = i11;
                }
                if (i41 != 0) {
                    mapZ = kotlin.collections.s0.z();
                    i37 &= -57345;
                } else {
                    mapZ = map;
                }
                if (i42 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                        public final void a(@dl.d TextLayoutResult it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return kotlin.b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if ((i14 & 65536) != 0) {
                    i45 = i37 & (-3670017);
                    textStyle2 = (TextStyle) pVarF.K(f11684a);
                } else {
                    textStyle2 = textStyle;
                    i45 = i37;
                }
                map2 = mapZ;
                i46 = i44;
                z12 = z11;
                j14 = jB3;
                iVar3 = iVar2;
                i47 = iA;
                j15 = jB2;
            } else {
                if (i51 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i16 != 0) {
                    jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                } else {
                    jU = j10;
                }
                if (i18 != 0) {
                    jB = s1.u.f139249b.b();
                } else {
                    jB = j11;
                }
                if (i20 != 0) {
                    g0Var2 = null;
                } else {
                    g0Var2 = g0Var;
                }
                if (i22 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i24 != 0) {
                    vVar2 = null;
                } else {
                    vVar2 = vVar;
                }
                if (i26 != 0) {
                    jB2 = s1.u.f139249b.b();
                } else {
                    jB2 = j12;
                }
                if (i28 != 0) {
                    iVar2 = null;
                } else {
                    iVar2 = iVar;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    jB3 = s1.u.f139249b.b();
                } else {
                    jB3 = j13;
                }
                if (i35 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i44 = Integer.MAX_VALUE;
                } else {
                    i44 = i11;
                }
                if (i41 != 0) {
                    mapZ = kotlin.collections.s0.z();
                    i37 &= -57345;
                } else {
                    mapZ = map;
                }
                if (i42 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                        public final void a(@dl.d TextLayoutResult it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return kotlin.b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if ((i14 & 65536) != 0) {
                    i45 = i37 & (-3670017);
                    textStyle2 = (TextStyle) pVarF.K(f11684a);
                } else {
                    textStyle2 = textStyle;
                    i45 = i37;
                }
                map2 = mapZ;
                i46 = i44;
                z12 = z11;
                j14 = jB3;
                iVar3 = iVar2;
                i47 = iA;
                j15 = jB2;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
            }
            pVarF.T(79587464);
            companion = androidx.compose.ui.graphics.l0.INSTANCE;
            if (jU != companion.u()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                j16 = jU;
            } else {
                jP = textStyle2.p();
                if (jP != companion.u()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                }
                j16 = jP;
            }
            pVarF.c0();
            TextStyle textStyle1113 = textStyle2;
            TextStyle textStyleR1110 = textStyle1113.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
            long j211111113 = j15;
            int i51111110 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
            int i51111111 = i45 << 9;
            BasicTextKt.a(text, nVar2, textStyleR1110, lVar2, i47, z12, i46, map2, pVarF, i51111110 | (57344 & i51111111) | (i51111111 & 458752) | (i51111111 & 3670016), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            hVar3 = hVar2;
            i48 = i46;
            j17 = j211111113;
            long j211111114 = jU;
            map3 = map2;
            lVar3 = lVar2;
            i49 = i47;
            androidx.compose.ui.text.font.g0 g0Var1113 = g0Var2;
            iVar4 = iVar3;
            j18 = j211111114;
            FontWeight fontWeight1113 = fontWeight2;
            z15 = z12;
            vVar3 = vVar2;
            textStyle3 = textStyle1113;
            j19 = j14;
            g0Var3 = g0Var1113;
            fontWeight3 = fontWeight1113;
        } else {
            pVarF.W();
            if ((i12 & 1) != 0) {
                if (i51 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i16 != 0) {
                    jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                } else {
                    jU = j10;
                }
                if (i18 != 0) {
                    jB = s1.u.f139249b.b();
                } else {
                    jB = j11;
                }
                if (i20 != 0) {
                    g0Var2 = null;
                } else {
                    g0Var2 = g0Var;
                }
                if (i22 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i24 != 0) {
                    vVar2 = null;
                } else {
                    vVar2 = vVar;
                }
                if (i26 != 0) {
                    jB2 = s1.u.f139249b.b();
                } else {
                    jB2 = j12;
                }
                if (i28 != 0) {
                    iVar2 = null;
                } else {
                    iVar2 = iVar;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    jB3 = s1.u.f139249b.b();
                } else {
                    jB3 = j13;
                }
                if (i35 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i44 = Integer.MAX_VALUE;
                } else {
                    i44 = i11;
                }
                if (i41 != 0) {
                    mapZ = kotlin.collections.s0.z();
                    i37 &= -57345;
                } else {
                    mapZ = map;
                }
                if (i42 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                        public final void a(@dl.d TextLayoutResult it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return kotlin.b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if ((i14 & 65536) != 0) {
                    i45 = i37 & (-3670017);
                    textStyle2 = (TextStyle) pVarF.K(f11684a);
                } else {
                    textStyle2 = textStyle;
                    i45 = i37;
                }
                map2 = mapZ;
                i46 = i44;
                z12 = z11;
                j14 = jB3;
                iVar3 = iVar2;
                i47 = iA;
                j15 = jB2;
            } else {
                if (i51 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i16 != 0) {
                    jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                } else {
                    jU = j10;
                }
                if (i18 != 0) {
                    jB = s1.u.f139249b.b();
                } else {
                    jB = j11;
                }
                if (i20 != 0) {
                    g0Var2 = null;
                } else {
                    g0Var2 = g0Var;
                }
                if (i22 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i24 != 0) {
                    vVar2 = null;
                } else {
                    vVar2 = vVar;
                }
                if (i26 != 0) {
                    jB2 = s1.u.f139249b.b();
                } else {
                    jB2 = j12;
                }
                if (i28 != 0) {
                    iVar2 = null;
                } else {
                    iVar2 = iVar;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    jB3 = s1.u.f139249b.b();
                } else {
                    jB3 = j13;
                }
                if (i35 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i44 = Integer.MAX_VALUE;
                } else {
                    i44 = i11;
                }
                if (i41 != 0) {
                    mapZ = kotlin.collections.s0.z();
                    i37 &= -57345;
                } else {
                    mapZ = map;
                }
                if (i42 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$3
                        public final void a(@dl.d TextLayoutResult it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return kotlin.b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if ((i14 & 65536) != 0) {
                    i45 = i37 & (-3670017);
                    textStyle2 = (TextStyle) pVarF.K(f11684a);
                } else {
                    textStyle2 = textStyle;
                    i45 = i37;
                }
                map2 = mapZ;
                i46 = i44;
                z12 = z11;
                j14 = jB3;
                iVar3 = iVar2;
                i47 = iA;
                j15 = jB2;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(224529679, i15, i45, "androidx.compose.material3.Text (Text.kt:189)");
            }
            pVarF.T(79587464);
            companion = androidx.compose.ui.graphics.l0.INSTANCE;
            if (jU != companion.u()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                j16 = jU;
            } else {
                jP = textStyle2.p();
                if (jP != companion.u()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                }
                j16 = jP;
            }
            pVarF.c0();
            TextStyle textStyle1114 = textStyle2;
            TextStyle textStyleR1111 = textStyle1114.R(new TextStyle(j16, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, j15, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar3, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, j14, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
            long j211111115 = j15;
            int i51111112 = ((i45 >> 6) & bb.c.g.f32954lc) | (i15 & 14) | 16777216 | (i15 & 112);
            int i51111113 = i45 << 9;
            BasicTextKt.a(text, nVar2, textStyleR1111, lVar2, i47, z12, i46, map2, pVarF, i51111112 | (57344 & i51111113) | (i51111113 & 458752) | (i51111113 & 3670016), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            hVar3 = hVar2;
            i48 = i46;
            j17 = j211111115;
            long j211111116 = jU;
            map3 = map2;
            lVar3 = lVar2;
            i49 = i47;
            androidx.compose.ui.text.font.g0 g0Var1114 = g0Var2;
            iVar4 = iVar3;
            j18 = j211111116;
            FontWeight fontWeight1114 = fontWeight2;
            z15 = z12;
            vVar3 = vVar2;
            textStyle3 = textStyle1114;
            j19 = j14;
            g0Var3 = g0Var1114;
            fontWeight3 = fontWeight1114;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar18 = nVar2;
        final long j211111117 = jB;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i51111114) {
                TextKt.b(text, nVar18, j18, j211111117, g0Var3, fontWeight3, vVar3, j17, iVar4, hVar3, j19, i49, z15, i48, map3, lVar3, textStyle3, pVar2, i12 | 1, i13, i14);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0140  */
    /* JADX WARN: Code duplicated, block: B:102:0x0143  */
    /* JADX WARN: Code duplicated, block: B:106:0x014b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0150  */
    /* JADX WARN: Code duplicated, block: B:109:0x0156  */
    /* JADX WARN: Code duplicated, block: B:111:0x015c  */
    /* JADX WARN: Code duplicated, block: B:112:0x015f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0164  */
    /* JADX WARN: Code duplicated, block: B:117:0x016a  */
    /* JADX WARN: Code duplicated, block: B:118:0x016d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0171  */
    /* JADX WARN: Code duplicated, block: B:122:0x0179  */
    /* JADX WARN: Code duplicated, block: B:123:0x017c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0181  */
    /* JADX WARN: Code duplicated, block: B:128:0x0189  */
    /* JADX WARN: Code duplicated, block: B:129:0x018c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0190  */
    /* JADX WARN: Code duplicated, block: B:133:0x0198  */
    /* JADX WARN: Code duplicated, block: B:134:0x019b  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:168:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:171:0x0203  */
    /* JADX WARN: Code duplicated, block: B:177:0x0236  */
    /* JADX WARN: Code duplicated, block: B:179:0x023d  */
    /* JADX WARN: Code duplicated, block: B:186:0x026b A[PHI: r0 r1 r4 r6 r7 r8 r9 r10 r12 r17 r20 r21 r22 r23 r26
  0x026b: PHI (r0v9 androidx.compose.ui.text.style.i) = (r0v5 androidx.compose.ui.text.style.i), (r0v11 androidx.compose.ui.text.style.i) binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r1v8 int) = (r1v3 int), (r1v9 int) binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r4v11 long) = (r4v8 long), (r4v12 long) binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r6v5 androidx.compose.ui.n) = (r6v2 androidx.compose.ui.n), (r6v6 androidx.compose.ui.n) binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r7v8 boolean) = (r7v4 boolean), (r7v9 boolean) binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r8v17 int) = (r8v10 int), (r8v18 int) binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r9v8 int) = (r9v4 int), (r9v9 int) binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r10v11 long) = (r10v6 long), (r10v12 long) binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r12v7 yh.l<? super androidx.compose.ui.text.i0, kotlin.b2>) = 
  (r12v3 yh.l<? super androidx.compose.ui.text.i0, kotlin.b2>)
  (r12v8 yh.l<? super androidx.compose.ui.text.i0, kotlin.b2>)
 binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r17v10 long) = (r17v6 long), (r17v11 long) binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r20v5 androidx.compose.ui.text.style.h) = (r20v1 androidx.compose.ui.text.style.h), (r20v6 androidx.compose.ui.text.style.h) binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r21v5 androidx.compose.ui.text.font.g0) = (r21v1 androidx.compose.ui.text.font.g0), (r21v6 androidx.compose.ui.text.font.g0) binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r22v10 androidx.compose.ui.text.font.k0) = (r22v6 androidx.compose.ui.text.font.k0), (r22v11 androidx.compose.ui.text.font.k0) binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r23v7 androidx.compose.ui.text.font.v) = (r23v4 androidx.compose.ui.text.font.v), (r23v8 androidx.compose.ui.text.font.v) binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r26v8 long) = (r26v5 long), (r26v9 long) binds: [B:231:0x02e7, B:185:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:187:0x026f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x0271  */
    /* JADX WARN: Code duplicated, block: B:189:0x0274  */
    /* JADX WARN: Code duplicated, block: B:191:0x0278  */
    /* JADX WARN: Code duplicated, block: B:192:0x027f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0283  */
    /* JADX WARN: Code duplicated, block: B:195:0x028a  */
    /* JADX WARN: Code duplicated, block: B:198:0x0290  */
    /* JADX WARN: Code duplicated, block: B:199:0x0293  */
    /* JADX WARN: Code duplicated, block: B:201:0x0297  */
    /* JADX WARN: Code duplicated, block: B:202:0x029a  */
    /* JADX WARN: Code duplicated, block: B:204:0x029e  */
    /* JADX WARN: Code duplicated, block: B:205:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:207:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:208:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:210:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:211:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:214:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:216:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:217:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:219:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:220:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:222:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:223:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:225:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:226:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:228:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:229:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:232:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:235:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:238:0x0317  */
    /* JADX WARN: Code duplicated, block: B:239:0x0319  */
    /* JADX WARN: Code duplicated, block: B:241:0x031c  */
    /* JADX WARN: Code duplicated, block: B:242:0x031f  */
    /* JADX WARN: Code duplicated, block: B:244:0x032b  */
    /* JADX WARN: Code duplicated, block: B:245:0x032d  */
    /* JADX WARN: Code duplicated, block: B:248:0x0331  */
    /* JADX WARN: Code duplicated, block: B:252:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:257:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:81:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x0104  */
    /* JADX WARN: Code duplicated, block: B:86:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0113  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0121  */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:96:0x012b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0132  */
    /* JADX WARN: Code duplicated, block: B:99:0x013a  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void c(@dl.d final String text, @dl.e androidx.compose.ui.n nVar, long j10, long j11, @dl.e androidx.compose.ui.text.font.g0 g0Var, @dl.e FontWeight fontWeight, @dl.e androidx.compose.ui.text.font.v vVar, long j12, @dl.e androidx.compose.ui.text.style.i iVar, @dl.e androidx.compose.ui.text.style.h hVar, long j13, int i10, boolean z10, int i11, @dl.e yh.l<? super TextLayoutResult, kotlin.b2> lVar, @dl.e TextStyle textStyle, @dl.e androidx.compose.runtime.p pVar, final int i12, final int i13, final int i14) {
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
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        androidx.compose.ui.n nVar2;
        long jU;
        long jB;
        androidx.compose.ui.text.font.g0 g0Var2;
        FontWeight fontWeight2;
        androidx.compose.ui.text.font.v vVar2;
        long jB2;
        androidx.compose.ui.text.style.i iVar2;
        androidx.compose.ui.text.style.h hVar2;
        long jB3;
        int iA;
        boolean z11;
        int i42;
        yh.l<? super TextLayoutResult, kotlin.b2> lVar2;
        TextStyle textStyle2;
        androidx.compose.ui.graphics.l0.Companion companion;
        boolean z12;
        long jP;
        boolean z13;
        long j14;
        final int i43;
        boolean z14;
        final androidx.compose.ui.text.style.h hVar3;
        final androidx.compose.ui.text.font.g0 g0Var3;
        final FontWeight fontWeight3;
        int i44;
        yh.l<? super TextLayoutResult, kotlin.b2> lVar3;
        TextStyle textStyle3;
        final androidx.compose.ui.text.font.v vVar3;
        final androidx.compose.ui.text.style.i iVar3;
        final long j15;
        final long j16;
        final long j17;
        androidx.compose.runtime.u1 u1VarH;
        int i45;
        kotlin.jvm.internal.f0.p(text, "text");
        androidx.compose.runtime.p pVarF = pVar.F(1968784669);
        if ((i14 & 1) != 0) {
            i15 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i15 = (pVarF.s(text) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        int i46 = i14 & 2;
        if (i46 == 0) {
            if ((i12 & 112) == 0) {
                i15 |= pVarF.s(nVar) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                i15 |= bb.c.b.f30966u4;
            } else if ((i12 & bb.c.b.f30796me) == 0) {
                if (pVarF.z(j10)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                i15 |= bb.c.d.f31193dj;
            } else if ((i12 & bb.c.g.f32954lc) == 0) {
                if (pVarF.z(j11)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i15 |= i19;
            }
            i20 = i14 & 16;
            if (i20 != 0) {
                i15 |= 24576;
            } else if ((i12 & 57344) == 0) {
                if (pVarF.s(g0Var)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i15 |= i21;
            }
            i22 = i14 & 32;
            if (i22 != 0) {
                i15 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.s(fontWeight)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i15 |= i23;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.s(vVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (pVarF.z(j12)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            i28 = i14 & 256;
            if (i28 != 0) {
                i15 |= 100663296;
            } else if ((i12 & 234881024) == 0) {
                if (pVarF.s(iVar)) {
                    i29 = 67108864;
                } else {
                    i29 = 33554432;
                }
                i15 |= i29;
            }
            i30 = i14 & 512;
            if (i30 != 0) {
                i15 |= com.google.android.exoplayer2.j.G;
            } else if ((i12 & 1879048192) == 0) {
                if (pVarF.s(hVar)) {
                    i31 = 536870912;
                } else {
                    i31 = 268435456;
                }
                i15 |= i31;
            }
            i32 = i14 & 1024;
            if (i32 != 0) {
                i33 = i13 | 6;
            } else if ((i13 & 14) == 0) {
                if (pVarF.z(j13)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i13 | i34;
            } else {
                i33 = i13;
            }
            i35 = i14 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i13 & 112) != 0) {
                if (pVarF.y(i10)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i33 |= i36;
            }
            i37 = i33;
            i38 = i14 & 4096;
            if (i38 != 0) {
                if ((i13 & bb.c.b.f30796me) == 0) {
                    if (pVarF.u(z10)) {
                        i39 = 256;
                    } else {
                        i39 = 128;
                    }
                    i37 |= i39;
                }
                i40 = i14 & 8192;
                if (i40 != 0) {
                    if ((i13 & bb.c.g.f32954lc) == 0) {
                        i37 |= pVarF.y(i11) ? 2048 : 1024;
                    }
                    i41 = i14 & 16384;
                    if (i41 != 0) {
                        if ((i13 & 57344) == 0) {
                            i37 |= pVarF.s(lVar) ? 16384 : 8192;
                        }
                        if ((i13 & 458752) != 0) {
                            if ((i14 & 32768) == 0 || !pVarF.s(textStyle)) {
                                i45 = 65536;
                            } else {
                                i45 = 131072;
                            }
                            i37 |= i45;
                        }
                        if ((i15 & 1533916891) != 306783378 && (374491 & i37) == 74898 && pVarF.b()) {
                            pVarF.l();
                            nVar2 = nVar;
                            j16 = j10;
                            jB = j11;
                            g0Var3 = g0Var;
                            fontWeight3 = fontWeight;
                            vVar3 = vVar;
                            j17 = j12;
                            iVar3 = iVar;
                            hVar3 = hVar;
                            j15 = j13;
                            i43 = i10;
                            z14 = z10;
                            i44 = i11;
                            lVar3 = lVar;
                            textStyle3 = textStyle;
                        } else {
                            pVarF.W();
                            if ((i12 & 1) != 0 || pVarF.o()) {
                                if (i46 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i16 != 0) {
                                    jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                                } else {
                                    jU = j10;
                                }
                                if (i18 != 0) {
                                    jB = s1.u.f139249b.b();
                                } else {
                                    jB = j11;
                                }
                                if (i20 != 0) {
                                    g0Var2 = null;
                                } else {
                                    g0Var2 = g0Var;
                                }
                                if (i22 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i24 != 0) {
                                    vVar2 = null;
                                } else {
                                    vVar2 = vVar;
                                }
                                if (i26 != 0) {
                                    jB2 = s1.u.f139249b.b();
                                } else {
                                    jB2 = j12;
                                }
                                if (i28 != 0) {
                                    iVar2 = null;
                                } else {
                                    iVar2 = iVar;
                                }
                                hVar2 = i30 == 0 ? hVar : null;
                                if (i32 != 0) {
                                    jB3 = s1.u.f139249b.b();
                                } else {
                                    jB3 = j13;
                                }
                                if (i35 != 0) {
                                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                                } else {
                                    iA = i10;
                                }
                                if (i38 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i40 != 0) {
                                    i42 = Integer.MAX_VALUE;
                                } else {
                                    i42 = i11;
                                }
                                if (i41 != 0) {
                                    lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                        public final void a(@dl.d TextLayoutResult it) {
                                            kotlin.jvm.internal.f0.p(it, "it");
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                            a(textLayoutResult);
                                            return kotlin.b2.f124493a;
                                        }
                                    };
                                } else {
                                    lVar2 = lVar;
                                }
                                if ((i14 & 32768) != 0) {
                                    textStyle2 = (TextStyle) pVarF.K(f11684a);
                                    i37 &= -458753;
                                }
                                pVarF.O();
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                                }
                                pVarF.T(79582607);
                                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                                if (jU != companion.u()) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    j14 = jU;
                                } else {
                                    jP = textStyle2.p();
                                    if (jP != companion.u()) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z13) {
                                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                                    }
                                    j14 = jP;
                                }
                                pVarF.c0();
                                TextStyle textStyleR = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                                int i47 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                                int i48 = i37 << 9;
                                BasicTextKt.b(text, nVar2, textStyleR, lVar2, iA, z11, i42, pVarF, i47 | (i48 & 57344) | (i48 & 458752) | (i48 & 3670016), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                                i43 = iA;
                                z14 = z11;
                                hVar3 = hVar2;
                                g0Var3 = g0Var2;
                                fontWeight3 = fontWeight2;
                                i44 = i42;
                                lVar3 = lVar2;
                                textStyle3 = textStyle2;
                                vVar3 = vVar2;
                                iVar3 = iVar2;
                                j15 = jB3;
                                j16 = jU;
                                j17 = jB2;
                            } else {
                                pVarF.l();
                                if ((i14 & 32768) != 0) {
                                    i37 &= -458753;
                                }
                                nVar2 = nVar;
                                jU = j10;
                                jB = j11;
                                g0Var2 = g0Var;
                                fontWeight2 = fontWeight;
                                vVar2 = vVar;
                                jB2 = j12;
                                iVar2 = iVar;
                                hVar2 = hVar;
                                jB3 = j13;
                                iA = i10;
                                z11 = z10;
                                i42 = i11;
                                lVar2 = lVar;
                            }
                            textStyle2 = textStyle;
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                            }
                            pVarF.T(79582607);
                            companion = androidx.compose.ui.graphics.l0.INSTANCE;
                            if (jU != companion.u()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                j14 = jU;
                            } else {
                                jP = textStyle2.p();
                                if (jP != companion.u()) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (!z13) {
                                    jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                                }
                                j14 = jP;
                            }
                            pVarF.c0();
                            TextStyle textStyleR2 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                            int i49 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                            int i410 = i37 << 9;
                            BasicTextKt.b(text, nVar2, textStyleR2, lVar2, iA, z11, i42, pVarF, i49 | (i410 & 57344) | (i410 & 458752) | (i410 & 3670016), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            i43 = iA;
                            z14 = z11;
                            hVar3 = hVar2;
                            g0Var3 = g0Var2;
                            fontWeight3 = fontWeight2;
                            i44 = i42;
                            lVar3 = lVar2;
                            textStyle3 = textStyle2;
                            vVar3 = vVar2;
                            iVar3 = iVar2;
                            j15 = jB3;
                            j16 = jU;
                            j17 = jB2;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        final androidx.compose.ui.n nVar3 = nVar2;
                        final long j18 = jB;
                        final boolean z15 = z14;
                        final int i50 = i44;
                        final yh.l<? super TextLayoutResult, kotlin.b2> lVar4 = lVar3;
                        final TextStyle textStyle4 = textStyle3;
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i51) {
                                TextKt.c(text, nVar3, j16, j18, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z15, i50, lVar4, textStyle4, pVar2, i12 | 1, i13, i14);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    }
                    i37 |= 24576;
                    if ((i13 & 458752) != 0) {
                        if ((i14 & 32768) == 0) {
                            i45 = 65536;
                        } else {
                            i45 = 65536;
                        }
                        i37 |= i45;
                    }
                    if ((i15 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        } else {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                        }
                        pVarF.T(79582607);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            j14 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j14 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyleR3 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        int i411 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                        int i412 = i37 << 9;
                        BasicTextKt.b(text, nVar2, textStyleR3, lVar2, iA, z11, i42, pVarF, i411 | (i412 & 57344) | (i412 & 458752) | (i412 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i43 = iA;
                        z14 = z11;
                        hVar3 = hVar2;
                        g0Var3 = g0Var2;
                        fontWeight3 = fontWeight2;
                        i44 = i42;
                        lVar3 = lVar2;
                        textStyle3 = textStyle2;
                        vVar3 = vVar2;
                        iVar3 = iVar2;
                        j15 = jB3;
                        j16 = jU;
                        j17 = jB2;
                    } else {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        } else {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                        }
                        pVarF.T(79582607);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            j14 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j14 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyleR4 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        int i413 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                        int i414 = i37 << 9;
                        BasicTextKt.b(text, nVar2, textStyleR4, lVar2, iA, z11, i42, pVarF, i413 | (i414 & 57344) | (i414 & 458752) | (i414 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i43 = iA;
                        z14 = z11;
                        hVar3 = hVar2;
                        g0Var3 = g0Var2;
                        fontWeight3 = fontWeight2;
                        i44 = i42;
                        lVar3 = lVar2;
                        textStyle3 = textStyle2;
                        vVar3 = vVar2;
                        iVar3 = iVar2;
                        j15 = jB3;
                        j16 = jU;
                        j17 = jB2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar4 = nVar2;
                    final long j19 = jB;
                    final boolean z16 = z14;
                    final int i51 = i44;
                    final yh.l<? super TextLayoutResult, kotlin.b2> lVar5 = lVar3;
                    final TextStyle textStyle5 = textStyle3;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i52) {
                            TextKt.c(text, nVar4, j16, j19, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z16, i51, lVar5, textStyle5, pVar2, i12 | 1, i13, i14);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i37 |= bb.c.d.f31193dj;
                i41 = i14 & 16384;
                if (i41 != 0) {
                    if ((i13 & 57344) == 0) {
                        i37 |= pVarF.s(lVar) ? 16384 : 8192;
                    }
                    if ((i13 & 458752) != 0) {
                        if ((i14 & 32768) == 0) {
                            i45 = 65536;
                        } else {
                            i45 = 65536;
                        }
                        i37 |= i45;
                    }
                    if ((i15 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        } else {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                        }
                        pVarF.T(79582607);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            j14 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j14 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyleR5 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        int i415 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                        int i416 = i37 << 9;
                        BasicTextKt.b(text, nVar2, textStyleR5, lVar2, iA, z11, i42, pVarF, i415 | (i416 & 57344) | (i416 & 458752) | (i416 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i43 = iA;
                        z14 = z11;
                        hVar3 = hVar2;
                        g0Var3 = g0Var2;
                        fontWeight3 = fontWeight2;
                        i44 = i42;
                        lVar3 = lVar2;
                        textStyle3 = textStyle2;
                        vVar3 = vVar2;
                        iVar3 = iVar2;
                        j15 = jB3;
                        j16 = jU;
                        j17 = jB2;
                    } else {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        } else {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                        }
                        pVarF.T(79582607);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            j14 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j14 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyleR6 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        int i417 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                        int i418 = i37 << 9;
                        BasicTextKt.b(text, nVar2, textStyleR6, lVar2, iA, z11, i42, pVarF, i417 | (i418 & 57344) | (i418 & 458752) | (i418 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i43 = iA;
                        z14 = z11;
                        hVar3 = hVar2;
                        g0Var3 = g0Var2;
                        fontWeight3 = fontWeight2;
                        i44 = i42;
                        lVar3 = lVar2;
                        textStyle3 = textStyle2;
                        vVar3 = vVar2;
                        iVar3 = iVar2;
                        j15 = jB3;
                        j16 = jU;
                        j17 = jB2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar5 = nVar2;
                    final long j110 = jB;
                    final boolean z17 = z14;
                    final int i52 = i44;
                    final yh.l<? super TextLayoutResult, kotlin.b2> lVar6 = lVar3;
                    final TextStyle textStyle6 = textStyle3;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i53) {
                            TextKt.c(text, nVar5, j16, j110, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z17, i52, lVar6, textStyle6, pVar2, i12 | 1, i13, i14);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i37 |= 24576;
                if ((i13 & 458752) != 0) {
                    if ((i14 & 32768) == 0) {
                        i45 = 65536;
                    } else {
                        i45 = 65536;
                    }
                    i37 |= i45;
                }
                if ((i15 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    } else {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                    }
                    pVarF.T(79582607);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        j14 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j14 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyleR7 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    int i419 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                    int i4110 = i37 << 9;
                    BasicTextKt.b(text, nVar2, textStyleR7, lVar2, iA, z11, i42, pVarF, i419 | (i4110 & 57344) | (i4110 & 458752) | (i4110 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i43 = iA;
                    z14 = z11;
                    hVar3 = hVar2;
                    g0Var3 = g0Var2;
                    fontWeight3 = fontWeight2;
                    i44 = i42;
                    lVar3 = lVar2;
                    textStyle3 = textStyle2;
                    vVar3 = vVar2;
                    iVar3 = iVar2;
                    j15 = jB3;
                    j16 = jU;
                    j17 = jB2;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    } else {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                    }
                    pVarF.T(79582607);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        j14 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j14 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyleR8 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    int i4111 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                    int i4112 = i37 << 9;
                    BasicTextKt.b(text, nVar2, textStyleR8, lVar2, iA, z11, i42, pVarF, i4111 | (i4112 & 57344) | (i4112 & 458752) | (i4112 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i43 = iA;
                    z14 = z11;
                    hVar3 = hVar2;
                    g0Var3 = g0Var2;
                    fontWeight3 = fontWeight2;
                    i44 = i42;
                    lVar3 = lVar2;
                    textStyle3 = textStyle2;
                    vVar3 = vVar2;
                    iVar3 = iVar2;
                    j15 = jB3;
                    j16 = jU;
                    j17 = jB2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar6 = nVar2;
                final long j111 = jB;
                final boolean z18 = z14;
                final int i53 = i44;
                final yh.l<? super TextLayoutResult, kotlin.b2> lVar7 = lVar3;
                final TextStyle textStyle7 = textStyle3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i54) {
                        TextKt.c(text, nVar6, j16, j111, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z18, i53, lVar7, textStyle7, pVar2, i12 | 1, i13, i14);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i37 |= bb.c.b.f30966u4;
            i40 = i14 & 8192;
            if (i40 != 0) {
                if ((i13 & bb.c.g.f32954lc) == 0) {
                    i37 |= pVarF.y(i11) ? 2048 : 1024;
                }
                i41 = i14 & 16384;
                if (i41 != 0) {
                    if ((i13 & 57344) == 0) {
                        i37 |= pVarF.s(lVar) ? 16384 : 8192;
                    }
                    if ((i13 & 458752) != 0) {
                        if ((i14 & 32768) == 0) {
                            i45 = 65536;
                        } else {
                            i45 = 65536;
                        }
                        i37 |= i45;
                    }
                    if ((i15 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        } else {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                        }
                        pVarF.T(79582607);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            j14 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j14 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyleR9 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        int i4113 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                        int i4114 = i37 << 9;
                        BasicTextKt.b(text, nVar2, textStyleR9, lVar2, iA, z11, i42, pVarF, i4113 | (i4114 & 57344) | (i4114 & 458752) | (i4114 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i43 = iA;
                        z14 = z11;
                        hVar3 = hVar2;
                        g0Var3 = g0Var2;
                        fontWeight3 = fontWeight2;
                        i44 = i42;
                        lVar3 = lVar2;
                        textStyle3 = textStyle2;
                        vVar3 = vVar2;
                        iVar3 = iVar2;
                        j15 = jB3;
                        j16 = jU;
                        j17 = jB2;
                    } else {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        } else {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                        }
                        pVarF.T(79582607);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            j14 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j14 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyleR10 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        int i4115 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                        int i4116 = i37 << 9;
                        BasicTextKt.b(text, nVar2, textStyleR10, lVar2, iA, z11, i42, pVarF, i4115 | (i4116 & 57344) | (i4116 & 458752) | (i4116 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i43 = iA;
                        z14 = z11;
                        hVar3 = hVar2;
                        g0Var3 = g0Var2;
                        fontWeight3 = fontWeight2;
                        i44 = i42;
                        lVar3 = lVar2;
                        textStyle3 = textStyle2;
                        vVar3 = vVar2;
                        iVar3 = iVar2;
                        j15 = jB3;
                        j16 = jU;
                        j17 = jB2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar7 = nVar2;
                    final long j112 = jB;
                    final boolean z19 = z14;
                    final int i54 = i44;
                    final yh.l<? super TextLayoutResult, kotlin.b2> lVar8 = lVar3;
                    final TextStyle textStyle8 = textStyle3;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i55) {
                            TextKt.c(text, nVar7, j16, j112, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z19, i54, lVar8, textStyle8, pVar2, i12 | 1, i13, i14);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i37 |= 24576;
                if ((i13 & 458752) != 0) {
                    if ((i14 & 32768) == 0) {
                        i45 = 65536;
                    } else {
                        i45 = 65536;
                    }
                    i37 |= i45;
                }
                if ((i15 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    } else {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                    }
                    pVarF.T(79582607);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        j14 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j14 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyleR11 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    int i4117 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                    int i4118 = i37 << 9;
                    BasicTextKt.b(text, nVar2, textStyleR11, lVar2, iA, z11, i42, pVarF, i4117 | (i4118 & 57344) | (i4118 & 458752) | (i4118 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i43 = iA;
                    z14 = z11;
                    hVar3 = hVar2;
                    g0Var3 = g0Var2;
                    fontWeight3 = fontWeight2;
                    i44 = i42;
                    lVar3 = lVar2;
                    textStyle3 = textStyle2;
                    vVar3 = vVar2;
                    iVar3 = iVar2;
                    j15 = jB3;
                    j16 = jU;
                    j17 = jB2;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    } else {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                    }
                    pVarF.T(79582607);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        j14 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j14 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyleR12 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    int i4119 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                    int i41110 = i37 << 9;
                    BasicTextKt.b(text, nVar2, textStyleR12, lVar2, iA, z11, i42, pVarF, i4119 | (i41110 & 57344) | (i41110 & 458752) | (i41110 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i43 = iA;
                    z14 = z11;
                    hVar3 = hVar2;
                    g0Var3 = g0Var2;
                    fontWeight3 = fontWeight2;
                    i44 = i42;
                    lVar3 = lVar2;
                    textStyle3 = textStyle2;
                    vVar3 = vVar2;
                    iVar3 = iVar2;
                    j15 = jB3;
                    j16 = jU;
                    j17 = jB2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar8 = nVar2;
                final long j113 = jB;
                final boolean z110 = z14;
                final int i55 = i44;
                final yh.l<? super TextLayoutResult, kotlin.b2> lVar9 = lVar3;
                final TextStyle textStyle9 = textStyle3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i56) {
                        TextKt.c(text, nVar8, j16, j113, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z110, i55, lVar9, textStyle9, pVar2, i12 | 1, i13, i14);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i37 |= bb.c.d.f31193dj;
            i41 = i14 & 16384;
            if (i41 != 0) {
                if ((i13 & 57344) == 0) {
                    i37 |= pVarF.s(lVar) ? 16384 : 8192;
                }
                if ((i13 & 458752) != 0) {
                    if ((i14 & 32768) == 0) {
                        i45 = 65536;
                    } else {
                        i45 = 65536;
                    }
                    i37 |= i45;
                }
                if ((i15 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    } else {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                    }
                    pVarF.T(79582607);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        j14 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j14 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyleR13 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    int i41111 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                    int i41112 = i37 << 9;
                    BasicTextKt.b(text, nVar2, textStyleR13, lVar2, iA, z11, i42, pVarF, i41111 | (i41112 & 57344) | (i41112 & 458752) | (i41112 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i43 = iA;
                    z14 = z11;
                    hVar3 = hVar2;
                    g0Var3 = g0Var2;
                    fontWeight3 = fontWeight2;
                    i44 = i42;
                    lVar3 = lVar2;
                    textStyle3 = textStyle2;
                    vVar3 = vVar2;
                    iVar3 = iVar2;
                    j15 = jB3;
                    j16 = jU;
                    j17 = jB2;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    } else {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                    }
                    pVarF.T(79582607);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        j14 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j14 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyleR14 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    int i41113 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                    int i41114 = i37 << 9;
                    BasicTextKt.b(text, nVar2, textStyleR14, lVar2, iA, z11, i42, pVarF, i41113 | (i41114 & 57344) | (i41114 & 458752) | (i41114 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i43 = iA;
                    z14 = z11;
                    hVar3 = hVar2;
                    g0Var3 = g0Var2;
                    fontWeight3 = fontWeight2;
                    i44 = i42;
                    lVar3 = lVar2;
                    textStyle3 = textStyle2;
                    vVar3 = vVar2;
                    iVar3 = iVar2;
                    j15 = jB3;
                    j16 = jU;
                    j17 = jB2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar9 = nVar2;
                final long j114 = jB;
                final boolean z111 = z14;
                final int i56 = i44;
                final yh.l<? super TextLayoutResult, kotlin.b2> lVar10 = lVar3;
                final TextStyle textStyle10 = textStyle3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i57) {
                        TextKt.c(text, nVar9, j16, j114, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z111, i56, lVar10, textStyle10, pVar2, i12 | 1, i13, i14);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i37 |= 24576;
            if ((i13 & 458752) != 0) {
                if ((i14 & 32768) == 0) {
                    i45 = 65536;
                } else {
                    i45 = 65536;
                }
                i37 |= i45;
            }
            if ((i15 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                } else {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                }
                pVarF.T(79582607);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    j14 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j14 = jP;
                }
                pVarF.c0();
                TextStyle textStyleR15 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                int i41115 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                int i41116 = i37 << 9;
                BasicTextKt.b(text, nVar2, textStyleR15, lVar2, iA, z11, i42, pVarF, i41115 | (i41116 & 57344) | (i41116 & 458752) | (i41116 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i43 = iA;
                z14 = z11;
                hVar3 = hVar2;
                g0Var3 = g0Var2;
                fontWeight3 = fontWeight2;
                i44 = i42;
                lVar3 = lVar2;
                textStyle3 = textStyle2;
                vVar3 = vVar2;
                iVar3 = iVar2;
                j15 = jB3;
                j16 = jU;
                j17 = jB2;
            } else {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                } else {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                }
                pVarF.T(79582607);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    j14 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j14 = jP;
                }
                pVarF.c0();
                TextStyle textStyleR16 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                int i41117 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                int i41118 = i37 << 9;
                BasicTextKt.b(text, nVar2, textStyleR16, lVar2, iA, z11, i42, pVarF, i41117 | (i41118 & 57344) | (i41118 & 458752) | (i41118 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i43 = iA;
                z14 = z11;
                hVar3 = hVar2;
                g0Var3 = g0Var2;
                fontWeight3 = fontWeight2;
                i44 = i42;
                lVar3 = lVar2;
                textStyle3 = textStyle2;
                vVar3 = vVar2;
                iVar3 = iVar2;
                j15 = jB3;
                j16 = jU;
                j17 = jB2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar10 = nVar2;
            final long j115 = jB;
            final boolean z112 = z14;
            final int i57 = i44;
            final yh.l<? super TextLayoutResult, kotlin.b2> lVar11 = lVar3;
            final TextStyle textStyle11 = textStyle3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i58) {
                    TextKt.c(text, nVar10, j16, j115, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z112, i57, lVar11, textStyle11, pVar2, i12 | 1, i13, i14);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i15 |= 48;
        i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= bb.c.b.f30966u4;
        } else if ((i12 & bb.c.b.f30796me) == 0) {
            if (pVarF.z(j10)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        i18 = i14 & 8;
        if (i18 != 0) {
            i15 |= bb.c.d.f31193dj;
        } else if ((i12 & bb.c.g.f32954lc) == 0) {
            if (pVarF.z(j11)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i15 |= i19;
        }
        i20 = i14 & 16;
        if (i20 != 0) {
            i15 |= 24576;
        } else if ((i12 & 57344) == 0) {
            if (pVarF.s(g0Var)) {
                i21 = 16384;
            } else {
                i21 = 8192;
            }
            i15 |= i21;
        }
        i22 = i14 & 32;
        if (i22 != 0) {
            i15 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((i12 & 458752) == 0) {
            if (pVarF.s(fontWeight)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i15 |= i23;
        }
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (pVarF.s(vVar)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i15 |= i25;
        }
        i26 = i14 & 128;
        if (i26 != 0) {
            i15 |= 12582912;
        } else if ((i12 & 29360128) == 0) {
            if (pVarF.z(j12)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i15 |= i27;
        }
        i28 = i14 & 256;
        if (i28 != 0) {
            i15 |= 100663296;
        } else if ((i12 & 234881024) == 0) {
            if (pVarF.s(iVar)) {
                i29 = 67108864;
            } else {
                i29 = 33554432;
            }
            i15 |= i29;
        }
        i30 = i14 & 512;
        if (i30 != 0) {
            i15 |= com.google.android.exoplayer2.j.G;
        } else if ((i12 & 1879048192) == 0) {
            if (pVarF.s(hVar)) {
                i31 = 536870912;
            } else {
                i31 = 268435456;
            }
            i15 |= i31;
        }
        i32 = i14 & 1024;
        if (i32 != 0) {
            i33 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            if (pVarF.z(j13)) {
                i34 = 4;
            } else {
                i34 = 2;
            }
            i33 = i13 | i34;
        } else {
            i33 = i13;
        }
        i35 = i14 & 2048;
        if (i35 != 0) {
            i33 |= 48;
        } else if ((i13 & 112) != 0) {
            if (pVarF.y(i10)) {
                i36 = 32;
            } else {
                i36 = 16;
            }
            i33 |= i36;
        }
        i37 = i33;
        i38 = i14 & 4096;
        if (i38 != 0) {
            if ((i13 & bb.c.b.f30796me) == 0) {
                if (pVarF.u(z10)) {
                    i39 = 256;
                } else {
                    i39 = 128;
                }
                i37 |= i39;
            }
            i40 = i14 & 8192;
            if (i40 != 0) {
                if ((i13 & bb.c.g.f32954lc) == 0) {
                    i37 |= pVarF.y(i11) ? 2048 : 1024;
                }
                i41 = i14 & 16384;
                if (i41 != 0) {
                    if ((i13 & 57344) == 0) {
                        i37 |= pVarF.s(lVar) ? 16384 : 8192;
                    }
                    if ((i13 & 458752) != 0) {
                        if ((i14 & 32768) == 0) {
                            i45 = 65536;
                        } else {
                            i45 = 65536;
                        }
                        i37 |= i45;
                    }
                    if ((i15 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        } else {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                        }
                        pVarF.T(79582607);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            j14 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j14 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyleR17 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        int i41119 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                        int i411110 = i37 << 9;
                        BasicTextKt.b(text, nVar2, textStyleR17, lVar2, iA, z11, i42, pVarF, i41119 | (i411110 & 57344) | (i411110 & 458752) | (i411110 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i43 = iA;
                        z14 = z11;
                        hVar3 = hVar2;
                        g0Var3 = g0Var2;
                        fontWeight3 = fontWeight2;
                        i44 = i42;
                        lVar3 = lVar2;
                        textStyle3 = textStyle2;
                        vVar3 = vVar2;
                        iVar3 = iVar2;
                        j15 = jB3;
                        j16 = jU;
                        j17 = jB2;
                    } else {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        } else {
                            if (i46 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i16 != 0) {
                                jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                            } else {
                                jU = j10;
                            }
                            if (i18 != 0) {
                                jB = s1.u.f139249b.b();
                            } else {
                                jB = j11;
                            }
                            if (i20 != 0) {
                                g0Var2 = null;
                            } else {
                                g0Var2 = g0Var;
                            }
                            if (i22 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i24 != 0) {
                                vVar2 = null;
                            } else {
                                vVar2 = vVar;
                            }
                            if (i26 != 0) {
                                jB2 = s1.u.f139249b.b();
                            } else {
                                jB2 = j12;
                            }
                            if (i28 != 0) {
                                iVar2 = null;
                            } else {
                                iVar2 = iVar;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                jB3 = s1.u.f139249b.b();
                            } else {
                                jB3 = j13;
                            }
                            if (i35 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i42 = Integer.MAX_VALUE;
                            } else {
                                i42 = i11;
                            }
                            if (i41 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return kotlin.b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i14 & 32768) != 0) {
                                textStyle2 = (TextStyle) pVarF.K(f11684a);
                                i37 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                        }
                        pVarF.T(79582607);
                        companion = androidx.compose.ui.graphics.l0.INSTANCE;
                        if (jU != companion.u()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            j14 = jU;
                        } else {
                            jP = textStyle2.p();
                            if (jP != companion.u()) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            }
                            j14 = jP;
                        }
                        pVarF.c0();
                        TextStyle textStyleR18 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                        int i411111 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                        int i411112 = i37 << 9;
                        BasicTextKt.b(text, nVar2, textStyleR18, lVar2, iA, z11, i42, pVarF, i411111 | (i411112 & 57344) | (i411112 & 458752) | (i411112 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i43 = iA;
                        z14 = z11;
                        hVar3 = hVar2;
                        g0Var3 = g0Var2;
                        fontWeight3 = fontWeight2;
                        i44 = i42;
                        lVar3 = lVar2;
                        textStyle3 = textStyle2;
                        vVar3 = vVar2;
                        iVar3 = iVar2;
                        j15 = jB3;
                        j16 = jU;
                        j17 = jB2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar11 = nVar2;
                    final long j116 = jB;
                    final boolean z113 = z14;
                    final int i58 = i44;
                    final yh.l<? super TextLayoutResult, kotlin.b2> lVar12 = lVar3;
                    final TextStyle textStyle12 = textStyle3;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i59) {
                            TextKt.c(text, nVar11, j16, j116, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z113, i58, lVar12, textStyle12, pVar2, i12 | 1, i13, i14);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i37 |= 24576;
                if ((i13 & 458752) != 0) {
                    if ((i14 & 32768) == 0) {
                        i45 = 65536;
                    } else {
                        i45 = 65536;
                    }
                    i37 |= i45;
                }
                if ((i15 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    } else {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                    }
                    pVarF.T(79582607);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        j14 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j14 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyleR19 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    int i411113 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                    int i411114 = i37 << 9;
                    BasicTextKt.b(text, nVar2, textStyleR19, lVar2, iA, z11, i42, pVarF, i411113 | (i411114 & 57344) | (i411114 & 458752) | (i411114 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i43 = iA;
                    z14 = z11;
                    hVar3 = hVar2;
                    g0Var3 = g0Var2;
                    fontWeight3 = fontWeight2;
                    i44 = i42;
                    lVar3 = lVar2;
                    textStyle3 = textStyle2;
                    vVar3 = vVar2;
                    iVar3 = iVar2;
                    j15 = jB3;
                    j16 = jU;
                    j17 = jB2;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    } else {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                    }
                    pVarF.T(79582607);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        j14 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j14 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyleR110 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    int i411115 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                    int i411116 = i37 << 9;
                    BasicTextKt.b(text, nVar2, textStyleR110, lVar2, iA, z11, i42, pVarF, i411115 | (i411116 & 57344) | (i411116 & 458752) | (i411116 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i43 = iA;
                    z14 = z11;
                    hVar3 = hVar2;
                    g0Var3 = g0Var2;
                    fontWeight3 = fontWeight2;
                    i44 = i42;
                    lVar3 = lVar2;
                    textStyle3 = textStyle2;
                    vVar3 = vVar2;
                    iVar3 = iVar2;
                    j15 = jB3;
                    j16 = jU;
                    j17 = jB2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar12 = nVar2;
                final long j117 = jB;
                final boolean z114 = z14;
                final int i59 = i44;
                final yh.l<? super TextLayoutResult, kotlin.b2> lVar13 = lVar3;
                final TextStyle textStyle13 = textStyle3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i510) {
                        TextKt.c(text, nVar12, j16, j117, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z114, i59, lVar13, textStyle13, pVar2, i12 | 1, i13, i14);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i37 |= bb.c.d.f31193dj;
            i41 = i14 & 16384;
            if (i41 != 0) {
                if ((i13 & 57344) == 0) {
                    i37 |= pVarF.s(lVar) ? 16384 : 8192;
                }
                if ((i13 & 458752) != 0) {
                    if ((i14 & 32768) == 0) {
                        i45 = 65536;
                    } else {
                        i45 = 65536;
                    }
                    i37 |= i45;
                }
                if ((i15 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    } else {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                    }
                    pVarF.T(79582607);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        j14 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j14 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyleR111 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    int i411117 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                    int i411118 = i37 << 9;
                    BasicTextKt.b(text, nVar2, textStyleR111, lVar2, iA, z11, i42, pVarF, i411117 | (i411118 & 57344) | (i411118 & 458752) | (i411118 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i43 = iA;
                    z14 = z11;
                    hVar3 = hVar2;
                    g0Var3 = g0Var2;
                    fontWeight3 = fontWeight2;
                    i44 = i42;
                    lVar3 = lVar2;
                    textStyle3 = textStyle2;
                    vVar3 = vVar2;
                    iVar3 = iVar2;
                    j15 = jB3;
                    j16 = jU;
                    j17 = jB2;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    } else {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                    }
                    pVarF.T(79582607);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        j14 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j14 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyleR112 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    int i411119 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                    int i4111110 = i37 << 9;
                    BasicTextKt.b(text, nVar2, textStyleR112, lVar2, iA, z11, i42, pVarF, i411119 | (i4111110 & 57344) | (i4111110 & 458752) | (i4111110 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i43 = iA;
                    z14 = z11;
                    hVar3 = hVar2;
                    g0Var3 = g0Var2;
                    fontWeight3 = fontWeight2;
                    i44 = i42;
                    lVar3 = lVar2;
                    textStyle3 = textStyle2;
                    vVar3 = vVar2;
                    iVar3 = iVar2;
                    j15 = jB3;
                    j16 = jU;
                    j17 = jB2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar13 = nVar2;
                final long j118 = jB;
                final boolean z115 = z14;
                final int i510 = i44;
                final yh.l<? super TextLayoutResult, kotlin.b2> lVar14 = lVar3;
                final TextStyle textStyle14 = textStyle3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i511) {
                        TextKt.c(text, nVar13, j16, j118, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z115, i510, lVar14, textStyle14, pVar2, i12 | 1, i13, i14);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i37 |= 24576;
            if ((i13 & 458752) != 0) {
                if ((i14 & 32768) == 0) {
                    i45 = 65536;
                } else {
                    i45 = 65536;
                }
                i37 |= i45;
            }
            if ((i15 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                } else {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                }
                pVarF.T(79582607);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    j14 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j14 = jP;
                }
                pVarF.c0();
                TextStyle textStyleR113 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                int i4111111 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                int i4111112 = i37 << 9;
                BasicTextKt.b(text, nVar2, textStyleR113, lVar2, iA, z11, i42, pVarF, i4111111 | (i4111112 & 57344) | (i4111112 & 458752) | (i4111112 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i43 = iA;
                z14 = z11;
                hVar3 = hVar2;
                g0Var3 = g0Var2;
                fontWeight3 = fontWeight2;
                i44 = i42;
                lVar3 = lVar2;
                textStyle3 = textStyle2;
                vVar3 = vVar2;
                iVar3 = iVar2;
                j15 = jB3;
                j16 = jU;
                j17 = jB2;
            } else {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                } else {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                }
                pVarF.T(79582607);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    j14 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j14 = jP;
                }
                pVarF.c0();
                TextStyle textStyleR114 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                int i4111113 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                int i4111114 = i37 << 9;
                BasicTextKt.b(text, nVar2, textStyleR114, lVar2, iA, z11, i42, pVarF, i4111113 | (i4111114 & 57344) | (i4111114 & 458752) | (i4111114 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i43 = iA;
                z14 = z11;
                hVar3 = hVar2;
                g0Var3 = g0Var2;
                fontWeight3 = fontWeight2;
                i44 = i42;
                lVar3 = lVar2;
                textStyle3 = textStyle2;
                vVar3 = vVar2;
                iVar3 = iVar2;
                j15 = jB3;
                j16 = jU;
                j17 = jB2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar14 = nVar2;
            final long j119 = jB;
            final boolean z116 = z14;
            final int i511 = i44;
            final yh.l<? super TextLayoutResult, kotlin.b2> lVar15 = lVar3;
            final TextStyle textStyle15 = textStyle3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i512) {
                    TextKt.c(text, nVar14, j16, j119, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z116, i511, lVar15, textStyle15, pVar2, i12 | 1, i13, i14);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i37 |= bb.c.b.f30966u4;
        i40 = i14 & 8192;
        if (i40 != 0) {
            if ((i13 & bb.c.g.f32954lc) == 0) {
                i37 |= pVarF.y(i11) ? 2048 : 1024;
            }
            i41 = i14 & 16384;
            if (i41 != 0) {
                if ((i13 & 57344) == 0) {
                    i37 |= pVarF.s(lVar) ? 16384 : 8192;
                }
                if ((i13 & 458752) != 0) {
                    if ((i14 & 32768) == 0) {
                        i45 = 65536;
                    } else {
                        i45 = 65536;
                    }
                    i37 |= i45;
                }
                if ((i15 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    } else {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                    }
                    pVarF.T(79582607);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        j14 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j14 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyleR115 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    int i4111115 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                    int i4111116 = i37 << 9;
                    BasicTextKt.b(text, nVar2, textStyleR115, lVar2, iA, z11, i42, pVarF, i4111115 | (i4111116 & 57344) | (i4111116 & 458752) | (i4111116 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i43 = iA;
                    z14 = z11;
                    hVar3 = hVar2;
                    g0Var3 = g0Var2;
                    fontWeight3 = fontWeight2;
                    i44 = i42;
                    lVar3 = lVar2;
                    textStyle3 = textStyle2;
                    vVar3 = vVar2;
                    iVar3 = iVar2;
                    j15 = jB3;
                    j16 = jU;
                    j17 = jB2;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    } else {
                        if (i46 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i16 != 0) {
                            jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                        } else {
                            jU = j10;
                        }
                        if (i18 != 0) {
                            jB = s1.u.f139249b.b();
                        } else {
                            jB = j11;
                        }
                        if (i20 != 0) {
                            g0Var2 = null;
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (i22 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i24 != 0) {
                            vVar2 = null;
                        } else {
                            vVar2 = vVar;
                        }
                        if (i26 != 0) {
                            jB2 = s1.u.f139249b.b();
                        } else {
                            jB2 = j12;
                        }
                        if (i28 != 0) {
                            iVar2 = null;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            jB3 = s1.u.f139249b.b();
                        } else {
                            jB3 = j13;
                        }
                        if (i35 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = i11;
                        }
                        if (i41 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return kotlin.b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i14 & 32768) != 0) {
                            textStyle2 = (TextStyle) pVarF.K(f11684a);
                            i37 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                    }
                    pVarF.T(79582607);
                    companion = androidx.compose.ui.graphics.l0.INSTANCE;
                    if (jU != companion.u()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        j14 = jU;
                    } else {
                        jP = textStyle2.p();
                        if (jP != companion.u()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        j14 = jP;
                    }
                    pVarF.c0();
                    TextStyle textStyleR116 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                    int i4111117 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                    int i4111118 = i37 << 9;
                    BasicTextKt.b(text, nVar2, textStyleR116, lVar2, iA, z11, i42, pVarF, i4111117 | (i4111118 & 57344) | (i4111118 & 458752) | (i4111118 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i43 = iA;
                    z14 = z11;
                    hVar3 = hVar2;
                    g0Var3 = g0Var2;
                    fontWeight3 = fontWeight2;
                    i44 = i42;
                    lVar3 = lVar2;
                    textStyle3 = textStyle2;
                    vVar3 = vVar2;
                    iVar3 = iVar2;
                    j15 = jB3;
                    j16 = jU;
                    j17 = jB2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar15 = nVar2;
                final long j1110 = jB;
                final boolean z117 = z14;
                final int i512 = i44;
                final yh.l<? super TextLayoutResult, kotlin.b2> lVar16 = lVar3;
                final TextStyle textStyle16 = textStyle3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i513) {
                        TextKt.c(text, nVar15, j16, j1110, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z117, i512, lVar16, textStyle16, pVar2, i12 | 1, i13, i14);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i37 |= 24576;
            if ((i13 & 458752) != 0) {
                if ((i14 & 32768) == 0) {
                    i45 = 65536;
                } else {
                    i45 = 65536;
                }
                i37 |= i45;
            }
            if ((i15 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                } else {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                }
                pVarF.T(79582607);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    j14 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j14 = jP;
                }
                pVarF.c0();
                TextStyle textStyleR117 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                int i4111119 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                int i41111110 = i37 << 9;
                BasicTextKt.b(text, nVar2, textStyleR117, lVar2, iA, z11, i42, pVarF, i4111119 | (i41111110 & 57344) | (i41111110 & 458752) | (i41111110 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i43 = iA;
                z14 = z11;
                hVar3 = hVar2;
                g0Var3 = g0Var2;
                fontWeight3 = fontWeight2;
                i44 = i42;
                lVar3 = lVar2;
                textStyle3 = textStyle2;
                vVar3 = vVar2;
                iVar3 = iVar2;
                j15 = jB3;
                j16 = jU;
                j17 = jB2;
            } else {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                } else {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                }
                pVarF.T(79582607);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    j14 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j14 = jP;
                }
                pVarF.c0();
                TextStyle textStyleR118 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                int i41111111 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                int i41111112 = i37 << 9;
                BasicTextKt.b(text, nVar2, textStyleR118, lVar2, iA, z11, i42, pVarF, i41111111 | (i41111112 & 57344) | (i41111112 & 458752) | (i41111112 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i43 = iA;
                z14 = z11;
                hVar3 = hVar2;
                g0Var3 = g0Var2;
                fontWeight3 = fontWeight2;
                i44 = i42;
                lVar3 = lVar2;
                textStyle3 = textStyle2;
                vVar3 = vVar2;
                iVar3 = iVar2;
                j15 = jB3;
                j16 = jU;
                j17 = jB2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar16 = nVar2;
            final long j1111 = jB;
            final boolean z118 = z14;
            final int i513 = i44;
            final yh.l<? super TextLayoutResult, kotlin.b2> lVar17 = lVar3;
            final TextStyle textStyle17 = textStyle3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i514) {
                    TextKt.c(text, nVar16, j16, j1111, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z118, i513, lVar17, textStyle17, pVar2, i12 | 1, i13, i14);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i37 |= bb.c.d.f31193dj;
        i41 = i14 & 16384;
        if (i41 != 0) {
            if ((i13 & 57344) == 0) {
                i37 |= pVarF.s(lVar) ? 16384 : 8192;
            }
            if ((i13 & 458752) != 0) {
                if ((i14 & 32768) == 0) {
                    i45 = 65536;
                } else {
                    i45 = 65536;
                }
                i37 |= i45;
            }
            if ((i15 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                } else {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                }
                pVarF.T(79582607);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    j14 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j14 = jP;
                }
                pVarF.c0();
                TextStyle textStyleR119 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                int i41111113 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                int i41111114 = i37 << 9;
                BasicTextKt.b(text, nVar2, textStyleR119, lVar2, iA, z11, i42, pVarF, i41111113 | (i41111114 & 57344) | (i41111114 & 458752) | (i41111114 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i43 = iA;
                z14 = z11;
                hVar3 = hVar2;
                g0Var3 = g0Var2;
                fontWeight3 = fontWeight2;
                i44 = i42;
                lVar3 = lVar2;
                textStyle3 = textStyle2;
                vVar3 = vVar2;
                iVar3 = iVar2;
                j15 = jB3;
                j16 = jU;
                j17 = jB2;
            } else {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                } else {
                    if (i46 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i16 != 0) {
                        jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                    } else {
                        jU = j10;
                    }
                    if (i18 != 0) {
                        jB = s1.u.f139249b.b();
                    } else {
                        jB = j11;
                    }
                    if (i20 != 0) {
                        g0Var2 = null;
                    } else {
                        g0Var2 = g0Var;
                    }
                    if (i22 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i24 != 0) {
                        vVar2 = null;
                    } else {
                        vVar2 = vVar;
                    }
                    if (i26 != 0) {
                        jB2 = s1.u.f139249b.b();
                    } else {
                        jB2 = j12;
                    }
                    if (i28 != 0) {
                        iVar2 = null;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        jB3 = s1.u.f139249b.b();
                    } else {
                        jB3 = j13;
                    }
                    if (i35 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i42 = Integer.MAX_VALUE;
                    } else {
                        i42 = i11;
                    }
                    if (i41 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                            public final void a(@dl.d TextLayoutResult it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return kotlin.b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i14 & 32768) != 0) {
                        textStyle2 = (TextStyle) pVarF.K(f11684a);
                        i37 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
                }
                pVarF.T(79582607);
                companion = androidx.compose.ui.graphics.l0.INSTANCE;
                if (jU != companion.u()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    j14 = jU;
                } else {
                    jP = textStyle2.p();
                    if (jP != companion.u()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    }
                    j14 = jP;
                }
                pVarF.c0();
                TextStyle textStyleR1110 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
                int i41111115 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
                int i41111116 = i37 << 9;
                BasicTextKt.b(text, nVar2, textStyleR1110, lVar2, iA, z11, i42, pVarF, i41111115 | (i41111116 & 57344) | (i41111116 & 458752) | (i41111116 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i43 = iA;
                z14 = z11;
                hVar3 = hVar2;
                g0Var3 = g0Var2;
                fontWeight3 = fontWeight2;
                i44 = i42;
                lVar3 = lVar2;
                textStyle3 = textStyle2;
                vVar3 = vVar2;
                iVar3 = iVar2;
                j15 = jB3;
                j16 = jU;
                j17 = jB2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar17 = nVar2;
            final long j1112 = jB;
            final boolean z119 = z14;
            final int i514 = i44;
            final yh.l<? super TextLayoutResult, kotlin.b2> lVar18 = lVar3;
            final TextStyle textStyle18 = textStyle3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i515) {
                    TextKt.c(text, nVar17, j16, j1112, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z119, i514, lVar18, textStyle18, pVar2, i12 | 1, i13, i14);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i37 |= 24576;
        if ((i13 & 458752) != 0) {
            if ((i14 & 32768) == 0) {
                i45 = 65536;
            } else {
                i45 = 65536;
            }
            i37 |= i45;
        }
        if ((i15 & 1533916891) != 306783378) {
            pVarF.W();
            if ((i12 & 1) != 0) {
                if (i46 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i16 != 0) {
                    jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                } else {
                    jU = j10;
                }
                if (i18 != 0) {
                    jB = s1.u.f139249b.b();
                } else {
                    jB = j11;
                }
                if (i20 != 0) {
                    g0Var2 = null;
                } else {
                    g0Var2 = g0Var;
                }
                if (i22 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i24 != 0) {
                    vVar2 = null;
                } else {
                    vVar2 = vVar;
                }
                if (i26 != 0) {
                    jB2 = s1.u.f139249b.b();
                } else {
                    jB2 = j12;
                }
                if (i28 != 0) {
                    iVar2 = null;
                } else {
                    iVar2 = iVar;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    jB3 = s1.u.f139249b.b();
                } else {
                    jB3 = j13;
                }
                if (i35 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i42 = Integer.MAX_VALUE;
                } else {
                    i42 = i11;
                }
                if (i41 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                        public final void a(@dl.d TextLayoutResult it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return kotlin.b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if ((i14 & 32768) != 0) {
                    textStyle2 = (TextStyle) pVarF.K(f11684a);
                    i37 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
            } else {
                if (i46 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i16 != 0) {
                    jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                } else {
                    jU = j10;
                }
                if (i18 != 0) {
                    jB = s1.u.f139249b.b();
                } else {
                    jB = j11;
                }
                if (i20 != 0) {
                    g0Var2 = null;
                } else {
                    g0Var2 = g0Var;
                }
                if (i22 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i24 != 0) {
                    vVar2 = null;
                } else {
                    vVar2 = vVar;
                }
                if (i26 != 0) {
                    jB2 = s1.u.f139249b.b();
                } else {
                    jB2 = j12;
                }
                if (i28 != 0) {
                    iVar2 = null;
                } else {
                    iVar2 = iVar;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    jB3 = s1.u.f139249b.b();
                } else {
                    jB3 = j13;
                }
                if (i35 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i42 = Integer.MAX_VALUE;
                } else {
                    i42 = i11;
                }
                if (i41 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                        public final void a(@dl.d TextLayoutResult it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return kotlin.b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if ((i14 & 32768) != 0) {
                    textStyle2 = (TextStyle) pVarF.K(f11684a);
                    i37 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
            }
            pVarF.T(79582607);
            companion = androidx.compose.ui.graphics.l0.INSTANCE;
            if (jU != companion.u()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                j14 = jU;
            } else {
                jP = textStyle2.p();
                if (jP != companion.u()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                }
                j14 = jP;
            }
            pVarF.c0();
            TextStyle textStyleR1111 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
            int i41111117 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
            int i41111118 = i37 << 9;
            BasicTextKt.b(text, nVar2, textStyleR1111, lVar2, iA, z11, i42, pVarF, i41111117 | (i41111118 & 57344) | (i41111118 & 458752) | (i41111118 & 3670016), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            i43 = iA;
            z14 = z11;
            hVar3 = hVar2;
            g0Var3 = g0Var2;
            fontWeight3 = fontWeight2;
            i44 = i42;
            lVar3 = lVar2;
            textStyle3 = textStyle2;
            vVar3 = vVar2;
            iVar3 = iVar2;
            j15 = jB3;
            j16 = jU;
            j17 = jB2;
        } else {
            pVarF.W();
            if ((i12 & 1) != 0) {
                if (i46 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i16 != 0) {
                    jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                } else {
                    jU = j10;
                }
                if (i18 != 0) {
                    jB = s1.u.f139249b.b();
                } else {
                    jB = j11;
                }
                if (i20 != 0) {
                    g0Var2 = null;
                } else {
                    g0Var2 = g0Var;
                }
                if (i22 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i24 != 0) {
                    vVar2 = null;
                } else {
                    vVar2 = vVar;
                }
                if (i26 != 0) {
                    jB2 = s1.u.f139249b.b();
                } else {
                    jB2 = j12;
                }
                if (i28 != 0) {
                    iVar2 = null;
                } else {
                    iVar2 = iVar;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    jB3 = s1.u.f139249b.b();
                } else {
                    jB3 = j13;
                }
                if (i35 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i42 = Integer.MAX_VALUE;
                } else {
                    i42 = i11;
                }
                if (i41 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                        public final void a(@dl.d TextLayoutResult it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return kotlin.b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if ((i14 & 32768) != 0) {
                    textStyle2 = (TextStyle) pVarF.K(f11684a);
                    i37 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
            } else {
                if (i46 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i16 != 0) {
                    jU = androidx.compose.ui.graphics.l0.INSTANCE.u();
                } else {
                    jU = j10;
                }
                if (i18 != 0) {
                    jB = s1.u.f139249b.b();
                } else {
                    jB = j11;
                }
                if (i20 != 0) {
                    g0Var2 = null;
                } else {
                    g0Var2 = g0Var;
                }
                if (i22 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i24 != 0) {
                    vVar2 = null;
                } else {
                    vVar2 = vVar;
                }
                if (i26 != 0) {
                    jB2 = s1.u.f139249b.b();
                } else {
                    jB2 = j12;
                }
                if (i28 != 0) {
                    iVar2 = null;
                } else {
                    iVar2 = iVar;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    jB3 = s1.u.f139249b.b();
                } else {
                    jB3 = j13;
                }
                if (i35 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i42 = Integer.MAX_VALUE;
                } else {
                    i42 = i11;
                }
                if (i41 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$1
                        public final void a(@dl.d TextLayoutResult it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return kotlin.b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if ((i14 & 32768) != 0) {
                    textStyle2 = (TextStyle) pVarF.K(f11684a);
                    i37 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1968784669, i15, i37, "androidx.compose.material3.Text (Text.kt:88)");
            }
            pVarF.T(79582607);
            companion = androidx.compose.ui.graphics.l0.INSTANCE;
            if (jU != companion.u()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                j14 = jU;
            } else {
                jP = textStyle2.p();
                if (jP != companion.u()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    jP = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                }
                j14 = jP;
            }
            pVarF.c0();
            TextStyle textStyleR1112 = textStyle2.R(new TextStyle(j14, jB, fontWeight2, g0Var2, (androidx.compose.ui.text.font.h0) null, vVar2, (String) null, jB2, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, iVar2, (Shadow) null, hVar2, (androidx.compose.ui.text.style.j) null, jB3, (TextIndent) null, 175952, (kotlin.jvm.internal.u) null));
            int i41111119 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & bb.c.g.f32954lc);
            int i411111110 = i37 << 9;
            BasicTextKt.b(text, nVar2, textStyleR1112, lVar2, iA, z11, i42, pVarF, i41111119 | (i411111110 & 57344) | (i411111110 & 458752) | (i411111110 & 3670016), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            i43 = iA;
            z14 = z11;
            hVar3 = hVar2;
            g0Var3 = g0Var2;
            fontWeight3 = fontWeight2;
            i44 = i42;
            lVar3 = lVar2;
            textStyle3 = textStyle2;
            vVar3 = vVar2;
            iVar3 = iVar2;
            j15 = jB3;
            j16 = jU;
            j17 = jB2;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar18 = nVar2;
        final long j1113 = jB;
        final boolean z1110 = z14;
        final int i515 = i44;
        final yh.l<? super TextLayoutResult, kotlin.b2> lVar19 = lVar3;
        final TextStyle textStyle19 = textStyle3;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextKt$Text$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i516) {
                TextKt.c(text, nVar18, j16, j1113, g0Var3, fontWeight3, vVar3, j17, iVar3, hVar3, j15, i43, z1110, i515, lVar19, textStyle19, pVar2, i12 | 1, i13, i14);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @dl.d
    public static final androidx.compose.runtime.j1<TextStyle> d() {
        return f11684a;
    }
}
