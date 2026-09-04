package com.max.xiaoheihe.module.upload;

import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.upload.COSCredentialsResultObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.auth.BasicLifecycleCredentialProvider;
import com.tencent.qcloud.core.auth.QCloudLifecycleCredentials;
import com.tencent.qcloud.core.auth.SessionQCloudCredentials;
import com.tencent.qcloud.core.common.QCloudClientException;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.t;

/* JADX INFO: compiled from: HeyboxCredentialProvider.java */
/* JADX INFO: loaded from: classes12.dex */
public class b extends BasicLifecycleCredentialProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    private COSCredentialsResultObj a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46094, new Class[0], COSCredentialsResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (COSCredentialsResultObj) patchProxyResultProxy.result;
        }
        try {
            c0 c0VarExecute = i.c().a(new a0.a().D(t.J(lb.a.f131041s3)).b()).execute();
            try {
                if (!c0VarExecute.c1()) {
                    return null;
                }
                Result resultJ = k.j(c0VarExecute.q(), COSCredentialsResultObj.class);
                if (!resultJ.isOk() || resultJ.getResult() == null) {
                    return null;
                }
                return (COSCredentialsResultObj) resultJ.getResult();
            } finally {
                try {
                    c0VarExecute.q().close();
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.tencent.qcloud.core.auth.BasicLifecycleCredentialProvider
    public QCloudLifecycleCredentials fetchNewCredentials() throws QCloudClientException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46093, new Class[0], QCloudLifecycleCredentials.class);
        if (patchProxyResultProxy.isSupported) {
            return (QCloudLifecycleCredentials) patchProxyResultProxy.result;
        }
        COSCredentialsResultObj cOSCredentialsResultObjA = a();
        if (cOSCredentialsResultObjA != null) {
            return new SessionQCloudCredentials(cOSCredentialsResultObjA.getCredentials().getTmpSecretId(), cOSCredentialsResultObjA.getCredentials().getTmpSecretKey(), cOSCredentialsResultObjA.getCredentials().getSessionToken(), cOSCredentialsResultObjA.getStartTime(), cOSCredentialsResultObjA.getExpiredTime());
        }
        throw new QCloudClientException("获取token异常");
    }
}
