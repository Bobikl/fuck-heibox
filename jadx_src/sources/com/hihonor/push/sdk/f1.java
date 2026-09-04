package com.hihonor.push.sdk;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.entity.RequestHeader;
import com.hihonor.push.sdk.common.data.ApiException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f1<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n0<TResult> f60027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IMessageEntity f60029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f60030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RequestHeader f60031e;

    public f1(String str, IMessageEntity iMessageEntity) {
        this.f60028b = str;
        this.f60029c = iMessageEntity;
        this.f60030d = w.a(str);
    }

    public abstract void a(ApiException apiException, Object obj);

    public final void b(ApiException apiException, Object obj) {
        if (this.f60027a != null) {
            a(apiException, obj);
        }
    }
}
