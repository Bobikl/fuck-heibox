package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a implements IDiffDevOAuth {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f100894c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f100892a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<OAuthListener> f100893b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OAuthListener f100895d = new C0971a();

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.a$a, reason: collision with other inner class name */
    public class C0971a implements OAuthListener {

        /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.a$a$a, reason: collision with other inner class name */
        public class RunnableC0972a implements Runnable {
            RunnableC0972a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(a.this.f100893b);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((OAuthListener) it.next()).onQrcodeScanned();
                }
            }
        }

        C0971a() {
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onAuthFinish(OAuthErrCode oAuthErrCode, String str) {
            Log.d("MicroMsg.SDK.ListenerWrapper", String.format("onAuthFinish, errCode = %s, authCode = %s", oAuthErrCode.toString(), str));
            a.this.f100894c = null;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(a.this.f100893b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OAuthListener) it.next()).onAuthFinish(oAuthErrCode, str);
            }
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onAuthGotQrcode(String str, byte[] bArr) {
            Log.d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = " + str);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(a.this.f100893b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OAuthListener) it.next()).onAuthGotQrcode(str, bArr);
            }
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onQrcodeScanned() {
            Log.d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
            if (a.this.f100892a != null) {
                a.this.f100892a.post(new RunnableC0972a());
            }
        }
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void addListener(OAuthListener oAuthListener) {
        if (this.f100893b.contains(oAuthListener)) {
            return;
        }
        this.f100893b.add(oAuthListener);
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public boolean auth(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        Log.i("MicroMsg.SDK.DiffDevOAuth", "start auth, appId = " + str);
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            Log.d("MicroMsg.SDK.DiffDevOAuth", String.format("auth fail, invalid argument, appId = %s, scope = %s", str, str2));
            return false;
        }
        if (this.f100892a == null) {
            this.f100892a = new Handler(Looper.getMainLooper());
        }
        if (!this.f100893b.contains(oAuthListener)) {
            this.f100893b.add(oAuthListener);
        }
        if (this.f100894c != null) {
            Log.d("MicroMsg.SDK.DiffDevOAuth", "auth, already running, no need to start auth again");
            return true;
        }
        b bVar = new b(str, str2, str3, str4, str5, this.f100895d);
        this.f100894c = bVar;
        bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void detach() {
        Log.i("MicroMsg.SDK.DiffDevOAuth", "detach");
        this.f100893b.clear();
        stopAuth();
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void removeAllListeners() {
        this.f100893b.clear();
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void removeListener(OAuthListener oAuthListener) {
        this.f100893b.remove(oAuthListener);
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public boolean stopAuth() {
        boolean zA;
        Log.i("MicroMsg.SDK.DiffDevOAuth", "stopAuth");
        try {
            b bVar = this.f100894c;
            zA = bVar == null ? true : bVar.a();
        } catch (Exception e10) {
            Log.w("MicroMsg.SDK.DiffDevOAuth", "stopAuth fail, ex = " + e10.getMessage());
            zA = false;
        }
        this.f100894c = null;
        return zA;
    }
}
