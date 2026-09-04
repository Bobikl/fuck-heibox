package com.alipay.deviceid.module.rpc.report.open;

import com.alipay.deviceid.module.rpc.report.open.model.ReportRequest;
import com.alipay.deviceid.module.rpc.report.open.model.ReportResult;
import com.alipay.deviceid.module.x.ao;

/* JADX INFO: loaded from: classes6.dex */
public interface OpenReportService {
    @ao(a = "alipay.security.device.data.report.open")
    ReportResult reportData(ReportRequest reportRequest);
}
