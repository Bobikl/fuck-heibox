package com.taobao.aranger.intf;

import androidx.annotation.Keep;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface IRemoteService extends IService {
    void connect() throws Exception;

    boolean isRemote();

    Reply sendCall(Call call) throws Exception;
}
