package com.tencent.cos.xml.transfer;

import bolts.h;
import bolts.i;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.AbortMultiUploadRequest;
import com.tencent.cos.xml.model.object.AbortMultiUploadResult;

/* JADX INFO: loaded from: classes4.dex */
public class CosServiceTaskProxy {
    private CosXmlSimpleService cosXmlSimpleService;

    CosServiceTaskProxy(CosXmlSimpleService cosXmlSimpleService) {
        this.cosXmlSimpleService = cosXmlSimpleService;
    }

    public h<AbortMultiUploadResult> abortMultiUpload(AbortMultiUploadRequest abortMultiUploadRequest) {
        final i iVar = new i();
        this.cosXmlSimpleService.abortMultiUploadAsync(abortMultiUploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.CosServiceTaskProxy.1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                i iVar2 = iVar;
                Exception cosXmlClientException2 = cosXmlClientException;
                if (cosXmlClientException == null) {
                    cosXmlClientException2 = cosXmlServiceException != null ? cosXmlServiceException : new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), "UnknownError");
                }
                iVar2.c(cosXmlClientException2);
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                iVar.d((AbortMultiUploadResult) cosXmlResult);
            }
        });
        return iVar.a();
    }
}
