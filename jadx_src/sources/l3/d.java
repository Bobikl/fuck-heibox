package l3;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.d0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ViewBindings.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    private d() {
    }

    @p0
    public static <T extends View> T a(View view, @d0 int i10) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            T t10 = (T) viewGroup.getChildAt(i11).findViewById(i10);
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }
}
