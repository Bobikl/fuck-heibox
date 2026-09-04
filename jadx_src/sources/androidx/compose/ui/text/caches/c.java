package androidx.compose.ui.text.caches;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import dl.e;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.h;
import xh.i;

/* JADX INFO: compiled from: SimpleArrayMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0017\u0012\b\b\u0002\u0010C\u001a\u00020\u0005¢\u0006\u0004\bD\u0010=B\u001f\b\u0016\u0012\u0014\u0010E\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\bD\u0010FJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0004J\b\u0010\b\u001a\u00020\u0005H\u0004J\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u001a\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010 \u001a\u00020\rJ\u001f\u0010!\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b!\u0010\u0019J\u001e\u0010#\u001a\u00020\t2\u0016\u0010\"\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000J\u001f\u0010$\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b$\u0010\u0019J\u0017\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b%\u0010\u0016J\u001d\u0010&\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b(\u0010\u001cJ\u001f\u0010)\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b)\u0010\u0019J%\u0010,\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010*\u001a\u00028\u00012\u0006\u0010+\u001a\u00028\u0001¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u00100\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u000201H\u0016R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00104R\u001e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00107R\"\u0010>\u001a\u00020\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0017\u0010B\u001a\u00020\u00058G¢\u0006\f\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010;¨\u0006G"}, d2 = {"Landroidx/compose/ui/text/caches/c;", "K", androidx.exifinterface.media.a.X4, "", "key", "", "hash", RXScreenCaptureService.KEY_HEIGHT, "j", "Lkotlin/b2;", ak.av, "minimumCapacity", "d", "", "b", "(Ljava/lang/Object;)Z", "i", "value", "k", "(Ljava/lang/Object;)I", ak.aF, "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", UCropPlusActivity.ARG_INDEX, "m", "(I)Ljava/lang/Object;", ak.aD, "v", "(ILjava/lang/Object;)Ljava/lang/Object;", "l", "n", "array", "o", "p", "q", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Z", ak.aB, "t", "oldValue", "newValue", ak.aG, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "other", "equals", "hashCode", "", "toString", "", "[I", "hashes", "", "[Ljava/lang/Object;", "keyValues", "I", "g", "()I", RXScreenCaptureService.KEY_WIDTH, "(I)V", "_size", "x", "size$annotations", "()V", UiKitSpanObj.TYPE_SIZE, "capacity", "<init>", "map", "(Landroidx/compose/ui/text/caches/c;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class c<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private int[] hashes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] keyValues;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int _size;

    @i
    public c() {
        this(0, 1, null);
    }

    @i
    public c(int i10) {
        if (i10 == 0) {
            this.hashes = a.f16366a;
            this.keyValues = a.f16367b;
        } else {
            this.hashes = new int[i10];
            this.keyValues = new Object[i10 << 1];
        }
        this._size = 0;
    }

    public /* synthetic */ c(int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@e c<K, V> cVar) {
        this(0, 1, null);
        if (cVar != 0) {
            o(cVar);
        }
    }

    public static /* synthetic */ void y() {
    }

    public final void a() {
        if (this._size > 0) {
            this.hashes = a.f16366a;
            this.keyValues = a.f16367b;
            this._size = 0;
        }
        if (this._size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean b(K key) {
        return i(key) >= 0;
    }

    public final boolean c(V value) {
        return k(value) >= 0;
    }

    public final void d(int i10) {
        int i11 = this._size;
        int[] iArr = this.hashes;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            f0.o(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.keyValues, i10 << 1);
            f0.o(objArrCopyOf, "copyOf(this, newSize)");
            this.keyValues = objArrCopyOf;
        }
        if (this._size != i11) {
            throw new ConcurrentModificationException();
        }
    }

    @e
    public final V e(K key) {
        int i10 = i(key);
        if (i10 >= 0) {
            return (V) this.keyValues[(i10 << 1) + 1];
        }
        return null;
    }

    public boolean equals(@e Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof c) {
                c cVar = (c) other;
                int i10 = this._size;
                if (i10 != cVar._size) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    K kM = m(i11);
                    V vZ = z(i11);
                    Object objE = cVar.e(kM);
                    if (vZ == null) {
                        if (objE != null || !cVar.b(kM)) {
                            return false;
                        }
                    } else if (!f0.g(vZ, objE)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || this._size != ((Map) other).size()) {
                return false;
            }
            int i12 = this._size;
            for (int i13 = 0; i13 < i12; i13++) {
                K kM2 = m(i13);
                V vZ2 = z(i13);
                Object obj = ((Map) other).get(kM2);
                if (vZ2 == null) {
                    if (obj != null || !((Map) other).containsKey(kM2)) {
                        return false;
                    }
                } else if (!f0.g(vZ2, obj)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final V f(K key, V defaultValue) {
        int i10 = i(key);
        return i10 >= 0 ? (V) this.keyValues[(i10 << 1) + 1] : defaultValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    protected final int get_size() {
        return this._size;
    }

    protected final int h(@dl.d Object key, int hash) {
        f0.p(key, "key");
        int i10 = this._size;
        if (i10 == 0) {
            return -1;
        }
        int iA = a.a(this.hashes, i10, hash);
        if (iA < 0 || f0.g(key, this.keyValues[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.hashes[i11] == hash) {
            if (f0.g(key, this.keyValues[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.hashes[i12] == hash; i12--) {
            if (f0.g(key, this.keyValues[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.keyValues;
        int i10 = this._size;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final int i(@e Object key) {
        return key == null ? j() : h(key, key.hashCode());
    }

    protected final int j() {
        int i10 = this._size;
        if (i10 == 0) {
            return -1;
        }
        int iA = a.a(this.hashes, i10, 0);
        if (iA < 0 || this.keyValues[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.hashes[i11] == 0) {
            if (this.keyValues[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.hashes[i12] == 0; i12--) {
            if (this.keyValues[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int k(V value) {
        int i10 = this._size << 1;
        Object[] objArr = this.keyValues;
        if (value == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (f0.g(value, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final boolean l() {
        return this._size <= 0;
    }

    public final K m(int index) {
        return (K) this.keyValues[index << 1];
    }

    @e
    public final V n(K key, V value) {
        int iHashCode;
        int iH;
        int i10 = this._size;
        if (key == null) {
            iHashCode = 0;
            iH = j();
        } else {
            iHashCode = key.hashCode();
            iH = h(key, iHashCode);
        }
        if (iH >= 0) {
            int i11 = (iH << 1) + 1;
            Object[] objArr = this.keyValues;
            V v10 = (V) objArr[i11];
            objArr[i11] = value;
            return v10;
        }
        int i12 = ~iH;
        int[] iArr = this.hashes;
        if (i10 >= iArr.length) {
            int i13 = 4;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 >= 4) {
                i13 = 8;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            f0.o(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.keyValues, i13 << 1);
            f0.o(objArrCopyOf, "copyOf(this, newSize)");
            this.keyValues = objArrCopyOf;
            if (i10 != this._size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.hashes;
            int i14 = i12 + 1;
            m.a1(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.keyValues;
            m.c1(objArr2, objArr2, i14 << 1, i12 << 1, this._size << 1);
        }
        int i15 = this._size;
        if (i10 == i15) {
            int[] iArr3 = this.hashes;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.keyValues;
                int i16 = i12 << 1;
                objArr3[i16] = key;
                objArr3[i16 + 1] = value;
                this._size = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void o(@dl.d c<? extends K, ? extends V> array) {
        f0.p(array, "array");
        int i10 = array._size;
        d(this._size + i10);
        if (this._size != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                n(array.m(i11), array.z(i11));
            }
        } else if (i10 > 0) {
            m.a1(array.hashes, this.hashes, 0, 0, i10);
            m.c1(array.keyValues, this.keyValues, 0, 0, i10 << 1);
            this._size = i10;
        }
    }

    @e
    public final V p(K key, V value) {
        V vE = e(key);
        return vE == null ? n(key, value) : vE;
    }

    @e
    public final V q(K key) {
        int i10 = i(key);
        if (i10 >= 0) {
            return s(i10);
        }
        return null;
    }

    public final boolean r(K key, V value) {
        int i10 = i(key);
        if (i10 < 0 || !f0.g(value, z(i10))) {
            return false;
        }
        s(i10);
        return true;
    }

    @e
    public final V s(int index) {
        Object[] objArr = this.keyValues;
        int i10 = index << 1;
        V v10 = (V) objArr[i10 + 1];
        int i11 = this._size;
        if (i11 <= 1) {
            a();
        } else {
            int i12 = i11 - 1;
            int[] iArr = this.hashes;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                if (index < i12) {
                    int i13 = index + 1;
                    int i14 = i12 + 1;
                    m.a1(iArr, iArr, index, i13, i14);
                    Object[] objArr2 = this.keyValues;
                    m.c1(objArr2, objArr2, i10, i13 << 1, i14 << 1);
                }
                Object[] objArr3 = this.keyValues;
                int i15 = i12 << 1;
                objArr3[i15] = null;
                objArr3[i15 + 1] = null;
            } else {
                int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
                int[] iArr2 = new int[i16];
                this.hashes = iArr2;
                this.keyValues = new Object[i16 << 1];
                if (index > 0) {
                    m.a1(iArr, iArr2, 0, 0, index);
                    m.c1(objArr, this.keyValues, 0, 0, i10);
                }
                if (index < i12) {
                    int i17 = index + 1;
                    int i18 = i12 + 1;
                    m.a1(iArr, this.hashes, index, i17, i18);
                    m.c1(objArr, this.keyValues, i10, i17 << 1, i18 << 1);
                }
            }
            if (i11 != this._size) {
                throw new ConcurrentModificationException();
            }
            this._size = i12;
        }
        return v10;
    }

    @e
    public final V t(K key, V value) {
        int i10 = i(key);
        if (i10 >= 0) {
            return v(i10, value);
        }
        return null;
    }

    @dl.d
    public String toString() {
        if (l()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this._size * 28);
        sb2.append('{');
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            K kM = m(i11);
            if (kM != this) {
                sb2.append(kM);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append(n5.a.f132013h);
            V vZ = z(i11);
            if (vZ != this) {
                sb2.append(vZ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        f0.o(string, "buffer.toString()");
        return string;
    }

    public final boolean u(K key, V oldValue, V newValue) {
        int i10 = i(key);
        if (i10 < 0 || z(i10) != oldValue) {
            return false;
        }
        v(i10, newValue);
        return true;
    }

    public final V v(int index, V value) {
        int i10 = (index << 1) + 1;
        Object[] objArr = this.keyValues;
        V v10 = (V) objArr[i10];
        objArr[i10] = value;
        return v10;
    }

    protected final void w(int i10) {
        this._size = i10;
    }

    @h(name = UiKitSpanObj.TYPE_SIZE)
    public final int x() {
        return this._size;
    }

    public final V z(int index) {
        return (V) this.keyValues[(index << 1) + 1];
    }
}
