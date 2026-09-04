package com.max.xiaoheihe.utils.imageviewer;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.Lifecycle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import io.reactivex.observers.d;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ObserverAdapter.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public class ObserverAdapter<T> extends d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f95541b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public ObserverAdapter(@e Lifecycle lifecycle) {
        if (lifecycle != null) {
            ExtentionsKt.g(lifecycle, new yh.a<b2>(this) { // from class: com.max.xiaoheihe.utils.imageviewer.ObserverAdapter.1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ObserverAdapter<T> f95542b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f95542b = this;
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49251, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49250, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    this.f95542b.dispose();
                }
            });
        }
    }

    @Override // io.reactivex.g0
    public void onComplete() {
    }

    @Override // io.reactivex.g0
    public void onError(@dl.d Throwable e10) {
        if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 49249, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(e10, "e");
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
    }
}
