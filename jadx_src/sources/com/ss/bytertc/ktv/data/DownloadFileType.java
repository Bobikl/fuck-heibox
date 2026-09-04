package com.ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum DownloadFileType {
    MUSIC(1),
    KRC(2),
    LRC(3),
    MIDI(4);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.ktv.data.DownloadFileType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType;

        static {
            int[] iArr = new int[DownloadFileType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType = iArr;
            try {
                iArr[DownloadFileType.MUSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType[DownloadFileType.KRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType[DownloadFileType.LRC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType[DownloadFileType.MIDI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    DownloadFileType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static DownloadFileType fromId(int i10) {
        for (DownloadFileType downloadFileType : values()) {
            if (downloadFileType.value() == i10) {
                return downloadFileType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType[ordinal()];
        if (i10 == 1) {
            return "DOWNLOAD_FILE_TYPE_MUSIC";
        }
        if (i10 == 2) {
            return "DOWNLOAD_FILE_TYPE_KRC";
        }
        if (i10 != 3) {
            return i10 != 4 ? "" : "DOWNLOAD_FILE_TYPE_MIDI";
        }
        return "DOWNLOAD_FILE_TYPE_LRC";
    }

    public int value() {
        return this.value;
    }
}
