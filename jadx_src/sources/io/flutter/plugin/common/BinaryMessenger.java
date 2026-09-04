package io.flutter.plugin.common;

import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface BinaryMessenger {

    public interface BinaryMessageHandler {
        @i1
        void onMessage(@p0 ByteBuffer byteBuffer, @n0 BinaryReply binaryReply);
    }

    public interface BinaryReply {
        void reply(@p0 ByteBuffer byteBuffer);
    }

    public interface TaskQueue {
    }

    public static class TaskQueueOptions {
        private boolean isSerial = true;

        public boolean getIsSerial() {
            return this.isSerial;
        }

        public TaskQueueOptions setIsSerial(boolean z10) {
            this.isSerial = z10;
            return this;
        }
    }

    void disableBufferingIncomingMessages();

    void enableBufferingIncomingMessages();

    @i1
    TaskQueue makeBackgroundTaskQueue();

    @i1
    TaskQueue makeBackgroundTaskQueue(TaskQueueOptions taskQueueOptions);

    @i1
    void send(@n0 String str, @p0 ByteBuffer byteBuffer);

    @i1
    void send(@n0 String str, @p0 ByteBuffer byteBuffer, @p0 BinaryReply binaryReply);

    @i1
    void setMessageHandler(@n0 String str, @p0 BinaryMessageHandler binaryMessageHandler);

    @i1
    void setMessageHandler(@n0 String str, @p0 BinaryMessageHandler binaryMessageHandler, @p0 TaskQueue taskQueue);
}
