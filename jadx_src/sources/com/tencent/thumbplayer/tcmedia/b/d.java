package com.tencent.thumbplayer.tcmedia.b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class d implements ITPMediaAsset {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ITPMediaAssetExtraParam f102428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f102429b;

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public ITPMediaAssetExtraParam getExtraParam() {
        return this.f102428a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public Map<String, String> getHttpHeader() {
        return this.f102429b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public String getUrl() {
        return "";
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public void setExtraParam(ITPMediaAssetExtraParam iTPMediaAssetExtraParam) {
        this.f102428a = iTPMediaAssetExtraParam;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public void setHttpHeader(Map<String, String> map) {
        this.f102429b = map;
    }
}
