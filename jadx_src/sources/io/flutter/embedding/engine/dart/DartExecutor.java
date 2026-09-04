package io.flutter.embedding.engine.dart;

import android.content.res.AssetManager;
import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StringCodec;
import io.flutter.util.TraceSection;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DartExecutor implements BinaryMessenger {
    private static final String TAG = "DartExecutor";

    @n0
    private final AssetManager assetManager;

    @n0
    private final BinaryMessenger binaryMessenger;

    @n0
    private final DartMessenger dartMessenger;

    @n0
    private final FlutterJNI flutterJNI;
    private boolean isApplicationRunning;
    private final BinaryMessenger.BinaryMessageHandler isolateChannelMessageHandler;

    @p0
    private String isolateServiceId;

    @p0
    private IsolateServiceIdListener isolateServiceIdListener;

    public static class DartCallback {
        public final AssetManager androidAssetManager;
        public final FlutterCallbackInformation callbackHandle;
        public final String pathToBundle;

        public DartCallback(@n0 AssetManager assetManager, @n0 String str, @n0 FlutterCallbackInformation flutterCallbackInformation) {
            this.androidAssetManager = assetManager;
            this.pathToBundle = str;
            this.callbackHandle = flutterCallbackInformation;
        }

        @n0
        public String toString() {
            return "DartCallback( bundle path: " + this.pathToBundle + ", library path: " + this.callbackHandle.callbackLibraryPath + ", function: " + this.callbackHandle.callbackName + " )";
        }
    }

    public static class DartEntrypoint {

        @n0
        public final String dartEntrypointFunctionName;

        @p0
        public final String dartEntrypointLibrary;

        @n0
        public final String pathToBundle;

        public DartEntrypoint(@n0 String str, @n0 String str2) {
            this.pathToBundle = str;
            this.dartEntrypointLibrary = null;
            this.dartEntrypointFunctionName = str2;
        }

        public DartEntrypoint(@n0 String str, @n0 String str2, @n0 String str3) {
            this.pathToBundle = str;
            this.dartEntrypointLibrary = str2;
            this.dartEntrypointFunctionName = str3;
        }

        @n0
        public static DartEntrypoint createDefault() {
            FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
            if (flutterLoader.initialized()) {
                return new DartEntrypoint(flutterLoader.findAppBundlePath(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DartEntrypoint dartEntrypoint = (DartEntrypoint) obj;
            if (this.pathToBundle.equals(dartEntrypoint.pathToBundle)) {
                return this.dartEntrypointFunctionName.equals(dartEntrypoint.dartEntrypointFunctionName);
            }
            return false;
        }

        public int hashCode() {
            return (this.pathToBundle.hashCode() * 31) + this.dartEntrypointFunctionName.hashCode();
        }

        @n0
        public String toString() {
            return "DartEntrypoint( bundle path: " + this.pathToBundle + ", function: " + this.dartEntrypointFunctionName + " )";
        }
    }

    public static class DefaultBinaryMessenger implements BinaryMessenger {
        private final DartMessenger messenger;

        private DefaultBinaryMessenger(@n0 DartMessenger dartMessenger) {
            this.messenger = dartMessenger;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public void disableBufferingIncomingMessages() {
            this.messenger.disableBufferingIncomingMessages();
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public void enableBufferingIncomingMessages() {
            this.messenger.enableBufferingIncomingMessages();
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public /* synthetic */ BinaryMessenger.TaskQueue makeBackgroundTaskQueue() {
            return io.flutter.plugin.common.a.c(this);
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
            return this.messenger.makeBackgroundTaskQueue(taskQueueOptions);
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        @i1
        public void send(@n0 String str, @p0 ByteBuffer byteBuffer) {
            this.messenger.send(str, byteBuffer, null);
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        @i1
        public void send(@n0 String str, @p0 ByteBuffer byteBuffer, @p0 BinaryMessenger.BinaryReply binaryReply) {
            this.messenger.send(str, byteBuffer, binaryReply);
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        @i1
        public void setMessageHandler(@n0 String str, @p0 BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
            this.messenger.setMessageHandler(str, binaryMessageHandler);
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        @i1
        public void setMessageHandler(@n0 String str, @p0 BinaryMessenger.BinaryMessageHandler binaryMessageHandler, @p0 BinaryMessenger.TaskQueue taskQueue) {
            this.messenger.setMessageHandler(str, binaryMessageHandler, taskQueue);
        }
    }

    public interface IsolateServiceIdListener {
        void onIsolateServiceIdAvailable(@n0 String str);
    }

    public DartExecutor(@n0 FlutterJNI flutterJNI, @n0 AssetManager assetManager) {
        this.isApplicationRunning = false;
        BinaryMessenger.BinaryMessageHandler binaryMessageHandler = new BinaryMessenger.BinaryMessageHandler() { // from class: io.flutter.embedding.engine.dart.DartExecutor.1
            @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
            public void onMessage(ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
                DartExecutor.this.isolateServiceId = StringCodec.INSTANCE.decodeMessage(byteBuffer);
                if (DartExecutor.this.isolateServiceIdListener != null) {
                    DartExecutor.this.isolateServiceIdListener.onIsolateServiceIdAvailable(DartExecutor.this.isolateServiceId);
                }
            }
        };
        this.isolateChannelMessageHandler = binaryMessageHandler;
        this.flutterJNI = flutterJNI;
        this.assetManager = assetManager;
        DartMessenger dartMessenger = new DartMessenger(flutterJNI);
        this.dartMessenger = dartMessenger;
        dartMessenger.setMessageHandler("flutter/isolate", binaryMessageHandler);
        this.binaryMessenger = new DefaultBinaryMessenger(dartMessenger);
        if (flutterJNI.isAttached()) {
            this.isApplicationRunning = true;
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @Deprecated
    public void disableBufferingIncomingMessages() {
        this.dartMessenger.disableBufferingIncomingMessages();
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @Deprecated
    public void enableBufferingIncomingMessages() {
        this.dartMessenger.enableBufferingIncomingMessages();
    }

    public void executeDartCallback(@n0 DartCallback dartCallback) {
        if (this.isApplicationRunning) {
            Log.w(TAG, "Attempted to run a DartExecutor that is already running.");
            return;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("DartExecutor#executeDartCallback");
        try {
            Log.v(TAG, "Executing Dart callback: " + dartCallback);
            FlutterJNI flutterJNI = this.flutterJNI;
            String str = dartCallback.pathToBundle;
            FlutterCallbackInformation flutterCallbackInformation = dartCallback.callbackHandle;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, dartCallback.androidAssetManager, null);
            this.isApplicationRunning = true;
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

    public void executeDartEntrypoint(@n0 DartEntrypoint dartEntrypoint) {
        executeDartEntrypoint(dartEntrypoint, null);
    }

    public void executeDartEntrypoint(@n0 DartEntrypoint dartEntrypoint, @p0 List<String> list) {
        if (this.isApplicationRunning) {
            Log.w(TAG, "Attempted to run a DartExecutor that is already running.");
            return;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("DartExecutor#executeDartEntrypoint");
        try {
            Log.v(TAG, "Executing Dart entrypoint: " + dartEntrypoint);
            this.flutterJNI.runBundleAndSnapshotFromLibrary(dartEntrypoint.pathToBundle, dartEntrypoint.dartEntrypointFunctionName, dartEntrypoint.dartEntrypointLibrary, this.assetManager, list);
            this.isApplicationRunning = true;
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

    @n0
    public BinaryMessenger getBinaryMessenger() {
        return this.binaryMessenger;
    }

    @p0
    public String getIsolateServiceId() {
        return this.isolateServiceId;
    }

    @i1
    public int getPendingChannelResponseCount() {
        return this.dartMessenger.getPendingChannelResponseCount();
    }

    public boolean isExecutingDart() {
        return this.isApplicationRunning;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public /* synthetic */ BinaryMessenger.TaskQueue makeBackgroundTaskQueue() {
        return io.flutter.plugin.common.a.c(this);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @i1
    @Deprecated
    public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        return this.binaryMessenger.makeBackgroundTaskQueue(taskQueueOptions);
    }

    public void notifyLowMemoryWarning() {
        if (this.flutterJNI.isAttached()) {
            this.flutterJNI.notifyLowMemoryWarning();
        }
    }

    public void onAttachedToJNI() {
        Log.v(TAG, "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.flutterJNI.setPlatformMessageHandler(this.dartMessenger);
    }

    public void onDetachedFromJNI() {
        Log.v(TAG, "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.flutterJNI.setPlatformMessageHandler(null);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @i1
    @Deprecated
    public void send(@n0 String str, @p0 ByteBuffer byteBuffer) {
        this.binaryMessenger.send(str, byteBuffer);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @i1
    @Deprecated
    public void send(@n0 String str, @p0 ByteBuffer byteBuffer, @p0 BinaryMessenger.BinaryReply binaryReply) {
        this.binaryMessenger.send(str, byteBuffer, binaryReply);
    }

    public void setIsolateServiceIdListener(@p0 IsolateServiceIdListener isolateServiceIdListener) {
        String str;
        this.isolateServiceIdListener = isolateServiceIdListener;
        if (isolateServiceIdListener == null || (str = this.isolateServiceId) == null) {
            return;
        }
        isolateServiceIdListener.onIsolateServiceIdAvailable(str);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @i1
    @Deprecated
    public void setMessageHandler(@n0 String str, @p0 BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        this.binaryMessenger.setMessageHandler(str, binaryMessageHandler);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @i1
    @Deprecated
    public void setMessageHandler(@n0 String str, @p0 BinaryMessenger.BinaryMessageHandler binaryMessageHandler, @p0 BinaryMessenger.TaskQueue taskQueue) {
        this.binaryMessenger.setMessageHandler(str, binaryMessageHandler, taskQueue);
    }
}
