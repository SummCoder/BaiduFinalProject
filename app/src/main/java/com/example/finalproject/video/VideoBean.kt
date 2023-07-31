package com.example.finalproject.video

data class VideoBean(
        /** 图片地址 */
        val coverUrl: String?,
        /** 摘要 */
        val content: String?,
        /** 播放量 */
        val num: String?,
        /** 视频链接 */
        val videoUrl: String?
)