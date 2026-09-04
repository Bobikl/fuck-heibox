package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BitmapDrawable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    @dl.d
    public static final BitmapDrawable a(@dl.d Bitmap bitmap, @dl.d Resources resources) {
        f0.p(bitmap, "<this>");
        f0.p(resources, "resources");
        return new BitmapDrawable(resources, bitmap);
    }
}
