package com.taobao.accs.internal;

import androidx.annotation.Keep;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.data.Message;
import com.taobao.accs.net.k;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public class c implements com.taobao.accs.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.taobao.accs.net.a f98290a;

    public c(String str) {
        this.f98290a = new k(GlobalClientInfo.f98171a, 1, str);
    }

    @Override // com.taobao.accs.c
    public void a() {
        this.f98290a.a();
    }

    @Override // com.taobao.accs.c
    public void a(AccsClientConfig accsClientConfig) {
        com.taobao.accs.net.a aVar = this.f98290a;
        if (aVar instanceof k) {
            ((k) aVar).a(accsClientConfig);
        }
    }

    @Override // com.taobao.accs.c
    public void a(AccsConnectStateListener accsConnectStateListener) {
        this.f98290a.a(accsConnectStateListener);
    }

    @Override // com.taobao.accs.c
    public void a(Message message, int i10) {
        this.f98290a.b(message, i10);
    }

    @Override // com.taobao.accs.c
    public void a(Message message, boolean z10) {
        this.f98290a.b(message, z10);
    }

    @Override // com.taobao.accs.c
    public void a(boolean z10, boolean z11) {
        this.f98290a.a(z10, z11);
    }

    @Override // com.taobao.accs.c
    public boolean a(String str) {
        return this.f98290a.a(str);
    }

    @Override // com.taobao.accs.c
    public boolean a(String str, String str2) {
        return this.f98290a.j().b(str, str2);
    }

    @Override // com.taobao.accs.c
    public String b(String str) {
        return this.f98290a.b(str);
    }

    @Override // com.taobao.accs.c
    public void b() {
        this.f98290a.k();
    }

    @Override // com.taobao.accs.c
    public void b(AccsConnectStateListener accsConnectStateListener) {
        this.f98290a.b(accsConnectStateListener);
    }

    @Override // com.taobao.accs.c
    public String c() {
        return this.f98290a.i();
    }

    @Override // com.taobao.accs.c
    public void c(String str) {
        this.f98290a.f98297a = str;
    }

    @Override // com.taobao.accs.c
    public String d() {
        return this.f98290a.f98305i.getAppSecret();
    }

    @Override // com.taobao.accs.c
    public void d(String str) {
        this.f98290a.f98298b = str;
    }

    @Override // com.taobao.accs.c
    public String e() {
        return this.f98290a.f98305i.getStoreId();
    }

    @Override // com.taobao.accs.c
    public boolean e(String str) {
        return this.f98290a.j().c(str);
    }

    @Override // com.taobao.accs.c
    public boolean f() {
        return this.f98290a.m();
    }

    @Override // com.taobao.accs.c
    public boolean f(String str) {
        return this.f98290a.j().d(str);
    }
}
