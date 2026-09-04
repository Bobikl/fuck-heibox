package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.w0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Icon.kt */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class l {
    @dl.d
    @w0(26)
    public static final Icon a(@dl.d Bitmap bitmap) {
        f0.p(bitmap, "<this>");
        Icon iconCreateWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        f0.o(iconCreateWithAdaptiveBitmap, "createWithAdaptiveBitmap(this)");
        return iconCreateWithAdaptiveBitmap;
    }

    @dl.d
    @w0(26)
    public static final Icon b(@dl.d Bitmap bitmap) {
        f0.p(bitmap, "<this>");
        Icon iconCreateWithBitmap = Icon.createWithBitmap(bitmap);
        f0.o(iconCreateWithBitmap, "createWithBitmap(this)");
        return iconCreateWithBitmap;
    }

    @dl.d
    @w0(26)
    public static final Icon c(@dl.d Uri uri) {
        f0.p(uri, "<this>");
        Icon iconCreateWithContentUri = Icon.createWithContentUri(uri);
        f0.o(iconCreateWithContentUri, "createWithContentUri(this)");
        return iconCreateWithContentUri;
    }

    @dl.d
    @w0(26)
    public static final Icon d(@dl.d byte[] bArr) {
        f0.p(bArr, "<this>");
        Icon iconCreateWithData = Icon.createWithData(bArr, 0, bArr.length);
        f0.o(iconCreateWithData, "createWithData(this, 0, size)");
        return iconCreateWithData;
    }
}
