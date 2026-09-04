package com.billy.android.swipe.consumer;

import android.view.View;
import com.billy.android.swipe.internal.ScrimView;

/* JADX INFO: compiled from: SlidingConsumer.java */
/* JADX INFO: loaded from: classes6.dex */
public class h extends f {
    public static final float J3 = 0.0f;
    public static final float K3 = 1.0f;
    protected boolean G2;
    protected int G3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    protected int f40390p3;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    protected float f40391x2 = 0.5f;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    protected boolean f40392y2;

    public float H2() {
        return this.f40391x2;
    }

    public boolean I2() {
        return this.G2;
    }

    public boolean J2() {
        return this.f40392y2;
    }

    public h K2(boolean z10) {
        this.G2 = z10;
        return this;
    }

    public h L2(boolean z10) {
        this.f40392y2 = z10;
        return this;
    }

    public h M2(float f10) {
        this.f40391x2 = com.billy.android.swipe.b.e(f10, 0.0f, 1.0f);
        return this;
    }

    @Override // com.billy.android.swipe.consumer.f, com.billy.android.swipe.f
    public void g1() {
        super.g1();
        for (View view : this.V) {
            if (view != null) {
                view.scrollTo(0, 0);
            }
        }
        View contentView = this.f40407b.getContentView();
        if (contentView != null) {
            contentView.layout(0, 0, this.D, this.E);
        }
    }

    @Override // com.billy.android.swipe.consumer.f
    protected void g2(int i10, int i11, int i12) {
        this.f40390p3 = i11;
        this.G3 = i12;
        int i13 = (int) ((this.f40428w * (1.0f - this.f40391x2)) + 0.5f);
        if (i10 == 1) {
            int i14 = (-i11) + i13;
            this.X = i14;
            if (this.f40392y2 && i14 > 0) {
                this.X = 0;
            }
            this.Z = this.X + i11;
            this.Y = 0;
            this.f40362a0 = i12;
            return;
        }
        if (i10 == 2) {
            int i15 = this.D;
            int i16 = i15 - i13;
            this.X = i16;
            int i17 = i16 + i11;
            this.Z = i17;
            this.Y = 0;
            this.f40362a0 = i12;
            if (!this.f40392y2 || i17 >= i15) {
                return;
            }
            this.Z = i15;
            this.X = i15 - i11;
            return;
        }
        if (i10 == 4) {
            this.X = 0;
            this.Z = this.D;
            int i18 = (-i12) + i13;
            this.Y = i18;
            if (this.f40392y2 && i18 > 0) {
                this.Y = 0;
            }
            this.f40362a0 = this.Y + i12;
            return;
        }
        if (i10 != 8) {
            return;
        }
        this.X = 0;
        this.Z = this.D;
        int i19 = this.E;
        int i20 = i19 - i13;
        this.Y = i20;
        int i21 = i20 + i12;
        this.f40362a0 = i21;
        if (!this.f40392y2 || i21 >= i19) {
            return;
        }
        this.f40362a0 = i19;
        this.Y = i19 - i12;
    }

    @Override // com.billy.android.swipe.consumer.f, com.billy.android.swipe.f
    protected void h1(int i10, int i11, int i12, int i13) {
        n2();
    }

