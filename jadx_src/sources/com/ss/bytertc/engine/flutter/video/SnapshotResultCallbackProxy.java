package com.ss.bytertc.engine.flutter.video;

import android.graphics.Bitmap;
import com.lzy.okgo.model.Progress;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.flutter.base.RTCMap;
import com.ss.bytertc.engine.flutter.event.EventEmitter;
import com.ss.bytertc.engine.video.ISnapshotResultCallback;
import io.flutter.plugin.common.BinaryMessenger;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class SnapshotResultCallbackProxy {
    public static final int ERROR_IMAGE_FORMAT = -103;
    public static final int ERROR_WRITE_FILE_FAILED = -102;
    private final EventEmitter emitter = new EventEmitter();

    public ISnapshotResultCallback createCallback(final String str) {
        return new ISnapshotResultCallback() { // from class: com.ss.bytertc.engine.flutter.video.SnapshotResultCallbackProxy.1
            @Override // com.ss.bytertc.engine.video.ISnapshotResultCallback
            public void onTakeLocalSnapshotResult(long j10, StreamIndex streamIndex, Bitmap bitmap, int i10) {
                HashMap<String, Object> map = new HashMap<>();
                map.put("taskId", Long.valueOf(j10));
                map.put("streamIndex", Integer.valueOf(streamIndex.value()));
                map.put(Progress.E, str);
                map.put("error", Integer.valueOf(i10));
                if (bitmap != null) {
                    map.put("width", Integer.valueOf(bitmap.getWidth()));
                    map.put("height", Integer.valueOf(bitmap.getHeight()));
                }
                SnapshotResultCallbackProxy.this.storeImageToFile(bitmap, str, map);
                SnapshotResultCallbackProxy.this.emitter.emit("onTakeLocalSnapshotResult", map);
            }

            @Override // com.ss.bytertc.engine.video.ISnapshotResultCallback
            public void onTakeRemoteSnapshotResult(long j10, RemoteStreamKey remoteStreamKey, Bitmap bitmap, int i10) {
                HashMap<String, Object> map = new HashMap<>();
                map.put("taskId", Long.valueOf(j10));
                map.put("streamKey", RTCMap.from(remoteStreamKey));
                map.put(Progress.E, str);
                map.put("error", Integer.valueOf(i10));
                if (bitmap != null) {
                    map.put("width", Integer.valueOf(bitmap.getWidth()));
                    map.put("height", Integer.valueOf(bitmap.getHeight()));
                }
                SnapshotResultCallbackProxy.this.storeImageToFile(bitmap, str, map);
                SnapshotResultCallbackProxy.this.emitter.emit("onTakeRemoteSnapshotResult", map);
            }
        };
    }

    public void destroy() {
        this.emitter.destroy();
    }

    public void registerEvent(BinaryMessenger binaryMessenger) {
        this.emitter.registerEvent(binaryMessenger, "com.bytedance.ve_rtc_snapshot_result");
    }

    void storeImageToFile(Bitmap bitmap, String str, HashMap<String, Object> map) {
        if (bitmap == null) {
            map.put("error", -103);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            map.put("error", -102);
        }
    }
}
