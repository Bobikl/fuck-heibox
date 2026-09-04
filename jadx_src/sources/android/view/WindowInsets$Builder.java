package android.view;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WindowInsets$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ WindowInsets$Builder() {
    }

    public /* synthetic */ WindowInsets$Builder(@NonNull WindowInsets windowInsets) {
    }

    @NonNull
    public native /* synthetic */ WindowInsets build();

    @NonNull
    public native /* synthetic */ WindowInsets$Builder setDisplayCutout(@Nullable DisplayCutout displayCutout);

    @NonNull
    @Deprecated
    public native /* synthetic */ WindowInsets$Builder setMandatorySystemGestureInsets(@NonNull Insets insets);

    @NonNull
    @Deprecated
    public native /* synthetic */ WindowInsets$Builder setStableInsets(@NonNull Insets insets);

    @NonNull
    @Deprecated
    public native /* synthetic */ WindowInsets$Builder setSystemGestureInsets(@NonNull Insets insets);

    @NonNull
    @Deprecated
    public native /* synthetic */ WindowInsets$Builder setSystemWindowInsets(@NonNull Insets insets);

    @NonNull
    @Deprecated
    public native /* synthetic */ WindowInsets$Builder setTappableElementInsets(@NonNull Insets insets);
}
