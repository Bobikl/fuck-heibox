package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.p0;

/* JADX INFO: compiled from: TintableCompoundDrawablesView.java */
/* JADX INFO: loaded from: classes.dex */
public interface c0 {
    @p0
    ColorStateList getSupportCompoundDrawablesTintList();

    @p0
    PorterDuff.Mode getSupportCompoundDrawablesTintMode();

    void setSupportCompoundDrawablesTintList(@p0 ColorStateList colorStateList);

    void setSupportCompoundDrawablesTintMode(@p0 PorterDuff.Mode mode);
}
