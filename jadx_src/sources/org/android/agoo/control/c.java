package org.android.agoo.control;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import org.android.agoo.common.MsgDO;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AgooFactory f132828a;

    c(AgooFactory agooFactory) {
        this.f132828a = agooFactory;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList<MsgDO> arrayListB = this.f132828a.messageService.b();
        if (arrayListB == null || arrayListB.size() <= 0) {
            return;
        }
        ALog.e("AgooFactory", "reportCacheMsg", UiKitSpanObj.TYPE_SIZE, Integer.valueOf(arrayListB.size()));
        for (MsgDO msgDO : arrayListB) {
            if (msgDO != null) {
                msgDO.isFromCache = true;
                this.f132828a.notifyManager.report(msgDO, null);
            }
        }
    }
}
