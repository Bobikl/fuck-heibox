package com.tencent.thumbplayer.tcmedia.b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetObjectParam;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class b implements ITPMediaAssetExtraParam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Serializable> f102426a = new HashMap<>();

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam
    public int getExtraInt(String str) {
        if (this.f102426a.containsKey(str)) {
            return ((Integer) this.f102426a.get(str)).intValue();
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam
    public ITPMediaAssetObjectParam getExtraObject(String str) {
        if (this.f102426a.get(str) instanceof ITPMediaAssetObjectParam) {
            return (ITPMediaAssetObjectParam) this.f102426a.get(str);
        }
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam
    public String getExtraString(String str) {
        return this.f102426a.containsKey(str) ? (String) this.f102426a.get(str) : "";
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam
    public void setExtraInt(String str, int i10) {
        this.f102426a.put(str, Integer.valueOf(i10));
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam
    public void setExtraObject(String str, ITPMediaAssetObjectParam iTPMediaAssetObjectParam) {
        this.f102426a.put(str, iTPMediaAssetObjectParam);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam
    public void setExtraString(String str, String str2) {
        this.f102426a.put(str, str2);
    }
}
