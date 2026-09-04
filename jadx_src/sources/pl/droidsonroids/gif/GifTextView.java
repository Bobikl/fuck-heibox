package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.w0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class GifTextView extends TextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j.b f138318b;

    public GifTextView(Context context) {
        super(context);
    }

    public GifTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet, 0, 0);
    }

    public GifTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(attributeSet, i10, 0);
    }

    @w0(21)
    public GifTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        c(attributeSet, i10, i11);
    }

    private void a() {
        if (this.f138318b.f138377b < 0) {
            return;
        }
        for (Drawable drawable : getCompoundDrawables()) {
            j.a(this.f138318b.f138377b, drawable);
        }
        for (Drawable drawable2 : getCompoundDrawablesRelative()) {
            j.a(this.f138318b.f138377b, drawable2);
        }
        j.a(this.f138318b.f138377b, getBackground());
    }

    private Drawable b(int i10) {
        if (i10 == 0) {
            return null;
        }
        Resources resources = getResources();
        String resourceTypeName = resources.getResourceTypeName(i10);
        if (!isInEditMode() && j.f138373b.contains(resourceTypeName)) {
            try {
                return new d(resources, i10);
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return resources.getDrawable(i10, getContext().getTheme());
    }

    private void c(AttributeSet attributeSet, int i10, int i11) {
        if (attributeSet != null) {
            Drawable drawableB = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableLeft", 0));
            Drawable drawableB2 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableTop", 0));
            Drawable drawableB3 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableRight", 0));
            Drawable drawableB4 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableBottom", 0));
            Drawable drawableB5 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableStart", 0));
            Drawable drawableB6 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableEnd", 0));
            if (getLayoutDirection() == 0) {
                if (drawableB5 != null) {
                    drawableB = drawableB5;
                }
                if (drawableB6 == null) {
                    drawableB6 = drawableB3;
                }
            } else {
                if (drawableB5 != null) {
                    drawableB3 = drawableB5;
                }
                if (drawableB6 == null) {
                    drawableB6 = drawableB;
                }
                drawableB = drawableB3;
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB, drawableB2, drawableB6, drawableB4);
            setBackground(b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", UiKitSpanObj.TYPE_BACKGROUND, 0)));
            this.f138318b = new j.b(this, attributeSet, i10, i11);
            a();
        }
        this.f138318b = new j.b();
    }

    private static void d(Drawable[] drawableArr, boolean z10) {
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.setVisible(z10, false);
            }
        }
    }

    private void setCompoundDrawablesVisible(boolean z10) {
        d(getCompoundDrawables(), z10);
        d(getCompoundDrawablesRelative(), z10);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setCompoundDrawablesVisible(true);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setCompoundDrawablesVisible(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GifViewSavedState gifViewSavedState = (GifViewSavedState) parcelable;
        super.onRestoreInstanceState(gifViewSavedState.getSuperState());
        Drawable[] compoundDrawables = getCompoundDrawables();
        gifViewSavedState.a(compoundDrawables[0], 0);
        gifViewSavedState.a(compoundDrawables[1], 1);
        gifViewSavedState.a(compoundDrawables[2], 2);
        gifViewSavedState.a(compoundDrawables[3], 3);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        gifViewSavedState.a(compoundDrawablesRelative[0], 4);
        gifViewSavedState.a(compoundDrawablesRelative[2], 5);
        gifViewSavedState.a(getBackground(), 6);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Drawable[] drawableArr = new Drawable[7];
        if (this.f138318b.f138376a) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            System.arraycopy(compoundDrawables, 0, drawableArr, 0, compoundDrawables.length);
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            drawableArr[4] = compoundDrawablesRelative[0];
            drawableArr[5] = compoundDrawablesRelative[2];
            drawableArr[6] = getBackground();
        }
        return new GifViewSavedState(super.onSaveInstanceState(), drawableArr);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        setBackground(b(i10));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(b(i10), b(i11), b(i12), b(i13));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        setCompoundDrawablesWithIntrinsicBounds(b(i10), b(i11), b(i12), b(i13));
    }

    public void setFreezesAnimation(boolean z10) {
        this.f138318b.f138376a = z10;
    }
}
