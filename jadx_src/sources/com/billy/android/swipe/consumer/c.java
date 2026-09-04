package com.billy.android.swipe.consumer;

import android.app.Activity;
import android.view.View;
import com.billy.android.swipe.R;
import com.billy.android.swipe.SmartSwipeWrapper;
import java.util.List;

/* JADX INFO: compiled from: ActivitySlidingBackConsumer.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends l {
    protected final com.billy.android.swipe.internal.a L3;
    protected Activity M3;
    protected int N3 = 0;
    protected View O3;
    protected boolean P3;

    public c(Activity activity) {
        this.M3 = activity;
        this.L3 = new com.billy.android.swipe.internal.a(activity);
        G2();
        B2(Integer.MIN_VALUE);
        C2(com.billy.android.swipe.b.b(10, activity));
    }

    private void O2(int i10) {
        if (this.O3 == null || !this.L3.k()) {
            return;
        }
        if (this.P3) {
            this.O3.setTranslationX(i10);
        } else {
            this.O3.setTranslationY(i10);
        }
    }

    private void P2() {
        View view = this.O3;
        if (view != null) {
            view.setTranslationX(0.0f);
            this.O3.setTranslationY(0.0f);
            this.O3 = null;
        }
    }

    @Override // com.billy.android.swipe.consumer.f, com.billy.android.swipe.f
    public boolean V1(int i10, float f10, float f11, float f12, float f13) {
        return super.V1(i10, f10, f11, f12, f13);
    }

    @Override // com.billy.android.swipe.f
    public boolean W1(int i10, float f10, float f11) {
        return false;
    }

    @Override // com.billy.android.swipe.consumer.f, com.billy.android.swipe.f
    public void e1(SmartSwipeWrapper smartSwipeWrapper, com.billy.android.swipe.internal.b bVar) {
        super.e1(smartSwipeWrapper, bVar);
        com.billy.android.swipe.internal.a.j(this.M3);
    }

    @Override // com.billy.android.swipe.consumer.f, com.billy.android.swipe.f
    protected void f1() {
        super.f1();
        this.L3.d();
        P2();
    }

    @Override // com.billy.android.swipe.f
    public int g(int i10, int i11) {
        if (this.L3.k()) {
            return super.g(i10, i11);
        }
        return 0;
    }

    @Override // com.billy.android.swipe.consumer.h, com.billy.android.swipe.consumer.f, com.billy.android.swipe.f
    public void g1() {
        super.g1();
        this.L3.d();
        P2();
    }

    @Override // com.billy.android.swipe.f
    public int h(int i10, int i11) {
        if (this.L3.k()) {
            return super.h(i10, i11);
        }
        return 0;
    }

    @Override // com.billy.android.swipe.consumer.h, com.billy.android.swipe.consumer.f, com.billy.android.swipe.f
    protected void h1(int i10, int i11, int i12, int i13) {
        int i14;
        float f10;
        float f11;
        int i15;
        int i16;
        float f12;
        float f13;
        if (this.L3.k()) {
            if (this.O3 != null) {
                int i17 = this.f40408c;
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 == 4) {
                            i14 = this.N3;
                            f10 = this.E * this.f40418m;
                            f11 = this.f40391x2;
                        } else if (i17 != 8) {
                            i15 = 0;
                        } else {
                            i16 = this.N3;
                            f12 = this.E * this.f40418m;
                            f13 = this.f40391x2;
                        }
                        O2(i15);
                    } else {
                        i16 = this.N3;
                        f12 = this.D * this.f40418m;
                        f13 = this.f40391x2;
                    }
                    i15 = i16 - ((int) (f12 * f13));
                    O2(i15);
                } else {
                    i14 = this.N3;
                    f10 = this.D * this.f40418m;
                    f11 = this.f40391x2;
                }
                i15 = i14 + ((int) (f10 * f11));
                O2(i15);
            }
            boolean z10 = (this.f40408c & 3) > 0;
            View contentView = this.f40407b.getContentView();
            if (contentView != null) {
                if (z10) {
                    contentView.setTranslationX(i10);
                } else {
                    contentView.setTranslationY(i11);
                }
            }
            q2();
        }
    }

    @Override // com.billy.android.swipe.consumer.f, com.billy.android.swipe.f
    protected void l1() {
        Activity activity;
        super.l1();
        List<r6.b> list = this.f40427v;
        if ((list == null || list.isEmpty()) && (activity = this.M3) != null) {
            activity.finish();
            Activity activity2 = this.M3;
            int i10 = R.anim.anim_none;
            activity2.overridePendingTransition(i10, i10);
        }
        P2();
    }

    @Override // com.billy.android.swipe.consumer.l, com.billy.android.swipe.consumer.f, com.billy.android.swipe.f
    protected void m0() {
    }

    @Override // com.billy.android.swipe.consumer.f, com.billy.android.swipe.f
    public void n1(int i10, boolean z10, float f10, float f11) {
        if (!this.L3.k()) {
            this.L3.f();
        }
        if (this.f40391x2 > 0.0f) {
            this.P3 = (this.f40408c & 3) > 0;
            Activity activityO = com.billy.android.swipe.c.o(this.M3);
            if (activityO != null) {
                this.O3 = activityO.getWindow().getDecorView();
                int i11 = this.f40408c;
                if (i11 == 1) {
                    this.N3 = -((int) (this.D * this.f40391x2));
                } else if (i11 == 2) {
                    this.N3 = (int) (this.D * this.f40391x2);
                } else if (i11 == 4) {
                    this.N3 = -((int) (this.E * this.f40391x2));
                } else if (i11 == 8) {
                    this.N3 = (int) (this.E * this.f40391x2);
                }
                O2(this.N3);
            }
        }
        super.n1(i10, z10, f10, f11);
    }

    @Override // com.billy.android.swipe.consumer.h, com.billy.android.swipe.consumer.f
    protected void o2(View view) {
        if (view != null) {
            view.layout(0, 0, this.D, this.E);
        }
    }
}
