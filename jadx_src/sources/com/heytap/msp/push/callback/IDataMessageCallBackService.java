package com.heytap.msp.push.callback;

import android.content.Context;
import com.heytap.msp.push.mode.DataMessage;

/* JADX INFO: loaded from: classes7.dex */
public interface IDataMessageCallBackService {
    void processMessage(Context context, DataMessage dataMessage);
}
