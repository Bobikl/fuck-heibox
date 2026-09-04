package a4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.p0;
import com.airbnb.lottie.d;
import com.airbnb.lottie.k;
import com.airbnb.lottie.utils.f;
import com.airbnb.lottie.utils.j;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ImageAssetManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f1172e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private d f1175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, k> f1176d;

    public b(Drawable.Callback callback, String str, d dVar, Map<String, k> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f1174b = str;
        } else {
            this.f1174b = str + IOUtils.DIR_SEPARATOR_UNIX;
        }
        if (callback instanceof View) {
            this.f1173a = ((View) callback).getContext();
            this.f1176d = map;
            d(dVar);
        } else {
            f.e("LottieDrawable must be inside of a view for images to work.");
            this.f1176d = new HashMap();
            this.f1173a = null;
        }
    }

    private Bitmap c(String str, @p0 Bitmap bitmap) {
        synchronized (f1172e) {
            this.f1176d.get(str).h(bitmap);
        }
        return bitmap;
    }

    @p0
    public Bitmap a(String str) {
        k kVar = this.f1176d.get(str);
        if (kVar == null) {
            return null;
        }
        Bitmap bitmapA = kVar.a();
        if (bitmapA != null) {
            return bitmapA;
        }
        d dVar = this.f1175c;
        if (dVar != null) {
            Bitmap bitmapA2 = dVar.a(kVar);
            if (bitmapA2 != null) {
                c(str, bitmapA2);
            }
            return bitmapA2;
        }
        String strC = kVar.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                return c(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e10) {
                f.f("data URL did not have correct base64 format.", e10);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f1174b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                return c(str, j.m(BitmapFactory.decodeStream(this.f1173a.getAssets().open(this.f1174b + strC), null, options), kVar.f(), kVar.d()));
            } catch (IllegalArgumentException e11) {
                f.f("Unable to decode image.", e11);
                return null;
            }
        } catch (IOException e12) {
            f.f("Unable to open asset.", e12);
            return null;
        }
    }

    public boolean b(Context context) {
        return (context == null && this.f1173a == null) || this.f1173a.equals(context);
    }

    public void d(@p0 d dVar) {
        this.f1175c = dVar;
    }

    @p0
    public Bitmap e(String str, @p0 Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapA = this.f1176d.get(str).a();
            c(str, bitmap);
            return bitmapA;
        }
        k kVar = this.f1176d.get(str);
        Bitmap bitmapA2 = kVar.a();
        kVar.h(null);
        return bitmapA2;
    }
}
