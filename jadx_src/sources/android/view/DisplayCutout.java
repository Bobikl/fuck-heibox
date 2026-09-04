package android.view;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.graphics.Insets;
import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DisplayCutout {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ DisplayCutout(@NonNull Insets insets, @Nullable Rect rect, @Nullable Rect rect2, @Nullable Rect rect3, @Nullable Rect rect4) {
    }

    public /* synthetic */ DisplayCutout(@NonNull Insets insets, @Nullable Rect rect, @Nullable Rect rect2, @Nullable Rect rect3, @Nullable Rect rect4, @NonNull Insets insets2) {
    }

    @Deprecated
    public /* synthetic */ DisplayCutout(@Nullable Rect rect, @Nullable List<Rect> list) {
    }

    @NonNull
    public native /* synthetic */ List<Rect> getBoundingRects();

    public native /* synthetic */ int getSafeInsetBottom();

    public native /* synthetic */ int getSafeInsetLeft();

    public native /* synthetic */ int getSafeInsetRight();

    public native /* synthetic */ int getSafeInsetTop();

    public native /* synthetic */ int hashCode();
}
