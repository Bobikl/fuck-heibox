package com.bytedance.sdk.open.aweme.base;

import android.os.Bundle;
import i7.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class ImageObject implements IMediaObject {
    private static final String TAG = "ImageObject";
    public ArrayList<String> mImagePaths;

    public ImageObject() {
    }

    public ImageObject(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.mImagePaths = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public boolean checkArgs() {
        return true;
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putStringArrayList(a.f119229a, this.mImagePaths);
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public int type() {
        return 2;
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public void unserialize(Bundle bundle) {
        this.mImagePaths = bundle.getStringArrayList(a.f119229a);
    }
}
