package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f50380f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f50381g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f50382h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f50383i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f50384j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f50385k = 0.01f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f50386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private b f50387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f50388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50389e;

    public interface b {
        void a(float f10, float f11, boolean z10);
    }

    public final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f50390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f50391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f50392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f50393e;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f50390b = f10;
            this.f50391c = f11;
            this.f50392d = z10;
            if (this.f50393e) {
                return;
            }
            this.f50393e = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f50393e = false;
            if (AspectRatioFrameLayout.this.f50387c == null) {
                return;
            }
            AspectRatioFrameLayout.this.f50387c.a(this.f50390b, this.f50391c, this.f50392d);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50389e = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f50548a, 0, 0);
            try {
                this.f50389e = typedArrayObtainStyledAttributes.getInt(R.styleable.AspectRatioFrameLayout_resize_mode, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f50386b = new c();
    }

    public int getResizeMode() {
        return this.f50389e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f50388d <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f50388d / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f50386b.a(this.f50388d, f14, false);
            return;
        }
        int i12 = this.f50389e;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f50388d;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f50388d;
                    } else {
                        f11 = this.f50388d;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f50388d;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f50388d;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f50388d;
            measuredWidth = (int) (f13 * f10);
        }
        this.f50386b.a(this.f50388d, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f50388d != f10) {
            this.f50388d = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@androidx.annotation.p0 b bVar) {
        this.f50387c = bVar;
    }

    public void setResizeMode(int i10) {
        if (this.f50389e != i10) {
            this.f50389e = i10;
            requestLayout();
        }
    }
}
