package b5;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f30396f;

    public c(String str) {
        this.f30396f = str;
    }

    @Override // b5.b
    public void a() throws Exception {
        this.f30393a = (byte) 1;
        byte[] bytes = this.f30396f.getBytes("UTF-8");
        this.f30395c = bytes;
        this.f30394b = (byte) bytes.length;
    }
}
