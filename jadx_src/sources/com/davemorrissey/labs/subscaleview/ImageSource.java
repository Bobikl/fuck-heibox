package com.davemorrissey.labs.subscaleview;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.n0;
import anet.channel.util.HttpConstant;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageSource {
    static final String ASSET_SCHEME = "file:///android_asset/";
    static final String FILE_SCHEME = "file:///";
    private final Bitmap bitmap;
    private boolean cached;
    private final Integer resource;
    private int sHeight;
    private Rect sRegion;
    private int sWidth;
    private boolean tile;
    private final Uri uri;

    private ImageSource(int i10) {
        this.bitmap = null;
        this.uri = null;
        this.resource = Integer.valueOf(i10);
        this.tile = true;
    }

    private ImageSource(Bitmap bitmap, boolean z10) {
        this.bitmap = bitmap;
        this.uri = null;
        this.resource = null;
        this.tile = false;
        this.sWidth = bitmap.getWidth();
        this.sHeight = bitmap.getHeight();
        this.cached = z10;
    }

    private ImageSource(@n0 Uri uri) {
        String string = uri.toString();
        if (string.startsWith(FILE_SCHEME) && !new File(string.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(string, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.bitmap = null;
        this.uri = uri;
        this.resource = null;
        this.tile = true;
    }

    @n0
    public static ImageSource asset(@n0 String str) {
        if (str == null) {
            throw new NullPointerException("Asset name must not be null");
        }
        return uri(ASSET_SCHEME + str);
    }

    @n0
    public static ImageSource bitmap(@n0 Bitmap bitmap) {
        if (bitmap != null) {
            return new ImageSource(bitmap, false);
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @n0
    public static ImageSource cachedBitmap(@n0 Bitmap bitmap) {
        if (bitmap != null) {
            return new ImageSource(bitmap, true);
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @n0
    public static ImageSource resource(int i10) {
        return new ImageSource(i10);
    }

    private void setInvariants() {
        Rect rect = this.sRegion;
        if (rect != null) {
            this.tile = true;
            this.sWidth = rect.width();
            this.sHeight = this.sRegion.height();
        }
    }

    @n0
    public static ImageSource uri(@n0 Uri uri) {
        if (uri != null) {
            return new ImageSource(uri);
        }
        throw new NullPointerException("Uri must not be null");
    }

    @n0
    public static ImageSource uri(@n0 String str) {
        if (str == null) {
            throw new NullPointerException("Uri must not be null");
        }
        if (!str.contains(HttpConstant.SCHEME_SPLIT)) {
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            str = FILE_SCHEME + str;
        }
        return new ImageSource(Uri.parse(str));
    }

    @n0
    public ImageSource dimensions(int i10, int i11) {
        if (this.bitmap == null) {
            this.sWidth = i10;
            this.sHeight = i11;
        }
        setInvariants();
        return this;
    }

    protected final Bitmap getBitmap() {
        return this.bitmap;
    }

    protected final Integer getResource() {
        return this.resource;
    }

    protected final int getSHeight() {
        return this.sHeight;
    }

    protected final Rect getSRegion() {
        return this.sRegion;
    }

    protected final int getSWidth() {
        return this.sWidth;
    }

    protected final boolean getTile() {
        return this.tile;
    }

    protected final Uri getUri() {
        return this.uri;
    }

    protected final boolean isCached() {
        return this.cached;
    }

    @n0
    public ImageSource region(Rect rect) {
        this.sRegion = rect;
        setInvariants();
        return this;
    }

    @n0
    public ImageSource tiling(boolean z10) {
        this.tile = z10;
        return this;
    }

    @n0
    public ImageSource tilingDisabled() {
        return tiling(false);
    }

    @n0
    public ImageSource tilingEnabled() {
        return tiling(true);
    }
}
