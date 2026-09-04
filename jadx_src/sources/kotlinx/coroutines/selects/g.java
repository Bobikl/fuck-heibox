package kotlinx.coroutines.selects;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.c0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.t1;
import yh.l;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aN\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001aG\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\u000bH\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\" \u0010\u0015\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\" \u0010\u0019\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012\"\u001a\u0010\u001c\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u0012\u0004\b\u001b\u0010\u0014\"\u001a\u0010\u001e\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u0012\u0004\b\u001d\u0010\u0014\"\u001a\u0010#\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"R", "Lkotlinx/coroutines/selects/a;", "Lkotlin/time/e;", l5.a.f130839h0, "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "", "block", "Lkotlin/b2;", "k", "(Lkotlinx/coroutines/selects/a;JLyh/l;)V", "Lkotlin/t;", "builder", "l", "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "getNOT_SELECTED$annotations", "()V", "NOT_SELECTED", "b", "d", "getALREADY_SELECTED$annotations", "ALREADY_SELECTED", ak.aF, "getUNDECIDED$annotations", "UNDECIDED", "getRESUMED$annotations", "RESUMED", "Lkotlinx/coroutines/selects/i;", "e", "Lkotlinx/coroutines/selects/i;", "getSelectOpSequenceNumber$annotations", "selectOpSequenceNumber", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Object f130430a = new o0("NOT_SELECTED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final Object f130431b = new o0("ALREADY_SELECTED");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final Object f130432c = new o0("UNDECIDED");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Object f130433d = new o0("RESUMED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final i f130434e = new i();

    @dl.d
    public static final Object d() {
        return f130431b;
    }

    public static /* synthetic */ void e() {
    }

    @dl.d
    public static final Object f() {
        return f130430a;
    }

    public static /* synthetic */ void g() {
    }

    private static /* synthetic */ void h() {
    }

    private static /* synthetic */ void i() {
    }

    private static /* synthetic */ void j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t1
    public static final <R> void k(@dl.d a<? super R> aVar, long j10, @dl.d l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar) {
        aVar.t(DelayKt.e(j10), lVar);
    }

    @dl.e
    public static final <R> Object l(@dl.d l<? super a<? super R>, b2> lVar, @dl.d kotlin.coroutines.c<? super R> cVar) throws Throwable {
        SelectInstance selectInstance = new SelectInstance(cVar);
        try {
            lVar.invoke(selectInstance);
        } catch (Throwable th2) {
            selectInstance.x0(th2);
        }
        Object objW0 = selectInstance.w0();
        if (objW0 == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objW0;
    }

    private static final <R> Object m(l<? super a<? super R>, b2> lVar, kotlin.coroutines.c<? super R> cVar) throws Throwable {
        c0.e(0);
        SelectInstance selectInstance = new SelectInstance(cVar);
        try {
            lVar.invoke(selectInstance);
        } catch (Throwable th2) {
            selectInstance.x0(th2);
        }
        Object objW0 = selectInstance.w0();
        if (objW0 == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        c0.e(1);
        return objW0;
    }
}
