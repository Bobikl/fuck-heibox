package com.tencent.beacon.event.c;

import android.text.TextUtils;
import androidx.annotation.p0;
import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.event.open.BeaconEvent;
import java.util.Map;

/* JADX INFO: compiled from: EventBeanParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    @p0
    public static EventBean a(BeaconEvent beaconEvent) {
        Map<String, String> mapA = com.tencent.beacon.base.net.c.d.a(beaconEvent.getCode(), beaconEvent.getParams());
        if (mapA == null) {
            return null;
        }
        EventBean eventBean = new EventBean();
        String code = beaconEvent.getCode();
        eventBean.setEventCode(code);
        eventBean.setAppKey(beaconEvent.getAppKey());
        eventBean.setApn(com.tencent.beacon.base.net.c.d.c());
        eventBean.setSrcIp(com.tencent.beacon.a.c.c.d().b());
        eventBean.setEventCode(code);
        eventBean.setValueType(0);
        eventBean.setEventValue(mapA);
        String str = beaconEvent.getParams().get("A34");
        if (!TextUtils.isEmpty(str)) {
            eventBean.setEventTime(Long.parseLong(str));
        }
        eventBean.setEventResult(beaconEvent.isSucceed());
        eventBean.setEventType(d.a(beaconEvent.getType()));
        eventBean.setReserved("");
        return eventBean;
    }
}
