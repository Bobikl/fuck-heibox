package com.tencent.liteav.thumbplayer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayer;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener;
import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMsg;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPVideoFrameBuffer;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class ThumbMediaPlayerListener implements ITPPlayerListener.IOnAudioFrameOutputListener, ITPPlayerListener.IOnAudioProcessFrameOutputListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnSeekCompleteListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnStopAsyncCompleteListener, ITPPlayerListener.IOnSubtitleDataListener, ITPPlayerListener.IOnSubtitleFrameOutListener, ITPPlayerListener.IOnVideoFrameOutListener, ITPPlayerListener.IOnVideoProcessFrameOutputListener, ITPPlayerListener.IOnVideoSizeChangedListener {
    private static final int ERROR_DEMUXER_PREPARE_TIMEOUT = 1104;
    private final String TAG = ThumbMediaPlayerListener.class.getName();
    private final ThumbMediaPlayer mThumbMediaPlayer;

    public ThumbMediaPlayerListener(ThumbMediaPlayer thumbMediaPlayer) {
        this.mThumbMediaPlayer = thumbMediaPlayer;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0056  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    private int transferError(int i10, int i11) {
        ThumbMediaPlayer thumbMediaPlayer;
        String propertyString;
        int i12 = TXVodConstants.VOD_PLAY_ERR_GENERAL;
        if (i10 != 1001) {
            if (i10 == 1100) {
                i12 = TXVodConstants.VOD_PLAY_ERR_DEMUXER_FAIL;
                if (i11 >= 11070000 && i11 < 11080000) {
                    i12 = TXVodConstants.VOD_PLAY_ERR_DRM;
                }
            } else if (i10 == 1200) {
                i12 = TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL;
                if (i10 == 1220 && (thumbMediaPlayer = this.mThumbMediaPlayer) != null && (propertyString = thumbMediaPlayer.getTPPPlayer().getPropertyString(0)) != null && (propertyString.toLowerCase().contains("hevc") || propertyString.toLowerCase().contains("h265"))) {
                    i12 = -2304;
                }
            } else if (i10 == 1300) {
                i12 = TXVodConstants.VOD_PLAY_ERR_RENDER_FAIL;
            } else if (i10 == 1600) {
                i12 = TXVodConstants.VOD_PLAY_ERR_PROCESS_VIDEO_FAIL;
            } else if (i10 == 4000) {
                i12 = TXVodConstants.VOD_PLAY_ERR_DOWNLOAD_FAIL;
            } else if (i10 == 1210 || i10 == 1211) {
                i12 = TXVodConstants.VOD_PLAY_ERR_DECODE_AUDIO_FAIL;
            } else if (i10 == 1220 || i10 == 1221) {
                i12 = TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL;
                if (i10 == 1220) {
                    i12 = -2304;
                }
            } else if (i10 == 1230 || i10 == 1231) {
                i12 = TXVodConstants.VOD_PLAY_ERR_DECODE_SUBTITLE_FAIL;
            } else if (i10 == 2000) {
                i12 = TXVodConstants.VOD_PLAY_ERR_SYSTEM_PLAY_FAIL;
            } else if (i10 != 2001) {
                switch (i10) {
                    case 1102:
                        i12 = TXVodConstants.VOD_PLAY_ERR_DEMUXER_FAIL;
                        if (i11 >= 11070000) {
                            i12 = TXVodConstants.VOD_PLAY_ERR_DRM;
                        }
                        break;
                    case 1103:
                    case 1104:
                        i12 = TXVodConstants.VOD_PLAY_ERR_DEMUXER_TIMEOUT;
                        break;
                }
            } else {
                i12 = -2301;
            }
        } else if (i11 == 11010104) {
            i12 = -2305;
        }
        LiteavLog.i(this.TAG, "[transferError], errorType: " + i10 + " ,errorCode: " + i11 + " ,vodErrorEvent: " + i12);
        return i12;
    }

    private int transferInfo(int i10) {
        if (i10 == 4) {
            return 2020;
        }
        if (i10 == 104) {
            return 2008;
        }
        if (i10 == 503) {
            return 2030;
        }
        if (i10 == 1001) {
            LiteavLog.i(this.TAG, "TP_PLAYER_INFO_LONG0_ALL_DOWNLOAD_FINISH");
            ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
            if (thumbMediaPlayer != null) {
                thumbMediaPlayer.updateTcpSpeed(0L);
            }
        } else {
            if (i10 == 1006) {
                return 1006;
            }
            if (i10 == 1018) {
                return 2002;
            }
            if (i10 == 106) {
                ThumbMediaPlayer thumbMediaPlayer2 = this.mThumbMediaPlayer;
                if (thumbMediaPlayer2 != null) {
                    thumbMediaPlayer2.onReceiveFirstVideoRenderEvent();
                }
            } else if (i10 == 107) {
                ThumbMediaPlayer thumbMediaPlayer3 = this.mThumbMediaPlayer;
                if (thumbMediaPlayer3 != null) {
                    thumbMediaPlayer3.onReceiveFirstPacketReadEvent();
                }
            } else {
                if (i10 == 200) {
                    return 2007;
                }
                if (i10 == 201) {
                    return 2014;
                }
            }
        }
        return -1;
    }

    void attachToPlayer() {
        ITPPlayer tPPPlayer;
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer == null || (tPPPlayer = thumbMediaPlayer.getTPPPlayer()) == null) {
            return;
        }
        tPPPlayer.setOnPreparedListener(this);
        tPPPlayer.setOnCompletionListener(this);
        tPPPlayer.setOnInfoListener(this);
        tPPPlayer.setOnErrorListener(this);
        tPPPlayer.setOnSeekCompleteListener(this);
        tPPPlayer.setOnVideoSizeChangedListener(this);
        tPPPlayer.setOnSubtitleDataListener(this);
        tPPPlayer.setOnSubtitleFrameOutListener(this);
        tPPPlayer.setOnVideoFrameOutListener(this);
        tPPPlayer.setOnAudioFrameOutputListener(this);
        tPPPlayer.setOnVideoProcessFrameOutputListener(this);
        tPPPlayer.setOnAudioProcessFrameOutputListener(this);
        tPPPlayer.setOnPlayerStateChangeListener(this);
        tPPPlayer.setOnStopAsyncCompleteListener(this);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnAudioFrameOutputListener
    public void onAudioFrameOut(ITPPlayer iTPPlayer, TPAudioFrameBuffer tPAudioFrameBuffer) {
        LiteavLog.i(this.TAG, "ThumbMediaPlayerListener onAudioFrameOut");
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener
    public TPPostProcessFrameBuffer onAudioProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return tPPostProcessFrameBuffer;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(ITPPlayer iTPPlayer) {
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer != null) {
            thumbMediaPlayer.notifyOnCompletion();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnErrorListener
    public void onError(ITPPlayer iTPPlayer, int i10, int i11, long j10, long j11) {
        if (i10 != 1000) {
            LiteavLog.w(this.TAG, "onError type: " + i10 + " code: " + i11 + " arg1: " + j10 + " arg2: " + j11);
            ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
            if (thumbMediaPlayer != null) {
                thumbMediaPlayer.notifyOnError(transferError(i10, i11), i11);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(ITPPlayer iTPPlayer, int i10, long j10, long j11, Object obj) {
        String str;
        String[] strArrSplit;
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer != null) {
            int iTransferInfo = transferInfo(i10);
            int i11 = (int) j10;
            if (obj != null && (obj instanceof TPPlayerMsg.TPCDNURLInfo)) {
                TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = (TPPlayerMsg.TPCDNURLInfo) obj;
                LiteavLog.i(this.TAG, "onInfo TPCDNURLInfo:cdnIp:" + tPCDNURLInfo.cdnIp + ":uIp:" + tPCDNURLInfo.uIp + ": url: " + tPCDNURLInfo.url + ":errorStr: " + tPCDNURLInfo.errorStr);
            }
            if (obj != null && (obj instanceof TPPlayerMsg.TPDownLoadProgressInfo)) {
                TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = (TPPlayerMsg.TPDownLoadProgressInfo) obj;
                thumbMediaPlayer.updateBitrate(tPDownLoadProgressInfo.totalFileSize);
                long jLongValue = tPDownLoadProgressInfo.downloadSpeedKBps;
                if (jLongValue < 0 && (str = tPDownLoadProgressInfo.extraInfo) != null && (strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) != null) {
                    for (String str2 : strArrSplit) {
                        if (str2 != null && str2.contains("httpAvgSpeedKB")) {
                            jLongValue = Long.valueOf(str2.substring(str2.indexOf(":") + 1, str2.length()).trim()).longValue();
                            break;
                        }
                    }
                }
                thumbMediaPlayer.updateTcpSpeed(jLongValue * 1024);
            }
            if (obj instanceof TPPlayerMsg.TPVideoCropInfo) {
                TPPlayerMsg.TPVideoCropInfo tPVideoCropInfo = (TPPlayerMsg.TPVideoCropInfo) obj;
                LiteavLog.i(this.TAG, "onInfo TPVideoCropInfo:cropBottom:" + tPVideoCropInfo.cropBottom + ":cropLeft:" + tPVideoCropInfo.cropLeft + ": cropRight: " + tPVideoCropInfo.cropRight + ":cropTop: " + tPVideoCropInfo.cropTop + ":height:" + tPVideoCropInfo.height + ":width:" + tPVideoCropInfo.width);
            }
            thumbMediaPlayer.notifyOnInfo(iTransferInfo, i11, (int) j11, obj);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(ITPPlayer iTPPlayer) {
        LiteavLog.i(this.TAG, "ThumbMediaPlayerListener onPrepared");
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer != null) {
            thumbMediaPlayer.notifyOnPrepared();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(ITPPlayer iTPPlayer) {
        LiteavLog.i(this.TAG, "ThumbMediaPlayerListener onSeekComplete");
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer != null) {
            thumbMediaPlayer.notifyOnSeekComplete();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i10, int i11) {
        LiteavLog.i(this.TAG, "ThumbMediaPlayerListener onStateChange:preState" + i10 + ": curState:" + i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnStopAsyncCompleteListener
    public void onStopAsyncComplete(ITPPlayer iTPPlayer) {
        LiteavLog.i(this.TAG, "ThumbMediaPlayerListener onStopAsyncComplete");
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSubtitleDataListener
    public void onSubtitleData(ITPPlayer iTPPlayer, TPSubtitleData tPSubtitleData) {
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer == null || tPSubtitleData == null) {
            return;
        }
        thumbMediaPlayer.notifyOnSubtitleData(tPSubtitleData);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnSubtitleFrameOutListener
    public void onSubtitleFrameOut(ITPPlayer iTPPlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer != null) {
            thumbMediaPlayer.notifySubtitleFrameData(tPSubtitleFrameBuffer);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoFrameOutListener
    public void onVideoFrameOut(ITPPlayer iTPPlayer, TPVideoFrameBuffer tPVideoFrameBuffer) {
        LiteavLog.i(this.TAG, "ThumbMediaPlayerListener onVideoFrameOut");
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener
    public TPPostProcessFrameBuffer onVideoProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        LiteavLog.i(this.TAG, "ThumbMediaPlayerListener onVideoProcessFrameOut");
        return tPPostProcessFrameBuffer;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j10, long j11) {
        ThumbMediaPlayer thumbMediaPlayer = this.mThumbMediaPlayer;
        if (thumbMediaPlayer != null) {
            LiteavLog.i(this.TAG, "ThumbMediaPlayerListener on:videoSizeChanged:width:" + j10 + ":height:" + j11);
            thumbMediaPlayer.notifyOnVideoSizeChanged((int) j10, (int) j11, thumbMediaPlayer.getVideoSarNum(), thumbMediaPlayer.getVideoSarDen(), null);
        }
    }
}
