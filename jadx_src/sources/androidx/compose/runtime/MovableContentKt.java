package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: MovableContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a=\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u00062\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\r\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b2\u001d\u0010\u0003\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aa\u0010\u0011\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b\"\u0004\b\u0002\u0010\u000f2#\u0010\u0003\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001as\u0010\u0015\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u00132)\u0010\u0003\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aG\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0018\"\u0004\b\u0000\u0010\u00172\u001c\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u0019\u0010\t\u001aY\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0018\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00062\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001a\u0010\u000e\u001ak\u0010\u001b\u001a$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0018\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\u000b2(\u0010\u0003\u001a$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001b\u0010\u0012\u001a}\u0010\u001c\u001a*\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0018\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\u000b\"\u0004\b\u0003\u0010\u000f2.\u0010\u0003\u001a*\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001c\u0010\u0016\"\u0014\u0010\u001f\u001a\u00020\u001d8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u001e¨\u0006 "}, d2 = {"Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", ak.av, "(Lyh/p;)Lyh/p;", "P", "Lkotlin/Function1;", "b", "(Lyh/q;)Lyh/q;", "P1", "P2", "Lkotlin/Function2;", ak.aF, "(Lyh/r;)Lyh/r;", "P3", "Lkotlin/Function3;", "d", "(Lyh/s;)Lyh/s;", "P4", "Lkotlin/Function4;", "e", "(Lyh/t;)Lyh/t;", "R", "Lkotlin/t;", "f", "g", RXScreenCaptureService.KEY_HEIGHT, "i", "", "I", "movableContentKey", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class MovableContentKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12387a = 126665345;

    @dl.d
    public static final yh.p<p, Integer, kotlin.b2> a(@dl.d final yh.p<? super p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        final x0 x0Var = new x0(androidx.compose.runtime.internal.b.c(-1079330685, true, new yh.q<kotlin.b2, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @h
            public final void a(@dl.d kotlin.b2 it, @dl.e p pVar, int i10) {
                kotlin.jvm.internal.f0.p(it, "it");
                if ((i10 & 81) == 16 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1079330685, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:37)");
                }
                content.invoke(pVar, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(kotlin.b2 b2Var, p pVar, Integer num) {
                a(b2Var, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }
        }));
        return androidx.compose.runtime.internal.b.c(-642339857, true, new yh.p<p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @h
            public final void a(@dl.e p pVar, int i10) {
                if ((i10 & 11) == 2 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-642339857, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:38)");
                }
                pVar.P(x0Var, kotlin.b2.f124493a);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(p pVar, Integer num) {
                a(pVar, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @dl.d
    public static final <P> yh.q<P, p, Integer, kotlin.b2> b(@dl.d yh.q<? super P, ? super p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        final x0 x0Var = new x0(content);
        return androidx.compose.runtime.internal.b.c(-434707029, true, new yh.q<P, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @h
            public final void a(P p10, @dl.e p pVar, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (pVar.s(p10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) == 18 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-434707029, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:63)");
                }
                pVar.P(x0Var, p10);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj, p pVar, Integer num) {
                a(obj, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @dl.d
    public static final <P1, P2> yh.r<P1, P2, p, Integer, kotlin.b2> c(@dl.d final yh.r<? super P1, ? super P2, ? super p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        final x0 x0Var = new x0(androidx.compose.runtime.internal.b.c(1849814513, true, new yh.q<Pair<? extends P1, ? extends P2>, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @h
            public final void a(@dl.d Pair<? extends P1, ? extends P2> it, @dl.e p pVar, int i10) {
                int i11;
                kotlin.jvm.internal.f0.p(it, "it");
                if ((i10 & 14) == 0) {
                    i11 = (pVar.s(it) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) == 18 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1849814513, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:87)");
                }
                content.U0(it.e(), it.f(), pVar, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj, p pVar, Integer num) {
                a((Pair) obj, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }
        }));
        return androidx.compose.runtime.internal.b.c(-1200019734, true, new yh.r<P1, P2, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.r
            public /* bridge */ /* synthetic */ kotlin.b2 U0(Object obj, Object obj2, p pVar, Integer num) {
                a(obj, obj2, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }

            @h
            public final void a(P1 p10, P2 p11, @dl.e p pVar, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (pVar.s(p10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= pVar.s(p11) ? 32 : 16;
                }
                if ((i11 & bb.c.b.f30586db) == 146 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1200019734, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:88)");
                }
                pVar.P(x0Var, kotlin.c1.a(p10, p11));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        });
    }

    @dl.d
    public static final <P1, P2, P3> yh.s<P1, P2, P3, p, Integer, kotlin.b2> d(@dl.d final yh.s<? super P1, ? super P2, ? super P3, ? super p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        final x0 x0Var = new x0(androidx.compose.runtime.internal.b.c(-284417101, true, new yh.q<Pair<? extends Pair<? extends P1, ? extends P2>, ? extends P3>, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @h
            public final void a(@dl.d Pair<? extends Pair<? extends P1, ? extends P2>, ? extends P3> it, @dl.e p pVar, int i10) {
                kotlin.jvm.internal.f0.p(it, "it");
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-284417101, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:114)");
                }
                content.N0(it.e().e(), it.e().f(), it.f(), pVar, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj, p pVar, Integer num) {
                a((Pair) obj, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }
        }));
        return androidx.compose.runtime.internal.b.c(-1083870185, true, new yh.s<P1, P2, P3, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.s
            public /* bridge */ /* synthetic */ kotlin.b2 N0(Object obj, Object obj2, Object obj3, p pVar, Integer num) {
                a(obj, obj2, obj3, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }

            @h
            public final void a(P1 p10, P2 p11, P3 p12, @dl.e p pVar, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (pVar.s(p10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= pVar.s(p11) ? 32 : 16;
                }
                if ((i10 & bb.c.b.f30796me) == 0) {
                    i11 |= pVar.s(p12) ? 256 : 128;
                }
                if ((i11 & bb.c.f.br) == 1170 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1083870185, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:117)");
                }
                pVar.P(x0Var, kotlin.c1.a(kotlin.c1.a(p10, p11), p12));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        });
    }

    @dl.d
    public static final <P1, P2, P3, P4> yh.t<P1, P2, P3, P4, p, Integer, kotlin.b2> e(@dl.d final yh.t<? super P1, ? super P2, ? super P3, ? super P4, ? super p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        final x0 x0Var = new x0(androidx.compose.runtime.internal.b.c(1876318581, true, new yh.q<Pair<? extends Pair<? extends P1, ? extends P2>, ? extends Pair<? extends P3, ? extends P4>>, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @h
            public final void a(@dl.d Pair<? extends Pair<? extends P1, ? extends P2>, ? extends Pair<? extends P3, ? extends P4>> it, @dl.e p pVar, int i10) {
                kotlin.jvm.internal.f0.p(it, "it");
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1876318581, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:143)");
                }
                content.Z0(it.e().e(), it.e().f(), it.f().e(), it.f().f(), pVar, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj, p pVar, Integer num) {
                a((Pair) obj, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }
        }));
        return androidx.compose.runtime.internal.b.c(-1741877681, true, new yh.t<P1, P2, P3, P4, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.t
            public /* bridge */ /* synthetic */ kotlin.b2 Z0(Object obj, Object obj2, Object obj3, Object obj4, p pVar, Integer num) {
                a(obj, obj2, obj3, obj4, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }

            @h
            public final void a(P1 p10, P2 p11, P3 p12, P4 p13, @dl.e p pVar, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (pVar.s(p10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= pVar.s(p11) ? 32 : 16;
                }
                if ((i10 & bb.c.b.f30796me) == 0) {
                    i11 |= pVar.s(p12) ? 256 : 128;
                }
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    i11 |= pVar.s(p13) ? 2048 : 1024;
                }
                if ((i11 & 46811) == 9362 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1741877681, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:146)");
                }
                pVar.P(x0Var, kotlin.c1.a(kotlin.c1.a(p10, p11), kotlin.c1.a(p12, p13)));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        });
    }

    @dl.d
    @i(scheme = "[0[0]:[_]]")
    public static final <R> yh.q<R, p, Integer, kotlin.b2> f(@dl.d final yh.q<? super R, ? super p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        final x0 x0Var = new x0(androidx.compose.runtime.internal.b.c(250838178, true, new yh.q<R, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @h
            public final void a(R r10, @dl.e p pVar, int i10) {
                if ((i10 & 14) == 0) {
                    i10 |= pVar.s(r10) ? 4 : 2;
                }
                if ((i10 & 91) == 18 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(250838178, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:170)");
                }
                content.invoke(r10, pVar, Integer.valueOf(i10 & 14));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj, p pVar, Integer num) {
                a(obj, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }
        }));
        return androidx.compose.runtime.internal.b.c(506997506, true, new yh.q<R, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @h
            public final void a(R r10, @dl.e p pVar, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (pVar.s(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) == 18 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(506997506, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:171)");
                }
                pVar.P(x0Var, r10);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj, p pVar, Integer num) {
                a(obj, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @dl.d
    public static final <R, P> yh.r<R, P, p, Integer, kotlin.b2> g(@dl.d final yh.r<? super R, ? super P, ? super p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        final x0 x0Var = new x0(androidx.compose.runtime.internal.b.c(812082854, true, new yh.q<Pair<? extends R, ? extends P>, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @h
            public final void a(@dl.d Pair<? extends R, ? extends P> it, @dl.e p pVar, int i10) {
                int i11;
                kotlin.jvm.internal.f0.p(it, "it");
                if ((i10 & 14) == 0) {
                    i11 = (pVar.s(it) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) == 18 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(812082854, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:197)");
                }
                content.U0(it.e(), it.f(), pVar, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj, p pVar, Integer num) {
                a((Pair) obj, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }
        }));
        return androidx.compose.runtime.internal.b.c(627354118, true, new yh.r<R, P, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.r
            public /* bridge */ /* synthetic */ kotlin.b2 U0(Object obj, Object obj2, p pVar, Integer num) {
                a(obj, obj2, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }

            @h
            public final void a(R r10, P p10, @dl.e p pVar, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (pVar.s(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= pVar.s(p10) ? 32 : 16;
                }
                if ((i11 & bb.c.b.f30586db) == 146 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(627354118, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:198)");
                }
                pVar.P(x0Var, kotlin.c1.a(r10, p10));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        });
    }

    @dl.d
    public static final <R, P1, P2> yh.s<R, P1, P2, p, Integer, kotlin.b2> h(@dl.d final yh.s<? super R, ? super P1, ? super P2, ? super p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        final x0 x0Var = new x0(androidx.compose.runtime.internal.b.c(-1322148760, true, new yh.q<Pair<? extends Pair<? extends R, ? extends P1>, ? extends P2>, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @h
            public final void a(@dl.d Pair<? extends Pair<? extends R, ? extends P1>, ? extends P2> it, @dl.e p pVar, int i10) {
                kotlin.jvm.internal.f0.p(it, "it");
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1322148760, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:224)");
                }
                content.N0(it.e().e(), it.e().f(), it.f(), pVar, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj, p pVar, Integer num) {
                a((Pair) obj, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }
        }));
        return androidx.compose.runtime.internal.b.c(583402949, true, new yh.s<R, P1, P2, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.s
            public /* bridge */ /* synthetic */ kotlin.b2 N0(Object obj, Object obj2, Object obj3, p pVar, Integer num) {
                a(obj, obj2, obj3, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }

            @h
            public final void a(R r10, P1 p10, P2 p11, @dl.e p pVar, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (pVar.s(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= pVar.s(p10) ? 32 : 16;
                }
                if ((i10 & bb.c.b.f30796me) == 0) {
                    i11 |= pVar.s(p11) ? 256 : 128;
                }
                if ((i11 & bb.c.f.br) == 1170 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(583402949, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:227)");
                }
                pVar.P(x0Var, kotlin.c1.a(kotlin.c1.a(r10, p10), p11));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        });
    }

    @dl.d
    public static final <R, P1, P2, P3> yh.t<R, P1, P2, P3, p, Integer, kotlin.b2> i(@dl.d final yh.t<? super R, ? super P1, ? super P2, ? super P3, ? super p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        final x0 x0Var = new x0(androidx.compose.runtime.internal.b.c(838586922, true, new yh.q<Pair<? extends Pair<? extends R, ? extends P1>, ? extends Pair<? extends P2, ? extends P3>>, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @h
            public final void a(@dl.d Pair<? extends Pair<? extends R, ? extends P1>, ? extends Pair<? extends P2, ? extends P3>> it, @dl.e p pVar, int i10) {
                kotlin.jvm.internal.f0.p(it, "it");
                if (ComposerKt.g0()) {
                    ComposerKt.w0(838586922, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:253)");
                }
                content.Z0(it.e().e(), it.e().f(), it.f().e(), it.f().f(), pVar, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj, p pVar, Integer num) {
                a((Pair) obj, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }
        }));
        return androidx.compose.runtime.internal.b.c(1468683306, true, new yh.t<R, P1, P2, P3, p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.t
            public /* bridge */ /* synthetic */ kotlin.b2 Z0(Object obj, Object obj2, Object obj3, Object obj4, p pVar, Integer num) {
                a(obj, obj2, obj3, obj4, pVar, num.intValue());
                return kotlin.b2.f124493a;
            }

            @h
            public final void a(R r10, P1 p10, P2 p11, P3 p12, @dl.e p pVar, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (pVar.s(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= pVar.s(p10) ? 32 : 16;
                }
                if ((i10 & bb.c.b.f30796me) == 0) {
                    i11 |= pVar.s(p11) ? 256 : 128;
                }
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    i11 |= pVar.s(p12) ? 2048 : 1024;
                }
                if ((i11 & 46811) == 9362 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1468683306, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:256)");
                }
                pVar.P(x0Var, kotlin.c1.a(kotlin.c1.a(r10, p10), kotlin.c1.a(p11, p12)));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        });
    }
}
