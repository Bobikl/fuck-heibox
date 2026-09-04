package androidx.compose.runtime.internal;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ThreadMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/internal/p;", "", "", "key", "", ak.av, "b", "value", "", "d", ak.aF, "I", UiKitSpanObj.TYPE_SIZE, "", "[J", Constants.PARAM_KEYS, "", "[Ljava/lang/Object;", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final long[] keys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object[] values;

    public p(int i10, @dl.d long[] keys, @dl.d Object[] values) {
        f0.p(keys, "keys");
        f0.p(values, "values");
        this.size = i10;
        this.keys = keys;
        this.values = values;
    }

    private final int a(long key) {
        int i10 = this.size - 1;
        if (i10 == -1) {
            return -1;
        }
        int i11 = 0;
        if (i10 == 0) {
            long j10 = this.keys[0];
            if (j10 == key) {
                return 0;
            }
            return j10 > key ? -2 : -1;
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j11 = this.keys[i12] - key;
            if (j11 < 0) {
                i11 = i12 + 1;
            } else {
                if (j11 <= 0) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    @dl.e
    public final Object b(long key) {
        int iA = a(key);
        if (iA >= 0) {
            return this.values[iA];
        }
        return null;
    }

    @dl.d
    public final p c(long key, @dl.e Object value) {
        int i10 = this.size;
        Object[] objArr = this.values;
        int length = objArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            if (objArr[i12] != null) {
                i13++;
            }
            i12++;
        }
        int i14 = i13 + 1;
        long[] jArr = new long[i14];
        Object[] objArr2 = new Object[i14];
        if (i14 > 1) {
            int i15 = 0;
            while (i11 < i14 && i15 < i10) {
                long j10 = this.keys[i15];
                Object obj = this.values[i15];
                if (j10 > key) {
                    jArr[i11] = key;
                    objArr2[i11] = value;
                    i11++;
                    break;
                }
                if (obj != null) {
                    jArr[i11] = j10;
                    objArr2[i11] = obj;
                    i11++;
                }
                i15++;
            }
            if (i15 == i10) {
                int i16 = i14 - 1;
                jArr[i16] = key;
                objArr2[i16] = value;
            } else {
                while (i11 < i14) {
                    long j11 = this.keys[i15];
                    Object obj2 = this.values[i15];
                    if (obj2 != null) {
                        jArr[i11] = j11;
                        objArr2[i11] = obj2;
                        i11++;
                    }
                    i15++;
                }
            }
        } else {
            jArr[0] = key;
            objArr2[0] = value;
        }
        return new p(i14, jArr, objArr2);
    }

    public final boolean d(long key, @dl.e Object value) {
        int iA = a(key);
        if (iA < 0) {
            return false;
        }
        this.values[iA] = value;
        return true;
    }
}
