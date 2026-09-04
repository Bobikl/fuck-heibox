package com.tencent.thumbplayer.tcmedia.tplayer.plugins.report;

import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class a implements com.tencent.thumbplayer.tcmedia.tplayer.plugins.a {
    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.a
    public void a() {
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.a
    public void a(int i10, int i11, int i12, String str, Object obj) {
        String strConcat;
        switch (i10) {
            case 101:
                strConcat = "create player adapter";
                break;
            case 102:
                strConcat = "start prepare";
                break;
            case 103:
                strConcat = "on prepared";
                break;
            case 104:
                strConcat = "start play";
                break;
            case 105:
            default:
                return;
            case 106:
                strConcat = "on paused";
                break;
            case 107:
                strConcat = "on stoped";
                break;
            case 108:
                strConcat = "on error:".concat(String.valueOf(i11));
                break;
            case 109:
                strConcat = "start seek";
                break;
            case 110:
                strConcat = "seek complete";
                break;
            case 111:
                strConcat = "on play complete";
                break;
            case 112:
                TPLogUtil.d("TPLogPlugin", "on release");
                return;
            case 113:
                strConcat = "on reset";
                break;
        }
        TPLogUtil.d("TPLogPlugin", strConcat);
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.a
    public void b() {
    }
}
