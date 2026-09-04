package com.alipay.zoloz.android.net;

import android.content.Context;
import com.alipay.bis.common.service.facade.gw.model.upload.BisJsonUploadGwRequest;
import com.alipay.bis.common.service.facade.gw.model.upload.BisJsonUploadGwResult;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwRequest;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse;
import com.alipay.bis.common.service.facade.gw.zim.ZimOcrMobileRequest;
import com.alipay.bis.common.service.facade.gw.zim.ZimOcrMobileResponse;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidateGwResponse;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidateJsonGwRequest;

/* JADX INFO: compiled from: FaceVerifyRpcService.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static b f39594d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f39595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f39596b = "online";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f39597c;

    public static b g() {
        if (f39594d == null) {
            f39594d = a.a(FaceVerifyRpcType.MPAAS);
        }
        return f39594d;
    }

    public abstract ZimInitGwResponse a(ZimInitGwRequest zimInitGwRequest);

    public abstract BisJsonUploadGwResult b(BisJsonUploadGwRequest bisJsonUploadGwRequest);

    public abstract ZimValidateGwResponse c(ZimValidateJsonGwRequest zimValidateJsonGwRequest);

    public Context d() {
        return this.f39597c;
    }

    public String e() {
        return this.f39596b;
    }

    public String f() {
        return this.f39595a;
    }

    public abstract ZimOcrMobileResponse h(ZimOcrMobileRequest zimOcrMobileRequest);

    public void i(Context context) {
        this.f39597c = context;
    }

    public void j(String str) {
        this.f39596b = str;
    }

    public void k(String str) {
        this.f39595a = str;
    }
}
