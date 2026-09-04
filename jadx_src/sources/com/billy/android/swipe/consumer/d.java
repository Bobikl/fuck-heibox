package com.billy.android.swipe.consumer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import com.billy.android.swipe.SmartSwipeWrapper;

/* JADX INFO: compiled from: BezierBackConsumer.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends com.billy.android.swipe.f {
    protected int G2;
    protected int G3;
    protected int J3;
    protected boolean K3;
    protected float V;
    protected float W;
    protected final Paint X;
    protected final Path Y;
    protected final PointF Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected final PointF f40351a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected final PointF f40352b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected final PointF f40353c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    protected final PointF f40354p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    protected final Paint f40355p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    protected int f40356p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    protected final PointF f40357x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    protected final Path f40358x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    protected final PointF f40359y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    protected Rect f40360y2;

    public d() {
        Paint paint = new Paint();
        this.X = paint;
        this.Y = new Path();
        this.Z = new PointF();
        this.f40351a0 = new PointF();
        this.f40352b0 = new PointF();
        this.f40353c0 = new PointF();
        this.f40354p1 = new PointF();
        this.f40357x1 = new PointF();
        this.f40359y1 = new PointF();
        Paint paint2 = new Paint();
        this.f40355p2 = paint2;
        this.f40358x2 = new Path();
        this.f40360y2 = new Rect();
        this.J3 = -855310;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(this.J3);
        paint2.setStrokeWidth(4.0f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // com.billy.android.swipe.f
    public void e1(SmartSwipeWrapper smartSwipeWrapper, com.billy.android.swipe.internal.b bVar) {
        Context context = smartSwipeWrapper.getContext();
        if (this.f40356p3 == 0) {
            this.f40356p3 = com.billy.android.swipe.b.b(200, context);
        }
        if (this.G2 == 0) {
            this.G2 = com.billy.android.swipe.b.b(4, context);
        }
        if (this.f40428w == 0) {
            this.f40428w = com.billy.android.swipe.b.b(30, context);
        }
        super.e1(smartSwipeWrapper, bVar);
    }

    protected void f2(Canvas canvas, Paint paint, float f10, float f11) {
        boolean z10;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float fE = com.billy.android.swipe.b.e(f11, 0.0f, 1.0f);
        float f17 = ((double) fE) >= 0.5d ? (fE - 0.5f) * this.G2 * 2.0f : 0.0f;
        float f18 = f10 / 2.0f;
        int i10 = this.f40408c;
        if (i10 == 1 || i10 == 2) {
            z10 = i10 == 1;
            if (!z10) {
                f18 = this.D - f18;
            }
            float f19 = this.f40353c0.y;
            f12 = f18 + (f17 * (z10 ? 1 : -1));
            int i11 = this.G2;
            float f20 = f19 - i11;
            f13 = f12;
            f14 = f18;
            f18 = f19;
            f15 = i11 + f19;
            f16 = f20;
        } else {
            if (i10 != 4 && i10 != 8) {
                return;
            }
            z10 = i10 == 4;
            if (!z10) {
                f18 = this.E - f18;
            }
            float f21 = this.f40353c0.x;
            f16 = (f17 * (z10 ? 1 : -1)) + f18;
            int i12 = this.G2;
            f13 = f21 - i12;
            f12 = i12 + f21;
            f14 = f21;
            f15 = f16;
        }
        this.f40355p2.setAlpha((int) (fE * 255.0f));
        this.f40358x2.reset();
        this.f40358x2.moveTo(f13, f16);
        this.f40358x2.lineTo(f14, f18);
        this.f40358x2.lineTo(f12, f15);
        canvas.drawPath(this.f40358x2, paint);
    }

    public int g2() {
        return this.J3;
    }

    @Override // com.billy.android.swipe.f
    public void h1(int i10, int i11, int i12, int i13) {
        int i14 = this.f40408c;
        if ((i14 & 3) != 0) {
            this.V = Math.abs(i10);
        } else if ((i14 & 12) == 0) {
            return;
        } else {
            this.V = Math.abs(i11);
        }
        if (this.V != this.W) {
            com.billy.android.swipe.internal.d.i(this.f40407b);
        }
        this.W = this.V;
    }

    public int h2() {
        return this.G3;
    }

    protected int i2() {
        return this.f40356p3;
    }

    public boolean j2() {
        return this.K3;
    }

    public d k2(int i10) {
        this.J3 = i10;
        this.f40355p2.setColor(i10);
        return this;
    }

    public d l2(boolean z10) {
        this.K3 = z10;
        return this;
    }

    public d m2(int i10) {
        this.G3 = i10;
        this.X.setColor(i10);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x005b  */
    /* JADX WARN: Code duplicated, block: B:42:0x005d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0062  */
    /* JADX WARN: Code duplicated, block: B:46:0x0067  */
    /* JADX WARN: Code duplicated, block: B:49:0x0074  */
    /* JADX WARN: Code duplicated, block: B:50:0x0076  */
    /* JADX WARN: Code duplicated, block: B:52:0x007b  */
    /* JADX WARN: Code duplicated, block: B:53:0x007f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0087  */
    /* JADX WARN: Code duplicated, block: B:57:0x0089  */
    /* JADX WARN: Code duplicated, block: B:59:0x008e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0092  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    @Override // com.billy.android.swipe.f
    public void n1(int i10, boolean z10, float f10, float f11) {
        float fE;
        int i11;
        float fE2;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i13;
        int i14;
        super.n1(i10, z10, f10, f11);
        int i15 = this.f40408c;
        int i16 = 0;
        boolean z11 = i15 == 1;
        boolean z12 = i15 == 2;
        boolean z13 = i15 == 4;
        boolean z14 = z11 || z12;
        int i17 = this.f40428w;
        boolean z15 = z10 || j2();
        int iMin = Math.min(this.f40356p3, z14 ? this.E : this.D) >> 1;
        int i18 = iMin >> 2;
        if (!z14) {
            if (z15) {
                i11 = this.D >> 1;
            } else {
                fE = com.billy.android.swipe.b.e(f10, iMin, this.D - iMin);
            }
            if (!z14) {
                if (z15) {
                    i12 = this.E >> 1;
                } else {
                    fE2 = com.billy.android.swipe.b.e(f11, iMin, this.E - iMin);
                }
                PointF pointF = this.Z;
                if (z14) {
                    f12 = fE;
                } else {
                    f12 = fE - iMin;
                }
                if (z14) {
                    f13 = fE2 - iMin;
                } else {
                    f13 = fE2;
                }
                pointF.set(f12, f13);
                PointF pointF2 = this.f40351a0;
                if (z14) {
                    f14 = fE;
                } else {
                    f14 = fE - i18;
                }
                if (z14) {
                    f15 = fE2 - i18;
                } else {
                    f15 = fE2;
                }
                pointF2.set(f14, f15);
                PointF pointF3 = this.f40352b0;
                PointF pointF4 = this.f40351a0;
                pointF3.set(pointF4.x, pointF4.y);
                this.f40353c0.set(fE, fE2);
                PointF pointF5 = this.f40354p1;
                if (z14) {
                    f16 = fE;
                } else {
                    f16 = i18 + fE;
                }
                if (z14) {
                    f17 = i18 + fE2;
                } else {
                    f17 = fE2;
                }
                pointF5.set(f16, f17);
                PointF pointF6 = this.f40357x1;
                PointF pointF7 = this.f40354p1;
                pointF6.set(pointF7.x, pointF7.y);
                PointF pointF8 = this.f40359y1;
                if (!z14) {
                    fE += iMin;
                }
                if (z14) {
                    fE2 += iMin;
                }
                pointF8.set(fE, fE2);
                Rect rect = this.f40360y2;
                if (z14) {
                    i13 = (int) this.Z.x;
                } else if (z11) {
                    i13 = 0;
                } else {
                    i13 = this.D - i17;
                }
                rect.left = i13;
                if (z14) {
                    i16 = (int) this.Z.y;
                } else if (!z13) {
                    i16 = this.E - i17;
                }
                rect.top = i16;
                if (z14) {
                    i14 = (int) this.f40359y1.x;
                } else if (z11) {
                    i14 = i17;
                } else {
                    i14 = this.D;
                }
                rect.right = i14;
                if (z14) {
                    i17 = (int) this.f40359y1.y;
                } else if (!z13) {
                    i17 = this.E;
                }
                rect.bottom = i17;
            }
            if (z13) {
                i12 = 0;
            } else {
                i12 = this.E;
            }
            fE2 = i12;
            PointF pointF9 = this.Z;
            if (z14) {
                f12 = fE;
            } else {
                f12 = fE - iMin;
            }
            if (z14) {
                f13 = fE2 - iMin;
            } else {
                f13 = fE2;
            }
            pointF9.set(f12, f13);
            PointF pointF10 = this.f40351a0;
            if (z14) {
                f14 = fE;
            } else {
                f14 = fE - i18;
            }
            if (z14) {
                f15 = fE2 - i18;
            } else {
                f15 = fE2;
            }
            pointF10.set(f14, f15);
            PointF pointF11 = this.f40352b0;
            PointF pointF12 = this.f40351a0;
            pointF11.set(pointF12.x, pointF12.y);
            this.f40353c0.set(fE, fE2);
            PointF pointF13 = this.f40354p1;
            if (z14) {
                f16 = fE;
            } else {
                f16 = i18 + fE;
            }
            if (z14) {
                f17 = i18 + fE2;
            } else {
                f17 = fE2;
            }
            pointF13.set(f16, f17);
            PointF pointF14 = this.f40357x1;
            PointF pointF15 = this.f40354p1;
            pointF14.set(pointF15.x, pointF15.y);
            PointF pointF16 = this.f40359y1;
            if (!z14) {
                fE += iMin;
            }
            if (z14) {
                fE2 += iMin;
            }
            pointF16.set(fE, fE2);
            Rect rect2 = this.f40360y2;
            if (z14) {
                i13 = (int) this.Z.x;
            } else if (z11) {
                i13 = 0;
            } else {
                i13 = this.D - i17;
            }
            rect2.left = i13;
            if (z14) {
                i16 = (int) this.Z.y;
            } else if (!z13) {
                i16 = this.E - i17;
            }
            rect2.top = i16;
            if (z14) {
                i14 = (int) this.f40359y1.x;
            } else if (z11) {
                i14 = i17;
            } else {
                i14 = this.D;
            }
            rect2.right = i14;
            if (z14) {
                i17 = (int) this.f40359y1.y;
            } else if (!z13) {
                i17 = this.E;
            }
            rect2.bottom = i17;
        }
        i11 = z11 ? 0 : this.D;
        fE = i11;
        if (!z14) {
            if (z15) {
                i12 = this.E >> 1;
            } else {
                fE2 = com.billy.android.swipe.b.e(f11, iMin, this.E - iMin);
            }
            PointF pointF17 = this.Z;
            if (z14) {
                f12 = fE;
            } else {
                f12 = fE - iMin;
            }
            if (z14) {
                f13 = fE2 - iMin;
            } else {
                f13 = fE2;
            }
            pointF17.set(f12, f13);
            PointF pointF18 = this.f40351a0;
            if (z14) {
                f14 = fE;
            } else {
                f14 = fE - i18;
            }
            if (z14) {
                f15 = fE2 - i18;
            } else {
                f15 = fE2;
            }
            pointF18.set(f14, f15);
            PointF pointF19 = this.f40352b0;
            PointF pointF110 = this.f40351a0;
            pointF19.set(pointF110.x, pointF110.y);
            this.f40353c0.set(fE, fE2);
            PointF pointF111 = this.f40354p1;
            if (z14) {
                f16 = fE;
            } else {
                f16 = i18 + fE;
            }
            if (z14) {
                f17 = i18 + fE2;
            } else {
                f17 = fE2;
            }
            pointF111.set(f16, f17);
            PointF pointF112 = this.f40357x1;
            PointF pointF113 = this.f40354p1;
            pointF112.set(pointF113.x, pointF113.y);
            PointF pointF114 = this.f40359y1;
            if (!z14) {
                fE += iMin;
            }
            if (z14) {
                fE2 += iMin;
            }
            pointF114.set(fE, fE2);
            Rect rect3 = this.f40360y2;
            if (z14) {
                i13 = (int) this.Z.x;
            } else if (z11) {
                i13 = 0;
            } else {
                i13 = this.D - i17;
            }
            rect3.left = i13;
            if (z14) {
                i16 = (int) this.Z.y;
            } else if (!z13) {
                i16 = this.E - i17;
            }
            rect3.top = i16;
            if (z14) {
                i14 = (int) this.f40359y1.x;
            } else if (z11) {
                i14 = i17;
            } else {
                i14 = this.D;
            }
            rect3.right = i14;
            if (z14) {
                i17 = (int) this.f40359y1.y;
            } else if (!z13) {
                i17 = this.E;
            }
            rect3.bottom = i17;
        }
        if (z13) {
            i12 = 0;
        } else {
            i12 = this.E;
        }
        fE2 = i12;
        PointF pointF115 = this.Z;
        if (z14) {
            f12 = fE;
        } else {
            f12 = fE - iMin;
        }
        if (z14) {
            f13 = fE2 - iMin;
        } else {
            f13 = fE2;
        }
        pointF115.set(f12, f13);
        PointF pointF116 = this.f40351a0;
        if (z14) {
            f14 = fE;
        } else {
            f14 = fE - i18;
        }
        if (z14) {
            f15 = fE2 - i18;
        } else {
            f15 = fE2;
        }
        pointF116.set(f14, f15);
        PointF pointF117 = this.f40352b0;
        PointF pointF118 = this.f40351a0;
        pointF117.set(pointF118.x, pointF118.y);
        this.f40353c0.set(fE, fE2);
        PointF pointF119 = this.f40354p1;
        if (z14) {
            f16 = fE;
        } else {
            f16 = i18 + fE;
        }
        if (z14) {
            f17 = i18 + fE2;
        } else {
            f17 = fE2;
        }
        pointF119.set(f16, f17);
        PointF pointF1110 = this.f40357x1;
        PointF pointF1111 = this.f40354p1;
        pointF1110.set(pointF1111.x, pointF1111.y);
        PointF pointF1112 = this.f40359y1;
        if (!z14) {
            fE += iMin;
        }
        if (z14) {
            fE2 += iMin;
        }
        pointF1112.set(fE, fE2);
        Rect rect4 = this.f40360y2;
        if (z14) {
            i13 = (int) this.Z.x;
        } else if (z11) {
            i13 = 0;
        } else {
            i13 = this.D - i17;
        }
        rect4.left = i13;
        if (z14) {
            i16 = (int) this.Z.y;
        } else if (!z13) {
            i16 = this.E - i17;
        }
        rect4.top = i16;
        if (z14) {
            i14 = (int) this.f40359y1.x;
        } else if (z11) {
            i14 = i17;
        } else {
            i14 = this.D;
        }
        rect4.right = i14;
        if (z14) {
            i17 = (int) this.f40359y1.y;
        } else if (!z13) {
            i17 = this.E;
        }
        rect4.bottom = i17;
    }

    public d n2(int i10) {
        this.f40356p3 = i10;
        return this;
    }

    @Override // com.billy.android.swipe.f
    public void s(Canvas canvas) {
        int i10 = this.f40408c;
        if (i10 == 1) {
            PointF pointF = this.f40354p1;
            PointF pointF2 = this.f40352b0;
            PointF pointF3 = this.f40353c0;
            float f10 = this.V;
            pointF3.x = f10;
            pointF2.x = f10;
            pointF.x = f10;
        } else if (i10 == 2) {
            PointF pointF4 = this.f40354p1;
            PointF pointF5 = this.f40352b0;
            PointF pointF6 = this.f40353c0;
            float f11 = this.D - this.V;
            pointF6.x = f11;
            pointF5.x = f11;
            pointF4.x = f11;
        } else if (i10 == 4) {
            PointF pointF7 = this.f40354p1;
            PointF pointF8 = this.f40352b0;
            PointF pointF9 = this.f40353c0;
            float f12 = this.V;
            pointF9.y = f12;
            pointF8.y = f12;
            pointF7.y = f12;
        } else if (i10 == 8) {
            PointF pointF10 = this.f40354p1;
            PointF pointF11 = this.f40352b0;
            PointF pointF12 = this.f40353c0;
            float f13 = this.E - this.V;
            pointF12.y = f13;
            pointF11.y = f13;
            pointF10.y = f13;
        }
        float fC0 = c0();
        this.X.setAlpha((int) (com.billy.android.swipe.b.e(fC0, 0.2f, 0.8f) * 255.0f));
        this.Y.reset();
        Path path = this.Y;
        PointF pointF13 = this.Z;
        path.moveTo(pointF13.x, pointF13.y);
        Path path2 = this.Y;
        PointF pointF14 = this.f40351a0;
        float f14 = pointF14.x;
        float f15 = pointF14.y;
        PointF pointF15 = this.f40352b0;
        float f16 = pointF15.x;
        float f17 = pointF15.y;
        PointF pointF16 = this.f40353c0;
        path2.cubicTo(f14, f15, f16, f17, pointF16.x, pointF16.y);
        Path path3 = this.Y;
        PointF pointF17 = this.f40354p1;
        float f18 = pointF17.x;
        float f19 = pointF17.y;
        PointF pointF18 = this.f40357x1;
        float f20 = pointF18.x;
        float f21 = pointF18.y;
        PointF pointF19 = this.f40359y1;
        path3.cubicTo(f18, f19, f20, f21, pointF19.x, pointF19.y);
        canvas.drawPath(this.Y, this.X);
        f2(canvas, this.f40355p2, this.V, fC0);
    }
}
