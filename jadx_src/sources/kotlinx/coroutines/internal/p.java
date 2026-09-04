package kotlinx.coroutines.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: InlineList.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0088\u0001\u0017\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/internal/p;", androidx.exifinterface.media.a.S4, "", "element", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/b2;", "action", "f", "(Ljava/lang/Object;Lyh/l;)V", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", "g", "(Ljava/lang/Object;)I", "other", "", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Z", ak.av, "Ljava/lang/Object;", "holder", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@xh.f
public final class p<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Object holder;

    private /* synthetic */ p(Object obj) {
        this.holder = obj;
    }

    public static final /* synthetic */ p a(Object obj) {
        return new p(obj);
    }

    @dl.d
    public static <E> Object b(@dl.e Object obj) {
        return obj;
    }

    public static /* synthetic */ Object c(Object obj, int i10, kotlin.jvm.internal.u uVar) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return b(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof p) && kotlin.jvm.internal.f0.g(obj, ((p) obj2).getHolder());
    }

    public static final boolean e(Object obj, Object obj2) {
        return kotlin.jvm.internal.f0.g(obj, obj2);
    }

    public static final void f(Object obj, @dl.d yh.l<? super E, b2> lVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            lVar.invoke(obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                lVar.invoke((Object) arrayList.get(size));
            }
        }
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @dl.d
    public static final Object h(Object obj, E e10) {
        if (obj == null) {
            return b(e10);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e10);
            return b(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e10);
        return b(arrayList);
    }

    public static String i(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.holder, obj);
    }

    public int hashCode() {
        return g(this.holder);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final /* synthetic */ Object getHolder() {
        return this.holder;
    }

    public String toString() {
        return i(this.holder);
    }
}
