package com.scwang.smartrefresh.layout.footer;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.graphics.f0;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;
import com.scwang.smartrefresh.layout.util.b;
import ng.f;
import ng.j;

/* JADX INFO: loaded from: classes8.dex */
public class BallPulseFooter extends InternalAbstract implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f96688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f96689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Paint f96690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f96691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f96692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f96693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected long f96694k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f96695l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected TimeInterpolator f96696m;

    public BallPulseFooter(Context context) {
        this(context, null);
    }

    public BallPulseFooter(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f96691h = -1118482;
        this.f96692i = -1615546;
        this.f96694k = 0L;
        this.f96695l = false;
        this.f96696m = new AccelerateDecelerateInterpolator();
        setMinimumHeight(b.d(60.0f));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f96573a);
        Paint paint = new Paint();
        this.f96690g = paint;
        paint.setColor(-1);
        this.f96690g.setStyle(Paint.Style.FILL);
        this.f96690g.setAntiAlias(true);
        og.b bVar = og.b.f132310d;
        this.f96765c = bVar;
        this.f96765c = og.b.f132315i[typedArrayObtainStyledAttributes.getInt(R.styleable.BallPulseFooter_srlClassicsSpinnerStyle, bVar.f132316a)];
        int i10 = R.styleable.BallPulseFooter_srlNormalColor;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            k(typedArrayObtainStyledAttributes.getColor(i10, 0));
        }
        int i11 = R.styleable.BallPulseFooter_srlAnimatingColor;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            f(typedArrayObtainStyledAttributes.getColor(i11, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f96693j = b.d(4.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float fMin = Math.min(width, height);
        float f10 = this.f96693j;
        float f11 = (fMin - (f10 * 2.0f)) / 6.0f;
        float f12 = f11 * 2.0f;
        float f13 = (width / 2.0f) - (f10 + f12);
        float f14 = height / 2.0f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (i10 < 3) {
            int i11 = i10 + 1;
            long j10 = (jCurrentTimeMillis - this.f96694k) - ((long) (i11 * 120));
            float interpolation = this.f96696m.getInterpolation(j10 > 0 ? (j10 % 750) / 750.0f : 0.0f);
            canvas.save();
            float f15 = i10;
            canvas.translate((f12 * f15) + f13 + (this.f96693j * f15), f14);
            if (interpolation < 0.5d) {
                float f16 = 1.0f - ((interpolation * 2.0f) * 0.7f);
                canvas.scale(f16, f16);
            } else {
                float f17 = ((interpolation * 2.0f) * 0.7f) - 0.4f;
                canvas.scale(f17, f17);
            }
            canvas.drawCircle(0.0f, 0.0f, f11, this.f96690g);
            canvas.restore();
            i10 = i11;
        }
        super.dispatchDraw(canvas);
        if (this.f96695l) {
            invalidate();
        }
    }

    public BallPulseFooter f(@l int i10) {
        this.f96692i = i10;
        this.f96689f = true;
        if (this.f96695l) {
            this.f96690g.setColor(i10);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public int g(@n0 j jVar, boolean z10) {
        this.f96695l = false;
        this.f96694k = 0L;
        this.f96690g.setColor(this.f96691h);
        return 0;
    }

    public BallPulseFooter k(@l int i10) {
        this.f96691h = i10;
        this.f96688e = true;
        if (!this.f96695l) {
            this.f96690g.setColor(i10);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public void p(@n0 j jVar, int i10, int i11) {
        if (this.f96695l) {
            return;
        }
        invalidate();
        this.f96695l = true;
        this.f96694k = System.currentTimeMillis();
        this.f96690g.setColor(this.f96692i);
    }

    public BallPulseFooter s(og.b bVar) {
        this.f96765c = bVar;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    @Deprecated
    public void setPrimaryColors(@l int... iArr) {
        if (!this.f96689f && iArr.length > 1) {
            f(iArr[0]);
            this.f96689f = false;
        }
        if (this.f96688e) {
            return;
        }
        if (iArr.length > 1) {
            k(iArr[1]);
        } else if (iArr.length > 0) {
            k(f0.t(-1711276033, iArr[0]));
        }
        this.f96688e = false;
    }
}
