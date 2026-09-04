package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.state.ToggleableState;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u001e\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001aA\u0010&\u001a\u00020\u0003*\u00020\u00172\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010)\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010)\"\u0014\u0010,\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010)\"\u0017\u00100\u001a\u00020-8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b.\u0010/\"\u0017\u00102\u001a\u00020-8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u0010/\"\u0017\u00104\u001a\u00020-8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b3\u0010/\"\u0017\u00106\u001a\u00020-8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b5\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, d2 = {"", "checked", "Lkotlin/Function1;", "Lkotlin/b2;", "onCheckedChange", "Landroidx/compose/ui/n;", "modifier", "enabled", "Landroidx/compose/material3/j;", "colors", "Landroidx/compose/foundation/interaction/g;", "interactionSource", ak.av, "(ZLyh/l;Landroidx/compose/ui/n;ZLandroidx/compose/material3/j;Landroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", ak.aF, "(Landroidx/compose/ui/state/ToggleableState;Lyh/a;Landroidx/compose/ui/n;ZLandroidx/compose/material3/j;Landroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/p;II)V", "value", "b", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/n;Landroidx/compose/material3/j;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/ui/graphics/drawscope/g;", "Landroidx/compose/ui/graphics/l0;", "boxColor", "borderColor", "", "radius", "strokeWidth", "i", "(Landroidx/compose/ui/graphics/drawscope/g;JJFF)V", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "Landroidx/compose/material3/i;", "drawingCache", "j", "(Landroidx/compose/ui/graphics/drawscope/g;JFFFLandroidx/compose/material3/i;)V", "", "I", "BoxInDuration", "BoxOutDuration", "CheckAnimationDuration", "Ls1/h;", "d", "F", "CheckboxDefaultPadding", "e", "CheckboxSize", "f", "StrokeWidth", "g", "RadiusSize", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class CheckboxKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f9042a = 50;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f9043b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f9044c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f9045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f9046e = s1.h.g(20);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f9047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f9048g;

    /* JADX INFO: compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9080a;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            f9080a = iArr;
        }
    }

    static {
        float f10 = 2;
        f9045d = s1.h.g(f10);
        f9047f = s1.h.g(f10);
        f9048g = s1.h.g(f10);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014e  */
    /* JADX WARN: Code duplicated, block: B:103:0x015a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0173  */
    /* JADX WARN: Code duplicated, block: B:107:0x017b  */
    /* JADX WARN: Code duplicated, block: B:109:0x018a  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x011a  */
    /* JADX WARN: Code duplicated, block: B:92:0x011d  */
    /* JADX WARN: Code duplicated, block: B:94:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x013e  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(final boolean z10, @dl.e final yh.l<? super Boolean, kotlin.b2> lVar, @dl.e androidx.compose.ui.n nVar, boolean z11, @dl.e j jVar, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        boolean z12;
        int i14;
        j jVar2;
        int i15;
        androidx.compose.foundation.interaction.g gVar2;
        int i16;
        androidx.compose.ui.n nVar3;
        boolean z13;
        j jVarA;
        androidx.compose.foundation.interaction.g gVar3;
        int i17;
        j jVar3;
        Object objU;
        yh.a aVar;
        final boolean z14;
        final androidx.compose.foundation.interaction.g gVar4;
        boolean zS;
        Object objU2;
        androidx.compose.runtime.u1 u1VarH;
        androidx.compose.runtime.p pVarF = pVar.F(-1406741137);
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
            i12 |= pVarF.s(lVar) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    z12 = z11;
                    if (pVarF.u(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 57344) == 0) {
                    if ((i11 & 16) == 0) {
                        jVar2 = jVar;
                        int i19 = pVarF.s(jVar2) ? 16384 : 8192;
                        i12 |= i19;
                    } else {
                        jVar2 = jVar;
                    }
                    i12 |= i19;
                } else {
                    jVar2 = jVar;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    gVar2 = gVar;
                } else {
                    gVar2 = gVar;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(gVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((374491 & i12) == 74898 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i18 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i11 & 16) != 0) {
                            jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -57345;
                        } else {
                            jVarA = jVar2;
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                        j jVar4 = jVarA;
                        i17 = i12;
                        jVar3 = jVar4;
                    } else {
                        pVarF.l();
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        i17 = i12;
                        nVar3 = nVar2;
                        z13 = z12;
                        jVar3 = jVar2;
                        gVar3 = gVar2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1406741137, i17, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
                    }
                    ToggleableState toggleableStateA = k1.a.a(z10);
                    if (lVar != null) {
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf) | pVarF.s(lVar);
                        objU2 = pVarF.U();
                        if (zS || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU2 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                    invoke2();
                                    return kotlin.b2.f124493a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    lVar.invoke(Boolean.valueOf(!z10));
                                }
                            };
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        aVar = (yh.a) objU2;
                    } else {
                        aVar = null;
                    }
                    c(toggleableStateA, aVar, nVar3, z13, jVar3, gVar3, pVarF, (i17 & bb.c.b.f30796me) | (i17 & bb.c.g.f32954lc) | (i17 & 57344) | (i17 & 458752), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    jVar2 = jVar3;
                    z14 = z13;
                    gVar4 = gVar3;
                } else {
                    pVarF.l();
                    nVar3 = nVar2;
                    z14 = z12;
                    gVar4 = gVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar4 = nVar3;
                final j jVar5 = jVar2;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                        CheckboxKt.a(z10, lVar, nVar4, z14, jVar5, gVar4, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            z12 = z11;
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    jVar2 = jVar;
                    if (pVarF.s(jVar2)) {
                    }
                    i12 |= i19;
                } else {
                    jVar2 = jVar;
                }
                i12 |= i19;
            } else {
                jVar2 = jVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(gVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((374491 & i12) == 74898) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        jVarA = jVar2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    j jVar6 = jVarA;
                    i17 = i12;
                    jVar3 = jVar6;
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        jVarA = jVar2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    j jVar7 = jVarA;
                    i17 = i12;
                    jVar3 = jVar7;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1406741137, i17, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
                }
                ToggleableState toggleableStateA2 = k1.a.a(z10);
                if (lVar != null) {
                    Boolean boolValueOf2 = Boolean.valueOf(z10);
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf2) | pVarF.s(lVar);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                invoke2();
                                return kotlin.b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                lVar.invoke(Boolean.valueOf(!z10));
                            }
                        };
                        pVarF.N(objU2);
                    } else {
                        objU2 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                invoke2();
                                return kotlin.b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                lVar.invoke(Boolean.valueOf(!z10));
                            }
                        };
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    aVar = (yh.a) objU2;
                } else {
                    aVar = null;
                }
                c(toggleableStateA2, aVar, nVar3, z13, jVar3, gVar3, pVarF, (i17 & bb.c.b.f30796me) | (i17 & bb.c.g.f32954lc) | (i17 & 57344) | (i17 & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                jVar2 = jVar3;
                z14 = z13;
                gVar4 = gVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        jVarA = jVar2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    j jVar8 = jVarA;
                    i17 = i12;
                    jVar3 = jVar8;
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        jVarA = jVar2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    j jVar9 = jVarA;
                    i17 = i12;
                    jVar3 = jVar9;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1406741137, i17, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
                }
                ToggleableState toggleableStateA3 = k1.a.a(z10);
                if (lVar != null) {
                    Boolean boolValueOf3 = Boolean.valueOf(z10);
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf3) | pVarF.s(lVar);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                invoke2();
                                return kotlin.b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                lVar.invoke(Boolean.valueOf(!z10));
                            }
                        };
                        pVarF.N(objU2);
                    } else {
                        objU2 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                invoke2();
                                return kotlin.b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                lVar.invoke(Boolean.valueOf(!z10));
                            }
                        };
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    aVar = (yh.a) objU2;
                } else {
                    aVar = null;
                }
                c(toggleableStateA3, aVar, nVar3, z13, jVar3, gVar3, pVarF, (i17 & bb.c.b.f30796me) | (i17 & bb.c.g.f32954lc) | (i17 & 57344) | (i17 & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                jVar2 = jVar3;
                z14 = z13;
                gVar4 = gVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar5 = nVar3;
            final j jVar10 = jVar2;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                    CheckboxKt.a(z10, lVar, nVar5, z14, jVar10, gVar4, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        nVar2 = nVar;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                z12 = z11;
                if (pVarF.u(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    jVar2 = jVar;
                    if (pVarF.s(jVar2)) {
                    }
                    i12 |= i19;
                } else {
                    jVar2 = jVar;
                }
                i12 |= i19;
            } else {
                jVar2 = jVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(gVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((374491 & i12) == 74898) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        jVarA = jVar2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    j jVar11 = jVarA;
                    i17 = i12;
                    jVar3 = jVar11;
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        jVarA = jVar2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    j jVar12 = jVarA;
                    i17 = i12;
                    jVar3 = jVar12;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1406741137, i17, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
                }
                ToggleableState toggleableStateA4 = k1.a.a(z10);
                if (lVar != null) {
                    Boolean boolValueOf4 = Boolean.valueOf(z10);
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf4) | pVarF.s(lVar);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                invoke2();
                                return kotlin.b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                lVar.invoke(Boolean.valueOf(!z10));
                            }
                        };
                        pVarF.N(objU2);
                    } else {
                        objU2 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                invoke2();
                                return kotlin.b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                lVar.invoke(Boolean.valueOf(!z10));
                            }
                        };
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    aVar = (yh.a) objU2;
                } else {
                    aVar = null;
                }
                c(toggleableStateA4, aVar, nVar3, z13, jVar3, gVar3, pVarF, (i17 & bb.c.b.f30796me) | (i17 & bb.c.g.f32954lc) | (i17 & 57344) | (i17 & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                jVar2 = jVar3;
                z14 = z13;
                gVar4 = gVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        jVarA = jVar2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    j jVar13 = jVarA;
                    i17 = i12;
                    jVar3 = jVar13;
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        jVarA = jVar2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    j jVar14 = jVarA;
                    i17 = i12;
                    jVar3 = jVar14;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1406741137, i17, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
                }
                ToggleableState toggleableStateA5 = k1.a.a(z10);
                if (lVar != null) {
                    Boolean boolValueOf5 = Boolean.valueOf(z10);
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf5) | pVarF.s(lVar);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                invoke2();
                                return kotlin.b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                lVar.invoke(Boolean.valueOf(!z10));
                            }
                        };
                        pVarF.N(objU2);
                    } else {
                        objU2 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                invoke2();
                                return kotlin.b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                lVar.invoke(Boolean.valueOf(!z10));
                            }
                        };
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    aVar = (yh.a) objU2;
                } else {
                    aVar = null;
                }
                c(toggleableStateA5, aVar, nVar3, z13, jVar3, gVar3, pVarF, (i17 & bb.c.b.f30796me) | (i17 & bb.c.g.f32954lc) | (i17 & 57344) | (i17 & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                jVar2 = jVar3;
                z14 = z13;
                gVar4 = gVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar6 = nVar3;
            final j jVar15 = jVar2;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                    CheckboxKt.a(z10, lVar, nVar6, z14, jVar15, gVar4, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        z12 = z11;
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                jVar2 = jVar;
                if (pVarF.s(jVar2)) {
                }
                i12 |= i19;
            } else {
                jVar2 = jVar;
            }
            i12 |= i19;
        } else {
            jVar2 = jVar;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
            gVar2 = gVar;
        } else {
            gVar2 = gVar;
            if ((i10 & 458752) == 0) {
                if (pVarF.s(gVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((374491 & i12) == 74898) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i11 & 16) != 0) {
                    jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    i12 &= -57345;
                } else {
                    jVarA = jVar2;
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar;
                }
                j jVar16 = jVarA;
                i17 = i12;
                jVar3 = jVar16;
            } else {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i11 & 16) != 0) {
                    jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    i12 &= -57345;
                } else {
                    jVarA = jVar2;
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar;
                }
                j jVar17 = jVarA;
                i17 = i12;
                jVar3 = jVar17;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1406741137, i17, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
            }
            ToggleableState toggleableStateA6 = k1.a.a(z10);
            if (lVar != null) {
                Boolean boolValueOf6 = Boolean.valueOf(z10);
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf6) | pVarF.s(lVar);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                            invoke2();
                            return kotlin.b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            lVar.invoke(Boolean.valueOf(!z10));
                        }
                    };
                    pVarF.N(objU2);
                } else {
                    objU2 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                            invoke2();
                            return kotlin.b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            lVar.invoke(Boolean.valueOf(!z10));
                        }
                    };
                    pVarF.N(objU2);
                }
                pVarF.c0();
                aVar = (yh.a) objU2;
            } else {
                aVar = null;
            }
            c(toggleableStateA6, aVar, nVar3, z13, jVar3, gVar3, pVarF, (i17 & bb.c.b.f30796me) | (i17 & bb.c.g.f32954lc) | (i17 & 57344) | (i17 & 458752), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            jVar2 = jVar3;
            z14 = z13;
            gVar4 = gVar3;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i11 & 16) != 0) {
                    jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    i12 &= -57345;
                } else {
                    jVarA = jVar2;
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar;
                }
                j jVar18 = jVarA;
                i17 = i12;
                jVar3 = jVar18;
            } else {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i11 & 16) != 0) {
                    jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    i12 &= -57345;
                } else {
                    jVarA = jVar2;
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar;
                }
                j jVar19 = jVarA;
                i17 = i12;
                jVar3 = jVar19;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1406741137, i17, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
            }
            ToggleableState toggleableStateA7 = k1.a.a(z10);
            if (lVar != null) {
                Boolean boolValueOf7 = Boolean.valueOf(z10);
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf7) | pVarF.s(lVar);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                            invoke2();
                            return kotlin.b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            lVar.invoke(Boolean.valueOf(!z10));
                        }
                    };
                    pVarF.N(objU2);
                } else {
                    objU2 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                            invoke2();
                            return kotlin.b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            lVar.invoke(Boolean.valueOf(!z10));
                        }
                    };
                    pVarF.N(objU2);
                }
                pVarF.c0();
                aVar = (yh.a) objU2;
            } else {
                aVar = null;
            }
            c(toggleableStateA7, aVar, nVar3, z13, jVar3, gVar3, pVarF, (i17 & bb.c.b.f30796me) | (i17 & bb.c.g.f32954lc) | (i17 & 57344) | (i17 & 458752), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            jVar2 = jVar3;
            z14 = z13;
            gVar4 = gVar3;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar7 = nVar3;
        final j jVar110 = jVar2;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                CheckboxKt.a(z10, lVar, nVar7, z14, jVar110, gVar4, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:110:0x0212  */
    /* JADX WARN: Code duplicated, block: B:113:0x0270 A[LOOP:0: B:112:0x026e->B:113:0x0270, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0288  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0171  */
    /* JADX WARN: Code duplicated, block: B:77:0x0177  */
    /* JADX WARN: Code duplicated, block: B:91:0x0199  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01be  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c1  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void b(final boolean z10, final ToggleableState toggleableState, final androidx.compose.ui.n nVar, final j jVar, androidx.compose.runtime.p pVar, final int i10) {
        float f10;
        float f11;
        final m2 m2VarM;
        int i11;
        int i12;
        float f12;
        int i13;
        int i14;
        final m2 m2VarM2;
        Object objU;
        final i iVar;
        final m2<androidx.compose.ui.graphics.l0> m2VarC;
        final m2<androidx.compose.ui.graphics.l0> m2VarB;
        final m2<androidx.compose.ui.graphics.l0> m2VarA;
        Object[] objArr;
        boolean zS;
        int i15;
        Object objU2;
        androidx.compose.runtime.p pVarF = pVar.F(2007131616);
        int i16 = (i10 & 14) == 0 ? (pVarF.u(z10) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i16 |= pVarF.s(toggleableState) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i16 |= pVarF.s(nVar) ? 256 : 128;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            i16 |= pVarF.s(jVar) ? 2048 : 1024;
        }
        int i17 = i16;
        if ((i17 & bb.c.f.br) == 1170 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(2007131616, i17, -1, "androidx.compose.material3.CheckboxImpl (Checkbox.kt:227)");
            }
            int i18 = i17 >> 3;
            int i19 = i18 & 14;
            Transition transitionO = TransitionKt.o(toggleableState, null, pVarF, i19, 2);
            CheckboxKt$CheckboxImpl$checkDrawFraction$1 checkboxKt$CheckboxImpl$checkDrawFraction$1 = new yh.q<Transition.b<ToggleableState>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkDrawFraction$1
                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @dl.d
                @androidx.compose.runtime.h
                public final androidx.compose.animation.core.f0<Float> a(@dl.d Transition.b<ToggleableState> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i20) {
                    androidx.compose.animation.core.f0<Float> f0VarL;
                    kotlin.jvm.internal.f0.p(animateFloat, "$this$animateFloat");
                    pVar2.T(1373301606);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1373301606, i20, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:235)");
                    }
                    ToggleableState toggleableStateC = animateFloat.c();
                    ToggleableState toggleableState2 = ToggleableState.Off;
                    if (toggleableStateC == toggleableState2) {
                        f0VarL = androidx.compose.animation.core.i.q(100, 0, null, 6, null);
                    } else {
                        f0VarL = animateFloat.a() == toggleableState2 ? androidx.compose.animation.core.i.l(100) : androidx.compose.animation.core.i.o(0.0f, 0.0f, null, 7, null);
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return f0VarL;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<Float> invoke(Transition.b<ToggleableState> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    return a(bVar, pVar2, num.intValue());
                }
            };
            pVarF.T(1399891485);
            kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
            androidx.compose.animation.core.f1<Float, androidx.compose.animation.core.l> f1VarE = VectorConvertersKt.e(yVar);
            pVarF.T(1847725064);
            ToggleableState toggleableState2 = (ToggleableState) transitionO.h();
            pVarF.T(1800065638);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1800065638, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:242)");
            }
            int[] iArr = a.f9080a;
            int i20 = iArr[toggleableState2.ordinal()];
            float f13 = 0.0f;
            if (i20 == 1) {
                f10 = 1.0f;
            } else if (i20 != 2) {
                if (i20 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            Float fValueOf = Float.valueOf(f10);
            ToggleableState toggleableState3 = (ToggleableState) transitionO.o();
            pVarF.T(1800065638);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1800065638, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:242)");
            }
            int i21 = iArr[toggleableState3.ordinal()];
            if (i21 != 1) {
                if (i21 == 2) {
                    f11 = 0.0f;
                } else if (i21 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                m2VarM = TransitionKt.m(transitionO, fValueOf, Float.valueOf(f11), checkboxKt$CheckboxImpl$checkDrawFraction$1.invoke(transitionO.m(), pVarF, 0), f1VarE, "FloatAnimation", pVarF, 0);
                pVarF.c0();
                pVarF.c0();
                CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 = new yh.q<Transition.b<ToggleableState>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1
                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @dl.d
                    @androidx.compose.runtime.h
                    public final androidx.compose.animation.core.f0<Float> a(@dl.d Transition.b<ToggleableState> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i22) {
                        androidx.compose.animation.core.f0<Float> f0VarL;
                        kotlin.jvm.internal.f0.p(animateFloat, "$this$animateFloat");
                        pVar2.T(-1324481169);
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1324481169, i22, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:251)");
                        }
                        ToggleableState toggleableStateC = animateFloat.c();
                        ToggleableState toggleableState4 = ToggleableState.Off;
                        if (toggleableStateC == toggleableState4) {
                            f0VarL = androidx.compose.animation.core.i.m(0, 1, null);
                        } else {
                            f0VarL = animateFloat.a() == toggleableState4 ? androidx.compose.animation.core.i.l(100) : androidx.compose.animation.core.i.q(100, 0, null, 6, null);
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar2.c0();
                        return f0VarL;
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<Float> invoke(Transition.b<ToggleableState> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                        return a(bVar, pVar2, num.intValue());
                    }
                };
                pVarF.T(1399891485);
                androidx.compose.animation.core.f1<Float, androidx.compose.animation.core.l> f1VarE2 = VectorConvertersKt.e(yVar);
                pVarF.T(1847725064);
                ToggleableState toggleableState4 = (ToggleableState) transitionO.h();
                pVarF.T(-1426969489);
                if (ComposerKt.g0()) {
                    i11 = -1;
                    ComposerKt.w0(-1426969489, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:258)");
                } else {
                    i11 = -1;
                }
                i12 = iArr[toggleableState4.ordinal()];
                if (i12 != 1 || i12 == 2) {
                    f12 = 0.0f;
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f12 = 1.0f;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                Float fValueOf2 = Float.valueOf(f12);
                ToggleableState toggleableState5 = (ToggleableState) transitionO.o();
                pVarF.T(-1426969489);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1426969489, 0, i11, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:258)");
                }
                i13 = iArr[toggleableState5.ordinal()];
                if (i13 != 1) {
                    i14 = 2;
                    if (i13 != 2) {
                        if (i13 == 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f13 = 1.0f;
                    }
                } else {
                    i14 = 2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                int i22 = i14;
                m2VarM2 = TransitionKt.m(transitionO, fValueOf2, Float.valueOf(f13), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1.invoke(transitionO.m(), pVarF, 0), f1VarE2, "FloatAnimation", pVarF, 0);
                pVarF.c0();
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new i(null, null, null, 7, null);
                    pVarF.N(objU);
                }
                pVarF.c0();
                iVar = (i) objU;
                m2VarC = jVar.c(toggleableState, pVarF, i19 | ((i17 >> 6) & 112));
                int i23 = (i18 & bb.c.b.f30796me) | (i17 & 14) | (i17 & 112);
                m2VarB = jVar.b(z10, toggleableState, pVarF, i23);
                m2VarA = jVar.a(z10, toggleableState, pVarF, i23);
                androidx.compose.ui.n nVarU = SizeKt.u(SizeKt.N(nVar, androidx.compose.ui.c.INSTANCE.i(), false, i22, null), f9046e);
                objArr = new Object[6];
                objArr[0] = m2VarB;
                objArr[1] = m2VarA;
                objArr[i22] = m2VarC;
                objArr[3] = m2VarM;
                objArr[4] = m2VarM2;
                objArr[5] = iVar;
                pVarF.T(-568225417);
                zS = false;
                for (i15 = 0; i15 < 6; i15++) {
                    zS |= pVarF.s(objArr[i15]);
                }
                objU2 = pVarF.U();
                if (zS || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                            kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                            float fFloor = (float) Math.floor(Canvas.E1(CheckboxKt.f9047f));
                            CheckboxKt.i(Canvas, m2VarB.getValue().M(), m2VarA.getValue().M(), Canvas.E1(CheckboxKt.f9048g), fFloor);
                            CheckboxKt.j(Canvas, m2VarC.getValue().M(), m2VarM.getValue().floatValue(), m2VarM2.getValue().floatValue(), fFloor, iVar);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                            a(gVar);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU2);
                }
                pVarF.c0();
                CanvasKt.b(nVarU, (yh.l) objU2, pVarF, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
            f11 = 1.0f;
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            m2VarM = TransitionKt.m(transitionO, fValueOf, Float.valueOf(f11), checkboxKt$CheckboxImpl$checkDrawFraction$1.invoke(transitionO.m(), pVarF, 0), f1VarE, "FloatAnimation", pVarF, 0);
            pVarF.c0();
            pVarF.c0();
            CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 = new yh.q<Transition.b<ToggleableState>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1
                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @dl.d
                @androidx.compose.runtime.h
                public final androidx.compose.animation.core.f0<Float> a(@dl.d Transition.b<ToggleableState> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i24) {
                    androidx.compose.animation.core.f0<Float> f0VarL;
                    kotlin.jvm.internal.f0.p(animateFloat, "$this$animateFloat");
                    pVar2.T(-1324481169);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1324481169, i24, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:251)");
                    }
                    ToggleableState toggleableStateC = animateFloat.c();
                    ToggleableState toggleableState6 = ToggleableState.Off;
                    if (toggleableStateC == toggleableState6) {
                        f0VarL = androidx.compose.animation.core.i.m(0, 1, null);
                    } else {
                        f0VarL = animateFloat.a() == toggleableState6 ? androidx.compose.animation.core.i.l(100) : androidx.compose.animation.core.i.q(100, 0, null, 6, null);
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return f0VarL;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<Float> invoke(Transition.b<ToggleableState> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    return a(bVar, pVar2, num.intValue());
                }
            };
            pVarF.T(1399891485);
            androidx.compose.animation.core.f1<Float, androidx.compose.animation.core.l> f1VarE3 = VectorConvertersKt.e(yVar);
            pVarF.T(1847725064);
            ToggleableState toggleableState6 = (ToggleableState) transitionO.h();
            pVarF.T(-1426969489);
            if (ComposerKt.g0()) {
                i11 = -1;
                ComposerKt.w0(-1426969489, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:258)");
            } else {
                i11 = -1;
            }
            i12 = iArr[toggleableState6.ordinal()];
            if (i12 != 1) {
            }
            f12 = 0.0f;
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            Float fValueOf3 = Float.valueOf(f12);
            ToggleableState toggleableState7 = (ToggleableState) transitionO.o();
            pVarF.T(-1426969489);
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1426969489, 0, i11, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:258)");
            }
            i13 = iArr[toggleableState7.ordinal()];
            if (i13 != 1) {
                i14 = 2;
                if (i13 != 2) {
                    if (i13 == 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = 1.0f;
                }
            } else {
                i14 = 2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            int i24 = i14;
            m2VarM2 = TransitionKt.m(transitionO, fValueOf3, Float.valueOf(f13), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.invoke(transitionO.m(), pVarF, 0), f1VarE3, "FloatAnimation", pVarF, 0);
            pVarF.c0();
            pVarF.c0();
            pVarF.T(-492369756);
            objU = pVarF.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new i(null, null, null, 7, null);
                pVarF.N(objU);
            }
            pVarF.c0();
            iVar = (i) objU;
            m2VarC = jVar.c(toggleableState, pVarF, i19 | ((i17 >> 6) & 112));
            int i25 = (i18 & bb.c.b.f30796me) | (i17 & 14) | (i17 & 112);
            m2VarB = jVar.b(z10, toggleableState, pVarF, i25);
            m2VarA = jVar.a(z10, toggleableState, pVarF, i25);
            androidx.compose.ui.n nVarU2 = SizeKt.u(SizeKt.N(nVar, androidx.compose.ui.c.INSTANCE.i(), false, i24, null), f9046e);
            objArr = new Object[6];
            objArr[0] = m2VarB;
            objArr[1] = m2VarA;
            objArr[i24] = m2VarC;
            objArr[3] = m2VarM;
            objArr[4] = m2VarM2;
            objArr[5] = iVar;
            pVarF.T(-568225417);
            zS = false;
            while (i15 < 6) {
                zS |= pVarF.s(objArr[i15]);
            }
            objU2 = pVarF.U();
            if (zS) {
                objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        float fFloor = (float) Math.floor(Canvas.E1(CheckboxKt.f9047f));
                        CheckboxKt.i(Canvas, m2VarB.getValue().M(), m2VarA.getValue().M(), Canvas.E1(CheckboxKt.f9048g), fFloor);
                        CheckboxKt.j(Canvas, m2VarC.getValue().M(), m2VarM.getValue().floatValue(), m2VarM2.getValue().floatValue(), fFloor, iVar);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                        a(gVar);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU2);
            } else {
                objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        float fFloor = (float) Math.floor(Canvas.E1(CheckboxKt.f9047f));
                        CheckboxKt.i(Canvas, m2VarB.getValue().M(), m2VarA.getValue().M(), Canvas.E1(CheckboxKt.f9048g), fFloor);
                        CheckboxKt.j(Canvas, m2VarC.getValue().M(), m2VarM.getValue().floatValue(), m2VarM2.getValue().floatValue(), fFloor, iVar);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                        a(gVar);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU2);
            }
            pVarF.c0();
            CanvasKt.b(nVarU2, (yh.l) objU2, pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i26) {
                CheckboxKt.b(z10, toggleableState, nVar, jVar, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016d  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0127  */
    /* JADX WARN: Code duplicated, block: B:94:0x0139  */
    /* JADX WARN: Code duplicated, block: B:96:0x014e  */
    /* JADX WARN: Code duplicated, block: B:99:0x015f  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void c(@dl.d final ToggleableState state, @dl.e final yh.a<kotlin.b2> aVar, @dl.e androidx.compose.ui.n nVar, boolean z10, @dl.e j jVar, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        boolean z11;
        int i14;
        j jVarA;
        int i15;
        androidx.compose.foundation.interaction.g gVar2;
        int i16;
        androidx.compose.ui.n nVar3;
        boolean z12;
        androidx.compose.foundation.interaction.g gVar3;
        androidx.compose.ui.n nVar4;
        boolean z13;
        j jVar2;
        Object objU;
        int i17;
        androidx.compose.ui.n nVarE;
        androidx.compose.ui.n nVarC;
        final androidx.compose.ui.n nVar5;
        final boolean z14;
        final j jVar3;
        final androidx.compose.foundation.interaction.g gVar4;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(state, "state");
        androidx.compose.runtime.p pVarF = pVar.F(-1608358065);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(aVar) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 256 : 128;
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
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        jVarA = jVar;
                        int i19 = pVarF.s(jVarA) ? 16384 : 8192;
                        i12 |= i19;
                    } else {
                        jVarA = jVar;
                    }
                    i12 |= i19;
                } else {
                    jVarA = jVar;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    gVar2 = gVar;
                } else {
                    gVar2 = gVar;
                    if ((458752 & i10) == 0) {
                        if (pVarF.s(gVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((374491 & i12) == 74898 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i18 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            z13 = z12;
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            jVar2 = jVarA;
                            i17 = i12;
                            nVar4 = nVar3;
                        } else {
                            gVar3 = gVar;
                            nVar4 = nVar3;
                            z13 = z12;
                            jVar2 = jVarA;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:135)");
                        }
                        pVarF.T(1797978036);
                        if (aVar != null) {
                            nVarE = ToggleableKt.e(androidx.compose.ui.n.INSTANCE, state, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.d.f139591a.F() / 2), 0L, pVarF, 54, 4), z13, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.b()), aVar);
                        } else {
                            nVarE = androidx.compose.ui.n.INSTANCE;
                        }
                        pVarF.c0();
                        if (aVar != null) {
                            nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
                        } else {
                            nVarC = androidx.compose.ui.n.INSTANCE;
                        }
                        b(z13, state, PaddingKt.k(nVar4.s0(nVarC).s0(nVarE), f9045d), jVar2, pVarF, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & bb.c.g.f32954lc));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar5 = nVar4;
                        z14 = z13;
                        jVar3 = jVar2;
                        gVar4 = gVar3;
                    } else {
                        pVarF.l();
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        nVar4 = nVar2;
                        z13 = z11;
                        jVar2 = jVarA;
                        gVar3 = gVar2;
                    }
                    i17 = i12;
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:135)");
                    }
                    pVarF.T(1797978036);
                    if (aVar != null) {
                        nVarE = ToggleableKt.e(androidx.compose.ui.n.INSTANCE, state, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.d.f139591a.F() / 2), 0L, pVarF, 54, 4), z13, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.b()), aVar);
                    } else {
                        nVarE = androidx.compose.ui.n.INSTANCE;
                    }
                    pVarF.c0();
                    if (aVar != null) {
                        nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
                    } else {
                        nVarC = androidx.compose.ui.n.INSTANCE;
                    }
                    b(z13, state, PaddingKt.k(nVar4.s0(nVarC).s0(nVarE), f9045d), jVar2, pVarF, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & bb.c.g.f32954lc));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar4;
                    z14 = z13;
                    jVar3 = jVar2;
                    gVar4 = gVar3;
                } else {
                    pVarF.l();
                    nVar5 = nVar2;
                    z14 = z11;
                    jVar3 = jVarA;
                    pVarF = pVarF;
                    gVar4 = gVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$TriStateCheckbox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                        CheckboxKt.c(state, aVar, nVar5, z14, jVar3, gVar4, pVar2, i10 | 1, i11);
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
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    jVarA = jVar;
                    if (pVarF.s(jVarA)) {
                    }
                    i12 |= i19;
                } else {
                    jVarA = jVar;
                }
                i12 |= i19;
            } else {
                jVarA = jVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if ((458752 & i10) == 0) {
                    if (pVarF.s(gVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((374491 & i12) == 74898) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        z13 = z12;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        jVar2 = jVarA;
                        i17 = i12;
                        nVar4 = nVar3;
                    } else {
                        gVar3 = gVar;
                        nVar4 = nVar3;
                        z13 = z12;
                        jVar2 = jVarA;
                        i17 = i12;
                    }
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        z13 = z12;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        jVar2 = jVarA;
                        i17 = i12;
                        nVar4 = nVar3;
                    } else {
                        gVar3 = gVar;
                        nVar4 = nVar3;
                        z13 = z12;
                        jVar2 = jVarA;
                        i17 = i12;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:135)");
                }
                pVarF.T(1797978036);
                if (aVar != null) {
                    nVarE = ToggleableKt.e(androidx.compose.ui.n.INSTANCE, state, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.d.f139591a.F() / 2), 0L, pVarF, 54, 4), z13, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.b()), aVar);
                } else {
                    nVarE = androidx.compose.ui.n.INSTANCE;
                }
                pVarF.c0();
                if (aVar != null) {
                    nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
                } else {
                    nVarC = androidx.compose.ui.n.INSTANCE;
                }
                b(z13, state, PaddingKt.k(nVar4.s0(nVarC).s0(nVarE), f9045d), jVar2, pVarF, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & bb.c.g.f32954lc));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                z14 = z13;
                jVar3 = jVar2;
                gVar4 = gVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        z13 = z12;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        jVar2 = jVarA;
                        i17 = i12;
                        nVar4 = nVar3;
                    } else {
                        gVar3 = gVar;
                        nVar4 = nVar3;
                        z13 = z12;
                        jVar2 = jVarA;
                        i17 = i12;
                    }
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        z13 = z12;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        jVar2 = jVarA;
                        i17 = i12;
                        nVar4 = nVar3;
                    } else {
                        gVar3 = gVar;
                        nVar4 = nVar3;
                        z13 = z12;
                        jVar2 = jVarA;
                        i17 = i12;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:135)");
                }
                pVarF.T(1797978036);
                if (aVar != null) {
                    nVarE = ToggleableKt.e(androidx.compose.ui.n.INSTANCE, state, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.d.f139591a.F() / 2), 0L, pVarF, 54, 4), z13, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.b()), aVar);
                } else {
                    nVarE = androidx.compose.ui.n.INSTANCE;
                }
                pVarF.c0();
                if (aVar != null) {
                    nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
                } else {
                    nVarC = androidx.compose.ui.n.INSTANCE;
                }
                b(z13, state, PaddingKt.k(nVar4.s0(nVarC).s0(nVarE), f9045d), jVar2, pVarF, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & bb.c.g.f32954lc));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                z14 = z13;
                jVar3 = jVar2;
                gVar4 = gVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$TriStateCheckbox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                    CheckboxKt.c(state, aVar, nVar5, z14, jVar3, gVar4, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        nVar2 = nVar;
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
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    jVarA = jVar;
                    if (pVarF.s(jVarA)) {
                    }
                    i12 |= i19;
                } else {
                    jVarA = jVar;
                }
                i12 |= i19;
            } else {
                jVarA = jVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if ((458752 & i10) == 0) {
                    if (pVarF.s(gVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((374491 & i12) == 74898) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        z13 = z12;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        jVar2 = jVarA;
                        i17 = i12;
                        nVar4 = nVar3;
                    } else {
                        gVar3 = gVar;
                        nVar4 = nVar3;
                        z13 = z12;
                        jVar2 = jVarA;
                        i17 = i12;
                    }
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        z13 = z12;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        jVar2 = jVarA;
                        i17 = i12;
                        nVar4 = nVar3;
                    } else {
                        gVar3 = gVar;
                        nVar4 = nVar3;
                        z13 = z12;
                        jVar2 = jVarA;
                        i17 = i12;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:135)");
                }
                pVarF.T(1797978036);
                if (aVar != null) {
                    nVarE = ToggleableKt.e(androidx.compose.ui.n.INSTANCE, state, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.d.f139591a.F() / 2), 0L, pVarF, 54, 4), z13, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.b()), aVar);
                } else {
                    nVarE = androidx.compose.ui.n.INSTANCE;
                }
                pVarF.c0();
                if (aVar != null) {
                    nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
                } else {
                    nVarC = androidx.compose.ui.n.INSTANCE;
                }
                b(z13, state, PaddingKt.k(nVar4.s0(nVarC).s0(nVarE), f9045d), jVar2, pVarF, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & bb.c.g.f32954lc));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                z14 = z13;
                jVar3 = jVar2;
                gVar4 = gVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        z13 = z12;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        jVar2 = jVarA;
                        i17 = i12;
                        nVar4 = nVar3;
                    } else {
                        gVar3 = gVar;
                        nVar4 = nVar3;
                        z13 = z12;
                        jVar2 = jVarA;
                        i17 = i12;
                    }
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        z13 = z12;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        jVar2 = jVarA;
                        i17 = i12;
                        nVar4 = nVar3;
                    } else {
                        gVar3 = gVar;
                        nVar4 = nVar3;
                        z13 = z12;
                        jVar2 = jVarA;
                        i17 = i12;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:135)");
                }
                pVarF.T(1797978036);
                if (aVar != null) {
                    nVarE = ToggleableKt.e(androidx.compose.ui.n.INSTANCE, state, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.d.f139591a.F() / 2), 0L, pVarF, 54, 4), z13, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.b()), aVar);
                } else {
                    nVarE = androidx.compose.ui.n.INSTANCE;
                }
                pVarF.c0();
                if (aVar != null) {
                    nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
                } else {
                    nVarC = androidx.compose.ui.n.INSTANCE;
                }
                b(z13, state, PaddingKt.k(nVar4.s0(nVarC).s0(nVarE), f9045d), jVar2, pVarF, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & bb.c.g.f32954lc));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                z14 = z13;
                jVar3 = jVar2;
                gVar4 = gVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$TriStateCheckbox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                    CheckboxKt.c(state, aVar, nVar5, z14, jVar3, gVar4, pVar2, i10 | 1, i11);
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
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                jVarA = jVar;
                if (pVarF.s(jVarA)) {
                }
                i12 |= i19;
            } else {
                jVarA = jVar;
            }
            i12 |= i19;
        } else {
            jVarA = jVar;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
            gVar2 = gVar;
        } else {
            gVar2 = gVar;
            if ((458752 & i10) == 0) {
                if (pVarF.s(gVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((374491 & i12) == 74898) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    z13 = z12;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    jVar2 = jVarA;
                    i17 = i12;
                    nVar4 = nVar3;
                } else {
                    gVar3 = gVar;
                    nVar4 = nVar3;
                    z13 = z12;
                    jVar2 = jVarA;
                    i17 = i12;
                }
            } else {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    z13 = z12;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    jVar2 = jVarA;
                    i17 = i12;
                    nVar4 = nVar3;
                } else {
                    gVar3 = gVar;
                    nVar4 = nVar3;
                    z13 = z12;
                    jVar2 = jVarA;
                    i17 = i12;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:135)");
            }
            pVarF.T(1797978036);
            if (aVar != null) {
                nVarE = ToggleableKt.e(androidx.compose.ui.n.INSTANCE, state, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.d.f139591a.F() / 2), 0L, pVarF, 54, 4), z13, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.b()), aVar);
            } else {
                nVarE = androidx.compose.ui.n.INSTANCE;
            }
            pVarF.c0();
            if (aVar != null) {
                nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
            } else {
                nVarC = androidx.compose.ui.n.INSTANCE;
            }
            b(z13, state, PaddingKt.k(nVar4.s0(nVarC).s0(nVarE), f9045d), jVar2, pVarF, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & bb.c.g.f32954lc));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar5 = nVar4;
            z14 = z13;
            jVar3 = jVar2;
            gVar4 = gVar3;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    z13 = z12;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    jVar2 = jVarA;
                    i17 = i12;
                    nVar4 = nVar3;
                } else {
                    gVar3 = gVar;
                    nVar4 = nVar3;
                    z13 = z12;
                    jVar2 = jVarA;
                    i17 = i12;
                }
            } else {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jVarA = k.f11997a.a(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    z13 = z12;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    jVar2 = jVarA;
                    i17 = i12;
                    nVar4 = nVar3;
                } else {
                    gVar3 = gVar;
                    nVar4 = nVar3;
                    z13 = z12;
                    jVar2 = jVarA;
                    i17 = i12;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:135)");
            }
            pVarF.T(1797978036);
            if (aVar != null) {
                nVarE = ToggleableKt.e(androidx.compose.ui.n.INSTANCE, state, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.d.f139591a.F() / 2), 0L, pVarF, 54, 4), z13, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.b()), aVar);
            } else {
                nVarE = androidx.compose.ui.n.INSTANCE;
            }
            pVarF.c0();
            if (aVar != null) {
                nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
            } else {
                nVarC = androidx.compose.ui.n.INSTANCE;
            }
            b(z13, state, PaddingKt.k(nVar4.s0(nVarC).s0(nVarE), f9045d), jVar2, pVarF, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & bb.c.g.f32954lc));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar5 = nVar4;
            z14 = z13;
            jVar3 = jVar2;
            gVar4 = gVar3;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CheckboxKt$TriStateCheckbox$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                CheckboxKt.c(state, aVar, nVar5, z14, jVar3, gVar4, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(androidx.compose.ui.graphics.drawscope.g gVar, long j10, long j11, float f10, float f11) {
        float f12 = f11 / 2.0f;
        Stroke stroke = new Stroke(f11, 0.0f, 0, 0, null, 30, null);
        float fT = b1.m.t(gVar.c());
        if (androidx.compose.ui.graphics.l0.y(j10, j11)) {
            androidx.compose.ui.graphics.drawscope.f.M(gVar, j10, 0L, b1.n.a(fT, fT), b1.b.b(f10, 0.0f, 2, null), androidx.compose.ui.graphics.drawscope.o.f13826a, 0.0f, null, 0, bb.c.b.f30919s1, null);
            return;
        }
        float f13 = fT - (2 * f11);
        androidx.compose.ui.graphics.drawscope.f.M(gVar, j10, b1.g.a(f11, f11), b1.n.a(f13, f13), b1.b.b(Math.max(0.0f, f10 - f11), 0.0f, 2, null), androidx.compose.ui.graphics.drawscope.o.f13826a, 0.0f, null, 0, 224, null);
        float f14 = fT - f11;
        androidx.compose.ui.graphics.drawscope.f.M(gVar, j11, b1.g.a(f12, f12), b1.n.a(f14, f14), b1.b.b(f10 - f12, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(androidx.compose.ui.graphics.drawscope.g gVar, long j10, float f10, float f11, float f12, i iVar) {
        Stroke stroke = new Stroke(f12, 0.0f, j2.INSTANCE.c(), 0, null, 26, null);
        float fT = b1.m.t(gVar.c());
        float fA = u1.d.a(0.4f, 0.5f, f11);
        float fA2 = u1.d.a(0.7f, 0.5f, f11);
        float fA3 = u1.d.a(0.5f, 0.5f, f11);
        float fA4 = u1.d.a(0.3f, 0.5f, f11);
        iVar.getCheckPath().reset();
        iVar.getCheckPath().f(0.2f * fT, fA3 * fT);
        iVar.getCheckPath().h(fA * fT, fA2 * fT);
        iVar.getCheckPath().h(0.8f * fT, fT * fA4);
        iVar.getPathMeasure().b(iVar.getCheckPath(), false);
        iVar.getPathToDraw().reset();
        iVar.getPathMeasure().a(0.0f, iVar.getPathMeasure().getLength() * f10, iVar.getPathToDraw(), true);
        androidx.compose.ui.graphics.drawscope.f.G(gVar, iVar.getPathToDraw(), j10, 0.0f, stroke, null, 0, 52, null);
    }
}
