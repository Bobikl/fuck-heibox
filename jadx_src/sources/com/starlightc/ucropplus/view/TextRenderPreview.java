package com.starlightc.ucropplus.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.core.content.res.i;
import androidx.core.view.j1;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.model.StrokeObj;
import com.starlightc.ucropplus.model.TextRenderInfo;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextRenderPreview.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TextRenderPreview extends View {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isShadowEnable;
    private float rate;

    @d
    private String sampleText;

    @l
    private int shadowColor;
    private float shadowOffsetX;
    private float shadowOffsetY;

    @e
    private ArrayList<StrokeObj> strokeList;

    @d
    private final TextPaint strokePaint;

    @l
    private int textColor;

    @d
    private final TextPaint textPaint;
    private float textSize;

    public TextRenderPreview(@e Context context) {
        super(context);
        this.sampleText = androidx.exifinterface.media.a.f23244d5;
        this.textColor = j1.f21601t;
        this.shadowColor = -16711936;
        this.textSize = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.strokePaint = textPaint2;
        this.rate = 1.0f;
        textPaint.setStyle(Paint.Style.FILL);
        textPaint2.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public TextRenderPreview(@e Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        this.sampleText = androidx.exifinterface.media.a.f23244d5;
        this.textColor = j1.f21601t;
        this.shadowColor = -16711936;
        this.textSize = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.strokePaint = textPaint2;
        this.rate = 1.0f;
        textPaint.setStyle(Paint.Style.FILL);
        textPaint2.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public TextRenderPreview(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.sampleText = androidx.exifinterface.media.a.f23244d5;
        this.textColor = j1.f21601t;
        this.shadowColor = -16711936;
        this.textSize = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.strokePaint = textPaint2;
        this.rate = 1.0f;
        textPaint.setStyle(Paint.Style.FILL);
        textPaint2.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public TextRenderPreview(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.sampleText = androidx.exifinterface.media.a.f23244d5;
        this.textColor = j1.f21601t;
        this.shadowColor = -16711936;
        this.textSize = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.strokePaint = textPaint2;
        this.rate = 1.0f;
        textPaint.setStyle(Paint.Style.FILL);
        textPaint2.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private final float convertTextSize(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51107, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : TypedValue.applyDimension(1, f10, getContext().getResources().getDisplayMetrics());
    }

    private final float getTotalStrokeWidth() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51108, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        float stroke_width = 0.0f;
        if (!com.max.hbcommon.utils.c.w(this.strokeList)) {
            ArrayList<StrokeObj> arrayList = this.strokeList;
            f0.m(arrayList);
            Iterator<StrokeObj> it = arrayList.iterator();
            while (it.hasNext()) {
                stroke_width += it.next().getStroke_width();
            }
        }
        return stroke_width;
    }

    public final void initWithRenderInfo(@d TextRenderInfo info) {
        if (PatchProxy.proxy(new Object[]{info}, this, changeQuickRedirect, false, 51104, new Class[]{TextRenderInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(info, "info");
        this.isShadowEnable = info.getShadowEnable();
        this.shadowColor = info.getShadowColor();
        this.shadowOffsetX = ViewUtils.f(getContext(), info.getShadowOffsetX()) * this.rate;
        this.shadowOffsetY = ViewUtils.f(getContext(), info.getShadowOffsetY()) * this.rate;
        this.textColor = info.getTextColor();
        this.strokeList = info.getStrokeList();
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"CanvasSize"})
    public void onDraw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51106, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Log.d("TextRenderPreview", "canvasW: " + width + " canvasH: " + height);
        this.textPaint.setTextSize(this.textSize);
        this.strokePaint.setTextSize(this.textSize);
        Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        float fMeasureText = (((float) width) / 2.0f) - (this.textPaint.measureText(this.sampleText) / 2.0f);
        float f10 = (((float) height) / 2.0f) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
        if (this.isShadowEnable) {
            this.textPaint.setColor(this.shadowColor);
            canvas.drawText(this.sampleText, (this.shadowOffsetX / 2.0f) + fMeasureText, (this.shadowOffsetY / 2.0f) + f10, this.textPaint);
        }
        if (!com.max.hbcommon.utils.c.w(this.strokeList)) {
            float totalStrokeWidth = getTotalStrokeWidth();
            ArrayList<StrokeObj> arrayList = this.strokeList;
            f0.m(arrayList);
            for (StrokeObj strokeObj : arrayList) {
                this.strokePaint.setStrokeWidth(TypedValue.applyDimension(1, totalStrokeWidth, getContext().getResources().getDisplayMetrics()) * this.rate);
                totalStrokeWidth -= strokeObj.getStroke_width();
                this.strokePaint.setColor(com.max.hbcommon.utils.l.g(strokeObj.getStroke_color()));
                Paint.FontMetrics fontMetrics2 = this.strokePaint.getFontMetrics();
                float f11 = 2;
                canvas.drawText(this.sampleText, (width / 2) - (this.strokePaint.measureText(this.sampleText) / f11), (height / 2) - ((fontMetrics2.descent + fontMetrics2.ascent) / f11), this.strokePaint);
            }
        }
        this.textPaint.setColor(this.textColor);
        canvas.drawText(this.sampleText, fMeasureText, f10, this.textPaint);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51109, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        float totalStrokeWidth = getTotalStrokeWidth();
        if (mode != 1073741824) {
            size = ((int) this.strokePaint.measureText(this.sampleText)) + getPaddingLeft() + getPaddingEnd() + ViewUtils.f(getContext(), Math.abs(this.shadowOffsetX) + totalStrokeWidth);
        }
        if (mode2 != 1073741824) {
            size2 = (((int) this.strokePaint.getFontMetrics().descent) - ((int) this.strokePaint.getFontMetrics().ascent)) + ((int) this.strokePaint.getFontMetrics().leading) + getPaddingTop() + getPaddingBottom() + ViewUtils.f(getContext(), Math.abs(this.shadowOffsetY) + totalStrokeWidth);
        }
        setMeasuredDimension(size, size2);
    }

    public final void setSampleText(@d String text) {
        if (PatchProxy.proxy(new Object[]{text}, this, changeQuickRedirect, false, 51099, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(text, "text");
        if (f0.g(this.sampleText, text)) {
            return;
        }
        this.sampleText = text;
        invalidate();
    }

    public final void setShadowEnable(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 51102, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || z10 == this.isShadowEnable) {
            return;
        }
        this.isShadowEnable = z10;
        invalidate();
    }

    public final void setShadowOffset(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51103, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.shadowOffsetX = f10;
        this.shadowOffsetY = f11;
        invalidate();
    }

    public final void setTextColor(@n int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51100, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.textColor = i.e(getResources(), i10, null);
        invalidate();
    }

    public final void setTextSize(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 51101, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        float fApplyDimension = TypedValue.applyDimension(1, f10, getContext().getResources().getDisplayMetrics());
        if (fApplyDimension == this.textSize) {
            return;
        }
        this.textSize = fApplyDimension;
        this.textPaint.setTextSize(fApplyDimension);
        this.strokePaint.setTextSize(fApplyDimension);
        float f11 = this.rate;
        float fConvertTextSize = this.textSize / convertTextSize(23.0f);
        this.rate = fConvertTextSize;
        this.shadowOffsetX = (this.shadowOffsetX * fConvertTextSize) / f11;
        this.shadowOffsetY = (this.shadowOffsetY * fConvertTextSize) / f11;
        invalidate();
    }

    public final void setTypeface(@d Typeface typeface) {
        if (PatchProxy.proxy(new Object[]{typeface}, this, changeQuickRedirect, false, 51105, new Class[]{Typeface.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(typeface, "typeface");
        if (f0.g(this.textPaint.getTypeface(), typeface)) {
            return;
        }
        this.textPaint.setTypeface(typeface);
        this.strokePaint.setTypeface(typeface);
        invalidate();
    }
}
