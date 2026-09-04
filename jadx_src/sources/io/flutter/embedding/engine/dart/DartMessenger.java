package io.flutter.embedding.engine.dart;

import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.util.TraceSection;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class DartMessenger implements BinaryMessenger, PlatformMessageHandler {
    private static final String TAG = "DartMessenger";

    @n0
    private Map<String, List<BufferedMessageInfo>> bufferedMessages;

    @n0
    private WeakHashMap<BinaryMessenger.TaskQueue, DartMessengerTaskQueue> createdTaskQueues;

    @n0
    private final AtomicBoolean enableBufferingIncomingMessages;

    @n0
    private final FlutterJNI flutterJNI;

    @n0
    private final Object handlersLock;

    @n0
    private final Map<String, HandlerInfo> messageHandlers;
    private int nextReplyId;

    @n0
    private final Map<Integer, BinaryMessenger.BinaryReply> pendingReplies;

    @n0
    private final DartMessengerTaskQueue platformTaskQueue;

    @n0
    private TaskQueueFactory taskQueueFactory;

    public static class BufferedMessageInfo {

        @n0
        public final ByteBuffer message;
        long messageData;
        int replyId;

        BufferedMessageInfo(@n0 ByteBuffer byteBuffer, int i10, long j10) {
            this.message = byteBuffer;
            this.replyId = i10;
            this.messageData = j10;
        }
    }

    public static class ConcurrentTaskQueue implements DartMessengerTaskQueue {

        @n0
        private final ExecutorService executor;

        ConcurrentTaskQueue(ExecutorService executorService) {
            this.executor = executorService;
        }

        @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
        public void dispatch(@n0 Runnable runnable) {
            this.executor.execute(runnable);
        }
    }

    public interface DartMessengerTaskQueue {
        void dispatch(@n0 Runnable runnable);
    }

    public static class DefaultTaskQueueFactory implements TaskQueueFactory {
        ExecutorService executorService = FlutterInjector.instance().executorService();

        DefaultTaskQueueFactory() {
        }

        @Override // io.flutter.embedding.engine.dart.DartMessenger.TaskQueueFactory
        public DartMessengerTaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
            return taskQueueOptions.getIsSerial() ? new SerialTaskQueue(this.executorService) : new ConcurrentTaskQueue(this.executorService);
        }
    }

    public static class HandlerInfo {

        @n0
        public final BinaryMessenger.BinaryMessageHandler handler;

        @p0
        public final DartMessengerTaskQueue taskQueue;

        HandlerInfo(@n0 BinaryMessenger.BinaryMessageHandler binaryMessageHandler, @p0 DartMessengerTaskQueue dartMessengerTaskQueue) {
            this.handler = binaryMessageHandler;
            this.taskQueue = dartMessengerTaskQueue;
        }
    }

    public static class Reply implements BinaryMessenger.BinaryReply {
        private final AtomicBoolean done = new AtomicBoolean(false);

        @n0
        private final FlutterJNI flutterJNI;
        private final int replyId;

        Reply(@n0 FlutterJNI flutterJNI, int i10) {
            this.flutterJNI = flutterJNI;
            this.replyId = i10;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
        public void reply(@p0 ByteBuffer byteBuffer) {
            if (this.done.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.flutterJNI.invokePlatformMessageEmptyResponseCallback(this.replyId);
            } else {
                this.flutterJNI.invokePlatformMessageResponseCallback(this.replyId, byteBuffer, byteBuffer.position());
            }
        }
    }

    public static class SerialTaskQueue implements DartMessengerTaskQueue {

        @n0
        private final ExecutorService executor;

        @n0
        private final ConcurrentLinkedQueue<Runnable> queue = new ConcurrentLinkedQueue<>();

        @n0
        private final AtomicBoolean isRunning = new AtomicBoolean(false);

        SerialTaskQueue(ExecutorService executorService) {
            this.executor = executorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: flush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void lambda$flush$1() {
            if (this.isRunning.compareAndSet(false, true)) {
                try {
                    Runnable runnablePoll = this.queue.poll();
                    if (runnablePoll != null) {
                        runnablePoll.run();
                    }
                } finally {
                    this.isRunning.set(false);
                    if (!this.queue.isEmpty()) {
                        this.executor.execute(new Runnable() { // from class: io.flutter.embedding.engine.dart.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f119427b.lambda$flush$1();
                            }
                        });
                    }
                }
            }
        }

        @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
        public void dispatch(@n0 Runnable runnable) {
            this.queue.add(runnable);
            this.executor.execute(new Runnable() { // from class: io.flutter.embedding.engine.dart.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f119428b.lambda$dispatch$0();
                }
            });
        }
    }

    public interface TaskQueueFactory {
        DartMessengerTaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions);
    }

    public static class TaskQueueToken implements BinaryMessenger.TaskQueue {
        private TaskQueueToken() {
        }
    }

    DartMessenger(@n0 FlutterJNI flutterJNI) {
        this(flutterJNI, new DefaultTaskQueueFactory());
    }

    DartMessenger(@n0 FlutterJNI flutterJNI, @n0 TaskQueueFactory taskQueueFactory) {
        this.messageHandlers = new HashMap();
        this.bufferedMessages = new HashMap();
        this.handlersLock = new Object();
        this.enableBufferingIncomingMessages = new AtomicBoolean(false);
        this.pendingReplies = new HashMap();
        this.nextReplyId = 1;
        this.platformTaskQueue = new PlatformTaskQueue();
        this.createdTaskQueues = new WeakHashMap<>();
        this.flutterJNI = flutterJNI;
        this.taskQueueFactory = taskQueueFactory;
    }

    private void dispatchMessageToQueue(@n0 final String str, @p0 final HandlerInfo handlerInfo, @p0 final ByteBuffer byteBuffer, final int i10, final long j10) {
        DartMessengerTaskQueue dartMessengerTaskQueue = handlerInfo != null ? handlerInfo.taskQueue : null;
        TraceSection.beginAsyncSection("PlatformChannel ScheduleHandler on " + str, i10);
        Runnable runnable = new Runnable() { // from class: io.flutter.embedding.engine.dart.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f119421b.lambda$dispatchMessageToQueue$0(str, i10, handlerInfo, byteBuffer, j10);
            }
        };
        if (dartMessengerTaskQueue == null) {
            dartMessengerTaskQueue = this.platformTaskQueue;
        }
        dartMessengerTaskQueue.dispatch(runnable);
    }

    private static void handleError(Error error) {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, error);
    }

    private void invokeHandler(@p0 HandlerInfo handlerInfo, @p0 ByteBuffer byteBuffer, int i10) {
        if (handlerInfo == null) {
            Log.v(TAG, "No registered handler for message. Responding to Dart with empty reply message.");
            this.flutterJNI.invokePlatformMessageEmptyResponseCallback(i10);
            return;
        }
        try {
            Log.v(TAG, "Deferring to registered handler to process message.");
            handlerInfo.handler.onMessage(byteBuffer, new Reply(this.flutterJNI, i10));
        } catch (Error e10) {
            handleError(e10);
        } catch (Exception e11) {
            Log.e(TAG, "Uncaught exception in binary message listener", e11);
            this.flutterJNI.invokePlatformMessageEmptyResponseCallback(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchMessageToQueue$0(String str, int i10, HandlerInfo handlerInfo, ByteBuffer byteBuffer, long j10) {
        TraceSection.endAsyncSection("PlatformChannel ScheduleHandler on " + str, i10);
        try {
            TraceSection traceSectionScoped = TraceSection.scoped("DartMessenger#handleMessageFromDart on " + str);
            try {
                invokeHandler(handlerInfo, byteBuffer, i10);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
                if (traceSectionScoped != null) {
                    traceSectionScoped.close();
                }
                this.flutterJNI.cleanupMessageData(j10);
            } catch (Throwable th2) {
                if (traceSectionScoped != null) {
                    try {
                        traceSectionScoped.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.flutterJNI.cleanupMessageData(j10);
            throw th4;
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void disableBufferingIncomingMessages() {
        Map<String, List<BufferedMessageInfo>> map;
        synchronized (this.handlersLock) {
            this.enableBufferingIncomingMessages.set(false);
            map = this.bufferedMessages;
            this.bufferedMessages = new HashMap();
        }
        for (Map.Entry<String, List<BufferedMessageInfo>> entry : map.entrySet()) {
            for (BufferedMessageInfo bufferedMessageInfo : entry.getValue()) {
                dispatchMessageToQueue(entry.getKey(), null, bufferedMessageInfo.message, bufferedMessageInfo.replyId, bufferedMessageInfo.messageData);
            }
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void enableBufferingIncomingMessages() {
        this.enableBufferingIncomingMessages.set(true);
    }

    @i1
    public int getPendingChannelResponseCount() {
        return this.pendingReplies.size();
    }

    @Override // io.flutter.embedding.engine.dart.PlatformMessageHandler
    public void handleMessageFromDart(@n0 String str, @p0 ByteBuffer byteBuffer, int i10, long j10) {
        HandlerInfo handlerInfo;
        boolean z10;
        Log.v(TAG, "Received message from Dart over channel '" + str + "'");
        synchronized (this.handlersLock) {
            handlerInfo = this.messageHandlers.get(str);
            z10 = this.enableBufferingIncomingMessages.get() && handlerInfo == null;
            if (z10) {
                if (!this.bufferedMessages.containsKey(str)) {
                    this.bufferedMessages.put(str, new LinkedList());
                }
                this.bufferedMessages.get(str).add(new BufferedMessageInfo(byteBuffer, i10, j10));
            }
        }
        if (z10) {
            return;
        }
        dispatchMessageToQueue(str, handlerInfo, byteBuffer, i10, j10);
    }

    @Override // io.flutter.embedding.engine.dart.PlatformMessageHandler
    public void handlePlatformMessageResponse(int i10, @p0 ByteBuffer byteBuffer) {
        Log.v(TAG, "Received message reply from Dart.");
        BinaryMessenger.BinaryReply binaryReplyRemove = this.pendingReplies.remove(Integer.valueOf(i10));
        if (binaryReplyRemove != null) {
            try {
                Log.v(TAG, "Invoking registered callback for reply from Dart.");
                binaryReplyRemove.reply(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e10) {
                handleError(e10);
            } catch (Exception e11) {
                Log.e(TAG, "Uncaught exception in binary message reply handler", e11);
            }
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public /* synthetic */ BinaryMessenger.TaskQueue makeBackgroundTaskQueue() {
        return io.flutter.plugin.common.a.c(this);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        DartMessengerTaskQueue dartMessengerTaskQueueMakeBackgroundTaskQueue = this.taskQueueFactory.makeBackgroundTaskQueue(taskQueueOptions);
        TaskQueueToken taskQueueToken = new TaskQueueToken();
        this.createdTaskQueues.put(taskQueueToken, dartMessengerTaskQueueMakeBackgroundTaskQueue);
        return taskQueueToken;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @i1
    public void send(@n0 String str, @n0 ByteBuffer byteBuffer) {
        Log.v(TAG, "Sending message over channel '" + str + "'");
        send(str, byteBuffer, null);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void send(@n0 String str, @p0 ByteBuffer byteBuffer, @p0 BinaryMessenger.BinaryReply binaryReply) {
        TraceSection traceSectionScoped = TraceSection.scoped("DartMessenger#send on " + str);
        try {
            Log.v(TAG, "Sending message with callback over channel '" + str + "'");
            int i10 = this.nextReplyId;
            this.nextReplyId = i10 + 1;
            if (binaryReply != null) {
                this.pendingReplies.put(Integer.valueOf(i10), binaryReply);
            }
            if (byteBuffer == null) {
                this.flutterJNI.dispatchEmptyPlatformMessage(str, i10);
            } else {
                this.flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i10);
            }
            if (traceSectionScoped != null) {
                traceSectionScoped.close();
            }
        } catch (Throwable th2) {
            if (traceSectionScoped != null) {
                try {
                    traceSectionScoped.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void setMessageHandler(@n0 String str, @p0 BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        setMessageHandler(str, binaryMessageHandler, null);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void setMessageHandler(@n0 String str, @p0 BinaryMessenger.BinaryMessageHandler binaryMessageHandler, @p0 BinaryMessenger.TaskQueue taskQueue) {
        if (binaryMessageHandler == null) {
            Log.v(TAG, "Removing handler for channel '" + str + "'");
            synchronized (this.handlersLock) {
                this.messageHandlers.remove(str);
            }
            return;
        }
        DartMessengerTaskQueue dartMessengerTaskQueue = null;
        if (taskQueue != null && (dartMessengerTaskQueue = this.createdTaskQueues.get(taskQueue)) == null) {
            throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
        }
        Log.v(TAG, "Setting handler for channel '" + str + "'");
        synchronized (this.handlersLock) {
            this.messageHandlers.put(str, new HandlerInfo(binaryMessageHandler, dartMessengerTaskQueue));
            List<BufferedMessageInfo> listRemove = this.bufferedMessages.remove(str);
            if (listRemove == null) {
                return;
            }
            for (BufferedMessageInfo bufferedMessageInfo : listRemove) {
                dispatchMessageToQueue(str, this.messageHandlers.get(str), bufferedMessageInfo.message, bufferedMessageInfo.replyId, bufferedMessageInfo.messageData);
            }
        }
    }
}
