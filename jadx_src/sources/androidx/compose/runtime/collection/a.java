package androidx.compose.runtime.collection;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.r0;
import yh.p;

/* JADX INFO: compiled from: IdentityArrayIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010\u001aJ\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002J\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001J&\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\rH\u0086\bø\u0001\u0000J&\u0010\u0011\u001a\u00020\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\rH\u0086\bø\u0001\u0000J&\u0010\u0013\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\rH\u0086\bø\u0001\u0000R(\u0010\u001b\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u0014\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R0\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u001d\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010+\u001a\u00020$8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010\u001a\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Landroidx/compose/runtime/collection/a;", "", "key", "", ak.aF, "midIndex", "value", "valueHash", "d", "f", ak.av, "", "m", "Lkotlin/Function2;", "predicate", "Lkotlin/b2;", "n", "b", "block", "e", "I", "i", "()I", "p", "(I)V", "getSize$annotations", "()V", UiKitSpanObj.TYPE_SIZE, "", "[Ljava/lang/Object;", "g", "()[Ljava/lang/Object;", "o", "([Ljava/lang/Object;)V", "getKeys$annotations", Constants.PARAM_KEYS, "", "[I", "k", "()[I", "q", "([I)V", "getValues$annotations", "values", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] keys = new Object[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private int[] values = new int[4];

    private final int c(Object key) {
        int i10 = this.size - 1;
        int iB = androidx.compose.runtime.b.b(key);
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj = this.keys[i12];
            int iB2 = androidx.compose.runtime.b.b(obj);
            if (iB2 < iB) {
                i11 = i12 + 1;
            } else {
                if (iB2 <= iB) {
                    return obj == key ? i12 : d(i12, key, iB);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    private final int d(int midIndex, Object value, int valueHash) {
        for (int i10 = midIndex - 1; -1 < i10; i10--) {
            Object obj = this.keys[i10];
            if (obj == value) {
                return i10;
            }
            if (androidx.compose.runtime.b.b(obj) != valueHash) {
                break;
            }
        }
        int i11 = midIndex + 1;
        int i12 = this.size;
        while (i11 < i12) {
            Object obj2 = this.keys[i11];
            if (obj2 == value) {
                return i11;
            }
            if (androidx.compose.runtime.b.b(obj2) != valueHash) {
                return -(i11 + 1);
            }
            i11++;
        }
        i11 = this.size;
        return -(i11 + 1);
    }

    @r0
    public static /* synthetic */ void h() {
    }

    @r0
    public static /* synthetic */ void j() {
    }

    @r0
    public static /* synthetic */ void l() {
    }

    public final int a(@dl.d Object key, int value) {
        int iC;
        f0.p(key, "key");
        if (this.size > 0) {
            iC = c(key);
            if (iC >= 0) {
                int[] iArr = this.values;
                int i10 = iArr[iC];
                iArr[iC] = value;
                return i10;
            }
        } else {
            iC = -1;
        }
        int i11 = -(iC + 1);
        int i12 = this.size;
        Object[] objArr = this.keys;
        if (i12 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i13 = i11 + 1;
            m.c1(objArr, objArr2, i13, i11, i12);
            m.a1(this.values, iArr2, i13, i11, this.size);
            m.l1(this.keys, objArr2, 0, 0, i11, 6, null);
            m.j1(this.values, iArr2, 0, 0, i11, 6, null);
            this.keys = objArr2;
            this.values = iArr2;
        } else {
            int i14 = i11 + 1;
            m.c1(objArr, objArr, i14, i11, i12);
            int[] iArr3 = this.values;
            m.a1(iArr3, iArr3, i14, i11, this.size);
        }
        this.keys[i11] = key;
        this.values[i11] = value;
        this.size++;
        return -1;
    }

    public final boolean b(@dl.d p<Object, ? super Integer, Boolean> predicate) {
        f0.p(predicate, "predicate");
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = getKeys()[i10];
            f0.n(obj, "null cannot be cast to non-null type kotlin.Any");
            if (predicate.invoke(obj, Integer.valueOf(getValues()[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void e(@dl.d p<Object, ? super Integer, b2> block) {
        f0.p(block, "block");
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = getKeys()[i10];
            f0.n(obj, "null cannot be cast to non-null type kotlin.Any");
            block.invoke(obj, Integer.valueOf(getValues()[i10]));
        }
    }

    public final int f(@dl.d Object key) {
        f0.p(key, "key");
        int iC = c(key);
        if (iC >= 0) {
            return this.values[iC];
        }
        throw new IllegalStateException("Key not found".toString());
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Object[] getKeys() {
        return this.keys;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @dl.d
    /* JADX INFO: renamed from: k, reason: from getter */
    public final int[] getValues() {
        return this.values;
    }

    public final boolean m(@dl.d Object key) {
        f0.p(key, "key");
        int iC = c(key);
        if (iC < 0) {
            return false;
        }
        int i10 = this.size;
        if (iC < i10 - 1) {
            Object[] objArr = this.keys;
            int i11 = iC + 1;
            m.c1(objArr, objArr, iC, i11, i10);
            int[] iArr = this.values;
            m.a1(iArr, iArr, iC, i11, this.size);
        }
        int i12 = this.size - 1;
        this.size = i12;
        this.keys[i12] = null;
        return true;
    }

    public final void n(@dl.d p<Object, ? super Integer, Boolean> predicate) {
        f0.p(predicate, "predicate");
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = getKeys()[i11];
            f0.n(obj, "null cannot be cast to non-null type kotlin.Any");
            int i12 = getValues()[i11];
            if (!predicate.invoke(obj, Integer.valueOf(i12)).booleanValue()) {
                if (i10 != i11) {
                    getKeys()[i10] = obj;
                    getValues()[i10] = i12;
                }
                i10++;
            }
        }
        int size2 = getSize();
        for (int i13 = i10; i13 < size2; i13++) {
            getKeys()[i13] = null;
        }
        p(i10);
    }

    public final void o(@dl.d Object[] objArr) {
        f0.p(objArr, "<set-?>");
        this.keys = objArr;
    }

    public final void p(int i10) {
        this.size = i10;
    }

    public final void q(@dl.d int[] iArr) {
        f0.p(iArr, "<set-?>");
        this.values = iArr;
    }
}
