package com.max.network.utils;

import bb.c;
import com.max.network.entities.ApiEmptyResponse;
import com.max.network.entities.ApiErrorResponse;
import com.max.network.entities.ApiFailedResponse;
import com.max.network.entities.ApiResponse;
import com.max.network.entities.ApiSuccessResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: KtUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KtUtilKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final <T> void parseData(@d ApiResponse<T> apiResponse, @d l<? super ResultBuilder<T>, b2> listenerBuilder) {
        if (PatchProxy.proxy(new Object[]{apiResponse, listenerBuilder}, null, changeQuickRedirect, true, c.m.Bg, new Class[]{ApiResponse.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(apiResponse, "<this>");
        f0.p(listenerBuilder, "listenerBuilder");
        ResultBuilder resultBuilder = new ResultBuilder(null, 1, null);
        listenerBuilder.invoke(resultBuilder);
        if (apiResponse instanceof ApiSuccessResponse) {
            resultBuilder.getOnSuccess().invoke(((ApiSuccessResponse) apiResponse).getResponse());
            resultBuilder.getOnRawSuccess().invoke(apiResponse);
        } else if (apiResponse instanceof ApiEmptyResponse) {
            resultBuilder.getOnDataEmpty().invoke();
        } else if (apiResponse instanceof ApiFailedResponse) {
            resultBuilder.getOnFailed().invoke(apiResponse.getStatus(), apiResponse.getMsg());
        } else if (apiResponse instanceof ApiErrorResponse) {
            resultBuilder.getOnError().invoke(((ApiErrorResponse) apiResponse).getThrowable());
        }
        resultBuilder.getOnComplete().invoke();
    }
}
