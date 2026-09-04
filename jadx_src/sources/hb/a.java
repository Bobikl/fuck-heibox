package hb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.max.hbcommon.component.curtain.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: CircleShape.java */
/* JADX INFO: loaded from: classes9.dex */
public class a implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // hb.c
    public void a(Canvas canvas, Paint paint, f fVar) {
        if (PatchProxy.proxy(new Object[]{canvas, paint, fVar}, this, changeQuickRedirect, false, bb.c.d.Ep, new Class[]{Canvas.class, Paint.class, f.class}, Void.TYPE).isSupported) {
            return;
        }
        Rect rect = fVar.f67560d;
        canvas.drawOval(new RectF(rect.left, rect.top, rect.right, rect.bottom), paint);
    }
}