    @Override // com.billy.android.swipe.consumer.f
    protected void o2(View view) {
        if (view != null) {
            int i10 = this.f40416k;
            int i11 = this.f40417l;
            view.layout(i10, i11, this.D + i10, this.E + i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    @Override // com.billy.android.swipe.consumer.f
    protected void p2() {
        int iMax;
        int i10;
        int i11;
        int i12;
        int i13;
        View contentView = this.f40407b.getContentView();
        View view = this.W;
        if (contentView == null || view == null || view.getVisibility() != 0) {
            return;
        }
        int i14 = this.f40416k;
        float f10 = this.f40391x2;
        int i15 = (int) ((i14 * f10) + (i14 > 0 ? 0.5f : -0.5f));
        int i16 = this.f40417l;
        int i17 = (int) ((i16 * f10) + (i16 <= 0 ? -0.5f : 0.5f));
        int i18 = this.X;
        int i19 = this.Y;
        int left = this.Z;
        int top = this.f40362a0;
        int i20 = this.f40408c;
        int iMax2 = 0;
        if (i20 == 1) {
            i18 += i15;
            left = contentView.getLeft();
            if (!this.G2) {
                boolean z10 = this.f40392y2;
                if (!z10 && left > (i10 = this.f40390p3)) {
                    i18 = left - i10;
                } else if (z10 && i18 > 0) {
                    i18 = 0;
                }
                int i21 = left - i18;
                int i22 = this.f40390p3;
                if (i21 > i22) {
                    left = i18 + i22;
                }
            } else if (i18 > 0) {
                iMax = 0;
                i18 = 0;
            }
            iMax = 0;
        } else if (i20 == 2) {
            int right = contentView.getRight();
            int i23 = this.Z + i15;
            if (this.G2) {
                int i24 = this.D;
                if (i23 < i24) {
                    i18 = right;
                    left = i24;
                }
                iMax2 = Math.max((int) ((this.f40428w + this.f40416k) * (1.0f - this.f40391x2)), 0);
                iMax = 0;
            } else {
                boolean z11 = this.f40392y2;
                if (!z11) {
                    int i25 = this.f40390p3;
                    if (right + i25 < this.D) {
                        i23 = right + i25;
                    } else if (z11 && i23 < (i11 = this.D)) {
                        i23 = i11;
                    }
                } else if (z11) {
                    i23 = i11;
                }
                int i26 = i23 - right;
                int i27 = this.f40390p3;
                if (i26 > i27) {
                    right = i23 - i27;
                }
            }
            i18 = right;
            left = i23;
            iMax2 = Math.max((int) ((this.f40428w + this.f40416k) * (1.0f - this.f40391x2)), 0);
            iMax = 0;
        } else if (i20 == 4) {
            i19 += i17;
            top = contentView.getTop();
            if (!this.G2) {
                boolean z12 = this.f40392y2;
                if (!z12 && top > (i12 = this.G3)) {
                    i19 = top - i12;
                } else if (z12 && i19 > 0) {
                    i19 = 0;
                }
                int i28 = top - i19;
                int i29 = this.G3;
                if (i28 > i29) {
                    top = i19 + i29;
                }
            } else if (i19 > 0) {
                iMax = 0;
                i19 = 0;
            }
            iMax = 0;
        } else if (i20 != 8) {
            iMax = 0;
        } else {
            int bottom = contentView.getBottom();
            int i30 = this.f40362a0 + i17;
            if (this.G2) {
                int i31 = this.E;
                if (i30 < i31) {
                    i19 = bottom;
                    top = i31;
                }
                iMax = Math.max((int) ((this.f40428w + this.f40417l) * (1.0f - this.f40391x2)), 0);
            } else {
                boolean z13 = this.f40392y2;
                if (!z13) {
                    int i32 = this.G3;
                    if (bottom + i32 < this.E) {
                        i30 = bottom + i32;
                    } else if (z13 && i30 < (i13 = this.E)) {
                        i30 = i13;
                    }
                } else if (z13) {
                    i30 = i13;
                }
                int i33 = i30 - bottom;
                int i34 = this.G3;
                if (i33 > i34) {
                    bottom = i30 - i34;
                }
            }
            i19 = bottom;
            top = i30;
            iMax = Math.max((int) ((this.f40428w + this.f40417l) * (1.0f - this.f40391x2)), 0);
        }
        view.layout(i18, i19, left, top);
        view.scrollTo(iMax2, iMax);
    }

    @Override // com.billy.android.swipe.consumer.f
    protected void r2() {
        View contentView = this.f40407b.getContentView();
        if (contentView != null) {
            contentView.bringToFront();
        }
        ScrimView scrimView = this.f40365p1;
        if (scrimView != null) {
            scrimView.bringToFront();
        }
    }
}
