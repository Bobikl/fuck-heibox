package com.alipay.tscenter.biz.rpc.deviceFp;

import com.alipay.mobile.framework.service.annotation.OperationType;

/* JADX INFO: loaded from: classes6.dex */
public interface BugTrackMessageService {
    @OperationType("alipay.security.errorLog.collect")
    String logCollect(String str);
}
