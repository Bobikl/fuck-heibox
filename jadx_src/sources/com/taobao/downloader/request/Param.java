package com.taobao.downloader.request;

/* JADX INFO: loaded from: classes4.dex */
public class Param {
    public static final int TYPE_AUTO = 0;
    public static final int TYPE_DM = 1;
    public static final int TYPE_HUC = 2;
    public static final int TYPE_TNET = 3;
    public String bizId;
    public String description;
    public int downloadStrategy;
    public String fileStorePath;
    public boolean foreground;
    public boolean notificationUI;
    public int notificationVisibility;
    public String title;
    public int priority = 10;
    public int network = 7;
    public int callbackCondition = 1;
    public int callbackType = 1;
    public boolean askIfNetLimit = false;
    public int retryTimes = 3;
    public boolean useCache = true;
    public String from = "";

    public String toString() {
        return "Param{priority=" + this.priority + ", network=" + this.network + ", callbackCondition=" + this.callbackCondition + ", callbackType=" + this.callbackType + ", fileStorePath='" + this.fileStorePath + "'}";
    }
}
