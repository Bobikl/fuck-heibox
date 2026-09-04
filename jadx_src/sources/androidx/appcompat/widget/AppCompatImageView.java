package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements androidx.core.view.g1, androidx.core.widget.d0 {
    private final c mBackgroundTintHelper;
    private boolean mHasLevel;
    private final j mImageHelper;

    public AppCompatImageView(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public AppCompatImageView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(u0.b(context), attributeSet, i10);
        this.mHasLevel = false;
        s0.a(this, getContext());
        c cVar = new c(this);
        this.mBackgroundTintHelper = cVar;
        cVar.e(attributeSet, i10);
        j jVar = new j(this);
        this.mImageHelper = jVar;
        jVar.g(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.b();
        }
        j jVar = this.mImageHelper;
        if (jVar != null) {
            jVar.c();
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportBackgroundTintList() {
        c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.d0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportImageTintList() {
        j jVar = this.mImageHelper;
        if (jVar != null) {
            return jVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.d0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportImageTintMode() {
        j jVar = this.mImageHelper;
        if (jVar != null) {
            return jVar.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        j jVar = this.mImageHelper;
        if (jVar != null) {
            jVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@androidx.annotation.p0 Drawable drawable) {
        j jVar = this.mImageHelper;
        if (jVar != null && drawable != null && !this.mHasLevel) {
            jVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        j jVar2 = this.mImageHelper;
        if (jVar2 != null) {
            jVar2.c();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@androidx.annotation.v int i10) {
        j jVar = this.mImageHelper;
        if (jVar != null) {
            jVar.i(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(@androidx.annotation.p0 Uri uri) {
        super.setImageURI(uri);
        j jVar = this.mImageHelper;
        if (jVar != null) {
            jVar.c();
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.j(mode);
        }
    }

    @Override // androidx.core.widget.d0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        j jVar = this.mImageHelper;
        if (jVar != null) {
            jVar.k(colorStateList);
        }
    }

    @Override // androidx.core.widget.d0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        j jVar = this.mImageHelper;
        if (jVar != null) {
            jVar.l(mode);
        }
    }
}
