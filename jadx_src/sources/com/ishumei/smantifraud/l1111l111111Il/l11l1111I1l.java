package com.ishumei.smantifraud.l1111l111111Il;

import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import com.ishumei.smantifraud.AbsDetector;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class l11l1111I1l extends AbsDetector {
    l11l1111I1l() {
    }

    @Override // com.ishumei.smantifraud.AbsDetector
    public final String getEventId() {
        return "devicefieldcheck";
    }

    public final JSONObject l1111l111111Il() {
        l11l1111I11l l11l1111i11l = new l11l1111I11l();
        l11l1111i11l.l1111l111111Il(System.currentTimeMillis());
        l11l1111i11l.l1111l111111Il(getAndIncrementSerial());
        l11l1111i11l.l1111l111111Il(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111llIl());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l11111I1l());
        l11l1111i11l.l111l11111lIl(sb2.toString());
        StatFs statFsL111l11111Il = com.ishumei.smantifraud.l111l11111I1l.l111l1111llIl.l111l11111Il();
        if (statFsL111l11111Il != null) {
            l11l1111i11l.l1111l111111Il(Long.valueOf(statFsL111l11111Il.getAvailableBytes()));
            l11l1111i11l.l111l11111Il(Long.valueOf(statFsL111l11111Il.getTotalBytes()));
        }
        l11l1111i11l.l111l11111I1l(Build.getRadioVersion());
        l11l1111i11l.l111l11111lIl(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.AnonymousClass1.l1111l111111Il());
        l11l1111i11l.l111l11111Il(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lIl());
        l11l1111i11l.l111l11111lIl(Long.valueOf(com.ishumei.smantifraud.l111l11111I1l.l11l1111lIIl.l111l11111lIl()));
        l11l1111i11l.l1111l111111Il(Integer.valueOf(com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.l111l11111lIl()));
        l11l1111i11l.l111l11111lIl(Integer.valueOf(Debug.isDebuggerConnected() ? 1 : 0));
        l11l1111i11l.l111l1111l1Il(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il.getFilesDir().toString());
        l11l1111i11l.l111l11111I1l(Long.valueOf(com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.l111l11111Il()));
        l11l1111i11l.l1111l111111Il(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l11111lIl());
        l11l1111i11l.l111l1111llIl(Build.VERSION.RELEASE);
        l11l1111i11l.l111l1111lI1l(com.ishumei.smantifraud.l111l11111I1l.l111l1111lI1l.l111l1111l1Il());
        l11l1111i11l.l111l1111lIl(com.ishumei.smantifraud.l111l11111I1l.l111l1111llIl.l1111l111111Il());
        l11l1111i11l.l1111l111111Il(com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.l1111l111111Il().l111l11111I1l());
        l11l1111i11l.l11l1111lIIl("3.8.0");
        return l11l1111i11l.l1111l111111Il();
    }
}
