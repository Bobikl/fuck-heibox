package com.ss.bytertc.engine.video;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface IVideoDeviceManager {
    List<VideoDeviceInfo> enumerateVideoCaptureDevices();

    int setVideoCaptureDevice(String str);
}
