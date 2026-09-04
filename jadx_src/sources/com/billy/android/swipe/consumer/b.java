package com.billy.android.swipe.consumer;

import android.app.Activity;
import com.billy.android.swipe.R;
import com.billy.android.swipe.SmartSwipeWrapper;
import java.util.List;

/* JADX INFO: compiled from: ActivityShuttersBackConsumer.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends g {
    protected Activity G3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    protected com.billy.android.swipe.internal.a f40350p3;

    public b(Activity activity) {
        this.G3 = activity;
        this.f40350p3 = new com.billy.android.swipe.internal.a(activity);
    }

    @Override // com.billy.android.swipe.f
    public void e1(SmartSwipeWrapper smartSwipeWrapper, com.billy.android.swipe.internal.b bVar) {
        super.e1(smartSwipeWrapper, bVar);
        com.billy.android.swipe.internal.a.j(this.G3);
    }

    @Override // com.billy.android.swipe.consumer.g, com.billy.android.swipe.f
    protected void f1() {
        super.f1();
        this.f40350p3.d();
    }

    @Override // com.billy.android.swipe.consumer.g, com.billy.android.swipe.f
    public int g(int i10, int i11) {
        if (this.f40350p3.k()) {
            return super.g(i10, i11);
        }
        return 0;
    }

    @Override // com.billy.android.swipe.consumer.g, com.billy.android.swipe.f
    public void g1() {
        super.g1();
        this.f40350p3.d();
    }

    @Override // com.billy.android.swipe.consumer.g, com.billy.android.swipe.f
    public int h(int i10, int i11) {
        if (this.f40350p3.k()) {
            return super.h(i10, i11);
        }
        return 0;
    }

    @Override // com.billy.android.swipe.consumer.g, com.billy.android.swipe.f
    protected void h1(int i10, int i11, int i12, int i13) {
        if (this.f40350p3.k()) {
            super.h1(i10, i11, i12, i13);
        }
    }

    @Override // com.billy.android.swipe.f
    protected void l1() {
        Activity activity;
        super.l1();
        List<r6.b> list = this.f40427v;
        if ((list == null || list.isEmpty()) && (activity = this.G3) != null) {
            activity.finish();
            Activity activity2 = this.G3;
            int i10 = R.anim.anim_none;
            activity2.overridePendingTransition(i10, i10);
        }
    }

    @Override // com.billy.android.swipe.consumer.g, com.billy.android.swipe.f
    public void n1(int i10, boolean z10, float f10, float f11) {
        if (!this.f40350p3.k()) {
            this.f40350p3.f();
        }
        super.n1(i10, z10, f10, f11);
    }
}
