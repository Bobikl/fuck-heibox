package anet.channel.statist;

import anet.channel.util.ErrorConstant;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
@Monitor(module = "networkPrefer", monitorPoint = "NetworkError")
public class ExceptionStatistic extends StatObject {

    @Dimension
    public String bizId;

    @Dimension
    public String errorMsg;

    @Dimension
    public String exceptionStack;

    @Dimension
    public String exceptionType;

    @Dimension
    public String host;

    @Dimension
    public String ip;

    @Dimension
    public boolean isDNS;

    @Dimension
    public boolean isProxy;

    @Dimension
    public boolean isSSL;

    @Dimension
    public String netType;

    @Dimension
    public int port;

    @Dimension
    public String protocolType;

    @Dimension
    public String proxyType;

    @Dimension
    public int resultCode;

    @Dimension
    public String url;

    public ExceptionStatistic() {
    }

    public ExceptionStatistic(int i10, String str, RequestStatistic requestStatistic, Throwable th2) {
        this.exceptionType = "nw";
        this.resultCode = i10;
        this.errorMsg = str == null ? ErrorConstant.getErrMsg(i10) : str;
        this.exceptionStack = th2 != null ? th2.toString() : "";
        if (requestStatistic != null) {
            this.host = requestStatistic.host;
            this.ip = requestStatistic.ip;
            this.port = requestStatistic.port;
            this.isSSL = requestStatistic.isSSL;
            this.isProxy = requestStatistic.isProxy;
            this.proxyType = String.valueOf(requestStatistic.proxyType);
            this.netType = requestStatistic.netType;
            this.isDNS = requestStatistic.isDNS;
            this.protocolType = String.valueOf(requestStatistic.protocolType);
            this.bizId = requestStatistic.bizId;
        }
    }

    public ExceptionStatistic(int i10, String str, String str2) {
        this.resultCode = i10;
        this.errorMsg = str == null ? ErrorConstant.getErrMsg(i10) : str;
        this.exceptionType = str2;
    }
}
