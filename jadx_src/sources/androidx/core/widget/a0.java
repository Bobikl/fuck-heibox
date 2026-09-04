package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.RestrictTo;
import androidx.annotation.p0;

/* JADX INFO: compiled from: TintableCheckedTextView.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface a0 {
    @p0
    ColorStateList getSupportCheckMarkTintList();

    @p0
    PorterDuff.Mode getSupportCheckMarkTintMode();

    void setSupportCheckMarkTintList(@p0 ColorStateList colorStateList);

    void setSupportCheckMarkTintMode(@p0 PorterDuff.Mode mode);
}
