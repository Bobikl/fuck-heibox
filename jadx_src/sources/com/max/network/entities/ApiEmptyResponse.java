package com.max.network.entities;

import dl.e;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ApiEmptyResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ApiEmptyResponse<T> extends ApiResponse<T> {
    /* JADX WARN: Multi-variable type inference failed */
    public ApiEmptyResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ApiEmptyResponse(@e ApiResponse<T> apiResponse) {
        super(null, apiResponse != null ? apiResponse.getStatus() : null, apiResponse != null ? apiResponse.getMsg() : null, null, 9, null);
    }

    public /* synthetic */ ApiEmptyResponse(ApiResponse apiResponse, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : apiResponse);
    }
}
