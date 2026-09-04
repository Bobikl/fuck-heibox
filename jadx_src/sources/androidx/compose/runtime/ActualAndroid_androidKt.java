package androidx.compose.runtime;

import android.os.Looper;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ActualAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\b\"!\u0010\u0010\u001a\u00020\n8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\r*\f\b\u0000\u0010\u0012\"\u00020\u00112\u00020\u0011¨\u0006\u0013"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Landroidx/compose/runtime/d2;", ak.bo, "Landroidx/compose/runtime/snapshots/r;", ak.av, "(Ljava/lang/Object;Landroidx/compose/runtime/d2;)Landroidx/compose/runtime/snapshots/r;", "", "Z", "DisallowDefaultMonotonicFrameClock", "Landroidx/compose/runtime/w0;", "b", "Lkotlin/z;", "()Landroidx/compose/runtime/w0;", "getDefaultMonotonicFrameClock$annotations", "()V", "DefaultMonotonicFrameClock", "Landroidx/annotation/j;", "CheckResult", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class ActualAndroid_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f12195a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlin.z f12196b = kotlin.b0.c(new yh.a<w0>() { // from class: androidx.compose.runtime.ActualAndroid_androidKt$DefaultMonotonicFrameClock$2
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w0 invoke() {
            return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.f12355b : SdkStubsFallbackFrameClock.f12541b;
        }
    });

    @dl.d
    public static final <T> androidx.compose.runtime.snapshots.r<T> a(T t10, @dl.d d2<T> policy) {
        kotlin.jvm.internal.f0.p(policy, "policy");
        return new ParcelableSnapshotMutableState(t10, policy);
    }

    @dl.d
    public static final w0 b() {
        return (w0) f12196b.getValue();
    }

    @kotlin.k(message = "MonotonicFrameClocks are not globally applicable across platforms. Use an appropriate local clock.")
    public static /* synthetic */ void c() {
    }
}
