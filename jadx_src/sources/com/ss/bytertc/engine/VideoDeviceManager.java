package com.ss.bytertc.engine;

import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.IVideoDeviceManager;
import com.ss.bytertc.engine.video.VideoDeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class VideoDeviceManager implements IVideoDeviceManager {
    private static final String TAG = "VideoDeviceManager";
    private long mVideoDevicemanager;

    public VideoDeviceManager(long j10) {
        this.mVideoDevicemanager = j10;
    }

    @Override // com.ss.bytertc.engine.video.IVideoDeviceManager
    public List<VideoDeviceInfo> enumerateVideoCaptureDevices() {
        long j10 = this.mVideoDevicemanager;
        if (j10 != 0) {
            return NativeVideoDeviceManagerFunctions.nativeEnumerateVideoCaptureDevices(j10);
        }
        LogUtil.e(TAG, "native VideoDeviceManager is invalid, enumerateVideoCaptureDevices failed.");
        return null;
    }

    @Override // com.ss.bytertc.engine.video.IVideoDeviceManager
    public int setVideoCaptureDevice(String str) {
        long j10 = this.mVideoDevicemanager;
        if (j10 != 0) {
            return NativeVideoDeviceManagerFunctions.nativeSetVideoCaptureDevice(j10, str);
        }
        LogUtil.e(TAG, "native VideoDeviceManager is invalid, setVideoCaptureDevice failed.");
        return -1;
    }
}
