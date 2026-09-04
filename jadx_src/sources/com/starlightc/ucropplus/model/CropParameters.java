package com.starlightc.ucropplus.model;

import android.graphics.Bitmap;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes4.dex */
public class CropParameters {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Bitmap.CompressFormat mCompressFormat;
    private int mCompressQuality;
    private Uri mContentImageInputUri;
    private Uri mContentImageOutputUri;
    private ExifInfo mExifInfo;
    private String mImageInputPath;
    private String mImageOutputPath;
    private int mMaxResultImageSizeX;
    private int mMaxResultImageSizeY;

    public CropParameters(int i10, int i11, Bitmap.CompressFormat compressFormat, int i12, String str, String str2, ExifInfo exifInfo) {
        this.mMaxResultImageSizeX = i10;
        this.mMaxResultImageSizeY = i11;
        this.mCompressFormat = compressFormat;
        this.mCompressQuality = i12;
        this.mImageInputPath = str;
        this.mImageOutputPath = str2;
        this.mExifInfo = exifInfo;
    }

    public Bitmap.CompressFormat getCompressFormat() {
        return this.mCompressFormat;
    }

    public int getCompressQuality() {
        return this.mCompressQuality;
    }

    public Uri getContentImageInputUri() {
        return this.mContentImageInputUri;
    }

    public Uri getContentImageOutputUri() {
        return this.mContentImageOutputUri;
    }

    public ExifInfo getExifInfo() {
        return this.mExifInfo;
    }

    public String getImageInputPath() {
        return this.mImageInputPath;
    }

    public String getImageOutputPath() {
        return this.mImageOutputPath;
    }

    public int getMaxResultImageSizeX() {
        return this.mMaxResultImageSizeX;
    }

    public int getMaxResultImageSizeY() {
        return this.mMaxResultImageSizeY;
    }

    public void setContentImageInputUri(Uri uri) {
        this.mContentImageInputUri = uri;
    }

    public void setContentImageOutputUri(Uri uri) {
        this.mContentImageOutputUri = uri;
    }
}
