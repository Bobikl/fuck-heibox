package com.ss.bytertc.engine.video;

import android.util.SparseArray;
import bb.c;
import com.ss.bytertc.engine.VideoStreamDescription;
import com.ss.bytertc.engine.data.RTCData;

/* JADX INFO: loaded from: classes4.dex */
public class VideoProfile {
    private static SparseArray<VideoPreset> sVideoProfileMap;

    static {
        SparseArray<VideoPreset> sparseArray = new SparseArray<>();
        sVideoProfileMap = sparseArray;
        sparseArray.put(0, new VideoPreset(160, 120, 15, 65));
        sVideoProfileMap.put(2, new VideoPreset(120, 120, 15, 50));
        sVideoProfileMap.put(10, new VideoPreset(c.b.f30693i3, 180, 15, 140));
        sVideoProfileMap.put(12, new VideoPreset(180, 180, 15, 100));
        sVideoProfileMap.put(13, new VideoPreset(240, 180, 15, 120));
        sVideoProfileMap.put(14, new VideoPreset(240, 180, 15, 240));
        sVideoProfileMap.put(20, new VideoPreset(c.b.f30693i3, 240, 15, 200));
        sVideoProfileMap.put(21, new VideoPreset(c.b.f30693i3, 240, 15, 360));
        sVideoProfileMap.put(22, new VideoPreset(240, 240, 15, 140));
        sVideoProfileMap.put(23, new VideoPreset(424, 240, 15, 220));
        sVideoProfileMap.put(30, new VideoPreset(c.b.f30883q9, 360, 15, 600));
        sVideoProfileMap.put(32, new VideoPreset(360, 360, 15, c.b.f30507a2));
        sVideoProfileMap.put(33, new VideoPreset(c.b.f30883q9, 360, 30, 600));
        sVideoProfileMap.put(34, new VideoPreset(c.b.f30883q9, 360, 15, 800));
        sVideoProfileMap.put(35, new VideoPreset(360, 360, 30, 400));
        sVideoProfileMap.put(36, new VideoPreset(480, 360, 15, c.b.f30693i3));
        sVideoProfileMap.put(37, new VideoPreset(480, 360, 30, c.b.f31012w6));
        sVideoProfileMap.put(40, new VideoPreset(c.b.f30883q9, 480, 15, 500));
        sVideoProfileMap.put(42, new VideoPreset(480, 480, 15, 400));
        sVideoProfileMap.put(43, new VideoPreset(c.b.f30883q9, 480, 30, c.b.f31017wb));
        sVideoProfileMap.put(45, new VideoPreset(480, 480, 30, 600));
        sVideoProfileMap.put(46, new VideoPreset(c.b.f30887qd, 480, 15, 1200));
        sVideoProfileMap.put(47, new VideoPreset(c.b.f30887qd, 480, 30, 800));
        sVideoProfileMap.put(48, new VideoPreset(c.b.f30887qd, 480, 30, c.b.Ue));
        sVideoProfileMap.put(50, new VideoPreset(1280, 720, 15, c.b.Mi));
        sVideoProfileMap.put(52, new VideoPreset(1280, 720, 30, c.b.Vt));
        sVideoProfileMap.put(54, new VideoPreset(c.b.f31065yf, 720, 15, 910));
        sVideoProfileMap.put(55, new VideoPreset(c.b.f31065yf, 720, 30, c.b.Cn));
    }

    public static void addVideoVideoPreset(int i10, VideoPreset videoPreset) {
        sVideoProfileMap.put(i10, videoPreset);
    }

    public static VideoPreset getVideoVideoPreset() {
        int iIntValue = 0;
        int iIntValue2 = 0;
        int i10 = 0;
        int i11 = 0;
        for (VideoStreamDescription videoStreamDescription : RTCData.instance().getVideoStreamDescriptions()) {
            if (((Integer) videoStreamDescription.videoSize.first).intValue() > iIntValue) {
                iIntValue = ((Integer) videoStreamDescription.videoSize.first).intValue();
            }
            if (((Integer) videoStreamDescription.videoSize.second).intValue() > iIntValue2) {
                iIntValue2 = ((Integer) videoStreamDescription.videoSize.second).intValue();
            }
            int i12 = videoStreamDescription.frameRate;
            if (i12 > i10) {
                i10 = i12;
            }
            int i13 = videoStreamDescription.maxKbps;
            if (i13 > i11) {
                i11 = i13;
            }
        }
        return new VideoPreset(iIntValue, iIntValue2, i10, i11);
    }

    public static VideoPreset getVideoVideoPresetById(int i10) {
        VideoPreset videoPreset = sVideoProfileMap.get(i10);
        return videoPreset == null ? sVideoProfileMap.get(33) : videoPreset;
    }

    public static SparseArray<VideoPreset> getsVideoProfileMap() {
        return sVideoProfileMap;
    }
}
