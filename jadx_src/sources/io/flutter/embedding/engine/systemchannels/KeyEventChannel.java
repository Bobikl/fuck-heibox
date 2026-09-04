package io.flutter.embedding.engine.systemchannels;

import android.view.KeyEvent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.taobao.accs.common.Constants;
import io.flutter.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.JSONMessageCodec;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class KeyEventChannel {
    private static final String TAG = "KeyEventChannel";

    @n0
    public final BasicMessageChannel<Object> channel;

    public interface EventResponseHandler {
        void onFrameworkResponse(boolean z10);
    }

    public static class FlutterKeyEvent {

        @p0
        public final Character complexCharacter;
        public final KeyEvent event;

        public FlutterKeyEvent(@n0 KeyEvent keyEvent) {
            this(keyEvent, null);
        }

        public FlutterKeyEvent(@n0 KeyEvent keyEvent, @p0 Character ch2) {
            this.event = keyEvent;
            this.complexCharacter = ch2;
        }
    }

    public KeyEventChannel(@n0 BinaryMessenger binaryMessenger) {
        this.channel = new BasicMessageChannel<>(binaryMessenger, "flutter/keyevent", JSONMessageCodec.INSTANCE);
    }

    private static BasicMessageChannel.Reply<Object> createReplyHandler(@n0 final EventResponseHandler eventResponseHandler) {
        return new BasicMessageChannel.Reply() { // from class: io.flutter.embedding.engine.systemchannels.a
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(Object obj) throws JSONException {
                KeyEventChannel.lambda$createReplyHandler$0(eventResponseHandler, obj);
            }
        };
    }

    private Map<String, Object> encodeKeyEvent(@n0 FlutterKeyEvent flutterKeyEvent, boolean z10) {
        HashMap map = new HashMap();
        map.put("type", z10 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put(Constants.KEY_FLAGS, Integer.valueOf(flutterKeyEvent.event.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(flutterKeyEvent.event.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(flutterKeyEvent.event.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(flutterKeyEvent.event.getKeyCode()));
        map.put("scanCode", Integer.valueOf(flutterKeyEvent.event.getScanCode()));
        map.put("metaState", Integer.valueOf(flutterKeyEvent.event.getMetaState()));
        Character ch2 = flutterKeyEvent.complexCharacter;
        if (ch2 != null) {
            map.put("character", ch2.toString());
        }
        map.put("source", Integer.valueOf(flutterKeyEvent.event.getSource()));
        map.put("deviceId", Integer.valueOf(flutterKeyEvent.event.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(flutterKeyEvent.event.getRepeatCount()));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createReplyHandler$0(EventResponseHandler eventResponseHandler, Object obj) throws JSONException {
        boolean z10 = false;
        if (obj != null) {
            try {
                z10 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e10) {
                Log.e(TAG, "Unable to unpack JSON message: " + e10);
            }
        }
        eventResponseHandler.onFrameworkResponse(z10);
    }

    public void sendFlutterKeyEvent(@n0 FlutterKeyEvent flutterKeyEvent, boolean z10, @n0 EventResponseHandler eventResponseHandler) {
        this.channel.send(encodeKeyEvent(flutterKeyEvent, z10), createReplyHandler(eventResponseHandler));
    }
}
