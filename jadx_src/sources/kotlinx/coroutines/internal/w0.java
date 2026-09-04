package kotlinx.coroutines.internal;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.internal.x0;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes5.dex */
@z1
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b3\u0010\u0012J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082\u0010¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082\u0010¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0019\u001a\u0004\u0018\u00018\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ&\u0010\u001d\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\b¢\u0006\u0004\b\u001d\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J.\u0010\"\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00028\u00002\u0014\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\b¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b&\u0010\u001bJ\u0017\u0010(\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u0006H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0001¢\u0006\u0004\b*\u0010 R \u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010/\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\nR\u0011\u00102\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lkotlinx/coroutines/internal/w0;", "Lkotlinx/coroutines/internal/x0;", "", androidx.exifinterface.media.a.f23244d5, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "i", "Lkotlin/b2;", "q", "(I)V", "p", "", "j", "()[Lkotlinx/coroutines/internal/x0;", "r", "(II)V", "d", "()V", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "value", "", "predicate", "e", "(Lyh/l;)Lkotlinx/coroutines/internal/x0;", "()Lkotlinx/coroutines/internal/x0;", "n", "m", "node", "b", "(Lkotlinx/coroutines/internal/x0;)V", "cond", ak.aF, "(Lkotlinx/coroutines/internal/x0;Lyh/l;)Z", "k", "(Lkotlinx/coroutines/internal/x0;)Z", "f", UCropPlusActivity.ARG_INDEX, "l", "(I)Lkotlinx/coroutines/internal/x0;", ak.av, "[Lkotlinx/coroutines/internal/x0;", "g", "()I", "o", UiKitSpanObj.TYPE_SIZE, RXScreenCaptureService.KEY_HEIGHT, "()Z", "isEmpty", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class w0<T extends x0 & Comparable<? super T>> {

    @dl.d
    private volatile /* synthetic */ int _size = 0;

    @dl.e
    private T[] a;

    private final T[] j() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new x0[4];
            this.a = tArr2;
            return tArr2;
        }
        if (get_size() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, get_size() * 2);
        kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((x0[]) objArrCopyOf);
        this.a = tArr3;
        return tArr3;
    }

    private final void o(int i10) {
        this._size = i10;
    }

    private final void p(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= get_size()) {
                return;
            }
            T[] tArr = this.a;
            kotlin.jvm.internal.f0.m(tArr);
            int i12 = i11 + 1;
            if (i12 < get_size()) {
                T t10 = tArr[i12];
                kotlin.jvm.internal.f0.m(t10);
                T t11 = tArr[i11];
                kotlin.jvm.internal.f0.m(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            kotlin.jvm.internal.f0.m(t12);
            T t13 = tArr[i11];
            kotlin.jvm.internal.f0.m(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            r(i10, i11);
            i10 = i11;
        }
    }

    private final void q(int i10) {
        while (i10 > 0) {
            T[] tArr = this.a;
            kotlin.jvm.internal.f0.m(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            kotlin.jvm.internal.f0.m(t10);
            T t11 = tArr[i10];
            kotlin.jvm.internal.f0.m(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            r(i10, i11);
            i10 = i11;
        }
    }

    private final void r(int i10, int j10) {
        T[] tArr = this.a;
        kotlin.jvm.internal.f0.m(tArr);
        T t10 = tArr[j10];
        kotlin.jvm.internal.f0.m(t10);
        T t11 = tArr[i10];
        kotlin.jvm.internal.f0.m(t11);
        tArr[i10] = t10;
        tArr[j10] = t11;
        t10.setIndex(i10);
        t11.setIndex(j10);
    }

    @kotlin.r0
    public final void a(@dl.d T node) {
        node.a(this);
        x0[] x0VarArrJ = j();
        int i10 = get_size();
        o(i10 + 1);
        x0VarArrJ[i10] = node;
        node.setIndex(i10);
        q(i10);
    }

    public final void b(@dl.d T node) {
        synchronized (this) {
            a(node);
            b2 b2Var = b2.f124493a;
        }
    }

    public final boolean c(@dl.d T node, @dl.d yh.l<? super T, Boolean> cond) {
        boolean z10;
        synchronized (this) {
            try {
                if (cond.invoke(f()).booleanValue()) {
                    a(node);
                    z10 = true;
                } else {
                    z10 = false;
                }
                kotlin.jvm.internal.c0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.c0.d(1);
                kotlin.jvm.internal.c0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.c0.c(1);
        return z10;
    }

    public final void d() {
        synchronized (this) {
            T[] tArr = this.a;
            if (tArr != null) {
                kotlin.collections.m.w2(tArr, null, 0, 0, 6, null);
            }
            this._size = 0;
            b2 b2Var = b2.f124493a;
        }
    }

    @dl.e
    public final T e(@dl.d yh.l<? super T, Boolean> predicate) {
        T t10;
        synchronized (this) {
            int i10 = 0;
            int i11 = get_size();
            while (true) {
                t10 = null;
                if (i10 >= i11) {
                    break;
                }
                T[] tArr = this.a;
                if (tArr != null) {
                    t10 = (Object) tArr[i10];
                }
                kotlin.jvm.internal.f0.m(t10);
                if (predicate.invoke(t10).booleanValue()) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    @kotlin.r0
    @dl.e
    public final T f() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean h() {
        return get_size() == 0;
    }

    @dl.e
    public final T i() {
        T t10;
        synchronized (this) {
            t10 = (T) f();
        }
        return t10;
    }

    public final boolean k(@dl.d T node) {
        boolean z10;
        synchronized (this) {
            if (node.b() == null) {
                z10 = false;
            } else {
                l(node.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    @dl.d
    @kotlin.r0
    public final T l(int index) {
        T[] tArr = this.a;
        kotlin.jvm.internal.f0.m(tArr);
        o(get_size() - 1);
        if (index < get_size()) {
            r(index, get_size());
            int i10 = (index - 1) / 2;
            if (index > 0) {
                T t10 = tArr[index];
                kotlin.jvm.internal.f0.m(t10);
                T t11 = tArr[i10];
                kotlin.jvm.internal.f0.m(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    r(index, i10);
                    q(i10);
                } else {
                    p(index);
                }
            } else {
                p(index);
            }
        }
        T t12 = tArr[get_size()];
        kotlin.jvm.internal.f0.m(t12);
        t12.a(null);
        t12.setIndex(-1);
        tArr[get_size()] = null;
        return t12;
    }

    @dl.e
    public final T m(@dl.d yh.l<? super T, Boolean> predicate) {
        synchronized (this) {
            int i10 = 1;
            try {
                x0 x0VarF = f();
                T t10 = null;
                if (x0VarF == null) {
                    kotlin.jvm.internal.c0.d(2);
                    return null;
                }
                if (predicate.invoke(x0VarF).booleanValue()) {
                    t10 = (T) l(0);
                }
                kotlin.jvm.internal.c0.d(i10);
                return t10;
            } finally {
                kotlin.jvm.internal.c0.d(i10);
                kotlin.jvm.internal.c0.c(i10);
            }
        }
    }

    @dl.e
    public final T n() {
        T t10;
        synchronized (this) {
            t10 = get_size() > 0 ? (T) l(0) : null;
        }
        return t10;
    }
}
