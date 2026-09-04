package com.max.xiaoheihe.bean.game.recommend;

import androidx.annotation.p0;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.g;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class GameRecommendBaseObj implements Serializable, g {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4221173193751679810L;
    private JsonObject report_additional;
    private String report_path;
    private transient boolean reported_exposure;
    private String type;

    public PathSrcNode copyToPathNode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15370, new Class[0], PathSrcNode.class);
        if (patchProxyResultProxy.isSupported) {
            return (PathSrcNode) patchProxyResultProxy.result;
        }
        PathSrcNode pathSrcNode = new PathSrcNode();
        pathSrcNode.setPath(this.report_path);
        JsonObject jsonObject = this.report_additional;
        if (jsonObject != null) {
            pathSrcNode.setAddition((JsonObject) k.a(k.p(jsonObject), JsonObject.class));
        } else {
            pathSrcNode.setAddition(new JsonObject());
        }
        return pathSrcNode;
    }

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15371, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameRecommendBaseObj)) {
            return false;
        }
        GameRecommendBaseObj gameRecommendBaseObj = (GameRecommendBaseObj) obj;
        return Objects.equals(getType(), gameRecommendBaseObj.getType()) && Objects.equals(getReport_path(), gameRecommendBaseObj.getReport_path()) && Objects.equals(getReport_additional(), gameRecommendBaseObj.getReport_additional());
    }

    @Override // com.max.hbcommon.analytics.g
    @p0
    public JsonObject getAdditional() {
        return this.report_additional;
    }

    @Override // com.max.hbcommon.analytics.g
    @p0
    public String getPath() {
        return this.report_path;
    }

    public JsonObject getReport_additional() {
        return this.report_additional;
    }

    public String getReport_path() {
        return this.report_path;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15372, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getType(), getReport_path(), getReport_additional());
    }

    public boolean isReported_exposure() {
        return this.reported_exposure;
    }

    public void setReport_additional(JsonObject jsonObject) {
        this.report_additional = jsonObject;
    }

    public void setReport_path(String str) {
        this.report_path = str;
    }

    public void setReported_exposure(boolean z10) {
        this.reported_exposure = z10;
    }

    public void setType(String str) {
        this.type = str;
    }
}
