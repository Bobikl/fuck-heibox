package c9;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: CanvasCompat.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a {

    /* JADX INFO: renamed from: c9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CanvasCompat.java */
    public interface InterfaceC0267a {
        void a(@n0 Canvas canvas);
    }

    private a() {
    }

    public static int a(@n0 Canvas canvas, float f10, float f11, float f12, float f13, int i10) {
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
    }

    public static int b(@n0 Canvas canvas, @p0 RectF rectF, int i10) {
        return canvas.saveLayerAlpha(rectF, i10);
    }
}
