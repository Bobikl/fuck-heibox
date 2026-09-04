package io.flutter.embedding.android;

import android.view.KeyEvent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.Log;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class KeyEmbedderResponder implements KeyboardManager.Responder {
    private static final String TAG = "KeyEmbedderResponder";

    @n0
    private final BinaryMessenger messenger;

    @n0
    private final HashMap<Long, Long> pressingRecords = new HashMap<>();

    @n0
    private final HashMap<Long, KeyboardMap.TogglingGoal> togglingGoals = new HashMap<>();

    @n0
    private final KeyboardManager.CharacterCombiner characterCombiner = new KeyboardManager.CharacterCombiner();

    /* JADX INFO: renamed from: io.flutter.embedding.android.KeyEmbedderResponder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$android$KeyData$Type;

        static {
            int[] iArr = new int[KeyData.Type.values().length];
            $SwitchMap$io$flutter$embedding$android$KeyData$Type = iArr;
            try {
                iArr[KeyData.Type.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$KeyData$Type[KeyData.Type.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$KeyData$Type[KeyData.Type.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public KeyEmbedderResponder(BinaryMessenger binaryMessenger) {
        this.messenger = binaryMessenger;
        for (KeyboardMap.TogglingGoal togglingGoal : KeyboardMap.getTogglingGoals()) {
            this.togglingGoals.put(Long.valueOf(togglingGoal.logicalKey), togglingGoal);
        }
    }

    private static KeyData.Type getEventType(KeyEvent keyEvent) {
        boolean z10 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z10 ? KeyData.Type.kRepeat : KeyData.Type.kDown;
        }
        if (action == 1) {
            return KeyData.Type.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    private Long getLogicalKey(@n0 KeyEvent keyEvent) {
        Long l10 = KeyboardMap.keyCodeToLogical.get(Long.valueOf(keyEvent.getKeyCode()));
        return l10 != null ? l10 : Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), KeyboardMap.kAndroidPlane));
    }

    private Long getPhysicalKey(@n0 KeyEvent keyEvent) {
        long scanCode = keyEvent.getScanCode();
        if (scanCode == 0) {
            return Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), KeyboardMap.kAndroidPlane));
        }
        Long l10 = KeyboardMap.scanCodeToPhysical.get(Long.valueOf(scanCode));
        return l10 != null ? l10 : Long.valueOf(keyOfPlane(keyEvent.getScanCode(), KeyboardMap.kAndroidPlane));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:60:0x0104  */
    /* JADX WARN: Code duplicated, block: B:62:0x0109  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:65:0x0118  */
    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x014c A[LOOP:2: B:68:0x0146->B:70:0x014c, LOOP_END] */
    private boolean handleEventImpl(@n0 KeyEvent keyEvent, @n0 KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        boolean z10;
        KeyData.Type type;
        KeyData keyData;
        int source;
        Iterator<Runnable> it;
        KeyboardMap.TogglingGoal togglingGoal;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            return false;
        }
        Long physicalKey = getPhysicalKey(keyEvent);
        Long logicalKey = getLogicalKey(keyEvent);
        ArrayList<Runnable> arrayList = new ArrayList<>();
        for (KeyboardMap.PressingGoal pressingGoal : KeyboardMap.pressingGoals) {
            synchronizePressingKey(pressingGoal, (keyEvent.getMetaState() & pressingGoal.mask) != 0, logicalKey.longValue(), physicalKey.longValue(), keyEvent, arrayList);
        }
        for (KeyboardMap.TogglingGoal togglingGoal2 : this.togglingGoals.values()) {
            synchronizeTogglingKey(togglingGoal2, (keyEvent.getMetaState() & togglingGoal2.mask) != 0, logicalKey.longValue(), keyEvent);
        }
        int action = keyEvent.getAction();
        if (action == 0) {
            z10 = true;
        } else {
            if (action != 1) {
                return false;
            }
            z10 = false;
        }
        Long l10 = this.pressingRecords.get(physicalKey);
        if (z10) {
            if (l10 == null) {
                type = KeyData.Type.kDown;
            } else if (keyEvent.getRepeatCount() > 0) {
                type = KeyData.Type.kRepeat;
            } else {
                synthesizeEvent(false, l10, physicalKey, keyEvent.getEventTime());
                type = KeyData.Type.kDown;
            }
            char cCharValue = this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar()).charValue();
            String str = cCharValue != 0 ? "" + cCharValue : null;
            if (type != KeyData.Type.kRepeat) {
                updatePressingState(physicalKey, z10 ? logicalKey : null);
            }
            if (type == KeyData.Type.kDown && (togglingGoal = this.togglingGoals.get(logicalKey)) != null) {
                togglingGoal.enabled = !togglingGoal.enabled;
            }
            keyData = new KeyData();
            source = keyEvent.getSource();
            if (source != 513) {
                keyData.deviceType = KeyData.DeviceType.kDirectionalPad;
            } else if (source != 1025) {
                keyData.deviceType = KeyData.DeviceType.kGamepad;
            } else if (source != 16777232) {
                keyData.deviceType = KeyData.DeviceType.kJoystick;
            } else if (source != 33554433) {
                keyData.deviceType = KeyData.DeviceType.kKeyboard;
            } else {
                keyData.deviceType = KeyData.DeviceType.kHdmi;
            }
            keyData.timestamp = keyEvent.getEventTime();
            keyData.type = type;
            keyData.logicalKey = logicalKey.longValue();
            keyData.physicalKey = physicalKey.longValue();
            keyData.character = str;
            keyData.synthesized = false;
            keyData.deviceType = KeyData.DeviceType.kKeyboard;
            sendKeyEvent(keyData, onKeyEventHandledCallback);
            it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return true;
        }
        if (l10 == null) {
            return false;
        }
        type = KeyData.Type.kUp;
        if (type != KeyData.Type.kRepeat) {
            updatePressingState(physicalKey, z10 ? logicalKey : null);
        }
        if (type == KeyData.Type.kDown) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        keyData = new KeyData();
        source = keyEvent.getSource();
        if (source != 513) {
            keyData.deviceType = KeyData.DeviceType.kDirectionalPad;
        } else if (source != 1025) {
            keyData.deviceType = KeyData.DeviceType.kGamepad;
        } else if (source != 16777232) {
            keyData.deviceType = KeyData.DeviceType.kJoystick;
        } else if (source != 33554433) {
            keyData.deviceType = KeyData.DeviceType.kKeyboard;
        } else {
            keyData.deviceType = KeyData.DeviceType.kHdmi;
        }
        keyData.timestamp = keyEvent.getEventTime();
        keyData.type = type;
        keyData.logicalKey = logicalKey.longValue();
        keyData.physicalKey = physicalKey.longValue();
        keyData.character = str;
        keyData.synthesized = false;
        keyData.deviceType = KeyData.DeviceType.kKeyboard;
        sendKeyEvent(keyData, onKeyEventHandledCallback);
        it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        return true;
    }

    private static long keyOfPlane(long j10, long j11) {
        return (j10 & KeyboardMap.kValueMask) | j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendKeyEvent$2(KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback, ByteBuffer byteBuffer) {
        Boolean boolValueOf = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            Log.w(TAG, "A null reply was received when sending a key event to the framework.");
        }
        onKeyEventHandledCallback.onKeyEventHandled(boolValueOf.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$synchronizePressingKey$0(KeyboardMap.KeyPair keyPair, long j10, KeyEvent keyEvent) {
        synthesizeEvent(false, Long.valueOf(keyPair.logicalKey), Long.valueOf(j10), keyEvent.getEventTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$synchronizePressingKey$1(KeyboardMap.KeyPair keyPair, KeyEvent keyEvent) {
        synthesizeEvent(false, Long.valueOf(keyPair.logicalKey), Long.valueOf(keyPair.physicalKey), keyEvent.getEventTime());
    }

    private void sendKeyEvent(KeyData keyData, final KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        this.messenger.send(KeyData.CHANNEL, keyData.toBytes(), onKeyEventHandledCallback == null ? null : new BinaryMessenger.BinaryReply() { // from class: io.flutter.embedding.android.i
            @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
            public final void reply(ByteBuffer byteBuffer) {
                KeyEmbedderResponder.lambda$sendKeyEvent$2(onKeyEventHandledCallback, byteBuffer);
            }
        });
    }

    private void synthesizeEvent(boolean z10, Long l10, Long l11, long j10) {
        KeyData keyData = new KeyData();
        keyData.timestamp = j10;
        keyData.type = z10 ? KeyData.Type.kDown : KeyData.Type.kUp;
        keyData.logicalKey = l10.longValue();
        keyData.physicalKey = l11.longValue();
        keyData.character = null;
        keyData.synthesized = true;
        keyData.deviceType = KeyData.DeviceType.kKeyboard;
        if (l11.longValue() != 0 && l10.longValue() != 0) {
            if (!z10) {
                l10 = null;
            }
            updatePressingState(l11, l10);
        }
        sendKeyEvent(keyData, null);
    }

    public Map<Long, Long> getPressedState() {
        return Collections.unmodifiableMap(this.pressingRecords);
    }

    @Override // io.flutter.embedding.android.KeyboardManager.Responder
    public void handleEvent(@n0 KeyEvent keyEvent, @n0 KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        if (handleEventImpl(keyEvent, onKeyEventHandledCallback)) {
            return;
        }
        synthesizeEvent(true, 0L, 0L, 0L);
        onKeyEventHandledCallback.onKeyEventHandled(true);
    }

    void synchronizePressingKey(KeyboardMap.PressingGoal pressingGoal, boolean z10, long j10, final long j11, final KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
        KeyboardMap.KeyPair[] keyPairArr = pressingGoal.keys;
        boolean[] zArr = new boolean[keyPairArr.length];
        Boolean[] boolArr = new Boolean[keyPairArr.length];
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            KeyboardMap.KeyPair[] keyPairArr2 = pressingGoal.keys;
            boolean z12 = true;
            if (i10 >= keyPairArr2.length) {
                break;
            }
            final KeyboardMap.KeyPair keyPair = keyPairArr2[i10];
            boolean zContainsKey = this.pressingRecords.containsKey(Long.valueOf(keyPair.physicalKey));
            zArr[i10] = zContainsKey;
            if (keyPair.logicalKey == j10) {
                int i11 = AnonymousClass1.$SwitchMap$io$flutter$embedding$android$KeyData$Type[getEventType(keyEvent).ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        boolArr[i10] = Boolean.valueOf(zArr[i10]);
                    } else if (i11 == 3) {
                        if (!z10) {
                            arrayList.add(new Runnable() { // from class: io.flutter.embedding.android.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f119416b.lambda$synchronizePressingKey$1(keyPair, keyEvent);
                                }
                            });
                        }
                        boolArr[i10] = Boolean.valueOf(zArr[i10]);
                    }
                    i10++;
                } else {
                    boolArr[i10] = Boolean.FALSE;
                    if (!z10) {
                        arrayList.add(new Runnable() { // from class: io.flutter.embedding.android.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f119412b.lambda$synchronizePressingKey$0(keyPair, j11, keyEvent);
                            }
                        });
                    }
                }
            } else if (!z11 && !zContainsKey) {
                z12 = false;
            }
            z11 = z12;
            i10++;
        }
        if (z10) {
            for (int i12 = 0; i12 < pressingGoal.keys.length; i12++) {
                if (boolArr[i12] == null) {
                    if (z11) {
                        boolArr[i12] = Boolean.valueOf(zArr[i12]);
                    } else {
                        boolArr[i12] = Boolean.TRUE;
                        z11 = true;
                    }
                }
            }
            if (!z11) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i13 = 0; i13 < pressingGoal.keys.length; i13++) {
                if (boolArr[i13] == null) {
                    boolArr[i13] = Boolean.FALSE;
                }
            }
        }
        for (int i14 = 0; i14 < pressingGoal.keys.length; i14++) {
            if (zArr[i14] != boolArr[i14].booleanValue()) {
                KeyboardMap.KeyPair keyPair2 = pressingGoal.keys[i14];
                synthesizeEvent(boolArr[i14].booleanValue(), Long.valueOf(keyPair2.logicalKey), Long.valueOf(keyPair2.physicalKey), keyEvent.getEventTime());
            }
        }
    }

    void synchronizeTogglingKey(KeyboardMap.TogglingGoal togglingGoal, boolean z10, long j10, KeyEvent keyEvent) {
        if (togglingGoal.logicalKey == j10 || togglingGoal.enabled == z10) {
            return;
        }
        boolean z11 = !this.pressingRecords.containsKey(Long.valueOf(togglingGoal.physicalKey));
        if (z11) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        synthesizeEvent(z11, Long.valueOf(togglingGoal.logicalKey), Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
        if (!z11) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        synthesizeEvent(!z11, Long.valueOf(togglingGoal.logicalKey), Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
    }

    void updatePressingState(@n0 Long l10, @p0 Long l11) {
        if (l11 != null) {
            if (this.pressingRecords.put(l10, l11) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.pressingRecords.remove(l10) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
