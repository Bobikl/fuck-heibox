package com.tencent.ugc.decoder;

import android.media.MediaCodec;
import android.text.TextUtils;
import com.tencent.liteav.base.storage.PersistStorage;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.base.VideoPersistStorageKey;

/* JADX INFO: loaded from: classes4.dex */
public class DecodeAbilityProvider {
    private static final String TAG = "DecodeAbilityProvider";
    private final com.tencent.liteav.base.util.m mAsyncRunner;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final DecodeAbilityProvider f103469a = new DecodeAbilityProvider();
    }

    private DecodeAbilityProvider() {
        com.tencent.liteav.base.util.m mVar = new com.tencent.liteav.base.util.m();
        this.mAsyncRunner = mVar;
        mVar.a(com.tencent.ugc.decoder.a.a(this));
    }

    public static DecodeAbilityProvider getInstance() {
        return a.f103469a;
    }

    private int getMediaCodecSupportColorFormat(String str) {
        int i10;
        int i11 = 0;
        try {
            int[] iArr = MediaCodec.createDecoderByType(str).getCodecInfo().getCapabilitiesForType(str).colorFormats;
            int length = iArr.length;
            int i12 = 0;
            while (true) {
                i10 = 21;
                if (i12 >= length) {
                    i10 = 0;
                    break;
                }
                int i13 = iArr[i12];
                if (i13 != 19) {
                    if (i13 == 21) {
                        break;
                    }
                    i12++;
                } else {
                    i10 = 19;
                    break;
                }
            }
            try {
                LiteavLog.i(TAG, "decoder(%s) support color format %d ", str, Integer.valueOf(i10));
                return i10;
            } catch (Throwable th2) {
                th = th2;
                i11 = i10;
                LiteavLog.e(TAG, "get support color format error ", th);
                return i11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDecoderAbility() {
        PersistStorage persistStorage = new PersistStorage(PersistStorage.GLOBAL_DOMAIN);
        int mediaCodecSupportColorFormat = getMediaCodecSupportColorFormat("video/avc");
        if (mediaCodecSupportColorFormat > 0) {
            persistStorage.put(VideoPersistStorageKey.CONFIG_KEY_LOCAL_DECODER_AVC_COLOR_FORMAT, mediaCodecSupportColorFormat);
        }
        int mediaCodecSupportColorFormat2 = getMediaCodecSupportColorFormat("video/hevc");
        if (mediaCodecSupportColorFormat2 > 0) {
            persistStorage.put(VideoPersistStorageKey.CONFIG_KEY_LOCAL_DECODER_HEVC_COLOR_FORMAT, mediaCodecSupportColorFormat2);
        }
        persistStorage.commit();
    }

    public int getSupportColorFormat(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        PersistStorage persistStorage = new PersistStorage(PersistStorage.GLOBAL_DOMAIN);
        Integer num = null;
        if (str.equals("video/avc")) {
            num = persistStorage.getInt(VideoPersistStorageKey.CONFIG_KEY_LOCAL_DECODER_AVC_COLOR_FORMAT);
        } else if (str.equals("video/hevc")) {
            num = persistStorage.getInt(VideoPersistStorageKey.CONFIG_KEY_LOCAL_DECODER_HEVC_COLOR_FORMAT);
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
