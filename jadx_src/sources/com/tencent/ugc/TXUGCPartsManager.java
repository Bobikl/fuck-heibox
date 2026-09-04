package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface TXUGCPartsManager {
    void addClipInfo(PartInfo partInfo);

    void deleteAllParts();

    void deleteLastPart();

    void deletePart(int i10);

    int getDuration();

    List<String> getPartsPathList();

    void insertPart(String str, int i10);
}
