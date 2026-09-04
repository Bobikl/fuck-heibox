package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.g2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!Jy\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "Landroidx/compose/ui/graphics/l0;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "Landroidx/compose/material3/j1;", ak.aF, "(JJJJJJJJJJLandroidx/compose/runtime/p;III)Landroidx/compose/material3/j1;", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "Landroidx/compose/ui/n;", "modifier", "colors", "", "enabled", "Ls1/l;", "thumbSize", "Lkotlin/b2;", ak.av, "(Landroidx/compose/foundation/interaction/g;Landroidx/compose/ui/n;Landroidx/compose/material3/j1;ZJLandroidx/compose/runtime/p;II)V", "Landroidx/compose/material3/k1;", "sliderPositions", "b", "(Landroidx/compose/material3/k1;Landroidx/compose/ui/n;Landroidx/compose/material3/j1;ZLandroidx/compose/runtime/p;II)V", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class SliderDefaults {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final SliderDefaults f10488a = new SliderDefaults();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10489b = 0;

    private SliderDefaults() {
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0171  */
    /* JADX WARN: Code duplicated, block: B:102:0x0177  */
    /* JADX WARN: Code duplicated, block: B:105:0x0191  */
    /* JADX WARN: Code duplicated, block: B:106:0x0196  */
    /* JADX WARN: Code duplicated, block: B:110:0x01db  */
    /* JADX WARN: Code duplicated, block: B:113:0x0218  */
    /* JADX WARN: Code duplicated, block: B:118:0x0226  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x011d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    /* JADX WARN: Code duplicated, block: B:90:0x0124  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0135  */
    /* JADX WARN: Code duplicated, block: B:97:0x014d  */
    @w
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public final void a(@dl.d final androidx.compose.foundation.interaction.g interactionSource, @dl.e androidx.compose.ui.n nVar, @dl.e j1 j1Var, boolean z10, long j10, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        j1 j1Var2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        long j11;
        int i16;
        int i17;
        final boolean z12;
        Object objU;
        androidx.compose.runtime.p.Companion companion;
        SnapshotStateList snapshotStateList;
        boolean zS;
        Object objU2;
        float fG;
        final androidx.compose.ui.n nVar3;
        final j1 j1Var3;
        final long j12;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        androidx.compose.runtime.p pVarF = pVar.F(-290277409);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(interactionSource) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 32 : 16;
            }
            if ((i10 & bb.c.b.f30796me) == 0) {
                if ((i11 & 4) == 0) {
                    j1Var2 = j1Var;
                    int i19 = pVarF.s(j1Var2) ? 256 : 128;
                    i12 |= i19;
                } else {
                    j1Var2 = j1Var;
                }
                i12 |= i19;
            } else {
                j1Var2 = j1Var;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    i12 |= 24576;
                    j11 = j10;
                } else {
                    j11 = j10;
                    if ((57344 & i10) == 0) {
                        if (pVarF.z(j11)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((458752 & i10) == 0) {
                    if (pVarF.s(this)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((374491 & i12) == 74898 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i18 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            j1 j1VarC = c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, (i12 >> 15) & 14, 1023);
                            i12 &= -897;
                            j1Var2 = j1VarC;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if (i15 != 0) {
                            j11 = SliderKt.f10525c;
                        } else {
                            j11 = j10;
                        }
                    } else {
                        pVarF.l();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        z12 = z11;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:673)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = androidx.compose.runtime.e2.f();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    snapshotStateList = (SnapshotStateList) objU;
                    int i20 = i12 & 14;
                    pVarF.T(511388516);
                    zS = pVarF.s(interactionSource) | pVarF.s(snapshotStateList);
                    objU2 = pVarF.U();
                    if (zS || objU2 == companion.a()) {
                        objU2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    EffectsKt.h(interactionSource, (yh.p) objU2, pVarF, i20 | 64);
                    if (!snapshotStateList.isEmpty()) {
                        fG = SliderKt.f10527e;
                    } else {
                        fG = SliderKt.f10526d;
                    }
                    t0.s0 s0Var = t0.s0.f140323a;
                    g2 g2VarD = ShapesKt.d(s0Var.l(), pVarF, 6);
                    long j13 = j11;
                    androidx.compose.ui.n nVarB = HoverableKt.b(IndicationKt.b(SizeKt.D(nVar2, j11), interactionSource, androidx.compose.material.ripple.j.e(false, s1.h.g(s0Var.z() / 2), 0L, pVarF, 54, 4)), interactionSource, false, 2, null);
                    if (!z12) {
                        fG = s1.h.g(0);
                    }
                    androidx.compose.foundation.layout.b1.a(BackgroundKt.c(ShadowKt.b(nVarB, fG, g2VarD, false, 0L, 0L, 24, null), j1Var2.a(z12, pVarF, ((i12 >> 3) & 112) | ((i12 >> 9) & 14)).getValue().M(), g2VarD), pVarF, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    j1Var3 = j1Var2;
                    j12 = j13;
                } else {
                    pVarF.l();
                    nVar3 = nVar2;
                    j1Var3 = j1Var2;
                    z12 = z11;
                    j12 = j11;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21) {
                        this.f10494b.a(interactionSource, nVar3, j1Var3, z12, j12, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            z11 = z10;
            i15 = i11 & 16;
            if (i15 != 0) {
                i12 |= 24576;
                j11 = j10;
            } else {
                j11 = j10;
                if ((57344 & i10) == 0) {
                    if (pVarF.z(j11)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((458752 & i10) == 0) {
                if (pVarF.s(this)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((374491 & i12) == 74898) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        j1 j1VarC2 = c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        j1Var2 = j1VarC2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f10525c;
                    } else {
                        j11 = j10;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        j1 j1VarC3 = c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        j1Var2 = j1VarC3;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f10525c;
                    } else {
                        j11 = j10;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:673)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = androidx.compose.runtime.e2.f();
                    pVarF.N(objU);
                }
                pVarF.c0();
                snapshotStateList = (SnapshotStateList) objU;
                int i21 = i12 & 14;
                pVarF.T(511388516);
                zS = pVarF.s(interactionSource) | pVarF.s(snapshotStateList);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                EffectsKt.h(interactionSource, (yh.p) objU2, pVarF, i21 | 64);
                if (!snapshotStateList.isEmpty()) {
                    fG = SliderKt.f10527e;
                } else {
                    fG = SliderKt.f10526d;
                }
                t0.s0 s0Var2 = t0.s0.f140323a;
                g2 g2VarD2 = ShapesKt.d(s0Var2.l(), pVarF, 6);
                long j14 = j11;
                androidx.compose.ui.n nVarB2 = HoverableKt.b(IndicationKt.b(SizeKt.D(nVar2, j11), interactionSource, androidx.compose.material.ripple.j.e(false, s1.h.g(s0Var2.z() / 2), 0L, pVarF, 54, 4)), interactionSource, false, 2, null);
                if (!z12) {
                    fG = s1.h.g(0);
                }
                androidx.compose.foundation.layout.b1.a(BackgroundKt.c(ShadowKt.b(nVarB2, fG, g2VarD2, false, 0L, 0L, 24, null), j1Var2.a(z12, pVarF, ((i12 >> 3) & 112) | ((i12 >> 9) & 14)).getValue().M(), g2VarD2), pVarF, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                j1Var3 = j1Var2;
                j12 = j14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        j1 j1VarC4 = c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        j1Var2 = j1VarC4;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f10525c;
                    } else {
                        j11 = j10;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        j1 j1VarC5 = c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        j1Var2 = j1VarC5;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f10525c;
                    } else {
                        j11 = j10;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:673)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = androidx.compose.runtime.e2.f();
                    pVarF.N(objU);
                }
                pVarF.c0();
                snapshotStateList = (SnapshotStateList) objU;
                int i22 = i12 & 14;
                pVarF.T(511388516);
                zS = pVarF.s(interactionSource) | pVarF.s(snapshotStateList);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                EffectsKt.h(interactionSource, (yh.p) objU2, pVarF, i22 | 64);
                if (!snapshotStateList.isEmpty()) {
                    fG = SliderKt.f10527e;
                } else {
                    fG = SliderKt.f10526d;
                }
                t0.s0 s0Var3 = t0.s0.f140323a;
                g2 g2VarD3 = ShapesKt.d(s0Var3.l(), pVarF, 6);
                long j15 = j11;
                androidx.compose.ui.n nVarB3 = HoverableKt.b(IndicationKt.b(SizeKt.D(nVar2, j11), interactionSource, androidx.compose.material.ripple.j.e(false, s1.h.g(s0Var3.z() / 2), 0L, pVarF, 54, 4)), interactionSource, false, 2, null);
                if (!z12) {
                    fG = s1.h.g(0);
                }
                androidx.compose.foundation.layout.b1.a(BackgroundKt.c(ShadowKt.b(nVarB3, fG, g2VarD3, false, 0L, 0L, 24, null), j1Var2.a(z12, pVarF, ((i12 >> 3) & 112) | ((i12 >> 9) & 14)).getValue().M(), g2VarD3), pVarF, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                j1Var3 = j1Var2;
                j12 = j15;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i23) {
                    this.f10494b.a(interactionSource, nVar3, j1Var3, z12, j12, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 48;
        nVar2 = nVar;
        if ((i10 & bb.c.b.f30796me) == 0) {
            if ((i11 & 4) == 0) {
                j1Var2 = j1Var;
                if (pVarF.s(j1Var2)) {
                }
                i12 |= i19;
            } else {
                j1Var2 = j1Var;
            }
            i12 |= i19;
        } else {
            j1Var2 = j1Var;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                z11 = z10;
                if (pVarF.u(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                i12 |= 24576;
                j11 = j10;
            } else {
                j11 = j10;
                if ((57344 & i10) == 0) {
                    if (pVarF.z(j11)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((458752 & i10) == 0) {
                if (pVarF.s(this)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((374491 & i12) == 74898) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        j1 j1VarC6 = c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        j1Var2 = j1VarC6;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f10525c;
                    } else {
                        j11 = j10;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        j1 j1VarC7 = c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        j1Var2 = j1VarC7;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f10525c;
                    } else {
                        j11 = j10;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:673)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = androidx.compose.runtime.e2.f();
                    pVarF.N(objU);
                }
                pVarF.c0();
                snapshotStateList = (SnapshotStateList) objU;
                int i23 = i12 & 14;
                pVarF.T(511388516);
                zS = pVarF.s(interactionSource) | pVarF.s(snapshotStateList);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                EffectsKt.h(interactionSource, (yh.p) objU2, pVarF, i23 | 64);
                if (!snapshotStateList.isEmpty()) {
                    fG = SliderKt.f10527e;
                } else {
                    fG = SliderKt.f10526d;
                }
                t0.s0 s0Var4 = t0.s0.f140323a;
                g2 g2VarD4 = ShapesKt.d(s0Var4.l(), pVarF, 6);
                long j16 = j11;
                androidx.compose.ui.n nVarB4 = HoverableKt.b(IndicationKt.b(SizeKt.D(nVar2, j11), interactionSource, androidx.compose.material.ripple.j.e(false, s1.h.g(s0Var4.z() / 2), 0L, pVarF, 54, 4)), interactionSource, false, 2, null);
                if (!z12) {
                    fG = s1.h.g(0);
                }
                androidx.compose.foundation.layout.b1.a(BackgroundKt.c(ShadowKt.b(nVarB4, fG, g2VarD4, false, 0L, 0L, 24, null), j1Var2.a(z12, pVarF, ((i12 >> 3) & 112) | ((i12 >> 9) & 14)).getValue().M(), g2VarD4), pVarF, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                j1Var3 = j1Var2;
                j12 = j16;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        j1 j1VarC8 = c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        j1Var2 = j1VarC8;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f10525c;
                    } else {
                        j11 = j10;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        j1 j1VarC9 = c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        j1Var2 = j1VarC9;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f10525c;
                    } else {
                        j11 = j10;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:673)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = androidx.compose.runtime.e2.f();
                    pVarF.N(objU);
                }
                pVarF.c0();
                snapshotStateList = (SnapshotStateList) objU;
                int i24 = i12 & 14;
                pVarF.T(511388516);
                zS = pVarF.s(interactionSource) | pVarF.s(snapshotStateList);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                EffectsKt.h(interactionSource, (yh.p) objU2, pVarF, i24 | 64);
                if (!snapshotStateList.isEmpty()) {
                    fG = SliderKt.f10527e;
                } else {
                    fG = SliderKt.f10526d;
                }
                t0.s0 s0Var5 = t0.s0.f140323a;
                g2 g2VarD5 = ShapesKt.d(s0Var5.l(), pVarF, 6);
                long j17 = j11;
                androidx.compose.ui.n nVarB5 = HoverableKt.b(IndicationKt.b(SizeKt.D(nVar2, j11), interactionSource, androidx.compose.material.ripple.j.e(false, s1.h.g(s0Var5.z() / 2), 0L, pVarF, 54, 4)), interactionSource, false, 2, null);
                if (!z12) {
                    fG = s1.h.g(0);
                }
                androidx.compose.foundation.layout.b1.a(BackgroundKt.c(ShadowKt.b(nVarB5, fG, g2VarD5, false, 0L, 0L, 24, null), j1Var2.a(z12, pVarF, ((i12 >> 3) & 112) | ((i12 >> 9) & 14)).getValue().M(), g2VarD5), pVarF, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                j1Var3 = j1Var2;
                j12 = j17;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i25) {
                    this.f10494b.a(interactionSource, nVar3, j1Var3, z12, j12, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        z11 = z10;
        i15 = i11 & 16;
        if (i15 != 0) {
            i12 |= 24576;
            j11 = j10;
        } else {
            j11 = j10;
            if ((57344 & i10) == 0) {
                if (pVarF.z(j11)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
        }
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((458752 & i10) == 0) {
            if (pVarF.s(this)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        }
        if ((374491 & i12) == 74898) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    j1 j1VarC10 = c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, (i12 >> 15) & 14, 1023);
                    i12 &= -897;
                    j1Var2 = j1VarC10;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                if (i15 != 0) {
                    j11 = SliderKt.f10525c;
                } else {
                    j11 = j10;
                }
            } else {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    j1 j1VarC11 = c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, (i12 >> 15) & 14, 1023);
                    i12 &= -897;
                    j1Var2 = j1VarC11;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                if (i15 != 0) {
                    j11 = SliderKt.f10525c;
                } else {
                    j11 = j10;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:673)");
            }
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = androidx.compose.runtime.e2.f();
                pVarF.N(objU);
            }
            pVarF.c0();
            snapshotStateList = (SnapshotStateList) objU;
            int i25 = i12 & 14;
            pVarF.T(511388516);
            zS = pVarF.s(interactionSource) | pVarF.s(snapshotStateList);
            objU2 = pVarF.U();
            if (zS) {
                objU2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                pVarF.N(objU2);
            } else {
                objU2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                pVarF.N(objU2);
            }
            pVarF.c0();
            EffectsKt.h(interactionSource, (yh.p) objU2, pVarF, i25 | 64);
            if (!snapshotStateList.isEmpty()) {
                fG = SliderKt.f10527e;
            } else {
                fG = SliderKt.f10526d;
            }
            t0.s0 s0Var6 = t0.s0.f140323a;
            g2 g2VarD6 = ShapesKt.d(s0Var6.l(), pVarF, 6);
            long j18 = j11;
            androidx.compose.ui.n nVarB6 = HoverableKt.b(IndicationKt.b(SizeKt.D(nVar2, j11), interactionSource, androidx.compose.material.ripple.j.e(false, s1.h.g(s0Var6.z() / 2), 0L, pVarF, 54, 4)), interactionSource, false, 2, null);
            if (!z12) {
                fG = s1.h.g(0);
            }
            androidx.compose.foundation.layout.b1.a(BackgroundKt.c(ShadowKt.b(nVarB6, fG, g2VarD6, false, 0L, 0L, 24, null), j1Var2.a(z12, pVarF, ((i12 >> 3) & 112) | ((i12 >> 9) & 14)).getValue().M(), g2VarD6), pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar3 = nVar2;
            j1Var3 = j1Var2;
            j12 = j18;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    j1 j1VarC12 = c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, (i12 >> 15) & 14, 1023);
                    i12 &= -897;
                    j1Var2 = j1VarC12;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                if (i15 != 0) {
                    j11 = SliderKt.f10525c;
                } else {
                    j11 = j10;
                }
            } else {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    j1 j1VarC13 = c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, (i12 >> 15) & 14, 1023);
                    i12 &= -897;
                    j1Var2 = j1VarC13;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                if (i15 != 0) {
                    j11 = SliderKt.f10525c;
                } else {
                    j11 = j10;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:673)");
            }
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = androidx.compose.runtime.e2.f();
                pVarF.N(objU);
            }
            pVarF.c0();
            snapshotStateList = (SnapshotStateList) objU;
            int i26 = i12 & 14;
            pVarF.T(511388516);
            zS = pVarF.s(interactionSource) | pVarF.s(snapshotStateList);
            objU2 = pVarF.U();
            if (zS) {
                objU2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                pVarF.N(objU2);
            } else {
                objU2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                pVarF.N(objU2);
            }
            pVarF.c0();
            EffectsKt.h(interactionSource, (yh.p) objU2, pVarF, i26 | 64);
            if (!snapshotStateList.isEmpty()) {
                fG = SliderKt.f10527e;
            } else {
                fG = SliderKt.f10526d;
            }
            t0.s0 s0Var7 = t0.s0.f140323a;
            g2 g2VarD7 = ShapesKt.d(s0Var7.l(), pVarF, 6);
            long j19 = j11;
            androidx.compose.ui.n nVarB7 = HoverableKt.b(IndicationKt.b(SizeKt.D(nVar2, j11), interactionSource, androidx.compose.material.ripple.j.e(false, s1.h.g(s0Var7.z() / 2), 0L, pVarF, 54, 4)), interactionSource, false, 2, null);
            if (!z12) {
                fG = s1.h.g(0);
            }
            androidx.compose.foundation.layout.b1.a(BackgroundKt.c(ShadowKt.b(nVarB7, fG, g2VarD7, false, 0L, 0L, 24, null), j1Var2.a(z12, pVarF, ((i12 >> 3) & 112) | ((i12 >> 9) & 14)).getValue().M(), g2VarD7), pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar3 = nVar2;
            j1Var3 = j1Var2;
            j12 = j19;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i27) {
                this.f10494b.a(interactionSource, nVar3, j1Var3, z12, j12, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v2 ??, still in use, count: 1, list:
          (r14v2 ?? I:java.lang.Object) from 0x0182: INVOKE (r11v3 ?? I:androidx.compose.runtime.p), (r14v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.p.N(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.material3.w
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public final void b(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v2 ??, still in use, count: 1, list:
          (r14v2 ?? I:java.lang.Object) from 0x0182: INVOKE (r11v3 ?? I:androidx.compose.runtime.p), (r14v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.p.N(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    @dl.d
    @androidx.compose.runtime.h
    public final j1 c(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @dl.e androidx.compose.runtime.p pVar, int i10, int i11, int i12) {
        pVar.T(885588574);
        long jK = (i12 & 1) != 0 ? ColorSchemeKt.k(t0.s0.f140323a.i(), pVar, 6) : j10;
        long jK2 = (i12 & 2) != 0 ? ColorSchemeKt.k(t0.s0.f140323a.a(), pVar, 6) : j11;
        long jW = (i12 & 4) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.s0.f140323a.A(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jK3 = (i12 & 8) != 0 ? ColorSchemeKt.k(t0.s0.f140323a.o(), pVar, 6) : j13;
        long jW2 = (i12 & 16) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.s0.f140323a.E(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jI = (i12 & 32) != 0 ? androidx.compose.ui.graphics.n0.i(androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.s0.f140323a.e(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o0.f12059a.a(pVar, 6).A()) : j15;
        long jW3 = (i12 & 64) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.s0.f140323a.d(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jW4 = (i12 & 128) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.s0.f140323a.D(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jW5 = (i12 & 256) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.s0.f140323a.g(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long jW6 = (i12 & 512) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.s0.f140323a.D(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if (ComposerKt.g0()) {
            ComposerKt.w0(885588574, i10, i11, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:618)");
        }
        j1 j1Var = new j1(jK, jK2, jW, jK3, jW2, jI, jW3, jW4, jW5, jW6, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return j1Var;
    }
}
