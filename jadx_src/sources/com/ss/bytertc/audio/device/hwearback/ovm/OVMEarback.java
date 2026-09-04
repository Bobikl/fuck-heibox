package com.ss.bytertc.audio.device.hwearback.ovm;

import android.content.Context;
import com.bytedance.realx.base.RXLogging;
import com.ss.bytertc.audio.device.base.ManufacturerChecker;
import com.ss.bytertc.audio.device.hwearback.BaseEarback;
import com.ss.bytertc.audio.device.hwearback.SlientPlayer;
import com.ss.bytertc.audio.device.webrtc.WebRtcAudioEarBack;
import java.util.List;
import org.json.JSONObject;
import z5.g;

/* JADX INFO: loaded from: classes10.dex */
public class OVMEarback extends BaseEarback {
    private static final int EVENT_KEY_RECORDING_START = 1100;
    private static final int EVENT_KEY_RECORDING_STOP = 1103;
    private static final String TAG = "OVMEarback";
    private final OVMClient client;
    private boolean isAudioParamsSupported;
    private boolean isRecordingStarted;
    private final SlientPlayer slientPlayer;

    public OVMEarback(Context context, WebRtcAudioEarBack webRtcAudioEarBack) {
        super(context, webRtcAudioEarBack);
        this.isRecordingStarted = true;
        this.isAudioParamsSupported = false;
        this.client = OVMClient.initialize(context);
        this.slientPlayer = new SlientPlayer();
    }

    private boolean checkAudioParams() {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        StringBuffer stringBuffer = new StringBuffer();
        String karaokeSupportParameters = this.client.getKaraokeSupportParameters();
        stringBuffer.append("parse params: ");
        stringBuffer.append(this.client.getKaraokeSupportParameters());
        HardwareEarbackParams hardwareEarbackParams = new DefaultHardwareParamsParser().parse(karaokeSupportParameters);
        if (hardwareEarbackParams != null) {
            List<HardwareEarbackParams.Play> list = hardwareEarbackParams.playParamsList;
            int i12 = 48000;
            int i13 = 2;
            if (list == null || list.size() <= 0) {
                stringBuffer.append(", playout params parsed null.");
                z11 = false;
            } else {
                stringBuffer.append(", playout params size: ");
                stringBuffer.append(hardwareEarbackParams.playParamsList.size());
                boolean z12 = false;
                for (HardwareEarbackParams.Play play : hardwareEarbackParams.playParamsList) {
                    stringBuffer.append("{");
                    stringBuffer.append("streamType: ");
                    stringBuffer.append(play.streamType);
                    stringBuffer.append(", sampleRate: ");
                    stringBuffer.append(play.sampleRate);
                    stringBuffer.append(", format: ");
                    stringBuffer.append(play.format);
                    stringBuffer.append(", flags: ");
                    stringBuffer.append(play.flags);
                    stringBuffer.append(g.f141884d);
                    boolean z13 = play.streamType == 3 && play.format == 2 && ((i11 = play.sampleRate) == 44100 || i11 == i12);
                    if (ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.XM || ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.RM) {
                        z13 &= play.version > 0;
                    }
                    z12 |= z13;
                    if (z12) {
                        RXLogging.i(TAG, "updating slientPlayer params: " + play.sampleRate + ", " + play.flags);
                        this.slientPlayer.setSampleRate(play.sampleRate);
                        this.slientPlayer.setRequireDeepBuffer((play.flags & 8) == 8);
                        break;
                    }
                    i12 = 48000;
                }
                z11 = true & z12;
            }
            List<HardwareEarbackParams.Record> list2 = hardwareEarbackParams.recordParamsList;
            if (list2 == null || list2.size() <= 0) {
                stringBuffer.append(", record params parsed null.");
                z10 = false;
            } else {
                stringBuffer.append(", record params size: ");
                stringBuffer.append(hardwareEarbackParams.recordParamsList.size());
                boolean z14 = false;
                for (HardwareEarbackParams.Record record : hardwareEarbackParams.recordParamsList) {
                    stringBuffer.append("{");
                    stringBuffer.append("sampleRate: ");
                    stringBuffer.append(record.sampleRate);
                    stringBuffer.append(", format: ");
                    stringBuffer.append(record.format);
                    stringBuffer.append(", audioSource: ");
                    stringBuffer.append(record.source);
                    stringBuffer.append(", flags: ");
                    stringBuffer.append(record.flags);
                    stringBuffer.append(g.f141884d);
                    boolean z15 = record.format == i13 && record.sampleRate == 48000 && ((i10 = record.source) == 1 || i10 == 0) && (record.flags & 1) == 1;
                    if (ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.XM || ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.RM) {
                        z15 &= record.version > 0;
                    }
                    z14 |= z15;
                    i13 = 2;
                }
                z10 = z11 & z14;
            }
        } else {
            z10 = false;
        }
        stringBuffer.append(", canOpenEarback: ");
        stringBuffer.append(z10);
        RXLogging.i(TAG, stringBuffer.toString());
        return z10;
    }

