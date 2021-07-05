package ivangladko.getfilms.questgo.data.remote.quest

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface questApi {
    @GET("./getquestList")
    fun getquestList(): Single<QuestListResponse>
}