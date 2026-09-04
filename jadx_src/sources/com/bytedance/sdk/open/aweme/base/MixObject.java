package com.bytedance.sdk.open.aweme.base;

import android.os.Bundle;
import i7.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class MixObject implements IMediaObject {
    public ArrayList<String> mMediaPaths = new ArrayList<>();

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public boolean checkArgs() {
        return true;
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putStringArrayList(a.f119231c, this.mMediaPaths);
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public int type() {
        return 6;
    }

    @Override // com.bytedance.sdk.open.aweme.base.IMediaObject
    public void unserialize(Bundle bundle) {
        this.mMediaPaths.clear();
        ArrayList<String> stringArrayList = bundle.getStringArrayList(a.f119231c);
        if (stringArrayList != null) {
            this.mMediaPaths = stringArrayList;
        }
    }
}
