package com.alipay.face.network;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwRequest;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidateGwResponse;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidateJsonGwRequest;
import com.alipay.face.api.ZIMFacade;
import com.alipay.face.config.ProtocolContent;
import com.alipay.face.log.RecordLevel;
import com.alipay.face.log.RecordService;
import com.alipay.face.network.model.BisBehavCommon;
import com.alipay.face.network.model.BisBehavLog;
import com.alipay.face.network.model.BisBehavToken;
import com.alipay.face.network.model.BisClientInfo;
import com.alipay.face.network.model.OCRInfo;
import com.alipay.face.network.model.ValidateContent;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.blob.AESEncrypt;
import com.alipay.zoloz.toyger.blob.RSAEncrypt;
import com.alipay.zoloz.toyger.face.ToygerFaceAttr;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: NetworkPresenter.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38804a = "BioLog";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ExecutorService f38805b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f38806c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38807d = -2;

    /* JADX INFO: compiled from: NetworkPresenter.java */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ZimInitGwRequest f38808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f38809c;

        a(ZimInitGwRequest zimInitGwRequest, f fVar) {
            this.f38808b = zimInitGwRequest;
            this.f38809c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ZimInitGwResponse zimInitGwResponseA = com.alipay.zoloz.android.net.b.g().a(this.f38808b);
                if (zimInitGwResponseA == null || !com.alipay.face.b.a.f38594v.equalsIgnoreCase(zimInitGwResponseA.retCodeSub)) {
                    f fVar = this.f38809c;
                    if (fVar != null) {
                        fVar.b(zimInitGwResponseA.retCodeSub, zimInitGwResponseA.retMessageSub);
                    }
                } else {
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_DEBUG, "faceVerifyInit", "status", "success", "content", JSON.toJSONString(zimInitGwResponseA));
                    f fVar2 = this.f38809c;
                    if (fVar2 != null) {
                        fVar2.onSuccess(zimInitGwResponseA.protocol);
                    }
                }
            } catch (Throwable th2) {
                ZimInitGwResponse zimInitGwResponse = new ZimInitGwResponse();
                if (th2 instanceof ag.a) {
                    zimInitGwResponse.retCode = 2002;
                } else {
                    zimInitGwResponse.retCode = 1001;
                }
                zimInitGwResponse.message = th2.getMessage();
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "faceVerifyInit", "status", "error", "errMsg", Log.getStackTraceString(th2));
                f fVar3 = this.f38809c;
                if (fVar3 != null) {
                    fVar3.a(com.alipay.face.b.a.f38582j, zimInitGwResponse.message);
                }
            }
        }
    }

    private static String a(String str, Bitmap bitmap, ToygerFaceAttr toygerFaceAttr, String str2, String str3) {
        String strD = com.alipay.face.c.w().D();
        ValidateContent validateContent = new ValidateContent();
        validateContent.content = new String(com.alipay.face.c.w().G());
        validateContent.contentSig = Base64.encodeToString(com.alipay.face.c.w().H(), 2);
        BisBehavLog bisBehavLog = new BisBehavLog();
        BisClientInfo bisClientInfo = new BisClientInfo();
        bisClientInfo.setClientVer(com.alipay.face.b.f38551e);
        bisClientInfo.setModel(Build.MODEL);
        bisClientInfo.setOs("android");
        bisClientInfo.setOsVer(Build.VERSION.RELEASE);
        ProtocolContent protocolContentS = com.alipay.face.c.w().s();
        BisBehavToken bisBehavToken = new BisBehavToken();
        if (protocolContentS != null) {
            bisBehavToken.setToken(protocolContentS.token);
            bisBehavToken.setSampleMode(protocolContentS.sampleMode);
            bisBehavToken.setType(protocolContentS.type);
        }
        BisBehavCommon bisBehavCommon = new BisBehavCommon();
        bisBehavCommon.setInvtp("normal");
        bisBehavCommon.setTm("");
        bisBehavCommon.setRetry("0");
        ArrayList arrayList = new ArrayList();
        bisBehavLog.setBehavCommon(bisBehavCommon);
        bisBehavLog.setBehavTask(arrayList);
        bisBehavLog.setBehavToken(bisBehavToken);
        bisBehavLog.setClientInfo(bisClientInfo);
        try {
            byte[] bArrC = c(16);
            byte[] bArrEncrypt = RSAEncrypt.encrypt(RSAEncrypt.loadPublicKeyByStr(strD), bArrC);
            validateContent.behavLog = d4.c.c(AESEncrypt.encrypt(JSON.toJSONString(bisBehavLog).getBytes(), bArrC));
            validateContent.behavLogSig = d4.c.c(bArrEncrypt);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        validateContent.bisToken = "";
        if (protocolContentS != null) {
            validateContent.bisToken = protocolContentS.token;
        }
        return JSON.toJSONString(validateContent);
    }

    public static void b(Context context) {
        com.alipay.zoloz.android.net.b.g().k(com.alipay.face.network.a.W.f38799b);
        com.alipay.zoloz.android.net.b.g().i(context);
    }

    public static byte[] c(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("number can not below zero");
        }
        byte[] bArr = new byte[i10];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static void d(String str, String str2, f fVar) {
        ZimInitGwRequest zimInitGwRequest = new ZimInitGwRequest();
        zimInitGwRequest.zimId = str;
        ToygerLog.d("zimdId = " + str);
        zimInitGwRequest.metaInfo = str2;
        f38805b.execute(new a(zimInitGwRequest, fVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(Context context, String str, String str2, String str3, String str4, Bitmap bitmap, ToygerFaceAttr toygerFaceAttr, OCRInfo oCRInfo, h hVar) {
        String strA = a(str2, bitmap, toygerFaceAttr, str3, str4);
        ZimValidateJsonGwRequest zimValidateJsonGwRequest = new ZimValidateJsonGwRequest();
        zimValidateJsonGwRequest.zimId = str;
        zimValidateJsonGwRequest.zimData = strA;
        HashMap map = new HashMap();
        zimValidateJsonGwRequest.externParam = map;
        map.put("meta_info", ZIMFacade.getMetaInfos(context));
        byte[] bArrY = com.alipay.face.c.w().y();
        if (oCRInfo != null && bArrY != null) {
            zimValidateJsonGwRequest.externParam.put("cert_name", oCRInfo.name);
            zimValidateJsonGwRequest.externParam.put("cert_no", oCRInfo.num);
            zimValidateJsonGwRequest.externParam.put("cert_type", "IDCARD");
            zimValidateJsonGwRequest.externParam.put("identity_type", "CERT");
            zimValidateJsonGwRequest.externParam.put("custom_data_type", "BASE64_JPG");
            zimValidateJsonGwRequest.externParam.put("custom_data", Base64.encodeToString(bArrY, 2));
        }
        try {
            ZimValidateGwResponse zimValidateGwResponseC = com.alipay.zoloz.android.net.b.g().c(zimValidateJsonGwRequest);
            RecordService.getInstance().recordEvent(RecordLevel.LOG_DEBUG, "faceVerifyValidate", "status", "success", "content", JSON.toJSONString(zimValidateGwResponseC));
            if (hVar != null) {
                if (com.alipay.face.b.a.f38593u.equalsIgnoreCase(zimValidateGwResponseC.retCodeSub)) {
                    hVar.onSuccess();
                } else {
                    hVar.b(zimValidateGwResponseC.retCodeSub, zimValidateGwResponseC.retMessageSub);
                }
            }
        } catch (Exception e10) {
            int iA = e10 instanceof ag.a ? ((ag.a) e10).a() : -1;
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "faceVerifyValidate", "status", "error", "errMsg", Log.getStackTraceString(e10));
            if (hVar != null) {
                hVar.a(iA + "", e10.getMessage());
            }
        }
    }
}
