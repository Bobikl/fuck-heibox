package com.max.xiaoheihe.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.starlightc.ucropplus.util.ModuleUtil;

/* JADX INFO: loaded from: classes13.dex */
public class ContentAutoPlayTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f95827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f95828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bitmap f95829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f95830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f95831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ValueAnimator f95832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f95833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f95835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f95836k;

    public ContentAutoPlayTextView(Context context) {
        this(context, null);
    }

    public ContentAutoPlayTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentAutoPlayTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f95833h = R.drawable.game_heybox_stat_sss_290x36;
        this.f95834i = 0;
        this.f95835j = false;
        this.f95836k = 7000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 49419, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f95834i = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    private void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49415, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f95827b = getResources().getDrawable(this.f95833h);
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        int iAbs = (int) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom));
        this.f95831f = iAbs;
        this.f95830e = (iAbs * this.f95827b.getMinimumWidth()) / this.f95827b.getMinimumHeight();
    }

    public boolean g() {
        return this.f95835j;
    }

    public long getDuration() {
        return this.f95836k;
    }

    public void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49416, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            if (getText().length() > 0) {
                k();
                i();
                int iS = (int) ViewUtils.S(getPaint(), getText().toString());
                this.f95827b.setBounds(0, 0, this.f95830e, this.f95831f);
                Bitmap bitmapDrawableToBitmap = ModuleUtil.INSTANCE.drawableToBitmap(this.f95827b, this.f95830e, this.f95831f);
                this.f95828c = bitmapDrawableToBitmap;
                int height = bitmapDrawableToBitmap.getHeight();
                int i10 = this.f95830e;
                Bitmap bitmap = this.f95828c;
                this.f95828c = com.max.mediaselector.lib.utils.c.q(height, i10 + iS, bitmap, i10, 0.0f, bitmap, 0.0f, 0.0f);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.f95830e);
                this.f95832g = valueAnimatorOfInt;
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                this.f95832g.setDuration(this.f95836k);
                this.f95832g.setRepeatMode(1);
                this.f95832g.setRepeatCount(-1);
                this.f95832g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.xiaoheihe.view.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f95910b.h(valueAnimator);
                    }
                });
                this.f95832g.start();
            }
        } catch (Throwable unused) {
        }
    }

    public void k() {
        ValueAnimator valueAnimator;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49417, new Class[0], Void.TYPE).isSupported && (valueAnimator = this.f95832g) != null && valueAnimator.isRunning() && this.f95832g.isStarted()) {
            this.f95832g.removeAllUpdateListeners();
            this.f95832g.cancel();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49418, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        k();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 49414, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!this.f95835j) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (this.f95828c == null || getText() == null || getText().length() <= 0) {
                return;
            }
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            TextPaint paint = getPaint();
            this.f95829d = Bitmap.createBitmap(this.f95828c, this.f95834i, 0, (int) ViewUtils.S(paint, getText().toString()), this.f95828c.getHeight());
            canvas.drawText(getText().toString(), 0.0f, Math.abs(paint.getFontMetrics().top), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(this.f95829d, 0.0f, 0.0f, paint);
            paint.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        Object[] objArr = {charSequence, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49413, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onTextChanged(charSequence, i10, i11, i12);
        j();
    }

    public void setDrawableResId(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49410, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f95833h = i10;
        j();
    }

    @qa.a(note = "设置动画时长单位毫秒")
    public void setDuration(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 49411, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f95836k = j10;
        j();
    }

    public void setNeedAutoPlay(boolean z10) {
        this.f95835j = z10;
    }

    @qa.a(note = "设置文字")
    public void setPlayText(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 49412, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        setText(str);
        j();
    }
}
