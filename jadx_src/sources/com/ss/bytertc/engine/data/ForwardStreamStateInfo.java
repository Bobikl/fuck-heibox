package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class ForwardStreamStateInfo {
    public ForwardStreamError error;
    public String roomId;
    public ForwardStreamState state;

    public enum ForwardStreamError {
        FORWARD_STREAM_ERROR_OK(0),
        FORWARD_STREAM_ERROR_INVALID_ARGUMENT(1201),
        FORWARD_STREAM_ERROR_INVALID_TOKEN(1202),
        FORWARD_STREAM_ERROR_RESPONSE(1203),
        FORWARD_STREAM_ERROR_REMOTE_KICKED(1204),
        FORWARD_STREAM_ERROR_NOT_SUPPORT(1205);

        private int value;

        ForwardStreamError(int i10) {
            this.value = i10;
        }

        public static ForwardStreamError fromId(int i10) {
            for (ForwardStreamError forwardStreamError : values()) {
                if (forwardStreamError.value() == i10) {
                    return forwardStreamError;
                }
            }
            return null;
        }

        public int value() {
            return this.value;
        }
    }

    public enum ForwardStreamState {
        FORWARD_STREAM_STATE_IDLE(0),
        FORWARD_STREAM_STATE_SUCCESS(1),
        FORWARD_STREAM_STATE_FAILURE(2);

        private int value;

        ForwardStreamState(int i10) {
            this.value = i10;
        }

        public static ForwardStreamState fromId(int i10) {
            for (ForwardStreamState forwardStreamState : values()) {
                if (forwardStreamState.value() == i10) {
                    return forwardStreamState;
                }
            }
            return null;
        }

        public int value() {
            return this.value;
        }
    }

    public ForwardStreamStateInfo(String str, ForwardStreamState forwardStreamState, ForwardStreamError forwardStreamError) {
        this.roomId = str;
        this.state = forwardStreamState;
        this.error = forwardStreamError;
    }

    @CalledByNative
    private static ForwardStreamStateInfo create(String str, int i10, int i11) {
        return new ForwardStreamStateInfo(str, ForwardStreamState.fromId(i10), ForwardStreamError.fromId(i11));
    }
}
