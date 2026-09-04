package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a´\u0001\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0013\b\u0002\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u008a\u0001\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\t2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00042\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\"\"\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0017\u0010\"\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "topBar", "bottomBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material3/z;", "floatingActionButtonPosition", "Landroidx/compose/ui/graphics/l0;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/h1;", "contentWindowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/m0;", "content", ak.av, "(Landroidx/compose/ui/n;Lyh/p;Lyh/p;Lyh/p;Lyh/p;IJJLandroidx/compose/foundation/layout/h1;Lyh/q;Landroidx/compose/runtime/p;II)V", "fabPosition", "snackbar", "fab", "b", "(ILyh/p;Lyh/q;Lyh/p;Lyh/p;Landroidx/compose/foundation/layout/h1;Lyh/p;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/runtime/j1;", "Landroidx/compose/material3/y;", "Landroidx/compose/runtime/j1;", "e", "()Landroidx/compose/runtime/j1;", "LocalFabPlacement", "Ls1/h;", "F", "FabSpacing", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class ScaffoldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<y> f10399a = CompositionLocalKt.e(new yh.a<y>() { // from class: androidx.compose.material3.ScaffoldKt$LocalFabPlacement$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f10400b = s1.h.g(16);

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x012a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0130  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:110:0x013f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0158  */
    /* JADX WARN: Code duplicated, block: B:116:0x0168  */
    /* JADX WARN: Code duplicated, block: B:129:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0195  */
    /* JADX WARN: Code duplicated, block: B:131:0x0198  */
    /* JADX WARN: Code duplicated, block: B:133:0x019c  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:146:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:157:0x020a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0218  */
    /* JADX WARN: Code duplicated, block: B:163:0x0268  */
    /* JADX WARN: Code duplicated, block: B:168:0x027a  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.e androidx.compose.ui.n nVar, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4, int i10, long j10, long j11, @dl.e androidx.compose.foundation.layout.h1 h1Var, @dl.d final yh.q<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar5, final int i11, final int i12) {
        int i13;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6;
        int i14;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7;
        int i15;
        int i16;
        int i17;
        int i18;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8;
        int i19;
        int i20;
        int i21;
        long jC;
        int i22;
        androidx.compose.ui.n nVar2;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVarA;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVarB;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVarC;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVarD;
        int iB;
        int i23;
        long jC2;
        int i24;
        androidx.compose.foundation.layout.h1 h1VarA;
        androidx.compose.foundation.layout.h1 h1Var2;
        long j12;
        long j13;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11;
        androidx.compose.ui.n nVar3;
        androidx.compose.runtime.u1 u1VarH;
        int i25;
        int i26;
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar5.F(-1219521777);
        int i27 = i12 & 1;
        if (i27 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (pVarF.s(nVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i28 = i12 & 2;
        if (i28 == 0) {
            if ((i11 & 112) == 0) {
                pVar6 = pVar;
                i13 |= pVarF.s(pVar6) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & bb.c.b.f30796me) == 0) {
                    pVar7 = pVar2;
                    if (pVarF.s(pVar7)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & bb.c.g.f32954lc) == 0) {
                        if (pVarF.s(pVar3)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        if ((57344 & i11) == 0) {
                            pVar8 = pVar4;
                            if (pVarF.s(pVar8)) {
                                i19 = 16384;
                            } else {
                                i19 = 8192;
                            }
                            i13 |= i19;
                        }
                        i20 = i12 & 32;
                        if (i20 != 0) {
                            i13 |= androidx.profileinstaller.o.c.f26824k;
                        } else if ((i11 & 458752) == 0) {
                            if (pVarF.y(i10)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                        if ((i11 & 3670016) != 0) {
                            if ((i12 & 64) == 0 || !pVarF.z(j10)) {
                                i26 = 524288;
                            } else {
                                i26 = 1048576;
                            }
                            i13 |= i26;
                        }
                        if ((i11 & 29360128) == 0) {
                            jC = j11;
                            if ((i12 & 128) == 0 || !pVarF.z(jC)) {
                                i25 = 4194304;
                            } else {
                                i25 = 8388608;
                            }
                            i13 |= i25;
                        } else {
                            jC = j11;
                        }
                        if ((234881024 & i11) != 0) {
                            i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
                        }
                        if ((i12 & 512) != 0) {
                            if ((1879048192 & i11) == 0) {
                                if (pVarF.s(content)) {
                                    i22 = 536870912;
                                } else {
                                    i22 = 268435456;
                                }
                            }
                            if ((1533916891 & i13) == 306783378 || !pVarF.b()) {
                                pVarF.W();
                                if ((i11 & 1) != 0 || pVarF.o()) {
                                    if (i27 != 0) {
                                        nVar2 = androidx.compose.ui.n.INSTANCE;
                                    } else {
                                        nVar2 = nVar;
                                    }
                                    if (i28 != 0) {
                                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                    } else {
                                        pVarA = pVar6;
                                    }
                                    if (i14 != 0) {
                                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                    } else {
                                        pVarB = pVar7;
                                    }
                                    if (i16 != 0) {
                                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                    } else {
                                        pVarC = pVar3;
                                    }
                                    if (i18 != 0) {
                                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                    } else {
                                        pVarD = pVar8;
                                    }
                                    if (i20 != 0) {
                                        iB = z.INSTANCE.b();
                                    } else {
                                        iB = i10;
                                    }
                                    if ((i12 & 64) != 0) {
                                        i23 = i13 & (-3670017);
                                        jC2 = o0.f12059a.a(pVarF, 6).c();
                                    } else {
                                        i23 = i13;
                                        jC2 = j10;
                                    }
                                    if ((i12 & 128) != 0) {
                                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                        i23 &= -29360129;
                                    }
                                    if ((i12 & 256) != 0) {
                                        i24 = i23 & (-234881025);
                                        h1VarA = e1.f11836a.a(pVarF, 6);
                                        nVar2 = nVar2;
                                    } else {
                                        i24 = i23;
                                        h1VarA = h1Var;
                                    }
                                } else {
                                    pVarF.l();
                                    if ((i12 & 64) != 0) {
                                        i13 &= -3670017;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i13 &= -29360129;
                                    }
                                    if ((i12 & 256) != 0) {
                                        i13 &= -234881025;
                                    }
                                    nVar2 = nVar;
                                    h1VarA = h1Var;
                                    pVarA = pVar6;
                                    pVarB = pVar7;
                                    pVarD = pVar8;
                                    pVarC = pVar3;
                                    iB = i10;
                                    i24 = i13;
                                    jC2 = j10;
                                }
                                pVarF.O();
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                                }
                                final int i29 = iB;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = pVarA;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = pVarC;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVarD;
                                final androidx.compose.foundation.layout.h1 h1Var3 = h1VarA;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVarB;
                                final int i30 = i24;
                                int i31 = 12582912 | (i24 & 14);
                                int i32 = i24 >> 12;
                                SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar16, int i33) {
                                        if ((i33 & 11) == 2 && pVar16.b()) {
                                            pVar16.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1979205334, i33, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                        }
                                        int i34 = i29;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar17 = pVar12;
                                        yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar18 = pVar13;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar19 = pVar14;
                                        androidx.compose.foundation.layout.h1 h1Var4 = h1Var3;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar15;
                                        int i35 = i30;
                                        ScaffoldKt.b(i34, pVar17, qVar, pVar18, pVar19, h1Var4, pVar20, pVar16, ((i35 >> 15) & 14) | (i35 & 112) | ((i35 >> 21) & bb.c.b.f30796me) | (i35 & bb.c.g.f32954lc) | (57344 & i35) | (458752 & (i35 >> 9)) | ((i35 << 12) & 3670016));
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                                        a(pVar16, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVarF, i31 | (i32 & bb.c.b.f30796me) | (i32 & bb.c.g.f32954lc), 114);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                                h1Var2 = h1VarA;
                                j12 = jC;
                                j13 = jC2;
                                pVar9 = pVarB;
                                pVar10 = pVarC;
                                pVar11 = pVarD;
                                pVar6 = pVarA;
                                nVar3 = nVar2;
                            } else {
                                pVarF.l();
                                nVar3 = nVar;
                                pVar10 = pVar3;
                                h1Var2 = h1Var;
                                pVar9 = pVar7;
                                j12 = jC;
                                pVar11 = pVar8;
                                iB = i10;
                                j13 = j10;
                            }
                            u1VarH = pVarF.H();
                            if (u1VarH == null) {
                                return;
                            }
                            final androidx.compose.ui.n nVar4 = nVar3;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVar6;
                            final int i33 = iB;
                            final long j14 = j13;
                            final long j15 = j12;
                            final androidx.compose.foundation.layout.h1 h1Var4 = h1Var2;
                            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public final void a(@dl.e androidx.compose.runtime.p pVar17, int i34) {
                                    ScaffoldKt.a(nVar4, pVar16, pVar9, pVar10, pVar11, i33, j14, j15, h1Var4, content, pVar17, i11 | 1, i12);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar17, Integer num) {
                                    a(pVar17, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        }
                        i22 = com.google.android.exoplayer2.j.G;
                        i13 |= i22;
                        if ((1533916891 & i13) == 306783378) {
                            pVarF.W();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            } else {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                            }
                            final int i210 = iB;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVarC;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVarD;
                            final androidx.compose.foundation.layout.h1 h1Var5 = h1VarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = pVarB;
                            final int i34 = i24;
                            int i35 = 12582912 | (i24 & 14);
                            int i36 = i24 >> 12;
                            SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar111, int i37) {
                                    if ((i37 & 11) == 2 && pVar111.b()) {
                                        pVar111.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1979205334, i37, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                    }
                                    int i38 = i210;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar112 = pVar17;
                                    yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar113 = pVar18;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar114 = pVar19;
                                    androidx.compose.foundation.layout.h1 h1Var6 = h1Var5;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar110;
                                    int i39 = i34;
                                    ScaffoldKt.b(i38, pVar112, qVar, pVar113, pVar114, h1Var6, pVar20, pVar111, ((i39 >> 15) & 14) | (i39 & 112) | ((i39 >> 21) & bb.c.b.f30796me) | (i39 & bb.c.g.f32954lc) | (57344 & i39) | (458752 & (i39 >> 9)) | ((i39 << 12) & 3670016));
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111, Integer num) {
                                    a(pVar111, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVarF, i35 | (i36 & bb.c.b.f30796me) | (i36 & bb.c.g.f32954lc), 114);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            h1Var2 = h1VarA;
                            j12 = jC;
                            j13 = jC2;
                            pVar9 = pVarB;
                            pVar10 = pVarC;
                            pVar11 = pVarD;
                            pVar6 = pVarA;
                            nVar3 = nVar2;
                        } else {
                            pVarF.W();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            } else {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                            }
                            final int i211 = iB;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar112 = pVarC;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar113 = pVarD;
                            final androidx.compose.foundation.layout.h1 h1Var6 = h1VarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar114 = pVarB;
                            final int i37 = i24;
                            int i38 = 12582912 | (i24 & 14);
                            int i39 = i24 >> 12;
                            SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar115, int i310) {
                                    if ((i310 & 11) == 2 && pVar115.b()) {
                                        pVar115.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1979205334, i310, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                    }
                                    int i311 = i211;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar116 = pVar111;
                                    yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar117 = pVar112;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar118 = pVar113;
                                    androidx.compose.foundation.layout.h1 h1Var7 = h1Var6;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar114;
                                    int i312 = i37;
                                    ScaffoldKt.b(i311, pVar116, qVar, pVar117, pVar118, h1Var7, pVar20, pVar115, ((i312 >> 15) & 14) | (i312 & 112) | ((i312 >> 21) & bb.c.b.f30796me) | (i312 & bb.c.g.f32954lc) | (57344 & i312) | (458752 & (i312 >> 9)) | ((i312 << 12) & 3670016));
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar115, Integer num) {
                                    a(pVar115, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVarF, i38 | (i39 & bb.c.b.f30796me) | (i39 & bb.c.g.f32954lc), 114);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            h1Var2 = h1VarA;
                            j12 = jC;
                            j13 = jC2;
                            pVar9 = pVarB;
                            pVar10 = pVarC;
                            pVar11 = pVarD;
                            pVar6 = pVarA;
                            nVar3 = nVar2;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        final androidx.compose.ui.n nVar5 = nVar3;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar115 = pVar6;
                        final int i310 = iB;
                        final long j16 = j13;
                        final long j17 = j12;
                        final androidx.compose.foundation.layout.h1 h1Var7 = h1Var2;
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar116, int i311) {
                                ScaffoldKt.a(nVar5, pVar115, pVar9, pVar10, pVar11, i310, j16, j17, h1Var7, content, pVar116, i11 | 1, i12);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar116, Integer num) {
                                a(pVar116, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    }
                    i13 |= 24576;
                    pVar8 = pVar4;
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= androidx.profileinstaller.o.c.f26824k;
                    } else if ((i11 & 458752) == 0) {
                        if (pVarF.y(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 3670016) != 0) {
                        if ((i12 & 64) == 0) {
                            i26 = 524288;
                        } else {
                            i26 = 524288;
                        }
                        i13 |= i26;
                    }
                    if ((i11 & 29360128) == 0) {
                        jC = j11;
                        if ((i12 & 128) == 0) {
                            i25 = 4194304;
                        } else {
                            i25 = 4194304;
                        }
                        i13 |= i25;
                    } else {
                        jC = j11;
                    }
                    if ((234881024 & i11) != 0) {
                        i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
                    }
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i11) == 0) {
                            if (pVarF.s(content)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                        }
                        if ((1533916891 & i13) == 306783378) {
                            pVarF.W();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            } else {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                            }
                            final int i212 = iB;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar116 = pVarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar117 = pVarC;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar118 = pVarD;
                            final androidx.compose.foundation.layout.h1 h1Var8 = h1VarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar119 = pVarB;
                            final int i311 = i24;
                            int i312 = 12582912 | (i24 & 14);
                            int i313 = i24 >> 12;
                            SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1110, int i314) {
                                    if ((i314 & 11) == 2 && pVar1110.b()) {
                                        pVar1110.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1979205334, i314, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                    }
                                    int i315 = i212;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111 = pVar116;
                                    yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1112 = pVar117;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1113 = pVar118;
                                    androidx.compose.foundation.layout.h1 h1Var9 = h1Var8;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar119;
                                    int i316 = i311;
                                    ScaffoldKt.b(i315, pVar1111, qVar, pVar1112, pVar1113, h1Var9, pVar20, pVar1110, ((i316 >> 15) & 14) | (i316 & 112) | ((i316 >> 21) & bb.c.b.f30796me) | (i316 & bb.c.g.f32954lc) | (57344 & i316) | (458752 & (i316 >> 9)) | ((i316 << 12) & 3670016));
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1110, Integer num) {
                                    a(pVar1110, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVarF, i312 | (i313 & bb.c.b.f30796me) | (i313 & bb.c.g.f32954lc), 114);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            h1Var2 = h1VarA;
                            j12 = jC;
                            j13 = jC2;
                            pVar9 = pVarB;
                            pVar10 = pVarC;
                            pVar11 = pVarD;
                            pVar6 = pVarA;
                            nVar3 = nVar2;
                        } else {
                            pVarF.W();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            } else {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                            }
                            final int i213 = iB;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1110 = pVarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111 = pVarC;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1112 = pVarD;
                            final androidx.compose.foundation.layout.h1 h1Var9 = h1VarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1113 = pVarB;
                            final int i314 = i24;
                            int i315 = 12582912 | (i24 & 14);
                            int i316 = i24 >> 12;
                            SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1114, int i317) {
                                    if ((i317 & 11) == 2 && pVar1114.b()) {
                                        pVar1114.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1979205334, i317, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                    }
                                    int i318 = i213;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1115 = pVar1110;
                                    yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1116 = pVar1111;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1117 = pVar1112;
                                    androidx.compose.foundation.layout.h1 h1Var10 = h1Var9;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1113;
                                    int i319 = i314;
                                    ScaffoldKt.b(i318, pVar1115, qVar, pVar1116, pVar1117, h1Var10, pVar20, pVar1114, ((i319 >> 15) & 14) | (i319 & 112) | ((i319 >> 21) & bb.c.b.f30796me) | (i319 & bb.c.g.f32954lc) | (57344 & i319) | (458752 & (i319 >> 9)) | ((i319 << 12) & 3670016));
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1114, Integer num) {
                                    a(pVar1114, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVarF, i315 | (i316 & bb.c.b.f30796me) | (i316 & bb.c.g.f32954lc), 114);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            h1Var2 = h1VarA;
                            j12 = jC;
                            j13 = jC2;
                            pVar9 = pVarB;
                            pVar10 = pVarC;
                            pVar11 = pVarD;
                            pVar6 = pVarA;
                            nVar3 = nVar2;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        final androidx.compose.ui.n nVar6 = nVar3;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1114 = pVar6;
                        final int i317 = iB;
                        final long j18 = j13;
                        final long j19 = j12;
                        final androidx.compose.foundation.layout.h1 h1Var10 = h1Var2;
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar1115, int i318) {
                                ScaffoldKt.a(nVar6, pVar1114, pVar9, pVar10, pVar11, i317, j18, j19, h1Var10, content, pVar1115, i11 | 1, i12);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1115, Integer num) {
                                a(pVar1115, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    }
                    i22 = com.google.android.exoplayer2.j.G;
                    i13 |= i22;
                    if ((1533916891 & i13) == 306783378) {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i214 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1115 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1116 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1117 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var11 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1118 = pVarB;
                        final int i318 = i24;
                        int i319 = 12582912 | (i24 & 14);
                        int i3110 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1119, int i3111) {
                                if ((i3111 & 11) == 2 && pVar1119.b()) {
                                    pVar1119.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i3111, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i3112 = i214;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11110 = pVar1115;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111 = pVar1116;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11112 = pVar1117;
                                androidx.compose.foundation.layout.h1 h1Var12 = h1Var11;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1118;
                                int i3113 = i318;
                                ScaffoldKt.b(i3112, pVar11110, qVar, pVar11111, pVar11112, h1Var12, pVar20, pVar1119, ((i3113 >> 15) & 14) | (i3113 & 112) | ((i3113 >> 21) & bb.c.b.f30796me) | (i3113 & bb.c.g.f32954lc) | (57344 & i3113) | (458752 & (i3113 >> 9)) | ((i3113 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1119, Integer num) {
                                a(pVar1119, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i319 | (i3110 & bb.c.b.f30796me) | (i3110 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i215 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1119 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11110 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var12 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11112 = pVarB;
                        final int i3111 = i24;
                        int i3112 = 12582912 | (i24 & 14);
                        int i3113 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11113, int i3114) {
                                if ((i3114 & 11) == 2 && pVar11113.b()) {
                                    pVar11113.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i3114, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i3115 = i215;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11114 = pVar1119;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11115 = pVar11110;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11116 = pVar11111;
                                androidx.compose.foundation.layout.h1 h1Var13 = h1Var12;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11112;
                                int i3116 = i3111;
                                ScaffoldKt.b(i3115, pVar11114, qVar, pVar11115, pVar11116, h1Var13, pVar20, pVar11113, ((i3116 >> 15) & 14) | (i3116 & 112) | ((i3116 >> 21) & bb.c.b.f30796me) | (i3116 & bb.c.g.f32954lc) | (57344 & i3116) | (458752 & (i3116 >> 9)) | ((i3116 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11113, Integer num) {
                                a(pVar11113, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i3112 | (i3113 & bb.c.b.f30796me) | (i3113 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar7 = nVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11113 = pVar6;
                    final int i3114 = iB;
                    final long j110 = j13;
                    final long j111 = j12;
                    final androidx.compose.foundation.layout.h1 h1Var13 = h1Var2;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar11114, int i3115) {
                            ScaffoldKt.a(nVar7, pVar11113, pVar9, pVar10, pVar11, i3114, j110, j111, h1Var13, content, pVar11114, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11114, Integer num) {
                            a(pVar11114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i13 |= bb.c.d.f31193dj;
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((57344 & i11) == 0) {
                        pVar8 = pVar4;
                        if (pVarF.s(pVar8)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= androidx.profileinstaller.o.c.f26824k;
                    } else if ((i11 & 458752) == 0) {
                        if (pVarF.y(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 3670016) != 0) {
                        if ((i12 & 64) == 0) {
                            i26 = 524288;
                        } else {
                            i26 = 524288;
                        }
                        i13 |= i26;
                    }
                    if ((i11 & 29360128) == 0) {
                        jC = j11;
                        if ((i12 & 128) == 0) {
                            i25 = 4194304;
                        } else {
                            i25 = 4194304;
                        }
                        i13 |= i25;
                    } else {
                        jC = j11;
                    }
                    if ((234881024 & i11) != 0) {
                        i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
                    }
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i11) == 0) {
                            if (pVarF.s(content)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                        }
                        if ((1533916891 & i13) == 306783378) {
                            pVarF.W();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            } else {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                            }
                            final int i216 = iB;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11114 = pVarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11115 = pVarC;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11116 = pVarD;
                            final androidx.compose.foundation.layout.h1 h1Var14 = h1VarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11117 = pVarB;
                            final int i3115 = i24;
                            int i3116 = 12582912 | (i24 & 14);
                            int i3117 = i24 >> 12;
                            SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar11118, int i3118) {
                                    if ((i3118 & 11) == 2 && pVar11118.b()) {
                                        pVar11118.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1979205334, i3118, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                    }
                                    int i3119 = i216;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11119 = pVar11114;
                                    yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111110 = pVar11115;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111 = pVar11116;
                                    androidx.compose.foundation.layout.h1 h1Var15 = h1Var14;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11117;
                                    int i31110 = i3115;
                                    ScaffoldKt.b(i3119, pVar11119, qVar, pVar111110, pVar111111, h1Var15, pVar20, pVar11118, ((i31110 >> 15) & 14) | (i31110 & 112) | ((i31110 >> 21) & bb.c.b.f30796me) | (i31110 & bb.c.g.f32954lc) | (57344 & i31110) | (458752 & (i31110 >> 9)) | ((i31110 << 12) & 3670016));
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11118, Integer num) {
                                    a(pVar11118, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVarF, i3116 | (i3117 & bb.c.b.f30796me) | (i3117 & bb.c.g.f32954lc), 114);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            h1Var2 = h1VarA;
                            j12 = jC;
                            j13 = jC2;
                            pVar9 = pVarB;
                            pVar10 = pVarC;
                            pVar11 = pVarD;
                            pVar6 = pVarA;
                            nVar3 = nVar2;
                        } else {
                            pVarF.W();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            } else {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                            }
                            final int i217 = iB;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11118 = pVarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11119 = pVarC;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111110 = pVarD;
                            final androidx.compose.foundation.layout.h1 h1Var15 = h1VarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111 = pVarB;
                            final int i3118 = i24;
                            int i3119 = 12582912 | (i24 & 14);
                            int i31110 = i24 >> 12;
                            SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar111112, int i31111) {
                                    if ((i31111 & 11) == 2 && pVar111112.b()) {
                                        pVar111112.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1979205334, i31111, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                    }
                                    int i31112 = i217;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111113 = pVar11118;
                                    yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111114 = pVar11119;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111115 = pVar111110;
                                    androidx.compose.foundation.layout.h1 h1Var16 = h1Var15;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111;
                                    int i31113 = i3118;
                                    ScaffoldKt.b(i31112, pVar111113, qVar, pVar111114, pVar111115, h1Var16, pVar20, pVar111112, ((i31113 >> 15) & 14) | (i31113 & 112) | ((i31113 >> 21) & bb.c.b.f30796me) | (i31113 & bb.c.g.f32954lc) | (57344 & i31113) | (458752 & (i31113 >> 9)) | ((i31113 << 12) & 3670016));
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111112, Integer num) {
                                    a(pVar111112, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVarF, i3119 | (i31110 & bb.c.b.f30796me) | (i31110 & bb.c.g.f32954lc), 114);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            h1Var2 = h1VarA;
                            j12 = jC;
                            j13 = jC2;
                            pVar9 = pVarB;
                            pVar10 = pVarC;
                            pVar11 = pVarD;
                            pVar6 = pVarA;
                            nVar3 = nVar2;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        final androidx.compose.ui.n nVar8 = nVar3;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111112 = pVar6;
                        final int i31111 = iB;
                        final long j112 = j13;
                        final long j113 = j12;
                        final androidx.compose.foundation.layout.h1 h1Var16 = h1Var2;
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar111113, int i31112) {
                                ScaffoldKt.a(nVar8, pVar111112, pVar9, pVar10, pVar11, i31111, j112, j113, h1Var16, content, pVar111113, i11 | 1, i12);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111113, Integer num) {
                                a(pVar111113, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    }
                    i22 = com.google.android.exoplayer2.j.G;
                    i13 |= i22;
                    if ((1533916891 & i13) == 306783378) {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i218 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111113 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111114 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111115 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var17 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111116 = pVarB;
                        final int i31112 = i24;
                        int i31113 = 12582912 | (i24 & 14);
                        int i31114 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar111117, int i31115) {
                                if ((i31115 & 11) == 2 && pVar111117.b()) {
                                    pVar111117.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i31115, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i31116 = i218;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111118 = pVar111113;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111119 = pVar111114;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111110 = pVar111115;
                                androidx.compose.foundation.layout.h1 h1Var18 = h1Var17;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111116;
                                int i31117 = i31112;
                                ScaffoldKt.b(i31116, pVar111118, qVar, pVar111119, pVar1111110, h1Var18, pVar20, pVar111117, ((i31117 >> 15) & 14) | (i31117 & 112) | ((i31117 >> 21) & bb.c.b.f30796me) | (i31117 & bb.c.g.f32954lc) | (57344 & i31117) | (458752 & (i31117 >> 9)) | ((i31117 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111117, Integer num) {
                                a(pVar111117, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i31113 | (i31114 & bb.c.b.f30796me) | (i31114 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i219 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111117 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111118 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111119 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var18 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111110 = pVarB;
                        final int i31115 = i24;
                        int i31116 = 12582912 | (i24 & 14);
                        int i31117 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1111111, int i31118) {
                                if ((i31118 & 11) == 2 && pVar1111111.b()) {
                                    pVar1111111.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i31118, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i31119 = i219;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111112 = pVar111117;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111113 = pVar111118;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111114 = pVar111119;
                                androidx.compose.foundation.layout.h1 h1Var19 = h1Var18;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111110;
                                int i311110 = i31115;
                                ScaffoldKt.b(i31119, pVar1111112, qVar, pVar1111113, pVar1111114, h1Var19, pVar20, pVar1111111, ((i311110 >> 15) & 14) | (i311110 & 112) | ((i311110 >> 21) & bb.c.b.f30796me) | (i311110 & bb.c.g.f32954lc) | (57344 & i311110) | (458752 & (i311110 >> 9)) | ((i311110 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111, Integer num) {
                                a(pVar1111111, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i31116 | (i31117 & bb.c.b.f30796me) | (i31117 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar9 = nVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111 = pVar6;
                    final int i31118 = iB;
                    final long j114 = j13;
                    final long j115 = j12;
                    final androidx.compose.foundation.layout.h1 h1Var19 = h1Var2;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar1111112, int i31119) {
                            ScaffoldKt.a(nVar9, pVar1111111, pVar9, pVar10, pVar11, i31118, j114, j115, h1Var19, content, pVar1111112, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111112, Integer num) {
                            a(pVar1111112, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i13 |= 24576;
                pVar8 = pVar4;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i11 & 458752) == 0) {
                    if (pVarF.y(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 29360128) == 0) {
                    jC = j11;
                    if ((i12 & 128) == 0) {
                        i25 = 4194304;
                    } else {
                        i25 = 4194304;
                    }
                    i13 |= i25;
                } else {
                    jC = j11;
                }
                if ((234881024 & i11) != 0) {
                    i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i11) == 0) {
                        if (pVarF.s(content)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                    }
                    if ((1533916891 & i13) == 306783378) {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i2110 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111112 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111113 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111114 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var110 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111115 = pVarB;
                        final int i31119 = i24;
                        int i311110 = 12582912 | (i24 & 14);
                        int i311111 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1111116, int i311112) {
                                if ((i311112 & 11) == 2 && pVar1111116.b()) {
                                    pVar1111116.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i311112, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i311113 = i2110;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111117 = pVar1111112;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111118 = pVar1111113;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111119 = pVar1111114;
                                androidx.compose.foundation.layout.h1 h1Var111 = h1Var110;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111115;
                                int i311114 = i31119;
                                ScaffoldKt.b(i311113, pVar1111117, qVar, pVar1111118, pVar1111119, h1Var111, pVar20, pVar1111116, ((i311114 >> 15) & 14) | (i311114 & 112) | ((i311114 >> 21) & bb.c.b.f30796me) | (i311114 & bb.c.g.f32954lc) | (57344 & i311114) | (458752 & (i311114 >> 9)) | ((i311114 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111116, Integer num) {
                                a(pVar1111116, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i311110 | (i311111 & bb.c.b.f30796me) | (i311111 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i2111 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111116 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111117 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111118 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var111 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111119 = pVarB;
                        final int i311112 = i24;
                        int i311113 = 12582912 | (i24 & 14);
                        int i311114 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11111110, int i311115) {
                                if ((i311115 & 11) == 2 && pVar11111110.b()) {
                                    pVar11111110.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i311115, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i311116 = i2111;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111 = pVar1111116;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111112 = pVar1111117;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111113 = pVar1111118;
                                androidx.compose.foundation.layout.h1 h1Var112 = h1Var111;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111119;
                                int i311117 = i311112;
                                ScaffoldKt.b(i311116, pVar11111111, qVar, pVar11111112, pVar11111113, h1Var112, pVar20, pVar11111110, ((i311117 >> 15) & 14) | (i311117 & 112) | ((i311117 >> 21) & bb.c.b.f30796me) | (i311117 & bb.c.g.f32954lc) | (57344 & i311117) | (458752 & (i311117 >> 9)) | ((i311117 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111110, Integer num) {
                                a(pVar11111110, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i311113 | (i311114 & bb.c.b.f30796me) | (i311114 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar10 = nVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111110 = pVar6;
                    final int i311115 = iB;
                    final long j116 = j13;
                    final long j117 = j12;
                    final androidx.compose.foundation.layout.h1 h1Var112 = h1Var2;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar11111111, int i311116) {
                            ScaffoldKt.a(nVar10, pVar11111110, pVar9, pVar10, pVar11, i311115, j116, j117, h1Var112, content, pVar11111111, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111, Integer num) {
                            a(pVar11111111, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i22 = com.google.android.exoplayer2.j.G;
                i13 |= i22;
                if ((1533916891 & i13) == 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i2112 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111112 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111113 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var113 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111114 = pVarB;
                    final int i311116 = i24;
                    int i311117 = 12582912 | (i24 & 14);
                    int i311118 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11111115, int i311119) {
                            if ((i311119 & 11) == 2 && pVar11111115.b()) {
                                pVar11111115.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i311119, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i3111110 = i2112;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111116 = pVar11111111;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111117 = pVar11111112;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111118 = pVar11111113;
                            androidx.compose.foundation.layout.h1 h1Var114 = h1Var113;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111114;
                            int i3111111 = i311116;
                            ScaffoldKt.b(i3111110, pVar11111116, qVar, pVar11111117, pVar11111118, h1Var114, pVar20, pVar11111115, ((i3111111 >> 15) & 14) | (i3111111 & 112) | ((i3111111 >> 21) & bb.c.b.f30796me) | (i3111111 & bb.c.g.f32954lc) | (57344 & i3111111) | (458752 & (i3111111 >> 9)) | ((i3111111 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111115, Integer num) {
                            a(pVar11111115, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i311117 | (i311118 & bb.c.b.f30796me) | (i311118 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i2113 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111115 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111116 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111117 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var114 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111118 = pVarB;
                    final int i311119 = i24;
                    int i3111110 = 12582912 | (i24 & 14);
                    int i3111111 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11111119, int i3111112) {
                            if ((i3111112 & 11) == 2 && pVar11111119.b()) {
                                pVar11111119.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i3111112, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i3111113 = i2113;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111110 = pVar11111115;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111 = pVar11111116;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111112 = pVar11111117;
                            androidx.compose.foundation.layout.h1 h1Var115 = h1Var114;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111118;
                            int i3111114 = i311119;
                            ScaffoldKt.b(i3111113, pVar111111110, qVar, pVar111111111, pVar111111112, h1Var115, pVar20, pVar11111119, ((i3111114 >> 15) & 14) | (i3111114 & 112) | ((i3111114 >> 21) & bb.c.b.f30796me) | (i3111114 & bb.c.g.f32954lc) | (57344 & i3111114) | (458752 & (i3111114 >> 9)) | ((i3111114 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111119, Integer num) {
                            a(pVar11111119, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i3111110 | (i3111111 & bb.c.b.f30796me) | (i3111111 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar11 = nVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111119 = pVar6;
                final int i3111112 = iB;
                final long j118 = j13;
                final long j119 = j12;
                final androidx.compose.foundation.layout.h1 h1Var115 = h1Var2;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar111111110, int i3111113) {
                        ScaffoldKt.a(nVar11, pVar11111119, pVar9, pVar10, pVar11, i3111112, j118, j119, h1Var115, content, pVar111111110, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111110, Integer num) {
                        a(pVar111111110, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= bb.c.b.f30966u4;
            pVar7 = pVar2;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.s(pVar3)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((57344 & i11) == 0) {
                        pVar8 = pVar4;
                        if (pVarF.s(pVar8)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= androidx.profileinstaller.o.c.f26824k;
                    } else if ((i11 & 458752) == 0) {
                        if (pVarF.y(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 3670016) != 0) {
                        if ((i12 & 64) == 0) {
                            i26 = 524288;
                        } else {
                            i26 = 524288;
                        }
                        i13 |= i26;
                    }
                    if ((i11 & 29360128) == 0) {
                        jC = j11;
                        if ((i12 & 128) == 0) {
                            i25 = 4194304;
                        } else {
                            i25 = 4194304;
                        }
                        i13 |= i25;
                    } else {
                        jC = j11;
                    }
                    if ((234881024 & i11) != 0) {
                        i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
                    }
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i11) == 0) {
                            if (pVarF.s(content)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                        }
                        if ((1533916891 & i13) == 306783378) {
                            pVarF.W();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            } else {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                            }
                            final int i2114 = iB;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111110 = pVarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111 = pVarC;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111112 = pVarD;
                            final androidx.compose.foundation.layout.h1 h1Var116 = h1VarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111113 = pVarB;
                            final int i3111113 = i24;
                            int i3111114 = 12582912 | (i24 & 14);
                            int i3111115 = i24 >> 12;
                            SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar111111114, int i3111116) {
                                    if ((i3111116 & 11) == 2 && pVar111111114.b()) {
                                        pVar111111114.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1979205334, i3111116, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                    }
                                    int i3111117 = i2114;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111115 = pVar111111110;
                                    yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111116 = pVar111111111;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111117 = pVar111111112;
                                    androidx.compose.foundation.layout.h1 h1Var117 = h1Var116;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111113;
                                    int i3111118 = i3111113;
                                    ScaffoldKt.b(i3111117, pVar111111115, qVar, pVar111111116, pVar111111117, h1Var117, pVar20, pVar111111114, ((i3111118 >> 15) & 14) | (i3111118 & 112) | ((i3111118 >> 21) & bb.c.b.f30796me) | (i3111118 & bb.c.g.f32954lc) | (57344 & i3111118) | (458752 & (i3111118 >> 9)) | ((i3111118 << 12) & 3670016));
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111114, Integer num) {
                                    a(pVar111111114, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVarF, i3111114 | (i3111115 & bb.c.b.f30796me) | (i3111115 & bb.c.g.f32954lc), 114);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            h1Var2 = h1VarA;
                            j12 = jC;
                            j13 = jC2;
                            pVar9 = pVarB;
                            pVar10 = pVarC;
                            pVar11 = pVarD;
                            pVar6 = pVarA;
                            nVar3 = nVar2;
                        } else {
                            pVarF.W();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            } else {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                            }
                            final int i2115 = iB;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111114 = pVarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111115 = pVarC;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111116 = pVarD;
                            final androidx.compose.foundation.layout.h1 h1Var117 = h1VarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111117 = pVarB;
                            final int i3111116 = i24;
                            int i3111117 = 12582912 | (i24 & 14);
                            int i3111118 = i24 >> 12;
                            SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar111111118, int i3111119) {
                                    if ((i3111119 & 11) == 2 && pVar111111118.b()) {
                                        pVar111111118.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1979205334, i3111119, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                    }
                                    int i31111110 = i2115;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111119 = pVar111111114;
                                    yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111110 = pVar111111115;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111 = pVar111111116;
                                    androidx.compose.foundation.layout.h1 h1Var118 = h1Var117;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111117;
                                    int i31111111 = i3111116;
                                    ScaffoldKt.b(i31111110, pVar111111119, qVar, pVar1111111110, pVar1111111111, h1Var118, pVar20, pVar111111118, ((i31111111 >> 15) & 14) | (i31111111 & 112) | ((i31111111 >> 21) & bb.c.b.f30796me) | (i31111111 & bb.c.g.f32954lc) | (57344 & i31111111) | (458752 & (i31111111 >> 9)) | ((i31111111 << 12) & 3670016));
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111118, Integer num) {
                                    a(pVar111111118, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVarF, i3111117 | (i3111118 & bb.c.b.f30796me) | (i3111118 & bb.c.g.f32954lc), 114);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            h1Var2 = h1VarA;
                            j12 = jC;
                            j13 = jC2;
                            pVar9 = pVarB;
                            pVar10 = pVarC;
                            pVar11 = pVarD;
                            pVar6 = pVarA;
                            nVar3 = nVar2;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        final androidx.compose.ui.n nVar12 = nVar3;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111118 = pVar6;
                        final int i3111119 = iB;
                        final long j1110 = j13;
                        final long j1111 = j12;
                        final androidx.compose.foundation.layout.h1 h1Var118 = h1Var2;
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar111111119, int i31111110) {
                                ScaffoldKt.a(nVar12, pVar111111118, pVar9, pVar10, pVar11, i3111119, j1110, j1111, h1Var118, content, pVar111111119, i11 | 1, i12);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111119, Integer num) {
                                a(pVar111111119, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    }
                    i22 = com.google.android.exoplayer2.j.G;
                    i13 |= i22;
                    if ((1533916891 & i13) == 306783378) {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i2116 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111119 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111110 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var119 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111112 = pVarB;
                        final int i31111110 = i24;
                        int i31111111 = 12582912 | (i24 & 14);
                        int i31111112 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1111111113, int i31111113) {
                                if ((i31111113 & 11) == 2 && pVar1111111113.b()) {
                                    pVar1111111113.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i31111113, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i31111114 = i2116;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111114 = pVar111111119;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111115 = pVar1111111110;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111116 = pVar1111111111;
                                androidx.compose.foundation.layout.h1 h1Var1110 = h1Var119;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111112;
                                int i31111115 = i31111110;
                                ScaffoldKt.b(i31111114, pVar1111111114, qVar, pVar1111111115, pVar1111111116, h1Var1110, pVar20, pVar1111111113, ((i31111115 >> 15) & 14) | (i31111115 & 112) | ((i31111115 >> 21) & bb.c.b.f30796me) | (i31111115 & bb.c.g.f32954lc) | (57344 & i31111115) | (458752 & (i31111115 >> 9)) | ((i31111115 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111113, Integer num) {
                                a(pVar1111111113, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i31111111 | (i31111112 & bb.c.b.f30796me) | (i31111112 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i2117 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111113 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111114 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111115 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var1110 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111116 = pVarB;
                        final int i31111113 = i24;
                        int i31111114 = 12582912 | (i24 & 14);
                        int i31111115 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1111111117, int i31111116) {
                                if ((i31111116 & 11) == 2 && pVar1111111117.b()) {
                                    pVar1111111117.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i31111116, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i31111117 = i2117;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111118 = pVar1111111113;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111119 = pVar1111111114;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111110 = pVar1111111115;
                                androidx.compose.foundation.layout.h1 h1Var1111 = h1Var1110;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111116;
                                int i31111118 = i31111113;
                                ScaffoldKt.b(i31111117, pVar1111111118, qVar, pVar1111111119, pVar11111111110, h1Var1111, pVar20, pVar1111111117, ((i31111118 >> 15) & 14) | (i31111118 & 112) | ((i31111118 >> 21) & bb.c.b.f30796me) | (i31111118 & bb.c.g.f32954lc) | (57344 & i31111118) | (458752 & (i31111118 >> 9)) | ((i31111118 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111117, Integer num) {
                                a(pVar1111111117, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i31111114 | (i31111115 & bb.c.b.f30796me) | (i31111115 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar13 = nVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111117 = pVar6;
                    final int i31111116 = iB;
                    final long j1112 = j13;
                    final long j1113 = j12;
                    final androidx.compose.foundation.layout.h1 h1Var1111 = h1Var2;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar1111111118, int i31111117) {
                            ScaffoldKt.a(nVar13, pVar1111111117, pVar9, pVar10, pVar11, i31111116, j1112, j1113, h1Var1111, content, pVar1111111118, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111118, Integer num) {
                            a(pVar1111111118, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i13 |= 24576;
                pVar8 = pVar4;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i11 & 458752) == 0) {
                    if (pVarF.y(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 29360128) == 0) {
                    jC = j11;
                    if ((i12 & 128) == 0) {
                        i25 = 4194304;
                    } else {
                        i25 = 4194304;
                    }
                    i13 |= i25;
                } else {
                    jC = j11;
                }
                if ((234881024 & i11) != 0) {
                    i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i11) == 0) {
                        if (pVarF.s(content)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                    }
                    if ((1533916891 & i13) == 306783378) {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i2118 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111118 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111119 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111110 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var1112 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111 = pVarB;
                        final int i31111117 = i24;
                        int i31111118 = 12582912 | (i24 & 14);
                        int i31111119 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11111111112, int i311111110) {
                                if ((i311111110 & 11) == 2 && pVar11111111112.b()) {
                                    pVar11111111112.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i311111110, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i311111111 = i2118;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111113 = pVar1111111118;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111114 = pVar1111111119;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111115 = pVar11111111110;
                                androidx.compose.foundation.layout.h1 h1Var1113 = h1Var1112;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111111;
                                int i311111112 = i31111117;
                                ScaffoldKt.b(i311111111, pVar11111111113, qVar, pVar11111111114, pVar11111111115, h1Var1113, pVar20, pVar11111111112, ((i311111112 >> 15) & 14) | (i311111112 & 112) | ((i311111112 >> 21) & bb.c.b.f30796me) | (i311111112 & bb.c.g.f32954lc) | (57344 & i311111112) | (458752 & (i311111112 >> 9)) | ((i311111112 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111112, Integer num) {
                                a(pVar11111111112, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i31111118 | (i31111119 & bb.c.b.f30796me) | (i31111119 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i2119 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111112 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111113 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111114 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var1113 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111115 = pVarB;
                        final int i311111110 = i24;
                        int i311111111 = 12582912 | (i24 & 14);
                        int i311111112 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11111111116, int i311111113) {
                                if ((i311111113 & 11) == 2 && pVar11111111116.b()) {
                                    pVar11111111116.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i311111113, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i311111114 = i2119;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111117 = pVar11111111112;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111118 = pVar11111111113;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111119 = pVar11111111114;
                                androidx.compose.foundation.layout.h1 h1Var1114 = h1Var1113;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111115;
                                int i311111115 = i311111110;
                                ScaffoldKt.b(i311111114, pVar11111111117, qVar, pVar11111111118, pVar11111111119, h1Var1114, pVar20, pVar11111111116, ((i311111115 >> 15) & 14) | (i311111115 & 112) | ((i311111115 >> 21) & bb.c.b.f30796me) | (i311111115 & bb.c.g.f32954lc) | (57344 & i311111115) | (458752 & (i311111115 >> 9)) | ((i311111115 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111116, Integer num) {
                                a(pVar11111111116, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i311111111 | (i311111112 & bb.c.b.f30796me) | (i311111112 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar14 = nVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111116 = pVar6;
                    final int i311111113 = iB;
                    final long j1114 = j13;
                    final long j1115 = j12;
                    final androidx.compose.foundation.layout.h1 h1Var1114 = h1Var2;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar11111111117, int i311111114) {
                            ScaffoldKt.a(nVar14, pVar11111111116, pVar9, pVar10, pVar11, i311111113, j1114, j1115, h1Var1114, content, pVar11111111117, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111117, Integer num) {
                            a(pVar11111111117, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i22 = com.google.android.exoplayer2.j.G;
                i13 |= i22;
                if ((1533916891 & i13) == 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i21110 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111117 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111118 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111119 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var1115 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111110 = pVarB;
                    final int i311111114 = i24;
                    int i311111115 = 12582912 | (i24 & 14);
                    int i311111116 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111111111111, int i311111117) {
                            if ((i311111117 & 11) == 2 && pVar111111111111.b()) {
                                pVar111111111111.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i311111117, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i311111118 = i21110;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111112 = pVar11111111117;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111113 = pVar11111111118;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111114 = pVar11111111119;
                            androidx.compose.foundation.layout.h1 h1Var1116 = h1Var1115;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111110;
                            int i311111119 = i311111114;
                            ScaffoldKt.b(i311111118, pVar111111111112, qVar, pVar111111111113, pVar111111111114, h1Var1116, pVar20, pVar111111111111, ((i311111119 >> 15) & 14) | (i311111119 & 112) | ((i311111119 >> 21) & bb.c.b.f30796me) | (i311111119 & bb.c.g.f32954lc) | (57344 & i311111119) | (458752 & (i311111119 >> 9)) | ((i311111119 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111, Integer num) {
                            a(pVar111111111111, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i311111115 | (i311111116 & bb.c.b.f30796me) | (i311111116 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i21111 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111112 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111113 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var1116 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111114 = pVarB;
                    final int i311111117 = i24;
                    int i311111118 = 12582912 | (i24 & 14);
                    int i311111119 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111111111115, int i3111111110) {
                            if ((i3111111110 & 11) == 2 && pVar111111111115.b()) {
                                pVar111111111115.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i3111111110, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i3111111111 = i21111;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111116 = pVar111111111111;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111117 = pVar111111111112;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111118 = pVar111111111113;
                            androidx.compose.foundation.layout.h1 h1Var1117 = h1Var1116;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111114;
                            int i3111111112 = i311111117;
                            ScaffoldKt.b(i3111111111, pVar111111111116, qVar, pVar111111111117, pVar111111111118, h1Var1117, pVar20, pVar111111111115, ((i3111111112 >> 15) & 14) | (i3111111112 & 112) | ((i3111111112 >> 21) & bb.c.b.f30796me) | (i3111111112 & bb.c.g.f32954lc) | (57344 & i3111111112) | (458752 & (i3111111112 >> 9)) | ((i3111111112 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111115, Integer num) {
                            a(pVar111111111115, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i311111118 | (i311111119 & bb.c.b.f30796me) | (i311111119 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar15 = nVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111115 = pVar6;
                final int i3111111110 = iB;
                final long j1116 = j13;
                final long j1117 = j12;
                final androidx.compose.foundation.layout.h1 h1Var1117 = h1Var2;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar111111111116, int i3111111111) {
                        ScaffoldKt.a(nVar15, pVar111111111115, pVar9, pVar10, pVar11, i3111111110, j1116, j1117, h1Var1117, content, pVar111111111116, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111116, Integer num) {
                        a(pVar111111111116, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= bb.c.d.f31193dj;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((57344 & i11) == 0) {
                    pVar8 = pVar4;
                    if (pVarF.s(pVar8)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i11 & 458752) == 0) {
                    if (pVarF.y(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 29360128) == 0) {
                    jC = j11;
                    if ((i12 & 128) == 0) {
                        i25 = 4194304;
                    } else {
                        i25 = 4194304;
                    }
                    i13 |= i25;
                } else {
                    jC = j11;
                }
                if ((234881024 & i11) != 0) {
                    i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i11) == 0) {
                        if (pVarF.s(content)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                    }
                    if ((1533916891 & i13) == 306783378) {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i21112 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111116 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111117 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111118 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var1118 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111119 = pVarB;
                        final int i3111111111 = i24;
                        int i3111111112 = 12582912 | (i24 & 14);
                        int i3111111113 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1111111111110, int i3111111114) {
                                if ((i3111111114 & 11) == 2 && pVar1111111111110.b()) {
                                    pVar1111111111110.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i3111111114, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i3111111115 = i21112;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111 = pVar111111111116;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111112 = pVar111111111117;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111113 = pVar111111111118;
                                androidx.compose.foundation.layout.h1 h1Var1119 = h1Var1118;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111119;
                                int i3111111116 = i3111111111;
                                ScaffoldKt.b(i3111111115, pVar1111111111111, qVar, pVar1111111111112, pVar1111111111113, h1Var1119, pVar20, pVar1111111111110, ((i3111111116 >> 15) & 14) | (i3111111116 & 112) | ((i3111111116 >> 21) & bb.c.b.f30796me) | (i3111111116 & bb.c.g.f32954lc) | (57344 & i3111111116) | (458752 & (i3111111116 >> 9)) | ((i3111111116 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111110, Integer num) {
                                a(pVar1111111111110, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i3111111112 | (i3111111113 & bb.c.b.f30796me) | (i3111111113 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i21113 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111110 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111112 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var1119 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111113 = pVarB;
                        final int i3111111114 = i24;
                        int i3111111115 = 12582912 | (i24 & 14);
                        int i3111111116 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1111111111114, int i3111111117) {
                                if ((i3111111117 & 11) == 2 && pVar1111111111114.b()) {
                                    pVar1111111111114.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i3111111117, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i3111111118 = i21113;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111115 = pVar1111111111110;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111116 = pVar1111111111111;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111117 = pVar1111111111112;
                                androidx.compose.foundation.layout.h1 h1Var11110 = h1Var1119;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111113;
                                int i3111111119 = i3111111114;
                                ScaffoldKt.b(i3111111118, pVar1111111111115, qVar, pVar1111111111116, pVar1111111111117, h1Var11110, pVar20, pVar1111111111114, ((i3111111119 >> 15) & 14) | (i3111111119 & 112) | ((i3111111119 >> 21) & bb.c.b.f30796me) | (i3111111119 & bb.c.g.f32954lc) | (57344 & i3111111119) | (458752 & (i3111111119 >> 9)) | ((i3111111119 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111114, Integer num) {
                                a(pVar1111111111114, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i3111111115 | (i3111111116 & bb.c.b.f30796me) | (i3111111116 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar16 = nVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111114 = pVar6;
                    final int i3111111117 = iB;
                    final long j1118 = j13;
                    final long j1119 = j12;
                    final androidx.compose.foundation.layout.h1 h1Var11110 = h1Var2;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar1111111111115, int i3111111118) {
                            ScaffoldKt.a(nVar16, pVar1111111111114, pVar9, pVar10, pVar11, i3111111117, j1118, j1119, h1Var11110, content, pVar1111111111115, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111115, Integer num) {
                            a(pVar1111111111115, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i22 = com.google.android.exoplayer2.j.G;
                i13 |= i22;
                if ((1533916891 & i13) == 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i21114 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111115 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111116 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111117 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var11111 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111118 = pVarB;
                    final int i3111111118 = i24;
                    int i3111111119 = 12582912 | (i24 & 14);
                    int i31111111110 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1111111111119, int i31111111111) {
                            if ((i31111111111 & 11) == 2 && pVar1111111111119.b()) {
                                pVar1111111111119.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i31111111111, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i31111111112 = i21114;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111110 = pVar1111111111115;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111 = pVar1111111111116;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111112 = pVar1111111111117;
                            androidx.compose.foundation.layout.h1 h1Var11112 = h1Var11111;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111118;
                            int i31111111113 = i3111111118;
                            ScaffoldKt.b(i31111111112, pVar11111111111110, qVar, pVar11111111111111, pVar11111111111112, h1Var11112, pVar20, pVar1111111111119, ((i31111111113 >> 15) & 14) | (i31111111113 & 112) | ((i31111111113 >> 21) & bb.c.b.f30796me) | (i31111111113 & bb.c.g.f32954lc) | (57344 & i31111111113) | (458752 & (i31111111113 >> 9)) | ((i31111111113 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111119, Integer num) {
                            a(pVar1111111111119, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i3111111119 | (i31111111110 & bb.c.b.f30796me) | (i31111111110 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i21115 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111119 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111110 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var11112 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111112 = pVarB;
                    final int i31111111111 = i24;
                    int i31111111112 = 12582912 | (i24 & 14);
                    int i31111111113 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11111111111113, int i31111111114) {
                            if ((i31111111114 & 11) == 2 && pVar11111111111113.b()) {
                                pVar11111111111113.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i31111111114, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i31111111115 = i21115;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111114 = pVar1111111111119;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111115 = pVar11111111111110;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111116 = pVar11111111111111;
                            androidx.compose.foundation.layout.h1 h1Var11113 = h1Var11112;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111111112;
                            int i31111111116 = i31111111111;
                            ScaffoldKt.b(i31111111115, pVar11111111111114, qVar, pVar11111111111115, pVar11111111111116, h1Var11113, pVar20, pVar11111111111113, ((i31111111116 >> 15) & 14) | (i31111111116 & 112) | ((i31111111116 >> 21) & bb.c.b.f30796me) | (i31111111116 & bb.c.g.f32954lc) | (57344 & i31111111116) | (458752 & (i31111111116 >> 9)) | ((i31111111116 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111113, Integer num) {
                            a(pVar11111111111113, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i31111111112 | (i31111111113 & bb.c.b.f30796me) | (i31111111113 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar17 = nVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111113 = pVar6;
                final int i31111111114 = iB;
                final long j11110 = j13;
                final long j11111 = j12;
                final androidx.compose.foundation.layout.h1 h1Var11113 = h1Var2;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar11111111111114, int i31111111115) {
                        ScaffoldKt.a(nVar17, pVar11111111111113, pVar9, pVar10, pVar11, i31111111114, j11110, j11111, h1Var11113, content, pVar11111111111114, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111114, Integer num) {
                        a(pVar11111111111114, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= 24576;
            pVar8 = pVar4;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i11 & 458752) == 0) {
                if (pVarF.y(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            }
            if ((i11 & 29360128) == 0) {
                jC = j11;
                if ((i12 & 128) == 0) {
                    i25 = 4194304;
                } else {
                    i25 = 4194304;
                }
                i13 |= i25;
            } else {
                jC = j11;
            }
            if ((234881024 & i11) != 0) {
                i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
            }
            if ((i12 & 512) != 0) {
                if ((1879048192 & i11) == 0) {
                    if (pVarF.s(content)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                }
                if ((1533916891 & i13) == 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i21116 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111114 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111115 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111116 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var11114 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111117 = pVarB;
                    final int i31111111115 = i24;
                    int i31111111116 = 12582912 | (i24 & 14);
                    int i31111111117 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11111111111118, int i31111111118) {
                            if ((i31111111118 & 11) == 2 && pVar11111111111118.b()) {
                                pVar11111111111118.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i31111111118, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i31111111119 = i21116;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111119 = pVar11111111111114;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111110 = pVar11111111111115;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111 = pVar11111111111116;
                            androidx.compose.foundation.layout.h1 h1Var11115 = h1Var11114;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111111117;
                            int i311111111110 = i31111111115;
                            ScaffoldKt.b(i31111111119, pVar11111111111119, qVar, pVar111111111111110, pVar111111111111111, h1Var11115, pVar20, pVar11111111111118, ((i311111111110 >> 15) & 14) | (i311111111110 & 112) | ((i311111111110 >> 21) & bb.c.b.f30796me) | (i311111111110 & bb.c.g.f32954lc) | (57344 & i311111111110) | (458752 & (i311111111110 >> 9)) | ((i311111111110 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111118, Integer num) {
                            a(pVar11111111111118, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i31111111116 | (i31111111117 & bb.c.b.f30796me) | (i31111111117 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i21117 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111118 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111119 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111110 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var11115 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111 = pVarB;
                    final int i31111111118 = i24;
                    int i31111111119 = 12582912 | (i24 & 14);
                    int i311111111110 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111111111111112, int i311111111111) {
                            if ((i311111111111 & 11) == 2 && pVar111111111111112.b()) {
                                pVar111111111111112.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i311111111111, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i311111111112 = i21117;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111113 = pVar11111111111118;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111114 = pVar11111111111119;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111115 = pVar111111111111110;
                            androidx.compose.foundation.layout.h1 h1Var11116 = h1Var11115;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111111111;
                            int i311111111113 = i31111111118;
                            ScaffoldKt.b(i311111111112, pVar111111111111113, qVar, pVar111111111111114, pVar111111111111115, h1Var11116, pVar20, pVar111111111111112, ((i311111111113 >> 15) & 14) | (i311111111113 & 112) | ((i311111111113 >> 21) & bb.c.b.f30796me) | (i311111111113 & bb.c.g.f32954lc) | (57344 & i311111111113) | (458752 & (i311111111113 >> 9)) | ((i311111111113 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111112, Integer num) {
                            a(pVar111111111111112, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i31111111119 | (i311111111110 & bb.c.b.f30796me) | (i311111111110 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar18 = nVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111112 = pVar6;
                final int i311111111111 = iB;
                final long j11112 = j13;
                final long j11113 = j12;
                final androidx.compose.foundation.layout.h1 h1Var11116 = h1Var2;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar111111111111113, int i311111111112) {
                        ScaffoldKt.a(nVar18, pVar111111111111112, pVar9, pVar10, pVar11, i311111111111, j11112, j11113, h1Var11116, content, pVar111111111111113, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111113, Integer num) {
                        a(pVar111111111111113, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i22 = com.google.android.exoplayer2.j.G;
            i13 |= i22;
            if ((1533916891 & i13) == 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                }
                final int i21118 = iB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111113 = pVarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111114 = pVarC;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111115 = pVarD;
                final androidx.compose.foundation.layout.h1 h1Var11117 = h1VarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111116 = pVarB;
                final int i311111111112 = i24;
                int i311111111113 = 12582912 | (i24 & 14);
                int i311111111114 = i24 >> 12;
                SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar111111111111117, int i311111111115) {
                        if ((i311111111115 & 11) == 2 && pVar111111111111117.b()) {
                            pVar111111111111117.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1979205334, i311111111115, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                        }
                        int i311111111116 = i21118;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111118 = pVar111111111111113;
                        yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111119 = pVar111111111111114;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111110 = pVar111111111111115;
                        androidx.compose.foundation.layout.h1 h1Var11118 = h1Var11117;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111111116;
                        int i311111111117 = i311111111112;
                        ScaffoldKt.b(i311111111116, pVar111111111111118, qVar, pVar111111111111119, pVar1111111111111110, h1Var11118, pVar20, pVar111111111111117, ((i311111111117 >> 15) & 14) | (i311111111117 & 112) | ((i311111111117 >> 21) & bb.c.b.f30796me) | (i311111111117 & bb.c.g.f32954lc) | (57344 & i311111111117) | (458752 & (i311111111117 >> 9)) | ((i311111111117 << 12) & 3670016));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111117, Integer num) {
                        a(pVar111111111111117, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, i311111111113 | (i311111111114 & bb.c.b.f30796me) | (i311111111114 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1Var2 = h1VarA;
                j12 = jC;
                j13 = jC2;
                pVar9 = pVarB;
                pVar10 = pVarC;
                pVar11 = pVarD;
                pVar6 = pVarA;
                nVar3 = nVar2;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                }
                final int i21119 = iB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111117 = pVarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111118 = pVarC;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111119 = pVarD;
                final androidx.compose.foundation.layout.h1 h1Var11118 = h1VarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111110 = pVarB;
                final int i311111111115 = i24;
                int i311111111116 = 12582912 | (i24 & 14);
                int i311111111117 = i24 >> 12;
                SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111111, int i311111111118) {
                        if ((i311111111118 & 11) == 2 && pVar1111111111111111.b()) {
                            pVar1111111111111111.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1979205334, i311111111118, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                        }
                        int i311111111119 = i21119;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111112 = pVar111111111111117;
                        yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111113 = pVar111111111111118;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111114 = pVar111111111111119;
                        androidx.compose.foundation.layout.h1 h1Var11119 = h1Var11118;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111111110;
                        int i3111111111110 = i311111111115;
                        ScaffoldKt.b(i311111111119, pVar1111111111111112, qVar, pVar1111111111111113, pVar1111111111111114, h1Var11119, pVar20, pVar1111111111111111, ((i3111111111110 >> 15) & 14) | (i3111111111110 & 112) | ((i3111111111110 >> 21) & bb.c.b.f30796me) | (i3111111111110 & bb.c.g.f32954lc) | (57344 & i3111111111110) | (458752 & (i3111111111110 >> 9)) | ((i3111111111110 << 12) & 3670016));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111111, Integer num) {
                        a(pVar1111111111111111, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, i311111111116 | (i311111111117 & bb.c.b.f30796me) | (i311111111117 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1Var2 = h1VarA;
                j12 = jC;
                j13 = jC2;
                pVar9 = pVarB;
                pVar10 = pVarC;
                pVar11 = pVarD;
                pVar6 = pVarA;
                nVar3 = nVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar19 = nVar3;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111 = pVar6;
            final int i311111111118 = iB;
            final long j11114 = j13;
            final long j11115 = j12;
            final androidx.compose.foundation.layout.h1 h1Var11119 = h1Var2;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111112, int i311111111119) {
                    ScaffoldKt.a(nVar19, pVar1111111111111111, pVar9, pVar10, pVar11, i311111111118, j11114, j11115, h1Var11119, content, pVar1111111111111112, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111112, Integer num) {
                    a(pVar1111111111111112, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= 48;
        pVar6 = pVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & bb.c.b.f30796me) == 0) {
                pVar7 = pVar2;
                if (pVarF.s(pVar7)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.s(pVar3)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((57344 & i11) == 0) {
                        pVar8 = pVar4;
                        if (pVarF.s(pVar8)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= androidx.profileinstaller.o.c.f26824k;
                    } else if ((i11 & 458752) == 0) {
                        if (pVarF.y(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 3670016) != 0) {
                        if ((i12 & 64) == 0) {
                            i26 = 524288;
                        } else {
                            i26 = 524288;
                        }
                        i13 |= i26;
                    }
                    if ((i11 & 29360128) == 0) {
                        jC = j11;
                        if ((i12 & 128) == 0) {
                            i25 = 4194304;
                        } else {
                            i25 = 4194304;
                        }
                        i13 |= i25;
                    } else {
                        jC = j11;
                    }
                    if ((234881024 & i11) != 0) {
                        i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
                    }
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i11) == 0) {
                            if (pVarF.s(content)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                        }
                        if ((1533916891 & i13) == 306783378) {
                            pVarF.W();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            } else {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                            }
                            final int i211110 = iB;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111112 = pVarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111113 = pVarC;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111114 = pVarD;
                            final androidx.compose.foundation.layout.h1 h1Var111110 = h1VarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111115 = pVarB;
                            final int i311111111119 = i24;
                            int i3111111111110 = 12582912 | (i24 & 14);
                            int i3111111111111 = i24 >> 12;
                            SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111116, int i3111111111112) {
                                    if ((i3111111111112 & 11) == 2 && pVar1111111111111116.b()) {
                                        pVar1111111111111116.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1979205334, i3111111111112, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                    }
                                    int i3111111111113 = i211110;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111117 = pVar1111111111111112;
                                    yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111118 = pVar1111111111111113;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111119 = pVar1111111111111114;
                                    androidx.compose.foundation.layout.h1 h1Var111111 = h1Var111110;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111111115;
                                    int i3111111111114 = i311111111119;
                                    ScaffoldKt.b(i3111111111113, pVar1111111111111117, qVar, pVar1111111111111118, pVar1111111111111119, h1Var111111, pVar20, pVar1111111111111116, ((i3111111111114 >> 15) & 14) | (i3111111111114 & 112) | ((i3111111111114 >> 21) & bb.c.b.f30796me) | (i3111111111114 & bb.c.g.f32954lc) | (57344 & i3111111111114) | (458752 & (i3111111111114 >> 9)) | ((i3111111111114 << 12) & 3670016));
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111116, Integer num) {
                                    a(pVar1111111111111116, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVarF, i3111111111110 | (i3111111111111 & bb.c.b.f30796me) | (i3111111111111 & bb.c.g.f32954lc), 114);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            h1Var2 = h1VarA;
                            j12 = jC;
                            j13 = jC2;
                            pVar9 = pVarB;
                            pVar10 = pVarC;
                            pVar11 = pVarD;
                            pVar6 = pVarA;
                            nVar3 = nVar2;
                        } else {
                            pVarF.W();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            } else {
                                if (i27 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i28 != 0) {
                                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                                } else {
                                    pVarA = pVar6;
                                }
                                if (i14 != 0) {
                                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                                } else {
                                    pVarB = pVar7;
                                }
                                if (i16 != 0) {
                                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i18 != 0) {
                                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i20 != 0) {
                                    iB = z.INSTANCE.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jC2 = o0.f12059a.a(pVarF, 6).c();
                                } else {
                                    i23 = i13;
                                    jC2 = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    h1VarA = e1.f11836a.a(pVarF, 6);
                                    nVar2 = nVar2;
                                } else {
                                    i24 = i23;
                                    h1VarA = h1Var;
                                }
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                            }
                            final int i211111 = iB;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111116 = pVarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111117 = pVarC;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111118 = pVarD;
                            final androidx.compose.foundation.layout.h1 h1Var111111 = h1VarA;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111119 = pVarB;
                            final int i3111111111112 = i24;
                            int i3111111111113 = 12582912 | (i24 & 14);
                            int i3111111111114 = i24 >> 12;
                            SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111110, int i3111111111115) {
                                    if ((i3111111111115 & 11) == 2 && pVar11111111111111110.b()) {
                                        pVar11111111111111110.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1979205334, i3111111111115, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                    }
                                    int i3111111111116 = i211111;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111 = pVar1111111111111116;
                                    yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111112 = pVar1111111111111117;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111113 = pVar1111111111111118;
                                    androidx.compose.foundation.layout.h1 h1Var111112 = h1Var111111;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111111119;
                                    int i3111111111117 = i3111111111112;
                                    ScaffoldKt.b(i3111111111116, pVar11111111111111111, qVar, pVar11111111111111112, pVar11111111111111113, h1Var111112, pVar20, pVar11111111111111110, ((i3111111111117 >> 15) & 14) | (i3111111111117 & 112) | ((i3111111111117 >> 21) & bb.c.b.f30796me) | (i3111111111117 & bb.c.g.f32954lc) | (57344 & i3111111111117) | (458752 & (i3111111111117 >> 9)) | ((i3111111111117 << 12) & 3670016));
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111110, Integer num) {
                                    a(pVar11111111111111110, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVarF, i3111111111113 | (i3111111111114 & bb.c.b.f30796me) | (i3111111111114 & bb.c.g.f32954lc), 114);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            h1Var2 = h1VarA;
                            j12 = jC;
                            j13 = jC2;
                            pVar9 = pVarB;
                            pVar10 = pVarC;
                            pVar11 = pVarD;
                            pVar6 = pVarA;
                            nVar3 = nVar2;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        final androidx.compose.ui.n nVar110 = nVar3;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111110 = pVar6;
                        final int i3111111111115 = iB;
                        final long j11116 = j13;
                        final long j11117 = j12;
                        final androidx.compose.foundation.layout.h1 h1Var111112 = h1Var2;
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111111, int i3111111111116) {
                                ScaffoldKt.a(nVar110, pVar11111111111111110, pVar9, pVar10, pVar11, i3111111111115, j11116, j11117, h1Var111112, content, pVar11111111111111111, i11 | 1, i12);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111111, Integer num) {
                                a(pVar11111111111111111, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    }
                    i22 = com.google.android.exoplayer2.j.G;
                    i13 |= i22;
                    if ((1533916891 & i13) == 306783378) {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i211112 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111112 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111113 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var111113 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111114 = pVarB;
                        final int i3111111111116 = i24;
                        int i3111111111117 = 12582912 | (i24 & 14);
                        int i3111111111118 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111115, int i3111111111119) {
                                if ((i3111111111119 & 11) == 2 && pVar11111111111111115.b()) {
                                    pVar11111111111111115.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i3111111111119, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i31111111111110 = i211112;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111116 = pVar11111111111111111;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111117 = pVar11111111111111112;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111118 = pVar11111111111111113;
                                androidx.compose.foundation.layout.h1 h1Var111114 = h1Var111113;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111111111114;
                                int i31111111111111 = i3111111111116;
                                ScaffoldKt.b(i31111111111110, pVar11111111111111116, qVar, pVar11111111111111117, pVar11111111111111118, h1Var111114, pVar20, pVar11111111111111115, ((i31111111111111 >> 15) & 14) | (i31111111111111 & 112) | ((i31111111111111 >> 21) & bb.c.b.f30796me) | (i31111111111111 & bb.c.g.f32954lc) | (57344 & i31111111111111) | (458752 & (i31111111111111 >> 9)) | ((i31111111111111 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111115, Integer num) {
                                a(pVar11111111111111115, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i3111111111117 | (i3111111111118 & bb.c.b.f30796me) | (i3111111111118 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i211113 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111115 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111116 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111117 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var111114 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111118 = pVarB;
                        final int i3111111111119 = i24;
                        int i31111111111110 = 12582912 | (i24 & 14);
                        int i31111111111111 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111119, int i31111111111112) {
                                if ((i31111111111112 & 11) == 2 && pVar11111111111111119.b()) {
                                    pVar11111111111111119.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i31111111111112, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i31111111111113 = i211113;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111110 = pVar11111111111111115;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111 = pVar11111111111111116;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111112 = pVar11111111111111117;
                                androidx.compose.foundation.layout.h1 h1Var111115 = h1Var111114;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111111111118;
                                int i31111111111114 = i3111111111119;
                                ScaffoldKt.b(i31111111111113, pVar111111111111111110, qVar, pVar111111111111111111, pVar111111111111111112, h1Var111115, pVar20, pVar11111111111111119, ((i31111111111114 >> 15) & 14) | (i31111111111114 & 112) | ((i31111111111114 >> 21) & bb.c.b.f30796me) | (i31111111111114 & bb.c.g.f32954lc) | (57344 & i31111111111114) | (458752 & (i31111111111114 >> 9)) | ((i31111111111114 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111119, Integer num) {
                                a(pVar11111111111111119, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i31111111111110 | (i31111111111111 & bb.c.b.f30796me) | (i31111111111111 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar111 = nVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111119 = pVar6;
                    final int i31111111111112 = iB;
                    final long j11118 = j13;
                    final long j11119 = j12;
                    final androidx.compose.foundation.layout.h1 h1Var111115 = h1Var2;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111110, int i31111111111113) {
                            ScaffoldKt.a(nVar111, pVar11111111111111119, pVar9, pVar10, pVar11, i31111111111112, j11118, j11119, h1Var111115, content, pVar111111111111111110, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111110, Integer num) {
                            a(pVar111111111111111110, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i13 |= 24576;
                pVar8 = pVar4;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i11 & 458752) == 0) {
                    if (pVarF.y(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 29360128) == 0) {
                    jC = j11;
                    if ((i12 & 128) == 0) {
                        i25 = 4194304;
                    } else {
                        i25 = 4194304;
                    }
                    i13 |= i25;
                } else {
                    jC = j11;
                }
                if ((234881024 & i11) != 0) {
                    i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i11) == 0) {
                        if (pVarF.s(content)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                    }
                    if ((1533916891 & i13) == 306783378) {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i211114 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111110 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111112 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var111116 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111113 = pVarB;
                        final int i31111111111113 = i24;
                        int i31111111111114 = 12582912 | (i24 & 14);
                        int i31111111111115 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111114, int i31111111111116) {
                                if ((i31111111111116 & 11) == 2 && pVar111111111111111114.b()) {
                                    pVar111111111111111114.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i31111111111116, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i31111111111117 = i211114;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111115 = pVar111111111111111110;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111116 = pVar111111111111111111;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111117 = pVar111111111111111112;
                                androidx.compose.foundation.layout.h1 h1Var111117 = h1Var111116;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111111111113;
                                int i31111111111118 = i31111111111113;
                                ScaffoldKt.b(i31111111111117, pVar111111111111111115, qVar, pVar111111111111111116, pVar111111111111111117, h1Var111117, pVar20, pVar111111111111111114, ((i31111111111118 >> 15) & 14) | (i31111111111118 & 112) | ((i31111111111118 >> 21) & bb.c.b.f30796me) | (i31111111111118 & bb.c.g.f32954lc) | (57344 & i31111111111118) | (458752 & (i31111111111118 >> 9)) | ((i31111111111118 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111114, Integer num) {
                                a(pVar111111111111111114, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i31111111111114 | (i31111111111115 & bb.c.b.f30796me) | (i31111111111115 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i211115 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111114 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111115 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111116 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var111117 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111117 = pVarB;
                        final int i31111111111116 = i24;
                        int i31111111111117 = 12582912 | (i24 & 14);
                        int i31111111111118 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111118, int i31111111111119) {
                                if ((i31111111111119 & 11) == 2 && pVar111111111111111118.b()) {
                                    pVar111111111111111118.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i31111111111119, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i311111111111110 = i211115;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111119 = pVar111111111111111114;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111110 = pVar111111111111111115;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111 = pVar111111111111111116;
                                androidx.compose.foundation.layout.h1 h1Var111118 = h1Var111117;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111111111117;
                                int i311111111111111 = i31111111111116;
                                ScaffoldKt.b(i311111111111110, pVar111111111111111119, qVar, pVar1111111111111111110, pVar1111111111111111111, h1Var111118, pVar20, pVar111111111111111118, ((i311111111111111 >> 15) & 14) | (i311111111111111 & 112) | ((i311111111111111 >> 21) & bb.c.b.f30796me) | (i311111111111111 & bb.c.g.f32954lc) | (57344 & i311111111111111) | (458752 & (i311111111111111 >> 9)) | ((i311111111111111 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111118, Integer num) {
                                a(pVar111111111111111118, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i31111111111117 | (i31111111111118 & bb.c.b.f30796me) | (i31111111111118 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar112 = nVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111118 = pVar6;
                    final int i31111111111119 = iB;
                    final long j111110 = j13;
                    final long j111111 = j12;
                    final androidx.compose.foundation.layout.h1 h1Var111118 = h1Var2;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111119, int i311111111111110) {
                            ScaffoldKt.a(nVar112, pVar111111111111111118, pVar9, pVar10, pVar11, i31111111111119, j111110, j111111, h1Var111118, content, pVar111111111111111119, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111119, Integer num) {
                            a(pVar111111111111111119, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i22 = com.google.android.exoplayer2.j.G;
                i13 |= i22;
                if ((1533916891 & i13) == 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i211116 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111119 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111110 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var111119 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111112 = pVarB;
                    final int i311111111111110 = i24;
                    int i311111111111111 = 12582912 | (i24 & 14);
                    int i311111111111112 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111111113, int i311111111111113) {
                            if ((i311111111111113 & 11) == 2 && pVar1111111111111111113.b()) {
                                pVar1111111111111111113.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i311111111111113, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i311111111111114 = i211116;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111114 = pVar111111111111111119;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111115 = pVar1111111111111111110;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111116 = pVar1111111111111111111;
                            androidx.compose.foundation.layout.h1 h1Var1111110 = h1Var111119;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111111111112;
                            int i311111111111115 = i311111111111110;
                            ScaffoldKt.b(i311111111111114, pVar1111111111111111114, qVar, pVar1111111111111111115, pVar1111111111111111116, h1Var1111110, pVar20, pVar1111111111111111113, ((i311111111111115 >> 15) & 14) | (i311111111111115 & 112) | ((i311111111111115 >> 21) & bb.c.b.f30796me) | (i311111111111115 & bb.c.g.f32954lc) | (57344 & i311111111111115) | (458752 & (i311111111111115 >> 9)) | ((i311111111111115 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111111113, Integer num) {
                            a(pVar1111111111111111113, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i311111111111111 | (i311111111111112 & bb.c.b.f30796me) | (i311111111111112 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i211117 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111113 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111114 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111115 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var1111110 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111116 = pVarB;
                    final int i311111111111113 = i24;
                    int i311111111111114 = 12582912 | (i24 & 14);
                    int i311111111111115 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111111117, int i311111111111116) {
                            if ((i311111111111116 & 11) == 2 && pVar1111111111111111117.b()) {
                                pVar1111111111111111117.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i311111111111116, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i311111111111117 = i211117;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111118 = pVar1111111111111111113;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111119 = pVar1111111111111111114;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111110 = pVar1111111111111111115;
                            androidx.compose.foundation.layout.h1 h1Var1111111 = h1Var1111110;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111111111116;
                            int i311111111111118 = i311111111111113;
                            ScaffoldKt.b(i311111111111117, pVar1111111111111111118, qVar, pVar1111111111111111119, pVar11111111111111111110, h1Var1111111, pVar20, pVar1111111111111111117, ((i311111111111118 >> 15) & 14) | (i311111111111118 & 112) | ((i311111111111118 >> 21) & bb.c.b.f30796me) | (i311111111111118 & bb.c.g.f32954lc) | (57344 & i311111111111118) | (458752 & (i311111111111118 >> 9)) | ((i311111111111118 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111111117, Integer num) {
                            a(pVar1111111111111111117, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i311111111111114 | (i311111111111115 & bb.c.b.f30796me) | (i311111111111115 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar113 = nVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111117 = pVar6;
                final int i311111111111116 = iB;
                final long j111112 = j13;
                final long j111113 = j12;
                final androidx.compose.foundation.layout.h1 h1Var1111111 = h1Var2;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111111118, int i311111111111117) {
                        ScaffoldKt.a(nVar113, pVar1111111111111111117, pVar9, pVar10, pVar11, i311111111111116, j111112, j111113, h1Var1111111, content, pVar1111111111111111118, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111111118, Integer num) {
                        a(pVar1111111111111111118, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= bb.c.d.f31193dj;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((57344 & i11) == 0) {
                    pVar8 = pVar4;
                    if (pVarF.s(pVar8)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i11 & 458752) == 0) {
                    if (pVarF.y(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 29360128) == 0) {
                    jC = j11;
                    if ((i12 & 128) == 0) {
                        i25 = 4194304;
                    } else {
                        i25 = 4194304;
                    }
                    i13 |= i25;
                } else {
                    jC = j11;
                }
                if ((234881024 & i11) != 0) {
                    i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i11) == 0) {
                        if (pVarF.s(content)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                    }
                    if ((1533916891 & i13) == 306783378) {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i211118 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111118 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111119 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111110 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var1111112 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111 = pVarB;
                        final int i311111111111117 = i24;
                        int i311111111111118 = 12582912 | (i24 & 14);
                        int i311111111111119 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111111112, int i3111111111111110) {
                                if ((i3111111111111110 & 11) == 2 && pVar11111111111111111112.b()) {
                                    pVar11111111111111111112.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i3111111111111110, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i3111111111111111 = i211118;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111113 = pVar1111111111111111118;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111114 = pVar1111111111111111119;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111115 = pVar11111111111111111110;
                                androidx.compose.foundation.layout.h1 h1Var1111113 = h1Var1111112;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111111111111111;
                                int i3111111111111112 = i311111111111117;
                                ScaffoldKt.b(i3111111111111111, pVar11111111111111111113, qVar, pVar11111111111111111114, pVar11111111111111111115, h1Var1111113, pVar20, pVar11111111111111111112, ((i3111111111111112 >> 15) & 14) | (i3111111111111112 & 112) | ((i3111111111111112 >> 21) & bb.c.b.f30796me) | (i3111111111111112 & bb.c.g.f32954lc) | (57344 & i3111111111111112) | (458752 & (i3111111111111112 >> 9)) | ((i3111111111111112 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111111112, Integer num) {
                                a(pVar11111111111111111112, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i311111111111118 | (i311111111111119 & bb.c.b.f30796me) | (i311111111111119 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i211119 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111112 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111113 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111114 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var1111113 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111115 = pVarB;
                        final int i3111111111111110 = i24;
                        int i3111111111111111 = 12582912 | (i24 & 14);
                        int i3111111111111112 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111111116, int i3111111111111113) {
                                if ((i3111111111111113 & 11) == 2 && pVar11111111111111111116.b()) {
                                    pVar11111111111111111116.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i3111111111111113, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i3111111111111114 = i211119;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111117 = pVar11111111111111111112;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111118 = pVar11111111111111111113;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111119 = pVar11111111111111111114;
                                androidx.compose.foundation.layout.h1 h1Var1111114 = h1Var1111113;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111111111111115;
                                int i3111111111111115 = i3111111111111110;
                                ScaffoldKt.b(i3111111111111114, pVar11111111111111111117, qVar, pVar11111111111111111118, pVar11111111111111111119, h1Var1111114, pVar20, pVar11111111111111111116, ((i3111111111111115 >> 15) & 14) | (i3111111111111115 & 112) | ((i3111111111111115 >> 21) & bb.c.b.f30796me) | (i3111111111111115 & bb.c.g.f32954lc) | (57344 & i3111111111111115) | (458752 & (i3111111111111115 >> 9)) | ((i3111111111111115 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111111116, Integer num) {
                                a(pVar11111111111111111116, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i3111111111111111 | (i3111111111111112 & bb.c.b.f30796me) | (i3111111111111112 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar114 = nVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111116 = pVar6;
                    final int i3111111111111113 = iB;
                    final long j111114 = j13;
                    final long j111115 = j12;
                    final androidx.compose.foundation.layout.h1 h1Var1111114 = h1Var2;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111111117, int i3111111111111114) {
                            ScaffoldKt.a(nVar114, pVar11111111111111111116, pVar9, pVar10, pVar11, i3111111111111113, j111114, j111115, h1Var1111114, content, pVar11111111111111111117, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111111117, Integer num) {
                            a(pVar11111111111111111117, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i22 = com.google.android.exoplayer2.j.G;
                i13 |= i22;
                if ((1533916891 & i13) == 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i2111110 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111117 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111118 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111119 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var1111115 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111110 = pVarB;
                    final int i3111111111111114 = i24;
                    int i3111111111111115 = 12582912 | (i24 & 14);
                    int i3111111111111116 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111111111, int i3111111111111117) {
                            if ((i3111111111111117 & 11) == 2 && pVar111111111111111111111.b()) {
                                pVar111111111111111111111.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i3111111111111117, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i3111111111111118 = i2111110;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111112 = pVar11111111111111111117;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111113 = pVar11111111111111111118;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111114 = pVar11111111111111111119;
                            androidx.compose.foundation.layout.h1 h1Var1111116 = h1Var1111115;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111111111111110;
                            int i3111111111111119 = i3111111111111114;
                            ScaffoldKt.b(i3111111111111118, pVar111111111111111111112, qVar, pVar111111111111111111113, pVar111111111111111111114, h1Var1111116, pVar20, pVar111111111111111111111, ((i3111111111111119 >> 15) & 14) | (i3111111111111119 & 112) | ((i3111111111111119 >> 21) & bb.c.b.f30796me) | (i3111111111111119 & bb.c.g.f32954lc) | (57344 & i3111111111111119) | (458752 & (i3111111111111119 >> 9)) | ((i3111111111111119 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111111111, Integer num) {
                            a(pVar111111111111111111111, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i3111111111111115 | (i3111111111111116 & bb.c.b.f30796me) | (i3111111111111116 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i2111111 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111112 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111113 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var1111116 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111114 = pVarB;
                    final int i3111111111111117 = i24;
                    int i3111111111111118 = 12582912 | (i24 & 14);
                    int i3111111111111119 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111111115, int i31111111111111110) {
                            if ((i31111111111111110 & 11) == 2 && pVar111111111111111111115.b()) {
                                pVar111111111111111111115.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i31111111111111110, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i31111111111111111 = i2111111;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111116 = pVar111111111111111111111;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111117 = pVar111111111111111111112;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111118 = pVar111111111111111111113;
                            androidx.compose.foundation.layout.h1 h1Var1111117 = h1Var1111116;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111111111111114;
                            int i31111111111111112 = i3111111111111117;
                            ScaffoldKt.b(i31111111111111111, pVar111111111111111111116, qVar, pVar111111111111111111117, pVar111111111111111111118, h1Var1111117, pVar20, pVar111111111111111111115, ((i31111111111111112 >> 15) & 14) | (i31111111111111112 & 112) | ((i31111111111111112 >> 21) & bb.c.b.f30796me) | (i31111111111111112 & bb.c.g.f32954lc) | (57344 & i31111111111111112) | (458752 & (i31111111111111112 >> 9)) | ((i31111111111111112 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111111115, Integer num) {
                            a(pVar111111111111111111115, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i3111111111111118 | (i3111111111111119 & bb.c.b.f30796me) | (i3111111111111119 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar115 = nVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111115 = pVar6;
                final int i31111111111111110 = iB;
                final long j111116 = j13;
                final long j111117 = j12;
                final androidx.compose.foundation.layout.h1 h1Var1111117 = h1Var2;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111111116, int i31111111111111111) {
                        ScaffoldKt.a(nVar115, pVar111111111111111111115, pVar9, pVar10, pVar11, i31111111111111110, j111116, j111117, h1Var1111117, content, pVar111111111111111111116, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111111116, Integer num) {
                        a(pVar111111111111111111116, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= 24576;
            pVar8 = pVar4;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i11 & 458752) == 0) {
                if (pVarF.y(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            }
            if ((i11 & 29360128) == 0) {
                jC = j11;
                if ((i12 & 128) == 0) {
                    i25 = 4194304;
                } else {
                    i25 = 4194304;
                }
                i13 |= i25;
            } else {
                jC = j11;
            }
            if ((234881024 & i11) != 0) {
                i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
            }
            if ((i12 & 512) != 0) {
                if ((1879048192 & i11) == 0) {
                    if (pVarF.s(content)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                }
                if ((1533916891 & i13) == 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i2111112 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111116 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111117 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111118 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var1111118 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111119 = pVarB;
                    final int i31111111111111111 = i24;
                    int i31111111111111112 = 12582912 | (i24 & 14);
                    int i31111111111111113 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111111111110, int i31111111111111114) {
                            if ((i31111111111111114 & 11) == 2 && pVar1111111111111111111110.b()) {
                                pVar1111111111111111111110.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i31111111111111114, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i31111111111111115 = i2111112;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111 = pVar111111111111111111116;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111112 = pVar111111111111111111117;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111113 = pVar111111111111111111118;
                            androidx.compose.foundation.layout.h1 h1Var1111119 = h1Var1111118;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111111111111119;
                            int i31111111111111116 = i31111111111111111;
                            ScaffoldKt.b(i31111111111111115, pVar1111111111111111111111, qVar, pVar1111111111111111111112, pVar1111111111111111111113, h1Var1111119, pVar20, pVar1111111111111111111110, ((i31111111111111116 >> 15) & 14) | (i31111111111111116 & 112) | ((i31111111111111116 >> 21) & bb.c.b.f30796me) | (i31111111111111116 & bb.c.g.f32954lc) | (57344 & i31111111111111116) | (458752 & (i31111111111111116 >> 9)) | ((i31111111111111116 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111111111110, Integer num) {
                            a(pVar1111111111111111111110, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i31111111111111112 | (i31111111111111113 & bb.c.b.f30796me) | (i31111111111111113 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i2111113 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111110 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111112 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var1111119 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111113 = pVarB;
                    final int i31111111111111114 = i24;
                    int i31111111111111115 = 12582912 | (i24 & 14);
                    int i31111111111111116 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111111111114, int i31111111111111117) {
                            if ((i31111111111111117 & 11) == 2 && pVar1111111111111111111114.b()) {
                                pVar1111111111111111111114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i31111111111111117, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i31111111111111118 = i2111113;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111115 = pVar1111111111111111111110;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111116 = pVar1111111111111111111111;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111117 = pVar1111111111111111111112;
                            androidx.compose.foundation.layout.h1 h1Var11111110 = h1Var1111119;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111111111111113;
                            int i31111111111111119 = i31111111111111114;
                            ScaffoldKt.b(i31111111111111118, pVar1111111111111111111115, qVar, pVar1111111111111111111116, pVar1111111111111111111117, h1Var11111110, pVar20, pVar1111111111111111111114, ((i31111111111111119 >> 15) & 14) | (i31111111111111119 & 112) | ((i31111111111111119 >> 21) & bb.c.b.f30796me) | (i31111111111111119 & bb.c.g.f32954lc) | (57344 & i31111111111111119) | (458752 & (i31111111111111119 >> 9)) | ((i31111111111111119 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111111111114, Integer num) {
                            a(pVar1111111111111111111114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i31111111111111115 | (i31111111111111116 & bb.c.b.f30796me) | (i31111111111111116 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar116 = nVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111114 = pVar6;
                final int i31111111111111117 = iB;
                final long j111118 = j13;
                final long j111119 = j12;
                final androidx.compose.foundation.layout.h1 h1Var11111110 = h1Var2;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111111111115, int i31111111111111118) {
                        ScaffoldKt.a(nVar116, pVar1111111111111111111114, pVar9, pVar10, pVar11, i31111111111111117, j111118, j111119, h1Var11111110, content, pVar1111111111111111111115, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111111111115, Integer num) {
                        a(pVar1111111111111111111115, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i22 = com.google.android.exoplayer2.j.G;
            i13 |= i22;
            if ((1533916891 & i13) == 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                }
                final int i2111114 = iB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111115 = pVarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111116 = pVarC;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111117 = pVarD;
                final androidx.compose.foundation.layout.h1 h1Var11111111 = h1VarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111118 = pVarB;
                final int i31111111111111118 = i24;
                int i31111111111111119 = 12582912 | (i24 & 14);
                int i311111111111111110 = i24 >> 12;
                SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111111111119, int i311111111111111111) {
                        if ((i311111111111111111 & 11) == 2 && pVar1111111111111111111119.b()) {
                            pVar1111111111111111111119.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1979205334, i311111111111111111, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                        }
                        int i311111111111111112 = i2111114;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111110 = pVar1111111111111111111115;
                        yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111111 = pVar1111111111111111111116;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111112 = pVar1111111111111111111117;
                        androidx.compose.foundation.layout.h1 h1Var11111112 = h1Var11111111;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111111111111118;
                        int i311111111111111113 = i31111111111111118;
                        ScaffoldKt.b(i311111111111111112, pVar11111111111111111111110, qVar, pVar11111111111111111111111, pVar11111111111111111111112, h1Var11111112, pVar20, pVar1111111111111111111119, ((i311111111111111113 >> 15) & 14) | (i311111111111111113 & 112) | ((i311111111111111113 >> 21) & bb.c.b.f30796me) | (i311111111111111113 & bb.c.g.f32954lc) | (57344 & i311111111111111113) | (458752 & (i311111111111111113 >> 9)) | ((i311111111111111113 << 12) & 3670016));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111111111119, Integer num) {
                        a(pVar1111111111111111111119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, i31111111111111119 | (i311111111111111110 & bb.c.b.f30796me) | (i311111111111111110 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1Var2 = h1VarA;
                j12 = jC;
                j13 = jC2;
                pVar9 = pVarB;
                pVar10 = pVarC;
                pVar11 = pVarD;
                pVar6 = pVarA;
                nVar3 = nVar2;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                }
                final int i2111115 = iB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111119 = pVarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111110 = pVarC;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111 = pVarD;
                final androidx.compose.foundation.layout.h1 h1Var11111112 = h1VarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111112 = pVarB;
                final int i311111111111111111 = i24;
                int i311111111111111112 = 12582912 | (i24 & 14);
                int i311111111111111113 = i24 >> 12;
                SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111111111113, int i311111111111111114) {
                        if ((i311111111111111114 & 11) == 2 && pVar11111111111111111111113.b()) {
                            pVar11111111111111111111113.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1979205334, i311111111111111114, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                        }
                        int i311111111111111115 = i2111115;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111114 = pVar1111111111111111111119;
                        yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111115 = pVar11111111111111111111110;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111116 = pVar11111111111111111111111;
                        androidx.compose.foundation.layout.h1 h1Var11111113 = h1Var11111112;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111111111111111112;
                        int i311111111111111116 = i311111111111111111;
                        ScaffoldKt.b(i311111111111111115, pVar11111111111111111111114, qVar, pVar11111111111111111111115, pVar11111111111111111111116, h1Var11111113, pVar20, pVar11111111111111111111113, ((i311111111111111116 >> 15) & 14) | (i311111111111111116 & 112) | ((i311111111111111116 >> 21) & bb.c.b.f30796me) | (i311111111111111116 & bb.c.g.f32954lc) | (57344 & i311111111111111116) | (458752 & (i311111111111111116 >> 9)) | ((i311111111111111116 << 12) & 3670016));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111111111113, Integer num) {
                        a(pVar11111111111111111111113, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, i311111111111111112 | (i311111111111111113 & bb.c.b.f30796me) | (i311111111111111113 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1Var2 = h1VarA;
                j12 = jC;
                j13 = jC2;
                pVar9 = pVarB;
                pVar10 = pVarC;
                pVar11 = pVarD;
                pVar6 = pVarA;
                nVar3 = nVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar117 = nVar3;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111113 = pVar6;
            final int i311111111111111114 = iB;
            final long j1111110 = j13;
            final long j1111111 = j12;
            final androidx.compose.foundation.layout.h1 h1Var11111113 = h1Var2;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111111111114, int i311111111111111115) {
                    ScaffoldKt.a(nVar117, pVar11111111111111111111113, pVar9, pVar10, pVar11, i311111111111111114, j1111110, j1111111, h1Var11111113, content, pVar11111111111111111111114, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111111111114, Integer num) {
                    a(pVar11111111111111111111114, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= bb.c.b.f30966u4;
        pVar7 = pVar2;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & bb.c.g.f32954lc) == 0) {
                if (pVarF.s(pVar3)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((57344 & i11) == 0) {
                    pVar8 = pVar4;
                    if (pVarF.s(pVar8)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i11 & 458752) == 0) {
                    if (pVarF.y(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 29360128) == 0) {
                    jC = j11;
                    if ((i12 & 128) == 0) {
                        i25 = 4194304;
                    } else {
                        i25 = 4194304;
                    }
                    i13 |= i25;
                } else {
                    jC = j11;
                }
                if ((234881024 & i11) != 0) {
                    i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i11) == 0) {
                        if (pVarF.s(content)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                    }
                    if ((1533916891 & i13) == 306783378) {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i2111116 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111114 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111115 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111116 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var11111114 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111117 = pVarB;
                        final int i311111111111111115 = i24;
                        int i311111111111111116 = 12582912 | (i24 & 14);
                        int i311111111111111117 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111111111118, int i311111111111111118) {
                                if ((i311111111111111118 & 11) == 2 && pVar11111111111111111111118.b()) {
                                    pVar11111111111111111111118.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i311111111111111118, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i311111111111111119 = i2111116;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111119 = pVar11111111111111111111114;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111110 = pVar11111111111111111111115;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111111 = pVar11111111111111111111116;
                                androidx.compose.foundation.layout.h1 h1Var11111115 = h1Var11111114;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111111111111111117;
                                int i3111111111111111110 = i311111111111111115;
                                ScaffoldKt.b(i311111111111111119, pVar11111111111111111111119, qVar, pVar111111111111111111111110, pVar111111111111111111111111, h1Var11111115, pVar20, pVar11111111111111111111118, ((i3111111111111111110 >> 15) & 14) | (i3111111111111111110 & 112) | ((i3111111111111111110 >> 21) & bb.c.b.f30796me) | (i3111111111111111110 & bb.c.g.f32954lc) | (57344 & i3111111111111111110) | (458752 & (i3111111111111111110 >> 9)) | ((i3111111111111111110 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111111111118, Integer num) {
                                a(pVar11111111111111111111118, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i311111111111111116 | (i311111111111111117 & bb.c.b.f30796me) | (i311111111111111117 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        } else {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i28 != 0) {
                                pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                            } else {
                                pVarA = pVar6;
                            }
                            if (i14 != 0) {
                                pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                            } else {
                                pVarB = pVar7;
                            }
                            if (i16 != 0) {
                                pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i18 != 0) {
                                pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i20 != 0) {
                                iB = z.INSTANCE.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jC2 = o0.f12059a.a(pVarF, 6).c();
                            } else {
                                i23 = i13;
                                jC2 = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                h1VarA = e1.f11836a.a(pVarF, 6);
                                nVar2 = nVar2;
                            } else {
                                i24 = i23;
                                h1VarA = h1Var;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                        }
                        final int i2111117 = iB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111118 = pVarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111119 = pVarC;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111110 = pVarD;
                        final androidx.compose.foundation.layout.h1 h1Var11111115 = h1VarA;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111 = pVarB;
                        final int i311111111111111118 = i24;
                        int i311111111111111119 = 12582912 | (i24 & 14);
                        int i3111111111111111110 = i24 >> 12;
                        SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111111111112, int i3111111111111111111) {
                                if ((i3111111111111111111 & 11) == 2 && pVar111111111111111111111112.b()) {
                                    pVar111111111111111111111112.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1979205334, i3111111111111111111, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                }
                                int i3111111111111111112 = i2111117;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111113 = pVar11111111111111111111118;
                                yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111114 = pVar11111111111111111111119;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111115 = pVar111111111111111111111110;
                                androidx.compose.foundation.layout.h1 h1Var11111116 = h1Var11111115;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111111111111111111;
                                int i3111111111111111113 = i311111111111111118;
                                ScaffoldKt.b(i3111111111111111112, pVar111111111111111111111113, qVar, pVar111111111111111111111114, pVar111111111111111111111115, h1Var11111116, pVar20, pVar111111111111111111111112, ((i3111111111111111113 >> 15) & 14) | (i3111111111111111113 & 112) | ((i3111111111111111113 >> 21) & bb.c.b.f30796me) | (i3111111111111111113 & bb.c.g.f32954lc) | (57344 & i3111111111111111113) | (458752 & (i3111111111111111113 >> 9)) | ((i3111111111111111113 << 12) & 3670016));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111111111112, Integer num) {
                                a(pVar111111111111111111111112, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, i311111111111111119 | (i3111111111111111110 & bb.c.b.f30796me) | (i3111111111111111110 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1VarA;
                        j12 = jC;
                        j13 = jC2;
                        pVar9 = pVarB;
                        pVar10 = pVarC;
                        pVar11 = pVarD;
                        pVar6 = pVarA;
                        nVar3 = nVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar118 = nVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111112 = pVar6;
                    final int i3111111111111111111 = iB;
                    final long j1111112 = j13;
                    final long j1111113 = j12;
                    final androidx.compose.foundation.layout.h1 h1Var11111116 = h1Var2;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111111111113, int i3111111111111111112) {
                            ScaffoldKt.a(nVar118, pVar111111111111111111111112, pVar9, pVar10, pVar11, i3111111111111111111, j1111112, j1111113, h1Var11111116, content, pVar111111111111111111111113, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111111111113, Integer num) {
                            a(pVar111111111111111111111113, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i22 = com.google.android.exoplayer2.j.G;
                i13 |= i22;
                if ((1533916891 & i13) == 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i2111118 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111113 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111114 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111115 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var11111117 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111116 = pVarB;
                    final int i3111111111111111112 = i24;
                    int i3111111111111111113 = 12582912 | (i24 & 14);
                    int i3111111111111111114 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111111111117, int i3111111111111111115) {
                            if ((i3111111111111111115 & 11) == 2 && pVar111111111111111111111117.b()) {
                                pVar111111111111111111111117.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i3111111111111111115, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i3111111111111111116 = i2111118;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111118 = pVar111111111111111111111113;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111119 = pVar111111111111111111111114;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111110 = pVar111111111111111111111115;
                            androidx.compose.foundation.layout.h1 h1Var11111118 = h1Var11111117;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111111111111111116;
                            int i3111111111111111117 = i3111111111111111112;
                            ScaffoldKt.b(i3111111111111111116, pVar111111111111111111111118, qVar, pVar111111111111111111111119, pVar1111111111111111111111110, h1Var11111118, pVar20, pVar111111111111111111111117, ((i3111111111111111117 >> 15) & 14) | (i3111111111111111117 & 112) | ((i3111111111111111117 >> 21) & bb.c.b.f30796me) | (i3111111111111111117 & bb.c.g.f32954lc) | (57344 & i3111111111111111117) | (458752 & (i3111111111111111117 >> 9)) | ((i3111111111111111117 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111111111117, Integer num) {
                            a(pVar111111111111111111111117, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i3111111111111111113 | (i3111111111111111114 & bb.c.b.f30796me) | (i3111111111111111114 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i2111119 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111117 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111118 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111119 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var11111118 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111110 = pVarB;
                    final int i3111111111111111115 = i24;
                    int i3111111111111111116 = 12582912 | (i24 & 14);
                    int i3111111111111111117 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111111111111111, int i3111111111111111118) {
                            if ((i3111111111111111118 & 11) == 2 && pVar1111111111111111111111111.b()) {
                                pVar1111111111111111111111111.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i3111111111111111118, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i3111111111111111119 = i2111119;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111112 = pVar111111111111111111111117;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111113 = pVar111111111111111111111118;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111114 = pVar111111111111111111111119;
                            androidx.compose.foundation.layout.h1 h1Var11111119 = h1Var11111118;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111111111111111110;
                            int i31111111111111111110 = i3111111111111111115;
                            ScaffoldKt.b(i3111111111111111119, pVar1111111111111111111111112, qVar, pVar1111111111111111111111113, pVar1111111111111111111111114, h1Var11111119, pVar20, pVar1111111111111111111111111, ((i31111111111111111110 >> 15) & 14) | (i31111111111111111110 & 112) | ((i31111111111111111110 >> 21) & bb.c.b.f30796me) | (i31111111111111111110 & bb.c.g.f32954lc) | (57344 & i31111111111111111110) | (458752 & (i31111111111111111110 >> 9)) | ((i31111111111111111110 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111111111111111, Integer num) {
                            a(pVar1111111111111111111111111, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i3111111111111111116 | (i3111111111111111117 & bb.c.b.f30796me) | (i3111111111111111117 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar119 = nVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111111 = pVar6;
                final int i3111111111111111118 = iB;
                final long j1111114 = j13;
                final long j1111115 = j12;
                final androidx.compose.foundation.layout.h1 h1Var11111119 = h1Var2;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111111111111112, int i3111111111111111119) {
                        ScaffoldKt.a(nVar119, pVar1111111111111111111111111, pVar9, pVar10, pVar11, i3111111111111111118, j1111114, j1111115, h1Var11111119, content, pVar1111111111111111111111112, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111111111111112, Integer num) {
                        a(pVar1111111111111111111111112, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= 24576;
            pVar8 = pVar4;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i11 & 458752) == 0) {
                if (pVarF.y(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            }
            if ((i11 & 29360128) == 0) {
                jC = j11;
                if ((i12 & 128) == 0) {
                    i25 = 4194304;
                } else {
                    i25 = 4194304;
                }
                i13 |= i25;
            } else {
                jC = j11;
            }
            if ((234881024 & i11) != 0) {
                i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
            }
            if ((i12 & 512) != 0) {
                if ((1879048192 & i11) == 0) {
                    if (pVarF.s(content)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                }
                if ((1533916891 & i13) == 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i21111110 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111112 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111113 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111114 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var111111110 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111115 = pVarB;
                    final int i3111111111111111119 = i24;
                    int i31111111111111111110 = 12582912 | (i24 & 14);
                    int i31111111111111111111 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111111111111116, int i31111111111111111112) {
                            if ((i31111111111111111112 & 11) == 2 && pVar1111111111111111111111116.b()) {
                                pVar1111111111111111111111116.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i31111111111111111112, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i31111111111111111113 = i21111110;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111117 = pVar1111111111111111111111112;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111118 = pVar1111111111111111111111113;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111119 = pVar1111111111111111111111114;
                            androidx.compose.foundation.layout.h1 h1Var111111111 = h1Var111111110;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111111111111111115;
                            int i31111111111111111114 = i3111111111111111119;
                            ScaffoldKt.b(i31111111111111111113, pVar1111111111111111111111117, qVar, pVar1111111111111111111111118, pVar1111111111111111111111119, h1Var111111111, pVar20, pVar1111111111111111111111116, ((i31111111111111111114 >> 15) & 14) | (i31111111111111111114 & 112) | ((i31111111111111111114 >> 21) & bb.c.b.f30796me) | (i31111111111111111114 & bb.c.g.f32954lc) | (57344 & i31111111111111111114) | (458752 & (i31111111111111111114 >> 9)) | ((i31111111111111111114 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111111111111116, Integer num) {
                            a(pVar1111111111111111111111116, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i31111111111111111110 | (i31111111111111111111 & bb.c.b.f30796me) | (i31111111111111111111 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i21111111 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111116 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111117 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111118 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var111111111 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111119 = pVarB;
                    final int i31111111111111111112 = i24;
                    int i31111111111111111113 = 12582912 | (i24 & 14);
                    int i31111111111111111114 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111111111111110, int i31111111111111111115) {
                            if ((i31111111111111111115 & 11) == 2 && pVar11111111111111111111111110.b()) {
                                pVar11111111111111111111111110.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i31111111111111111115, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i31111111111111111116 = i21111111;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111111111 = pVar1111111111111111111111116;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111111112 = pVar1111111111111111111111117;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111111113 = pVar1111111111111111111111118;
                            androidx.compose.foundation.layout.h1 h1Var111111112 = h1Var111111111;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111111111111111119;
                            int i31111111111111111117 = i31111111111111111112;
                            ScaffoldKt.b(i31111111111111111116, pVar11111111111111111111111111, qVar, pVar11111111111111111111111112, pVar11111111111111111111111113, h1Var111111112, pVar20, pVar11111111111111111111111110, ((i31111111111111111117 >> 15) & 14) | (i31111111111111111117 & 112) | ((i31111111111111111117 >> 21) & bb.c.b.f30796me) | (i31111111111111111117 & bb.c.g.f32954lc) | (57344 & i31111111111111111117) | (458752 & (i31111111111111111117 >> 9)) | ((i31111111111111111117 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111111111111110, Integer num) {
                            a(pVar11111111111111111111111110, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i31111111111111111113 | (i31111111111111111114 & bb.c.b.f30796me) | (i31111111111111111114 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar1110 = nVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111110 = pVar6;
                final int i31111111111111111115 = iB;
                final long j1111116 = j13;
                final long j1111117 = j12;
                final androidx.compose.foundation.layout.h1 h1Var111111112 = h1Var2;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111111111111111, int i31111111111111111116) {
                        ScaffoldKt.a(nVar1110, pVar11111111111111111111111110, pVar9, pVar10, pVar11, i31111111111111111115, j1111116, j1111117, h1Var111111112, content, pVar11111111111111111111111111, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111111111111111, Integer num) {
                        a(pVar11111111111111111111111111, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i22 = com.google.android.exoplayer2.j.G;
            i13 |= i22;
            if ((1533916891 & i13) == 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                }
                final int i21111112 = iB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111111 = pVarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111112 = pVarC;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111113 = pVarD;
                final androidx.compose.foundation.layout.h1 h1Var111111113 = h1VarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111114 = pVarB;
                final int i31111111111111111116 = i24;
                int i31111111111111111117 = 12582912 | (i24 & 14);
                int i31111111111111111118 = i24 >> 12;
                SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111111111111115, int i31111111111111111119) {
                        if ((i31111111111111111119 & 11) == 2 && pVar11111111111111111111111115.b()) {
                            pVar11111111111111111111111115.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1979205334, i31111111111111111119, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                        }
                        int i311111111111111111110 = i21111112;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111111116 = pVar11111111111111111111111111;
                        yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111111117 = pVar11111111111111111111111112;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111111118 = pVar11111111111111111111111113;
                        androidx.compose.foundation.layout.h1 h1Var111111114 = h1Var111111113;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111111111111111111114;
                        int i311111111111111111111 = i31111111111111111116;
                        ScaffoldKt.b(i311111111111111111110, pVar11111111111111111111111116, qVar, pVar11111111111111111111111117, pVar11111111111111111111111118, h1Var111111114, pVar20, pVar11111111111111111111111115, ((i311111111111111111111 >> 15) & 14) | (i311111111111111111111 & 112) | ((i311111111111111111111 >> 21) & bb.c.b.f30796me) | (i311111111111111111111 & bb.c.g.f32954lc) | (57344 & i311111111111111111111) | (458752 & (i311111111111111111111 >> 9)) | ((i311111111111111111111 << 12) & 3670016));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111111111111115, Integer num) {
                        a(pVar11111111111111111111111115, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, i31111111111111111117 | (i31111111111111111118 & bb.c.b.f30796me) | (i31111111111111111118 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1Var2 = h1VarA;
                j12 = jC;
                j13 = jC2;
                pVar9 = pVarB;
                pVar10 = pVarC;
                pVar11 = pVarD;
                pVar6 = pVarA;
                nVar3 = nVar2;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                }
                final int i21111113 = iB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111115 = pVarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111116 = pVarC;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111117 = pVarD;
                final androidx.compose.foundation.layout.h1 h1Var111111114 = h1VarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111118 = pVarB;
                final int i31111111111111111119 = i24;
                int i311111111111111111110 = 12582912 | (i24 & 14);
                int i311111111111111111111 = i24 >> 12;
                SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111111111111119, int i311111111111111111112) {
                        if ((i311111111111111111112 & 11) == 2 && pVar11111111111111111111111119.b()) {
                            pVar11111111111111111111111119.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1979205334, i311111111111111111112, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                        }
                        int i311111111111111111113 = i21111113;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111111110 = pVar11111111111111111111111115;
                        yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111111111 = pVar11111111111111111111111116;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111111112 = pVar11111111111111111111111117;
                        androidx.compose.foundation.layout.h1 h1Var111111115 = h1Var111111114;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111111111111111111118;
                        int i311111111111111111114 = i31111111111111111119;
                        ScaffoldKt.b(i311111111111111111113, pVar111111111111111111111111110, qVar, pVar111111111111111111111111111, pVar111111111111111111111111112, h1Var111111115, pVar20, pVar11111111111111111111111119, ((i311111111111111111114 >> 15) & 14) | (i311111111111111111114 & 112) | ((i311111111111111111114 >> 21) & bb.c.b.f30796me) | (i311111111111111111114 & bb.c.g.f32954lc) | (57344 & i311111111111111111114) | (458752 & (i311111111111111111114 >> 9)) | ((i311111111111111111114 << 12) & 3670016));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111111111111119, Integer num) {
                        a(pVar11111111111111111111111119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, i311111111111111111110 | (i311111111111111111111 & bb.c.b.f30796me) | (i311111111111111111111 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1Var2 = h1VarA;
                j12 = jC;
                j13 = jC2;
                pVar9 = pVarB;
                pVar10 = pVarC;
                pVar11 = pVarD;
                pVar6 = pVarA;
                nVar3 = nVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar1111 = nVar3;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111119 = pVar6;
            final int i311111111111111111112 = iB;
            final long j1111118 = j13;
            final long j1111119 = j12;
            final androidx.compose.foundation.layout.h1 h1Var111111115 = h1Var2;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111111111111110, int i311111111111111111113) {
                    ScaffoldKt.a(nVar1111, pVar11111111111111111111111119, pVar9, pVar10, pVar11, i311111111111111111112, j1111118, j1111119, h1Var111111115, content, pVar111111111111111111111111110, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111111111111110, Integer num) {
                    a(pVar111111111111111111111111110, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= bb.c.d.f31193dj;
        i18 = i12 & 16;
        if (i18 != 0) {
            if ((57344 & i11) == 0) {
                pVar8 = pVar4;
                if (pVarF.s(pVar8)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i13 |= i19;
            }
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i11 & 458752) == 0) {
                if (pVarF.y(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            }
            if ((i11 & 29360128) == 0) {
                jC = j11;
                if ((i12 & 128) == 0) {
                    i25 = 4194304;
                } else {
                    i25 = 4194304;
                }
                i13 |= i25;
            } else {
                jC = j11;
            }
            if ((234881024 & i11) != 0) {
                i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
            }
            if ((i12 & 512) != 0) {
                if ((1879048192 & i11) == 0) {
                    if (pVarF.s(content)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                }
                if ((1533916891 & i13) == 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i21111114 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111110 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111111 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111112 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var111111116 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111113 = pVarB;
                    final int i311111111111111111113 = i24;
                    int i311111111111111111114 = 12582912 | (i24 & 14);
                    int i311111111111111111115 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111111111111114, int i311111111111111111116) {
                            if ((i311111111111111111116 & 11) == 2 && pVar111111111111111111111111114.b()) {
                                pVar111111111111111111111111114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i311111111111111111116, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i311111111111111111117 = i21111114;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111111115 = pVar111111111111111111111111110;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111111116 = pVar111111111111111111111111111;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111111117 = pVar111111111111111111111111112;
                            androidx.compose.foundation.layout.h1 h1Var111111117 = h1Var111111116;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111111111111111111113;
                            int i311111111111111111118 = i311111111111111111113;
                            ScaffoldKt.b(i311111111111111111117, pVar111111111111111111111111115, qVar, pVar111111111111111111111111116, pVar111111111111111111111111117, h1Var111111117, pVar20, pVar111111111111111111111111114, ((i311111111111111111118 >> 15) & 14) | (i311111111111111111118 & 112) | ((i311111111111111111118 >> 21) & bb.c.b.f30796me) | (i311111111111111111118 & bb.c.g.f32954lc) | (57344 & i311111111111111111118) | (458752 & (i311111111111111111118 >> 9)) | ((i311111111111111111118 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111111111111114, Integer num) {
                            a(pVar111111111111111111111111114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i311111111111111111114 | (i311111111111111111115 & bb.c.b.f30796me) | (i311111111111111111115 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i28 != 0) {
                            pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                        } else {
                            pVarA = pVar6;
                        }
                        if (i14 != 0) {
                            pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                        } else {
                            pVarB = pVar7;
                        }
                        if (i16 != 0) {
                            pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i18 != 0) {
                            pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i20 != 0) {
                            iB = z.INSTANCE.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jC2 = o0.f12059a.a(pVarF, 6).c();
                        } else {
                            i23 = i13;
                            jC2 = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            h1VarA = e1.f11836a.a(pVarF, 6);
                            nVar2 = nVar2;
                        } else {
                            i24 = i23;
                            h1VarA = h1Var;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                    }
                    final int i21111115 = iB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111114 = pVarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111115 = pVarC;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111116 = pVarD;
                    final androidx.compose.foundation.layout.h1 h1Var111111117 = h1VarA;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111117 = pVarB;
                    final int i311111111111111111116 = i24;
                    int i311111111111111111117 = 12582912 | (i24 & 14);
                    int i311111111111111111118 = i24 >> 12;
                    SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111111111111118, int i311111111111111111119) {
                            if ((i311111111111111111119 & 11) == 2 && pVar111111111111111111111111118.b()) {
                                pVar111111111111111111111111118.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1979205334, i311111111111111111119, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                            }
                            int i3111111111111111111110 = i21111115;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111111119 = pVar111111111111111111111111114;
                            yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111111110 = pVar111111111111111111111111115;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111111111 = pVar111111111111111111111111116;
                            androidx.compose.foundation.layout.h1 h1Var111111118 = h1Var111111117;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111111111111111111117;
                            int i3111111111111111111111 = i311111111111111111116;
                            ScaffoldKt.b(i3111111111111111111110, pVar111111111111111111111111119, qVar, pVar1111111111111111111111111110, pVar1111111111111111111111111111, h1Var111111118, pVar20, pVar111111111111111111111111118, ((i3111111111111111111111 >> 15) & 14) | (i3111111111111111111111 & 112) | ((i3111111111111111111111 >> 21) & bb.c.b.f30796me) | (i3111111111111111111111 & bb.c.g.f32954lc) | (57344 & i3111111111111111111111) | (458752 & (i3111111111111111111111 >> 9)) | ((i3111111111111111111111 << 12) & 3670016));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111111111111118, Integer num) {
                            a(pVar111111111111111111111111118, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, i311111111111111111117 | (i311111111111111111118 & bb.c.b.f30796me) | (i311111111111111111118 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1VarA;
                    j12 = jC;
                    j13 = jC2;
                    pVar9 = pVarB;
                    pVar10 = pVarC;
                    pVar11 = pVarD;
                    pVar6 = pVarA;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar1112 = nVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111118 = pVar6;
                final int i311111111111111111119 = iB;
                final long j11111110 = j13;
                final long j11111111 = j12;
                final androidx.compose.foundation.layout.h1 h1Var111111118 = h1Var2;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111111111111119, int i3111111111111111111110) {
                        ScaffoldKt.a(nVar1112, pVar111111111111111111111111118, pVar9, pVar10, pVar11, i311111111111111111119, j11111110, j11111111, h1Var111111118, content, pVar111111111111111111111111119, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111111111111119, Integer num) {
                        a(pVar111111111111111111111111119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i22 = com.google.android.exoplayer2.j.G;
            i13 |= i22;
            if ((1533916891 & i13) == 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                }
                final int i21111116 = iB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111119 = pVarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111111110 = pVarC;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111111111 = pVarD;
                final androidx.compose.foundation.layout.h1 h1Var111111119 = h1VarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111111112 = pVarB;
                final int i3111111111111111111110 = i24;
                int i3111111111111111111111 = 12582912 | (i24 & 14);
                int i3111111111111111111112 = i24 >> 12;
                SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111111111111111113, int i3111111111111111111113) {
                        if ((i3111111111111111111113 & 11) == 2 && pVar1111111111111111111111111113.b()) {
                            pVar1111111111111111111111111113.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1979205334, i3111111111111111111113, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                        }
                        int i3111111111111111111114 = i21111116;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111111114 = pVar111111111111111111111111119;
                        yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111111115 = pVar1111111111111111111111111110;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111111116 = pVar1111111111111111111111111111;
                        androidx.compose.foundation.layout.h1 h1Var1111111110 = h1Var111111119;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111111111111111111112;
                        int i3111111111111111111115 = i3111111111111111111110;
                        ScaffoldKt.b(i3111111111111111111114, pVar1111111111111111111111111114, qVar, pVar1111111111111111111111111115, pVar1111111111111111111111111116, h1Var1111111110, pVar20, pVar1111111111111111111111111113, ((i3111111111111111111115 >> 15) & 14) | (i3111111111111111111115 & 112) | ((i3111111111111111111115 >> 21) & bb.c.b.f30796me) | (i3111111111111111111115 & bb.c.g.f32954lc) | (57344 & i3111111111111111111115) | (458752 & (i3111111111111111111115 >> 9)) | ((i3111111111111111111115 << 12) & 3670016));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111111111111111113, Integer num) {
                        a(pVar1111111111111111111111111113, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, i3111111111111111111111 | (i3111111111111111111112 & bb.c.b.f30796me) | (i3111111111111111111112 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1Var2 = h1VarA;
                j12 = jC;
                j13 = jC2;
                pVar9 = pVarB;
                pVar10 = pVarC;
                pVar11 = pVarD;
                pVar6 = pVarA;
                nVar3 = nVar2;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                }
                final int i21111117 = iB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111111113 = pVarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111111114 = pVarC;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111111115 = pVarD;
                final androidx.compose.foundation.layout.h1 h1Var1111111110 = h1VarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111111116 = pVarB;
                final int i3111111111111111111113 = i24;
                int i3111111111111111111114 = 12582912 | (i24 & 14);
                int i3111111111111111111115 = i24 >> 12;
                SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111111111111111117, int i3111111111111111111116) {
                        if ((i3111111111111111111116 & 11) == 2 && pVar1111111111111111111111111117.b()) {
                            pVar1111111111111111111111111117.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1979205334, i3111111111111111111116, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                        }
                        int i3111111111111111111117 = i21111117;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111111118 = pVar1111111111111111111111111113;
                        yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111111111111111119 = pVar1111111111111111111111111114;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111111111110 = pVar1111111111111111111111111115;
                        androidx.compose.foundation.layout.h1 h1Var1111111111 = h1Var1111111110;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111111111111111111116;
                        int i3111111111111111111118 = i3111111111111111111113;
                        ScaffoldKt.b(i3111111111111111111117, pVar1111111111111111111111111118, qVar, pVar1111111111111111111111111119, pVar11111111111111111111111111110, h1Var1111111111, pVar20, pVar1111111111111111111111111117, ((i3111111111111111111118 >> 15) & 14) | (i3111111111111111111118 & 112) | ((i3111111111111111111118 >> 21) & bb.c.b.f30796me) | (i3111111111111111111118 & bb.c.g.f32954lc) | (57344 & i3111111111111111111118) | (458752 & (i3111111111111111111118 >> 9)) | ((i3111111111111111111118 << 12) & 3670016));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111111111111111117, Integer num) {
                        a(pVar1111111111111111111111111117, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, i3111111111111111111114 | (i3111111111111111111115 & bb.c.b.f30796me) | (i3111111111111111111115 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1Var2 = h1VarA;
                j12 = jC;
                j13 = jC2;
                pVar9 = pVarB;
                pVar10 = pVarC;
                pVar11 = pVarD;
                pVar6 = pVarA;
                nVar3 = nVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar1113 = nVar3;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111111117 = pVar6;
            final int i3111111111111111111116 = iB;
            final long j11111112 = j13;
            final long j11111113 = j12;
            final androidx.compose.foundation.layout.h1 h1Var1111111111 = h1Var2;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar1111111111111111111111111118, int i3111111111111111111117) {
                    ScaffoldKt.a(nVar1113, pVar1111111111111111111111111117, pVar9, pVar10, pVar11, i3111111111111111111116, j11111112, j11111113, h1Var1111111111, content, pVar1111111111111111111111111118, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111111111111111111118, Integer num) {
                    a(pVar1111111111111111111111111118, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= 24576;
        pVar8 = pVar4;
        i20 = i12 & 32;
        if (i20 != 0) {
            i13 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((i11 & 458752) == 0) {
            if (pVarF.y(i10)) {
                i21 = 131072;
            } else {
                i21 = 65536;
            }
            i13 |= i21;
        }
        if ((i11 & 3670016) != 0) {
            if ((i12 & 64) == 0) {
                i26 = 524288;
            } else {
                i26 = 524288;
            }
            i13 |= i26;
        }
        if ((i11 & 29360128) == 0) {
            jC = j11;
            if ((i12 & 128) == 0) {
                i25 = 4194304;
            } else {
                i25 = 4194304;
            }
            i13 |= i25;
        } else {
            jC = j11;
        }
        if ((234881024 & i11) != 0) {
            i13 |= ((i12 & 256) == 0 || !pVarF.s(h1Var)) ? 33554432 : 67108864;
        }
        if ((i12 & 512) != 0) {
            if ((1879048192 & i11) == 0) {
                if (pVarF.s(content)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
            }
            if ((1533916891 & i13) == 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                }
                final int i21111118 = iB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111111118 = pVarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111111111111111111119 = pVarC;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111111110 = pVarD;
                final androidx.compose.foundation.layout.h1 h1Var1111111112 = h1VarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111111111 = pVarB;
                final int i3111111111111111111117 = i24;
                int i3111111111111111111118 = 12582912 | (i24 & 14);
                int i3111111111111111111119 = i24 >> 12;
                SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111111111111111112, int i31111111111111111111110) {
                        if ((i31111111111111111111110 & 11) == 2 && pVar11111111111111111111111111112.b()) {
                            pVar11111111111111111111111111112.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1979205334, i31111111111111111111110, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                        }
                        int i31111111111111111111111 = i21111118;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111111111113 = pVar1111111111111111111111111118;
                        yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111111111114 = pVar1111111111111111111111111119;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111111111115 = pVar11111111111111111111111111110;
                        androidx.compose.foundation.layout.h1 h1Var1111111113 = h1Var1111111112;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111111111111111111111111;
                        int i31111111111111111111112 = i3111111111111111111117;
                        ScaffoldKt.b(i31111111111111111111111, pVar11111111111111111111111111113, qVar, pVar11111111111111111111111111114, pVar11111111111111111111111111115, h1Var1111111113, pVar20, pVar11111111111111111111111111112, ((i31111111111111111111112 >> 15) & 14) | (i31111111111111111111112 & 112) | ((i31111111111111111111112 >> 21) & bb.c.b.f30796me) | (i31111111111111111111112 & bb.c.g.f32954lc) | (57344 & i31111111111111111111112) | (458752 & (i31111111111111111111112 >> 9)) | ((i31111111111111111111112 << 12) & 3670016));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111111111111111112, Integer num) {
                        a(pVar11111111111111111111111111112, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, i3111111111111111111118 | (i3111111111111111111119 & bb.c.b.f30796me) | (i3111111111111111111119 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1Var2 = h1VarA;
                j12 = jC;
                j13 = jC2;
                pVar9 = pVarB;
                pVar10 = pVarC;
                pVar11 = pVarD;
                pVar6 = pVarA;
                nVar3 = nVar2;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                    } else {
                        pVarA = pVar6;
                    }
                    if (i14 != 0) {
                        pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                    } else {
                        pVarB = pVar7;
                    }
                    if (i16 != 0) {
                        pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i18 != 0) {
                        pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i20 != 0) {
                        iB = z.INSTANCE.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jC2 = o0.f12059a.a(pVarF, 6).c();
                    } else {
                        i23 = i13;
                        jC2 = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        h1VarA = e1.f11836a.a(pVarF, 6);
                        nVar2 = nVar2;
                    } else {
                        i24 = i23;
                        h1VarA = h1Var;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                }
                final int i21111119 = iB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111111112 = pVarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111111113 = pVarC;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111111114 = pVarD;
                final androidx.compose.foundation.layout.h1 h1Var1111111113 = h1VarA;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111111115 = pVarB;
                final int i31111111111111111111110 = i24;
                int i31111111111111111111111 = 12582912 | (i24 & 14);
                int i31111111111111111111112 = i24 >> 12;
                SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111111111111111116, int i31111111111111111111113) {
                        if ((i31111111111111111111113 & 11) == 2 && pVar11111111111111111111111111116.b()) {
                            pVar11111111111111111111111111116.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1979205334, i31111111111111111111113, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                        }
                        int i31111111111111111111114 = i21111119;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111111111117 = pVar11111111111111111111111111112;
                        yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111111111118 = pVar11111111111111111111111111113;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111111111111111111119 = pVar11111111111111111111111111114;
                        androidx.compose.foundation.layout.h1 h1Var1111111114 = h1Var1111111113;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111111111111111111111115;
                        int i31111111111111111111115 = i31111111111111111111110;
                        ScaffoldKt.b(i31111111111111111111114, pVar11111111111111111111111111117, qVar, pVar11111111111111111111111111118, pVar11111111111111111111111111119, h1Var1111111114, pVar20, pVar11111111111111111111111111116, ((i31111111111111111111115 >> 15) & 14) | (i31111111111111111111115 & 112) | ((i31111111111111111111115 >> 21) & bb.c.b.f30796me) | (i31111111111111111111115 & bb.c.g.f32954lc) | (57344 & i31111111111111111111115) | (458752 & (i31111111111111111111115 >> 9)) | ((i31111111111111111111115 << 12) & 3670016));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111111111111111116, Integer num) {
                        a(pVar11111111111111111111111111116, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, i31111111111111111111111 | (i31111111111111111111112 & bb.c.b.f30796me) | (i31111111111111111111112 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1Var2 = h1VarA;
                j12 = jC;
                j13 = jC2;
                pVar9 = pVarB;
                pVar10 = pVarC;
                pVar11 = pVarD;
                pVar6 = pVarA;
                nVar3 = nVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar1114 = nVar3;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111111116 = pVar6;
            final int i31111111111111111111113 = iB;
            final long j11111114 = j13;
            final long j11111115 = j12;
            final androidx.compose.foundation.layout.h1 h1Var1111111114 = h1Var2;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar11111111111111111111111111117, int i31111111111111111111114) {
                    ScaffoldKt.a(nVar1114, pVar11111111111111111111111111116, pVar9, pVar10, pVar11, i31111111111111111111113, j11111114, j11111115, h1Var1111111114, content, pVar11111111111111111111111111117, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111111111111111111111117, Integer num) {
                    a(pVar11111111111111111111111111117, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i22 = com.google.android.exoplayer2.j.G;
        i13 |= i22;
        if ((1533916891 & i13) == 306783378) {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i27 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i28 != 0) {
                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                } else {
                    pVarA = pVar6;
                }
                if (i14 != 0) {
                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                } else {
                    pVarB = pVar7;
                }
                if (i16 != 0) {
                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                } else {
                    pVarC = pVar3;
                }
                if (i18 != 0) {
                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                } else {
                    pVarD = pVar8;
                }
                if (i20 != 0) {
                    iB = z.INSTANCE.b();
                } else {
                    iB = i10;
                }
                if ((i12 & 64) != 0) {
                    i23 = i13 & (-3670017);
                    jC2 = o0.f12059a.a(pVarF, 6).c();
                } else {
                    i23 = i13;
                    jC2 = j10;
                }
                if ((i12 & 128) != 0) {
                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                    i23 &= -29360129;
                }
                if ((i12 & 256) != 0) {
                    i24 = i23 & (-234881025);
                    h1VarA = e1.f11836a.a(pVarF, 6);
                    nVar2 = nVar2;
                } else {
                    i24 = i23;
                    h1VarA = h1Var;
                }
            } else {
                if (i27 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i28 != 0) {
                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                } else {
                    pVarA = pVar6;
                }
                if (i14 != 0) {
                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                } else {
                    pVarB = pVar7;
                }
                if (i16 != 0) {
                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                } else {
                    pVarC = pVar3;
                }
                if (i18 != 0) {
                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                } else {
                    pVarD = pVar8;
                }
                if (i20 != 0) {
                    iB = z.INSTANCE.b();
                } else {
                    iB = i10;
                }
                if ((i12 & 64) != 0) {
                    i23 = i13 & (-3670017);
                    jC2 = o0.f12059a.a(pVarF, 6).c();
                } else {
                    i23 = i13;
                    jC2 = j10;
                }
                if ((i12 & 128) != 0) {
                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                    i23 &= -29360129;
                }
                if ((i12 & 256) != 0) {
                    i24 = i23 & (-234881025);
                    h1VarA = e1.f11836a.a(pVarF, 6);
                    nVar2 = nVar2;
                } else {
                    i24 = i23;
                    h1VarA = h1Var;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
            }
            final int i211111110 = iB;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111111117 = pVarA;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111111118 = pVarC;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111111111111111111119 = pVarD;
            final androidx.compose.foundation.layout.h1 h1Var1111111115 = h1VarA;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111111110 = pVarB;
            final int i31111111111111111111114 = i24;
            int i31111111111111111111115 = 12582912 | (i24 & 14);
            int i31111111111111111111116 = i24 >> 12;
            SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111111111111111111, int i31111111111111111111117) {
                    if ((i31111111111111111111117 & 11) == 2 && pVar111111111111111111111111111111.b()) {
                        pVar111111111111111111111111111111.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1979205334, i31111111111111111111117, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                    }
                    int i31111111111111111111118 = i211111110;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111111111112 = pVar11111111111111111111111111117;
                    yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111111111113 = pVar11111111111111111111111111118;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111111111114 = pVar11111111111111111111111111119;
                    androidx.compose.foundation.layout.h1 h1Var1111111116 = h1Var1111111115;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111111111111111111111110;
                    int i31111111111111111111119 = i31111111111111111111114;
                    ScaffoldKt.b(i31111111111111111111118, pVar111111111111111111111111111112, qVar, pVar111111111111111111111111111113, pVar111111111111111111111111111114, h1Var1111111116, pVar20, pVar111111111111111111111111111111, ((i31111111111111111111119 >> 15) & 14) | (i31111111111111111111119 & 112) | ((i31111111111111111111119 >> 21) & bb.c.b.f30796me) | (i31111111111111111111119 & bb.c.g.f32954lc) | (57344 & i31111111111111111111119) | (458752 & (i31111111111111111111119 >> 9)) | ((i31111111111111111111119 << 12) & 3670016));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111111111111111111, Integer num) {
                    a(pVar111111111111111111111111111111, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, i31111111111111111111115 | (i31111111111111111111116 & bb.c.b.f30796me) | (i31111111111111111111116 & bb.c.g.f32954lc), 114);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            h1Var2 = h1VarA;
            j12 = jC;
            j13 = jC2;
            pVar9 = pVarB;
            pVar10 = pVarC;
            pVar11 = pVarD;
            pVar6 = pVarA;
            nVar3 = nVar2;
        } else {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i27 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i28 != 0) {
                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                } else {
                    pVarA = pVar6;
                }
                if (i14 != 0) {
                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                } else {
                    pVarB = pVar7;
                }
                if (i16 != 0) {
                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                } else {
                    pVarC = pVar3;
                }
                if (i18 != 0) {
                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                } else {
                    pVarD = pVar8;
                }
                if (i20 != 0) {
                    iB = z.INSTANCE.b();
                } else {
                    iB = i10;
                }
                if ((i12 & 64) != 0) {
                    i23 = i13 & (-3670017);
                    jC2 = o0.f12059a.a(pVarF, 6).c();
                } else {
                    i23 = i13;
                    jC2 = j10;
                }
                if ((i12 & 128) != 0) {
                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                    i23 &= -29360129;
                }
                if ((i12 & 256) != 0) {
                    i24 = i23 & (-234881025);
                    h1VarA = e1.f11836a.a(pVarF, 6);
                    nVar2 = nVar2;
                } else {
                    i24 = i23;
                    h1VarA = h1Var;
                }
            } else {
                if (i27 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i28 != 0) {
                    pVarA = ComposableSingletons$ScaffoldKt.f9315a.a();
                } else {
                    pVarA = pVar6;
                }
                if (i14 != 0) {
                    pVarB = ComposableSingletons$ScaffoldKt.f9315a.b();
                } else {
                    pVarB = pVar7;
                }
                if (i16 != 0) {
                    pVarC = ComposableSingletons$ScaffoldKt.f9315a.c();
                } else {
                    pVarC = pVar3;
                }
                if (i18 != 0) {
                    pVarD = ComposableSingletons$ScaffoldKt.f9315a.d();
                } else {
                    pVarD = pVar8;
                }
                if (i20 != 0) {
                    iB = z.INSTANCE.b();
                } else {
                    iB = i10;
                }
                if ((i12 & 64) != 0) {
                    i23 = i13 & (-3670017);
                    jC2 = o0.f12059a.a(pVarF, 6).c();
                } else {
                    i23 = i13;
                    jC2 = j10;
                }
                if ((i12 & 128) != 0) {
                    jC = ColorSchemeKt.c(jC2, pVarF, (i23 >> 18) & 14);
                    i23 &= -29360129;
                }
                if ((i12 & 256) != 0) {
                    i24 = i23 & (-234881025);
                    h1VarA = e1.f11836a.a(pVarF, 6);
                    nVar2 = nVar2;
                } else {
                    i24 = i23;
                    h1VarA = h1Var;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
            }
            final int i211111111 = iB;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111111111 = pVarA;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111111112 = pVarC;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111111113 = pVarD;
            final androidx.compose.foundation.layout.h1 h1Var1111111116 = h1VarA;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111111114 = pVarB;
            final int i31111111111111111111117 = i24;
            int i31111111111111111111118 = 12582912 | (i24 & 14);
            int i31111111111111111111119 = i24 >> 12;
            SurfaceKt.a(nVar2, null, jC2, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, -1979205334, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111111111111111115, int i311111111111111111111110) {
                    if ((i311111111111111111111110 & 11) == 2 && pVar111111111111111111111111111115.b()) {
                        pVar111111111111111111111111111115.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1979205334, i311111111111111111111110, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                    }
                    int i311111111111111111111111 = i211111111;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111111111116 = pVar111111111111111111111111111111;
                    yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111111111117 = pVar111111111111111111111111111112;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111111111111111111118 = pVar111111111111111111111111111113;
                    androidx.compose.foundation.layout.h1 h1Var1111111117 = h1Var1111111116;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111111111111111111111114;
                    int i311111111111111111111112 = i31111111111111111111117;
                    ScaffoldKt.b(i311111111111111111111111, pVar111111111111111111111111111116, qVar, pVar111111111111111111111111111117, pVar111111111111111111111111111118, h1Var1111111117, pVar20, pVar111111111111111111111111111115, ((i311111111111111111111112 >> 15) & 14) | (i311111111111111111111112 & 112) | ((i311111111111111111111112 >> 21) & bb.c.b.f30796me) | (i311111111111111111111112 & bb.c.g.f32954lc) | (57344 & i311111111111111111111112) | (458752 & (i311111111111111111111112 >> 9)) | ((i311111111111111111111112 << 12) & 3670016));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111111111111111115, Integer num) {
                    a(pVar111111111111111111111111111115, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, i31111111111111111111118 | (i31111111111111111111119 & bb.c.b.f30796me) | (i31111111111111111111119 & bb.c.g.f32954lc), 114);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            h1Var2 = h1VarA;
            j12 = jC;
            j13 = jC2;
            pVar9 = pVarB;
            pVar10 = pVarC;
            pVar11 = pVarD;
            pVar6 = pVarA;
            nVar3 = nVar2;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar1115 = nVar3;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111111111111111111115 = pVar6;
        final int i311111111111111111111110 = iB;
        final long j11111116 = j13;
        final long j11111117 = j12;
        final androidx.compose.foundation.layout.h1 h1Var1111111117 = h1Var2;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar111111111111111111111111111116, int i311111111111111111111111) {
                ScaffoldKt.a(nVar1115, pVar111111111111111111111111111115, pVar9, pVar10, pVar11, i311111111111111111111110, j11111116, j11111117, h1Var1111111117, content, pVar111111111111111111111111111116, i11 | 1, i12);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111111111111111111111116, Integer num) {
                a(pVar111111111111111111111111111116, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    @androidx.compose.runtime.h
    public static final void b(final int i10, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, final yh.q<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3, final androidx.compose.foundation.layout.h1 h1Var, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4, androidx.compose.runtime.p pVar5, final int i11) {
        androidx.compose.runtime.p pVar6;
        androidx.compose.runtime.p pVarF = pVar5.F(-975511942);
        int i12 = (i11 & 14) == 0 ? (pVarF.y(i10) ? 4 : 2) | i11 : i11;
        if ((i11 & 112) == 0) {
            i12 |= pVarF.s(pVar) ? 32 : 16;
        }
        if ((i11 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.s(qVar) ? 256 : 128;
        }
        if ((i11 & bb.c.g.f32954lc) == 0) {
            i12 |= pVarF.s(pVar2) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= pVarF.s(pVar3) ? 16384 : 8192;
        }
        if ((458752 & i11) == 0) {
            i12 |= pVarF.s(h1Var) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= pVarF.s(pVar4) ? 1048576 : 524288;
        }
        final int i13 = i12;
        if ((2995931 & i13) == 599186 && pVarF.b()) {
            pVarF.l();
            pVar6 = pVarF;
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-975511942, i13, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:113)");
            }
            Object[] objArr = {pVar, pVar2, h1Var, pVar3, z.c(i10), pVar4, qVar};
            pVarF.T(-568225417);
            boolean zS = false;
            for (int i14 = 0; i14 < 7; i14++) {
                zS |= pVarF.s(objArr[i14]);
            }
            Object objU = pVarF.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                pVar6 = pVarF;
                yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0> pVar7 = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @dl.d
                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, long j10) {
                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                        final int iP = s1.b.p(j10);
                        final int iO = s1.b.o(j10);
                        final long jE = s1.b.e(j10, 0, 0, 0, 0, 10, null);
                        final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar8 = pVar;
                        final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar9 = pVar2;
                        final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar10 = pVar3;
                        final int i15 = i10;
                        final androidx.compose.foundation.layout.h1 h1Var2 = h1Var;
                        final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11 = pVar4;
                        final int i16 = i13;
                        final yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar2 = qVar;
                        return androidx.compose.ui.layout.k0.p(SubcomposeLayout, iP, iO, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                Object next;
                                Object next2;
                                Object next3;
                                final y yVar;
                                Object next4;
                                Integer numValueOf;
                                int iIntValue;
                                Object next5;
                                Object next6;
                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(ScaffoldLayoutContent.TopBar, pVar8);
                                long j11 = jE;
                                final ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                Iterator<T> it = listY1.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((androidx.compose.ui.layout.g0) it.next()).z1(j11));
                                }
                                Iterator it2 = arrayList.iterator();
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (it2.hasNext()) {
                                        int height = ((androidx.compose.ui.layout.e1) next).getHeight();
                                        do {
                                            Object next7 = it2.next();
                                            int height2 = ((androidx.compose.ui.layout.e1) next7).getHeight();
                                            if (height < height2) {
                                                next = next7;
                                                height = height2;
                                            }
                                        } while (it2.hasNext());
                                    }
                                } else {
                                    next = null;
                                }
                                androidx.compose.ui.layout.e1 e1Var = (androidx.compose.ui.layout.e1) next;
                                final int height3 = e1Var != null ? e1Var.getHeight() : 0;
                                List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(ScaffoldLayoutContent.Snackbar, pVar9);
                                androidx.compose.foundation.layout.h1 h1Var3 = h1Var2;
                                androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                long j12 = jE;
                                ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(listY2, 10));
                                Iterator<T> it3 = listY2.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(((androidx.compose.ui.layout.g0) it3.next()).z1(s1.c.i(j12, (-h1Var3.b(q1Var, q1Var.getLayoutDirection())) - h1Var3.d(q1Var, q1Var.getLayoutDirection()), -h1Var3.c(q1Var))));
                                }
                                Iterator it4 = arrayList2.iterator();
                                if (it4.hasNext()) {
                                    next2 = it4.next();
                                    if (it4.hasNext()) {
                                        int height4 = ((androidx.compose.ui.layout.e1) next2).getHeight();
                                        do {
                                            Object next8 = it4.next();
                                            int height5 = ((androidx.compose.ui.layout.e1) next8).getHeight();
                                            if (height4 < height5) {
                                                next2 = next8;
                                                height4 = height5;
                                            }
                                        } while (it4.hasNext());
                                    }
                                } else {
                                    next2 = null;
                                }
                                androidx.compose.ui.layout.e1 e1Var2 = (androidx.compose.ui.layout.e1) next2;
                                int height6 = e1Var2 != null ? e1Var2.getHeight() : 0;
                                Iterator it5 = arrayList2.iterator();
                                if (it5.hasNext()) {
                                    next3 = it5.next();
                                    if (it5.hasNext()) {
                                        int width = ((androidx.compose.ui.layout.e1) next3).getWidth();
                                        do {
                                            Object next9 = it5.next();
                                            int width2 = ((androidx.compose.ui.layout.e1) next9).getWidth();
                                            if (width < width2) {
                                                next3 = next9;
                                                width = width2;
                                            }
                                        } while (it5.hasNext());
                                    }
                                } else {
                                    next3 = null;
                                }
                                androidx.compose.ui.layout.e1 e1Var3 = (androidx.compose.ui.layout.e1) next3;
                                int width3 = e1Var3 != null ? e1Var3.getWidth() : 0;
                                List<androidx.compose.ui.layout.g0> listY3 = SubcomposeLayout.y1(ScaffoldLayoutContent.Fab, pVar10);
                                androidx.compose.foundation.layout.h1 h1Var4 = h1Var2;
                                androidx.compose.ui.layout.q1 q1Var2 = SubcomposeLayout;
                                long j13 = jE;
                                ArrayList<androidx.compose.ui.layout.e1> arrayList3 = new ArrayList();
                                Iterator<T> it6 = listY3.iterator();
                                while (it6.hasNext()) {
                                    androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it6.next()).z1(s1.c.i(j13, (-h1Var4.b(q1Var2, q1Var2.getLayoutDirection())) - h1Var4.d(q1Var2, q1Var2.getLayoutDirection()), -h1Var4.c(q1Var2)));
                                    if (!((e1VarZ1.getHeight() == 0 || e1VarZ1.getWidth() == 0) ? false : true)) {
                                        e1VarZ1 = null;
                                    }
                                    if (e1VarZ1 != null) {
                                        arrayList3.add(e1VarZ1);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    Iterator it7 = arrayList3.iterator();
                                    if (it7.hasNext()) {
                                        next5 = it7.next();
                                        if (it7.hasNext()) {
                                            int width4 = ((androidx.compose.ui.layout.e1) next5).getWidth();
                                            do {
                                                Object next10 = it7.next();
                                                int width5 = ((androidx.compose.ui.layout.e1) next10).getWidth();
                                                if (width4 < width5) {
                                                    next5 = next10;
                                                    width4 = width5;
                                                }
                                            } while (it7.hasNext());
                                        }
                                    } else {
                                        next5 = null;
                                    }
                                    kotlin.jvm.internal.f0.m(next5);
                                    int width6 = ((androidx.compose.ui.layout.e1) next5).getWidth();
                                    Iterator it8 = arrayList3.iterator();
                                    if (it8.hasNext()) {
                                        next6 = it8.next();
                                        if (it8.hasNext()) {
                                            int height7 = ((androidx.compose.ui.layout.e1) next6).getHeight();
                                            do {
                                                Object next11 = it8.next();
                                                int height8 = ((androidx.compose.ui.layout.e1) next11).getHeight();
                                                if (height7 < height8) {
                                                    next6 = next11;
                                                    height7 = height8;
                                                }
                                            } while (it8.hasNext());
                                        }
                                    } else {
                                        next6 = null;
                                    }
                                    kotlin.jvm.internal.f0.m(next6);
                                    int height9 = ((androidx.compose.ui.layout.e1) next6).getHeight();
                                    yVar = new y(z.f(i15, z.INSTANCE.b()) ? SubcomposeLayout.getLayoutDirection() == LayoutDirection.Ltr ? (iP - SubcomposeLayout.e1(ScaffoldKt.f10400b)) - width6 : SubcomposeLayout.e1(ScaffoldKt.f10400b) : (iP - width6) / 2, width6, height9);
                                } else {
                                    yVar = null;
                                }
                                androidx.compose.ui.layout.q1 q1Var3 = SubcomposeLayout;
                                ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                                final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar12 = pVar11;
                                final int i17 = i16;
                                List<androidx.compose.ui.layout.g0> listY4 = q1Var3.y1(scaffoldLayoutContent, androidx.compose.runtime.internal.b.c(-1455477816, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar13, int i18) {
                                        if ((i18 & 11) == 2 && pVar13.b()) {
                                            pVar13.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-1455477816, i18, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:195)");
                                        }
                                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ScaffoldKt.e().f(yVar)}, pVar12, pVar13, ((i17 >> 15) & 112) | 8);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar13, Integer num) {
                                        a(pVar13, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }));
                                long j14 = jE;
                                final ArrayList arrayList4 = new ArrayList(kotlin.collections.t.Y(listY4, 10));
                                Iterator<T> it9 = listY4.iterator();
                                while (it9.hasNext()) {
                                    arrayList4.add(((androidx.compose.ui.layout.g0) it9.next()).z1(j14));
                                }
                                Iterator it10 = arrayList4.iterator();
                                if (it10.hasNext()) {
                                    next4 = it10.next();
                                    if (it10.hasNext()) {
                                        int height10 = ((androidx.compose.ui.layout.e1) next4).getHeight();
                                        while (true) {
                                            Object next12 = it10.next();
                                            int height11 = ((androidx.compose.ui.layout.e1) next12).getHeight();
                                            if (height10 < height11) {
                                                next4 = next12;
                                                height10 = height11;
                                            }
                                            if (!it10.hasNext()) {
                                                break;
                                            } else {
                                                arrayList2 = arrayList2;
                                            }
                                        }
                                    }
                                } else {
                                    next4 = null;
                                }
                                androidx.compose.ui.layout.e1 e1Var4 = (androidx.compose.ui.layout.e1) next4;
                                Integer numValueOf2 = e1Var4 != null ? Integer.valueOf(e1Var4.getHeight()) : null;
                                if (yVar != null) {
                                    androidx.compose.ui.layout.q1 q1Var4 = SubcomposeLayout;
                                    numValueOf = Integer.valueOf(numValueOf2 == null ? yVar.getHeight() + q1Var4.e1(ScaffoldKt.f10400b) + h1Var2.c(q1Var4) : numValueOf2.intValue() + yVar.getHeight() + q1Var4.e1(ScaffoldKt.f10400b));
                                } else {
                                    numValueOf = null;
                                }
                                if (height6 != 0) {
                                    iIntValue = height6 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : h1Var2.c(SubcomposeLayout));
                                } else {
                                    iIntValue = 0;
                                }
                                final androidx.compose.ui.layout.q1 q1Var5 = SubcomposeLayout;
                                ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                                final androidx.compose.foundation.layout.h1 h1Var5 = h1Var2;
                                final yh.q<androidx.compose.foundation.layout.m0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar3 = qVar2;
                                final int i18 = i16;
                                ArrayList arrayList5 = arrayList2;
                                final Integer num = numValueOf2;
                                List<androidx.compose.ui.layout.g0> listY5 = q1Var5.y1(scaffoldLayoutContent2, androidx.compose.runtime.internal.b.c(1643221465, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar13, int i19) {
                                        Integer num2;
                                        if ((i19 & 11) == 2 && pVar13.b()) {
                                            pVar13.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(1643221465, i19, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:222)");
                                        }
                                        androidx.compose.foundation.layout.m0 m0VarH = androidx.compose.foundation.layout.i1.h(h1Var5, q1Var5);
                                        qVar3.invoke(PaddingKt.d(PaddingKt.i(m0VarH, q1Var5.getLayoutDirection()), arrayList.isEmpty() ? m0VarH.getTop() : q1Var5.E(height3), PaddingKt.h(m0VarH, q1Var5.getLayoutDirection()), (arrayList4.isEmpty() || (num2 = num) == null) ? m0VarH.getBottom() : q1Var5.E(num2.intValue())), pVar13, Integer.valueOf((i18 >> 3) & 112));
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar13, Integer num2) {
                                        a(pVar13, num2.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }));
                                long j15 = jE;
                                ArrayList arrayList6 = new ArrayList(kotlin.collections.t.Y(listY5, 10));
                                Iterator<T> it11 = listY5.iterator();
                                while (it11.hasNext()) {
                                    arrayList6.add(((androidx.compose.ui.layout.g0) it11.next()).z1(j15));
                                }
                                Iterator it12 = arrayList6.iterator();
                                while (it12.hasNext()) {
                                    androidx.compose.ui.layout.e1.a.p(layout, (androidx.compose.ui.layout.e1) it12.next(), 0, 0, 0.0f, 4, null);
                                    arrayList = arrayList;
                                    arrayList4 = arrayList4;
                                }
                                ArrayList arrayList7 = arrayList4;
                                Iterator it13 = arrayList.iterator();
                                while (it13.hasNext()) {
                                    androidx.compose.ui.layout.e1.a.p(layout, (androidx.compose.ui.layout.e1) it13.next(), 0, 0, 0.0f, 4, null);
                                }
                                int i19 = iP;
                                androidx.compose.foundation.layout.h1 h1Var6 = h1Var2;
                                androidx.compose.ui.layout.q1 q1Var6 = SubcomposeLayout;
                                int i20 = iO;
                                Iterator it14 = arrayList5.iterator();
                                while (it14.hasNext()) {
                                    androidx.compose.ui.layout.e1.a.p(layout, (androidx.compose.ui.layout.e1) it14.next(), h1Var6.b(q1Var6, q1Var6.getLayoutDirection()) + ((i19 - width3) / 2), i20 - iIntValue, 0.0f, 4, null);
                                }
                                int i21 = iO;
                                Iterator it15 = arrayList7.iterator();
                                while (it15.hasNext()) {
                                    androidx.compose.ui.layout.e1.a.p(layout, (androidx.compose.ui.layout.e1) it15.next(), 0, i21 - (numValueOf2 != null ? numValueOf2.intValue() : 0), 0.0f, 4, null);
                                }
                                if (yVar != null) {
                                    int i22 = iO;
                                    for (androidx.compose.ui.layout.e1 e1Var5 : arrayList3) {
                                        int left = yVar.getLeft();
                                        kotlin.jvm.internal.f0.m(numValueOf);
                                        androidx.compose.ui.layout.e1.a.p(layout, e1Var5, left, i22 - numValueOf.intValue(), 0.0f, 4, null);
                                    }
                                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                a(aVar);
                                return kotlin.b2.f124493a;
                            }
                        }, 4, null);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                        return a(q1Var, bVar.getF139216a());
                    }
                };
                pVar6.N(pVar7);
                objU = pVar7;
            } else {
                pVar6 = pVarF;
            }
            pVar6.c0();
            SubcomposeLayoutKt.a(0, (yh.p) objU, pVar6, 0, 1);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVar6.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar8, int i15) {
                ScaffoldKt.b(i10, pVar, qVar, pVar2, pVar3, h1Var, pVar4, pVar8, i11 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                a(pVar8, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @dl.d
    public static final androidx.compose.runtime.j1<y> e() {
        return f10399a;
    }
}
