package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.m0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\u001av\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aA\u0010\u001b\u001a\u0019\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017¢\u0006\u0002\b\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001av\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u001e\u0010\u0016\u001aA\u0010\u001f\u001a\u0019\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017¢\u0006\u0002\b\u00132\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a¨\u0001\u0010-\u001a\u00020\u0012\"\u0004\b\u0000\u0010!*\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2%\b\u0002\u0010(\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010\u00102%\b\u0002\u0010)\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0006\u0012\u0004\u0018\u00010'0\u001021\u0010,\u001a-\u0012\u0004\u0012\u00020*\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00120\u0017¢\u0006\u0002\b+¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b-\u0010.\u001aç\u0001\u00102\u001a\u00020\u0012\"\u0004\b\u0000\u0010!*\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2:\b\u0002\u0010(\u001a4\u0012\u0013\u0012\u00110/¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(0\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010\u00172:\b\u0002\u0010)\u001a4\u0012\u0013\u0012\u00110/¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(0\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0006\u0012\u0004\u0018\u00010'0\u00172F\u0010,\u001aB\u0012\u0004\u0012\u00020*\u0012\u0013\u0012\u00110/¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(0\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u001201¢\u0006\u0002\b+¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b2\u00103\u001a¨\u0001\u00105\u001a\u00020\u0012\"\u0004\b\u0000\u0010!*\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u0000042%\b\u0002\u0010(\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010\u00102%\b\u0002\u0010)\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0006\u0012\u0004\u0018\u00010'0\u001021\u0010,\u001a-\u0012\u0004\u0012\u00020*\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00120\u0017¢\u0006\u0002\b+¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b5\u00106\u001aç\u0001\u00107\u001a\u00020\u0012\"\u0004\b\u0000\u0010!*\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u0000042:\b\u0002\u0010(\u001a4\u0012\u0013\u0012\u00110/¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(0\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010\u00172:\b\u0002\u0010)\u001a4\u0012\u0013\u0012\u00110/¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(0\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0006\u0012\u0004\u0018\u00010'0\u00172F\u0010,\u001aB\u0012\u0004\u0012\u00020*\u0012\u0013\u0012\u00110/¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(0\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u001201¢\u0006\u0002\b+¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b7\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/t;", com.tekartik.sqflite.b.f98606y, "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/layout/m0;", "contentPadding", "Landroidx/compose/foundation/layout/Arrangement$l;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$d;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/g;", "flingBehavior", "", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/o;", "Lkotlin/b2;", "Lkotlin/t;", "content", "b", "(Landroidx/compose/foundation/lazy/staggeredgrid/t;Landroidx/compose/ui/n;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/m0;Landroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/foundation/layout/Arrangement$d;Landroidx/compose/foundation/gestures/g;ZLyh/l;Landroidx/compose/runtime/p;II)V", "Lkotlin/Function2;", "Ls1/e;", "Ls1/b;", "", "k", "(Landroidx/compose/foundation/lazy/staggeredgrid/t;Landroidx/compose/foundation/layout/Arrangement$d;Landroidx/compose/foundation/layout/m0;Landroidx/compose/runtime/p;I)Lyh/p;", com.tekartik.sqflite.b.f98607z, ak.av, "l", "(Landroidx/compose/foundation/lazy/staggeredgrid/t;Landroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/foundation/layout/m0;Landroidx/compose/runtime/p;I)Lyh/p;", androidx.exifinterface.media.a.f23244d5, "", "items", "Lkotlin/m0;", "name", ChannelListActivity.q.f79586f, "", "key", "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/f;", "Landroidx/compose/runtime/h;", "itemContent", ak.aF, "(Landroidx/compose/foundation/lazy/staggeredgrid/o;Ljava/util/List;Lyh/l;Lyh/l;Lyh/r;)V", "", UCropPlusActivity.ARG_INDEX, "Lkotlin/Function3;", "g", "(Landroidx/compose/foundation/lazy/staggeredgrid/o;Ljava/util/List;Lyh/p;Lyh/p;Lyh/s;)V", "", "d", "(Landroidx/compose/foundation/lazy/staggeredgrid/o;[Ljava/lang/Object;Lyh/l;Lyh/l;Lyh/r;)V", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/foundation/lazy/staggeredgrid/o;[Ljava/lang/Object;Lyh/p;Lyh/p;Lyh/s;)V", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyStaggeredGridDslKt {
    /* JADX WARN: Code duplicated, block: B:109:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0156  */
    /* JADX WARN: Code duplicated, block: B:113:0x015c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0164  */
    /* JADX WARN: Code duplicated, block: B:116:0x0168  */
    /* JADX WARN: Code duplicated, block: B:117:0x0172  */
    /* JADX WARN: Code duplicated, block: B:119:0x0175  */
    /* JADX WARN: Code duplicated, block: B:120:0x0181  */
    /* JADX WARN: Code duplicated, block: B:122:0x0184  */
    /* JADX WARN: Code duplicated, block: B:125:0x0194  */
    /* JADX WARN: Code duplicated, block: B:126:0x019e  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:133:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:136:0x021f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0236  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0134  */
    @androidx.compose.foundation.t
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final t rows, @dl.e androidx.compose.ui.n nVar, @dl.e LazyStaggeredGridState lazyStaggeredGridState, @dl.e m0 m0Var, @dl.e Arrangement.l lVar, @dl.e Arrangement.d dVar, @dl.e androidx.compose.foundation.gestures.g gVar, boolean z10, @dl.d final yh.l<? super o, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        int i14;
        m0 m0Var2;
        int i15;
        int i16;
        Arrangement.l lVar2;
        int i17;
        int i18;
        Arrangement.d dVarZ;
        int i19;
        int i20;
        int i21;
        int i22;
        LazyStaggeredGridState lazyStaggeredGridStateA;
        m0 m0VarA;
        Arrangement.l lVarZ;
        androidx.compose.foundation.gestures.g gVarA;
        boolean z11;
        LazyStaggeredGridState lazyStaggeredGridState2;
        androidx.compose.ui.n nVar3;
        m0 m0Var3;
        Arrangement.d dVar2;
        Arrangement.l lVar3;
        final androidx.compose.ui.n nVar4;
        final LazyStaggeredGridState lazyStaggeredGridState3;
        final Arrangement.l lVar4;
        final m0 m0Var4;
        final Arrangement.d dVar3;
        final androidx.compose.foundation.gestures.g gVar2;
        final boolean z12;
        u1 u1VarH;
        int i23;
        f0.p(rows, "rows");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-1591874454);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(rows) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 112) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                i12 |= 128;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    m0Var2 = m0Var;
                    if (pVarF.s(m0Var2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((i10 & 57344) == 0) {
                        lVar2 = lVar;
                        if (pVarF.s(lVar2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        i12 |= androidx.profileinstaller.o.c.f26824k;
                        dVarZ = dVar;
                    } else {
                        dVarZ = dVar;
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(dVarZ)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0 || !pVarF.s(gVar)) {
                            i23 = 524288;
                        } else {
                            i23 = 1048576;
                        }
                        i12 |= i23;
                    }
                    i20 = i11 & 128;
                    if (i20 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (pVarF.u(z10)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i12 |= i21;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 234881024) == 0) {
                            if (pVarF.s(content)) {
                                i22 = 67108864;
                            } else {
                                i22 = 33554432;
                            }
                        }
                        if (i13 != 4 && (191739611 & i12) == 38347922 && pVarF.b()) {
                            pVarF.l();
                            lazyStaggeredGridState3 = lazyStaggeredGridState;
                            gVar2 = gVar;
                            z12 = z10;
                            nVar4 = nVar2;
                            m0Var4 = m0Var2;
                            dVar3 = dVarZ;
                            lVar4 = lVar2;
                        } else {
                            pVarF.W();
                            if ((i10 & 1) != 0 || pVarF.o()) {
                                if (i24 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                }
                                if (i13 != 0) {
                                    lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                    i12 &= -897;
                                } else {
                                    lazyStaggeredGridStateA = lazyStaggeredGridState;
                                }
                                if (i14 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var2;
                                }
                                if (i16 != 0) {
                                    lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                                } else {
                                    lVarZ = lVar2;
                                }
                                if (i18 != 0) {
                                    dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                                }
                                if ((i11 & 64) != 0) {
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                    i12 = (-3670017) & i12;
                                } else {
                                    gVarA = gVar;
                                }
                                if (i20 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                                nVar3 = nVar2;
                                m0Var3 = m0VarA;
                                dVar2 = dVarZ;
                                lVar3 = lVarZ;
                            } else {
                                pVarF.l();
                                if (i13 != 0) {
                                    i12 &= -897;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                lazyStaggeredGridState2 = lazyStaggeredGridState;
                                gVarA = gVar;
                                z11 = z10;
                                nVar3 = nVar2;
                                dVar2 = dVarZ;
                                lVar3 = lVar2;
                                m0Var3 = m0Var2;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                            }
                            int i25 = i12 << 12;
                            Arrangement.l lVar5 = lVar3;
                            m0 m0Var5 = m0Var3;
                            LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i25 & 234881024) | (i25 & 1879048192), (i12 >> 24) & 14, 32);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            lazyStaggeredGridState3 = lazyStaggeredGridState2;
                            lVar4 = lVar5;
                            m0Var4 = m0Var5;
                            dVar3 = dVar2;
                            gVar2 = gVarA;
                            z12 = z11;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i26) {
                                LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i22 = 100663296;
                    i12 |= i22;
                    if (i13 != 4) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                        }
                        int i26 = i12 << 12;
                        Arrangement.l lVar6 = lVar3;
                        m0 m0Var6 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i26 & 234881024) | (i26 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        lVar4 = lVar6;
                        m0Var4 = m0Var6;
                        dVar3 = dVar2;
                        gVar2 = gVarA;
                        z12 = z11;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                        }
                        int i27 = i12 << 12;
                        Arrangement.l lVar7 = lVar3;
                        m0 m0Var7 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i27 & 234881024) | (i27 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        lVar4 = lVar7;
                        m0Var4 = m0Var7;
                        dVar3 = dVar2;
                        gVar2 = gVarA;
                        z12 = z11;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i28) {
                            LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                lVar2 = lVar;
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    dVarZ = dVar;
                } else {
                    dVarZ = dVar;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(dVarZ)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i20 = i11 & 128;
                if (i20 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.u(z10)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (pVarF.s(content)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                    }
                    if (i13 != 4) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                        }
                        int i28 = i12 << 12;
                        Arrangement.l lVar8 = lVar3;
                        m0 m0Var8 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i28 & 234881024) | (i28 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        lVar4 = lVar8;
                        m0Var4 = m0Var8;
                        dVar3 = dVar2;
                        gVar2 = gVarA;
                        z12 = z11;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                        }
                        int i29 = i12 << 12;
                        Arrangement.l lVar9 = lVar3;
                        m0 m0Var9 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i29 & 234881024) | (i29 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        lVar4 = lVar9;
                        m0Var4 = m0Var9;
                        dVar3 = dVar2;
                        gVar2 = gVarA;
                        z12 = z11;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i210) {
                            LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i22 = 100663296;
                i12 |= i22;
                if (i13 != 4) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                    }
                    int i210 = i12 << 12;
                    Arrangement.l lVar10 = lVar3;
                    m0 m0Var10 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i210 & 234881024) | (i210 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    lVar4 = lVar10;
                    m0Var4 = m0Var10;
                    dVar3 = dVar2;
                    gVar2 = gVarA;
                    z12 = z11;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                    }
                    int i211 = i12 << 12;
                    Arrangement.l lVar11 = lVar3;
                    m0 m0Var11 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i211 & 234881024) | (i211 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    lVar4 = lVar11;
                    m0Var4 = m0Var11;
                    dVar3 = dVar2;
                    gVar2 = gVarA;
                    z12 = z11;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i212) {
                        LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            m0Var2 = m0Var;
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 57344) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    dVarZ = dVar;
                } else {
                    dVarZ = dVar;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(dVarZ)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i20 = i11 & 128;
                if (i20 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.u(z10)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (pVarF.s(content)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                    }
                    if (i13 != 4) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                        }
                        int i212 = i12 << 12;
                        Arrangement.l lVar12 = lVar3;
                        m0 m0Var12 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i212 & 234881024) | (i212 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        lVar4 = lVar12;
                        m0Var4 = m0Var12;
                        dVar3 = dVar2;
                        gVar2 = gVarA;
                        z12 = z11;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                        }
                        int i213 = i12 << 12;
                        Arrangement.l lVar13 = lVar3;
                        m0 m0Var13 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i213 & 234881024) | (i213 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        lVar4 = lVar13;
                        m0Var4 = m0Var13;
                        dVar3 = dVar2;
                        gVar2 = gVarA;
                        z12 = z11;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i214) {
                            LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i22 = 100663296;
                i12 |= i22;
                if (i13 != 4) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                    }
                    int i214 = i12 << 12;
                    Arrangement.l lVar14 = lVar3;
                    m0 m0Var14 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i214 & 234881024) | (i214 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    lVar4 = lVar14;
                    m0Var4 = m0Var14;
                    dVar3 = dVar2;
                    gVar2 = gVarA;
                    z12 = z11;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                    }
                    int i215 = i12 << 12;
                    Arrangement.l lVar15 = lVar3;
                    m0 m0Var15 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i215 & 234881024) | (i215 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    lVar4 = lVar15;
                    m0Var4 = m0Var15;
                    dVar3 = dVar2;
                    gVar2 = gVarA;
                    z12 = z11;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i216) {
                        LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            lVar2 = lVar;
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                dVarZ = dVar;
            } else {
                dVarZ = dVar;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(dVarZ)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i20 = i11 & 128;
            if (i20 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.u(z10)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(content)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                }
                if (i13 != 4) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                    }
                    int i216 = i12 << 12;
                    Arrangement.l lVar16 = lVar3;
                    m0 m0Var16 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i216 & 234881024) | (i216 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    lVar4 = lVar16;
                    m0Var4 = m0Var16;
                    dVar3 = dVar2;
                    gVar2 = gVarA;
                    z12 = z11;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                    }
                    int i217 = i12 << 12;
                    Arrangement.l lVar17 = lVar3;
                    m0 m0Var17 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i217 & 234881024) | (i217 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    lVar4 = lVar17;
                    m0Var4 = m0Var17;
                    dVar3 = dVar2;
                    gVar2 = gVarA;
                    z12 = z11;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i218) {
                        LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i22 = 100663296;
            i12 |= i22;
            if (i13 != 4) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                }
                int i218 = i12 << 12;
                Arrangement.l lVar18 = lVar3;
                m0 m0Var18 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i218 & 234881024) | (i218 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                lVar4 = lVar18;
                m0Var4 = m0Var18;
                dVar3 = dVar2;
                gVar2 = gVarA;
                z12 = z11;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                }
                int i219 = i12 << 12;
                Arrangement.l lVar19 = lVar3;
                m0 m0Var19 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i219 & 234881024) | (i219 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                lVar4 = lVar19;
                m0Var4 = m0Var19;
                dVar3 = dVar2;
                gVar2 = gVarA;
                z12 = z11;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2110) {
                    LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 48;
        nVar2 = nVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 128;
        }
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                m0Var2 = m0Var;
                if (pVarF.s(m0Var2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 57344) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    dVarZ = dVar;
                } else {
                    dVarZ = dVar;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(dVarZ)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i20 = i11 & 128;
                if (i20 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.u(z10)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (pVarF.s(content)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                    }
                    if (i13 != 4) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                        }
                        int i2110 = i12 << 12;
                        Arrangement.l lVar110 = lVar3;
                        m0 m0Var110 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2110 & 234881024) | (i2110 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        lVar4 = lVar110;
                        m0Var4 = m0Var110;
                        dVar3 = dVar2;
                        gVar2 = gVarA;
                        z12 = z11;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            dVar2 = dVarZ;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                        }
                        int i2111 = i12 << 12;
                        Arrangement.l lVar111 = lVar3;
                        m0 m0Var111 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2111 & 234881024) | (i2111 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        lVar4 = lVar111;
                        m0Var4 = m0Var111;
                        dVar3 = dVar2;
                        gVar2 = gVarA;
                        z12 = z11;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2112) {
                            LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i22 = 100663296;
                i12 |= i22;
                if (i13 != 4) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                    }
                    int i2112 = i12 << 12;
                    Arrangement.l lVar112 = lVar3;
                    m0 m0Var112 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2112 & 234881024) | (i2112 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    lVar4 = lVar112;
                    m0Var4 = m0Var112;
                    dVar3 = dVar2;
                    gVar2 = gVarA;
                    z12 = z11;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                    }
                    int i2113 = i12 << 12;
                    Arrangement.l lVar113 = lVar3;
                    m0 m0Var113 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2113 & 234881024) | (i2113 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    lVar4 = lVar113;
                    m0Var4 = m0Var113;
                    dVar3 = dVar2;
                    gVar2 = gVarA;
                    z12 = z11;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2114) {
                        LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            lVar2 = lVar;
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                dVarZ = dVar;
            } else {
                dVarZ = dVar;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(dVarZ)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i20 = i11 & 128;
            if (i20 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.u(z10)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(content)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                }
                if (i13 != 4) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                    }
                    int i2114 = i12 << 12;
                    Arrangement.l lVar114 = lVar3;
                    m0 m0Var114 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2114 & 234881024) | (i2114 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    lVar4 = lVar114;
                    m0Var4 = m0Var114;
                    dVar3 = dVar2;
                    gVar2 = gVarA;
                    z12 = z11;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                    }
                    int i2115 = i12 << 12;
                    Arrangement.l lVar115 = lVar3;
                    m0 m0Var115 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2115 & 234881024) | (i2115 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    lVar4 = lVar115;
                    m0Var4 = m0Var115;
                    dVar3 = dVar2;
                    gVar2 = gVarA;
                    z12 = z11;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2116) {
                        LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i22 = 100663296;
            i12 |= i22;
            if (i13 != 4) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                }
                int i2116 = i12 << 12;
                Arrangement.l lVar116 = lVar3;
                m0 m0Var116 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2116 & 234881024) | (i2116 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                lVar4 = lVar116;
                m0Var4 = m0Var116;
                dVar3 = dVar2;
                gVar2 = gVarA;
                z12 = z11;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                }
                int i2117 = i12 << 12;
                Arrangement.l lVar117 = lVar3;
                m0 m0Var117 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2117 & 234881024) | (i2117 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                lVar4 = lVar117;
                m0Var4 = m0Var117;
                dVar3 = dVar2;
                gVar2 = gVarA;
                z12 = z11;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2118) {
                    LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        m0Var2 = m0Var;
        i16 = i11 & 16;
        if (i16 != 0) {
            if ((i10 & 57344) == 0) {
                lVar2 = lVar;
                if (pVarF.s(lVar2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                dVarZ = dVar;
            } else {
                dVarZ = dVar;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(dVarZ)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i20 = i11 & 128;
            if (i20 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.u(z10)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(content)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                }
                if (i13 != 4) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                    }
                    int i2118 = i12 << 12;
                    Arrangement.l lVar118 = lVar3;
                    m0 m0Var118 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2118 & 234881024) | (i2118 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    lVar4 = lVar118;
                    m0Var4 = m0Var118;
                    dVar3 = dVar2;
                    gVar2 = gVarA;
                    z12 = z11;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        dVar2 = dVarZ;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                    }
                    int i2119 = i12 << 12;
                    Arrangement.l lVar119 = lVar3;
                    m0 m0Var119 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2119 & 234881024) | (i2119 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    lVar4 = lVar119;
                    m0Var4 = m0Var119;
                    dVar3 = dVar2;
                    gVar2 = gVarA;
                    z12 = z11;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21110) {
                        LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i22 = 100663296;
            i12 |= i22;
            if (i13 != 4) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                }
                int i21110 = i12 << 12;
                Arrangement.l lVar1110 = lVar3;
                m0 m0Var1110 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i21110 & 234881024) | (i21110 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                lVar4 = lVar1110;
                m0Var4 = m0Var1110;
                dVar3 = dVar2;
                gVar2 = gVarA;
                z12 = z11;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                }
                int i21111 = i12 << 12;
                Arrangement.l lVar1111 = lVar3;
                m0 m0Var1111 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i21111 & 234881024) | (i21111 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                lVar4 = lVar1111;
                m0Var4 = m0Var1111;
                dVar3 = dVar2;
                gVar2 = gVarA;
                z12 = z11;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21112) {
                    LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        lVar2 = lVar;
        i18 = i11 & 32;
        if (i18 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
            dVarZ = dVar;
        } else {
            dVarZ = dVar;
            if ((i10 & 458752) == 0) {
                if (pVarF.s(dVarZ)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i23 = 524288;
            } else {
                i23 = 524288;
            }
            i12 |= i23;
        }
        i20 = i11 & 128;
        if (i20 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (pVarF.u(z10)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i12 |= i21;
        }
        if ((i11 & 256) != 0) {
            if ((i10 & 234881024) == 0) {
                if (pVarF.s(content)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
            }
            if (i13 != 4) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                }
                int i21112 = i12 << 12;
                Arrangement.l lVar1112 = lVar3;
                m0 m0Var1112 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i21112 & 234881024) | (i21112 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                lVar4 = lVar1112;
                m0Var4 = m0Var1112;
                dVar3 = dVar2;
                gVar2 = gVarA;
                z12 = z11;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    dVar2 = dVarZ;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
                }
                int i21113 = i12 << 12;
                Arrangement.l lVar1113 = lVar3;
                m0 m0Var1113 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i21113 & 234881024) | (i21113 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                lVar4 = lVar1113;
                m0Var4 = m0Var1113;
                dVar3 = dVar2;
                gVar2 = gVarA;
                z12 = z11;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21114) {
                    LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i22 = 100663296;
        i12 |= i22;
        if (i13 != 4) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateA = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i16 != 0) {
                    lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                } else {
                    lVarZ = lVar2;
                }
                if (i18 != 0) {
                    dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 = (-3670017) & i12;
                } else {
                    gVarA = gVar;
                }
                if (i20 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                nVar3 = nVar2;
                m0Var3 = m0VarA;
                dVar2 = dVarZ;
                lVar3 = lVarZ;
            } else {
                if (i24 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateA = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i16 != 0) {
                    lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                } else {
                    lVarZ = lVar2;
                }
                if (i18 != 0) {
                    dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 = (-3670017) & i12;
                } else {
                    gVarA = gVar;
                }
                if (i20 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                nVar3 = nVar2;
                m0Var3 = m0VarA;
                dVar2 = dVarZ;
                lVar3 = lVarZ;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
            }
            int i21114 = i12 << 12;
            Arrangement.l lVar1114 = lVar3;
            m0 m0Var1114 = m0Var3;
            LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i21114 & 234881024) | (i21114 & 1879048192), (i12 >> 24) & 14, 32);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            lVar4 = lVar1114;
            m0Var4 = m0Var1114;
            dVar3 = dVar2;
            gVar2 = gVarA;
            z12 = z11;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateA = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i16 != 0) {
                    lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                } else {
                    lVarZ = lVar2;
                }
                if (i18 != 0) {
                    dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 = (-3670017) & i12;
                } else {
                    gVarA = gVar;
                }
                if (i20 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                nVar3 = nVar2;
                m0Var3 = m0VarA;
                dVar2 = dVarZ;
                lVar3 = lVarZ;
            } else {
                if (i24 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateA = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i16 != 0) {
                    lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                } else {
                    lVarZ = lVar2;
                }
                if (i18 != 0) {
                    dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 = (-3670017) & i12;
                } else {
                    gVarA = gVar;
                }
                if (i20 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                nVar3 = nVar2;
                m0Var3 = m0VarA;
                dVar2 = dVarZ;
                lVar3 = lVarZ;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1591874454, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:137)");
            }
            int i21115 = i12 << 12;
            Arrangement.l lVar1115 = lVar3;
            m0 m0Var1115 = m0Var3;
            LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Horizontal, l(rows, lVar3, m0Var3, pVarF, (i12 & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVar2, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i21115 & 234881024) | (i21115 & 1879048192), (i12 >> 24) & 14, 32);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            lVar4 = lVar1115;
            m0Var4 = m0Var1115;
            dVar3 = dVar2;
            gVar2 = gVarA;
            z12 = z11;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21116) {
                LazyStaggeredGridDslKt.a(rows, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar3, gVar2, z12, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0155  */
    /* JADX WARN: Code duplicated, block: B:113:0x015b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0163  */
    /* JADX WARN: Code duplicated, block: B:116:0x0167  */
    /* JADX WARN: Code duplicated, block: B:117:0x0171  */
    /* JADX WARN: Code duplicated, block: B:119:0x0174  */
    /* JADX WARN: Code duplicated, block: B:120:0x0180  */
    /* JADX WARN: Code duplicated, block: B:122:0x0183  */
    /* JADX WARN: Code duplicated, block: B:125:0x0193  */
    /* JADX WARN: Code duplicated, block: B:126:0x019d  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:136:0x021c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0233  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0134  */
    @androidx.compose.foundation.t
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final t columns, @dl.e androidx.compose.ui.n nVar, @dl.e LazyStaggeredGridState lazyStaggeredGridState, @dl.e m0 m0Var, @dl.e Arrangement.l lVar, @dl.e Arrangement.d dVar, @dl.e androidx.compose.foundation.gestures.g gVar, boolean z10, @dl.d final yh.l<? super o, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        int i14;
        m0 m0Var2;
        int i15;
        int i16;
        Arrangement.l lVar2;
        int i17;
        int i18;
        Arrangement.d dVarZ;
        int i19;
        int i20;
        int i21;
        int i22;
        LazyStaggeredGridState lazyStaggeredGridStateA;
        m0 m0VarA;
        Arrangement.l lVarZ;
        androidx.compose.foundation.gestures.g gVarA;
        boolean z11;
        LazyStaggeredGridState lazyStaggeredGridState2;
        androidx.compose.ui.n nVar3;
        m0 m0Var3;
        Arrangement.l lVar3;
        final androidx.compose.ui.n nVar4;
        final LazyStaggeredGridState lazyStaggeredGridState3;
        final Arrangement.d dVar2;
        final m0 m0Var4;
        final Arrangement.l lVar4;
        final androidx.compose.foundation.gestures.g gVar2;
        final boolean z12;
        u1 u1VarH;
        int i23;
        f0.p(columns, "columns");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-228373416);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(columns) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 112) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                i12 |= 128;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    m0Var2 = m0Var;
                    if (pVarF.s(m0Var2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((i10 & 57344) == 0) {
                        lVar2 = lVar;
                        if (pVarF.s(lVar2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        i12 |= androidx.profileinstaller.o.c.f26824k;
                        dVarZ = dVar;
                    } else {
                        dVarZ = dVar;
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(dVarZ)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0 || !pVarF.s(gVar)) {
                            i23 = 524288;
                        } else {
                            i23 = 1048576;
                        }
                        i12 |= i23;
                    }
                    i20 = i11 & 128;
                    if (i20 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (pVarF.u(z10)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i12 |= i21;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 234881024) == 0) {
                            if (pVarF.s(content)) {
                                i22 = 67108864;
                            } else {
                                i22 = 33554432;
                            }
                        }
                        if (i13 != 4 && (191739611 & i12) == 38347922 && pVarF.b()) {
                            pVarF.l();
                            lazyStaggeredGridState3 = lazyStaggeredGridState;
                            gVar2 = gVar;
                            z12 = z10;
                            nVar4 = nVar2;
                            m0Var4 = m0Var2;
                            dVar2 = dVarZ;
                            lVar4 = lVar2;
                        } else {
                            pVarF.W();
                            if ((i10 & 1) != 0 || pVarF.o()) {
                                if (i24 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                }
                                if (i13 != 0) {
                                    lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                    i12 &= -897;
                                } else {
                                    lazyStaggeredGridStateA = lazyStaggeredGridState;
                                }
                                if (i14 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var2;
                                }
                                if (i16 != 0) {
                                    lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                                } else {
                                    lVarZ = lVar2;
                                }
                                if (i18 != 0) {
                                    dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                                }
                                if ((i11 & 64) != 0) {
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                    i12 = (-3670017) & i12;
                                } else {
                                    gVarA = gVar;
                                }
                                if (i20 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                                nVar3 = nVar2;
                                m0Var3 = m0VarA;
                                lVar3 = lVarZ;
                            } else {
                                pVarF.l();
                                if (i13 != 0) {
                                    i12 &= -897;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                lazyStaggeredGridState2 = lazyStaggeredGridState;
                                gVarA = gVar;
                                z11 = z10;
                                nVar3 = nVar2;
                                lVar3 = lVar2;
                                m0Var3 = m0Var2;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                            }
                            int i25 = i12 << 12;
                            Arrangement.d dVar3 = dVarZ;
                            m0 m0Var5 = m0Var3;
                            LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i25 & 234881024) | (i25 & 1879048192), (i12 >> 24) & 14, 32);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            lazyStaggeredGridState3 = lazyStaggeredGridState2;
                            dVar2 = dVar3;
                            m0Var4 = m0Var5;
                            lVar4 = lVar3;
                            gVar2 = gVarA;
                            z12 = z11;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i26) {
                                LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i22 = 100663296;
                    i12 |= i22;
                    if (i13 != 4) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                        }
                        int i26 = i12 << 12;
                        Arrangement.d dVar4 = dVarZ;
                        m0 m0Var6 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i26 & 234881024) | (i26 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        dVar2 = dVar4;
                        m0Var4 = m0Var6;
                        lVar4 = lVar3;
                        gVar2 = gVarA;
                        z12 = z11;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                        }
                        int i27 = i12 << 12;
                        Arrangement.d dVar5 = dVarZ;
                        m0 m0Var7 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i27 & 234881024) | (i27 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        dVar2 = dVar5;
                        m0Var4 = m0Var7;
                        lVar4 = lVar3;
                        gVar2 = gVarA;
                        z12 = z11;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i28) {
                            LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                lVar2 = lVar;
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    dVarZ = dVar;
                } else {
                    dVarZ = dVar;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(dVarZ)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i20 = i11 & 128;
                if (i20 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.u(z10)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (pVarF.s(content)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                    }
                    if (i13 != 4) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                        }
                        int i28 = i12 << 12;
                        Arrangement.d dVar6 = dVarZ;
                        m0 m0Var8 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i28 & 234881024) | (i28 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        dVar2 = dVar6;
                        m0Var4 = m0Var8;
                        lVar4 = lVar3;
                        gVar2 = gVarA;
                        z12 = z11;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                        }
                        int i29 = i12 << 12;
                        Arrangement.d dVar7 = dVarZ;
                        m0 m0Var9 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i29 & 234881024) | (i29 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        dVar2 = dVar7;
                        m0Var4 = m0Var9;
                        lVar4 = lVar3;
                        gVar2 = gVarA;
                        z12 = z11;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i210) {
                            LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i22 = 100663296;
                i12 |= i22;
                if (i13 != 4) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                    }
                    int i210 = i12 << 12;
                    Arrangement.d dVar8 = dVarZ;
                    m0 m0Var10 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i210 & 234881024) | (i210 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    dVar2 = dVar8;
                    m0Var4 = m0Var10;
                    lVar4 = lVar3;
                    gVar2 = gVarA;
                    z12 = z11;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                    }
                    int i211 = i12 << 12;
                    Arrangement.d dVar9 = dVarZ;
                    m0 m0Var11 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i211 & 234881024) | (i211 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    dVar2 = dVar9;
                    m0Var4 = m0Var11;
                    lVar4 = lVar3;
                    gVar2 = gVarA;
                    z12 = z11;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i212) {
                        LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            m0Var2 = m0Var;
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 57344) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    dVarZ = dVar;
                } else {
                    dVarZ = dVar;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(dVarZ)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i20 = i11 & 128;
                if (i20 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.u(z10)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (pVarF.s(content)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                    }
                    if (i13 != 4) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                        }
                        int i212 = i12 << 12;
                        Arrangement.d dVar10 = dVarZ;
                        m0 m0Var12 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i212 & 234881024) | (i212 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        dVar2 = dVar10;
                        m0Var4 = m0Var12;
                        lVar4 = lVar3;
                        gVar2 = gVarA;
                        z12 = z11;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                        }
                        int i213 = i12 << 12;
                        Arrangement.d dVar11 = dVarZ;
                        m0 m0Var13 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i213 & 234881024) | (i213 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        dVar2 = dVar11;
                        m0Var4 = m0Var13;
                        lVar4 = lVar3;
                        gVar2 = gVarA;
                        z12 = z11;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i214) {
                            LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i22 = 100663296;
                i12 |= i22;
                if (i13 != 4) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                    }
                    int i214 = i12 << 12;
                    Arrangement.d dVar12 = dVarZ;
                    m0 m0Var14 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i214 & 234881024) | (i214 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    dVar2 = dVar12;
                    m0Var4 = m0Var14;
                    lVar4 = lVar3;
                    gVar2 = gVarA;
                    z12 = z11;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                    }
                    int i215 = i12 << 12;
                    Arrangement.d dVar13 = dVarZ;
                    m0 m0Var15 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i215 & 234881024) | (i215 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    dVar2 = dVar13;
                    m0Var4 = m0Var15;
                    lVar4 = lVar3;
                    gVar2 = gVarA;
                    z12 = z11;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i216) {
                        LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            lVar2 = lVar;
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                dVarZ = dVar;
            } else {
                dVarZ = dVar;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(dVarZ)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i20 = i11 & 128;
            if (i20 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.u(z10)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(content)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                }
                if (i13 != 4) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                    }
                    int i216 = i12 << 12;
                    Arrangement.d dVar14 = dVarZ;
                    m0 m0Var16 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i216 & 234881024) | (i216 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    dVar2 = dVar14;
                    m0Var4 = m0Var16;
                    lVar4 = lVar3;
                    gVar2 = gVarA;
                    z12 = z11;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                    }
                    int i217 = i12 << 12;
                    Arrangement.d dVar15 = dVarZ;
                    m0 m0Var17 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i217 & 234881024) | (i217 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    dVar2 = dVar15;
                    m0Var4 = m0Var17;
                    lVar4 = lVar3;
                    gVar2 = gVarA;
                    z12 = z11;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i218) {
                        LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i22 = 100663296;
            i12 |= i22;
            if (i13 != 4) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                }
                int i218 = i12 << 12;
                Arrangement.d dVar16 = dVarZ;
                m0 m0Var18 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i218 & 234881024) | (i218 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                dVar2 = dVar16;
                m0Var4 = m0Var18;
                lVar4 = lVar3;
                gVar2 = gVarA;
                z12 = z11;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                }
                int i219 = i12 << 12;
                Arrangement.d dVar17 = dVarZ;
                m0 m0Var19 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i219 & 234881024) | (i219 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                dVar2 = dVar17;
                m0Var4 = m0Var19;
                lVar4 = lVar3;
                gVar2 = gVarA;
                z12 = z11;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2110) {
                    LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 48;
        nVar2 = nVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 128;
        }
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                m0Var2 = m0Var;
                if (pVarF.s(m0Var2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 57344) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    dVarZ = dVar;
                } else {
                    dVarZ = dVar;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(dVarZ)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i20 = i11 & 128;
                if (i20 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.u(z10)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (pVarF.s(content)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                    }
                    if (i13 != 4) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                        }
                        int i2110 = i12 << 12;
                        Arrangement.d dVar18 = dVarZ;
                        m0 m0Var110 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2110 & 234881024) | (i2110 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        dVar2 = dVar18;
                        m0Var4 = m0Var110;
                        lVar4 = lVar3;
                        gVar2 = gVarA;
                        z12 = z11;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateA = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var2;
                            }
                            if (i16 != 0) {
                                lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            } else {
                                lVarZ = lVar2;
                            }
                            if (i18 != 0) {
                                dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                            }
                            if ((i11 & 64) != 0) {
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                i12 = (-3670017) & i12;
                            } else {
                                gVarA = gVar;
                            }
                            if (i20 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                            nVar3 = nVar2;
                            m0Var3 = m0VarA;
                            lVar3 = lVarZ;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                        }
                        int i2111 = i12 << 12;
                        Arrangement.d dVar19 = dVarZ;
                        m0 m0Var111 = m0Var3;
                        LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2111 & 234881024) | (i2111 & 1879048192), (i12 >> 24) & 14, 32);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        dVar2 = dVar19;
                        m0Var4 = m0Var111;
                        lVar4 = lVar3;
                        gVar2 = gVarA;
                        z12 = z11;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2112) {
                            LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i22 = 100663296;
                i12 |= i22;
                if (i13 != 4) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                    }
                    int i2112 = i12 << 12;
                    Arrangement.d dVar110 = dVarZ;
                    m0 m0Var112 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2112 & 234881024) | (i2112 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    dVar2 = dVar110;
                    m0Var4 = m0Var112;
                    lVar4 = lVar3;
                    gVar2 = gVarA;
                    z12 = z11;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                    }
                    int i2113 = i12 << 12;
                    Arrangement.d dVar111 = dVarZ;
                    m0 m0Var113 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2113 & 234881024) | (i2113 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    dVar2 = dVar111;
                    m0Var4 = m0Var113;
                    lVar4 = lVar3;
                    gVar2 = gVarA;
                    z12 = z11;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2114) {
                        LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            lVar2 = lVar;
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                dVarZ = dVar;
            } else {
                dVarZ = dVar;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(dVarZ)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i20 = i11 & 128;
            if (i20 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.u(z10)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(content)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                }
                if (i13 != 4) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                    }
                    int i2114 = i12 << 12;
                    Arrangement.d dVar112 = dVarZ;
                    m0 m0Var114 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2114 & 234881024) | (i2114 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    dVar2 = dVar112;
                    m0Var4 = m0Var114;
                    lVar4 = lVar3;
                    gVar2 = gVarA;
                    z12 = z11;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                    }
                    int i2115 = i12 << 12;
                    Arrangement.d dVar113 = dVarZ;
                    m0 m0Var115 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2115 & 234881024) | (i2115 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    dVar2 = dVar113;
                    m0Var4 = m0Var115;
                    lVar4 = lVar3;
                    gVar2 = gVarA;
                    z12 = z11;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2116) {
                        LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i22 = 100663296;
            i12 |= i22;
            if (i13 != 4) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                }
                int i2116 = i12 << 12;
                Arrangement.d dVar114 = dVarZ;
                m0 m0Var116 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2116 & 234881024) | (i2116 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                dVar2 = dVar114;
                m0Var4 = m0Var116;
                lVar4 = lVar3;
                gVar2 = gVarA;
                z12 = z11;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                }
                int i2117 = i12 << 12;
                Arrangement.d dVar115 = dVarZ;
                m0 m0Var117 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2117 & 234881024) | (i2117 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                dVar2 = dVar115;
                m0Var4 = m0Var117;
                lVar4 = lVar3;
                gVar2 = gVarA;
                z12 = z11;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2118) {
                    LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        m0Var2 = m0Var;
        i16 = i11 & 16;
        if (i16 != 0) {
            if ((i10 & 57344) == 0) {
                lVar2 = lVar;
                if (pVarF.s(lVar2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                dVarZ = dVar;
            } else {
                dVarZ = dVar;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(dVarZ)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i20 = i11 & 128;
            if (i20 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.u(z10)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(content)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                }
                if (i13 != 4) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                    }
                    int i2118 = i12 << 12;
                    Arrangement.d dVar116 = dVarZ;
                    m0 m0Var118 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2118 & 234881024) | (i2118 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    dVar2 = dVar116;
                    m0Var4 = m0Var118;
                    lVar4 = lVar3;
                    gVar2 = gVarA;
                    z12 = z11;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateA = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var2;
                        }
                        if (i16 != 0) {
                            lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        } else {
                            lVarZ = lVar2;
                        }
                        if (i18 != 0) {
                            dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                        }
                        if ((i11 & 64) != 0) {
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            i12 = (-3670017) & i12;
                        } else {
                            gVarA = gVar;
                        }
                        if (i20 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                        nVar3 = nVar2;
                        m0Var3 = m0VarA;
                        lVar3 = lVarZ;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                    }
                    int i2119 = i12 << 12;
                    Arrangement.d dVar117 = dVarZ;
                    m0 m0Var119 = m0Var3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i2119 & 234881024) | (i2119 & 1879048192), (i12 >> 24) & 14, 32);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    dVar2 = dVar117;
                    m0Var4 = m0Var119;
                    lVar4 = lVar3;
                    gVar2 = gVarA;
                    z12 = z11;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21110) {
                        LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i22 = 100663296;
            i12 |= i22;
            if (i13 != 4) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                }
                int i21110 = i12 << 12;
                Arrangement.d dVar118 = dVarZ;
                m0 m0Var1110 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i21110 & 234881024) | (i21110 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                dVar2 = dVar118;
                m0Var4 = m0Var1110;
                lVar4 = lVar3;
                gVar2 = gVarA;
                z12 = z11;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                }
                int i21111 = i12 << 12;
                Arrangement.d dVar119 = dVarZ;
                m0 m0Var1111 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i21111 & 234881024) | (i21111 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                dVar2 = dVar119;
                m0Var4 = m0Var1111;
                lVar4 = lVar3;
                gVar2 = gVarA;
                z12 = z11;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21112) {
                    LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        lVar2 = lVar;
        i18 = i11 & 32;
        if (i18 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
            dVarZ = dVar;
        } else {
            dVarZ = dVar;
            if ((i10 & 458752) == 0) {
                if (pVarF.s(dVarZ)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i23 = 524288;
            } else {
                i23 = 524288;
            }
            i12 |= i23;
        }
        i20 = i11 & 128;
        if (i20 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (pVarF.u(z10)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i12 |= i21;
        }
        if ((i11 & 256) != 0) {
            if ((i10 & 234881024) == 0) {
                if (pVarF.s(content)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
            }
            if (i13 != 4) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                }
                int i21112 = i12 << 12;
                Arrangement.d dVar1110 = dVarZ;
                m0 m0Var1112 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i21112 & 234881024) | (i21112 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                dVar2 = dVar1110;
                m0Var4 = m0Var1112;
                lVar4 = lVar3;
                gVar2 = gVarA;
                z12 = z11;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateA = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var2;
                    }
                    if (i16 != 0) {
                        lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    } else {
                        lVarZ = lVar2;
                    }
                    if (i18 != 0) {
                        dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                    }
                    if ((i11 & 64) != 0) {
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        i12 = (-3670017) & i12;
                    } else {
                        gVarA = gVar;
                    }
                    if (i20 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                    nVar3 = nVar2;
                    m0Var3 = m0VarA;
                    lVar3 = lVarZ;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
                }
                int i21113 = i12 << 12;
                Arrangement.d dVar1111 = dVarZ;
                m0 m0Var1113 = m0Var3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i21113 & 234881024) | (i21113 & 1879048192), (i12 >> 24) & 14, 32);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                dVar2 = dVar1111;
                m0Var4 = m0Var1113;
                lVar4 = lVar3;
                gVar2 = gVarA;
                z12 = z11;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21114) {
                    LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i22 = 100663296;
        i12 |= i22;
        if (i13 != 4) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateA = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i16 != 0) {
                    lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                } else {
                    lVarZ = lVar2;
                }
                if (i18 != 0) {
                    dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 = (-3670017) & i12;
                } else {
                    gVarA = gVar;
                }
                if (i20 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                nVar3 = nVar2;
                m0Var3 = m0VarA;
                lVar3 = lVarZ;
            } else {
                if (i24 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateA = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i16 != 0) {
                    lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                } else {
                    lVarZ = lVar2;
                }
                if (i18 != 0) {
                    dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 = (-3670017) & i12;
                } else {
                    gVarA = gVar;
                }
                if (i20 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                nVar3 = nVar2;
                m0Var3 = m0VarA;
                lVar3 = lVarZ;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
            }
            int i21114 = i12 << 12;
            Arrangement.d dVar1112 = dVarZ;
            m0 m0Var1114 = m0Var3;
            LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i21114 & 234881024) | (i21114 & 1879048192), (i12 >> 24) & 14, 32);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            dVar2 = dVar1112;
            m0Var4 = m0Var1114;
            lVar4 = lVar3;
            gVar2 = gVarA;
            z12 = z11;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateA = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i16 != 0) {
                    lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                } else {
                    lVarZ = lVar2;
                }
                if (i18 != 0) {
                    dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 = (-3670017) & i12;
                } else {
                    gVarA = gVar;
                }
                if (i20 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                nVar3 = nVar2;
                m0Var3 = m0VarA;
                lVar3 = lVarZ;
            } else {
                if (i24 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateA = LazyStaggeredGridStateKt.a(0, 0, pVarF, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateA = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var2;
                }
                if (i16 != 0) {
                    lVarZ = Arrangement.f5896a.z(s1.h.g(0));
                } else {
                    lVarZ = lVar2;
                }
                if (i18 != 0) {
                    dVarZ = Arrangement.f5896a.z(s1.h.g(0));
                }
                if ((i11 & 64) != 0) {
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    i12 = (-3670017) & i12;
                } else {
                    gVarA = gVar;
                }
                if (i20 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateA;
                nVar3 = nVar2;
                m0Var3 = m0VarA;
                lVar3 = lVarZ;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-228373416, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:55)");
            }
            int i21115 = i12 << 12;
            Arrangement.d dVar1113 = dVarZ;
            m0 m0Var1115 = m0Var3;
            LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.Vertical, k(columns, dVarZ, m0Var3, pVarF, (i12 & 14) | ((i12 >> 12) & 112) | ((i12 >> 3) & bb.c.b.f30796me)), nVar3, m0Var3, false, gVarA, z11, lVar3, dVarZ, content, pVarF, ((i12 << 6) & bb.c.g.f32954lc) | 56 | ((i12 << 3) & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i21115 & 234881024) | (i21115 & 1879048192), (i12 >> 24) & 14, 32);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            dVar2 = dVar1113;
            m0Var4 = m0Var1115;
            lVar4 = lVar3;
            gVar2 = gVarA;
            z12 = z11;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21116) {
                LazyStaggeredGridDslKt.b(columns, nVar4, lazyStaggeredGridState3, m0Var4, lVar4, dVar2, gVar2, z12, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @androidx.compose.foundation.t
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final <T> void c(@dl.d o oVar, @dl.d final List<? extends T> items, @dl.e final yh.l<? super T, ? extends Object> lVar, @dl.d final yh.l<? super T, ? extends Object> contentType, @dl.d final yh.r<? super f, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(oVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        oVar.b(items.size(), lVar != null ? new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @dl.d
            public final Object a(int i10) {
                return lVar.invoke((T) items.get(i10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        } : null, new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @dl.e
            public final Object a(int i10) {
                return contentType.invoke((T) items.get(i10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }, androidx.compose.runtime.internal.b.c(-666084403, true, new yh.r<f, Integer, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // yh.r
            public /* bridge */ /* synthetic */ b2 U0(f fVar, Integer num, androidx.compose.runtime.p pVar, Integer num2) {
                a(fVar, num.intValue(), pVar, num2.intValue());
                return b2.f124493a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @androidx.compose.runtime.h
            public final void a(@dl.d f items2, int i10, @dl.e androidx.compose.runtime.p pVar, int i11) {
                int i12;
                f0.p(items2, "$this$items");
                if ((i11 & 14) == 0) {
                    i12 = (pVar.s(items2) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    i12 |= pVar.y(i10) ? 32 : 16;
                }
                if ((i12 & bb.c.b.f30586db) == 146 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-666084403, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:291)");
                }
                itemContent.U0(items2, (T) items.get(i10), pVar, Integer.valueOf(i12 & 14));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }));
    }

    @androidx.compose.foundation.t
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final <T> void d(@dl.d o oVar, @dl.d final T[] items, @dl.e final yh.l<? super T, ? extends Object> lVar, @dl.d final yh.l<? super T, ? extends Object> contentType, @dl.d final yh.r<? super f, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(oVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        oVar.b(items.length, lVar != null ? new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$6$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @dl.d
            public final Object a(int i10) {
                return lVar.invoke(items[i10]);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        } : null, new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @dl.e
            public final Object a(int i10) {
                return contentType.invoke(items[i10]);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }, androidx.compose.runtime.internal.b.c(-301024882, true, new yh.r<f, Integer, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // yh.r
            public /* bridge */ /* synthetic */ b2 U0(f fVar, Integer num, androidx.compose.runtime.p pVar, Integer num2) {
                a(fVar, num.intValue(), pVar, num2.intValue());
                return b2.f124493a;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @androidx.compose.runtime.h
            public final void a(@dl.d f items2, int i10, @dl.e androidx.compose.runtime.p pVar, int i11) {
                int i12;
                f0.p(items2, "$this$items");
                if ((i11 & 14) == 0) {
                    i12 = (pVar.s(items2) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    i12 |= pVar.y(i10) ? 32 : 16;
                }
                if ((i12 & bb.c.b.f30586db) == 146 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-301024882, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:359)");
                }
                itemContent.U0(items2, items[i10], pVar, Integer.valueOf(i12 & 14));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }));
    }

    public static /* synthetic */ void e(o oVar, List list, yh.l lVar, yh.l lVar2, yh.r rVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar2 = new yh.l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$1
                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        c(oVar, list, lVar, lVar2, rVar);
    }

    public static /* synthetic */ void f(o oVar, Object[] objArr, yh.l lVar, yh.l lVar2, yh.r rVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar2 = new yh.l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5
                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        d(oVar, objArr, lVar, lVar2, rVar);
    }

    @androidx.compose.foundation.t
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final <T> void g(@dl.d o oVar, @dl.d final List<? extends T> items, @dl.e final yh.p<? super Integer, ? super T, ? extends Object> pVar, @dl.d final yh.p<? super Integer, ? super T, ? extends Object> contentType, @dl.d final yh.s<? super f, ? super Integer, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(oVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        oVar.b(items.size(), pVar != null ? new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @dl.d
            public final Object a(int i10) {
                return pVar.invoke(Integer.valueOf(i10), (T) items.get(i10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        } : null, new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @dl.e
            public final Object a(int i10) {
                return contentType.invoke(Integer.valueOf(i10), (T) items.get(i10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }, androidx.compose.runtime.internal.b.c(330414727, true, new yh.r<f, Integer, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // yh.r
            public /* bridge */ /* synthetic */ b2 U0(f fVar, Integer num, androidx.compose.runtime.p pVar2, Integer num2) {
                a(fVar, num.intValue(), pVar2, num2.intValue());
                return b2.f124493a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @androidx.compose.runtime.h
            public final void a(@dl.d f items2, int i10, @dl.e androidx.compose.runtime.p pVar2, int i11) {
                int i12;
                f0.p(items2, "$this$items");
                if ((i11 & 14) == 0) {
                    i12 = (pVar2.s(items2) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    i12 |= pVar2.y(i10) ? 32 : 16;
                }
                if ((i12 & bb.c.b.f30586db) == 146 && pVar2.b()) {
                    pVar2.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(330414727, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:325)");
                }
                itemContent.N0(items2, Integer.valueOf(i10), (T) items.get(i10), pVar2, Integer.valueOf((i12 & 14) | (i12 & 112)));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }));
    }

    @androidx.compose.foundation.t
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final <T> void h(@dl.d o oVar, @dl.d final T[] items, @dl.e final yh.p<? super Integer, ? super T, ? extends Object> pVar, @dl.d final yh.p<? super Integer, ? super T, ? extends Object> contentType, @dl.d final yh.s<? super f, ? super Integer, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(oVar, "<this>");
        f0.p(items, "items");
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        oVar.b(items.length, pVar != null ? new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$6$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @dl.d
            public final Object a(int i10) {
                return pVar.invoke(Integer.valueOf(i10), items[i10]);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        } : null, new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @dl.e
            public final Object a(int i10) {
                return contentType.invoke(Integer.valueOf(i10), items[i10]);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }, androidx.compose.runtime.internal.b.c(-730083922, true, new yh.r<f, Integer, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // yh.r
            public /* bridge */ /* synthetic */ b2 U0(f fVar, Integer num, androidx.compose.runtime.p pVar2, Integer num2) {
                a(fVar, num.intValue(), pVar2, num2.intValue());
                return b2.f124493a;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @androidx.compose.runtime.h
            public final void a(@dl.d f items2, int i10, @dl.e androidx.compose.runtime.p pVar2, int i11) {
                int i12;
                f0.p(items2, "$this$items");
                if ((i11 & 14) == 0) {
                    i12 = (pVar2.s(items2) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    i12 |= pVar2.y(i10) ? 32 : 16;
                }
                if ((i12 & bb.c.b.f30586db) == 146 && pVar2.b()) {
                    pVar2.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-730083922, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:393)");
                }
                itemContent.N0(items2, Integer.valueOf(i10), items[i10], pVar2, Integer.valueOf((i12 & 14) | (i12 & 112)));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }));
    }

    public static /* synthetic */ void i(o oVar, List list, yh.p pVar, yh.p pVar2, yh.s sVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        if ((i10 & 4) != 0) {
            pVar2 = new yh.p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$1
                @dl.e
                public final Void a(int i11, Object obj2) {
                    return null;
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return a(((Number) obj2).intValue(), obj3);
                }
            };
        }
        g(oVar, list, pVar, pVar2, sVar);
    }

    public static /* synthetic */ void j(o oVar, Object[] objArr, yh.p pVar, yh.p pVar2, yh.s sVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        if ((i10 & 4) != 0) {
            pVar2 = new yh.p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5
                @dl.e
                public final Void a(int i11, Object obj2) {
                    return null;
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return a(((Number) obj2).intValue(), obj3);
                }
            };
        }
        h(oVar, objArr, pVar, pVar2, sVar);
    }

    @androidx.compose.runtime.h
    private static final yh.p<s1.e, s1.b, int[]> k(final t tVar, final Arrangement.d dVar, final m0 m0Var, androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1426908594);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1426908594, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnWidthSums (LazyStaggeredGridDsl.kt:83)");
        }
        pVar.T(1618982084);
        boolean zS = pVar.s(tVar) | pVar.s(dVar) | pVar.s(m0Var);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new yh.p<s1.e, s1.b, int[]>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @dl.d
                public final int[] a(@dl.d s1.e eVar, long j10) {
                    f0.p(eVar, "$this$null");
                    if (!(s1.b.p(j10) != Integer.MAX_VALUE)) {
                        throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.".toString());
                    }
                    m0 m0Var2 = m0Var;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    List<Integer> listA = tVar.a(eVar, s1.b.p(j10) - eVar.e1(s1.h.g(PaddingKt.i(m0Var2, layoutDirection) + PaddingKt.h(m0Var, layoutDirection))), eVar.e1(dVar.getSpacing()));
                    int size = listA.size();
                    int[] iArr = new int[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        iArr[i11] = listA.get(i11).intValue();
                    }
                    int size2 = listA.size();
                    for (int i12 = 1; i12 < size2; i12++) {
                        iArr[i12] = iArr[i12] + iArr[i12 - 1];
                    }
                    return iArr;
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ int[] invoke(s1.e eVar, s1.b bVar) {
                    return a(eVar, bVar.getF139216a());
                }
            };
            pVar.N(objU);
        }
        pVar.c0();
        yh.p<s1.e, s1.b, int[]> pVar2 = (yh.p) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return pVar2;
    }

    @androidx.compose.runtime.h
    private static final yh.p<s1.e, s1.b, int[]> l(final t tVar, final Arrangement.l lVar, final m0 m0Var, androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1665208491);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1665208491, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowHeightSums (LazyStaggeredGridDsl.kt:165)");
        }
        pVar.T(1618982084);
        boolean zS = pVar.s(tVar) | pVar.s(lVar) | pVar.s(m0Var);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new yh.p<s1.e, s1.b, int[]>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @dl.d
                public final int[] a(@dl.d s1.e eVar, long j10) {
                    f0.p(eVar, "$this$null");
                    if (!(s1.b.o(j10) != Integer.MAX_VALUE)) {
                        throw new IllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.".toString());
                    }
                    List<Integer> listA = tVar.a(eVar, s1.b.o(j10) - eVar.e1(s1.h.g(m0Var.getTop() + m0Var.getBottom())), eVar.e1(lVar.a()));
                    int size = listA.size();
                    int[] iArr = new int[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        iArr[i11] = listA.get(i11).intValue();
                    }
                    int size2 = listA.size();
                    for (int i12 = 1; i12 < size2; i12++) {
                        iArr[i12] = iArr[i12] + iArr[i12 - 1];
                    }
                    return iArr;
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ int[] invoke(s1.e eVar, s1.b bVar) {
                    return a(eVar, bVar.getF139216a());
                }
            };
            pVar.N(objU);
        }
        pVar.c0();
        yh.p<s1.e, s1.b, int[]> pVar2 = (yh.p) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return pVar2;
    }
}
