package com.billy.android.swipe.consumer;

/* JADX INFO: compiled from: StayConsumer.java */
/* JADX INFO: loaded from: classes6.dex */
public class j extends com.billy.android.swipe.f {
    private int V = 1000;

    public j() {
        C1(Integer.MAX_VALUE).B1(0);
    }

    public int f2() {
        return this.V;
    }

    public j g2(int i10) {
        if (i10 > 0) {
            this.V = i10;
        }
        return this;
    }

    @Override // com.billy.android.swipe.f
    protected void h1(int i10, int i11, int i12, int i13) {
    }

    @Override // com.billy.android.swipe.f
    public void p1(float f10, float f11) {
        if (Math.abs(f10) > Math.abs(f11)) {
            int i10 = this.f40408c;
            if ((i10 == 1 && f10 >= this.V) || (i10 == 2 && f10 <= (-this.V))) {
                this.f40411f = h0();
                this.f40418m = 1.0f;
            }
        } else {
            int i11 = this.f40408c;
            if ((i11 == 4 && f11 >= this.V) || (i11 == 8 && f11 <= (-this.V))) {
                this.f40412g = h0();
                this.f40418m = 1.0f;
            }
        }
        super.p1(f10, f11);
    }
}
