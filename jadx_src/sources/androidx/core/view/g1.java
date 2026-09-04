package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* JADX INFO: compiled from: TintableBackgroundView.java */
/* JADX INFO: loaded from: classes.dex */
public interface g1 {
    @androidx.annotation.p0
    ColorStateList getSupportBackgroundTintList();

    @androidx.annotation.p0
    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList);

    void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode);
}
