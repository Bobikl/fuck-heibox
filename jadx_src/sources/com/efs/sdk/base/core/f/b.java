package com.efs.sdk.base.core.f;

import com.efs.sdk.base.core.config.GlobalInfo;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.protocol.record.AbsRecordLog;
import com.huawei.hms.framework.common.ContainerUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends AbsRecordLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f42538d;

    public b(String str, String str2, String str3) {
        super("wa");
        this.f42535a = str;
        this.f42536b = str2;
        this.f42538d = str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS", Locale.CHINA);
        com.efs.sdk.base.core.a.a.a();
        this.f42537c = simpleDateFormat.format(new Date(com.efs.sdk.base.core.a.a.b()));
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final byte[] generate() {
        String strGenerateString = generateString();
        if (ControllerCenter.getGlobalEnvStruct().isPrintLogDetail()) {
            Log.i("efs.base", strGenerateString);
        }
        return strGenerateString.getBytes();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String generateString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lt=event`");
        sb2.append("ev_ct=");
        sb2.append(this.f42535a);
        sb2.append("`");
        sb2.append("ev_ac=");
        sb2.append(this.f42536b);
        sb2.append("`");
        sb2.append("tm=");
        sb2.append(this.f42537c);
        sb2.append("`");
        sb2.append("dn=");
        sb2.append(this.f42538d);
        sb2.append("`");
        for (Map.Entry<String, Object> entry : this.dataMap.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(entry.getValue());
            sb2.append("`");
        }
        return sb2.subSequence(0, sb2.length() - 1).toString();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String getLinkId() {
        return "";
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String getLinkKey() {
        return "";
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final void insertGlobal(GlobalInfo globalInfo) {
        this.dataMap.putAll(globalInfo.getGlobalInfoMap());
        this.dataMap.putAll(ControllerCenter.getGlobalEnvStruct().getPublicParamMap());
    }
}
