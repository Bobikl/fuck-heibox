package com.heytap.mcssdk.processor;

import android.app.NotificationManager;
import android.content.Context;
import com.heytap.mcssdk.utils.e;
import com.heytap.mcssdk.utils.h;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: DataMessageProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f59947a = 1;

    /* JADX INFO: compiled from: DataMessageProcessor.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DataMessage f59948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f59949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ IDataMessageCallBackService f59950d;

        a(DataMessage dataMessage, Context context, IDataMessageCallBackService iDataMessageCallBackService) {
            this.f59948b = dataMessage;
            this.f59949c = context;
            this.f59950d = iDataMessageCallBackService;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f59948b.getMsgCommand() == 1) {
                b.this.c(this.f59949c, this.f59948b);
            } else {
                this.f59950d.processMessage(this.f59949c, this.f59948b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, DataMessage dataMessage) {
        if (context == null) {
            e.a("context is null");
            return;
        }
        e.a("Receive revokeMessage  extra : " + dataMessage.getStatisticsExtra() + "notifyId :" + dataMessage.getNotifyID() + "messageId : " + dataMessage.getTaskID());
        ((NotificationManager) context.getSystemService("notification")).cancel(dataMessage.getNotifyID());
        d(context, dataMessage);
    }

    private void d(Context context, DataMessage dataMessage) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(dataMessage);
        map.put(dataMessage.getEventId(), arrayList);
        StatisticUtils.statisticEvent(context, map);
    }

    @Override // com.heytap.mcssdk.processor.c
    public void a(Context context, BaseMode baseMode, IDataMessageCallBackService iDataMessageCallBackService) {
        if (baseMode != null && baseMode.getType() == 4103) {
            DataMessage dataMessage = (DataMessage) baseMode;
            if (iDataMessageCallBackService != null) {
                h.b(new a(dataMessage, context, iDataMessageCallBackService));
            }
        }
    }
}
