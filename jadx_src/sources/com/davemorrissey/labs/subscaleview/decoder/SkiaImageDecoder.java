package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SkiaImageDecoder implements ImageDecoder {
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private final Bitmap.Config bitmapConfig;

    @Keep
    public SkiaImageDecoder() {
        this(null);
    }

    public SkiaImageDecoder(@p0 Bitmap.Config config) {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (config != null) {
            this.bitmapConfig = config;
        } else if (preferredBitmapConfig != null) {
            this.bitmapConfig = preferredBitmapConfig;
        } else {
            this.bitmapConfig = Bitmap.Config.RGB_565;
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageDecoder
    @n0
    public Bitmap decode(Context context, @n0 Uri uri) throws Exception {
        Bitmap bitmapDecodeFile;
        String string = uri.toString();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = this.bitmapConfig;
        if (string.startsWith(RESOURCE_PREFIX)) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            int identifier = 0;
            if (size == 2 && pathSegments.get(0).equals("drawable")) {
                identifier = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            } else if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                }
            }
            bitmapDecodeFile = BitmapFactory.decodeResource(context.getResources(), identifier, options);
        } else {
            InputStream inputStream = null;
            if (string.startsWith(ASSET_PREFIX)) {
                bitmapDecodeFile = BitmapFactory.decodeStream(context.getAssets().open(string.substring(22)), null, options);
            } else if (string.startsWith("file://")) {
                bitmapDecodeFile = BitmapFactory.decodeFile(string.substring(7), options);
            } else {
                try {
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        if (inputStreamOpenInputStream != null) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        bitmapDecodeFile = bitmapDecodeStream;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStreamOpenInputStream;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        if (bitmapDecodeFile != null) {
            return bitmapDecodeFile;
        }
        throw new RuntimeException("Skia image region decoder returned null bitmap - image format may not be supported");
    }
}
