package kotlinx.coroutines.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlinx.coroutines.internal.l0;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0014\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0010\u0092\u0001\u0004\u0018\u00010\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/internal/m0;", "Lkotlinx/coroutines/internal/l0;", androidx.exifinterface.media.a.R4, "", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", "g", "(Ljava/lang/Object;)I", "other", "", ak.aF, "(Ljava/lang/Object;Ljava/lang/Object;)Z", ak.av, "Ljava/lang/Object;", "value", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;)Z", "isClosed", "f", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/l0;", "getSegment$annotations", "()V", "segment", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@xh.f
public final class m0<S extends l0<S>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Object value;

    private /* synthetic */ m0(Object obj) {
        this.value = obj;
    }

    public static final /* synthetic */ m0 a(Object obj) {
        return new m0(obj);
    }

    @dl.d
    public static <S extends l0<S>> Object b(@dl.e Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof m0) && kotlin.jvm.internal.f0.g(obj, ((m0) obj2).getValue());
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.f0.g(obj, obj2);
    }

    public static /* synthetic */ void e() {
    }

    @dl.d
    public static final S f(Object obj) {
        if (obj == g.f130167b) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        if (obj != null) {
            return (S) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj == g.f130167b;
    }

    public static String i(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.value, obj);
    }

    public int hashCode() {
        return g(this.value);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final /* synthetic */ Object getValue() {
        return this.value;
    }

    public String toString() {
        return i(this.value);
    }
}
