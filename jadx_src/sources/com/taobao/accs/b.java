package com.taobao.accs;

import android.content.Context;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public interface b {
    String a(Context context, ACCSManager.AccsRequest accsRequest);

    String a(Context context, ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo);

    String a(Context context, ACCSManager.AccsRequest accsRequest, String str, boolean z10);

    String a(Context context, String str, String str2, byte[] bArr, String str3);

    String a(Context context, String str, String str2, byte[] bArr, String str3, String str4);

    String a(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url);

    void a(Context context);

    @Deprecated
    void a(Context context, int i10);

    void a(Context context, ILoginInfo iLoginInfo);

    void a(Context context, String str);

    void a(Context context, String str, int i10);

    void a(Context context, String str, AccsAbstractDataListener accsAbstractDataListener);

    void a(Context context, String str, String str2);

    void a(Context context, String str, String str2, IAppReceiver iAppReceiver);

    void a(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver);

    void a(Context context, String str, boolean z10);

    void a(AccsClientConfig accsClientConfig);

    void a(AccsConnectStateListener accsConnectStateListener);

    void a(String str, String str2, String str3, short s10, String str4, Map<Integer, String> map);

    boolean a();

    boolean a(int i10);

    boolean a(String str);

    String b(Context context, ACCSManager.AccsRequest accsRequest);

    String b(Context context, String str, String str2, byte[] bArr, String str3, String str4);

    String b(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url);

    Map<String, Boolean> b() throws Exception;

    void b(Context context, String str);

    void b(AccsConnectStateListener accsConnectStateListener);

    boolean b(Context context);

    Map<String, Boolean> c() throws Exception;

    void c(Context context);

    void c(Context context, String str);

    void d(Context context);

    void d(Context context, String str);

    void e(Context context);

    void e(Context context, String str);
}
