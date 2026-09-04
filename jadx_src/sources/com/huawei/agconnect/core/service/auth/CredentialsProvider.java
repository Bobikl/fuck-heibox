package com.huawei.agconnect.core.service.auth;

import com.huawei.hmf.tasks.Task;

/* JADX INFO: loaded from: classes7.dex */
public interface CredentialsProvider {
    Task<Token> getTokens();

    Task<Token> getTokens(boolean z10);
}
