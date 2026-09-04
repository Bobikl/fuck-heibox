package com.efs.sdk.base.core.util.a;

import ad.e;
import androidx.annotation.p0;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements com.efs.sdk.base.core.util.concurrent.c<HttpResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f42563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Map<String, String> f42564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f42565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public File f42566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, String> f42568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42569g = false;

    @Override // com.efs.sdk.base.core.util.concurrent.c
    @p0
    public final /* synthetic */ HttpResponse a() {
        String str = this.f42567e;
        str.hashCode();
        if (str.equals("get")) {
            return HttpEnv.getInstance().getHttpUtil().get(this.f42563a, this.f42564b);
        }
        if (str.equals(e.f1248a)) {
            byte[] bArr = this.f42565c;
            if (bArr == null || bArr.length <= 0) {
                return HttpEnv.getInstance().getHttpUtil().post(this.f42563a, this.f42564b, this.f42566d);
            }
            return this.f42569g ? HttpEnv.getInstance().getHttpUtil().postAsFile(this.f42563a, this.f42564b, this.f42565c) : HttpEnv.getInstance().getHttpUtil().post(this.f42563a, this.f42564b, this.f42565c);
        }
        Log.e("efs.util.http", "request not support method '" + this.f42567e + "'");
        return null;
    }
}
