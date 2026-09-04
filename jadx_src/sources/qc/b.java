package qc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.s0;

/* JADX INFO: compiled from: GradientDrawableBuild.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends Drawable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final Shader f138649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final Paint f138650b;

    public b(@d Shader shader) {
        f0.p(shader, "shader");
        this.f138649a = shader;
        Paint paint = new Paint();
        this.f138650b = paint;
        paint.setShader(shader);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.g.f33066r4, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        canvas.drawRect(getBounds(), this.f138650b);
    }

    @Override // android.graphics.drawable.Drawable
    @k(message = "Deprecated in Java", replaceWith = @s0(expression = "PixelFormat.TRANSLUCENT", imports = {"android.graphics.PixelFormat"}))
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.g.f33086s4, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f138650b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@e ColorFilter colorFilter) {
        if (PatchProxy.proxy(new Object[]{colorFilter}, this, changeQuickRedirect, false, c.g.f33106t4, new Class[]{ColorFilter.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f138650b.setColorFilter(colorFilter);
    }
}
