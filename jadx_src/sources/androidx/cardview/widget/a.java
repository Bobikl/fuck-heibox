package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.w0;

/* JADX INFO: compiled from: CardViewApi17Impl.java */
/* JADX INFO: loaded from: classes.dex */
@w0(17)
public class a extends c {

    /* JADX INFO: renamed from: androidx.cardview.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CardViewApi17Impl.java */
    public class C0028a implements g.a {
        C0028a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    a() {
    }

    @Override // androidx.cardview.widget.c, androidx.cardview.widget.e
    public void n() {
        g.f3400s = new C0028a();
    }
}
