package com.ss.bytertc.engine.audio;

import com.ss.bytertc.engine.data.HumanOrientation;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.data.PositionInfo;

/* JADX INFO: loaded from: classes4.dex */
public interface ISpatialAudio {
    void disableRemoteOrientation();

    void enableSpatialAudio(boolean z10);

    int removeAllRemotePosition();

    int removeRemotePosition(String str);

    @Deprecated
    int updateListenerOrientation(HumanOrientation humanOrientation);

    @Deprecated
    int updateListenerPosition(Position position);

    @Deprecated
    int updatePosition(Position position);

    int updateRemotePosition(String str, PositionInfo positionInfo);

    @Deprecated
    int updateSelfOrientation(HumanOrientation humanOrientation);

    int updateSelfPosition(PositionInfo positionInfo);
}
