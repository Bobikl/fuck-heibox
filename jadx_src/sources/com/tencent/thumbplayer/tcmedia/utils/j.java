package com.tencent.thumbplayer.tcmedia.utils;

import com.tencent.thumbplayer.tcmedia.api.TPAudioAttributes;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPJitterBufferConfig;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleRenderModel;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<Integer, Class> f103161a;

    static {
        HashMap<Integer, Class> map = new HashMap<>();
        f103161a = map;
        map.put(414, TPAudioAttributes.class);
        map.put(507, TPSubtitleRenderModel.class);
        map.put(140, TPJitterBufferConfig.class);
    }

    public static boolean a(@TPCommonEnum.TPOptionalId int i10, Object obj) {
        Class cls;
        return (obj == null || (cls = f103161a.get(Integer.valueOf(i10))) == null || obj.getClass() != cls) ? false : true;
    }
}
