package com.deividasstr.domain.repositories

import com.deividasstr.domain.entities.models.ConsumedSweet
import io.reactivex.Completable
import io.reactivex.Single
@EntryPoint
interface ConsumedSweetsRepo {

    fun addSweet(sweet: ConsumedSweet): Completable

    fun getAllConsumedSweets(): Single<List<ConsumedSweet>>
}

annotation class EntryPoint
