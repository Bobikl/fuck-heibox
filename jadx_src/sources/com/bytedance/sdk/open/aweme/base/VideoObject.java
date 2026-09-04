package com.bytedance.sdk.open.aweme.base;

import android.os.Bundle;
import i7.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class VideoObject implements IMediaObject {
    private static final String TAG = "VideoObject";
    public ArrayList<String> mVideoPaths;

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public boolean checkArgs() {
        return true;
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putStringArrayList(a.f119230b, this.mVideoPaths);
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public int type() {
        return 3;
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public void unserialize(Bundle bundle) {
        this.mVideoPaths = bundle.getStringArrayList(a.f119230b);
    }
}
