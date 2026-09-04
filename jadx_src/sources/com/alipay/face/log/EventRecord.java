package com.alipay.face.log;

import androidx.core.app.o0;
import com.alipay.face.b;
import com.umeng.analytics.pro.ak;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class EventRecord extends RecordBase {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    public EventRecord() {
        setMagic("D-VM");
        setLogTime(this.simpleDateFormat.format(new Date()));
        setClientId(b.f38552f);
        setClientVersion(b.f38551e);
        setLogVersion("2");
        setActionId(o0.I0);
        setBizType("FinTechFaceVerify");
        setLogType(ak.aF);
        setAppId(b.f38553g);
    }
}
