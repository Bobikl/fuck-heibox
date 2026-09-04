# 小黑盒 APK 静态反编译文件

此目录保存模块当前适配基准 APK 的完整 JADX 静态反编译结果，供 Hook 定位、调用链核对和后续版本适配使用，不参与 `app` 模块编译。

## 目标 APK

- 包名：`com.max.xiaoheihe`
- `versionName`：`1.3.347`
- `versionCode`：`916`
- APK 大小：`99,125,492` 字节
- APK SHA-256：`6578299C385F17C94053F06DC0CB2BDB482B3B26AF2153568ED627D5CFE2438E`

原始 APK 文件不提交到 Git 仓库。

## 目录

```text
jadx_src/
├─ sources/       # JADX 输出的 Java 源码，包括应用代码、依赖库和混淆包
└─ resources/     # 当前反编译结果未输出资源文件，使用 .gitkeep 保留目录
```

主要分析路径：

- `sources/com/max/xiaoheihe/`：小黑盒主应用代码
- `sources/com/max/hbshare/`：分享与分享上报
- `sources/com/max/hbimage/`：图片加载
- `sources/com/max/hbvideo/`：视频组件
- `sources/com/max/hbcommon/`：公共网络、组件与基础功能

该目录是反编译快照，不保证能够独立重新编译。后续适配其他小黑盒版本时，应同步更新本文件中的版本和哈希信息。
