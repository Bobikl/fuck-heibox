package com.tencent.thumbplayer.tcmedia.core.player;

import android.content.Context;
import android.view.Surface;
import com.tencent.thumbplayer.tcmedia.core.common.TPAudioPassThroughPluginDetector;
import com.tencent.thumbplayer.tcmedia.core.common.TPGeneralError;
import com.tencent.thumbplayer.tcmedia.core.common.TPHeadsetPluginDetector;
import com.tencent.thumbplayer.tcmedia.core.common.TPMediaTrackDashFormat;
import com.tencent.thumbplayer.tcmedia.core.common.TPMediaTrackHlsTag;
import com.tencent.thumbplayer.tcmedia.core.common.TPMediaTrackInfo;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import com.tencent.thumbplayer.tcmedia.core.common.TPScreenRefreshRateDetector;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.core.demuxer.ITPNativeDemuxerCallback;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: loaded from: classes4.dex */
public class TPNativePlayer {
    private Context mContext;
    private long mNativeContext;
    private int m_playerID;

    public TPNativePlayer(Context context) {
        this.m_playerID = -1;
        this.mContext = null;
        this.mContext = context.getApplicationContext();
        TPNativeLibraryLoader.loadLibIfNeeded(context);
        try {
            this.m_playerID = _createPlayer();
            TPHeadsetPluginDetector.init(this.mContext);
            TPAudioPassThroughPluginDetector.init(this.mContext);
            TPScreenRefreshRateDetector.init(this.mContext);
            TPSystemInfo.initAudioBestSettings(this.mContext);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, "Failed to create native player:" + th2.getMessage());
            throw new UnsupportedOperationException("Failed to create native player");
        }
    }

    private native int _addAudioTrackSource(String str, String str2);

    private native int _addAudioTrackSourceWithHttpHeader(String str, String str2, Object[] objArr);

    private native int _addInitConfigQueueInt(int i10, int i11);

    private native int _addInitConfigQueueString(int i10, String str);

    private native int _addSubtitleTrackSource(String str, String str2);

    private native int _addSubtitleTrackSourceWithHttpHeader(String str, String str2, Object[] objArr);

    private native int _applyInitConfig();

    private native int _createPlayer();

    private native int _deselectTrackAsync(int i10, long j10);

    private native long _getBufferedDurationMs();

    private native long _getBufferedSize();

    private native int _getContainerType(int i10);

    private native long _getCurrentPositionMs();

    private native long[] _getDemuxerOffsetInFile();

    private native long _getDurationMs();

    private native TPDynamicStatisticParams _getDynamicStatisticParams(boolean z10);

    private native TPGeneralPlayFlowParams _getGeneralPlayFlowParams();

    private static native Object _getPlayerCoreParams(int i10);

    private native int _getPlayerID();

    private native int _getProgramCount();

    private native TPNativePlayerProgramInfo _getProgramInfo(int i10);

    private native long _getPropertyLong(int i10);

    private native String _getPropertyString(int i10);

    private native int _getTrackCount();

    private native TPMediaTrackDashFormat _getTrackDashFormat(int i10);

    private native TPNativePlayerHlsTag _getTrackHlsTag(int i10);

    private native boolean _getTrackIsExclusive(int i10);

    private native boolean _getTrackIsInternal(int i10);

    private native boolean _getTrackIsSelected(int i10);

    private native String _getTrackName(int i10);

    private native int _getTrackType(int i10);

    private native int _getVideoHeight();

    private native int _getVideoWidth();

    private native int _pause();

    private native int _prepare();

    private native int _prepareAsync();

    private native int _release();

    private native int _reset();

    private native int _resetInitConfig();

    private native int _resume();

    private native int _seekToAsync(int i10, int i11, long j10);

    private native int _selectProgramAsync(int i10, long j10);

    private native int _selectTrackAsync(int i10, long j10);

    private native int _setAudioFrameCallback(Object obj);

    private native int _setAudioMute(boolean z10);

    private native int _setAudioNormalizeVolumeParams(String str);

    private native int _setAudioVolume(float f10);

    private native int _setDataSource(String str);

    private native int _setDataSourceFd(int i10, long j10, long j11);

    private native int _setDataSourceWithHttpHeader(String str, Object[] objArr);

    private native int _setDemuxerCallback(Object obj);

    private native int _setEventRecordCallback(Object obj);

    private native int _setInitConfigBool(int i10, boolean z10);

    private native int _setInitConfigFloat(int i10, float f10);

    private native int _setInitConfigInt(int i10, int i11);

    private native int _setInitConfigLong(int i10, long j10);

    private native int _setInitConfigObject(int i10, Object obj);

    private native int _setInitConfigString(int i10, String str);

    private native int _setLoopback(boolean z10, long j10, long j11);

    private native int _setMessageCallback(Object obj);

    private native int _setOptionLong(int i10, long j10, long j11);

    private native int _setOptionObject(int i10, Object obj);

    private native int _setPlaybackRate(float f10);

    private native int _setPostProcessFrameCallback(Object obj);

    private native int _setSubtitleFrameCallback(Object obj);

    private native int _setVideoFrameCallback(Object obj);

    private native int _setVideoSurface(Surface surface);

    private native int _setVideoSurfaceWithType(Surface surface, int i10);

    private native int _start();

    private native int _stop();

    private native int _switchDefinitionAsync(String str, int i10, long j10);

    private native int _switchDefinitionAsyncWithHttpHeader(String str, Object[] objArr, int i10, long j10);

    public int addAudioTrackSource(String str, String str2) {
        try {
            return _addAudioTrackSource(str, str2);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int addAudioTrackSource(String str, String str2, Map<String, String> map) {
        try {
            return _addAudioTrackSourceWithHttpHeader(str, str2, TPNativePlayerUtils.tpMapStringToStringArray(map));
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int addSubtitleTrackSource(String str, String str2) {
        try {
            return _addSubtitleTrackSource(str, str2);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int addSubtitleTrackSource(String str, String str2, Map<String, String> map) {
        try {
            return _addSubtitleTrackSourceWithHttpHeader(str, str2, TPNativePlayerUtils.tpMapStringToStringArray(map));
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int deselectTrackAsync(int i10, long j10) {
        try {
            return _deselectTrackAsync(i10, j10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public long getBufferedDurationMs() {
        try {
            return _getBufferedDurationMs();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return 0L;
        }
    }

    public long getBufferedSize() {
        try {
            return _getBufferedSize();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return 0L;
        }
    }

    public long getCurrentPositionMs() {
        try {
            return _getCurrentPositionMs();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return 0L;
        }
    }

    public long[] getDemuxerOffsetInFile() {
        try {
            return _getDemuxerOffsetInFile();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return new long[]{-1, -1};
        }
    }

    public long getDurationMs() {
        try {
            return _getDurationMs();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return 0L;
        }
    }

    public TPDynamicStatisticParams getDynamicStatisticParams(boolean z10) {
        try {
            return _getDynamicStatisticParams(z10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return null;
        }
    }

    public TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
        try {
            return _getGeneralPlayFlowParams();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return null;
        }
    }

    public Object getPlayerCoreParams(int i10) {
        return null;
    }

    public int getPlayerID() {
        try {
            return _getPlayerID();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return 0;
        }
    }

    public int getProgramCount() {
        try {
            return _getProgramCount();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public TPNativePlayerProgramInfo[] getProgramInfo() {
        try {
            int i_getProgramCount = _getProgramCount();
            TPNativePlayerProgramInfo[] tPNativePlayerProgramInfoArr = new TPNativePlayerProgramInfo[i_getProgramCount];
            for (int i10 = 0; i10 < i_getProgramCount; i10++) {
                tPNativePlayerProgramInfoArr[i10] = _getProgramInfo(i10);
            }
            return tPNativePlayerProgramInfoArr;
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return null;
        }
    }

    public long getPropertyLong(int i10) {
        try {
            return _getPropertyLong(i10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return 0L;
        }
    }

    public String getPropertyString(int i10) {
        try {
            return _getPropertyString(i10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return "";
        }
    }

    public TPMediaTrackInfo[] getTrackInfo() {
        try {
            int i_getTrackCount = _getTrackCount();
            if (i_getTrackCount <= 0) {
                return null;
            }
            TPMediaTrackInfo[] tPMediaTrackInfoArr = new TPMediaTrackInfo[i_getTrackCount];
            for (int i10 = 0; i10 < i_getTrackCount; i10++) {
                TPMediaTrackInfo tPMediaTrackInfo = new TPMediaTrackInfo();
                tPMediaTrackInfoArr[i10] = tPMediaTrackInfo;
                tPMediaTrackInfo.trackType = _getTrackType(i10);
                tPMediaTrackInfoArr[i10].contianerType = _getContainerType(i10);
                tPMediaTrackInfoArr[i10].trackName = _getTrackName(i10);
                tPMediaTrackInfoArr[i10].isSelected = _getTrackIsSelected(i10);
                tPMediaTrackInfoArr[i10].isExclusive = _getTrackIsExclusive(i10);
                tPMediaTrackInfoArr[i10].isInternal = _getTrackIsInternal(i10);
                TPMediaTrackInfo tPMediaTrackInfo2 = tPMediaTrackInfoArr[i10];
                int i11 = tPMediaTrackInfo2.contianerType;
                if (i11 == 1) {
                    TPNativePlayerHlsTag tPNativePlayerHlsTag_getTrackHlsTag = _getTrackHlsTag(i10);
                    TPMediaTrackHlsTag tPMediaTrackHlsTag = tPMediaTrackInfoArr[i10].hlsTag;
                    tPMediaTrackHlsTag.name = tPNativePlayerHlsTag_getTrackHlsTag.name;
                    tPMediaTrackHlsTag.language = tPNativePlayerHlsTag_getTrackHlsTag.language;
                    tPMediaTrackHlsTag.groupId = tPNativePlayerHlsTag_getTrackHlsTag.groupId;
                    tPMediaTrackHlsTag.resolution = tPNativePlayerHlsTag_getTrackHlsTag.resolution;
                    tPMediaTrackHlsTag.codecs = tPNativePlayerHlsTag_getTrackHlsTag.codecs;
                    tPMediaTrackHlsTag.framerate = tPNativePlayerHlsTag_getTrackHlsTag.framerate;
                    tPMediaTrackHlsTag.bandwidth = tPNativePlayerHlsTag_getTrackHlsTag.bandwidth;
                } else if (i11 == 2) {
                    tPMediaTrackInfo2.dashFormat = _getTrackDashFormat(i10);
                }
            }
            return tPMediaTrackInfoArr;
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return null;
        }
    }

    public int getVideoHeight() {
        try {
            return _getVideoHeight();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return 0;
        }
    }

    public int getVideoWidth() {
        try {
            return _getVideoWidth();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return 0;
        }
    }

    public int pause() {
        try {
            return _pause();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int prepare() {
        try {
            return _prepare();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int prepareAsync() {
        try {
            return _prepareAsync();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public void release() {
        try {
            _release();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    public void reset() {
        try {
            _reset();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    public int seekToAsync(int i10, int i11, long j10) {
        try {
            return _seekToAsync(i10, i11, j10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int selectProgramAsync(int i10, long j10) {
        try {
            return _selectProgramAsync(i10, j10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int selectTrackAsync(int i10, long j10) {
        try {
            return _selectTrackAsync(i10, j10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setAudioFrameCallback(ITPNativePlayerAudioFrameCallback iTPNativePlayerAudioFrameCallback) {
        try {
            return _setAudioFrameCallback(iTPNativePlayerAudioFrameCallback);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setAudioMute(boolean z10) {
        try {
            return _setAudioMute(z10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setAudioNormalizeVolumeParams(String str) {
        try {
            return _setAudioNormalizeVolumeParams(str);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setAudioVolume(float f10) {
        try {
            return _setAudioVolume(f10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setDataSource(int i10, long j10, long j11) {
        try {
            return _setDataSourceFd(i10, j10, j11);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setDataSource(String str) {
        try {
            return _setDataSource(str);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setDataSource(String str, Map<String, String> map) {
        try {
            return _setDataSourceWithHttpHeader(str, TPNativePlayerUtils.tpMapStringToStringArray(map));
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setDemuxerCallback(ITPNativeDemuxerCallback iTPNativeDemuxerCallback) {
        try {
            return _setDemuxerCallback(iTPNativeDemuxerCallback);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setEventRecordCallback(ITPNativePlayerEventRecordCallback iTPNativePlayerEventRecordCallback) {
        try {
            return _setEventRecordCallback(iTPNativePlayerEventRecordCallback);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public void setInitConfig(TPNativePlayerInitConfig tPNativePlayerInitConfig) {
        try {
            _resetInitConfig();
            HashMap<Integer, Integer> intMap = tPNativePlayerInitConfig.getIntMap();
            HashMap<Integer, Long> longMap = tPNativePlayerInitConfig.getLongMap();
            HashMap<Integer, Float> floatMap = tPNativePlayerInitConfig.getFloatMap();
            HashMap<Integer, Boolean> boolMap = tPNativePlayerInitConfig.getBoolMap();
            HashMap<Integer, Vector<Integer>> queueIntMap = tPNativePlayerInitConfig.getQueueIntMap();
            HashMap<Integer, Object> objectMap = tPNativePlayerInitConfig.getObjectMap();
            HashMap<Integer, String> stringMap = tPNativePlayerInitConfig.getStringMap();
            for (Map.Entry<Integer, Integer> entry : intMap.entrySet()) {
                _setInitConfigInt(entry.getKey().intValue(), entry.getValue().intValue());
            }
            for (Map.Entry<Integer, Long> entry2 : longMap.entrySet()) {
                _setInitConfigLong(entry2.getKey().intValue(), entry2.getValue().longValue());
            }
            for (Map.Entry<Integer, Float> entry3 : floatMap.entrySet()) {
                _setInitConfigFloat(entry3.getKey().intValue(), entry3.getValue().floatValue());
            }
            for (Map.Entry<Integer, Boolean> entry4 : boolMap.entrySet()) {
                _setInitConfigBool(entry4.getKey().intValue(), entry4.getValue().booleanValue());
            }
            for (Map.Entry<Integer, Object> entry5 : objectMap.entrySet()) {
                _setInitConfigObject(entry5.getKey().intValue(), entry5.getValue());
            }
            for (Map.Entry<Integer, Vector<Integer>> entry6 : queueIntMap.entrySet()) {
                Vector<Integer> value = entry6.getValue();
                if (value != null) {
                    Iterator<Integer> it = value.iterator();
                    while (it.hasNext()) {
                        _addInitConfigQueueInt(entry6.getKey().intValue(), it.next().intValue());
                    }
                }
            }
            for (Map.Entry<Integer, String> entry7 : stringMap.entrySet()) {
                String value2 = entry7.getValue();
                _setInitConfigString(entry7.getKey().intValue(), value2 != null ? value2 : null);
            }
            for (Map.Entry<Integer, Vector<String>> entry8 : tPNativePlayerInitConfig.getQueueStringMap().entrySet()) {
                Vector<String> value3 = entry8.getValue();
                if (value3 != null) {
                    Iterator<String> it2 = value3.iterator();
                    while (it2.hasNext()) {
                        _addInitConfigQueueString(entry8.getKey().intValue(), it2.next());
                    }
                }
            }
            _applyInitConfig();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    public int setLoopback(boolean z10, long j10, long j11) {
        try {
            return _setLoopback(z10, j10, j11);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setMessageCallback(ITPNativePlayerMessageCallback iTPNativePlayerMessageCallback) {
        try {
            return _setMessageCallback(iTPNativePlayerMessageCallback);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setOptionLong(int i10, long j10, long j11) {
        try {
            return _setOptionLong(i10, j10, j11);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setOptionObject(int i10, Object obj) {
        try {
            return _setOptionObject(i10, obj);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setPlaybackRate(float f10) {
        try {
            return _setPlaybackRate(f10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setPostProcessFrameCallback(ITPNativePlayerPostProcessFrameCallback iTPNativePlayerPostProcessFrameCallback) {
        try {
            return _setPostProcessFrameCallback(iTPNativePlayerPostProcessFrameCallback);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setSubtitleFrameCallback(ITPNativePlayerSubtitleFrameCallback iTPNativePlayerSubtitleFrameCallback) {
        try {
            return _setSubtitleFrameCallback(iTPNativePlayerSubtitleFrameCallback);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setVideoFrameCallback(ITPNativePlayerVideoFrameCallback iTPNativePlayerVideoFrameCallback) {
        try {
            return _setVideoFrameCallback(iTPNativePlayerVideoFrameCallback);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setVideoSurface(Surface surface) {
        try {
            return _setVideoSurface(surface);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setVideoSurfaceWithType(Surface surface, int i10) {
        try {
            return _setVideoSurfaceWithType(surface, i10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int start() {
        try {
            return _start();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int stop() {
        try {
            return _stop();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int switchDefinitionAsync(String str, int i10, long j10) {
        try {
            return _switchDefinitionAsync(str, i10, j10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    @Deprecated
    public int switchDefinitionAsync(String str, long j10) {
        return switchDefinitionAsync(str, 0, j10);
    }

    public int switchDefinitionAsync(String str, Map<String, String> map, int i10, long j10) {
        try {
            return _switchDefinitionAsyncWithHttpHeader(str, TPNativePlayerUtils.tpMapStringToStringArray(map), i10, j10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return TPGeneralError.FAILED;
        }
    }
}
