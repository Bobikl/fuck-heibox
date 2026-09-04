package io.flutter.embedding.android;

import android.view.KeyEvent;
import androidx.annotation.n0;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;

/* JADX INFO: loaded from: classes4.dex */
public class KeyChannelResponder implements KeyboardManager.Responder {
    private static final String TAG = "KeyChannelResponder";

    @n0
    private final KeyboardManager.CharacterCombiner characterCombiner = new KeyboardManager.CharacterCombiner();

    @n0
    private final KeyEventChannel keyEventChannel;

    public KeyChannelResponder(@n0 KeyEventChannel keyEventChannel) {
        this.keyEventChannel = keyEventChannel;
    }

    @Override // io.flutter.embedding.android.KeyboardManager.Responder
    public void handleEvent(@n0 KeyEvent keyEvent, @n0 final KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.keyEventChannel.sendFlutterKeyEvent(new KeyEventChannel.FlutterKeyEvent(keyEvent, this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar())), action != 0, new KeyEventChannel.EventResponseHandler() { // from class: io.flutter.embedding.android.h
                @Override // io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler
                public final void onFrameworkResponse(boolean z10) {
                    onKeyEventHandledCallback.onKeyEventHandled(z10);
                }
            });
        } else {
            onKeyEventHandledCallback.onKeyEventHandled(false);
        }
    }
}
