package cn.fly.verify;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class fx extends fp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StringBuilder f36616a = new StringBuilder();

    public fx a(String str) {
        this.f36616a.append(str);
        return this;
    }

    @Override // cn.fly.verify.fp
    protected InputStream a() throws Throwable {
        return new ByteArrayInputStream(this.f36616a.toString().getBytes("utf-8"));
    }

    @Override // cn.fly.verify.fp
    protected long b() throws Throwable {
        return this.f36616a.toString().getBytes("utf-8").length;
    }

    public String toString() {
        return this.f36616a.toString();
    }
}
