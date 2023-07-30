package com.example.finalproject.home

data class ItemBean(
    /** 图片地址 */
    val coverUrl: Int?,
    /** 摘要 */
    val content: String?,
    /** 新闻是否置顶等 */
    val newsSign: String?,
    /** 新闻来源 */
    val newsFrom: String?
)