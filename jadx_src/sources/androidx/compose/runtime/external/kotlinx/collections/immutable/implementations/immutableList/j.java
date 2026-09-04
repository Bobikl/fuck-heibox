package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0000\u001a!\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000\u001a\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0000\"\u0014\u0010\u000f\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0002\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {androidx.exifinterface.media.a.S4, "Lu0/h;", "b", "", "element", "", ak.aF, "(Ljava/lang/Object;)[Ljava/lang/Object;", "", UCropPlusActivity.ARG_INDEX, "shift", ak.av, "vectorSize", "d", "I", "MAX_BUFFER_SIZE", "LOG_MAX_BUFFER_SIZE", "MAX_BUFFER_SIZE_MINUS_ONE", "MUTABLE_BUFFER_SIZE", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12690a = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12691b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12692c = 31;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12693d = 33;

    public static final int a(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    @dl.d
    public static final <E> u0.h<E> b() {
        return h.INSTANCE.a();
    }

    @dl.d
    public static final Object[] c(@dl.e Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int d(int i10) {
        return (i10 - 1) & (-32);
    }
}
