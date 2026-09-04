package anet.channel.statist;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class AlarmObject {
    public String arg;
    public String errorCode;
    public String errorMsg;
    public boolean isSuccess;
    public String module;
    public String modulePoint;

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("[module:");
        sb2.append(this.module);
        sb2.append(" modulePoint:");
        sb2.append(this.modulePoint);
        sb2.append(" arg:");
        sb2.append(this.arg);
        sb2.append(" isSuccess:");
        sb2.append(this.isSuccess);
        sb2.append(" errorCode:");
        sb2.append(this.errorCode);
        sb2.append("]");
        return sb2.toString();
    }
}
