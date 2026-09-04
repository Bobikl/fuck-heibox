package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: WrappedDrawableApi21.java */
/* JADX INFO: loaded from: classes.dex */
@w0(21)
public class s extends r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f20701i = "WrappedDrawableApi21";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Method f20702j;

    s(Drawable drawable) {
        super(drawable);
        g();
    }

    s(t tVar, Resources resources) {
        super(tVar, resources);
        g();
    }

    private void g() {
        if (f20702j == null) {
            try {
                f20702j = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e10) {
                Log.w(f20701i, "Failed to retrieve Drawable#isProjected() method", e10);
            }
        }
    }

    @Override // androidx.core.graphics.drawable.r
    protected boolean c() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    @n0
    public Rect getDirtyBounds() {
        return this.f20700g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@n0 Outline outline) {
        this.f20700g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f20700g;
        if (drawable != null && (method = f20702j) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e10) {
                Log.w(f20701i, "Error calling Drawable#isProjected() method", e10);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        this.f20700g.setHotspot(f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f20700g.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.core.graphics.drawable.r, android.graphics.drawable.Drawable
    public boolean setState(@n0 int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.r, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTint(int i10) {
        if (c()) {
            super.setTint(i10);
        } else {
            this.f20700g.setTint(i10);
        }
    }

    @Override // androidx.core.graphics.drawable.r, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f20700g.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.r, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(@n0 PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f20700g.setTintMode(mode);
        }
    }
}
