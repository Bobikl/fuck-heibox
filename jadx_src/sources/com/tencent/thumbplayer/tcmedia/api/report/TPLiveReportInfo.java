package com.tencent.thumbplayer.tcmedia.api.report;

/* JADX INFO: loaded from: classes4.dex */
public class TPLiveReportInfo extends TPDefaultReportInfo {
    public int adPlayLength;
    public String cdnServer;
    public int contentId;
    public boolean isLookBack;
    public boolean isUserPay;
    public int liveDelay;
    public int liveType;
    public int playTime;
    public int programId;
    public int streamId;

    @Override // com.tencent.thumbplayer.tcmedia.api.report.TPDefaultReportInfo
    public int getPlayType() {
        return 1;
    }
}
