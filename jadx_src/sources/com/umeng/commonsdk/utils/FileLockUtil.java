package com.umeng.commonsdk.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes4.dex */
public class FileLockUtil {
    private final Object lockObject = new Object();

    /* JADX WARN: Code duplicated, block: B:22:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static FileLock getFileLock(String str) {
        FileChannel channel;
        try {
            channel = new RandomAccessFile(str, "rw").getChannel();
            try {
                return channel.lock();
            } catch (FileNotFoundException e10) {
                e = e10;
                e.printStackTrace();
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                return null;
            } catch (IOException e12) {
                e = e12;
                e.printStackTrace();
                if (channel != null) {
                    channel.close();
                }
                return null;
            }
        } catch (FileNotFoundException e13) {
            e = e13;
            channel = null;
        } catch (IOException e14) {
            e = e14;
            channel = null;
        }
    }

    public void doFileOperateion(File file, FileLockCallback fileLockCallback) {
        if (file.exists()) {
            synchronized (this.lockObject) {
                FileLock fileLock = getFileLock(file.getAbsolutePath());
                if (fileLock != null) {
                    try {
                        try {
                            fileLockCallback.onFileLock(file.getName());
                            try {
                                fileLock.release();
                                fileLock.channel().close();
                            } catch (IOException e10) {
                                e = e10;
                                e.printStackTrace();
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            try {
                                fileLock.release();
                                fileLock.channel().close();
                            } catch (IOException e12) {
                                e = e12;
                                e.printStackTrace();
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            fileLock.release();
                            fileLock.channel().close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                        throw th2;
                    }
                }
            }
        }
    }

    public void doFileOperateion(File file, FileLockCallback fileLockCallback, int i10) {
        if (file.exists()) {
            synchronized (this.lockObject) {
                FileLock fileLock = getFileLock(file.getAbsolutePath());
                if (fileLock != null) {
                    try {
                        try {
                            fileLockCallback.onFileLock(file, i10);
                            try {
                                fileLock.release();
                                fileLock.channel().close();
                            } catch (Throwable th2) {
                                th = th2;
                                th.printStackTrace();
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            try {
                                fileLock.release();
                                fileLock.channel().close();
                            } catch (Throwable th3) {
                                th = th3;
                                th.printStackTrace();
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            fileLock.release();
                            fileLock.channel().close();
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                        throw th4;
                    }
                }
            }
        }
    }

    public void doFileOperateion(File file, FileLockCallback fileLockCallback, Object obj) {
        if (file.exists()) {
            synchronized (this.lockObject) {
                FileLock fileLock = getFileLock(file.getAbsolutePath());
                if (fileLock != null) {
                    try {
                        try {
                            fileLockCallback.onFileLock(file.getName(), obj);
                            try {
                                fileLock.release();
                                fileLock.channel().close();
                            } catch (IOException e10) {
                                e = e10;
                                e.printStackTrace();
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            try {
                                fileLock.release();
                                fileLock.channel().close();
                            } catch (IOException e12) {
                                e = e12;
                                e.printStackTrace();
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            fileLock.release();
                            fileLock.channel().close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                        throw th2;
                    }
                }
            }
        }
    }

    public void doFileOperateion(String str, FileLockCallback fileLockCallback) {
        File file = new File(str);
        if (file.exists()) {
            synchronized (this.lockObject) {
                FileLock fileLock = getFileLock(str);
                if (fileLock != null) {
                    try {
                        try {
                            fileLockCallback.onFileLock(file.getName());
                            try {
                                fileLock.release();
                                fileLock.channel().close();
                            } catch (IOException e10) {
                                e = e10;
                                e.printStackTrace();
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            try {
                                fileLock.release();
                                fileLock.channel().close();
                            } catch (IOException e12) {
                                e = e12;
                                e.printStackTrace();
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            fileLock.release();
                            fileLock.channel().close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                        throw th2;
                    }
                }
            }
        }
    }
}
