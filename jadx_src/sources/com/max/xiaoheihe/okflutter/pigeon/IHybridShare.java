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
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class IHybridShare {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface CanIgnoreReturnValue {
    }

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@n0 String str, @p0 String str2, @p0 Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public interface HybridShareApi {

        /* JADX INFO: renamed from: com.max.xiaoheihe.okflutter.pigeon.IHybridShare$HybridShareApi$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            @n0
            public static MessageCodec<Object> a() {
                return HybridShareApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(HybridShareApi hybridShareApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                hybridShareApi.share(HybridShareMedia.valuesCustom()[((Integer) arrayList2.get(0)).intValue()], (HybridShareContent) arrayList2.get(1), new Result<HybridShareResult>() { // from class: com.max.xiaoheihe.okflutter.pigeon.IHybridShare.HybridShareApi.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridShare.Result
                    public void error(Throwable th2) {
                        if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 48043, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        reply.reply(IHybridShare.wrapError(th2));
                    }

                    /* JADX INFO: renamed from: success, reason: avoid collision after fix types in other method */
                    public void success2(HybridShareResult hybridShareResult) {
                        if (PatchProxy.proxy(new Object[]{hybridShareResult}, this, changeQuickRedirect, false, 48042, new Class[]{HybridShareResult.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        arrayList.add(0, hybridShareResult);
                        reply.reply(arrayList);
                    }

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridShare.Result
                    public /* bridge */ /* synthetic */ void success(HybridShareResult hybridShareResult) {
                        if (PatchProxy.proxy(new Object[]{hybridShareResult}, this, changeQuickRedirect, false, 48044, new Class[]{Object.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        success2(hybridShareResult);
                    }
                });
            }

            public static /* synthetic */ void c(HybridShareApi hybridShareApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                hybridShareApi.shareScreenshot((List) arrayList2.get(0), (Map) arrayList2.get(1), new Result<HybridShareResult>() { // from class: com.max.xiaoheihe.okflutter.pigeon.IHybridShare.HybridShareApi.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridShare.Result
                    public void error(Throwable th2) {
                        if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 48046, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        reply.reply(IHybridShare.wrapError(th2));
                    }

                    /* JADX INFO: renamed from: success, reason: avoid collision after fix types in other method */
                    public void success2(HybridShareResult hybridShareResult) {
                        if (PatchProxy.proxy(new Object[]{hybridShareResult}, this, changeQuickRedirect, false, 48045, new Class[]{HybridShareResult.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        arrayList.add(0, hybridShareResult);
                        reply.reply(arrayList);
                    }

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridShare.Result
                    public /* bridge */ /* synthetic */ void success(HybridShareResult hybridShareResult) {
                        if (PatchProxy.proxy(new Object[]{hybridShareResult}, this, changeQuickRedirect, false, 48047, new Class[]{Object.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        success2(hybridShareResult);
                    }
                });
            }

            public static /* synthetic */ void d(HybridShareApi hybridShareApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, hybridShareApi.canShare(HybridShareMedia.valuesCustom()[((Integer) ((ArrayList) obj).get(0)).intValue()]));
                } catch (Throwable th2) {
                    arrayList = IHybridShare.wrapError(th2);
                }
                reply.reply(arrayList);
            }

            public static void e(@n0 BinaryMessenger binaryMessenger, @p0 HybridShareApi hybridShareApi) {
                f(binaryMessenger, "", hybridShareApi);
            }

            public static void f(@n0 BinaryMessenger binaryMessenger, @n0 String str, @p0 final HybridShareApi hybridShareApi) {
                String str2;
                if (str.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "." + str;
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HybridShareApi.share" + str2, a());
                if (hybridShareApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.s
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            IHybridShare.HybridShareApi.CC.b(hybridShareApi, obj, reply);
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HybridShareApi.shareScreenshot" + str2, a());
                if (hybridShareApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.t
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            IHybridShare.HybridShareApi.CC.c(hybridShareApi, obj, reply);
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HybridShareApi.canShare" + str2, a());
                if (hybridShareApi != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.u
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            IHybridShare.HybridShareApi.CC.d(hybridShareApi, obj, reply);
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
            }
        }

        @n0
        Boolean canShare(@n0 HybridShareMedia hybridShareMedia);

        void share(@n0 HybridShareMedia hybridShareMedia, @n0 HybridShareContent hybridShareContent, @n0 Result<HybridShareResult> result);

        void shareScreenshot(@n0 List<byte[]> list, @p0 Map<Object, Object> map, @n0 Result<HybridShareResult> result);
    }

    public static class HybridShareApiCodec extends StandardMessageCodec {
        public static final HybridShareApiCodec INSTANCE = new HybridShareApiCodec();
        public static ChangeQuickRedirect changeQuickRedirect;

        private HybridShareApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, @n0 ByteBuffer byteBuffer) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(b10), byteBuffer}, this, changeQuickRedirect, false, 48048, new Class[]{Byte.TYPE, ByteBuffer.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if (b10 != -128) {
                return b10 != -127 ? super.readValueOfType(b10, byteBuffer) : HybridShareResult.fromList((ArrayList) readValue(byteBuffer));
            }
            return HybridShareContent.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@n0 ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (PatchProxy.proxy(new Object[]{byteArrayOutputStream, obj}, this, changeQuickRedirect, false, 48049, new Class[]{ByteArrayOutputStream.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (obj instanceof HybridShareContent) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((HybridShareContent) obj).toList());
            } else if (!(obj instanceof HybridShareResult)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((HybridShareResult) obj).toList());
            }
        }
    }

    public static final class HybridShareContent {
        public static ChangeQuickRedirect changeQuickRedirect;

        @p0
        private String imageUrl;

        @p0
        private String targetUrl;

        @p0
        private String text;

        @p0
        private String title;

        @n0
        private ShareType type;

        public static final class Builder {
            public static ChangeQuickRedirect changeQuickRedirect;

            @p0
            private String imageUrl;

            @p0
            private String targetUrl;

            @p0
            private String text;

            @p0
            private String title;

            @p0
            private ShareType type;

            @n0
            public HybridShareContent build() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48053, new Class[0], HybridShareContent.class);
                if (patchProxyResultProxy.isSupported) {
                    return (HybridShareContent) patchProxyResultProxy.result;
                }
                HybridShareContent hybridShareContent = new HybridShareContent();
                hybridShareContent.setType(this.type);
                hybridShareContent.setTitle(this.title);
                hybridShareContent.setText(this.text);
                hybridShareContent.setImageUrl(this.imageUrl);
                hybridShareContent.setTargetUrl(this.targetUrl);
                return hybridShareContent;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setImageUrl(@p0 String str) {
                this.imageUrl = str;
                return this;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setTargetUrl(@p0 String str) {
                this.targetUrl = str;
                return this;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setText(@p0 String str) {
                this.text = str;
                return this;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setTitle(@p0 String str) {
                this.title = str;
                return this;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setType(@n0 ShareType shareType) {
                this.type = shareType;
                return this;
            }
        }

        HybridShareContent() {
        }

        @n0
        static HybridShareContent fromList(@n0 ArrayList<Object> arrayList) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, 48052, new Class[]{ArrayList.class}, HybridShareContent.class);
            if (patchProxyResultProxy.isSupported) {
                return (HybridShareContent) patchProxyResultProxy.result;
            }
            HybridShareContent hybridShareContent = new HybridShareContent();
            hybridShareContent.setType(ShareType.valuesCustom()[((Integer) arrayList.get(0)).intValue()]);
            hybridShareContent.setTitle((String) arrayList.get(1));
            hybridShareContent.setText((String) arrayList.get(2));
            hybridShareContent.setImageUrl((String) arrayList.get(3));
            hybridShareContent.setTargetUrl((String) arrayList.get(4));
            return hybridShareContent;
        }

        @p0
        public String getImageUrl() {
            return this.imageUrl;
        }

        @p0
        public String getTargetUrl() {
            return this.targetUrl;
        }

        @p0
        public String getText() {
            return this.text;
        }

        @p0
        public String getTitle() {
            return this.title;
        }

        @n0
        public ShareType getType() {
            return this.type;
        }

        public void setImageUrl(@p0 String str) {
            this.imageUrl = str;
        }

        public void setTargetUrl(@p0 String str) {
            this.targetUrl = str;
        }

        public void setText(@p0 String str) {
            this.text = str;
        }

        public void setTitle(@p0 String str) {
            this.title = str;
        }

        public void setType(@n0 ShareType shareType) {
            if (PatchProxy.proxy(new Object[]{shareType}, this, changeQuickRedirect, false, 48050, new Class[]{ShareType.class}, Void.TYPE).isSupported) {
                return;
            }
            if (shareType == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.type = shareType;
        }

        @n0
        ArrayList<Object> toList() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48051, new Class[0], ArrayList.class);
            if (patchProxyResultProxy.isSupported) {
                return (ArrayList) patchProxyResultProxy.result;
            }
            ArrayList<Object> arrayList = new ArrayList<>(5);
            ShareType shareType = this.type;
            arrayList.add(shareType == null ? null : Integer.valueOf(shareType.index));
            arrayList.add(this.title);
            arrayList.add(this.text);
            arrayList.add(this.imageUrl);
            arrayList.add(this.targetUrl);
            return arrayList;
        }
    }

    public enum HybridShareMedia {
        GENERIC(0),
        SMS(1),
        EMAIL(2),
        SINA(3),
        QZONE(4),
        QQ(5),
        WEIXIN(6),
        WEIXIN_CIRCLE(7),
        WEIXIN_FAVORITE(8),
        WX_WORK(9),
        DOUBAN(10),
        FACEBOOK(11),
        FACEBOOK_MESSAGER(12),
        TWITTER(13),
        YIXIN(14),
        YIXIN_CIRCLE(15),
        INSTAGRAM(16),
        PINTEREST(17),
        EVERNOTE(18),
        POCKET(19),
        LINKEDIN(20),
        FOURSQUARE(21),
        YNOTE(22),
        WHATSAPP(23),
        LINE(24),
        FLICKR(25),
        TUMBLR(26),
        ALIPAY(27),
        KAKAO(28),
        BYTEDANCE(29),
        BYTEDANCE_PUBLISH(30),
        BYTEDANCE_FRIENDS(31),
        DROPBOX(32),
        VKONTAKTE(33),
        DING_TALK(34),
        HONOR(35),
        MORE(36);

        public static ChangeQuickRedirect changeQuickRedirect;
        final int index;

        HybridShareMedia(int i10) {
            this.index = i10;
        }

        public static HybridShareMedia valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48055, new Class[]{String.class}, HybridShareMedia.class);
            return patchProxyResultProxy.isSupported ? (HybridShareMedia) patchProxyResultProxy.result : (HybridShareMedia) Enum.valueOf(HybridShareMedia.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static HybridShareMedia[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48054, new Class[0], HybridShareMedia[].class);
            return patchProxyResultProxy.isSupported ? (HybridShareMedia[]) patchProxyResultProxy.result : (HybridShareMedia[]) values().clone();
        }
    }

    public static final class HybridShareResult {
        public static ChangeQuickRedirect changeQuickRedirect;

        @p0
        private String message;

        @n0
        private Boolean success;

        public static final class Builder {
            public static ChangeQuickRedirect changeQuickRedirect;

            @p0
            private String message;

            @p0
            private Boolean success;

            @n0
            public HybridShareResult build() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48059, new Class[0], HybridShareResult.class);
                if (patchProxyResultProxy.isSupported) {
                    return (HybridShareResult) patchProxyResultProxy.result;
                }
                HybridShareResult hybridShareResult = new HybridShareResult();
                hybridShareResult.setSuccess(this.success);
                hybridShareResult.setMessage(this.message);
                return hybridShareResult;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setMessage(@p0 String str) {
                this.message = str;
                return this;
            }

            @n0
            @CanIgnoreReturnValue
            public Builder setSuccess(@n0 Boolean bool) {
                this.success = bool;
                return this;
            }
        }

        HybridShareResult() {
        }

        @n0
        static HybridShareResult fromList(@n0 ArrayList<Object> arrayList) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, 48058, new Class[]{ArrayList.class}, HybridShareResult.class);
            if (patchProxyResultProxy.isSupported) {
                return (HybridShareResult) patchProxyResultProxy.result;
            }
            HybridShareResult hybridShareResult = new HybridShareResult();
            hybridShareResult.setSuccess((Boolean) arrayList.get(0));
            hybridShareResult.setMessage((String) arrayList.get(1));
            return hybridShareResult;
        }

        @p0
        public String getMessage() {
            return this.message;
        }

        @n0
        public Boolean getSuccess() {
            return this.success;
        }

        public void setMessage(@p0 String str) {
            this.message = str;
        }

        public void setSuccess(@n0 Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 48056, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                return;
            }
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"success\" is null.");
            }
            this.success = bool;
        }

        @n0
        ArrayList<Object> toList() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48057, new Class[0], ArrayList.class);
            if (patchProxyResultProxy.isSupported) {
                return (ArrayList) patchProxyResultProxy.result;
            }
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.success);
            arrayList.add(this.message);
            return arrayList;
        }
    }

    public interface NullableResult<T> {
        void error(@n0 Throwable th2);

        void success(@p0 T t10);
    }

    public interface Result<T> {
        void error(@n0 Throwable th2);

        void success(@n0 T t10);
    }

    public enum ShareType {
        ONLY_TEXT(0),
        ONLY_IMAGE(1),
        CARD(2);

        public static ChangeQuickRedirect changeQuickRedirect;
        final int index;

        ShareType(int i10) {
            this.index = i10;
        }

        public static ShareType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48061, new Class[]{String.class}, ShareType.class);
            return patchProxyResultProxy.isSupported ? (ShareType) patchProxyResultProxy.result : (ShareType) Enum.valueOf(ShareType.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ShareType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48060, new Class[0], ShareType[].class);
            return patchProxyResultProxy.isSupported ? (ShareType[]) patchProxyResultProxy.result : (ShareType[]) values().clone();
        }
    }

    public interface VoidResult {
        void error(@n0 Throwable th2);

        void success();
    }

    @n0
    public static ArrayList<Object> wrapError(@n0 Throwable th2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, null, changeQuickRedirect, true, 48041, new Class[]{Throwable.class}, ArrayList.class);
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
