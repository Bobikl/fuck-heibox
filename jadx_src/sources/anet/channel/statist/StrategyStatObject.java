package anet.channel.statist;

import anet.channel.GlobalAppRuntimeInfo;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
@Monitor(module = "networkPrefer", monitorPoint = "strategy_stat")
public class StrategyStatObject extends StatObject {

    @Dimension
    public StringBuilder errorTrace;

    @Dimension
    public int isFileExists;

    @Dimension
    public int isReadObjectSucceed;

    @Dimension
    public int isRenameSucceed;

    @Dimension
    public int isSucceed;

    @Dimension
    public int isTempWriteSucceed;

    @Measure
    public long readCostTime;

    @Dimension
    public String readStrategyFileId;

    @Dimension
    public String readStrategyFilePath;

    @Dimension
    public int type;

    @Measure
    public long writeCostTime;

    @Dimension
    public String writeStrategyFileId;

    @Dimension
    public String writeStrategyFilePath;

    @Dimension
    public String writeTempFilePath;

    public StrategyStatObject(int i10) {
        this.type = i10;
    }

    public void appendErrorTrace(String str, Throwable th2) {
        String message = th2.getMessage();
        if (this.errorTrace == null) {
            this.errorTrace = new StringBuilder();
        }
        StringBuilder sb2 = this.errorTrace;
        sb2.append('[');
        sb2.append(str);
        sb2.append(']');
        sb2.append(str);
        sb2.append(' ');
        sb2.append(message);
        sb2.append('\n');
    }

    @Override // anet.channel.statist.StatObject
    public boolean beforeCommit() {
        return GlobalAppRuntimeInfo.isTargetProcess();
    }
}
