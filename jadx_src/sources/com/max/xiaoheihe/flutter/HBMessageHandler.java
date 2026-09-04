package com.max.xiaoheihe.flutter;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.hbcache.b;
import com.max.hbexpression.RecentEmojiManger;
import com.max.heybox.hblog.g;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.okflutter.executors.MessageHandler;
import com.max.xiaoheihe.okflutter.pigeon.IHybridMessage;
import com.max.xiaoheihe.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import io.reactivex.android.schedulers.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import oe.t;

/* JADX INFO: compiled from: HBMessageHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class HBMessageHandler implements MessageHandler {
    public static final int $stable = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.max.xiaoheihe.okflutter.executors.MessageHandler
    public void handle(@d final Context context, @e IHybridMessage.HybridMessageInfo hybridMessageInfo, @e final IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult) {
        String name;
        int i10 = 1;
        if (PatchProxy.proxy(new Object[]{context, hybridMessageInfo, nullableResult}, this, changeQuickRedirect, false, 21996, new Class[]{Context.class, IHybridMessage.HybridMessageInfo.class, IHybridMessage.NullableResult.class}, Void.TYPE).isSupported) {
        }
        f0.p(context, "context");
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HBMessageHandler, handle messageInfo: ");
        sb2.append(hybridMessageInfo != null ? hybridMessageInfo.getName() : null);
        aVar.q(sb2.toString());
        if (hybridMessageInfo == null || (name = hybridMessageInfo.getName()) == null) {
            return;
        }
        switch (name.hashCode()) {
            case -1786934010:
                if (name.equals("update_recent_expression")) {
                    RecentEmojiManger recentEmojiManger = RecentEmojiManger.f70167a;
                    Map<String, String> params = hybridMessageInfo.getParams();
                    recentEmojiManger.h(params != null ? params.get("name") : null);
                    break;
                }
                break;
            case -596748885:
                if (name.equals(HBMessageHandlerKt.EMOJI_CONFIG)) {
                    b.a("emoji_config_cache", JsonObject.class).I5(io.reactivex.schedulers.b.d()).a4(a.c()).g(new com.max.hbcommon.network.d<JsonObject>() { // from class: com.max.xiaoheihe.flutter.HBMessageHandler.handle.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.max.hbcommon.network.d, io.reactivex.g0
                        public void onError(@d Throwable e10) {
                            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 21998, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            f0.p(e10, "e");
                            g.f74531b.q("HBMessageHandler, get_emojis_config, onError, " + Log.getStackTraceString(e10));
                            IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult2 = nullableResult;
                            if (nullableResult2 != null) {
                                nullableResult2.success(new IHybridMessage.HybridMessageResponse.Builder().setResult(null).build());
                            }
                        }

                        public void onNext(@d JsonObject config) {
                            if (PatchProxy.proxy(new Object[]{config}, this, changeQuickRedirect, false, 21999, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            f0.p(config, "config");
                            g.f74531b.q("HBMessageHandler, get_emojis_config, onNext, config = " + config);
                            IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult2 = nullableResult;
                            if (nullableResult2 != null) {
                                nullableResult2.success(new IHybridMessage.HybridMessageResponse.Builder().setResult(config.toString()).build());
                            }
                        }

                        @Override // com.max.hbcommon.network.d, io.reactivex.g0
                        public /* bridge */ /* synthetic */ void onNext(Object obj) {
                            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22000, new Class[]{Object.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            onNext((JsonObject) obj);
                        }
                    });
                    break;
                }
                break;
            case 16738785:
                if (name.equals("open_photo_selector")) {
                    Map<String, String> params2 = hybridMessageInfo.getParams();
                    if (params2 != null) {
                        try {
                            String str = params2.get("count");
                            if (str != null) {
                                i10 = Integer.parseInt(str);
                            }
                        } catch (NumberFormatException e10) {
                            if (nullableResult != null) {
                                nullableResult.error(e10);
                                return;
                            }
                            return;
                        }
                    }
                    com.max.mediaselector.e.j(context, i10, new t<LocalMedia>() { // from class: com.max.xiaoheihe.flutter.HBMessageHandler.handle.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // oe.t
                        public void onCancel() {
                        }

                        @Override // oe.t
                        public void onResult(@e ArrayList<LocalMedia> arrayList) {
                            IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult2;
                            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 21997, new Class[]{ArrayList.class}, Void.TYPE).isSupported || (nullableResult2 = nullableResult) == null || arrayList == null) {
                                return;
                            }
                            new com.max.xiaoheihe.module.upload.d(context).m(CollectionsKt___CollectionsKt.n2(arrayList), nullableResult2);
                        }
                    }, true, f0.g(params2 != null ? params2.get("gif") : null, "true"), f0.g(params2 != null ? params2.get("video") : null, "true"), true);
                    break;
                }
                break;
            case 753744467:
                if (name.equals("get_recent_expression") && nullableResult != null) {
                    nullableResult.success(new IHybridMessage.HybridMessageResponse.Builder().setResult(RecentEmojiManger.f70167a.a()).build());
                }
                break;
            case 1637152965:
                if (name.equals(HBMessageHandlerKt.LOTTIE_PATH)) {
                    Map<String, String> params3 = hybridMessageInfo.getParams();
                    String str2 = params3 != null ? params3.get("key") : null;
                    if (str2 == null) {
                        if (nullableResult != null) {
                            nullableResult.error(new Throwable("key is wrong!"));
                        }
                        break;
                    } else {
                        String strP = r.p(str2);
                        if (strP != null) {
                            if ((strP.length() > 0) && new File(strP).exists() && nullableResult != null) {
                                nullableResult.success(new IHybridMessage.HybridMessageResponse.Builder().setResult(strP).build());
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
