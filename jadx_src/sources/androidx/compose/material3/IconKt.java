package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.r;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Icon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a;\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u0019\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/c;", "imageVector", "", "contentDescription", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/graphics/l0;", "tint", "Lkotlin/b2;", ak.aF, "(Landroidx/compose/ui/graphics/vector/c;Ljava/lang/String;Landroidx/compose/ui/n;JLandroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/graphics/y0;", "bitmap", ak.av, "(Landroidx/compose/ui/graphics/y0;Ljava/lang/String;Landroidx/compose/ui/n;JLandroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "b", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/n;JLandroidx/compose/runtime/p;II)V", "d", "Lb1/m;", "", "e", "(J)Z", "Landroidx/compose/ui/n;", "DefaultIconSizeModifier", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class IconKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.n f9650a = SizeKt.C(androidx.compose.ui.n.INSTANCE, t0.z.f140615a.b());

    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final androidx.compose.ui.graphics.y0 bitmap, @dl.e final String str, @dl.e androidx.compose.ui.n nVar, long j10, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        long jM;
        int i12;
        kotlin.jvm.internal.f0.p(bitmap, "bitmap");
        androidx.compose.runtime.p pVarF = pVar.F(-1092052280);
        androidx.compose.ui.n nVar2 = (i11 & 4) != 0 ? androidx.compose.ui.n.INSTANCE : nVar;
        if ((i11 & 8) != 0) {
            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
            i12 = i10 & (-7169);
        } else {
            jM = j10;
            i12 = i10;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1092052280, i12, -1, "androidx.compose.material3.Icon (Icon.kt:85)");
        }
        pVarF.T(1157296644);
        boolean zS = pVarF.s(bitmap);
        Object objU = pVarF.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            BitmapPainter bitmapPainter = new BitmapPainter(bitmap, 0L, 0L, 6, null);
            pVarF.N(bitmapPainter);
            objU = bitmapPainter;
        }
        pVarF.c0();
        b((BitmapPainter) objU, str, nVar2, jM, pVarF, (i12 & 112) | 8 | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc), 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar3 = nVar2;
        final long j11 = jM;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.IconKt$Icon$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i13) {
                IconKt.a(bitmap, str, nVar3, j11, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final Painter painter, @dl.e final String str, @dl.e androidx.compose.ui.n nVar, long j10, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        long jM;
        int i12;
        androidx.compose.ui.n nVarC;
        kotlin.jvm.internal.f0.p(painter, "painter");
        androidx.compose.runtime.p pVarF = pVar.F(-2142239481);
        androidx.compose.ui.n nVar2 = (i11 & 4) != 0 ? androidx.compose.ui.n.INSTANCE : nVar;
        if ((i11 & 8) != 0) {
            i12 = i10 & (-7169);
            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
        } else {
            jM = j10;
            i12 = i10;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(-2142239481, i12, -1, "androidx.compose.material3.Icon (Icon.kt:116)");
        }
        androidx.compose.ui.graphics.m0 m0VarD = androidx.compose.ui.graphics.l0.y(jM, androidx.compose.ui.graphics.l0.INSTANCE.u()) ? null : androidx.compose.ui.graphics.m0.Companion.d(androidx.compose.ui.graphics.m0.INSTANCE, jM, 0, 2, null);
        pVarF.T(69355216);
        if (str != null) {
            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
            pVarF.T(1157296644);
            boolean zS = pVarF.s(str);
            Object objU = pVarF.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.IconKt$Icon$semantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d r semantics) {
                        kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                        SemanticsPropertiesKt.e0(semantics, str);
                        SemanticsPropertiesKt.p0(semantics, androidx.compose.ui.semantics.g.INSTANCE.c());
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                        a(rVar);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU);
            }
            pVarF.c0();
            nVarC = SemanticsModifierKt.c(companion, false, (yh.l) objU, 1, null);
        } else {
            nVarC = androidx.compose.ui.n.INSTANCE;
        }
        pVarF.c0();
        final long j11 = jM;
        BoxKt.a(PainterModifierKt.b(d(GraphicsLayerModifierKt.h(nVar2), painter), painter, false, null, androidx.compose.ui.layout.c.INSTANCE.i(), 0.0f, m0VarD, 22, null).s0(nVarC), pVarF, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar3 = nVar2;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.IconKt$Icon$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i13) {
                IconKt.b(painter, str, nVar3, j11, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4 A[PHI: r3 r5
  0x00c4: PHI (r3v18 int) = (r3v13 int), (r3v19 int) binds: [B:65:0x00b0, B:60:0x00a6] A[DONT_GENERATE, DONT_INLINE]
  0x00c4: PHI (r5v9 androidx.compose.ui.n) = (r5v6 androidx.compose.ui.n), (r5v11 androidx.compose.ui.n) binds: [B:65:0x00b0, B:60:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void c(@dl.d final androidx.compose.ui.graphics.vector.c imageVector, @dl.e final String str, @dl.e androidx.compose.ui.n nVar, long j10, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.ui.n nVar2;
        int i14;
        long j11;
        androidx.compose.ui.n nVar3;
        long jM;
        final androidx.compose.ui.n nVar4;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(imageVector, "imageVector");
        androidx.compose.runtime.p pVarF = pVar.F(-126890956);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(imageVector) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 112) == 0) {
                i12 |= pVarF.s(str) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.b.f30796me) == 0) {
                    nVar2 = nVar;
                    if (pVarF.s(nVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    if ((i11 & 8) == 0) {
                        j11 = j10;
                        int i15 = pVarF.z(j11) ? 2048 : 1024;
                        i12 |= i15;
                    } else {
                        j11 = j10;
                    }
                    i12 |= i15;
                } else {
                    j11 = j10;
                }
                if ((i12 & bb.c.f.br) == 1170 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i13 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:55)");
                        }
                        b(VectorPainterKt.c(imageVector, pVarF, i12 & 14), str, nVar3, jM, pVarF, VectorPainter.f14106n | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        j11 = jM;
                    } else {
                        pVarF.l();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        nVar3 = nVar2;
                    }
                    jM = j11;
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:55)");
                    }
                    b(VectorPainterKt.c(imageVector, pVarF, i12 & 14), str, nVar3, jM, pVarF, VectorPainter.f14106n | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    j11 = jM;
                } else {
                    pVarF.l();
                    nVar4 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final long j12 = j11;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.IconKt$Icon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                        IconKt.c(imageVector, str, nVar4, j12, pVar2, i10 | 1, i11);
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
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if ((i11 & 8) == 0) {
                    j11 = j10;
                    if (pVarF.z(j11)) {
                    }
                    i12 |= i15;
                } else {
                    j11 = j10;
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            if ((i12 & bb.c.f.br) == 1170) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    } else {
                        jM = j11;
                    }
                } else {
                    if (i13 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    } else {
                        jM = j11;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:55)");
                }
                b(VectorPainterKt.c(imageVector, pVarF, i12 & 14), str, nVar3, jM, pVarF, VectorPainter.f14106n | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                j11 = jM;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    } else {
                        jM = j11;
                    }
                } else {
                    if (i13 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    } else {
                        jM = j11;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:55)");
                }
                b(VectorPainterKt.c(imageVector, pVarF, i12 & 14), str, nVar3, jM, pVarF, VectorPainter.f14106n | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                j11 = jM;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final long j13 = j11;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.IconKt$Icon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                    IconKt.c(imageVector, str, nVar4, j13, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                nVar2 = nVar;
                if (pVarF.s(nVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if ((i11 & 8) == 0) {
                    j11 = j10;
                    if (pVarF.z(j11)) {
                    }
                    i12 |= i15;
                } else {
                    j11 = j10;
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            if ((i12 & bb.c.f.br) == 1170) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    } else {
                        jM = j11;
                    }
                } else {
                    if (i13 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    } else {
                        jM = j11;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:55)");
                }
                b(VectorPainterKt.c(imageVector, pVarF, i12 & 14), str, nVar3, jM, pVarF, VectorPainter.f14106n | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                j11 = jM;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    } else {
                        jM = j11;
                    }
                } else {
                    if (i13 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    } else {
                        jM = j11;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:55)");
                }
                b(VectorPainterKt.c(imageVector, pVarF, i12 & 14), str, nVar3, jM, pVarF, VectorPainter.f14106n | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                j11 = jM;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final long j14 = j11;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.IconKt$Icon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                    IconKt.c(imageVector, str, nVar4, j14, pVar2, i10 | 1, i11);
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
        if ((i10 & bb.c.g.f32954lc) == 0) {
            if ((i11 & 8) == 0) {
                j11 = j10;
                if (pVarF.z(j11)) {
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            i12 |= i15;
        } else {
            j11 = j10;
        }
        if ((i12 & bb.c.f.br) == 1170) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                } else {
                    jM = j11;
                }
            } else {
                if (i13 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                } else {
                    jM = j11;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:55)");
            }
            b(VectorPainterKt.c(imageVector, pVarF, i12 & 14), str, nVar3, jM, pVarF, VectorPainter.f14106n | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            j11 = jM;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                } else {
                    jM = j11;
                }
            } else {
                if (i13 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                } else {
                    jM = j11;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:55)");
            }
            b(VectorPainterKt.c(imageVector, pVarF, i12 & 14), str, nVar3, jM, pVarF, VectorPainter.f14106n | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            j11 = jM;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final long j15 = j11;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.IconKt$Icon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                IconKt.c(imageVector, str, nVar4, j15, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    private static final androidx.compose.ui.n d(androidx.compose.ui.n nVar, Painter painter) {
        return nVar.s0((b1.m.k(painter.getIntrinsicSize(), b1.m.f30386b.a()) || e(painter.getIntrinsicSize())) ? f9650a : androidx.compose.ui.n.INSTANCE);
    }

    private static final boolean e(long j10) {
        return Float.isInfinite(b1.m.t(j10)) && Float.isInfinite(b1.m.m(j10));
    }
}
