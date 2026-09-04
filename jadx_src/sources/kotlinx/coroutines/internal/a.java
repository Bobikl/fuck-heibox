package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ArrayQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u0003R\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/internal/a;", "", androidx.exifinterface.media.a.f23244d5, "Lkotlin/b2;", ak.aF, "element", ak.av, "(Ljava/lang/Object;)V", "e", "()Ljava/lang/Object;", "b", "", "[Ljava/lang/Object;", "elements", "", "I", "head", "tail", "", "d", "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] elements = new Object[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int head;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int tail;

    private final void c() {
        Object[] objArr = this.elements;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        kotlin.collections.m.l1(objArr, objArr2, 0, this.head, 0, 10, null);
        Object[] objArr3 = this.elements;
        int length2 = objArr3.length;
        int i10 = this.head;
        kotlin.collections.m.l1(objArr3, objArr2, length2 - i10, 0, i10, 4, null);
        this.elements = objArr2;
        this.head = 0;
        this.tail = length;
    }

    public final void a(@dl.d T element) {
        Object[] objArr = this.elements;
        int i10 = this.tail;
        objArr[i10] = element;
        int length = (objArr.length - 1) & (i10 + 1);
        this.tail = length;
        if (length == this.head) {
            c();
        }
    }

    public final void b() {
        this.head = 0;
        this.tail = 0;
        this.elements = new Object[this.elements.length];
    }

    public final boolean d() {
        return this.head == this.tail;
    }

    @dl.e
    public final T e() {
        int i10 = this.head;
        if (i10 == this.tail) {
            return null;
        }
        Object[] objArr = this.elements;
        T t10 = (T) objArr[i10];
        objArr[i10] = null;
        this.head = (i10 + 1) & (objArr.length - 1);
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
