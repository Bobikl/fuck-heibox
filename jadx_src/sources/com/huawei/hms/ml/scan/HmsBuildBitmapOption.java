package com.huawei.hms.ml.scan;

import android.graphics.Bitmap;
import z5.g;

/* JADX INFO: loaded from: classes7.dex */
public class HmsBuildBitmapOption {
    public static final String TYPE_BUILD_BITMAP_BACKCOLOR = "BitmapBackColor";
    public static final String TYPE_BUILD_BITMAP_COLOR = "BitmapColor";
    public static final String TYPE_BUILD_BITMAP_CONTENT = "BitmapContent";
    public static final String TYPE_BUILD_BITMAP_FOTMAT = "BitmapFormat";
    public static final String TYPE_BUILD_BITMAP_HEIGHT = "BitmapHeight";
    public static final String TYPE_BUILD_BITMAP_MARGIN = "BitmapMargin";
    public static final String TYPE_BUILD_BITMAP_WIDTH = "BitmapWidth";
    public final ErrorCorrectionLevel QRErrorCorrection;
    public final int bimapColor;
    public final int bitmapBackgroundColor;
    public final Bitmap logoBitmap;
    public final int margin;

    public static class Creator {
        private Bitmap logobitmap;
        private int margin = 1;
        private int bimapBackgroundColor = -1;
        private int bimapColor = -1;
        private ErrorCorrectionLevel QRErrorCorrection = ErrorCorrectionLevel.L;

        public HmsBuildBitmapOption create() {
            return new HmsBuildBitmapOption(this.margin, this.bimapColor, this.bimapBackgroundColor, this.QRErrorCorrection, this.logobitmap);
        }

        public Creator setBitmapBackgroundColor(int i10) {
            this.bimapBackgroundColor = i10;
            return this;
        }

        public Creator setBitmapColor(int i10) {
            this.bimapColor = i10;
            return this;
        }

        public Creator setBitmapMargin(int i10) {
            this.margin = i10;
            return this;
        }

        public Creator setQRErrorCorrection(ErrorCorrectionLevel errorCorrectionLevel) {
            this.QRErrorCorrection = errorCorrectionLevel;
            return this;
        }

        public Creator setQRLogoBitmap(Bitmap bitmap) {
            this.logobitmap = bitmap;
            return this;
        }
    }

    public enum ErrorCorrectionLevel {
        L("L"),
        M("M"),
        Q("Q"),
        H("H");

        public final String value;

        ErrorCorrectionLevel(String str) {
            this.value = str;
        }
    }

    private HmsBuildBitmapOption(int i10, int i11, int i12, ErrorCorrectionLevel errorCorrectionLevel, Bitmap bitmap) {
        this.margin = i10;
        this.bitmapBackgroundColor = i12;
        this.bimapColor = i11;
        this.QRErrorCorrection = errorCorrectionLevel;
        this.logoBitmap = bitmap;
    }

    public String toString() {
        return "{margin:" + this.margin + ";bitmapBackgroundColor:" + this.bitmapBackgroundColor + ";bimapColor:" + this.bimapColor + g.f141884d;
    }
}
