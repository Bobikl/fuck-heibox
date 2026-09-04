package anet.channel.statist;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class CountObject {
    public String arg;
    public String module;
    public String modulePoint;
    public double value;

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("[module:");
        sb2.append(this.module);
        sb2.append(" modulePoint:");
        sb2.append(this.modulePoint);
        sb2.append(" arg:");
        sb2.append(this.arg);
        sb2.append(" value:");
        sb2.append(this.value);
        sb2.append("]");
        return sb2.toString();
    }
}
