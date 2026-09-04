package com.hihonor.push.sdk;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.hihonor.push.framework.aidl.DataBuffer;
import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.IPushCallback;
import com.hihonor.push.framework.aidl.MessageCodec;
import com.hihonor.push.framework.aidl.entity.ResponseHeader;
import com.hihonor.push.sdk.common.data.ApiException;

/* JADX INFO: loaded from: classes7.dex */
public class h0 extends IPushCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f60039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f60040b;

    public h0(Object obj, i0 i0Var) {
        this.f60039a = obj;
        this.f60040b = i0Var;
    }

    @Override // com.hihonor.push.framework.aidl.IPushCallback
    public void onResult(DataBuffer dataBuffer) {
        Log.i("IPCCallback", "onResult parse start.");
        Bundle header = dataBuffer.getHeader();
        Bundle body = dataBuffer.getBody();
        ResponseHeader responseHeader = new ResponseHeader();
        MessageCodec.parseMessageEntity(header, responseHeader);
        Object obj = this.f60039a;
        if (obj instanceof IMessageEntity) {
            MessageCodec.parseMessageEntity(body, (IMessageEntity) obj);
        }
        i0 i0Var = this.f60040b;
        ApiException apiException = new ApiException(responseHeader.getStatusCode(), responseHeader.getStatusMessage());
        Object obj2 = this.f60039a;
        z.b bVar = (z.b) i0Var;
        bVar.getClass();
        z zVar = z.f60108c;
        f1<?> f1Var = bVar.f60117a;
        zVar.getClass();
        Log.i("HonorApiManager", "sendResolveResult start");
        Handler handler = zVar.f60109a;
        handler.sendMessage(handler.obtainMessage(2, f1Var));
        bVar.f60117a.b(apiException, obj2);
        Log.i("IPCCallback", "onResult parse end.");
    }
}
