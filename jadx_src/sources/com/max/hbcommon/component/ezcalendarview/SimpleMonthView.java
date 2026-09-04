package com.max.hbcommon.component.ezcalendarview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import bb.c;
import bb.d;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import lb.b;

/* JADX INFO: loaded from: classes9.dex */
public class SimpleMonthView extends View {
    private static final int G2 = 7;
    private static final int G3 = -1;
    private static final int J3 = 1;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f67628p3 = 6;
    private int A;
    private int B;
    private int C;
    private int D;
    private CharSequence E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private Calendar T;
    private Calendar U;
    private int V;
    private int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private a f67629a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EZCalendarView f67630b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private ColorStateList f67631b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextPaint f67632c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f67633c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextPaint f67634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextPaint f67635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f67636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final RectF f67637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextPaint f67638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextPaint f67639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final TextPaint f67640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Paint f67641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f67642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Paint f67643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint f67644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Path f67645o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Calendar f67646p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f67647p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f67648p2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Calendar f67649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private SimpleDateFormat f67650r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private SimpleDateFormat f67651s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private NumberFormat f67652t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f67653u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f67654v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f67655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f67656x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private boolean f67657x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f67658x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f67659y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f67660y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private boolean f67661y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f67662z;

    public interface a {
        void a(SimpleMonthView simpleMonthView, Calendar calendar);
    }

    public SimpleMonthView(Context context) {
        this(context, null);
    }

