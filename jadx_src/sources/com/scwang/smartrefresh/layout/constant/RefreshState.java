package com.scwang.smartrefresh.layout.constant;

/* JADX INFO: loaded from: classes8.dex */
public enum RefreshState {
    None(0, false, false, false, false, false),
    PullDownToRefresh(1, true, false, false, false, false),
    PullUpToLoad(2, true, false, false, false, false),
    PullDownCanceled(1, false, false, false, false, false),
    PullUpCanceled(2, false, false, false, false, false),
    ReleaseToRefresh(1, true, false, false, false, true),
    ReleaseToLoad(2, true, false, false, false, true),
    ReleaseToTwoLevel(1, true, false, false, true, true),
    TwoLevelReleased(1, false, false, false, true, false),
    RefreshReleased(1, false, false, false, false, false),
    LoadReleased(2, false, false, false, false, false),
    Refreshing(1, false, true, false, false, false),
    Loading(2, false, true, false, false, false),
    TwoLevel(1, false, true, false, true, false),
    RefreshFinish(1, false, false, true, false, false),
    LoadFinish(2, false, false, true, false, false),
    TwoLevelFinish(1, false, false, true, true, false);

    public final boolean isDragging;
    public final boolean isFinishing;
    public final boolean isFooter;
    public final boolean isHeader;
    public final boolean isOpening;
    public final boolean isReleaseToOpening;
    public final boolean isTwoLevel;

    RefreshState(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.isHeader = i10 == 1;
        this.isFooter = i10 == 2;
        this.isDragging = z10;
        this.isOpening = z11;
        this.isFinishing = z12;
        this.isTwoLevel = z13;
        this.isReleaseToOpening = z14;
    }

    public RefreshState toFooter() {
        return (!this.isHeader || this.isTwoLevel) ? this : values()[ordinal() + 1];
    }

    public RefreshState toHeader() {
        return (!this.isFooter || this.isTwoLevel) ? this : values()[ordinal() - 1];
    }
}
