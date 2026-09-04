package androidx.compose.runtime.collection;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: IdentityArrayMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0012\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001B\u0011\u0012\b\b\u0002\u0010/\u001a\u00020\u0005¢\u0006\u0004\b0\u0010-J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u000eJ\u0006\u0010\u0016\u001a\u00020\u0012JD\u0010\u001b\u001a\u00020\u001226\u0010\u001a\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\u0017H\u0086\bø\u0001\u0000J/\u0010\u001d\u001a\u00020\u00122!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\u001cH\u0086\bø\u0001\u0000JD\u0010\u001e\u001a\u00020\u001226\u0010\u001a\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0017H\u0086\bø\u0001\u0000R*\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\"\u0010.\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00061"}, d2 = {"Landroidx/compose/runtime/collection/b;", "", "Key", "Value", "key", "", ak.aF, "midIndex", "keyHash", "d", "", "j", "k", "b", "(Ljava/lang/Object;)Z", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lkotlin/b2;", "o", "(Ljava/lang/Object;Ljava/lang/Object;)V", "l", ak.av, "Lkotlin/Function2;", "Lkotlin/m0;", "name", "block", "m", "Lkotlin/Function1;", "n", "e", "", "[Ljava/lang/Object;", "g", "()[Ljava/lang/Object;", "p", "([Ljava/lang/Object;)V", Constants.PARAM_KEYS, "i", "r", "values", "I", RXScreenCaptureService.KEY_HEIGHT, "()I", "q", "(I)V", UiKitSpanObj.TYPE_SIZE, "capacity", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class b<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] keys;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] values;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int size;

    public b() {
        this(0, 1, null);
    }

    public b(int i10) {
        this.keys = new Object[i10];
        this.values = new Object[i10];
    }

    public /* synthetic */ b(int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    private final int c(Object key) {
        int iB = androidx.compose.runtime.b.b(key);
        int i10 = this.size - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj = this.keys[i12];
            int iB2 = androidx.compose.runtime.b.b(obj);
            if (iB2 < iB) {
                i11 = i12 + 1;
            } else {
                if (iB2 <= iB) {
                    return key == obj ? i12 : d(i12, key, iB);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    private final int d(int midIndex, Object key, int keyHash) {
        for (int i10 = midIndex - 1; -1 < i10; i10--) {
            Object obj = this.keys[i10];
            if (obj == key) {
                return i10;
            }
            if (androidx.compose.runtime.b.b(obj) != keyHash) {
                break;
            }
        }
        int i11 = midIndex + 1;
        int i12 = this.size;
        while (i11 < i12) {
            Object obj2 = this.keys[i11];
            if (obj2 == key) {
                return i11;
            }
            if (androidx.compose.runtime.b.b(obj2) != keyHash) {
                return -(i11 + 1);
            }
            i11++;
        }
        i11 = this.size;
        return -(i11 + 1);
    }

    public final void a() {
        this.size = 0;
        m.w2(this.keys, null, 0, 0, 6, null);
        m.w2(this.values, null, 0, 0, 6, null);
    }

    public final boolean b(@dl.d Key key) {
        f0.p(key, "key");
        return c(key) >= 0;
    }

    public final void e(@dl.d p<? super Key, ? super Value, b2> block) {
        f0.p(block, "block");
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = getKeys()[i10];
            f0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            block.invoke(obj, getValues()[i10]);
        }
    }

    @dl.e
    public final Value f(@dl.d Key key) {
        f0.p(key, "key");
        int iC = c(key);
        if (iC >= 0) {
            return (Value) this.values[iC];
        }
        return null;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Object[] getKeys() {
        return this.keys;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Object[] getValues() {
        return this.values;
    }

    public final boolean j() {
        return this.size == 0;
    }

    public final boolean k() {
        return this.size > 0;
    }

    public final boolean l(@dl.d Key key) {
        f0.p(key, "key");
        int iC = c(key);
        if (iC < 0) {
            return false;
        }
        int i10 = this.size;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i11 = iC + 1;
        m.c1(objArr, objArr, iC, i11, i10);
        m.c1(objArr2, objArr2, iC, i11, i10);
        int i12 = i10 - 1;
        objArr[i12] = null;
        objArr2[i12] = null;
        this.size = i12;
        return true;
    }

    public final void m(@dl.d p<? super Key, ? super Value, Boolean> block) {
        f0.p(block, "block");
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = getKeys()[i11];
            f0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!block.invoke(obj, getValues()[i11]).booleanValue()) {
                if (i10 != i11) {
                    getKeys()[i10] = obj;
                    getValues()[i10] = getValues()[i11];
                }
                i10++;
            }
        }
        if (getSize() > i10) {
            int size2 = getSize();
            for (int i12 = i10; i12 < size2; i12++) {
                getKeys()[i12] = null;
                getValues()[i12] = null;
            }
            q(i10);
        }
    }

    public final void n(@dl.d l<? super Value, Boolean> block) {
        f0.p(block, "block");
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = getKeys()[i11];
            f0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!block.invoke(getValues()[i11]).booleanValue()) {
                if (i10 != i11) {
                    getKeys()[i10] = obj;
                    getValues()[i10] = getValues()[i11];
                }
                i10++;
            }
        }
        if (getSize() > i10) {
            int size2 = getSize();
            for (int i12 = i10; i12 < size2; i12++) {
                getKeys()[i12] = null;
                getValues()[i12] = null;
            }
            q(i10);
        }
    }

    public final void o(@dl.d Key key, Value value) {
        f0.p(key, "key");
        int iC = c(key);
        if (iC >= 0) {
            this.values[iC] = value;
            return;
        }
        int i10 = -(iC + 1);
        int i11 = this.size;
        Object[] objArr = this.keys;
        boolean z10 = i11 == objArr.length;
        Object[] objArr2 = z10 ? new Object[i11 * 2] : objArr;
        int i12 = i10 + 1;
        m.c1(objArr, objArr2, i12, i10, i11);
        if (z10) {
            m.l1(this.keys, objArr2, 0, 0, i10, 6, null);
        }
        objArr2[i10] = key;
        this.keys = objArr2;
        Object[] objArr3 = z10 ? new Object[this.size * 2] : this.values;
        m.c1(this.values, objArr3, i12, i10, this.size);
        if (z10) {
            m.l1(this.values, objArr3, 0, 0, i10, 6, null);
        }
        objArr3[i10] = value;
        this.values = objArr3;
        this.size++;
    }

    public final void p(@dl.d Object[] objArr) {
        f0.p(objArr, "<set-?>");
        this.keys = objArr;
    }

    public final void q(int i10) {
        this.size = i10;
    }

    public final void r(@dl.d Object[] objArr) {
        f0.p(objArr, "<set-?>");
        this.values = objArr;
    }
}
