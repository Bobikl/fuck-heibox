package anetwork.channel.entity;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a implements s3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30202b;

    public a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f30201a = str;
        this.f30202b = str2;
    }

    @Override // s3.a
    public String getName() {
        return this.f30201a;
    }

    @Override // s3.a
    public String getValue() {
        return this.f30202b;
    }
}
