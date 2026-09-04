package androidx.compose.foundation.text;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.u1;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.m0;
import androidx.compose.ui.text.o0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BasicTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aä\u0001\u0010!\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001923\b\u0002\u0010 \u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001cH\u0007¢\u0006\u0004\b!\u0010\"\u001aä\u0001\u0010$\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020#2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001923\b\u0002\u0010 \u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001cH\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"", "value", "Lkotlin/Function1;", "Lkotlin/b2;", "onValueChange", "Landroidx/compose/ui/n;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/q0;", "textStyle", "Landroidx/compose/foundation/text/k;", "keyboardOptions", "Landroidx/compose/foundation/text/i;", "keyboardActions", "singleLine", "", "maxLines", "Landroidx/compose/ui/text/input/m0;", "visualTransformation", "Landroidx/compose/ui/text/i0;", "onTextLayout", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "Landroidx/compose/ui/graphics/a0;", "cursorBrush", "Lkotlin/Function0;", "Landroidx/compose/runtime/h;", "Lkotlin/m0;", "name", "innerTextField", "decorationBox", "b", "(Ljava/lang/String;Lyh/l;Landroidx/compose/ui/n;ZZLandroidx/compose/ui/text/q0;Landroidx/compose/foundation/text/k;Landroidx/compose/foundation/text/i;ZILandroidx/compose/ui/text/input/m0;Lyh/l;Landroidx/compose/foundation/interaction/g;Landroidx/compose/ui/graphics/a0;Lyh/q;Landroidx/compose/runtime/p;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", ak.av, "(Landroidx/compose/ui/text/input/TextFieldValue;Lyh/l;Landroidx/compose/ui/n;ZZLandroidx/compose/ui/text/q0;Landroidx/compose/foundation/text/k;Landroidx/compose/foundation/text/i;ZILandroidx/compose/ui/text/input/m0;Lyh/l;Landroidx/compose/foundation/interaction/g;Landroidx/compose/ui/graphics/a0;Lyh/q;Landroidx/compose/runtime/p;III)V", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class BasicTextFieldKt {
    /* JADX WARN: Code duplicated, block: B:100:0x013f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0145  */
    /* JADX WARN: Code duplicated, block: B:103:0x0148  */
    /* JADX WARN: Code duplicated, block: B:107:0x0150  */
    /* JADX WARN: Code duplicated, block: B:108:0x0155  */
    /* JADX WARN: Code duplicated, block: B:110:0x015b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0161  */
    /* JADX WARN: Code duplicated, block: B:113:0x0164  */
    /* JADX WARN: Code duplicated, block: B:115:0x0169  */
    /* JADX WARN: Code duplicated, block: B:118:0x016f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0172  */
    /* JADX WARN: Code duplicated, block: B:121:0x0178  */
    /* JADX WARN: Code duplicated, block: B:123:0x017e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0181  */
    /* JADX WARN: Code duplicated, block: B:128:0x018b  */
    /* JADX WARN: Code duplicated, block: B:129:0x018e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0192  */
    /* JADX WARN: Code duplicated, block: B:133:0x019a  */
    /* JADX WARN: Code duplicated, block: B:134:0x019d  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:166:0x0212  */
    /* JADX WARN: Code duplicated, block: B:168:0x0219  */
    /* JADX WARN: Code duplicated, block: B:175:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x0247  */
    /* JADX WARN: Code duplicated, block: B:177:0x024a  */
    /* JADX WARN: Code duplicated, block: B:179:0x024e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0250  */
    /* JADX WARN: Code duplicated, block: B:182:0x0254  */
    /* JADX WARN: Code duplicated, block: B:183:0x0257  */
    /* JADX WARN: Code duplicated, block: B:185:0x025b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0262  */
    /* JADX WARN: Code duplicated, block: B:188:0x0266  */
    /* JADX WARN: Code duplicated, block: B:189:0x026d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0271  */
    /* JADX WARN: Code duplicated, block: B:192:0x0278  */
    /* JADX WARN: Code duplicated, block: B:194:0x027c  */
    /* JADX WARN: Code duplicated, block: B:195:0x027e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0282  */
    /* JADX WARN: Code duplicated, block: B:198:0x0286  */
    /* JADX WARN: Code duplicated, block: B:200:0x028a  */
    /* JADX WARN: Code duplicated, block: B:201:0x0291  */
    /* JADX WARN: Code duplicated, block: B:203:0x0295  */
    /* JADX WARN: Code duplicated, block: B:204:0x0298  */
    /* JADX WARN: Code duplicated, block: B:206:0x029c  */
    /* JADX WARN: Code duplicated, block: B:208:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:210:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:213:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:214:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:216:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:217:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:221:0x0311  */
    /* JADX WARN: Code duplicated, block: B:224:0x0321  */
    /* JADX WARN: Code duplicated, block: B:225:0x0323  */
    /* JADX WARN: Code duplicated, block: B:228:0x033e  */
    /* JADX WARN: Code duplicated, block: B:230:0x0346  */
    /* JADX WARN: Code duplicated, block: B:233:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:238:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00df  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0105  */
    /* JADX WARN: Code duplicated, block: B:83:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x0117  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0125  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:97:0x0130  */
    /* JADX WARN: Code duplicated, block: B:98:0x0137  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final TextFieldValue value, @dl.d final yh.l<? super TextFieldValue, b2> onValueChange, @dl.e androidx.compose.ui.n nVar, boolean z10, boolean z11, @dl.e TextStyle textStyle, @dl.e KeyboardOptions keyboardOptions, @dl.e i iVar, boolean z12, int i10, @dl.e m0 m0Var, @dl.e yh.l<? super TextLayoutResult, b2> lVar, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e androidx.compose.ui.graphics.a0 a0Var, @dl.e yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, ? super androidx.compose.runtime.p, ? super Integer, b2> qVar, @dl.e androidx.compose.runtime.p pVar, final int i11, final int i12, final int i13) {
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
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        androidx.compose.ui.n nVar2;
        boolean z13;
        boolean z14;
        TextStyle textStyleA;
        KeyboardOptions keyboardOptionsA;
        i iVarA;
        boolean z15;
        int i38;
        m0 m0VarA;
        yh.l<? super TextLayoutResult, b2> lVar2;
        androidx.compose.foundation.interaction.g gVar2;
        androidx.compose.ui.graphics.a0 solidColor;
        yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, ? super androidx.compose.runtime.p, ? super Integer, b2> qVarB;
        androidx.compose.ui.n nVar3;
        yh.l<? super TextLayoutResult, b2> lVar3;
        i iVar2;
        androidx.compose.foundation.interaction.g gVar3;
        boolean z16;
        androidx.compose.ui.graphics.a0 a0Var2;
        boolean z17;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        boolean z18;
        Object objU;
        int i39;
        boolean zS;
        Object objU2;
        androidx.compose.runtime.p pVar2;
        final androidx.compose.ui.n nVar4;
        final boolean z19;
        final boolean z20;
        final TextStyle textStyle3;
        final i iVar3;
        final boolean z21;
        final int i40;
        final m0 m0Var2;
        final yh.l<? super TextLayoutResult, b2> lVar4;
        final androidx.compose.foundation.interaction.g gVar4;
        final androidx.compose.ui.graphics.a0 a0Var3;
        final KeyboardOptions keyboardOptions3;
        final yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, ? super androidx.compose.runtime.p, ? super Integer, b2> qVar2;
        u1 u1VarH;
        f0.p(value, "value");
        f0.p(onValueChange, "onValueChange");
        androidx.compose.runtime.p pVarF = pVar.F(-560482651);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i14 = (pVarF.s(value) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 112) == 0) {
            i14 |= pVarF.s(onValueChange) ? 32 : 16;
        }
        int i41 = i13 & 4;
        if (i41 == 0) {
            if ((i11 & bb.c.b.f30796me) == 0) {
                i14 |= pVarF.s(nVar) ? 256 : 128;
            }
            i15 = i13 & 8;
            if (i15 != 0) {
                if ((i11 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.u(z10)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 16;
                if (i17 != 0) {
                    i14 |= 24576;
                } else if ((i11 & 57344) == 0) {
                    if (pVarF.u(z11)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 32;
                if (i19 != 0) {
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i11 & 458752) == 0) {
                    if (pVarF.s(textStyle)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 64;
                if (i21 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (pVarF.s(keyboardOptions)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 128;
                if (i23 != 0) {
                    i14 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (pVarF.s(iVar)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 256;
                if (i25 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 234881024) == 0) {
                    if (pVarF.u(z12)) {
                        i26 = 67108864;
                    } else {
                        i26 = 33554432;
                    }
                    i14 |= i26;
                }
                i27 = i13 & 512;
                if (i27 != 0) {
                    i14 |= com.google.android.exoplayer2.j.G;
                } else if ((i11 & 1879048192) == 0) {
                    if (pVarF.y(i10)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i14 |= i28;
                }
                i29 = i13 & 1024;
                if (i29 != 0) {
                    i30 = i12 | 6;
                } else if ((i12 & 14) == 0) {
                    if (pVarF.s(m0Var)) {
                        i31 = 4;
                    } else {
                        i31 = 2;
                    }
                    i30 = i12 | i31;
                } else {
                    i30 = i12;
                }
                i32 = i13 & 2048;
                if (i32 != 0) {
                    i30 |= 48;
                } else if ((i12 & 112) == 0) {
                    if (pVarF.s(lVar)) {
                        i33 = 32;
                    } else {
                        i33 = 16;
                    }
                    i30 |= i33;
                }
                i34 = i30;
                i35 = i13 & 4096;
                if (i35 != 0) {
                    if ((i12 & bb.c.b.f30796me) == 0) {
                        if (pVarF.s(gVar)) {
                            i36 = 256;
                        } else {
                            i36 = 128;
                        }
                        i34 |= i36;
                    }
                    if ((i12 & bb.c.g.f32954lc) != 0) {
                        i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
                    }
                    i37 = i13 & 16384;
                    if (i37 != 0) {
                        i34 |= 24576;
                    } else if ((i12 & 57344) == 0) {
                        i34 |= pVarF.s(qVar) ? 16384 : 8192;
                    }
                    if ((i14 & 1533916891) != 306783378 && (46811 & i34) == 9362 && pVarF.b()) {
                        pVarF.l();
                        nVar4 = nVar;
                        z19 = z10;
                        z20 = z11;
                        textStyle3 = textStyle;
                        keyboardOptions3 = keyboardOptions;
                        iVar3 = iVar;
                        z21 = z12;
                        m0Var2 = m0Var;
                        lVar4 = lVar;
                        gVar4 = gVar;
                        a0Var3 = a0Var;
                        qVar2 = qVar;
                        pVar2 = pVarF;
                        i40 = i10;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0 || pVarF.o()) {
                            if (i41 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i17 != 0) {
                                z14 = false;
                            } else {
                                z14 = z11;
                            }
                            if (i19 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle;
                            }
                            if (i21 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if (i23 != 0) {
                                iVarA = i.INSTANCE.a();
                            } else {
                                iVarA = iVar;
                            }
                            if (i25 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i27 != 0) {
                                i38 = Integer.MAX_VALUE;
                            } else {
                                i38 = i10;
                            }
                            if (i29 != 0) {
                                m0VarA = m0.INSTANCE.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i32 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if (i35 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar2 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar2 = gVar;
                            }
                            if ((i13 & 8192) != 0) {
                                solidColor = new SolidColor(l0.INSTANCE.a(), null);
                                i34 &= -7169;
                            } else {
                                solidColor = a0Var;
                            }
                            if (i37 != 0) {
                                qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                            } else {
                                qVarB = qVar;
                            }
                            nVar3 = nVar2;
                            lVar3 = lVar2;
                            iVar2 = iVarA;
                            gVar3 = gVar2;
                            z16 = z13;
                            a0Var2 = solidColor;
                            z17 = z14;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            z18 = z15;
                        } else {
                            pVarF.l();
                            if ((i13 & 8192) != 0) {
                                i34 &= -7169;
                            }
                            nVar3 = nVar;
                            z16 = z10;
                            z17 = z11;
                            textStyle2 = textStyle;
                            keyboardOptions2 = keyboardOptions;
                            iVar2 = iVar;
                            z18 = z12;
                            i38 = i10;
                            m0VarA = m0Var;
                            lVar3 = lVar;
                            gVar3 = gVar;
                            a0Var2 = a0Var;
                            qVarB = qVar;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
                        }
                        ImeOptions imeOptionsH = keyboardOptions2.h(z18);
                        boolean z22 = !z18;
                        if (z18) {
                            i39 = 1;
                        } else {
                            i39 = i38;
                        }
                        int i42 = i14 & 14;
                        pVarF.T(511388516);
                        zS = pVarF.s(value) | pVarF.s(onValueChange);
                        objU2 = pVarF.U();
                        if (zS || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextFieldValue it) {
                                    f0.p(it, "it");
                                    if (f0.g(value, it)) {
                                        return;
                                    }
                                    onValueChange.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                    a(textFieldValue);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        yh.l lVar5 = (yh.l) objU2;
                        int i43 = i14;
                        int i44 = i34 << 12;
                        int i45 = i42 | (i43 & bb.c.b.f30796me) | ((i43 >> 6) & bb.c.g.f32954lc) | (i44 & 57344) | (i44 & 458752) | (3670016 & i44) | (i44 & 29360128);
                        int i46 = i43 >> 3;
                        pVar2 = pVarF;
                        boolean z23 = z18;
                        KeyboardOptions keyboardOptions4 = keyboardOptions2;
                        CoreTextFieldKt.a(value, lVar5, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z22, i39, imeOptionsH, iVar2, z16, z17, qVarB, pVar2, i45, ((i43 >> 18) & 112) | (i46 & bb.c.b.f30796me) | (i46 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        z19 = z16;
                        z20 = z17;
                        textStyle3 = textStyle2;
                        iVar3 = iVar2;
                        z21 = z23;
                        i40 = i38;
                        m0Var2 = m0VarA;
                        lVar4 = lVar3;
                        gVar4 = gVar3;
                        a0Var3 = a0Var2;
                        keyboardOptions3 = keyboardOptions4;
                        qVar2 = qVarB;
                    }
                    u1VarH = pVar2.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i47) {
                            BasicTextFieldKt.a(value, onValueChange, nVar4, z19, z20, textStyle3, keyboardOptions3, iVar3, z21, i40, m0Var2, lVar4, gVar4, a0Var3, qVar2, pVar3, i11 | 1, i12, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i34 |= bb.c.b.f30966u4;
                if ((i12 & bb.c.g.f32954lc) != 0) {
                    i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
                }
                i37 = i13 & 16384;
                if (i37 != 0) {
                    i34 |= 24576;
                } else if ((i12 & 57344) == 0) {
                    i34 |= pVarF.s(qVar) ? 16384 : 8192;
                }
                if ((i14 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i41 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                        } else {
                            qVarB = qVar;
                        }
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        iVar2 = iVarA;
                        gVar3 = gVar2;
                        z16 = z13;
                        a0Var2 = solidColor;
                        z17 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z18 = z15;
                    } else {
                        if (i41 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                        } else {
                            qVarB = qVar;
                        }
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        iVar2 = iVarA;
                        gVar3 = gVar2;
                        z16 = z13;
                        a0Var2 = solidColor;
                        z17 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z18 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
                    }
                    ImeOptions imeOptionsH2 = keyboardOptions2.h(z18);
                    boolean z24 = !z18;
                    if (z18) {
                        i39 = 1;
                    } else {
                        i39 = i38;
                    }
                    int i47 = i14 & 14;
                    pVarF.T(511388516);
                    zS = pVarF.s(value) | pVarF.s(onValueChange);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue it) {
                                f0.p(it, "it");
                                if (f0.g(value, it)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU2);
                    } else {
                        objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue it) {
                                f0.p(it, "it");
                                if (f0.g(value, it)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    yh.l lVar6 = (yh.l) objU2;
                    int i48 = i14;
                    int i49 = i34 << 12;
                    int i410 = i47 | (i48 & bb.c.b.f30796me) | ((i48 >> 6) & bb.c.g.f32954lc) | (i49 & 57344) | (i49 & 458752) | (3670016 & i49) | (i49 & 29360128);
                    int i411 = i48 >> 3;
                    pVar2 = pVarF;
                    boolean z25 = z18;
                    KeyboardOptions keyboardOptions5 = keyboardOptions2;
                    CoreTextFieldKt.a(value, lVar6, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z24, i39, imeOptionsH2, iVar2, z16, z17, qVarB, pVar2, i410, ((i48 >> 18) & 112) | (i411 & bb.c.b.f30796me) | (i411 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z19 = z16;
                    z20 = z17;
                    textStyle3 = textStyle2;
                    iVar3 = iVar2;
                    z21 = z25;
                    i40 = i38;
                    m0Var2 = m0VarA;
                    lVar4 = lVar3;
                    gVar4 = gVar3;
                    a0Var3 = a0Var2;
                    keyboardOptions3 = keyboardOptions5;
                    qVar2 = qVarB;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i41 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                        } else {
                            qVarB = qVar;
                        }
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        iVar2 = iVarA;
                        gVar3 = gVar2;
                        z16 = z13;
                        a0Var2 = solidColor;
                        z17 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z18 = z15;
                    } else {
                        if (i41 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                        } else {
                            qVarB = qVar;
                        }
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        iVar2 = iVarA;
                        gVar3 = gVar2;
                        z16 = z13;
                        a0Var2 = solidColor;
                        z17 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z18 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
                    }
                    ImeOptions imeOptionsH3 = keyboardOptions2.h(z18);
                    boolean z26 = !z18;
                    if (z18) {
                        i39 = 1;
                    } else {
                        i39 = i38;
                    }
                    int i412 = i14 & 14;
                    pVarF.T(511388516);
                    zS = pVarF.s(value) | pVarF.s(onValueChange);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue it) {
                                f0.p(it, "it");
                                if (f0.g(value, it)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU2);
                    } else {
                        objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue it) {
                                f0.p(it, "it");
                                if (f0.g(value, it)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    yh.l lVar7 = (yh.l) objU2;
                    int i413 = i14;
                    int i414 = i34 << 12;
                    int i415 = i412 | (i413 & bb.c.b.f30796me) | ((i413 >> 6) & bb.c.g.f32954lc) | (i414 & 57344) | (i414 & 458752) | (3670016 & i414) | (i414 & 29360128);
                    int i416 = i413 >> 3;
                    pVar2 = pVarF;
                    boolean z27 = z18;
                    KeyboardOptions keyboardOptions6 = keyboardOptions2;
                    CoreTextFieldKt.a(value, lVar7, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z26, i39, imeOptionsH3, iVar2, z16, z17, qVarB, pVar2, i415, ((i413 >> 18) & 112) | (i416 & bb.c.b.f30796me) | (i416 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z19 = z16;
                    z20 = z17;
                    textStyle3 = textStyle2;
                    iVar3 = iVar2;
                    z21 = z27;
                    i40 = i38;
                    m0Var2 = m0VarA;
                    lVar4 = lVar3;
                    gVar4 = gVar3;
                    a0Var3 = a0Var2;
                    keyboardOptions3 = keyboardOptions6;
                    qVar2 = qVarB;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i417) {
                        BasicTextFieldKt.a(value, onValueChange, nVar4, z19, z20, textStyle3, keyboardOptions3, iVar3, z21, i40, m0Var2, lVar4, gVar4, a0Var3, qVar2, pVar3, i11 | 1, i12, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= bb.c.d.f31193dj;
            i17 = i13 & 16;
            if (i17 != 0) {
                i14 |= 24576;
            } else if ((i11 & 57344) == 0) {
                if (pVarF.u(z11)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i11 & 458752) == 0) {
                if (pVarF.s(textStyle)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i14 |= i20;
            }
            i21 = i13 & 64;
            if (i21 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (pVarF.s(keyboardOptions)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i14 |= i22;
            }
            i23 = i13 & 128;
            if (i23 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (pVarF.s(iVar)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i14 |= i24;
            }
            i25 = i13 & 256;
            if (i25 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (pVarF.u(z12)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i14 |= i26;
            }
            i27 = i13 & 512;
            if (i27 != 0) {
                i14 |= com.google.android.exoplayer2.j.G;
            } else if ((i11 & 1879048192) == 0) {
                if (pVarF.y(i10)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i14 |= i28;
            }
            i29 = i13 & 1024;
            if (i29 != 0) {
                i30 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (pVarF.s(m0Var)) {
                    i31 = 4;
                } else {
                    i31 = 2;
                }
                i30 = i12 | i31;
            } else {
                i30 = i12;
            }
            i32 = i13 & 2048;
            if (i32 != 0) {
                i30 |= 48;
            } else if ((i12 & 112) == 0) {
                if (pVarF.s(lVar)) {
                    i33 = 32;
                } else {
                    i33 = 16;
                }
                i30 |= i33;
            }
            i34 = i30;
            i35 = i13 & 4096;
            if (i35 != 0) {
                if ((i12 & bb.c.b.f30796me) == 0) {
                    if (pVarF.s(gVar)) {
                        i36 = 256;
                    } else {
                        i36 = 128;
                    }
                    i34 |= i36;
                }
                if ((i12 & bb.c.g.f32954lc) != 0) {
                    i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
                }
                i37 = i13 & 16384;
                if (i37 != 0) {
                    i34 |= 24576;
                } else if ((i12 & 57344) == 0) {
                    i34 |= pVarF.s(qVar) ? 16384 : 8192;
                }
                if ((i14 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i41 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                        } else {
                            qVarB = qVar;
                        }
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        iVar2 = iVarA;
                        gVar3 = gVar2;
                        z16 = z13;
                        a0Var2 = solidColor;
                        z17 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z18 = z15;
                    } else {
                        if (i41 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                        } else {
                            qVarB = qVar;
                        }
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        iVar2 = iVarA;
                        gVar3 = gVar2;
                        z16 = z13;
                        a0Var2 = solidColor;
                        z17 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z18 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
                    }
                    ImeOptions imeOptionsH4 = keyboardOptions2.h(z18);
                    boolean z28 = !z18;
                    if (z18) {
                        i39 = 1;
                    } else {
                        i39 = i38;
                    }
                    int i417 = i14 & 14;
                    pVarF.T(511388516);
                    zS = pVarF.s(value) | pVarF.s(onValueChange);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue it) {
                                f0.p(it, "it");
                                if (f0.g(value, it)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU2);
                    } else {
                        objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue it) {
                                f0.p(it, "it");
                                if (f0.g(value, it)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    yh.l lVar8 = (yh.l) objU2;
                    int i418 = i14;
                    int i419 = i34 << 12;
                    int i4110 = i417 | (i418 & bb.c.b.f30796me) | ((i418 >> 6) & bb.c.g.f32954lc) | (i419 & 57344) | (i419 & 458752) | (3670016 & i419) | (i419 & 29360128);
                    int i4111 = i418 >> 3;
                    pVar2 = pVarF;
                    boolean z29 = z18;
                    KeyboardOptions keyboardOptions7 = keyboardOptions2;
                    CoreTextFieldKt.a(value, lVar8, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z28, i39, imeOptionsH4, iVar2, z16, z17, qVarB, pVar2, i4110, ((i418 >> 18) & 112) | (i4111 & bb.c.b.f30796me) | (i4111 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z19 = z16;
                    z20 = z17;
                    textStyle3 = textStyle2;
                    iVar3 = iVar2;
                    z21 = z29;
                    i40 = i38;
                    m0Var2 = m0VarA;
                    lVar4 = lVar3;
                    gVar4 = gVar3;
                    a0Var3 = a0Var2;
                    keyboardOptions3 = keyboardOptions7;
                    qVar2 = qVarB;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i41 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                        } else {
                            qVarB = qVar;
                        }
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        iVar2 = iVarA;
                        gVar3 = gVar2;
                        z16 = z13;
                        a0Var2 = solidColor;
                        z17 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z18 = z15;
                    } else {
                        if (i41 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                        } else {
                            qVarB = qVar;
                        }
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        iVar2 = iVarA;
                        gVar3 = gVar2;
                        z16 = z13;
                        a0Var2 = solidColor;
                        z17 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z18 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
                    }
                    ImeOptions imeOptionsH5 = keyboardOptions2.h(z18);
                    boolean z210 = !z18;
                    if (z18) {
                        i39 = 1;
                    } else {
                        i39 = i38;
                    }
                    int i4112 = i14 & 14;
                    pVarF.T(511388516);
                    zS = pVarF.s(value) | pVarF.s(onValueChange);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue it) {
                                f0.p(it, "it");
                                if (f0.g(value, it)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU2);
                    } else {
                        objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue it) {
                                f0.p(it, "it");
                                if (f0.g(value, it)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    yh.l lVar9 = (yh.l) objU2;
                    int i4113 = i14;
                    int i4114 = i34 << 12;
                    int i4115 = i4112 | (i4113 & bb.c.b.f30796me) | ((i4113 >> 6) & bb.c.g.f32954lc) | (i4114 & 57344) | (i4114 & 458752) | (3670016 & i4114) | (i4114 & 29360128);
                    int i4116 = i4113 >> 3;
                    pVar2 = pVarF;
                    boolean z211 = z18;
                    KeyboardOptions keyboardOptions8 = keyboardOptions2;
                    CoreTextFieldKt.a(value, lVar9, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z210, i39, imeOptionsH5, iVar2, z16, z17, qVarB, pVar2, i4115, ((i4113 >> 18) & 112) | (i4116 & bb.c.b.f30796me) | (i4116 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z19 = z16;
                    z20 = z17;
                    textStyle3 = textStyle2;
                    iVar3 = iVar2;
                    z21 = z211;
                    i40 = i38;
                    m0Var2 = m0VarA;
                    lVar4 = lVar3;
                    gVar4 = gVar3;
                    a0Var3 = a0Var2;
                    keyboardOptions3 = keyboardOptions8;
                    qVar2 = qVarB;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i4117) {
                        BasicTextFieldKt.a(value, onValueChange, nVar4, z19, z20, textStyle3, keyboardOptions3, iVar3, z21, i40, m0Var2, lVar4, gVar4, a0Var3, qVar2, pVar3, i11 | 1, i12, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i34 |= bb.c.b.f30966u4;
            if ((i12 & bb.c.g.f32954lc) != 0) {
                i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
            }
            i37 = i13 & 16384;
            if (i37 != 0) {
                i34 |= 24576;
            } else if ((i12 & 57344) == 0) {
                i34 |= pVarF.s(qVar) ? 16384 : 8192;
            }
            if ((i14 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i41 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                    } else {
                        qVarB = qVar;
                    }
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    iVar2 = iVarA;
                    gVar3 = gVar2;
                    z16 = z13;
                    a0Var2 = solidColor;
                    z17 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z18 = z15;
                } else {
                    if (i41 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                    } else {
                        qVarB = qVar;
                    }
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    iVar2 = iVarA;
                    gVar3 = gVar2;
                    z16 = z13;
                    a0Var2 = solidColor;
                    z17 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z18 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
                }
                ImeOptions imeOptionsH6 = keyboardOptions2.h(z18);
                boolean z212 = !z18;
                if (z18) {
                    i39 = 1;
                } else {
                    i39 = i38;
                }
                int i4117 = i14 & 14;
                pVarF.T(511388516);
                zS = pVarF.s(value) | pVarF.s(onValueChange);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue it) {
                            f0.p(it, "it");
                            if (f0.g(value, it)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU2);
                } else {
                    objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue it) {
                            f0.p(it, "it");
                            if (f0.g(value, it)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU2);
                }
                pVarF.c0();
                yh.l lVar10 = (yh.l) objU2;
                int i4118 = i14;
                int i4119 = i34 << 12;
                int i41110 = i4117 | (i4118 & bb.c.b.f30796me) | ((i4118 >> 6) & bb.c.g.f32954lc) | (i4119 & 57344) | (i4119 & 458752) | (3670016 & i4119) | (i4119 & 29360128);
                int i41111 = i4118 >> 3;
                pVar2 = pVarF;
                boolean z213 = z18;
                KeyboardOptions keyboardOptions9 = keyboardOptions2;
                CoreTextFieldKt.a(value, lVar10, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z212, i39, imeOptionsH6, iVar2, z16, z17, qVarB, pVar2, i41110, ((i4118 >> 18) & 112) | (i41111 & bb.c.b.f30796me) | (i41111 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z19 = z16;
                z20 = z17;
                textStyle3 = textStyle2;
                iVar3 = iVar2;
                z21 = z213;
                i40 = i38;
                m0Var2 = m0VarA;
                lVar4 = lVar3;
                gVar4 = gVar3;
                a0Var3 = a0Var2;
                keyboardOptions3 = keyboardOptions9;
                qVar2 = qVarB;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i41 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                    } else {
                        qVarB = qVar;
                    }
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    iVar2 = iVarA;
                    gVar3 = gVar2;
                    z16 = z13;
                    a0Var2 = solidColor;
                    z17 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z18 = z15;
                } else {
                    if (i41 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                    } else {
                        qVarB = qVar;
                    }
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    iVar2 = iVarA;
                    gVar3 = gVar2;
                    z16 = z13;
                    a0Var2 = solidColor;
                    z17 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z18 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
                }
                ImeOptions imeOptionsH7 = keyboardOptions2.h(z18);
                boolean z214 = !z18;
                if (z18) {
                    i39 = 1;
                } else {
                    i39 = i38;
                }
                int i41112 = i14 & 14;
                pVarF.T(511388516);
                zS = pVarF.s(value) | pVarF.s(onValueChange);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue it) {
                            f0.p(it, "it");
                            if (f0.g(value, it)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU2);
                } else {
                    objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue it) {
                            f0.p(it, "it");
                            if (f0.g(value, it)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU2);
                }
                pVarF.c0();
                yh.l lVar11 = (yh.l) objU2;
                int i41113 = i14;
                int i41114 = i34 << 12;
                int i41115 = i41112 | (i41113 & bb.c.b.f30796me) | ((i41113 >> 6) & bb.c.g.f32954lc) | (i41114 & 57344) | (i41114 & 458752) | (3670016 & i41114) | (i41114 & 29360128);
                int i41116 = i41113 >> 3;
                pVar2 = pVarF;
                boolean z215 = z18;
                KeyboardOptions keyboardOptions10 = keyboardOptions2;
                CoreTextFieldKt.a(value, lVar11, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z214, i39, imeOptionsH7, iVar2, z16, z17, qVarB, pVar2, i41115, ((i41113 >> 18) & 112) | (i41116 & bb.c.b.f30796me) | (i41116 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z19 = z16;
                z20 = z17;
                textStyle3 = textStyle2;
                iVar3 = iVar2;
                z21 = z215;
                i40 = i38;
                m0Var2 = m0VarA;
                lVar4 = lVar3;
                gVar4 = gVar3;
                a0Var3 = a0Var2;
                keyboardOptions3 = keyboardOptions10;
                qVar2 = qVarB;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i41117) {
                    BasicTextFieldKt.a(value, onValueChange, nVar4, z19, z20, textStyle3, keyboardOptions3, iVar3, z21, i40, m0Var2, lVar4, gVar4, a0Var3, qVar2, pVar3, i11 | 1, i12, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= bb.c.b.f30966u4;
        i15 = i13 & 8;
        if (i15 != 0) {
            if ((i11 & bb.c.g.f32954lc) == 0) {
                if (pVarF.u(z10)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            i17 = i13 & 16;
            if (i17 != 0) {
                i14 |= 24576;
            } else if ((i11 & 57344) == 0) {
                if (pVarF.u(z11)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i11 & 458752) == 0) {
                if (pVarF.s(textStyle)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i14 |= i20;
            }
            i21 = i13 & 64;
            if (i21 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (pVarF.s(keyboardOptions)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i14 |= i22;
            }
            i23 = i13 & 128;
            if (i23 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (pVarF.s(iVar)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i14 |= i24;
            }
            i25 = i13 & 256;
            if (i25 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (pVarF.u(z12)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i14 |= i26;
            }
            i27 = i13 & 512;
            if (i27 != 0) {
                i14 |= com.google.android.exoplayer2.j.G;
            } else if ((i11 & 1879048192) == 0) {
                if (pVarF.y(i10)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i14 |= i28;
            }
            i29 = i13 & 1024;
            if (i29 != 0) {
                i30 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (pVarF.s(m0Var)) {
                    i31 = 4;
                } else {
                    i31 = 2;
                }
                i30 = i12 | i31;
            } else {
                i30 = i12;
            }
            i32 = i13 & 2048;
            if (i32 != 0) {
                i30 |= 48;
            } else if ((i12 & 112) == 0) {
                if (pVarF.s(lVar)) {
                    i33 = 32;
                } else {
                    i33 = 16;
                }
                i30 |= i33;
            }
            i34 = i30;
            i35 = i13 & 4096;
            if (i35 != 0) {
                if ((i12 & bb.c.b.f30796me) == 0) {
                    if (pVarF.s(gVar)) {
                        i36 = 256;
                    } else {
                        i36 = 128;
                    }
                    i34 |= i36;
                }
                if ((i12 & bb.c.g.f32954lc) != 0) {
                    i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
                }
                i37 = i13 & 16384;
                if (i37 != 0) {
                    i34 |= 24576;
                } else if ((i12 & 57344) == 0) {
                    i34 |= pVarF.s(qVar) ? 16384 : 8192;
                }
                if ((i14 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i41 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                        } else {
                            qVarB = qVar;
                        }
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        iVar2 = iVarA;
                        gVar3 = gVar2;
                        z16 = z13;
                        a0Var2 = solidColor;
                        z17 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z18 = z15;
                    } else {
                        if (i41 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                        } else {
                            qVarB = qVar;
                        }
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        iVar2 = iVarA;
                        gVar3 = gVar2;
                        z16 = z13;
                        a0Var2 = solidColor;
                        z17 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z18 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
                    }
                    ImeOptions imeOptionsH8 = keyboardOptions2.h(z18);
                    boolean z216 = !z18;
                    if (z18) {
                        i39 = 1;
                    } else {
                        i39 = i38;
                    }
                    int i41117 = i14 & 14;
                    pVarF.T(511388516);
                    zS = pVarF.s(value) | pVarF.s(onValueChange);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue it) {
                                f0.p(it, "it");
                                if (f0.g(value, it)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU2);
                    } else {
                        objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue it) {
                                f0.p(it, "it");
                                if (f0.g(value, it)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    yh.l lVar12 = (yh.l) objU2;
                    int i41118 = i14;
                    int i41119 = i34 << 12;
                    int i411110 = i41117 | (i41118 & bb.c.b.f30796me) | ((i41118 >> 6) & bb.c.g.f32954lc) | (i41119 & 57344) | (i41119 & 458752) | (3670016 & i41119) | (i41119 & 29360128);
                    int i411111 = i41118 >> 3;
                    pVar2 = pVarF;
                    boolean z217 = z18;
                    KeyboardOptions keyboardOptions11 = keyboardOptions2;
                    CoreTextFieldKt.a(value, lVar12, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z216, i39, imeOptionsH8, iVar2, z16, z17, qVarB, pVar2, i411110, ((i41118 >> 18) & 112) | (i411111 & bb.c.b.f30796me) | (i411111 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z19 = z16;
                    z20 = z17;
                    textStyle3 = textStyle2;
                    iVar3 = iVar2;
                    z21 = z217;
                    i40 = i38;
                    m0Var2 = m0VarA;
                    lVar4 = lVar3;
                    gVar4 = gVar3;
                    a0Var3 = a0Var2;
                    keyboardOptions3 = keyboardOptions11;
                    qVar2 = qVarB;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i41 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                        } else {
                            qVarB = qVar;
                        }
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        iVar2 = iVarA;
                        gVar3 = gVar2;
                        z16 = z13;
                        a0Var2 = solidColor;
                        z17 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z18 = z15;
                    } else {
                        if (i41 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i38 = Integer.MAX_VALUE;
                        } else {
                            i38 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                        } else {
                            qVarB = qVar;
                        }
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        iVar2 = iVarA;
                        gVar3 = gVar2;
                        z16 = z13;
                        a0Var2 = solidColor;
                        z17 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z18 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
                    }
                    ImeOptions imeOptionsH9 = keyboardOptions2.h(z18);
                    boolean z218 = !z18;
                    if (z18) {
                        i39 = 1;
                    } else {
                        i39 = i38;
                    }
                    int i411112 = i14 & 14;
                    pVarF.T(511388516);
                    zS = pVarF.s(value) | pVarF.s(onValueChange);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue it) {
                                f0.p(it, "it");
                                if (f0.g(value, it)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU2);
                    } else {
                        objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue it) {
                                f0.p(it, "it");
                                if (f0.g(value, it)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    yh.l lVar13 = (yh.l) objU2;
                    int i411113 = i14;
                    int i411114 = i34 << 12;
                    int i411115 = i411112 | (i411113 & bb.c.b.f30796me) | ((i411113 >> 6) & bb.c.g.f32954lc) | (i411114 & 57344) | (i411114 & 458752) | (3670016 & i411114) | (i411114 & 29360128);
                    int i411116 = i411113 >> 3;
                    pVar2 = pVarF;
                    boolean z219 = z18;
                    KeyboardOptions keyboardOptions12 = keyboardOptions2;
                    CoreTextFieldKt.a(value, lVar13, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z218, i39, imeOptionsH9, iVar2, z16, z17, qVarB, pVar2, i411115, ((i411113 >> 18) & 112) | (i411116 & bb.c.b.f30796me) | (i411116 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z19 = z16;
                    z20 = z17;
                    textStyle3 = textStyle2;
                    iVar3 = iVar2;
                    z21 = z219;
                    i40 = i38;
                    m0Var2 = m0VarA;
                    lVar4 = lVar3;
                    gVar4 = gVar3;
                    a0Var3 = a0Var2;
                    keyboardOptions3 = keyboardOptions12;
                    qVar2 = qVarB;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i411117) {
                        BasicTextFieldKt.a(value, onValueChange, nVar4, z19, z20, textStyle3, keyboardOptions3, iVar3, z21, i40, m0Var2, lVar4, gVar4, a0Var3, qVar2, pVar3, i11 | 1, i12, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i34 |= bb.c.b.f30966u4;
            if ((i12 & bb.c.g.f32954lc) != 0) {
                i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
            }
            i37 = i13 & 16384;
            if (i37 != 0) {
                i34 |= 24576;
            } else if ((i12 & 57344) == 0) {
                i34 |= pVarF.s(qVar) ? 16384 : 8192;
            }
            if ((i14 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i41 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                    } else {
                        qVarB = qVar;
                    }
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    iVar2 = iVarA;
                    gVar3 = gVar2;
                    z16 = z13;
                    a0Var2 = solidColor;
                    z17 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z18 = z15;
                } else {
                    if (i41 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                    } else {
                        qVarB = qVar;
                    }
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    iVar2 = iVarA;
                    gVar3 = gVar2;
                    z16 = z13;
                    a0Var2 = solidColor;
                    z17 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z18 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
                }
                ImeOptions imeOptionsH10 = keyboardOptions2.h(z18);
                boolean z2110 = !z18;
                if (z18) {
                    i39 = 1;
                } else {
                    i39 = i38;
                }
                int i411117 = i14 & 14;
                pVarF.T(511388516);
                zS = pVarF.s(value) | pVarF.s(onValueChange);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue it) {
                            f0.p(it, "it");
                            if (f0.g(value, it)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU2);
                } else {
                    objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue it) {
                            f0.p(it, "it");
                            if (f0.g(value, it)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU2);
                }
                pVarF.c0();
                yh.l lVar14 = (yh.l) objU2;
                int i411118 = i14;
                int i411119 = i34 << 12;
                int i4111110 = i411117 | (i411118 & bb.c.b.f30796me) | ((i411118 >> 6) & bb.c.g.f32954lc) | (i411119 & 57344) | (i411119 & 458752) | (3670016 & i411119) | (i411119 & 29360128);
                int i4111111 = i411118 >> 3;
                pVar2 = pVarF;
                boolean z2111 = z18;
                KeyboardOptions keyboardOptions13 = keyboardOptions2;
                CoreTextFieldKt.a(value, lVar14, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z2110, i39, imeOptionsH10, iVar2, z16, z17, qVarB, pVar2, i4111110, ((i411118 >> 18) & 112) | (i4111111 & bb.c.b.f30796me) | (i4111111 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z19 = z16;
                z20 = z17;
                textStyle3 = textStyle2;
                iVar3 = iVar2;
                z21 = z2111;
                i40 = i38;
                m0Var2 = m0VarA;
                lVar4 = lVar3;
                gVar4 = gVar3;
                a0Var3 = a0Var2;
                keyboardOptions3 = keyboardOptions13;
                qVar2 = qVarB;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i41 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                    } else {
                        qVarB = qVar;
                    }
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    iVar2 = iVarA;
                    gVar3 = gVar2;
                    z16 = z13;
                    a0Var2 = solidColor;
                    z17 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z18 = z15;
                } else {
                    if (i41 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                    } else {
                        qVarB = qVar;
                    }
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    iVar2 = iVarA;
                    gVar3 = gVar2;
                    z16 = z13;
                    a0Var2 = solidColor;
                    z17 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z18 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
                }
                ImeOptions imeOptionsH11 = keyboardOptions2.h(z18);
                boolean z2112 = !z18;
                if (z18) {
                    i39 = 1;
                } else {
                    i39 = i38;
                }
                int i4111112 = i14 & 14;
                pVarF.T(511388516);
                zS = pVarF.s(value) | pVarF.s(onValueChange);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue it) {
                            f0.p(it, "it");
                            if (f0.g(value, it)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU2);
                } else {
                    objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue it) {
                            f0.p(it, "it");
                            if (f0.g(value, it)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU2);
                }
                pVarF.c0();
                yh.l lVar15 = (yh.l) objU2;
                int i4111113 = i14;
                int i4111114 = i34 << 12;
                int i4111115 = i4111112 | (i4111113 & bb.c.b.f30796me) | ((i4111113 >> 6) & bb.c.g.f32954lc) | (i4111114 & 57344) | (i4111114 & 458752) | (3670016 & i4111114) | (i4111114 & 29360128);
                int i4111116 = i4111113 >> 3;
                pVar2 = pVarF;
                boolean z2113 = z18;
                KeyboardOptions keyboardOptions14 = keyboardOptions2;
                CoreTextFieldKt.a(value, lVar15, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z2112, i39, imeOptionsH11, iVar2, z16, z17, qVarB, pVar2, i4111115, ((i4111113 >> 18) & 112) | (i4111116 & bb.c.b.f30796me) | (i4111116 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z19 = z16;
                z20 = z17;
                textStyle3 = textStyle2;
                iVar3 = iVar2;
                z21 = z2113;
                i40 = i38;
                m0Var2 = m0VarA;
                lVar4 = lVar3;
                gVar4 = gVar3;
                a0Var3 = a0Var2;
                keyboardOptions3 = keyboardOptions14;
                qVar2 = qVarB;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i4111117) {
                    BasicTextFieldKt.a(value, onValueChange, nVar4, z19, z20, textStyle3, keyboardOptions3, iVar3, z21, i40, m0Var2, lVar4, gVar4, a0Var3, qVar2, pVar3, i11 | 1, i12, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= bb.c.d.f31193dj;
        i17 = i13 & 16;
        if (i17 != 0) {
            i14 |= 24576;
        } else if ((i11 & 57344) == 0) {
            if (pVarF.u(z11)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i14 |= i18;
        }
        i19 = i13 & 32;
        if (i19 != 0) {
            i14 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((i11 & 458752) == 0) {
            if (pVarF.s(textStyle)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i14 |= i20;
        }
        i21 = i13 & 64;
        if (i21 != 0) {
            i14 |= 1572864;
        } else if ((i11 & 3670016) == 0) {
            if (pVarF.s(keyboardOptions)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i14 |= i22;
        }
        i23 = i13 & 128;
        if (i23 != 0) {
            i14 |= 12582912;
        } else if ((i11 & 29360128) == 0) {
            if (pVarF.s(iVar)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i14 |= i24;
        }
        i25 = i13 & 256;
        if (i25 != 0) {
            i14 |= 100663296;
        } else if ((i11 & 234881024) == 0) {
            if (pVarF.u(z12)) {
                i26 = 67108864;
            } else {
                i26 = 33554432;
            }
            i14 |= i26;
        }
        i27 = i13 & 512;
        if (i27 != 0) {
            i14 |= com.google.android.exoplayer2.j.G;
        } else if ((i11 & 1879048192) == 0) {
            if (pVarF.y(i10)) {
                i28 = 536870912;
            } else {
                i28 = 268435456;
            }
            i14 |= i28;
        }
        i29 = i13 & 1024;
        if (i29 != 0) {
            i30 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            if (pVarF.s(m0Var)) {
                i31 = 4;
            } else {
                i31 = 2;
            }
            i30 = i12 | i31;
        } else {
            i30 = i12;
        }
        i32 = i13 & 2048;
        if (i32 != 0) {
            i30 |= 48;
        } else if ((i12 & 112) == 0) {
            if (pVarF.s(lVar)) {
                i33 = 32;
            } else {
                i33 = 16;
            }
            i30 |= i33;
        }
        i34 = i30;
        i35 = i13 & 4096;
        if (i35 != 0) {
            if ((i12 & bb.c.b.f30796me) == 0) {
                if (pVarF.s(gVar)) {
                    i36 = 256;
                } else {
                    i36 = 128;
                }
                i34 |= i36;
            }
            if ((i12 & bb.c.g.f32954lc) != 0) {
                i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
            }
            i37 = i13 & 16384;
            if (i37 != 0) {
                i34 |= 24576;
            } else if ((i12 & 57344) == 0) {
                i34 |= pVarF.s(qVar) ? 16384 : 8192;
            }
            if ((i14 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i41 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                    } else {
                        qVarB = qVar;
                    }
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    iVar2 = iVarA;
                    gVar3 = gVar2;
                    z16 = z13;
                    a0Var2 = solidColor;
                    z17 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z18 = z15;
                } else {
                    if (i41 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                    } else {
                        qVarB = qVar;
                    }
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    iVar2 = iVarA;
                    gVar3 = gVar2;
                    z16 = z13;
                    a0Var2 = solidColor;
                    z17 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z18 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
                }
                ImeOptions imeOptionsH12 = keyboardOptions2.h(z18);
                boolean z2114 = !z18;
                if (z18) {
                    i39 = 1;
                } else {
                    i39 = i38;
                }
                int i4111117 = i14 & 14;
                pVarF.T(511388516);
                zS = pVarF.s(value) | pVarF.s(onValueChange);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue it) {
                            f0.p(it, "it");
                            if (f0.g(value, it)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU2);
                } else {
                    objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue it) {
                            f0.p(it, "it");
                            if (f0.g(value, it)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU2);
                }
                pVarF.c0();
                yh.l lVar16 = (yh.l) objU2;
                int i4111118 = i14;
                int i4111119 = i34 << 12;
                int i41111110 = i4111117 | (i4111118 & bb.c.b.f30796me) | ((i4111118 >> 6) & bb.c.g.f32954lc) | (i4111119 & 57344) | (i4111119 & 458752) | (3670016 & i4111119) | (i4111119 & 29360128);
                int i41111111 = i4111118 >> 3;
                pVar2 = pVarF;
                boolean z2115 = z18;
                KeyboardOptions keyboardOptions15 = keyboardOptions2;
                CoreTextFieldKt.a(value, lVar16, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z2114, i39, imeOptionsH12, iVar2, z16, z17, qVarB, pVar2, i41111110, ((i4111118 >> 18) & 112) | (i41111111 & bb.c.b.f30796me) | (i41111111 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z19 = z16;
                z20 = z17;
                textStyle3 = textStyle2;
                iVar3 = iVar2;
                z21 = z2115;
                i40 = i38;
                m0Var2 = m0VarA;
                lVar4 = lVar3;
                gVar4 = gVar3;
                a0Var3 = a0Var2;
                keyboardOptions3 = keyboardOptions15;
                qVar2 = qVarB;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i41 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                    } else {
                        qVarB = qVar;
                    }
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    iVar2 = iVarA;
                    gVar3 = gVar2;
                    z16 = z13;
                    a0Var2 = solidColor;
                    z17 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z18 = z15;
                } else {
                    if (i41 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i38 = Integer.MAX_VALUE;
                    } else {
                        i38 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                    } else {
                        qVarB = qVar;
                    }
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    iVar2 = iVarA;
                    gVar3 = gVar2;
                    z16 = z13;
                    a0Var2 = solidColor;
                    z17 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z18 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
                }
                ImeOptions imeOptionsH13 = keyboardOptions2.h(z18);
                boolean z2116 = !z18;
                if (z18) {
                    i39 = 1;
                } else {
                    i39 = i38;
                }
                int i41111112 = i14 & 14;
                pVarF.T(511388516);
                zS = pVarF.s(value) | pVarF.s(onValueChange);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue it) {
                            f0.p(it, "it");
                            if (f0.g(value, it)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU2);
                } else {
                    objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue it) {
                            f0.p(it, "it");
                            if (f0.g(value, it)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU2);
                }
                pVarF.c0();
                yh.l lVar17 = (yh.l) objU2;
                int i41111113 = i14;
                int i41111114 = i34 << 12;
                int i41111115 = i41111112 | (i41111113 & bb.c.b.f30796me) | ((i41111113 >> 6) & bb.c.g.f32954lc) | (i41111114 & 57344) | (i41111114 & 458752) | (3670016 & i41111114) | (i41111114 & 29360128);
                int i41111116 = i41111113 >> 3;
                pVar2 = pVarF;
                boolean z2117 = z18;
                KeyboardOptions keyboardOptions16 = keyboardOptions2;
                CoreTextFieldKt.a(value, lVar17, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z2116, i39, imeOptionsH13, iVar2, z16, z17, qVarB, pVar2, i41111115, ((i41111113 >> 18) & 112) | (i41111116 & bb.c.b.f30796me) | (i41111116 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z19 = z16;
                z20 = z17;
                textStyle3 = textStyle2;
                iVar3 = iVar2;
                z21 = z2117;
                i40 = i38;
                m0Var2 = m0VarA;
                lVar4 = lVar3;
                gVar4 = gVar3;
                a0Var3 = a0Var2;
                keyboardOptions3 = keyboardOptions16;
                qVar2 = qVarB;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i41111117) {
                    BasicTextFieldKt.a(value, onValueChange, nVar4, z19, z20, textStyle3, keyboardOptions3, iVar3, z21, i40, m0Var2, lVar4, gVar4, a0Var3, qVar2, pVar3, i11 | 1, i12, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i34 |= bb.c.b.f30966u4;
        if ((i12 & bb.c.g.f32954lc) != 0) {
            i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
        }
        i37 = i13 & 16384;
        if (i37 != 0) {
            i34 |= 24576;
        } else if ((i12 & 57344) == 0) {
            i34 |= pVarF.s(qVar) ? 16384 : 8192;
        }
        if ((i14 & 1533916891) != 306783378) {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i41 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i15 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i17 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i19 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle;
                }
                if (i21 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                if (i23 != 0) {
                    iVarA = i.INSTANCE.a();
                } else {
                    iVarA = iVar;
                }
                if (i25 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (i27 != 0) {
                    i38 = Integer.MAX_VALUE;
                } else {
                    i38 = i10;
                }
                if (i29 != 0) {
                    m0VarA = m0.INSTANCE.a();
                } else {
                    m0VarA = m0Var;
                }
                if (i32 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (i35 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                if ((i13 & 8192) != 0) {
                    solidColor = new SolidColor(l0.INSTANCE.a(), null);
                    i34 &= -7169;
                } else {
                    solidColor = a0Var;
                }
                if (i37 != 0) {
                    qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                } else {
                    qVarB = qVar;
                }
                nVar3 = nVar2;
                lVar3 = lVar2;
                iVar2 = iVarA;
                gVar3 = gVar2;
                z16 = z13;
                a0Var2 = solidColor;
                z17 = z14;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                z18 = z15;
            } else {
                if (i41 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i15 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i17 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i19 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle;
                }
                if (i21 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                if (i23 != 0) {
                    iVarA = i.INSTANCE.a();
                } else {
                    iVarA = iVar;
                }
                if (i25 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (i27 != 0) {
                    i38 = Integer.MAX_VALUE;
                } else {
                    i38 = i10;
                }
                if (i29 != 0) {
                    m0VarA = m0.INSTANCE.a();
                } else {
                    m0VarA = m0Var;
                }
                if (i32 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (i35 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                if ((i13 & 8192) != 0) {
                    solidColor = new SolidColor(l0.INSTANCE.a(), null);
                    i34 &= -7169;
                } else {
                    solidColor = a0Var;
                }
                if (i37 != 0) {
                    qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                } else {
                    qVarB = qVar;
                }
                nVar3 = nVar2;
                lVar3 = lVar2;
                iVar2 = iVarA;
                gVar3 = gVar2;
                z16 = z13;
                a0Var2 = solidColor;
                z17 = z14;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                z18 = z15;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
            }
            ImeOptions imeOptionsH14 = keyboardOptions2.h(z18);
            boolean z2118 = !z18;
            if (z18) {
                i39 = 1;
            } else {
                i39 = i38;
            }
            int i41111117 = i14 & 14;
            pVarF.T(511388516);
            zS = pVarF.s(value) | pVarF.s(onValueChange);
            objU2 = pVarF.U();
            if (zS) {
                objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d TextFieldValue it) {
                        f0.p(it, "it");
                        if (f0.g(value, it)) {
                            return;
                        }
                        onValueChange.invoke(it);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                        a(textFieldValue);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU2);
            } else {
                objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d TextFieldValue it) {
                        f0.p(it, "it");
                        if (f0.g(value, it)) {
                            return;
                        }
                        onValueChange.invoke(it);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                        a(textFieldValue);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU2);
            }
            pVarF.c0();
            yh.l lVar18 = (yh.l) objU2;
            int i41111118 = i14;
            int i41111119 = i34 << 12;
            int i411111110 = i41111117 | (i41111118 & bb.c.b.f30796me) | ((i41111118 >> 6) & bb.c.g.f32954lc) | (i41111119 & 57344) | (i41111119 & 458752) | (3670016 & i41111119) | (i41111119 & 29360128);
            int i411111111 = i41111118 >> 3;
            pVar2 = pVarF;
            boolean z2119 = z18;
            KeyboardOptions keyboardOptions17 = keyboardOptions2;
            CoreTextFieldKt.a(value, lVar18, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z2118, i39, imeOptionsH14, iVar2, z16, z17, qVarB, pVar2, i411111110, ((i41111118 >> 18) & 112) | (i411111111 & bb.c.b.f30796me) | (i411111111 & bb.c.g.f32954lc) | (i34 & 57344), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            z19 = z16;
            z20 = z17;
            textStyle3 = textStyle2;
            iVar3 = iVar2;
            z21 = z2119;
            i40 = i38;
            m0Var2 = m0VarA;
            lVar4 = lVar3;
            gVar4 = gVar3;
            a0Var3 = a0Var2;
            keyboardOptions3 = keyboardOptions17;
            qVar2 = qVarB;
        } else {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i41 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i15 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i17 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i19 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle;
                }
                if (i21 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                if (i23 != 0) {
                    iVarA = i.INSTANCE.a();
                } else {
                    iVarA = iVar;
                }
                if (i25 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (i27 != 0) {
                    i38 = Integer.MAX_VALUE;
                } else {
                    i38 = i10;
                }
                if (i29 != 0) {
                    m0VarA = m0.INSTANCE.a();
                } else {
                    m0VarA = m0Var;
                }
                if (i32 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (i35 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                if ((i13 & 8192) != 0) {
                    solidColor = new SolidColor(l0.INSTANCE.a(), null);
                    i34 &= -7169;
                } else {
                    solidColor = a0Var;
                }
                if (i37 != 0) {
                    qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                } else {
                    qVarB = qVar;
                }
                nVar3 = nVar2;
                lVar3 = lVar2;
                iVar2 = iVarA;
                gVar3 = gVar2;
                z16 = z13;
                a0Var2 = solidColor;
                z17 = z14;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                z18 = z15;
            } else {
                if (i41 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i15 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i17 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i19 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle;
                }
                if (i21 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                if (i23 != 0) {
                    iVarA = i.INSTANCE.a();
                } else {
                    iVarA = iVar;
                }
                if (i25 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (i27 != 0) {
                    i38 = Integer.MAX_VALUE;
                } else {
                    i38 = i10;
                }
                if (i29 != 0) {
                    m0VarA = m0.INSTANCE.a();
                } else {
                    m0VarA = m0Var;
                }
                if (i32 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (i35 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                if ((i13 & 8192) != 0) {
                    solidColor = new SolidColor(l0.INSTANCE.a(), null);
                    i34 &= -7169;
                } else {
                    solidColor = a0Var;
                }
                if (i37 != 0) {
                    qVarB = ComposableSingletons$BasicTextFieldKt.f7672a.b();
                } else {
                    qVarB = qVar;
                }
                nVar3 = nVar2;
                lVar3 = lVar2;
                iVar2 = iVarA;
                gVar3 = gVar2;
                z16 = z13;
                a0Var2 = solidColor;
                z17 = z14;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                z18 = z15;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-560482651, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:264)");
            }
            ImeOptions imeOptionsH15 = keyboardOptions2.h(z18);
            boolean z21110 = !z18;
            if (z18) {
                i39 = 1;
            } else {
                i39 = i38;
            }
            int i411111112 = i14 & 14;
            pVarF.T(511388516);
            zS = pVarF.s(value) | pVarF.s(onValueChange);
            objU2 = pVarF.U();
            if (zS) {
                objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d TextFieldValue it) {
                        f0.p(it, "it");
                        if (f0.g(value, it)) {
                            return;
                        }
                        onValueChange.invoke(it);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                        a(textFieldValue);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU2);
            } else {
                objU2 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d TextFieldValue it) {
                        f0.p(it, "it");
                        if (f0.g(value, it)) {
                            return;
                        }
                        onValueChange.invoke(it);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                        a(textFieldValue);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU2);
            }
            pVarF.c0();
            yh.l lVar19 = (yh.l) objU2;
            int i411111113 = i14;
            int i411111114 = i34 << 12;
            int i411111115 = i411111112 | (i411111113 & bb.c.b.f30796me) | ((i411111113 >> 6) & bb.c.g.f32954lc) | (i411111114 & 57344) | (i411111114 & 458752) | (3670016 & i411111114) | (i411111114 & 29360128);
            int i411111116 = i411111113 >> 3;
            pVar2 = pVarF;
            boolean z21111 = z18;
            KeyboardOptions keyboardOptions18 = keyboardOptions2;
            CoreTextFieldKt.a(value, lVar19, nVar3, textStyle2, m0VarA, lVar3, gVar3, a0Var2, z21110, i39, imeOptionsH15, iVar2, z16, z17, qVarB, pVar2, i411111115, ((i411111113 >> 18) & 112) | (i411111116 & bb.c.b.f30796me) | (i411111116 & bb.c.g.f32954lc) | (i34 & 57344), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            z19 = z16;
            z20 = z17;
            textStyle3 = textStyle2;
            iVar3 = iVar2;
            z21 = z21111;
            i40 = i38;
            m0Var2 = m0VarA;
            lVar4 = lVar3;
            gVar4 = gVar3;
            a0Var3 = a0Var2;
            keyboardOptions3 = keyboardOptions18;
            qVar2 = qVarB;
        }
        u1VarH = pVar2.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i411111117) {
                BasicTextFieldKt.a(value, onValueChange, nVar4, z19, z20, textStyle3, keyboardOptions3, iVar3, z21, i40, m0Var2, lVar4, gVar4, a0Var3, qVar2, pVar3, i11 | 1, i12, i13);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                a(pVar3, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0145  */
    /* JADX WARN: Code duplicated, block: B:103:0x0148  */
    /* JADX WARN: Code duplicated, block: B:107:0x0150  */
    /* JADX WARN: Code duplicated, block: B:108:0x0155  */
    /* JADX WARN: Code duplicated, block: B:110:0x015b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0161  */
    /* JADX WARN: Code duplicated, block: B:113:0x0164  */
    /* JADX WARN: Code duplicated, block: B:115:0x0169  */
    /* JADX WARN: Code duplicated, block: B:118:0x016f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0172  */
    /* JADX WARN: Code duplicated, block: B:121:0x0178  */
    /* JADX WARN: Code duplicated, block: B:123:0x017e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0181  */
    /* JADX WARN: Code duplicated, block: B:128:0x018b  */
    /* JADX WARN: Code duplicated, block: B:129:0x018e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0192  */
    /* JADX WARN: Code duplicated, block: B:133:0x019a  */
    /* JADX WARN: Code duplicated, block: B:134:0x019d  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:166:0x0212  */
    /* JADX WARN: Code duplicated, block: B:168:0x021b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x0247  */
    /* JADX WARN: Code duplicated, block: B:177:0x024a  */
    /* JADX WARN: Code duplicated, block: B:179:0x024e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0251  */
    /* JADX WARN: Code duplicated, block: B:182:0x0255  */
    /* JADX WARN: Code duplicated, block: B:183:0x0258  */
    /* JADX WARN: Code duplicated, block: B:185:0x025c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0263  */
    /* JADX WARN: Code duplicated, block: B:188:0x0267  */
    /* JADX WARN: Code duplicated, block: B:189:0x026e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0272  */
    /* JADX WARN: Code duplicated, block: B:192:0x0279  */
    /* JADX WARN: Code duplicated, block: B:194:0x027d  */
    /* JADX WARN: Code duplicated, block: B:195:0x027f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0283  */
    /* JADX WARN: Code duplicated, block: B:198:0x0287  */
    /* JADX WARN: Code duplicated, block: B:200:0x028b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0292  */
    /* JADX WARN: Code duplicated, block: B:203:0x0296  */
    /* JADX WARN: Code duplicated, block: B:204:0x0299  */
    /* JADX WARN: Code duplicated, block: B:206:0x029d  */
    /* JADX WARN: Code duplicated, block: B:208:0x02af  */
    /* JADX WARN: Code duplicated, block: B:210:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:213:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:214:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:216:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:217:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:221:0x0308  */
    /* JADX WARN: Code duplicated, block: B:224:0x0324  */
    /* JADX WARN: Code duplicated, block: B:225:0x0349  */
    /* JADX WARN: Code duplicated, block: B:228:0x0383  */
    /* JADX WARN: Code duplicated, block: B:230:0x0389  */
    /* JADX WARN: Code duplicated, block: B:233:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:235:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:238:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:239:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:242:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:244:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:247:0x044c  */
    /* JADX WARN: Code duplicated, block: B:252:0x0466  */
    /* JADX WARN: Code duplicated, block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00df  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0105  */
    /* JADX WARN: Code duplicated, block: B:83:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x0117  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0125  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:97:0x0130  */
    /* JADX WARN: Code duplicated, block: B:98:0x0137  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final String value, @dl.d final yh.l<? super String, b2> onValueChange, @dl.e androidx.compose.ui.n nVar, boolean z10, boolean z11, @dl.e TextStyle textStyle, @dl.e KeyboardOptions keyboardOptions, @dl.e i iVar, boolean z12, int i10, @dl.e m0 m0Var, @dl.e yh.l<? super TextLayoutResult, b2> lVar, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e androidx.compose.ui.graphics.a0 a0Var, @dl.e yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, ? super androidx.compose.runtime.p, ? super Integer, b2> qVar, @dl.e androidx.compose.runtime.p pVar, final int i11, final int i12, final int i13) {
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
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        androidx.compose.ui.n nVar2;
        boolean z13;
        boolean z14;
        TextStyle textStyleA;
        KeyboardOptions keyboardOptionsA;
        i iVarA;
        boolean z15;
        m0 m0VarA;
        yh.l<? super TextLayoutResult, b2> lVar2;
        androidx.compose.foundation.interaction.g gVar2;
        androidx.compose.ui.graphics.a0 solidColor;
        yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, ? super androidx.compose.runtime.p, ? super Integer, b2> qVarA;
        yh.l<? super TextLayoutResult, b2> lVar3;
        androidx.compose.ui.graphics.a0 a0Var2;
        boolean z16;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        boolean z17;
        androidx.compose.foundation.interaction.g gVar3;
        m0 m0Var2;
        Object objU;
        Object objU2;
        androidx.compose.runtime.p.Companion companion;
        final a1 a1Var;
        final TextFieldValue textFieldValueE;
        boolean zS;
        Object objU3;
        boolean zS2;
        Object objU4;
        final a1 a1Var2;
        int i38;
        boolean zS3;
        Object objU5;
        KeyboardOptions keyboardOptions3;
        boolean z18;
        androidx.compose.ui.n nVar3;
        boolean z19;
        m0 m0Var3;
        androidx.compose.foundation.interaction.g gVar4;
        i iVar2;
        TextStyle textStyle3;
        yh.l<? super TextLayoutResult, b2> lVar4;
        int i39;
        boolean z20;
        u1 u1VarH;
        f0.p(value, "value");
        f0.p(onValueChange, "onValueChange");
        androidx.compose.runtime.p pVarF = pVar.F(-454732590);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i14 = (pVarF.s(value) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 112) == 0) {
            i14 |= pVarF.s(onValueChange) ? 32 : 16;
        }
        int i40 = i13 & 4;
        if (i40 == 0) {
            if ((i11 & bb.c.b.f30796me) == 0) {
                i14 |= pVarF.s(nVar) ? 256 : 128;
            }
            i15 = i13 & 8;
            if (i15 != 0) {
                if ((i11 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.u(z10)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 16;
                if (i17 != 0) {
                    i14 |= 24576;
                } else if ((i11 & 57344) == 0) {
                    if (pVarF.u(z11)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 32;
                if (i19 != 0) {
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i11 & 458752) == 0) {
                    if (pVarF.s(textStyle)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 64;
                if (i21 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (pVarF.s(keyboardOptions)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 128;
                if (i23 != 0) {
                    i14 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (pVarF.s(iVar)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 256;
                if (i25 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 234881024) == 0) {
                    if (pVarF.u(z12)) {
                        i26 = 67108864;
                    } else {
                        i26 = 33554432;
                    }
                    i14 |= i26;
                }
                i27 = i13 & 512;
                if (i27 != 0) {
                    i14 |= com.google.android.exoplayer2.j.G;
                } else if ((i11 & 1879048192) == 0) {
                    if (pVarF.y(i10)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i14 |= i28;
                }
                i29 = i13 & 1024;
                if (i29 != 0) {
                    i30 = i12 | 6;
                } else if ((i12 & 14) == 0) {
                    if (pVarF.s(m0Var)) {
                        i31 = 4;
                    } else {
                        i31 = 2;
                    }
                    i30 = i12 | i31;
                } else {
                    i30 = i12;
                }
                i32 = i13 & 2048;
                if (i32 != 0) {
                    i30 |= 48;
                } else if ((i12 & 112) == 0) {
                    if (pVarF.s(lVar)) {
                        i33 = 32;
                    } else {
                        i33 = 16;
                    }
                    i30 |= i33;
                }
                i34 = i30;
                i35 = i13 & 4096;
                if (i35 != 0) {
                    if ((i12 & bb.c.b.f30796me) == 0) {
                        if (pVarF.s(gVar)) {
                            i36 = 256;
                        } else {
                            i36 = 128;
                        }
                        i34 |= i36;
                    }
                    if ((i12 & bb.c.g.f32954lc) != 0) {
                        i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
                    }
                    i37 = i13 & 16384;
                    if (i37 != 0) {
                        i34 |= 24576;
                    } else if ((i12 & 57344) == 0) {
                        i34 |= pVarF.s(qVar) ? 16384 : 8192;
                    }
                    if ((i14 & 1533916891) != 306783378 && (46811 & i34) == 9362 && pVarF.b()) {
                        pVarF.l();
                        nVar3 = nVar;
                        z20 = z10;
                        z18 = z11;
                        textStyle3 = textStyle;
                        keyboardOptions3 = keyboardOptions;
                        iVar2 = iVar;
                        z19 = z12;
                        i39 = i10;
                        m0Var3 = m0Var;
                        lVar4 = lVar;
                        gVar4 = gVar;
                        a0Var2 = a0Var;
                        qVarA = qVar;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0 || pVarF.o()) {
                            if (i40 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i17 != 0) {
                                z14 = false;
                            } else {
                                z14 = z11;
                            }
                            if (i19 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle;
                            }
                            if (i21 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if (i23 != 0) {
                                iVarA = i.INSTANCE.a();
                            } else {
                                iVarA = iVar;
                            }
                            if (i25 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i27 != 0) {
                                i10 = Integer.MAX_VALUE;
                            } else {
                                i10 = i10;
                            }
                            if (i29 != 0) {
                                m0VarA = m0.INSTANCE.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i32 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if (i35 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar2 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar2 = gVar;
                            }
                            if ((i13 & 8192) != 0) {
                                solidColor = new SolidColor(l0.INSTANCE.a(), null);
                                i34 &= -7169;
                            } else {
                                solidColor = a0Var;
                            }
                            if (i37 != 0) {
                                qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                            } else {
                                qVarA = qVar;
                            }
                            lVar3 = lVar2;
                            a0Var2 = solidColor;
                            z16 = z14;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            gVar3 = gVar2;
                            m0Var2 = m0VarA;
                        } else {
                            pVarF.l();
                            if ((i13 & 8192) != 0) {
                                i34 &= -7169;
                            }
                            nVar2 = nVar;
                            z13 = z10;
                            z16 = z11;
                            textStyle2 = textStyle;
                            keyboardOptions2 = keyboardOptions;
                            iVarA = iVar;
                            z17 = z12;
                            m0Var2 = m0Var;
                            lVar3 = lVar;
                            gVar3 = gVar;
                            a0Var2 = a0Var;
                            qVarA = qVar;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
                        }
                        pVarF.T(-492369756);
                        objU2 = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        boolean z21 = z16;
                        if (objU2 == companion.a()) {
                            a1 a1VarG = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                            pVarF.N(a1VarG);
                            objU2 = a1VarG;
                        }
                        pVarF.c0();
                        a1Var = (a1) objU2;
                        textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
                        pVarF.T(511388516);
                        zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
                        i iVar3 = iVarA;
                        objU3 = pVarF.U();
                        if (zS || objU3 == companion.a()) {
                            objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                public /* bridge */ /* synthetic */ b2 invoke() {
                                    invoke2();
                                    return b2.f124493a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                        return;
                                    }
                                    BasicTextFieldKt.d(a1Var, textFieldValueE);
                                }
                            };
                            pVarF.N(objU3);
                        }
                        pVarF.c0();
                        EffectsKt.k((yh.a) objU3, pVarF, 0);
                        pVarF.T(1157296644);
                        zS2 = pVarF.s(value);
                        objU4 = pVarF.U();
                        if (zS2 || objU4 == companion.a()) {
                            objU4 = h2.g(value, null, 2, null);
                            pVarF.N(objU4);
                        }
                        pVarF.c0();
                        a1Var2 = (a1) objU4;
                        ImeOptions imeOptionsH = keyboardOptions2.h(z17);
                        boolean z22 = !z17;
                        if (z17) {
                            i38 = 1;
                        } else {
                            i38 = i10;
                        }
                        pVarF.T(1618982084);
                        KeyboardOptions keyboardOptions4 = keyboardOptions2;
                        zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
                        objU5 = pVarF.U();
                        if (zS3 || objU5 == companion.a()) {
                            objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                                    f0.p(newTextFieldValueState, "newTextFieldValueState");
                                    BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                                    boolean z23 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                                    BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                                    if (z23) {
                                        onValueChange.invoke(newTextFieldValueState.i());
                                    }
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                    a(textFieldValue);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU5);
                        }
                        pVarF.c0();
                        yh.l lVar5 = (yh.l) objU5;
                        int i41 = i34 << 12;
                        int i42 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i41 & 57344) | (458752 & i41) | (3670016 & i41) | (i41 & 29360128);
                        int i43 = (i14 >> 18) & 112;
                        int i44 = i14 >> 3;
                        CoreTextFieldKt.a(textFieldValueE, lVar5, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z22, i38, imeOptionsH, iVar3, z13, z21, qVarA, pVarF, i42, i43 | (i44 & bb.c.b.f30796me) | (i44 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        keyboardOptions3 = keyboardOptions4;
                        z18 = z21;
                        nVar3 = nVar2;
                        z19 = z17;
                        m0Var3 = m0Var2;
                        gVar4 = gVar3;
                        iVar2 = iVar3;
                        textStyle3 = textStyle2;
                        lVar4 = lVar3;
                        i39 = i10;
                        z20 = z13;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar4 = nVar3;
                    final boolean z23 = z20;
                    final boolean z24 = z18;
                    final TextStyle textStyle4 = textStyle3;
                    final KeyboardOptions keyboardOptions5 = keyboardOptions3;
                    final i iVar4 = iVar2;
                    final boolean z25 = z19;
                    final int i45 = i39;
                    final m0 m0Var4 = m0Var3;
                    final yh.l<? super TextLayoutResult, b2> lVar6 = lVar4;
                    final androidx.compose.foundation.interaction.g gVar5 = gVar4;
                    final androidx.compose.ui.graphics.a0 a0Var3 = a0Var2;
                    final yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, ? super androidx.compose.runtime.p, ? super Integer, b2> qVar2 = qVarA;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i46) {
                            BasicTextFieldKt.b(value, onValueChange, nVar4, z23, z24, textStyle4, keyboardOptions5, iVar4, z25, i45, m0Var4, lVar6, gVar5, a0Var3, qVar2, pVar2, i11 | 1, i12, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i34 |= bb.c.b.f30966u4;
                if ((i12 & bb.c.g.f32954lc) != 0) {
                    i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
                }
                i37 = i13 & 16384;
                if (i37 != 0) {
                    i34 |= 24576;
                } else if ((i12 & 57344) == 0) {
                    i34 |= pVarF.s(qVar) ? 16384 : 8192;
                }
                if ((i14 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i40 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                        } else {
                            qVarA = qVar;
                        }
                        lVar3 = lVar2;
                        a0Var2 = solidColor;
                        z16 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        gVar3 = gVar2;
                        m0Var2 = m0VarA;
                    } else {
                        if (i40 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                        } else {
                            qVarA = qVar;
                        }
                        lVar3 = lVar2;
                        a0Var2 = solidColor;
                        z16 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        gVar3 = gVar2;
                        m0Var2 = m0VarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
                    }
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    boolean z26 = z16;
                    if (objU2 == companion.a()) {
                        a1 a1VarG2 = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                        pVarF.N(a1VarG2);
                        objU2 = a1VarG2;
                    }
                    pVarF.c0();
                    a1Var = (a1) objU2;
                    textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
                    pVarF.T(511388516);
                    zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
                    i iVar5 = iVarA;
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                    return;
                                }
                                BasicTextFieldKt.d(a1Var, textFieldValueE);
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                    return;
                                }
                                BasicTextFieldKt.d(a1Var, textFieldValueE);
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    EffectsKt.k((yh.a) objU3, pVarF, 0);
                    pVarF.T(1157296644);
                    zS2 = pVarF.s(value);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = h2.g(value, null, 2, null);
                        pVarF.N(objU4);
                    } else {
                        objU4 = h2.g(value, null, 2, null);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    a1Var2 = (a1) objU4;
                    ImeOptions imeOptionsH2 = keyboardOptions2.h(z17);
                    boolean z27 = !z17;
                    if (z17) {
                        i38 = 1;
                    } else {
                        i38 = i10;
                    }
                    pVarF.T(1618982084);
                    KeyboardOptions keyboardOptions6 = keyboardOptions2;
                    zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
                    objU5 = pVarF.U();
                    if (zS3) {
                        objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                                f0.p(newTextFieldValueState, "newTextFieldValueState");
                                BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                                boolean z28 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                                BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                                if (z28) {
                                    onValueChange.invoke(newTextFieldValueState.i());
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU5);
                    } else {
                        objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                                f0.p(newTextFieldValueState, "newTextFieldValueState");
                                BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                                boolean z28 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                                BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                                if (z28) {
                                    onValueChange.invoke(newTextFieldValueState.i());
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU5);
                    }
                    pVarF.c0();
                    yh.l lVar7 = (yh.l) objU5;
                    int i46 = i34 << 12;
                    int i47 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i46 & 57344) | (458752 & i46) | (3670016 & i46) | (i46 & 29360128);
                    int i48 = (i14 >> 18) & 112;
                    int i49 = i14 >> 3;
                    CoreTextFieldKt.a(textFieldValueE, lVar7, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z27, i38, imeOptionsH2, iVar5, z13, z26, qVarA, pVarF, i47, i48 | (i49 & bb.c.b.f30796me) | (i49 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    keyboardOptions3 = keyboardOptions6;
                    z18 = z26;
                    nVar3 = nVar2;
                    z19 = z17;
                    m0Var3 = m0Var2;
                    gVar4 = gVar3;
                    iVar2 = iVar5;
                    textStyle3 = textStyle2;
                    lVar4 = lVar3;
                    i39 = i10;
                    z20 = z13;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i40 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                        } else {
                            qVarA = qVar;
                        }
                        lVar3 = lVar2;
                        a0Var2 = solidColor;
                        z16 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        gVar3 = gVar2;
                        m0Var2 = m0VarA;
                    } else {
                        if (i40 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                        } else {
                            qVarA = qVar;
                        }
                        lVar3 = lVar2;
                        a0Var2 = solidColor;
                        z16 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        gVar3 = gVar2;
                        m0Var2 = m0VarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
                    }
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    boolean z28 = z16;
                    if (objU2 == companion.a()) {
                        a1 a1VarG3 = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                        pVarF.N(a1VarG3);
                        objU2 = a1VarG3;
                    }
                    pVarF.c0();
                    a1Var = (a1) objU2;
                    textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
                    pVarF.T(511388516);
                    zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
                    i iVar6 = iVarA;
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                    return;
                                }
                                BasicTextFieldKt.d(a1Var, textFieldValueE);
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                    return;
                                }
                                BasicTextFieldKt.d(a1Var, textFieldValueE);
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    EffectsKt.k((yh.a) objU3, pVarF, 0);
                    pVarF.T(1157296644);
                    zS2 = pVarF.s(value);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = h2.g(value, null, 2, null);
                        pVarF.N(objU4);
                    } else {
                        objU4 = h2.g(value, null, 2, null);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    a1Var2 = (a1) objU4;
                    ImeOptions imeOptionsH3 = keyboardOptions2.h(z17);
                    boolean z29 = !z17;
                    if (z17) {
                        i38 = 1;
                    } else {
                        i38 = i10;
                    }
                    pVarF.T(1618982084);
                    KeyboardOptions keyboardOptions7 = keyboardOptions2;
                    zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
                    objU5 = pVarF.U();
                    if (zS3) {
                        objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                                f0.p(newTextFieldValueState, "newTextFieldValueState");
                                BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                                boolean z210 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                                BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                                if (z210) {
                                    onValueChange.invoke(newTextFieldValueState.i());
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU5);
                    } else {
                        objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                                f0.p(newTextFieldValueState, "newTextFieldValueState");
                                BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                                boolean z210 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                                BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                                if (z210) {
                                    onValueChange.invoke(newTextFieldValueState.i());
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU5);
                    }
                    pVarF.c0();
                    yh.l lVar8 = (yh.l) objU5;
                    int i410 = i34 << 12;
                    int i411 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i410 & 57344) | (458752 & i410) | (3670016 & i410) | (i410 & 29360128);
                    int i412 = (i14 >> 18) & 112;
                    int i413 = i14 >> 3;
                    CoreTextFieldKt.a(textFieldValueE, lVar8, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z29, i38, imeOptionsH3, iVar6, z13, z28, qVarA, pVarF, i411, i412 | (i413 & bb.c.b.f30796me) | (i413 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    keyboardOptions3 = keyboardOptions7;
                    z18 = z28;
                    nVar3 = nVar2;
                    z19 = z17;
                    m0Var3 = m0Var2;
                    gVar4 = gVar3;
                    iVar2 = iVar6;
                    textStyle3 = textStyle2;
                    lVar4 = lVar3;
                    i39 = i10;
                    z20 = z13;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar5 = nVar3;
                final boolean z210 = z20;
                final boolean z211 = z18;
                final TextStyle textStyle5 = textStyle3;
                final KeyboardOptions keyboardOptions8 = keyboardOptions3;
                final i iVar7 = iVar2;
                final boolean z212 = z19;
                final int i414 = i39;
                final m0 m0Var5 = m0Var3;
                final yh.l<? super TextLayoutResult, b2> lVar9 = lVar4;
                final androidx.compose.foundation.interaction.g gVar6 = gVar4;
                final androidx.compose.ui.graphics.a0 a0Var4 = a0Var2;
                final yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, ? super androidx.compose.runtime.p, ? super Integer, b2> qVar3 = qVarA;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i415) {
                        BasicTextFieldKt.b(value, onValueChange, nVar5, z210, z211, textStyle5, keyboardOptions8, iVar7, z212, i414, m0Var5, lVar9, gVar6, a0Var4, qVar3, pVar2, i11 | 1, i12, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= bb.c.d.f31193dj;
            i17 = i13 & 16;
            if (i17 != 0) {
                i14 |= 24576;
            } else if ((i11 & 57344) == 0) {
                if (pVarF.u(z11)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i11 & 458752) == 0) {
                if (pVarF.s(textStyle)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i14 |= i20;
            }
            i21 = i13 & 64;
            if (i21 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (pVarF.s(keyboardOptions)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i14 |= i22;
            }
            i23 = i13 & 128;
            if (i23 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (pVarF.s(iVar)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i14 |= i24;
            }
            i25 = i13 & 256;
            if (i25 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (pVarF.u(z12)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i14 |= i26;
            }
            i27 = i13 & 512;
            if (i27 != 0) {
                i14 |= com.google.android.exoplayer2.j.G;
            } else if ((i11 & 1879048192) == 0) {
                if (pVarF.y(i10)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i14 |= i28;
            }
            i29 = i13 & 1024;
            if (i29 != 0) {
                i30 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (pVarF.s(m0Var)) {
                    i31 = 4;
                } else {
                    i31 = 2;
                }
                i30 = i12 | i31;
            } else {
                i30 = i12;
            }
            i32 = i13 & 2048;
            if (i32 != 0) {
                i30 |= 48;
            } else if ((i12 & 112) == 0) {
                if (pVarF.s(lVar)) {
                    i33 = 32;
                } else {
                    i33 = 16;
                }
                i30 |= i33;
            }
            i34 = i30;
            i35 = i13 & 4096;
            if (i35 != 0) {
                if ((i12 & bb.c.b.f30796me) == 0) {
                    if (pVarF.s(gVar)) {
                        i36 = 256;
                    } else {
                        i36 = 128;
                    }
                    i34 |= i36;
                }
                if ((i12 & bb.c.g.f32954lc) != 0) {
                    i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
                }
                i37 = i13 & 16384;
                if (i37 != 0) {
                    i34 |= 24576;
                } else if ((i12 & 57344) == 0) {
                    i34 |= pVarF.s(qVar) ? 16384 : 8192;
                }
                if ((i14 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i40 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                        } else {
                            qVarA = qVar;
                        }
                        lVar3 = lVar2;
                        a0Var2 = solidColor;
                        z16 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        gVar3 = gVar2;
                        m0Var2 = m0VarA;
                    } else {
                        if (i40 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                        } else {
                            qVarA = qVar;
                        }
                        lVar3 = lVar2;
                        a0Var2 = solidColor;
                        z16 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        gVar3 = gVar2;
                        m0Var2 = m0VarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
                    }
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    boolean z213 = z16;
                    if (objU2 == companion.a()) {
                        a1 a1VarG4 = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                        pVarF.N(a1VarG4);
                        objU2 = a1VarG4;
                    }
                    pVarF.c0();
                    a1Var = (a1) objU2;
                    textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
                    pVarF.T(511388516);
                    zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
                    i iVar8 = iVarA;
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                    return;
                                }
                                BasicTextFieldKt.d(a1Var, textFieldValueE);
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                    return;
                                }
                                BasicTextFieldKt.d(a1Var, textFieldValueE);
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    EffectsKt.k((yh.a) objU3, pVarF, 0);
                    pVarF.T(1157296644);
                    zS2 = pVarF.s(value);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = h2.g(value, null, 2, null);
                        pVarF.N(objU4);
                    } else {
                        objU4 = h2.g(value, null, 2, null);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    a1Var2 = (a1) objU4;
                    ImeOptions imeOptionsH4 = keyboardOptions2.h(z17);
                    boolean z214 = !z17;
                    if (z17) {
                        i38 = 1;
                    } else {
                        i38 = i10;
                    }
                    pVarF.T(1618982084);
                    KeyboardOptions keyboardOptions9 = keyboardOptions2;
                    zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
                    objU5 = pVarF.U();
                    if (zS3) {
                        objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                                f0.p(newTextFieldValueState, "newTextFieldValueState");
                                BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                                boolean z215 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                                BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                                if (z215) {
                                    onValueChange.invoke(newTextFieldValueState.i());
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU5);
                    } else {
                        objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                                f0.p(newTextFieldValueState, "newTextFieldValueState");
                                BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                                boolean z215 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                                BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                                if (z215) {
                                    onValueChange.invoke(newTextFieldValueState.i());
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU5);
                    }
                    pVarF.c0();
                    yh.l lVar10 = (yh.l) objU5;
                    int i415 = i34 << 12;
                    int i416 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i415 & 57344) | (458752 & i415) | (3670016 & i415) | (i415 & 29360128);
                    int i417 = (i14 >> 18) & 112;
                    int i418 = i14 >> 3;
                    CoreTextFieldKt.a(textFieldValueE, lVar10, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z214, i38, imeOptionsH4, iVar8, z13, z213, qVarA, pVarF, i416, i417 | (i418 & bb.c.b.f30796me) | (i418 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    keyboardOptions3 = keyboardOptions9;
                    z18 = z213;
                    nVar3 = nVar2;
                    z19 = z17;
                    m0Var3 = m0Var2;
                    gVar4 = gVar3;
                    iVar2 = iVar8;
                    textStyle3 = textStyle2;
                    lVar4 = lVar3;
                    i39 = i10;
                    z20 = z13;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i40 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                        } else {
                            qVarA = qVar;
                        }
                        lVar3 = lVar2;
                        a0Var2 = solidColor;
                        z16 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        gVar3 = gVar2;
                        m0Var2 = m0VarA;
                    } else {
                        if (i40 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                        } else {
                            qVarA = qVar;
                        }
                        lVar3 = lVar2;
                        a0Var2 = solidColor;
                        z16 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        gVar3 = gVar2;
                        m0Var2 = m0VarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
                    }
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    boolean z215 = z16;
                    if (objU2 == companion.a()) {
                        a1 a1VarG5 = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                        pVarF.N(a1VarG5);
                        objU2 = a1VarG5;
                    }
                    pVarF.c0();
                    a1Var = (a1) objU2;
                    textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
                    pVarF.T(511388516);
                    zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
                    i iVar9 = iVarA;
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                    return;
                                }
                                BasicTextFieldKt.d(a1Var, textFieldValueE);
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                    return;
                                }
                                BasicTextFieldKt.d(a1Var, textFieldValueE);
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    EffectsKt.k((yh.a) objU3, pVarF, 0);
                    pVarF.T(1157296644);
                    zS2 = pVarF.s(value);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = h2.g(value, null, 2, null);
                        pVarF.N(objU4);
                    } else {
                        objU4 = h2.g(value, null, 2, null);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    a1Var2 = (a1) objU4;
                    ImeOptions imeOptionsH5 = keyboardOptions2.h(z17);
                    boolean z216 = !z17;
                    if (z17) {
                        i38 = 1;
                    } else {
                        i38 = i10;
                    }
                    pVarF.T(1618982084);
                    KeyboardOptions keyboardOptions10 = keyboardOptions2;
                    zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
                    objU5 = pVarF.U();
                    if (zS3) {
                        objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                                f0.p(newTextFieldValueState, "newTextFieldValueState");
                                BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                                boolean z217 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                                BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                                if (z217) {
                                    onValueChange.invoke(newTextFieldValueState.i());
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU5);
                    } else {
                        objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                                f0.p(newTextFieldValueState, "newTextFieldValueState");
                                BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                                boolean z217 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                                BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                                if (z217) {
                                    onValueChange.invoke(newTextFieldValueState.i());
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU5);
                    }
                    pVarF.c0();
                    yh.l lVar11 = (yh.l) objU5;
                    int i419 = i34 << 12;
                    int i4110 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i419 & 57344) | (458752 & i419) | (3670016 & i419) | (i419 & 29360128);
                    int i4111 = (i14 >> 18) & 112;
                    int i4112 = i14 >> 3;
                    CoreTextFieldKt.a(textFieldValueE, lVar11, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z216, i38, imeOptionsH5, iVar9, z13, z215, qVarA, pVarF, i4110, i4111 | (i4112 & bb.c.b.f30796me) | (i4112 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    keyboardOptions3 = keyboardOptions10;
                    z18 = z215;
                    nVar3 = nVar2;
                    z19 = z17;
                    m0Var3 = m0Var2;
                    gVar4 = gVar3;
                    iVar2 = iVar9;
                    textStyle3 = textStyle2;
                    lVar4 = lVar3;
                    i39 = i10;
                    z20 = z13;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar6 = nVar3;
                final boolean z217 = z20;
                final boolean z218 = z18;
                final TextStyle textStyle6 = textStyle3;
                final KeyboardOptions keyboardOptions11 = keyboardOptions3;
                final i iVar10 = iVar2;
                final boolean z219 = z19;
                final int i4113 = i39;
                final m0 m0Var6 = m0Var3;
                final yh.l<? super TextLayoutResult, b2> lVar12 = lVar4;
                final androidx.compose.foundation.interaction.g gVar7 = gVar4;
                final androidx.compose.ui.graphics.a0 a0Var5 = a0Var2;
                final yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, ? super androidx.compose.runtime.p, ? super Integer, b2> qVar4 = qVarA;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i4114) {
                        BasicTextFieldKt.b(value, onValueChange, nVar6, z217, z218, textStyle6, keyboardOptions11, iVar10, z219, i4113, m0Var6, lVar12, gVar7, a0Var5, qVar4, pVar2, i11 | 1, i12, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i34 |= bb.c.b.f30966u4;
            if ((i12 & bb.c.g.f32954lc) != 0) {
                i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
            }
            i37 = i13 & 16384;
            if (i37 != 0) {
                i34 |= 24576;
            } else if ((i12 & 57344) == 0) {
                i34 |= pVarF.s(qVar) ? 16384 : 8192;
            }
            if ((i14 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i40 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                    } else {
                        qVarA = qVar;
                    }
                    lVar3 = lVar2;
                    a0Var2 = solidColor;
                    z16 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    gVar3 = gVar2;
                    m0Var2 = m0VarA;
                } else {
                    if (i40 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                    } else {
                        qVarA = qVar;
                    }
                    lVar3 = lVar2;
                    a0Var2 = solidColor;
                    z16 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    gVar3 = gVar2;
                    m0Var2 = m0VarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
                }
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                boolean z2110 = z16;
                if (objU2 == companion.a()) {
                    a1 a1VarG6 = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                    pVarF.N(a1VarG6);
                    objU2 = a1VarG6;
                }
                pVarF.c0();
                a1Var = (a1) objU2;
                textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
                pVarF.T(511388516);
                zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
                i iVar11 = iVarA;
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                return;
                            }
                            BasicTextFieldKt.d(a1Var, textFieldValueE);
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                return;
                            }
                            BasicTextFieldKt.d(a1Var, textFieldValueE);
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                EffectsKt.k((yh.a) objU3, pVarF, 0);
                pVarF.T(1157296644);
                zS2 = pVarF.s(value);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = h2.g(value, null, 2, null);
                    pVarF.N(objU4);
                } else {
                    objU4 = h2.g(value, null, 2, null);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                a1Var2 = (a1) objU4;
                ImeOptions imeOptionsH6 = keyboardOptions2.h(z17);
                boolean z2111 = !z17;
                if (z17) {
                    i38 = 1;
                } else {
                    i38 = i10;
                }
                pVarF.T(1618982084);
                KeyboardOptions keyboardOptions12 = keyboardOptions2;
                zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
                objU5 = pVarF.U();
                if (zS3) {
                    objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                            f0.p(newTextFieldValueState, "newTextFieldValueState");
                            BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                            boolean z2112 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                            BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                            if (z2112) {
                                onValueChange.invoke(newTextFieldValueState.i());
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU5);
                } else {
                    objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                            f0.p(newTextFieldValueState, "newTextFieldValueState");
                            BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                            boolean z2112 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                            BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                            if (z2112) {
                                onValueChange.invoke(newTextFieldValueState.i());
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU5);
                }
                pVarF.c0();
                yh.l lVar13 = (yh.l) objU5;
                int i4114 = i34 << 12;
                int i4115 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i4114 & 57344) | (458752 & i4114) | (3670016 & i4114) | (i4114 & 29360128);
                int i4116 = (i14 >> 18) & 112;
                int i4117 = i14 >> 3;
                CoreTextFieldKt.a(textFieldValueE, lVar13, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z2111, i38, imeOptionsH6, iVar11, z13, z2110, qVarA, pVarF, i4115, i4116 | (i4117 & bb.c.b.f30796me) | (i4117 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                keyboardOptions3 = keyboardOptions12;
                z18 = z2110;
                nVar3 = nVar2;
                z19 = z17;
                m0Var3 = m0Var2;
                gVar4 = gVar3;
                iVar2 = iVar11;
                textStyle3 = textStyle2;
                lVar4 = lVar3;
                i39 = i10;
                z20 = z13;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i40 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                    } else {
                        qVarA = qVar;
                    }
                    lVar3 = lVar2;
                    a0Var2 = solidColor;
                    z16 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    gVar3 = gVar2;
                    m0Var2 = m0VarA;
                } else {
                    if (i40 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                    } else {
                        qVarA = qVar;
                    }
                    lVar3 = lVar2;
                    a0Var2 = solidColor;
                    z16 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    gVar3 = gVar2;
                    m0Var2 = m0VarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
                }
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                boolean z2112 = z16;
                if (objU2 == companion.a()) {
                    a1 a1VarG7 = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                    pVarF.N(a1VarG7);
                    objU2 = a1VarG7;
                }
                pVarF.c0();
                a1Var = (a1) objU2;
                textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
                pVarF.T(511388516);
                zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
                i iVar12 = iVarA;
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                return;
                            }
                            BasicTextFieldKt.d(a1Var, textFieldValueE);
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                return;
                            }
                            BasicTextFieldKt.d(a1Var, textFieldValueE);
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                EffectsKt.k((yh.a) objU3, pVarF, 0);
                pVarF.T(1157296644);
                zS2 = pVarF.s(value);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = h2.g(value, null, 2, null);
                    pVarF.N(objU4);
                } else {
                    objU4 = h2.g(value, null, 2, null);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                a1Var2 = (a1) objU4;
                ImeOptions imeOptionsH7 = keyboardOptions2.h(z17);
                boolean z2113 = !z17;
                if (z17) {
                    i38 = 1;
                } else {
                    i38 = i10;
                }
                pVarF.T(1618982084);
                KeyboardOptions keyboardOptions13 = keyboardOptions2;
                zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
                objU5 = pVarF.U();
                if (zS3) {
                    objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                            f0.p(newTextFieldValueState, "newTextFieldValueState");
                            BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                            boolean z2114 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                            BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                            if (z2114) {
                                onValueChange.invoke(newTextFieldValueState.i());
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU5);
                } else {
                    objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                            f0.p(newTextFieldValueState, "newTextFieldValueState");
                            BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                            boolean z2114 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                            BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                            if (z2114) {
                                onValueChange.invoke(newTextFieldValueState.i());
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU5);
                }
                pVarF.c0();
                yh.l lVar14 = (yh.l) objU5;
                int i4118 = i34 << 12;
                int i4119 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i4118 & 57344) | (458752 & i4118) | (3670016 & i4118) | (i4118 & 29360128);
                int i41110 = (i14 >> 18) & 112;
                int i41111 = i14 >> 3;
                CoreTextFieldKt.a(textFieldValueE, lVar14, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z2113, i38, imeOptionsH7, iVar12, z13, z2112, qVarA, pVarF, i4119, i41110 | (i41111 & bb.c.b.f30796me) | (i41111 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                keyboardOptions3 = keyboardOptions13;
                z18 = z2112;
                nVar3 = nVar2;
                z19 = z17;
                m0Var3 = m0Var2;
                gVar4 = gVar3;
                iVar2 = iVar12;
                textStyle3 = textStyle2;
                lVar4 = lVar3;
                i39 = i10;
                z20 = z13;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar7 = nVar3;
            final boolean z2114 = z20;
            final boolean z2115 = z18;
            final TextStyle textStyle7 = textStyle3;
            final KeyboardOptions keyboardOptions14 = keyboardOptions3;
            final i iVar13 = iVar2;
            final boolean z2116 = z19;
            final int i41112 = i39;
            final m0 m0Var7 = m0Var3;
            final yh.l<? super TextLayoutResult, b2> lVar15 = lVar4;
            final androidx.compose.foundation.interaction.g gVar8 = gVar4;
            final androidx.compose.ui.graphics.a0 a0Var6 = a0Var2;
            final yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, ? super androidx.compose.runtime.p, ? super Integer, b2> qVar5 = qVarA;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i41113) {
                    BasicTextFieldKt.b(value, onValueChange, nVar7, z2114, z2115, textStyle7, keyboardOptions14, iVar13, z2116, i41112, m0Var7, lVar15, gVar8, a0Var6, qVar5, pVar2, i11 | 1, i12, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= bb.c.b.f30966u4;
        i15 = i13 & 8;
        if (i15 != 0) {
            if ((i11 & bb.c.g.f32954lc) == 0) {
                if (pVarF.u(z10)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            i17 = i13 & 16;
            if (i17 != 0) {
                i14 |= 24576;
            } else if ((i11 & 57344) == 0) {
                if (pVarF.u(z11)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i11 & 458752) == 0) {
                if (pVarF.s(textStyle)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i14 |= i20;
            }
            i21 = i13 & 64;
            if (i21 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (pVarF.s(keyboardOptions)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i14 |= i22;
            }
            i23 = i13 & 128;
            if (i23 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (pVarF.s(iVar)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i14 |= i24;
            }
            i25 = i13 & 256;
            if (i25 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (pVarF.u(z12)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i14 |= i26;
            }
            i27 = i13 & 512;
            if (i27 != 0) {
                i14 |= com.google.android.exoplayer2.j.G;
            } else if ((i11 & 1879048192) == 0) {
                if (pVarF.y(i10)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i14 |= i28;
            }
            i29 = i13 & 1024;
            if (i29 != 0) {
                i30 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (pVarF.s(m0Var)) {
                    i31 = 4;
                } else {
                    i31 = 2;
                }
                i30 = i12 | i31;
            } else {
                i30 = i12;
            }
            i32 = i13 & 2048;
            if (i32 != 0) {
                i30 |= 48;
            } else if ((i12 & 112) == 0) {
                if (pVarF.s(lVar)) {
                    i33 = 32;
                } else {
                    i33 = 16;
                }
                i30 |= i33;
            }
            i34 = i30;
            i35 = i13 & 4096;
            if (i35 != 0) {
                if ((i12 & bb.c.b.f30796me) == 0) {
                    if (pVarF.s(gVar)) {
                        i36 = 256;
                    } else {
                        i36 = 128;
                    }
                    i34 |= i36;
                }
                if ((i12 & bb.c.g.f32954lc) != 0) {
                    i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
                }
                i37 = i13 & 16384;
                if (i37 != 0) {
                    i34 |= 24576;
                } else if ((i12 & 57344) == 0) {
                    i34 |= pVarF.s(qVar) ? 16384 : 8192;
                }
                if ((i14 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i40 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                        } else {
                            qVarA = qVar;
                        }
                        lVar3 = lVar2;
                        a0Var2 = solidColor;
                        z16 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        gVar3 = gVar2;
                        m0Var2 = m0VarA;
                    } else {
                        if (i40 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                        } else {
                            qVarA = qVar;
                        }
                        lVar3 = lVar2;
                        a0Var2 = solidColor;
                        z16 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        gVar3 = gVar2;
                        m0Var2 = m0VarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
                    }
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    boolean z2117 = z16;
                    if (objU2 == companion.a()) {
                        a1 a1VarG8 = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                        pVarF.N(a1VarG8);
                        objU2 = a1VarG8;
                    }
                    pVarF.c0();
                    a1Var = (a1) objU2;
                    textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
                    pVarF.T(511388516);
                    zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
                    i iVar14 = iVarA;
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                    return;
                                }
                                BasicTextFieldKt.d(a1Var, textFieldValueE);
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                    return;
                                }
                                BasicTextFieldKt.d(a1Var, textFieldValueE);
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    EffectsKt.k((yh.a) objU3, pVarF, 0);
                    pVarF.T(1157296644);
                    zS2 = pVarF.s(value);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = h2.g(value, null, 2, null);
                        pVarF.N(objU4);
                    } else {
                        objU4 = h2.g(value, null, 2, null);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    a1Var2 = (a1) objU4;
                    ImeOptions imeOptionsH8 = keyboardOptions2.h(z17);
                    boolean z2118 = !z17;
                    if (z17) {
                        i38 = 1;
                    } else {
                        i38 = i10;
                    }
                    pVarF.T(1618982084);
                    KeyboardOptions keyboardOptions15 = keyboardOptions2;
                    zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
                    objU5 = pVarF.U();
                    if (zS3) {
                        objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                                f0.p(newTextFieldValueState, "newTextFieldValueState");
                                BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                                boolean z2119 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                                BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                                if (z2119) {
                                    onValueChange.invoke(newTextFieldValueState.i());
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU5);
                    } else {
                        objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                                f0.p(newTextFieldValueState, "newTextFieldValueState");
                                BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                                boolean z2119 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                                BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                                if (z2119) {
                                    onValueChange.invoke(newTextFieldValueState.i());
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU5);
                    }
                    pVarF.c0();
                    yh.l lVar16 = (yh.l) objU5;
                    int i41113 = i34 << 12;
                    int i41114 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i41113 & 57344) | (458752 & i41113) | (3670016 & i41113) | (i41113 & 29360128);
                    int i41115 = (i14 >> 18) & 112;
                    int i41116 = i14 >> 3;
                    CoreTextFieldKt.a(textFieldValueE, lVar16, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z2118, i38, imeOptionsH8, iVar14, z13, z2117, qVarA, pVarF, i41114, i41115 | (i41116 & bb.c.b.f30796me) | (i41116 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    keyboardOptions3 = keyboardOptions15;
                    z18 = z2117;
                    nVar3 = nVar2;
                    z19 = z17;
                    m0Var3 = m0Var2;
                    gVar4 = gVar3;
                    iVar2 = iVar14;
                    textStyle3 = textStyle2;
                    lVar4 = lVar3;
                    i39 = i10;
                    z20 = z13;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i40 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                        } else {
                            qVarA = qVar;
                        }
                        lVar3 = lVar2;
                        a0Var2 = solidColor;
                        z16 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        gVar3 = gVar2;
                        m0Var2 = m0VarA;
                    } else {
                        if (i40 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if (i19 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if (i23 != 0) {
                            iVarA = i.INSTANCE.a();
                        } else {
                            iVarA = iVar;
                        }
                        if (i25 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i27 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        if (i29 != 0) {
                            m0VarA = m0.INSTANCE.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i32 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (i35 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 8192) != 0) {
                            solidColor = new SolidColor(l0.INSTANCE.a(), null);
                            i34 &= -7169;
                        } else {
                            solidColor = a0Var;
                        }
                        if (i37 != 0) {
                            qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                        } else {
                            qVarA = qVar;
                        }
                        lVar3 = lVar2;
                        a0Var2 = solidColor;
                        z16 = z14;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        gVar3 = gVar2;
                        m0Var2 = m0VarA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
                    }
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    boolean z2119 = z16;
                    if (objU2 == companion.a()) {
                        a1 a1VarG9 = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                        pVarF.N(a1VarG9);
                        objU2 = a1VarG9;
                    }
                    pVarF.c0();
                    a1Var = (a1) objU2;
                    textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
                    pVarF.T(511388516);
                    zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
                    i iVar15 = iVarA;
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                    return;
                                }
                                BasicTextFieldKt.d(a1Var, textFieldValueE);
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                    return;
                                }
                                BasicTextFieldKt.d(a1Var, textFieldValueE);
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    EffectsKt.k((yh.a) objU3, pVarF, 0);
                    pVarF.T(1157296644);
                    zS2 = pVarF.s(value);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = h2.g(value, null, 2, null);
                        pVarF.N(objU4);
                    } else {
                        objU4 = h2.g(value, null, 2, null);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    a1Var2 = (a1) objU4;
                    ImeOptions imeOptionsH9 = keyboardOptions2.h(z17);
                    boolean z21110 = !z17;
                    if (z17) {
                        i38 = 1;
                    } else {
                        i38 = i10;
                    }
                    pVarF.T(1618982084);
                    KeyboardOptions keyboardOptions16 = keyboardOptions2;
                    zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
                    objU5 = pVarF.U();
                    if (zS3) {
                        objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                                f0.p(newTextFieldValueState, "newTextFieldValueState");
                                BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                                boolean z21111 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                                BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                                if (z21111) {
                                    onValueChange.invoke(newTextFieldValueState.i());
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU5);
                    } else {
                        objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                                f0.p(newTextFieldValueState, "newTextFieldValueState");
                                BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                                boolean z21111 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                                BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                                if (z21111) {
                                    onValueChange.invoke(newTextFieldValueState.i());
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                                a(textFieldValue);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU5);
                    }
                    pVarF.c0();
                    yh.l lVar17 = (yh.l) objU5;
                    int i41117 = i34 << 12;
                    int i41118 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i41117 & 57344) | (458752 & i41117) | (3670016 & i41117) | (i41117 & 29360128);
                    int i41119 = (i14 >> 18) & 112;
                    int i411110 = i14 >> 3;
                    CoreTextFieldKt.a(textFieldValueE, lVar17, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z21110, i38, imeOptionsH9, iVar15, z13, z2119, qVarA, pVarF, i41118, i41119 | (i411110 & bb.c.b.f30796me) | (i411110 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    keyboardOptions3 = keyboardOptions16;
                    z18 = z2119;
                    nVar3 = nVar2;
                    z19 = z17;
                    m0Var3 = m0Var2;
                    gVar4 = gVar3;
                    iVar2 = iVar15;
                    textStyle3 = textStyle2;
                    lVar4 = lVar3;
                    i39 = i10;
                    z20 = z13;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar8 = nVar3;
                final boolean z21111 = z20;
                final boolean z21112 = z18;
                final TextStyle textStyle8 = textStyle3;
                final KeyboardOptions keyboardOptions17 = keyboardOptions3;
                final i iVar16 = iVar2;
                final boolean z21113 = z19;
                final int i411111 = i39;
                final m0 m0Var8 = m0Var3;
                final yh.l<? super TextLayoutResult, b2> lVar18 = lVar4;
                final androidx.compose.foundation.interaction.g gVar9 = gVar4;
                final androidx.compose.ui.graphics.a0 a0Var7 = a0Var2;
                final yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, ? super androidx.compose.runtime.p, ? super Integer, b2> qVar6 = qVarA;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i411112) {
                        BasicTextFieldKt.b(value, onValueChange, nVar8, z21111, z21112, textStyle8, keyboardOptions17, iVar16, z21113, i411111, m0Var8, lVar18, gVar9, a0Var7, qVar6, pVar2, i11 | 1, i12, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i34 |= bb.c.b.f30966u4;
            if ((i12 & bb.c.g.f32954lc) != 0) {
                i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
            }
            i37 = i13 & 16384;
            if (i37 != 0) {
                i34 |= 24576;
            } else if ((i12 & 57344) == 0) {
                i34 |= pVarF.s(qVar) ? 16384 : 8192;
            }
            if ((i14 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i40 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                    } else {
                        qVarA = qVar;
                    }
                    lVar3 = lVar2;
                    a0Var2 = solidColor;
                    z16 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    gVar3 = gVar2;
                    m0Var2 = m0VarA;
                } else {
                    if (i40 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                    } else {
                        qVarA = qVar;
                    }
                    lVar3 = lVar2;
                    a0Var2 = solidColor;
                    z16 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    gVar3 = gVar2;
                    m0Var2 = m0VarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
                }
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                boolean z21114 = z16;
                if (objU2 == companion.a()) {
                    a1 a1VarG10 = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                    pVarF.N(a1VarG10);
                    objU2 = a1VarG10;
                }
                pVarF.c0();
                a1Var = (a1) objU2;
                textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
                pVarF.T(511388516);
                zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
                i iVar17 = iVarA;
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                return;
                            }
                            BasicTextFieldKt.d(a1Var, textFieldValueE);
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                return;
                            }
                            BasicTextFieldKt.d(a1Var, textFieldValueE);
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                EffectsKt.k((yh.a) objU3, pVarF, 0);
                pVarF.T(1157296644);
                zS2 = pVarF.s(value);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = h2.g(value, null, 2, null);
                    pVarF.N(objU4);
                } else {
                    objU4 = h2.g(value, null, 2, null);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                a1Var2 = (a1) objU4;
                ImeOptions imeOptionsH10 = keyboardOptions2.h(z17);
                boolean z21115 = !z17;
                if (z17) {
                    i38 = 1;
                } else {
                    i38 = i10;
                }
                pVarF.T(1618982084);
                KeyboardOptions keyboardOptions18 = keyboardOptions2;
                zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
                objU5 = pVarF.U();
                if (zS3) {
                    objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                            f0.p(newTextFieldValueState, "newTextFieldValueState");
                            BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                            boolean z21116 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                            BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                            if (z21116) {
                                onValueChange.invoke(newTextFieldValueState.i());
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU5);
                } else {
                    objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                            f0.p(newTextFieldValueState, "newTextFieldValueState");
                            BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                            boolean z21116 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                            BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                            if (z21116) {
                                onValueChange.invoke(newTextFieldValueState.i());
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU5);
                }
                pVarF.c0();
                yh.l lVar19 = (yh.l) objU5;
                int i411112 = i34 << 12;
                int i411113 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i411112 & 57344) | (458752 & i411112) | (3670016 & i411112) | (i411112 & 29360128);
                int i411114 = (i14 >> 18) & 112;
                int i411115 = i14 >> 3;
                CoreTextFieldKt.a(textFieldValueE, lVar19, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z21115, i38, imeOptionsH10, iVar17, z13, z21114, qVarA, pVarF, i411113, i411114 | (i411115 & bb.c.b.f30796me) | (i411115 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                keyboardOptions3 = keyboardOptions18;
                z18 = z21114;
                nVar3 = nVar2;
                z19 = z17;
                m0Var3 = m0Var2;
                gVar4 = gVar3;
                iVar2 = iVar17;
                textStyle3 = textStyle2;
                lVar4 = lVar3;
                i39 = i10;
                z20 = z13;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i40 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                    } else {
                        qVarA = qVar;
                    }
                    lVar3 = lVar2;
                    a0Var2 = solidColor;
                    z16 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    gVar3 = gVar2;
                    m0Var2 = m0VarA;
                } else {
                    if (i40 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                    } else {
                        qVarA = qVar;
                    }
                    lVar3 = lVar2;
                    a0Var2 = solidColor;
                    z16 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    gVar3 = gVar2;
                    m0Var2 = m0VarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
                }
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                boolean z21116 = z16;
                if (objU2 == companion.a()) {
                    a1 a1VarG11 = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                    pVarF.N(a1VarG11);
                    objU2 = a1VarG11;
                }
                pVarF.c0();
                a1Var = (a1) objU2;
                textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
                pVarF.T(511388516);
                zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
                i iVar18 = iVarA;
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                return;
                            }
                            BasicTextFieldKt.d(a1Var, textFieldValueE);
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                return;
                            }
                            BasicTextFieldKt.d(a1Var, textFieldValueE);
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                EffectsKt.k((yh.a) objU3, pVarF, 0);
                pVarF.T(1157296644);
                zS2 = pVarF.s(value);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = h2.g(value, null, 2, null);
                    pVarF.N(objU4);
                } else {
                    objU4 = h2.g(value, null, 2, null);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                a1Var2 = (a1) objU4;
                ImeOptions imeOptionsH11 = keyboardOptions2.h(z17);
                boolean z21117 = !z17;
                if (z17) {
                    i38 = 1;
                } else {
                    i38 = i10;
                }
                pVarF.T(1618982084);
                KeyboardOptions keyboardOptions19 = keyboardOptions2;
                zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
                objU5 = pVarF.U();
                if (zS3) {
                    objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                            f0.p(newTextFieldValueState, "newTextFieldValueState");
                            BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                            boolean z21118 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                            BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                            if (z21118) {
                                onValueChange.invoke(newTextFieldValueState.i());
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU5);
                } else {
                    objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                            f0.p(newTextFieldValueState, "newTextFieldValueState");
                            BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                            boolean z21118 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                            BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                            if (z21118) {
                                onValueChange.invoke(newTextFieldValueState.i());
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU5);
                }
                pVarF.c0();
                yh.l lVar110 = (yh.l) objU5;
                int i411116 = i34 << 12;
                int i411117 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i411116 & 57344) | (458752 & i411116) | (3670016 & i411116) | (i411116 & 29360128);
                int i411118 = (i14 >> 18) & 112;
                int i411119 = i14 >> 3;
                CoreTextFieldKt.a(textFieldValueE, lVar110, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z21117, i38, imeOptionsH11, iVar18, z13, z21116, qVarA, pVarF, i411117, i411118 | (i411119 & bb.c.b.f30796me) | (i411119 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                keyboardOptions3 = keyboardOptions19;
                z18 = z21116;
                nVar3 = nVar2;
                z19 = z17;
                m0Var3 = m0Var2;
                gVar4 = gVar3;
                iVar2 = iVar18;
                textStyle3 = textStyle2;
                lVar4 = lVar3;
                i39 = i10;
                z20 = z13;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar9 = nVar3;
            final boolean z21118 = z20;
            final boolean z21119 = z18;
            final TextStyle textStyle9 = textStyle3;
            final KeyboardOptions keyboardOptions110 = keyboardOptions3;
            final i iVar19 = iVar2;
            final boolean z211110 = z19;
            final int i4111110 = i39;
            final m0 m0Var9 = m0Var3;
            final yh.l<? super TextLayoutResult, b2> lVar111 = lVar4;
            final androidx.compose.foundation.interaction.g gVar10 = gVar4;
            final androidx.compose.ui.graphics.a0 a0Var8 = a0Var2;
            final yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, ? super androidx.compose.runtime.p, ? super Integer, b2> qVar7 = qVarA;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i4111111) {
                    BasicTextFieldKt.b(value, onValueChange, nVar9, z21118, z21119, textStyle9, keyboardOptions110, iVar19, z211110, i4111110, m0Var9, lVar111, gVar10, a0Var8, qVar7, pVar2, i11 | 1, i12, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= bb.c.d.f31193dj;
        i17 = i13 & 16;
        if (i17 != 0) {
            i14 |= 24576;
        } else if ((i11 & 57344) == 0) {
            if (pVarF.u(z11)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i14 |= i18;
        }
        i19 = i13 & 32;
        if (i19 != 0) {
            i14 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((i11 & 458752) == 0) {
            if (pVarF.s(textStyle)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i14 |= i20;
        }
        i21 = i13 & 64;
        if (i21 != 0) {
            i14 |= 1572864;
        } else if ((i11 & 3670016) == 0) {
            if (pVarF.s(keyboardOptions)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i14 |= i22;
        }
        i23 = i13 & 128;
        if (i23 != 0) {
            i14 |= 12582912;
        } else if ((i11 & 29360128) == 0) {
            if (pVarF.s(iVar)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i14 |= i24;
        }
        i25 = i13 & 256;
        if (i25 != 0) {
            i14 |= 100663296;
        } else if ((i11 & 234881024) == 0) {
            if (pVarF.u(z12)) {
                i26 = 67108864;
            } else {
                i26 = 33554432;
            }
            i14 |= i26;
        }
        i27 = i13 & 512;
        if (i27 != 0) {
            i14 |= com.google.android.exoplayer2.j.G;
        } else if ((i11 & 1879048192) == 0) {
            if (pVarF.y(i10)) {
                i28 = 536870912;
            } else {
                i28 = 268435456;
            }
            i14 |= i28;
        }
        i29 = i13 & 1024;
        if (i29 != 0) {
            i30 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            if (pVarF.s(m0Var)) {
                i31 = 4;
            } else {
                i31 = 2;
            }
            i30 = i12 | i31;
        } else {
            i30 = i12;
        }
        i32 = i13 & 2048;
        if (i32 != 0) {
            i30 |= 48;
        } else if ((i12 & 112) == 0) {
            if (pVarF.s(lVar)) {
                i33 = 32;
            } else {
                i33 = 16;
            }
            i30 |= i33;
        }
        i34 = i30;
        i35 = i13 & 4096;
        if (i35 != 0) {
            if ((i12 & bb.c.b.f30796me) == 0) {
                if (pVarF.s(gVar)) {
                    i36 = 256;
                } else {
                    i36 = 128;
                }
                i34 |= i36;
            }
            if ((i12 & bb.c.g.f32954lc) != 0) {
                i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
            }
            i37 = i13 & 16384;
            if (i37 != 0) {
                i34 |= 24576;
            } else if ((i12 & 57344) == 0) {
                i34 |= pVarF.s(qVar) ? 16384 : 8192;
            }
            if ((i14 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i40 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                    } else {
                        qVarA = qVar;
                    }
                    lVar3 = lVar2;
                    a0Var2 = solidColor;
                    z16 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    gVar3 = gVar2;
                    m0Var2 = m0VarA;
                } else {
                    if (i40 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                    } else {
                        qVarA = qVar;
                    }
                    lVar3 = lVar2;
                    a0Var2 = solidColor;
                    z16 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    gVar3 = gVar2;
                    m0Var2 = m0VarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
                }
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                boolean z211111 = z16;
                if (objU2 == companion.a()) {
                    a1 a1VarG12 = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                    pVarF.N(a1VarG12);
                    objU2 = a1VarG12;
                }
                pVarF.c0();
                a1Var = (a1) objU2;
                textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
                pVarF.T(511388516);
                zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
                i iVar110 = iVarA;
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                return;
                            }
                            BasicTextFieldKt.d(a1Var, textFieldValueE);
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                return;
                            }
                            BasicTextFieldKt.d(a1Var, textFieldValueE);
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                EffectsKt.k((yh.a) objU3, pVarF, 0);
                pVarF.T(1157296644);
                zS2 = pVarF.s(value);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = h2.g(value, null, 2, null);
                    pVarF.N(objU4);
                } else {
                    objU4 = h2.g(value, null, 2, null);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                a1Var2 = (a1) objU4;
                ImeOptions imeOptionsH12 = keyboardOptions2.h(z17);
                boolean z211112 = !z17;
                if (z17) {
                    i38 = 1;
                } else {
                    i38 = i10;
                }
                pVarF.T(1618982084);
                KeyboardOptions keyboardOptions111 = keyboardOptions2;
                zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
                objU5 = pVarF.U();
                if (zS3) {
                    objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                            f0.p(newTextFieldValueState, "newTextFieldValueState");
                            BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                            boolean z211113 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                            BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                            if (z211113) {
                                onValueChange.invoke(newTextFieldValueState.i());
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU5);
                } else {
                    objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                            f0.p(newTextFieldValueState, "newTextFieldValueState");
                            BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                            boolean z211113 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                            BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                            if (z211113) {
                                onValueChange.invoke(newTextFieldValueState.i());
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU5);
                }
                pVarF.c0();
                yh.l lVar112 = (yh.l) objU5;
                int i4111111 = i34 << 12;
                int i4111112 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i4111111 & 57344) | (458752 & i4111111) | (3670016 & i4111111) | (i4111111 & 29360128);
                int i4111113 = (i14 >> 18) & 112;
                int i4111114 = i14 >> 3;
                CoreTextFieldKt.a(textFieldValueE, lVar112, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z211112, i38, imeOptionsH12, iVar110, z13, z211111, qVarA, pVarF, i4111112, i4111113 | (i4111114 & bb.c.b.f30796me) | (i4111114 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                keyboardOptions3 = keyboardOptions111;
                z18 = z211111;
                nVar3 = nVar2;
                z19 = z17;
                m0Var3 = m0Var2;
                gVar4 = gVar3;
                iVar2 = iVar110;
                textStyle3 = textStyle2;
                lVar4 = lVar3;
                i39 = i10;
                z20 = z13;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i40 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                    } else {
                        qVarA = qVar;
                    }
                    lVar3 = lVar2;
                    a0Var2 = solidColor;
                    z16 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    gVar3 = gVar2;
                    m0Var2 = m0VarA;
                } else {
                    if (i40 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if (i19 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if (i23 != 0) {
                        iVarA = i.INSTANCE.a();
                    } else {
                        iVarA = iVar;
                    }
                    if (i25 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i27 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    if (i29 != 0) {
                        m0VarA = m0.INSTANCE.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i32 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (i35 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 8192) != 0) {
                        solidColor = new SolidColor(l0.INSTANCE.a(), null);
                        i34 &= -7169;
                    } else {
                        solidColor = a0Var;
                    }
                    if (i37 != 0) {
                        qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                    } else {
                        qVarA = qVar;
                    }
                    lVar3 = lVar2;
                    a0Var2 = solidColor;
                    z16 = z14;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    gVar3 = gVar2;
                    m0Var2 = m0VarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
                }
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                boolean z211113 = z16;
                if (objU2 == companion.a()) {
                    a1 a1VarG13 = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                    pVarF.N(a1VarG13);
                    objU2 = a1VarG13;
                }
                pVarF.c0();
                a1Var = (a1) objU2;
                textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
                pVarF.T(511388516);
                zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
                i iVar111 = iVarA;
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                return;
                            }
                            BasicTextFieldKt.d(a1Var, textFieldValueE);
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                                return;
                            }
                            BasicTextFieldKt.d(a1Var, textFieldValueE);
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                EffectsKt.k((yh.a) objU3, pVarF, 0);
                pVarF.T(1157296644);
                zS2 = pVarF.s(value);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = h2.g(value, null, 2, null);
                    pVarF.N(objU4);
                } else {
                    objU4 = h2.g(value, null, 2, null);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                a1Var2 = (a1) objU4;
                ImeOptions imeOptionsH13 = keyboardOptions2.h(z17);
                boolean z211114 = !z17;
                if (z17) {
                    i38 = 1;
                } else {
                    i38 = i10;
                }
                pVarF.T(1618982084);
                KeyboardOptions keyboardOptions112 = keyboardOptions2;
                zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
                objU5 = pVarF.U();
                if (zS3) {
                    objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                            f0.p(newTextFieldValueState, "newTextFieldValueState");
                            BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                            boolean z211115 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                            BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                            if (z211115) {
                                onValueChange.invoke(newTextFieldValueState.i());
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU5);
                } else {
                    objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                            f0.p(newTextFieldValueState, "newTextFieldValueState");
                            BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                            boolean z211115 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                            BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                            if (z211115) {
                                onValueChange.invoke(newTextFieldValueState.i());
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                            a(textFieldValue);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU5);
                }
                pVarF.c0();
                yh.l lVar113 = (yh.l) objU5;
                int i4111115 = i34 << 12;
                int i4111116 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i4111115 & 57344) | (458752 & i4111115) | (3670016 & i4111115) | (i4111115 & 29360128);
                int i4111117 = (i14 >> 18) & 112;
                int i4111118 = i14 >> 3;
                CoreTextFieldKt.a(textFieldValueE, lVar113, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z211114, i38, imeOptionsH13, iVar111, z13, z211113, qVarA, pVarF, i4111116, i4111117 | (i4111118 & bb.c.b.f30796me) | (i4111118 & bb.c.g.f32954lc) | (i34 & 57344), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                keyboardOptions3 = keyboardOptions112;
                z18 = z211113;
                nVar3 = nVar2;
                z19 = z17;
                m0Var3 = m0Var2;
                gVar4 = gVar3;
                iVar2 = iVar111;
                textStyle3 = textStyle2;
                lVar4 = lVar3;
                i39 = i10;
                z20 = z13;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar10 = nVar3;
            final boolean z211115 = z20;
            final boolean z211116 = z18;
            final TextStyle textStyle10 = textStyle3;
            final KeyboardOptions keyboardOptions113 = keyboardOptions3;
            final i iVar112 = iVar2;
            final boolean z211117 = z19;
            final int i4111119 = i39;
            final m0 m0Var10 = m0Var3;
            final yh.l<? super TextLayoutResult, b2> lVar114 = lVar4;
            final androidx.compose.foundation.interaction.g gVar11 = gVar4;
            final androidx.compose.ui.graphics.a0 a0Var9 = a0Var2;
            final yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, ? super androidx.compose.runtime.p, ? super Integer, b2> qVar8 = qVarA;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i41111110) {
                    BasicTextFieldKt.b(value, onValueChange, nVar10, z211115, z211116, textStyle10, keyboardOptions113, iVar112, z211117, i4111119, m0Var10, lVar114, gVar11, a0Var9, qVar8, pVar2, i11 | 1, i12, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i34 |= bb.c.b.f30966u4;
        if ((i12 & bb.c.g.f32954lc) != 0) {
            i34 |= ((i13 & 8192) == 0 || !pVarF.s(a0Var)) ? 1024 : 2048;
        }
        i37 = i13 & 16384;
        if (i37 != 0) {
            i34 |= 24576;
        } else if ((i12 & 57344) == 0) {
            i34 |= pVarF.s(qVar) ? 16384 : 8192;
        }
        if ((i14 & 1533916891) != 306783378) {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i40 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i15 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i17 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i19 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle;
                }
                if (i21 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                if (i23 != 0) {
                    iVarA = i.INSTANCE.a();
                } else {
                    iVarA = iVar;
                }
                if (i25 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (i27 != 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = i10;
                }
                if (i29 != 0) {
                    m0VarA = m0.INSTANCE.a();
                } else {
                    m0VarA = m0Var;
                }
                if (i32 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (i35 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                if ((i13 & 8192) != 0) {
                    solidColor = new SolidColor(l0.INSTANCE.a(), null);
                    i34 &= -7169;
                } else {
                    solidColor = a0Var;
                }
                if (i37 != 0) {
                    qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                } else {
                    qVarA = qVar;
                }
                lVar3 = lVar2;
                a0Var2 = solidColor;
                z16 = z14;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                z17 = z15;
                gVar3 = gVar2;
                m0Var2 = m0VarA;
            } else {
                if (i40 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i15 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i17 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i19 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle;
                }
                if (i21 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                if (i23 != 0) {
                    iVarA = i.INSTANCE.a();
                } else {
                    iVarA = iVar;
                }
                if (i25 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (i27 != 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = i10;
                }
                if (i29 != 0) {
                    m0VarA = m0.INSTANCE.a();
                } else {
                    m0VarA = m0Var;
                }
                if (i32 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (i35 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                if ((i13 & 8192) != 0) {
                    solidColor = new SolidColor(l0.INSTANCE.a(), null);
                    i34 &= -7169;
                } else {
                    solidColor = a0Var;
                }
                if (i37 != 0) {
                    qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                } else {
                    qVarA = qVar;
                }
                lVar3 = lVar2;
                a0Var2 = solidColor;
                z16 = z14;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                z17 = z15;
                gVar3 = gVar2;
                m0Var2 = m0VarA;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
            }
            pVarF.T(-492369756);
            objU2 = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            boolean z211118 = z16;
            if (objU2 == companion.a()) {
                a1 a1VarG14 = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                pVarF.N(a1VarG14);
                objU2 = a1VarG14;
            }
            pVarF.c0();
            a1Var = (a1) objU2;
            textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
            pVarF.T(511388516);
            zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
            i iVar113 = iVarA;
            objU3 = pVarF.U();
            if (zS) {
                objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                            return;
                        }
                        BasicTextFieldKt.d(a1Var, textFieldValueE);
                    }
                };
                pVarF.N(objU3);
            } else {
                objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                            return;
                        }
                        BasicTextFieldKt.d(a1Var, textFieldValueE);
                    }
                };
                pVarF.N(objU3);
            }
            pVarF.c0();
            EffectsKt.k((yh.a) objU3, pVarF, 0);
            pVarF.T(1157296644);
            zS2 = pVarF.s(value);
            objU4 = pVarF.U();
            if (zS2) {
                objU4 = h2.g(value, null, 2, null);
                pVarF.N(objU4);
            } else {
                objU4 = h2.g(value, null, 2, null);
                pVarF.N(objU4);
            }
            pVarF.c0();
            a1Var2 = (a1) objU4;
            ImeOptions imeOptionsH14 = keyboardOptions2.h(z17);
            boolean z211119 = !z17;
            if (z17) {
                i38 = 1;
            } else {
                i38 = i10;
            }
            pVarF.T(1618982084);
            KeyboardOptions keyboardOptions114 = keyboardOptions2;
            zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
            objU5 = pVarF.U();
            if (zS3) {
                objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                        f0.p(newTextFieldValueState, "newTextFieldValueState");
                        BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                        boolean z2111110 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                        BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                        if (z2111110) {
                            onValueChange.invoke(newTextFieldValueState.i());
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                        a(textFieldValue);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU5);
            } else {
                objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                        f0.p(newTextFieldValueState, "newTextFieldValueState");
                        BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                        boolean z2111110 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                        BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                        if (z2111110) {
                            onValueChange.invoke(newTextFieldValueState.i());
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                        a(textFieldValue);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU5);
            }
            pVarF.c0();
            yh.l lVar115 = (yh.l) objU5;
            int i41111110 = i34 << 12;
            int i41111111 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i41111110 & 57344) | (458752 & i41111110) | (3670016 & i41111110) | (i41111110 & 29360128);
            int i41111112 = (i14 >> 18) & 112;
            int i41111113 = i14 >> 3;
            CoreTextFieldKt.a(textFieldValueE, lVar115, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z211119, i38, imeOptionsH14, iVar113, z13, z211118, qVarA, pVarF, i41111111, i41111112 | (i41111113 & bb.c.b.f30796me) | (i41111113 & bb.c.g.f32954lc) | (i34 & 57344), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            keyboardOptions3 = keyboardOptions114;
            z18 = z211118;
            nVar3 = nVar2;
            z19 = z17;
            m0Var3 = m0Var2;
            gVar4 = gVar3;
            iVar2 = iVar113;
            textStyle3 = textStyle2;
            lVar4 = lVar3;
            i39 = i10;
            z20 = z13;
        } else {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i40 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i15 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i17 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i19 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle;
                }
                if (i21 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                if (i23 != 0) {
                    iVarA = i.INSTANCE.a();
                } else {
                    iVarA = iVar;
                }
                if (i25 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (i27 != 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = i10;
                }
                if (i29 != 0) {
                    m0VarA = m0.INSTANCE.a();
                } else {
                    m0VarA = m0Var;
                }
                if (i32 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (i35 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                if ((i13 & 8192) != 0) {
                    solidColor = new SolidColor(l0.INSTANCE.a(), null);
                    i34 &= -7169;
                } else {
                    solidColor = a0Var;
                }
                if (i37 != 0) {
                    qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                } else {
                    qVarA = qVar;
                }
                lVar3 = lVar2;
                a0Var2 = solidColor;
                z16 = z14;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                z17 = z15;
                gVar3 = gVar2;
                m0Var2 = m0VarA;
            } else {
                if (i40 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i15 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i17 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if (i19 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle;
                }
                if (i21 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                if (i23 != 0) {
                    iVarA = i.INSTANCE.a();
                } else {
                    iVarA = iVar;
                }
                if (i25 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (i27 != 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = i10;
                }
                if (i29 != 0) {
                    m0VarA = m0.INSTANCE.a();
                } else {
                    m0VarA = m0Var;
                }
                if (i32 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (i35 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                if ((i13 & 8192) != 0) {
                    solidColor = new SolidColor(l0.INSTANCE.a(), null);
                    i34 &= -7169;
                } else {
                    solidColor = a0Var;
                }
                if (i37 != 0) {
                    qVarA = ComposableSingletons$BasicTextFieldKt.f7672a.a();
                } else {
                    qVarA = qVar;
                }
                lVar3 = lVar2;
                a0Var2 = solidColor;
                z16 = z14;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                z17 = z15;
                gVar3 = gVar2;
                m0Var2 = m0VarA;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-454732590, i14, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:121)");
            }
            pVarF.T(-492369756);
            objU2 = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            boolean z2111110 = z16;
            if (objU2 == companion.a()) {
                a1 a1VarG15 = h2.g(new TextFieldValue(value, 0L, (o0) null, 6, (kotlin.jvm.internal.u) null), null, 2, null);
                pVarF.N(a1VarG15);
                objU2 = a1VarG15;
            }
            pVarF.c0();
            a1Var = (a1) objU2;
            textFieldValueE = TextFieldValue.e(c(a1Var), value, 0L, null, 6, null);
            pVarF.T(511388516);
            zS = pVarF.s(textFieldValueE) | pVarF.s(a1Var);
            i iVar114 = iVarA;
            objU3 = pVarF.U();
            if (zS) {
                objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                            return;
                        }
                        BasicTextFieldKt.d(a1Var, textFieldValueE);
                    }
                };
                pVarF.N(objU3);
            } else {
                objU3 = new yh.a<b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (o0.g(textFieldValueE.getSelection(), BasicTextFieldKt.c(a1Var).getSelection()) && f0.g(textFieldValueE.getComposition(), BasicTextFieldKt.c(a1Var).getComposition())) {
                            return;
                        }
                        BasicTextFieldKt.d(a1Var, textFieldValueE);
                    }
                };
                pVarF.N(objU3);
            }
            pVarF.c0();
            EffectsKt.k((yh.a) objU3, pVarF, 0);
            pVarF.T(1157296644);
            zS2 = pVarF.s(value);
            objU4 = pVarF.U();
            if (zS2) {
                objU4 = h2.g(value, null, 2, null);
                pVarF.N(objU4);
            } else {
                objU4 = h2.g(value, null, 2, null);
                pVarF.N(objU4);
            }
            pVarF.c0();
            a1Var2 = (a1) objU4;
            ImeOptions imeOptionsH15 = keyboardOptions2.h(z17);
            boolean z2111111 = !z17;
            if (z17) {
                i38 = 1;
            } else {
                i38 = i10;
            }
            pVarF.T(1618982084);
            KeyboardOptions keyboardOptions115 = keyboardOptions2;
            zS3 = pVarF.s(a1Var) | pVarF.s(a1Var2) | pVarF.s(onValueChange);
            objU5 = pVarF.U();
            if (zS3) {
                objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                        f0.p(newTextFieldValueState, "newTextFieldValueState");
                        BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                        boolean z2111112 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                        BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                        if (z2111112) {
                            onValueChange.invoke(newTextFieldValueState.i());
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                        a(textFieldValue);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU5);
            } else {
                objU5 = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d TextFieldValue newTextFieldValueState) {
                        f0.p(newTextFieldValueState, "newTextFieldValueState");
                        BasicTextFieldKt.d(a1Var, newTextFieldValueState);
                        boolean z2111112 = !f0.g(BasicTextFieldKt.e(a1Var2), newTextFieldValueState.i());
                        BasicTextFieldKt.f(a1Var2, newTextFieldValueState.i());
                        if (z2111112) {
                            onValueChange.invoke(newTextFieldValueState.i());
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                        a(textFieldValue);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU5);
            }
            pVarF.c0();
            yh.l lVar116 = (yh.l) objU5;
            int i41111114 = i34 << 12;
            int i41111115 = (i14 & bb.c.b.f30796me) | ((i14 >> 6) & bb.c.g.f32954lc) | (i41111114 & 57344) | (458752 & i41111114) | (3670016 & i41111114) | (i41111114 & 29360128);
            int i41111116 = (i14 >> 18) & 112;
            int i41111117 = i14 >> 3;
            CoreTextFieldKt.a(textFieldValueE, lVar116, nVar2, textStyle2, m0Var2, lVar3, gVar3, a0Var2, z2111111, i38, imeOptionsH15, iVar114, z13, z2111110, qVarA, pVarF, i41111115, i41111116 | (i41111117 & bb.c.b.f30796me) | (i41111117 & bb.c.g.f32954lc) | (i34 & 57344), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            keyboardOptions3 = keyboardOptions115;
            z18 = z2111110;
            nVar3 = nVar2;
            z19 = z17;
            m0Var3 = m0Var2;
            gVar4 = gVar3;
            iVar2 = iVar114;
            textStyle3 = textStyle2;
            lVar4 = lVar3;
            i39 = i10;
            z20 = z13;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar11 = nVar3;
        final boolean z2111112 = z20;
        final boolean z2111113 = z18;
        final TextStyle textStyle11 = textStyle3;
        final KeyboardOptions keyboardOptions116 = keyboardOptions3;
        final i iVar115 = iVar2;
        final boolean z2111114 = z19;
        final int i41111118 = i39;
        final m0 m0Var11 = m0Var3;
        final yh.l<? super TextLayoutResult, b2> lVar117 = lVar4;
        final androidx.compose.foundation.interaction.g gVar12 = gVar4;
        final androidx.compose.ui.graphics.a0 a0Var10 = a0Var2;
        final yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, ? super androidx.compose.runtime.p, ? super Integer, b2> qVar9 = qVarA;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i41111119) {
                BasicTextFieldKt.b(value, onValueChange, nVar11, z2111112, z2111113, textStyle11, keyboardOptions116, iVar115, z2111114, i41111118, m0Var11, lVar117, gVar12, a0Var10, qVar9, pVar2, i11 | 1, i12, i13);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue c(a1<TextFieldValue> a1Var) {
        return a1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a1<TextFieldValue> a1Var, TextFieldValue textFieldValue) {
        a1Var.setValue(textFieldValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(a1<String> a1Var) {
        return a1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(a1<String> a1Var, String str) {
        a1Var.setValue(str);
    }
}
