package com.ss.bytertc.engine.flutter.ktv;

import androidx.annotation.RestrictTo;
import com.lzy.okgo.model.Progress;
import com.ss.bytertc.engine.flutter.base.RTCMap;
import com.ss.bytertc.engine.flutter.event.EventEmitter;
import com.ss.bytertc.ktv.IKTVManagerEventHandler;
import com.ss.bytertc.ktv.data.DownloadResult;
import com.ss.bytertc.ktv.data.HotMusicInfo;
import com.ss.bytertc.ktv.data.KTVErrorCode;
import com.ss.bytertc.ktv.data.MusicInfo;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class KTVManagerEventProxy extends IKTVManagerEventHandler {
    private final EventEmitter emitter = new EventEmitter();

    public void destroy() {
        this.emitter.destroy();
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onClearCacheResult(KTVErrorCode kTVErrorCode) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("error", Integer.valueOf(kTVErrorCode.value()));
        this.emitter.emit("onClearCacheResult", map);
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onDownloadFailed(int i10, KTVErrorCode kTVErrorCode) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("downloadId", Integer.valueOf(i10));
        map.put("error", Integer.valueOf(kTVErrorCode.value()));
        this.emitter.emit("onDownloadFailed", map);
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onDownloadMusicProgress(int i10, int i11) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("downloadId", Integer.valueOf(i10));
        map.put("downloadProgress", Integer.valueOf(i11));
        this.emitter.emit("onDownloadMusicProgress", map);
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onDownloadSuccess(int i10, DownloadResult downloadResult) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("downloadId", Integer.valueOf(i10));
        map.put("result", RTCMap.from(downloadResult));
        this.emitter.emit("onDownloadSuccess", map);
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onHotMusicResult(HotMusicInfo[] hotMusicInfoArr, KTVErrorCode kTVErrorCode) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("error", Integer.valueOf(kTVErrorCode.value()));
        List<Map<String, ?>> listFrom = RTCMap.from(hotMusicInfoArr);
        if (listFrom != null) {
            map.put("hotMusics", listFrom);
        }
        this.emitter.emit("onHotMusicResult", map);
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onMusicDetailResult(MusicInfo musicInfo, KTVErrorCode kTVErrorCode) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("error", Integer.valueOf(kTVErrorCode.value()));
        if (musicInfo != null) {
            map.put("musicInfo", RTCMap.from(musicInfo));
        }
        this.emitter.emit("onMusicDetailResult", map);
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onMusicListResult(MusicInfo[] musicInfoArr, int i10, KTVErrorCode kTVErrorCode) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("error", Integer.valueOf(kTVErrorCode.value()));
        map.put(Progress.H, Integer.valueOf(i10));
        List<Map<String, ?>> listFrom = RTCMap.from(musicInfoArr);
        if (listFrom != null) {
            map.put("musicInfos", listFrom);
        }
        this.emitter.emit("onMusicListResult", map);
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onSearchMusicResult(MusicInfo[] musicInfoArr, int i10, KTVErrorCode kTVErrorCode) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("error", Integer.valueOf(kTVErrorCode.value()));
        map.put(Progress.H, Integer.valueOf(i10));
        List<Map<String, ?>> listFrom = RTCMap.from(musicInfoArr);
        if (listFrom != null) {
            map.put("musicInfos", listFrom);
        }
        this.emitter.emit("onSearchMusicResult", map);
    }

    public void registerEvent(BinaryMessenger binaryMessenger) {
        this.emitter.registerEvent(binaryMessenger, "com.bytedance.ve_rtc_ktv_manager_event");
    }
}
