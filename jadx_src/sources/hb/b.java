package hb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.max.hbcommon.component.curtain.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: RoundShape.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f119158a;

    public b(float f10) {
        this.f119158a = f10;
    }

    @Override // hb.c
    public void a(Canvas canvas, Paint paint, f fVar) {
        if (PatchProxy.proxy(new Object[]{canvas, paint, fVar}, this, changeQuickRedirect, false, bb.c.d.Fp, new Class[]{Canvas.class, Paint.class, f.class}, Void.TYPE).isSupported) {
            return;
        }
        Rect rect = fVar.f67560d;
        RectF rectF = new RectF(rect.left, rect.top, rect.right, rect.bottom);
        float f10 = this.f119158a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
    }
}
