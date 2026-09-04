package com.max.hbcustomview.seekbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.l;
import androidx.annotation.v;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RangeSeekBar extends View {
    public static final int G2 = 1;
    public static final int G3 = 1;
    public static final int J3 = 2;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f69303p2 = 1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final int f69304p3 = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f69305x2 = 2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final int f69306y1 = 100;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final int f69307y2 = 0;
    private float A;
    private float B;
    private int C;
    private boolean D;
    private int E;
    private float F;
    private float G;
    private boolean H;
    private boolean I;
    float J;
    float K;
    float L;
    boolean M;
    Paint N;
    RectF O;
    RectF P;
    Rect Q;
    RectF R;
    Rect S;
    com.max.hbcustomview.seekbar.a T;
    com.max.hbcustomview.seekbar.a U;
    com.max.hbcustomview.seekbar.a V;
    Bitmap W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    Bitmap f69308a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f69309b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    List<Bitmap> f69310b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69311c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f69312c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f69319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f69320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f69321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f69322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence[] f69323n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f69324o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f69325p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private com.max.hbcustomview.seekbar.f f69326p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f69327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f69328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f69329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f69330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f69331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f69332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f69333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f69334x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private c f69335x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f69336y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f69337z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f69338a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f69339b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f69340c = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public interface c {
        String a(float f10);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    public RangeSeekBar(Context context) {
        this(context, null);
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = true;
        this.I = true;
        this.M = false;
        this.N = new Paint();
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new Rect();
        this.R = new RectF();
        this.S = new Rect();
        this.f69310b0 = new ArrayList();
        f(attributeSet);
        g();
        i(attributeSet);
        j();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x018c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0194  */
    /* JADX WARN: Code duplicated, block: B:35:0x019c  */
    /* JADX WARN: Code duplicated, block: B:36:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:39:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x01e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:49:0x0200  */
    /* JADX WARN: Code duplicated, block: B:50:0x0207  */
    /* JADX WARN: Code duplicated, block: B:52:0x020d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0214  */
    /* JADX WARN: Code duplicated, block: B:54:0x021a  */
    private void b() {
        int iM;
        int iN;
        int iM2;
        int iN2;
        int iM3;
        com.max.hbcustomview.seekbar.a aVar;
        com.max.hbcustomview.seekbar.a aVar2;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.fp, new Class[0], Void.TYPE).isSupported && this.f69315f == 2) {
            com.max.hbcustomview.seekbar.a aVar3 = this.T;
            float f10 = aVar3.f69365y;
            int i10 = this.f69331u;
            int i11 = (int) (f10 * i10);
            int i12 = (int) (this.U.f69365y * i10);
            int iX = aVar3.x();
            int iX2 = this.U.x();
            int iJ = this.T.j();
            int iR = this.T.r();
            int iJ2 = this.U.j();
            int iR2 = this.U.r();
            if (iX == 0) {
                Paint paint = new Paint();
                paint.setTextSize(this.T.w());
                com.max.hbcustomview.seekbar.a aVar4 = this.T;
                iX = (int) paint.measureText(aVar4.c(aVar4.G));
                com.max.hbcustomview.seekbar.a aVar5 = this.T;
                iJ = (int) ((aVar5.R / 2.0f) - (((aVar5.m() + iX) + this.T.n()) / 2.0f));
                iR = iJ + iX + this.T.m() + this.T.n();
                int iB = ic.a.f119343a.b(getContext(), 1);
                int i13 = (iR - iJ) / 2;
                int progressLeft = ((i13 - ((int) (this.f69331u * this.T.f69365y))) - getProgressLeft()) + iB;
                int progressPaddingRight = ((i13 - ((int) (this.f69331u * (1.0f - this.T.f69365y)))) - getProgressPaddingRight()) + iB;
                if (progressLeft > 0) {
                    iJ += progressLeft;
                    iR += progressLeft;
                } else if (progressPaddingRight > 0) {
                    iJ -= progressPaddingRight;
                    iR -= progressPaddingRight;
                }
            }
            if (iX2 == 0) {
                Paint paint2 = new Paint();
                paint2.setTextSize(this.U.w());
                com.max.hbcustomview.seekbar.a aVar6 = this.U;
                iX2 = (int) paint2.measureText(aVar6.c(aVar6.G));
                com.max.hbcustomview.seekbar.a aVar7 = this.U;
                iJ2 = (int) ((aVar7.R / 2.0f) - (((aVar7.m() + iX2) + this.U.n()) / 2.0f));
                iR2 = iJ2 + iX2 + this.U.m() + this.U.n();
                int iB2 = ic.a.f119343a.b(getContext(), 1);
                int i14 = (iR2 - iJ2) / 2;
                int progressLeft2 = ((i14 - ((int) (this.f69331u * this.U.f69365y))) - getProgressLeft()) + iB2;
                int progressPaddingRight2 = ((i14 - ((int) (this.f69331u * (1.0f - this.U.f69365y)))) - getProgressPaddingRight()) + iB2;
                if (progressLeft2 > 0) {
                    iJ2 += progressLeft2;
                    iR2 += progressLeft2;
                } else if (progressPaddingRight2 > 0) {
                    iJ2 -= progressPaddingRight2;
                    iR2 -= progressPaddingRight2;
                }
            }
            if (this.T.m() <= 0) {
                if (this.T.n() > 0) {
                    iN = (iR - this.T.n()) - iX;
                } else {
                    iM = (this.T.m() + this.T.n()) / 2;
                }
                if (this.U.m() > 0) {
                    if (this.U.n() > 0) {
                        iN2 = (iR2 - this.U.n()) - iX2;
                    } else {
                        iM2 = (this.U.m() + this.U.n()) / 2;
                    }
                    iM3 = (((((((((this.T.m() + iX) + this.T.n()) + this.U.m()) + iX2) + this.U.n()) / 2) + iN) - iN2) - (i12 - i11)) + 20;
                    if (iM3 > 0) {
                        this.T.j0(0);
                        this.U.j0(0);
                        return;
                    }
                    if (this.V == null) {
                        if (iN > 0) {
                            this.V = this.U;
                        } else {
                            this.V = this.T;
                        }
                    }
                    aVar = this.V;
                    aVar2 = this.T;
                    if (aVar == aVar2) {
                        if (this.U.v() > 0) {
                            this.U.j0(iM3);
                            return;
                        } else {
                            this.T.j0(-iM3);
                            return;
                        }
                    }
                    if (aVar2.v() < 0) {
                        this.T.j0(-iM3);
                    } else {
                        this.U.j0(iM3);
                    }
                }
                iM2 = this.U.m();
                iN2 = iJ2 + iM2;
                iM3 = (((((((((this.T.m() + iX) + this.T.n()) + this.U.m()) + iX2) + this.U.n()) / 2) + iN) - iN2) - (i12 - i11)) + 20;
                if (iM3 > 0) {
                    this.T.j0(0);
                    this.U.j0(0);
                    return;
                }
                if (this.V == null) {
                    if (iN > 0) {
                        this.V = this.U;
                    } else {
                        this.V = this.T;
                    }
                }
                aVar = this.V;
                aVar2 = this.T;
                if (aVar == aVar2) {
                    if (this.U.v() > 0) {
                        this.U.j0(iM3);
                        return;
                    } else {
                        this.T.j0(-iM3);
                        return;
                    }
                }
                if (aVar2.v() < 0) {
                    this.T.j0(-iM3);
                } else {
                    this.U.j0(iM3);
                }
            }
            iM = this.T.m();
            iN = iJ + iM;
            if (this.U.m() > 0) {
                if (this.U.n() > 0) {
                    iN2 = (iR2 - this.U.n()) - iX2;
                } else {
                    iM2 = (this.U.m() + this.U.n()) / 2;
                }
                iM3 = (((((((((this.T.m() + iX) + this.T.n()) + this.U.m()) + iX2) + this.U.n()) / 2) + iN) - iN2) - (i12 - i11)) + 20;
                if (iM3 > 0) {
                    this.T.j0(0);
                    this.U.j0(0);
                    return;
                }
                if (this.V == null) {
                    if (iN > 0) {
                        this.V = this.U;
                    } else {
                        this.V = this.T;
                    }
                }
                aVar = this.V;
                aVar2 = this.T;
                if (aVar == aVar2) {
                    if (this.U.v() > 0) {
                        this.U.j0(iM3);
                        return;
                    } else {
                        this.T.j0(-iM3);
                        return;
                    }
                }
                if (aVar2.v() < 0) {
                    this.T.j0(-iM3);
                } else {
                    this.U.j0(iM3);
                }
            }
            iM2 = this.U.m();
            iN2 = iJ2 + iM2;
            iM3 = (((((((((this.T.m() + iX) + this.T.n()) + this.U.m()) + iX2) + this.U.n()) / 2) + iN) - iN2) - (i12 - i11)) + 20;
            if (iM3 > 0) {
                this.T.j0(0);
                this.U.j0(0);
                return;
            }
            if (this.V == null) {
                if (iN > 0) {
                    this.V = this.U;
                } else {
                    this.V = this.T;
                }
            }
            aVar = this.V;
            aVar2 = this.T;
            if (aVar == aVar2) {
                if (this.U.v() > 0) {
                    this.U.j0(iM3);
                    return;
                } else {
                    this.T.j0(-iM3);
                    return;
                }
            }
            if (aVar2.v() < 0) {
                this.T.j0(-iM3);
            } else {
                this.U.j0(iM3);
            }
        }
    }

    private void c(boolean z10) {
        com.max.hbcustomview.seekbar.a aVar;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Ho, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10 || (aVar = this.V) == null) {
            this.T.U(false);
            if (this.f69315f == 2) {
                this.U.U(false);
                return;
            }
            return;
        }
        com.max.hbcustomview.seekbar.a aVar2 = this.T;
        boolean z11 = aVar == aVar2;
        aVar2.U(z11);
        if (this.f69315f == 2) {
            this.U.U(true ^ z11);
        }
    }

    private void f(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.f.vo, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.B2);
            this.f69315f = typedArrayObtainStyledAttributes.getInt(R.styleable.RangeSeekBar_rsb_mode, 2);
            this.F = typedArrayObtainStyledAttributes.getFloat(R.styleable.RangeSeekBar_rsb_min, 0.0f);
            this.G = typedArrayObtainStyledAttributes.getFloat(R.styleable.RangeSeekBar_rsb_max, 100.0f);
            this.f69332v = typedArrayObtainStyledAttributes.getFloat(R.styleable.RangeSeekBar_rsb_min_interval, 0.0f);
            this.f69333w = typedArrayObtainStyledAttributes.getInt(R.styleable.RangeSeekBar_rsb_gravity, 0);
            this.f69325p = typedArrayObtainStyledAttributes.getColor(R.styleable.RangeSeekBar_rsb_progress_color, -11806366);
            this.f69324o = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_progress_radius, -1.0f);
            this.f69327q = typedArrayObtainStyledAttributes.getColor(R.styleable.RangeSeekBar_rsb_progress_default_color, -2631721);
            this.f69328r = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RangeSeekBar_rsb_progress_drawable, 0);
            this.f69329s = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RangeSeekBar_rsb_progress_drawable_default, 0);
            int i10 = R.styleable.RangeSeekBar_rsb_progress_height;
            ic.a aVar = ic.a.f119343a;
            this.f69330t = (int) typedArrayObtainStyledAttributes.getDimension(i10, aVar.b(getContext(), 2));
            this.f69316g = typedArrayObtainStyledAttributes.getInt(R.styleable.RangeSeekBar_rsb_tick_mark_mode, 0);
            this.f69319j = typedArrayObtainStyledAttributes.getInt(R.styleable.RangeSeekBar_rsb_tick_mark_gravity, 1);
            this.f69320k = typedArrayObtainStyledAttributes.getInt(R.styleable.RangeSeekBar_rsb_tick_mark_layout_gravity, 0);
            this.f69323n = typedArrayObtainStyledAttributes.getTextArray(R.styleable.RangeSeekBar_rsb_tick_mark_text_array);
            this.f69317h = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_tick_mark_text_margin, aVar.b(getContext(), 7));
            this.f69318i = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_tick_mark_text_size, aVar.b(getContext(), 12));
            this.f69321l = typedArrayObtainStyledAttributes.getColor(R.styleable.RangeSeekBar_rsb_tick_mark_text_color, this.f69327q);
            this.f69322m = typedArrayObtainStyledAttributes.getColor(R.styleable.RangeSeekBar_rsb_tick_mark_in_range_text_color, this.f69325p);
            this.C = typedArrayObtainStyledAttributes.getInt(R.styleable.RangeSeekBar_rsb_steps, 0);
            this.f69336y = typedArrayObtainStyledAttributes.getColor(R.styleable.RangeSeekBar_rsb_step_color, -6447715);
            this.B = typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_step_radius, 0.0f);
            this.f69337z = typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_step_width, 0.0f);
            this.A = typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSeekBar_rsb_step_height, 0.0f);
            this.E = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RangeSeekBar_rsb_step_drawable, 0);
            this.D = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RangeSeekBar_rsb_step_auto_bonding, true);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Go, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N.setStyle(Paint.Style.FILL);
        this.N.setColor(this.f69327q);
        this.N.setTextSize(this.f69318i);
    }

    private void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.so, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.W == null) {
            this.W = h.f(getContext(), this.f69331u, this.f69330t, this.f69328r);
        }
        if (this.f69308a0 == null) {
            this.f69308a0 = h.f(getContext(), this.f69331u, this.f69330t, this.f69329s);
        }
    }

    private void i(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.f.uo, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        this.T = new com.max.hbcustomview.seekbar.a(this, attributeSet, true);
        com.max.hbcustomview.seekbar.a aVar = new com.max.hbcustomview.seekbar.a(this, attributeSet, false);
        this.U = aVar;
        aVar.v0(this.f69315f != 1);
    }

    private void j() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.to, new Class[0], Void.TYPE).isSupported && t() && this.E != 0 && this.f69310b0.isEmpty()) {
            Bitmap bitmapF = h.f(getContext(), (int) this.f69337z, (int) this.A, this.E);
            for (int i10 = 0; i10 <= this.C; i10++) {
                this.f69310b0.add(bitmapF);
            }
        }
    }

    private void r() {
        com.max.hbcustomview.seekbar.a aVar;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Lo, new Class[0], Void.TYPE).isSupported && (aVar = this.V) != null && aVar.G() > 1.0f && this.M) {
            this.M = false;
            this.V.S();
        }
    }

    private void s() {
        com.max.hbcustomview.seekbar.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ko, new Class[0], Void.TYPE).isSupported || (aVar = this.V) == null || aVar.G() <= 1.0f || this.M) {
            return;
        }
        this.M = true;
        this.V.T();
    }

    private boolean t() {
        return this.C >= 1 && this.A > 0.0f && this.f69337z > 0.0f;
    }

    public float a(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Mo, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        float f11 = 0.0f;
        if (this.V == null) {
            return 0.0f;
        }
        float progressLeft = ((f10 - getProgressLeft()) * 1.0f) / this.f69331u;
        if (f10 >= getProgressLeft()) {
            f11 = f10 > ((float) getProgressRight()) ? 1.0f : progressLeft;
        }
        if (this.f69315f != 2) {
            return f11;
        }
        com.max.hbcustomview.seekbar.a aVar = this.V;
        com.max.hbcustomview.seekbar.a aVar2 = this.T;
        if (aVar == aVar2) {
            float f12 = this.U.f69365y;
            float f13 = this.L;
            return f11 > f12 - f13 ? f12 - f13 : f11;
        }
        if (aVar != this.U) {
            return f11;
        }
        float f14 = aVar2.f69365y;
        float f15 = this.L;
        return f11 < f14 + f15 ? f14 + f15 : f11;
    }

    public float d(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.Io, new Class[]{MotionEvent.class}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : motionEvent.getX();
    }

    public float e(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.Jo, new Class[]{MotionEvent.class}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : motionEvent.getY();
    }

    public int getGravity() {
        return this.f69333w;
    }

    public com.max.hbcustomview.seekbar.a getLeftSeekBar() {
        return this.T;
    }

    public float getMaxProgress() {
        return this.G;
    }

    public float getMinInterval() {
        return this.f69332v;
    }

    public float getMinProgress() {
        return this.F;
    }

    public int getProgressBottom() {
        return this.f69311c;
    }

    public int getProgressColor() {
        return this.f69325p;
    }

    public int getProgressDefaultColor() {
        return this.f69327q;
    }

    public int getProgressDefaultDrawableId() {
        return this.f69329s;
    }

    public int getProgressDrawableId() {
        return this.f69328r;
    }

    public int getProgressHeight() {
        return this.f69330t;
    }

    public int getProgressLeft() {
        return this.f69313d;
    }

    public int getProgressPaddingRight() {
        return this.f69312c0;
    }

    public float getProgressRadius() {
        return this.f69324o;
    }

    public int getProgressRight() {
        return this.f69314e;
    }

    public int getProgressTop() {
        return this.f69309b;
    }

    public int getProgressWidth() {
        return this.f69331u;
    }

    public com.max.hbcustomview.seekbar.g[] getRangeSeekBarState() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.So, new Class[0], com.max.hbcustomview.seekbar.g[].class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcustomview.seekbar.g[]) patchProxyResultProxy.result;
        }
        com.max.hbcustomview.seekbar.g gVar = new com.max.hbcustomview.seekbar.g();
        float fZ = this.T.z();
        gVar.f69375b = fZ;
        c cVar = this.f69335x1;
        gVar.f69374a = cVar != null ? cVar.a(fZ) : String.valueOf(fZ);
        if (h.a(gVar.f69375b, this.F) == 0) {
            gVar.f69376c = true;
        } else if (h.a(gVar.f69375b, this.G) == 0) {
            gVar.f69377d = true;
        }
        com.max.hbcustomview.seekbar.g gVar2 = new com.max.hbcustomview.seekbar.g();
        if (this.f69315f == 2) {
            float fZ2 = this.U.z();
            gVar2.f69375b = fZ2;
            c cVar2 = this.f69335x1;
            gVar2.f69374a = cVar2 != null ? cVar2.a(fZ2) : String.valueOf(fZ2);
            if (h.a(this.U.f69365y, this.F) == 0) {
                gVar2.f69376c = true;
            } else if (h.a(this.U.f69365y, this.G) == 0) {
                gVar2.f69377d = true;
            }
        }
        return new com.max.hbcustomview.seekbar.g[]{gVar, gVar2};
    }

    public float getRawHeight() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.zo, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        if (this.f69315f == 1) {
            float fA = this.T.A();
            if (this.f69320k != 1 || this.f69323n == null) {
                return fA;
            }
            return (fA - (this.T.F() / 2.0f)) + (this.f69330t / 2.0f) + Math.max((this.T.F() - this.f69330t) / 2.0f, getTickMarkRawHeight());
        }
        float fMax = Math.max(this.T.A(), this.U.A());
        if (this.f69320k != 1 || this.f69323n == null) {
            return fMax;
        }
        float fMax2 = Math.max(this.T.F(), this.U.F());
        return (fMax - (fMax2 / 2.0f)) + (this.f69330t / 2.0f) + Math.max((fMax2 - this.f69330t) / 2.0f, getTickMarkRawHeight());
    }

    public com.max.hbcustomview.seekbar.a getRightSeekBar() {
        return this.U;
    }

    public int getSeekBarMode() {
        return this.f69315f;
    }

    public int getSteps() {
        return this.C;
    }

    public List<Bitmap> getStepsBitmaps() {
        return this.f69310b0;
    }

    public int getStepsColor() {
        return this.f69336y;
    }

    public int getStepsDrawableId() {
        return this.E;
    }

    public float getStepsHeight() {
        return this.A;
    }

    public float getStepsRadius() {
        return this.B;
    }

    public float getStepsWidth() {
        return this.f69337z;
    }

    public int getTickMarkGravity() {
        return this.f69319j;
    }

    public int getTickMarkInRangeTextColor() {
        return this.f69322m;
    }

    public int getTickMarkLayoutGravity() {
        return this.f69320k;
    }

    public int getTickMarkMode() {
        return this.f69316g;
    }

    public int getTickMarkRawHeight() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.yo, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        CharSequence[] charSequenceArr = this.f69323n;
        if (charSequenceArr == null || charSequenceArr.length <= 0) {
            return 0;
        }
        return this.f69317h + h.h(String.valueOf(charSequenceArr[0]), this.f69318i).height() + 3;
    }

    public CharSequence[] getTickMarkTextArray() {
        return this.f69323n;
    }

    public int getTickMarkTextColor() {
        return this.f69321l;
    }

    public int getTickMarkTextMargin() {
        return this.f69317h;
    }

    public int getTickMarkTextSize() {
        return this.f69318i;
    }

    public boolean k() {
        return this.f69334x;
    }

    public boolean l() {
        return this.D;
    }

    public void m(Canvas canvas, Paint paint) {
        if (PatchProxy.proxy(new Object[]{canvas, paint}, this, changeQuickRedirect, false, bb.c.f.Do, new Class[]{Canvas.class, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        if (h.l(this.f69308a0)) {
            canvas.drawBitmap(this.f69308a0, (Rect) null, this.O, paint);
        } else {
            paint.setColor(this.f69327q);
            RectF rectF = this.O;
            float f10 = this.f69324o;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
        if (this.f69315f == 2) {
            this.P.top = getProgressTop();
            RectF rectF2 = this.P;
            com.max.hbcustomview.seekbar.a aVar = this.T;
            rectF2.left = aVar.f69361u + (aVar.H() / 2.0f) + (this.f69331u * this.T.f69365y);
            RectF rectF3 = this.P;
            com.max.hbcustomview.seekbar.a aVar2 = this.U;
            rectF3.right = aVar2.f69361u + (aVar2.H() / 2.0f) + (this.f69331u * this.U.f69365y);
            this.P.bottom = getProgressBottom();
        } else {
            this.P.top = getProgressTop();
            RectF rectF4 = this.P;
            com.max.hbcustomview.seekbar.a aVar3 = this.T;
            rectF4.left = aVar3.f69361u + (aVar3.H() / 2.0f);
            RectF rectF5 = this.P;
            com.max.hbcustomview.seekbar.a aVar4 = this.T;
            rectF5.right = aVar4.f69361u + (aVar4.H() / 2.0f) + (this.f69331u * this.T.f69365y);
            this.P.bottom = getProgressBottom();
        }
        if (!h.l(this.W)) {
            paint.setColor(this.f69325p);
            RectF rectF6 = this.P;
            float f11 = this.f69324o;
            canvas.drawRoundRect(rectF6, f11, f11, paint);
            return;
        }
        Rect rect = this.Q;
        rect.top = 0;
        rect.bottom = this.W.getHeight();
        int width = this.W.getWidth();
        if (this.f69315f == 2) {
            Rect rect2 = this.Q;
            float f12 = width;
            rect2.left = (int) (this.T.f69365y * f12);
            rect2.right = (int) (f12 * this.U.f69365y);
        } else {
            Rect rect3 = this.Q;
            rect3.left = 0;
            rect3.right = (int) (width * this.T.f69365y);
        }
        canvas.drawBitmap(this.W, this.Q, this.P, (Paint) null);
    }

    public void n(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.Fo, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.T.s() == 3) {
            this.T.n0(true);
        }
        this.T.b(canvas);
        if (this.f69315f == 2) {
            if (this.U.s() == 3) {
                this.U.n0(true);
            }
            this.U.b(canvas);
        }
    }

    public void o(Canvas canvas, Paint paint) {
        if (!PatchProxy.proxy(new Object[]{canvas, paint}, this, changeQuickRedirect, false, bb.c.f.Eo, new Class[]{Canvas.class, Paint.class}, Void.TYPE).isSupported && t()) {
            int progressWidth = getProgressWidth() / this.C;
            float progressHeight = (this.A - getProgressHeight()) / 2.0f;
            for (int i10 = 0; i10 <= this.C; i10++) {
                float progressLeft = (getProgressLeft() + (i10 * progressWidth)) - (this.f69337z / 2.0f);
                this.R.set(progressLeft, getProgressTop() - progressHeight, this.f69337z + progressLeft, getProgressBottom() + progressHeight);
                if (this.f69310b0.isEmpty() || this.f69310b0.size() <= i10) {
                    paint.setColor(this.f69336y);
                    RectF rectF = this.R;
                    float f10 = this.B;
                    canvas.drawRoundRect(rectF, f10, f10, paint);
                } else {
                    canvas.drawBitmap(this.f69310b0.get(i10), (Rect) null, this.R, paint);
                }
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.Bo, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        p(canvas, this.N);
        m(canvas, this.N);
        o(canvas, this.N);
        b();
        n(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        float rawHeight;
        int iMakeMeasureSpec;
        float rawHeight2;
        float fMax;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.xo, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == 1073741824) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        } else if (mode == Integer.MIN_VALUE && (getParent() instanceof ViewGroup) && size == -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((ViewGroup) getParent()).getMeasuredHeight(), Integer.MIN_VALUE);
        } else {
            if (this.f69333w == 2) {
                if (this.f69323n == null || this.f69320k != 1) {
                    rawHeight2 = getRawHeight();
                    fMax = Math.max(this.T.F(), this.U.F()) / 2.0f;
                } else {
                    rawHeight2 = getRawHeight();
                    fMax = getTickMarkRawHeight();
                }
                rawHeight = (rawHeight2 - fMax) * 2.0f;
            } else {
                rawHeight = getRawHeight();
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) rawHeight, 1073741824);
        }
        super.onMeasure(i10, iMakeMeasureSpec);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Ao, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        q(i10, i11);
        setRange(this.F, this.G, this.f69332v);
        int progressBottom = (getProgressBottom() + getProgressTop()) / 2;
        this.T.R(getProgressLeft(), progressBottom);
        if (this.f69315f == 2) {
            this.U.R(getProgressLeft(), progressBottom);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.No, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.H) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.J = d(motionEvent);
            this.K = e(motionEvent);
            if (this.f69315f != 2) {
                this.V = this.T;
                s();
            } else if (this.U.f69365y >= 1.0f && this.T.a(d(motionEvent), e(motionEvent))) {
                this.V = this.T;
                s();
            } else if (this.U.a(d(motionEvent), e(motionEvent))) {
                this.V = this.U;
                s();
            } else {
                float progressLeft = ((this.J - getProgressLeft()) * 1.0f) / this.f69331u;
                if (Math.abs(this.T.f69365y - progressLeft) < Math.abs(this.U.f69365y - progressLeft)) {
                    this.V = this.T;
                } else {
                    this.V = this.U;
                }
                if (!this.I && this.V == this.T) {
                    return true;
                }
                this.V.x0(a(this.J));
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            com.max.hbcustomview.seekbar.f fVar = this.f69326p1;
            if (fVar != null) {
                fVar.b(this, this.V == this.T);
            }
            c(true);
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    if (this.f69315f == 2) {
                        this.U.n0(false);
                    }
                    com.max.hbcustomview.seekbar.a aVar = this.V;
                    if (aVar == this.T || aVar == this.U) {
                        r();
                    }
                    this.T.n0(false);
                    if (this.f69326p1 != null) {
                        com.max.hbcustomview.seekbar.g[] rangeSeekBarState = getRangeSeekBarState();
                        this.f69326p1.a(this, rangeSeekBarState[0].f69375b, rangeSeekBarState[1].f69375b, false);
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    c(false);
                }
            } else {
                if (!this.I && this.V == this.T) {
                    return true;
                }
                float fD = d(motionEvent);
                if (this.f69315f == 2 && this.T.f69365y == this.U.f69365y) {
                    this.V.O();
                    com.max.hbcustomview.seekbar.f fVar2 = this.f69326p1;
                    if (fVar2 != null) {
                        fVar2.c(this, this.V == this.T);
                    }
                    if (fD - this.J > 0.0f) {
                        com.max.hbcustomview.seekbar.a aVar2 = this.V;
                        if (aVar2 != this.U) {
                            aVar2.n0(false);
                            r();
                            this.V = this.U;
                        }
                    } else {
                        com.max.hbcustomview.seekbar.a aVar3 = this.V;
                        if (aVar3 != this.T) {
                            if (!this.I) {
                                return true;
                            }
                            aVar3.n0(false);
                            r();
                            this.V = this.T;
                        }
                    }
                    com.max.hbcustomview.seekbar.f fVar3 = this.f69326p1;
                    if (fVar3 != null) {
                        fVar3.b(this, this.V == this.T);
                    }
                }
                s();
                com.max.hbcustomview.seekbar.a aVar4 = this.V;
                float f10 = aVar4.f69366z;
                aVar4.f69366z = f10 < 1.0f ? 0.1f + f10 : 1.0f;
                this.J = fD;
                aVar4.x0(a(fD));
                this.V.n0(true);
                if (this.f69326p1 != null) {
                    com.max.hbcustomview.seekbar.g[] rangeSeekBarState2 = getRangeSeekBarState();
                    this.f69326p1.a(this, rangeSeekBarState2[0].f69375b, rangeSeekBarState2[1].f69375b, true);
                }
                invalidate();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                c(true);
            }
        } else {
            if (!this.I && this.V == this.T) {
                return true;
            }
            if (t() && this.D) {
                float fA = a(d(motionEvent));
                float f11 = 1.0f / this.C;
                int iIntValue = new BigDecimal(fA / f11).setScale(0, RoundingMode.HALF_UP).intValue();
                Log.d("zzzzseekbar", "ACTION_UP  stepSelected ===" + iIntValue);
                this.V.x0(((float) iIntValue) * f11);
            }
            if (this.f69315f == 2) {
                this.U.n0(false);
            }
            this.T.n0(false);
            this.V.O();
            r();
            if (this.f69326p1 != null) {
                com.max.hbcustomview.seekbar.g[] rangeSeekBarState3 = getRangeSeekBarState();
                this.f69326p1.a(this, rangeSeekBarState3[0].f69375b, rangeSeekBarState3[1].f69375b, true);
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            com.max.hbcustomview.seekbar.f fVar4 = this.f69326p1;
            if (fVar4 != null) {
                fVar4.c(this, this.V == this.T);
            }
            c(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p(Canvas canvas, Paint paint) {
        CharSequence[] charSequenceArr;
        float fWidth;
        int progressLeft;
        if (PatchProxy.proxy(new Object[]{canvas, paint}, this, changeQuickRedirect, false, bb.c.f.Co, new Class[]{Canvas.class, Paint.class}, Void.TYPE).isSupported || (charSequenceArr = this.f69323n) == null) {
            return;
        }
        int length = this.f69331u / (charSequenceArr.length - 1);
        int i10 = 0;
        while (true) {
            CharSequence[] charSequenceArr2 = this.f69323n;
            if (i10 >= charSequenceArr2.length) {
                return;
            }
            String string = charSequenceArr2[i10].toString();
            if (!TextUtils.isEmpty(string)) {
                paint.getTextBounds(string, 0, string.length(), this.S);
                paint.setColor(this.f69321l);
                if (this.f69316g == 1) {
                    int i11 = this.f69319j;
                    if (i11 == 2) {
                        progressLeft = (getProgressLeft() + (i10 * length)) - this.S.width();
                    } else if (i11 == 1) {
                        fWidth = (getProgressLeft() + (i10 * length)) - (this.S.width() / 2.0f);
                    } else {
                        progressLeft = getProgressLeft() + (i10 * length);
                    }
                    fWidth = progressLeft;
                } else {
                    float fI = h.i(string);
                    com.max.hbcustomview.seekbar.g[] rangeSeekBarState = getRangeSeekBarState();
                    if (h.a(fI, rangeSeekBarState[0].f69375b) != -1 && h.a(fI, rangeSeekBarState[1].f69375b) != 1 && this.f69315f == 2) {
                        paint.setColor(this.f69322m);
                    }
                    float progressLeft2 = getProgressLeft();
                    float f10 = this.f69331u;
                    float f11 = this.F;
                    fWidth = (progressLeft2 + ((f10 * (fI - f11)) / (this.G - f11))) - (this.S.width() / 2.0f);
                }
                canvas.drawText(string, fWidth, this.f69320k == 0 ? getProgressTop() - this.f69317h : getProgressBottom() + this.f69317h + this.S.height(), paint);
            }
            i10++;
        }
    }

    public void q(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.wo, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int paddingBottom = (i11 - getPaddingBottom()) - getPaddingTop();
        if (i11 <= 0) {
            return;
        }
        int i12 = this.f69333w;
        if (i12 == 0) {
            float fMax = (this.T.s() == 1 && this.U.s() == 1) ? 0.0f : Math.max(this.T.q(), this.U.q());
            float fMax2 = Math.max(this.T.F(), this.U.F());
            int i13 = this.f69330t;
            float f10 = fMax2 - (i13 / 2.0f);
            this.f69309b = (int) (((f10 - i13) / 2.0f) + fMax);
            if (this.f69323n != null && this.f69320k == 0) {
                this.f69309b = (int) Math.max(getTickMarkRawHeight(), fMax + ((f10 - this.f69330t) / 2.0f));
            }
            this.f69311c = this.f69309b + this.f69330t;
        } else if (i12 == 1) {
            if (this.f69323n == null || this.f69320k != 1) {
                this.f69311c = (int) ((paddingBottom - (Math.max(this.T.F(), this.U.F()) / 2.0f)) + (this.f69330t / 2.0f));
            } else {
                this.f69311c = paddingBottom - getTickMarkRawHeight();
            }
            this.f69309b = this.f69311c - this.f69330t;
        } else {
            int i14 = this.f69330t;
            int i15 = (paddingBottom - i14) / 2;
            this.f69309b = i15;
            this.f69311c = i15 + i14;
        }
        int iMax = ((int) Math.max(this.T.H(), this.U.H())) / 2;
        this.f69313d = getPaddingLeft() + iMax;
        int paddingRight = (i10 - iMax) - getPaddingRight();
        this.f69314e = paddingRight;
        this.f69331u = paddingRight - this.f69313d;
        this.O.set(getProgressLeft(), getProgressTop(), getProgressRight(), getProgressBottom());
        this.f69312c0 = i10 - this.f69314e;
        if (this.f69324o <= 0.0f) {
            this.f69324o = (int) ((getProgressBottom() - getProgressTop()) * 0.45f);
        }
        h();
    }

    public void setEnableThumbOverlap(boolean z10) {
        this.f69334x = z10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.To, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setEnabled(z10);
        this.H = z10;
    }

    public void setGravity(int i10) {
        this.f69333w = i10;
    }

    public void setIndicatorText(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.f.Uo, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.T.g0(str);
        if (this.f69315f == 2) {
            this.U.g0(str);
        }
    }

    public void setIndicatorTextDecimalFormat(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.f.Vo, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.T.i0(str);
        if (this.f69315f == 2) {
            this.U.i0(str);
        }
    }

    public void setIndicatorTextStringFormat(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.f.Wo, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.T.l0(str);
        if (this.f69315f == 2) {
            this.U.l0(str);
        }
    }

    public void setLeftEnable(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.ep, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.I = z10;
        this.T.o0(z10);
    }

    public void setOnRangeChangedListener(com.max.hbcustomview.seekbar.f fVar) {
        this.f69326p1 = fVar;
    }

    public void setProgress(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.Oo, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setProgress(f10, this.G);
    }

    public void setProgress(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Po, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        float fMin = Math.min(f10, f11);
        float fMax = Math.max(fMin, f11);
        float f12 = fMax - fMin;
        float f13 = this.f69332v;
        if (f12 < f13) {
            if (fMin - this.F > this.G - fMax) {
                fMin = fMax - f13;
            } else {
                fMax = fMin + f13;
            }
        }
        float f14 = this.F;
        if (fMin < f14) {
            throw new IllegalArgumentException("setProgress() min < (preset min - offsetValue) . #min:" + fMin + " #preset min:" + fMax);
        }
        float f15 = this.G;
        if (fMax > f15) {
            throw new IllegalArgumentException("setProgress() max > (preset max - offsetValue) . #max:" + fMax + " #preset max:" + fMax);
        }
        float f16 = f15 - f14;
        this.T.f69365y = Math.abs(fMin - f14) / f16;
        if (this.f69315f == 2) {
            this.U.f69365y = Math.abs(fMax - this.F) / f16;
        }
        com.max.hbcustomview.seekbar.f fVar = this.f69326p1;
        if (fVar != null) {
            fVar.a(this, fMin, fMax, false);
        }
        invalidate();
    }

    public void setProgressBottom(int i10) {
        this.f69311c = i10;
    }

    public void setProgressColor(@l int i10) {
        this.f69325p = i10;
    }

    public void setProgressColor(@l int i10, @l int i11) {
        this.f69327q = i10;
        this.f69325p = i11;
    }

    public void setProgressDefaultColor(@l int i10) {
        this.f69327q = i10;
    }

    public void setProgressDefaultDrawableId(@v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Zo, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69329s = i10;
        this.f69308a0 = null;
        h();
    }

    public void setProgressDrawableId(@v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Yo, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69328r = i10;
        this.W = null;
        h();
    }

    public void setProgressHeight(int i10) {
        this.f69330t = i10;
    }

    public void setProgressLeft(int i10) {
        this.f69313d = i10;
    }

    public void setProgressRadius(float f10) {
        this.f69324o = f10;
    }

    public void setProgressRight(int i10) {
        this.f69314e = i10;
    }

    public void setProgressTop(int i10) {
        this.f69309b = i10;
    }

    public void setProgressWidth(int i10) {
        this.f69331u = i10;
    }

    public void setRange(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Qo, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setRange(f10, f11, this.f69332v);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006e  */
    public void setRange(float f10, float f11, float f12) {
        float f13;
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Ro, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("setRange() max must be greater than min ! #max:" + f11 + " #min:" + f10);
        }
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("setRange() interval must be greater than zero ! #minInterval:" + f12);
        }
        float f14 = f11 - f10;
        if (f12 > f14) {
            throw new IllegalArgumentException("setRange() interval must be less than (max - min) ! #minInterval:" + f12 + " #max - min:" + f14);
        }
        this.G = f11;
        this.F = f10;
        this.f69332v = f12;
        float f15 = f12 / f14;
        this.L = f15;
        if (this.f69315f == 2) {
            com.max.hbcustomview.seekbar.a aVar = this.T;
            float f16 = aVar.f69365y;
            if (f16 + f15 <= 1.0f) {
                float f17 = f16 + f15;
                com.max.hbcustomview.seekbar.a aVar2 = this.U;
                if (f17 > aVar2.f69365y) {
                    aVar2.f69365y = f16 + f15;
                } else {
                    f13 = this.U.f69365y;
                    if (f13 - f15 >= 0.0f && f13 - f15 < f16) {
                        aVar.f69365y = f13 - f15;
                    }
                }
            } else {
                f13 = this.U.f69365y;
                if (f13 - f15 >= 0.0f) {
                    aVar.f69365y = f13 - f15;
                }
            }
        }
        invalidate();
    }

    public void setSeekBarMode(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Xo, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69315f = i10;
        this.U.v0(i10 != 1);
    }

    public void setSteps(int i10) {
        this.C = i10;
    }

    public void setStepsAutoBonding(boolean z10) {
        this.D = z10;
    }

    public void setStepsBitmaps(List<Bitmap> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.cp, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list == null || list.isEmpty() || list.size() <= this.C) {
            throw new IllegalArgumentException("stepsBitmaps must > steps !");
        }
        this.f69310b0.clear();
        this.f69310b0.addAll(list);
    }

    public void setStepsColor(@l int i10) {
        this.f69336y = i10;
    }

    public void setStepsDrawable(List<Integer> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.dp, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list == null || list.isEmpty() || list.size() <= this.C) {
            throw new IllegalArgumentException("stepsDrawableIds must > steps !");
        }
        if (!t()) {
            throw new IllegalArgumentException("stepsWidth must > 0, stepsHeight must > 0,steps must > 0 First!!");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(h.f(getContext(), (int) this.f69337z, (int) this.A, list.get(i10).intValue()));
        }
        setStepsBitmaps(arrayList);
    }

    public void setStepsDrawableId(@v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.bp, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69310b0.clear();
        this.E = i10;
        j();
    }

    public void setStepsHeight(float f10) {
        this.A = f10;
    }

    public void setStepsRadius(float f10) {
        this.B = f10;
    }

    public void setStepsWidth(float f10) {
        this.f69337z = f10;
    }

    public void setTextGenerator(c cVar) {
        this.f69335x1 = cVar;
    }

    public void setTickMarkGravity(int i10) {
        this.f69319j = i10;
    }

    public void setTickMarkInRangeTextColor(@l int i10) {
        this.f69322m = i10;
    }

    public void setTickMarkLayoutGravity(int i10) {
        this.f69320k = i10;
    }

    public void setTickMarkMode(int i10) {
        this.f69316g = i10;
    }

    public void setTickMarkTextArray(CharSequence[] charSequenceArr) {
        this.f69323n = charSequenceArr;
    }

    public void setTickMarkTextColor(@l int i10) {
        this.f69321l = i10;
    }

    public void setTickMarkTextMargin(int i10) {
        this.f69317h = i10;
    }

    public void setTickMarkTextSize(int i10) {
        this.f69318i = i10;
    }

    public void setTypeface(Typeface typeface) {
        if (PatchProxy.proxy(new Object[]{typeface}, this, changeQuickRedirect, false, bb.c.f.ap, new Class[]{Typeface.class}, Void.TYPE).isSupported) {
            return;
        }
        this.N.setTypeface(typeface);
        com.max.hbcustomview.seekbar.a aVar = this.T;
        if (aVar != null) {
            aVar.u0(typeface);
        }
        com.max.hbcustomview.seekbar.a aVar2 = this.U;
        if (aVar2 != null) {
            aVar2.u0(typeface);
        }
        com.max.hbcustomview.seekbar.a aVar3 = this.V;
        if (aVar3 != null) {
            aVar3.u0(typeface);
        }
    }
}
