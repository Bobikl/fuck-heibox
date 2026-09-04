package h6;

import com.alipay.bis.common.service.facade.gw.model.upload.BisJsonUploadGwRequest;
import com.alipay.bis.common.service.facade.gw.model.upload.BisJsonUploadGwResult;
import com.alipay.bis.common.service.facade.gw.upload.BisJsonUploadGwFacade;
import com.alipay.bis.common.service.facade.gw.zim.ZimDispatchJsonGwFacade;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwRequest;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse;
import com.alipay.bis.common.service.facade.gw.zim.ZimOcrMobileRequest;
import com.alipay.bis.common.service.facade.gw.zim.ZimOcrMobileResponse;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidateGwResponse;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidateJsonGwRequest;
import com.alipay.zoloz.android.net.b;

/* JADX INFO: compiled from: FaceVerifyAlipayRpcServiceImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.alipay.android.phone.mobilecommon.rpc.b f119153e = new com.alipay.android.phone.mobilecommon.rpc.b();

    @Override // com.alipay.zoloz.android.net.b
    public ZimInitGwResponse a(ZimInitGwRequest zimInitGwRequest) {
        return ((ZimDispatchJsonGwFacade) this.f119153e.b(ZimDispatchJsonGwFacade.class)).initStandard(zimInitGwRequest);
    }

    @Override // com.alipay.zoloz.android.net.b
    public BisJsonUploadGwResult b(BisJsonUploadGwRequest bisJsonUploadGwRequest) {
        return ((BisJsonUploadGwFacade) this.f119153e.b(BisJsonUploadGwFacade.class)).upload(bisJsonUploadGwRequest);
    }

    @Override // com.alipay.zoloz.android.net.b
    public ZimValidateGwResponse c(ZimValidateJsonGwRequest zimValidateJsonGwRequest) {
        return ((ZimDispatchJsonGwFacade) this.f119153e.b(ZimDispatchJsonGwFacade.class)).validateStandard(zimValidateJsonGwRequest);
    }

    @Override // com.alipay.zoloz.android.net.b
    public ZimOcrMobileResponse h(ZimOcrMobileRequest zimOcrMobileRequest) {
        return ((ZimDispatchJsonGwFacade) this.f119153e.b(ZimDispatchJsonGwFacade.class)).ocrIdentify(zimOcrMobileRequest);
    }

    @Override // com.alipay.zoloz.android.net.b
    public void k(String str) {
        super.k(str);
        this.f119153e.c(str);
    }
}
