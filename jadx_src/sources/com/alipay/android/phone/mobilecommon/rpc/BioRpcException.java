package com.alipay.android.phone.mobilecommon.rpc;

import com.alipay.zoloz.mobile.common.rpc.RpcException;

/* JADX INFO: loaded from: classes6.dex */
public class BioRpcException extends RpcException implements ag.a {
    public BioRpcException(RpcException rpcException) {
        super(Integer.valueOf(rpcException.a()), rpcException.b());
    }
}
