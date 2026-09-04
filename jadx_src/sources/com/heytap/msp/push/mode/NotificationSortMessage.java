package com.heytap.msp.push.mode;

/* JADX INFO: loaded from: classes7.dex */
public class NotificationSortMessage implements Comparable<NotificationSortMessage> {
    private int autoDelete;
    private String group;
    private int importantLevel;
    private boolean isMcs;
    private String messageId;
    private int notifyId;
    private long postTime;
    private String statisticData;

    public NotificationSortMessage(String str, int i10, int i11, boolean z10, long j10, int i12, String str2) {
        this(str, i10, i11, z10, j10, str2);
        this.notifyId = i12;
    }

    public NotificationSortMessage(String str, int i10, int i11, boolean z10, long j10, String str2) {
        this.messageId = str;
        this.importantLevel = i10;
        this.autoDelete = i11;
        this.isMcs = z10;
        this.postTime = j10;
        this.statisticData = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(NotificationSortMessage notificationSortMessage) {
        if (notificationSortMessage.getPostTime() < this.postTime) {
            return 1;
        }
        return notificationSortMessage.getPostTime() == this.postTime ? 0 : -1;
    }

    public int getAutoDelete() {
        return this.autoDelete;
    }

    public String getGroup() {
        return this.group;
    }

    public int getImportantLevel() {
        return this.importantLevel;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getNotifyId() {
        return this.notifyId;
    }

    public long getPostTime() {
        return this.postTime;
    }

    public String getStatisticData() {
        return this.statisticData;
    }

    public boolean isMcs() {
        return this.isMcs;
    }

    public void setGroup(String str) {
        this.group = str;
    }
}
