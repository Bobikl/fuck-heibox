package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.collections.m;
import yh.l;

/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a9\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aN\u0010\u0012\u001a\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00100\u000fH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0015\"\u0014\u0010\u001a\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u001b"}, d2 = {"", UCropPlusActivity.ARG_INDEX, "shift", "f", androidx.exifinterface.media.a.S4, "", "", "element", ak.aF, "([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;", "cellIndex", "g", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "newArray", "newArrayOffset", "Lkotlin/Function1;", "", "predicate", "d", "([Ljava/lang/Object;[Ljava/lang/Object;ILyh/l;)I", ak.av, "I", "MAX_BRANCHING_FACTOR", "b", "LOG_MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "MAX_SHIFT", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class TrieNodeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12740a = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12741b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12742c = 31;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12743d = 30;

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> Object[] c(Object[] objArr, int i10, E e10) {
        Object[] objArr2 = new Object[objArr.length + 1];
        m.l1(objArr, objArr2, 0, 0, i10, 6, null);
        m.c1(objArr, objArr2, i10 + 1, i10, objArr.length);
        objArr2[i10] = e10;
        return objArr2;
    }

    private static final int d(Object[] objArr, Object[] objArr2, int i10, l<Object, Boolean> lVar) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < objArr.length) {
            y0.a.a(i12 <= i11);
            if (lVar.invoke(objArr[i11]).booleanValue()) {
                objArr2[i10 + i12] = objArr[i11];
                i12++;
                y0.a.a(i10 + i12 <= objArr2.length);
            }
            i11++;
        }
        return i12;
    }

    static /* synthetic */ int e(Object[] objArr, Object[] objArr2, int i10, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            lVar = new l<Object, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt$filterTo$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.e Object obj2) {
                    return Boolean.valueOf(obj2 != e.INSTANCE.a());
                }
            };
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < objArr.length) {
            y0.a.a(i13 <= i12);
            if (((Boolean) lVar.invoke(objArr[i12])).booleanValue()) {
                objArr2[i10 + i13] = objArr[i12];
                i13++;
                y0.a.a(i10 + i13 <= objArr2.length);
            }
            i12++;
        }
        return i13;
    }

    public static final int f(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] g(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        m.l1(objArr, objArr2, 0, 0, i10, 6, null);
        m.c1(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }
}
