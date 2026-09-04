package com.umeng.socialize.net.base;

import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.net.utils.UClient;
import com.umeng.socialize.net.utils.URequest;
import com.umeng.socialize.utils.SLog;

/* JADX INFO: loaded from: classes4.dex */
public class SocializeClient extends UClient {
    public SocializeReseponse execute(URequest uRequest) {
        if (SocializeConstants.DEBUG_MODE) {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e10) {
                SLog.error(e10);
            }
        }
        return (SocializeReseponse) super.execute(uRequest, uRequest.mResponseClz);
    }
}
