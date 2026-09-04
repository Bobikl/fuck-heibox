package com.tencent.thumbplayer.tcmedia.b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaUrlAsset;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class l extends d implements ITPMediaUrlAsset {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f102457a;

    public l(String str) {
        this.f102457a = str;
    }

    @Override // com.tencent.thumbplayer.tcmedia.b.d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaUrlAsset
    public String getStreamUrl() {
        return this.f102457a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.b.d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public String getUrl() {
        try {
            return i.a(this);
        } catch (IOException e10) {
            TPLogUtil.e("TPMediaUrlAsset", e10);
            return "";
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaUrlAsset
    public void setStreamUrl(String str) {
        this.f102457a = str;
    }
}
