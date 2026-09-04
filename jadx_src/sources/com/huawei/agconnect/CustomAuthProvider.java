package com.huawei.agconnect;

import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.hmf.tasks.Task;

/* JADX INFO: loaded from: classes7.dex */
public interface CustomAuthProvider {
    Task<Token> getTokens(boolean z10);

    String getUid();
}
