package com.ss.bytertc.engine.audio;

import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.data.ReceiveRange;
import com.ss.bytertc.engine.type.AttenuationType;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface IRangeAudio {
    void enableRangeAudio(boolean z10);

    int setAttenuationModel(AttenuationType attenuationType, float f10);

    void setNoAttenuationFlags(List<String> list);

    int updatePosition(Position position);

    int updateReceiveRange(ReceiveRange receiveRange);
}
