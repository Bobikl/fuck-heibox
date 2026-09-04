package androidx.appcompat.widget;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: FitWindowsViewGroup.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface e0 {

    /* JADX INFO: compiled from: FitWindowsViewGroup.java */
    public interface a {
        void a(Rect rect);
    }

    void setOnFitSystemWindowsListener(a aVar);
}
