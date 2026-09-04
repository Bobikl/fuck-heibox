package com.tencent.qimei.strategy.terminal;

/* JADX INFO: loaded from: classes4.dex */
public interface ITerminalStrategy {
    ITerminalStrategy enableAndroidId(boolean z10);

    ITerminalStrategy enableAudit(boolean z10);

    ITerminalStrategy enableBuildModel(boolean z10);

    ITerminalStrategy enableCid(boolean z10);

    ITerminalStrategy enableIMEI(boolean z10);

    ITerminalStrategy enableIMSI(boolean z10);

    ITerminalStrategy enableMAC(boolean z10);

    ITerminalStrategy enableOAID(boolean z10);

    ITerminalStrategy enableProcessInfo(boolean z10);

    ITerminalStrategy setAndroidId(String str);

    ITerminalStrategy setBuildModel(String str);

    ITerminalStrategy setCid(String str);

    ITerminalStrategy setIMEI(String str);

    ITerminalStrategy setIMSI(String str);

    ITerminalStrategy setMAC(String str);

    ITerminalStrategy setOAID(String str);

    ITerminalStrategy setReportDomain(String str);
}
