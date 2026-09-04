package com.max.hbutils.utils;

import android.R;
import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.annotation.n0;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes13.dex */
public class ViewUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f73476a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f73477b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile Point[] f73478c = new Point[2];
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f73479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile boolean f73480e;

    public enum ViewType {
        BUTTON,
        IMAGE;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static ViewType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Tv, new Class[]{String.class}, ViewType.class);
            return patchProxyResultProxy.isSupported ? (ViewType) patchProxyResultProxy.result : (ViewType) Enum.valueOf(ViewType.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ViewType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.Sv, new Class[0], ViewType[].class);
            return patchProxyResultProxy.isSupported ? (ViewType[]) patchProxyResultProxy.result : (ViewType[]) values().clone();
        }
    }

    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f73481b;

        a(View view) {
            this.f73481b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.xv, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ((InputMethodManager) this.f73481b.getContext().getSystemService("input_method")).showSoftInput(this.f73481b, 1);
        }
    }

    public class b implements z0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f73482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f73483c;

        b(n nVar, o oVar) {
            this.f73482b = nVar;
            this.f73483c = oVar;
        }

        @Override // androidx.core.view.z0
        public n3 a(View view, n3 n3Var) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, n3Var}, this, changeQuickRedirect, false, bb.c.k.yv, new Class[]{View.class, n3.class}, n3.class);
            return patchProxyResultProxy.isSupported ? (n3) patchProxyResultProxy.result : this.f73482b.a(view, n3Var, new o(this.f73483c));
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@n0 View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.zv, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            view.removeOnAttachStateChangeListener(this);
            j1.v1(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public class d extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f73484b;

        d(EditText editText) {
            this.f73484b = editText;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Av, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ((InputMethodManager) this.f73484b.getContext().getSystemService("input_method")).showSoftInput(this.f73484b, 0);
        }
    }

    public class e extends Drawable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Paint f73485a = new Paint(5);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RectF f73486b = new RectF();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f73487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Typeface f73488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f73489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f73490f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f73491g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f73492h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f73493i;

        e(int i10, Typeface typeface, int i11, int i12, int i13, int i14, String str) {
            this.f73487c = i10;
            this.f73488d = typeface;
            this.f73489e = i11;
            this.f73490f = i12;
            this.f73491g = i13;
            this.f73492h = i14;
            this.f73493i = str;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.k.uv, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f73485a.setTextSize(this.f73487c);
            this.f73485a.setTypeface(this.f73488d);
            int iDescent = (int) ((this.f73485a.descent() - this.f73485a.ascent()) + this.f73489e);
            this.f73485a.setColor(this.f73490f);
            float fAscent = (this.f73485a.ascent() + this.f73485a.descent()) / 2.0f;
            int iSave = canvas.save();
            int i10 = this.f73491g;
            canvas.rotate(-45.0f, i10 / 2, i10 / 2);
            float fSqrt = (float) (((Math.sqrt(2.0d) - 1.0d) * ((double) this.f73491g)) / 2.0d);
            this.f73486b.set(getBounds().left - fSqrt, (this.f73491g / 2) - iDescent, getBounds().right + fSqrt, this.f73491g / 2);
            canvas.drawRect(this.f73486b, this.f73485a);
            this.f73485a.setColor(this.f73492h);
            this.f73485a.setTextAlign(Paint.Align.CENTER);
            String str = this.f73493i;
            int i11 = this.f73491g;
            canvas.drawText(str, i11 / 2, (((i11 / 2) - (iDescent / 2)) - fAscent) + this.f73489e, this.f73485a);
            canvas.restoreToCount(iSave);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f73491g;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f73491g;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.vv, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f73485a.setAlpha(i10);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            if (PatchProxy.proxy(new Object[]{colorFilter}, this, changeQuickRedirect, false, bb.c.k.wv, new Class[]{ColorFilter.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f73485a.setColorFilter(colorFilter);
        }
    }

    public class f extends Drawable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Paint f73494a = new Paint(5);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RectF f73495b = new RectF();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f73496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Typeface f73497d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f73498e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f73499f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f73500g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f73501h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f73502i;

        f(int i10, Typeface typeface, int i11, int i12, int i13, int i14, String str) {
            this.f73496c = i10;
            this.f73497d = typeface;
            this.f73498e = i11;
            this.f73499f = i12;
            this.f73500g = i13;
            this.f73501h = i14;
            this.f73502i = str;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.k.Bv, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f73494a.setTextSize(this.f73496c);
            this.f73494a.setTypeface(this.f73497d);
            int iDescent = (int) ((this.f73494a.descent() - this.f73494a.ascent()) + this.f73498e);
            this.f73494a.setColor(this.f73499f);
            float fAscent = (this.f73494a.ascent() + this.f73494a.descent()) / 2.0f;
            int iSave = canvas.save();
            int i10 = this.f73500g;
            canvas.rotate(45.0f, i10 / 2, i10 / 2);
            float fSqrt = (float) (((Math.sqrt(2.0d) - 1.0d) * ((double) this.f73500g)) / 2.0d);
            this.f73495b.set(getBounds().left - fSqrt, getBounds().top - fSqrt, getBounds().right + fSqrt, this.f73500g / 2);
            canvas.drawRect(this.f73495b, this.f73494a);
            this.f73494a.setColor(this.f73501h);
            this.f73494a.setTextAlign(Paint.Align.CENTER);
            String str = this.f73502i;
            int i11 = this.f73500g;
            canvas.drawText(str, i11 / 2, (((i11 / 2) - (iDescent / 2)) - fAscent) + this.f73498e, this.f73494a);
            canvas.restoreToCount(iSave);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f73500g;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f73500g;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Cv, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f73494a.setAlpha(i10);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            if (PatchProxy.proxy(new Object[]{colorFilter}, this, changeQuickRedirect, false, bb.c.k.Dv, new Class[]{ColorFilter.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f73494a.setColorFilter(colorFilter);
        }
    }

    public class g extends GradientDrawable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f73503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f73504b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(GradientDrawable.Orientation orientation, int[] iArr, int i10, int i11) {
            super(orientation, iArr);
            this.f73503a = i10;
            this.f73504b = i11;
        }

        @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f73504b;
        }

        @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f73503a;
        }

        @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }
    }

    public class h extends Drawable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Paint f73505a = new Paint(5);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Path f73506b = new Path();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f73507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f73508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f73509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f73510f;

        h(int i10, int i11, int i12, int i13) {
            this.f73507c = i10;
            this.f73508d = i11;
            this.f73509e = i12;
            this.f73510f = i13;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.k.Ev, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
                return;
            }
            int i10 = this.f73507c;
            if (i10 == 0) {
                this.f73505a.setColor(this.f73508d);
                this.f73506b.reset();
                this.f73506b.moveTo(0.0f, 0.0f);
                this.f73506b.lineTo(this.f73509e, 0.0f);
                this.f73506b.lineTo(0.0f, this.f73510f);
                this.f73506b.close();
                canvas.drawPath(this.f73506b, this.f73505a);
                return;
            }
            if (i10 == 1) {
                this.f73505a.setColor(this.f73508d);
                this.f73506b.reset();
                this.f73506b.moveTo(0.0f, 0.0f);
                this.f73506b.lineTo(this.f73509e, 0.0f);
                this.f73506b.lineTo(this.f73509e, this.f73510f);
                this.f73506b.close();
                canvas.drawPath(this.f73506b, this.f73505a);
                return;
            }
            if (i10 == 2) {
                this.f73505a.setColor(this.f73508d);
                this.f73506b.reset();
                this.f73506b.moveTo(0.0f, this.f73510f);
                this.f73506b.lineTo(this.f73509e, this.f73510f);
                this.f73506b.lineTo(this.f73509e, 0.0f);
                this.f73506b.close();
                canvas.drawPath(this.f73506b, this.f73505a);
                return;
            }
            if (i10 != 3) {
                return;
            }
            this.f73505a.setColor(this.f73508d);
            this.f73506b.reset();
            this.f73506b.moveTo(0.0f, 0.0f);
            this.f73506b.lineTo(0.0f, this.f73510f);
            this.f73506b.lineTo(this.f73509e, this.f73510f);
            this.f73506b.close();
            canvas.drawPath(this.f73506b, this.f73505a);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f73510f;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f73509e;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Fv, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f73505a.setAlpha(i10);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            if (PatchProxy.proxy(new Object[]{colorFilter}, this, changeQuickRedirect, false, bb.c.k.Gv, new Class[]{ColorFilter.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f73505a.setColorFilter(colorFilter);
        }
    }

    public class i extends Drawable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Paint f73511a = new Paint(5);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Path f73512b = new Path();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f73513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f73514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f73515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f73516f;

        i(int i10, int i11, int i12, int i13) {
            this.f73513c = i10;
            this.f73514d = i11;
            this.f73515e = i12;
            this.f73516f = i13;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.k.Hv, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
                return;
            }
            int i10 = this.f73513c;
            if (i10 == 0) {
                this.f73511a.setColor(this.f73514d);
                this.f73512b.reset();
                this.f73512b.moveTo(this.f73515e, 0.0f);
                this.f73512b.lineTo(this.f73515e, this.f73516f);
                this.f73512b.lineTo(0.0f, this.f73516f / 2.0f);
                this.f73512b.close();
                canvas.drawPath(this.f73512b, this.f73511a);
                return;
            }
            if (i10 == 1) {
                this.f73511a.setColor(this.f73514d);
                this.f73512b.reset();
                this.f73512b.moveTo(0.0f, this.f73516f);
                this.f73512b.lineTo(this.f73515e, this.f73516f);
                this.f73512b.lineTo(this.f73515e / 2.0f, 0.0f);
                this.f73512b.close();
                canvas.drawPath(this.f73512b, this.f73511a);
                return;
            }
            if (i10 == 2) {
                this.f73511a.setColor(this.f73514d);
                this.f73512b.reset();
                this.f73512b.moveTo(0.0f, 0.0f);
                this.f73512b.lineTo(0.0f, this.f73516f);
                this.f73512b.lineTo(this.f73515e, this.f73516f / 2.0f);
                this.f73512b.close();
                canvas.drawPath(this.f73512b, this.f73511a);
                return;
            }
            if (i10 != 3) {
                return;
            }
            this.f73511a.setColor(this.f73514d);
            this.f73512b.reset();
            this.f73512b.moveTo(0.0f, 0.0f);
            this.f73512b.lineTo(this.f73515e, 0.0f);
            this.f73512b.lineTo(this.f73515e / 2.0f, this.f73516f);
            this.f73512b.close();
            canvas.drawPath(this.f73512b, this.f73511a);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f73516f;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f73515e;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Iv, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f73511a.setAlpha(i10);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            if (PatchProxy.proxy(new Object[]{colorFilter}, this, changeQuickRedirect, false, bb.c.k.Jv, new Class[]{ColorFilter.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f73511a.setColorFilter(colorFilter);
        }
    }

    public class j extends Drawable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Paint f73517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f73518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RectF f73519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f73520d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f73521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f73522f;

        j(int i10, RectF rectF, int i11, int i12, int i13) {
            this.f73518b = i10;
            this.f73519c = rectF;
            this.f73520d = i11;
            this.f73521e = i12;
            this.f73522f = i13;
        }

        private Paint a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Kv, new Class[0], Paint.class);
            if (patchProxyResultProxy.isSupported) {
                return (Paint) patchProxyResultProxy.result;
            }
            if (this.f73517a == null) {
                Paint paint = new Paint();
                this.f73517a = paint;
                paint.setAntiAlias(true);
                this.f73517a.setColor(this.f73518b);
            }
            this.f73517a.setStyle(Paint.Style.FILL);
            return this.f73517a;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.k.Lv, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
                return;
            }
            canvas.drawArc(this.f73519c, this.f73520d, this.f73521e, true, a());
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f73522f;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f73522f;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Mv, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f73517a.setAlpha(i10);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            if (PatchProxy.proxy(new Object[]{colorFilter}, this, changeQuickRedirect, false, bb.c.k.Nv, new Class[]{ColorFilter.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f73517a.setColorFilter(colorFilter);
        }
    }

    public class k extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f73523b;

        k(View view) {
            this.f73523b = view;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@n0 RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.Ov, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (recyclerView.canScrollVertically(-1)) {
                this.f73523b.setVisibility(0);
            } else {
                this.f73523b.setVisibility(8);
            }
        }
    }

    public class l implements AppBarLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f73524a;

        l(View view) {
            this.f73524a = view;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.f, com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            if (PatchProxy.proxy(new Object[]{appBarLayout, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Pv, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == 0) {
                this.f73524a.setVisibility(8);
            } else {
                this.f73524a.setVisibility(0);
            }
        }
    }

    public class m implements ConsecutiveScrollerLayout.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f73525a;

        m(View view) {
            this.f73525a = view;
        }

        @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.h
        public void a(View view, int i10, int i11, int i12) {
            Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.Qv, new Class[]{View.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == 0) {
                this.f73525a.setVisibility(8);
            } else {
                this.f73525a.setVisibility(0);
            }
        }
    }

    public interface n {
        n3 a(View view, n3 n3Var, o oVar);
    }

    public static class o {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f73527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f73528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f73529d;

        public o(int i10, int i11, int i12, int i13) {
            this.f73526a = i10;
            this.f73527b = i11;
            this.f73528c = i12;
            this.f73529d = i13;
        }

        public o(@n0 o oVar) {
            this.f73526a = oVar.f73526a;
            this.f73527b = oVar.f73527b;
            this.f73528c = oVar.f73528c;
            this.f73529d = oVar.f73529d;
        }

        public void a(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.Rv, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            j1.d2(view, this.f73526a, this.f73527b, this.f73528c, this.f73529d);
        }
    }

    public static float A(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.Zu, new Class[]{View.class}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        float fR = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fR += j1.R((View) parent);
        }
        return fR;
    }

    public static int B(float f10, int i10, int i11) {
        Object[] objArr = {new Float(f10), new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.cv, new Class[]{Float.TYPE, cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ((Integer) new ArgbEvaluator().evaluate(f10, Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }

    public static Drawable C(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Au, new Class[]{cls, cls, cls, cls}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : new j(i13, new RectF(0.0f, -i10, i10 * 2, i10), i11, i12, i10);
    }

    public static Drawable D(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.yu, new Class[]{cls, cls, cls, cls}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : new h(i12, i13, i10, i11);
    }

    public static GradientDrawable E(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.lu, new Class[]{cls, cls}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i11);
        gradientDrawable.setCornerRadius(i10);
        return gradientDrawable;
    }

    public static Drawable F(GradientDrawable gradientDrawable, int i10, int i11) {
        Object[] objArr = {gradientDrawable, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.ku, new Class[]{GradientDrawable.class, cls, cls}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(i11);
        gradientDrawable2.setCornerRadius(i10);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public static Drawable G(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.mu, new Class[]{cls, cls}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i11);
        float f10 = i10;
        gradientDrawable.setCornerRadius(f10);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(i11);
        gradientDrawable2.setCornerRadius(f10);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    public static Drawable H(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.nu, new Class[]{cls, cls, cls}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i12);
        float f10 = i10;
        gradientDrawable.setCornerRadius(f10);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(i11);
        gradientDrawable2.setCornerRadius(f10);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    public static Drawable I(float[] fArr, int i10, int i11) {
        Object[] objArr = {fArr, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.ou, new Class[]{float[].class, cls, cls}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i11);
        gradientDrawable.setCornerRadii(fArr);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(i10);
        gradientDrawable2.setCornerRadii(fArr);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    public static int J(Context context) {
        WindowManager windowManager;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Eu, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (context == null || (windowManager = (WindowManager) context.getSystemService("window")) == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int K(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Lu, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        char c10 = (context != null ? context.getResources().getConfiguration().orientation : BaseApplication.a().getResources().getConfiguration().orientation) == 1 ? (char) 0 : (char) 1;
        if (f73478c[c10] == null) {
            WindowManager windowManager = context != null ? (WindowManager) context.getSystemService("window") : (WindowManager) BaseApplication.a().getSystemService("window");
            if (windowManager == null) {
                return J(context);
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            f73478c[c10] = point;
        }
        return f73478c[c10].y;
    }

    public static int L(Context context) {
        WindowManager windowManager;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Du, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (context == null || (windowManager = (WindowManager) context.getSystemService("window")) == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int M() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.Nu, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : t.p(BaseApplication.a());
    }

    public static Drawable N(float f10, int i10, int i11) {
        Object[] objArr = {new Float(f10), new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.xu, new Class[]{Float.TYPE, cls, cls}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f10);
        gradientDrawable.setStroke(i10, i11);
        return gradientDrawable;
    }

    public static Drawable O(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.vu, new Class[]{cls, cls, cls}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : w(i10, i11, i12, GradientDrawable.Orientation.TL_BR);
    }

    public static Drawable P(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.tu, new Class[]{cls, cls, cls}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : w(i10, i11, i12, GradientDrawable.Orientation.TOP_BOTTOM);
    }

    public static Drawable Q(int i10, int i11, String str, Typeface typeface, int i12, int i13, int i14) {
        Object[] objArr = {new Integer(i10), new Integer(i11), str, typeface, new Integer(i12), new Integer(i13), new Integer(i14)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.iu, new Class[]{cls, cls, String.class, Typeface.class, cls, cls, cls}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : new e(i12, typeface, i14, i11, i10, i13, str);
    }

    public static float R(Paint paint, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{paint, str}, null, changeQuickRedirect, true, bb.c.k.hu, new Class[]{Paint.class, String.class}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        if (str == null || str.length() == 0) {
            return 0.0f;
        }
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static float S(Paint paint, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{paint, str}, null, changeQuickRedirect, true, bb.c.k.gu, new Class[]{Paint.class, String.class}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        if (str == null || str.length() == 0) {
            return 0.0f;
        }
        return paint.measureText(str);
    }

    public static Drawable T(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.zu, new Class[]{cls, cls, cls, cls}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : new i(i12, i13, i10, i11);
    }

    public static Bitmap U(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.sv, new Class[]{View.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        Bitmap bitmapCreateBitmap = null;
        if (view == null) {
            return null;
        }
        try {
            boolean zIsHorizontalScrollBarEnabled = view.isHorizontalScrollBarEnabled();
            boolean zIsVerticalScrollBarEnabled = view.isVerticalScrollBarEnabled();
            view.setVerticalScrollBarEnabled(false);
            view.setHorizontalScrollBarEnabled(false);
            l0(view, true);
            view.buildDrawingCache();
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
            view.layout((int) view.getX(), (int) view.getY(), ((int) view.getX()) + view.getMeasuredWidth(), ((int) view.getY()) + view.getMeasuredHeight());
            bitmapCreateBitmap = Bitmap.createBitmap(view.getDrawingCache(), 0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            l0(view, false);
            view.destroyDrawingCache();
            view.setVerticalScrollBarEnabled(zIsHorizontalScrollBarEnabled);
            view.setHorizontalScrollBarEnabled(zIsVerticalScrollBarEnabled);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.G("getViewBitmap  onError  " + th2.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static int V(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.Cu, new Class[]{View.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        try {
            if (view.getHeight() > 0) {
                return view.getHeight();
            }
            if (view.getLayoutParams() != null && view.getLayoutParams().height > 0) {
                return view.getLayoutParams().height;
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            return view.getMeasuredHeight();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int W(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.Bu, new Class[]{View.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        try {
            if (view.getWidth() > 0) {
                return view.getWidth();
            }
            if (view.getLayoutParams() != null && view.getLayoutParams().width > 0) {
                return view.getLayoutParams().width;
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            return view.getMeasuredWidth();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void X(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.hv, new Class[]{View.class}, Void.TYPE).isSupported || view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static int Y(View view, ViewGroup viewGroup) {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, viewGroup}, null, changeQuickRedirect, true, bb.c.k.lv, new Class[]{View.class, ViewGroup.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        while (i10 < viewGroup.getChildCount() && viewGroup.getChildAt(i10) != view) {
            i10++;
        }
        return i10;
    }

    public static boolean Z() {
        float f10;
        float f11;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.Mu, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (f73479d) {
            return f73480e;
        }
        f73479d = true;
        f73480e = false;
        WindowManager windowManager = (WindowManager) BaseApplication.a().getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int i10 = point.x;
            int i11 = point.y;
            if (i10 < i11) {
                f11 = i10;
                f10 = i11;
            } else {
                float f12 = i11;
                f10 = i10;
                f11 = f12;
            }
            if (f10 / f11 >= 1.97f) {
                f73480e = true;
            }
        }
        return f73480e;
    }

    public static void a(EditText editText) {
        if (PatchProxy.proxy(new Object[]{editText}, null, changeQuickRedirect, true, bb.c.k.fv, new Class[]{EditText.class}, Void.TYPE).isSupported) {
            return;
        }
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
    }

    public static boolean a0(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.kv, new Class[]{View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (view != null) {
            Rect rect = new Rect();
            if (!(view.getGlobalVisibleRect(rect) && ((rect.bottom - rect.top) * (rect.right - rect.left) >= (view.getMeasuredHeight() * view.getMeasuredWidth()) / 2))) {
                return true;
            }
            View view2 = view;
            while (view2.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2.getParent();
                if (viewGroup.getVisibility() != 0) {
                    return true;
                }
                for (int iY = Y(view2, viewGroup) + 1; iY < viewGroup.getChildCount(); iY++) {
                    Rect rect2 = new Rect();
                    view.getGlobalVisibleRect(rect2);
                    View childAt = viewGroup.getChildAt(iY);
                    if (childAt.getVisibility() == 0) {
                        Rect rect3 = new Rect();
                        childAt.getGlobalVisibleRect(rect3);
                        if (Rect.intersects(rect2, rect3) && (Math.min(rect2.right, rect3.right) - Math.max(rect2.left, rect3.left)) * (Math.min(rect2.bottom, rect3.bottom) - Math.max(rect2.top, rect3.top)) * 2 >= view.getMeasuredHeight() * view.getMeasuredWidth()) {
                            return true;
                        }
                    }
                }
                view2 = viewGroup;
            }
        }
        return false;
    }

    public static void b(View view, View view2) {
        if (PatchProxy.proxy(new Object[]{view, view2}, null, changeQuickRedirect, true, bb.c.k.Uu, new Class[]{View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).addOnScrollListener(new k(view2));
        } else if (view instanceof AppBarLayout) {
            ((AppBarLayout) view).e(new l(view2));
        } else {
            if (!(view instanceof ConsecutiveScrollerLayout)) {
                throw new RuntimeException("invalid viewgroup");
            }
            ((ConsecutiveScrollerLayout) view).setOnVerticalScrollChangeListener(new m(view2));
        }
    }

    public static boolean b0(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Fu, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return context != null && context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean c(Context context) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Pu, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        boolean z11 = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if ("1".equals(str)) {
                z10 = false;
            } else if (!"0".equals(str)) {
                z10 = z11;
            }
            return z10;
        } catch (Exception e10) {
            e10.printStackTrace();
            return z11;
        }
    }

    public static boolean c0(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.Vu, new Class[]{View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return j1.Z(view) == 1;
    }

    public static void d(EditText editText) {
        if (PatchProxy.proxy(new Object[]{editText}, null, changeQuickRedirect, true, bb.c.k.ev, new Class[]{EditText.class}, Void.TYPE).isSupported) {
            return;
        }
        editText.setFocusable(false);
        editText.setFocusableInTouchMode(false);
    }

    public static boolean d0(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Gu, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return context != null && context.getResources().getConfiguration().orientation == 1;
    }

    public static void e(@n0 View view, @n0 n nVar) {
        if (PatchProxy.proxy(new Object[]{view, nVar}, null, changeQuickRedirect, true, bb.c.k.Xu, new Class[]{View.class, n.class}, Void.TYPE).isSupported) {
            return;
        }
        j1.a2(view, new b(nVar, new o(j1.k0(view), view.getPaddingTop(), j1.j0(view), view.getPaddingBottom())));
        j0(view);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    public static boolean e0(View view) {
        boolean z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.jv, new Class[]{View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (view != null) {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            int i10 = rect.top;
            if (i10 == 0 && rect.bottom == 0 && rect.left == 0 && rect.right == 0) {
                z10 = true;
            } else {
                boolean z11 = rect.bottom - i10 >= view.getMeasuredHeight();
                boolean z12 = rect.right - rect.left >= view.getMeasuredWidth();
                if (globalVisibleRect && z11 && z12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    public static int f(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.bu, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : y.a(context, f10);
    }

    public static boolean f0(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.bv, new Class[]{View.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : view.getLocalVisibleRect(new Rect());
    }

    public static int g(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.cu, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) (((f10 * context.getResources().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static PorterDuff.Mode g0(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static GradientDrawable h(int i10, int i11, int i12, int i13, GradientDrawable.Orientation orientation) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), orientation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.qu, new Class[]{cls, cls, cls, cls, GradientDrawable.Orientation.class}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i11, i12, i13});
        gradientDrawable.setCornerRadius(i10);
        return gradientDrawable;
    }

    public static int h0(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.eu, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((f10 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Drawable i(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.uu, new Class[]{cls, cls, cls}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : w(i10, i11, i12, GradientDrawable.Orientation.BL_TR);
    }

    public static int i0(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.fu, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((f10 / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static Drawable j(float f10, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.wu, new Class[]{Float.TYPE, Integer.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        int i11 = (int) (((double) (f10 * 2.0f)) + 0.5d);
        gradientDrawable.setSize(i11, i11);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    public static void j0(@n0 View view) {
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.Yu, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        if (j1.O0(view)) {
            j1.v1(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static int k(float f10, int i10) {
        Object[] objArr = {new Float(f10), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.dv, new Class[]{Float.TYPE, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (Math.min(255, Math.max(0, (int) (f10 * 255.0f))) << 24) + (i10 & 16777215);
    }

    public static void k0(@n0 View view) {
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.Wu, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        view.requestFocus();
        view.post(new a(view));
    }

    public static Drawable l(int i10, int i11, String str, Typeface typeface, int i12, int i13, int i14) {
        Object[] objArr = {new Integer(i10), new Integer(i11), str, typeface, new Integer(i12), new Integer(i13), new Integer(i14)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.ju, new Class[]{cls, cls, String.class, Typeface.class, cls, cls, cls}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : new f(i12, typeface, i14, i11, i10, i13, str);
    }

    private static void l0(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 9529, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported || view == null) {
            return;
        }
        view.setDrawingCacheEnabled(z10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l0(viewGroup.getChildAt(i10), z10);
                }
            }
        }
    }

    public static int m(Context context, int i10, int i11) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.qv, new Class[]{Context.class, cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(context, i10, i11, ViewType.BUTTON);
    }

    public static void m0(View view) {
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.mv, new Class[]{View.class}, Void.TYPE).isSupported || view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = -2;
        viewGroup.setLayoutParams(layoutParams);
        m0(viewGroup);
    }

    public static int n(Context context, int i10, int i11, ViewType viewType) {
        ViewType viewType2;
        float f10;
        Object[] objArr = {context, new Integer(i10), new Integer(i11), viewType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.rv, new Class[]{Context.class, cls, cls, ViewType.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iL = L(context);
        if (i11 < f(context, 20.0f)) {
            f10 = 2.0f;
        } else {
            ViewType viewType3 = ViewType.BUTTON;
            if ((viewType != viewType3 || i11 > f(context, 34.0f)) && (viewType != (viewType2 = ViewType.IMAGE) || i11 > f(context, 50.0f))) {
                f10 = ((viewType != viewType3 || i11 <= f(context, 34.0f) || i11 >= f(context, 50.0f)) && (viewType != viewType2 || i10 >= iL / 2 || i11 <= f(context, 50.0f))) ? 8.0f : 5.0f;
            } else {
                f10 = 3.0f;
            }
        }
        return f(context, f10);
    }

    public static ViewGroup.LayoutParams n0(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.iv, new Class[]{View.class, cls, cls, cls, cls}, ViewGroup.LayoutParams.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup.LayoutParams) patchProxyResultProxy.result;
        }
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = layoutParams != null ? new ViewGroup.MarginLayoutParams(layoutParams) : new ViewGroup.MarginLayoutParams(i10 + i12, i11 + i13);
        }
        marginLayoutParams.setMargins(i10, i11, i12, i13);
        view.setLayoutParams(marginLayoutParams);
        return marginLayoutParams;
    }

    public static int o(Context context, View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, bb.c.k.ov, new Class[]{Context.class, View.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : m(context, W(view), V(view));
    }

    public static void o0(PopupWindow popupWindow, View view) {
        if (PatchProxy.proxy(new Object[]{popupWindow, view}, null, changeQuickRedirect, true, bb.c.k.Ru, new Class[]{PopupWindow.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        p0(popupWindow, view, 0, 0);
    }

    public static int p(Context context, View view, ViewType viewType) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, view, viewType}, null, changeQuickRedirect, true, bb.c.k.pv, new Class[]{Context.class, View.class, ViewType.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(context, W(view), V(view), viewType);
    }

    public static void p0(PopupWindow popupWindow, View view, int i10, int i11) {
        Object[] objArr = {popupWindow, view, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Su, new Class[]{PopupWindow.class, View.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            if (!(view.getContext() instanceof Activity)) {
                return;
            }
            Activity activity = (Activity) view.getContext();
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            popupWindow.setHeight((rect2.height() - rect.bottom) + t.p(BaseApplication.a()));
        }
        popupWindow.showAsDropDown(view, i10, i11);
    }

    public static int q(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Hu, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (context == null) {
            return 0;
        }
        return b0(context) ? L(context) : J(context);
    }

    public static void q0(PopupWindow popupWindow, View view, int i10, int i11) {
        Object[] objArr = {popupWindow, view, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Tu, new Class[]{PopupWindow.class, View.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (Build.VERSION.SDK_INT < 24) {
            if (popupWindow.isShowing()) {
                return;
            }
            popupWindow.showAsDropDown(view, i10, i11);
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i12 = iArr[0];
        int height = iArr[1] + view.getHeight();
        if (popupWindow.isShowing()) {
            popupWindow.update(view, i10, i11, -1, popupWindow.getMaxAvailableHeight(view));
            return;
        }
        if (((WindowManager) view.getContext().getSystemService("window")) != null) {
            popupWindow.setHeight(popupWindow.getMaxAvailableHeight(view));
        }
        popupWindow.showAtLocation(view, 0, i12 + i10, height + i11);
    }

    public static int r(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Iu, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (context == null) {
            return 0;
        }
        return b0(context) ? J(context) : L(context);
    }

    public static void r0(EditText editText) {
        if (PatchProxy.proxy(new Object[]{editText}, null, changeQuickRedirect, true, bb.c.k.av, new Class[]{EditText.class}, Void.TYPE).isSupported) {
            return;
        }
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        new Timer().schedule(new d(editText), 200L);
    }

    public static int s(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Ju, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    public static void s0(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.gv, new Class[]{View.class}, Void.TYPE).isSupported || view == null || !view.requestFocus() || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }

    public static int t(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.nv, new Class[]{Context.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : context.getResources().getDimensionPixelSize(com.max.hbutils.R.dimen.dialog_corner_radius);
    }

    public static int t0(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.du, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((f10 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int u(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Ku, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return !Z() ? J(context) : K(context);
    }

    public static Drawable v(int i10, int i11, GradientDrawable.Orientation orientation, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), orientation, new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.pu, new Class[]{cls, cls, GradientDrawable.Orientation.class, cls, cls}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : new g(orientation, new int[]{i12, i13}, i10, i11);
    }

    public static GradientDrawable w(int i10, int i11, int i12, GradientDrawable.Orientation orientation) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), orientation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.ru, new Class[]{cls, cls, cls, GradientDrawable.Orientation.class}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i11, i12});
        gradientDrawable.setCornerRadius(i10);
        return gradientDrawable;
    }

    public static Drawable x(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.su, new Class[]{cls, cls, cls}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : w(i10, i11, i12, GradientDrawable.Orientation.LEFT_RIGHT);
    }

    public static int y() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.Ou, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Resources.getSystem().getDimensionPixelSize(Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public static int z(Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.Qu, new Class[]{Activity.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        TypedValue typedValue = new TypedValue();
        if (activity.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, activity.getResources().getDisplayMetrics());
        }
        return 0;
    }
}
