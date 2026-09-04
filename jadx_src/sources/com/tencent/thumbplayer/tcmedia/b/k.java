package com.tencent.thumbplayer.tcmedia.b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaRTCAsset;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class k extends d implements ITPMediaRTCAsset {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f102454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f102455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f102456c;

    public k(String str, String str2) {
        this.f102456c = 0;
        this.f102454a = str;
        this.f102455b = str2;
    }

    public k(String str, String str2, int i10) {
        this.f102454a = str;
        this.f102455b = str2;
        this.f102456c = i10;
    }

    @Override // com.tencent.thumbplayer.tcmedia.b.d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaRTCAsset
    public int getRtcSdpExchangeType() {
        return this.f102456c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaRTCAsset
    public String getRtcServerUrl() {
        return this.f102455b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaRTCAsset
    public String getRtcStreamUrl() {
        return this.f102454a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.b.d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public String getUrl() {
        try {
            return i.a(this);
        } catch (IOException e10) {
            TPLogUtil.e("TPMediaWebrtcAsset", e10);
            return "";
        }
    }
}
