package anetwork.channel.entity;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class d implements s3.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30219b;

    public d(String str, String str2) {
        this.f30218a = str;
        this.f30219b = str2;
    }

    @Override // s3.g
    public String getKey() {
        return this.f30218a;
    }

    @Override // s3.g
    public String getValue() {
        return this.f30219b;
    }
}
