package com.max.xiaoheihe.bean;

import bb.c;
import com.max.hbutils.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ImageInjectInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final String local_prefix = "https://com.max.xiaoheihe.imginject";
    private static final long serialVersionUID = -4465803155485700924L;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76937id;
    private String image_url;
    private String local_url;

    public static String generateId(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.m.pM, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : s.d(str);
    }

    public String getId() {
        return this.f76937id;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public String getLocal_url() {
        return this.local_url;
    }

    public void setId(String str) {
        this.f76937id = str;
    }

    public void setImage_url(String str) {
        this.image_url = str;
    }

    public void setLocal_url(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.oM, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.local_url = local_prefix + str;
    }
}
