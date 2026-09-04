package com.max.hbcommon.component.curtain;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.n0;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class GuideView extends View {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f[] f67514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<f, f> f67515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f67516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f67517e;

    public GuideView(@n0 Context context) {
        super(context, null);
        this.f67516d = -2013265920;
        f();
    }

    private void a(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.ep, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67517e.setXfermode(null);
        this.f67517e.setColor(this.f67516d);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f67517e);
    }

    private void b(f fVar, Canvas canvas, Drawable drawable) {
        int iIntValue = 0;
        if (PatchProxy.proxy(new Object[]{fVar, canvas, drawable}, this, changeQuickRedirect, false, bb.c.d.mp, new Class[]{f.class, Canvas.class, Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        Object obj = null;
        try {
            Field declaredField = Class.forName("android.graphics.drawable.GradientDrawable").getDeclaredField("mGradientState");
            declaredField.setAccessible(true);
            obj = declaredField.get(drawable);
            Field declaredField2 = obj.getClass().getDeclaredField("mShape");
            declaredField2.setAccessible(true);
            iIntValue = ((Integer) declaredField2.get(obj)).intValue();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        float fFloatValue = 0.0f;
        if (Build.VERSION.SDK_INT >= 24) {
            fFloatValue = ((GradientDrawable) drawable).getCornerRadius();
        } else {
            try {
                Field declaredField3 = obj.getClass().getDeclaredField("mRadius");
                declaredField3.setAccessible(true);
                fFloatValue = ((Float) declaredField3.get(obj)).floatValue();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (iIntValue == 1) {
            Rect rect = fVar.f67560d;
            canvas.drawOval(new RectF(rect.left, rect.top, rect.right, rect.bottom), this.f67517e);
        } else {
            float fMin = Math.min(fFloatValue, Math.min(fVar.f67560d.width(), fVar.f67560d.height()) * 0.5f);
            Rect rect2 = fVar.f67560d;
            canvas.drawRoundRect(new RectF(rect2.left, rect2.top, rect2.right, rect2.bottom), fMin, fMin, this.f67517e);
        }
    }

    private void c(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.fp, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67517e.setColor(-1);
        this.f67517e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        for (f fVar : this.f67514b) {
            e(fVar, canvas);
        }
    }

    private boolean d(f fVar, Canvas canvas) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, canvas}, this, changeQuickRedirect, false, bb.c.d.lp, new Class[]{f.class, Canvas.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        hb.c cVar = fVar.f67562f;
        if (cVar != null) {
            cVar.a(canvas, this.f67517e, fVar);
            return true;
        }
        if (!fVar.b()) {
            return false;
        }
        Drawable background = fVar.f67559c.getBackground();
        if (background instanceof GradientDrawable) {
            b(fVar, canvas, background);
            return true;
        }
        if (!(background instanceof StateListDrawable) || !(background.getCurrent() instanceof GradientDrawable)) {
            return false;
        }
        b(fVar, canvas, background.getCurrent());
        return true;
    }

    private void e(f fVar, Canvas canvas) {
        if (!PatchProxy.proxy(new Object[]{fVar, canvas}, this, changeQuickRedirect, false, bb.c.d.gp, new Class[]{f.class, Canvas.class}, Void.TYPE).isSupported && this.f67514b.length > 0) {
            f fVar2 = this.f67515c.get(fVar);
            if (fVar2 != null) {
                g(fVar2, canvas);
                return;
            }
            Rect rect = new Rect();
            fVar.f67560d = rect;
            fVar.f67559c.getDrawingRect(rect);
            int[] iArr = new int[2];
            fVar.f67559c.getLocationOnScreen(iArr);
            Rect rect2 = fVar.f67560d;
            int i10 = iArr[0];
            rect2.left = i10;
            int i11 = iArr[1];
            rect2.top = i11;
            rect2.right += i10;
            rect2.bottom += i11;
            setTheBoundPadding(fVar);
            setHollowOffset(fVar);
            fVar.f67560d.top -= t.p(getContext());
            fVar.f67560d.bottom -= t.p(getContext());
            g(fVar, canvas);
            this.f67515c.put(fVar, fVar);
        }
    }

    private void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.cp, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67517e = new Paint(1);
        this.f67515c = new androidx.collection.a();
    }

    private void g(f fVar, Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{fVar, canvas}, this, changeQuickRedirect, false, bb.c.d.kp, new Class[]{f.class, Canvas.class}, Void.TYPE).isSupported || d(fVar, canvas)) {
            return;
        }
        canvas.drawRect(fVar.f67560d, this.f67517e);
    }

    private void setHollowOffset(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, this, changeQuickRedirect, false, bb.c.d.hp, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        if (fVar.a(f.f67556k) > 0) {
            int iA = fVar.a(f.f67556k);
            Rect rect = fVar.f67560d;
            rect.left += iA;
            rect.top += iA;
            rect.bottom += iA;
            rect.right += iA;
            return;
        }
        if (fVar.a(536870912) > 0) {
            fVar.f67560d.top += fVar.a(536870912);
            fVar.f67560d.bottom += fVar.a(536870912);
        }
        if (fVar.a(1073741824) > 0) {
            fVar.f67560d.right += fVar.a(1073741824);
            fVar.f67560d.left += fVar.a(1073741824);
        }
    }

    private void setTheBoundPadding(f fVar) {
        i iVar;
        if (PatchProxy.proxy(new Object[]{fVar}, this, changeQuickRedirect, false, bb.c.d.ip, new Class[]{f.class}, Void.TYPE).isSupported || (iVar = fVar.f67561e) == null) {
            return;
        }
        boolean zD = iVar.d();
        int iC = iVar.c(1);
        Rect rect = fVar.f67560d;
        rect.left -= zD ? iC : iVar.c(2);
        rect.top -= zD ? iC : iVar.c(4);
        rect.right += zD ? iC : iVar.c(6);
        int i10 = rect.bottom;
        if (!zD) {
            iC = iVar.c(8);
        }
        rect.bottom = i10 + iC;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.dp, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        a(canvas);
        c(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.jp, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setMeasuredDimension(ViewUtils.L(getContext()), ViewUtils.J(getContext()) * 2);
    }

    public void setCurtainColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.bp, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67516d = i10;
        postInvalidate();
    }

    public void setHollowInfo(@n0 SparseArray<f> sparseArray) {
        if (PatchProxy.proxy(new Object[]{sparseArray}, this, changeQuickRedirect, false, bb.c.d.Zo, new Class[]{SparseArray.class}, Void.TYPE).isSupported) {
            return;
        }
        f[] fVarArr = new f[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            fVarArr[i10] = sparseArray.valueAt(i10);
        }
        setHollowInfo(fVarArr);
    }

    public void setHollowInfo(@n0 f... fVarArr) {
        if (PatchProxy.proxy(new Object[]{fVarArr}, this, changeQuickRedirect, false, bb.c.d.ap, new Class[]{f[].class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67514b = fVarArr;
        postInvalidate();
    }
}
