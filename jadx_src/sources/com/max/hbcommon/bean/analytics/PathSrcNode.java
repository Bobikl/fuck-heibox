package com.max.hbcommon.bean.analytics;

import bb.c;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class PathSrcNode implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1810114331466586011L;
    private JsonObject addition;
    private String path;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.f31202e5, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PathSrcNode pathSrcNode = (PathSrcNode) obj;
        String str = this.path;
        if (str == null ? pathSrcNode.path != null : !str.equals(pathSrcNode.path)) {
            return false;
        }
        JsonObject jsonObject = this.addition;
        JsonObject jsonObject2 = pathSrcNode.addition;
        if (jsonObject != null) {
            return jsonObject.equals(jsonObject2);
        }
        return jsonObject2 == null;
    }

    public JsonObject getAddition() {
        return this.addition;
    }

    public String getPath() {
        return this.path;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31225f5, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.path;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        JsonObject jsonObject = this.addition;
        return iHashCode + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public void setAddition(JsonObject jsonObject) {
        this.addition = jsonObject;
    }

    public void setPath(String str) {
        this.path = str;
    }
}
