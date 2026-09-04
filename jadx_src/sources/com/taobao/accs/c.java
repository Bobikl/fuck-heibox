package com.taobao.accs;

import androidx.annotation.Keep;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.data.Message;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public interface c {
    @Keep
    void a();

    @Keep
    void a(AccsClientConfig accsClientConfig);

    @Keep
    void a(AccsConnectStateListener accsConnectStateListener);

    @Keep
    void a(Message message, int i10);

    @Keep
    void a(Message message, boolean z10);

    @Keep
    void a(boolean z10, boolean z11);

    @Keep
    boolean a(String str);

    @Keep
    boolean a(String str, String str2);

    @Keep
    String b(String str);

    @Keep
    void b();

    @Keep
    void b(AccsConnectStateListener accsConnectStateListener);

    @Keep
    String c();

    @Keep
    void c(String str);

    @Keep
    String d();

    @Keep
    void d(String str);

    @Keep
    String e();

    @Keep
    boolean e(String str);

    @Keep
    boolean f();

    @Keep
    boolean f(String str);
}
