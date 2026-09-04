package com.tencent.msdk.dns.base.report;

import com.tencent.msdk.dns.base.report.IReporter.a;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface IReporter<InitParameters extends a> {

    public interface a {
    }

    boolean canReport();

    String getName();

    boolean init(InitParameters initparameters);

    boolean report(int i10, String str, Map<String, String> map);

    boolean setDebug(boolean z10);
}
