package com.huawei.hms.scankit;

import android.os.RemoteException;
import com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator;
import com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate;
import com.huawei.hms.scankit.p.h4;

/* JADX INFO: loaded from: classes7.dex */
public class DecoderCreator extends IRemoteDecoderCreator.Stub {
    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator
    public IRemoteFrameDecoderDelegate newRemoteFrameDecoderDelegate() throws RemoteException {
        return h4.a();
    }
}
