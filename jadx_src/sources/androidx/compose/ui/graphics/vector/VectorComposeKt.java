package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.u1;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.n1;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VectorCompose.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0087\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a©\u0001\u0010%\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"", "name", "", androidx.constraintlayout.motion.widget.f.f18721i, "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/f;", "clipPathData", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Landroidx/compose/ui/graphics/vector/l;", "content", ak.av, "(Ljava/lang/String;FFFFFFFLjava/util/List;Lyh/p;Landroidx/compose/runtime/p;II)V", "pathData", "Landroidx/compose/ui/graphics/n1;", "pathFillType", "Landroidx/compose/ui/graphics/a0;", "fill", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/j2;", "strokeLineCap", "Landroidx/compose/ui/graphics/k2;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "b", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/a0;FLandroidx/compose/ui/graphics/a0;FFIIFFFFLandroidx/compose/runtime/p;III)V", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class VectorComposeKt {
    /* JADX WARN: Code duplicated, block: B:101:0x012a  */
    /* JADX WARN: Code duplicated, block: B:107:0x014f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0159  */
    /* JADX WARN: Code duplicated, block: B:116:0x0172 A[PHI: r2 r4 r5 r6 r7 r9 r13 r14 r15
  0x0172: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
  0x0172: PHI (r4v26 int) = (r4v22 int), (r4v27 int) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
  0x0172: PHI (r5v5 float) = (r5v2 float), (r5v6 float) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
  0x0172: PHI (r6v15 float) = (r6v11 float), (r6v17 float) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
  0x0172: PHI (r7v10 float) = (r7v6 float), (r7v11 float) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
  0x0172: PHI (r9v7 float) = (r9v3 float), (r9v2 float) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
  0x0172: PHI (r13v9 float) = (r13v6 float), (r13v10 float) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
  0x0172: PHI (r14v6 float) = (r14v3 float), (r14v2 float) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
  0x0172: PHI (r15v9 float) = (r15v6 float), (r15v10 float) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0177  */
    /* JADX WARN: Code duplicated, block: B:119:0x017a  */
    /* JADX WARN: Code duplicated, block: B:122:0x017f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0181  */
    /* JADX WARN: Code duplicated, block: B:125:0x0185  */
    /* JADX WARN: Code duplicated, block: B:127:0x0188  */
    /* JADX WARN: Code duplicated, block: B:130:0x018d  */
    /* JADX WARN: Code duplicated, block: B:131:0x018f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0194  */
    /* JADX WARN: Code duplicated, block: B:136:0x0198  */
    /* JADX WARN: Code duplicated, block: B:137:0x019a  */
    /* JADX WARN: Code duplicated, block: B:140:0x019f  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:152:0x01da  */
    /* JADX WARN: Code duplicated, block: B:155:0x024a  */
    /* JADX WARN: Code duplicated, block: B:160:0x025a  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x0123  */
    @l
    @androidx.compose.runtime.h
    public static final void a(@dl.e String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, @dl.e List<? extends f> list, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        int i13;
        float f17;
        int i14;
        int i15;
        float f18;
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
        String str2;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        List<? extends f> listH;
        VectorComposeKt$Group$1 vectorComposeKt$Group$1;
        final float f24;
        final float f25;
        final float f26;
        final float f27;
        final float f28;
        final List<? extends f> list2;
        u1 u1VarH;
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-213417674);
        int i27 = i11 & 1;
        if (i27 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i28 = i11 & 2;
        if (i28 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= pVarF.w(f10) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.b.f30796me) == 0) {
                    f17 = f11;
                    if (pVarF.w(f17)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & bb.c.g.f32954lc) == 0) {
                        f18 = f12;
                        if (pVarF.w(f18)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        i12 |= 24576;
                    } else if ((i10 & 57344) == 0) {
                        if (pVarF.w(f13)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= androidx.profileinstaller.o.c.f26824k;
                    } else if ((i10 & 458752) == 0) {
                        if (pVarF.w(f14)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (pVarF.w(f15)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    i23 = i11 & 128;
                    if (i23 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (pVarF.w(f16)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i12 |= i24;
                    }
                    i25 = i11 & 256;
                    if (i25 != 0) {
                        i12 |= 33554432;
                    }
                    if ((i11 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (pVarF.s(content)) {
                                i26 = 536870912;
                            } else {
                                i26 = 268435456;
                            }
                        }
                        if (i25 != 256 && (1533916891 & i12) == 306783378 && pVarF.b()) {
                            pVarF.l();
                            str2 = str;
                            f19 = f10;
                            f20 = f13;
                            f25 = f14;
                            f28 = f15;
                            f24 = f16;
                            f26 = f17;
                            f27 = f18;
                            list2 = list;
                        } else {
                            pVarF.W();
                            if ((i10 & 1) != 0 || pVarF.o()) {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i13 != 0) {
                                    f17 = 0.0f;
                                }
                                if (i15 != 0) {
                                    f18 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f20 = 1.0f;
                                } else {
                                    f20 = f13;
                                }
                                f21 = i19 == 0 ? f14 : 1.0f;
                                if (i21 != 0) {
                                    f22 = 0.0f;
                                } else {
                                    f22 = f15;
                                }
                                f23 = i23 == 0 ? f16 : 0.0f;
                                if (i25 != 0) {
                                    listH = p.h();
                                    i12 &= -234881025;
                                }
                                pVarF.O();
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                                }
                                vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                    @Override // yh.a
                                    @dl.d
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final b invoke() {
                                        return new b();
                                    }
                                };
                                pVarF.T(-548224868);
                                if (!(pVarF.G() instanceof k)) {
                                    ComposablesKt.n();
                                }
                                pVarF.J();
                                if (pVarF.D()) {
                                    pVarF.L(vectorComposeKt$Group$1);
                                } else {
                                    pVarF.d();
                                }
                                androidx.compose.runtime.p pVarB = Updater.b(pVarF);
                                Updater.j(pVarB, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                    public final void a(@dl.d b set, @dl.d String it) {
                                        f0.p(set, "$this$set");
                                        f0.p(it, "it");
                                        set.t(it);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str3) {
                                        a(bVar, str3);
                                        return b2.f124493a;
                                    }
                                });
                                Updater.j(pVarB, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                    public final void a(@dl.d b set, float f29) {
                                        f0.p(set, "$this$set");
                                        set.w(f29);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f29) {
                                        a(bVar, f29.floatValue());
                                        return b2.f124493a;
                                    }
                                });
                                Updater.j(pVarB, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                    public final void a(@dl.d b set, float f29) {
                                        f0.p(set, "$this$set");
                                        set.u(f29);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f29) {
                                        a(bVar, f29.floatValue());
                                        return b2.f124493a;
                                    }
                                });
                                Updater.j(pVarB, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                    public final void a(@dl.d b set, float f29) {
                                        f0.p(set, "$this$set");
                                        set.v(f29);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f29) {
                                        a(bVar, f29.floatValue());
                                        return b2.f124493a;
                                    }
                                });
                                Updater.j(pVarB, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                    public final void a(@dl.d b set, float f29) {
                                        f0.p(set, "$this$set");
                                        set.x(f29);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f29) {
                                        a(bVar, f29.floatValue());
                                        return b2.f124493a;
                                    }
                                });
                                Updater.j(pVarB, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                    public final void a(@dl.d b set, float f29) {
                                        f0.p(set, "$this$set");
                                        set.y(f29);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f29) {
                                        a(bVar, f29.floatValue());
                                        return b2.f124493a;
                                    }
                                });
                                Updater.j(pVarB, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                    public final void a(@dl.d b set, float f29) {
                                        f0.p(set, "$this$set");
                                        set.z(f29);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f29) {
                                        a(bVar, f29.floatValue());
                                        return b2.f124493a;
                                    }
                                });
                                Updater.j(pVarB, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                    public final void a(@dl.d b set, float f29) {
                                        f0.p(set, "$this$set");
                                        set.A(f29);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f29) {
                                        a(bVar, f29.floatValue());
                                        return b2.f124493a;
                                    }
                                });
                                Updater.j(pVarB, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                    public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                                        f0.p(set, "$this$set");
                                        f0.p(it, "it");
                                        set.s(it);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                                        a(bVar, list3);
                                        return b2.f124493a;
                                    }
                                });
                                pVarF.T(-983907633);
                                content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                                pVarF.c0();
                                pVarF.f();
                                pVarF.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                                f24 = f23;
                                f25 = f21;
                                f26 = f17;
                                f27 = f18;
                                f28 = f22;
                                list2 = listH;
                            } else {
                                pVarF.l();
                                if (i25 != 0) {
                                    i12 &= -234881025;
                                }
                                str2 = str;
                                f19 = f10;
                                f20 = f13;
                                f21 = f14;
                                f22 = f15;
                                f23 = f16;
                            }
                            listH = list;
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                            }
                            vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final b invoke() {
                                    return new b();
                                }
                            };
                            pVarF.T(-548224868);
                            if (!(pVarF.G() instanceof k)) {
                                ComposablesKt.n();
                            }
                            pVarF.J();
                            if (pVarF.D()) {
                                pVarF.L(vectorComposeKt$Group$1);
                            } else {
                                pVarF.d();
                            }
                            androidx.compose.runtime.p pVarB2 = Updater.b(pVarF);
                            Updater.j(pVarB2, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                public final void a(@dl.d b set, @dl.d String it) {
                                    f0.p(set, "$this$set");
                                    f0.p(it, "it");
                                    set.t(it);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str3) {
                                    a(bVar, str3);
                                    return b2.f124493a;
                                }
                            });
                            Updater.j(pVarB2, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                public final void a(@dl.d b set, float f29) {
                                    f0.p(set, "$this$set");
                                    set.w(f29);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f29) {
                                    a(bVar, f29.floatValue());
                                    return b2.f124493a;
                                }
                            });
                            Updater.j(pVarB2, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                public final void a(@dl.d b set, float f29) {
                                    f0.p(set, "$this$set");
                                    set.u(f29);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f29) {
                                    a(bVar, f29.floatValue());
                                    return b2.f124493a;
                                }
                            });
                            Updater.j(pVarB2, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                public final void a(@dl.d b set, float f29) {
                                    f0.p(set, "$this$set");
                                    set.v(f29);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f29) {
                                    a(bVar, f29.floatValue());
                                    return b2.f124493a;
                                }
                            });
                            Updater.j(pVarB2, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                public final void a(@dl.d b set, float f29) {
                                    f0.p(set, "$this$set");
                                    set.x(f29);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f29) {
                                    a(bVar, f29.floatValue());
                                    return b2.f124493a;
                                }
                            });
                            Updater.j(pVarB2, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                public final void a(@dl.d b set, float f29) {
                                    f0.p(set, "$this$set");
                                    set.y(f29);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f29) {
                                    a(bVar, f29.floatValue());
                                    return b2.f124493a;
                                }
                            });
                            Updater.j(pVarB2, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                public final void a(@dl.d b set, float f29) {
                                    f0.p(set, "$this$set");
                                    set.z(f29);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f29) {
                                    a(bVar, f29.floatValue());
                                    return b2.f124493a;
                                }
                            });
                            Updater.j(pVarB2, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                public final void a(@dl.d b set, float f29) {
                                    f0.p(set, "$this$set");
                                    set.A(f29);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f29) {
                                    a(bVar, f29.floatValue());
                                    return b2.f124493a;
                                }
                            });
                            Updater.j(pVarB2, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                                    f0.p(set, "$this$set");
                                    f0.p(it, "it");
                                    set.s(it);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                                    a(bVar, list3);
                                    return b2.f124493a;
                                }
                            });
                            pVarF.T(-983907633);
                            content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                            pVarF.c0();
                            pVarF.f();
                            pVarF.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            f24 = f23;
                            f25 = f21;
                            f26 = f17;
                            f27 = f18;
                            f28 = f22;
                            list2 = listH;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        final String str3 = str2;
                        final float f29 = f19;
                        final float f30 = f20;
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                                VectorComposeKt.a(str3, f29, f26, f27, f30, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i26 = com.google.android.exoplayer2.j.G;
                    i12 |= i26;
                    if (i25 != 256) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                        }
                        vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final b invoke() {
                                return new b();
                            }
                        };
                        pVarF.T(-548224868);
                        if (!(pVarF.G() instanceof k)) {
                            ComposablesKt.n();
                        }
                        pVarF.J();
                        if (pVarF.D()) {
                            pVarF.L(vectorComposeKt$Group$1);
                        } else {
                            pVarF.d();
                        }
                        androidx.compose.runtime.p pVarB3 = Updater.b(pVarF);
                        Updater.j(pVarB3, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            public final void a(@dl.d b set, @dl.d String it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.t(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str4) {
                                a(bVar, str4);
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB3, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            public final void a(@dl.d b set, float f210) {
                                f0.p(set, "$this$set");
                                set.w(f210);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f210) {
                                a(bVar, f210.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB3, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            public final void a(@dl.d b set, float f210) {
                                f0.p(set, "$this$set");
                                set.u(f210);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f210) {
                                a(bVar, f210.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB3, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            public final void a(@dl.d b set, float f210) {
                                f0.p(set, "$this$set");
                                set.v(f210);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f210) {
                                a(bVar, f210.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB3, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            public final void a(@dl.d b set, float f210) {
                                f0.p(set, "$this$set");
                                set.x(f210);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f210) {
                                a(bVar, f210.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB3, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            public final void a(@dl.d b set, float f210) {
                                f0.p(set, "$this$set");
                                set.y(f210);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f210) {
                                a(bVar, f210.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB3, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            public final void a(@dl.d b set, float f210) {
                                f0.p(set, "$this$set");
                                set.z(f210);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f210) {
                                a(bVar, f210.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB3, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            public final void a(@dl.d b set, float f210) {
                                f0.p(set, "$this$set");
                                set.A(f210);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f210) {
                                a(bVar, f210.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB3, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.s(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                                a(bVar, list3);
                                return b2.f124493a;
                            }
                        });
                        pVarF.T(-983907633);
                        content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        f24 = f23;
                        f25 = f21;
                        f26 = f17;
                        f27 = f18;
                        f28 = f22;
                        list2 = listH;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                        }
                        vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final b invoke() {
                                return new b();
                            }
                        };
                        pVarF.T(-548224868);
                        if (!(pVarF.G() instanceof k)) {
                            ComposablesKt.n();
                        }
                        pVarF.J();
                        if (pVarF.D()) {
                            pVarF.L(vectorComposeKt$Group$1);
                        } else {
                            pVarF.d();
                        }
                        androidx.compose.runtime.p pVarB4 = Updater.b(pVarF);
                        Updater.j(pVarB4, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            public final void a(@dl.d b set, @dl.d String it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.t(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str4) {
                                a(bVar, str4);
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB4, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            public final void a(@dl.d b set, float f210) {
                                f0.p(set, "$this$set");
                                set.w(f210);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f210) {
                                a(bVar, f210.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB4, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            public final void a(@dl.d b set, float f210) {
                                f0.p(set, "$this$set");
                                set.u(f210);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f210) {
                                a(bVar, f210.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB4, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            public final void a(@dl.d b set, float f210) {
                                f0.p(set, "$this$set");
                                set.v(f210);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f210) {
                                a(bVar, f210.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB4, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            public final void a(@dl.d b set, float f210) {
                                f0.p(set, "$this$set");
                                set.x(f210);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f210) {
                                a(bVar, f210.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB4, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            public final void a(@dl.d b set, float f210) {
                                f0.p(set, "$this$set");
                                set.y(f210);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f210) {
                                a(bVar, f210.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB4, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            public final void a(@dl.d b set, float f210) {
                                f0.p(set, "$this$set");
                                set.z(f210);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f210) {
                                a(bVar, f210.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB4, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            public final void a(@dl.d b set, float f210) {
                                f0.p(set, "$this$set");
                                set.A(f210);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f210) {
                                a(bVar, f210.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB4, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.s(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                                a(bVar, list3);
                                return b2.f124493a;
                            }
                        });
                        pVarF.T(-983907633);
                        content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        f24 = f23;
                        f25 = f21;
                        f26 = f17;
                        f27 = f18;
                        f28 = f22;
                        list2 = listH;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final String str4 = str2;
                    final float f210 = f19;
                    final float f31 = f20;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                            VectorComposeKt.a(str4, f210, f26, f27, f31, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= bb.c.d.f31193dj;
                f18 = f12;
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (pVarF.w(f13)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i10 & 458752) == 0) {
                    if (pVarF.w(f14)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (pVarF.w(f15)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & 128;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.w(f16)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                i25 = i11 & 256;
                if (i25 != 0) {
                    i12 |= 33554432;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (pVarF.s(content)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                    }
                    if (i25 != 256) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                        }
                        vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final b invoke() {
                                return new b();
                            }
                        };
                        pVarF.T(-548224868);
                        if (!(pVarF.G() instanceof k)) {
                            ComposablesKt.n();
                        }
                        pVarF.J();
                        if (pVarF.D()) {
                            pVarF.L(vectorComposeKt$Group$1);
                        } else {
                            pVarF.d();
                        }
                        androidx.compose.runtime.p pVarB5 = Updater.b(pVarF);
                        Updater.j(pVarB5, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            public final void a(@dl.d b set, @dl.d String it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.t(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str5) {
                                a(bVar, str5);
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB5, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            public final void a(@dl.d b set, float f211) {
                                f0.p(set, "$this$set");
                                set.w(f211);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f211) {
                                a(bVar, f211.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB5, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            public final void a(@dl.d b set, float f211) {
                                f0.p(set, "$this$set");
                                set.u(f211);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f211) {
                                a(bVar, f211.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB5, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            public final void a(@dl.d b set, float f211) {
                                f0.p(set, "$this$set");
                                set.v(f211);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f211) {
                                a(bVar, f211.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB5, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            public final void a(@dl.d b set, float f211) {
                                f0.p(set, "$this$set");
                                set.x(f211);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f211) {
                                a(bVar, f211.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB5, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            public final void a(@dl.d b set, float f211) {
                                f0.p(set, "$this$set");
                                set.y(f211);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f211) {
                                a(bVar, f211.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB5, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            public final void a(@dl.d b set, float f211) {
                                f0.p(set, "$this$set");
                                set.z(f211);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f211) {
                                a(bVar, f211.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB5, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            public final void a(@dl.d b set, float f211) {
                                f0.p(set, "$this$set");
                                set.A(f211);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f211) {
                                a(bVar, f211.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB5, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.s(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                                a(bVar, list3);
                                return b2.f124493a;
                            }
                        });
                        pVarF.T(-983907633);
                        content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        f24 = f23;
                        f25 = f21;
                        f26 = f17;
                        f27 = f18;
                        f28 = f22;
                        list2 = listH;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                        }
                        vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final b invoke() {
                                return new b();
                            }
                        };
                        pVarF.T(-548224868);
                        if (!(pVarF.G() instanceof k)) {
                            ComposablesKt.n();
                        }
                        pVarF.J();
                        if (pVarF.D()) {
                            pVarF.L(vectorComposeKt$Group$1);
                        } else {
                            pVarF.d();
                        }
                        androidx.compose.runtime.p pVarB6 = Updater.b(pVarF);
                        Updater.j(pVarB6, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            public final void a(@dl.d b set, @dl.d String it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.t(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str5) {
                                a(bVar, str5);
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB6, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            public final void a(@dl.d b set, float f211) {
                                f0.p(set, "$this$set");
                                set.w(f211);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f211) {
                                a(bVar, f211.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB6, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            public final void a(@dl.d b set, float f211) {
                                f0.p(set, "$this$set");
                                set.u(f211);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f211) {
                                a(bVar, f211.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB6, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            public final void a(@dl.d b set, float f211) {
                                f0.p(set, "$this$set");
                                set.v(f211);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f211) {
                                a(bVar, f211.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB6, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            public final void a(@dl.d b set, float f211) {
                                f0.p(set, "$this$set");
                                set.x(f211);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f211) {
                                a(bVar, f211.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB6, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            public final void a(@dl.d b set, float f211) {
                                f0.p(set, "$this$set");
                                set.y(f211);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f211) {
                                a(bVar, f211.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB6, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            public final void a(@dl.d b set, float f211) {
                                f0.p(set, "$this$set");
                                set.z(f211);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f211) {
                                a(bVar, f211.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB6, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            public final void a(@dl.d b set, float f211) {
                                f0.p(set, "$this$set");
                                set.A(f211);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f211) {
                                a(bVar, f211.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB6, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.s(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                                a(bVar, list3);
                                return b2.f124493a;
                            }
                        });
                        pVarF.T(-983907633);
                        content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        f24 = f23;
                        f25 = f21;
                        f26 = f17;
                        f27 = f18;
                        f28 = f22;
                        list2 = listH;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final String str5 = str2;
                    final float f211 = f19;
                    final float f32 = f20;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                            VectorComposeKt.a(str5, f211, f26, f27, f32, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i26 = com.google.android.exoplayer2.j.G;
                i12 |= i26;
                if (i25 != 256) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                    }
                    vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b invoke() {
                            return new b();
                        }
                    };
                    pVarF.T(-548224868);
                    if (!(pVarF.G() instanceof k)) {
                        ComposablesKt.n();
                    }
                    pVarF.J();
                    if (pVarF.D()) {
                        pVarF.L(vectorComposeKt$Group$1);
                    } else {
                        pVarF.d();
                    }
                    androidx.compose.runtime.p pVarB7 = Updater.b(pVarF);
                    Updater.j(pVarB7, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        public final void a(@dl.d b set, @dl.d String it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.t(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str6) {
                            a(bVar, str6);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB7, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        public final void a(@dl.d b set, float f212) {
                            f0.p(set, "$this$set");
                            set.w(f212);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f212) {
                            a(bVar, f212.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB7, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        public final void a(@dl.d b set, float f212) {
                            f0.p(set, "$this$set");
                            set.u(f212);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f212) {
                            a(bVar, f212.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB7, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        public final void a(@dl.d b set, float f212) {
                            f0.p(set, "$this$set");
                            set.v(f212);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f212) {
                            a(bVar, f212.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB7, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        public final void a(@dl.d b set, float f212) {
                            f0.p(set, "$this$set");
                            set.x(f212);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f212) {
                            a(bVar, f212.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB7, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        public final void a(@dl.d b set, float f212) {
                            f0.p(set, "$this$set");
                            set.y(f212);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f212) {
                            a(bVar, f212.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB7, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        public final void a(@dl.d b set, float f212) {
                            f0.p(set, "$this$set");
                            set.z(f212);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f212) {
                            a(bVar, f212.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB7, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        public final void a(@dl.d b set, float f212) {
                            f0.p(set, "$this$set");
                            set.A(f212);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f212) {
                            a(bVar, f212.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB7, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.s(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                            a(bVar, list3);
                            return b2.f124493a;
                        }
                    });
                    pVarF.T(-983907633);
                    content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    f24 = f23;
                    f25 = f21;
                    f26 = f17;
                    f27 = f18;
                    f28 = f22;
                    list2 = listH;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                    }
                    vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b invoke() {
                            return new b();
                        }
                    };
                    pVarF.T(-548224868);
                    if (!(pVarF.G() instanceof k)) {
                        ComposablesKt.n();
                    }
                    pVarF.J();
                    if (pVarF.D()) {
                        pVarF.L(vectorComposeKt$Group$1);
                    } else {
                        pVarF.d();
                    }
                    androidx.compose.runtime.p pVarB8 = Updater.b(pVarF);
                    Updater.j(pVarB8, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        public final void a(@dl.d b set, @dl.d String it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.t(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str6) {
                            a(bVar, str6);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB8, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        public final void a(@dl.d b set, float f212) {
                            f0.p(set, "$this$set");
                            set.w(f212);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f212) {
                            a(bVar, f212.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB8, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        public final void a(@dl.d b set, float f212) {
                            f0.p(set, "$this$set");
                            set.u(f212);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f212) {
                            a(bVar, f212.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB8, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        public final void a(@dl.d b set, float f212) {
                            f0.p(set, "$this$set");
                            set.v(f212);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f212) {
                            a(bVar, f212.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB8, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        public final void a(@dl.d b set, float f212) {
                            f0.p(set, "$this$set");
                            set.x(f212);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f212) {
                            a(bVar, f212.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB8, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        public final void a(@dl.d b set, float f212) {
                            f0.p(set, "$this$set");
                            set.y(f212);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f212) {
                            a(bVar, f212.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB8, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        public final void a(@dl.d b set, float f212) {
                            f0.p(set, "$this$set");
                            set.z(f212);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f212) {
                            a(bVar, f212.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB8, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        public final void a(@dl.d b set, float f212) {
                            f0.p(set, "$this$set");
                            set.A(f212);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f212) {
                            a(bVar, f212.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB8, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.s(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                            a(bVar, list3);
                            return b2.f124493a;
                        }
                    });
                    pVarF.T(-983907633);
                    content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    f24 = f23;
                    f25 = f21;
                    f26 = f17;
                    f27 = f18;
                    f28 = f22;
                    list2 = listH;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final String str6 = str2;
                final float f212 = f19;
                final float f33 = f20;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                        VectorComposeKt.a(str6, f212, f26, f27, f33, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.b.f30966u4;
            f17 = f11;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    f18 = f12;
                    if (pVarF.w(f18)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (pVarF.w(f13)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i10 & 458752) == 0) {
                    if (pVarF.w(f14)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (pVarF.w(f15)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & 128;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.w(f16)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                i25 = i11 & 256;
                if (i25 != 0) {
                    i12 |= 33554432;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (pVarF.s(content)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                    }
                    if (i25 != 256) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                        }
                        vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final b invoke() {
                                return new b();
                            }
                        };
                        pVarF.T(-548224868);
                        if (!(pVarF.G() instanceof k)) {
                            ComposablesKt.n();
                        }
                        pVarF.J();
                        if (pVarF.D()) {
                            pVarF.L(vectorComposeKt$Group$1);
                        } else {
                            pVarF.d();
                        }
                        androidx.compose.runtime.p pVarB9 = Updater.b(pVarF);
                        Updater.j(pVarB9, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            public final void a(@dl.d b set, @dl.d String it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.t(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str7) {
                                a(bVar, str7);
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB9, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            public final void a(@dl.d b set, float f213) {
                                f0.p(set, "$this$set");
                                set.w(f213);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f213) {
                                a(bVar, f213.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB9, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            public final void a(@dl.d b set, float f213) {
                                f0.p(set, "$this$set");
                                set.u(f213);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f213) {
                                a(bVar, f213.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB9, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            public final void a(@dl.d b set, float f213) {
                                f0.p(set, "$this$set");
                                set.v(f213);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f213) {
                                a(bVar, f213.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB9, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            public final void a(@dl.d b set, float f213) {
                                f0.p(set, "$this$set");
                                set.x(f213);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f213) {
                                a(bVar, f213.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB9, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            public final void a(@dl.d b set, float f213) {
                                f0.p(set, "$this$set");
                                set.y(f213);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f213) {
                                a(bVar, f213.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB9, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            public final void a(@dl.d b set, float f213) {
                                f0.p(set, "$this$set");
                                set.z(f213);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f213) {
                                a(bVar, f213.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB9, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            public final void a(@dl.d b set, float f213) {
                                f0.p(set, "$this$set");
                                set.A(f213);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f213) {
                                a(bVar, f213.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB9, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.s(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                                a(bVar, list3);
                                return b2.f124493a;
                            }
                        });
                        pVarF.T(-983907633);
                        content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        f24 = f23;
                        f25 = f21;
                        f26 = f17;
                        f27 = f18;
                        f28 = f22;
                        list2 = listH;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                        }
                        vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final b invoke() {
                                return new b();
                            }
                        };
                        pVarF.T(-548224868);
                        if (!(pVarF.G() instanceof k)) {
                            ComposablesKt.n();
                        }
                        pVarF.J();
                        if (pVarF.D()) {
                            pVarF.L(vectorComposeKt$Group$1);
                        } else {
                            pVarF.d();
                        }
                        androidx.compose.runtime.p pVarB10 = Updater.b(pVarF);
                        Updater.j(pVarB10, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            public final void a(@dl.d b set, @dl.d String it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.t(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str7) {
                                a(bVar, str7);
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB10, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            public final void a(@dl.d b set, float f213) {
                                f0.p(set, "$this$set");
                                set.w(f213);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f213) {
                                a(bVar, f213.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB10, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            public final void a(@dl.d b set, float f213) {
                                f0.p(set, "$this$set");
                                set.u(f213);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f213) {
                                a(bVar, f213.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB10, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            public final void a(@dl.d b set, float f213) {
                                f0.p(set, "$this$set");
                                set.v(f213);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f213) {
                                a(bVar, f213.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB10, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            public final void a(@dl.d b set, float f213) {
                                f0.p(set, "$this$set");
                                set.x(f213);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f213) {
                                a(bVar, f213.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB10, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            public final void a(@dl.d b set, float f213) {
                                f0.p(set, "$this$set");
                                set.y(f213);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f213) {
                                a(bVar, f213.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB10, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            public final void a(@dl.d b set, float f213) {
                                f0.p(set, "$this$set");
                                set.z(f213);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f213) {
                                a(bVar, f213.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB10, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            public final void a(@dl.d b set, float f213) {
                                f0.p(set, "$this$set");
                                set.A(f213);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f213) {
                                a(bVar, f213.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB10, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.s(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                                a(bVar, list3);
                                return b2.f124493a;
                            }
                        });
                        pVarF.T(-983907633);
                        content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        f24 = f23;
                        f25 = f21;
                        f26 = f17;
                        f27 = f18;
                        f28 = f22;
                        list2 = listH;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final String str7 = str2;
                    final float f213 = f19;
                    final float f34 = f20;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                            VectorComposeKt.a(str7, f213, f26, f27, f34, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i26 = com.google.android.exoplayer2.j.G;
                i12 |= i26;
                if (i25 != 256) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                    }
                    vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b invoke() {
                            return new b();
                        }
                    };
                    pVarF.T(-548224868);
                    if (!(pVarF.G() instanceof k)) {
                        ComposablesKt.n();
                    }
                    pVarF.J();
                    if (pVarF.D()) {
                        pVarF.L(vectorComposeKt$Group$1);
                    } else {
                        pVarF.d();
                    }
                    androidx.compose.runtime.p pVarB11 = Updater.b(pVarF);
                    Updater.j(pVarB11, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        public final void a(@dl.d b set, @dl.d String it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.t(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str8) {
                            a(bVar, str8);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB11, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        public final void a(@dl.d b set, float f214) {
                            f0.p(set, "$this$set");
                            set.w(f214);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f214) {
                            a(bVar, f214.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB11, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        public final void a(@dl.d b set, float f214) {
                            f0.p(set, "$this$set");
                            set.u(f214);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f214) {
                            a(bVar, f214.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB11, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        public final void a(@dl.d b set, float f214) {
                            f0.p(set, "$this$set");
                            set.v(f214);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f214) {
                            a(bVar, f214.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB11, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        public final void a(@dl.d b set, float f214) {
                            f0.p(set, "$this$set");
                            set.x(f214);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f214) {
                            a(bVar, f214.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB11, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        public final void a(@dl.d b set, float f214) {
                            f0.p(set, "$this$set");
                            set.y(f214);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f214) {
                            a(bVar, f214.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB11, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        public final void a(@dl.d b set, float f214) {
                            f0.p(set, "$this$set");
                            set.z(f214);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f214) {
                            a(bVar, f214.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB11, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        public final void a(@dl.d b set, float f214) {
                            f0.p(set, "$this$set");
                            set.A(f214);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f214) {
                            a(bVar, f214.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB11, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.s(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                            a(bVar, list3);
                            return b2.f124493a;
                        }
                    });
                    pVarF.T(-983907633);
                    content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    f24 = f23;
                    f25 = f21;
                    f26 = f17;
                    f27 = f18;
                    f28 = f22;
                    list2 = listH;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                    }
                    vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b invoke() {
                            return new b();
                        }
                    };
                    pVarF.T(-548224868);
                    if (!(pVarF.G() instanceof k)) {
                        ComposablesKt.n();
                    }
                    pVarF.J();
                    if (pVarF.D()) {
                        pVarF.L(vectorComposeKt$Group$1);
                    } else {
                        pVarF.d();
                    }
                    androidx.compose.runtime.p pVarB12 = Updater.b(pVarF);
                    Updater.j(pVarB12, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        public final void a(@dl.d b set, @dl.d String it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.t(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str8) {
                            a(bVar, str8);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB12, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        public final void a(@dl.d b set, float f214) {
                            f0.p(set, "$this$set");
                            set.w(f214);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f214) {
                            a(bVar, f214.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB12, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        public final void a(@dl.d b set, float f214) {
                            f0.p(set, "$this$set");
                            set.u(f214);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f214) {
                            a(bVar, f214.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB12, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        public final void a(@dl.d b set, float f214) {
                            f0.p(set, "$this$set");
                            set.v(f214);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f214) {
                            a(bVar, f214.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB12, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        public final void a(@dl.d b set, float f214) {
                            f0.p(set, "$this$set");
                            set.x(f214);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f214) {
                            a(bVar, f214.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB12, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        public final void a(@dl.d b set, float f214) {
                            f0.p(set, "$this$set");
                            set.y(f214);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f214) {
                            a(bVar, f214.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB12, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        public final void a(@dl.d b set, float f214) {
                            f0.p(set, "$this$set");
                            set.z(f214);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f214) {
                            a(bVar, f214.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB12, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        public final void a(@dl.d b set, float f214) {
                            f0.p(set, "$this$set");
                            set.A(f214);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f214) {
                            a(bVar, f214.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB12, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.s(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                            a(bVar, list3);
                            return b2.f124493a;
                        }
                    });
                    pVarF.T(-983907633);
                    content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    f24 = f23;
                    f25 = f21;
                    f26 = f17;
                    f27 = f18;
                    f28 = f22;
                    list2 = listH;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final String str8 = str2;
                final float f214 = f19;
                final float f35 = f20;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                        VectorComposeKt.a(str8, f214, f26, f27, f35, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            f18 = f12;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (pVarF.w(f13)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i10 & 458752) == 0) {
                if (pVarF.w(f14)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (pVarF.w(f15)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i23 = i11 & 128;
            if (i23 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.w(f16)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            i25 = i11 & 256;
            if (i25 != 0) {
                i12 |= 33554432;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                }
                if (i25 != 256) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                    }
                    vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b invoke() {
                            return new b();
                        }
                    };
                    pVarF.T(-548224868);
                    if (!(pVarF.G() instanceof k)) {
                        ComposablesKt.n();
                    }
                    pVarF.J();
                    if (pVarF.D()) {
                        pVarF.L(vectorComposeKt$Group$1);
                    } else {
                        pVarF.d();
                    }
                    androidx.compose.runtime.p pVarB13 = Updater.b(pVarF);
                    Updater.j(pVarB13, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        public final void a(@dl.d b set, @dl.d String it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.t(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str9) {
                            a(bVar, str9);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB13, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        public final void a(@dl.d b set, float f215) {
                            f0.p(set, "$this$set");
                            set.w(f215);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f215) {
                            a(bVar, f215.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB13, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        public final void a(@dl.d b set, float f215) {
                            f0.p(set, "$this$set");
                            set.u(f215);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f215) {
                            a(bVar, f215.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB13, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        public final void a(@dl.d b set, float f215) {
                            f0.p(set, "$this$set");
                            set.v(f215);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f215) {
                            a(bVar, f215.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB13, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        public final void a(@dl.d b set, float f215) {
                            f0.p(set, "$this$set");
                            set.x(f215);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f215) {
                            a(bVar, f215.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB13, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        public final void a(@dl.d b set, float f215) {
                            f0.p(set, "$this$set");
                            set.y(f215);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f215) {
                            a(bVar, f215.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB13, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        public final void a(@dl.d b set, float f215) {
                            f0.p(set, "$this$set");
                            set.z(f215);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f215) {
                            a(bVar, f215.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB13, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        public final void a(@dl.d b set, float f215) {
                            f0.p(set, "$this$set");
                            set.A(f215);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f215) {
                            a(bVar, f215.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB13, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.s(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                            a(bVar, list3);
                            return b2.f124493a;
                        }
                    });
                    pVarF.T(-983907633);
                    content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    f24 = f23;
                    f25 = f21;
                    f26 = f17;
                    f27 = f18;
                    f28 = f22;
                    list2 = listH;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                    }
                    vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b invoke() {
                            return new b();
                        }
                    };
                    pVarF.T(-548224868);
                    if (!(pVarF.G() instanceof k)) {
                        ComposablesKt.n();
                    }
                    pVarF.J();
                    if (pVarF.D()) {
                        pVarF.L(vectorComposeKt$Group$1);
                    } else {
                        pVarF.d();
                    }
                    androidx.compose.runtime.p pVarB14 = Updater.b(pVarF);
                    Updater.j(pVarB14, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        public final void a(@dl.d b set, @dl.d String it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.t(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str9) {
                            a(bVar, str9);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB14, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        public final void a(@dl.d b set, float f215) {
                            f0.p(set, "$this$set");
                            set.w(f215);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f215) {
                            a(bVar, f215.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB14, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        public final void a(@dl.d b set, float f215) {
                            f0.p(set, "$this$set");
                            set.u(f215);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f215) {
                            a(bVar, f215.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB14, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        public final void a(@dl.d b set, float f215) {
                            f0.p(set, "$this$set");
                            set.v(f215);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f215) {
                            a(bVar, f215.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB14, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        public final void a(@dl.d b set, float f215) {
                            f0.p(set, "$this$set");
                            set.x(f215);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f215) {
                            a(bVar, f215.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB14, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        public final void a(@dl.d b set, float f215) {
                            f0.p(set, "$this$set");
                            set.y(f215);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f215) {
                            a(bVar, f215.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB14, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        public final void a(@dl.d b set, float f215) {
                            f0.p(set, "$this$set");
                            set.z(f215);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f215) {
                            a(bVar, f215.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB14, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        public final void a(@dl.d b set, float f215) {
                            f0.p(set, "$this$set");
                            set.A(f215);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f215) {
                            a(bVar, f215.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB14, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.s(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                            a(bVar, list3);
                            return b2.f124493a;
                        }
                    });
                    pVarF.T(-983907633);
                    content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    f24 = f23;
                    f25 = f21;
                    f26 = f17;
                    f27 = f18;
                    f28 = f22;
                    list2 = listH;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final String str9 = str2;
                final float f215 = f19;
                final float f36 = f20;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                        VectorComposeKt.a(str9, f215, f26, f27, f36, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i26 = com.google.android.exoplayer2.j.G;
            i12 |= i26;
            if (i25 != 256) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                }
                vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b invoke() {
                        return new b();
                    }
                };
                pVarF.T(-548224868);
                if (!(pVarF.G() instanceof k)) {
                    ComposablesKt.n();
                }
                pVarF.J();
                if (pVarF.D()) {
                    pVarF.L(vectorComposeKt$Group$1);
                } else {
                    pVarF.d();
                }
                androidx.compose.runtime.p pVarB15 = Updater.b(pVarF);
                Updater.j(pVarB15, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    public final void a(@dl.d b set, @dl.d String it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.t(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str10) {
                        a(bVar, str10);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB15, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    public final void a(@dl.d b set, float f216) {
                        f0.p(set, "$this$set");
                        set.w(f216);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f216) {
                        a(bVar, f216.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB15, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    public final void a(@dl.d b set, float f216) {
                        f0.p(set, "$this$set");
                        set.u(f216);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f216) {
                        a(bVar, f216.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB15, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    public final void a(@dl.d b set, float f216) {
                        f0.p(set, "$this$set");
                        set.v(f216);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f216) {
                        a(bVar, f216.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB15, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    public final void a(@dl.d b set, float f216) {
                        f0.p(set, "$this$set");
                        set.x(f216);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f216) {
                        a(bVar, f216.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB15, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    public final void a(@dl.d b set, float f216) {
                        f0.p(set, "$this$set");
                        set.y(f216);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f216) {
                        a(bVar, f216.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB15, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    public final void a(@dl.d b set, float f216) {
                        f0.p(set, "$this$set");
                        set.z(f216);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f216) {
                        a(bVar, f216.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB15, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    public final void a(@dl.d b set, float f216) {
                        f0.p(set, "$this$set");
                        set.A(f216);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f216) {
                        a(bVar, f216.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB15, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.s(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                        a(bVar, list3);
                        return b2.f124493a;
                    }
                });
                pVarF.T(-983907633);
                content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                f24 = f23;
                f25 = f21;
                f26 = f17;
                f27 = f18;
                f28 = f22;
                list2 = listH;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                }
                vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b invoke() {
                        return new b();
                    }
                };
                pVarF.T(-548224868);
                if (!(pVarF.G() instanceof k)) {
                    ComposablesKt.n();
                }
                pVarF.J();
                if (pVarF.D()) {
                    pVarF.L(vectorComposeKt$Group$1);
                } else {
                    pVarF.d();
                }
                androidx.compose.runtime.p pVarB16 = Updater.b(pVarF);
                Updater.j(pVarB16, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    public final void a(@dl.d b set, @dl.d String it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.t(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str10) {
                        a(bVar, str10);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB16, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    public final void a(@dl.d b set, float f216) {
                        f0.p(set, "$this$set");
                        set.w(f216);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f216) {
                        a(bVar, f216.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB16, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    public final void a(@dl.d b set, float f216) {
                        f0.p(set, "$this$set");
                        set.u(f216);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f216) {
                        a(bVar, f216.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB16, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    public final void a(@dl.d b set, float f216) {
                        f0.p(set, "$this$set");
                        set.v(f216);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f216) {
                        a(bVar, f216.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB16, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    public final void a(@dl.d b set, float f216) {
                        f0.p(set, "$this$set");
                        set.x(f216);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f216) {
                        a(bVar, f216.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB16, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    public final void a(@dl.d b set, float f216) {
                        f0.p(set, "$this$set");
                        set.y(f216);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f216) {
                        a(bVar, f216.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB16, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    public final void a(@dl.d b set, float f216) {
                        f0.p(set, "$this$set");
                        set.z(f216);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f216) {
                        a(bVar, f216.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB16, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    public final void a(@dl.d b set, float f216) {
                        f0.p(set, "$this$set");
                        set.A(f216);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f216) {
                        a(bVar, f216.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB16, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.s(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                        a(bVar, list3);
                        return b2.f124493a;
                    }
                });
                pVarF.T(-983907633);
                content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                f24 = f23;
                f25 = f21;
                f26 = f17;
                f27 = f18;
                f28 = f22;
                list2 = listH;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final String str10 = str2;
            final float f216 = f19;
            final float f37 = f20;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                    VectorComposeKt.a(str10, f216, f26, f27, f37, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                f17 = f11;
                if (pVarF.w(f17)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    f18 = f12;
                    if (pVarF.w(f18)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (pVarF.w(f13)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i10 & 458752) == 0) {
                    if (pVarF.w(f14)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (pVarF.w(f15)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & 128;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.w(f16)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                i25 = i11 & 256;
                if (i25 != 0) {
                    i12 |= 33554432;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (pVarF.s(content)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                    }
                    if (i25 != 256) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                        }
                        vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final b invoke() {
                                return new b();
                            }
                        };
                        pVarF.T(-548224868);
                        if (!(pVarF.G() instanceof k)) {
                            ComposablesKt.n();
                        }
                        pVarF.J();
                        if (pVarF.D()) {
                            pVarF.L(vectorComposeKt$Group$1);
                        } else {
                            pVarF.d();
                        }
                        androidx.compose.runtime.p pVarB17 = Updater.b(pVarF);
                        Updater.j(pVarB17, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            public final void a(@dl.d b set, @dl.d String it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.t(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str11) {
                                a(bVar, str11);
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB17, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            public final void a(@dl.d b set, float f217) {
                                f0.p(set, "$this$set");
                                set.w(f217);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f217) {
                                a(bVar, f217.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB17, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            public final void a(@dl.d b set, float f217) {
                                f0.p(set, "$this$set");
                                set.u(f217);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f217) {
                                a(bVar, f217.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB17, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            public final void a(@dl.d b set, float f217) {
                                f0.p(set, "$this$set");
                                set.v(f217);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f217) {
                                a(bVar, f217.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB17, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            public final void a(@dl.d b set, float f217) {
                                f0.p(set, "$this$set");
                                set.x(f217);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f217) {
                                a(bVar, f217.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB17, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            public final void a(@dl.d b set, float f217) {
                                f0.p(set, "$this$set");
                                set.y(f217);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f217) {
                                a(bVar, f217.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB17, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            public final void a(@dl.d b set, float f217) {
                                f0.p(set, "$this$set");
                                set.z(f217);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f217) {
                                a(bVar, f217.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB17, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            public final void a(@dl.d b set, float f217) {
                                f0.p(set, "$this$set");
                                set.A(f217);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f217) {
                                a(bVar, f217.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB17, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.s(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                                a(bVar, list3);
                                return b2.f124493a;
                            }
                        });
                        pVarF.T(-983907633);
                        content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        f24 = f23;
                        f25 = f21;
                        f26 = f17;
                        f27 = f18;
                        f28 = f22;
                        list2 = listH;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i13 != 0) {
                                f17 = 0.0f;
                            }
                            if (i15 != 0) {
                                f18 = 0.0f;
                            }
                            if (i17 != 0) {
                                f20 = 1.0f;
                            } else {
                                f20 = f13;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                listH = p.h();
                                i12 &= -234881025;
                            } else {
                                listH = list;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                        }
                        vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final b invoke() {
                                return new b();
                            }
                        };
                        pVarF.T(-548224868);
                        if (!(pVarF.G() instanceof k)) {
                            ComposablesKt.n();
                        }
                        pVarF.J();
                        if (pVarF.D()) {
                            pVarF.L(vectorComposeKt$Group$1);
                        } else {
                            pVarF.d();
                        }
                        androidx.compose.runtime.p pVarB18 = Updater.b(pVarF);
                        Updater.j(pVarB18, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            public final void a(@dl.d b set, @dl.d String it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.t(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str11) {
                                a(bVar, str11);
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB18, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            public final void a(@dl.d b set, float f217) {
                                f0.p(set, "$this$set");
                                set.w(f217);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f217) {
                                a(bVar, f217.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB18, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            public final void a(@dl.d b set, float f217) {
                                f0.p(set, "$this$set");
                                set.u(f217);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f217) {
                                a(bVar, f217.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB18, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            public final void a(@dl.d b set, float f217) {
                                f0.p(set, "$this$set");
                                set.v(f217);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f217) {
                                a(bVar, f217.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB18, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            public final void a(@dl.d b set, float f217) {
                                f0.p(set, "$this$set");
                                set.x(f217);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f217) {
                                a(bVar, f217.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB18, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            public final void a(@dl.d b set, float f217) {
                                f0.p(set, "$this$set");
                                set.y(f217);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f217) {
                                a(bVar, f217.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB18, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            public final void a(@dl.d b set, float f217) {
                                f0.p(set, "$this$set");
                                set.z(f217);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f217) {
                                a(bVar, f217.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB18, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            public final void a(@dl.d b set, float f217) {
                                f0.p(set, "$this$set");
                                set.A(f217);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f217) {
                                a(bVar, f217.floatValue());
                                return b2.f124493a;
                            }
                        });
                        Updater.j(pVarB18, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                                f0.p(set, "$this$set");
                                f0.p(it, "it");
                                set.s(it);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                                a(bVar, list3);
                                return b2.f124493a;
                            }
                        });
                        pVarF.T(-983907633);
                        content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        f24 = f23;
                        f25 = f21;
                        f26 = f17;
                        f27 = f18;
                        f28 = f22;
                        list2 = listH;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final String str11 = str2;
                    final float f217 = f19;
                    final float f38 = f20;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                            VectorComposeKt.a(str11, f217, f26, f27, f38, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i26 = com.google.android.exoplayer2.j.G;
                i12 |= i26;
                if (i25 != 256) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                    }
                    vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b invoke() {
                            return new b();
                        }
                    };
                    pVarF.T(-548224868);
                    if (!(pVarF.G() instanceof k)) {
                        ComposablesKt.n();
                    }
                    pVarF.J();
                    if (pVarF.D()) {
                        pVarF.L(vectorComposeKt$Group$1);
                    } else {
                        pVarF.d();
                    }
                    androidx.compose.runtime.p pVarB19 = Updater.b(pVarF);
                    Updater.j(pVarB19, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        public final void a(@dl.d b set, @dl.d String it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.t(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str12) {
                            a(bVar, str12);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB19, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        public final void a(@dl.d b set, float f218) {
                            f0.p(set, "$this$set");
                            set.w(f218);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f218) {
                            a(bVar, f218.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB19, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        public final void a(@dl.d b set, float f218) {
                            f0.p(set, "$this$set");
                            set.u(f218);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f218) {
                            a(bVar, f218.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB19, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        public final void a(@dl.d b set, float f218) {
                            f0.p(set, "$this$set");
                            set.v(f218);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f218) {
                            a(bVar, f218.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB19, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        public final void a(@dl.d b set, float f218) {
                            f0.p(set, "$this$set");
                            set.x(f218);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f218) {
                            a(bVar, f218.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB19, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        public final void a(@dl.d b set, float f218) {
                            f0.p(set, "$this$set");
                            set.y(f218);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f218) {
                            a(bVar, f218.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB19, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        public final void a(@dl.d b set, float f218) {
                            f0.p(set, "$this$set");
                            set.z(f218);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f218) {
                            a(bVar, f218.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB19, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        public final void a(@dl.d b set, float f218) {
                            f0.p(set, "$this$set");
                            set.A(f218);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f218) {
                            a(bVar, f218.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB19, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.s(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                            a(bVar, list3);
                            return b2.f124493a;
                        }
                    });
                    pVarF.T(-983907633);
                    content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    f24 = f23;
                    f25 = f21;
                    f26 = f17;
                    f27 = f18;
                    f28 = f22;
                    list2 = listH;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                    }
                    vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b invoke() {
                            return new b();
                        }
                    };
                    pVarF.T(-548224868);
                    if (!(pVarF.G() instanceof k)) {
                        ComposablesKt.n();
                    }
                    pVarF.J();
                    if (pVarF.D()) {
                        pVarF.L(vectorComposeKt$Group$1);
                    } else {
                        pVarF.d();
                    }
                    androidx.compose.runtime.p pVarB110 = Updater.b(pVarF);
                    Updater.j(pVarB110, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        public final void a(@dl.d b set, @dl.d String it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.t(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str12) {
                            a(bVar, str12);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB110, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        public final void a(@dl.d b set, float f218) {
                            f0.p(set, "$this$set");
                            set.w(f218);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f218) {
                            a(bVar, f218.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB110, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        public final void a(@dl.d b set, float f218) {
                            f0.p(set, "$this$set");
                            set.u(f218);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f218) {
                            a(bVar, f218.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB110, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        public final void a(@dl.d b set, float f218) {
                            f0.p(set, "$this$set");
                            set.v(f218);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f218) {
                            a(bVar, f218.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB110, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        public final void a(@dl.d b set, float f218) {
                            f0.p(set, "$this$set");
                            set.x(f218);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f218) {
                            a(bVar, f218.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB110, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        public final void a(@dl.d b set, float f218) {
                            f0.p(set, "$this$set");
                            set.y(f218);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f218) {
                            a(bVar, f218.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB110, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        public final void a(@dl.d b set, float f218) {
                            f0.p(set, "$this$set");
                            set.z(f218);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f218) {
                            a(bVar, f218.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB110, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        public final void a(@dl.d b set, float f218) {
                            f0.p(set, "$this$set");
                            set.A(f218);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f218) {
                            a(bVar, f218.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB110, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.s(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                            a(bVar, list3);
                            return b2.f124493a;
                        }
                    });
                    pVarF.T(-983907633);
                    content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    f24 = f23;
                    f25 = f21;
                    f26 = f17;
                    f27 = f18;
                    f28 = f22;
                    list2 = listH;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final String str12 = str2;
                final float f218 = f19;
                final float f39 = f20;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                        VectorComposeKt.a(str12, f218, f26, f27, f39, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            f18 = f12;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (pVarF.w(f13)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i10 & 458752) == 0) {
                if (pVarF.w(f14)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (pVarF.w(f15)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i23 = i11 & 128;
            if (i23 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.w(f16)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            i25 = i11 & 256;
            if (i25 != 0) {
                i12 |= 33554432;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                }
                if (i25 != 256) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                    }
                    vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b invoke() {
                            return new b();
                        }
                    };
                    pVarF.T(-548224868);
                    if (!(pVarF.G() instanceof k)) {
                        ComposablesKt.n();
                    }
                    pVarF.J();
                    if (pVarF.D()) {
                        pVarF.L(vectorComposeKt$Group$1);
                    } else {
                        pVarF.d();
                    }
                    androidx.compose.runtime.p pVarB111 = Updater.b(pVarF);
                    Updater.j(pVarB111, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        public final void a(@dl.d b set, @dl.d String it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.t(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str13) {
                            a(bVar, str13);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB111, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        public final void a(@dl.d b set, float f219) {
                            f0.p(set, "$this$set");
                            set.w(f219);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f219) {
                            a(bVar, f219.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB111, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        public final void a(@dl.d b set, float f219) {
                            f0.p(set, "$this$set");
                            set.u(f219);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f219) {
                            a(bVar, f219.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB111, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        public final void a(@dl.d b set, float f219) {
                            f0.p(set, "$this$set");
                            set.v(f219);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f219) {
                            a(bVar, f219.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB111, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        public final void a(@dl.d b set, float f219) {
                            f0.p(set, "$this$set");
                            set.x(f219);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f219) {
                            a(bVar, f219.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB111, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        public final void a(@dl.d b set, float f219) {
                            f0.p(set, "$this$set");
                            set.y(f219);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f219) {
                            a(bVar, f219.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB111, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        public final void a(@dl.d b set, float f219) {
                            f0.p(set, "$this$set");
                            set.z(f219);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f219) {
                            a(bVar, f219.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB111, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        public final void a(@dl.d b set, float f219) {
                            f0.p(set, "$this$set");
                            set.A(f219);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f219) {
                            a(bVar, f219.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB111, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.s(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                            a(bVar, list3);
                            return b2.f124493a;
                        }
                    });
                    pVarF.T(-983907633);
                    content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    f24 = f23;
                    f25 = f21;
                    f26 = f17;
                    f27 = f18;
                    f28 = f22;
                    list2 = listH;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                    }
                    vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b invoke() {
                            return new b();
                        }
                    };
                    pVarF.T(-548224868);
                    if (!(pVarF.G() instanceof k)) {
                        ComposablesKt.n();
                    }
                    pVarF.J();
                    if (pVarF.D()) {
                        pVarF.L(vectorComposeKt$Group$1);
                    } else {
                        pVarF.d();
                    }
                    androidx.compose.runtime.p pVarB112 = Updater.b(pVarF);
                    Updater.j(pVarB112, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        public final void a(@dl.d b set, @dl.d String it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.t(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str13) {
                            a(bVar, str13);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB112, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        public final void a(@dl.d b set, float f219) {
                            f0.p(set, "$this$set");
                            set.w(f219);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f219) {
                            a(bVar, f219.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB112, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        public final void a(@dl.d b set, float f219) {
                            f0.p(set, "$this$set");
                            set.u(f219);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f219) {
                            a(bVar, f219.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB112, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        public final void a(@dl.d b set, float f219) {
                            f0.p(set, "$this$set");
                            set.v(f219);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f219) {
                            a(bVar, f219.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB112, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        public final void a(@dl.d b set, float f219) {
                            f0.p(set, "$this$set");
                            set.x(f219);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f219) {
                            a(bVar, f219.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB112, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        public final void a(@dl.d b set, float f219) {
                            f0.p(set, "$this$set");
                            set.y(f219);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f219) {
                            a(bVar, f219.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB112, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        public final void a(@dl.d b set, float f219) {
                            f0.p(set, "$this$set");
                            set.z(f219);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f219) {
                            a(bVar, f219.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB112, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        public final void a(@dl.d b set, float f219) {
                            f0.p(set, "$this$set");
                            set.A(f219);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f219) {
                            a(bVar, f219.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB112, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.s(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                            a(bVar, list3);
                            return b2.f124493a;
                        }
                    });
                    pVarF.T(-983907633);
                    content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    f24 = f23;
                    f25 = f21;
                    f26 = f17;
                    f27 = f18;
                    f28 = f22;
                    list2 = listH;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final String str13 = str2;
                final float f219 = f19;
                final float f310 = f20;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                        VectorComposeKt.a(str13, f219, f26, f27, f310, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i26 = com.google.android.exoplayer2.j.G;
            i12 |= i26;
            if (i25 != 256) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                }
                vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b invoke() {
                        return new b();
                    }
                };
                pVarF.T(-548224868);
                if (!(pVarF.G() instanceof k)) {
                    ComposablesKt.n();
                }
                pVarF.J();
                if (pVarF.D()) {
                    pVarF.L(vectorComposeKt$Group$1);
                } else {
                    pVarF.d();
                }
                androidx.compose.runtime.p pVarB113 = Updater.b(pVarF);
                Updater.j(pVarB113, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    public final void a(@dl.d b set, @dl.d String it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.t(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str14) {
                        a(bVar, str14);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB113, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    public final void a(@dl.d b set, float f2110) {
                        f0.p(set, "$this$set");
                        set.w(f2110);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2110) {
                        a(bVar, f2110.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB113, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    public final void a(@dl.d b set, float f2110) {
                        f0.p(set, "$this$set");
                        set.u(f2110);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2110) {
                        a(bVar, f2110.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB113, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    public final void a(@dl.d b set, float f2110) {
                        f0.p(set, "$this$set");
                        set.v(f2110);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2110) {
                        a(bVar, f2110.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB113, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    public final void a(@dl.d b set, float f2110) {
                        f0.p(set, "$this$set");
                        set.x(f2110);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2110) {
                        a(bVar, f2110.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB113, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    public final void a(@dl.d b set, float f2110) {
                        f0.p(set, "$this$set");
                        set.y(f2110);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2110) {
                        a(bVar, f2110.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB113, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    public final void a(@dl.d b set, float f2110) {
                        f0.p(set, "$this$set");
                        set.z(f2110);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2110) {
                        a(bVar, f2110.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB113, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    public final void a(@dl.d b set, float f2110) {
                        f0.p(set, "$this$set");
                        set.A(f2110);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2110) {
                        a(bVar, f2110.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB113, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.s(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                        a(bVar, list3);
                        return b2.f124493a;
                    }
                });
                pVarF.T(-983907633);
                content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                f24 = f23;
                f25 = f21;
                f26 = f17;
                f27 = f18;
                f28 = f22;
                list2 = listH;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                }
                vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b invoke() {
                        return new b();
                    }
                };
                pVarF.T(-548224868);
                if (!(pVarF.G() instanceof k)) {
                    ComposablesKt.n();
                }
                pVarF.J();
                if (pVarF.D()) {
                    pVarF.L(vectorComposeKt$Group$1);
                } else {
                    pVarF.d();
                }
                androidx.compose.runtime.p pVarB114 = Updater.b(pVarF);
                Updater.j(pVarB114, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    public final void a(@dl.d b set, @dl.d String it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.t(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str14) {
                        a(bVar, str14);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB114, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    public final void a(@dl.d b set, float f2110) {
                        f0.p(set, "$this$set");
                        set.w(f2110);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2110) {
                        a(bVar, f2110.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB114, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    public final void a(@dl.d b set, float f2110) {
                        f0.p(set, "$this$set");
                        set.u(f2110);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2110) {
                        a(bVar, f2110.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB114, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    public final void a(@dl.d b set, float f2110) {
                        f0.p(set, "$this$set");
                        set.v(f2110);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2110) {
                        a(bVar, f2110.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB114, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    public final void a(@dl.d b set, float f2110) {
                        f0.p(set, "$this$set");
                        set.x(f2110);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2110) {
                        a(bVar, f2110.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB114, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    public final void a(@dl.d b set, float f2110) {
                        f0.p(set, "$this$set");
                        set.y(f2110);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2110) {
                        a(bVar, f2110.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB114, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    public final void a(@dl.d b set, float f2110) {
                        f0.p(set, "$this$set");
                        set.z(f2110);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2110) {
                        a(bVar, f2110.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB114, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    public final void a(@dl.d b set, float f2110) {
                        f0.p(set, "$this$set");
                        set.A(f2110);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2110) {
                        a(bVar, f2110.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB114, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.s(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                        a(bVar, list3);
                        return b2.f124493a;
                    }
                });
                pVarF.T(-983907633);
                content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                f24 = f23;
                f25 = f21;
                f26 = f17;
                f27 = f18;
                f28 = f22;
                list2 = listH;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final String str14 = str2;
            final float f2110 = f19;
            final float f311 = f20;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                    VectorComposeKt.a(str14, f2110, f26, f27, f311, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        f17 = f11;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                f18 = f12;
                if (pVarF.w(f18)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (pVarF.w(f13)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i10 & 458752) == 0) {
                if (pVarF.w(f14)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (pVarF.w(f15)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i23 = i11 & 128;
            if (i23 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.w(f16)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            i25 = i11 & 256;
            if (i25 != 0) {
                i12 |= 33554432;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                }
                if (i25 != 256) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                    }
                    vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b invoke() {
                            return new b();
                        }
                    };
                    pVarF.T(-548224868);
                    if (!(pVarF.G() instanceof k)) {
                        ComposablesKt.n();
                    }
                    pVarF.J();
                    if (pVarF.D()) {
                        pVarF.L(vectorComposeKt$Group$1);
                    } else {
                        pVarF.d();
                    }
                    androidx.compose.runtime.p pVarB115 = Updater.b(pVarF);
                    Updater.j(pVarB115, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        public final void a(@dl.d b set, @dl.d String it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.t(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str15) {
                            a(bVar, str15);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB115, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        public final void a(@dl.d b set, float f2111) {
                            f0.p(set, "$this$set");
                            set.w(f2111);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2111) {
                            a(bVar, f2111.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB115, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        public final void a(@dl.d b set, float f2111) {
                            f0.p(set, "$this$set");
                            set.u(f2111);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2111) {
                            a(bVar, f2111.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB115, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        public final void a(@dl.d b set, float f2111) {
                            f0.p(set, "$this$set");
                            set.v(f2111);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2111) {
                            a(bVar, f2111.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB115, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        public final void a(@dl.d b set, float f2111) {
                            f0.p(set, "$this$set");
                            set.x(f2111);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2111) {
                            a(bVar, f2111.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB115, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        public final void a(@dl.d b set, float f2111) {
                            f0.p(set, "$this$set");
                            set.y(f2111);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2111) {
                            a(bVar, f2111.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB115, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        public final void a(@dl.d b set, float f2111) {
                            f0.p(set, "$this$set");
                            set.z(f2111);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2111) {
                            a(bVar, f2111.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB115, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        public final void a(@dl.d b set, float f2111) {
                            f0.p(set, "$this$set");
                            set.A(f2111);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2111) {
                            a(bVar, f2111.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB115, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.s(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                            a(bVar, list3);
                            return b2.f124493a;
                        }
                    });
                    pVarF.T(-983907633);
                    content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    f24 = f23;
                    f25 = f21;
                    f26 = f17;
                    f27 = f18;
                    f28 = f22;
                    list2 = listH;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i13 != 0) {
                            f17 = 0.0f;
                        }
                        if (i15 != 0) {
                            f18 = 0.0f;
                        }
                        if (i17 != 0) {
                            f20 = 1.0f;
                        } else {
                            f20 = f13;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            listH = p.h();
                            i12 &= -234881025;
                        } else {
                            listH = list;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                    }
                    vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b invoke() {
                            return new b();
                        }
                    };
                    pVarF.T(-548224868);
                    if (!(pVarF.G() instanceof k)) {
                        ComposablesKt.n();
                    }
                    pVarF.J();
                    if (pVarF.D()) {
                        pVarF.L(vectorComposeKt$Group$1);
                    } else {
                        pVarF.d();
                    }
                    androidx.compose.runtime.p pVarB116 = Updater.b(pVarF);
                    Updater.j(pVarB116, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        public final void a(@dl.d b set, @dl.d String it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.t(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str15) {
                            a(bVar, str15);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB116, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        public final void a(@dl.d b set, float f2111) {
                            f0.p(set, "$this$set");
                            set.w(f2111);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2111) {
                            a(bVar, f2111.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB116, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        public final void a(@dl.d b set, float f2111) {
                            f0.p(set, "$this$set");
                            set.u(f2111);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2111) {
                            a(bVar, f2111.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB116, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        public final void a(@dl.d b set, float f2111) {
                            f0.p(set, "$this$set");
                            set.v(f2111);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2111) {
                            a(bVar, f2111.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB116, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        public final void a(@dl.d b set, float f2111) {
                            f0.p(set, "$this$set");
                            set.x(f2111);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2111) {
                            a(bVar, f2111.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB116, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        public final void a(@dl.d b set, float f2111) {
                            f0.p(set, "$this$set");
                            set.y(f2111);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2111) {
                            a(bVar, f2111.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB116, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        public final void a(@dl.d b set, float f2111) {
                            f0.p(set, "$this$set");
                            set.z(f2111);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2111) {
                            a(bVar, f2111.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB116, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        public final void a(@dl.d b set, float f2111) {
                            f0.p(set, "$this$set");
                            set.A(f2111);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2111) {
                            a(bVar, f2111.floatValue());
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB116, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            set.s(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                            a(bVar, list3);
                            return b2.f124493a;
                        }
                    });
                    pVarF.T(-983907633);
                    content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    f24 = f23;
                    f25 = f21;
                    f26 = f17;
                    f27 = f18;
                    f28 = f22;
                    list2 = listH;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final String str15 = str2;
                final float f2111 = f19;
                final float f312 = f20;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                        VectorComposeKt.a(str15, f2111, f26, f27, f312, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i26 = com.google.android.exoplayer2.j.G;
            i12 |= i26;
            if (i25 != 256) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                }
                vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b invoke() {
                        return new b();
                    }
                };
                pVarF.T(-548224868);
                if (!(pVarF.G() instanceof k)) {
                    ComposablesKt.n();
                }
                pVarF.J();
                if (pVarF.D()) {
                    pVarF.L(vectorComposeKt$Group$1);
                } else {
                    pVarF.d();
                }
                androidx.compose.runtime.p pVarB117 = Updater.b(pVarF);
                Updater.j(pVarB117, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    public final void a(@dl.d b set, @dl.d String it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.t(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str16) {
                        a(bVar, str16);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB117, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    public final void a(@dl.d b set, float f2112) {
                        f0.p(set, "$this$set");
                        set.w(f2112);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2112) {
                        a(bVar, f2112.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB117, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    public final void a(@dl.d b set, float f2112) {
                        f0.p(set, "$this$set");
                        set.u(f2112);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2112) {
                        a(bVar, f2112.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB117, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    public final void a(@dl.d b set, float f2112) {
                        f0.p(set, "$this$set");
                        set.v(f2112);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2112) {
                        a(bVar, f2112.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB117, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    public final void a(@dl.d b set, float f2112) {
                        f0.p(set, "$this$set");
                        set.x(f2112);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2112) {
                        a(bVar, f2112.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB117, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    public final void a(@dl.d b set, float f2112) {
                        f0.p(set, "$this$set");
                        set.y(f2112);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2112) {
                        a(bVar, f2112.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB117, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    public final void a(@dl.d b set, float f2112) {
                        f0.p(set, "$this$set");
                        set.z(f2112);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2112) {
                        a(bVar, f2112.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB117, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    public final void a(@dl.d b set, float f2112) {
                        f0.p(set, "$this$set");
                        set.A(f2112);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2112) {
                        a(bVar, f2112.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB117, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.s(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                        a(bVar, list3);
                        return b2.f124493a;
                    }
                });
                pVarF.T(-983907633);
                content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                f24 = f23;
                f25 = f21;
                f26 = f17;
                f27 = f18;
                f28 = f22;
                list2 = listH;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                }
                vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b invoke() {
                        return new b();
                    }
                };
                pVarF.T(-548224868);
                if (!(pVarF.G() instanceof k)) {
                    ComposablesKt.n();
                }
                pVarF.J();
                if (pVarF.D()) {
                    pVarF.L(vectorComposeKt$Group$1);
                } else {
                    pVarF.d();
                }
                androidx.compose.runtime.p pVarB118 = Updater.b(pVarF);
                Updater.j(pVarB118, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    public final void a(@dl.d b set, @dl.d String it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.t(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str16) {
                        a(bVar, str16);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB118, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    public final void a(@dl.d b set, float f2112) {
                        f0.p(set, "$this$set");
                        set.w(f2112);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2112) {
                        a(bVar, f2112.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB118, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    public final void a(@dl.d b set, float f2112) {
                        f0.p(set, "$this$set");
                        set.u(f2112);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2112) {
                        a(bVar, f2112.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB118, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    public final void a(@dl.d b set, float f2112) {
                        f0.p(set, "$this$set");
                        set.v(f2112);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2112) {
                        a(bVar, f2112.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB118, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    public final void a(@dl.d b set, float f2112) {
                        f0.p(set, "$this$set");
                        set.x(f2112);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2112) {
                        a(bVar, f2112.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB118, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    public final void a(@dl.d b set, float f2112) {
                        f0.p(set, "$this$set");
                        set.y(f2112);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2112) {
                        a(bVar, f2112.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB118, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    public final void a(@dl.d b set, float f2112) {
                        f0.p(set, "$this$set");
                        set.z(f2112);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2112) {
                        a(bVar, f2112.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB118, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    public final void a(@dl.d b set, float f2112) {
                        f0.p(set, "$this$set");
                        set.A(f2112);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2112) {
                        a(bVar, f2112.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB118, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.s(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                        a(bVar, list3);
                        return b2.f124493a;
                    }
                });
                pVarF.T(-983907633);
                content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                f24 = f23;
                f25 = f21;
                f26 = f17;
                f27 = f18;
                f28 = f22;
                list2 = listH;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final String str16 = str2;
            final float f2112 = f19;
            final float f313 = f20;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                    VectorComposeKt.a(str16, f2112, f26, f27, f313, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        f18 = f12;
        i17 = i11 & 16;
        if (i17 != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (pVarF.w(f13)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i12 |= i18;
        }
        i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((i10 & 458752) == 0) {
            if (pVarF.w(f14)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i12 |= i20;
        }
        i21 = i11 & 64;
        if (i21 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (pVarF.w(f15)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i12 |= i22;
        }
        i23 = i11 & 128;
        if (i23 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (pVarF.w(f16)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i12 |= i24;
        }
        i25 = i11 & 256;
        if (i25 != 0) {
            i12 |= 33554432;
        }
        if ((i11 & 512) != 0) {
            if ((1879048192 & i10) == 0) {
                if (pVarF.s(content)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
            }
            if (i25 != 256) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                }
                vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b invoke() {
                        return new b();
                    }
                };
                pVarF.T(-548224868);
                if (!(pVarF.G() instanceof k)) {
                    ComposablesKt.n();
                }
                pVarF.J();
                if (pVarF.D()) {
                    pVarF.L(vectorComposeKt$Group$1);
                } else {
                    pVarF.d();
                }
                androidx.compose.runtime.p pVarB119 = Updater.b(pVarF);
                Updater.j(pVarB119, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    public final void a(@dl.d b set, @dl.d String it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.t(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str17) {
                        a(bVar, str17);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB119, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    public final void a(@dl.d b set, float f2113) {
                        f0.p(set, "$this$set");
                        set.w(f2113);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2113) {
                        a(bVar, f2113.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB119, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    public final void a(@dl.d b set, float f2113) {
                        f0.p(set, "$this$set");
                        set.u(f2113);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2113) {
                        a(bVar, f2113.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB119, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    public final void a(@dl.d b set, float f2113) {
                        f0.p(set, "$this$set");
                        set.v(f2113);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2113) {
                        a(bVar, f2113.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB119, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    public final void a(@dl.d b set, float f2113) {
                        f0.p(set, "$this$set");
                        set.x(f2113);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2113) {
                        a(bVar, f2113.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB119, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    public final void a(@dl.d b set, float f2113) {
                        f0.p(set, "$this$set");
                        set.y(f2113);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2113) {
                        a(bVar, f2113.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB119, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    public final void a(@dl.d b set, float f2113) {
                        f0.p(set, "$this$set");
                        set.z(f2113);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2113) {
                        a(bVar, f2113.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB119, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    public final void a(@dl.d b set, float f2113) {
                        f0.p(set, "$this$set");
                        set.A(f2113);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2113) {
                        a(bVar, f2113.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB119, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.s(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                        a(bVar, list3);
                        return b2.f124493a;
                    }
                });
                pVarF.T(-983907633);
                content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                f24 = f23;
                f25 = f21;
                f26 = f17;
                f27 = f18;
                f28 = f22;
                list2 = listH;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i13 != 0) {
                        f17 = 0.0f;
                    }
                    if (i15 != 0) {
                        f18 = 0.0f;
                    }
                    if (i17 != 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = f13;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        listH = p.h();
                        i12 &= -234881025;
                    } else {
                        listH = list;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
                }
                vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b invoke() {
                        return new b();
                    }
                };
                pVarF.T(-548224868);
                if (!(pVarF.G() instanceof k)) {
                    ComposablesKt.n();
                }
                pVarF.J();
                if (pVarF.D()) {
                    pVarF.L(vectorComposeKt$Group$1);
                } else {
                    pVarF.d();
                }
                androidx.compose.runtime.p pVarB1110 = Updater.b(pVarF);
                Updater.j(pVarB1110, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    public final void a(@dl.d b set, @dl.d String it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.t(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str17) {
                        a(bVar, str17);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB1110, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    public final void a(@dl.d b set, float f2113) {
                        f0.p(set, "$this$set");
                        set.w(f2113);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2113) {
                        a(bVar, f2113.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB1110, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    public final void a(@dl.d b set, float f2113) {
                        f0.p(set, "$this$set");
                        set.u(f2113);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2113) {
                        a(bVar, f2113.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB1110, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    public final void a(@dl.d b set, float f2113) {
                        f0.p(set, "$this$set");
                        set.v(f2113);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2113) {
                        a(bVar, f2113.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB1110, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    public final void a(@dl.d b set, float f2113) {
                        f0.p(set, "$this$set");
                        set.x(f2113);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2113) {
                        a(bVar, f2113.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB1110, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    public final void a(@dl.d b set, float f2113) {
                        f0.p(set, "$this$set");
                        set.y(f2113);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2113) {
                        a(bVar, f2113.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB1110, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    public final void a(@dl.d b set, float f2113) {
                        f0.p(set, "$this$set");
                        set.z(f2113);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2113) {
                        a(bVar, f2113.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB1110, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    public final void a(@dl.d b set, float f2113) {
                        f0.p(set, "$this$set");
                        set.A(f2113);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2113) {
                        a(bVar, f2113.floatValue());
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB1110, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        set.s(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                        a(bVar, list3);
                        return b2.f124493a;
                    }
                });
                pVarF.T(-983907633);
                content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                f24 = f23;
                f25 = f21;
                f26 = f17;
                f27 = f18;
                f28 = f22;
                list2 = listH;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final String str17 = str2;
            final float f2113 = f19;
            final float f314 = f20;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                    VectorComposeKt.a(str17, f2113, f26, f27, f314, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i26 = com.google.android.exoplayer2.j.G;
        i12 |= i26;
        if (i25 != 256) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i27 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i28 != 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f10;
                }
                if (i13 != 0) {
                    f17 = 0.0f;
                }
                if (i15 != 0) {
                    f18 = 0.0f;
                }
                if (i17 != 0) {
                    f20 = 1.0f;
                } else {
                    f20 = f13;
                }
                if (i19 == 0) {
                }
                if (i21 != 0) {
                    f22 = 0.0f;
                } else {
                    f22 = f15;
                }
                if (i23 == 0) {
                }
                if (i25 != 0) {
                    listH = p.h();
                    i12 &= -234881025;
                } else {
                    listH = list;
                }
            } else {
                if (i27 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i28 != 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f10;
                }
                if (i13 != 0) {
                    f17 = 0.0f;
                }
                if (i15 != 0) {
                    f18 = 0.0f;
                }
                if (i17 != 0) {
                    f20 = 1.0f;
                } else {
                    f20 = f13;
                }
                if (i19 == 0) {
                }
                if (i21 != 0) {
                    f22 = 0.0f;
                } else {
                    f22 = f15;
                }
                if (i23 == 0) {
                }
                if (i25 != 0) {
                    listH = p.h();
                    i12 &= -234881025;
                } else {
                    listH = list;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
            }
            vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b invoke() {
                    return new b();
                }
            };
            pVarF.T(-548224868);
            if (!(pVarF.G() instanceof k)) {
                ComposablesKt.n();
            }
            pVarF.J();
            if (pVarF.D()) {
                pVarF.L(vectorComposeKt$Group$1);
            } else {
                pVarF.d();
            }
            androidx.compose.runtime.p pVarB1111 = Updater.b(pVarF);
            Updater.j(pVarB1111, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                public final void a(@dl.d b set, @dl.d String it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    set.t(it);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str18) {
                    a(bVar, str18);
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1111, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                public final void a(@dl.d b set, float f2114) {
                    f0.p(set, "$this$set");
                    set.w(f2114);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2114) {
                    a(bVar, f2114.floatValue());
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1111, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                public final void a(@dl.d b set, float f2114) {
                    f0.p(set, "$this$set");
                    set.u(f2114);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2114) {
                    a(bVar, f2114.floatValue());
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1111, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                public final void a(@dl.d b set, float f2114) {
                    f0.p(set, "$this$set");
                    set.v(f2114);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2114) {
                    a(bVar, f2114.floatValue());
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1111, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                public final void a(@dl.d b set, float f2114) {
                    f0.p(set, "$this$set");
                    set.x(f2114);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2114) {
                    a(bVar, f2114.floatValue());
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1111, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                public final void a(@dl.d b set, float f2114) {
                    f0.p(set, "$this$set");
                    set.y(f2114);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2114) {
                    a(bVar, f2114.floatValue());
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1111, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                public final void a(@dl.d b set, float f2114) {
                    f0.p(set, "$this$set");
                    set.z(f2114);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2114) {
                    a(bVar, f2114.floatValue());
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1111, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                public final void a(@dl.d b set, float f2114) {
                    f0.p(set, "$this$set");
                    set.A(f2114);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2114) {
                    a(bVar, f2114.floatValue());
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1111, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    set.s(it);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                    a(bVar, list3);
                    return b2.f124493a;
                }
            });
            pVarF.T(-983907633);
            content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            f24 = f23;
            f25 = f21;
            f26 = f17;
            f27 = f18;
            f28 = f22;
            list2 = listH;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i27 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i28 != 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f10;
                }
                if (i13 != 0) {
                    f17 = 0.0f;
                }
                if (i15 != 0) {
                    f18 = 0.0f;
                }
                if (i17 != 0) {
                    f20 = 1.0f;
                } else {
                    f20 = f13;
                }
                if (i19 == 0) {
                }
                if (i21 != 0) {
                    f22 = 0.0f;
                } else {
                    f22 = f15;
                }
                if (i23 == 0) {
                }
                if (i25 != 0) {
                    listH = p.h();
                    i12 &= -234881025;
                } else {
                    listH = list;
                }
            } else {
                if (i27 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i28 != 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f10;
                }
                if (i13 != 0) {
                    f17 = 0.0f;
                }
                if (i15 != 0) {
                    f18 = 0.0f;
                }
                if (i17 != 0) {
                    f20 = 1.0f;
                } else {
                    f20 = f13;
                }
                if (i19 == 0) {
                }
                if (i21 != 0) {
                    f22 = 0.0f;
                } else {
                    f22 = f15;
                }
                if (i23 == 0) {
                }
                if (i25 != 0) {
                    listH = p.h();
                    i12 &= -234881025;
                } else {
                    listH = list;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-213417674, i12, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:28)");
            }
            vectorComposeKt$Group$1 = new yh.a<b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b invoke() {
                    return new b();
                }
            };
            pVarF.T(-548224868);
            if (!(pVarF.G() instanceof k)) {
                ComposablesKt.n();
            }
            pVarF.J();
            if (pVarF.D()) {
                pVarF.L(vectorComposeKt$Group$1);
            } else {
                pVarF.d();
            }
            androidx.compose.runtime.p pVarB1112 = Updater.b(pVarF);
            Updater.j(pVarB1112, str2, new yh.p<b, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                public final void a(@dl.d b set, @dl.d String it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    set.t(it);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, String str18) {
                    a(bVar, str18);
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1112, Float.valueOf(f19), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                public final void a(@dl.d b set, float f2114) {
                    f0.p(set, "$this$set");
                    set.w(f2114);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2114) {
                    a(bVar, f2114.floatValue());
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1112, Float.valueOf(f17), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                public final void a(@dl.d b set, float f2114) {
                    f0.p(set, "$this$set");
                    set.u(f2114);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2114) {
                    a(bVar, f2114.floatValue());
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1112, Float.valueOf(f18), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                public final void a(@dl.d b set, float f2114) {
                    f0.p(set, "$this$set");
                    set.v(f2114);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2114) {
                    a(bVar, f2114.floatValue());
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1112, Float.valueOf(f20), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                public final void a(@dl.d b set, float f2114) {
                    f0.p(set, "$this$set");
                    set.x(f2114);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2114) {
                    a(bVar, f2114.floatValue());
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1112, Float.valueOf(f21), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                public final void a(@dl.d b set, float f2114) {
                    f0.p(set, "$this$set");
                    set.y(f2114);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2114) {
                    a(bVar, f2114.floatValue());
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1112, Float.valueOf(f22), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                public final void a(@dl.d b set, float f2114) {
                    f0.p(set, "$this$set");
                    set.z(f2114);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2114) {
                    a(bVar, f2114.floatValue());
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1112, Float.valueOf(f23), new yh.p<b, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                public final void a(@dl.d b set, float f2114) {
                    f0.p(set, "$this$set");
                    set.A(f2114);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, Float f2114) {
                    a(bVar, f2114.floatValue());
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB1112, listH, new yh.p<b, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                public final void a(@dl.d b set, @dl.d List<? extends f> it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    set.s(it);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(b bVar, List<? extends f> list3) {
                    a(bVar, list3);
                    return b2.f124493a;
                }
            });
            pVarF.T(-983907633);
            content.invoke(pVarF, Integer.valueOf((i12 >> 27) & 14));
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            f24 = f23;
            f25 = f21;
            f26 = f17;
            f27 = f18;
            f28 = f22;
            list2 = listH;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final String str18 = str2;
        final float f2114 = f19;
        final float f315 = f20;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                VectorComposeKt.a(str18, f2114, f26, f27, f315, f25, f28, f24, list2, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @l
    @androidx.compose.runtime.h
    public static final void b(@dl.d final List<? extends f> pathData, int i10, @dl.e String str, @dl.e a0 a0Var, float f10, @dl.e a0 a0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, @dl.e androidx.compose.runtime.p pVar, final int i13, final int i14, final int i15) {
        f0.p(pathData, "pathData");
        androidx.compose.runtime.p pVarF = pVar.F(-1478270750);
        int iC = (i15 & 2) != 0 ? p.c() : i10;
        String str2 = (i15 & 4) != 0 ? "" : str;
        a0 a0Var3 = (i15 & 8) != 0 ? null : a0Var;
        float f17 = (i15 & 16) != 0 ? 1.0f : f10;
        final a0 a0Var4 = (i15 & 32) == 0 ? a0Var2 : null;
        float f18 = (i15 & 64) != 0 ? 1.0f : f11;
        float f19 = (i15 & 128) != 0 ? 0.0f : f12;
        int iD = (i15 & 256) != 0 ? p.d() : i11;
        int iE = (i15 & 512) != 0 ? p.e() : i12;
        float f20 = (i15 & 1024) != 0 ? 4.0f : f13;
        float f21 = (i15 & 2048) != 0 ? 0.0f : f14;
        float f22 = (i15 & 4096) != 0 ? 1.0f : f15;
        float f23 = (i15 & 8192) != 0 ? 0.0f : f16;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1478270750, i13, i14, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:60)");
        }
        final VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new yh.a<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PathComponent invoke() {
                return new PathComponent();
            }
        };
        pVarF.T(1886828752);
        if (!(pVarF.G() instanceof k)) {
            ComposablesKt.n();
        }
        pVarF.J();
        if (pVarF.D()) {
            pVarF.L(new yh.a<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path-9cdaXJ4$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.graphics.vector.PathComponent, java.lang.Object] */
                @Override // yh.a
                @dl.d
                public final PathComponent invoke() {
                    return vectorComposeKt$Path$1.invoke();
                }
            });
        } else {
            pVarF.d();
        }
        androidx.compose.runtime.p pVarB = Updater.b(pVarF);
        Updater.j(pVarB, str2, new yh.p<PathComponent, String, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
            public final void a(@dl.d PathComponent set, @dl.d String it) {
                f0.p(set, "$this$set");
                f0.p(it, "it");
                set.v(it);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PathComponent pathComponent, String str3) {
                a(pathComponent, str3);
                return b2.f124493a;
            }
        });
        Updater.j(pVarB, pathData, new yh.p<PathComponent, List<? extends f>, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
            public final void a(@dl.d PathComponent set, @dl.d List<? extends f> it) {
                f0.p(set, "$this$set");
                f0.p(it, "it");
                set.w(it);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PathComponent pathComponent, List<? extends f> list) {
                a(pathComponent, list);
                return b2.f124493a;
            }
        });
        Updater.j(pVarB, n1.c(iC), new yh.p<PathComponent, n1, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
            public final void a(@dl.d PathComponent set, int i16) {
                f0.p(set, "$this$set");
                set.x(i16);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PathComponent pathComponent, n1 n1Var) {
                a(pathComponent, n1Var.getValue());
                return b2.f124493a;
            }
        });
        Updater.j(pVarB, a0Var3, new yh.p<PathComponent, a0, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
            public final void a(@dl.d PathComponent set, @dl.e a0 a0Var5) {
                f0.p(set, "$this$set");
                set.t(a0Var5);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PathComponent pathComponent, a0 a0Var5) {
                a(pathComponent, a0Var5);
                return b2.f124493a;
            }
        });
        Updater.j(pVarB, Float.valueOf(f17), new yh.p<PathComponent, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
            public final void a(@dl.d PathComponent set, float f24) {
                f0.p(set, "$this$set");
                set.u(f24);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PathComponent pathComponent, Float f24) {
                a(pathComponent, f24.floatValue());
                return b2.f124493a;
            }
        });
        Updater.j(pVarB, a0Var4, new yh.p<PathComponent, a0, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
            public final void a(@dl.d PathComponent set, @dl.e a0 a0Var5) {
                f0.p(set, "$this$set");
                set.y(a0Var5);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PathComponent pathComponent, a0 a0Var5) {
                a(pathComponent, a0Var5);
                return b2.f124493a;
            }
        });
        Updater.j(pVarB, Float.valueOf(f18), new yh.p<PathComponent, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
            public final void a(@dl.d PathComponent set, float f24) {
                f0.p(set, "$this$set");
                set.z(f24);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PathComponent pathComponent, Float f24) {
                a(pathComponent, f24.floatValue());
                return b2.f124493a;
            }
        });
        Updater.j(pVarB, Float.valueOf(f19), new yh.p<PathComponent, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
            public final void a(@dl.d PathComponent set, float f24) {
                f0.p(set, "$this$set");
                set.D(f24);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PathComponent pathComponent, Float f24) {
                a(pathComponent, f24.floatValue());
                return b2.f124493a;
            }
        });
        Updater.j(pVarB, k2.d(iE), new yh.p<PathComponent, k2, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
            public final void a(@dl.d PathComponent set, int i16) {
                f0.p(set, "$this$set");
                set.B(i16);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PathComponent pathComponent, k2 k2Var) {
                a(pathComponent, k2Var.getValue());
                return b2.f124493a;
            }
        });
        Updater.j(pVarB, j2.d(iD), new yh.p<PathComponent, j2, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
            public final void a(@dl.d PathComponent set, int i16) {
                f0.p(set, "$this$set");
                set.A(i16);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PathComponent pathComponent, j2 j2Var) {
                a(pathComponent, j2Var.getValue());
                return b2.f124493a;
            }
        });
        Updater.j(pVarB, Float.valueOf(f20), new yh.p<PathComponent, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
            public final void a(@dl.d PathComponent set, float f24) {
                f0.p(set, "$this$set");
                set.C(f24);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PathComponent pathComponent, Float f24) {
                a(pathComponent, f24.floatValue());
                return b2.f124493a;
            }
        });
        Updater.j(pVarB, Float.valueOf(f21), new yh.p<PathComponent, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
            public final void a(@dl.d PathComponent set, float f24) {
                f0.p(set, "$this$set");
                set.G(f24);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PathComponent pathComponent, Float f24) {
                a(pathComponent, f24.floatValue());
                return b2.f124493a;
            }
        });
        Updater.j(pVarB, Float.valueOf(f22), new yh.p<PathComponent, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
            public final void a(@dl.d PathComponent set, float f24) {
                f0.p(set, "$this$set");
                set.E(f24);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PathComponent pathComponent, Float f24) {
                a(pathComponent, f24.floatValue());
                return b2.f124493a;
            }
        });
        Updater.j(pVarB, Float.valueOf(f23), new yh.p<PathComponent, Float, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
            public final void a(@dl.d PathComponent set, float f24) {
                f0.p(set, "$this$set");
                set.F(f24);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PathComponent pathComponent, Float f24) {
                a(pathComponent, f24.floatValue());
                return b2.f124493a;
            }
        });
        pVarF.f();
        pVarF.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final int i16 = iC;
        final String str3 = str2;
        final a0 a0Var5 = a0Var3;
        final float f24 = f17;
        final float f25 = f18;
        final float f26 = f19;
        final int i17 = iD;
        final int i18 = iE;
        final float f27 = f20;
        final float f28 = f21;
        final float f29 = f22;
        final float f30 = f23;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                VectorComposeKt.b(pathData, i16, str3, a0Var5, f24, a0Var4, f25, f26, i17, i18, f27, f28, f29, f30, pVar2, i13 | 1, i14, i15);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
