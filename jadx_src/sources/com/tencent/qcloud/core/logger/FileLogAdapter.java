package com.tencent.qcloud.core.logger;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class FileLogAdapter implements LogAdapter {
    private static final long BUFFER_SIZE = 32768;
    private static final String LOG_DIR = "QCloudLogs";
    private static final long LOG_FLUSH_DURATION = 10000;
    private static final int MAX_FILE_COUNT = 30;
    private static final int MAX_FILE_SIZE = 3145728;
    private static final int MSG_FLUSH_ALL = 0;
    private static final int MSG_FLUSH_CONTENT = 1;
    private static FileLogAdapter instance;
    private static final byte[] object = new byte[0];
    private String alias;
    private Handler handler;
    private File latestLogFile;
    private File logRootDir;
    private int minPriority;
    private List<FileLogItem> bufferRecord = Collections.synchronizedList(new ArrayList());
    private volatile long mBufferSize = 0;

    private FileLogAdapter(Context context, String str, int i10) {
        this.alias = str;
        this.minPriority = i10;
        this.logRootDir = new File(context.getExternalCacheDir() + File.separator + LOG_DIR);
        HandlerThread handlerThread = new HandlerThread("log_handlerThread", 1);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper()) { // from class: com.tencent.qcloud.core.logger.FileLogAdapter.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i11 = message.what;
                if (i11 == 0) {
                    FileLogAdapter.this.flush();
                    sendEmptyMessageDelayed(0, 10000L);
                } else {
                    if (i11 != 1) {
                        return;
                    }
                    FileLogAdapter.this.input();
                }
            }
        };
        this.handler = handler;
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = 0;
        this.handler.sendMessage(messageObtainMessage);
    }

    private void cleanFilesIfNecessary(File[] fileArr) {
        if (fileArr == null || fileArr.length < 30) {
            return;
        }
        fileArr[fileArr.length - 1].delete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void flush() {
        if (this.mBufferSize <= 0) {
            return;
        }
        write(this.bufferRecord);
        this.bufferRecord.clear();
        this.mBufferSize = 0L;
    }

    private String formatDateString(long j10) {
        return new SimpleDateFormat("yyyy-MM-dd.HH-mm-ss", Locale.getDefault()).format(Long.valueOf(j10));
    }

    public static FileLogAdapter getInstance(Context context, String str) {
        return getInstance(context, str, 4);
    }

    public static FileLogAdapter getInstance(Context context, String str, int i10) {
        synchronized (FileLogAdapter.class) {
            if (instance == null) {
                instance = new FileLogAdapter(context, str, i10);
            }
        }
        return instance;
    }

    private File getLogFile(long j10) {
        File[] fileArrListFiles = this.logRootDir.listFiles();
        if (this.latestLogFile == null) {
            if (!this.logRootDir.exists() && !this.logRootDir.mkdirs()) {
                return null;
            }
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.tencent.qcloud.core.logger.FileLogAdapter.3
                    @Override // java.util.Comparator
                    public int compare(File file, File file2) {
                        return Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file.lastModified()));
                    }
                });
                this.latestLogFile = fileArrListFiles[0];
            }
        }
        File file = this.latestLogFile;
        if (file != null && file.length() < 3145728 && isSameDay(this.latestLogFile.getName().replace(".log", ""), j10)) {
            return this.latestLogFile;
        }
        this.latestLogFile = new File(this.logRootDir + File.separator + formatDateString(j10) + ".log");
        cleanFilesIfNecessary(fileArrListFiles);
        return this.latestLogFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void input() {
        if (this.mBufferSize > 32768) {
            flush();
        }
    }

    private boolean isSameDay(String str, long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd.HH-mm-ss", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        try {
            return simpleDateFormat2.format(simpleDateFormat.parse(str)).equals(simpleDateFormat2.format(Long.valueOf(j10)));
        } catch (ParseException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private void write(List<FileLogItem> list) {
        synchronized (object) {
            if (list == null) {
                return;
            }
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    File logFile = getLogFile(System.currentTimeMillis());
                    if (logFile != null) {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(logFile, true);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            try {
                                fileOutputStream2.write(list.get(i10).toString().getBytes("UTF-8"));
                            } catch (FileNotFoundException e10) {
                                e = e10;
                                fileOutputStream = fileOutputStream2;
                                e.printStackTrace();
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e11) {
                                        e = e11;
                                        e.printStackTrace();
                                    }
                                }
                            } catch (IOException e12) {
                                e = e12;
                                fileOutputStream = fileOutputStream2;
                                e.printStackTrace();
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e13) {
                                        e = e13;
                                        e.printStackTrace();
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = fileOutputStream2;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e14) {
                                        e14.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        }
                        fileOutputStream2.flush();
                        fileOutputStream = fileOutputStream2;
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e15) {
                            e = e15;
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (FileNotFoundException e16) {
                e = e16;
            } catch (IOException e17) {
                e = e17;
            }
        }
    }

    public File[] getLogFilesDesc(int i10) {
        if (this.logRootDir.listFiles() == null || this.logRootDir.listFiles().length <= 0) {
            return null;
        }
        File[] fileArrListFiles = this.logRootDir.listFiles();
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.tencent.qcloud.core.logger.FileLogAdapter.2
            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                return Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file.lastModified()));
            }
        });
        int iMin = Math.min(i10, fileArrListFiles.length);
        File[] fileArr = new File[iMin];
        System.arraycopy(fileArrListFiles, 0, fileArr, 0, iMin);
        return fileArr;
    }

    @Override // com.tencent.qcloud.core.logger.LogAdapter
    public boolean isLoggable(int i10, @p0 String str) {
        return i10 >= this.minPriority;
    }

    @Override // com.tencent.qcloud.core.logger.LogAdapter
    public synchronized void log(int i10, @n0 String str, @n0 String str2, @p0 Throwable th2) {
        FileLogItem fileLogItem = new FileLogItem(str, i10, str2, th2);
        this.bufferRecord.add(fileLogItem);
        this.mBufferSize += fileLogItem.getLength();
        this.handler.removeMessages(1);
        this.handler.sendEmptyMessageDelayed(1, 500L);
    }
}
