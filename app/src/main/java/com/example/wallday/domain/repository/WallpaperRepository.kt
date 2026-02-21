package com.example.wallday.domain.repository

import com.example.wallday.domain.model.Wallpaper

interface WallpaperRepository {
    suspend fun getDailyWallpaper(): Wallpaper
}