package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Glide;

/* JADX INFO: compiled from: VideoBitmapDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class f0 extends VideoDecoder<ParcelFileDescriptor> {
    public f0(Context context) {
        this(Glide.e(context).h());
    }

    public f0(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        super(eVar, new VideoDecoder.g());
    }
}
