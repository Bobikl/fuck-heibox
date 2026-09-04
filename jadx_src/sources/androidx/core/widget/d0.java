package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.RestrictTo;
import androidx.annotation.p0;

/* JADX INFO: compiled from: TintableImageSourceView.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface d0 {
    @p0
    ColorStateList getSupportImageTintList();

    @p0
    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(@p0 ColorStateList colorStateList);

    void setSupportImageTintMode(@p0 PorterDuff.Mode mode);
}
