package com.max.hbcommon.component.bubble;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ArrowDrawable.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends ColorDrawable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f67354e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f67355f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f67356g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f67357h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f67358i = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f67359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f67360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Path f67361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f67362d;

    public a(@l int i10, int i11) {
        Paint paint = new Paint(1);
        this.f67359a = paint;
        this.f67360b = 0;
        paint.setColor(i10);
        this.f67362d = i11;
    }

    private synchronized void a(Rect rect) {
        if (PatchProxy.proxy(new Object[]{rect}, this, changeQuickRedirect, false, bb.c.d.f31355kk, new Class[]{Rect.class}, Void.TYPE).isSupported) {
            return;
        }
        Path path = new Path();
        this.f67361c = path;
        int i10 = this.f67362d;
        if (i10 == 0) {
            path.moveTo(rect.width(), rect.height());
            this.f67361c.lineTo(0.0f, rect.height() / 2);
            this.f67361c.lineTo(rect.width(), 0.0f);
            this.f67361c.lineTo(rect.width(), rect.height());
        } else if (i10 == 1) {
            path.moveTo(0.0f, rect.height());
            this.f67361c.lineTo(rect.width() / 2, 0.0f);
            this.f67361c.lineTo(rect.width(), rect.height());
            this.f67361c.lineTo(0.0f, rect.height());
        } else if (i10 == 2) {
            path.moveTo(0.0f, 0.0f);
            this.f67361c.lineTo(rect.width(), rect.height() / 2);
            this.f67361c.lineTo(0.0f, rect.height());
            this.f67361c.lineTo(0.0f, 0.0f);
        } else if (i10 == 3) {
            path.moveTo(0.0f, 0.0f);
            this.f67361c.lineTo(rect.width() / 2, rect.height());
            this.f67361c.lineTo(rect.width(), 0.0f);
            this.f67361c.lineTo(0.0f, 0.0f);
        }
        this.f67361c.close();
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.f31378lk, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        canvas.drawColor(this.f67360b);
        if (this.f67361c == null) {
            a(getBounds());
        }
        canvas.drawPath(this.f67361c, this.f67359a);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31470pk, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (this.f67359a.getColorFilter() != null) {
            return -3;
        }
        int color = this.f67359a.getColor() >>> 24;
        if (color != 0) {
            return color != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        if (PatchProxy.proxy(new Object[]{rect}, this, changeQuickRedirect, false, bb.c.d.f31332jk, new Class[]{Rect.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onBoundsChange(rect);
        a(rect);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31401mk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67359a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.ColorDrawable
    public void setColor(@l int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31424nk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67359a.setColor(i10);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (PatchProxy.proxy(new Object[]{colorFilter}, this, changeQuickRedirect, false, bb.c.d.f31447ok, new Class[]{ColorFilter.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67359a.setColorFilter(colorFilter);
    }
}