    public SimpleMonthView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67632c = new TextPaint();
        this.f67634d = new TextPaint();
        this.f67635e = new TextPaint();
        this.f67636f = new RectF();
        this.f67637g = new RectF();
        this.f67638h = new TextPaint();
        this.f67639i = new TextPaint();
        this.f67640j = new TextPaint();
        this.f67641k = new Paint();
        this.f67642l = new Paint();
        this.f67643m = new Paint();
        this.f67644n = new Paint();
        this.f67645o = new Path();
        this.f67646p = Calendar.getInstance();
        this.f67649q = Calendar.getInstance();
        this.O = -1;
        this.P = -1;
        this.Q = 1;
        this.T = Calendar.getInstance();
        this.U = Calendar.getInstance();
        this.V = 1;
        this.W = 31;
        this.f67633c0 = -1;
        this.f67647p1 = true;
        this.f67657x1 = false;
        this.f67658x2 = 0;
        this.f67661y2 = false;
        m(context, attributeSet);
    }

    private ColorStateList a(Paint paint, int i10) {
        return null;
    }

    private void b(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int color;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.d.Wq, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        TextPaint textPaint = this.f67638h;
        int i17 = this.f67657x1 ? this.H + this.I : this.I;
        int i18 = this.J;
        int i19 = this.K;
        float fAscent = (textPaint.ascent() + textPaint.descent()) / 2.0f;
        int i20 = (i18 / 2) + i17;
        int iH = h();
        int i21 = (42 - iH) - this.R;
        int i22 = 1;
        int i23 = 0;
        while (i22 <= 42) {
            int i24 = i19 * i23;
            int i25 = i24 + (i19 / 2);
            if (i22 <= iH || i22 > 42 - i21) {
                i10 = i19;
                i11 = i21;
                i12 = i23;
                boolean z10 = this.f67647p1;
                i13 = iH;
                i14 = i22;
                if (z10 && i14 <= i13) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(this.T.getTime());
                    calendar.add(5, (i14 - 1) - i13);
                    int i26 = calendar.get(5);
                    textPaint.setColor(-3355444);
                    canvas.drawText(this.f67652t.format(i26), i25, i20 - fAscent, textPaint);
                } else if (z10 && i14 > this.R + i13) {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(this.U.getTime());
                    calendar2.add(5, (i14 - i13) - this.R);
                    int i27 = calendar2.get(5);
                    textPaint.setColor(-3355444);
                    canvas.drawText(this.f67652t.format(i27), i25, i20 - fAscent, textPaint);
                }
            } else {
                int i28 = i22 - iH;
                boolean zO = o(i28);
                i10 = i19;
                boolean z11 = this.O == i28;
                EZCalendarView eZCalendarView = this.f67630b;
                if (eZCalendarView != null) {
                    i11 = i21;
                    i12 = i23;
                    Bundle bundleK = eZCalendarView.k(this.G, this.F, i28);
                    if (bundleK != null) {
                        int i29 = bundleK.getInt("style");
                        this.f67639i.setColor(bundleK.getInt(EZCalendarView.B));
                        if (i29 == 0) {
                            i15 = iH;
                            i16 = i22;
                            this.f67645o.reset();
                            float f10 = i24;
                            float f11 = i17;
                            this.f67645o.moveTo(f10, f11);
                            this.f67645o.lineTo(i24 + com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 12.0f), f11);
                            this.f67645o.lineTo(f10, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 12.0f) + i17);
                            this.f67645o.close();
                            canvas.drawPath(this.f67645o, this.f67639i);
                        } else if (i29 == 4) {
                            i15 = iH;
                            i16 = i22;
                            canvas.drawCircle(i25, (i18 / 4) + i20, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 2.0f), this.f67639i);
                        } else if (i29 != 5) {
                            if (i29 == 6) {
                                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.retroactive);
                                canvas.drawBitmap(bitmapDecodeResource, i25 - (bitmapDecodeResource.getWidth() / 2), i20 - (bitmapDecodeResource.getHeight() / 2), this.f67641k);
                                if (this.P == i28) {
                                    this.f67639i.setColor(getContext().getResources().getColor(this.f67661y2 ? R.color.text_secondary_1_color_day : R.color.text_secondary_1_color));
                                    canvas.drawCircle(i25, (i18 / 4) + i20, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 2.0f), this.f67639i);
                                }
                            }
                            i15 = iH;
                            i16 = i22;
                        } else {
                            this.f67645o.reset();
                            float f12 = i24;
                            float f13 = i17;
                            this.f67645o.moveTo(f12, f13);
                            i15 = iH;
                            i16 = i22;
                            this.f67645o.lineTo(com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 12.0f) + i24, f13);
                            this.f67645o.lineTo(f12, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 12.0f) + i17);
                            this.f67645o.close();
                            canvas.drawPath(this.f67645o, this.f67639i);
                            canvas.drawText(b.f131100p, i24 + com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 1.0f), com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 6.0f) + i17, this.f67640j);
                            if (this.P == i28) {
                                this.f67639i.setColor(getContext().getResources().getColor(this.f67661y2 ? R.color.text_secondary_1_color_day : R.color.text_secondary_1_color));
                                canvas.drawCircle(i25, (i18 / 4) + i20, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 2.0f), this.f67639i);
                            }
                        }
                    } else {
                        i15 = iH;
                        i16 = i22;
                    }
                } else {
                    i15 = iH;
                    i11 = i21;
                    i16 = i22;
                    i12 = i23;
                }
                if (!(this.P == i28) || z11) {
                    color = !zO ? this.C : this.B;
                } else {
                    color = this.f67642l.getColor();
                }
                textPaint.setColor(color);
                canvas.drawText(this.f67652t.format(i28), i25, i20 - fAscent, textPaint);
                i13 = i15;
                i14 = i16;
            }
            i23 = i12 + 1;
            if (i23 == 7) {
                i20 += i18;
                i17 += i18;
                i23 = 0;
            }
            i22 = i14 + 1;
            iH = i13;
            i19 = i10;
            i21 = i11;
        }
    }

    private void c(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.d.Uq, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        TextPaint textPaint = this.f67634d;
        int i10 = this.f67657x1 ? this.H : 0;
        int i11 = this.I;
        int i12 = this.K;
        float fAscent = (textPaint.ascent() + textPaint.descent()) / 2.0f;
        int i13 = i10 + (i11 / 2);
        if (this.f67658x2 == 1) {
            textPaint.setColor(getContext().getColor(this.f67661y2 ? R.color.white_alpha50 : R.color.background_layer_2_color_alpha50));
        }
        for (int i14 = 0; i14 < 7; i14++) {
            canvas.drawText(k((this.Q + i14) % 7), (i12 * i14) + (i12 / 2), i13 - fAscent, textPaint);
        }
    }

    private void d(Canvas canvas, RectF rectF, float f10, Paint paint) {
        if (PatchProxy.proxy(new Object[]{canvas, rectF, new Float(f10), paint}, this, changeQuickRedirect, false, c.d.Tq, new Class[]{Canvas.class, RectF.class, Float.TYPE, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        rectF.set(0.0f, 0.0f, this.M, this.I);
        this.f67637g.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
        canvas.drawRoundRect(this.f67637g, f10, f10, paint);
        float f11 = rectF.left;
        float f12 = rectF.bottom;
        canvas.drawRect(f11, f12 - f10, rectF.right, f12, paint);
    }

    private void e(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.d.Yq, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        float f10 = paddingLeft;
        int paddingTop = (this.f67657x1 ? this.H : 0) + getPaddingTop();
        int i10 = this.I;
        canvas.drawLine(f10, paddingTop + i10, this.M + paddingLeft, i10 + paddingTop, this.f67644n);
        for (int i11 = 1; i11 < 6; i11++) {
            int i12 = this.I;
            int i13 = this.J;
            canvas.drawLine(f10, paddingTop + i12 + (i11 * i13), this.M + paddingLeft, i12 + paddingTop + (i13 * i11), this.f67644n);
        }
        for (int i14 = 1; i14 < 7; i14++) {
            int i15 = this.K;
            canvas.drawLine((i14 * i15) + paddingLeft, paddingTop, (i15 * i14) + paddingLeft, this.I + paddingTop + (this.J * 6), this.f67644n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0391  */
    /* JADX WARN: Code duplicated, block: B:138:0x059a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0325  */
    /* JADX WARN: Code duplicated, block: B:88:0x0328  */
    /* JADX WARN: Code duplicated, block: B:97:0x035e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0360  */
    private void f(Canvas canvas) {
        int i10;
        TextPaint textPaint;
        char c10;
        int i11;
        int i12;
        int color;
        Bundle bundleK;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        int i17;
        int color2;
        int i18;
        int i19;
        int i20;
        Canvas canvas2 = canvas;
        if (PatchProxy.proxy(new Object[]{canvas2}, this, changeQuickRedirect, false, c.d.Xq, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        TextPaint textPaint2 = this.f67638h;
        int i21 = this.f67657x1 ? this.H + this.I : this.I;
        int i22 = this.J;
        int i23 = this.K;
        float fAscent = (textPaint2.ascent() + textPaint2.descent()) / 2.0f;
        int iB = com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 1.0f);
        int i24 = i22 / 2;
        int iB2 = (com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 10.0f) / 2) + i21;
        int iH = h();
        int i25 = (42 - iH) - this.R;
        int i26 = iB2;
        int i27 = 1;
        int i28 = 0;
        while (i27 <= 42) {
            int i29 = (i23 / 2) + (i23 * i28);
            int i30 = i23;
            int i31 = i22;
            if (this.f67658x2 == 1) {
                int i32 = i27 - iH;
                EZCalendarView eZCalendarView = this.f67630b;
                if (eZCalendarView != null) {
                    int i33 = i27;
                    int i34 = i26;
                    Bundle bundleK2 = eZCalendarView.k(this.G, this.F, i32);
                    if (bundleK2 != null) {
                        int i35 = bundleK2.getInt("style");
                        int i36 = bundleK2.getInt(EZCalendarView.B);
                        int i37 = bundleK2.getInt(EZCalendarView.C);
                        color2 = bundleK2.getInt(EZCalendarView.D);
                        i18 = i36;
                        i20 = i35;
                        i19 = i37;
                    } else {
                        int color3 = getContext().getColor(this.f67661y2 ? R.color.white_alpha5 : R.color.background_layer_2_color_alpha5);
                        color2 = getContext().getColor(this.f67661y2 ? R.color.white_alpha30 : R.color.background_layer_2_color_alpha30);
                        i18 = color3;
                        i19 = 0;
                        i20 = 8;
                    }
                    this.f67639i.setColor(i18);
                    if (i20 == 7) {
                        textPaint2 = textPaint2;
                        int i38 = i19;
                        fAscent = fAscent;
                        iB = iB;
                        i32 = i32;
                        i29 = i29;
                        canvas2 = canvas2;
                        i13 = i33;
                        i14 = i34;
                        i15 = iH;
                        float f10 = i29;
                        canvas2.drawCircle(f10, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 26.0f) + i21, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 12.0f), this.f67639i);
                        this.f67639i.setColor(getContext().getColor(this.f67661y2 ? R.color.white : R.color.background_layer_2_color));
                        canvas2.drawText(String.valueOf(i38), f10, (com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 26.0f) + i21) - fAscent, this.f67639i);
                    } else if (i20 != 8) {
                        i13 = i33;
                        i14 = i34;
                    } else {
                        int iB3 = com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 22.0f);
                        this.f67639i.setColor(getContext().getColor(this.f67661y2 ? R.color.white_alpha3 : R.color.background_layer_2_color_alpha3));
                        this.f67639i.setStyle(Paint.Style.FILL);
                        float f11 = i29 - iB3;
                        float f12 = iB3 + i29;
                        iB = iB;
                        i32 = i32;
                        textPaint2 = textPaint2;
                        i29 = i29;
                        fAscent = fAscent;
                        i13 = i33;
                        int i39 = i19;
                        i14 = i34;
                        int i40 = iH;
                        canvas2 = canvas2;
                        canvas.drawRoundRect(f11, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 0.0f) + i21, f12, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 64.0f) + i21, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 4.0f), com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 5.0f), this.f67639i);
                        this.f67639i.setColor(getContext().getColor(this.f67661y2 ? R.color.date_picker_day_style_color_day_alpha2 : R.color.date_picker_day_style_color_alpha2));
                        this.f67639i.setStrokeWidth(1.0f);
                        this.f67639i.setStyle(Paint.Style.STROKE);
                        canvas.drawRoundRect(f11, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 0.0f) + i21, f12, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 64.0f) + i21, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 4.0f), com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 5.0f), this.f67639i);
                        int color4 = getContext().getColor(this.f67661y2 ? R.color.white_alpha0 : R.color.background_layer_2_color_alpha0) & i18;
                        int color5 = (i18 & getContext().getColor(this.f67661y2 ? R.color.background_layer_4_color_day : R.color.background_layer_4_color)) >> 24;
                        boolean z11 = this.f67647p1;
                        i15 = i40;
                        if ((z11 && i13 <= i15) || (z11 && i13 > i15 + this.R)) {
                            if (color5 == -1) {
                                color5 = 255;
                            }
                            color5 /= 2;
                        }
                        this.f67639i.setColor(color4 | (color5 << 24));
                        this.f67639i.setStyle(Paint.Style.FILL);
                        float f13 = i29;
                        canvas2.drawCircle(f13, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 40.0f) + i21, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 13.0f), this.f67639i);
                        int color6 = getContext().getColor(this.f67661y2 ? R.color.white_alpha0 : R.color.background_layer_2_color_alpha0) & color2;
                        int color7 = (color2 & getContext().getColor(this.f67661y2 ? R.color.background_layer_4_color_day : R.color.background_layer_4_color)) >> 24;
                        boolean z12 = this.f67647p1;
                        if ((z12 && i13 <= i15) || (z12 && i13 > i15 + this.R)) {
                            if (color7 == -1) {
                                color7 = 255;
                            }
                            color7 /= 2;
                        }
                        this.f67639i.setColor((color7 << 24) | color6);
                        this.f67639i.setTextSize(com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 13.0f));
                        this.f67639i.setTypeface(d.a().b(5));
                        canvas2.drawText(String.valueOf(i39), f13, (com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 41.0f) + i21) - fAscent, this.f67639i);
                    }
                    Context context = getContext();
                    if (this.f67661y2) {
                        i16 = R.color.white_alpha80;
                    } else {
                        i16 = R.color.background_layer_2_color_alpha80;
                    }
                    int color8 = context.getColor(i16);
                    z10 = this.f67647p1;
                    if (!z10 && i13 <= i15) {
                        color8 = getContext().getColor(this.f67661y2 ? R.color.white_alpha30 : R.color.background_layer_2_color_alpha30);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(this.T.getTime());
                        calendar.add(5, (i13 - 1) - i15);
                        i17 = calendar.get(5);
                    } else if (z10 || i13 <= i15 + this.R) {
                        i17 = i32;
                    } else {
                        color8 = getContext().getColor(this.f67661y2 ? R.color.white_alpha30 : R.color.background_layer_2_color_alpha30);
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(this.U.getTime());
                        calendar2.add(5, i32 - this.R);
                        i17 = calendar2.get(5);
                    }
                    TextPaint textPaint3 = textPaint2;
                    textPaint3.setColor(color8);
                    this.f67639i.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                    this.f67639i.setTextSize(ViewUtils.f(getContext(), 11.0f));
                    int i41 = i14;
                    canvas2.drawText(this.f67652t.format(i17), i29, ((iB * 10) + i41) - fAscent, textPaint3);
                    i11 = i13;
                    i10 = i41;
                    textPaint = textPaint3;
                    i12 = i15;
                    c10 = 0;
                } else {
                    i13 = i27;
                    i14 = i26;
                }
                i15 = iH;
                Context context2 = getContext();
                if (this.f67661y2) {
                    i16 = R.color.white_alpha80;
                } else {
                    i16 = R.color.background_layer_2_color_alpha80;
                }
                int color9 = context2.getColor(i16);
                z10 = this.f67647p1;
                if (!z10) {
                    if (z10) {
                        i17 = i32;
                    } else {
                        i17 = i32;
                    }
                } else if (z10) {
                    i17 = i32;
                } else {
                    i17 = i32;
                }
                TextPaint textPaint4 = textPaint2;
                textPaint4.setColor(color9);
                this.f67639i.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                this.f67639i.setTextSize(ViewUtils.f(getContext(), 11.0f));
                int i42 = i14;
                canvas2.drawText(this.f67652t.format(i17), i29, ((iB * 10) + i42) - fAscent, textPaint4);
                i11 = i13;
                i10 = i42;
                textPaint = textPaint4;
                i12 = i15;
                c10 = 0;
            } else {
                fAscent = fAscent;
                iB = iB;
                int i43 = i27;
                canvas2 = canvas2;
                int i44 = iH;
                TextPaint textPaint5 = textPaint2;
                if (i43 <= i44 || i43 > 42 - i25) {
                    i10 = i26;
                    textPaint = textPaint5;
                    c10 = 0;
                    boolean z13 = this.f67647p1;
                    i11 = i43;
                    i12 = i44;
                    if (z13 && i11 <= i12) {
                        Calendar calendar3 = Calendar.getInstance();
                        calendar3.setTime(this.T.getTime());
                        calendar3.add(5, (i11 - 1) - i12);
                        int i45 = calendar3.get(5);
                        textPaint.setColor(-3355444);
                        canvas2.drawText(this.f67652t.format(i45), i29, i10 - fAscent, textPaint);
                    } else if (z13 && i11 > i12 + this.R) {
                        Calendar calendar4 = Calendar.getInstance();
                        calendar4.setTime(this.U.getTime());
                        calendar4.add(5, (i11 - i12) - this.R);
                        int i46 = calendar4.get(5);
                        textPaint.setColor(-3355444);
                        canvas2.drawText(this.f67652t.format(i46), i29, i10 - fAscent, textPaint);
                    }
                } else {
                    int i47 = i43 - i44;
                    boolean zO = o(i47);
                    boolean z14 = this.P == i47;
                    EZCalendarView eZCalendarView2 = this.f67630b;
                    if (eZCalendarView2 == null || (bundleK = eZCalendarView2.k(this.G, this.F, i47)) == null) {
                        c10 = 0;
                    } else {
                        int i48 = bundleK.getInt("style");
                        int i49 = bundleK.getInt(EZCalendarView.B);
                        int i50 = bundleK.getInt(EZCalendarView.C);
                        int i51 = bundleK.getInt(EZCalendarView.D);
                        this.f67639i.setColor(i49);
                        if (i48 == 7) {
                            c10 = 0;
                            float f14 = i29;
                            canvas2.drawCircle(f14, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 26.0f) + i21, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 12.0f), this.f67639i);
                            this.f67639i.setColor(getContext().getColor(this.f67661y2 ? R.color.white : R.color.background_layer_2_color));
                            canvas2.drawText(String.valueOf(i50), f14, (com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 26.0f) + i21) - fAscent, this.f67639i);
                        } else if (i48 != 8) {
                            c10 = 0;
                        } else {
                            int iB4 = com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 22.0f);
                            this.f67639i.setColor(getContext().getColor(this.f67661y2 ? R.color.white_alpha5 : R.color.background_layer_2_color_alpha5));
                            this.f67639i.setStyle(Paint.Style.FILL);
                            float f15 = i29 - iB4;
                            float f16 = iB4 + i29;
                            canvas.drawRoundRect(f15, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), -15.0f) + i21, f16, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 49.0f) + i21, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 4.0f), com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 5.0f), this.f67639i);
                            this.f67639i.setColor(getContext().getColor(this.f67661y2 ? R.color.date_picker_day_style_color_day_alpha2 : R.color.date_picker_day_style_color_alpha2));
                            this.f67639i.setStrokeWidth(1.0f);
                            this.f67639i.setStyle(Paint.Style.STROKE);
                            c10 = 0;
                            canvas.drawRoundRect(f15, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), -15.0f) + i21, f16, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 49.0f) + i21, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 4.0f), com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 5.0f), this.f67639i);
                            this.f67639i.setColor(i49);
                            this.f67639i.setStyle(Paint.Style.FILL);
                            float f17 = i29;
                            canvas2.drawCircle(f17, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 26.0f) + i21, com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 12.0f), this.f67639i);
                            this.f67639i.setColor(i51);
                            canvas2.drawText(String.valueOf(i50), f17, (com.max.hbcommon.component.ezcalendarview.utils.c.b(getContext(), 26.0f) + i21) - fAscent, this.f67639i);
                        }
                    }
                    if (z14) {
                        color = this.f67642l.getColor();
                    } else {
                        color = !zO ? this.C : this.B;
                    }
                    textPaint = textPaint5;
                    textPaint.setColor(color);
                    if (z14) {
                        i10 = i26;
                        canvas2.drawText(getContext().getResources().getString(R.string.today), i29, i10 - fAscent, textPaint);
                    } else {
                        i10 = i26;
                        canvas2.drawText(this.f67652t.format(i47), i29, i10 - fAscent, textPaint);
                    }
                    i11 = i43;
                    i12 = i44;
                }
            }
            int i52 = i28 + 1;
            if (i52 == 7) {
                i26 = i10 + i31;
                i21 += i31;
                i28 = 0;
            } else {
                i28 = i52;
                i26 = i10;
            }
            i27 = i11 + 1;
            canvas2 = canvas2;
            textPaint2 = textPaint;
            iH = i12;
            i22 = i31;
            iB = iB;
            fAscent = fAscent;
            i23 = i30;
        }
    }

    private void g(Canvas canvas) {
        if (!PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.d.Sq, new Class[]{Canvas.class}, Void.TYPE).isSupported && this.f67657x1) {
            canvas.drawText(getTitle().toString(), this.M / 2.0f, (this.H - (this.f67632c.ascent() + this.f67632c.descent())) / 2.0f, this.f67632c);
        }
    }

    private int h() {
        int i10 = this.S;
        int i11 = this.Q;
        int i12 = i10 - i11;
        return i10 < i11 ? i12 + 7 : i12;
    }

    private boolean i(int i10, Rect rect) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), rect}, this, changeQuickRedirect, false, c.d.jr, new Class[]{Integer.TYPE, Rect.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!q(i10)) {
            return false;
        }
        int iH = (i10 - 1) + h();
        int i11 = this.K;
        int paddingLeft = getPaddingLeft() + ((iH % 7) * i11);
        int i12 = iH / 7;
        int i13 = this.J;
        int paddingTop = getPaddingTop() + (this.f67657x1 ? this.H + this.I : this.I) + (i12 * i13);
        rect.set(paddingLeft, paddingTop, i11 + paddingLeft, i13 + paddingTop);
        return true;
    }

    private int j(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.d.ir, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int paddingLeft = i10 - getPaddingLeft();
        if (paddingLeft >= 0 && paddingLeft < this.M) {
            int i12 = this.f67657x1 ? this.H + this.I : this.I;
            int paddingTop = i11 - getPaddingTop();
            if (paddingTop >= i12 && paddingTop < this.f67648p2) {
                int iH = ((((paddingLeft * 7) / this.M) + (((paddingTop - i12) / this.J) * 7)) + 1) - h();
                if (q(iH) || this.f67658x2 == 1) {
                    return iH;
                }
                return -1;
            }
        }
        return -1;
    }

    private String k(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.Vq, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        this.f67649q.set(7, i10);
        return this.f67651s.format(this.f67649q.getTime());
    }

    private static int l(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.d.dr, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        switch (i10) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                return 31;
            case 1:
                return i11 % 4 == 0 ? 29 : 28;
            case 3:
            case 5:
            case 8:
            case 10:
                return 30;
            default:
                throw new IllegalArgumentException("Invalid Month");
        }
    }

    private void m(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, c.d.Kq, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        if (attributeSet != null) {
            this.f67661y2 = context.obtainStyledAttributes(attributeSet, R.styleable.f66378d3).getBoolean(R.styleable.SimpleMonthView_smvWhiteStyle, this.f67661y2);
        }
        Resources resources = context.getResources();
        Locale locale = resources.getConfiguration().locale;
        if (this.f67658x2 == 1) {
            this.f67654v = resources.getDimensionPixelSize(R.dimen.date_picker_mark_count_day_of_week_height);
            this.f67655w = resources.getDimensionPixelSize(R.dimen.date_picker_mark_count_day_height_pubg);
            this.f67651s = new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale, "EEE"), locale);
        } else {
            int i10 = this.f67660y1;
            if (i10 == 0 || i10 != 1) {
                this.f67654v = resources.getDimensionPixelSize(R.dimen.date_picker_day_of_week_height);
                this.f67655w = resources.getDimensionPixelSize(R.dimen.date_picker_day_height);
                this.f67651s = new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale, "EEEEE"), locale);
            } else {
                this.f67654v = resources.getDimensionPixelSize(R.dimen.date_picker_mark_count_day_of_week_height);
                this.f67655w = resources.getDimensionPixelSize(R.dimen.date_picker_mark_count_day_height);
                this.f67651s = new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale, "EEE"), locale);
            }
        }
        this.f67653u = resources.getDimensionPixelSize(R.dimen.date_picker_month_height);
        this.f67656x = resources.getDimensionPixelSize(R.dimen.date_picker_day_width);
        this.f67659y = resources.getDimensionPixelSize(R.dimen.date_picker_day_selector_radius);
        this.f67650r = new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale, "MMMMy"), locale);
        this.f67652t = NumberFormat.getIntegerInstance(locale);
        n(resources);
    }

    private void n(Resources resources) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        if (PatchProxy.proxy(new Object[]{resources}, this, changeQuickRedirect, false, c.d.Pq, new Class[]{Resources.class}, Void.TYPE).isSupported) {
            return;
        }
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.date_picker_month_text_size);
        int i10 = this.f67660y1;
        if (i10 == 0) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.date_picker_day_of_week_text_size);
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.date_picker_day_text_size);
            this.f67662z = resources.getColor(this.f67661y2 ? R.color.date_picker_month_text_color_day : R.color.date_picker_month_text_color);
            this.A = resources.getColor(this.f67661y2 ? R.color.date_picker_day_of_week_text_color_day : R.color.date_picker_day_of_week_text_color);
            this.B = resources.getColor(this.f67661y2 ? R.color.date_picker_enabled_day_text_color_day : R.color.date_picker_enabled_day_text_color);
            this.C = resources.getColor(this.f67661y2 ? R.color.date_picker_disabled_day_text_color_day : R.color.date_picker_disabled_day_text_color);
            this.D = resources.getColor(this.f67661y2 ? R.color.date_picker_divider_color_day : R.color.date_picker_divider_color);
            this.f67634d.setTypeface(Typeface.create("sans-serif-medium", 0));
            this.f67638h.setTypeface(Typeface.create("sans-serif-medium", 0));
        } else if (i10 != 1) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.date_picker_day_of_week_text_size);
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.date_picker_day_text_size);
            this.f67662z = resources.getColor(this.f67661y2 ? R.color.date_picker_month_text_color_day : R.color.date_picker_month_text_color);
            this.A = resources.getColor(this.f67661y2 ? R.color.date_picker_day_of_week_text_color_day : R.color.date_picker_day_of_week_text_color);
            this.B = resources.getColor(this.f67661y2 ? R.color.date_picker_enabled_day_text_color_day : R.color.date_picker_enabled_day_text_color);
            this.C = resources.getColor(this.f67661y2 ? R.color.date_picker_disabled_day_text_color_day : R.color.date_picker_disabled_day_text_color);
            this.D = resources.getColor(this.f67661y2 ? R.color.date_picker_divider_color_day : R.color.date_picker_divider_color);
            this.f67634d.setTypeface(Typeface.create("sans-serif-medium", 0));
            this.f67638h.setTypeface(Typeface.create("sans-serif-medium", 0));
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.date_picker_mark_count_day_of_week_text_size);
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.date_picker_mark_count_day_text_size);
            this.f67662z = resources.getColor(this.f67661y2 ? R.color.date_picker_mark_count_month_text_color_day : R.color.date_picker_mark_count_month_text_color);
            this.A = resources.getColor(this.f67661y2 ? R.color.date_picker_mark_count_day_of_week_text_color_day : R.color.date_picker_mark_count_day_of_week_text_color);
            this.B = resources.getColor(this.f67661y2 ? R.color.date_picker_mark_count_enabled_day_text_color_day : R.color.date_picker_mark_count_enabled_day_text_color);
            this.C = resources.getColor(this.f67661y2 ? R.color.date_picker_mark_count_disabled_day_text_color_day : R.color.date_picker_mark_count_disabled_day_text_color);
            this.D = resources.getColor(this.f67661y2 ? R.color.date_picker_mark_count_divider_color_day : R.color.date_picker_mark_count_divider_color);
            this.f67634d.setTypeface(null);
            this.f67638h.setTypeface(null);
        }
        this.f67632c.setAntiAlias(true);
        this.f67632c.setTextSize(dimensionPixelSize3);
        this.f67632c.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.f67632c.setTextAlign(Paint.Align.CENTER);
        this.f67632c.setStyle(Paint.Style.FILL);
        this.f67632c.setColor(this.f67662z);
        this.f67634d.setAntiAlias(true);
        this.f67634d.setTextSize(dimensionPixelSize);
        this.f67634d.setTextAlign(Paint.Align.CENTER);
        this.f67634d.setStyle(Paint.Style.FILL);
        this.f67634d.setColor(this.A);
        this.f67635e.setAntiAlias(true);
        this.f67635e.setStyle(Paint.Style.FILL);
        this.f67635e.setColor(getContext().getColor(this.f67661y2 ? R.color.date_picker_day_of_week_bg_color_day : R.color.date_picker_day_of_week_bg_color));
        this.f67638h.setAntiAlias(true);
        this.f67638h.setTextSize(dimensionPixelSize2);
        this.f67638h.setTextAlign(Paint.Align.CENTER);
        this.f67638h.setStyle(Paint.Style.FILL);
        this.f67639i.setAntiAlias(true);
        this.f67639i.setStyle(Paint.Style.FILL);
        this.f67639i.setTextAlign(Paint.Align.CENTER);
        this.f67639i.setTextSize(resources.getDimensionPixelSize(R.dimen.text_size_12));
        d.c(this.f67639i, 2);
        this.f67640j.setColor(resources.getColor(this.f67661y2 ? R.color.white : R.color.background_layer_2_color));
        this.f67640j.setTextSize(resources.getDimensionPixelSize(R.dimen.text_size_5));
        d.c(this.f67640j, 0);
        this.f67641k.setAntiAlias(true);
        this.f67641k.setFilterBitmap(true);
        this.f67642l.setAntiAlias(true);
        this.f67642l.setColor(resources.getColor(R.color.interactive_color));
        this.f67642l.setStyle(Paint.Style.FILL);
        this.f67643m.setAntiAlias(true);
        this.f67643m.setStyle(Paint.Style.FILL);
        this.f67644n.setAntiAlias(true);
        this.f67644n.setStyle(Paint.Style.FILL);
        this.f67644n.setStrokeWidth(2.0f);
        this.f67644n.setColor(this.D);
    }

    private boolean o(int i10) {
        return i10 >= this.V && i10 <= this.W;
    }

    private boolean q(int i10) {
        return i10 >= 1 && i10 <= this.R;
    }

    private static boolean r(int i10) {
        return i10 >= 1 && i10 <= 7;
    }

    private static boolean s(int i10) {
        return i10 >= 0 && i10 <= 11;
    }

    private boolean u(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.kr, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if ((!q(i10) || !o(i10)) && this.f67658x2 != 1) {
            return false;
        }
        if (this.f67629a0 != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(this.G, this.F, 1);
            calendar.add(6, i10 - 1);
            this.f67629a0.a(this, calendar);
        }
        return true;
    }

    private boolean v(int i10, Calendar calendar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), calendar}, this, changeQuickRedirect, false, c.d.er, new Class[]{Integer.TYPE, Calendar.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.G == calendar.get(1) && this.F == calendar.get(2) && i10 == calendar.get(5);
    }

    public int getCellWidth() {
        return this.K;
    }

    public int getMode() {
        return this.f67660y1;
    }

    public int getMonthHeight() {
        if (this.f67657x1) {
            return this.H;
        }
        return 0;
    }

    public CharSequence getTitle() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.Oq, new Class[0], CharSequence.class);
        if (patchProxyResultProxy.isSupported) {
            return (CharSequence) patchProxyResultProxy.result;
        }
        if (this.E == null) {
            this.E = this.f67650r.format(this.f67646p.getTime());
        }
        return this.E;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.d.Rq, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        canvas.translate(paddingLeft, paddingTop);
        if (this.f67657x1) {
            g(canvas);
        }
        if (this.f67658x2 == 1) {
            c(canvas);
            f(canvas);
        } else {
            int i10 = this.f67660y1;
            if (i10 == 0) {
                d(canvas, this.f67636f, ViewUtils.m(getContext(), ViewUtils.L(getContext()), ViewUtils.L(getContext())), this.f67635e);
                c(canvas);
                b(canvas);
                e(canvas);
            } else if (i10 == 1) {
                c(canvas);
                f(canvas);
            }
        }
        canvas.translate(-paddingLeft, -paddingTop);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.d.hr, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported && z10) {
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            int i16 = (i14 - paddingRight) - paddingLeft;
            int i17 = (i15 - paddingBottom) - paddingTop;
            if (i16 == this.M || i17 == this.N) {
                return;
            }
            this.M = i16;
            this.N = i17;
            float measuredHeight = i17 / ((getMeasuredHeight() - paddingTop) - paddingBottom);
            int i18 = (int) (this.f67653u * measuredHeight);
            int i19 = this.M / 7;
            this.H = i18;
            this.I = (int) (this.f67654v * measuredHeight);
            this.J = (int) (this.f67655w * measuredHeight);
            this.K = i19;
            this.L = Math.min(this.f67659y, Math.min((i19 / 2) + Math.min(paddingLeft, paddingRight), (this.J / 2) + paddingBottom));
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.d.fr, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int paddingTop = (this.f67655w * 6) + this.f67654v + getPaddingTop() + getPaddingBottom();
        if (this.f67657x1) {
            paddingTop += this.f67653u;
        }
        this.f67648p2 = paddingTop;
        setMeasuredDimension(View.resolveSize((this.f67656x * 7) + getPaddingLeft() + getPaddingRight(), i10), View.resolveSize(paddingTop, i11));
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.gr, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.onRtlPropertiesChanged(i10);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int iJ;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, c.d.Qq, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int x10 = (int) (motionEvent.getX() + 0.5f);
        int y10 = (int) (motionEvent.getY() + 0.5f);
        int action = motionEvent.getAction();
        if (action == 0) {
            iJ = j(x10, y10);
            if (this.f67633c0 != iJ) {
                this.f67633c0 = iJ;
                invalidate();
            }
            if (action != 0 && iJ < 0 && this.f67658x2 != 1) {
                return false;
            }
        } else {
            if (action == 1) {
                u(j(x10, y10));
            } else if (action == 2) {
                iJ = j(x10, y10);
                if (this.f67633c0 != iJ) {
                    this.f67633c0 = iJ;
                    invalidate();
                }
                if (action != 0) {
                }
            } else if (action == 3) {
            }
            this.f67633c0 = -1;
            invalidate();
        }
        return true;
    }

    public boolean p() {
        return this.f67647p1;
    }

    void setDayHighlightColor(ColorStateList colorStateList) {
    }

    public void setDayOfWeekTextAppearance(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.Mq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        a(this.f67634d, i10);
        invalidate();
    }

    void setDayOfWeekTextColor(ColorStateList colorStateList) {
    }

    void setDaySelectorColor(ColorStateList colorStateList) {
    }

    public void setDayTextAppearance(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.Nq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ColorStateList colorStateListA = a(this.f67638h, i10);
        if (colorStateListA != null) {
            this.f67631b0 = colorStateListA;
        }
        invalidate();
    }

    void setDayTextColor(ColorStateList colorStateList) {
    }

    public void setEZCalendarView(EZCalendarView eZCalendarView) {
        this.f67630b = eZCalendarView;
    }

    public void setFirstDayOfWeek(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.br, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (r(i10)) {
            this.Q = i10;
        } else {
            this.Q = this.f67646p.getFirstDayOfWeek();
        }
        invalidate();
    }

    public void setMode(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.lr, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67660y1 = i10;
        m(getContext(), null);
    }

    public void setMonthTextAppearance(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.Lq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        a(this.f67632c, i10);
        invalidate();
    }

    void setMonthTextColor(ColorStateList colorStateList) {
    }

    public void setOnDayClickListener(a aVar) {
        this.f67629a0 = aVar;
    }

    public void setSelectedDay(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.Zq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.O = i10;
        invalidate();
    }

    public void setShowOutsideDate(boolean z10) {
        this.f67647p1 = z10;
    }

    public void setStyle(int i10) {
        this.f67658x2 = i10;
    }

    public void setWhiteStyle(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.d.Jq, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67661y2 = z10;
        invalidate();
    }

    public void t() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.ar, new Class[0], Void.TYPE).isSupported || this.f67630b == null) {
            return;
        }
        invalidate();
    }

    void w(int i10, int i11, int i12, int i13, int i14, int i15) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Integer(i14), new Integer(i15)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.d.cr, new Class[]{cls, cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.O = i10;
        if (s(i11)) {
            this.F = i11;
        }
        this.G = i12;
        this.f67646p.set(2, this.F);
        this.f67646p.set(1, this.G);
        this.f67646p.set(5, 1);
        this.S = this.f67646p.get(7);
        if (r(i13)) {
            this.Q = i13;
        } else {
            this.Q = this.f67646p.getFirstDayOfWeek();
        }
        Calendar calendar = Calendar.getInstance();
        this.P = -1;
        this.R = l(this.F, this.G);
        int i16 = 0;
        while (true) {
            int i17 = this.R;
            if (i16 >= i17) {
                int iG = com.max.hbcommon.component.ezcalendarview.utils.a.g(i14, 1, i17);
                this.V = iG;
                this.W = com.max.hbcommon.component.ezcalendarview.utils.a.g(i15, iG, this.R);
                this.T.set(this.G, this.F, this.V, 0, 0, 0);
                this.U.set(this.G, this.F, this.R, 0, 0, 0);
                this.E = null;
                return;
            }
            i16++;
            if (v(i16, calendar)) {
                this.P = i16;
            }
        }
    }
}
