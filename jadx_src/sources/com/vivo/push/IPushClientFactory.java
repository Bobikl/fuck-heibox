package com.vivo.push;

import android.content.Intent;
import com.vivo.push.d.z;

/* JADX INFO: loaded from: classes4.dex */
public interface IPushClientFactory {
    z createReceiveTask(o oVar);

    o createReceiverCommand(Intent intent);

    l createTask(o oVar);
}