    private String getReportParameters() {
        String karaokeSupportParameters = this.client.getKaraokeSupportParameters();
        try {
            JSONObject jSONObject = new JSONObject(karaokeSupportParameters);
            jSONObject.put("version", this.client.getVersion());
            return jSONObject.toString();
        } catch (Throwable unused) {
            RXLogging.e(TAG, "parse report params error, not json format");
            return karaokeSupportParameters;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInit$0(int i10) {
        RXLogging.i(TAG, "connection result: " + i10);
        if (i10 != 1001) {
            onInitResult(false);
            return;
        }
        this.client.openKTVDevice();
        this.client.resetKTVParamsAndUpdate();
        this.webRtcAudioEarBack.onHardwareEarbackSupportParamsGet(getReportParameters());
        this.isAudioParamsSupported = checkAudioParams();
        onInitResult(true);
    }

    private synchronized void updatePlayerState() {
        SlientPlayer slientPlayer = this.slientPlayer;
        if (slientPlayer == null) {
            return;
        }
        if ((slientPlayer.isPlaying() && this.isRecordingStarted) || getState() == BaseEarback.EarbackState.RUNNING) {
            this.slientPlayer.play();
        } else {
            this.slientPlayer.stop();
        }
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int getLatency() {
        return -1;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.BaseEarback
    protected boolean onClose() {
        this.client.setPlayFeedbackParam(0);
        return true;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public void onEvent(int i10, int i11) {
        if (i10 == 1100) {
            this.isRecordingStarted = true;
            updatePlayerState();
        } else if (i10 == 1103) {
            this.isRecordingStarted = false;
            updatePlayerState();
        }
    }

    @Override // com.ss.bytertc.audio.device.hwearback.BaseEarback
    protected void onInit() {
        this.client.setAuthCallback(new OVMAuthManager.AuthCallback() { // from class: com.ss.bytertc.audio.device.hwearback.ovm.d
            @Override // com.ss.bytertc.audio.device.hwearback.ovm.OVMAuthManager.AuthCallback
            public final void onResult(int i10) {
                this.f97845a.lambda$onInit$0(i10);
            }
        });
    }

    @Override // com.ss.bytertc.audio.device.hwearback.BaseEarback
    protected boolean onIsSupportCall() {
        return this.client.isSupportedAndAuth() && this.isAudioParamsSupported;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.BaseEarback
    protected boolean onOpen() {
        this.client.setPlayFeedbackParam(1);
        return true;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.BaseEarback
    protected void onRelease() {
        this.client.setPlayFeedbackParam(0);
        this.client.setMixerSoundType(0);
        this.client.setEqualizerType(0);
        this.client.closeKTVDevice();
        this.client.release();
    }

    @Override // com.ss.bytertc.audio.device.hwearback.BaseEarback
    protected synchronized void onStateChanged(BaseEarback.EarbackState earbackState, BaseEarback.EarbackState earbackState2) {
        super.onStateChanged(earbackState, earbackState2);
        updatePlayerState();
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEffect(int i10) {
        this.client.setMixerSoundType(i10);
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEqualizer(int i10) {
        this.client.setEqualizerType(i10);
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setVolume(int i10) {
        int i11 = ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.OP ? 12 : 15;
        this.client.setMicVolParam(Math.max(Math.min((int) ((i10 / 100.0f) * i11), i11), 0));
        return 0;
    }
}
