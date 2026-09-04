package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton implements androidx.core.view.g1, androidx.core.widget.d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f2415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f2416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2417d;

    public AppCompatImageButton(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public AppCompatImageButton(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public AppCompatImageButton(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(u0.b(context), attributeSet, i10);
        this.f2417d = false;
        s0.a(this, getContext());
        c cVar = new c(this);
        this.f2415b = cVar;
        cVar.e(attributeSet, i10);
        j jVar = new j(this);
        this.f2416c = jVar;
        jVar.g(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.f2415b;
        if (cVar != null) {
            cVar.b();
        }
        j jVar = this.f2416c;
        if (jVar != null) {
            jVar.c();
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportBackgroundTintList() {
        c cVar = this.f2415b;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.f2415b;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.d0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportImageTintList() {
        j jVar = this.f2416c;
        if (jVar != null) {
            return jVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.d0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportImageTintMode() {
        j jVar = this.f2416c;
        if (jVar != null) {
            return jVar.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f2416c.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.f2415b;
        if (cVar != null) {
            cVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.f2415b;
        if (cVar != null) {
            cVar.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        j jVar = this.f2416c;
        if (jVar != null) {
            jVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@androidx.annotation.p0 Drawable drawable) {
        j jVar = this.f2416c;
        if (jVar != null && drawable != null && !this.f2417d) {
            jVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        j jVar2 = this.f2416c;
        if (jVar2 != null) {
            jVar2.c();
            if (this.f2417d) {
                return;
            }
            this.f2416c.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f2417d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@androidx.annotation.v int i10) {
        this.f2416c.i(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@androidx.annotation.p0 Uri uri) {
        super.setImageURI(uri);
        j jVar = this.f2416c;
        if (jVar != null) {
            jVar.c();
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        c cVar = this.f2415b;
        if (cVar != null) {
            cVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        c cVar = this.f2415b;
        if (cVar != null) {
            cVar.j(mode);
        }
    }

    @Override // androidx.core.widget.d0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        j jVar = this.f2416c;
        if (jVar != null) {
            jVar.k(colorStateList);
        }
    }

    @Override // androidx.core.widget.d0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        j jVar = this.f2416c;
        if (jVar != null) {
            jVar.l(mode);
        }
    }
}
