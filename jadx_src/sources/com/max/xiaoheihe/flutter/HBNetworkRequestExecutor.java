package com.max.xiaoheihe.flutter;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.o;
import com.google.gson.JsonElement;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.network.CoroutineServiceGenerator;
import com.max.xiaoheihe.okflutter.executors.NetworkRequestExecutor;
import com.max.xiaoheihe.okflutter.pigeon.IHybridNetwork;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import dl.e;
import io.reactivex.z;
import java.util.Map;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import lb.a;
import yh.p;

/* JADX INFO: compiled from: HBNetworkRequestExecutor.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class HBNetworkRequestExecutor implements NetworkRequestExecutor {
    public static final int $stable = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final long timeout = 60000;

    /* JADX INFO: renamed from: com.max.xiaoheihe.flutter.HBNetworkRequestExecutor$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: HBNetworkRequestExecutor.kt */
    @d(c = "com.max.xiaoheihe.flutter.HBNetworkRequestExecutor$execute$1", f = "HBNetworkRequestExecutor.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Map<String, Object> $forms;
        final /* synthetic */ Map<String, Object> $headers;
        final /* synthetic */ boolean $needEncrypt;
        final /* synthetic */ Map<String, Object> $params;
        final /* synthetic */ IHybridNetwork.Result<IHybridNetwork.HybridResponse> $result;
        final /* synthetic */ boolean $showToast;
        final /* synthetic */ IHybridNetwork.RequestType $type;
        final /* synthetic */ String $url;
        final /* synthetic */ boolean $useHeyboxHost;
        int label;

        /* JADX INFO: renamed from: com.max.xiaoheihe.flutter.HBNetworkRequestExecutor$execute$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: HBNetworkRequestExecutor.kt */
        @d(c = "com.max.xiaoheihe.flutter.HBNetworkRequestExecutor$execute$1$1", f = "HBNetworkRequestExecutor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06281 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ Map<String, Object> $forms;
            final /* synthetic */ Map<String, Object> $headers;
            final /* synthetic */ boolean $needEncrypt;
            final /* synthetic */ Map<String, Object> $params;
            final /* synthetic */ IHybridNetwork.Result<IHybridNetwork.HybridResponse> $result;
            final /* synthetic */ boolean $showToast;
            final /* synthetic */ IHybridNetwork.RequestType $type;
            final /* synthetic */ String $url;
            final /* synthetic */ boolean $useHeyboxHost;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06281(String str, boolean z10, Map<String, Object> map, Map<String, Object> map2, IHybridNetwork.RequestType requestType, boolean z11, Map<String, Object> map3, IHybridNetwork.Result<IHybridNetwork.HybridResponse> result, boolean z12, c<? super C06281> cVar) {
                super(2, cVar);
                this.$url = str;
                this.$needEncrypt = z10;
                this.$forms = map;
                this.$params = map2;
                this.$type = requestType;
                this.$useHeyboxHost = z11;
                this.$headers = map3;
                this.$result = result;
                this.$showToast = z12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 22009, new Class[]{Object.class, c.class}, c.class);
                return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new C06281(this.$url, this.$needEncrypt, this.$forms, this.$params, this.$type, this.$useHeyboxHost, this.$headers, this.$result, this.$showToast, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22011, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22010, new Class[]{q0.class, c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C06281) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                z<Result<JsonElement>> zVarB7;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22008, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                b.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
                if (this.$url.length() > 0) {
                    if (this.$needEncrypt) {
                        PostEncryptParamsObj postEncryptParamsObjV0 = com.max.xiaoheihe.utils.d.v0(k.p(this.$forms), true);
                        this.$forms.clear();
                        Map<String, Object> map = this.$forms;
                        String data = postEncryptParamsObjV0.getData();
                        f0.o(data, "paramsObj.data");
                        map.put("data", data);
                        Map<String, Object> map2 = this.$forms;
                        String key = postEncryptParamsObjV0.getKey();
                        f0.o(key, "paramsObj.key");
                        map2.put("key", key);
                        Map<String, Object> map3 = this.$forms;
                        String sid = postEncryptParamsObjV0.getSid();
                        f0.o(sid, "paramsObj.sid");
                        map3.put("sid", sid);
                        Map<String, Object> map4 = this.$params;
                        String time = postEncryptParamsObjV0.getTime();
                        f0.o(time, "paramsObj.time");
                        map4.put("time_", time);
                    }
                    Uri uri = Uri.parse(this.$url);
                    if (f0.g(uri.getScheme(), "https") && a.c(uri.getHost())) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("https://");
                        sb2.append(uri.getHost());
                        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
                        String path = uri.getPath();
                        sb2.append(path != null ? StringsKt__StringsKt.d4(path, "/") : null);
                        String string = sb2.toString();
                        com.sankuai.waimai.router.core.c.a("HBNetworkRequestExecutor, Request, requestUrl = " + string + ", params = " + this.$params, new Object[0]);
                        final IHybridNetwork.HybridResponse.Builder builder = new IHybridNetwork.HybridResponse.Builder();
                        IHybridNetwork.RequestType requestType = this.$type;
                        IHybridNetwork.RequestType requestType2 = IHybridNetwork.RequestType.GET;
                        if (requestType == requestType2) {
                            builder.setRequestType(requestType2);
                            if (this.$useHeyboxHost) {
                                com.max.xiaoheihe.network.b bVarA = CoroutineServiceGenerator.f94823a.a();
                                String path2 = uri.getPath();
                                zVarB7 = bVarA.Ja(path2 != null ? StringsKt__StringsKt.d4(path2, "/") : null, this.$params, this.$headers);
                            } else {
                                zVarB7 = CoroutineServiceGenerator.f94823a.a().Q4(string, this.$params, this.$headers);
                            }
                            f0.o(zVarB7, "{\n                      …                        }");
                        } else {
                            builder.setRequestType(IHybridNetwork.RequestType.POST);
                            if (this.$useHeyboxHost) {
                                com.max.xiaoheihe.network.b bVarA2 = CoroutineServiceGenerator.f94823a.a();
                                String path3 = uri.getPath();
                                zVarB7 = bVarA2.b7(path3 != null ? StringsKt__StringsKt.d4(path3, "/") : null, this.$params, this.$forms, this.$headers);
                            } else {
                                zVarB7 = CoroutineServiceGenerator.f94823a.a().Z3(string, this.$params, this.$forms, this.$headers);
                            }
                            f0.o(zVarB7, "{\n                      …                        }");
                        }
                        z<Result<JsonElement>> zVarA4 = zVarB7.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c());
                        final IHybridNetwork.Result<IHybridNetwork.HybridResponse> result = this.$result;
                        final boolean z10 = this.$showToast;
                    } else {
                        IHybridNetwork.HybridResponse.Builder status = new IHybridNetwork.HybridResponse.Builder().setRequestType(this.$type).setResponseType(IHybridNetwork.ResponseType.DATA).setStatus(IHybridNetwork.ResponseStatus.FAILED);
                        f0.o(status, "Builder()\n              …rk.ResponseStatus.FAILED)");
                        IHybridNetwork.Result<IHybridNetwork.HybridResponse> result2 = this.$result;
                        if (result2 != null) {
                            result2.success(status.build());
                        }
                    }
                } else {
                    IHybridNetwork.HybridResponse.Builder status2 = new IHybridNetwork.HybridResponse.Builder().setRequestType(this.$type).setResponseType(IHybridNetwork.ResponseType.DATA).setStatus(IHybridNetwork.ResponseStatus.FAILED);
                    f0.o(status2, "Builder()\n              …rk.ResponseStatus.FAILED)");
                    IHybridNetwork.Result<IHybridNetwork.HybridResponse> result3 = this.$result;
                    if (result3 != null) {
                        result3.success(status2.build());
                    }
                }
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, boolean z10, Map<String, Object> map, Map<String, Object> map2, IHybridNetwork.RequestType requestType, boolean z11, Map<String, Object> map3, IHybridNetwork.Result<IHybridNetwork.HybridResponse> result, boolean z12, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$url = str;
            this.$needEncrypt = z10;
            this.$forms = map;
            this.$params = map2;
            this.$type = requestType;
            this.$useHeyboxHost = z11;
            this.$headers = map3;
            this.$result = result;
            this.$showToast = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 22005, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : HBNetworkRequestExecutor.this.new AnonymousClass1(this.$url, this.$needEncrypt, this.$forms, this.$params, this.$type, this.$useHeyboxHost, this.$headers, this.$result, this.$showToast, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22007, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22006, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22004, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                long j10 = HBNetworkRequestExecutor.this.timeout;
                C06281 c06281 = new C06281(this.$url, this.$needEncrypt, this.$forms, this.$params, this.$type, this.$useHeyboxHost, this.$headers, this.$result, this.$showToast, null);
                this.label = 1;
                if (TimeoutKt.c(j10, c06281, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    @Override // com.max.xiaoheihe.okflutter.executors.NetworkRequestExecutor
    public void execute(@dl.d Context context, @dl.d IHybridNetwork.RequestType type, @dl.d String url, @dl.d Map<String, Object> params, @dl.d Map<String, Object> forms, @dl.d Map<String, Object> headers, boolean z10, boolean z11, boolean z12, @e IHybridNetwork.Result<IHybridNetwork.HybridResponse> result) {
        Object[] objArr = {context, type, url, params, forms, headers, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), result};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22003, new Class[]{Context.class, IHybridNetwork.RequestType.class, String.class, Map.class, Map.class, Map.class, cls, cls, cls, IHybridNetwork.Result.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(type, "type");
        f0.p(url, "url");
        f0.p(params, "params");
        f0.p(forms, "forms");
        f0.p(headers, "headers");
        com.sankuai.waimai.router.core.c.a("HBNetworkRequestExecutor, execute, url = " + url + ", params = " + params, new Object[0]);
        kotlinx.coroutines.k.f(r0.a(e1.c()), null, null, new AnonymousClass1(url, z12, forms, params, type, z11, headers, result, z10, null), 3, null);
    }
}
