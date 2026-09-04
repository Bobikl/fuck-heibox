package com.huawei.hms.api;

import android.os.Bundle;
import com.huawei.hms.core.aidl.CodecLookup;
import com.huawei.hms.core.aidl.DataBuffer;
import com.huawei.hms.core.aidl.IAIDLCallback;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.MessageCodec;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerApiClient;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes7.dex */
public class IPCTransport implements DatagramTransport {
    private static final String TAG = "IPCTransport";
    private int apiLevel;
    private final IMessageEntity mEntity;
    private final Class<? extends IMessageEntity> mResponseClass;
    private final String mURI;

    public IPCTransport(String str, IMessageEntity iMessageEntity, Class<? extends IMessageEntity> cls) {
        this.mURI = str;
        this.mEntity = iMessageEntity;
        this.mResponseClass = cls;
    }

    public IPCTransport(String str, IMessageEntity iMessageEntity, Class<? extends IMessageEntity> cls, int i10) {
        this.mURI = str;
        this.mEntity = iMessageEntity;
        this.mResponseClass = cls;
        this.apiLevel = i10;
    }

    private int syncCall(ApiClient apiClient, IAIDLCallback iAIDLCallback) {
        if (!(apiClient instanceof InnerApiClient)) {
            if (apiClient instanceof AidlApiClient) {
                AidlApiClient aidlApiClient = (AidlApiClient) apiClient;
                DataBuffer dataBuffer = new DataBuffer(this.mURI, ProtocolNegotiate.getInstance().getVersion());
                dataBuffer.addBody(CodecLookup.find(dataBuffer.getProtocol()).encode(this.mEntity, new Bundle()));
                try {
                    aidlApiClient.getService().asyncCall(dataBuffer, iAIDLCallback);
                    return 0;
                } catch (Exception e10) {
                    HMSLog.e(TAG, "sync call ex:" + e10);
                }
            }
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
        DataBuffer dataBuffer2 = new DataBuffer(this.mURI, ProtocolNegotiate.getInstance().getVersion());
        MessageCodec messageCodecFind = CodecLookup.find(dataBuffer2.getProtocol());
        dataBuffer2.addBody(messageCodecFind.encode(this.mEntity, new Bundle()));
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setAppID(apiClient.getAppID());
        requestHeader.setPackageName(apiClient.getPackageName());
        requestHeader.setSdkVersion(60800300);
        requestHeader.setApiNameList(((AidlApiClient) apiClient).getApiNameList());
        requestHeader.setSessionId(apiClient.getSessionId());
        requestHeader.setApiLevel(this.apiLevel);
        dataBuffer2.header = messageCodecFind.encode(requestHeader, new Bundle());
        try {
            AidlApiClient aidlApiClient2 = (AidlApiClient) apiClient;
            if (aidlApiClient2.getService() == null) {
                HMSLog.e(TAG, "HuaweiApiClient is not binded to service yet.");
                return CommonCode.ErrorCode.INTERNAL_ERROR;
            }
            aidlApiClient2.getService().asyncCall(dataBuffer2, iAIDLCallback);
            return 0;
        } catch (Exception e11) {
            HMSLog.e(TAG, "sync call ex:" + e11);
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void post(ApiClient apiClient, DatagramTransport.a aVar) {
        send(apiClient, aVar);
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void send(ApiClient apiClient, DatagramTransport.a aVar) {
        int iSyncCall = syncCall(apiClient, new IPCCallback(this.mResponseClass, aVar));
        if (iSyncCall != 0) {
            aVar.a(iSyncCall, null);
        }
    }
}
