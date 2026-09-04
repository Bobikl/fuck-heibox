package com.tencent.thumbplayer.tcmedia.b;

import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class j extends d implements ITPMediaDRMAsset {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f102450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @TPCommonEnum.TP_DRM_TYPE
    private int f102451b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f102453d = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f102452c = new HashMap();

    public j(@TPCommonEnum.TP_DRM_TYPE int i10, String str) {
        this.f102450a = str;
        this.f102451b = i10;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public Map<String, String> getDrmAllProperties() {
        return this.f102452c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public String getDrmPlayUrl() {
        return this.f102450a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public String getDrmProperty(String str, String str2) {
        String str3;
        Map<String, String> map = this.f102452c;
        return (map == null || map.isEmpty() || (str3 = this.f102452c.get(str)) == null) ? str2 : str3;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    @TPCommonEnum.TP_DRM_TYPE
    public int getDrmType() {
        return this.f102451b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.b.d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public String getOfflineKeySetId() {
        return this.f102453d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.b.d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public String getUrl() {
        try {
            return i.a(this);
        } catch (IOException e10) {
            TPLogUtil.e("TPMediaDRMAsset", e10);
            return "";
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public void setDrmPlayUrl(String str) {
        this.f102450a = str;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public void setDrmProperty(String str, String str2) {
        this.f102452c.put(str, str2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public void setDrmType(@TPCommonEnum.TP_DRM_TYPE int i10) {
        this.f102451b = i10;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public void setOfflineKeySetId(String str) {
        this.f102453d = str;
    }
}
