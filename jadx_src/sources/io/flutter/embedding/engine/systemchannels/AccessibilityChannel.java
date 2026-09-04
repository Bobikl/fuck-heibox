package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.view.AccessibilityBridge;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class AccessibilityChannel {
    private static final String TAG = "AccessibilityChannel";

    @n0
    public final BasicMessageChannel<Object> channel;

    @n0
    public final FlutterJNI flutterJNI;

    @p0
    private AccessibilityMessageHandler handler;
    public final BasicMessageChannel.MessageHandler<Object> parsingMessageHandler;

    public interface AccessibilityMessageHandler extends FlutterJNI.AccessibilityDelegate {
        void announce(@n0 String str);

        void onFocus(int i10);

        void onLongPress(int i10);

        void onTap(int i10);

        void onTooltip(@n0 String str);
    }

    public AccessibilityChannel(@n0 DartExecutor dartExecutor, @n0 FlutterJNI flutterJNI) {
        BasicMessageChannel.MessageHandler<Object> messageHandler = new BasicMessageChannel.MessageHandler<Object>() { // from class: io.flutter.embedding.engine.systemchannels.AccessibilityChannel.1
            @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
            public void onMessage(@p0 Object obj, @n0 BasicMessageChannel.Reply<Object> reply) {
                if (AccessibilityChannel.this.handler == null) {
                    reply.reply(null);
                    return;
                }
                HashMap map = (HashMap) obj;
                String str = (String) map.get("type");
                HashMap map2 = (HashMap) map.get("data");
                Log.v(AccessibilityChannel.TAG, "Received " + str + " message.");
                str.hashCode();
                switch (str) {
                    case "tooltip":
                        String str2 = (String) map2.get("message");
                        if (str2 != null) {
                            AccessibilityChannel.this.handler.onTooltip(str2);
                            break;
                        }
                        break;
                    case "announce":
                        String str3 = (String) map2.get("message");
                        if (str3 != null) {
                            AccessibilityChannel.this.handler.announce(str3);
                            break;
                        }
                        break;
                    case "tap":
                        Integer num = (Integer) map.get("nodeId");
                        if (num != null) {
                            AccessibilityChannel.this.handler.onTap(num.intValue());
                            break;
                        }
                        break;
                    case "focus":
                        Integer num2 = (Integer) map.get("nodeId");
                        if (num2 != null) {
                            AccessibilityChannel.this.handler.onFocus(num2.intValue());
                            break;
                        }
                        break;
                    case "longPress":
                        Integer num3 = (Integer) map.get("nodeId");
                        if (num3 != null) {
                            AccessibilityChannel.this.handler.onLongPress(num3.intValue());
                            break;
                        }
                        break;
                }
                reply.reply(null);
            }
        };
        this.parsingMessageHandler = messageHandler;
        BasicMessageChannel<Object> basicMessageChannel = new BasicMessageChannel<>(dartExecutor, "flutter/accessibility", StandardMessageCodec.INSTANCE);
        this.channel = basicMessageChannel;
        basicMessageChannel.setMessageHandler(messageHandler);
        this.flutterJNI = flutterJNI;
    }

    @j1
    public AccessibilityChannel(@n0 BasicMessageChannel<Object> basicMessageChannel, @n0 FlutterJNI flutterJNI) {
        this.parsingMessageHandler = new BasicMessageChannel.MessageHandler<Object>() { // from class: io.flutter.embedding.engine.systemchannels.AccessibilityChannel.1
            @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
            public void onMessage(@p0 Object obj, @n0 BasicMessageChannel.Reply<Object> reply) {
                if (AccessibilityChannel.this.handler == null) {
                    reply.reply(null);
                    return;
                }
                HashMap map = (HashMap) obj;
                String str = (String) map.get("type");
                HashMap map2 = (HashMap) map.get("data");
                Log.v(AccessibilityChannel.TAG, "Received " + str + " message.");
                str.hashCode();
                switch (str) {
                    case "tooltip":
                        String str2 = (String) map2.get("message");
                        if (str2 != null) {
                            AccessibilityChannel.this.handler.onTooltip(str2);
                            break;
                        }
                        break;
                    case "announce":
                        String str3 = (String) map2.get("message");
                        if (str3 != null) {
                            AccessibilityChannel.this.handler.announce(str3);
                            break;
                        }
                        break;
                    case "tap":
                        Integer num = (Integer) map.get("nodeId");
                        if (num != null) {
                            AccessibilityChannel.this.handler.onTap(num.intValue());
                            break;
                        }
                        break;
                    case "focus":
                        Integer num2 = (Integer) map.get("nodeId");
                        if (num2 != null) {
                            AccessibilityChannel.this.handler.onFocus(num2.intValue());
                            break;
                        }
                        break;
                    case "longPress":
                        Integer num3 = (Integer) map.get("nodeId");
                        if (num3 != null) {
                            AccessibilityChannel.this.handler.onLongPress(num3.intValue());
                            break;
                        }
                        break;
                }
                reply.reply(null);
            }
        };
        this.channel = basicMessageChannel;
        this.flutterJNI = flutterJNI;
    }

    public void dispatchSemanticsAction(int i10, @n0 AccessibilityBridge.Action action) {
        this.flutterJNI.dispatchSemanticsAction(i10, action);
    }

    public void dispatchSemanticsAction(int i10, @n0 AccessibilityBridge.Action action, @p0 Object obj) {
        this.flutterJNI.dispatchSemanticsAction(i10, action, obj);
    }

    public void onAndroidAccessibilityDisabled() {
        this.flutterJNI.setSemanticsEnabled(false);
    }

    public void onAndroidAccessibilityEnabled() {
        this.flutterJNI.setSemanticsEnabled(true);
    }

    public void setAccessibilityFeatures(int i10) {
        this.flutterJNI.setAccessibilityFeatures(i10);
    }

    public void setAccessibilityMessageHandler(@p0 AccessibilityMessageHandler accessibilityMessageHandler) {
        this.handler = accessibilityMessageHandler;
        this.flutterJNI.setAccessibilityDelegate(accessibilityMessageHandler);
    }
}
