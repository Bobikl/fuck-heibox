package com.max.xiaoheihe.okflutter.pigeon;

import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class IHybridPlatform {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@n0 String str, @p0 String str2, @p0 Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public interface HybridNotificationApi {

        /* JADX INFO: renamed from: com.max.xiaoheihe.okflutter.pigeon.IHybridPlatform$HybridNotificationApi$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            @n0
            public static MessageCodec<Object> a() {
                return new StandardMessageCodec();
            }

            public static /* synthetic */ void b(HybridNotificationApi hybridNotificationApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, hybridNotificationApi.isNotificationEnabled());
                } catch (Throwable th2) {
                    arrayList = IHybridPlatform.wrapError(th2);
                }
                reply.reply(arrayList);
            }

            public static /* synthetic */ void c(HybridNotificationApi hybridNotificationApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                hybridNotificationApi.gotoNotificationSettings(new Result<Boolean>() { // from class: com.max.xiaoheihe.okflutter.pigeon.IHybridPlatform.HybridNotificationApi.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridPlatform.Result
                    public void error(Throwable th2) {
                        if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 48022, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        reply.reply(IHybridPlatform.wrapError(th2));
                    }

                    /* JADX INFO: renamed from: success, reason: avoid collision after fix types in other method */
                    public void success2(Boolean bool) {
                        if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 48021, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        arrayList.add(0, bool);
                        reply.reply(arrayList);
                    }

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridPlatform.Result
                    public /* bridge */ /* synthetic */ void success(Boolean bool) {
                        if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 48023, new Class[]{Object.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        success2(bool);
                    }
                });
            }

            public static void d(@n0 BinaryMessenger binaryMessenger, @p0 HybridNotificationApi hybridNotificationApi) {
                e(binaryMessenger, "", hybridNotificationApi);
            }

            public static void e(@n0 BinaryMessenger binaryMessenger, @n0 String str, @p0 final HybridNotificationApi hybridNotificationApi) {
                String str2;
                if (str.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "." + str;
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HybridNotificationApi.isNotificationEnabled" + str2, a());
                if (hybridNotificationApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.g
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            IHybridPlatform.HybridNotificationApi.CC.b(hybridNotificationApi, obj, reply);
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HybridNotificationApi.gotoNotificationSettings" + str2, a());
                if (hybridNotificationApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.h
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            IHybridPlatform.HybridNotificationApi.CC.c(hybridNotificationApi, obj, reply);
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
            }
        }

        void gotoNotificationSettings(@n0 Result<Boolean> result);

        @n0
        Boolean isNotificationEnabled();
    }

    public interface NullableResult<T> {
        void error(@n0 Throwable th2);

        void success(@p0 T t10);
    }

    public interface Result<T> {
        void error(@n0 Throwable th2);

        void success(@n0 T t10);
    }

    public interface VoidResult {
        void error(@n0 Throwable th2);

        void success();
    }

    @n0
    public static ArrayList<Object> wrapError(@n0 Throwable th2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, null, changeQuickRedirect, true, 48020, new Class[]{Throwable.class}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th2 instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th2;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
        } else {
            arrayList.add(th2.toString());
            arrayList.add(th2.getClass().getSimpleName());
            arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        }
        return arrayList;
    }
}
