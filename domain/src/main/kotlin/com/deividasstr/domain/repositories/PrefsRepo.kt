package com.deividasstr.domain.repositories

import io.reactivex.Completable
@EntryPoint
interface PrefsRepo {
    fun saveSweetsDownloadTime(): Completable
    fun saveFactsDownloadTime(): Completable
}