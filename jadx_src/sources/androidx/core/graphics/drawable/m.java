package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: RoundedBitmapDrawable21.java */
/* JADX INFO: loaded from: classes.dex */
@w0(21)
public class m extends n {
    protected m(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // androidx.core.graphics.drawable.n
    void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
        Gravity.apply(i10, i11, i12, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@n0 Outline outline) {
        t();
        outline.setRoundRect(this.f20687h, c());
    }

    @Override // androidx.core.graphics.drawable.n
    public boolean h() {
        Bitmap bitmap = this.f20680a;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // androidx.core.graphics.drawable.n
    public void o(boolean z10) {
        Bitmap bitmap = this.f20680a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z10);
            invalidateSelf();
        }
    }
}
