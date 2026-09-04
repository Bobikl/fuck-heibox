package android.graphics;

import android.annotation.NonNull;
import android.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RenderEffect {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ RenderEffect createBitmapEffect(@NonNull Bitmap bitmap, @Nullable Rect rect, @NonNull Rect rect2);

    @NonNull
    public static native /* synthetic */ RenderEffect createBlurEffect(float f10, float f11, @NonNull RenderEffect renderEffect, @NonNull Shader.TileMode tileMode);

    @NonNull
    public static native /* synthetic */ RenderEffect createBlurEffect(float f10, float f11, @NonNull Shader.TileMode tileMode);

    @NonNull
    public static native /* synthetic */ RenderEffect createOffsetEffect(float f10, float f11);

    @NonNull
    public static native /* synthetic */ RenderEffect createOffsetEffect(float f10, float f11, @NonNull RenderEffect renderEffect);
}
