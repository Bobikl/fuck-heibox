package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.annotation.n0;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.embedding.engine.systemchannels.KeyboardChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.editing.InputConnectionAdaptor;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class KeyboardManager implements InputConnectionAdaptor.KeyboardDelegate, KeyboardChannel.KeyboardMethodHandler {
    private static final String TAG = "KeyboardManager";
    private final HashSet<KeyEvent> redispatchedEvents = new HashSet<>();
    protected final Responder[] responders;
    private final ViewDelegate viewDelegate;

    public static class CharacterCombiner {
        private int combiningCharacter = 0;

        Character applyCombiningCharacterToBaseCharacter(int i10) {
            char c10 = (char) i10;
            if ((Integer.MIN_VALUE & i10) != 0) {
                int i11 = i10 & Integer.MAX_VALUE;
                int i12 = this.combiningCharacter;
                if (i12 != 0) {
                    this.combiningCharacter = KeyCharacterMap.getDeadChar(i12, i11);
                } else {
                    this.combiningCharacter = i11;
                }
            } else {
                int i13 = this.combiningCharacter;
                if (i13 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i13, i10);
                    if (deadChar > 0) {
                        c10 = (char) deadChar;
                    }
                    this.combiningCharacter = 0;
                }
            }
            return Character.valueOf(c10);
        }
    }

    public class PerEventCallbackBuilder {
        boolean isEventHandled = false;
        final KeyEvent keyEvent;
        int unrepliedCount;

        public class Callback implements Responder.OnKeyEventHandledCallback {
            boolean isCalled;

            private Callback() {
                this.isCalled = false;
            }

            @Override // io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback
            public void onKeyEventHandled(boolean z10) {
                if (this.isCalled) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.isCalled = true;
                PerEventCallbackBuilder perEventCallbackBuilder = PerEventCallbackBuilder.this;
                int i10 = perEventCallbackBuilder.unrepliedCount - 1;
                perEventCallbackBuilder.unrepliedCount = i10;
                boolean z11 = z10 | perEventCallbackBuilder.isEventHandled;
                perEventCallbackBuilder.isEventHandled = z11;
                if (i10 != 0 || z11) {
                    return;
                }
                KeyboardManager.this.onUnhandled(perEventCallbackBuilder.keyEvent);
            }
        }

        PerEventCallbackBuilder(KeyEvent keyEvent) {
            this.unrepliedCount = KeyboardManager.this.responders.length;
            this.keyEvent = keyEvent;
        }

        public Responder.OnKeyEventHandledCallback buildCallback() {
            return new Callback();
        }
    }

    public interface Responder {

        public interface OnKeyEventHandledCallback {
            void onKeyEventHandled(boolean z10);
        }

        void handleEvent(@n0 KeyEvent keyEvent, @n0 OnKeyEventHandledCallback onKeyEventHandledCallback);
    }

    public interface ViewDelegate {
        BinaryMessenger getBinaryMessenger();

        boolean onTextInputKeyEvent(@n0 KeyEvent keyEvent);

        void redispatch(@n0 KeyEvent keyEvent);
    }

    public KeyboardManager(@n0 ViewDelegate viewDelegate) {
        this.viewDelegate = viewDelegate;
        this.responders = new Responder[]{new KeyEmbedderResponder(viewDelegate.getBinaryMessenger()), new KeyChannelResponder(new KeyEventChannel(viewDelegate.getBinaryMessenger()))};
        new KeyboardChannel(viewDelegate.getBinaryMessenger()).setKeyboardMethodHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUnhandled(@n0 KeyEvent keyEvent) {
        ViewDelegate viewDelegate = this.viewDelegate;
        if (viewDelegate == null || viewDelegate.onTextInputKeyEvent(keyEvent)) {
            return;
        }
        this.redispatchedEvents.add(keyEvent);
        this.viewDelegate.redispatch(keyEvent);
        if (this.redispatchedEvents.remove(keyEvent)) {
            Log.w(TAG, "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    public void destroy() {
        int size = this.redispatchedEvents.size();
        if (size > 0) {
            Log.w(TAG, "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.KeyboardChannel.KeyboardMethodHandler
    public Map<Long, Long> getKeyboardState() {
        return ((KeyEmbedderResponder) this.responders[0]).getPressedState();
    }

    @Override // io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate
    public boolean handleEvent(@n0 KeyEvent keyEvent) {
        if (this.redispatchedEvents.remove(keyEvent)) {
            return false;
        }
        if (this.responders.length <= 0) {
            onUnhandled(keyEvent);
            return true;
        }
        PerEventCallbackBuilder perEventCallbackBuilder = new PerEventCallbackBuilder(keyEvent);
        for (Responder responder : this.responders) {
            responder.handleEvent(keyEvent, perEventCallbackBuilder.buildCallback());
        }
        return true;
    }
}
