package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010$\u001a\u00020\u001fø\u0001\u0001¢\u0006\u0004\b%\u0010&JK\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032.\b\b\u0010\n\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u000e\u001a\u00020\b\"\u0004\b\u0001\u0010\r2\u0006\u0010\u0004\u001a\u00028\u00012,\u0010\n\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u000e\u0010\u000fJK\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032.\b\b\u0010\n\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fJI\u0010\u0011\u001a\u00020\b\"\u0004\b\u0001\u0010\r2\u0006\u0010\u0004\u001a\u00028\u00012,\u0010\n\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u0011\u0010\u000fJ&\u0010\u0013\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\t¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\t¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010#\u0088\u0001$\u0092\u0001\u00020\u001fø\u0001\u0001\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/runtime/Updater;", androidx.exifinterface.media.a.f23244d5, "", "", "value", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "Lkotlin/b2;", "Lkotlin/t;", "block", "i", "(Landroidx/compose/runtime/p;ILyh/p;)V", androidx.exifinterface.media.a.X4, "j", "(Landroidx/compose/runtime/p;Ljava/lang/Object;Lyh/p;)V", "m", "n", "Lkotlin/Function1;", "g", "(Landroidx/compose/runtime/p;Lyh/l;)V", RXScreenCaptureService.KEY_HEIGHT, "", "k", "(Landroidx/compose/runtime/p;)Ljava/lang/String;", "f", "(Landroidx/compose/runtime/p;)I", "other", "", ak.aF, "(Landroidx/compose/runtime/p;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/p;", ak.av, "Landroidx/compose/runtime/p;", "getComposer$annotations", "()V", "composer", "b", "(Landroidx/compose/runtime/p;)Landroidx/compose/runtime/p;", "runtime_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class Updater<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final p composer;

    private /* synthetic */ Updater(p pVar) {
        this.composer = pVar;
    }

    public static final /* synthetic */ Updater a(p pVar) {
        return new Updater(pVar);
    }

    @dl.d
    public static <T> p b(@dl.d p composer) {
        kotlin.jvm.internal.f0.p(composer, "composer");
        return composer;
    }

    public static boolean c(p pVar, Object obj) {
        return (obj instanceof Updater) && kotlin.jvm.internal.f0.g(pVar, ((Updater) obj).getComposer());
    }

    public static final boolean d(p pVar, p pVar2) {
        return kotlin.jvm.internal.f0.g(pVar, pVar2);
    }

    @kotlin.r0
    public static /* synthetic */ void e() {
    }

    public static int f(p pVar) {
        return pVar.hashCode();
    }

    public static final void g(p pVar, @dl.d final yh.l<? super T, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        if (pVar.D()) {
            pVar.e(kotlin.b2.f124493a, new yh.p<T, kotlin.b2, kotlin.b2>() { // from class: androidx.compose.runtime.Updater$init$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(T t10, @dl.d kotlin.b2 it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    block.invoke(t10);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj, kotlin.b2 b2Var) {
                    a(obj, b2Var);
                    return kotlin.b2.f124493a;
                }
            });
        }
    }

    public static final void h(p pVar, @dl.d final yh.l<? super T, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        pVar.e(kotlin.b2.f124493a, new yh.p<T, kotlin.b2, kotlin.b2>() { // from class: androidx.compose.runtime.Updater$reconcile$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(T t10, @dl.d kotlin.b2 it) {
                kotlin.jvm.internal.f0.p(it, "it");
                block.invoke(t10);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj, kotlin.b2 b2Var) {
                a(obj, b2Var);
                return kotlin.b2.f124493a;
            }
        });
    }

    public static final void i(p pVar, int i10, @dl.d yh.p<? super T, ? super Integer, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        if (pVar.D() || !kotlin.jvm.internal.f0.g(pVar.U(), Integer.valueOf(i10))) {
            pVar.N(Integer.valueOf(i10));
            pVar.e(Integer.valueOf(i10), block);
        }
    }

    public static final <V> void j(p pVar, V v10, @dl.d yh.p<? super T, ? super V, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        if (pVar.D() || !kotlin.jvm.internal.f0.g(pVar.U(), v10)) {
            pVar.N(v10);
            pVar.e(v10, block);
        }
    }

    public static String k(p pVar) {
        return "Updater(composer=" + pVar + ')';
    }

    public static final void m(p pVar, int i10, @dl.d yh.p<? super T, ? super Integer, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        boolean zD = pVar.D();
        if (zD || !kotlin.jvm.internal.f0.g(pVar.U(), Integer.valueOf(i10))) {
            pVar.N(Integer.valueOf(i10));
            if (zD) {
                return;
            }
            pVar.e(Integer.valueOf(i10), block);
        }
    }

    public static final <V> void n(p pVar, V v10, @dl.d yh.p<? super T, ? super V, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        boolean zD = pVar.D();
        if (zD || !kotlin.jvm.internal.f0.g(pVar.U(), v10)) {
            pVar.N(v10);
            if (zD) {
                return;
            }
            pVar.e(v10, block);
        }
    }

    public boolean equals(Object obj) {
        return c(this.composer, obj);
    }

    public int hashCode() {
        return f(this.composer);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final /* synthetic */ p getComposer() {
        return this.composer;
    }

    public String toString() {
        return k(this.composer);
    }
}
