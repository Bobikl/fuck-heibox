package com.umeng.social.tool;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public class UMImageMark extends UMWaterMark {
    private Bitmap mMarkBitmap;

    @Override // com.umeng.social.tool.UMWaterMark
    public /* bridge */ /* synthetic */ void bringToFront() {
        super.bringToFront();
    }

    @Override // com.umeng.social.tool.UMWaterMark
    public /* bridge */ /* synthetic */ Bitmap compound(Bitmap bitmap) {
        return super.compound(bitmap);
    }

    @Override // com.umeng.social.tool.UMWaterMark
    Bitmap getMarkBitmap() {
        return this.mMarkBitmap;
    }

    @Override // com.umeng.social.tool.UMWaterMark
    public /* bridge */ /* synthetic */ void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    @Override // com.umeng.social.tool.UMWaterMark
    public /* bridge */ /* synthetic */ void setContext(Context context) {
        super.setContext(context);
    }

    @Override // com.umeng.social.tool.UMWaterMark
    public /* bridge */ /* synthetic */ void setGravity(int i10) {
        super.setGravity(i10);
    }

    @Override // com.umeng.social.tool.UMWaterMark
    public /* bridge */ /* synthetic */ void setMargins(int i10, int i11, int i12, int i13) {
        super.setMargins(i10, i11, i12, i13);
    }

    public void setMarkBitmap(Bitmap bitmap) {
        this.mMarkBitmap = bitmap;
    }

    @Override // com.umeng.social.tool.UMWaterMark
    public /* bridge */ /* synthetic */ void setRotate(int i10) {
        super.setRotate(i10);
    }

    @Override // com.umeng.social.tool.UMWaterMark
    public /* bridge */ /* synthetic */ void setScale(float f10) {
        super.setScale(f10);
    }

    @Override // com.umeng.social.tool.UMWaterMark
    public /* bridge */ /* synthetic */ void setTransparent() {
        super.setTransparent();
    }
}
