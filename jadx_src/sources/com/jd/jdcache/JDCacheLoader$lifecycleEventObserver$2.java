package com.jd.jdcache;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import dl.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: JDCacheLoader.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class JDCacheLoader$lifecycleEventObserver$2 extends Lambda implements yh.a<v> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ JDCacheLoader f64131b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JDCacheLoader$lifecycleEventObserver$2(JDCacheLoader jDCacheLoader) {
        super(0);
        this.f64131b = jDCacheLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(JDCacheLoader this$0, y yVar, Lifecycle.Event event) {
        f0.p(this$0, "this$0");
        f0.p(yVar, "<anonymous parameter 0>");
        f0.p(event, "event");
        this$0.onLifecycleStateChanged(event);
    }

    @Override // yh.a
    @d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final v invoke() {
        final JDCacheLoader jDCacheLoader = this.f64131b;
        return new v() { // from class: com.jd.jdcache.b
            @Override // androidx.lifecycle.v
            public final void d(y yVar, Lifecycle.Event event) {
                JDCacheLoader$lifecycleEventObserver$2.c(jDCacheLoader, yVar, event);
            }
        };
    }
}
