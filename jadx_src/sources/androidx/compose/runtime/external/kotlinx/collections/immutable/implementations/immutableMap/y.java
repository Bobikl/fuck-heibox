package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001aG\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aO\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\"\u0014\u0010\u001d\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018\"\u0014\u0010\u001f\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018\"\u0014\u0010!\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006\""}, d2 = {"", UCropPlusActivity.ARG_INDEX, "shift", "f", "K", androidx.exifinterface.media.a.X4, "", "", "keyIndex", "key", "value", "g", "([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "nodeIndex", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "newNode", "j", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;)[Ljava/lang/Object;", "k", "([Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "([Ljava/lang/Object;I)[Ljava/lang/Object;", "i", ak.av, "I", "MAX_BRANCHING_FACTOR", "b", "LOG_MAX_BRANCHING_FACTOR", ak.aF, "MAX_BRANCHING_FACTOR_MINUS_ONE", "d", "ENTRY_SIZE", "e", "MAX_SHIFT", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12734a = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12735b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12736c = 31;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12737d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12738e = 30;

    public static final int f(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] g(Object[] objArr, int i10, K k10, V v10) {
        Object[] objArr2 = new Object[objArr.length + 2];
        kotlin.collections.m.l1(objArr, objArr2, 0, 0, i10, 6, null);
        kotlin.collections.m.c1(objArr, objArr2, i10 + 2, i10, objArr.length);
        objArr2[i10] = k10;
        objArr2[i10 + 1] = v10;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] h(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 2];
        kotlin.collections.m.l1(objArr, objArr2, 0, 0, i10, 6, null);
        kotlin.collections.m.c1(objArr, objArr2, i10, i10 + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] i(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        kotlin.collections.m.l1(objArr, objArr2, 0, 0, i10, 6, null);
        kotlin.collections.m.c1(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] j(Object[] objArr, int i10, int i11, u<?, ?> uVar) {
        int i12 = i11 - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        kotlin.collections.m.l1(objArr, objArr2, 0, 0, i10, 6, null);
        kotlin.collections.m.c1(objArr, objArr2, i10, i10 + 2, i11);
        objArr2[i12] = uVar;
        kotlin.collections.m.c1(objArr, objArr2, i12 + 1, i11, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] k(Object[] objArr, int i10, int i11, K k10, V v10) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        kotlin.collections.m.c1(objArrCopyOf, objArrCopyOf, i10 + 2, i10 + 1, objArr.length);
        kotlin.collections.m.c1(objArrCopyOf, objArrCopyOf, i11 + 2, i11, i10);
        objArrCopyOf[i11] = k10;
        objArrCopyOf[i11 + 1] = v10;
        return objArrCopyOf;
    }
}
