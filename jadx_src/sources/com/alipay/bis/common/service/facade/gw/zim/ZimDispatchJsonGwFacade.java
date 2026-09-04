package com.alipay.bis.common.service.facade.gw.zim;

import m6.a;
import m6.c;

/* JADX INFO: loaded from: classes6.dex */
public interface ZimDispatchJsonGwFacade {
    @a("com.zoloz.zhub.zim.init.json")
    @c
    ZimInitGwResponse initStandard(ZimInitGwRequest zimInitGwRequest);

    @a("com.zoloz.zhub.zim.ocr.json")
    @c
    ZimOcrMobileResponse ocrIdentify(ZimOcrMobileRequest zimOcrMobileRequest);

    @a("com.zoloz.zhub.zim.verify.json")
    @c
    ZimValidateGwResponse validateStandard(ZimValidateJsonGwRequest zimValidateJsonGwRequest);
}
