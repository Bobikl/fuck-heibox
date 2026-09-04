package com.alipay.bis.common.service.facade.gw.upload;

import com.alipay.bis.common.service.facade.gw.model.upload.BisJsonUploadGwRequest;
import com.alipay.bis.common.service.facade.gw.model.upload.BisJsonUploadGwResult;
import m6.a;

/* JADX INFO: loaded from: classes6.dex */
public interface BisJsonUploadGwFacade {
    @a("alipay.customer.bis.jsonupload")
    BisJsonUploadGwResult upload(BisJsonUploadGwRequest bisJsonUploadGwRequest);
}
