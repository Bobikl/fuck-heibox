package com.uc.crashsdk.export;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class DumpFileInfo {
    public String mCategory;
    public boolean mDeleteAfterDump;
    public String mFileTobeDump;
    public boolean mIsEncrypted;
    public int mLogType;
    public boolean mWriteCategory;

    public DumpFileInfo(DumpFileInfo dumpFileInfo) {
        this.mWriteCategory = true;
        this.mDeleteAfterDump = false;
        this.mIsEncrypted = false;
        this.mCategory = dumpFileInfo.mCategory;
        this.mFileTobeDump = dumpFileInfo.mFileTobeDump;
        this.mLogType = dumpFileInfo.mLogType;
        this.mWriteCategory = dumpFileInfo.mWriteCategory;
        this.mDeleteAfterDump = dumpFileInfo.mDeleteAfterDump;
        this.mIsEncrypted = dumpFileInfo.mIsEncrypted;
    }

    public DumpFileInfo(String str, String str2, int i10) {
        this.mWriteCategory = true;
        this.mDeleteAfterDump = false;
        this.mIsEncrypted = false;
        this.mCategory = str;
        this.mFileTobeDump = str2;
        this.mLogType = i10;
    }
}
