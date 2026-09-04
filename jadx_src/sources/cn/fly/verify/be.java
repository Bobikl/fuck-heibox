package cn.fly.verify;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class be implements bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicBoolean f35827a = new AtomicBoolean();

    @Override // cn.fly.verify.bd
    public String a() {
        c();
        return FlyVerify.sdkTag;
    }

    @Override // cn.fly.verify.bd
    public int b() {
        return FlyVerify.SDK_VERSION_CODE;
    }

    public void c() {
        as.a(new ar() { // from class: cn.fly.verify.be.1
            @Override // cn.fly.verify.ar
            public void a() {
                if (ax.h() || !be.f35827a.compareAndSet(false, true)) {
                    return;
                }
                n.a(true);
            }
        });
    }
}
