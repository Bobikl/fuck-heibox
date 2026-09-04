package com.max.xiaoheihe.okflutter.pigeon;

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
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class IHeyboxContainerLifecycle {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static class ContainerLifecycle {
        public static ChangeQuickRedirect changeQuickRedirect;

        @n0
        private final BinaryMessenger binaryMessenger;
        private final String messageChannelSuffix;

        public ContainerLifecycle(@n0 BinaryMessenger binaryMessenger) {
            this(binaryMessenger, "");
        }

        public ContainerLifecycle(@n0 BinaryMessenger binaryMessenger, @n0 String str) {
            String str2;
            this.binaryMessenger = binaryMessenger;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            this.messageChannelSuffix = str2;
        }

        @n0
        static MessageCodec<Object> getCodec() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47965, new Class[0], MessageCodec.class);
            return patchProxyResultProxy.isSupported ? (MessageCodec) patchProxyResultProxy.result : new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$handleContainerLifecycle$0(VoidResult voidResult, String str, Object obj) {
            if (PatchProxy.proxy(new Object[]{voidResult, str, obj}, null, changeQuickRedirect, true, 47967, new Class[]{VoidResult.class, String.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(obj instanceof List)) {
                voidResult.error(IHeyboxContainerLifecycle.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), (String) list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public void handleContainerLifecycle(@n0 ContainerLifecycleState containerLifecycleState, @n0 final VoidResult voidResult) {
            if (PatchProxy.proxy(new Object[]{containerLifecycleState, voidResult}, this, changeQuickRedirect, false, 47966, new Class[]{ContainerLifecycleState.class, VoidResult.class}, Void.TYPE).isSupported) {
                return;
            }
            final String str = "dev.flutter.pigeon.heybox_okflutter.ContainerLifecycle.handleContainerLifecycle" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(new ArrayList(Collections.singletonList(Integer.valueOf(containerLifecycleState.index))), new BasicMessageChannel.Reply() { // from class: com.max.xiaoheihe.okflutter.pigeon.a
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    IHeyboxContainerLifecycle.ContainerLifecycle.lambda$handleContainerLifecycle$0(voidResult, str, obj);
                }
            });
        }
    }

    public enum ContainerLifecycleState {
        SHOWN(0),
        HIDDEN(1),
        DESTROY(2);

        public static ChangeQuickRedirect changeQuickRedirect;
        final int index;

        ContainerLifecycleState(int i10) {
            this.index = i10;
        }

        public static ContainerLifecycleState valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47969, new Class[]{String.class}, ContainerLifecycleState.class);
            return patchProxyResultProxy.isSupported ? (ContainerLifecycleState) patchProxyResultProxy.result : (ContainerLifecycleState) Enum.valueOf(ContainerLifecycleState.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ContainerLifecycleState[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47968, new Class[0], ContainerLifecycleState[].class);
            return patchProxyResultProxy.isSupported ? (ContainerLifecycleState[]) patchProxyResultProxy.result : (ContainerLifecycleState[]) values().clone();
        }
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
    public static FlutterError createConnectionError(@n0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47964, new Class[]{String.class}, FlutterError.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterError) patchProxyResultProxy.result;
        }
        return new FlutterError("channel-error", "Unable to establish connection on channel: " + str + ".", "");
    }
}
