package androidx.compose.animation.core;

import com.lzy.okgo.model.Progress;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: VectorConverters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000¨\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003\u001a \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000\" \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e\" \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e\"#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e\"#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u000e\"#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001b\u0010\u000e\"#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u000e\"#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b!\u0010\u000e\"#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b$\u0010\u000e\" \u0010)\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u000e\"!\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u0006*\u00020*8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010+\"!\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u0006*\u00020-8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010.\"!\u0010,\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0006*\u00020/8F¢\u0006\u0006\u001a\u0004\b\u0014\u00100\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0006*\u0002018Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b!\u00102\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0006*\u0002038Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b$\u00104\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00170\u0006*\u0002058Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u00106\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u0006*\u0002078Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0011\u00108\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00170\u0006*\u0002098Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b(\u0010:\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00170\u0006*\u00020;8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b<\u0010=\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Landroidx/compose/animation/core/f1;", ak.av, "", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", Progress.G, "k", "Landroidx/compose/animation/core/l;", "Landroidx/compose/animation/core/f1;", "FloatToVector", "", "b", "IntToVector", "Ls1/h;", ak.aF, "DpToVector", "Ls1/j;", "Landroidx/compose/animation/core/m;", "d", "DpOffsetToVector", "Lb1/m;", "e", "SizeToVector", "Lb1/f;", "f", "OffsetToVector", "Ls1/n;", "g", "IntOffsetToVector", "Ls1/r;", RXScreenCaptureService.KEY_HEIGHT, "IntSizeToVector", "Lb1/i;", "Landroidx/compose/animation/core/o;", "i", "RectToVector", "Lkotlin/Float$Companion;", "(Lkotlin/jvm/internal/y;)Landroidx/compose/animation/core/f1;", "VectorConverter", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/d0;)Landroidx/compose/animation/core/f1;", "Lb1/i$a;", "(Lb1/i$a;)Landroidx/compose/animation/core/f1;", "Ls1/h$a;", "(Ls1/h$a;)Landroidx/compose/animation/core/f1;", "Ls1/j$a;", "(Ls1/j$a;)Landroidx/compose/animation/core/f1;", "Lb1/m$a;", "(Lb1/m$a;)Landroidx/compose/animation/core/f1;", "Lb1/f$a;", "(Lb1/f$a;)Landroidx/compose/animation/core/f1;", "Ls1/n$a;", "(Ls1/n$a;)Landroidx/compose/animation/core/f1;", "Ls1/r$a;", "j", "(Ls1/r$a;)Landroidx/compose/animation/core/f1;", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class VectorConvertersKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final f1<Float, l> f4331a = a(new yh.l<Float, l>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        @dl.d
        public final l a(float f10) {
            return new l(f10);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ l invoke(Float f10) {
            return a(f10.floatValue());
        }
    }, new yh.l<l, Float>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        @Override // yh.l
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(@dl.d l it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return Float.valueOf(it.getValue());
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final f1<Integer, l> f4332b = a(new yh.l<Integer, l>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        @dl.d
        public final l a(int i10) {
            return new l(i10);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ l invoke(Integer num) {
            return a(num.intValue());
        }
    }, new yh.l<l, Integer>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        @Override // yh.l
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@dl.d l it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return Integer.valueOf((int) it.getValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final f1<s1.h, l> f4333c = a(new yh.l<s1.h, l>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        @dl.d
        public final l a(float f10) {
            return new l(f10);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ l invoke(s1.h hVar) {
            return a(hVar.w());
        }
    }, new yh.l<l, s1.h>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        public final float a(@dl.d l it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return s1.h.g(it.getValue());
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ s1.h invoke(l lVar) {
            return s1.h.d(a(lVar));
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final f1<s1.j, m> f4334d = a(new yh.l<s1.j, m>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        @dl.d
        public final m a(long j10) {
            return new m(s1.j.j(j10), s1.j.l(j10));
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ m invoke(s1.j jVar) {
            return a(jVar.getF139227a());
        }
    }, new yh.l<m, s1.j>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        public final long a(@dl.d m it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return s1.i.a(s1.h.g(it.getCom.alipay.sdk.m.x.c.d java.lang.String()), s1.h.g(it.getV2()));
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ s1.j invoke(m mVar) {
            return s1.j.c(a(mVar));
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final f1<b1.m, m> f4335e = a(new yh.l<b1.m, m>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        @dl.d
        public final m a(long j10) {
            return new m(b1.m.t(j10), b1.m.m(j10));
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ m invoke(b1.m mVar) {
            return a(mVar.getF30389a());
        }
    }, new yh.l<m, b1.m>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        public final long a(@dl.d m it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return b1.n.a(it.getCom.alipay.sdk.m.x.c.d java.lang.String(), it.getV2());
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b1.m invoke(m mVar) {
            return b1.m.c(a(mVar));
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final f1<b1.f, m> f4336f = a(new yh.l<b1.f, m>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        @dl.d
        public final m a(long j10) {
            return new m(b1.f.p(j10), b1.f.r(j10));
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ m invoke(b1.f fVar) {
            return a(fVar.getF30368a());
        }
    }, new yh.l<m, b1.f>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        public final long a(@dl.d m it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return b1.g.a(it.getCom.alipay.sdk.m.x.c.d java.lang.String(), it.getV2());
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b1.f invoke(m mVar) {
            return b1.f.d(a(mVar));
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final f1<s1.n, m> f4337g = a(new yh.l<s1.n, m>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        @dl.d
        public final m a(long j10) {
            return new m(s1.n.m(j10), s1.n.o(j10));
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ m invoke(s1.n nVar) {
            return a(nVar.getF139239a());
        }
    }, new yh.l<m, s1.n>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        public final long a(@dl.d m it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return s1.o.a(di.d.L0(it.getCom.alipay.sdk.m.x.c.d java.lang.String()), di.d.L0(it.getV2()));
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ s1.n invoke(m mVar) {
            return s1.n.b(a(mVar));
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final f1<s1.r, m> f4338h = a(new yh.l<s1.r, m>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        @dl.d
        public final m a(long j10) {
            return new m(s1.r.m(j10), s1.r.j(j10));
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ m invoke(s1.r rVar) {
            return a(rVar.getF139248a());
        }
    }, new yh.l<m, s1.r>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        public final long a(@dl.d m it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return s1.s.a(di.d.L0(it.getCom.alipay.sdk.m.x.c.d java.lang.String()), di.d.L0(it.getV2()));
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ s1.r invoke(m mVar) {
            return s1.r.b(a(mVar));
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final f1<b1.i, o> f4339i = a(new yh.l<b1.i, o>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        @Override // yh.l
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke(@dl.d b1.i it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return new o(it.t(), it.getF30372b(), it.x(), it.j());
        }
    }, new yh.l<o, b1.i>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        @Override // yh.l
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b1.i invoke(@dl.d o it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return new b1.i(it.getCom.alipay.sdk.m.x.c.d java.lang.String(), it.getV2(), it.getCom.huawei.hms.feature.dynamic.b.u java.lang.String(), it.getV4());
        }
    });

    @dl.d
    public static final <T, V extends p> f1<T, V> a(@dl.d yh.l<? super T, ? extends V> convertToVector, @dl.d yh.l<? super V, ? extends T> convertFromVector) {
        kotlin.jvm.internal.f0.p(convertToVector, "convertToVector");
        kotlin.jvm.internal.f0.p(convertFromVector, "convertFromVector");
        return new g1(convertToVector, convertFromVector);
    }

    @dl.d
    public static final f1<b1.f, m> b(@dl.d b1.f.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return f4336f;
    }

    @dl.d
    public static final f1<b1.i, o> c(@dl.d b1.i.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return f4339i;
    }

    @dl.d
    public static final f1<b1.m, m> d(@dl.d b1.m.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return f4335e;
    }

    @dl.d
    public static final f1<Float, l> e(@dl.d kotlin.jvm.internal.y yVar) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        return f4331a;
    }

    @dl.d
    public static final f1<Integer, l> f(@dl.d kotlin.jvm.internal.d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        return f4332b;
    }

    @dl.d
    public static final f1<s1.h, l> g(@dl.d s1.h.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return f4333c;
    }

    @dl.d
    public static final f1<s1.j, m> h(@dl.d s1.j.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return f4334d;
    }

    @dl.d
    public static final f1<s1.n, m> i(@dl.d s1.n.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return f4337g;
    }

    @dl.d
    public static final f1<s1.r, m> j(@dl.d s1.r.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return f4338h;
    }

    public static final float k(float f10, float f11, float f12) {
        return (f10 * (1 - f12)) + (f11 * f12);
    }
}
